package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q30 c;

    public /* synthetic */ p30(q30 q30Var, boolean z10, int i10) {
        this.a = i10;
        this.c = q30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.sn snVar;
        hh.f1 f1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                q30 q30Var = this.c;
                q30Var.w = f10;
                q30Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                q30Var.e.setPadding(0, 0, 0, (int) (q30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                q30 q30Var2 = this.c;
                q30Var2.A = f11;
                q30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                q30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, q30Var2.A));
                org.telegram.ui.yj yjVar = q30Var2.f;
                if (yjVar != null && (snVar = yjVar.a) != null && (f1Var = snVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                    q30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                }
                q30Var2.h.setAlpha(q30Var2.A);
                if (!z10) {
                    q30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
