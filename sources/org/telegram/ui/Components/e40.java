package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f40 c;

    public /* synthetic */ e40(f40 f40Var, boolean z4, int i10) {
        this.a = i10;
        this.c = f40Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.yn ynVar;
        mh.d1 d1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                f40 f40Var = this.c;
                f40Var.w = f10;
                f40Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                f40Var.e.setPadding(0, 0, 0, (int) (f40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z4 = this.b;
                float f11 = z4 ? 1.0f : 0.0f;
                f40 f40Var2 = this.c;
                f40Var2.B = f11;
                f40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                f40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.B));
                org.telegram.ui.fk fkVar = f40Var2.f;
                if (fkVar != null && (ynVar = fkVar.a) != null && (d1Var = ynVar.I3) != null) {
                    d1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                    f40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                }
                f40Var2.h.setAlpha(f40Var2.B);
                if (!z4) {
                    f40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
