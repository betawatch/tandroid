package hi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ o(db dbVar, int i7) {
        this.a = i7;
        this.b = dbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                db dbVar = this.b;
                dbVar.K0 = false;
                dbVar.L0 = TLObject.FLAG_31;
                dbVar.invalidate();
                dbVar.S0.setVisibility(0);
                dbVar.T0.setVisibility(0);
                break;
            default:
                nb nbVar = this.b.S1;
                bb bbVar = nbVar.Y0;
                if (bbVar != null) {
                    bbVar.P = false;
                    bbVar.c();
                    bb bbVar2 = nbVar.Y0;
                    bbVar2.m(0L);
                    xb xbVar = bbVar2.G;
                    if (xbVar != null) {
                        xbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
