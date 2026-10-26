package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ne1 extends s4.l {
    public Runnable F;
    public int G;
    public final /* synthetic */ af1 H;

    public ne1(af1 af1Var) {
        this.H = af1Var;
    }

    @Override // s4.l
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

    @Override // s4.l
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        me1 me1Var = new me1(this, 0);
        this.F = me1Var;
        AndroidUtilities.runOnUIThread(me1Var);
    }

    @Override // s4.l, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        me1 me1Var = new me1(this, 1);
        this.F = me1Var;
        AndroidUtilities.runOnUIThread(me1Var);
    }

    @Override // s4.l
    public final void z(s4.e1 e1Var) {
        af1 af1Var = this.H;
        View view = af1Var.c1;
        if (view == e1Var.a) {
            view.setTranslationX(0.0f);
            ee1 ee1Var = af1Var.O;
            if (ee1Var != null) {
                ee1Var.F.clear();
            }
            View view2 = af1Var.c1;
            if (view2 instanceof xe1) {
                xe1 xe1Var = (xe1) view2;
                xe1Var.setTopicIcon(xe1Var.c5);
            }
            af1Var.c1 = null;
        }
    }
}
