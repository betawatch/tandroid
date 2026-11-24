// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class or7 extends n39 {
    public kz6 c;
    public Integer d;
    public sb e;
    public boolean f;
    public int h;

    @Override // n39
    public final boolean D(s49 s49Var) {
        if (s49Var.b() == 0) {
            return false;
        }
        return this.c.D(s49Var);
    }

    @Override // w39
    public final int b() {
        kz6 kz6Var = this.c;
        int K = kz6Var.K();
        kz6Var.N0 = K;
        return K + 1;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.c.d(i - 1);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (i > 0) {
            this.c.t(s49Var, i - 1);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.c.x(viewGroup, i);
        }
        sb sbVar = new sb((byte) 21, viewGroup.getContext(), this);
        this.e = sbVar;
        return new y29(sbVar);
    }
}
