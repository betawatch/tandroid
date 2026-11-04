package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ br(lr lrVar, int i3) {
        this.a = i3;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lr.d0(this.b);
                break;
            case 1:
                lr lrVar = this.b;
                if (lrVar.K) {
                    lrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(lrVar.d.d);
                    break;
                }
                break;
            default:
                lr lrVar2 = this.b;
                lrVar2.presentFragment(wm.ra(lrVar2.I), true);
                break;
        }
    }
}
