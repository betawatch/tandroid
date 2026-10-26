package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kh0 extends org.telegram.ui.ActionBar.r2 {
    public final org.telegram.ui.Components.ua0 a;

    public kh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.ua0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 13));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ua0 ua0Var = this.a;
        kVar.setTitle(LocaleController.getString(ua0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.r2 r2Var = ua0Var.g;
        if (ua0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            ua0Var.m = frameLayout;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, r2Var.getResourceProvider());
            org.telegram.ui.Components.c10 b10 = ua0Var.b();
            ua0Var.q = b10;
            ua0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.ey0 c10 = ua0Var.c();
            ua0Var.o = c10;
            ua0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.ey0 a10 = ua0Var.a();
            ua0Var.n = a10;
            ua0Var.m.addView(a10, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            r2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(r2Var.getParentActivity(), null);
            ua0Var.p = mm0Var;
            mm0Var.setAdapter(ua0Var.f);
            ua0Var.p.u1();
            ua0Var.p.setLayoutManager(c0Var);
            ua0Var.p.setOnItemClickListener(new ai.k(ua0Var, 24));
            ua0Var.p.setOnScrollListener(ua0Var.D);
            org.telegram.ui.ActionBar.f7.K(ua0Var.p, org.telegram.ui.ActionBar.y6.i6, r2Var.getResourceProvider());
            ua0Var.m.addView(ua0Var.p, -1, -1);
            s4.l lVar = new s4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.ds.h);
            lVar.C = false;
            lVar.m = false;
            ua0Var.p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = ua0Var.m;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.mm0 mm0Var2 = ua0Var.p;
        kVar2.getClass();
        kVar2.w(mm0Var2, org.telegram.ui.ActionBar.y6.a7, org.telegram.ui.ActionBar.y6.s8);
        ua0Var.e();
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
