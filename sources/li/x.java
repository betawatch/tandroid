package li;

import android.view.View;
import di.za;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Wallet.b3;
import org.telegram.ui.Wallet.d3;
import org.telegram.ui.lm0;
import org.telegram.ui.mt;
import org.telegram.ui.pt;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class x extends y61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((b0) view).getClass();
                break;
            case 1:
                mt mtVar = (mt) view;
                mtVar.g3 = i7;
                mtVar.n3.clear();
                mtVar.u3 = mtVar.z1(6) + mtVar.B1(6) <= 0;
                mtVar.C1();
                mtVar.D1(false);
                mtVar.v0(0);
                break;
            case 3:
                if (view instanceof b3) {
                    ((b3) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                return i7 == 2 ? d0Var.x1 : i7 == 0 ? d0Var.v1 : d0Var.w1;
            case 1:
                pt ptVar = (pt) this.b;
                mt mtVar = new mt(ptVar, ptVar.getParentActivity());
                ptVar.e.add(mtVar);
                return mtVar;
            case 2:
                lm0 lm0Var = (lm0) this.b;
                if (i7 == 1) {
                    return lm0Var.h;
                }
                if (i7 == 0) {
                    return lm0Var.n;
                }
                return null;
            case 3:
                return (View) ((d3) this.b).n1.get(i7);
            default:
                za zaVar = (za) this.b;
                return i7 != 1 ? i7 != 2 ? (sg.o) zaVar.b : (sg.p) zaVar.d : (sg.n) zaVar.c;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        switch (this.a) {
            case 0:
                return ((d0) this.b).I1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((d3) this.b).n1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public CharSequence g(int i7) {
        switch (this.a) {
            case 1:
                return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.M0(2131748103, null) : gd.M0(2131748101, null) : gd.M0(2131748104, null) : gd.M0(2131748105, null);
            case 4:
                return i7 != 1 ? i7 != 2 ? gd.M0(2131747476, null).toUpperCase() : gd.M0(2131747475, null).toUpperCase() : gd.M0(2131747470, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.y61
    public int h(int i7) {
        switch (this.a) {
            case 0:
                if (((d0) this.b).I1 || i7 == 2) {
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
