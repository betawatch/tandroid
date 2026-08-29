package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z30 c;

    public /* synthetic */ y30(z30 z30Var, boolean z10, int i10) {
        this.a = i10;
        this.c = z30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
        switch (this.a) {
            case 0:
                float f9 = this.b ? 1.0f : 0.0f;
                z30 z30Var = this.c;
                z30Var.w = f9;
                z30Var.e.setTranslationY(f9 * AndroidUtilities.dp(48.0f));
                z30Var.e.setPadding(0, 0, 0, (int) (z30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                z30 z30Var2 = this.c;
                z30Var2.A = f10;
                z30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                z30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, z30Var2.A));
                org.telegram.ui.zj zjVar = z30Var2.f;
                if (zjVar != null && (unVar = zjVar.a) != null && (e1Var = unVar.H3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                    z30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                }
                z30Var2.h.setAlpha(z30Var2.A);
                if (!z10) {
                    z30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
