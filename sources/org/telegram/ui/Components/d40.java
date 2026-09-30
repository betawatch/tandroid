package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class d40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e40 c;

    public /* synthetic */ d40(e40 e40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = e40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                e40 e40Var = this.c;
                e40Var.w = f7;
                e40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                e40 e40Var2 = this.c;
                e40Var2.E = f10;
                e40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                e40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.E));
                org.telegram.ui.fk fkVar = e40Var2.f;
                if (fkVar != null && (xnVar = fkVar.a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                    e40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                }
                e40Var2.h.setAlpha(e40Var2.E);
                if (!z10) {
                    e40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
