package l2;

import a8.wa;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j1 {
    public final m2.j a;
    public final r0 e;
    public final m2.e h;
    public final h2.i0 i;
    public boolean k;
    public j2.d0 l;
    public x2.h1 j = new x2.f1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public j1(r0 r0Var, m2.e eVar, h2.i0 i0Var, m2.j jVar) {
        this.a = jVar;
        this.e = r0Var;
        this.h = eVar;
        this.i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.j = h1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                i1 i1Var = (i1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.b;
                if (i10 > 0) {
                    i1 i1Var2 = (i1) arrayList2.get(i10 - 1);
                    i1Var.d = i1Var2.a.o.e.o() + i1Var2.d;
                    i1Var.e = false;
                    i1Var.c.clear();
                } else {
                    i1Var.d = 0;
                    i1Var.e = false;
                    i1Var.c.clear();
                }
                int o4 = i1Var.a.o.e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((i1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, i1Var);
                this.d.put(i1Var.b, i1Var);
                if (this.k) {
                    e(i1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(i1Var);
                    } else {
                        h1 h1Var2 = (h1) this.f.get(i1Var);
                        if (h1Var2 != null) {
                            h1Var2.a.d(h1Var2.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return e2.l1.a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            i1Var.d = i7;
            i7 += i1Var.a.o.e.o();
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
            x2.a aVar = h1Var.a;
            aVar.p(h1Var.b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.g.remove(i1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l2.c1, x2.h0] */
    public final void e(i1 i1Var) {
        x2.b0 b0Var = i1Var.a;
        ?? r12 = new x2.h0() { // from class: l2.c1
            @Override // x2.h0
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = j1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f.put(i1Var, new h1(b0Var, r12, g1Var));
        String str = h2.m0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        wa waVar = b0Var.c;
        waVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) waVar.d;
        x2.j0 j0Var = new x2.j0();
        j0Var.a = handler;
        j0Var.b = g1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.c;
        q2.i iVar = new q2.i();
        iVar.a = handler2;
        iVar.b = g1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        i1 i1Var = (i1) identityHashMap.remove(e0Var);
        i1Var.getClass();
        i1Var.a.o(e0Var);
        i1Var.c.remove(((x2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.b;
            i1 i1Var = (i1) arrayList.remove(i11);
            this.d.remove(i1Var.b);
            int i12 = -i1Var.a.o.e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((i1) arrayList.get(i13)).d += i12;
            }
            i1Var.e = true;
            if (this.k) {
                d(i1Var);
            }
        }
    }
}
