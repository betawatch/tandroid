package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                fg fgVar = new fg(this, 29);
                qpVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
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
