package l2;

import a8.xa;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f1 {
    public final m2.i a;
    public final o0 e;
    public final m2.d h;
    public final h2.i0 i;
    public boolean k;
    public j2.c0 l;
    public x2.i1 j = new x2.g1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public f1(o0 o0Var, m2.d dVar, h2.i0 i0Var, m2.i iVar) {
        this.a = iVar;
        this.e = o0Var;
        this.h = dVar;
        this.i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                e1 e1Var = (e1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.b;
                if (i10 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i10 - 1);
                    e1Var.d = e1Var2.a.o.e.o() + e1Var2.d;
                    e1Var.e = false;
                    e1Var.c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.e = false;
                    e1Var.c.clear();
                }
                int o4 = e1Var.a.o.e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((e1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, e1Var);
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

    public final e2.l1 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return e2.l1.a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            e1Var.d = i7;
            i7 += e1Var.a.o.e.o();
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
            x2.a aVar = d1Var.a;
            aVar.p(d1Var.b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.g.remove(e1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l2.y0, x2.h0] */
    public final void e(e1 e1Var) {
        x2.b0 b0Var = e1Var.a;
        ?? r12 = new x2.h0() { // from class: l2.y0
            @Override // x2.h0
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = f1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f.put(e1Var, new d1(b0Var, r12, c1Var));
        String str = h2.l0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        xa xaVar = b0Var.c;
        xaVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) xaVar.d;
        x2.j0 j0Var = new x2.j0();
        j0Var.a = handler;
        j0Var.b = c1Var;
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
        iVar.b = c1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        e1 e1Var = (e1) identityHashMap.remove(e0Var);
        e1Var.getClass();
        e1Var.a.o(e0Var);
        e1Var.c.remove(((x2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.b;
            e1 e1Var = (e1) arrayList.remove(i11);
            this.d.remove(e1Var.b);
            int i12 = -e1Var.a.o.e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((e1) arrayList.get(i13)).d += i12;
            }
            e1Var.e = true;
            if (this.k) {
                d(e1Var);
            }
        }
    }
}
