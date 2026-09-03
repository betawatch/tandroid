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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends c2.x {
    public static final u5.b f = new u5.b("MRDiscoveryCallback", null);
    public final af.c e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final l a = new l(this);

    public m(Context context) {
        this.e = new af.c(context, 22);
    }

    @Override // c2.x
    public final void d(c2.b0 b0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(b0Var, true);
    }

    @Override // c2.x
    public final void e(c2.b0 b0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(b0Var, true);
    }

    @Override // c2.x
    public final void f(c2.b0 b0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(b0Var, false);
    }

    public final void m() {
        u5.b bVar = f;
        bVar.b(kf.k0.k(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new a7.e(Looper.getMainLooper(), 2).post(new j(this, 1));
        }
    }

    public final void n() {
        af.c cVar = this.e;
        if (((c2.d0) cVar.c) == null) {
            cVar.c = c2.d0.d((Context) cVar.b);
        }
        c2.d0 d0Var = (c2.d0) cVar.c;
        if (d0Var != null) {
            d0Var.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a2 = q5.y.a(str);
                    if (a2 == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a2)) {
                        arrayList.add(a2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    c2.w wVar = new c2.w(bundle, arrayList);
                    if (((k) this.c.get(str)) == null) {
                        this.c.put(str, new k(wVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + q5.y.a(str), new Object[0]);
                    af.c cVar2 = this.e;
                    if (((c2.d0) cVar2.c) == null) {
                        cVar2.c = c2.d0.d((Context) cVar2.b);
                    }
                    ((c2.d0) cVar2.c).a(wVar, this, 4);
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
    public final void o(c2.b0 b0Var, boolean z4) {
        boolean z10;
        Set r10;
        boolean remove;
        u5.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z4), b0Var);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z10 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    if (b0Var.h(kVar.b)) {
                        if (z4) {
                            u5.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = kVar.a.add(b0Var);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(b0Var) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            u5.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = kVar.a.remove(b0Var);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(b0Var) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                        z10 = remove;
                    }
                }
            } finally {
            }
        }
        if (z10) {
            f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                try {
                    HashMap hashMap = new HashMap();
                    synchronized (this.c) {
                        for (String str2 : this.c.keySet()) {
                            k kVar2 = (k) this.c.get(j7.u5.a(str2));
                            if (kVar2 == null) {
                                int i10 = j0.c;
                                r10 = s0.s;
                            } else {
                                LinkedHashSet linkedHashSet = kVar2.a;
                                int i11 = j0.c;
                                Object[] array = linkedHashSet.toArray();
                                r10 = j0.r(array.length, array);
                            }
                            if (!r10.isEmpty()) {
                                hashMap.put(str2, r10);
                            }
                        }
                    }
                    i0.a(hashMap.entrySet());
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
