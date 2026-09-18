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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k0 extends org.telegram.ui.web.w1 {
    public final /* synthetic */ h4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override // org.telegram.ui.web.w1
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        l3 l3Var = this.B0.u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.h2 h2Var = l3Var.y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = l3Var.y;
                TLRPC.TL_webPage tL_webPage = h2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.j = null;
                }
                l3Var.y = null;
                return null;
            }
        } else {
            if (l3Var.getWebView() != null) {
                org.telegram.ui.web.h2 h2Var3 = l3Var.y;
                if (h2Var3 != null && (h2Var3.f != l3Var.getWebView().b || l3Var.y.e != l3Var.getWebView().getProgress())) {
                    l3Var.y.d(l3Var.getWebView());
                    return l3Var.y;
                }
                if (l3Var.y != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.y.d)) {
                    return l3Var.y;
                }
                org.telegram.ui.web.h2 h2Var4 = l3Var.y;
                if (h2Var4 != null) {
                    h2Var4.a();
                    org.telegram.ui.web.h2 h2Var5 = l3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = h2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage2);
                        h2Var5.j = null;
                    }
                    l3Var.y = null;
                }
                org.telegram.ui.web.h2 h2Var6 = new org.telegram.ui.web.h2(l3Var.K.X);
                l3Var.y = h2Var6;
                org.telegram.ui.web.z0 webView = l3Var.getWebView();
                if (!h2Var6.b) {
                    h2Var6.b = true;
                    h2Var6.d = webView.getUrl();
                    h2Var6.e = webView.getProgress();
                    h2Var6.f = webView.b;
                    h2Var6.l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.g2(h2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var6.k = ConnectionsManager.getInstance(h2Var6.a).sendRequest(tL_messages_getWebPage, new ai.m8(h2Var6, 18));
                }
                return l3Var.y;
            }
            org.telegram.ui.web.h2 h2Var7 = l3Var.y;
            if (h2Var7 != null) {
                h2Var7.a();
                org.telegram.ui.web.h2 h2Var8 = l3Var.y;
                TLRPC.TL_webPage tL_webPage3 = h2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage3);
                    h2Var8.j = null;
                }
                l3Var.y = null;
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
        h4 h4Var = this.B0;
        org.telegram.ui.web.k kVar = h4Var.i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.i();
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
            this.w0.addListener(new h70(13, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.qr.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.r1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.B0.i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.w1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
