package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b40 c;

    public /* synthetic */ a40(b40 b40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = b40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                b40 b40Var = this.c;
                b40Var.w = f7;
                b40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.e.setPadding(0, 0, 0, (int) (b40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                b40 b40Var2 = this.c;
                b40Var2.E = f10;
                b40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f;
                if (ikVar != null && (eoVar = ikVar.a) != null && (o0Var = eoVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                }
                b40Var2.h.setAlpha(b40Var2.E);
                if (!z10) {
                    b40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
