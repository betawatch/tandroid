package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class v extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        w wVar = this.a;
        synchronized (wVar.n) {
            try {
                if (wVar.d != null && wVar.e != null) {
                    w.s.b("the network is lost", new Object[0]);
                    if (wVar.e.remove(network)) {
                        wVar.d.remove(network);
                    }
                    wVar.b();
                }
            } finally {
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        w wVar = this.a;
        synchronized (wVar.n) {
            if (wVar.d != null && wVar.e != null) {
                w.s.b("all networks are unavailable.", new Object[0]);
                wVar.d.clear();
                wVar.e.clear();
                wVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
