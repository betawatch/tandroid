package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lz extends u4.t0 {
    public final /* synthetic */ wz a;

    public lz(wz wzVar) {
        this.a = wzVar;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 1) {
            org.telegram.messenger.g0.v1(this.a.L.getCurrentFocus());
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        wz wzVar = this.a;
        oz ozVar = wzVar.n0;
        u4.b0 b0Var = wzVar.k0;
        qe.a aVar = wzVar.a;
        fz fzVar = wzVar.o0;
        if (recyclerView.getAdapter() == null || wzVar.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!wzVar.N && abs > 0 && N0 >= b10 - 10 && !wzVar.O) {
            org.telegram.messenger.g0.h3(new fz(this, 1));
        }
        if (wzVar.d != wzVar.V) {
            View pinnedHeader = wzVar.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(ozVar.c, charSequence)) {
                        ozVar.c = charSequence;
                        ozVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(fzVar);
                        org.telegram.messenger.g0.i3(fzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(fzVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !wzVar.f.isEmpty() && TextUtils.isEmpty(wzVar.R)) {
            org.telegram.messenger.g0.r(fzVar);
            org.telegram.messenger.g0.i3(fzVar, 1650L);
            aVar.a(true, true);
        }
        u4.d1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            org.telegram.messenger.zi ziVar = o7Var.e <= 0 ? null : o7Var.b[0];
            if (ziVar != null) {
                int i11 = ziVar.k.date;
                ozVar.getClass();
                String u10 = org.telegram.messenger.bd.u(i11, false);
                if (TextUtils.equals(ozVar.c, u10)) {
                    return;
                }
                ozVar.c = u10;
                ozVar.a.t(u10, true, true);
            }
        }
    }
}
