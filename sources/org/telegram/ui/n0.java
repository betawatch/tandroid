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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class n0 extends org.telegram.ui.web.t1 {
    public final /* synthetic */ l4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l4 l4Var, Activity activity) {
        super(activity);
        this.B0 = l4Var;
    }

    @Override // org.telegram.ui.web.t1
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        o3 o3Var = this.B0.u0[0];
        if (!o3Var.f()) {
            org.telegram.ui.web.f2 f2Var = o3Var.y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = o3Var.y;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                o3Var.y = null;
                return null;
            }
        } else {
            if (o3Var.getWebView() != null) {
                org.telegram.ui.web.f2 f2Var3 = o3Var.y;
                if (f2Var3 != null && (f2Var3.f != o3Var.getWebView().b || o3Var.y.e != o3Var.getWebView().getProgress())) {
                    o3Var.y.d(o3Var.getWebView());
                    return o3Var.y;
                }
                if (o3Var.y != null && TextUtils.equals(o3Var.getWebView().getUrl(), o3Var.y.d)) {
                    return o3Var.y;
                }
                org.telegram.ui.web.f2 f2Var4 = o3Var.y;
                if (f2Var4 != null) {
                    f2Var4.a();
                    org.telegram.ui.web.f2 f2Var5 = o3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = f2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage2);
                        f2Var5.j = null;
                    }
                    o3Var.y = null;
                }
                org.telegram.ui.web.f2 f2Var6 = new org.telegram.ui.web.f2(o3Var.K.X);
                o3Var.y = f2Var6;
                org.telegram.ui.web.x0 webView = o3Var.getWebView();
                if (!f2Var6.b) {
                    f2Var6.b = true;
                    f2Var6.d = webView.getUrl();
                    f2Var6.e = webView.getProgress();
                    f2Var6.f = webView.b;
                    f2Var6.l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var6.k = ConnectionsManager.getInstance(f2Var6.a).sendRequest(tL_messages_getWebPage, new ai.h(f2Var6, 24));
                }
                return o3Var.y;
            }
            org.telegram.ui.web.f2 f2Var7 = o3Var.y;
            if (f2Var7 != null) {
                f2Var7.a();
                org.telegram.ui.web.f2 f2Var8 = o3Var.y;
                TLRPC.TL_webPage tL_webPage3 = f2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage3);
                    f2Var8.j = null;
                }
                o3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.b.f(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(f10);
        g2Var.b(i0.b.f(this.a0, this.w, this.y));
        this.L.invalidate();
        l4 l4Var = this.B0;
        org.telegram.ui.web.k kVar = l4Var.i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        x3 x3Var = l4Var.K;
        if (x3Var != null) {
            x3Var.i();
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
            ai.t tVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.m1.a().a));
                }
            }
            tVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new ei.i6(this, 15));
            this.w0.addListener(new n40(14, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.bs.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.o1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.B0.i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.t1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
