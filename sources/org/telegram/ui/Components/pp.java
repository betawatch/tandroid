package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                og ogVar = new og(this, 29);
                qpVar.e = ogVar;
                AndroidUtilities.runOnUIThread(ogVar, 3000L);
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
