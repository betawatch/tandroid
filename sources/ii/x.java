package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.gt;
import org.telegram.ui.hm0;
import org.telegram.ui.kt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class x extends h61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.h61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((b0) view).getClass();
                break;
            case 1:
                gt gtVar = (gt) view;
                gtVar.f3 = i7;
                gtVar.m3.clear();
                gtVar.t3 = gtVar.z1(6) + gtVar.B1(6) <= 0;
                gtVar.C1();
                gtVar.D1(false);
                gtVar.v0(0);
                break;
            case 3:
                if (view instanceof x2) {
                    ((x2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final View d(int i7) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                return i7 == 2 ? d0Var.t1 : i7 == 0 ? d0Var.r1 : d0Var.s1;
            case 1:
                kt ktVar = (kt) this.b;
                gt gtVar = new gt(ktVar, ktVar.getParentActivity());
                ktVar.e.add(gtVar);
                return gtVar;
            case 2:
                hm0 hm0Var = (hm0) this.b;
                if (i7 == 1) {
                    return hm0Var.h;
                }
                if (i7 == 0) {
                    return hm0Var.n;
                }
                return null;
            case 3:
                return (View) ((z2) this.b).j1.get(i7);
            default:
                nc ncVar = (nc) this.b;
                return i7 != 1 ? i7 != 2 ? (sg.o) ncVar.b : (sg.p) ncVar.d : (sg.n) ncVar.c;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final int e() {
        switch (this.a) {
            case 0:
                return ((d0) this.b).E1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((z2) this.b).j1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public CharSequence g(int i7) {
        switch (this.a) {
            case 1:
                return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131748294, null) : hd.M0(2131748292, null) : hd.M0(2131748295, null) : hd.M0(2131748296, null);
            case 4:
                return i7 != 1 ? i7 != 2 ? hd.M0(2131747668, null).toUpperCase() : hd.M0(2131747667, null).toUpperCase() : hd.M0(2131747662, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public int h(int i7) {
        switch (this.a) {
            case 0:
                if (((d0) this.b).E1 || i7 == 2) {
                    return 2;
                }
                return i7 == 0 ? 0 : 1;
            case 1:
            default:
                return super.h(i7);
            case 2:
            case 3:
            case 4:
                return i7;
        }
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }
}
