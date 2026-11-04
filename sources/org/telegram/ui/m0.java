package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.web.i1 {
    public final /* synthetic */ i4 C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i4 i4Var, Activity activity) {
        super(activity);
        this.C0 = i4Var;
    }

    @Override // org.telegram.ui.web.i1
    public final org.telegram.ui.web.s1 getInstantViewLoader() {
        l3 l3Var = this.C0.v0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.s1 s1Var = l3Var.F;
            if (s1Var != null) {
                s1Var.a();
                org.telegram.ui.web.s1 s1Var2 = l3Var.F;
                TLRPC.TL_webPage tL_webPage = s1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.u1.o(tL_webPage);
                    s1Var2.j = null;
                }
                l3Var.F = null;
                return null;
            }
        } else {
            if (l3Var.getWebView() != null) {
                org.telegram.ui.web.s1 s1Var3 = l3Var.F;
                if (s1Var3 != null && (s1Var3.f != l3Var.getWebView().b || l3Var.F.e != l3Var.getWebView().getProgress())) {
                    l3Var.F.d(l3Var.getWebView());
                    return l3Var.F;
                }
                if (l3Var.F != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.F.d)) {
                    return l3Var.F;
                }
                org.telegram.ui.web.s1 s1Var4 = l3Var.F;
                if (s1Var4 != null) {
                    s1Var4.a();
                    org.telegram.ui.web.s1 s1Var5 = l3Var.F;
                    TLRPC.TL_webPage tL_webPage2 = s1Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.u1.o(tL_webPage2);
                        s1Var5.j = null;
                    }
                    l3Var.F = null;
                }
                org.telegram.ui.web.s1 s1Var6 = new org.telegram.ui.web.s1(l3Var.M.Y);
                l3Var.F = s1Var6;
                org.telegram.ui.web.t0 webView = l3Var.getWebView();
                if (!s1Var6.b) {
                    s1Var6.b = true;
                    s1Var6.d = webView.getUrl();
                    s1Var6.e = webView.getProgress();
                    s1Var6.f = webView.b;
                    s1Var6.l = org.telegram.ui.web.u1.e(webView, new org.telegram.ui.web.r1(s1Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = s1Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    s1Var6.k = ConnectionsManager.getInstance(s1Var6.a).sendRequest(tL_messages_getWebPage, new ci.d0(s1Var6, 22));
                }
                return l3Var.F;
            }
            org.telegram.ui.web.s1 s1Var7 = l3Var.F;
            if (s1Var7 != null) {
                s1Var7.a();
                org.telegram.ui.web.s1 s1Var8 = l3Var.F;
                TLRPC.TL_webPage tL_webPage3 = s1Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.u1.o(tL_webPage3);
                    s1Var8.j = null;
                }
                l3Var.F = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.b0, this.x, this.E);
        org.telegram.ui.ActionBar.w1 w1Var = this.N;
        w1Var.a(f11);
        w1Var.b(i0.a.f(this.b0, this.x, this.E));
        this.M.invalidate();
        i4 i4Var = this.C0;
        org.telegram.ui.web.l lVar = i4Var.j0;
        if (lVar != null) {
            lVar.setOpenProgress(f10);
        }
        u3 u3Var = i4Var.L;
        if (u3Var != null) {
            u3Var.u();
        }
    }

    public final void k(boolean z10) {
        if (this.a0 != z10) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z10;
            int i3 = 1;
            ci.s sVar = this.c0;
            if (z10) {
                int i10 = this.d0;
                int i11 = org.telegram.messenger.az.p0;
                if (i10 != i11) {
                    this.d0 = i11;
                    sVar.setHint(org.telegram.messenger.bd.a0(null, null, 2131754351, org.telegram.ui.web.d1.a().a));
                }
            }
            sVar.setVisibility(0);
            this.N.c(true, (this.v0 || z10) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z10 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new gi.j3(this, 24));
            this.x0.addListener(new u40(13, this, z10));
            this.x0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.x0.setDuration(360L);
            this.x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.f1(this, i3));
            org.telegram.messenger.g0.i3(new org.telegram.ui.web.f1(this, i3), this.a0 ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.C0.j0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.i1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
