package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f1 {
    public final j2.k a;
    public final o0 e;
    public final j2.f h;
    public final e2.z i;
    public boolean k;
    public g2.c0 l;
    public u2.g1 j = new u2.e1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public f1(o0 o0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.a = kVar;
        this.e = o0Var;
        this.h = fVar;
        this.i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.j = g1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                e1 e1Var = (e1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i11 - 1);
                    e1Var.d = e1Var2.a.o.e.o() + e1Var2.d;
                    e1Var.e = false;
                    e1Var.c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.e = false;
                    e1Var.c.clear();
                }
                int o9 = e1Var.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((e1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, e1Var);
                this.d.put(e1Var.b, e1Var);
                if (this.k) {
                    e(e1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.a.d(d1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return b2.k1.a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            e1Var.d = i10;
            i10 += e1Var.a.o.e.o();
        }
        return new l1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.c.isEmpty()) {
                d1 d1Var = (d1) this.f.get(e1Var);
                if (d1Var != null) {
                    d1Var.a.d(d1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.e && e1Var.c.isEmpty()) {
            d1 d1Var = (d1) this.f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.c;
            u2.a aVar = d1Var.a;
            aVar.p(d1Var.b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.g.remove(e1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.x0, u2.g0] */
    public final void e(e1 e1Var) {
        u2.a0 a0Var = e1Var.a;
        ?? r12 = new u2.g0() { // from class: i2.x0
            @Override // u2.g0
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = f1.this.e.n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f.put(e1Var, new d1(a0Var, r12, c1Var));
        String str = e2.d0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.c;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar.d;
        u2.j0 j0Var = new u2.j0();
        j0Var.a = handler;
        j0Var.b = c1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.c;
        n2.i iVar = new n2.i();
        iVar.a = handler2;
        iVar.b = c1Var;
        copyOnWriteArrayList2.add(iVar);
        a0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.c;
        e1 e1Var = (e1) identityHashMap.remove(d0Var);
        e1Var.getClass();
        e1Var.a.o(d0Var);
        e1Var.c.remove(((u2.x) d0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            e1 e1Var = (e1) arrayList.remove(i12);
            this.d.remove(e1Var.b);
            int i13 = -e1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((e1) arrayList.get(i14)).d += i13;
            }
            e1Var.e = true;
            if (this.k) {
                d(e1Var);
            }
        }
    }
}
