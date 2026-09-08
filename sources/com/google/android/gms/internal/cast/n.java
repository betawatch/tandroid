package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n extends p4.s {
    public static final g6.b f = new g6.b("MRDiscoveryCallback", null);
    public final n4.y e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final m a = new m(this);

    public n(Context context) {
        this.e = new n4.y(10, (Object) context, false);
    }

    @Override // p4.s
    public final void d(p4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(vVar, true);
    }

    @Override // p4.s
    public final void e(p4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(vVar, true);
    }

    @Override // p4.s
    public final void f(p4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(vVar, false);
    }

    public final void m() {
        g6.b bVar = f;
        bVar.b(i2.g.j(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new c0(Looper.getMainLooper(), 0).post(new k(this, 1));
        }
    }

    public final void n() {
        n4.y yVar = this.e;
        if (((p4.x) yVar.c) == null) {
            yVar.c = p4.x.d((Context) yVar.b);
        }
        p4.x xVar = (p4.x) yVar.c;
        if (xVar != null) {
            xVar.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a2 = c6.y.a(str);
                    if (a2 == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a2)) {
                        arrayList.add(a2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    p4.r rVar = new p4.r(bundle, arrayList);
                    if (((l) this.c.get(str)) == null) {
                        this.c.put(str, new l(rVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + c6.y.a(str), new Object[0]);
                    n4.y yVar2 = this.e;
                    if (((p4.x) yVar2.c) == null) {
                        yVar2.c = p4.x.d((Context) yVar2.b);
                    }
                    ((p4.x) yVar2.c).a(rVar, this, 4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(p4.v vVar, boolean z10) {
        boolean z11;
        Set r10;
        boolean remove;
        g6.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), vVar);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    l lVar = (l) entry.getValue();
                    if (vVar.h(lVar.b)) {
                        if (z10) {
                            g6.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = lVar.a.add(vVar);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(vVar) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            g6.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = lVar.a.remove(vVar);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(vVar) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                        z11 = remove;
                    }
                }
            } finally {
            }
        }
        if (z11) {
            f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                try {
                    HashMap hashMap = new HashMap();
                    synchronized (this.c) {
                        for (String str2 : this.c.keySet()) {
                            l lVar2 = (l) this.c.get(v7.i5.a(str2));
                            if (lVar2 == null) {
                                int i10 = m0.c;
                                r10 = v0.s;
                            } else {
                                LinkedHashSet linkedHashSet = lVar2.a;
                                int i11 = m0.c;
                                Object[] array = linkedHashSet.toArray();
                                r10 = m0.r(array.length, array);
                            }
                            if (!r10.isEmpty()) {
                                hashMap.put(str2, r10);
                            }
                        }
                    }
                    l0.a(hashMap.entrySet());
                    Iterator it = this.b.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } finally {
                }
            }
        }
    }
}
