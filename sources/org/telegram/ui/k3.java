package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k3 extends org.telegram.ui.web.d1 {
    public final /* synthetic */ m3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = m3Var;
    }

    @Override // org.telegram.ui.web.d1
    public final void E(String str, boolean z10) {
        m3 m3Var = this.S0;
        if (z10) {
            if (m3Var.r == null) {
                j3 j3Var = m3Var.e;
                d3 d3Var = new d3(m3Var.getContext());
                m3Var.r = d3Var;
                j3Var.addView(d3Var, w7.x5.c(-1.0f, -1));
                m3Var.r.h.setOnClickListener(new a(m3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(m3Var.r, m3Var.n, 1.0f, false);
            }
            d3 d3Var2 = m3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = d3Var2.e;
            d3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.d1.v(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((v == null || Uri.parse(v) == null || Uri.parse(v).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            d3Var2.f.setText(str);
            d3 d3Var3 = m3Var.r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            d3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
            m3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        d3 d3Var4 = m3Var.r;
        m3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(d3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.d1
    public final void I() {
        this.S0.K.i0(true);
    }

    @Override // org.telegram.ui.web.d1
    public final void J(boolean z10, boolean z11) {
        m3 m3Var = this.S0;
        m3Var.s = !z10;
        m3Var.v = !z11;
        i4 i4Var = m3Var.K;
        i4Var.i0(true);
        if (m3Var == i4Var.u0[0]) {
            k0 k0Var = i4Var.h0;
            if (k0Var.W || k0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = i4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (i4Var.J() || i4Var.d0.size() > 1) {
                i4Var.h0.M.c((m3Var.s || i4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                i4Var.h0.setBackButtonCached(m3Var.s || i4Var.d0.size() > 1);
                i4Var.h0.P.f();
            } else {
                i4Var.h0.setBackButtonCached(false);
                i4Var.h0.P.f();
            }
            i4Var.h0.setHasForward(m3Var.v);
            k0 k0Var2 = i4Var.h0;
            m3 m3Var2 = i4Var.u0[0];
            k0Var2.setIsTonsite(m3Var2 != null && m3Var2.e());
            k0 k0Var3 = i4Var.h0;
            m3 m3Var3 = i4Var.u0[0];
            k0Var3.setIsLocal(m3Var3 != null && m3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.d1
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.e.setWebView(z0Var);
    }

    @Override // org.telegram.ui.web.d1
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.h2 h2Var;
        m3 m3Var = this.S0;
        i4 i4Var = m3Var.K;
        if (i4Var.h0 != null && m3Var == i4Var.u0[0] && (h2Var = m3Var.y) != null && h2Var.b() == null) {
            m3Var.y.d(getWebView());
        }
        super.U(str, z10);
    }
}
