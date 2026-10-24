package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h1 {
    public final j2.j a;
    public final q0 e;
    public final j2.e h;
    public final e2.i0 i;
    public boolean k;
    public g2.c0 l;
    public u2.k1 j = new u2.i1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public h1(q0 q0Var, j2.e eVar, e2.i0 i0Var, j2.j jVar) {
        this.a = jVar;
        this.e = q0Var;
        this.h = eVar;
        this.i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.k1 k1Var) {
        if (!arrayList.isEmpty()) {
            this.j = k1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                g1 g1Var = (g1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    g1 g1Var2 = (g1) arrayList2.get(i11 - 1);
                    g1Var.d = g1Var2.a.o.e.o() + g1Var2.d;
                    g1Var.e = false;
                    g1Var.c.clear();
                } else {
                    g1Var.d = 0;
                    g1Var.e = false;
                    g1Var.c.clear();
                }
                int o10 = g1Var.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((g1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, g1Var);
                this.d.put(g1Var.b, g1Var);
                if (this.k) {
                    e(g1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(g1Var);
                    } else {
                        f1 f1Var = (f1) this.f.get(g1Var);
                        if (f1Var != null) {
                            f1Var.a.d(f1Var.b);
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
            g1 g1Var = (g1) arrayList.get(i11);
            g1Var.d = i10;
            i10 += g1Var.a.o.e.o();
        }
        return new n1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.c.isEmpty()) {
                f1 f1Var = (f1) this.f.get(g1Var);
                if (f1Var != null) {
                    f1Var.a.d(f1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(g1 g1Var) {
        if (g1Var.e && g1Var.c.isEmpty()) {
            f1 f1Var = (f1) this.f.remove(g1Var);
            f1Var.getClass();
            e1 e1Var = f1Var.c;
            u2.a aVar = f1Var.a;
            aVar.p(f1Var.b);
            aVar.s(e1Var);
            aVar.r(e1Var);
            this.g.remove(g1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.a1, u2.i0] */
    public final void e(g1 g1Var) {
        u2.c0 c0Var = g1Var.a;
        ?? r12 = new u2.i0() { // from class: i2.a1
            @Override // u2.i0
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = h1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        e1 e1Var = new e1(this, g1Var);
        this.f.put(g1Var, new f1(c0Var, r12, e1Var));
        String str = e2.m0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0Var.getClass();
        a5.a aVar = c0Var.c;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar.d;
        u2.l0 l0Var = new u2.l0();
        l0Var.a = handler;
        l0Var.b = e1Var;
        copyOnWriteArrayList.add(l0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = c0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.c;
        n2.j jVar = new n2.j();
        jVar.a = handler2;
        jVar.b = e1Var;
        copyOnWriteArrayList2.add(jVar);
        c0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.f0 f0Var) {
        IdentityHashMap identityHashMap = this.c;
        g1 g1Var = (g1) identityHashMap.remove(f0Var);
        g1Var.getClass();
        g1Var.a.o(f0Var);
        g1Var.c.remove(((u2.z) f0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(g1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            g1 g1Var = (g1) arrayList.remove(i12);
            this.d.remove(g1Var.b);
            int i13 = -g1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((g1) arrayList.get(i14)).d += i13;
            }
            g1Var.e = true;
            if (this.k) {
                d(g1Var);
            }
        }
    }
}
