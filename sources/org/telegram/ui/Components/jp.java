package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ jp(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b;
                kpVar.d = null;
                ig igVar = new ig(this, 29);
                kpVar.e = igVar;
                AndroidUtilities.runOnUIThread(igVar, 3000L);
                break;
            default:
                kp kpVar2 = this.b;
                kpVar2.setVisibility(4);
                kpVar2.getClass();
                kpVar2.getClass();
                kpVar2.d = null;
                break;
        }
    }
}
