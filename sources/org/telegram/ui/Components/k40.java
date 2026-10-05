package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m40 b;

    public /* synthetic */ k40(m40 m40Var, int i10) {
        this.a = i10;
        this.b = m40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m40 m40Var = this.b;
                m40Var.f = null;
                if (!m40Var.H) {
                    aq aqVar = new aq(this, 21);
                    m40Var.h = aqVar;
                    AndroidUtilities.runOnUIThread(aqVar, m40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                m40 m40Var2 = this.b;
                m40Var2.f = null;
                if (!m40Var2.H) {
                    aq aqVar2 = new aq(this, 22);
                    m40Var2.h = aqVar2;
                    AndroidUtilities.runOnUIThread(aqVar2, m40Var2.E);
                    break;
                }
                break;
            default:
                m40 m40Var3 = this.b;
                m40Var3.setVisibility(4);
                m40Var3.getClass();
                m40Var3.e = null;
                m40Var3.d = null;
                m40Var3.f = null;
                break;
        }
    }
}
