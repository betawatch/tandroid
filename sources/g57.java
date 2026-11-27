// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g57 extends bmb {
    public final /* synthetic */ m57 w0;

    public g57(m57 m57Var) {
        this.w0 = m57Var;
        this.g0 = m57Var.d0.G;
    }

    @Override // mmb
    public final void H(int i, int i2, r47 r47Var) {
        ou1 ou1Var;
        r47 r47Var2;
        m57 m57Var = this.w0;
        g57 g57Var = m57Var.e;
        int i3 = g57Var.v - g57Var.u;
        s57 s57Var = m57Var.d0;
        if (i3 > uc7.s1(s57Var.x).k4.V1.f()) {
            m57Var.f();
            return;
        }
        v47 v47Var = s57Var.d;
        v47Var.e = g57Var.u;
        v47Var.f = g57Var.v;
        r47 a = m57Var.a(r47Var);
        if (a != null && ((ou1Var = s57Var.d.d) == null || ou1Var.m || (r47Var2 = ou1Var.a) == null || r47Var2.e1() != a.e1())) {
            s57Var.d.d = ou1.b(i, i2, a);
        }
        s57Var.b();
        s57Var.a(true);
    }

    @Override // mmb
    public final boolean a() {
        r47 a;
        TLRPC.Message message;
        m57 m57Var = this.w0;
        if (m57Var.a == 0 && (a = m57Var.a(null)) != null && (message = a.k) != null && message.rich_message != null) {
            return false;
        }
        v47 v47Var = m57Var.d0.d;
        return v47Var == null || !v47Var.s;
    }

    @Override // mmb
    public final boolean d() {
        r47 a;
        TLRPC.Message message;
        m57 m57Var = this.w0;
        int i = m57Var.a;
        if (i != 0 || m57Var.d0.d.i) {
            return false;
        }
        return i != 0 || (a = m57Var.a(null)) == null || (message = a.k) == null || message.rich_message == null || ll9.c(m57Var.a(null));
    }

    @Override // mmb
    public final vnb p() {
        return this.g0;
    }

    @Override // bmb, mmb
    public final void v() {
        super.v();
        gu guVar = this.w0.f;
        if (guVar != null) {
            guVar.invalidate();
        }
    }

    @Override // mmb
    public final boolean y(r47 r47Var) {
        m57 m57Var = this.w0;
        return m57Var.a == 0 && !m57Var.d0.d.i && w();
    }
}
