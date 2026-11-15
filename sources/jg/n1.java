package jg;

import android.view.ViewGroup;
import bi.o2;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n1 extends tj0 {
    public h1 c;
    public Integer d;
    public o2 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.b() == 0) {
            return false;
        }
        return this.c.D(e1Var);
    }

    @Override // v4.h0
    public final int b() {
        h1 h1Var = this.c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.c.d(i7 - 1);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (i7 > 0) {
            this.c.t(e1Var, i7 - 1);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 != -983904) {
            return this.c.x(viewGroup, i7);
        }
        o2 o2Var = new o2(5, viewGroup.getContext(), this);
        this.e = o2Var;
        return new cj0(o2Var);
    }
}
