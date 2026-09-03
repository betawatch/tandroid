package i5;

import h5.d0;
import j3.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ u(f7.b bVar, int i10, long j10) {
        this.b = bVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j10 = this.c;
        f7.b bVar = this.b;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) bVar.c;
                int i12 = d0.a;
                k3.f fVar = c0Var.a.q;
                k3.a n10 = fVar.n((o4.v) fVar.d.e);
                fVar.q(n10, 1018, new k3.c(n10, i11, j10));
                break;
            default:
                c0 c0Var2 = (c0) bVar.c;
                int i13 = d0.a;
                k3.f fVar2 = c0Var2.a.q;
                k3.a n11 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n11, 1021, new k3.c(n11, j10, i11));
                break;
        }
    }

    public /* synthetic */ u(f7.b bVar, long j10, int i10) {
        this.b = bVar;
        this.c = j10;
        this.d = i10;
    }
}
