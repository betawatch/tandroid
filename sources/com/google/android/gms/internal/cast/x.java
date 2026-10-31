package com.google.android.gms.internal.cast;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x {
    public static final g6.b j = new g6.b("ConnectivityMonitor", null);
    public final j4 a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final w b = new w(this);

    public x(Context context, j4 j4Var) {
        this.a = j4Var;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            try {
                if (this.d != null && this.e != null) {
                    j.b("a new network is available", new Object[0]);
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
        synchronized (this.i) {
            try {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!((k4) this.a).a.isShutdown()) {
                        ((k4) this.a).execute(new v(this, 0));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
