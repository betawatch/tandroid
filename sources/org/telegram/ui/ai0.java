package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.la0 a;

    public ai0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.la0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.la0 la0Var = this.a;
        kVar.setTitle(LocaleController.getString(la0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = la0Var.g;
        if (la0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            la0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = la0Var.b();
            la0Var.q = b10;
            la0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.kx0 c10 = la0Var.c();
            la0Var.o = c10;
            la0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.kx0 a10 = la0Var.a();
            la0Var.n = a10;
            la0Var.m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(n2Var.getParentActivity(), null);
            la0Var.p = wl0Var;
            wl0Var.setAdapter(la0Var.f);
            la0Var.p.q1();
            la0Var.p.setLayoutManager(c0Var);
            la0Var.p.setOnItemClickListener(new ai.g(la0Var, 19));
            la0Var.p.setOnScrollListener(la0Var.D);
            la0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, n2Var.getResourceProvider()));
            la0Var.m.addView(la0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.m = false;
            la0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = la0Var.m;
        this.actionBar.z(la0Var.p, false);
        la0Var.e();
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
