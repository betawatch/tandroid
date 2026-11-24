// default package

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ju6 extends MediaRouter.Callback {
    public final vb8 a;

    public ju6(vb8 vb8Var) {
        this.a = vb8Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vb8 vb8Var = this.a;
        if (vb8Var.n(routeInfo)) {
            vb8Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) != null || (o = vb8Var.o(routeInfo)) < 0) {
            return;
        }
        tb8 tb8Var = (tb8) vb8Var.H.get(o);
        String str = tb8Var.b;
        CharSequence name = tb8Var.a.getName(vb8Var.a);
        ys6 ys6Var = new ys6(str, name != null ? name.toString() : "");
        vb8Var.u(tb8Var, ys6Var);
        tb8Var.c = ys6Var.b();
        vb8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vb8 vb8Var = this.a;
        int o = vb8Var.o(routeInfo);
        if (o >= 0) {
            tb8 tb8Var = (tb8) vb8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != tb8Var.c.a.getInt("presentationDisplayId", -1)) {
                zs6 zs6Var = tb8Var.c;
                if (zs6Var == null) {
                    w26.j("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(zs6Var.a);
                ArrayList c = zs6Var.c();
                ArrayList b = zs6Var.b();
                HashSet a = zs6Var.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                tb8Var.c = new zs6(bundle);
                vb8Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) != null || (o = vb8Var.o(routeInfo)) < 0) {
            return;
        }
        vb8Var.H.remove(o);
        vb8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        eu6 a;
        vb8 vb8Var = this.a;
        if (routeInfo == vb8Var.s.getSelectedRoute(8388611)) {
            ub8 s = vb8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = vb8Var.o(routeInfo);
            if (o >= 0) {
                tb8 tb8Var = (tb8) vb8Var.H.get(o);
                ux4 ux4Var = vb8Var.r;
                String str = tb8Var.b;
                ux4Var.a.removeMessages(kk7.k4);
                du6 d = ux4Var.d(ux4Var.s);
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
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) != null || (o = vb8Var.o(routeInfo)) < 0) {
            return;
        }
        tb8 tb8Var = (tb8) vb8Var.H.get(o);
        int volume = routeInfo.getVolume();
        if (volume != tb8Var.c.a.getInt("volume")) {
            zs6 zs6Var = tb8Var.c;
            if (zs6Var == null) {
                w26.j("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(zs6Var.a);
            ArrayList c = zs6Var.c();
            ArrayList b = zs6Var.b();
            HashSet a = zs6Var.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            tb8Var.c = new zs6(bundle);
            vb8Var.y();
        }
    }
}
