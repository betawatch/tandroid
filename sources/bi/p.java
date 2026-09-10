package bi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;

    public /* synthetic */ p(qd qdVar, int i10) {
        this.a = i10;
        this.b = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                qd qdVar = this.b;
                qdVar.K0 = false;
                qdVar.L0 = TLObject.FLAG_31;
                qdVar.invalidate();
                qdVar.S0.setVisibility(0);
                qdVar.T0.setVisibility(0);
                break;
            default:
                ce ceVar = this.b.S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.O = false;
                    ndVar.c();
                    nd ndVar2 = ceVar.X0;
                    ndVar2.m(0L);
                    me meVar = ndVar2.F;
                    if (meVar != null) {
                        meVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
