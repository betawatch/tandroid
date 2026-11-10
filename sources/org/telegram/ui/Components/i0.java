package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 b;

    public /* synthetic */ i0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.b;
                ((v5) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                break;
        }
    }
}
