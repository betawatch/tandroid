package h3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s1 {
    public final i3.l a;
    public final q0 e;
    public final i3.f h;
    public final d5.c0 i;
    public boolean k;
    public com.google.android.exoplayer2.upstream.y0 l;
    public j4.g1 j = new j4.e1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public s1(q0 q0Var, i3.f fVar, d5.c0 c0Var, i3.l lVar) {
        this.a = lVar;
        this.e = q0Var;
        this.h = fVar;
        this.i = c0Var;
    }

    public final r2 a(int i9, ArrayList arrayList, j4.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.j = g1Var;
            for (int i10 = i9; i10 < arrayList.size() + i9; i10++) {
                r1 r1Var = (r1) arrayList.get(i10 - i9);
                ArrayList arrayList2 = this.b;
                if (i10 > 0) {
                    r1 r1Var2 = (r1) arrayList2.get(i10 - 1);
                    r1Var.d = r1Var2.a.o.b.o() + r1Var2.d;
                    r1Var.e = false;
                    r1Var.c.clear();
                } else {
                    r1Var.d = 0;
                    r1Var.e = false;
                    r1Var.c.clear();
                }
                int o6 = r1Var.a.o.b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((r1) arrayList2.get(i11)).d += o6;
                }
                arrayList2.add(i10, r1Var);
                this.d.put(r1Var.b, r1Var);
                if (this.k) {
                    e(r1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(r1Var);
                    } else {
                        q1 q1Var = (q1) this.f.get(r1Var);
                        if (q1Var != null) {
                            q1Var.a.c(q1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final r2 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return r2.a;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            r1Var.d = i9;
            i9 += r1Var.a.o.b.o();
        }
        return new f2(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.c.isEmpty()) {
                q1 q1Var = (q1) this.f.get(r1Var);
                if (q1Var != null) {
                    q1Var.a.c(q1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(r1 r1Var) {
        if (r1Var.e && r1Var.c.isEmpty()) {
            q1 q1Var = (q1) this.f.remove(r1Var);
            q1Var.getClass();
            g5.b bVar = q1Var.c;
            j4.a aVar = q1Var.a;
            aVar.o(q1Var.b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.g.remove(r1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [h3.m1, j4.e0] */
    public final void e(r1 r1Var) {
        j4.x xVar = r1Var.a;
        ?? r12 = new j4.e0() { // from class: h3.m1
            @Override // j4.e0
            public final void a(j4.a aVar, r2 r2Var) {
                s1.this.e.n.d(22);
            }
        };
        g5.b bVar = new g5.b(this, r1Var, false, 4);
        this.f.put(r1Var, new q1(xVar, r12, bVar));
        int i9 = d5.f0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        xVar.getClass();
        j4.h0 h0Var = xVar.c;
        h0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = h0Var.c;
        j4.g0 g0Var = new j4.g0();
        g0Var.a = handler;
        g0Var.b = bVar;
        copyOnWriteArrayList.add(g0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        a6.a aVar = xVar.d;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar.d;
        l3.f fVar = new l3.f();
        fVar.a = bVar;
        copyOnWriteArrayList2.add(fVar);
        xVar.k(r12, this.l, this.a);
    }

    public final void f(j4.a0 a0Var) {
        IdentityHashMap identityHashMap = this.c;
        r1 r1Var = (r1) identityHashMap.remove(a0Var);
        r1Var.getClass();
        r1Var.a.n(a0Var);
        r1Var.c.remove(((j4.u) a0Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(r1Var);
    }

    public final void g(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            ArrayList arrayList = this.b;
            r1 r1Var = (r1) arrayList.remove(i11);
            this.d.remove(r1Var.b);
            int i12 = -r1Var.a.o.b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((r1) arrayList.get(i13)).d += i12;
            }
            r1Var.e = true;
            if (this.k) {
                d(r1Var);
            }
        }
    }
}
