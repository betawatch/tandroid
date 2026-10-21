package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class i1 {
    public final j2.k a;
    public final r0 e;
    public final j2.f h;
    public final e2.i0 i;
    public boolean k;
    public g2.c0 l;
    public u2.j1 j = new u2.h1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public i1(r0 r0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.a = kVar;
        this.e = r0Var;
        this.h = fVar;
        this.i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.j1 j1Var) {
        if (!arrayList.isEmpty()) {
            this.j = j1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                h1 h1Var = (h1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    h1 h1Var2 = (h1) arrayList2.get(i11 - 1);
                    h1Var.d = h1Var2.a.o.e.o() + h1Var2.d;
                    h1Var.e = false;
                    h1Var.c.clear();
                } else {
                    h1Var.d = 0;
                    h1Var.e = false;
                    h1Var.c.clear();
                }
                int o10 = h1Var.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((h1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, h1Var);
                this.d.put(h1Var.b, h1Var);
                if (this.k) {
                    e(h1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(h1Var);
                    } else {
                        g1 g1Var = (g1) this.f.get(h1Var);
                        if (g1Var != null) {
                            g1Var.a.d(g1Var.b);
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
            h1 h1Var = (h1) arrayList.get(i11);
            h1Var.d = i10;
            i10 += h1Var.a.o.e.o();
        }
        return new o1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            if (h1Var.c.isEmpty()) {
                g1 g1Var = (g1) this.f.get(h1Var);
                if (g1Var != null) {
                    g1Var.a.d(g1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(h1 h1Var) {
        if (h1Var.e && h1Var.c.isEmpty()) {
            g1 g1Var = (g1) this.f.remove(h1Var);
            g1Var.getClass();
            f1 f1Var = g1Var.c;
            u2.a aVar = g1Var.a;
            aVar.p(g1Var.b);
            aVar.s(f1Var);
            aVar.r(f1Var);
            this.g.remove(h1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.b1, u2.h0] */
    public final void e(h1 h1Var) {
        u2.b0 b0Var = h1Var.a;
        ?? r12 = new u2.h0() { // from class: i2.b1
            @Override // u2.h0
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = i1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        f1 f1Var = new f1(this, h1Var);
        this.f.put(h1Var, new g1(b0Var, r12, f1Var));
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
        u2.k0 k0Var = new u2.k0();
        k0Var.a = handler;
        k0Var.b = f1Var;
        copyOnWriteArrayList.add(k0Var);
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
        jVar.b = f1Var;
        copyOnWriteArrayList2.add(jVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        h1 h1Var = (h1) identityHashMap.remove(e0Var);
        h1Var.getClass();
        h1Var.a.o(e0Var);
        h1Var.c.remove(((u2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(h1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            h1 h1Var = (h1) arrayList.remove(i12);
            this.d.remove(h1Var.b);
            int i13 = -h1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((h1) arrayList.get(i14)).d += i13;
            }
            h1Var.e = true;
            if (this.k) {
                d(h1Var);
            }
        }
    }
}
