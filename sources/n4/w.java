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
import m4.w1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    w1 w1Var = new w1(2, (byte) 0);
                    w1Var.b = applicationContext;
                    w1Var.c = applicationContext.getContentResolver();
                    wVar2.a = w1Var;
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
        w1 w1Var = (w1) this.a;
        v vVar = tVar.a;
        Context context = (Context) w1Var.b;
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
                if (i10 == 1000 || i10 == Process.myUid() || context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.b, vVar.c) == 0 || w1Var.N(vVar, "android.permission.STATUS_BAR_SERVICE") || w1Var.N(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) w1Var.c, "enabled_notification_listeners");
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

    public void e(String str, a0 a0Var) {
        Rating rating;
        float f7 = a0Var.b;
        int i10 = a0Var.a;
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.a;
        if (a0Var.c == null) {
            if (a0Var.b()) {
                switch (i10) {
                    case 1:
                        a0Var.c = Rating.newHeartRating(i10 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        a0Var.c = Rating.newThumbRating(i10 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        a0Var.c = Rating.newStarRating(i10, a0Var.a());
                        break;
                    case 6:
                        if (i10 != 6 || !a0Var.b()) {
                            f7 = -1.0f;
                        }
                        a0Var.c = Rating.newPercentageRating(f7);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            a0Var.c = Rating.newUnratedRating(i10);
        }
        rating = a0Var.c;
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
