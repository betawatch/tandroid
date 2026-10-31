package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j3 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ l3 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = l3Var;
    }

    @Override // org.telegram.ui.web.z0
    public final void D(boolean z10, String str) {
        l3 l3Var = this.T0;
        if (z10) {
            if (l3Var.r == null) {
                i3 i3Var = l3Var.e;
                b3 b3Var = new b3(l3Var.getContext());
                l3Var.r = b3Var;
                i3Var.addView(b3Var, w7.b6.c(-1.0f, -1));
                l3Var.r.h.setOnClickListener(new a(l3Var, 2));
                org.telegram.messenger.i0.Y3(l3Var.r, l3Var.n, 1.0f, true, false);
            }
            b3 b3Var2 = l3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = b3Var2.e;
            b3Var2.d.setText(org.telegram.messenger.cd.L0(2131742948, null));
            String u10 = org.telegram.ui.web.z0.u(url);
            textView.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? org.telegram.messenger.cd.L0(2131742951, null) : org.telegram.messenger.cd.a0(null, null, 2131742949, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f.setText(str);
            b3 b3Var3 = l3Var.r;
            int i10 = org.telegram.ui.ActionBar.t6.Dl;
            b3Var3.b(org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i10, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.a7.i(i10, l3Var.r, null);
        }
        b3 b3Var4 = l3Var.r;
        l3Var.n = z10;
        org.telegram.messenger.i0.Y3(b3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.z0
    public final void H() {
        this.T0.L.g0(true);
    }

    @Override // org.telegram.ui.web.z0
    public final void I(boolean z10, boolean z11) {
        l3 l3Var = this.T0;
        l3Var.s = !z10;
        l3Var.w = !z11;
        h4 h4Var = l3Var.L;
        h4Var.g0(true);
        if (l3Var == h4Var.u0[0]) {
            m0 m0Var = h4Var.h0;
            if (m0Var.W || m0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (h4Var.H() || h4Var.d0.size() > 1) {
                h4Var.h0.M.c(true, (l3Var.s || h4Var.d0.size() > 1) ? 0.0f : 1.0f);
                h4Var.h0.setBackButtonCached(l3Var.s || h4Var.d0.size() > 1);
                h4Var.h0.P.c();
            } else {
                h4Var.h0.setBackButtonCached(false);
                h4Var.h0.P.c();
            }
            h4Var.h0.setHasForward(l3Var.w);
            m0 m0Var2 = h4Var.h0;
            l3 l3Var2 = h4Var.u0[0];
            m0Var2.setIsTonsite(l3Var2 != null && l3Var2.e());
            m0 m0Var3 = h4Var.h0;
            l3 l3Var3 = h4Var.u0[0];
            m0Var3.setIsLocal(l3Var3 != null && l3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.z0
    public final void J(org.telegram.ui.web.v0 v0Var) {
        this.T0.e.setWebView(v0Var);
    }

    @Override // org.telegram.ui.web.z0
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.w1 w1Var;
        l3 l3Var = this.T0;
        h4 h4Var = l3Var.L;
        if (h4Var.h0 != null && l3Var == h4Var.u0[0] && (w1Var = l3Var.E) != null && w1Var.b() == null) {
            l3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
