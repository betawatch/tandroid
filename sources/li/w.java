package li;

import android.view.View;
import di.za;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Wallet.c3;
import org.telegram.ui.Wallet.e3;
import org.telegram.ui.jm0;
import org.telegram.ui.lt;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w extends c71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((a0) view).getClass();
                break;
            case 1:
                lt ltVar = (lt) view;
                ltVar.g3 = i7;
                ltVar.n3.clear();
                ltVar.u3 = ltVar.z1(6) + ltVar.B1(6) <= 0;
                ltVar.C1();
                ltVar.D1(false);
                ltVar.v0(0);
                break;
            case 3:
                if (view instanceof c3) {
                    ((c3) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                return i7 == 2 ? c0Var.x1 : i7 == 0 ? c0Var.v1 : c0Var.w1;
            case 1:
                ot otVar = (ot) this.b;
                lt ltVar = new lt(otVar, otVar.getParentActivity());
                otVar.e.add(ltVar);
                return ltVar;
            case 2:
                jm0 jm0Var = (jm0) this.b;
                if (i7 == 1) {
                    return jm0Var.h;
                }
                if (i7 == 0) {
                    return jm0Var.n;
                }
                return null;
            case 3:
                return (View) ((e3) this.b).n1.get(i7);
            default:
                za zaVar = (za) this.b;
                return i7 != 1 ? i7 != 2 ? (sg.o) zaVar.b : (sg.p) zaVar.d : (sg.n) zaVar.c;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        switch (this.a) {
            case 0:
                return ((c0) this.b).I1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((e3) this.b).n1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public CharSequence g(int i7) {
        switch (this.a) {
            case 1:
                return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.N0(2131748102, null) : gd.N0(2131748100, null) : gd.N0(2131748103, null) : gd.N0(2131748104, null);
            case 4:
                return i7 != 1 ? i7 != 2 ? gd.N0(2131747475, null).toUpperCase() : gd.N0(2131747474, null).toUpperCase() : gd.N0(2131747469, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.c71
    public int h(int i7) {
        switch (this.a) {
            case 0:
                if (((c0) this.b).I1 || i7 == 2) {
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
