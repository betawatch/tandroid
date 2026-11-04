package c3;

import ei.y8;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf.b b;
    public final /* synthetic */ k2.d c;

    public /* synthetic */ h0(tf.b bVar, k2.d dVar, int i3) {
        this.a = i3;
        this.b = bVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tf.b bVar = this.b;
                k2.d dVar = this.c;
                i0 i0Var = (i0) bVar.b;
                String str = n0.a;
                l2.f fVar = ((k2.c0) i0Var).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1015, new l2.c(U, dVar, 24));
                break;
            default:
                tf.b bVar2 = this.b;
                k2.d dVar2 = this.c;
                synchronized (dVar2) {
                }
                i0 i0Var2 = (i0) bVar2.b;
                String str2 = n0.a;
                k2.i0 i0Var3 = ((k2.c0) i0Var2).a;
                l2.f fVar2 = i0Var3.s;
                l2.a S = fVar2.S((w2.g0) fVar2.d.e);
                fVar2.V(S, 1020, new y8(S, dVar2, 26));
                i0Var3.S = null;
                break;
        }
    }
}
