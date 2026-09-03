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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class w implements t {
    public static final u5.b s = new u5.b("ConnectivityMonitor", null);
    public final k4 a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context h;
    public final Object n = new Object();
    public final Set r = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final v b = new v(this);

    public w(Context context, k4 k4Var) {
        this.a = k4Var;
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
                    if (!((l4) this.a).a.isShutdown()) {
                        ((l4) this.a).execute(new u(this, 0));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.t
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
