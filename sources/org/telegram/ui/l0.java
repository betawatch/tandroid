package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.j1 {
    public final /* synthetic */ g4 C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.C0 = g4Var;
    }

    @Override // org.telegram.ui.web.j1
    public final org.telegram.ui.web.u1 getInstantViewLoader() {
        k3 k3Var = this.C0.v0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.u1 u1Var = k3Var.F;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = k3Var.F;
                TLRPC.TL_webPage tL_webPage = u1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.j = null;
                }
                k3Var.F = null;
                return null;
            }
        } else {
            if (k3Var.getWebView() != null) {
                org.telegram.ui.web.u1 u1Var3 = k3Var.F;
                if (u1Var3 != null && (u1Var3.f != k3Var.getWebView().b || k3Var.F.e != k3Var.getWebView().getProgress())) {
                    k3Var.F.d(k3Var.getWebView());
                    return k3Var.F;
                }
                if (k3Var.F != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.F.d)) {
                    return k3Var.F;
                }
                org.telegram.ui.web.u1 u1Var4 = k3Var.F;
                if (u1Var4 != null) {
                    u1Var4.a();
                    org.telegram.ui.web.u1 u1Var5 = k3Var.F;
                    TLRPC.TL_webPage tL_webPage2 = u1Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.w1.o(tL_webPage2);
                        u1Var5.j = null;
                    }
                    k3Var.F = null;
                }
                org.telegram.ui.web.u1 u1Var6 = new org.telegram.ui.web.u1(k3Var.M.Y);
                k3Var.F = u1Var6;
                org.telegram.ui.web.s0 webView = k3Var.getWebView();
                if (!u1Var6.b) {
                    u1Var6.b = true;
                    u1Var6.d = webView.getUrl();
                    u1Var6.e = webView.getProgress();
                    u1Var6.f = webView.b;
                    u1Var6.l = org.telegram.ui.web.w1.e(webView, new org.telegram.ui.web.s1(u1Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = u1Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    u1Var6.k = ConnectionsManager.getInstance(u1Var6.a).sendRequest(tL_messages_getWebPage, new ai.b1(u1Var6, 25));
                }
                return k3Var.F;
            }
            org.telegram.ui.web.u1 u1Var7 = k3Var.F;
            if (u1Var7 != null) {
                u1Var7.a();
                org.telegram.ui.web.u1 u1Var8 = k3Var.F;
                TLRPC.TL_webPage tL_webPage3 = u1Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.w1.o(tL_webPage3);
                    u1Var8.j = null;
                }
                k3Var.F = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.b0, this.x, this.E);
        org.telegram.ui.ActionBar.x1 x1Var = this.N;
        x1Var.a(f11);
        x1Var.b(i0.a.f(this.b0, this.x, this.E));
        this.M.invalidate();
        g4 g4Var = this.C0;
        org.telegram.ui.web.k kVar = g4Var.j0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        t3 t3Var = g4Var.L;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void k(boolean z10) {
        if (this.a0 != z10) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z10;
            int i7 = 1;
            di.q qVar = this.c0;
            if (z10) {
                int i10 = this.d0;
                int i11 = org.telegram.messenger.bz.p0;
                if (i10 != i11) {
                    this.d0 = i11;
                    qVar.setHint(org.telegram.messenger.gd.a0(null, null, 2131754348, org.telegram.ui.web.e1.a().a));
                }
            }
            qVar.setVisibility(0);
            this.N.c(true, (this.v0 || z10) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z10 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new hi.s3(this, 24));
            this.x0.addListener(new b30(14, this, z10));
            this.x0.setInterpolator(org.telegram.ui.Components.kr.h);
            this.x0.setDuration(360L);
            this.x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.g1(this, i7));
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.g1(this, i7), this.a0 ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.C0.j0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.j1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
