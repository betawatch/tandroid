package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bi0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.na0 a;

    public bi0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.na0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.na0 na0Var = this.a;
        kVar.setTitle(LocaleController.getString(na0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = na0Var.g;
        if (na0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            na0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = na0Var.b();
            na0Var.q = b10;
            na0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.lx0 c10 = na0Var.c();
            na0Var.o = c10;
            na0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.lx0 a10 = na0Var.a();
            na0Var.n = a10;
            na0Var.m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(n2Var.getParentActivity(), null);
            na0Var.p = yl0Var;
            yl0Var.setAdapter(na0Var.f);
            na0Var.p.q1();
            na0Var.p.setLayoutManager(c0Var);
            na0Var.p.setOnItemClickListener(new ai.g(na0Var, 19));
            na0Var.p.setOnScrollListener(na0Var.D);
            na0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, n2Var.getResourceProvider()));
            na0Var.m.addView(na0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.m = false;
            na0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = na0Var.m;
        this.actionBar.z(na0Var.p, false);
        na0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.a.s;
        if (mVar == null) {
            return true;
        }
        if (z10) {
            mVar.e(false);
        }
        return false;
    }
}
