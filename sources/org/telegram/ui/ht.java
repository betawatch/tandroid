package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ht extends org.telegram.ui.ActionBar.d2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Zj, org.telegram.ui.ActionBar.k6.Yj, org.telegram.ui.ActionBar.k6.Xj, org.telegram.ui.ActionBar.k6.dk, org.telegram.ui.ActionBar.k6.ek};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748767, 2131748776, 2131748771, 2131748457, 2131748773, 2131748783, 2131752595};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.n61 a;
    public org.telegram.ui.Components.m61 b;
    public FrameLayout c;
    public View d;
    public final ue.b e;
    public boolean f;
    public int h;
    public int n;

    public ht() {
        super(null);
        this.e = new ue.b();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748306, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 26));
        ai.d2 d2Var = new ai.d2(context, 27);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, d2Var, null);
        org.telegram.ui.Components.n61 n61Var = new org.telegram.ui.Components.n61(context, null);
        this.a = n61Var;
        n61Var.setAdapter(new ji.v(this, 1));
        this.c = new FrameLayout(context);
        this.b = this.a.j(-2, true);
        d2Var.addView(this.a, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        View view = new View(context);
        this.d = view;
        d2Var.addView(view, b8.mf.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(pi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.c.addView(this.b, b8.mf.c(48.0f, -1));
        this.c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.c;
        gh.g c2 = getBaseSimpleGlass().c.c(this.c, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c2);
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.n61 n61Var2 = this.a;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        baseSimpleGlass.l = d2Var;
        baseSimpleGlass.m = n61Var2;
        baseSimpleGlass.a.c(n61Var2);
        baseSimpleGlass.g(d2Var, y4Var, e6Var);
        getBaseSimpleGlass().n = new ci.g(6, this, d2Var);
        getBaseSimpleGlass().m = null;
        d2Var.addView(this.c, b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = d2Var;
        return d2Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.h = i10;
        this.n = i12;
        this.c.setTranslationY(pi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            et etVar = (et) it.next();
            ht htVar = etVar.w3;
            pi.a.e(etVar, htVar.h, htVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f) {
            this.f = true;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof et) {
            et etVar = (et) currentView;
            etVar.e1(new bt(etVar), 700, true);
        }
    }
}
