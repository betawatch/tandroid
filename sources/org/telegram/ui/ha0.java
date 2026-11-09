package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ha0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ ha0(ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    ra0 ra0Var = this.b;
                    if (ra0Var.t0 && ra0Var.u0) {
                        org.telegram.messenger.g0.v1(ra0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z9 = i7 != 0;
                ra0 ra0Var2 = this.b;
                ra0Var2.M = z9;
                if (!z9 && ra0Var2.H != null) {
                    ra0Var2.H = null;
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                ra0 ra0Var = this.b;
                ra0Var.K0(false);
                if (ra0Var.H != null) {
                    ra0Var.J += i10;
                    break;
                }
                break;
        }
    }
}
