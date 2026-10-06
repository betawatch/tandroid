package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
