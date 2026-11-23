package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c0 c;
    public final Object d;

    public /* synthetic */ z(c0 c0Var, Object obj, int i7) {
        this.b = i7;
        this.c = c0Var;
        this.a = c0Var;
        this.d = obj;
    }

    public final void a() {
        r8.a aVar;
        Set set;
        switch (this.b) {
            case 0:
                c0 c0Var = this.c;
                n6.e eVar = c0Var.d;
                h0 h0Var = c0Var.a;
                Context context = c0Var.c;
                j6.k kVar = new j6.k(eVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar : hashMap.keySet()) {
                    if (!cVar.c() || ((x) hashMap.get(cVar)).c) {
                        arrayList2.add(cVar);
                    } else {
                        arrayList.add(cVar);
                    }
                }
                int i7 = 0;
                int i10 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i7 < size) {
                        i10 = kVar.l0(context, (com.google.android.gms.common.api.c) arrayList2.get(i7));
                        i7++;
                        if (i10 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i7 < size2) {
                        i10 = kVar.l0(context, (com.google.android.gms.common.api.c) arrayList.get(i7));
                        i7++;
                        if (i10 != 0) {
                        }
                    }
                }
                if (i10 != 0) {
                    y yVar = new y(this, c0Var, new n6.a(i10, null, null));
                    d0 d0Var = h0Var.e;
                    d0Var.sendMessage(d0Var.obtainMessage(1, yVar));
                    return;
                }
                if (c0Var.y && (aVar = c0Var.w) != null) {
                    aVar.h(new q6.c(aVar));
                }
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    q6.b bVar = (q6.b) hashMap.get(cVar2);
                    if (!cVar2.c() || kVar.l0(context, cVar2) == 0) {
                        cVar2.h(bVar);
                    } else {
                        v vVar = new v(this, c0Var, bVar);
                        d0 d0Var2 = h0Var.e;
                        d0Var2.sendMessage(d0Var2.obtainMessage(1, vVar));
                    }
                }
                return;
            default:
                c0 c0Var2 = this.c;
                h0 h0Var2 = c0Var2.a;
                e0 e0Var = h0Var2.o;
                ga.d dVar = c0Var2.I;
                if (dVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) dVar.b);
                    Map map = (Map) dVar.d;
                    for (com.google.android.gms.common.api.e eVar2 : map.keySet()) {
                        if (!h0Var2.i.containsKey(eVar2.b)) {
                            map.get(eVar2).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                e0Var.G = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i11)).g(c0Var2.F, h0Var2.o.G);
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        Lock lock = c0Var.b;
        Lock lock2 = c0Var.b;
        lock.lock();
        try {
            try {
            } catch (RuntimeException e10) {
                d0 d0Var = c0Var.a.e;
                d0Var.sendMessage(d0Var.obtainMessage(2, e10));
            }
            if (Thread.interrupted()) {
                return;
            }
            a();
        } finally {
            lock2.unlock();
        }
    }
}
