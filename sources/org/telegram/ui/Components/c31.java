package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ c31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v31 v31Var = this.b;
                l31 l31Var = v31Var.G;
                l31Var.y1(true);
                j31 j31Var = v31Var.s;
                j31Var.y1(true);
                v31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(j31Var);
                AndroidUtilities.updateVisibleRows(l31Var);
                break;
            default:
                v31 v31Var2 = this.b;
                if (v31Var2.k()) {
                    v31Var2.l();
                    break;
                }
                break;
        }
    }
}
