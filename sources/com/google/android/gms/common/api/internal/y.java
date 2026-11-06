package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import m.q3;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y implements Runnable {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ b0 c;
    public final Object d;

    public /* synthetic */ y(b0 b0Var, Object obj, int i7) {
        this.b = i7;
        this.c = b0Var;
        this.a = b0Var;
        this.d = obj;
    }

    public final void a() {
        r8.a aVar;
        Set set;
        switch (this.b) {
            case 0:
                b0 b0Var = this.c;
                n6.e eVar = b0Var.d;
                g0 g0Var = b0Var.a;
                Context context = b0Var.c;
                j2.n nVar = new j2.n(eVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar : hashMap.keySet()) {
                    if (!cVar.c() || ((w) hashMap.get(cVar)).c) {
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
                        i10 = nVar.j0(context, (com.google.android.gms.common.api.c) arrayList2.get(i7));
                        i7++;
                        if (i10 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i7 < size2) {
                        i10 = nVar.j0(context, (com.google.android.gms.common.api.c) arrayList.get(i7));
                        i7++;
                        if (i10 != 0) {
                        }
                    }
                }
                if (i10 != 0) {
                    x xVar = new x(this, b0Var, new n6.a(i10, null, null));
                    c0 c0Var = g0Var.e;
                    c0Var.sendMessage(c0Var.obtainMessage(1, xVar));
                    return;
                }
                if (b0Var.y && (aVar = b0Var.w) != null) {
                    aVar.h(new q6.c(aVar));
                }
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    q6.b bVar = (q6.b) hashMap.get(cVar2);
                    if (!cVar2.c() || nVar.j0(context, cVar2) == 0) {
                        cVar2.h(bVar);
                    } else {
                        u uVar = new u(this, b0Var, bVar);
                        c0 c0Var2 = g0Var.e;
                        c0Var2.sendMessage(c0Var2.obtainMessage(1, uVar));
                    }
                }
                return;
            default:
                b0 b0Var2 = this.c;
                g0 g0Var2 = b0Var2.a;
                d0 d0Var = g0Var2.o;
                q3 q3Var = b0Var2.H;
                if (q3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) q3Var.a);
                    Map map = (Map) q3Var.c;
                    for (com.google.android.gms.common.api.e eVar2 : map.keySet()) {
                        if (!g0Var2.i.containsKey(eVar2.b)) {
                            map.get(eVar2).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                d0Var.F = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i11)).g(b0Var2.E, g0Var2.o.F);
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.a;
        Lock lock = b0Var.b;
        Lock lock2 = b0Var.b;
        lock.lock();
        try {
            try {
            } catch (RuntimeException e10) {
                c0 c0Var = b0Var.a.e;
                c0Var.sendMessage(c0Var.obtainMessage(2, e10));
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
