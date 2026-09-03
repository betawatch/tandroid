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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o0 extends org.telegram.ui.web.u1 {
    public final /* synthetic */ n4 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n4 n4Var, Activity activity) {
        super(activity);
        this.y0 = n4Var;
    }

    @Override // org.telegram.ui.web.u1
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        r3 r3Var = this.y0.r0[0];
        if (!r3Var.f()) {
            org.telegram.ui.web.f2 f2Var = r3Var.y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = r3Var.y;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                r3Var.y = null;
                return null;
            }
        } else {
            if (r3Var.getWebView() != null) {
                org.telegram.ui.web.f2 f2Var3 = r3Var.y;
                if (f2Var3 != null && (f2Var3.f != r3Var.getWebView().b || r3Var.y.e != r3Var.getWebView().getProgress())) {
                    r3Var.y.d(r3Var.getWebView());
                    return r3Var.y;
                }
                if (r3Var.y != null && TextUtils.equals(r3Var.getWebView().getUrl(), r3Var.y.d)) {
                    return r3Var.y;
                }
                org.telegram.ui.web.f2 f2Var4 = r3Var.y;
                if (f2Var4 != null) {
                    f2Var4.a();
                    org.telegram.ui.web.f2 f2Var5 = r3Var.y;
                    TLRPC.TL_webPage tL_webPage2 = f2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage2);
                        f2Var5.j = null;
                    }
                    r3Var.y = null;
                }
                org.telegram.ui.web.f2 f2Var6 = new org.telegram.ui.web.f2(r3Var.H.U);
                r3Var.y = f2Var6;
                org.telegram.ui.web.y0 webView = r3Var.getWebView();
                if (!f2Var6.b) {
                    f2Var6.b = true;
                    f2Var6.d = webView.getUrl();
                    f2Var6.e = webView.getProgress();
                    f2Var6.f = webView.b;
                    f2Var6.l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var6.k = ConnectionsManager.getInstance(f2Var6.a).sendRequest(tL_messages_getWebPage, new ff.a(f2Var6, 14));
                }
                return r3Var.y;
            }
            org.telegram.ui.web.f2 f2Var7 = r3Var.y;
            if (f2Var7 != null) {
                f2Var7.a();
                org.telegram.ui.web.f2 f2Var8 = r3Var.y;
                TLRPC.TL_webPage tL_webPage3 = f2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage3);
                    f2Var8.j = null;
                }
                r3Var.y = null;
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
        n4 n4Var = this.y0;
        org.telegram.ui.web.k kVar = n4Var.f0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            a4Var.i();
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
            lh.n nVar = this.V;
            if (z4) {
                int i11 = this.W;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.W = i12;
                    nVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().a));
                }
            }
            nVar.setVisibility(0);
            this.J.c((this.r0 || z4) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z4 ? 1.0f : 0.0f);
            this.t0 = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 11));
            this.t0.addListener(new s61(5, this, z4));
            this.t0.setInterpolator(org.telegram.ui.Components.mr.h);
            this.t0.setDuration(360L);
            this.t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(this, i10), this.T ? 100L : 0L);
        }
        org.telegram.ui.web.k kVar = this.y0.f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override // org.telegram.ui.web.u1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.y0.f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
