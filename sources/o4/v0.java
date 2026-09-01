package o4;

import android.os.Handler;
import j3.c1;
import j3.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class v0 extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public g5.v0 j;
    public final a k;

    public v0(a aVar) {
        this.k = aVar;
    }

    @Override // o4.a
    public final void d() {
        for (f fVar : this.h.values()) {
            fVar.a.c(fVar.b);
        }
    }

    @Override // o4.a
    public final void f() {
        for (f fVar : this.h.values()) {
            fVar.a.e(fVar.b);
        }
    }

    @Override // o4.a
    public o2 g() {
        return this.k.g();
    }

    @Override // o4.a
    public final c1 h() {
        return this.k.h();
    }

    @Override // o4.a
    public boolean i() {
        return this.k.i();
    }

    @Override // o4.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).a.j();
        }
    }

    @Override // o4.a
    public final void l(g5.v0 v0Var) {
        this.j = v0Var;
        this.i = h5.d0.l(null);
        w();
    }

    @Override // o4.a
    public void p() {
        HashMap hashMap = this.h;
        for (f fVar : hashMap.values()) {
            a aVar = fVar.a;
            sf.e eVar = fVar.c;
            aVar.o(fVar.b);
            aVar.r(eVar);
            aVar.q(eVar);
        }
        hashMap.clear();
    }

    public abstract v s(v vVar);

    public final long t(Object obj, long j10) {
        return j10;
    }

    public abstract void u(o2 o2Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o4.e, o4.w] */
    public final void v(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        h5.a.f(!hashMap.containsKey(num));
        ?? r12 = new w() { // from class: o4.e
            @Override // o4.w
            public final void a(a aVar2, o2 o2Var) {
                v0 v0Var = v0.this;
                v0Var.getClass();
                v0Var.u(o2Var);
            }
        };
        sf.e eVar = new sf.e(this, num);
        hashMap.put(num, new f(aVar, r12, eVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        b4.e0 e0Var = aVar.c;
        e0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e0Var.d;
        y yVar = new y();
        yVar.a = handler;
        yVar.b = eVar;
        copyOnWriteArrayList.add(yVar);
        Handler handler2 = this.i;
        handler2.getClass();
        o3.l lVar = aVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = lVar.c;
        o3.k kVar = new o3.k();
        kVar.a = handler2;
        kVar.b = eVar;
        copyOnWriteArrayList2.add(kVar);
        g5.v0 v0Var = this.j;
        k3.k kVar2 = this.g;
        h5.a.j(kVar2);
        aVar.k(r12, v0Var, kVar2);
        if (this.b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public void w() {
        v(null, this.k);
    }
}
