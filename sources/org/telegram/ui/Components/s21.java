package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ s21(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l31 l31Var = this.b;
                b31 b31Var = l31Var.G;
                b31Var.x1(true);
                z21 z21Var = l31Var.s;
                z21Var.x1(true);
                l31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(z21Var);
                AndroidUtilities.updateVisibleRows(b31Var);
                break;
            default:
                l31 l31Var2 = this.b;
                if (l31Var2.k()) {
                    l31Var2.l();
                    break;
                }
                break;
        }
    }
}
