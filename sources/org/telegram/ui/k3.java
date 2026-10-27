package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k3 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ m3 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = m3Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void D(boolean z10, String str) {
        m3 m3Var = this.T0;
        if (z10) {
            if (m3Var.r == null) {
                j3 j3Var = m3Var.e;
                c3 c3Var = new c3(m3Var.getContext());
                m3Var.r = c3Var;
                j3Var.addView(c3Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                m3Var.r.h.setOnClickListener(new a(m3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(m3Var.r, m3Var.n, 1.0f, false);
            }
            c3 c3Var2 = m3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = c3Var2.e;
            c3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.a1.u(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            c3Var2.f.setText(str);
            c3 c3Var3 = m3Var.r;
            int i10 = org.telegram.ui.ActionBar.y6.Pk;
            c3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, i10, false)) <= 0.721f, false);
            org.telegram.ui.ActionBar.f7.i(i10, m3Var.r, null);
        }
        c3 c3Var4 = m3Var.r;
        m3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(c3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.a1
    public final void H() {
        this.T0.L.i0(true);
    }

    @Override // org.telegram.ui.web.a1
    public final void I(boolean z10, boolean z11) {
        m3 m3Var = this.T0;
        m3Var.s = !z10;
        m3Var.v = !z11;
        j4 j4Var = m3Var.L;
        j4Var.i0(true);
        if (m3Var == j4Var.u0[0]) {
            l0 l0Var = j4Var.h0;
            if (l0Var.W || l0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (j4Var.J() || j4Var.d0.size() > 1) {
                j4Var.h0.M.c((m3Var.s || j4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                j4Var.h0.setBackButtonCached(m3Var.s || j4Var.d0.size() > 1);
                j4Var.h0.P.f();
            } else {
                j4Var.h0.setBackButtonCached(false);
                j4Var.h0.P.f();
            }
            j4Var.h0.setHasForward(m3Var.v);
            l0 l0Var2 = j4Var.h0;
            m3 m3Var2 = j4Var.u0[0];
            l0Var2.setIsTonsite(m3Var2 != null && m3Var2.e());
            l0 l0Var3 = j4Var.h0;
            m3 m3Var3 = j4Var.u0[0];
            l0Var3.setIsLocal(m3Var3 != null && m3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.a1
    public final void J(org.telegram.ui.web.x0 x0Var) {
        this.T0.e.setWebView(x0Var);
    }

    @Override // org.telegram.ui.web.a1
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.f2 f2Var;
        m3 m3Var = this.T0;
        j4 j4Var = m3Var.L;
        if (j4Var.h0 != null && m3Var == j4Var.u0[0] && (f2Var = m3Var.E) != null && f2Var.b() == null) {
            m3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
