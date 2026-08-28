package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 extends MediaRouter.Callback {
    public final p0 a;

    public g0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        p0 p0Var = this.a;
        if (p0Var.n(routeInfo)) {
            p0Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        p0 p0Var = this.a;
        p0Var.getClass();
        if (p0.s(routeInfo) != null || (o6 = p0Var.o(routeInfo)) < 0) {
            return;
        }
        n0 n0Var = (n0) p0Var.C.get(o6);
        String str = n0Var.b;
        CharSequence name = n0Var.a.getName(p0Var.a);
        m mVar = new m(str, name != null ? name.toString() : "");
        p0Var.u(n0Var, mVar);
        n0Var.c = mVar.b();
        p0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i9) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        p0 p0Var = this.a;
        int o6 = p0Var.o(routeInfo);
        if (o6 >= 0) {
            n0 n0Var = (n0) p0Var.C.get(o6);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != n0Var.c.a.getInt("presentationDisplayId", -1)) {
                n nVar = n0Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(nVar.a);
                ArrayList c10 = nVar.c();
                ArrayList b10 = nVar.b();
                HashSet a2 = nVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                n0Var.c = new n(bundle);
                p0Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        p0 p0Var = this.a;
        p0Var.getClass();
        if (p0.s(routeInfo) != null || (o6 = p0Var.o(routeInfo)) < 0) {
            return;
        }
        p0Var.C.remove(o6);
        p0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        a0 a2;
        p0 p0Var = this.a;
        if (routeInfo != p0Var.s.getSelectedRoute(8388611)) {
            return;
        }
        o0 s10 = p0.s(routeInfo);
        if (s10 != null) {
            s10.a.l();
            return;
        }
        int o6 = p0Var.o(routeInfo);
        if (o6 >= 0) {
            n0 n0Var = (n0) p0Var.C.get(o6);
            e eVar = p0Var.r;
            String str = n0Var.b;
            eVar.a.removeMessages(262);
            z d = eVar.d(eVar.s);
            if (d == null || (a2 = d.a(str)) == null) {
                return;
            }
            a2.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        p0 p0Var = this.a;
        p0Var.getClass();
        if (p0.s(routeInfo) != null || (o6 = p0Var.o(routeInfo)) < 0) {
            return;
        }
        n0 n0Var = (n0) p0Var.C.get(o6);
        int volume = routeInfo.getVolume();
        if (volume != n0Var.c.a.getInt("volume")) {
            n nVar = n0Var.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (nVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(nVar.a);
            ArrayList c10 = nVar.c();
            ArrayList b10 = nVar.b();
            HashSet a2 = nVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
            n0Var.c = new n(bundle);
            p0Var.y();
        }
    }
}
