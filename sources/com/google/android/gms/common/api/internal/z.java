package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import m.o3;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                i0 i0Var = c0Var.a;
                Context context = c0Var.c;
                ji.j jVar = new ji.j(eVar);
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
                        i10 = jVar.m0(context, (com.google.android.gms.common.api.c) arrayList2.get(i7));
                        i7++;
                        if (i10 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i7 < size2) {
                        i10 = jVar.m0(context, (com.google.android.gms.common.api.c) arrayList.get(i7));
                        i7++;
                        if (i10 != 0) {
                        }
                    }
                }
                if (i10 != 0) {
                    y yVar = new y(this, c0Var, new n6.a(i10, null, null));
                    e0 e0Var = i0Var.e;
                    e0Var.sendMessage(e0Var.obtainMessage(1, yVar));
                    return;
                }
                if (c0Var.y && (aVar = c0Var.w) != null) {
                    aVar.h(new q6.c(aVar));
                }
                for (com.google.android.gms.common.api.c cVar2 : hashMap.keySet()) {
                    q6.b bVar = (q6.b) hashMap.get(cVar2);
                    if (!cVar2.c() || jVar.m0(context, cVar2) == 0) {
                        cVar2.h(bVar);
                    } else {
                        v vVar = new v(this, c0Var, bVar);
                        e0 e0Var2 = i0Var.e;
                        e0Var2.sendMessage(e0Var2.obtainMessage(1, vVar));
                    }
                }
                return;
            default:
                c0 c0Var2 = this.c;
                i0 i0Var2 = c0Var2.a;
                f0 f0Var = i0Var2.o;
                o3 o3Var = c0Var2.I;
                if (o3Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) o3Var.a);
                    Map map = (Map) o3Var.c;
                    for (com.google.android.gms.common.api.e eVar2 : map.keySet()) {
                        if (!i0Var2.i.containsKey(eVar2.b)) {
                            map.get(eVar2).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                f0Var.G = set;
                ArrayList arrayList3 = (ArrayList) this.d;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((com.google.android.gms.common.api.c) arrayList3.get(i11)).g(c0Var2.F, i0Var2.o.G);
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
                e0 e0Var = c0Var.a.e;
                e0Var.sendMessage(e0Var.obtainMessage(2, e10));
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
