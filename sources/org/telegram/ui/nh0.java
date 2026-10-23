package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nh0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.ya0 a;

    public nh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.ya0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ya0 ya0Var = this.a;
        kVar.setTitle(LocaleController.getString(ya0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = ya0Var.g;
        if (ya0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            ya0Var.m = frameLayout;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, o2Var.getResourceProvider());
            org.telegram.ui.Components.b10 b10 = ya0Var.b();
            ya0Var.q = b10;
            ya0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.wx0 c10 = ya0Var.c();
            ya0Var.o = c10;
            ya0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.wx0 a10 = ya0Var.a();
            ya0Var.n = a10;
            ya0Var.m.addView(a10, w7.z5.c(-1.0f, -1));
            o2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(o2Var.getParentActivity(), null);
            ya0Var.p = mm0Var;
            mm0Var.setAdapter(ya0Var.f);
            ya0Var.p.t1();
            ya0Var.p.setLayoutManager(b0Var);
            ya0Var.p.setOnItemClickListener(new ai.xa(ya0Var, 23));
            ya0Var.p.setOnScrollListener(ya0Var.D);
            org.telegram.ui.ActionBar.r6.L(ya0Var.p, org.telegram.ui.ActionBar.k6.i6, o2Var.getResourceProvider());
            ya0Var.m.addView(ya0Var.p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.bs.h);
            kVar2.C = false;
            kVar2.m = false;
            ya0Var.p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = ya0Var.m;
        this.actionBar.z(ya0Var.p, false);
        ya0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
