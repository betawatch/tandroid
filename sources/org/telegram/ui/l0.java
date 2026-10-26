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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.web.u1 {
    public final /* synthetic */ j4 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j4 j4Var, Activity activity) {
        super(activity);
        this.B0 = j4Var;
    }

    @Override // org.telegram.ui.web.u1
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        m3 m3Var = this.B0.u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.f2 f2Var = m3Var.E;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = m3Var.E;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                m3Var.E = null;
                return null;
            }
        } else {
            if (m3Var.getWebView() != null) {
                org.telegram.ui.web.f2 f2Var3 = m3Var.E;
                if (f2Var3 != null && (f2Var3.f != m3Var.getWebView().b || m3Var.E.e != m3Var.getWebView().getProgress())) {
                    m3Var.E.d(m3Var.getWebView());
                    return m3Var.E;
                }
                if (m3Var.E != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.E.d)) {
                    return m3Var.E;
                }
                org.telegram.ui.web.f2 f2Var4 = m3Var.E;
                if (f2Var4 != null) {
                    f2Var4.a();
                    org.telegram.ui.web.f2 f2Var5 = m3Var.E;
                    TLRPC.TL_webPage tL_webPage2 = f2Var5.j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage2);
                        f2Var5.j = null;
                    }
                    m3Var.E = null;
                }
                org.telegram.ui.web.f2 f2Var6 = new org.telegram.ui.web.f2(m3Var.L.X);
                m3Var.E = f2Var6;
                org.telegram.ui.web.x0 webView = m3Var.getWebView();
                if (!f2Var6.b) {
                    f2Var6.b = true;
                    f2Var6.d = webView.getUrl();
                    f2Var6.e = webView.getProgress();
                    f2Var6.f = webView.b;
                    f2Var6.l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var6.k = ConnectionsManager.getInstance(f2Var6.a).sendRequest(tL_messages_getWebPage, new bi.i0(f2Var6, 23));
                }
                return m3Var.E;
            }
            org.telegram.ui.web.f2 f2Var7 = m3Var.E;
            if (f2Var7 != null) {
                f2Var7.a();
                org.telegram.ui.web.f2 f2Var8 = m3Var.E;
                TLRPC.TL_webPage tL_webPage3 = f2Var8.j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage3);
                    f2Var8.j = null;
                }
                m3Var.E = null;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.j2 j2Var = this.M;
        j2Var.a(f10);
        j2Var.b(i0.a.f(this.a0, this.w, this.y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.l lVar = j4Var.i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        v3 v3Var = j4Var.K;
        if (v3Var != null) {
            v3Var.i();
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
            bi.t tVar = this.b0;
            if (z10) {
                int i11 = this.c0;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.c0 = i12;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().a));
                }
            }
            tVar.setVisibility(0);
            this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.e4(this, 18));
            this.w0.addListener(new q40(14, this, z10));
            this.w0.setInterpolator(org.telegram.ui.Components.ds.h);
            this.w0.setDuration(360L);
            this.w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(this, i10), this.W ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.B0.i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override // org.telegram.ui.web.u1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
