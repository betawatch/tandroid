package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l extends qw0 {
    public final /* synthetic */ m U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, int i) {
        super(i, null, context, false);
        this.U0 = mVar;
    }

    @Override // qw0
    public final void B(boolean z, String str) {
        m mVar = this.U0;
        if (z) {
            if (mVar.r == null) {
                ix ixVar = mVar.e;
                cx cxVar = new cx(mVar.getContext());
                mVar.r = cxVar;
                ixVar.addView(cxVar, qoe.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new j1(mVar, (byte) 12));
                gm.T3(mVar.r, mVar.n, 1.0f, true, false);
            }
            cx cxVar2 = mVar.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = cxVar2.e;
            cxVar2.d.setText(jb6.M0(2131742585, null));
            String r = qw0.r(url);
            textView.setText(gw3.m(gm.S2((r == null || Uri.parse(r) == null || Uri.parse(r).getAuthority() == null) ? jb6.M0(2131742588, null) : jb6.a0(null, null, 2131742586, Uri.parse(r).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            cxVar2.f.setText(str);
            cx cxVar3 = mVar.r;
            int i = cmb.Fl;
            cxVar3.b(gm.B(cmb.w0(null, i, false)) <= 0.721f, false);
            anb.h(i, null, mVar.r);
        }
        cx cxVar4 = mVar.r;
        mVar.n = z;
        gm.T3(cxVar4, z, 1.0f, true, false);
        invalidate();
    }

    @Override // qw0
    public final void F() {
        this.U0.M.g0(true);
    }

    @Override // qw0
    public final void G(boolean z, boolean z2) {
        m mVar = this.U0;
        mVar.s = !z;
        mVar.w = !z2;
        o oVar = mVar.M;
        oVar.g0(true);
        if (mVar == oVar.v0[0]) {
            wu wuVar = oVar.i0;
            if (wuVar.a0 || wuVar.U) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                return;
            }
            if (oVar.G() || oVar.e0.size() > 1) {
                oVar.i0.N.c(true, (mVar.s || oVar.e0.size() > 1) ? 0.0f : 1.0f);
                oVar.i0.setBackButtonCached(mVar.s || oVar.e0.size() > 1);
                oVar.i0.Q.c();
            } else {
                oVar.i0.setBackButtonCached(false);
                oVar.i0.Q.c();
            }
            oVar.i0.setHasForward(mVar.w);
            wu wuVar2 = oVar.i0;
            m mVar2 = oVar.v0[0];
            wuVar2.setIsTonsite(mVar2 != null && mVar2.d());
            wu wuVar3 = oVar.i0;
            m mVar3 = oVar.v0[0];
            wuVar3.setIsLocal(mVar3 != null && mVar3.c());
        }
    }

    @Override // qw0
    public final void H(mw0 mw0Var) {
        this.U0.e.setWebView(mw0Var);
    }

    @Override // qw0
    public final void S(String str, boolean z) {
        bvc bvcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (bvcVar = mVar.F) != null && bvcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}
