package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.ActionBar.r2 {
    public final org.telegram.ui.Components.va0 a;

    public mh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.va0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, 13));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.va0 va0Var = this.a;
        kVar.setTitle(LocaleController.getString(va0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.r2 r2Var = va0Var.g;
        if (va0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            va0Var.m = frameLayout;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, r2Var.getResourceProvider());
            org.telegram.ui.Components.c10 b10 = va0Var.b();
            va0Var.q = b10;
            va0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.fy0 c10 = va0Var.c();
            va0Var.o = c10;
            va0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.fy0 a10 = va0Var.a();
            va0Var.n = a10;
            va0Var.m.addView(a10, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            r2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(r2Var.getParentActivity(), null);
            va0Var.p = nm0Var;
            nm0Var.setAdapter(va0Var.f);
            va0Var.p.u1();
            va0Var.p.setLayoutManager(c0Var);
            va0Var.p.setOnItemClickListener(new ai.k(va0Var, 24));
            va0Var.p.setOnScrollListener(va0Var.D);
            org.telegram.ui.ActionBar.f7.K(va0Var.p, org.telegram.ui.ActionBar.y6.i6, r2Var.getResourceProvider());
            va0Var.m.addView(va0Var.p, -1, -1);
            s4.l lVar = new s4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.ds.h);
            lVar.C = false;
            lVar.m = false;
            va0Var.p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = va0Var.m;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.nm0 nm0Var2 = va0Var.p;
        kVar2.getClass();
        kVar2.w(nm0Var2, org.telegram.ui.ActionBar.y6.a7, org.telegram.ui.ActionBar.y6.s8);
        va0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        yh.j jVar = this.a.s;
        if (jVar == null) {
            return true;
        }
        if (z10) {
            jVar.e(false);
        }
        return false;
    }
}
