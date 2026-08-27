package h3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s1 {
    public final i3.k a;
    public final q0 e;
    public final i3.f h;
    public final d5.d0 i;
    public boolean k;
    public com.google.android.exoplayer2.upstream.y0 l;
    public j4.g1 j = new j4.e1();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public s1(q0 q0Var, i3.f fVar, d5.d0 d0Var, i3.k kVar) {
        this.a = kVar;
        this.e = q0Var;
        this.h = fVar;
        this.i = d0Var;
    }

    public final s2 a(int i10, ArrayList arrayList, j4.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.j = g1Var;
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

    public final s2 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return s2.a;
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
            g5.b bVar = q1Var.c;
            j4.a aVar = q1Var.a;
            aVar.o(q1Var.b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.g.remove(r1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [h3.m1, j4.d0] */
    public final void e(r1 r1Var) {
        j4.w wVar = r1Var.a;
        ?? r12 = new j4.d0() { // from class: h3.m1
            @Override // j4.d0
            public final void a(j4.a aVar, s2 s2Var) {
                s1.this.e.n.d(22);
            }
        };
        g5.b bVar = new g5.b(this, r1Var, false, 3);
        this.f.put(r1Var, new q1(wVar, r12, bVar));
        int i10 = d5.g0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        wVar.getClass();
        j4.g0 g0Var = wVar.c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.c;
        j4.f0 f0Var = new j4.f0();
        f0Var.a = handler;
        f0Var.b = bVar;
        copyOnWriteArrayList.add(f0Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        b6.a aVar = wVar.d;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar.d;
        l3.g gVar = new l3.g();
        gVar.a = bVar;
        copyOnWriteArrayList2.add(gVar);
        wVar.k(r12, this.l, this.a);
    }

    public final void f(j4.z zVar) {
        IdentityHashMap identityHashMap = this.c;
        r1 r1Var = (r1) identityHashMap.remove(zVar);
        r1Var.getClass();
        r1Var.a.n(zVar);
        r1Var.c.remove(((j4.t) zVar).a);
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
