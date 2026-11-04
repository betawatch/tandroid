package ji;

import android.view.View;
import ci.gb;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Wallet.v2;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.cm0;
import org.telegram.ui.et;
import org.telegram.ui.ht;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends f61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        switch (this.a) {
            case 0:
                ((z) view).getClass();
                break;
            case 1:
                et etVar = (et) view;
                etVar.g3 = i3;
                etVar.n3.clear();
                etVar.u3 = etVar.z1(6) + etVar.B1(6) <= 0;
                etVar.C1();
                etVar.D1(false);
                etVar.v0(0);
                break;
            case 3:
                if (view instanceof v2) {
                    ((v2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                return i3 == 2 ? b0Var.u1 : i3 == 0 ? b0Var.s1 : b0Var.t1;
            case 1:
                ht htVar = (ht) this.b;
                et etVar = new et(htVar, htVar.getParentActivity());
                htVar.e.add(etVar);
                return etVar;
            case 2:
                cm0 cm0Var = (cm0) this.b;
                if (i3 == 1) {
                    return cm0Var.h;
                }
                if (i3 == 0) {
                    return cm0Var.n;
                }
                return null;
            case 3:
                return (View) ((x2) this.b).k1.get(i3);
            default:
                gb gbVar = (gb) this.b;
                return i3 != 1 ? i3 != 2 ? (tg.o) gbVar.b : (tg.p) gbVar.d : (tg.n) gbVar.c;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        switch (this.a) {
            case 0:
                return ((b0) this.b).F1 ? 1 : 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((x2) this.b).k1.size();
            default:
                return 3;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public CharSequence g(int i3) {
        switch (this.a) {
            case 1:
                return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : bd.M0(2131748303, null) : bd.M0(2131748301, null) : bd.M0(2131748304, null) : bd.M0(2131748305, null);
            case 4:
                return i3 != 1 ? i3 != 2 ? bd.M0(2131747677, null).toUpperCase() : bd.M0(2131747676, null).toUpperCase() : bd.M0(2131747671, null).toUpperCase();
            default:
                return super.g(i3);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public int h(int i3) {
        switch (this.a) {
            case 0:
                if (((b0) this.b).F1 || i3 == 2) {
                    return 2;
                }
                return i3 == 0 ? 0 : 1;
            case 1:
            default:
                return super.h(i3);
            case 2:
            case 3:
            case 4:
                return i3;
        }
    }

    private final void i(View view, int i3, int i10) {
    }

    private final void j(View view, int i3, int i10) {
    }
}
