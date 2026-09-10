package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.ma0 a;

    public ai0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.ma0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.Components.ma0 ma0Var = this.a;
        lVar.setTitle(LocaleController.getString(ma0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = ma0Var.g;
        if (ma0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            ma0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.a10 b10 = ma0Var.b();
            ma0Var.q = b10;
            ma0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.jx0 c10 = ma0Var.c();
            ma0Var.o = c10;
            ma0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.jx0 a10 = ma0Var.a();
            ma0Var.n = a10;
            ma0Var.m.addView(a10, w7.a6.c(-1.0f, -1));
            p2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(p2Var.getParentActivity(), null);
            ma0Var.p = vl0Var;
            vl0Var.setAdapter(ma0Var.f);
            ma0Var.p.o1();
            ma0Var.p.setLayoutManager(c0Var);
            ma0Var.p.setOnItemClickListener(new ai.g(ma0Var, 18));
            ma0Var.p.setOnScrollListener(ma0Var.D);
            ma0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, p2Var.getResourceProvider()));
            ma0Var.m.addView(ma0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.wr.h);
            jVar.C = false;
            jVar.m = false;
            ma0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ma0Var.m;
        this.actionBar.z(ma0Var.p, false);
        ma0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        vh.o oVar = this.a.s;
        if (oVar == null) {
            return true;
        }
        if (z10) {
            oVar.e(false);
        }
        return false;
    }
}
