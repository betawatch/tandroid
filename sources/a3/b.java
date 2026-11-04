package a3;

import g2.n0;
import g9.i0;
import k2.c0;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i3, long j10, long j11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = i3;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Object obj = this.e;
        switch (i3) {
            case 0:
                l2.f fVar = ((c) obj).b;
                l2.e eVar = fVar.d;
                l2.a S = fVar.S(((i0) eVar.b).isEmpty() ? null : (g0) g9.o.n((i0) eVar.b));
                fVar.V(S, 1006, new b4.o(S, this.b, this.c, this.d));
                break;
            default:
                m2.u uVar = (m2.u) ((m2.t) obj).c;
                String str = n0.a;
                l2.f fVar2 = ((c0) uVar).a.s;
                l2.a U = fVar2.U();
                fVar2.V(U, 1011, new l2.d(U, this.b, this.c, this.d));
                break;
        }
    }
}
