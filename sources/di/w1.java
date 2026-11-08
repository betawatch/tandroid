package di;

import android.app.Activity;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ w1(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 3;
        boolean z9 = false;
        i4 i4Var = this.b;
        switch (i7) {
            case 0:
                i4Var.S1.setVisibility(8);
                break;
            case 1:
                if (!i4Var.s0.G0) {
                    i4Var.i3 = null;
                    if (i4Var.q0 == null) {
                        fi.m3 m3Var = new fi.m3(i4Var.getContext(), 3);
                        m3Var.o(1.0f, -22.0f);
                        i4Var.q0 = m3Var;
                        m3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), qs.P3));
                        fi.m3 m3Var2 = i4Var.q0;
                        m3Var2.U = false;
                        m3Var2.u(id.M0(2131746400, null));
                        i4Var.q0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        i4Var.L0.addView(i4Var.q0, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, i4Var.g2 ? 0.0f : 56.0f));
                    }
                    i4Var.q0.w();
                    iz.H(true);
                    break;
                }
                break;
            case 2:
                i4Var.O0();
                break;
            case 3:
                ((g9) i4Var.z1).b(true);
                break;
            case 4:
                i4Var.p0(true);
                break;
            case 5:
                p9 p9Var = i4Var.s0;
                if (p9Var != null) {
                    p9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                i4Var.M0();
                break;
            case 7:
                i4Var.u3 = 0L;
                o2 o2Var = i4Var.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    i4Var.K1.T1();
                    i4Var.p0(true);
                    break;
                }
                break;
            case 8:
                Activity W = org.telegram.messenger.g0.W(i4Var.getContext());
                if (W != null) {
                    z0 z0Var = new z0(i10, i4Var, W);
                    p9 p9Var2 = ((g9) i4Var.z1).d;
                    o9 o9Var = p9Var2.z0;
                    if (o9Var != null) {
                        z9 = o9Var.release(z0Var);
                        p9Var2.z0 = null;
                    }
                    if (!z9) {
                        org.telegram.messenger.g0.i3(z0Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                p9 p9Var3 = ((g9) i4Var.z1).d;
                p9Var3.h1 = false;
                p9Var3.V();
                break;
            case 10:
                i4Var.J0(null);
                break;
            case 11:
                i4Var.a1(false);
                qp.e1().edit().putInt("taptostorysoundhint", qp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                i4Var.D3 = true;
                i4Var.setActive(false);
                break;
        }
    }
}
