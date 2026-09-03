package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e40 c;

    public /* synthetic */ d40(e40 e40Var, boolean z4, int i10) {
        this.a = i10;
        this.c = e40Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ao aoVar;
        lh.e1 e1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                e40 e40Var = this.c;
                e40Var.w = f10;
                e40Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z4 = this.b;
                float f11 = z4 ? 1.0f : 0.0f;
                e40 e40Var2 = this.c;
                e40Var2.B = f11;
                e40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                e40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.B));
                org.telegram.ui.hk hkVar = e40Var2.f;
                if (hkVar != null && (aoVar = hkVar.a) != null && (e1Var = aoVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                    e40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                }
                e40Var2.h.setAlpha(e40Var2.B);
                if (!z4) {
                    e40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
