package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ nm c;

    public /* synthetic */ mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = nmVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.p2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                nm nmVar = this.c;
                xn xnVar = nmVar.c;
                xnVar.f0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.b = false;
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
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                nm nmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.p2) nmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.b = true;
                break;
        }
    }
}
