package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq b;

    public /* synthetic */ fq(gq gqVar, int i10) {
        this.a = i10;
        this.b = gqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gq gqVar = this.b;
                gqVar.d = null;
                rg rgVar = new rg(this, 29);
                gqVar.e = rgVar;
                AndroidUtilities.runOnUIThread(rgVar, 3000L);
                break;
            default:
                gq gqVar2 = this.b;
                gqVar2.setVisibility(4);
                gqVar2.getClass();
                gqVar2.getClass();
                gqVar2.d = null;
                break;
        }
    }
}
