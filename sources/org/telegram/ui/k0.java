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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k0 extends org.telegram.ui.web.w1 {
    public final /* synthetic */ i4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i4 i4Var, Activity activity) {
        super(activity);
        this.B0 = i4Var;
    }

    @Override // org.telegram.ui.web.w1
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        m3 m3Var = this.B0.u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.h2 h2Var = m3Var.y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = m3Var.y;
                TLRPC.TL_webPage tL_webPage = h2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.j = null;
                }
                m3Var.y = null;
                return null;
            }
        } else {
            if (m3Var.getWebView() != null) {
                org.telegram.ui.web.h2 h2Var3 = m3Var.y;
                if (h2Var3 != null && (h2Var3.f != m3Var.getWebView().b || m3Var.y.e != m3Var.getWebView().getProgress())) {
                    m3Var.y.d(m3Var.getWebView());
                    return m3Var.y;
                }
                if (m3Var.y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.y.d)) {
                    return m3Var.y;
                }
                org.telegram.ui.web.h2 h2Var4 = m3Var.y;
                if (h2Var4 != null) {
                    h2Var4.a();
                    org.telegram.ui.web.h2 h2Var5 = m3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = h2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage2);
                        h2Var5.j = null;
                    }
                    m3Var.y = null;
                }
                org.telegram.ui.web.h2 h2Var6 = new org.telegram.ui.web.h2(m3Var.K.X);
                m3Var.y = h2Var6;
                org.telegram.ui.web.z0 webView = m3Var.getWebView();
                if (!h2Var6.b) {
                    h2Var6.b = true;
                    h2Var6.d = webView.getUrl();
                    h2Var6.e = webView.getProgress();
                    h2Var6.f = webView.b;
                    h2Var6.l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.g2(h2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var6.k = ConnectionsManager.getInstance(h2Var6.a).sendRequest(tL_messages_getWebPage, new bi.v7(h2Var6, 18));
                }
                return m3Var.y;
            }
            org.telegram.ui.web.h2 h2Var7 = m3Var.y;
            if (h2Var7 != null) {
                h2Var7.a();
                org.telegram.ui.web.h2 h2Var8 = m3Var.y;
                TLRPC.TL_webPage tL_webPage3 = h2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage3);
                    h2Var8.j = null;
                }
                m3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.a0, this.w, this.y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.l lVar = i4Var.i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
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
            gi.o oVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.p1.a().a));
                }
            }
            oVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 8));
            this.w0.addListener(new e50(14, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.pr.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.r1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.B0.i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.w1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
