package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n3 extends org.telegram.ui.web.y0 {
    public final /* synthetic */ p3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(p3 p3Var, Context context, int i9) {
        super(i9, context, null, false);
        this.L0 = p3Var;
    }

    @Override // org.telegram.ui.web.y0
    public final void A(String str, boolean z10) {
        p3 p3Var = this.L0;
        if (z10) {
            if (p3Var.r == null) {
                m3 m3Var = p3Var.e;
                g3 g3Var = new g3(p3Var.getContext());
                p3Var.r = g3Var;
                m3Var.addView(g3Var, g7.e6.c(-1.0f, -1));
                p3Var.r.h.setOnClickListener(new a(p3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(p3Var.r, p3Var.n, 1.0f, false);
            }
            g3 g3Var2 = p3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = g3Var2.e;
            g3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String s10 = org.telegram.ui.web.y0.s(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((s10 == null || Uri.parse(s10) == null || Uri.parse(s10).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(s10).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            g3Var2.f.setText(str);
            g3 g3Var3 = p3Var.r;
            int i9 = org.telegram.ui.ActionBar.f6.Pk;
            g3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, i9, false)) <= 0.721f, false);
            p3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        g3 g3Var4 = p3Var.r;
        p3Var.n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(g3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.y0
    public final void E() {
        this.L0.G.i0(true);
    }

    @Override // org.telegram.ui.web.y0
    public final void F(boolean z10, boolean z11) {
        p3 p3Var = this.L0;
        p3Var.s = !z10;
        p3Var.v = !z11;
        l4 l4Var = p3Var.G;
        l4Var.i0(true);
        if (p3Var == l4Var.q0[0]) {
            n0 n0Var = l4Var.d0;
            if (n0Var.S || n0Var.P) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = l4Var.b0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (l4Var.J() || l4Var.Z.size() > 1) {
                l4Var.d0.I.c((p3Var.s || l4Var.Z.size() > 1) ? 0.0f : 1.0f, true);
                l4Var.d0.setBackButtonCached(p3Var.s || l4Var.Z.size() > 1);
                l4Var.d0.L.f();
            } else {
                l4Var.d0.setBackButtonCached(false);
                l4Var.d0.L.f();
            }
            l4Var.d0.setHasForward(p3Var.v);
            n0 n0Var2 = l4Var.d0;
            p3 p3Var2 = l4Var.q0[0];
            n0Var2.setIsTonsite(p3Var2 != null && p3Var2.e());
            n0 n0Var3 = l4Var.d0;
            p3 p3Var3 = l4Var.q0[0];
            n0Var3.setIsLocal(p3Var3 != null && p3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.y0
    public final void G(org.telegram.ui.web.v0 v0Var) {
        this.L0.e.setWebView(v0Var);
    }

    @Override // org.telegram.ui.web.y0
    public final void O(String str, boolean z10) {
        org.telegram.ui.web.b2 b2Var;
        p3 p3Var = this.L0;
        l4 l4Var = p3Var.G;
        if (l4Var.d0 != null && p3Var == l4Var.q0[0] && (b2Var = p3Var.y) != null && b2Var.b() == null) {
            p3Var.y.d(getWebView());
        }
        super.O(str, z10);
    }
}
