package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.xa0 a;

    public jh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.xa0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.xa0 xa0Var = this.a;
        kVar.setTitle(LocaleController.getString(xa0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = xa0Var.g;
        if (xa0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            xa0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.b10 b10 = xa0Var.b();
            xa0Var.q = b10;
            xa0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.sx0 c10 = xa0Var.c();
            xa0Var.o = c10;
            xa0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.sx0 a10 = xa0Var.a();
            xa0Var.n = a10;
            xa0Var.m.addView(a10, w7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(n2Var.getParentActivity(), null);
            xa0Var.p = im0Var;
            im0Var.setAdapter(xa0Var.f);
            xa0Var.p.p1();
            xa0Var.p.setLayoutManager(b0Var);
            xa0Var.p.setOnItemClickListener(new ai.wa(xa0Var, 23));
            xa0Var.p.setOnScrollListener(xa0Var.D);
            xa0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, n2Var.getResourceProvider()));
            xa0Var.m.addView(xa0Var.p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.bs.h);
            kVar2.C = false;
            kVar2.m = false;
            xa0Var.p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = xa0Var.m;
        this.actionBar.A(xa0Var.p, false);
        xa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        xh.j jVar = this.a.s;
        if (jVar == null) {
            return true;
        }
        if (z10) {
            jVar.e(false);
        }
        return false;
    }
}
