package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ o3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = o3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void D(boolean z10, String str) {
        o3 o3Var = this.S0;
        if (z10) {
            if (o3Var.r == null) {
                l3 l3Var = o3Var.e;
                f3 f3Var = new f3(o3Var.getContext());
                o3Var.r = f3Var;
                l3Var.addView(f3Var, w7.z5.d(-1.0f, -1));
                o3Var.r.h.setOnClickListener(new a(o3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(o3Var.r, o3Var.n, 1.0f, false);
            }
            f3 f3Var2 = o3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = f3Var2.e;
            f3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.c1.u(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((u10 == null || Uri.parse(u10) == null || Uri.parse(u10).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            f3Var2.f.setText(str);
            f3 f3Var3 = o3Var.r;
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            f3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, i10, false)) <= 0.721f, false);
            o3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
        f3 f3Var4 = o3Var.r;
        o3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void H() {
        this.S0.K.i0(true);
    }

    @Override // org.telegram.ui.web.c1
    public final void I(boolean z10, boolean z11) {
        o3 o3Var = this.S0;
        o3Var.s = !z10;
        o3Var.v = !z11;
        k4 k4Var = o3Var.K;
        k4Var.i0(true);
        if (o3Var == k4Var.u0[0]) {
            m0 m0Var = k4Var.h0;
            if (m0Var.W || m0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (k4Var.J() || k4Var.d0.size() > 1) {
                k4Var.h0.M.c((o3Var.s || k4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                k4Var.h0.setBackButtonCached(o3Var.s || k4Var.d0.size() > 1);
                k4Var.h0.P.f();
            } else {
                k4Var.h0.setBackButtonCached(false);
                k4Var.h0.P.f();
            }
            k4Var.h0.setHasForward(o3Var.v);
            m0 m0Var2 = k4Var.h0;
            o3 o3Var2 = k4Var.u0[0];
            m0Var2.setIsTonsite(o3Var2 != null && o3Var2.e());
            m0 m0Var3 = k4Var.h0;
            o3 o3Var3 = k4Var.u0[0];
            m0Var3.setIsLocal(o3Var3 != null && o3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.c1
    public final void J(org.telegram.ui.web.z0 z0Var) {
        this.S0.e.setWebView(z0Var);
    }

    @Override // org.telegram.ui.web.c1
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        o3 o3Var = this.S0;
        k4 k4Var = o3Var.K;
        if (k4Var.h0 != null && o3Var == k4Var.u0[0] && (g2Var = o3Var.y) != null && g2Var.b() == null) {
            o3Var.y.d(getWebView());
        }
        super.T(str, z10);
    }
}
