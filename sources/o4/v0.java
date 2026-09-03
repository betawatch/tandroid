package o4;

import android.os.Handler;
import j3.c1;
import j3.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            rf.f fVar2 = fVar.c;
            aVar.o(fVar.b);
            aVar.r(fVar2);
            aVar.q(fVar2);
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
        rf.f fVar = new rf.f(this, num);
        hashMap.put(num, new f(aVar, r12, fVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        b4.e0 e0Var = aVar.c;
        e0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e0Var.d;
        y yVar = new y();
        yVar.a = handler;
        yVar.b = fVar;
        copyOnWriteArrayList.add(yVar);
        Handler handler2 = this.i;
        handler2.getClass();
        o3.m mVar = aVar.d;
        mVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = mVar.c;
        o3.l lVar = new o3.l();
        lVar.a = handler2;
        lVar.b = fVar;
        copyOnWriteArrayList2.add(lVar);
        g5.v0 v0Var = this.j;
        k3.k kVar = this.g;
        h5.a.j(kVar);
        aVar.k(r12, v0Var, kVar);
        if (this.b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public void w() {
        v(null, this.k);
    }
}
