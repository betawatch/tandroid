package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c0 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile c0 d;
    public y a;

    public static c0 a(Context context) {
        c0 c0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    c0 c0Var2 = new c0();
                    y yVar = new y();
                    yVar.a = applicationContext;
                    yVar.b = applicationContext.getContentResolver();
                    c0Var2.a = yVar;
                    d = c0Var2;
                }
                c0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public final boolean b(z zVar) {
        y yVar = this.a;
        b0 b0Var = zVar.a;
        Context context = yVar.a;
        int i10 = b0Var.b;
        String str = b0Var.a;
        int i11 = b0Var.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i10, i11) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (yVar.a(b0Var, "android.permission.STATUS_BAR_SERVICE") || yVar.a(b0Var, "android.permission.MEDIA_CONTENT_CONTROL") || i11 == 1000) {
                    return true;
                }
                String string = Settings.Secure.getString(yVar.b, "enabled_notification_listeners");
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
            if (y.c) {
                Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
            }
        }
        return false;
    }
}
