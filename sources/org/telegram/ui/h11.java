package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.z5 b;

    public /* synthetic */ h11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.K3(((l01) this.b.Z1).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
