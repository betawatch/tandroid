package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class em extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ gm c;

    public /* synthetic */ em(gm gmVar, org.telegram.ui.ActionBar.z zVar, int i9) {
        this.a = i9;
        this.c = gmVar;
        this.b = zVar;
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
                gm gmVar = this.c;
                qn qnVar = gmVar.c;
                qnVar.e0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                gmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                qn qnVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                qn.J3(qnVar);
                qnVar.e0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                gm gmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) gmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                gmVar.b = true;
                break;
        }
    }
}
