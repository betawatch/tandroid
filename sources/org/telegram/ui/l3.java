package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ n3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3 n3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = n3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void E(String str, boolean z10) {
        n3 n3Var = this.S0;
        if (z10) {
            if (n3Var.r == null) {
                k3 k3Var = n3Var.e;
                e3 e3Var = new e3(n3Var.getContext());
                n3Var.r = e3Var;
                k3Var.addView(e3Var, w7.a6.c(-1.0f, -1));
                n3Var.r.h.setOnClickListener(new a(n3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(n3Var.r, n3Var.n, 1.0f, false);
            }
            e3 e3Var2 = n3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = e3Var2.e;
            e3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.c1.v(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((v == null || Uri.parse(v) == null || Uri.parse(v).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            e3Var2.f.setText(str);
            e3 e3Var3 = n3Var.r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            e3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
            n3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        e3 e3Var4 = n3Var.r;
        n3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(e3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void I() {
        this.S0.K.i0(true);
    }

    @Override // org.telegram.ui.web.c1
    public final void J(boolean z10, boolean z11) {
        n3 n3Var = this.S0;
        n3Var.s = !z10;
        n3Var.v = !z11;
        j4 j4Var = n3Var.K;
        j4Var.i0(true);
        if (n3Var == j4Var.u0[0]) {
            l0 l0Var = j4Var.h0;
            if (l0Var.W || l0Var.T) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (j4Var.J() || j4Var.d0.size() > 1) {
                j4Var.h0.M.c((n3Var.s || j4Var.d0.size() > 1) ? 0.0f : 1.0f, true);
                j4Var.h0.setBackButtonCached(n3Var.s || j4Var.d0.size() > 1);
                j4Var.h0.P.f();
            } else {
                j4Var.h0.setBackButtonCached(false);
                j4Var.h0.P.f();
            }
            j4Var.h0.setHasForward(n3Var.v);
            l0 l0Var2 = j4Var.h0;
            n3 n3Var2 = j4Var.u0[0];
            l0Var2.setIsTonsite(n3Var2 != null && n3Var2.e());
            l0 l0Var3 = j4Var.h0;
            n3 n3Var3 = j4Var.u0[0];
            l0Var3.setIsLocal(n3Var3 != null && n3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.e.setWebView(y0Var);
    }

    @Override // org.telegram.ui.web.c1
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.i2 i2Var;
        n3 n3Var = this.S0;
        j4 j4Var = n3Var.K;
        if (j4Var.h0 != null && n3Var == j4Var.u0[0] && (i2Var = n3Var.y) != null && i2Var.b() == null) {
            n3Var.y.d(getWebView());
        }
        super.U(str, z10);
    }
}
