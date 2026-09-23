package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jf1 extends s4.j {
    public Runnable F;
    public int G;
    public final /* synthetic */ wf1 H;

    public jf1(wf1 wf1Var) {
        this.H = wf1Var;
    }

    @Override // s4.j
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

    @Override // s4.j
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        if1 if1Var = new if1(this, 0);
        this.F = if1Var;
        AndroidUtilities.runOnUIThread(if1Var);
    }

    @Override // s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if1 if1Var = new if1(this, 1);
        this.F = if1Var;
        AndroidUtilities.runOnUIThread(if1Var);
    }

    @Override // s4.j
    public final void z(s4.c1 c1Var) {
        wf1 wf1Var = this.H;
        View view = wf1Var.b1;
        if (view == c1Var.a) {
            view.setTranslationX(0.0f);
            af1 af1Var = wf1Var.O;
            if (af1Var != null) {
                af1Var.F.clear();
            }
            View view2 = wf1Var.b1;
            if (view2 instanceof tf1) {
                tf1 tf1Var = (tf1) view2;
                tf1Var.setTopicIcon(tf1Var.Y4);
            }
            wf1Var.b1 = null;
        }
    }
}
