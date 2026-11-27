package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l extends rv0 {
    public final /* synthetic */ m U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, int i) {
        super(i, null, context, false);
        this.U0 = mVar;
    }

    @Override // rv0
    public final void B(boolean z, String str) {
        m mVar = this.U0;
        if (z) {
            if (mVar.r == null) {
                jw jwVar = mVar.e;
                dw dwVar = new dw(mVar.getContext());
                mVar.r = dwVar;
                jwVar.addView(dwVar, tre.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new k1(mVar, (byte) 11));
                hl.T3(mVar.r, mVar.n, 1.0f, true, false);
            }
            dw dwVar2 = mVar.r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = dwVar2.e;
            dwVar2.d.setText(ob6.M0(2131742553, null));
            String r = rv0.r(url);
            textView.setText(pv3.m(hl.S2((r == null || Uri.parse(r) == null || Uri.parse(r).getAuthority() == null) ? ob6.M0(2131742556, null) : ob6.a0(null, null, 2131742554, Uri.parse(r).getAuthority())), textView.getPaint().getFontMetricsInt(), false, null, 0));
            dwVar2.f.setText(str);
            dw dwVar3 = mVar.r;
            int i = aob.Gl;
            dwVar3.b(hl.B(aob.w0(null, i, false)) <= 0.721f, false);
            yob.h(i, null, mVar.r);
        }
        dw dwVar4 = mVar.r;
        mVar.n = z;
        hl.T3(dwVar4, z, 1.0f, true, false);
        invalidate();
    }

    @Override // rv0
    public final void F() {
        this.U0.M.g0(true);
    }

    @Override // rv0
    public final void G(boolean z, boolean z2) {
        m mVar = this.U0;
        mVar.s = !z;
        mVar.w = !z2;
        o oVar = mVar.M;
        oVar.g0(true);
        if (mVar == oVar.v0[0]) {
            xt xtVar = oVar.i0;
            if (xtVar.a0 || xtVar.U) {
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
            xt xtVar2 = oVar.i0;
            m mVar2 = oVar.v0[0];
            xtVar2.setIsTonsite(mVar2 != null && mVar2.d());
            xt xtVar3 = oVar.i0;
            m mVar3 = oVar.v0[0];
            xtVar3.setIsLocal(mVar3 != null && mVar3.c());
        }
    }

    @Override // rv0
    public final void H(nv0 nv0Var) {
        this.U0.e.setWebView(nv0Var);
    }

    @Override // rv0
    public final void S(String str, boolean z) {
        pxc pxcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (pxcVar = mVar.F) != null && pxcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}
