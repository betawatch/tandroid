package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l40 c;

    public /* synthetic */ k40(l40 l40Var, boolean z10, int i10) {
        this.a = i10;
        this.c = l40Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.fo foVar;
        bi.y1 y1Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                l40 l40Var = this.c;
                l40Var.w = f7;
                l40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                l40Var.e.setPadding(0, 0, 0, (int) (l40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                l40 l40Var2 = this.c;
                l40Var2.E = f10;
                l40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                l40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l40Var2.E));
                org.telegram.ui.kk kkVar = l40Var2.f;
                if (kkVar != null && (foVar = kkVar.a) != null && (y1Var = foVar.L3) != null) {
                    y1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                    l40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                }
                l40Var2.h.setAlpha(l40Var2.E);
                if (!z10) {
                    l40Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
