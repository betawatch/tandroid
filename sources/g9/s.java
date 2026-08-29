package g9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import bg.c2;
import i9.o0;
import i9.p0;
import i9.u0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final y b;
    public final a c;
    public final l d;
    public final e3.f e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        u3.c.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        u3.c.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public s(Context context, y yVar, a aVar, l lVar, e3.f fVar) {
        this.a = context;
        this.b = yVar;
        this.c = aVar;
        this.d = lVar;
        this.e = fVar;
    }

    public static p0 c(com.google.firebase.messaging.s sVar, int i10) {
        int i11;
        String str = (String) sVar.c;
        String str2 = (String) sVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (com.google.firebase.messaging.s) sVar3.e;
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
        if (sVar2 != null && i11 == 0) {
            p0Var = c(sVar2, i10 + 1);
        }
        return new p0(str, str2, d, p0Var, i11);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a5.j jVar = new a5.j();
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
            arrayList.add(jVar.i());
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
        boolean z10;
        Float f9;
        long j10;
        Intent registerReceiver;
        Context context = this.a;
        int i11 = 2;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e10) {
            e = e10;
            z10 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
            try {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f9 = Float.valueOf(intExtra2 / intExtra3);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f9 = null;
                if (f9 != null) {
                }
                if (z10) {
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
                c2 c2Var = new c2();
                c2Var.a = r4;
                c2Var.b = Integer.valueOf(i11);
                c2Var.c = Boolean.valueOf(r2);
                c2Var.d = Integer.valueOf(i10);
                c2Var.e = Long.valueOf(j10);
                c2Var.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return c2Var.h();
            }
            f9 = null;
        } else {
            f9 = null;
            z10 = false;
        }
        Double valueOf = f9 != null ? Double.valueOf(f9.doubleValue()) : null;
        if (z10 || f9 == null) {
            i11 = 1;
        } else if (f9.floatValue() >= 0.99d) {
            i11 = 3;
        }
        boolean z11 = h.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
        long b102 = h.b(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j10 = b102 - memoryInfo2.availMem;
        if (j10 <= 0) {
            j10 = 0;
        }
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        c2 c2Var2 = new c2();
        c2Var2.a = valueOf;
        c2Var2.b = Integer.valueOf(i11);
        c2Var2.c = Boolean.valueOf(z11);
        c2Var2.d = Integer.valueOf(i10);
        c2Var2.e = Long.valueOf(j10);
        c2Var2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
        return c2Var2.h();
    }
}
