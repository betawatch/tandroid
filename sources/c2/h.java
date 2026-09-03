package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends r {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public n o;
    public final /* synthetic */ l p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final ag.d m = new ag.d(this, 10);
    public int n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        this.p = lVar;
        this.g = routingController;
        this.f = str;
        Messenger n10 = l.n(routingController);
        this.h = n10;
        this.i = n10 == null ? null : new Messenger(new androidx.mediarouter.app.d(this));
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // c2.s
    public final void d() {
        this.g.release();
    }

    @Override // c2.s
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.n = i10;
        Handler handler = this.k;
        ag.d dVar = this.m;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 1000L);
    }

    @Override // c2.s
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int i11 = this.n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.g.getVolumeMax()));
        this.n = max;
        this.g.setVolume(max);
        Handler handler = this.k;
        ag.d dVar = this.m;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 1000L);
    }

    @Override // c2.r
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info o10 = this.p.o(str);
        if (o10 == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.selectRoute(o10);
        }
    }

    @Override // c2.r
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info o10 = this.p.o(str);
        if (o10 == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.deselectRoute(o10);
        }
    }

    @Override // c2.r
    public final void o(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        l lVar = this.p;
        MediaRoute2Info o10 = lVar.o(str);
        if (o10 != null) {
            lVar.r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }

    public final String p() {
        n nVar = this.o;
        return nVar != null ? nVar.d() : this.g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
