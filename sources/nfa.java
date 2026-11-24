// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nfa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nha b;

    public /* synthetic */ nfa(nha nhaVar, byte b) {
        this.a = b;
        this.b = nhaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                nhaVar.O0 = null;
                break;
            default:
                r7 r7Var = nhaVar.q0;
                nhaVar.i1 = null;
                boolean z = nhaVar.l1;
                iga[] igaVarArr = nhaVar.n0;
                if (z) {
                    igaVarArr[1].setVisibility(8);
                    if (r7Var == null || nhaVar.q()) {
                        nhaVar.r0 = nhaVar.V(0.0f);
                        nhaVar.K1(0.0f);
                    } else {
                        nhaVar.setSearchItemVisibility(nhaVar.s0() ? 8 : 4);
                        nhaVar.r0 = 0.0f;
                    }
                    nhaVar.G1(false);
                    nhaVar.A0 = (byte) 0;
                } else {
                    iga igaVar = igaVarArr[0];
                    igaVarArr[0] = igaVarArr[1];
                    igaVarArr[1] = igaVar;
                    igaVar.setVisibility(8);
                    if (r7Var != null && nhaVar.A0 == 2) {
                        nhaVar.setSearchItemVisibility(nhaVar.s0() ? 8 : 4);
                    }
                    nhaVar.A0 = (byte) 0;
                    nhaVar.g1(1.0f, igaVarArr[0].F);
                    nhaVar.S0();
                    nhaVar.q1();
                }
                nhaVar.j1 = false;
                nhaVar.B1 = false;
                nhaVar.A1 = false;
                nhaVar.setHeaderEnabled(true);
                nhaVar.L0.setEnabled(true);
                break;
        }
    }
}
