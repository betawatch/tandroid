package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class x extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ y a;

    public x(y yVar) {
        this.a = yVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        y yVar = this.a;
        synchronized (yVar.h) {
            try {
                if (yVar.d != null && yVar.e != null) {
                    y.j.b("the network is lost", new Object[0]);
                    if (yVar.e.remove(network)) {
                        yVar.d.remove(network);
                    }
                    yVar.b();
                }
            } finally {
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        y yVar = this.a;
        synchronized (yVar.h) {
            if (yVar.d != null && yVar.e != null) {
                y.j.b("all networks are unavailable.", new Object[0]);
                yVar.d.clear();
                yVar.e.clear();
                yVar.b();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
