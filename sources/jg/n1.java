package jg;

import android.view.ViewGroup;
import bi.i3;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n1 extends bk0 {
    public h1 c;
    public Integer d;
    public i3 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.bk0
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
        i3 i3Var = new i3(5, viewGroup.getContext(), this);
        this.e = i3Var;
        return new kj0(i3Var);
    }
}
