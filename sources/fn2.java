// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fn2 extends ogc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 1:
                ((np2) view).getClass();
                break;
            case 2:
                q93 q93Var = (q93) view;
                q93Var.g3 = i;
                q93Var.n3.clear();
                q93Var.u3 = q93Var.z1(6) + q93Var.B1(6) <= 0;
                q93Var.C1();
                q93Var.D1(false);
                q93Var.w0(0);
                break;
        }
    }

    @Override // ogc
    public final View d(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nh2 nh2Var = (nh2) obj;
                return i != 1 ? i != 2 ? (in2) nh2Var.b : (kn2) nh2Var.d : (hn2) nh2Var.c;
            case 1:
                pp2 pp2Var = (pp2) obj;
                return i == 2 ? pp2Var.w1 : i == 0 ? pp2Var.u1 : pp2Var.v1;
            case 2:
                t93 t93Var = (t93) obj;
                q93 q93Var = new q93(t93Var, t93Var.getParentActivity());
                t93Var.e.add(q93Var);
                return q93Var;
            case 3:
                return (View) ((mk7) obj).m1.get(i);
            default:
                d38 d38Var = (d38) obj;
                if (i == 1) {
                    return d38Var.h;
                }
                if (i == 0) {
                    return d38Var.n;
                }
                return null;
        }
    }

    @Override // ogc
    public final int e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return 3;
            case 1:
                return ((pp2) obj).H1 ? 1 : 3;
            case 2:
                return 4;
            case 3:
                return ((mk7) obj).m1.size();
            default:
                return 2;
        }
    }

    @Override // ogc
    public final CharSequence g(int i) {
        switch (this.a) {
            case 0:
                return i != 1 ? i != 2 ? jb6.M0(2131747402, null).toUpperCase() : jb6.M0(2131747401, null).toUpperCase() : jb6.M0(2131747396, null).toUpperCase();
            case 1:
            default:
                return super.g(i);
            case 2:
                return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : jb6.M0(2131748052, null) : jb6.M0(2131748050, null) : jb6.M0(2131748053, null) : jb6.M0(2131748054, null);
        }
    }

    @Override // ogc
    public final int h(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                if (((pp2) this.b).H1 || i == 2) {
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
