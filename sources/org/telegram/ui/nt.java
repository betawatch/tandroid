package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nt extends org.telegram.ui.ActionBar.e2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.j6.Yj, org.telegram.ui.ActionBar.j6.Zj, org.telegram.ui.ActionBar.j6.ck, org.telegram.ui.ActionBar.j6.bk, org.telegram.ui.ActionBar.j6.ak, org.telegram.ui.ActionBar.j6.gk, org.telegram.ui.ActionBar.j6.hk};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748759, 2131748768, 2131748763, 2131748449, 2131748765, 2131748775, 2131752595};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.w61 a;
    public org.telegram.ui.Components.v61 b;
    public FrameLayout c;
    public View d;
    public final xe.b e;
    public boolean f;
    public int h;
    public int n;

    public nt() {
        super(null);
        this.e = new xe.b();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748298, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 26));
        bi.v1 v1Var = new bi.v1(context, 27);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, v1Var, null);
        org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(context, null);
        this.a = w61Var;
        w61Var.setAdapter(new li.x(this, 1));
        this.c = new FrameLayout(context);
        this.b = this.a.i(-2, true);
        v1Var.addView(this.a, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        View view = new View(context);
        this.d = view;
        v1Var.addView(view, c8.ja.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.c.addView(this.b, c8.ja.c(48.0f, -1));
        this.c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.c;
        fh.g c10 = getBaseSimpleGlass().c.c(this.c, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.w61 w61Var2 = this.a;
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        baseSimpleGlass.m = v1Var;
        baseSimpleGlass.n = w61Var2;
        baseSimpleGlass.a.c(w61Var2);
        baseSimpleGlass.g(v1Var, w4Var, e6Var);
        getBaseSimpleGlass().o = new di.f(6, this, v1Var);
        getBaseSimpleGlass().n = null;
        v1Var.addView(this.c, c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = v1Var;
        return v1Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.n = i12;
        this.c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            kt ktVar = (kt) it.next();
            nt ntVar = ktVar.w3;
            ri.a.e(ktVar, ntVar.h, ntVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f) {
            this.f = true;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof kt) {
            kt ktVar = (kt) currentView;
            ktVar.e1(new gt(ktVar), 700, true);
        }
    }
}
