package li;

import android.view.View;
import di.va;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Wallet.u2;
import org.telegram.ui.Wallet.w2;
import org.telegram.ui.jm0;
import org.telegram.ui.kt;
import org.telegram.ui.nt;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class x extends n61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((b0) view).getClass();
                break;
            case 1:
                kt ktVar = (kt) view;
                ktVar.g3 = i7;
                ktVar.n3.clear();
                ktVar.u3 = ktVar.z1(6) + ktVar.B1(6) <= 0;
                ktVar.C1();
                ktVar.D1(false);
                ktVar.v0(0);
                break;
            case 3:
                if (view instanceof u2) {
                    ((u2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                return i7 == 2 ? d0Var.x1 : i7 == 0 ? d0Var.v1 : d0Var.w1;
            case 1:
                nt ntVar = (nt) this.b;
                kt ktVar = new kt(ntVar, ntVar.getParentActivity());
                ntVar.e.add(ktVar);
                return ktVar;
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
                return (View) ((w2) this.b).n1.get(i7);
            default:
                va vaVar = (va) this.b;
                return i7 != 1 ? i7 != 2 ? (sg.o) vaVar.b : (sg.p) vaVar.d : (sg.n) vaVar.c;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        switch (this.a) {
            case 0:
                return ((d0) this.b).I1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((w2) this.b).n1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public CharSequence g(int i7) {
        switch (this.a) {
            case 1:
                return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131748295, null) : hd.M0(2131748293, null) : hd.M0(2131748296, null) : hd.M0(2131748297, null);
            case 4:
                return i7 != 1 ? i7 != 2 ? hd.M0(2131747669, null).toUpperCase() : hd.M0(2131747668, null).toUpperCase() : hd.M0(2131747663, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.n61
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
