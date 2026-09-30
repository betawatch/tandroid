package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class rp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ rp(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                spVar.d = null;
                pg pgVar = new pg(this, 29);
                spVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                break;
            default:
                sp spVar2 = this.b;
                spVar2.setVisibility(4);
                spVar2.getClass();
                spVar2.getClass();
                spVar2.d = null;
                break;
        }
    }
}
