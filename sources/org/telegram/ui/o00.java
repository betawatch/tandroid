package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o00 extends s4.s0 {
    public final /* synthetic */ z00 a;

    public o00(z00 z00Var) {
        this.a = z00Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            org.telegram.messenger.i0.v1(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var = this.a;
        r00 r00Var = z00Var.m0;
        s4.a0 a0Var = z00Var.j0;
        fe.b bVar = z00Var.a;
        zy zyVar = z00Var.n0;
        if (recyclerView.getAdapter() == null || z00Var.d == null) {
            return;
        }
        int L0 = a0Var.L0();
        int N0 = a0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!z00Var.M && abs > 0 && N0 >= b10 - 10 && !z00Var.N) {
            org.telegram.messenger.i0.g3(new zy(this, 2));
        }
        if (z00Var.d != z00Var.U) {
            View pinnedHeader = z00Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(r00Var.c, charSequence)) {
                        r00Var.c = charSequence;
                        r00Var.a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        org.telegram.messenger.i0.r(zyVar);
                        org.telegram.messenger.i0.h3(zyVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.i0.r(zyVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !z00Var.f.isEmpty() && TextUtils.isEmpty(z00Var.Q)) {
            org.telegram.messenger.i0.r(zyVar);
            org.telegram.messenger.i0.h3(zyVar, 1650L);
            bVar.a(true, true);
        }
        s4.c1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            org.telegram.messenger.jj jjVar = t7Var.e <= 0 ? null : t7Var.b[0];
            if (jjVar != null) {
                int i12 = jjVar.k.date;
                r00Var.getClass();
                String u10 = org.telegram.messenger.cd.u(i12, false);
                if (TextUtils.equals(r00Var.c, u10)) {
                    return;
                }
                r00Var.c = u10;
                r00Var.a.t(u10, true, true);
            }
        }
    }
}
