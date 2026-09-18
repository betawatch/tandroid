package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
