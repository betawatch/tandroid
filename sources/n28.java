// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n28 extends d6 {
    public final /* synthetic */ p a;

    public n28(p pVar) {
        this.a = pVar;
    }

    @Override // d6
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
            hl.t1(pVar.getParentActivity().getCurrentFocus());
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
                i29[] i29VarArr = pVar.h;
                if (i2 >= i29VarArr.length) {
                    break;
                }
                if (i29VarArr[i2].b.f) {
                    pVar.H0 = pVar.F0.shipping_options.get(i2);
                    break;
                }
                i2++;
            }
            pVar.h0();
            return;
        }
        if (b == 2) {
            pVar.D0();
        } else if (b == 3) {
            pVar.Z();
        } else if (b == 6) {
            pVar.G0(false);
        }
    }
}
