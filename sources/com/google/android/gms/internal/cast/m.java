package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b8.aa;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends r4.s {
    public static final i6.b f = new i6.b("MRDiscoveryCallback", null);
    public final p4.q e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final l a = new l(this);

    public m(Context context) {
        this.e = new p4.q(context);
    }

    @Override // r4.s
    public final void d(r4.w wVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(wVar, true);
    }

    @Override // r4.s
    public final void e(r4.w wVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(wVar, true);
    }

    @Override // r4.s
    public final void f(r4.w wVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(wVar, false);
    }

    public final void m() {
        i6.b bVar = f;
        bVar.b(k2.p1.j(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new z(Looper.getMainLooper(), 0).post(new j(this, 1));
        }
    }

    public final void n() {
        p4.q qVar = this.e;
        if (((r4.y) qVar.b) == null) {
            qVar.b = r4.y.d((Context) qVar.a);
        }
        r4.y yVar = (r4.y) qVar.b;
        if (yVar != null) {
            yVar.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a10 = e6.y.a(str);
                    if (a10 == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a10)) {
                        arrayList.add(a10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    r4.r rVar = new r4.r(bundle, arrayList);
                    if (((k) this.c.get(str)) == null) {
                        this.c.put(str, new k(rVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + e6.y.a(str), new Object[0]);
                    p4.q qVar2 = this.e;
                    if (((r4.y) qVar2.b) == null) {
                        qVar2.b = r4.y.d((Context) qVar2.a);
                    }
                    ((r4.y) qVar2.b).a(rVar, this, 4);
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
    public final void o(r4.w wVar, boolean z10) {
        boolean z11;
        Set m10;
        boolean remove;
        i6.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), wVar);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    if (wVar.h(kVar.b)) {
                        if (z10) {
                            i6.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = kVar.a.add(wVar);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(wVar) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            i6.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = kVar.a.remove(wVar);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(wVar) + " already removed from appId " + str, new Object[0]));
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
                            k kVar2 = (k) this.c.get(aa.a(str2));
                            if (kVar2 == null) {
                                int i3 = i0.c;
                                m10 = r0.s;
                            } else {
                                LinkedHashSet linkedHashSet = kVar2.a;
                                int i10 = i0.c;
                                Object[] array = linkedHashSet.toArray();
                                m10 = i0.m(array.length, array);
                            }
                            if (!m10.isEmpty()) {
                                hashMap.put(str2, m10);
                            }
                        }
                    }
                    b8.m.b(hashMap.entrySet());
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
