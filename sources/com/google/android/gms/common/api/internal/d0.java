package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ g0 c;
    public final Object d;

    public /* synthetic */ d0(g0 g0Var, Object obj, int i10) {
        this.b = i10;
        this.c = g0Var;
        this.a = g0Var;
        this.d = obj;
    }

    public final void a() {
        o8.a aVar;
        Set set;
        switch (this.b) {
            case 0:
                g0 g0Var = this.c;
                n0 n0Var = g0Var.a;
                Context context = g0Var.c;
                m4.c cVar = new m4.c(g0Var.d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    if (!cVar2.l() || ((b0) hashMap.get(cVar2)).c) {
                        arrayList2.add(cVar2);
                    } else {
                        arrayList.add(cVar2);
                    }
                }
                int i10 = 0;
                int i11 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i10 < size) {
                        i11 = cVar.Q0(context, (com.google.android.gms.common.api.c) arrayList2.get(i10));
                        i10++;
                        if (i11 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        i11 = cVar.Q0(context, (com.google.android.gms.common.api.c) arrayList.get(i10));
                        i10++;
                        if (i11 != 0) {
                        }
                    }
                }
                if (i11 != 0) {
                    c0 c0Var = new c0(this, g0Var, new k6.a(i11, null));
                    i0 i0Var = n0Var.e;
                    i0Var.sendMessage(i0Var.obtainMessage(1, c0Var));
                    return;
                }
                if (g0Var.y && (aVar = g0Var.w) != null) {
                    aVar.H();
                }
                for (com.google.android.gms.common.api.c cVar3 : hashMap.keySet()) {
                    n6.b bVar = (n6.b) hashMap.get(cVar3);
                    if (!cVar3.l() || cVar.Q0(context, cVar3) == 0) {
                        cVar3.f(bVar);
                    } else {
                        z zVar = new z(g0Var, bVar);
                        i0 i0Var2 = n0Var.e;
                        i0Var2.sendMessage(i0Var2.obtainMessage(1, zVar));
                    }
                }
                return;
            default:
                g0 g0Var2 = this.c;
                n0 n0Var2 = g0Var2.a;
                k0 k0Var = n0Var2.o;
                p3 p3Var = g0Var2.H;
                if (p3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) p3Var.a);
                    Map map = (Map) p3Var.c;
                    for (com.google.android.gms.common.api.e eVar : map.keySet()) {
                        if (!n0Var2.i.containsKey(eVar.b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                k0Var.F = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i12)).c(g0Var2.E, n0Var2.o.F);
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = this.a;
        Lock lock = g0Var.b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                i0 i0Var = g0Var.a.e;
                i0Var.sendMessage(i0Var.obtainMessage(2, e));
            }
        } finally {
            lock.unlock();
        }
    }
}
