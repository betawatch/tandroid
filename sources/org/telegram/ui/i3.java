package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i3 extends org.telegram.ui.web.x0 {
    public final /* synthetic */ k3 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, int i7) {
        super(i7, context, null, false);
        this.T0 = k3Var;
    }

    @Override // org.telegram.ui.web.x0
    public final void E(boolean z9, String str) {
        k3 k3Var = this.T0;
        if (z9) {
            if (k3Var.r == null) {
                h3 h3Var = k3Var.e;
                b3 b3Var = new b3(k3Var.getContext());
                k3Var.r = b3Var;
                h3Var.addView(b3Var, c8.ha.c(-1.0f, -1));
                k3Var.r.h.setOnClickListener(new a(k3Var, 2));
                org.telegram.messenger.g0.Z3(k3Var.r, k3Var.n, 1.0f, true, false);
            }
            b3 b3Var2 = k3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = b3Var2.e;
            b3Var2.d.setText(org.telegram.messenger.id.M0(2131742925, null));
            String u10 = org.telegram.ui.web.x0.u(url);
            textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? org.telegram.messenger.id.M0(2131742928, null) : org.telegram.messenger.id.a0(null, null, 2131742926, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f.setText(str);
            b3 b3Var3 = k3Var.r;
            int i7 = org.telegram.ui.ActionBar.k6.Dl;
            b3Var3.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i7, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.r6.i(i7, k3Var.r, null);
        }
        b3 b3Var4 = k3Var.r;
        k3Var.n = z9;
        org.telegram.messenger.g0.Z3(b3Var4, z9, 1.0f, true, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.x0
    public final void I() {
        this.T0.L.g0(true);
    }

    @Override // org.telegram.ui.web.x0
    public final void J(boolean z9, boolean z10) {
        k3 k3Var = this.T0;
        k3Var.s = !z9;
        k3Var.w = !z10;
        g4 g4Var = k3Var.L;
        g4Var.g0(true);
        if (k3Var == g4Var.u0[0]) {
            l0 l0Var = g4Var.h0;
            if (l0Var.W || l0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (g4Var.H() || g4Var.d0.size() > 1) {
                g4Var.h0.M.c(true, (k3Var.s || g4Var.d0.size() > 1) ? 0.0f : 1.0f);
                g4Var.h0.setBackButtonCached(k3Var.s || g4Var.d0.size() > 1);
                g4Var.h0.P.c();
            } else {
                g4Var.h0.setBackButtonCached(false);
                g4Var.h0.P.c();
            }
            g4Var.h0.setHasForward(k3Var.w);
            l0 l0Var2 = g4Var.h0;
            k3 k3Var2 = g4Var.u0[0];
            l0Var2.setIsTonsite(k3Var2 != null && k3Var2.e());
            l0 l0Var3 = g4Var.h0;
            k3 k3Var3 = g4Var.u0[0];
            l0Var3.setIsLocal(k3Var3 != null && k3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.x0
    public final void K(org.telegram.ui.web.u0 u0Var) {
        this.T0.e.setWebView(u0Var);
    }

    @Override // org.telegram.ui.web.x0
    public final void U(String str, boolean z9) {
        org.telegram.ui.web.u1 u1Var;
        k3 k3Var = this.T0;
        g4 g4Var = k3Var.L;
        if (g4Var.h0 != null && k3Var == g4Var.u0[0] && (u1Var = k3Var.E) != null && u1Var.b() == null) {
            k3Var.E.d(getWebView());
        }
        super.U(str, z9);
    }
}
