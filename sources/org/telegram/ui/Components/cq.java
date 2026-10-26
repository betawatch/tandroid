package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                bq bqVar = new bq(this, 0);
                dqVar.e = bqVar;
                AndroidUtilities.runOnUIThread(bqVar, 3000L);
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
