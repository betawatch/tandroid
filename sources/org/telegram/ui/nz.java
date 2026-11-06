package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nz extends v4.s0 {
    public final /* synthetic */ yz a;

    public nz(yz yzVar) {
        this.a = yzVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.a.K.getCurrentFocus());
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        yz yzVar = this.a;
        qz qzVar = yzVar.m0;
        v4.b0 b0Var = yzVar.j0;
        te.a aVar = yzVar.a;
        hz hzVar = yzVar.n0;
        if (recyclerView.getAdapter() == null || yzVar.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!yzVar.M && abs > 0 && N0 >= b10 - 10 && !yzVar.N) {
            org.telegram.messenger.g0.h3(new hz(this, 1));
        }
        if (yzVar.d != yzVar.U) {
            View pinnedHeader = yzVar.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(qzVar.c, charSequence)) {
                        qzVar.c = charSequence;
                        qzVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(hzVar);
                        org.telegram.messenger.g0.i3(hzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(hzVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !yzVar.f.isEmpty() && TextUtils.isEmpty(yzVar.Q)) {
            org.telegram.messenger.g0.r(hzVar);
            org.telegram.messenger.g0.i3(hzVar, 1650L);
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
                qzVar.getClass();
                String u10 = org.telegram.messenger.hd.u(i11, false);
                if (TextUtils.equals(qzVar.c, u10)) {
                    return;
                }
                qzVar.c = u10;
                qzVar.a.t(u10, true, true);
            }
        }
    }
}
