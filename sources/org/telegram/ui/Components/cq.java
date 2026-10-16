package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;

    public /* synthetic */ cq(dq dqVar, int i10) {
        this.a = i10;
        this.b = dqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dq dqVar = this.b;
                dqVar.d = null;
                qg qgVar = new qg(this, 29);
                dqVar.e = qgVar;
                AndroidUtilities.runOnUIThread(qgVar, 3000L);
                break;
            default:
                dq dqVar2 = this.b;
                dqVar2.setVisibility(4);
                dqVar2.getClass();
                dqVar2.getClass();
                dqVar2.d = null;
                break;
        }
    }
}
