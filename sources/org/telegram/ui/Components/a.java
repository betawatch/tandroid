package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ a(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m0 m0Var = this.b;
        switch (i7) {
            case 0:
                l0 l0Var = m0Var.v2;
                if (l0Var == null || l0Var.getSelectedTone() == null) {
                    hi.u3 u3Var = m0Var.z2;
                    if (u3Var != null) {
                        u3Var.f(true);
                        m0Var.z2 = null;
                    }
                    hi.u3 u3Var2 = new hi.u3(m0Var.getContext(), 1);
                    m0Var.z2 = u3Var2;
                    u3Var2.t();
                    m0Var.z2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    m0Var.z2.s(20.0f);
                    m0Var.z2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -16777216));
                    m0Var.z2.v(org.telegram.messenger.gd.N0(2131755000, null));
                    if (i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, m0Var.J0)) < 0.5d) {
                        m0Var.z2.j(956301311);
                        hi.u3 u3Var3 = m0Var.z2;
                        u3Var3.I.u(-1);
                        u3Var3.K.setColor(-1);
                        m0Var.z2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, -16777216));
                    }
                    m0Var.z2.o(0.5f, 0.0f);
                    hi.u3 u3Var4 = m0Var.z2;
                    u3Var4.d = 8000L;
                    m0Var.b.addView(u3Var4, c8.na.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                    m0Var.z2.x();
                    m0Var.D1();
                    break;
                }
                break;
            case 1:
                if (!m0Var.I2) {
                    m0Var.B2.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (m0Var.I2) {
                    m0Var.A2.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.I3(m0Var.y2.d);
                break;
            default:
                m0Var.u1(0, 0, false);
                m0Var.dismiss();
                break;
        }
    }
}
