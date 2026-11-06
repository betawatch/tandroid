package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        synchronized (wVar.h) {
            try {
                if (wVar.d != null && wVar.e != null) {
                    w.j.b("the network is lost", new Object[0]);
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
        synchronized (wVar.h) {
            if (wVar.d != null && wVar.e != null) {
                w.j.b("all networks are unavailable.", new Object[0]);
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
