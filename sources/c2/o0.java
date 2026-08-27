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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class o0 extends p0 implements g0 {
    public static final ArrayList E;
    public static final ArrayList F;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;
    public final e r;
    public final MediaRouter s;
    public final f0 v;
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

    public o0(Context context, e eVar) {
        super(context, new k5.i(new ComponentName("android", p0.class.getName()), 5));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.v = new f0(this);
        this.w = i0.a(this);
        this.x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static n0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof n0) {
            return (n0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.B;
        f0 f0Var = this.v;
        MediaRouter mediaRouter = this.s;
        if (z10) {
            mediaRouter.removeCallback(f0Var);
        }
        this.B = true;
        mediaRouter.addCallback(this.y, f0Var, (this.A ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(n0 n0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = n0Var.b;
        z zVar = n0Var.a;
        userRouteInfo.setName(zVar.d);
        userRouteInfo.setPlaybackType(zVar.l);
        userRouteInfo.setPlaybackStream(zVar.m);
        userRouteInfo.setVolume(zVar.p);
        userRouteInfo.setVolumeMax(zVar.q);
        userRouteInfo.setVolumeHandling((!zVar.e() || b0.g()) ? zVar.o : 0);
        userRouteInfo.setDescription(zVar.e);
    }

    @Override // c2.g0
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        n0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.j(i10);
        }
    }

    @Override // c2.g0
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        n0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.k(i10);
        }
    }

    @Override // c2.s
    public final r d(String str) {
        int p6 = p(str);
        if (p6 >= 0) {
            return new l0(((m0) this.C.get(p6)).a);
        }
        return null;
    }

    @Override // c2.s
    public final void f(o oVar) {
        boolean z10;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c10 = oVar.b.c();
            int size = c10.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) c10.get(i10);
                i11 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i11 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | TLObject.FLAG_23;
                i10++;
            }
            z10 = oVar.b();
            i10 = i11;
        } else {
            z10 = false;
        }
        if (this.y == i10 && this.A == z10) {
            return;
        }
        this.y = i10;
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
        m0 m0Var = new m0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        m mVar = new m(format, name2 != null ? name2.toString() : "");
        u(m0Var, mVar);
        m0Var.c = mVar.b();
        this.C.add(m0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m0) arrayList.get(i10)).a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m0) arrayList.get(i10)).b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(z zVar) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).a == zVar) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(m0 m0Var) {
        return m0Var.a.isConnecting();
    }

    public void u(m0 m0Var, m mVar) {
        MediaRouter.RouteInfo routeInfo = m0Var.a;
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
        if (t(m0Var)) {
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

    public final void v(z zVar) {
        s c10 = zVar.c();
        MediaRouter mediaRouter = this.s;
        if (c10 == this) {
            int o10 = o(mediaRouter.getSelectedRoute(8388611));
            if (o10 < 0 || !((m0) this.C.get(o10)).b.equals(zVar.b)) {
                return;
            }
            zVar.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.x);
        n0 n0Var = new n0(zVar, createUserRoute);
        createUserRoute.setTag(n0Var);
        createUserRoute.setVolumeCallback(this.w);
        C(n0Var);
        this.D.add(n0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(z zVar) {
        int q6;
        if (zVar.c() == this || (q6 = q(zVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((n0) this.D.remove(q6)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e9) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e9);
        }
    }

    public final void x(z zVar) {
        if (zVar.g()) {
            if (zVar.c() != this) {
                int q6 = q(zVar);
                if (q6 >= 0) {
                    z(((n0) this.D.get(q6)).b);
                    return;
                }
                return;
            }
            int p6 = p(zVar.b);
            if (p6 >= 0) {
                z(((m0) this.C.get(p6)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((m0) arrayList2.get(i10)).c;
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
