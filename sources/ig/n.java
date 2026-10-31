package ig;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Wallet.w2;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.ju;
import org.telegram.ui.mu;
import org.telegram.ui.tn0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends o71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ju juVar = (ju) view;
                juVar.f3 = i10;
                juVar.m3.clear();
                juVar.t3 = juVar.z1(6) + juVar.B1(6) <= 0;
                juVar.C1();
                juVar.D1(false);
                juVar.v0(0);
                break;
            case 2:
                break;
            case 3:
                if (view instanceof w2) {
                    ((w2) view).getClass();
                    break;
                }
                break;
            default:
                ((yh.y) view).getClass();
                break;
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                ai.b bVar = (ai.b) this.b;
                return i10 != 1 ? i10 != 2 ? (q) bVar.b : (t) bVar.d : (p) bVar.c;
            case 1:
                mu muVar = (mu) this.b;
                ju juVar = new ju(muVar, muVar.getParentActivity());
                muVar.e.add(juVar);
                return juVar;
            case 2:
                tn0 tn0Var = (tn0) this.b;
                if (i10 == 1) {
                    return tn0Var.h;
                }
                if (i10 == 0) {
                    return tn0Var.n;
                }
                return null;
            case 3:
                return (View) ((y2) this.b).j1.get(i10);
            default:
                yh.a0 a0Var = (yh.a0) this.b;
                return i10 == 2 ? a0Var.t1 : i10 == 0 ? a0Var.r1 : a0Var.s1;
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        switch (this.a) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((y2) this.b).j1.size();
            default:
                return ((yh.a0) this.b).E1 ? 1 : 3;
        }
    }

    @Override // org.telegram.ui.Components.o71
    public CharSequence g(int i10) {
        switch (this.a) {
            case 0:
                return i10 != 1 ? i10 != 2 ? cd.L0(2131747685, null).toUpperCase() : cd.L0(2131747684, null).toUpperCase() : cd.L0(2131747679, null).toUpperCase();
            case 1:
                return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : cd.L0(2131748309, null) : cd.L0(2131748307, null) : cd.L0(2131748310, null) : cd.L0(2131748311, null);
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public int h(int i10) {
        switch (this.a) {
            case 0:
            case 2:
            case 3:
                return i10;
            case 1:
            default:
                return super.h(i10);
            case 4:
                if (((yh.a0) this.b).E1 || i10 == 2) {
                    return 2;
                }
                return i10 == 0 ? 0 : 1;
        }
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }
}
