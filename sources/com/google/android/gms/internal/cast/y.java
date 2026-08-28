package com.google.android.gms.internal.cast;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y implements v {
    public static final q5.b s = new q5.b("ConnectivityMonitor", null);
    public final l4 a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context h;
    public final Object n = new Object();
    public final Set r = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final x b = new x(this);

    public y(Context context, l4 l4Var) {
        this.a = l4Var;
        this.h = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.n) {
            try {
                if (this.d != null && this.e != null) {
                    s.b("a new network is available", new Object[0]);
                    if (this.d.containsKey(network)) {
                        this.e.remove(network);
                    }
                    this.d.put(network, linkProperties);
                    this.e.add(network);
                    b();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        synchronized (this.r) {
            try {
                Iterator it = this.r.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!((m4) this.a).a.isShutdown()) {
                        ((m4) this.a).execute(new w(this, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.v
    public final void zza() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        s.b("Start monitoring connectivity changes", new Object[0]);
        if (this.f || (connectivityManager = this.c) == null || f0.e.b(this.h, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            a(activeNetwork, linkProperties);
        }
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.b);
        this.f = true;
    }
}
