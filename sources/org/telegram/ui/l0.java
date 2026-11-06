package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.k1 {
    public final /* synthetic */ g4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.B0 = g4Var;
    }

    @Override // org.telegram.ui.web.k1
    public final org.telegram.ui.web.u1 getInstantViewLoader() {
        k3 k3Var = this.B0.u0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.u1 u1Var = k3Var.E;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = k3Var.E;
                TLRPC.TL_webPage tL_webPage = u1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.j = null;
                }
                k3Var.E = null;
                return null;
            }
        } else {
            if (k3Var.getWebView() != null) {
                org.telegram.ui.web.u1 u1Var3 = k3Var.E;
                if (u1Var3 != null && (u1Var3.f != k3Var.getWebView().b || k3Var.E.e != k3Var.getWebView().getProgress())) {
                    k3Var.E.d(k3Var.getWebView());
                    return k3Var.E;
                }
                if (k3Var.E != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.E.d)) {
                    return k3Var.E;
                }
                org.telegram.ui.web.u1 u1Var4 = k3Var.E;
                if (u1Var4 != null) {
                    u1Var4.a();
                    org.telegram.ui.web.u1 u1Var5 = k3Var.E;
                    TLRPC.TL_webPage tL_webPage2 = u1Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.w1.o(tL_webPage2);
                        u1Var5.j = null;
                    }
                    k3Var.E = null;
                }
                org.telegram.ui.web.u1 u1Var6 = new org.telegram.ui.web.u1(k3Var.L.X);
                k3Var.E = u1Var6;
                org.telegram.ui.web.u0 webView = k3Var.getWebView();
                if (!u1Var6.b) {
                    u1Var6.b = true;
                    u1Var6.d = webView.getUrl();
                    u1Var6.e = webView.getProgress();
                    u1Var6.f = webView.b;
                    u1Var6.l = org.telegram.ui.web.w1.e(webView, new org.telegram.ui.web.t1(u1Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = u1Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    u1Var6.k = ConnectionsManager.getInstance(u1Var6.a).sendRequest(tL_messages_getWebPage, new bi.j0(u1Var6, 22));
                }
                return k3Var.E;
            }
            org.telegram.ui.web.u1 u1Var7 = k3Var.E;
            if (u1Var7 != null) {
                u1Var7.a();
                org.telegram.ui.web.u1 u1Var8 = k3Var.E;
                TLRPC.TL_webPage tL_webPage3 = u1Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.w1.o(tL_webPage3);
                    u1Var8.j = null;
                }
                k3Var.E = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.a0, this.x, this.D);
        org.telegram.ui.ActionBar.y1 y1Var = this.M;
        y1Var.a(f11);
        y1Var.b(i0.a.f(this.a0, this.x, this.D));
        this.L.invalidate();
        g4 g4Var = this.B0;
        org.telegram.ui.web.j jVar = g4Var.i0;
        if (jVar != null) {
            jVar.setOpenProgress(f10);
        }
        t3 t3Var = g4Var.K;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void k(boolean z9) {
        if (this.W != z9) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z9;
            int i7 = 1;
            bi.v vVar = this.b0;
            if (z9) {
                int i10 = this.c0;
                int i11 = org.telegram.messenger.iz.p0;
                if (i10 != i11) {
                    this.c0 = i11;
                    vVar.setHint(org.telegram.messenger.hd.a0(null, null, 2131754351, org.telegram.ui.web.f1.a().a));
                }
            }
            vVar.setVisibility(0);
            this.M.c(true, (this.u0 || z9) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z9 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.v3(this, 23));
            this.w0.addListener(new z40(13, this, z9));
            this.w0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.w0.setDuration(360L);
            this.w0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.h1(this, i7));
            org.telegram.messenger.g0.i3(new org.telegram.ui.web.h1(this, i7), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.j jVar = this.B0.i0;
        if (jVar != null) {
            jVar.setOpened(z9);
        }
    }

    @Override // org.telegram.ui.web.k1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
