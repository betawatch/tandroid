package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        x xVar = this.a;
        synchronized (xVar.h) {
            try {
                if (xVar.d != null && xVar.e != null) {
                    x.j.b("the network is lost", new Object[0]);
                    if (xVar.e.remove(network)) {
                        xVar.d.remove(network);
                    }
                    xVar.b();
                }
            } finally {
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        x xVar = this.a;
        synchronized (xVar.h) {
            if (xVar.d != null && xVar.e != null) {
                x.j.b("all networks are unavailable.", new Object[0]);
                xVar.d.clear();
                xVar.e.clear();
                xVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
