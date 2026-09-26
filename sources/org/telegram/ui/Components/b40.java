package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c40 c;

    public /* synthetic */ b40(c40 c40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = c40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                c40 c40Var = this.c;
                c40Var.w = f7;
                c40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                c40Var.e.setPadding(0, 0, 0, (int) (c40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                c40 c40Var2 = this.c;
                c40Var2.E = f10;
                c40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                c40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, c40Var2.E));
                org.telegram.ui.fk fkVar = c40Var2.f;
                if (fkVar != null && (xnVar = fkVar.a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                    c40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                }
                c40Var2.h.setAlpha(c40Var2.E);
                if (!z10) {
                    c40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
