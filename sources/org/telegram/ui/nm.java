package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ om c;

    public /* synthetic */ nm(om omVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = omVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                om omVar = this.c;
                xn xnVar = omVar.c;
                xnVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                omVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                xn xnVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                om omVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) omVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                omVar.b = true;
                break;
        }
    }
}
