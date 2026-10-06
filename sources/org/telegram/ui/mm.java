package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                kVar = ((org.telegram.ui.ActionBar.n2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                nm nmVar = this.c;
                yn ynVar = nmVar.c;
                ynVar.g0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
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
                yn ynVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                yn.J3(ynVar);
                ynVar.g0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                nm nmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) nmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.b = true;
                break;
        }
    }
}
