package j3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q1 {
    public final k3.k a;
    public final k0 e;
    public final k3.f h;
    public final h5.a0 i;
    public boolean k;
    public g5.v0 l;
    public o4.q0 j = new o4.o0();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public q1(k0 k0Var, k3.f fVar, h5.a0 a0Var, k3.k kVar) {
        this.a = kVar;
        this.e = k0Var;
        this.h = fVar;
        this.i = a0Var;
    }

    public final o2 a(int i10, ArrayList arrayList, o4.q0 q0Var) {
        if (!arrayList.isEmpty()) {
            this.j = q0Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                p1 p1Var = (p1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    p1 p1Var2 = (p1) arrayList2.get(i11 - 1);
                    p1Var.d = p1Var2.a.o.b.o() + p1Var2.d;
                    p1Var.e = false;
                    p1Var.c.clear();
                } else {
                    p1Var.d = 0;
                    p1Var.e = false;
                    p1Var.c.clear();
                }
                int o10 = p1Var.a.o.b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((p1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, p1Var);
                this.d.put(p1Var.b, p1Var);
                if (this.k) {
                    e(p1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(p1Var);
                    } else {
                        o1 o1Var = (o1) this.f.get(p1Var);
                        if (o1Var != null) {
                            o1Var.a.c(o1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final o2 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return o2.a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            p1Var.d = i10;
            i10 += p1Var.a.o.b.o();
        }
        return new e2(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (p1Var.c.isEmpty()) {
                o1 o1Var = (o1) this.f.get(p1Var);
                if (o1Var != null) {
                    o1Var.a.c(o1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(p1 p1Var) {
        if (p1Var.e && p1Var.c.isEmpty()) {
            o1 o1Var = (o1) this.f.remove(p1Var);
            o1Var.getClass();
            f7.b bVar = o1Var.c;
            o4.a aVar = o1Var.a;
            aVar.o(o1Var.b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.g.remove(p1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j3.j1, o4.w] */
    public final void e(p1 p1Var) {
        o4.q qVar = p1Var.a;
        ?? r12 = new o4.w() { // from class: j3.j1
            @Override // o4.w
            public final void a(o4.a aVar, o2 o2Var) {
                q1.this.e.n.d(22);
            }
        };
        f7.b bVar = new f7.b(this, p1Var, false, 17);
        this.f.put(p1Var, new o1(qVar, r12, bVar));
        int i10 = h5.d0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        qVar.getClass();
        b4.e0 e0Var = qVar.c;
        e0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e0Var.d;
        o4.y yVar = new o4.y();
        yVar.a = handler;
        yVar.b = bVar;
        copyOnWriteArrayList.add(yVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        o3.l lVar = qVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = lVar.c;
        o3.k kVar = new o3.k();
        kVar.a = handler2;
        kVar.b = bVar;
        copyOnWriteArrayList2.add(kVar);
        qVar.k(r12, this.l, this.a);
    }

    public final void f(o4.t tVar) {
        IdentityHashMap identityHashMap = this.c;
        p1 p1Var = (p1) identityHashMap.remove(tVar);
        p1Var.getClass();
        p1Var.a.n(tVar);
        p1Var.c.remove(((o4.n) tVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(p1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            p1 p1Var = (p1) arrayList.remove(i12);
            this.d.remove(p1Var.b);
            int i13 = -p1Var.a.o.b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((p1) arrayList.get(i14)).d += i13;
            }
            p1Var.e = true;
            if (this.k) {
                d(p1Var);
            }
        }
    }
}
