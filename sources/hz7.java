// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hz7 extends c6 {
    public final /* synthetic */ p a;

    public hz7(p pVar) {
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
            gl.t1(pVar.getParentActivity().getCurrentFocus());
        }
        byte b = pVar.v0;
        if (b == 0) {
            pVar.I0(true);
            pVar.E0();
            return;
        }
        int i2 = 0;
        if (b == 1) {
            while (true) {
                vy8[] vy8VarArr = pVar.h;
                if (i2 >= vy8VarArr.length) {
                    break;
                }
                if (vy8VarArr[i2].b.f) {
                    pVar.H0 = pVar.F0.shipping_options.get(i2);
                    break;
                }
                i2++;
            }
            pVar.h0();
            return;
        }
        if (b == 2) {
            pVar.C0();
        } else if (b == 3) {
            pVar.Z();
        } else if (b == 6) {
            pVar.F0(false);
        }
    }
}
