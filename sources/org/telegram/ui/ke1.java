package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ke1 extends s4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ ye1 H;

    public ke1(ye1 ye1Var) {
        this.H = ye1Var;
    }

    @Override // s4.k
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().setAnimationInProgress(this.G, null, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.F = null;
            }
        }
    }

    @Override // s4.k
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        je1 je1Var = new je1(this, 0);
        this.F = je1Var;
        AndroidUtilities.runOnUIThread(je1Var);
    }

    @Override // s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        je1 je1Var = new je1(this, 1);
        this.F = je1Var;
        AndroidUtilities.runOnUIThread(je1Var);
    }

    @Override // s4.k
    public final void z(s4.b1 b1Var) {
        ye1 ye1Var = this.H;
        View view = ye1Var.c1;
        if (view == b1Var.a) {
            view.setTranslationX(0.0f);
            be1 be1Var = ye1Var.O;
            if (be1Var != null) {
                be1Var.F.clear();
            }
            View view2 = ye1Var.c1;
            if (view2 instanceof ue1) {
                ue1 ue1Var = (ue1) view2;
                ue1Var.setTopicIcon(ue1Var.c5);
            }
            ye1Var.c1 = null;
        }
    }
}
