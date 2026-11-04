package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j3 extends org.telegram.ui.web.w0 {
    public final /* synthetic */ l3 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, Context context, int i3) {
        super(i3, context, null, false);
        this.U0 = l3Var;
    }

    @Override // org.telegram.ui.web.w0
    public final void D(boolean z10, String str) {
        l3 l3Var = this.U0;
        if (z10) {
            if (l3Var.r == null) {
                i3 i3Var = l3Var.e;
                c3 c3Var = new c3(l3Var.getContext());
                l3Var.r = c3Var;
                i3Var.addView(c3Var, b8.mf.c(-1.0f, -1));
                l3Var.r.h.setOnClickListener(new a(l3Var, 2));
                org.telegram.messenger.g0.Z3(l3Var.r, l3Var.n, 1.0f, true, false);
            }
            c3 c3Var2 = l3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = c3Var2.e;
            c3Var2.d.setText(org.telegram.messenger.bd.M0(2131742932, null));
            String u10 = org.telegram.ui.web.w0.u(url);
            textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? org.telegram.messenger.bd.M0(2131742935, null) : org.telegram.messenger.bd.a0(null, null, 2131742933, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            c3Var2.f.setText(str);
            c3 c3Var3 = l3Var.r;
            int i3 = org.telegram.ui.ActionBar.k6.Dl;
            c3Var3.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i3, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.r6.i(i3, l3Var.r, null);
        }
        c3 c3Var4 = l3Var.r;
        l3Var.n = z10;
        org.telegram.messenger.g0.Z3(c3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.w0
    public final void H() {
        this.U0.M.g0(true);
    }

    @Override // org.telegram.ui.web.w0
    public final void I(boolean z10, boolean z11) {
        l3 l3Var = this.U0;
        l3Var.s = !z10;
        l3Var.w = !z11;
        i4 i4Var = l3Var.M;
        i4Var.g0(true);
        if (l3Var == i4Var.v0[0]) {
            m0 m0Var = i4Var.i0;
            if (m0Var.a0 || m0Var.U) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (i4Var.H() || i4Var.e0.size() > 1) {
                i4Var.i0.N.c(true, (l3Var.s || i4Var.e0.size() > 1) ? 0.0f : 1.0f);
                i4Var.i0.setBackButtonCached(l3Var.s || i4Var.e0.size() > 1);
                i4Var.i0.Q.c();
            } else {
                i4Var.i0.setBackButtonCached(false);
                i4Var.i0.Q.c();
            }
            i4Var.i0.setHasForward(l3Var.w);
            m0 m0Var2 = i4Var.i0;
            l3 l3Var2 = i4Var.v0[0];
            m0Var2.setIsTonsite(l3Var2 != null && l3Var2.e());
            m0 m0Var3 = i4Var.i0;
            l3 l3Var3 = i4Var.v0[0];
            m0Var3.setIsLocal(l3Var3 != null && l3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.w0
    public final void J(org.telegram.ui.web.t0 t0Var) {
        this.U0.e.setWebView(t0Var);
    }

    @Override // org.telegram.ui.web.w0
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.s1 s1Var;
        l3 l3Var = this.U0;
        i4 i4Var = l3Var.M;
        if (i4Var.i0 != null && l3Var == i4Var.v0[0] && (s1Var = l3Var.F) != null && s1Var.b() == null) {
            l3Var.F.d(getWebView());
        }
        super.T(str, z10);
    }
}
