package com.google.android.gms.internal.cast;

import a8.da;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m extends p4.s {
    public static final h6.b f = new h6.b("MRDiscoveryCallback", null);
    public final rf.b e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final l a = new l(this);

    public m(Context context) {
        this.e = new rf.b(context, 11);
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
        h6.b bVar = f;
        bVar.b(ic.a.j(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new y(Looper.getMainLooper(), 0).post(new j(this, 1));
        }
    }

    public final void n() {
        rf.b bVar = this.e;
        if (((p4.x) bVar.c) == null) {
            bVar.c = p4.x.d((Context) bVar.b);
        }
        p4.x xVar = (p4.x) bVar.c;
        if (xVar != null) {
            xVar.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a2 = d6.y.a(str);
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
                    if (((k) this.c.get(str)) == null) {
                        this.c.put(str, new k(rVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + d6.y.a(str), new Object[0]);
                    rf.b bVar2 = this.e;
                    if (((p4.x) bVar2.c) == null) {
                        bVar2.c = p4.x.d((Context) bVar2.b);
                    }
                    ((p4.x) bVar2.c).a(rVar, this, 4);
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
        Set q5;
        boolean remove;
        h6.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), vVar);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    if (vVar.h(kVar.b)) {
                        if (z10) {
                            h6.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = kVar.a.add(vVar);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(vVar) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            h6.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = kVar.a.remove(vVar);
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
                            k kVar2 = (k) this.c.get(da.a(str2));
                            if (kVar2 == null) {
                                int i10 = h0.c;
                                q5 = q0.s;
                            } else {
                                LinkedHashSet linkedHashSet = kVar2.a;
                                int i11 = h0.c;
                                Object[] array = linkedHashSet.toArray();
                                q5 = h0.q(array.length, array);
                            }
                            if (!q5.isEmpty()) {
                                hashMap.put(str2, q5);
                            }
                        }
                    }
                    a8.m.a(hashMap.entrySet());
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
