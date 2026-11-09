package com.google.android.gms.internal.cast;

import a8.m8;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class m extends s4.s {
    public static final j6.b f = new j6.b("MRDiscoveryCallback", null);
    public final q4.q e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final l a = new l(this);

    public m(Context context) {
        this.e = new q4.q(context);
    }

    @Override // s4.s
    public final void d(s4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(vVar, true);
    }

    @Override // s4.s
    public final void e(s4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(vVar, true);
    }

    @Override // s4.s
    public final void f(s4.v vVar) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(vVar, false);
    }

    public final void m() {
        j6.b bVar = f;
        bVar.b(jg.g.k(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new y(Looper.getMainLooper(), 0).post(new j(this, 1));
        }
    }

    public final void n() {
        q4.q qVar = this.e;
        if (((s4.x) qVar.c) == null) {
            qVar.c = s4.x.d((Context) qVar.b);
        }
        s4.x xVar = (s4.x) qVar.c;
        if (xVar != null) {
            xVar.h(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a10 = f6.y.a(str);
                    if (a10 == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a10)) {
                        arrayList.add(a10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    s4.r rVar = new s4.r(bundle, arrayList);
                    if (((k) this.c.get(str)) == null) {
                        this.c.put(str, new k(rVar));
                    }
                    f.b("Adding mediaRouter callback for control category " + f6.y.a(str), new Object[0]);
                    q4.q qVar2 = this.e;
                    if (((s4.x) qVar2.c) == null) {
                        qVar2.c = s4.x.d((Context) qVar2.b);
                    }
                    ((s4.x) qVar2.c).a(rVar, this, 4);
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
    public final void o(s4.v vVar, boolean z9) {
        boolean z10;
        Set m10;
        boolean remove;
        j6.b bVar = f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z9), vVar);
        synchronized (this.c) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
                z10 = false;
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    if (vVar.h(kVar.b)) {
                        if (z9) {
                            j6.b bVar2 = f;
                            bVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = kVar.a.add(vVar);
                            if (!remove) {
                                Log.w(bVar2.a, bVar2.d("Route " + String.valueOf(vVar) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            j6.b bVar3 = f;
                            bVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = kVar.a.remove(vVar);
                            if (!remove) {
                                Log.w(bVar3.a, bVar3.d("Route " + String.valueOf(vVar) + " already removed from appId " + str, new Object[0]));
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
                            k kVar2 = (k) this.c.get(m8.a(str2));
                            if (kVar2 == null) {
                                int i7 = h0.c;
                                m10 = q0.s;
                            } else {
                                LinkedHashSet linkedHashSet = kVar2.a;
                                int i10 = h0.c;
                                Object[] array = linkedHashSet.toArray();
                                m10 = h0.m(array.length, array);
                            }
                            if (!m10.isEmpty()) {
                                hashMap.put(str2, m10);
                            }
                        }
                    }
                    a8.v.b(hashMap.entrySet());
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
