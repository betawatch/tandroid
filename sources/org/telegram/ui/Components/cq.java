package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                cp cpVar = new cp(this, 1);
                dqVar.e = cpVar;
                AndroidUtilities.runOnUIThread(cpVar, 3000L);
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
