package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class j1 {
    public final j2.k a;
    public final r0 e;
    public final j2.f h;
    public final e2.i0 i;
    public boolean k;
    public g2.c0 l;
    public u2.i1 j = new u2.g1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public j1(r0 r0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.a = kVar;
        this.e = r0Var;
        this.h = fVar;
        this.i = i0Var;
    }

    public final b2.p1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                i1 i1Var2 = (i1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    i1 i1Var3 = (i1) arrayList2.get(i11 - 1);
                    i1Var2.d = i1Var3.a.o.e.o() + i1Var3.d;
                    i1Var2.e = false;
                    i1Var2.c.clear();
                } else {
                    i1Var2.d = 0;
                    i1Var2.e = false;
                    i1Var2.c.clear();
                }
                int o10 = i1Var2.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((i1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, i1Var2);
                this.d.put(i1Var2.b, i1Var2);
                if (this.k) {
                    e(i1Var2);
                    if (this.c.isEmpty()) {
                        this.g.add(i1Var2);
                    } else {
                        h1 h1Var = (h1) this.f.get(i1Var2);
                        if (h1Var != null) {
                            h1Var.a.d(h1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.p1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return b2.p1.a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i1 i1Var = (i1) arrayList.get(i11);
            i1Var.d = i10;
            i10 += i1Var.a.o.e.o();
        }
        return new p1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var.c.isEmpty()) {
                h1 h1Var = (h1) this.f.get(i1Var);
                if (h1Var != null) {
                    h1Var.a.d(h1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(i1 i1Var) {
        if (i1Var.e && i1Var.c.isEmpty()) {
            h1 h1Var = (h1) this.f.remove(i1Var);
            h1Var.getClass();
            g1 g1Var = h1Var.c;
            u2.a aVar = h1Var.a;
            aVar.p(h1Var.b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.g.remove(i1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.b1, u2.h0] */
    public final void e(i1 i1Var) {
        u2.b0 b0Var = i1Var.a;
        ?? r12 = new u2.h0() { // from class: i2.b1
            @Override // u2.h0
            public final void a(u2.a aVar, b2.p1 p1Var) {
                e2.i0 i0Var = j1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f.put(i1Var, new h1(b0Var, r12, g1Var));
        String str = e2.m0.a;
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
        j0Var.b = g1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = b0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.c;
        n2.j jVar = new n2.j();
        jVar.a = handler2;
        jVar.b = g1Var;
        copyOnWriteArrayList2.add(jVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        i1 i1Var = (i1) identityHashMap.remove(e0Var);
        i1Var.getClass();
        i1Var.a.o(e0Var);
        i1Var.c.remove(((u2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            i1 i1Var = (i1) arrayList.remove(i12);
            this.d.remove(i1Var.b);
            int i13 = -i1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((i1) arrayList.get(i14)).d += i13;
            }
            i1Var.e = true;
            if (this.k) {
                d(i1Var);
            }
        }
    }
}
