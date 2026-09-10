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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.v1 {
    public final /* synthetic */ j4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j4 j4Var, Activity activity) {
        super(activity);
        this.B0 = j4Var;
    }

    @Override // org.telegram.ui.web.v1
    public final org.telegram.ui.web.i2 getInstantViewLoader() {
        n3 n3Var = this.B0.u0[0];
        if (!n3Var.f()) {
            org.telegram.ui.web.i2 i2Var = n3Var.y;
            if (i2Var != null) {
                i2Var.a();
                org.telegram.ui.web.i2 i2Var2 = n3Var.y;
                TLRPC.TL_webPage tL_webPage = i2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.k2.o(tL_webPage);
                    i2Var2.j = null;
                }
                n3Var.y = null;
                return null;
            }
        } else {
            if (n3Var.getWebView() != null) {
                org.telegram.ui.web.i2 i2Var3 = n3Var.y;
                if (i2Var3 != null && (i2Var3.f != n3Var.getWebView().b || n3Var.y.e != n3Var.getWebView().getProgress())) {
                    n3Var.y.d(n3Var.getWebView());
                    return n3Var.y;
                }
                if (n3Var.y != null && TextUtils.equals(n3Var.getWebView().getUrl(), n3Var.y.d)) {
                    return n3Var.y;
                }
                org.telegram.ui.web.i2 i2Var4 = n3Var.y;
                if (i2Var4 != null) {
                    i2Var4.a();
                    org.telegram.ui.web.i2 i2Var5 = n3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = i2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.k2.o(tL_webPage2);
                        i2Var5.j = null;
                    }
                    n3Var.y = null;
                }
                org.telegram.ui.web.i2 i2Var6 = new org.telegram.ui.web.i2(n3Var.K.X);
                n3Var.y = i2Var6;
                org.telegram.ui.web.y0 webView = n3Var.getWebView();
                if (!i2Var6.b) {
                    i2Var6.b = true;
                    i2Var6.d = webView.getUrl();
                    i2Var6.e = webView.getProgress();
                    i2Var6.f = webView.b;
                    i2Var6.l = org.telegram.ui.web.k2.e(webView, new org.telegram.ui.web.h2(i2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = i2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    i2Var6.k = ConnectionsManager.getInstance(i2Var6.a).sendRequest(tL_messages_getWebPage, new bi.c2(i2Var6, 15));
                }
                return n3Var.y;
            }
            org.telegram.ui.web.i2 i2Var7 = n3Var.y;
            if (i2Var7 != null) {
                i2Var7.a();
                org.telegram.ui.web.i2 i2Var8 = n3Var.y;
                TLRPC.TL_webPage tL_webPage3 = i2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.k2.o(tL_webPage3);
                    i2Var8.j = null;
                }
                n3Var.y = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.i2 i2Var = this.M;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.a0, this.w, this.y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.l lVar = j4Var.i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.i();
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
            ei.o oVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().a));
                }
            }
            oVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 23));
            this.w0.addListener(new iw0(9, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.wr.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.B0.i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.v1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
