package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;

    public /* synthetic */ qp(rp rpVar, int i10) {
        this.a = i10;
        this.b = rpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rp rpVar = this.b;
                rpVar.d = null;
                pg pgVar = new pg(this, 29);
                rpVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                break;
            default:
                rp rpVar2 = this.b;
                rpVar2.setVisibility(4);
                rpVar2.getClass();
                rpVar2.getClass();
                rpVar2.d = null;
                break;
        }
    }
}
