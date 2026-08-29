package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a0 b;
    public final /* synthetic */ im c;

    public /* synthetic */ hm(im imVar, org.telegram.ui.ActionBar.a0 a0Var, int i10) {
        this.a = i10;
        this.c = imVar;
        this.b = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.o2) this.c.c).actionBar;
                lVar.setMenuOffsetSuppressed(false);
                break;
            default:
                im imVar = this.c;
                tn tnVar = imVar.c;
                tnVar.e0.f(8);
                this.b.r(0.0f);
                lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar2.setMenuOffsetSuppressed(false);
                imVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                tn tnVar = this.c.c;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.setMenuOffsetSuppressed(true);
                tn.J3(tnVar);
                tnVar.e0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                im imVar = this.c;
                lVar2 = ((org.telegram.ui.ActionBar.o2) imVar.c).actionBar;
                lVar2.setMenuOffsetSuppressed(true);
                imVar.b = true;
                break;
        }
    }
}
