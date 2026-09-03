package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends MediaRouter2.TransferCallback {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        s sVar = (s) this.a.v.remove(routingController);
        if (sVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        e eVar = (e) this.a.s.b;
        if (sVar != eVar.e) {
            int i10 = e.F;
            return;
        }
        b0 c3 = eVar.c();
        if (eVar.e() != c3) {
            eVar.j(c3, 2);
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        b0 b0Var;
        this.a.v.remove(routingController);
        if (routingController2 == this.a.r.getSystemController()) {
            e eVar = (e) this.a.s.b;
            b0 c3 = eVar.c();
            if (eVar.e() != c3) {
                eVar.j(c3, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i10 = 0;
        String id2 = af.a.d(selectedRoutes.get(0)).getId();
        this.a.v.put(routingController2, new h(this.a, routingController2, id2));
        e eVar2 = (e) this.a.s.b;
        ArrayList arrayList = eVar2.j;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                b0Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            b0Var = (b0) obj;
            if (b0Var.c() == eVar2.r && TextUtils.equals(id2, b0Var.b)) {
                break;
            }
        }
        if (b0Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(b0Var, 3);
        }
        this.a.r(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
