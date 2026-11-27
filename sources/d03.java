// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class d03 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final yl5 b;
    public final er c;
    public final ym4 d;
    public final oy8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        bp1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        bp1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public d03(Context context, yl5 yl5Var, er erVar, ym4 ym4Var, oy8 oy8Var) {
        this.a = context;
        this.b = yl5Var;
        this.c = erVar;
        this.d = ym4Var;
        this.e = oy8Var;
    }

    public static y80 c(u8a u8aVar, int i) {
        String str = (String) u8aVar.b;
        String str2 = (String) u8aVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) u8aVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        u8a u8aVar2 = (u8a) u8aVar.d;
        if (i >= 8) {
            u8a u8aVar3 = u8aVar2;
            while (u8aVar3 != null) {
                u8aVar3 = (u8a) u8aVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            p3d.h("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        y80 c = (u8aVar2 == null || i3 != 0) ? null : c(u8aVar2, i + 1);
        if (b == 1) {
            return new y80(str, str2, d, c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            b90 b90Var = new b90();
            b90Var.e = i;
            b90Var.f = (byte) (b90Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            b90Var.a = max;
            byte b = (byte) (b90Var.f | 1);
            b90Var.b = str;
            b90Var.c = fileName;
            b90Var.d = j;
            b90Var.f = (byte) (b | 2);
            arrayList.add(b90Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static z80 e() {
        return new z80(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        er erVar = this.c;
        String str = erVar.e;
        if (str == null) {
            p3d.h("Null name");
            return null;
        }
        String str2 = erVar.b;
        if (b == 3) {
            return Collections.singletonList(new x80(str, str2, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f90 b(int i) {
        boolean z;
        Float f2;
        long j;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z = false;
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f2 = null;
                if (f2 != null) {
                }
                if (z) {
                }
                if (!jn2.h()) {
                }
                long a = jn2.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = a - memoryInfo.availMem;
                if (j <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                e90 e90Var = new e90();
                e90Var.a = r5;
                e90Var.b = r0;
                byte b = (byte) (e90Var.g | 1);
                e90Var.c = z2;
                e90Var.d = i;
                e90Var.e = j;
                e90Var.f = (r6.getBlockCount() * blockSize) - (blockSize * r6.getAvailableBlocks());
                e90Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return e90Var.a();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!jn2.h() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long a2 = jn2.a(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j = a2 - memoryInfo2.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                e90 e90Var2 = new e90();
                e90Var2.a = valueOf;
                e90Var2.b = i2;
                byte b2 = (byte) (e90Var2.g | 1);
                e90Var2.c = z2;
                e90Var2.d = i;
                e90Var2.e = j;
                e90Var2.f = (r6.getBlockCount() * blockSize2) - (blockSize2 * r6.getAvailableBlocks());
                e90Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return e90Var2.a();
            }
        } else {
            z = false;
        }
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!jn2.h()) {
            z2 = true;
        }
        long a22 = jn2.a(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = a22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        e90 e90Var22 = new e90();
        e90Var22.a = valueOf;
        e90Var22.b = i2;
        byte b22 = (byte) (e90Var22.g | 1);
        e90Var22.c = z2;
        e90Var22.d = i;
        e90Var22.e = j;
        e90Var22.f = (r6.getBlockCount() * blockSize22) - (blockSize22 * r6.getAvailableBlocks());
        e90Var22.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return e90Var22.a();
    }
}
