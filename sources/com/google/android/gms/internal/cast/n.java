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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends c2.x {
    public static final s5.b f = new s5.b("MRDiscoveryCallback", null);
    public final ze.b e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final m a = new m(this);

    public n(Context context) {
        this.e = new ze.b(context);
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
        s5.b bVar = f;
        bVar.b(j7.l1.l(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new c2.v0(Looper.getMainLooper(), 1).post(new k(this, 1));
        }
    }

    public final void n() {
        ze.b bVar = this.e;
        if (((c2.d0) bVar.b) == null) {
            bVar.b = c2.d0.d((Context) bVar.a);
        }
        c2.d0 d0Var = (c2.d0) bVar.b;
        if (d0Var != null) {
            d0Var.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a2 = o5.y.a(str);
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
                    if (((l) this.c.get(str)) == null) {
                        this.c.put(str, new l(wVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + o5.y.a(str), new Object[0]);
                    ze.b bVar2 = this.e;
                    if (((c2.d0) bVar2.b) == null) {
                        bVar2.b = c2.d0.d((Context) bVar2.a);
                    }
                    ((c2.d0) bVar2.b).a(wVar, this, 4);
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
    public final void o(c2.b0 b0Var, boolean z10) {
        boolean z11;
        Set r6;
        boolean remove;
        s5.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), b0Var);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    l lVar = (l) entry.getValue();
                    if (b0Var.h(lVar.b)) {
                        if (z10) {
                            s5.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = lVar.a.add(b0Var);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(b0Var) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            s5.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = lVar.a.remove(b0Var);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(b0Var) + " already removed from appId " + str, new Object[0]));
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
                            l lVar2 = (l) this.c.get(h7.r5.a(str2));
                            if (lVar2 == null) {
                                int i10 = k0.c;
                                r6 = t0.s;
                            } else {
                                LinkedHashSet linkedHashSet = lVar2.a;
                                int i11 = k0.c;
                                Object[] array = linkedHashSet.toArray();
                                r6 = k0.r(array.length, array);
                            }
                            if (!r6.isEmpty()) {
                                hashMap.put(str2, r6);
                            }
                        }
                    }
                    j0.a(hashMap.entrySet());
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
