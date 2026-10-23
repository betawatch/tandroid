package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class hm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.y b;
    public final /* synthetic */ im c;

    public /* synthetic */ hm(im imVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.a = i10;
        this.c = imVar;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.o2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                im imVar = this.c;
                sn snVar = imVar.c;
                snVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                imVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                sn snVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.R3(snVar);
                snVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                im imVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) imVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                imVar.b = true;
                break;
        }
    }
}
