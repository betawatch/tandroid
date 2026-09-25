package gg;

import org.telegram.ui.py;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (py pyVar : this.b.R.e0) {
                    ((s4.c0) pyVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.J();
                break;
        }
    }
}
