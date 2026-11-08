package jg;

import org.telegram.ui.vw;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
