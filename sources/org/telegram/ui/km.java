package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class km extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ lm c;

    public /* synthetic */ km(lm lmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = lmVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                lm lmVar = this.c;
                wn wnVar = lmVar.c;
                wnVar.i0.f(8);
                this.b.q(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                lmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                wn wnVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.U3(wnVar);
                wnVar.i0.f(0);
                this.b.q(AndroidUtilities.dp(48.0f));
                break;
            default:
                lm lmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) lmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                lmVar.b = true;
                break;
        }
    }
}
