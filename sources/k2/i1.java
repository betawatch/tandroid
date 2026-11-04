package k2;

import android.os.Handler;
import android.os.Looper;
import b8.kg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i1 {
    public final l2.k a;
    public final r0 e;
    public final l2.f h;
    public final g2.j0 i;
    public boolean k;
    public i2.d0 l;
    public w2.i1 j = new w2.g1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public i1(r0 r0Var, l2.f fVar, g2.j0 j0Var, l2.k kVar) {
        this.a = kVar;
        this.e = r0Var;
        this.h = fVar;
        this.i = j0Var;
    }

    public final d2.n1 a(int i3, ArrayList arrayList, w2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i10 = i3; i10 < arrayList.size() + i3; i10++) {
                h1 h1Var = (h1) arrayList.get(i10 - i3);
                ArrayList arrayList2 = this.b;
                if (i10 > 0) {
                    h1 h1Var2 = (h1) arrayList2.get(i10 - 1);
                    h1Var.d = h1Var2.a.o.e.o() + h1Var2.d;
                    h1Var.e = false;
                    h1Var.c.clear();
                } else {
                    h1Var.d = 0;
                    h1Var.e = false;
                    h1Var.c.clear();
                }
                int o10 = h1Var.a.o.e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((h1) arrayList2.get(i11)).d += o10;
                }
                arrayList2.add(i10, h1Var);
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

    public final d2.n1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return d2.n1.a;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            h1Var.d = i3;
            i3 += h1Var.a.o.e.o();
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
            w2.a aVar = g1Var.a;
            aVar.p(g1Var.b);
            aVar.s(f1Var);
            aVar.r(f1Var);
            this.g.remove(h1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [k2.b1, w2.h0] */
    public final void e(h1 h1Var) {
        w2.b0 b0Var = h1Var.a;
        ?? r12 = new w2.h0() { // from class: k2.b1
            @Override // w2.h0
            public final void a(w2.a aVar, d2.n1 n1Var) {
                g2.j0 j0Var = i1.this.e.n;
                j0Var.e(2);
                j0Var.f(22);
            }
        };
        f1 f1Var = new f1(this, h1Var);
        this.f.put(h1Var, new g1(b0Var, r12, f1Var));
        String str = g2.n0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        kg kgVar = b0Var.c;
        kgVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) kgVar.d;
        w2.j0 j0Var = new w2.j0();
        j0Var.a = handler;
        j0Var.b = f1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        p2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.c;
        p2.i iVar = new p2.i();
        iVar.a = handler2;
        iVar.b = f1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(w2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        h1 h1Var = (h1) identityHashMap.remove(e0Var);
        h1Var.getClass();
        h1Var.a.o(e0Var);
        h1Var.c.remove(((w2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(h1Var);
    }

    public final void g(int i3, int i10) {
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            ArrayList arrayList = this.b;
            h1 h1Var = (h1) arrayList.remove(i11);
            this.d.remove(h1Var.b);
            int i12 = -h1Var.a.o.e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((h1) arrayList.get(i13)).d += i12;
            }
            h1Var.e = true;
            if (this.k) {
                d(h1Var);
            }
        }
    }
}
