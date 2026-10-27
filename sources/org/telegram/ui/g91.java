package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ g91(i91 i91Var, int i10) {
        this.a = i10;
        this.b = i91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i91 i91Var = this.b;
                i91Var.b.setVisibility(4);
                kg.h hVar = i91Var.b;
                hVar.J = false;
                kg.h hVar2 = i91Var.c;
                hVar2.J = true;
                hVar.y0 = 0;
                hVar2.y0 = 0;
                Window window = i91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                i91 i91Var2 = this.b;
                kg.h hVar3 = i91Var2.c;
                hVar3.setVisibility(4);
                kg.h hVar4 = i91Var2.b;
                hVar4.y0 = 0;
                hVar3.y0 = 0;
                hVar4.J = true;
                hVar3.J = false;
                if (hVar4 instanceof kg.r) {
                    hVar4.u0 = false;
                    hVar4.d();
                } else {
                    hVar4.u0 = true;
                    hVar4.x((hVar4.G0 * hVar4.g0.k) - kg.h.k1);
                    hVar4.c(true);
                    hVar4.invalidate();
                }
                Window window2 = i91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                i91 i91Var3 = this.b;
                i91Var3.b.y0 = 0;
                i91Var3.e.setVisibility(8);
                break;
        }
    }
}
