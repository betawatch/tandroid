package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.l;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j {
    public static final l a = new l();
    public static final Object b = new Object();
    public static bb.a c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static bb.a b() {
        bb.a aVar = new bb.a(6);
        c = aVar;
        a.k(aVar);
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
        i a2;
        i iVar;
        int i10;
        if (z10 || c == null) {
            synchronized (b) {
                if (!z10) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i12 = 0;
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = i.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.c == a10 && (i10 = a2.b) != 2) {
                            i12 = i10;
                            if (z10 && z12 && i12 != 1) {
                                i12 = 2;
                            }
                            iVar = new i(a10, 1, (a2 == null && a2.b == 2 && i12 == 1 && length < a2.d) ? 3 : i12, length2);
                            if (a2 != null || !a2.equals(iVar)) {
                                iVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z12) {
                            i12 = 2;
                        }
                        if (z10) {
                            i12 = 2;
                        }
                        iVar = new i(a10, 1, (a2 == null && a2.b == 2 && i12 == 1 && length < a2.d) ? 3 : i12, length2);
                        if (a2 != null) {
                        }
                        iVar.b(file3);
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
