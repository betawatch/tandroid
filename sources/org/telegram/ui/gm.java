package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ hm c;

    public /* synthetic */ gm(hm hmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = hmVar;
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
                hm hmVar = this.c;
                rn rnVar = hmVar.c;
                rnVar.e0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                hmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                rn rnVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                rn.J3(rnVar);
                rnVar.e0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                hm hmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) hmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                hmVar.b = true;
                break;
        }
    }
}
