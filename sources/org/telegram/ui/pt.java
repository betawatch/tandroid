package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pt extends org.telegram.ui.ActionBar.h2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.n6.Yj, org.telegram.ui.ActionBar.n6.Zj, org.telegram.ui.ActionBar.n6.ck, org.telegram.ui.ActionBar.n6.bk, org.telegram.ui.ActionBar.n6.ak, org.telegram.ui.ActionBar.n6.gk, org.telegram.ui.ActionBar.n6.hk};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748567, 2131748576, 2131748571, 2131748257, 2131748573, 2131748583, 2131752584};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.g71 a;
    public org.telegram.ui.Components.f71 b;
    public FrameLayout c;
    public View d;
    public final xe.b e;
    public boolean f;
    public int h;
    public int n;

    public pt() {
        super(null);
        this.e = new xe.b();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748106, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 28));
        bi.p2 p2Var = new bi.p2(context, 27);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, p2Var, null);
        org.telegram.ui.Components.g71 g71Var = new org.telegram.ui.Components.g71(context, null);
        this.a = g71Var;
        g71Var.setAdapter(new li.x(this, 1));
        this.c = new FrameLayout(context);
        this.b = this.a.i(-2, true);
        p2Var.addView(this.a, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        View view = new View(context);
        this.d = view;
        p2Var.addView(view, c8.ma.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.c.addView(this.b, c8.ma.c(48.0f, -1));
        this.c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.c;
        fh.g c10 = getBaseSimpleGlass().c.c(this.c, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.g71 g71Var2 = this.a;
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        baseSimpleGlass.m = p2Var;
        baseSimpleGlass.n = g71Var2;
        baseSimpleGlass.a.c(g71Var2);
        baseSimpleGlass.g(p2Var, a5Var, i6Var);
        getBaseSimpleGlass().o = new di.f(6, this, p2Var);
        getBaseSimpleGlass().n = null;
        p2Var.addView(this.c, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = p2Var;
        return p2Var;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.n = i12;
        this.c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            mt mtVar = (mt) it.next();
            pt ptVar = mtVar.w3;
            ri.a.e(mtVar, ptVar.h, ptVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f) {
            this.f = true;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.t4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof mt) {
            mt mtVar = (mt) currentView;
            mtVar.e1(new jt(mtVar), 700, true);
        }
    }
}
