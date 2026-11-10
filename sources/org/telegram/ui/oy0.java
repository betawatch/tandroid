package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry0 b;

    public /* synthetic */ oy0(ry0 ry0Var, int i7) {
        this.a = i7;
        this.b = ry0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ry0 ry0Var = this.b;
                sy0 sy0Var = ry0Var.w;
                if (ry0Var.a != 0) {
                    sy0Var.onBackPressed();
                    break;
                } else {
                    sy0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.K3(this.b.n.d);
                break;
        }
    }
}
