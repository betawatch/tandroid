// default package

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hod extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ood a;

    public hod(ood oodVar) {
        this.a = oodVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ood oodVar = this.a;
        synchronized (oodVar.h) {
            if (oodVar.d == null || oodVar.e == null) {
                return;
            }
            ood.j.b("the network is lost", new Object[0]);
            if (oodVar.e.remove(network)) {
                oodVar.d.remove(network);
            }
            oodVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ood oodVar = this.a;
        synchronized (oodVar.h) {
            if (oodVar.d == null || oodVar.e == null) {
                return;
            }
            ood.j.b("all networks are unavailable.", new Object[0]);
            oodVar.d.clear();
            oodVar.e.clear();
            oodVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
