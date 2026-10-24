package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l3 extends org.telegram.ui.web.b1 {
    public final /* synthetic */ n3 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3 n3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = n3Var;
    }

    @Override // org.telegram.ui.web.b1
    public final void D(boolean z10, String str) {
        n3 n3Var = this.T0;
        if (z10) {
            if (n3Var.r == null) {
                k3 k3Var = n3Var.e;
                e3 e3Var = new e3(n3Var.getContext());
                n3Var.r = e3Var;
                k3Var.addView(e3Var, w7.z5.c(-1.0f, -1));
                n3Var.r.h.setOnClickListener(new a(n3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(n3Var.r, n3Var.n, 1.0f, false);
            }
            e3 e3Var2 = n3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = e3Var2.e;
            e3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.b1.u(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            e3Var2.f.setText(str);
            e3 e3Var3 = n3Var.r;
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            e3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, i10, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.r6.i(i10, n3Var.r, null);
        }
        e3 e3Var4 = n3Var.r;
        n3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(e3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.b1
    public final void H() {
        this.T0.L.i0(true);
    }

    @Override // org.telegram.ui.web.b1
    public final void I(boolean z10, boolean z11) {
        n3 n3Var = this.T0;
        n3Var.s = !z10;
        n3Var.v = !z11;
        k4 k4Var = n3Var.L;
        k4Var.i0(true);
        if (n3Var == k4Var.u0[0]) {
            m0 m0Var = k4Var.h0;
            if (m0Var.W || m0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (k4Var.J() || k4Var.d0.size() > 1) {
                k4Var.h0.M.c((n3Var.s || k4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                k4Var.h0.setBackButtonCached(n3Var.s || k4Var.d0.size() > 1);
                k4Var.h0.P.f();
            } else {
                k4Var.h0.setBackButtonCached(false);
                k4Var.h0.P.f();
            }
            k4Var.h0.setHasForward(n3Var.v);
            m0 m0Var2 = k4Var.h0;
            n3 n3Var2 = k4Var.u0[0];
            m0Var2.setIsTonsite(n3Var2 != null && n3Var2.e());
            m0 m0Var3 = k4Var.h0;
            n3 n3Var3 = k4Var.u0[0];
            m0Var3.setIsLocal(n3Var3 != null && n3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.b1
    public final void J(org.telegram.ui.web.y0 y0Var) {
        this.T0.e.setWebView(y0Var);
    }

    @Override // org.telegram.ui.web.b1
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        n3 n3Var = this.T0;
        k4 k4Var = n3Var.L;
        if (k4Var.h0 != null && n3Var == k4Var.u0[0] && (g2Var = n3Var.E) != null && g2Var.b() == null) {
            n3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
