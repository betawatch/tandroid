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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class iz2 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final wj5 b;
    public final dr c;
    public final sk4 d;
    public final dv8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        oo1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        oo1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public iz2(Context context, wj5 wj5Var, dr drVar, sk4 sk4Var, dv8 dv8Var) {
        this.a = context;
        this.b = wj5Var;
        this.c = drVar;
        this.d = sk4Var;
        this.e = dv8Var;
    }

    public static w80 c(wtc wtcVar, int i) {
        String str = (String) wtcVar.b;
        String str2 = (String) wtcVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) wtcVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        wtc wtcVar2 = (wtc) wtcVar.d;
        if (i >= 8) {
            wtc wtcVar3 = wtcVar2;
            while (wtcVar3 != null) {
                wtcVar3 = (wtc) wtcVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            fvc.f("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        w80 c = (wtcVar2 == null || i3 != 0) ? null : c(wtcVar2, i + 1);
        if (b == 1) {
            return new w80(str, str2, d, c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            z80 z80Var = new z80();
            z80Var.e = i;
            z80Var.f = (byte) (z80Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            z80Var.a = max;
            byte b = (byte) (z80Var.f | 1);
            z80Var.b = str;
            z80Var.c = fileName;
            z80Var.d = j;
            z80Var.f = (byte) (b | 2);
            arrayList.add(z80Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static x80 e() {
        return new x80(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        dr drVar = this.c;
        String str = drVar.e;
        if (str == null) {
            fvc.f("Null name");
            return null;
        }
        String str2 = drVar.b;
        if (b == 3) {
            return Collections.singletonList(new v80(str, str2, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d90 b(int i) {
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
                if (!pm2.h()) {
                }
                long a = pm2.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = a - memoryInfo.availMem;
                if (j <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                c90 c90Var = new c90();
                c90Var.a = r5;
                c90Var.b = r0;
                byte b = (byte) (c90Var.g | 1);
                c90Var.c = z2;
                c90Var.d = i;
                c90Var.e = j;
                c90Var.f = (r6.getBlockCount() * blockSize) - (blockSize * r6.getAvailableBlocks());
                c90Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return c90Var.a();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!pm2.h() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long a2 = pm2.a(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j = a2 - memoryInfo2.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                c90 c90Var2 = new c90();
                c90Var2.a = valueOf;
                c90Var2.b = i2;
                byte b2 = (byte) (c90Var2.g | 1);
                c90Var2.c = z2;
                c90Var2.d = i;
                c90Var2.e = j;
                c90Var2.f = (r6.getBlockCount() * blockSize2) - (blockSize2 * r6.getAvailableBlocks());
                c90Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return c90Var2.a();
            }
        } else {
            z = false;
        }
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!pm2.h()) {
            z2 = true;
        }
        long a22 = pm2.a(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = a22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        c90 c90Var22 = new c90();
        c90Var22.a = valueOf;
        c90Var22.b = i2;
        byte b22 = (byte) (c90Var22.g | 1);
        c90Var22.c = z2;
        c90Var22.d = i;
        c90Var22.e = j;
        c90Var22.f = (r6.getBlockCount() * blockSize22) - (blockSize22 * r6.getAvailableBlocks());
        c90Var22.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return c90Var22.a();
    }
}
