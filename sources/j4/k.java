package j4;

import android.os.Handler;
import h3.r2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public com.google.android.exoplayer2.upstream.y0 j;

    @Override // j4.a
    public final void d() {
        for (j jVar : this.h.values()) {
            jVar.a.c(jVar.b);
        }
    }

    @Override // j4.a
    public final void f() {
        for (j jVar : this.h.values()) {
            jVar.a.e(jVar.b);
        }
    }

    @Override // j4.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).a.j();
        }
    }

    @Override // j4.a
    public void p() {
        HashMap hashMap = this.h;
        for (j jVar : hashMap.values()) {
            a aVar = jVar.a;
            com.google.firebase.messaging.t tVar = jVar.c;
            aVar.o(jVar.b);
            aVar.r(tVar);
            aVar.q(tVar);
        }
        hashMap.clear();
    }

    public abstract d0 s(Object obj, d0 d0Var);

    public abstract void v(Object obj, a aVar, r2 r2Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j4.e0, j4.i] */
    public final void w(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        d5.a.f(!hashMap.containsKey(num));
        ?? r12 = new e0() { // from class: j4.i
            @Override // j4.e0
            public final void a(a aVar2, r2 r2Var) {
                k.this.v(num, aVar2, r2Var);
            }
        };
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(this, num);
        hashMap.put(num, new j(aVar, r12, tVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        h0 h0Var = aVar.c;
        h0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = h0Var.c;
        g0 g0Var = new g0();
        g0Var.a = handler;
        g0Var.b = tVar;
        copyOnWriteArrayList.add(g0Var);
        this.i.getClass();
        a6.a aVar2 = aVar.d;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar2.d;
        l3.f fVar = new l3.f();
        fVar.a = tVar;
        copyOnWriteArrayList2.add(fVar);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.j;
        i3.l lVar = this.g;
        d5.a.j(lVar);
        aVar.k(r12, y0Var, lVar);
        if (this.b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public long t(Object obj, long j10) {
        return j10;
    }

    public int u(int i9, Object obj) {
        return i9;
    }
}
