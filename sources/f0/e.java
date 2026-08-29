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
import com.google.firebase.messaging.p;
import e0.n0;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e {
    public static final Object a = null;

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context, String str, int i10, int i11, String str2) {
        int i12;
        if (context.checkPermission(str, i10, i11) != -1) {
            int i13 = Build.VERSION.SDK_INT;
            String p10 = i13 >= 23 ? e0.b.p(str) : null;
            if (p10 != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int myUid = Process.myUid();
                String packageName = context.getPackageName();
                int i14 = 1;
                if (myUid == i11 && Objects.equals(packageName, str2)) {
                    if (i13 >= 29) {
                        AppOpsManager c3 = p.c(context);
                        i12 = c3 == null ? 1 : c3.checkOpNoThrow(p10, Binder.getCallingUid(), str2);
                        if (i12 == 0) {
                            String b10 = p.b(context);
                            if (c3 != null) {
                                i14 = c3.checkOpNoThrow(p10, i11, b10);
                            }
                        }
                        if (i12 == 0) {
                            return -2;
                        }
                    } else if (i13 >= 23) {
                        i14 = e0.b.o((AppOpsManager) e0.b.i(context), p10, str2);
                    }
                } else if (i13 >= 23) {
                    i14 = e0.b.o((AppOpsManager) e0.b.i(context), p10, str2);
                }
                i12 = i14;
                if (i12 == 0) {
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

    public static int c(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? a.a(context, i10) : context.getResources().getColor(i10);
    }

    public static Drawable d(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : new o(new Handler(context.getMainLooper()), 3);
    }

    public static Object f(Context context, Class cls) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return a.b(context, cls);
        }
        String c3 = i10 >= 23 ? a.c(context, cls) : (String) d.a.get(cls);
        if (c3 != null) {
            return context.getSystemService(c3);
        }
        return null;
    }
}
