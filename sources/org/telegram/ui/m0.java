package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.web.l1 {
    public final /* synthetic */ h4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override // org.telegram.ui.web.l1
    public final org.telegram.ui.web.w1 getInstantViewLoader() {
        l3 l3Var = this.B0.u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.w1 w1Var = l3Var.E;
            if (w1Var != null) {
                w1Var.a();
                org.telegram.ui.web.w1 w1Var2 = l3Var.E;
                TLRPC.TL_webPage tL_webPage = w1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.y1.o(tL_webPage);
                    w1Var2.j = null;
                }
                l3Var.E = null;
                return null;
            }
        } else {
            if (l3Var.getWebView() != null) {
                org.telegram.ui.web.w1 w1Var3 = l3Var.E;
                if (w1Var3 != null && (w1Var3.f != l3Var.getWebView().b || l3Var.E.e != l3Var.getWebView().getProgress())) {
                    l3Var.E.d(l3Var.getWebView());
                    return l3Var.E;
                }
                if (l3Var.E != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.E.d)) {
                    return l3Var.E;
                }
                org.telegram.ui.web.w1 w1Var4 = l3Var.E;
                if (w1Var4 != null) {
                    w1Var4.a();
                    org.telegram.ui.web.w1 w1Var5 = l3Var.E;
                    TLRPC.TL_webPage tL_webPage2 = w1Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.y1.o(tL_webPage2);
                        w1Var5.j = null;
                    }
                    l3Var.E = null;
                }
                org.telegram.ui.web.w1 w1Var6 = new org.telegram.ui.web.w1(l3Var.L.X);
                l3Var.E = w1Var6;
                org.telegram.ui.web.v0 webView = l3Var.getWebView();
                if (!w1Var6.b) {
                    w1Var6.b = true;
                    w1Var6.d = webView.getUrl();
                    w1Var6.e = webView.getProgress();
                    w1Var6.f = webView.b;
                    w1Var6.l = org.telegram.ui.web.y1.e(webView, new org.telegram.ui.web.u1(w1Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = w1Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    w1Var6.k = ConnectionsManager.getInstance(w1Var6.a).sendRequest(tL_messages_getWebPage, new ag.c(w1Var6, 13));
                }
                return l3Var.E;
            }
            org.telegram.ui.web.w1 w1Var7 = l3Var.E;
            if (w1Var7 != null) {
                w1Var7.a();
                org.telegram.ui.web.w1 w1Var8 = l3Var.E;
                TLRPC.TL_webPage tL_webPage3 = w1Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.y1.o(tL_webPage3);
                    w1Var8.j = null;
                }
                l3Var.E = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.b.f(this.a0, this.x, this.D);
        org.telegram.ui.ActionBar.c2 c2Var = this.M;
        c2Var.a(f10);
        c2Var.b(i0.b.f(this.a0, this.x, this.D));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.j jVar = h4Var.i0;
        if (jVar != null) {
            jVar.setOpenProgress(f7);
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.u();
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
            zd zdVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = org.telegram.messenger.tz.p0;
                if (i11 != i12) {
                    this.c0 = i12;
                    zdVar.setHint(org.telegram.messenger.cd.a0(null, null, 2131754351, org.telegram.ui.web.g1.a().a));
                }
            }
            zdVar.setVisibility(0);
            this.M.c(true, (this.u0 || z10) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 27));
            this.w0.addListener(new org.telegram.ui.Components.ha0(29, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.w0.setDuration(360L);
            this.w0.start();
            org.telegram.messenger.i0.r(new org.telegram.ui.web.i1(this, i10));
            org.telegram.messenger.i0.h3(new org.telegram.ui.web.i1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.j jVar = this.B0.i0;
        if (jVar != null) {
            jVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.l1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
