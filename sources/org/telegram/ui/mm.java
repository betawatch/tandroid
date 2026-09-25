package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.y b;
    public final /* synthetic */ nm c;

    public /* synthetic */ mm(nm nmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.a = i10;
        this.c = nmVar;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                nm nmVar = this.c;
                wn wnVar = nmVar.c;
                wnVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
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
                wn wnVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.J3(wnVar);
                wnVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                nm nmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) nmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.b = true;
                break;
        }
    }
}
