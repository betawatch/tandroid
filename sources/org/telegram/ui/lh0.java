package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.p90 a;

    public lh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.p90(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 4));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.p90 p90Var = this.a;
        kVar.setTitle(LocaleController.getString(p90Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new db(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = p90Var.g;
        if (p90Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            p90Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.h00 b10 = p90Var.b();
            p90Var.q = b10;
            p90Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.iw0 c10 = p90Var.c();
            p90Var.o = c10;
            p90Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.iw0 a3 = p90Var.a();
            p90Var.n = a3;
            p90Var.m.addView(a3, h7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            f2.k0 k0Var = new f2.k0();
            org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(n2Var.getParentActivity(), null);
            p90Var.p = zk0Var;
            zk0Var.setAdapter(p90Var.f);
            p90Var.p.p1();
            p90Var.p.setLayoutManager(k0Var);
            p90Var.p.setOnItemClickListener(new ag.p0(p90Var, 3));
            p90Var.p.setOnScrollListener(p90Var.D);
            p90Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, n2Var.getResourceProvider()));
            p90Var.m.addView(p90Var.p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.er.h);
            lVar.C = false;
            lVar.m = false;
            p90Var.p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = p90Var.m;
        this.actionBar.B(p90Var.p, false);
        p90Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        fh.u uVar = this.a.s;
        if (uVar == null) {
            return true;
        }
        if (z10) {
            uVar.e(false);
        }
        return false;
    }
}
