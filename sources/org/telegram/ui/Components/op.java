package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class op extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;

    public /* synthetic */ op(pp ppVar, int i10) {
        this.a = i10;
        this.b = ppVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                ppVar.d = null;
                pg pgVar = new pg(this, 29);
                ppVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                break;
            default:
                pp ppVar2 = this.b;
                ppVar2.setVisibility(4);
                ppVar2.getClass();
                ppVar2.getClass();
                ppVar2.d = null;
                break;
        }
    }
}
