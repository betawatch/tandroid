package c2;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class p0 extends q0 implements h0 {
    public static final ArrayList E;
    public static final ArrayList F;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;
    public final e r;
    public final MediaRouter s;
    public final g0 v;
    public final MediaRouter.VolumeCallback w;
    public final MediaRouter.RouteCategory x;
    public int y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        E = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        F = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public p0(Context context, e eVar) {
        super(context, new android.support.v4.media.c(new ComponentName("android", q0.class.getName()), 5));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.v = new g0(this);
        this.w = j0.a(this);
        this.x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static o0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof o0) {
            return (o0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.B;
        g0 g0Var = this.v;
        MediaRouter mediaRouter = this.s;
        if (z10) {
            mediaRouter.removeCallback(g0Var);
        }
        this.B = true;
        mediaRouter.addCallback(this.y, g0Var, (this.A ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i9 = 0; i9 < routeCount; i9++) {
            arrayList.add(mediaRouter.getRouteAt(i9));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(o0 o0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = o0Var.b;
        a0 a0Var = o0Var.a;
        userRouteInfo.setName(a0Var.d);
        userRouteInfo.setPlaybackType(a0Var.l);
        userRouteInfo.setPlaybackStream(a0Var.m);
        userRouteInfo.setVolume(a0Var.p);
        userRouteInfo.setVolumeMax(a0Var.q);
        userRouteInfo.setVolumeHandling((!a0Var.e() || c0.g()) ? a0Var.o : 0);
        userRouteInfo.setDescription(a0Var.e);
    }

    @Override // c2.h0
    public final void a(MediaRouter.RouteInfo routeInfo, int i9) {
        o0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.j(i9);
        }
    }

    @Override // c2.h0
    public final void b(MediaRouter.RouteInfo routeInfo, int i9) {
        o0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.k(i9);
        }
    }

    @Override // c2.s
    public final r d(String str) {
        int p6 = p(str);
        if (p6 >= 0) {
            return new m0(((n0) this.C.get(p6)).a);
        }
        return null;
    }

    @Override // c2.s
    public final void f(o oVar) {
        boolean z10;
        int i9 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c10 = oVar.b.c();
            int size = c10.size();
            int i10 = 0;
            while (i9 < size) {
                String str = (String) c10.get(i9);
                i10 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i10 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i10 | 2 : i10 | TLObject.FLAG_23;
                i9++;
            }
            z10 = oVar.b();
            i9 = i10;
        } else {
            z10 = false;
        }
        if (this.y == i9 && this.A == z10) {
            return;
        }
        this.y = i9;
        this.A = z10;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r10 = r();
        Context context = this.a;
        if (r10 == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(format) >= 0) {
            int i9 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i9;
                if (p(str) < 0) {
                    break;
                }
                i9++;
            }
            format = str;
        }
        n0 n0Var = new n0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        m mVar = new m(format, name2 != null ? name2.toString() : "");
        u(n0Var, mVar);
        n0Var.c = mVar.b();
        this.C.add(n0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n0) arrayList.get(i9)).a == routeInfo) {
                return i9;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n0) arrayList.get(i9)).b.equals(str)) {
                return i9;
            }
        }
        return -1;
    }

    public final int q(a0 a0Var) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((o0) arrayList.get(i9)).a == a0Var) {
                return i9;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(n0 n0Var) {
        return n0Var.a.isConnecting();
    }

    public void u(n0 n0Var, m mVar) {
        MediaRouter.RouteInfo routeInfo = n0Var.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(E);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(F);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.a;
        Bundle bundle2 = mVar.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & TLObject.FLAG_23) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(n0Var)) {
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

    public final void v(a0 a0Var) {
        s c10 = a0Var.c();
        MediaRouter mediaRouter = this.s;
        if (c10 == this) {
            int o6 = o(mediaRouter.getSelectedRoute(8388611));
            if (o6 < 0 || !((n0) this.C.get(o6)).b.equals(a0Var.b)) {
                return;
            }
            a0Var.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.x);
        o0 o0Var = new o0(a0Var, createUserRoute);
        createUserRoute.setTag(o0Var);
        createUserRoute.setVolumeCallback(this.w);
        C(o0Var);
        this.D.add(o0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(a0 a0Var) {
        int q10;
        if (a0Var.c() == this || (q10 = q(a0Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((o0) this.D.remove(q10)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e10) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
        }
    }

    public final void x(a0 a0Var) {
        if (a0Var.g()) {
            if (a0Var.c() != this) {
                int q10 = q(a0Var);
                if (q10 >= 0) {
                    z(((o0) this.D.get(q10)).b);
                    return;
                }
                return;
            }
            int p6 = p(a0Var.b);
            if (p6 >= 0) {
                z(((n0) this.C.get(p6)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = ((n0) arrayList2.get(i9)).c;
            if (nVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(nVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(nVar);
        }
        g(new t(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
