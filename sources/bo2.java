// default package

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bo2 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, od1.AUDIO_CONTENT_SAMPLING_RATE, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static synchronized long a(Context context) {
        long j;
        synchronized (bo2.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        }
        return j;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static boolean c(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int e = e(context, str, "bool");
            if (e > 0) {
                return resources.getBoolean(e);
            }
            int e2 = e(context, str, "string");
            if (e2 > 0) {
                return Boolean.parseBoolean(context.getString(e2));
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean h = h();
        ?? r0 = h;
        if (i()) {
            r0 = (h ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int e(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static int f(ye1 ye1Var) {
        int f = ye1Var.f(4);
        if (f == 15) {
            if (ye1Var.b() >= 24) {
                return ye1Var.f(24);
            }
            throw bx7.a("AAC header insufficient data", null);
        }
        if (f < 13) {
            return b[f];
        }
        throw bx7.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static String g(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean h() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean i() {
        boolean h = h();
        String str = Build.TAGS;
        if ((h || str == null || !str.contains("test-keys")) && !aq1.t("/system/app/Superuser.apk")) {
            return !h && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static g1 j(ye1 ye1Var, boolean z) {
        int f = ye1Var.f(5);
        if (f == 31) {
            f = ye1Var.f(6) + 32;
        }
        int f2 = f(ye1Var);
        int f3 = ye1Var.f(4);
        String j = hg9.j(f, "mp4a.40.");
        if (f == 5 || f == 29) {
            f2 = f(ye1Var);
            int f4 = ye1Var.f(5);
            if (f4 == 31) {
                f4 = ye1Var.f(6) + 32;
            }
            f = f4;
            if (f == 22) {
                f3 = ye1Var.f(4);
            }
        }
        if (z) {
            if (f != 1 && f != 2 && f != 3 && f != 4 && f != 6 && f != 7 && f != 17) {
                switch (f) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw bx7.d("Unsupported audio object type: " + f);
                }
            }
            if (ye1Var.e()) {
                ncd.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (ye1Var.e()) {
                ye1Var.n(14);
            }
            boolean e = ye1Var.e();
            if (f3 == 0) {
                gxc.b();
                return null;
            }
            if (f == 6 || f == 20) {
                ye1Var.n(3);
            }
            if (e) {
                if (f == 22) {
                    ye1Var.n(16);
                }
                if (f == 17 || f == 19 || f == 20 || f == 23) {
                    ye1Var.n(3);
                }
                ye1Var.n(1);
            }
            switch (f) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int f5 = ye1Var.f(2);
                    if (f5 == 2 || f5 == 3) {
                        throw bx7.d("Unsupported epConfig: " + f5);
                    }
            }
        }
        int i = c[f3];
        if (i == -1) {
            throw bx7.a(null, null);
        }
        g1 g1Var = new g1();
        g1Var.a = f2;
        g1Var.b = i;
        g1Var.c = j;
        return g1Var;
    }

    public static String k(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return g(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String l(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
