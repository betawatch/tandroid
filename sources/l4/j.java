package l4;

import ag.j2;
import android.os.Handler;
import j3.r2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public com.google.android.exoplayer2.upstream.y0 j;

    @Override // l4.a
    public final void d() {
        for (i iVar : this.h.values()) {
            iVar.a.c(iVar.b);
        }
    }

    @Override // l4.a
    public final void f() {
        for (i iVar : this.h.values()) {
            iVar.a.e(iVar.b);
        }
    }

    @Override // l4.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).a.j();
        }
    }

    @Override // l4.a
    public void p() {
        HashMap hashMap = this.h;
        for (i iVar : hashMap.values()) {
            a aVar = iVar.a;
            com.google.firebase.messaging.s sVar = iVar.c;
            aVar.o(iVar.b);
            aVar.r(sVar);
            aVar.q(sVar);
        }
        hashMap.clear();
    }

    public abstract c0 s(Object obj, c0 c0Var);

    public abstract void v(Object obj, a aVar, r2 r2Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l4.d0, l4.h] */
    public final void w(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        f5.a.f(!hashMap.containsKey(num));
        ?? r12 = new d0() { // from class: l4.h
            @Override // l4.d0
            public final void a(a aVar2, r2 r2Var) {
                j.this.v(num, aVar2, r2Var);
            }
        };
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, num);
        hashMap.put(num, new i(aVar, r12, sVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        g0 g0Var = aVar.c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.c;
        f0 f0Var = new f0();
        f0Var.a = handler;
        f0Var.b = sVar;
        copyOnWriteArrayList.add(f0Var);
        this.i.getClass();
        j2 j2Var = aVar.d;
        j2Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) j2Var.d;
        n3.f fVar = new n3.f();
        fVar.a = sVar;
        copyOnWriteArrayList2.add(fVar);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.j;
        k3.k kVar = this.g;
        f5.a.j(kVar);
        aVar.k(r12, y0Var, kVar);
        if (this.b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public long t(Object obj, long j10) {
        return j10;
    }

    public int u(int i10, Object obj) {
        return i10;
    }
}
