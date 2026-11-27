// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class kf8 extends bw6 implements pw6 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final a05 r;
    public final MediaRouter s;
    public final ow6 w;
    public final MediaRouter.VolumeCallback x;
    public final MediaRouter.RouteCategory y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        J = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        K = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public kf8(Context context, a05 a05Var) {
        super(context, new xh4((Object) new ComponentName("android", kf8.class.getName()), (byte) 15));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.r = a05Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.w = new ow6(this);
        this.x = rw6.a(this);
        this.y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static jf8 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof jf8) {
            return (jf8) tag;
        }
        return null;
    }

    public void A() {
        boolean z = this.G;
        ow6 ow6Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z) {
            mediaRouter.removeCallback(ow6Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, ow6Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z |= n((MediaRouter.RouteInfo) obj);
        }
        if (z) {
            y();
        }
    }

    public void C(jf8 jf8Var) {
        MediaRouter.UserRouteInfo userRouteInfo = jf8Var.b;
        jw6 jw6Var = jf8Var.a;
        userRouteInfo.setName(jw6Var.d);
        userRouteInfo.setPlaybackType(jw6Var.l);
        userRouteInfo.setPlaybackStream(jw6Var.m);
        userRouteInfo.setVolume(jw6Var.p);
        userRouteInfo.setVolumeMax(jw6Var.q);
        userRouteInfo.setVolumeHandling((!jw6Var.e() || lw6.g()) ? jw6Var.o : 0);
        userRouteInfo.setDescription(jw6Var.e);
    }

    @Override // pw6
    public final void a(MediaRouter.RouteInfo routeInfo, int i) {
        jf8 s = s(routeInfo);
        if (s != null) {
            s.a.j(i);
        }
    }

    @Override // pw6
    public final void b(MediaRouter.RouteInfo routeInfo, int i) {
        jf8 s = s(routeInfo);
        if (s != null) {
            s.a.k(i);
        }
    }

    @Override // bw6
    public final aw6 d(String str) {
        int p = p(str);
        if (p >= 0) {
            return new hf8(((if8) this.H.get(p)).a);
        }
        return null;
    }

    @Override // bw6
    public final void f(gv6 gv6Var) {
        boolean z;
        int i = 0;
        if (gv6Var != null) {
            gv6Var.a();
            ArrayList c = gv6Var.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | TLObject.FLAG_23;
                i++;
            }
            z = gv6Var.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.E == i && this.F == z) {
            return;
        }
        this.E = i;
        this.F = z;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r = r();
        Context context = this.a;
        if (r == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(format) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i;
                if (p(str) < 0) {
                    break;
                }
                i++;
            }
            format = str;
        }
        if8 if8Var = new if8(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        dv6 dv6Var = new dv6(format, name2 != null ? name2.toString() : "");
        u(if8Var, dv6Var);
        if8Var.c = dv6Var.b();
        this.H.add(if8Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((if8) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((if8) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int q(jw6 jw6Var) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((jf8) arrayList.get(i)).a == jw6Var) {
                return i;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(if8 if8Var) {
        return if8Var.a.isConnecting();
    }

    public void u(if8 if8Var, dv6 dv6Var) {
        MediaRouter.RouteInfo routeInfo = if8Var.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            dv6Var.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            dv6Var.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = dv6Var.a;
        Bundle bundle2 = dv6Var.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & TLObject.FLAG_23) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(if8Var)) {
            bundle2.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle2.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle2.putString("status", description.toString());
        }
    }

    public final void v(jw6 jw6Var) {
        bw6 c = jw6Var.c();
        MediaRouter mediaRouter = this.s;
        if (c == this) {
            int o = o(mediaRouter.getSelectedRoute(8388611));
            if (o < 0 || !((if8) this.H.get(o)).b.equals(jw6Var.b)) {
                return;
            }
            jw6Var.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.y);
        jf8 jf8Var = new jf8(jw6Var, createUserRoute);
        createUserRoute.setTag(jf8Var);
        createUserRoute.setVolumeCallback(this.x);
        C(jf8Var);
        this.I.add(jf8Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(jw6 jw6Var) {
        int q;
        if (jw6Var.c() == this || (q = q(jw6Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((jf8) this.I.remove(q)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final void x(jw6 jw6Var) {
        if (jw6Var.g()) {
            if (jw6Var.c() != this) {
                int q = q(jw6Var);
                if (q >= 0) {
                    z(((jf8) this.I.get(q)).b);
                    return;
                }
                return;
            }
            int p = p(jw6Var.b);
            if (p >= 0) {
                z(((if8) this.H.get(p)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ev6 ev6Var = ((if8) arrayList2.get(i)).c;
            if (ev6Var == null) {
                lq5.j("route must not be null");
                return;
            } else {
                if (arrayList.contains(ev6Var)) {
                    lq5.j("route descriptor already added");
                    return;
                }
                arrayList.add(ev6Var);
            }
        }
        g(new fo4(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
