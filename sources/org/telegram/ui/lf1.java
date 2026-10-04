package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lf1 extends s4.j {
    public Runnable F;
    public int G;
    public final /* synthetic */ yf1 H;

    public lf1(yf1 yf1Var) {
        this.H = yf1Var;
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
        kf1 kf1Var = new kf1(this, 0);
        this.F = kf1Var;
        AndroidUtilities.runOnUIThread(kf1Var);
    }

    @Override // s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        kf1 kf1Var = new kf1(this, 1);
        this.F = kf1Var;
        AndroidUtilities.runOnUIThread(kf1Var);
    }

    @Override // s4.j
    public final void z(s4.c1 c1Var) {
        yf1 yf1Var = this.H;
        View view = yf1Var.b1;
        if (view == c1Var.a) {
            view.setTranslationX(0.0f);
            cf1 cf1Var = yf1Var.O;
            if (cf1Var != null) {
                cf1Var.F.clear();
            }
            View view2 = yf1Var.b1;
            if (view2 instanceof vf1) {
                vf1 vf1Var = (vf1) view2;
                vf1Var.setTopicIcon(vf1Var.Y4);
            }
            yf1Var.b1 = null;
        }
    }
}
