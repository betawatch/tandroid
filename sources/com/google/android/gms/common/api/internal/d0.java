package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import m.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                af.c cVar = new af.c(g0Var.d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    if (!cVar2.j() || ((b0) hashMap.get(cVar2)).c) {
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
                        i11 = cVar.g0(context, (com.google.android.gms.common.api.c) arrayList2.get(i10));
                        i10++;
                        if (i11 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        i11 = cVar.g0(context, (com.google.android.gms.common.api.c) arrayList.get(i10));
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
                for (com.google.android.gms.common.api.c cVar3 : hashMap.keySet()) {
                    b6.b bVar = (b6.b) hashMap.get(cVar3);
                    if (!cVar3.j() || cVar.g0(context, cVar3) == 0) {
                        cVar3.n(bVar);
                    } else {
                        z zVar = new z(g0Var, bVar);
                        h0 h0Var2 = m0Var.e;
                        h0Var2.sendMessage(h0Var2.obtainMessage(1, zVar));
                    }
                }
                return;
            default:
                g0 g0Var2 = this.c;
                m0 m0Var2 = g0Var2.a;
                j0 j0Var = m0Var2.o;
                s3 s3Var = g0Var2.E;
                if (s3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) s3Var.a);
                    Map map = (Map) s3Var.c;
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
            } catch (RuntimeException e) {
                h0 h0Var = g0Var.a.e;
                h0Var.sendMessage(h0Var.obtainMessage(2, e));
            }
        } finally {
            lock.unlock();
        }
    }
}
