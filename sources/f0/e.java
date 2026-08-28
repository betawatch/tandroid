package f0;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.biometric.o;
import com.google.firebase.messaging.q;
import e0.n0;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static final Object a = null;

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context, String str, int i9, int i10, String str2) {
        int i11;
        if (context.checkPermission(str, i9, i10) != -1) {
            int i12 = Build.VERSION.SDK_INT;
            String p6 = i12 >= 23 ? e0.b.p(str) : null;
            if (p6 != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int myUid = Process.myUid();
                String packageName = context.getPackageName();
                int i13 = 1;
                if (myUid == i10 && Objects.equals(packageName, str2)) {
                    if (i12 >= 29) {
                        AppOpsManager c10 = q.c(context);
                        i11 = c10 == null ? 1 : c10.checkOpNoThrow(p6, Binder.getCallingUid(), str2);
                        if (i11 == 0) {
                            String b10 = q.b(context);
                            if (c10 != null) {
                                i13 = c10.checkOpNoThrow(p6, i10, b10);
                            }
                        }
                        if (i11 == 0) {
                            return -2;
                        }
                    } else if (i12 >= 23) {
                        i13 = e0.b.o((AppOpsManager) e0.b.i(context), p6, str2);
                    }
                } else if (i12 >= 23) {
                    i13 = e0.b.o((AppOpsManager) e0.b.i(context), p6, str2);
                }
                i11 = i13;
                if (i11 == 0) {
                }
            }
            return 0;
        }
        return -1;
    }

    public static int b(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new n0(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int c(Context context, int i9) {
        return Build.VERSION.SDK_INT >= 23 ? a.a(context, i9) : context.getResources().getColor(i9);
    }

    public static Drawable d(Context context, int i9) {
        return context.getDrawable(i9);
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : new o(new Handler(context.getMainLooper()), 3);
    }

    public static Object f(Context context, Class cls) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            return a.b(context, cls);
        }
        String c10 = i9 >= 23 ? a.c(context, cls) : (String) d.a.get(cls);
        if (c10 != null) {
            return context.getSystemService(c10);
        }
        return null;
    }
}
