package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ie1 extends f2.n {
    public Runnable F;
    public int G;
    public final /* synthetic */ we1 H;

    public ie1(we1 we1Var) {
        this.H = we1Var;
    }

    @Override // f2.n
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

    @Override // f2.n
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        he1 he1Var = new he1(this, 0);
        this.F = he1Var;
        AndroidUtilities.runOnUIThread(he1Var);
    }

    @Override // f2.n, f2.w0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        he1 he1Var = new he1(this, 1);
        this.F = he1Var;
        AndroidUtilities.runOnUIThread(he1Var);
    }

    @Override // f2.n
    public final void z(f2.q1 q1Var) {
        we1 we1Var = this.H;
        View view = we1Var.X0;
        if (view == q1Var.a) {
            view.setTranslationX(0.0f);
            zd1 zd1Var = we1Var.K;
            if (zd1Var != null) {
                zd1Var.B.clear();
            }
            View view2 = we1Var.X0;
            if (view2 instanceof se1) {
                se1 se1Var = (se1) view2;
                se1Var.setTopicIcon(se1Var.U4);
            }
            we1Var.X0 = null;
        }
    }
}
