package e0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i0 {
    public static String d;
    public static h0 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public i0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static i0 c(Context context) {
        return new i0(context);
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return androidx.emoji2.text.w.a(this.b);
        }
        Context context = this.a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() == 0;
    }

    public final void b(int i7, String str) {
        this.b.cancel(str, i7);
    }

    public final void d(int i7, Notification notification) {
        e(null, i7, notification);
    }

    public final void e(String str, int i7, Notification notification) {
        NotificationManager notificationManager = this.b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i7, notification);
            return;
        }
        e0 e0Var = new e0(this.a.getPackageName(), i7, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new h0(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, e0Var).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(str, i7);
    }
}
