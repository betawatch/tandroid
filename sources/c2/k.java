package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends MediaRouter2.TransferCallback {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        r rVar = (r) this.a.v.remove(routingController);
        if (rVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        e eVar = (e) this.a.s.b;
        if (rVar != eVar.e) {
            int i10 = e.F;
            return;
        }
        z c10 = eVar.c();
        if (eVar.e() != c10) {
            eVar.j(c10, 2);
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        z zVar;
        this.a.v.remove(routingController);
        if (routingController2 == this.a.r.getSystemController()) {
            e eVar = (e) this.a.s.b;
            z c10 = eVar.c();
            if (eVar.e() != c10) {
                eVar.j(c10, 3);
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
        String id2 = a9.m.d(selectedRoutes.get(0)).getId();
        this.a.v.put(routingController2, new h(this.a, routingController2, id2));
        e eVar2 = (e) this.a.s.b;
        ArrayList arrayList = eVar2.j;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                zVar = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            zVar = (z) obj;
            if (zVar.c() == eVar2.r && TextUtils.equals(id2, zVar.b)) {
                break;
            }
        }
        if (zVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(zVar, 3);
        }
        this.a.r(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
