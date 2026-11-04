package c3;

import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tf.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ g0(tf.b bVar, int i3, long j10) {
        this.b = bVar;
        this.d = i3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.d;
        long j10 = this.c;
        tf.b bVar = this.b;
        switch (i3) {
            case 0:
                i0 i0Var = (i0) bVar.b;
                String str = n0.a;
                l2.f fVar = ((k2.c0) i0Var).a.s;
                l2.a S = fVar.S((w2.g0) fVar.d.e);
                fVar.V(S, 1018, new l2.c(S, i10, j10));
                break;
            default:
                i0 i0Var2 = (i0) bVar.b;
                String str2 = n0.a;
                l2.f fVar2 = ((k2.c0) i0Var2).a.s;
                l2.a S2 = fVar2.S((w2.g0) fVar2.d.e);
                fVar2.V(S2, 1021, new l2.c(S2, j10, i10));
                break;
        }
    }

    public /* synthetic */ g0(tf.b bVar, long j10, int i3) {
        this.b = bVar;
        this.c = j10;
        this.d = i3;
    }
}
