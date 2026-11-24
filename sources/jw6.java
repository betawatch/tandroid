// default package

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jw6 extends MediaRouter.Callback {
    public final yd8 a;

    public jw6(yd8 yd8Var) {
        this.a = yd8Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        yd8 yd8Var = this.a;
        if (yd8Var.n(routeInfo)) {
            yd8Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) != null || (o = yd8Var.o(routeInfo)) < 0) {
            return;
        }
        wd8 wd8Var = (wd8) yd8Var.H.get(o);
        String str = wd8Var.b;
        CharSequence name = wd8Var.a.getName(yd8Var.a);
        yu6 yu6Var = new yu6(str, name != null ? name.toString() : "");
        yd8Var.u(wd8Var, yu6Var);
        wd8Var.c = yu6Var.b();
        yd8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        yd8 yd8Var = this.a;
        int o = yd8Var.o(routeInfo);
        if (o >= 0) {
            wd8 wd8Var = (wd8) yd8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != wd8Var.c.a.getInt("presentationDisplayId", -1)) {
                zu6 zu6Var = wd8Var.c;
                if (zu6Var == null) {
                    u36.j("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(zu6Var.a);
                ArrayList c = zu6Var.c();
                ArrayList b = zu6Var.b();
                HashSet a = zu6Var.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                wd8Var.c = new zu6(bundle);
                yd8Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) != null || (o = yd8Var.o(routeInfo)) < 0) {
            return;
        }
        yd8Var.H.remove(o);
        yd8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        ew6 a;
        yd8 yd8Var = this.a;
        if (routeInfo == yd8Var.s.getSelectedRoute(8388611)) {
            xd8 s = yd8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = yd8Var.o(routeInfo);
            if (o >= 0) {
                wd8 wd8Var = (wd8) yd8Var.H.get(o);
                wz4 wz4Var = yd8Var.r;
                String str = wd8Var.b;
                wz4Var.a.removeMessages(nm7.k4);
                dw6 d = wz4Var.d(wz4Var.s);
                if (d == null || (a = d.a(str)) == null) {
                    return;
                }
                a.l();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) != null || (o = yd8Var.o(routeInfo)) < 0) {
            return;
        }
        wd8 wd8Var = (wd8) yd8Var.H.get(o);
        int volume = routeInfo.getVolume();
        if (volume != wd8Var.c.a.getInt("volume")) {
            zu6 zu6Var = wd8Var.c;
            if (zu6Var == null) {
                u36.j("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(zu6Var.a);
            ArrayList c = zu6Var.c();
            ArrayList b = zu6Var.b();
            HashSet a = zu6Var.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            wd8Var.c = new zu6(bundle);
            yd8Var.y();
        }
    }
}
