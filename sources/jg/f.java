package jg;

import org.telegram.ui.vw;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ f(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (vw vwVar : this.b.R.e0) {
                    ((v4.b0) vwVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.K();
                break;
        }
    }
}
