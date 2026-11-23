package jg;

import android.view.ViewGroup;
import bi.o3;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n1 extends dk0 {
    public h1 c;
    public Integer d;
    public o3 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() == 0) {
            return false;
        }
        return this.c.D(f1Var);
    }

    @Override // v4.i0
    public final int b() {
        h1 h1Var = this.c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.c.d(i7 - 1);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 > 0) {
            this.c.t(f1Var, i7 - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 != -983904) {
            return this.c.x(viewGroup, i7);
        }
        o3 o3Var = new o3(5, viewGroup.getContext(), this);
        this.e = o3Var;
        return new mj0(o3Var);
    }
}
