package gg;

import org.telegram.ui.ty;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                for (ty tyVar : this.b.R.e0) {
                    ((s4.c0) tyVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.J();
                break;
        }
    }
}
