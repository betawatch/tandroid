package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d40 c;

    public /* synthetic */ c40(d40 d40Var, boolean z4, int i10) {
        this.a = i10;
        this.c = d40Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                d40 d40Var = this.c;
                d40Var.w = f10;
                d40Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z4 = this.b;
                float f11 = z4 ? 1.0f : 0.0f;
                d40 d40Var2 = this.c;
                d40Var2.B = f11;
                d40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                d40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.B));
                org.telegram.ui.fk fkVar = d40Var2.f;
                if (fkVar != null && (ynVar = fkVar.a) != null && (e1Var = ynVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                    d40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                }
                d40Var2.h.setAlpha(d40Var2.B);
                if (!z4) {
                    d40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
