package i2;

import android.os.Bundle;
import org.telegram.messenger.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.pf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.o, e2.j, p.a, l9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((m4.n1) obj).W(this.b);
                break;
            case 3:
                ((m4.n1) obj).p0(this.b);
                break;
            default:
                ((m4.n1) obj).w(this.b);
                break;
        }
    }

    @Override // p.a
    public wb c(cc ccVar) {
        return ccVar.k(this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).x(this.b);
                break;
            default:
                ((b2.d1) obj).e(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        Bundle g10 = a1.g.g("afterSignup", this.b);
        pf0 pf0Var = new pf0();
        pf0Var.q0(g10);
        return pf0Var;
    }
}
