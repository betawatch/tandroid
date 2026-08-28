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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends c2.w {
    public static final q5.b f = new q5.b("MRDiscoveryCallback", null);
    public final we.b e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final m a = new m(this);

    public n(Context context) {
        this.e = new we.b(context, 15);
    }

    @Override // c2.w
    public final void d(c2.a0 a0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(a0Var, true);
    }

    @Override // c2.w
    public final void e(c2.a0 a0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(a0Var, true);
    }

    @Override // c2.w
    public final void f(c2.a0 a0Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(a0Var, false);
    }

    public final void m() {
        q5.b bVar = f;
        bVar.b(j3.r0.m(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new c2.u0(Looper.getMainLooper(), 1).post(new k(this, 1));
        }
    }

    public final void n() {
        we.b bVar = this.e;
        if (((c2.c0) bVar.c) == null) {
            bVar.c = c2.c0.d((Context) bVar.b);
        }
        c2.c0 c0Var = (c2.c0) bVar.c;
        if (c0Var != null) {
            c0Var.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a2 = m5.y.a(str);
                    if (a2 == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a2)) {
                        arrayList.add(a2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    c2.v vVar = new c2.v(bundle, arrayList);
                    if (((l) this.c.get(str)) == null) {
                        this.c.put(str, new l(vVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + m5.y.a(str), new Object[0]);
                    we.b bVar2 = this.e;
                    if (((c2.c0) bVar2.c) == null) {
                        bVar2.c = c2.c0.d((Context) bVar2.b);
                    }
                    ((c2.c0) bVar2.c).a(vVar, this, 4);
                }
            } catch (Throwable th) {
                throw th;
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
    public final void o(c2.a0 a0Var, boolean z10) {
        boolean z11;
        Set r10;
        boolean remove;
        q5.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), a0Var);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    l lVar = (l) entry.getValue();
                    if (a0Var.h(lVar.b)) {
                        if (z10) {
                            q5.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = lVar.a.add(a0Var);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(a0Var) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            q5.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = lVar.a.remove(a0Var);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(a0Var) + " already removed from appId " + str, new Object[0]));
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
                            l lVar2 = (l) this.c.get(f7.k5.a(str2));
                            if (lVar2 == null) {
                                int i9 = k0.c;
                                r10 = t0.s;
                            } else {
                                LinkedHashSet linkedHashSet = lVar2.a;
                                int i10 = k0.c;
                                Object[] array = linkedHashSet.toArray();
                                r10 = k0.r(array.length, array);
                            }
                            if (!r10.isEmpty()) {
                                hashMap.put(str2, r10);
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
