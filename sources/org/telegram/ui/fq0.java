package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fq0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ lq0 a;

    public fq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        lq0 lq0Var = this.a;
        if (i10 == -1) {
            lq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                lq0.U(lq0Var, null);
            }
        } else if (lq0Var.V != null) {
            lq0Var.finishFragment(false);
            lq0Var.V.b();
        }
    }
}
