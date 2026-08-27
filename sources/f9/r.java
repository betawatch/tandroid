package f9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import h9.o0;
import h9.p0;
import h9.u0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final x b;
    public final a c;
    public final g5.b d;
    public final c3.g e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        s3.c.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        s3.c.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public r(Context context, x xVar, a aVar, g5.b bVar, c3.g gVar) {
        this.a = context;
        this.b = xVar;
        this.c = aVar;
        this.d = bVar;
        this.e = gVar;
    }

    public static p0 c(com.google.firebase.messaging.t tVar, int i10) {
        int i11;
        String str = (String) tVar.c;
        String str2 = (String) tVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) tVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.t tVar3 = tVar2;
            while (tVar3 != null) {
                tVar3 = (com.google.firebase.messaging.t) tVar3.e;
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
        if (tVar2 != null && i11 == 0) {
            p0Var = c(tVar2, i10 + 1);
        }
        return new p0(str, str2, d, p0Var, i11);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            af.h hVar = new af.h();
            hVar.e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            hVar.a = Long.valueOf(max);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            hVar.b = str;
            hVar.c = fileName;
            hVar.d = Long.valueOf(j10);
            arrayList.add(hVar.l());
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
        Float f10;
        long j10;
        Intent registerReceiver;
        Context context = this.a;
        int i11 = 2;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e9) {
            e = e9;
            z10 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
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
                com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                mVar.a = r4;
                mVar.b = Integer.valueOf(i11);
                mVar.c = Boolean.valueOf(r2);
                mVar.d = Integer.valueOf(i10);
                mVar.e = Long.valueOf(j10);
                mVar.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return mVar.h();
            }
            f10 = null;
        } else {
            f10 = null;
            z10 = false;
        }
        Double valueOf = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        if (z10 || f10 == null) {
            i11 = 1;
        } else if (f10.floatValue() >= 0.99d) {
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
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
        mVar2.a = valueOf;
        mVar2.b = Integer.valueOf(i11);
        mVar2.c = Boolean.valueOf(z11);
        mVar2.d = Integer.valueOf(i10);
        mVar2.e = Long.valueOf(j10);
        mVar2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
        return mVar2.h();
    }
}
