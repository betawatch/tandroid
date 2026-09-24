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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.v1 {
    public final /* synthetic */ i4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i4 i4Var, Activity activity) {
        super(activity);
        this.B0 = i4Var;
    }

    @Override // org.telegram.ui.web.v1
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        m3 m3Var = this.B0.u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.g2 g2Var = m3Var.y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = m3Var.y;
                TLRPC.TL_webPage tL_webPage = g2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.j = null;
                }
                m3Var.y = null;
                return null;
            }
        } else {
            if (m3Var.getWebView() != null) {
                org.telegram.ui.web.g2 g2Var3 = m3Var.y;
                if (g2Var3 != null && (g2Var3.f != m3Var.getWebView().b || m3Var.y.e != m3Var.getWebView().getProgress())) {
                    m3Var.y.d(m3Var.getWebView());
                    return m3Var.y;
                }
                if (m3Var.y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.y.d)) {
                    return m3Var.y;
                }
                org.telegram.ui.web.g2 g2Var4 = m3Var.y;
                if (g2Var4 != null) {
                    g2Var4.a();
                    org.telegram.ui.web.g2 g2Var5 = m3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = g2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage2);
                        g2Var5.j = null;
                    }
                    m3Var.y = null;
                }
                org.telegram.ui.web.g2 g2Var6 = new org.telegram.ui.web.g2(m3Var.K.X);
                m3Var.y = g2Var6;
                org.telegram.ui.web.y0 webView = m3Var.getWebView();
                if (!g2Var6.b) {
                    g2Var6.b = true;
                    g2Var6.d = webView.getUrl();
                    g2Var6.e = webView.getProgress();
                    g2Var6.f = webView.b;
                    g2Var6.l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var6.k = ConnectionsManager.getInstance(g2Var6.a).sendRequest(tL_messages_getWebPage, new ai.n8(g2Var6, 18));
                }
                return m3Var.y;
            }
            org.telegram.ui.web.g2 g2Var7 = m3Var.y;
            if (g2Var7 != null) {
                g2Var7.a();
                org.telegram.ui.web.g2 g2Var8 = m3Var.y;
                TLRPC.TL_webPage tL_webPage3 = g2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage3);
                    g2Var8.j = null;
                }
                m3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        f2Var.a(d);
        f2Var.b(i0.a.d(this.a0, this.w, this.y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.k kVar = i4Var.i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            v3Var.i();
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
            fi.o oVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().a));
                }
            }
            oVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.w0.addListener(new c70(13, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.rr.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.B0.i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.v1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
