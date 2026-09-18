package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class j3 extends org.telegram.ui.web.d1 {
    public final /* synthetic */ l3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = l3Var;
    }

    @Override // org.telegram.ui.web.d1
    public final void E(String str, boolean z10) {
        l3 l3Var = this.S0;
        if (z10) {
            if (l3Var.r == null) {
                i3 i3Var = l3Var.e;
                c3 c3Var = new c3(l3Var.getContext());
                l3Var.r = c3Var;
                i3Var.addView(c3Var, w7.y5.c(-1.0f, -1));
                l3Var.r.h.setOnClickListener(new a(l3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(l3Var.r, l3Var.n, 1.0f, false);
            }
            c3 c3Var2 = l3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = c3Var2.e;
            c3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.d1.v(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((v == null || Uri.parse(v) == null || Uri.parse(v).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            c3Var2.f.setText(str);
            c3 c3Var3 = l3Var.r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            c3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
            l3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        c3 c3Var4 = l3Var.r;
        l3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(c3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.d1
    public final void I() {
        this.S0.K.i0(true);
    }

    @Override // org.telegram.ui.web.d1
    public final void J(boolean z10, boolean z11) {
        l3 l3Var = this.S0;
        l3Var.s = !z10;
        l3Var.v = !z11;
        h4 h4Var = l3Var.K;
        h4Var.i0(true);
        if (l3Var == h4Var.u0[0]) {
            k0 k0Var = h4Var.h0;
            if (k0Var.W || k0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (h4Var.J() || h4Var.d0.size() > 1) {
                h4Var.h0.M.c((l3Var.s || h4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                h4Var.h0.setBackButtonCached(l3Var.s || h4Var.d0.size() > 1);
                h4Var.h0.P.f();
            } else {
                h4Var.h0.setBackButtonCached(false);
                h4Var.h0.P.f();
            }
            h4Var.h0.setHasForward(l3Var.v);
            k0 k0Var2 = h4Var.h0;
            l3 l3Var2 = h4Var.u0[0];
            k0Var2.setIsTonsite(l3Var2 != null && l3Var2.e());
            k0 k0Var3 = h4Var.h0;
            l3 l3Var3 = h4Var.u0[0];
            k0Var3.setIsLocal(l3Var3 != null && l3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.d1
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.e.setWebView(z0Var);
    }

    @Override // org.telegram.ui.web.d1
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.h2 h2Var;
        l3 l3Var = this.S0;
        h4 h4Var = l3Var.K;
        if (h4Var.h0 != null && l3Var == h4Var.u0[0] && (h2Var = l3Var.y) != null && h2Var.b() == null) {
            l3Var.y.d(getWebView());
        }
        super.U(str, z10);
    }
}
