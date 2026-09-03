package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g00 extends ql0 {
    public final Context c;
    public final /* synthetic */ k00 d;

    public g00(k00 k00Var, Context context) {
        this.d = k00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.o0
    public final long i(int i10) {
        return this.d.h0.get(i10);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        i00 i00Var = (i00) l1Var.a;
        int id2 = i00Var.b != null ? i00Var.getId() : -1;
        h00 h00Var = (h00) this.d.h.get(i10);
        i00Var.b = h00Var;
        i00Var.e = i10;
        i00Var.setContentDescription(h00Var.b);
        i00Var.requestLayout();
        boolean z4 = i00Var.n;
        h00 h00Var2 = i00Var.b;
        if (z4 != (h00Var2 != null && h00Var2.g)) {
            u5.release(i00Var, i00Var.r);
            u5.release(i00Var, i00Var.L);
            u5.release(i00Var, i00Var.N);
            u5.release(i00Var, i00Var.P);
            if (i00Var.i0) {
                i00Var.r = u5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.r, i00Var.s);
                i00Var.L = u5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.L, i00Var.M);
                i00Var.N = u5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.N, i00Var.O);
                i00Var.P = u5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.P, i00Var.Q);
            }
            i00Var.n = i00Var.b.g;
        }
        if (id2 != i00Var.getId()) {
            i00Var.h0 = i00Var.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new dl0(new i00(this.d, this.c));
    }
}
