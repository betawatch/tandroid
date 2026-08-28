package g6;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static Context a;
    public static Boolean b;

    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean e(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (e6.b.d()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static void f(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void g(MenuItem menuItem, char c10, int i9) {
        menuItem.setAlphabeticShortcut(c10, i9);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void j(Notification.Builder builder, int i9) {
        builder.setGroupAlertBehavior(i9);
    }

    public static void k(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void l(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void m(MenuItem menuItem, char c10, int i9) {
        menuItem.setNumericShortcut(c10, i9);
    }

    public static void n(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void o(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void p(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
