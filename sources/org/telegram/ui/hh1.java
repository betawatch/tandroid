package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ hh1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.l61 l61Var = this.b.a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.b.a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
