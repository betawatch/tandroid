package i9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k9.o0;
import k9.p0;
import k9.u0;
import q5.g0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final w b;
    public final a c;
    public final g0 d;
    public final e3.g e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        w.c.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        w.c.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, w wVar, a aVar, g0 g0Var, e3.g gVar) {
        this.a = context;
        this.b = wVar;
        this.c = aVar;
        this.d = g0Var;
        this.e = gVar;
    }

    public static p0 c(sf.e eVar, int i10) {
        int i11;
        String str = (String) eVar.c;
        String str2 = (String) eVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) eVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        sf.e eVar2 = (sf.e) eVar.e;
        if (i10 >= 8) {
            sf.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = (sf.e) eVar3.e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        p0 p0Var = null;
        if (eVar2 != null && i11 == 0) {
            p0Var = c(eVar2, i10 + 1);
        }
        return new p0(str, str2, d, p0Var, i11);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            c5.j jVar = new c5.j();
            jVar.e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            jVar.a = Long.valueOf(max);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            jVar.b = str;
            jVar.c = fileName;
            jVar.d = Long.valueOf(j10);
            arrayList.add(jVar.n());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.b));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u0 b(int i10) {
        boolean z4;
        Float f10;
        long j10;
        Intent registerReceiver;
        Context context = this.a;
        int i11 = 2;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e6) {
            e = e6;
            z4 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            z4 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
            try {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f10 = Float.valueOf(intExtra2 / intExtra3);
                }
            } catch (IllegalStateException e10) {
                e = e10;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f10 = null;
                if (f10 != null) {
                }
                if (z4) {
                }
                i11 = 1;
                if (h.g()) {
                }
                long b10 = h.b(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j10 = b10 - memoryInfo.availMem;
                if (j10 <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                a9.a aVar = new a9.a();
                aVar.a = r4;
                aVar.b = Integer.valueOf(i11);
                aVar.c = Boolean.valueOf(r2);
                aVar.d = Integer.valueOf(i10);
                aVar.e = Long.valueOf(j10);
                aVar.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return aVar.i();
            }
            f10 = null;
        } else {
            f10 = null;
            z4 = false;
        }
        Double valueOf = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        if (z4 || f10 == null) {
            i11 = 1;
        } else if (f10.floatValue() >= 0.99d) {
            i11 = 3;
        }
        boolean z10 = h.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
        long b102 = h.b(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j10 = b102 - memoryInfo2.availMem;
        if (j10 <= 0) {
            j10 = 0;
        }
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        a9.a aVar2 = new a9.a();
        aVar2.a = valueOf;
        aVar2.b = Integer.valueOf(i11);
        aVar2.c = Boolean.valueOf(z10);
        aVar2.d = Integer.valueOf(i10);
        aVar2.e = Long.valueOf(j10);
        aVar2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
        return aVar2.i();
    }
}
