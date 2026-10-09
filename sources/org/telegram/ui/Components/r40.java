package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s40 c;

    public /* synthetic */ r40(s40 s40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = s40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                s40 s40Var = this.c;
                s40Var.w = f7;
                s40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                s40Var.e.setPadding(0, 0, 0, (int) (s40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                s40 s40Var2 = this.c;
                s40Var2.E = f10;
                s40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                s40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, s40Var2.E));
                org.telegram.ui.jk jkVar = s40Var2.f;
                if (jkVar != null && (aoVar = jkVar.a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                    s40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                }
                s40Var2.h.setAlpha(s40Var2.E);
                if (!z10) {
                    s40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
