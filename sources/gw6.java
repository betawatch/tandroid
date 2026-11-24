// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gw6 {
    public static wz4 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public gw6(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        dq9.m("The media router service must only be accessed on the application's main thread.");
    }

    public static wz4 c() {
        wz4 wz4Var = c;
        if (wz4Var != null) {
            return wz4Var;
        }
        dq9.m("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static gw6 d(Context context) {
        if (context == null) {
            u36.j("context must not be null");
            return null;
        }
        b();
        wz4 wz4Var = c;
        if (wz4Var == null) {
            wz4Var = new wz4(context.getApplicationContext());
            c = wz4Var;
        }
        ArrayList arrayList = wz4Var.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                gw6 gw6Var = new gw6(context);
                arrayList.add(new WeakReference(gw6Var));
                return gw6Var;
            }
            gw6 gw6Var2 = (gw6) ((WeakReference) arrayList.get(size)).get();
            if (gw6Var2 == null) {
                arrayList.remove(size);
            } else if (gw6Var2.a == context) {
                return gw6Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        wz4 wz4Var = c;
        if (wz4Var == null) {
            return null;
        }
        in3 in3Var = wz4Var.C;
        if (in3Var != null) {
            mx6 mx6Var = (mx6) in3Var.b;
            if (mx6Var != null) {
                return ((zw6) mx6Var.b).c;
            }
            return null;
        }
        mx6 mx6Var2 = wz4Var.D;
        if (mx6Var2 != null) {
            return ((zw6) mx6Var2.b).c;
        }
        return null;
    }

    public static ew6 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        iw6 iw6Var = c().u;
        return iw6Var == null || (bundle = iw6Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(iw6 iw6Var) {
        b();
        wz4 c2 = c();
        iw6 iw6Var2 = c2.u;
        tz4 tz4Var = c2.a;
        c2.u = iw6Var;
        boolean f = c2.f();
        gu6 gu6Var = c2.r;
        if (f) {
            if (gu6Var == null) {
                gu6 gu6Var2 = new gu6(c2.h, new lj4(c2));
                c2.r = gu6Var2;
                c2.a(gu6Var2, true);
                c2.k();
                pf3 pf3Var = c2.c;
                ((Handler) pf3Var.d).post((ei7) pf3Var.h);
            }
            if ((iw6Var2 != null && iw6Var2.d) != iw6Var.d) {
                gu6 gu6Var3 = c2.r;
                gu6Var3.h = c2.A;
                if (!gu6Var3.b) {
                    gu6Var3.b = true;
                    ((c1) gu6Var3.e).sendEmptyMessage(2);
                }
            }
        } else if (gu6Var != null) {
            dw6 d = c2.d(gu6Var);
            if (d != null) {
                b();
                gu6Var.f = null;
                gu6Var.h(null);
                c2.m(d, null);
                tz4Var.b(514, d);
                c2.l.remove(d);
            }
            c2.r = null;
            pf3 pf3Var2 = c2.c;
            ((Handler) pf3Var2.d).post((ei7) pf3Var2.h);
        }
        tz4Var.b(769, iw6Var);
    }

    public static void j(int i) {
        if (i < 0 || i > 3) {
            u36.j("Unsupported reason to unselect route");
            return;
        }
        b();
        wz4 c2 = c();
        ew6 c3 = c2.c();
        if (c2.e() != c3) {
            c2.i(c3, i);
        }
    }

    public final void a(yv6 yv6Var, zv6 zv6Var, int i) {
        aw6 aw6Var;
        if (yv6Var == null) {
            u36.j("selector must not be null");
            return;
        }
        if (zv6Var == null) {
            u36.j("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((aw6) arrayList.get(i2)).b == zv6Var) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            aw6Var = new aw6(this, zv6Var);
            arrayList.add(aw6Var);
        } else {
            aw6Var = (aw6) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != aw6Var.d) {
            aw6Var.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        aw6Var.e = elapsedRealtime;
        yv6 yv6Var2 = aw6Var.c;
        yv6Var2.a();
        yv6Var.a();
        if (yv6Var2.b.containsAll(yv6Var.b)) {
            z2 = z;
        } else {
            yv6 yv6Var3 = aw6Var.c;
            xv6 xv6Var = new xv6();
            if (yv6Var3 == null) {
                u36.j("selector must not be null");
                return;
            }
            yv6Var3.a();
            if (!yv6Var3.b.isEmpty()) {
                xv6Var.a = new ArrayList(yv6Var3.b);
            }
            xv6Var.f(yv6Var.c());
            aw6Var.c = xv6Var.g();
        }
        if (z2) {
            c().k();
        }
    }

    public final void h(zv6 zv6Var) {
        if (zv6Var == null) {
            u36.j("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((aw6) arrayList.get(i)).b == zv6Var) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().k();
        }
    }
}
