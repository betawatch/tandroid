package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.j1 {
    public final /* synthetic */ g4 C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.C0 = g4Var;
    }

    @Override // org.telegram.ui.web.j1
    public final org.telegram.ui.web.t1 getInstantViewLoader() {
        k3 k3Var = this.C0.v0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.t1 t1Var = k3Var.F;
            if (t1Var != null) {
                t1Var.a();
                org.telegram.ui.web.t1 t1Var2 = k3Var.F;
                TLRPC.TL_webPage tL_webPage = t1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.v1.o(tL_webPage);
                    t1Var2.j = null;
                }
                k3Var.F = null;
                return null;
            }
        } else {
            if (k3Var.getWebView() != null) {
                org.telegram.ui.web.t1 t1Var3 = k3Var.F;
                if (t1Var3 != null && (t1Var3.f != k3Var.getWebView().b || k3Var.F.e != k3Var.getWebView().getProgress())) {
                    k3Var.F.d(k3Var.getWebView());
                    return k3Var.F;
                }
                if (k3Var.F != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.F.d)) {
                    return k3Var.F;
                }
                org.telegram.ui.web.t1 t1Var4 = k3Var.F;
                if (t1Var4 != null) {
                    t1Var4.a();
                    org.telegram.ui.web.t1 t1Var5 = k3Var.F;
                    TLRPC.TL_webPage tL_webPage2 = t1Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.v1.o(tL_webPage2);
                        t1Var5.j = null;
                    }
                    k3Var.F = null;
                }
                org.telegram.ui.web.t1 t1Var6 = new org.telegram.ui.web.t1(k3Var.M.Y);
                k3Var.F = t1Var6;
                org.telegram.ui.web.s0 webView = k3Var.getWebView();
                if (!t1Var6.b) {
                    t1Var6.b = true;
                    t1Var6.d = webView.getUrl();
                    t1Var6.e = webView.getProgress();
                    t1Var6.f = webView.b;
                    t1Var6.l = org.telegram.ui.web.v1.e(webView, new org.telegram.ui.web.s1(t1Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = t1Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    t1Var6.k = ConnectionsManager.getInstance(t1Var6.a).sendRequest(tL_messages_getWebPage, new ai.e1(t1Var6, 25));
                }
                return k3Var.F;
            }
            org.telegram.ui.web.t1 t1Var7 = k3Var.F;
            if (t1Var7 != null) {
                t1Var7.a();
                org.telegram.ui.web.t1 t1Var8 = k3Var.F;
                TLRPC.TL_webPage tL_webPage3 = t1Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.v1.o(tL_webPage3);
                    t1Var8.j = null;
                }
                k3Var.F = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.b0, this.x, this.E);
        org.telegram.ui.ActionBar.y1 y1Var = this.N;
        y1Var.a(f11);
        y1Var.b(i0.a.f(this.b0, this.x, this.E));
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
                    qVar.setHint(org.telegram.messenger.gd.a0(null, null, 2131754349, org.telegram.ui.web.e1.a().a));
                }
            }
            qVar.setVisibility(0);
            this.N.c(true, (this.v0 || z10) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z10 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new hi.k3(this, 24));
            this.x0.addListener(new c30(14, this, z10));
            this.x0.setInterpolator(org.telegram.ui.Components.lr.h);
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
