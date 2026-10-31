package bi;

import org.telegram.messenger.d20;
import org.telegram.ui.kh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ f(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.J(true, 2147483646, 0, 0L, false);
                kh0 kh0Var = tVar.O;
                if (kh0Var != null) {
                    kh0Var.g(false);
                    tVar.O = null;
                    break;
                }
                break;
            case 1:
                t tVar2 = this.b;
                tVar2.J(false, 0, 0, 0L, false);
                kh0 kh0Var2 = tVar2.O;
                if (kh0Var2 != null) {
                    kh0Var2.g(true);
                    tVar2.O = null;
                    break;
                }
                break;
            case 2:
                t tVar3 = this.b;
                if (!d20.i(tVar3.n).q()) {
                    new kg.i1(tVar3.b.W1, tVar3.getContext(), tVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                t tVar4 = this.b;
                i4 i4Var = tVar4.s;
                if (i4Var != null) {
                    i4Var.setSendEnabled(tVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
