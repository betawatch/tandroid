package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.web.u1 {
    public final /* synthetic */ k4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k4 k4Var, Activity activity) {
        super(activity);
        this.B0 = k4Var;
    }

    @Override // org.telegram.ui.web.u1
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        n3 n3Var = this.B0.u0[0];
        if (!n3Var.f()) {
            org.telegram.ui.web.g2 g2Var = n3Var.E;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = n3Var.E;
                TLRPC.TL_webPage tL_webPage = g2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.j = null;
                }
                n3Var.E = null;
                return null;
            }
        } else {
            if (n3Var.getWebView() != null) {
                org.telegram.ui.web.g2 g2Var3 = n3Var.E;
                if (g2Var3 != null && (g2Var3.f != n3Var.getWebView().b || n3Var.E.e != n3Var.getWebView().getProgress())) {
                    n3Var.E.d(n3Var.getWebView());
                    return n3Var.E;
                }
                if (n3Var.E != null && TextUtils.equals(n3Var.getWebView().getUrl(), n3Var.E.d)) {
                    return n3Var.E;
                }
                org.telegram.ui.web.g2 g2Var4 = n3Var.E;
                if (g2Var4 != null) {
                    g2Var4.a();
                    org.telegram.ui.web.g2 g2Var5 = n3Var.E;
                    TLRPC.TL_webPage tL_webPage2 = g2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage2);
                        g2Var5.j = null;
                    }
                    n3Var.E = null;
                }
                org.telegram.ui.web.g2 g2Var6 = new org.telegram.ui.web.g2(n3Var.L.X);
                n3Var.E = g2Var6;
                org.telegram.ui.web.y0 webView = n3Var.getWebView();
                if (!g2Var6.b) {
                    g2Var6.b = true;
                    g2Var6.d = webView.getUrl();
                    g2Var6.e = webView.getProgress();
                    g2Var6.f = webView.b;
                    g2Var6.l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var6.k = ConnectionsManager.getInstance(g2Var6.a).sendRequest(tL_messages_getWebPage, new ai.h(g2Var6, 24));
                }
                return n3Var.E;
            }
            org.telegram.ui.web.g2 g2Var7 = n3Var.E;
            if (g2Var7 != null) {
                g2Var7.a();
                org.telegram.ui.web.g2 g2Var8 = n3Var.E;
                TLRPC.TL_webPage tL_webPage3 = g2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage3);
                    g2Var8.j = null;
                }
                n3Var.E = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.h2 h2Var = this.M;
        h2Var.a(f10);
        h2Var.b(i0.a.f(this.a0, this.w, this.y));
        this.L.invalidate();
        k4 k4Var = this.B0;
        org.telegram.ui.web.l lVar = k4Var.i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        w3 w3Var = k4Var.K;
        if (w3Var != null) {
            w3Var.i();
        }
    }

    public final void k(boolean z10) {
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            int i10 = 1;
            ai.t tVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().a));
                }
            }
            tVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new ei.i6(this, 15));
            this.w0.addListener(new o40(14, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.bs.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.B0.i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.u1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
