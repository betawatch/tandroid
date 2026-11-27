// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gga extends zha {
    public final /* synthetic */ eja Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gga(eja ejaVar, Context context) {
        super(context);
        this.Q = ejaVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        zha zhaVar;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        eja ejaVar = this.Q;
        zha[] zhaVarArr = ejaVar.n0;
        if (zhaVarArr[0] == this) {
            float f2 = translationX - f;
            vy4 vy4Var = ejaVar.h2;
            if (vy4Var != null) {
                float f3 = ejaVar.i2 + f2;
                ejaVar.i2 = f3;
                int i = (int) f3;
                if (i != 0) {
                    ejaVar.i2 = f3 - i;
                    vy4Var.h(i, 0);
                }
            }
        }
        if (ejaVar.j1 && (zhaVar = zhaVarArr[0]) == this) {
            float abs = Math.abs(zhaVar.getTranslationX()) / zhaVarArr[0].getMeasuredWidth();
            ejaVar.g1(abs, zhaVarArr[1].F);
            if (ejaVar.q()) {
                byte b = ejaVar.A0;
                if (b == 2) {
                    ejaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    ejaVar.r0 = abs;
                }
                ejaVar.K1(abs);
                float U = ejaVar.U(abs);
                ejaVar.s0 = U;
                ejaVar.u0.setVisibility((U == 0.0f || !ejaVar.q() || ejaVar.k0()) ? 4 : 0);
            } else {
                ejaVar.r0 = 0.0f;
            }
            ejaVar.G1(false);
        }
        ejaVar.C();
        xj3 xj3Var = ejaVar.S0;
        if (xj3Var != null) {
            xj3Var.setTranslationY(ejaVar.O1);
        }
    }
}
