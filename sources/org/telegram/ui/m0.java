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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.web.s1 {
    public final /* synthetic */ l4 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l4 l4Var, Activity activity) {
        super(activity);
        this.y0 = l4Var;
    }

    @Override // org.telegram.ui.web.s1
    public final org.telegram.ui.web.e2 getInstantViewLoader() {
        p3 p3Var = this.y0.r0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.e2 e2Var = p3Var.y;
            if (e2Var != null) {
                e2Var.a();
                org.telegram.ui.web.e2 e2Var2 = p3Var.y;
                TLRPC.TL_webPage tL_webPage = e2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.g2.o(tL_webPage);
                    e2Var2.j = null;
                }
                p3Var.y = null;
                return null;
            }
        } else {
            if (p3Var.getWebView() != null) {
                org.telegram.ui.web.e2 e2Var3 = p3Var.y;
                if (e2Var3 != null && (e2Var3.f != p3Var.getWebView().b || p3Var.y.e != p3Var.getWebView().getProgress())) {
                    p3Var.y.d(p3Var.getWebView());
                    return p3Var.y;
                }
                if (p3Var.y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.y.d)) {
                    return p3Var.y;
                }
                org.telegram.ui.web.e2 e2Var4 = p3Var.y;
                if (e2Var4 != null) {
                    e2Var4.a();
                    org.telegram.ui.web.e2 e2Var5 = p3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = e2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.g2.o(tL_webPage2);
                        e2Var5.j = null;
                    }
                    p3Var.y = null;
                }
                org.telegram.ui.web.e2 e2Var6 = new org.telegram.ui.web.e2(p3Var.H.U);
                p3Var.y = e2Var6;
                org.telegram.ui.web.w0 webView = p3Var.getWebView();
                if (!e2Var6.b) {
                    e2Var6.b = true;
                    e2Var6.d = webView.getUrl();
                    e2Var6.e = webView.getProgress();
                    e2Var6.f = webView.b;
                    e2Var6.l = org.telegram.ui.web.g2.e(webView, new org.telegram.ui.web.d2(e2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = e2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    e2Var6.k = ConnectionsManager.getInstance(e2Var6.a).sendRequest(tL_messages_getWebPage, new gf.a(e2Var6, 14));
                }
                return p3Var.y;
            }
            org.telegram.ui.web.e2 e2Var7 = p3Var.y;
            if (e2Var7 != null) {
                e2Var7.a();
                org.telegram.ui.web.e2 e2Var8 = p3Var.y;
                TLRPC.TL_webPage tL_webPage3 = e2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.g2.o(tL_webPage3);
                    e2Var8.j = null;
                }
                p3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.U, this.w, this.y);
        org.telegram.ui.ActionBar.i2 i2Var = this.J;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.U, this.w, this.y));
        this.I.invalidate();
        l4 l4Var = this.y0;
        org.telegram.ui.web.k kVar = l4Var.f0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.i();
        }
    }

    public final void k(boolean z4) {
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            int i10 = 1;
            lh.n nVar = this.V;
            if (z4) {
                int i11 = this.W;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.W = i12;
                    nVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.l1.a().a));
                }
            }
            nVar.setVisibility(0);
            this.J.c((this.r0 || z4) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z4 ? 1.0f : 0.0f);
            this.t0 = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 11));
            this.t0.addListener(new l61(5, this, z4));
            this.t0.setInterpolator(org.telegram.ui.Components.nr.h);
            this.t0.setDuration(360L);
            this.t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.n1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.n1(this, i10), this.T ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.y0.f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override // org.telegram.ui.web.s1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.y0.f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
