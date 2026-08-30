package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class np extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;

    public /* synthetic */ np(op opVar, int i10) {
        this.a = i10;
        this.b = opVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                op opVar = this.b;
                opVar.d = null;
                fg fgVar = new fg(this, 29);
                opVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                break;
            default:
                op opVar2 = this.b;
                opVar2.setVisibility(4);
                opVar2.getClass();
                opVar2.getClass();
                opVar2.d = null;
                break;
        }
    }
}
