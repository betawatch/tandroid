package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fi0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.db0 a;

    public fi0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.db0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.db0 db0Var = this.a;
        kVar.setTitle(LocaleController.getString(db0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = db0Var.g;
        if (db0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            db0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.f10 b10 = db0Var.b();
            db0Var.q = b10;
            db0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.wx0 c10 = db0Var.c();
            db0Var.o = c10;
            db0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.wx0 a10 = db0Var.a();
            db0Var.n = a10;
            db0Var.m.addView(a10, w7.a6.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(m2Var.getParentActivity(), null);
            db0Var.p = mm0Var;
            mm0Var.setAdapter(db0Var.f);
            db0Var.p.p1();
            db0Var.p.setLayoutManager(b0Var);
            db0Var.p.setOnItemClickListener(new bi.d(db0Var, 19));
            db0Var.p.setOnScrollListener(db0Var.D);
            db0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, m2Var.getResourceProvider()));
            db0Var.m.addView(db0Var.p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.es.h);
            kVar2.C = false;
            kVar2.m = false;
            db0Var.p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = db0Var.m;
        this.actionBar.A(db0Var.p, false);
        db0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        xh.k kVar = this.a.s;
        if (kVar == null) {
            return true;
        }
        if (z10) {
            kVar.e(false);
        }
        return false;
    }
}
