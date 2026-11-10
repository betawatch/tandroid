package jg;

import org.telegram.ui.yw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                for (yw ywVar : this.b.R.e0) {
                    ((v4.b0) ywVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.K();
                break;
        }
    }
}
