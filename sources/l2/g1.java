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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g1 {
    public final m2.i a;
    public final p0 e;
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

    public g1(p0 p0Var, m2.d dVar, h2.i0 i0Var, m2.i iVar) {
        this.a = iVar;
        this.e = p0Var;
        this.h = dVar;
        this.i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                f1 f1Var = (f1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.b;
                if (i10 > 0) {
                    f1 f1Var2 = (f1) arrayList2.get(i10 - 1);
                    f1Var.d = f1Var2.a.o.e.o() + f1Var2.d;
                    f1Var.e = false;
                    f1Var.c.clear();
                } else {
                    f1Var.d = 0;
                    f1Var.e = false;
                    f1Var.c.clear();
                }
                int o4 = f1Var.a.o.e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((f1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, f1Var);
                this.d.put(f1Var.b, f1Var);
                if (this.k) {
                    e(f1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(f1Var);
                    } else {
                        e1 e1Var = (e1) this.f.get(f1Var);
                        if (e1Var != null) {
                            e1Var.a.d(e1Var.b);
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
            f1 f1Var = (f1) arrayList.get(i10);
            f1Var.d = i7;
            i7 += f1Var.a.o.e.o();
        }
        return new m1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.c.isEmpty()) {
                e1 e1Var = (e1) this.f.get(f1Var);
                if (e1Var != null) {
                    e1Var.a.d(e1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(f1 f1Var) {
        if (f1Var.e && f1Var.c.isEmpty()) {
            e1 e1Var = (e1) this.f.remove(f1Var);
            e1Var.getClass();
            d1 d1Var = e1Var.c;
            x2.a aVar = e1Var.a;
            aVar.p(e1Var.b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.g.remove(f1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l2.z0, x2.h0] */
    public final void e(f1 f1Var) {
        x2.b0 b0Var = f1Var.a;
        ?? r12 = new x2.h0() { // from class: l2.z0
            @Override // x2.h0
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = g1.this.e.n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f.put(f1Var, new e1(b0Var, r12, d1Var));
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
        j0Var.b = d1Var;
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
        iVar.b = d1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        f1 f1Var = (f1) identityHashMap.remove(e0Var);
        f1Var.getClass();
        f1Var.a.o(e0Var);
        f1Var.c.remove(((x2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.b;
            f1 f1Var = (f1) arrayList.remove(i11);
            this.d.remove(f1Var.b);
            int i12 = -f1Var.a.o.e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((f1) arrayList.get(i13)).d += i12;
            }
            f1Var.e = true;
            if (this.k) {
                d(f1Var);
            }
        }
    }
}
