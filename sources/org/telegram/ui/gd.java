package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd b;

    public /* synthetic */ gd(pd pdVar, int i10) {
        this.a = i10;
        this.b = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pd pdVar = this.b;
                pdVar.g0 = true;
                pdVar.h0();
                break;
            case 1:
                pd pdVar2 = this.b;
                pdVar2.x = null;
                pdVar2.y = null;
                pdVar2.i0 = null;
                pdVar2.j0 = null;
                pdVar2.l0 = null;
                pdVar2.k0 = null;
                pdVar2.m0 = 0.0d;
                pdVar2.e0(false, true);
                pdVar2.e.h(null, null, pdVar2.s, null);
                pdVar2.h.setAnimation(pdVar2.G);
                pdVar2.G.K(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                pd pdVar3 = this.b;
                pdVar3.g0 = true;
                if (pdVar3.w.length() > 0) {
                    pdVar3.d0(pdVar3.w.getText().toString());
                }
                pdVar3.h0();
                break;
        }
    }
}
