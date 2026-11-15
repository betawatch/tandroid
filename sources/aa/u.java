package aa;

import a8.p0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.google.android.gms.internal.vision.e2;
import da.b1;
import da.f1;
import da.g1;
import da.x0;
import da.y0;
import da.z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final a0 b;
    public final a c;
    public final wf.b d;
    public final ia.c e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        e2.p(5, hashMap, "armeabi", 6, "armeabi-v7a");
        e2.p(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public u(Context context, a0 a0Var, a aVar, wf.b bVar, ia.c cVar) {
        this.a = context;
        this.b = a0Var;
        this.c = aVar;
        this.d = bVar;
        this.e = cVar;
    }

    public static y0 c(ab.c0 c0Var, int i7) {
        String str = (String) c0Var.c;
        String str2 = (String) c0Var.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c0Var.d;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ab.c0 c0Var2 = (ab.c0) c0Var.e;
        if (i7 >= 8) {
            ab.c0 c0Var3 = c0Var2;
            while (c0Var3 != null) {
                c0Var3 = (ab.c0) c0Var3.e;
                i10++;
            }
        }
        int i11 = i10;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        y0 y0Var = null;
        if (c0Var2 != null && i11 == 0) {
            y0Var = c(c0Var2, i7 + 1);
        }
        if (b10 == 1) {
            return new y0(str, str2, d, y0Var, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i7) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            b1 b1Var = new b1();
            b1Var.e = i7;
            b1Var.f = (byte) (b1Var.f | 4);
            long j3 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j3 = stackTraceElement.getLineNumber();
            }
            b1Var.a = max;
            byte b10 = (byte) (b1Var.f | 1);
            b1Var.f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            b1Var.b = str;
            b1Var.c = fileName;
            b1Var.d = j3;
            b1Var.f = (byte) (b10 | 2);
            arrayList.add(b1Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static z0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new z0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.c;
        String str = aVar.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.b;
        if (b10 == 3) {
            return Collections.singletonList(new x0(str, str2, 0L, 0L));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g1 b(int i7) {
        boolean z10;
        Float f10;
        long j3;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z11 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e10) {
            e = e10;
            z10 = false;
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z10 = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f10 = null;
                if (f10 != null) {
                }
                if (z10) {
                }
                if (!g.g()) {
                }
                long a10 = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j3 = a10 - memoryInfo.availMem;
                if (j3 <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                f1 f1Var = new f1();
                f1Var.a = r6;
                f1Var.b = r0;
                byte b10 = (byte) (f1Var.g | 1);
                f1Var.c = z11;
                f1Var.d = i7;
                f1Var.e = j3;
                f1Var.f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
                f1Var.g = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16);
                return f1Var.a();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f10 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
                int i10 = (z10 || f10 == null) ? 1 : ((double) f10.floatValue()) < 0.99d ? 2 : 3;
                if (!g.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z11 = true;
                }
                long a102 = g.a(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j3 = a102 - memoryInfo2.availMem;
                if (j3 <= 0) {
                    j3 = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                f1 f1Var2 = new f1();
                f1Var2.a = valueOf;
                f1Var2.b = i10;
                byte b102 = (byte) (f1Var2.g | 1);
                f1Var2.c = z11;
                f1Var2.d = i7;
                f1Var2.e = j3;
                f1Var2.f = (r7.getBlockCount() * blockSize2) - (blockSize2 * r7.getAvailableBlocks());
                f1Var2.g = (byte) (((byte) (((byte) (((byte) (b102 | 2)) | 4)) | 8)) | 16);
                return f1Var2.a();
            }
        } else {
            z10 = false;
        }
        f10 = null;
        if (f10 != null) {
        }
        if (z10) {
        }
        if (!g.g()) {
            z11 = true;
        }
        long a1022 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j3 = a1022 - memoryInfo22.availMem;
        if (j3 <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        f1 f1Var22 = new f1();
        f1Var22.a = valueOf;
        f1Var22.b = i10;
        byte b1022 = (byte) (f1Var22.g | 1);
        f1Var22.c = z11;
        f1Var22.d = i7;
        f1Var22.e = j3;
        f1Var22.f = (r7.getBlockCount() * blockSize22) - (blockSize22 * r7.getAvailableBlocks());
        f1Var22.g = (byte) (((byte) (((byte) (((byte) (b1022 | 2)) | 4)) | 8)) | 16);
        return f1Var22.a();
    }
}
