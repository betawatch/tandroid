// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nda extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa b;

    public /* synthetic */ nda(nfa nfaVar, byte b) {
        this.a = b;
        this.b = nfaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                nfaVar.O0 = null;
                break;
            default:
                r7 r7Var = nfaVar.q0;
                nfaVar.i1 = null;
                boolean z = nfaVar.l1;
                iea[] ieaVarArr = nfaVar.n0;
                if (z) {
                    ieaVarArr[1].setVisibility(8);
                    if (r7Var == null || nfaVar.q()) {
                        nfaVar.r0 = nfaVar.V(0.0f);
                        nfaVar.K1(0.0f);
                    } else {
                        nfaVar.setSearchItemVisibility(nfaVar.s0() ? 8 : 4);
                        nfaVar.r0 = 0.0f;
                    }
                    nfaVar.G1(false);
                    nfaVar.A0 = (byte) 0;
                } else {
                    iea ieaVar = ieaVarArr[0];
                    ieaVarArr[0] = ieaVarArr[1];
                    ieaVarArr[1] = ieaVar;
                    ieaVar.setVisibility(8);
                    if (r7Var != null && nfaVar.A0 == 2) {
                        nfaVar.setSearchItemVisibility(nfaVar.s0() ? 8 : 4);
                    }
                    nfaVar.A0 = (byte) 0;
                    nfaVar.g1(1.0f, ieaVarArr[0].F);
                    nfaVar.S0();
                    nfaVar.q1();
                }
                nfaVar.j1 = false;
                nfaVar.B1 = false;
                nfaVar.A1 = false;
                nfaVar.setHeaderEnabled(true);
                nfaVar.L0.setEnabled(true);
                break;
        }
    }
}
