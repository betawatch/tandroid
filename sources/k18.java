// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k18 extends c6 {
    public final /* synthetic */ p a;

    public k18(p pVar) {
        this.a = pVar;
    }

    @Override // c6
    public final void b(int i) {
        p pVar = this.a;
        if (i == -1) {
            if (pVar.Q0) {
                return;
            }
            pVar.finishFragment();
            return;
        }
        if (i != 1 || pVar.Q0) {
            return;
        }
        if (pVar.v0 != 3) {
            gm.t1(pVar.getParentActivity().getCurrentFocus());
        }
        byte b = pVar.v0;
        if (b == 0) {
            pVar.J0(true);
            pVar.F0();
            return;
        }
        int i2 = 0;
        if (b == 1) {
            while (true) {
                w09[] w09VarArr = pVar.h;
                if (i2 >= w09VarArr.length) {
                    break;
                }
                if (w09VarArr[i2].b.f) {
                    pVar.H0 = pVar.F0.shipping_options.get(i2);
                    break;
                }
                i2++;
            }
            pVar.i0();
            return;
        }
        if (b == 2) {
            pVar.D0();
        } else if (b == 3) {
            pVar.a0();
        } else if (b == 6) {
            pVar.G0(false);
        }
    }
}
