package j4;

import android.os.Handler;
import h3.s2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class j extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public com.google.android.exoplayer2.upstream.y0 j;

    @Override // j4.a
    public final void d() {
        for (i iVar : this.h.values()) {
            iVar.a.c(iVar.b);
        }
    }

    @Override // j4.a
    public final void f() {
        for (i iVar : this.h.values()) {
            iVar.a.e(iVar.b);
        }
    }

    @Override // j4.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).a.j();
        }
    }

    @Override // j4.a
    public void p() {
        HashMap hashMap = this.h;
        for (i iVar : hashMap.values()) {
            a aVar = iVar.a;
            com.google.firebase.messaging.t tVar = iVar.c;
            aVar.o(iVar.b);
            aVar.r(tVar);
            aVar.q(tVar);
        }
        hashMap.clear();
    }

    public abstract c0 s(Object obj, c0 c0Var);

    public abstract void v(Object obj, a aVar, s2 s2Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j4.d0, j4.h] */
    public final void w(final Object obj, a aVar) {
        HashMap hashMap = this.h;
        d5.a.f(!hashMap.containsKey(obj));
        ?? r12 = new d0() { // from class: j4.h
            @Override // j4.d0
            public final void a(a aVar2, s2 s2Var) {
                j.this.v(obj, aVar2, s2Var);
            }
        };
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(this, obj);
        hashMap.put(obj, new i(aVar, r12, tVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        g0 g0Var = aVar.c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.c;
        f0 f0Var = new f0();
        f0Var.a = handler;
        f0Var.b = tVar;
        copyOnWriteArrayList.add(f0Var);
        this.i.getClass();
        b6.a aVar2 = aVar.d;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar2.d;
        l3.g gVar = new l3.g();
        gVar.a = tVar;
        copyOnWriteArrayList2.add(gVar);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.j;
        i3.k kVar = this.g;
        d5.a.j(kVar);
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
