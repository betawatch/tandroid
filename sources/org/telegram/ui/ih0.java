package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ih0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.z90 a;

    public ih0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.z90(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.Components.z90 z90Var = this.a;
        lVar.setTitle(LocaleController.getString(z90Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = z90Var.g;
        if (z90Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            z90Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, o2Var.getResourceProvider()));
            org.telegram.ui.Components.p00 b10 = z90Var.b();
            z90Var.q = b10;
            z90Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.qw0 c3 = z90Var.c();
            z90Var.o = c3;
            z90Var.m.addView(c3, -1, -1);
            org.telegram.ui.Components.qw0 a10 = z90Var.a();
            z90Var.n = a10;
            z90Var.m.addView(a10, i7.f6.c(-1.0f, -1));
            o2Var.getParentActivity();
            f2.j0 j0Var = new f2.j0();
            org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(o2Var.getParentActivity(), null);
            z90Var.p = jl0Var;
            jl0Var.setAdapter(z90Var.f);
            z90Var.p.p1();
            z90Var.p.setLayoutManager(j0Var);
            z90Var.p.setOnItemClickListener(new bg.o(z90Var, 5));
            z90Var.p.setOnScrollListener(z90Var.D);
            z90Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, o2Var.getResourceProvider()));
            z90Var.m.addView(z90Var.p, -1, -1);
            f2.l lVar2 = new f2.l();
            lVar2.n(350L);
            lVar2.o(org.telegram.ui.Components.jr.h);
            lVar2.C = false;
            lVar2.m = false;
            z90Var.p.setItemAnimator(lVar2);
        }
        FrameLayout frameLayout2 = z90Var.m;
        this.actionBar.A(z90Var.p, false);
        z90Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        hh.u uVar = this.a.s;
        if (uVar == null) {
            return true;
        }
        if (z10) {
            uVar.e(false);
        }
        return false;
    }
}
