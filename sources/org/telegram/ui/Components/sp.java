package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp b;

    public /* synthetic */ sp(tp tpVar, int i10) {
        this.a = i10;
        this.b = tpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tp tpVar = this.b;
                tpVar.d = null;
                qg qgVar = new qg(this, 29);
                tpVar.e = qgVar;
                AndroidUtilities.runOnUIThread(qgVar, 3000L);
                break;
            default:
                tp tpVar2 = this.b;
                tpVar2.setVisibility(4);
                tpVar2.getClass();
                tpVar2.getClass();
                tpVar2.d = null;
                break;
        }
    }
}
