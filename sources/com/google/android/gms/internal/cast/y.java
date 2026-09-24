package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class y extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        z zVar = this.a;
        synchronized (zVar.n) {
            try {
                if (zVar.d != null && zVar.e != null) {
                    z.s.b("the network is lost", new Object[0]);
                    if (zVar.e.remove(network)) {
                        zVar.d.remove(network);
                    }
                    zVar.b();
                }
            } finally {
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        z zVar = this.a;
        synchronized (zVar.n) {
            if (zVar.d != null && zVar.e != null) {
                z.s.b("all networks are unavailable.", new Object[0]);
                zVar.d.clear();
                zVar.e.clear();
                zVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
