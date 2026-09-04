package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d0 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile d0 d;
    public z a;

    public static d0 a(Context context) {
        d0 d0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    d0 d0Var2 = new d0();
                    z zVar = new z();
                    zVar.a = applicationContext;
                    zVar.b = applicationContext.getContentResolver();
                    d0Var2.a = zVar;
                    d = d0Var2;
                }
                d0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d0Var;
    }

    public final boolean b(a0 a0Var) {
        z zVar = this.a;
        c0 c0Var = a0Var.a;
        Context context = zVar.a;
        int i10 = c0Var.b;
        String str = c0Var.a;
        int i11 = c0Var.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i10, i11) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (zVar.a(c0Var, "android.permission.STATUS_BAR_SERVICE") || zVar.a(c0Var, "android.permission.MEDIA_CONTENT_CONTROL") || i11 == 1000) {
                    return true;
                }
                String string = Settings.Secure.getString(zVar.b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (z.c) {
                Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
            }
        }
        return false;
    }
}
