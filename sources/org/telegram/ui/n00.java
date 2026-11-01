package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n00 extends s4.s0 {
    public final /* synthetic */ y00 a;

    public n00(y00 y00Var) {
        this.a = y00Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            org.telegram.messenger.i0.v1(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        y00 y00Var = this.a;
        q00 q00Var = y00Var.m0;
        s4.a0 a0Var = y00Var.j0;
        fe.b bVar = y00Var.a;
        yy yyVar = y00Var.n0;
        if (recyclerView.getAdapter() == null || y00Var.d == null) {
            return;
        }
        int L0 = a0Var.L0();
        int N0 = a0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!y00Var.M && abs > 0 && N0 >= b10 - 10 && !y00Var.N) {
            org.telegram.messenger.i0.g3(new yy(this, 2));
        }
        if (y00Var.d != y00Var.U) {
            View pinnedHeader = y00Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(q00Var.c, charSequence)) {
                        q00Var.c = charSequence;
                        q00Var.a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        org.telegram.messenger.i0.r(yyVar);
                        org.telegram.messenger.i0.h3(yyVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.i0.r(yyVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !y00Var.f.isEmpty() && TextUtils.isEmpty(y00Var.Q)) {
            org.telegram.messenger.i0.r(yyVar);
            org.telegram.messenger.i0.h3(yyVar, 1650L);
            bVar.a(true, true);
        }
        s4.c1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            org.telegram.messenger.kj kjVar = t7Var.e <= 0 ? null : t7Var.b[0];
            if (kjVar != null) {
                int i12 = kjVar.k.date;
                q00Var.getClass();
                String u10 = org.telegram.messenger.dd.u(i12, false);
                if (TextUtils.equals(q00Var.c, u10)) {
                    return;
                }
                q00Var.c = u10;
                q00Var.a.t(u10, true, true);
            }
        }
    }
}
