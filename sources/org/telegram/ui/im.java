package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class im extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ jm c;

    public /* synthetic */ im(jm jmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = jmVar;
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
                jm jmVar = this.c;
                un unVar = jmVar.c;
                unVar.i0.f(8);
                this.b.q(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
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
                un unVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                un.T3(unVar);
                unVar.i0.f(0);
                this.b.q(AndroidUtilities.dp(48.0f));
                break;
            default:
                jm jmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) jmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.b = true;
                break;
        }
    }
}
