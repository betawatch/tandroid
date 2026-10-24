package n4;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class w {
    public static final Object b = new Object();
    public static volatile w c;
    public Object a;

    public static w a(Context context) {
        w wVar;
        synchronized (b) {
            try {
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    w wVar2 = new w();
                    mi.q qVar = new mi.q(2, (byte) 0);
                    qVar.b = applicationContext;
                    qVar.c = applicationContext.getContentResolver();
                    wVar2.a = qVar;
                    c = wVar2;
                }
                wVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public boolean b(t tVar) {
        mi.q qVar = (mi.q) this.a;
        v vVar = tVar.a;
        Context context = (Context) qVar.b;
        int i10 = vVar.c;
        String str = vVar.a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i11 < 28) {
                    i10 = applicationInfo.uid;
                }
                if (i10 == 1000 || i10 == Process.myUid() || context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.b, vVar.c) == 0 || qVar.U(vVar, "android.permission.STATUS_BAR_SERVICE") || qVar.U(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) qVar.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            e2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j10);
    }

    public void e(String str, z zVar) {
        Rating rating;
        float f7 = zVar.b;
        int i10 = zVar.a;
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.a;
        if (zVar.c == null) {
            if (zVar.b()) {
                switch (i10) {
                    case 1:
                        zVar.c = Rating.newHeartRating(i10 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        zVar.c = Rating.newThumbRating(i10 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        zVar.c = Rating.newStarRating(i10, zVar.a());
                        break;
                    case 6:
                        if (i10 != 6 || !zVar.b()) {
                            f7 = -1.0f;
                        }
                        zVar.c = Rating.newPercentageRating(f7);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            zVar.c = Rating.newUnratedRating(i10);
        }
        rating = zVar.c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.a).putCharSequence(str, charSequence);
    }
}
