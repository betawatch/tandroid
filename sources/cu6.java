// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cu6 extends uv6 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public zu6 o;
    public final /* synthetic */ gu6 p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final pg6 m = new pg6(this, 14);
    public int n = -1;

    public cu6(gu6 gu6Var, MediaRouter2.RoutingController routingController, String str) {
        this.p = gu6Var;
        this.g = routingController;
        this.f = str;
        Messenger n = gu6.n(routingController);
        this.h = n;
        this.i = n == null ? null : new Messenger(new c1(this));
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // vv6
    public final void d() {
        this.g.release();
    }

    @Override // vv6
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        pg6 pg6Var = this.m;
        handler.removeCallbacks(pg6Var);
        handler.postDelayed(pg6Var, 1000L);
    }

    @Override // vv6
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int i2 = this.n;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.g.getVolumeMax()));
        this.n = max;
        this.g.setVolume(max);
        Handler handler = this.k;
        pg6 pg6Var = this.m;
        handler.removeCallbacks(pg6Var);
        handler.postDelayed(pg6Var, 1000L);
    }

    @Override // uv6
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info o = this.p.o(str);
        if (o == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.selectRoute(o);
        }
    }

    @Override // uv6
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info o = this.p.o(str);
        if (o == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.deselectRoute(o);
        }
    }

    @Override // uv6
    public final void o(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        gu6 gu6Var = this.p;
        MediaRoute2Info o = gu6Var.o(str);
        if (o != null) {
            gu6Var.r.transferTo(o);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }

    public final String p() {
        zu6 zu6Var = this.o;
        return zu6Var != null ? zu6Var.d() : this.g.getId();
    }

    public final void q(int i, String str) {
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
        bundle.putInt("volume", i);
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

    public final void r(int i, String str) {
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
        bundle.putInt("volume", i);
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
