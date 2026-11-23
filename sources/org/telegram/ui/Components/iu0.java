package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku0 b;

    public /* synthetic */ iu0(ku0 ku0Var, int i7) {
        this.a = i7;
        this.b = ku0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ku0 ku0Var = this.b;
                ku0Var.W0 = false;
                if (!ku0Var.Z0 && ku0Var.X0) {
                    ku0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.W0 = false;
                break;
            case 2:
                ku0 ku0Var2 = this.b;
                ku0Var2.Z0 = false;
                if (!ku0Var2.W0 && ku0Var2.X0) {
                    ku0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Z0 = false;
                break;
        }
    }
}
