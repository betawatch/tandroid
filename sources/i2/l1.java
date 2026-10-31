package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l1 {
    public final j2.l a;
    public final s0 e;
    public final j2.g h;
    public final e2.i0 i;
    public boolean k;
    public g2.d0 l;
    public u2.i1 j = new u2.g1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public l1(s0 s0Var, j2.g gVar, e2.i0 i0Var, j2.l lVar) {
        this.a = lVar;
        this.e = s0Var;
        this.h = gVar;
        this.i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                k1 k1Var = (k1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    k1 k1Var2 = (k1) arrayList2.get(i11 - 1);
                    k1Var.d = k1Var2.a.o.e.o() + k1Var2.d;
                    k1Var.e = false;
                    k1Var.c.clear();
                } else {
                    k1Var.d = 0;
                    k1Var.e = false;
                    k1Var.c.clear();
                }
                int o10 = k1Var.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((k1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, k1Var);
                this.d.put(k1Var.b, k1Var);
                if (this.k) {
                    e(k1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(k1Var);
                    } else {
                        j1 j1Var = (j1) this.f.get(k1Var);
                        if (j1Var != null) {
                            j1Var.a.d(j1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return b2.o1.a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k1 k1Var = (k1) arrayList.get(i11);
            k1Var.d = i10;
            i10 += k1Var.a.o.e.o();
        }
        return new r1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            if (k1Var.c.isEmpty()) {
                j1 j1Var = (j1) this.f.get(k1Var);
                if (j1Var != null) {
                    j1Var.a.d(j1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(k1 k1Var) {
        if (k1Var.e && k1Var.c.isEmpty()) {
            j1 j1Var = (j1) this.f.remove(k1Var);
            j1Var.getClass();
            i1 i1Var = j1Var.c;
            u2.a aVar = j1Var.a;
            aVar.p(j1Var.b);
            aVar.s(i1Var);
            aVar.r(i1Var);
            this.g.remove(k1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.c1, u2.h0] */
    public final void e(k1 k1Var) {
        u2.b0 b0Var = k1Var.a;
        ?? r12 = new u2.h0() { // from class: i2.c1
            @Override // u2.h0
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = l1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        i1 i1Var = new i1(this, k1Var);
        this.f.put(k1Var, new j1(b0Var, r12, i1Var));
        String str = e2.l0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.c;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar.d;
        u2.j0 j0Var = new u2.j0();
        j0Var.a = handler;
        j0Var.b = i1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.c;
        n2.i iVar = new n2.i();
        iVar.a = handler2;
        iVar.b = i1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        k1 k1Var = (k1) identityHashMap.remove(e0Var);
        k1Var.getClass();
        k1Var.a.o(e0Var);
        k1Var.c.remove(((u2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(k1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            k1 k1Var = (k1) arrayList.remove(i12);
            this.d.remove(k1Var.b);
            int i13 = -k1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((k1) arrayList.get(i14)).d += i13;
            }
            k1Var.e = true;
            if (this.k) {
                d(k1Var);
            }
        }
    }
}
