package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ r3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(r3 r3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.P0 = r3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void E(String str, boolean z4) {
        r3 r3Var = this.P0;
        if (z4) {
            if (r3Var.r == null) {
                o3 o3Var = r3Var.e;
                h3 h3Var = new h3(r3Var.getContext());
                r3Var.r = h3Var;
                o3Var.addView(h3Var, k7.b6.c(-1.0f, -1));
                r3Var.r.h.setOnClickListener(new a(r3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(r3Var.r, r3Var.n, 1.0f, false);
            }
            h3 h3Var2 = r3Var.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = h3Var2.e;
            h3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.c1.v(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((v == null || Uri.parse(v) == null || Uri.parse(v).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            h3Var2.f.setText(str);
            h3 h3Var3 = r3Var.r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            h3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
            r3Var.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        h3 h3Var4 = r3Var.r;
        r3Var.n = z4;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var4, z4, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void I() {
        this.P0.H.i0(true);
    }

    @Override // org.telegram.ui.web.c1
    public final void J(boolean z4, boolean z10) {
        r3 r3Var = this.P0;
        r3Var.s = !z4;
        r3Var.v = !z10;
        n4 n4Var = r3Var.H;
        n4Var.i0(true);
        if (r3Var == n4Var.r0[0]) {
            o0 o0Var = n4Var.e0;
            if (o0Var.T || o0Var.Q) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = n4Var.c0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (n4Var.J() || n4Var.a0.size() > 1) {
                n4Var.e0.J.c((r3Var.s || n4Var.a0.size() > 1) ? 0.0f : 1.0f, true);
                n4Var.e0.setBackButtonCached(r3Var.s || n4Var.a0.size() > 1);
                n4Var.e0.M.f();
            } else {
                n4Var.e0.setBackButtonCached(false);
                n4Var.e0.M.f();
            }
            n4Var.e0.setHasForward(r3Var.v);
            o0 o0Var2 = n4Var.e0;
            r3 r3Var2 = n4Var.r0[0];
            o0Var2.setIsTonsite(r3Var2 != null && r3Var2.e());
            o0 o0Var3 = n4Var.e0;
            r3 r3Var3 = n4Var.r0[0];
            o0Var3.setIsLocal(r3Var3 != null && r3Var3.d());
        }
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.P0.e.setWebView(y0Var);
    }

    @Override // org.telegram.ui.web.c1
    public final void U(String str, boolean z4) {
        org.telegram.ui.web.f2 f2Var;
        r3 r3Var = this.P0;
        n4 n4Var = r3Var.H;
        if (n4Var.e0 != null && r3Var == n4Var.r0[0] && (f2Var = r3Var.y) != null && f2Var.b() == null) {
            r3Var.y.d(getWebView());
        }
        super.U(str, z4);
    }
}
