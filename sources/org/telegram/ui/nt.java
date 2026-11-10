package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nt extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.m6.Vj, org.telegram.ui.ActionBar.m6.Wj, org.telegram.ui.ActionBar.m6.Zj, org.telegram.ui.ActionBar.m6.Yj, org.telegram.ui.ActionBar.m6.Xj, org.telegram.ui.ActionBar.m6.dk, org.telegram.ui.ActionBar.m6.ek};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748759, 2131748768, 2131748763, 2131748449, 2131748765, 2131748775, 2131752595};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.v61 a;
    public org.telegram.ui.Components.u61 b;
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748298, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 25));
        di.b4 b4Var = new di.b4(context, 25);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, b4Var, null);
        org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(context, null);
        this.a = v61Var;
        v61Var.setAdapter(new ii.x(this, 1));
        this.c = new FrameLayout(context);
        this.b = this.a.n(-2, true);
        b4Var.addView(this.a, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        View view = new View(context);
        this.d = view;
        b4Var.addView(view, c8.ha.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(oi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.c.addView(this.b, c8.ha.c(48.0f, -1));
        this.c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.c;
        fh.g c10 = getBaseSimpleGlass().c.c(this.c, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.v61 v61Var2 = this.a;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = this.resourceProvider;
        baseSimpleGlass.m = b4Var;
        baseSimpleGlass.n = v61Var2;
        baseSimpleGlass.a.c(v61Var2);
        baseSimpleGlass.g(b4Var, z4Var, h6Var);
        getBaseSimpleGlass().o = new bi.g(8, this, b4Var);
        getBaseSimpleGlass().n = null;
        b4Var.addView(this.c, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = b4Var;
        return b4Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.n = i12;
        this.c.setTranslationY(oi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            kt ktVar = (kt) it.next();
            nt ntVar = ktVar.v3;
            oi.a.e(ktVar, ntVar.h, ntVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.f) {
            this.f = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    @Override // org.telegram.ui.ActionBar.f2
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
