package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lu extends org.telegram.ui.ActionBar.k2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.t6.Vj, org.telegram.ui.ActionBar.t6.Wj, org.telegram.ui.ActionBar.t6.Zj, org.telegram.ui.ActionBar.t6.Yj, org.telegram.ui.ActionBar.t6.Xj, org.telegram.ui.ActionBar.t6.dk, org.telegram.ui.ActionBar.t6.ek};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748769, 2131748778, 2131748773, 2131748464, 2131748775, 2131748785, 2131752595};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.x71 a;
    public org.telegram.ui.Components.w71 b;
    public FrameLayout c;
    public View d;
    public final je.b e;
    public boolean f;
    public int h;
    public int n;

    public lu() {
        super(null);
        this.e = new je.b();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748312, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 16));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 29);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, a5Var, null);
        org.telegram.ui.Components.x71 x71Var = new org.telegram.ui.Components.x71(context, null);
        this.a = x71Var;
        x71Var.setAdapter(new ig.n(this, 1));
        this.c = new FrameLayout(context);
        this.b = this.a.n(-2, true);
        a5Var.addView(this.a, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        View view = new View(context);
        this.d = view;
        a5Var.addView(view, w7.b6.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(ei.b.d(this.h) - org.telegram.messenger.i0.L(9.66f));
        this.c.addView(this.b, w7.b6.c(48.0f, -1));
        this.c.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        FrameLayout frameLayout = this.c;
        vg.f c10 = getBaseSimpleGlass().c.c(this.c, null, false);
        c10.o(w7.b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        frameLayout.setBackground(c10);
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.x71 x71Var2 = this.a;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        baseSimpleGlass.l = a5Var;
        baseSimpleGlass.m = x71Var2;
        baseSimpleGlass.a.c(x71Var2);
        baseSimpleGlass.g(a5Var, i5Var, p6Var);
        getBaseSimpleGlass().n = new ei.a(5, this, a5Var);
        getBaseSimpleGlass().m = null;
        a5Var.addView(this.c, w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = a5Var;
        return a5Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.i0.L(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.n = i13;
        this.c.setTranslationY(ei.b.d(i11) - org.telegram.messenger.i0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            iu iuVar = (iu) it.next();
            lu luVar = iuVar.v3;
            ei.b.e(iuVar, luVar.h, luVar.n, org.telegram.messenger.i0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f) {
            this.f = true;
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof iu) {
            iu iuVar = (iu) currentView;
            iuVar.e1(new fu(iuVar), 700, true);
        }
    }
}
