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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 extends org.telegram.ui.web.q1 {
    public final /* synthetic */ l4 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l4 l4Var, Activity activity) {
        super(activity);
        this.x0 = l4Var;
    }

    @Override // org.telegram.ui.web.q1
    public final org.telegram.ui.web.b2 getInstantViewLoader() {
        p3 p3Var = this.x0.q0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.b2 b2Var = p3Var.y;
            if (b2Var != null) {
                b2Var.a();
                org.telegram.ui.web.b2 b2Var2 = p3Var.y;
                TLRPC.TL_webPage tL_webPage = b2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.d2.o(tL_webPage);
                    b2Var2.j = null;
                }
                p3Var.y = null;
                return null;
            }
        } else {
            if (p3Var.getWebView() != null) {
                org.telegram.ui.web.b2 b2Var3 = p3Var.y;
                if (b2Var3 != null && (b2Var3.f != p3Var.getWebView().b || p3Var.y.e != p3Var.getWebView().getProgress())) {
                    p3Var.y.d(p3Var.getWebView());
                    return p3Var.y;
                }
                if (p3Var.y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.y.d)) {
                    return p3Var.y;
                }
                org.telegram.ui.web.b2 b2Var4 = p3Var.y;
                if (b2Var4 != null) {
                    b2Var4.a();
                    org.telegram.ui.web.b2 b2Var5 = p3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = b2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.d2.o(tL_webPage2);
                        b2Var5.j = null;
                    }
                    p3Var.y = null;
                }
                org.telegram.ui.web.b2 b2Var6 = new org.telegram.ui.web.b2(p3Var.G.T);
                p3Var.y = b2Var6;
                org.telegram.ui.web.v0 webView = p3Var.getWebView();
                if (!b2Var6.b) {
                    b2Var6.b = true;
                    b2Var6.d = webView.getUrl();
                    b2Var6.e = webView.getProgress();
                    b2Var6.f = webView.b;
                    b2Var6.l = org.telegram.ui.web.d2.e(webView, new org.telegram.ui.web.a2(b2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = b2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    b2Var6.k = ConnectionsManager.getInstance(b2Var6.a).sendRequest(tL_messages_getWebPage, new bf.a(b2Var6, 21));
                }
                return p3Var.y;
            }
            org.telegram.ui.web.b2 b2Var7 = p3Var.y;
            if (b2Var7 != null) {
                b2Var7.a();
                org.telegram.ui.web.b2 b2Var8 = p3Var.y;
                TLRPC.TL_webPage tL_webPage3 = b2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.d2.o(tL_webPage3);
                    b2Var8.j = null;
                }
                p3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.T, this.w, this.y);
        org.telegram.ui.ActionBar.h2 h2Var = this.I;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.T, this.w, this.y));
        this.H.invalidate();
        l4 l4Var = this.x0;
        org.telegram.ui.web.k kVar = l4Var.e0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        y3 y3Var = l4Var.G;
        if (y3Var != null) {
            y3Var.i();
        }
    }

    public final void k(boolean z10) {
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            int i9 = 1;
            gh.o oVar = this.U;
            if (z10) {
                int i10 = this.V;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.V = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.j1.a().a));
                }
            }
            oVar.setVisibility(0);
            this.I.c((this.q0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, z10 ? 1.0f : 0.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new kh.g4(this, 14));
            this.s0.addListener(new n60(13, this, z10));
            this.s0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.s0.setDuration(360L);
            this.s0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.l1(this, i9));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.l1(this, i9), this.S ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.x0.e0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.q1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        ((ViewGroup.MarginLayoutParams) this.x0.e0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
