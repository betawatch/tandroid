package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l30 c;

    public /* synthetic */ k30(l30 l30Var, boolean z10, int i9) {
        this.a = i9;
        this.c = l30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                l30 l30Var = this.c;
                l30Var.w = f10;
                l30Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                l30Var.e.setPadding(0, 0, 0, (int) (l30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                l30 l30Var2 = this.c;
                l30Var2.A = f11;
                l30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                l30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l30Var2.A));
                org.telegram.ui.wj wjVar = l30Var2.f;
                if (wjVar != null && (rnVar = wjVar.a) != null && (f1Var = rnVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                    l30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                }
                l30Var2.h.setAlpha(l30Var2.A);
                if (!z10) {
                    l30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
