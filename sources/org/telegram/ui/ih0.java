package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ih0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.l90 a;

    public ih0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.l90(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 3));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.l90 l90Var = this.a;
        kVar.setTitle(LocaleController.getString(l90Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = l90Var.g;
        if (l90Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            l90Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, o2Var.getResourceProvider()));
            org.telegram.ui.Components.e00 b10 = l90Var.b();
            l90Var.q = b10;
            l90Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.gw0 c10 = l90Var.c();
            l90Var.o = c10;
            l90Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.gw0 a3 = l90Var.a();
            l90Var.n = a3;
            l90Var.m.addView(a3, g7.e6.c(-1.0f, -1));
            o2Var.getParentActivity();
            f2.m0 m0Var = new f2.m0();
            org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(o2Var.getParentActivity(), null);
            l90Var.p = wk0Var;
            wk0Var.setAdapter(l90Var.f);
            l90Var.p.p1();
            l90Var.p.setLayoutManager(m0Var);
            l90Var.p.setOnItemClickListener(new eh.j(l90Var, 1));
            l90Var.p.setOnScrollListener(l90Var.D);
            l90Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, o2Var.getResourceProvider()));
            l90Var.m.addView(l90Var.p, -1, -1);
            f2.n nVar = new f2.n();
            nVar.n(350L);
            nVar.o(org.telegram.ui.Components.gr.h);
            nVar.C = false;
            nVar.m = false;
            l90Var.p.setItemAnimator(nVar);
        }
        FrameLayout frameLayout2 = l90Var.m;
        this.actionBar.z(l90Var.p, false);
        l90Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        eh.w wVar = this.a.s;
        if (wVar == null) {
            return true;
        }
        if (z10) {
            wVar.e(false);
        }
        return false;
    }
}
