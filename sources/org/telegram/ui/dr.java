package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
