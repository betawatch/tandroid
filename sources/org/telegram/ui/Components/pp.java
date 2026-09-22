package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ pp(qp qpVar, int i10) {
        this.a = i10;
        this.b = qpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                qpVar.d = null;
                ng ngVar = new ng(this, 29);
                qpVar.e = ngVar;
                AndroidUtilities.runOnUIThread(ngVar, 3000L);
                break;
            default:
                qp qpVar2 = this.b;
                qpVar2.setVisibility(4);
                qpVar2.getClass();
                qpVar2.getClass();
                qpVar2.d = null;
                break;
        }
    }
}
