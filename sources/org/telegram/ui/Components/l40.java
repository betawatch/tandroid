package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m40 c;

    public /* synthetic */ l40(m40 m40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = m40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.xn xnVar;
        bi.r1 r1Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                m40 m40Var = this.c;
                m40Var.w = f7;
                m40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                m40Var.e.setPadding(0, 0, 0, (int) (m40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                m40 m40Var2 = this.c;
                m40Var2.E = f10;
                m40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                m40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, m40Var2.E));
                org.telegram.ui.ek ekVar = m40Var2.f;
                if (ekVar != null && (xnVar = ekVar.a) != null && (r1Var = xnVar.X3) != null) {
                    r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                    m40Var2.f.a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                }
                m40Var2.h.setAlpha(m40Var2.E);
                if (!z10) {
                    m40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
