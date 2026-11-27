// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mm2 extends nic {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mm2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 1:
                ((vo2) view).getClass();
                break;
            case 2:
                x83 x83Var = (x83) view;
                x83Var.g3 = i;
                x83Var.n3.clear();
                x83Var.u3 = x83Var.A1(6) + x83Var.C1(6) <= 0;
                x83Var.D1();
                x83Var.E1(false);
                x83Var.x0(0);
                break;
        }
    }

    @Override // nic
    public final View d(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rg2 rg2Var = (rg2) obj;
                return i != 1 ? i != 2 ? (pm2) rg2Var.b : (rm2) rg2Var.d : (om2) rg2Var.c;
            case 1:
                xo2 xo2Var = (xo2) obj;
                return i == 2 ? xo2Var.w1 : i == 0 ? xo2Var.u1 : xo2Var.v1;
            case 2:
                a93 a93Var = (a93) obj;
                x83 x83Var = new x83(a93Var, a93Var.getParentActivity());
                a93Var.e.add(x83Var);
                return x83Var;
            case 3:
                return (View) ((sk7) obj).m1.get(i);
            default:
                h48 h48Var = (h48) obj;
                if (i == 1) {
                    return h48Var.h;
                }
                if (i == 0) {
                    return h48Var.n;
                }
                return null;
        }
    }

    @Override // nic
    public final int e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return 3;
            case 1:
                return ((xo2) obj).H1 ? 1 : 3;
            case 2:
                return 4;
            case 3:
                return ((sk7) obj).m1.size();
            default:
                return 2;
        }
    }

    @Override // nic
    public final CharSequence g(int i) {
        switch (this.a) {
            case 0:
                return i != 1 ? i != 2 ? ob6.M0(2131747396, null).toUpperCase() : ob6.M0(2131747395, null).toUpperCase() : ob6.M0(2131747390, null).toUpperCase();
            case 1:
            default:
                return super.g(i);
            case 2:
                return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : ob6.M0(2131748049, null) : ob6.M0(2131748047, null) : ob6.M0(2131748050, null) : ob6.M0(2131748051, null);
        }
    }

    @Override // nic
    public final int h(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                if (((xo2) this.b).H1 || i == 2) {
                    return 2;
                }
                return i == 0 ? 0 : 1;
            case 2:
            default:
                return super.h(i);
            case 3:
            case 4:
                return i;
        }
    }

    private final void i(View view, int i, int i2) {
    }

    private final void j(View view, int i, int i2) {
    }

    private final void k(View view, int i, int i2) {
    }
}
