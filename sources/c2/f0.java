package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f0 extends MediaRouter.Callback {
    public final o0 a;

    public f0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        o0 o0Var = this.a;
        if (o0Var.n(routeInfo)) {
            o0Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        o0 o0Var = this.a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (o10 = o0Var.o(routeInfo)) < 0) {
            return;
        }
        m0 m0Var = (m0) o0Var.C.get(o10);
        String str = m0Var.b;
        CharSequence name = m0Var.a.getName(o0Var.a);
        m mVar = new m(str, name != null ? name.toString() : "");
        o0Var.u(m0Var, mVar);
        m0Var.c = mVar.b();
        o0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        o0 o0Var = this.a;
        int o10 = o0Var.o(routeInfo);
        if (o10 >= 0) {
            m0 m0Var = (m0) o0Var.C.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != m0Var.c.a.getInt("presentationDisplayId", -1)) {
                n nVar = m0Var.c;
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
                m0Var.c = new n(bundle);
                o0Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        o0 o0Var = this.a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (o10 = o0Var.o(routeInfo)) < 0) {
            return;
        }
        o0Var.C.remove(o10);
        o0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        z a2;
        o0 o0Var = this.a;
        if (routeInfo != o0Var.s.getSelectedRoute(8388611)) {
            return;
        }
        n0 s10 = o0.s(routeInfo);
        if (s10 != null) {
            s10.a.l();
            return;
        }
        int o10 = o0Var.o(routeInfo);
        if (o10 >= 0) {
            m0 m0Var = (m0) o0Var.C.get(o10);
            e eVar = o0Var.r;
            String str = m0Var.b;
            eVar.a.removeMessages(262);
            y d = eVar.d(eVar.s);
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
        o0 o0Var = this.a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (o10 = o0Var.o(routeInfo)) < 0) {
            return;
        }
        m0 m0Var = (m0) o0Var.C.get(o10);
        int volume = routeInfo.getVolume();
        if (volume != m0Var.c.a.getInt("volume")) {
            n nVar = m0Var.c;
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
            m0Var.c = new n(bundle);
            o0Var.y();
        }
    }
}
