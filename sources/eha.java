// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class eha extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eja b;

    public /* synthetic */ eha(eja ejaVar, byte b) {
        this.a = b;
        this.b = ejaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                ejaVar.O0 = null;
                break;
            default:
                s7 s7Var = ejaVar.q0;
                ejaVar.i1 = null;
                boolean z = ejaVar.l1;
                zha[] zhaVarArr = ejaVar.n0;
                if (z) {
                    zhaVarArr[1].setVisibility(8);
                    if (s7Var == null || ejaVar.q()) {
                        ejaVar.r0 = ejaVar.V(0.0f);
                        ejaVar.K1(0.0f);
                    } else {
                        ejaVar.setSearchItemVisibility(ejaVar.s0() ? 8 : 4);
                        ejaVar.r0 = 0.0f;
                    }
                    ejaVar.G1(false);
                    ejaVar.A0 = (byte) 0;
                } else {
                    zha zhaVar = zhaVarArr[0];
                    zhaVarArr[0] = zhaVarArr[1];
                    zhaVarArr[1] = zhaVar;
                    zhaVar.setVisibility(8);
                    if (s7Var != null && ejaVar.A0 == 2) {
                        ejaVar.setSearchItemVisibility(ejaVar.s0() ? 8 : 4);
                    }
                    ejaVar.A0 = (byte) 0;
                    ejaVar.g1(1.0f, zhaVarArr[0].F);
                    ejaVar.S0();
                    ejaVar.q1();
                }
                ejaVar.j1 = false;
                ejaVar.B1 = false;
                ejaVar.A1 = false;
                ejaVar.setHeaderEnabled(true);
                ejaVar.L0.setEnabled(true);
                break;
        }
    }
}
