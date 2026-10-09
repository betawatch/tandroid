package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.eb0 a;

    public ai0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.eb0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.eb0 eb0Var = this.a;
        kVar.setTitle(LocaleController.getString(eb0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = eb0Var.g;
        if (eb0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            eb0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.j10 b10 = eb0Var.b();
            eb0Var.q = b10;
            eb0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.ay0 c10 = eb0Var.c();
            eb0Var.o = c10;
            eb0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.ay0 a10 = eb0Var.a();
            eb0Var.n = a10;
            eb0Var.m.addView(a10, w7.x5.d(-1.0f, -1));
            n2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(n2Var.getParentActivity(), null);
            eb0Var.p = qm0Var;
            qm0Var.setAdapter(eb0Var.f);
            eb0Var.p.p1();
            eb0Var.p.setLayoutManager(d0Var);
            eb0Var.p.setOnItemClickListener(new ai.g(eb0Var, 19));
            eb0Var.p.setOnScrollListener(eb0Var.D);
            eb0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, n2Var.getResourceProvider()));
            eb0Var.m.addView(eb0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.hs.h);
            jVar.C = false;
            jVar.m = false;
            eb0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = eb0Var.m;
        this.actionBar.B(eb0Var.p, false);
        eb0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.a.s;
        if (kVar == null) {
            return true;
        }
        if (z10) {
            kVar.e(false);
        }
        return false;
    }
}
