package g5;

import f5.d0;
import j3.h0;
import jh.d3;
import l4.c0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ze.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ u(ze.b bVar, int i10, long j10) {
        this.b = bVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j10 = this.c;
        ze.b bVar = this.b;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) bVar.b;
                int i12 = d0.a;
                k3.f fVar = h0Var.a.r;
                k3.a i13 = fVar.i((c0) fVar.d.e);
                fVar.l(i13, 1018, new d3(i11, j10, i13));
                break;
            default:
                h0 h0Var2 = (h0) bVar.b;
                int i14 = d0.a;
                k3.f fVar2 = h0Var2.a.r;
                k3.a i15 = fVar2.i((c0) fVar2.d.e);
                fVar2.l(i15, 1021, new k3.d(i11, j10, i15));
                break;
        }
    }

    public /* synthetic */ u(ze.b bVar, long j10, int i10) {
        this.b = bVar;
        this.c = j10;
        this.d = i10;
    }
}
