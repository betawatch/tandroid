package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr b;

    public /* synthetic */ dr(nr nrVar, int i7) {
        this.a = i7;
        this.b = nrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nr.d0(this.b);
                break;
            case 1:
                nr nrVar = this.b;
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    break;
                }
                break;
            default:
                nr nrVar2 = this.b;
                nrVar2.presentFragment(an.ra(nrVar2.H), true);
                break;
        }
    }
}
