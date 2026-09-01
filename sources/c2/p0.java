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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class p0 extends q0 implements h0 {
    public static final ArrayList F;
    public static final ArrayList G;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
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
        F = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        G = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public p0(Context context, e eVar) {
        super(context, new y5.h(new ComponentName("android", q0.class.getName()), 7));
        this.D = new ArrayList();
        this.E = new ArrayList();
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
        boolean z4 = this.C;
        g0 g0Var = this.v;
        MediaRouter mediaRouter = this.s;
        if (z4) {
            mediaRouter.removeCallback(g0Var);
        }
        this.C = true;
        mediaRouter.addCallback(this.y, g0Var, (this.B ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z4 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z4 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z4) {
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
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        o0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.a.j(i10);
        }
    }

    @Override // c2.h0
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        o0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.a.k(i10);
        }
    }

    @Override // c2.t
    public final s d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new m0(((n0) this.D.get(p10)).a);
        }
        return null;
    }

    @Override // c2.t
    public final void f(o oVar) {
        boolean z4;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c3 = oVar.b.c();
            int size = c3.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) c3.get(i10);
                i11 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i11 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | TLObject.FLAG_23;
                i10++;
            }
            z4 = oVar.b();
            i10 = i11;
        } else {
            z4 = false;
        }
        if (this.y == i10 && this.B == z4) {
            return;
        }
        this.y = i10;
        this.B = z4;
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
            int i10 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i10;
                if (p(str) < 0) {
                    break;
                }
                i10++;
            }
            format = str;
        }
        n0 n0Var = new n0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        m mVar = new m(format, name2 != null ? name2.toString() : "");
        u(n0Var, mVar);
        n0Var.c = mVar.b();
        this.D.add(n0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(a0 a0Var) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).a == a0Var) {
                return i10;
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
            mVar.a(F);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(G);
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
        t c3 = a0Var.c();
        MediaRouter mediaRouter = this.s;
        if (c3 == this) {
            int o10 = o(mediaRouter.getSelectedRoute(8388611));
            if (o10 < 0 || !((n0) this.D.get(o10)).b.equals(a0Var.b)) {
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
        this.E.add(o0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(a0 a0Var) {
        int q10;
        if (a0Var.c() == this || (q10 = q(a0Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((o0) this.E.remove(q10)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e6) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e6);
        }
    }

    public final void x(a0 a0Var) {
        if (a0Var.g()) {
            if (a0Var.c() != this) {
                int q10 = q(a0Var);
                if (q10 >= 0) {
                    z(((o0) this.E.get(q10)).b);
                    return;
                }
                return;
            }
            int p10 = p(a0Var.b);
            if (p10 >= 0) {
                z(((n0) this.D.get(p10)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.D;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((n0) arrayList2.get(i10)).c;
            if (nVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(nVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(nVar);
        }
        g(new u(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
