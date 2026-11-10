package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ b6(d6 d6Var, int i7) {
        this.a = i7;
        this.b = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                d6 d6Var = this.b;
                d6Var.h.invalidate();
                d6Var.n.invalidate();
                d6Var.e.invalidate();
                break;
        }
    }
}
