package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n3 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ p3 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(p3 p3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.M0 = p3Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void A(String str, boolean z4) {
        p3 p3Var = this.M0;
        if (z4) {
            if (p3Var.r == null) {
                m3 m3Var = p3Var.e;
                f3 f3Var = new f3(p3Var.getContext());
                p3Var.r = f3Var;
                m3Var.addView(f3Var, k7.c6.c(-1.0f, -1));
                p3Var.r.h.setOnClickListener(new a(p3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(p3Var.r, p3Var.n, 1.0f, false);
            }
            f3 f3Var2 = p3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = f3Var2.e;
            f3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String s6 = org.telegram.ui.web.a1.s(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((s6 == null || Uri.parse(s6) == null || Uri.parse(s6).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(s6).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            f3Var2.f.setText(str);
            f3 f3Var3 = p3Var.r;
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            f3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, i10, false)) <= 0.721f, false);
            p3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        }
        f3 f3Var4 = p3Var.r;
        p3Var.n = z4;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var4, z4, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.a1
    public final void E() {
        this.M0.H.i0(true);
    }

    @Override // org.telegram.ui.web.a1
    public final void F(boolean z4, boolean z10) {
        p3 p3Var = this.M0;
        p3Var.s = !z4;
        p3Var.v = !z10;
        l4 l4Var = p3Var.H;
        l4Var.i0(true);
        if (p3Var == l4Var.r0[0]) {
            m0 m0Var = l4Var.e0;
            if (m0Var.T || m0Var.Q) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = l4Var.c0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (l4Var.J() || l4Var.a0.size() > 1) {
                l4Var.e0.J.c((p3Var.s || l4Var.a0.size() > 1) ? 0.0f : 1.0f, true);
                l4Var.e0.setBackButtonCached(p3Var.s || l4Var.a0.size() > 1);
                l4Var.e0.M.f();
            } else {
                l4Var.e0.setBackButtonCached(false);
                l4Var.e0.M.f();
            }
            l4Var.e0.setHasForward(p3Var.v);
            m0 m0Var2 = l4Var.e0;
            p3 p3Var2 = l4Var.r0[0];
            m0Var2.setIsTonsite(p3Var2 != null && p3Var2.e());
            m0 m0Var3 = l4Var.e0;
            p3 p3Var3 = l4Var.r0[0];
            m0Var3.setIsLocal(p3Var3 != null && p3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.a1
    public final void G(org.telegram.ui.web.x0 x0Var) {
        this.M0.e.setWebView(x0Var);
    }

    @Override // org.telegram.ui.web.a1
    public final void O(String str, boolean z4) {
        org.telegram.ui.web.f2 f2Var;
        p3 p3Var = this.M0;
        l4 l4Var = p3Var.H;
        if (l4Var.e0 != null && p3Var == l4Var.r0[0] && (f2Var = p3Var.y) != null && f2Var.b() == null) {
            p3Var.y.d(getWebView());
        }
        super.O(str, z4);
    }
}
