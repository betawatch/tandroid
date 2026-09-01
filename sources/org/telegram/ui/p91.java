package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;

    public /* synthetic */ p91(r91 r91Var, int i10) {
        this.a = i10;
        this.b = r91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r91 r91Var = this.b;
                r91Var.b.setVisibility(4);
                wf.g gVar = r91Var.b;
                gVar.G = false;
                wf.g gVar2 = r91Var.c;
                gVar2.G = true;
                gVar.v0 = 0;
                gVar2.v0 = 0;
                Window window = r91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                r91 r91Var2 = this.b;
                wf.g gVar3 = r91Var2.c;
                gVar3.setVisibility(4);
                wf.g gVar4 = r91Var2.b;
                gVar4.v0 = 0;
                gVar3.v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (gVar4 instanceof wf.q) {
                    gVar4.r0 = false;
                    gVar4.d();
                } else {
                    gVar4.r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.d0.k) - wf.g.h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = r91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                r91 r91Var3 = this.b;
                r91Var3.b.v0 = 0;
                r91Var3.e.setVisibility(8);
                break;
        }
    }
}
