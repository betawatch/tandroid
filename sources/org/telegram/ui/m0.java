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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.web.t1 {
    public final /* synthetic */ l4 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l4 l4Var, Activity activity) {
        super(activity);
        this.y0 = l4Var;
    }

    @Override // org.telegram.ui.web.t1
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        p3 p3Var = this.y0.r0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.f2 f2Var = p3Var.y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = p3Var.y;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                p3Var.y = null;
                return null;
            }
        } else {
            if (p3Var.getWebView() != null) {
                org.telegram.ui.web.f2 f2Var3 = p3Var.y;
                if (f2Var3 != null && (f2Var3.f != p3Var.getWebView().b || p3Var.y.e != p3Var.getWebView().getProgress())) {
                    p3Var.y.d(p3Var.getWebView());
                    return p3Var.y;
                }
                if (p3Var.y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.y.d)) {
                    return p3Var.y;
                }
                org.telegram.ui.web.f2 f2Var4 = p3Var.y;
                if (f2Var4 != null) {
                    f2Var4.a();
                    org.telegram.ui.web.f2 f2Var5 = p3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = f2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage2);
                        f2Var5.j = null;
                    }
                    p3Var.y = null;
                }
                org.telegram.ui.web.f2 f2Var6 = new org.telegram.ui.web.f2(p3Var.H.U);
                p3Var.y = f2Var6;
                org.telegram.ui.web.x0 webView = p3Var.getWebView();
                if (!f2Var6.b) {
                    f2Var6.b = true;
                    f2Var6.d = webView.getUrl();
                    f2Var6.e = webView.getProgress();
                    f2Var6.f = webView.b;
                    f2Var6.l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var6.k = ConnectionsManager.getInstance(f2Var6.a).sendRequest(tL_messages_getWebPage, new gf.a(f2Var6, 14));
                }
                return p3Var.y;
            }
            org.telegram.ui.web.f2 f2Var7 = p3Var.y;
            if (f2Var7 != null) {
                f2Var7.a();
                org.telegram.ui.web.f2 f2Var8 = p3Var.y;
                TLRPC.TL_webPage tL_webPage3 = f2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage3);
                    f2Var8.j = null;
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
            mh.m mVar = this.V;
            if (z4) {
                int i11 = this.W;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.W = i12;
                    mVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.m1.a().a));
                }
            }
            mVar.setVisibility(0);
            this.J.c((this.r0 || z4) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z4 ? 1.0f : 0.0f);
            this.t0 = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 10));
            this.t0.addListener(new qd1(3, this, z4));
            this.t0.setInterpolator(org.telegram.ui.Components.pr.h);
            this.t0.setDuration(360L);
            this.t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.o1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(this, i10), this.T ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.y0.f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override // org.telegram.ui.web.t1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.y0.f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
