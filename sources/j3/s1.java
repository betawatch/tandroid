package j3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s1 {
    public final k3.k a;
    public final q0 e;
    public final k3.f h;
    public final f5.a0 i;
    public boolean k;
    public com.google.android.exoplayer2.upstream.y0 l;
    public l4.h1 j = new l4.f1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public s1(q0 q0Var, k3.f fVar, f5.a0 a0Var, k3.k kVar) {
        this.a = kVar;
        this.e = q0Var;
        this.h = fVar;
        this.i = a0Var;
    }

    public final r2 a(int i10, ArrayList arrayList, l4.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.j = h1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                r1 r1Var = (r1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.b;
                if (i11 > 0) {
                    r1 r1Var2 = (r1) arrayList2.get(i11 - 1);
                    r1Var.d = r1Var2.a.o.b.o() + r1Var2.d;
                    r1Var.e = false;
                    r1Var.c.clear();
                } else {
                    r1Var.d = 0;
                    r1Var.e = false;
                    r1Var.c.clear();
                }
                int o10 = r1Var.a.o.b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((r1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, r1Var);
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
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r1 r1Var = (r1) arrayList.get(i11);
            r1Var.d = i10;
            i10 += r1Var.a.o.b.o();
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
            g9.l lVar = q1Var.c;
            l4.a aVar = q1Var.a;
            aVar.o(q1Var.b);
            aVar.r(lVar);
            aVar.q(lVar);
            this.g.remove(r1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j3.m1, l4.d0] */
    public final void e(r1 r1Var) {
        l4.w wVar = r1Var.a;
        ?? r12 = new l4.d0() { // from class: j3.m1
            @Override // l4.d0
            public final void a(l4.a aVar, r2 r2Var) {
                s1.this.e.n.d(22);
            }
        };
        g9.l lVar = new g9.l(10, this, r1Var);
        this.f.put(r1Var, new q1(wVar, r12, lVar));
        int i10 = f5.d0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        wVar.getClass();
        l4.g0 g0Var = wVar.c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.c;
        l4.f0 f0Var = new l4.f0();
        f0Var.a = handler;
        f0Var.b = lVar;
        copyOnWriteArrayList.add(f0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        ag.j2 j2Var = wVar.d;
        j2Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) j2Var.d;
        n3.f fVar = new n3.f();
        fVar.a = lVar;
        copyOnWriteArrayList2.add(fVar);
        wVar.k(r12, this.l, this.a);
    }

    public final void f(l4.z zVar) {
        IdentityHashMap identityHashMap = this.c;
        r1 r1Var = (r1) identityHashMap.remove(zVar);
        r1Var.getClass();
        r1Var.a.n(zVar);
        r1Var.c.remove(((l4.t) zVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(r1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.b;
            r1 r1Var = (r1) arrayList.remove(i12);
            this.d.remove(r1Var.b);
            int i13 = -r1Var.a.o.b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((r1) arrayList.get(i14)).d += i13;
            }
            r1Var.e = true;
            if (this.k) {
                d(r1Var);
            }
        }
    }
}
