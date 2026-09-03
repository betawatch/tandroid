package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h0 extends MediaRouter.Callback {
    public final q0 a;

    public h0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        q0 q0Var = this.a;
        if (q0Var.n(routeInfo)) {
            q0Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        q0 q0Var = this.a;
        q0Var.getClass();
        if (q0.s(routeInfo) != null || (o10 = q0Var.o(routeInfo)) < 0) {
            return;
        }
        o0 o0Var = (o0) q0Var.D.get(o10);
        String str = o0Var.b;
        CharSequence name = o0Var.a.getName(q0Var.a);
        m mVar = new m(str, name != null ? name.toString() : "");
        q0Var.u(o0Var, mVar);
        o0Var.c = mVar.b();
        q0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        q0 q0Var = this.a;
        int o10 = q0Var.o(routeInfo);
        if (o10 >= 0) {
            o0 o0Var = (o0) q0Var.D.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != o0Var.c.a.getInt("presentationDisplayId", -1)) {
                n nVar = o0Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(nVar.a);
                ArrayList c3 = nVar.c();
                ArrayList b10 = nVar.b();
                HashSet a2 = nVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                o0Var.c = new n(bundle);
                q0Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        q0 q0Var = this.a;
        q0Var.getClass();
        if (q0.s(routeInfo) != null || (o10 = q0Var.o(routeInfo)) < 0) {
            return;
        }
        q0Var.D.remove(o10);
        q0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        b0 a2;
        q0 q0Var = this.a;
        if (routeInfo != q0Var.s.getSelectedRoute(8388611)) {
            return;
        }
        p0 s6 = q0.s(routeInfo);
        if (s6 != null) {
            s6.a.l();
            return;
        }
        int o10 = q0Var.o(routeInfo);
        if (o10 >= 0) {
            o0 o0Var = (o0) q0Var.D.get(o10);
            e eVar = q0Var.r;
            String str = o0Var.b;
            eVar.a.removeMessages(262);
            a0 d = eVar.d(eVar.s);
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
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        q0 q0Var = this.a;
        q0Var.getClass();
        if (q0.s(routeInfo) != null || (o10 = q0Var.o(routeInfo)) < 0) {
            return;
        }
        o0 o0Var = (o0) q0Var.D.get(o10);
        int volume = routeInfo.getVolume();
        if (volume != o0Var.c.a.getInt("volume")) {
            n nVar = o0Var.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (nVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(nVar.a);
            ArrayList c3 = nVar.c();
            ArrayList b10 = nVar.b();
            HashSet a2 = nVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
            o0Var.c = new n(bundle);
            q0Var.y();
        }
    }
}
