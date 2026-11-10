package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.id;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Wallet.v2;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.km0;
import org.telegram.ui.kt;
import org.telegram.ui.nt;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class x extends m61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((b0) view).getClass();
                break;
            case 1:
                kt ktVar = (kt) view;
                ktVar.f3 = i7;
                ktVar.m3.clear();
                ktVar.t3 = ktVar.z1(6) + ktVar.B1(6) <= 0;
                ktVar.C1();
                ktVar.D1(false);
                ktVar.v0(0);
                break;
            case 3:
                if (view instanceof v2) {
                    ((v2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                return i7 == 2 ? d0Var.w1 : i7 == 0 ? d0Var.u1 : d0Var.v1;
            case 1:
                nt ntVar = (nt) this.b;
                kt ktVar = new kt(ntVar, ntVar.getParentActivity());
                ntVar.e.add(ktVar);
                return ktVar;
            case 2:
                km0 km0Var = (km0) this.b;
                if (i7 == 1) {
                    return km0Var.h;
                }
                if (i7 == 0) {
                    return km0Var.n;
                }
                return null;
            case 3:
                return (View) ((x2) this.b).m1.get(i7);
            default:
                nc ncVar = (nc) this.b;
                return i7 != 1 ? i7 != 2 ? (sg.o) ncVar.b : (sg.p) ncVar.d : (sg.n) ncVar.c;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        switch (this.a) {
            case 0:
                return ((d0) this.b).H1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((x2) this.b).m1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public CharSequence g(int i7) {
        switch (this.a) {
            case 1:
                return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : id.M0(2131748295, null) : id.M0(2131748293, null) : id.M0(2131748296, null) : id.M0(2131748297, null);
            case 4:
                return i7 != 1 ? i7 != 2 ? id.M0(2131747669, null).toUpperCase() : id.M0(2131747668, null).toUpperCase() : id.M0(2131747663, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public int h(int i7) {
        switch (this.a) {
            case 0:
                if (((d0) this.b).H1 || i7 == 2) {
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
