package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oz extends v4.t0 {
    public final /* synthetic */ zz a;

    public oz(zz zzVar) {
        this.a = zzVar;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.a.L.getCurrentFocus());
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        zz zzVar = this.a;
        rz rzVar = zzVar.n0;
        v4.b0 b0Var = zzVar.k0;
        te.a aVar = zzVar.a;
        iz izVar = zzVar.o0;
        if (recyclerView.getAdapter() == null || zzVar.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!zzVar.N && abs > 0 && N0 >= b10 - 10 && !zzVar.O) {
            org.telegram.messenger.g0.h3(new iz(this, 1));
        }
        if (zzVar.d != zzVar.V) {
            View pinnedHeader = zzVar.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(rzVar.c, charSequence)) {
                        rzVar.c = charSequence;
                        rzVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(izVar);
                        org.telegram.messenger.g0.i3(izVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(izVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !zzVar.f.isEmpty() && TextUtils.isEmpty(zzVar.R)) {
            org.telegram.messenger.g0.r(izVar);
            org.telegram.messenger.g0.i3(izVar, 1650L);
            aVar.a(true, true);
        }
        v4.e1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            org.telegram.messenger.gj gjVar = o7Var.e <= 0 ? null : o7Var.b[0];
            if (gjVar != null) {
                int i11 = gjVar.k.date;
                rzVar.getClass();
                String u10 = org.telegram.messenger.hd.u(i11, false);
                if (TextUtils.equals(rzVar.c, u10)) {
                    return;
                }
                rzVar.c = u10;
                rzVar.a.t(u10, true, true);
            }
        }
    }
}
