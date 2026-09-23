package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class g1 {
    public final j2.k a;
    public final p0 e;
    public final j2.f h;
    public final e2.z i;
    public boolean k;
    public g2.c0 l;
    public u2.f1 j = new u2.d1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public g1(p0 p0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.a = kVar;
        this.e = p0Var;
        this.h = fVar;
        this.i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.f1 f1Var) {
        if (!arrayList.isEmpty()) {
            this.j = f1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                f1 f1Var2 = (f1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    f1 f1Var3 = (f1) arrayList2.get(i11 - 1);
                    f1Var2.d = f1Var3.a.o.e.o() + f1Var3.d;
                    f1Var2.e = false;
                    f1Var2.c.clear();
                } else {
                    f1Var2.d = 0;
                    f1Var2.e = false;
                    f1Var2.c.clear();
                }
                int o9 = f1Var2.a.o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((f1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, f1Var2);
                this.d.put(f1Var2.b, f1Var2);
                if (this.k) {
                    e(f1Var2);
                    if (this.c.isEmpty()) {
                        this.g.add(f1Var2);
                    } else {
                        e1 e1Var = (e1) this.f.get(f1Var2);
                        if (e1Var != null) {
                            e1Var.a.d(e1Var.b);
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
            f1 f1Var = (f1) arrayList.get(i11);
            f1Var.d = i10;
            i10 += f1Var.a.o.e.o();
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
            u2.a aVar = e1Var.a;
            aVar.p(e1Var.b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.g.remove(f1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.y0, u2.g0] */
    public final void e(f1 f1Var) {
        u2.a0 a0Var = f1Var.a;
        ?? r12 = new u2.g0() { // from class: i2.y0
            @Override // u2.g0
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = g1.this.e.n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f.put(f1Var, new e1(a0Var, r12, d1Var));
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
        u2.i0 i0Var = new u2.i0();
        i0Var.a = handler;
        i0Var.b = d1Var;
        copyOnWriteArrayList.add(i0Var);
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
        iVar.b = d1Var;
        copyOnWriteArrayList2.add(iVar);
        a0Var.l(r12, this.l, this.a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.c;
        f1 f1Var = (f1) identityHashMap.remove(d0Var);
        f1Var.getClass();
        f1Var.a.o(d0Var);
        f1Var.c.remove(((u2.x) d0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            f1 f1Var = (f1) arrayList.remove(i12);
            this.d.remove(f1Var.b);
            int i13 = -f1Var.a.o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((f1) arrayList.get(i14)).d += i13;
            }
            f1Var.e = true;
            if (this.k) {
                d(f1Var);
            }
        }
    }
}
