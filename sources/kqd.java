// default package

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kqd extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ rqd a;

    public kqd(rqd rqdVar) {
        this.a = rqdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        rqd rqdVar = this.a;
        synchronized (rqdVar.h) {
            if (rqdVar.d == null || rqdVar.e == null) {
                return;
            }
            rqd.j.b("the network is lost", new Object[0]);
            if (rqdVar.e.remove(network)) {
                rqdVar.d.remove(network);
            }
            rqdVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        rqd rqdVar = this.a;
        synchronized (rqdVar.h) {
            if (rqdVar.d == null || rqdVar.e == null) {
                return;
            }
            rqd.j.b("all networks are unavailable.", new Object[0]);
            rqdVar.d.clear();
            rqdVar.e.clear();
            rqdVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
