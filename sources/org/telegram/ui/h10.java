package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h10 extends v4.u0 {
    public final /* synthetic */ f40 a;

    public h10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.mj0 mj0Var;
        f40 f40Var = this.a;
        n30 n30Var = f40Var.L1;
        if (i7 != 0) {
            org.telegram.ui.Components.m30 m30Var = f40Var.h2;
            if (m30Var != null) {
                m30Var.a();
            }
            org.telegram.ui.Components.m30 m30Var2 = f40Var.i2;
            if (m30Var2 != null) {
                m30Var2.a();
                return;
            }
            return;
        }
        float L = f40Var.t2 - org.telegram.messenger.g0.L(74.0f);
        n30Var.getChildAt(0);
        if (L + f40Var.t0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !n30Var.canScrollVertically(1) || (mj0Var = (org.telegram.ui.Components.mj0) n30Var.K(0)) == null) {
            return;
        }
        View view = mj0Var.a;
        if (view.getTop() > 0) {
            n30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.t3 t3Var;
        f40 f40Var = this.a;
        if (f40Var.L1.getChildCount() <= 0 || (t3Var = f40Var.V2) == null) {
            return;
        }
        if (!t3Var.u && !t3Var.t && f40Var.T1.N0() > f40Var.K1.G - 5) {
            f40Var.V2.k(false);
        }
        f40.Q0(f40Var);
        u30 u30Var = f40Var.P2;
        if (u30Var != null) {
            u30Var.invalidate();
        }
        f40Var.b.invalidate();
    }
}
