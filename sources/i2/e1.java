package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e1 {
    public final j2.k a;
    public final n0 e;
    public final j2.e h;
    public final e2.z i;
    public boolean k;
    public g2.c0 l;
    public u2.i1 j = new u2.g1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public e1(n0 n0Var, j2.e eVar, e2.z zVar, j2.k kVar) {
        this.a = kVar;
        this.e = n0Var;
        this.h = eVar;
        this.i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                d1 d1Var = (d1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    d1 d1Var2 = (d1) arrayList2.get(i11 - 1);
                    d1Var.d = d1Var2.a.o.e.o() + d1Var2.d;
                    d1Var.e = false;
                    d1Var.c.clear();
                } else {
                    d1Var.d = 0;
                    d1Var.e = false;
                    d1Var.c.clear();
                }
                int o9 = d1Var.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((d1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, d1Var);
                this.d.put(d1Var.b, d1Var);
                if (this.k) {
                    e(d1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(d1Var);
                    } else {
                        c1 c1Var = (c1) this.f.get(d1Var);
                        if (c1Var != null) {
                            c1Var.a.d(c1Var.b);
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
            d1 d1Var = (d1) arrayList.get(i11);
            d1Var.d = i10;
            i10 += d1Var.a.o.e.o();
        }
        return new k1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            if (d1Var.c.isEmpty()) {
                c1 c1Var = (c1) this.f.get(d1Var);
                if (c1Var != null) {
                    c1Var.a.d(c1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(d1 d1Var) {
        if (d1Var.e && d1Var.c.isEmpty()) {
            c1 c1Var = (c1) this.f.remove(d1Var);
            c1Var.getClass();
            b1 b1Var = c1Var.c;
            u2.a aVar = c1Var.a;
            aVar.p(c1Var.b);
            aVar.s(b1Var);
            aVar.r(b1Var);
            this.g.remove(d1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.w0, u2.h0] */
    public final void e(d1 d1Var) {
        u2.b0 b0Var = d1Var.a;
        ?? r12 = new u2.h0() { // from class: i2.w0
            @Override // u2.h0
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = e1.this.e.n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        b1 b1Var = new b1(this, d1Var);
        this.f.put(d1Var, new c1(b0Var, r12, b1Var));
        String str = e2.d0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.c;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar.d;
        u2.l0 l0Var = new u2.l0();
        l0Var.a = handler;
        l0Var.b = b1Var;
        copyOnWriteArrayList.add(l0Var);
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
        iVar.b = b1Var;
        copyOnWriteArrayList2.add(iVar);
        b0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.c;
        d1 d1Var = (d1) identityHashMap.remove(e0Var);
        d1Var.getClass();
        d1Var.a.o(e0Var);
        d1Var.c.remove(((u2.y) e0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(d1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            d1 d1Var = (d1) arrayList.remove(i12);
            this.d.remove(d1Var.b);
            int i13 = -d1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((d1) arrayList.get(i14)).d += i13;
            }
            d1Var.e = true;
            if (this.k) {
                d(d1Var);
            }
        }
    }
}
