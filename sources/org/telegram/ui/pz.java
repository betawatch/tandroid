package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pz extends v4.s0 {
    public final /* synthetic */ a00 a;

    public pz(a00 a00Var) {
        this.a = a00Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.a.K.getCurrentFocus());
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        a00 a00Var = this.a;
        sz szVar = a00Var.m0;
        v4.b0 b0Var = a00Var.j0;
        te.a aVar = a00Var.a;
        jz jzVar = a00Var.n0;
        if (recyclerView.getAdapter() == null || a00Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!a00Var.M && abs > 0 && N0 >= b10 - 10 && !a00Var.N) {
            org.telegram.messenger.g0.h3(new jz(this, 1));
        }
        if (a00Var.d != a00Var.U) {
            View pinnedHeader = a00Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(szVar.c, charSequence)) {
                        szVar.c = charSequence;
                        szVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(jzVar);
                        org.telegram.messenger.g0.i3(jzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(jzVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !a00Var.f.isEmpty() && TextUtils.isEmpty(a00Var.Q)) {
            org.telegram.messenger.g0.r(jzVar);
            org.telegram.messenger.g0.i3(jzVar, 1650L);
            aVar.a(true, true);
        }
        v4.d1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            org.telegram.messenger.ij ijVar = p7Var.e <= 0 ? null : p7Var.b[0];
            if (ijVar != null) {
                int i11 = ijVar.k.date;
                szVar.getClass();
                String u10 = org.telegram.messenger.id.u(i11, false);
                if (TextUtils.equals(szVar.c, u10)) {
                    return;
                }
                szVar.c = u10;
                szVar.a.t(u10, true, true);
            }
        }
    }
}
