package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bi0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.ka0 a;

    public bi0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.ka0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ka0 ka0Var = this.a;
        kVar.setTitle(LocaleController.getString(ka0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = ka0Var.g;
        if (ka0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            ka0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ka0Var.b();
            ka0Var.q = b10;
            ka0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.jx0 c10 = ka0Var.c();
            ka0Var.o = c10;
            ka0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.jx0 a10 = ka0Var.a();
            ka0Var.n = a10;
            ka0Var.m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(n2Var.getParentActivity(), null);
            ka0Var.p = vl0Var;
            vl0Var.setAdapter(ka0Var.f);
            ka0Var.p.q1();
            ka0Var.p.setLayoutManager(c0Var);
            ka0Var.p.setOnItemClickListener(new ai.g(ka0Var, 19));
            ka0Var.p.setOnScrollListener(ka0Var.D);
            ka0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, n2Var.getResourceProvider()));
            ka0Var.m.addView(ka0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.m = false;
            ka0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ka0Var.m;
        this.actionBar.z(ka0Var.p, false);
        ka0Var.e();
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
