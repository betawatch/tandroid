package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l extends hv0 {
    public final /* synthetic */ m U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, int i) {
        super(i, null, context, false);
        this.U0 = mVar;
    }

    @Override // hv0
    public final void B(boolean z, String str) {
        m mVar = this.U0;
        if (z) {
            if (mVar.r == null) {
                iw iwVar = mVar.e;
                cw cwVar = new cw(mVar.getContext());
                mVar.r = cwVar;
                iwVar.addView(cwVar, nme.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new j1(mVar, (byte) 11));
                gl.U3(mVar.r, mVar.n, 1.0f, true, false);
            }
            cw cwVar2 = mVar.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = cwVar2.e;
            cwVar2.d.setText(k96.M0(2131742659, null));
            String r = hv0.r(url);
            textView.setText(vu3.m(gl.T2((r == null || Uri.parse(r) == null || Uri.parse(r).getAuthority() == null) ? k96.M0(2131742662, null) : k96.a0(null, null, 2131742660, Uri.parse(r).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            cwVar2.f.setText(str);
            cw cwVar3 = mVar.r;
            int i = bkb.Fl;
            cwVar3.b(gl.B(bkb.w0(null, i, false)) <= 0.721f, false);
            zkb.h(i, null, mVar.r);
        }
        cw cwVar4 = mVar.r;
        mVar.n = z;
        gl.U3(cwVar4, z, 1.0f, true, false);
        invalidate();
    }

    @Override // hv0
    public final void F() {
        this.U0.M.g0(true);
    }

    @Override // hv0
    public final void G(boolean z, boolean z2) {
        m mVar = this.U0;
        mVar.s = !z;
        mVar.w = !z2;
        o oVar = mVar.M;
        oVar.g0(true);
        if (mVar == oVar.v0[0]) {
            wt wtVar = oVar.i0;
            if (wtVar.a0 || wtVar.U) {
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
            wt wtVar2 = oVar.i0;
            m mVar2 = oVar.v0[0];
            wtVar2.setIsTonsite(mVar2 != null && mVar2.d());
            wt wtVar3 = oVar.i0;
            m mVar3 = oVar.v0[0];
            wtVar3.setIsLocal(mVar3 != null && mVar3.c());
        }
    }

    @Override // hv0
    public final void H(cv0 cv0Var) {
        this.U0.e.setWebView(cv0Var);
    }

    @Override // hv0
    public final void S(String str, boolean z) {
        atc atcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (atcVar = mVar.F) != null && atcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}
