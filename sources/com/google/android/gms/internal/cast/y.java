package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
