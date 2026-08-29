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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o0 extends org.telegram.ui.web.r1 {
    public final /* synthetic */ m4 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m4 m4Var, Activity activity) {
        super(activity);
        this.x0 = m4Var;
    }

    @Override // org.telegram.ui.web.r1
    public final org.telegram.ui.web.d2 getInstantViewLoader() {
        q3 q3Var = this.x0.q0[0];
        if (!q3Var.f()) {
            org.telegram.ui.web.d2 d2Var = q3Var.y;
            if (d2Var != null) {
                d2Var.a();
                org.telegram.ui.web.d2 d2Var2 = q3Var.y;
                TLRPC.TL_webPage tL_webPage = d2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.f2.o(tL_webPage);
                    d2Var2.j = null;
                }
                q3Var.y = null;
                return null;
            }
        } else {
            if (q3Var.getWebView() != null) {
                org.telegram.ui.web.d2 d2Var3 = q3Var.y;
                if (d2Var3 != null && (d2Var3.f != q3Var.getWebView().b || q3Var.y.e != q3Var.getWebView().getProgress())) {
                    q3Var.y.d(q3Var.getWebView());
                    return q3Var.y;
                }
                if (q3Var.y != null && TextUtils.equals(q3Var.getWebView().getUrl(), q3Var.y.d)) {
                    return q3Var.y;
                }
                org.telegram.ui.web.d2 d2Var4 = q3Var.y;
                if (d2Var4 != null) {
                    d2Var4.a();
                    org.telegram.ui.web.d2 d2Var5 = q3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = d2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.f2.o(tL_webPage2);
                        d2Var5.j = null;
                    }
                    q3Var.y = null;
                }
                org.telegram.ui.web.d2 d2Var6 = new org.telegram.ui.web.d2(q3Var.G.T);
                q3Var.y = d2Var6;
                org.telegram.ui.web.w0 webView = q3Var.getWebView();
                if (!d2Var6.b) {
                    d2Var6.b = true;
                    d2Var6.d = webView.getUrl();
                    d2Var6.e = webView.getProgress();
                    d2Var6.f = webView.b;
                    d2Var6.l = org.telegram.ui.web.f2.e(webView, new org.telegram.ui.web.c2(d2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = d2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    d2Var6.k = ConnectionsManager.getInstance(d2Var6.a).sendRequest(tL_messages_getWebPage, new ef.a(d2Var6, 18));
                }
                return q3Var.y;
            }
            org.telegram.ui.web.d2 d2Var7 = q3Var.y;
            if (d2Var7 != null) {
                d2Var7.a();
                org.telegram.ui.web.d2 d2Var8 = q3Var.y;
                TLRPC.TL_webPage tL_webPage3 = d2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.f2.o(tL_webPage3);
                    d2Var8.j = null;
                }
                q3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f9) {
        int d = i0.a.d(this.T, this.w, this.y);
        org.telegram.ui.ActionBar.h2 h2Var = this.I;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.T, this.w, this.y));
        this.H.invalidate();
        m4 m4Var = this.x0;
        org.telegram.ui.web.l lVar = m4Var.e0;
        if (lVar != null) {
            lVar.setOpenProgress(f9);
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.i();
        }
    }

    public final void k(boolean z10) {
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            int i10 = 1;
            jh.m mVar = this.U;
            if (z10) {
                int i11 = this.V;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.V = i12;
                    mVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.k1.a().a));
                }
            }
            mVar.setVisibility(0);
            this.I.c((this.q0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, z10 ? 1.0f : 0.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 23));
            this.s0.addListener(new p60(13, this, z10));
            this.s0.setInterpolator(org.telegram.ui.Components.jr.h);
            this.s0.setDuration(360L);
            this.s0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.m1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.m1(this, i10), this.S ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.x0.e0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.r1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.x0.e0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
