package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import m.r3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        c8.a aVar;
        Set set;
        switch (this.b) {
            case 0:
                g0 g0Var = this.c;
                m0 m0Var = g0Var.a;
                Context context = g0Var.c;
                bf.b bVar = new bf.b(g0Var.d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar : hashMap.keySet()) {
                    if (!cVar.j() || ((b0) hashMap.get(cVar)).c) {
                        arrayList2.add(cVar);
                    } else {
                        arrayList.add(cVar);
                    }
                }
                int i10 = 0;
                int i11 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i10 < size) {
                        i11 = bVar.f0(context, (com.google.android.gms.common.api.c) arrayList2.get(i10));
                        i10++;
                        if (i11 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        i11 = bVar.f0(context, (com.google.android.gms.common.api.c) arrayList.get(i10));
                        i10++;
                        if (i11 != 0) {
                        }
                    }
                }
                if (i11 != 0) {
                    c0 c0Var = new c0(this, g0Var, new y5.a(i11, null));
                    h0 h0Var = m0Var.e;
                    h0Var.sendMessage(h0Var.obtainMessage(1, c0Var));
                    return;
                }
                if (g0Var.x && (aVar = g0Var.v) != null) {
                    aVar.G();
                }
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    b6.b bVar2 = (b6.b) hashMap.get(cVar2);
                    if (!cVar2.j() || bVar.f0(context, cVar2) == 0) {
                        cVar2.n(bVar2);
                    } else {
                        z zVar = new z(g0Var, bVar2);
                        h0 h0Var2 = m0Var.e;
                        h0Var2.sendMessage(h0Var2.obtainMessage(1, zVar));
                    }
                }
                return;
            default:
                g0 g0Var2 = this.c;
                m0 m0Var2 = g0Var2.a;
                j0 j0Var = m0Var2.o;
                r3 r3Var = g0Var2.E;
                if (r3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) r3Var.a);
                    Map map = (Map) r3Var.c;
                    for (com.google.android.gms.common.api.e eVar : map.keySet()) {
                        if (!m0Var2.i.containsKey(eVar.b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                j0Var.C = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i12)).i(g0Var2.B, m0Var2.o.C);
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
            } catch (RuntimeException e6) {
                h0 h0Var = g0Var.a.e;
                h0Var.sendMessage(h0Var.obtainMessage(2, e6));
            }
        } finally {
            lock.unlock();
        }
    }
}
