package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k40 c;

    public /* synthetic */ j40(k40 k40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = k40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                k40 k40Var = this.c;
                k40Var.w = f7;
                k40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                k40 k40Var2 = this.c;
                k40Var2.E = f10;
                k40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                k40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.ck ckVar = k40Var2.f;
                if (ckVar != null && (tnVar = ckVar.a) != null && (u1Var = tnVar.L3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                }
                k40Var2.h.setAlpha(k40Var2.E);
                if (!z10) {
                    k40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
