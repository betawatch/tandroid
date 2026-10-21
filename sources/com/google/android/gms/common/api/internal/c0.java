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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ f0 c;
    public final Object d;

    public /* synthetic */ c0(f0 f0Var, Object obj, int i10) {
        this.b = i10;
        this.c = f0Var;
        this.a = f0Var;
        this.d = obj;
    }

    public final void a() {
        o8.a aVar;
        Set set;
        switch (this.b) {
            case 0:
                f0 f0Var = this.c;
                l0 l0Var = f0Var.a;
                Context context = f0Var.c;
                mi.q qVar = new mi.q(f0Var.d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.d;
                for (com.google.android.gms.common.api.c cVar : hashMap.keySet()) {
                    if (!cVar.k() || ((a0) hashMap.get(cVar)).c) {
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
                        i11 = qVar.a0(context, (com.google.android.gms.common.api.c) arrayList2.get(i10));
                        i10++;
                        if (i11 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        i11 = qVar.a0(context, (com.google.android.gms.common.api.c) arrayList.get(i10));
                        i10++;
                        if (i11 != 0) {
                        }
                    }
                }
                if (i11 != 0) {
                    b0 b0Var = new b0(this, f0Var, new k6.a(i11, null));
                    g0 g0Var = l0Var.e;
                    g0Var.sendMessage(g0Var.obtainMessage(1, b0Var));
                    return;
                }
                if (f0Var.x && (aVar = f0Var.v) != null) {
                    aVar.G();
                }
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    n6.b bVar = (n6.b) hashMap.get(cVar2);
                    if (!cVar2.k() || qVar.a0(context, cVar2) == 0) {
                        cVar2.e(bVar);
                    } else {
                        y yVar = new y(f0Var, bVar);
                        g0 g0Var2 = l0Var.e;
                        g0Var2.sendMessage(g0Var2.obtainMessage(1, yVar));
                    }
                }
                return;
            default:
                f0 f0Var2 = this.c;
                l0 l0Var2 = f0Var2.a;
                i0 i0Var = l0Var2.o;
                s3 s3Var = f0Var2.H;
                if (s3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) s3Var.a);
                    Map map = (Map) s3Var.c;
                    for (com.google.android.gms.common.api.e eVar : map.keySet()) {
                        if (!l0Var2.i.containsKey(eVar.b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                i0Var.F = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i12)).b(f0Var2.E, l0Var2.o.F);
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var = this.a;
        Lock lock = f0Var.b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                g0 g0Var = f0Var.a.e;
                g0Var.sendMessage(g0Var.obtainMessage(2, e));
            }
        } finally {
            lock.unlock();
        }
    }
}
