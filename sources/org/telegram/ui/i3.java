package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i3 extends org.telegram.ui.web.v0 {
    public final /* synthetic */ k3 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, int i7) {
        super(i7, context, null, false);
        this.U0 = k3Var;
    }

    @Override // org.telegram.ui.web.v0
    public final void E(boolean z10, String str) {
        k3 k3Var = this.U0;
        if (z10) {
            if (k3Var.r == null) {
                h3 h3Var = k3Var.e;
                b3 b3Var = new b3(k3Var.getContext());
                k3Var.r = b3Var;
                h3Var.addView(b3Var, c8.ma.c(-1.0f, -1));
                k3Var.r.h.setOnClickListener(new a(k3Var, 2));
                org.telegram.messenger.g0.X3(k3Var.r, k3Var.n, 1.0f, true, false);
            }
            b3 b3Var2 = k3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = b3Var2.e;
            b3Var2.d.setText(org.telegram.messenger.gd.M0(2131742664, null));
            String u10 = org.telegram.ui.web.v0.u(url);
            textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? org.telegram.messenger.gd.M0(2131742667, null) : org.telegram.messenger.gd.a0(null, null, 2131742665, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f.setText(str);
            b3 b3Var3 = k3Var.r;
            int i7 = org.telegram.ui.ActionBar.n6.Gl;
            b3Var3.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, i7, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.u6.h(i7, k3Var.r, null);
        }
        b3 b3Var4 = k3Var.r;
        k3Var.n = z10;
        org.telegram.messenger.g0.X3(b3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.v0
    public final void I() {
        this.U0.M.g0(true);
    }

    @Override // org.telegram.ui.web.v0
    public final void J(boolean z10, boolean z11) {
        k3 k3Var = this.U0;
        k3Var.s = !z10;
        k3Var.w = !z11;
        g4 g4Var = k3Var.M;
        g4Var.g0(true);
        if (k3Var == g4Var.v0[0]) {
            l0 l0Var = g4Var.i0;
            if (l0Var.a0 || l0Var.U) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (g4Var.H() || g4Var.e0.size() > 1) {
                g4Var.i0.N.c(true, (k3Var.s || g4Var.e0.size() > 1) ? 0.0f : 1.0f);
                g4Var.i0.setBackButtonCached(k3Var.s || g4Var.e0.size() > 1);
                g4Var.i0.Q.c();
            } else {
                g4Var.i0.setBackButtonCached(false);
                g4Var.i0.Q.c();
            }
            g4Var.i0.setHasForward(k3Var.w);
            l0 l0Var2 = g4Var.i0;
            k3 k3Var2 = g4Var.v0[0];
            l0Var2.setIsTonsite(k3Var2 != null && k3Var2.e());
            l0 l0Var3 = g4Var.i0;
            k3 k3Var3 = g4Var.v0[0];
            l0Var3.setIsLocal(k3Var3 != null && k3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.v0
    public final void K(org.telegram.ui.web.s0 s0Var) {
        this.U0.e.setWebView(s0Var);
    }

    @Override // org.telegram.ui.web.v0
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.t1 t1Var;
        k3 k3Var = this.U0;
        g4 g4Var = k3Var.M;
        if (g4Var.i0 != null && k3Var == g4Var.v0[0] && (t1Var = k3Var.F) != null && t1Var.b() == null) {
            k3Var.F.d(getWebView());
        }
        super.U(str, z10);
    }
}
