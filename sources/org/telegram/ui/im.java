package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class im extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.y b;
    public final /* synthetic */ jm c;

    public /* synthetic */ im(jm jmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.a = i10;
        this.c = jmVar;
        this.b = yVar;
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
                jm jmVar = this.c;
                sn snVar = jmVar.c;
                snVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.b = false;
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
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.S3(snVar);
                snVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                jm jmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) jmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.b = true;
                break;
        }
    }
}
