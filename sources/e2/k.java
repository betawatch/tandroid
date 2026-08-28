package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import d7.u;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public static final c0.l a = new c0.l();
    public static final Object b = new Object();
    public static u c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static u b() {
        u uVar = new u(6);
        c = uVar;
        a.k(uVar);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:14|(1:81)(1:18)|19|(1:80)(1:23)|24|25|26|(2:65|66)(1:28)|29|(9:36|(1:40)|(1:60)(1:47)|48|(2:56|57)|52|53|54|55)|(1:64)|(1:40)|(1:42)|60|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z10) {
        j a2;
        j jVar;
        int i9;
        if (z10 || c == null) {
            synchronized (b) {
                if (!z10) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.c == a3 && (i9 = a2.b) != 2) {
                            i11 = i9;
                            if (z10 && z12 && i11 != 1) {
                                i11 = 2;
                            }
                            jVar = new j(a3, 1, (a2 == null && a2.b == 2 && i11 == 1 && length < a2.d) ? 3 : i11, length2);
                            if (a2 != null || !a2.equals(jVar)) {
                                jVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z12) {
                            i11 = 2;
                        }
                        if (z10) {
                            i11 = 2;
                        }
                        jVar = new j(a3, 1, (a2 == null && a2.b == 2 && i11 == 1 && length < a2.d) ? 3 : i11, length2);
                        if (a2 != null) {
                        }
                        jVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
