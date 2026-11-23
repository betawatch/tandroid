package org.telegram.ui.ActionBar;

import a8.r7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import c8.l9;
import c8.ma;
import fi.f9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.de0;
import org.telegram.ui.me0;
import org.telegram.ui.ox;
import org.telegram.ui.t60;
import org.telegram.ui.wm;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements r4, pg.b {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public k E;
    public int E0;
    public f3 F;
    public Runnable F0;
    public r7 G;
    public Runnable G0;
    public r H;
    public boolean H0;
    public g2 I;
    public View I0;
    public g2 J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public s K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public t60 P0;
    public boolean Q;
    public o4 Q0;
    public boolean R;
    public final Activity R0;
    public int S;
    public final boolean S0;
    public int T;
    public boolean T0;
    public boolean U;
    public boolean U0;
    public VelocityTracker V;
    public List V0;
    public boolean W;
    public List W0;
    public final Rect X0;
    public boolean Y0;
    public Runnable Z0;
    public boolean a;
    public boolean a0;
    public int a1;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public Window c;
    public final ArrayList c0;
    public final Path c1;
    public Runnable d;
    public final ArrayList d0;
    public final float[] d1;
    public Runnable e;
    public final hi.c5 e0;
    public boolean e1;
    public boolean f;
    public u4 f0;
    public final int[] f1;
    public u4 g0;
    public boolean g1;
    public boolean h;
    public wm h0;
    public int h1;
    public final ArrayList i0;
    public final org.telegram.ui.Components.d6 i1;
    public ArrayList j0;
    public boolean j1;
    public final ArrayList k0;
    public boolean k1;
    public int[] l0;
    public boolean l1;
    public int[] m0;
    public float m1;
    public boolean n;
    public int[] n0;
    public boolean n1;
    public int[] o0;
    public AnimatorSet o1;
    public int p0;
    public ArrayList p1;
    public zm q0;
    public final o q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public w s;
    public final h2.f s0;
    public int s1;
    public float t0;
    public r0.l1 t1;
    public boolean u0;
    public i0.b u1;
    public l6 v0;
    public i0.b v1;
    public w w;
    public boolean w0;
    public w x;
    public boolean x0;
    public o3 y;
    public int y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        hi.c5 c5Var = new hi.c5();
        c5Var.b = new SparseIntArray();
        c5Var.c = new int[]{m6.rb, m6.ub, m6.vb, m6.wb, m6.Rc, m6.tb};
        this.e0 = c5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new h2.f((int[]) null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new org.telegram.ui.Components.d6(this, 280L, nr.h);
        this.p1 = new ArrayList();
        this.q1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.u1 = bVar;
        this.v1 = bVar;
        this.R0 = (Activity) context;
        this.S0 = z10;
        if (x1 == null) {
            x1 = getResources().getDrawable(R.drawable.layer_shadow);
            w1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            y1 = new Paint();
        }
        org.telegram.tgnet.u uVar = new org.telegram.tgnet.u(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(ArrayList arrayList, View view) {
        if (view instanceof pg.b) {
            arrayList.addAll(((pg.b) view).F());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                G(arrayList, viewGroup.getChildAt(i7));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z10) {
            if (actionBarLayout.V0.size() >= 2) {
                ((g2) p5.c.h(1, actionBarLayout.V0)).prepareFragmentToSlide(true, false);
                g2 g2Var = (g2) p5.c.h(2, actionBarLayout.V0);
                g2Var.prepareFragmentToSlide(false, false);
                g2Var.onPause();
                View view = g2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    g2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(g2Var.fragmentView);
                }
                k kVar = g2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(g2Var.actionBar);
                }
                g2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.V0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            g2 g2Var2 = (g2) p5.c.h(1, actionBarLayout.V0);
            g2Var2.prepareFragmentToSlide(true, false);
            g2Var2.onPause();
            g2Var2.onFragmentDestroy();
            g2Var2.setParentLayout(null);
            List list = actionBarLayout.V0;
            list.remove(list.size() - 1);
            actionBarLayout.L("onSlideAnimationEnd");
            w wVar = actionBarLayout.s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.w;
            actionBarLayout.s = wVar2;
            actionBarLayout.w = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view2 = actionBarLayout.x;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.V0.size() > 0) {
                g2 g2Var3 = (g2) p5.c.h(1, actionBarLayout.V0);
                actionBarLayout.E = g2Var3.actionBar;
                g2Var3.onResume();
                g2Var3.onBecomeFullyVisible();
                g2Var3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.w.setVisibility(4);
        actionBarLayout.R = false;
        actionBarLayout.U = false;
        actionBarLayout.s.setTranslationX(0.0f);
        actionBarLayout.w.setTranslationX(0.0f);
        actionBarLayout.s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                Rect rect = org.telegram.messenger.g0.Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (u10 = u((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return u10;
                    }
                }
            }
        }
        return null;
    }

    public static boolean z(int i7, int i10, int i11) {
        if (i7 != m6.g5 && i7 != m6.Rc && i7 != m6.Ie) {
            if (i7 != m6.ub && i7 != m6.vb && i7 != m6.wb && i7 != m6.Ee && i7 != m6.Fe && i7 != m6.Ge && i7 != m6.He) {
                return true;
            }
            if (i10 != 0 && i11 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return this.T0;
    }

    public final boolean B() {
        return this.a0 || this.U;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.X0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.k1 && this.l1;
    }

    public final void E() {
        for (int i7 = 0; i7 < this.V0.size(); i7++) {
            if (((g2) this.V0.get(i7)).getFragmentView() != null) {
                try {
                    ((g2) this.V0.get(i7)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pg.b
    public final List F() {
        g2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof pg.b) {
            arrayList.addAll(((pg.b) lastFragment).F());
        }
        G(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final void H(boolean z10) {
        K();
        N();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.L = null;
        }
        s sVar = this.K0;
        if (sVar != null) {
            org.telegram.messenger.g0.r(sVar);
            this.K0 = null;
        }
        setAlpha(1.0f);
        this.s.setAlpha(1.0f);
        this.s.setScaleX(1.0f);
        this.s.setScaleY(1.0f);
        this.w.setAlpha(1.0f);
        this.w.setScaleX(1.0f);
        this.w.setScaleY(1.0f);
    }

    public final void I() {
        z4 z4Var;
        k kVar;
        if (this.b0 || this.R || i() || this.V0.isEmpty()) {
            return;
        }
        c20 c20Var = c20.f0;
        if (c20Var != null && c20Var.y) {
            c20Var.f(false);
            return;
        }
        if (!i0() && (kVar = this.E) != null && !kVar.x()) {
            k kVar2 = this.E;
            if (kVar2.o0) {
                kVar2.n(true);
                return;
            }
        }
        g2 g2Var = (g2) p5.c.h(1, this.V0);
        if (i0() || (z4Var = g2Var.simpleActionBar) == null || !z4Var.A()) {
            r rVar = this.H;
            if ((rVar == null || rVar.onBackPressed(true)) && ((g2) p5.c.h(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
                l(true, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5.U != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(float f10, float f11) {
        r rVar;
        z4 z4Var;
        if (this.U) {
            AnimatorSet animatorSet = this.o1;
            if (animatorSet != null) {
                animatorSet.end();
                this.o1 = null;
            }
            return false;
        }
        if (!this.k1 && !this.j1 && !this.b0 && !this.R && !i() && this.V0.size() > 1 && !y() && ((rVar = this.H) == null || !rVar.hasShownSheet())) {
            g2 g2Var = (g2) p5.c.h(1, this.V0);
            if (g2Var.onBackPressed(false) && (((z4Var = g2Var.simpleActionBar) == null || (z4Var.R == null && (z4Var.H || !z4Var.G))) && !g2Var.hasShownSheet() && g2Var.canBeginSlide())) {
                this.l1 = false;
                this.k1 = true;
                this.j1 = true;
                this.n1 = f10 < ((float) org.telegram.messenger.g0.q.x) / 2.0f;
                this.m1 = f11;
                R();
                Activity activity = this.R0;
                if (activity != null && activity.getCurrentFocus() != null) {
                    org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                }
                g2Var.onBeginSlide();
                return true;
            }
        }
        return false;
    }

    public final void K() {
        if (!this.a0 || this.F0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            this.L = null;
            animatorSet.cancel();
        }
        this.a0 = false;
        this.b0 = false;
        this.C0 = 0L;
        this.I = null;
        this.J = null;
        Runnable runnable = this.F0;
        this.F0 = null;
        if (runnable != null) {
            runnable.run();
        }
        h();
        h();
    }

    public final void L(String str) {
        Runnable runnable = this.Z0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = fc.D().f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.c6) arrayList.get(i7)).z0 = 0;
        }
        g(str);
    }

    public final void M() {
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((g2) it.next()).onLowMemory();
        }
    }

    public final void N() {
        Runnable runnable;
        if (!this.a0 || (runnable = this.G0) == null) {
            return;
        }
        this.a0 = false;
        this.b0 = false;
        this.C0 = 0L;
        this.I = null;
        this.J = null;
        this.G0 = null;
        runnable.run();
        h();
    }

    public final void O() {
        if (!this.V0.isEmpty()) {
            ((g2) p5.c.h(1, this.V0)).onPause();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void P() {
        if (!this.V0.isEmpty()) {
            ((g2) p5.c.h(1, this.V0)).onResume();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void Q(Canvas canvas, ViewGroup viewGroup) {
        if (this.F == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.F.getX() + getX(), this.F.getY() + getY());
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void R() {
        this.Q = false;
        this.R = true;
        this.w.setVisibility(0);
        this.W = false;
        g2 g2Var = (g2) p5.c.h(2, this.V0);
        View view = g2Var.fragmentView;
        if (view == null && (view = g2Var.performCreateView(this.R0)) != null && g2Var.isSupportEdgeToEdge() && g2Var.drawEdgeNavigationBar()) {
            n nVar = new n(g2Var);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view, nVar);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            g2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(g2Var.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(g2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = g2Var.actionBar;
        if (kVar != null && kVar.L) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.J0) {
                g2Var.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(g2Var.actionBar);
        }
        g2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        g2Var.attachSheets(this.w);
        if (!g2Var.hasOwnBackground && view.getBackground() == null) {
            t6.h(m6.d6, view, null);
        }
        g2Var.onResume();
        if (this.r0 != null) {
            this.j0 = g2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((g2) p5.c.h(1, this.V0)).prepareFragmentToSlide(true, true);
        g2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(g2 g2Var) {
        return U(new p4(g2Var));
    }

    public final boolean T(g2 g2Var, boolean z10) {
        p4 p4Var = new p4(g2Var);
        p4Var.b = z10;
        return U(p4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(p4 p4Var) {
        o4 o4Var;
        ArrayList arrayList;
        p3 p3Var;
        g2 g2Var;
        int i7;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        g2 g2Var2 = p4Var.a;
        boolean z10 = p4Var.b;
        boolean z11 = p4Var.c;
        boolean z12 = p4Var.d;
        boolean z13 = p4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p4Var.f;
        int i11 = 0;
        if (g2Var2 == null || i() || !(((o4Var = this.Q0) == null || !z12 || o4Var.l(this, p4Var)) && g2Var2.onFragmentCreate())) {
            return false;
        }
        p3 edgeToEdgeSupportMode = g2Var2.getEdgeToEdgeSupportMode();
        p3 p3Var2 = p3.a;
        boolean z14 = edgeToEdgeSupportMode != p3Var2;
        boolean drawEdgeNavigationBar = g2Var2.drawEdgeNavigationBar();
        g2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.H1) != null) {
            ArrayList arrayList2 = launchActivity.D0;
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    dialog = null;
                    break;
                }
                dialog = (Dialog) arrayList2.get(size);
                if (dialog.isShowing()) {
                    break;
                }
                size--;
            }
            if (dialog != null) {
                ArrayList arrayList3 = LaunchActivity.H1.D0;
                int size2 = arrayList3.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        visibleDialog = null;
                        break;
                    }
                    Dialog dialog2 = (Dialog) arrayList3.get(size2);
                    if (dialog2.isShowing()) {
                        visibleDialog = dialog2;
                        break;
                    }
                    size2--;
                }
            }
        }
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof ui) || (visibleDialog instanceof ki.s2))) {
            e2 e2Var = new e2();
            e2Var.a = true;
            lastFragment.showAsSheet(g2Var2, e2Var);
            return true;
        }
        if (org.telegram.messenger.s2.a) {
            a8.b("present fragment " + g2Var2.getClass().getSimpleName() + " args=" + g2Var2.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = f9.y1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((f9) arrayList.get(i12)).u(false);
            i12++;
        }
        arrayList.clear();
        f3 f3Var = this.F;
        if (f3Var != null && !f3Var.c) {
            LaunchActivity.J();
        }
        if (this.h && this.b0) {
            Runnable runnable = this.e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.e = null;
            }
            l(false, true);
        }
        g2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.K;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.K.getParent()).removeView(this.K);
            }
            this.K = null;
        }
        this.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
        g2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.R0;
        if (activity.getCurrentFocus() != null && g2Var2.hideKeyboardOnShow() && !z13) {
            org.telegram.messenger.g0.v1(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && np.g1().getBoolean("view_animations", true));
        if (this.V0.isEmpty()) {
            p3Var = p3Var2;
            g2Var = null;
        } else {
            p3Var = p3Var2;
            g2Var = (g2) p5.c.h(1, this.V0);
        }
        g2Var2.setParentLayout(this);
        View view = g2Var2.fragmentView;
        if (view == null) {
            view = g2Var2.performCreateView(activity);
            if (view != null && g2Var2.isSupportEdgeToEdge() && g2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(g2Var2);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, nVar);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                g2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        w wVar = this.w;
        if (z13) {
            edgeToEdgeSupportMode = p3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.w.setDrawNavigationBar(!z13 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.w.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i7 = org.telegram.messenger.g0.L(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - org.telegram.messenger.g0.n) - i7) - org.telegram.messenger.g0.L(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i7 = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = g2Var2.getPreviewHeight();
            int i13 = org.telegram.messenger.g0.m;
            if (previewHeight > 0) {
                i10 = 2;
                if (previewHeight < getMeasuredHeight() - i13) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i13) - previewHeight) / 2) + i13;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = org.telegram.messenger.f3.C(8.0f, i7, layoutParams2.bottomMargin);
                    }
                    int L = org.telegram.messenger.g0.L(8.0f);
                    layoutParams2.leftMargin = L;
                    layoutParams2.rightMargin = L;
                }
            } else {
                i10 = 2;
            }
            int L2 = org.telegram.messenger.g0.L(actionBarPopupWindow$ActionBarPopupWindowLayout != null ? 0.0f : 24.0f);
            layoutParams2.bottomMargin = L2;
            layoutParams2.topMargin = L2;
            int i14 = org.telegram.messenger.g0.m;
            int i15 = L2 + i14;
            layoutParams2.topMargin = i15;
            if (z14) {
                layoutParams2.topMargin = i15 + i14;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            }
            int L3 = org.telegram.messenger.g0.L(8.0f);
            layoutParams2.leftMargin = L3;
            layoutParams2.rightMargin = L3;
        } else {
            i10 = 2;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        k kVar = g2Var2.actionBar;
        if (kVar != null && kVar.L) {
            if (this.J0) {
                kVar.setOccupyStatusBar(false);
            }
            org.telegram.messenger.g0.E2(g2Var2.actionBar);
            this.w.addView(g2Var2.actionBar);
        }
        g2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        g2Var2.attachSheets(this.w);
        this.V0.add(g2Var2);
        L("presentFragment");
        g2Var2.onResume();
        this.E = g2Var2.actionBar;
        if (!g2Var2.hasOwnBackground && view.getBackground() == null) {
            t6.h(m6.d6, view, null);
        }
        w wVar2 = this.s;
        w wVar3 = this.w;
        this.s = wVar3;
        this.w = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(g2Var2 instanceof bn)) {
                float L4 = org.telegram.messenger.g0.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bg.q0 q0Var = bg.u0.a;
                view.setOutlineProvider(new bg.s0(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float L5 = org.telegram.messenger.g0.L(29.0f);
                bg.q0 q0Var2 = bg.u0.a;
                view.setOutlineProvider(new bg.s0(0, L5));
            }
            view.setClipToOutline(true);
            view.setElevation(org.telegram.messenger.g0.L(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineSpotShadowColor(-1342177280);
                view.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.r == null) {
                this.r = new ColorDrawable(771751936);
            }
            this.r.setAlpha(0);
            m6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.x;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            W(g2Var, z10);
            View view2 = this.I0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.r0 != null) {
            this.j0 = g2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.I0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.I0.setVisibility(0);
            }
            if (g2Var != null) {
                g2Var.onTransitionAnimationStart(false, false);
                g2Var.onTransitionAnimationEnd(false, false);
            }
            g2Var2.onTransitionAnimationStart(true, false);
            g2Var2.onTransitionAnimationEnd(true, false);
            g2Var2.onBecomeFullyVisible();
            return true;
        }
        int i16 = 4;
        if (this.H0 && this.V0.size() == 1) {
            W(g2Var, z10);
            this.C0 = System.currentTimeMillis();
            this.a0 = true;
            this.G0 = new z1(i16, g2Var, g2Var2);
            ArrayList arrayList4 = new ArrayList();
            int i17 = i10;
            float[] fArr = new float[i17];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, fArr));
            float[] fArr2 = new float[i17];
            // fill-array-data instruction
            fArr2[0] = 0.9f;
            fArr2[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, fArr2));
            float[] fArr3 = new float[i17];
            // fill-array-data instruction
            fArr3[0] = 0.9f;
            fArr3[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, fArr3));
            View view4 = this.I0;
            if (view4 != null) {
                view4.setVisibility(0);
                float[] fArr4 = new float[i17];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                arrayList4.add(ObjectAnimator.ofFloat(this.I0, (Property<View, Float>) property, fArr4));
            }
            if (g2Var != null) {
                g2Var.onTransitionAnimationStart(false, false);
            }
            g2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.L = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.L.setInterpolator(nr.h);
            this.L.setDuration(200L);
            this.L.addListener(new q(this, 1));
            this.L.start();
            return true;
        }
        this.b0 = z13;
        this.C0 = System.currentTimeMillis();
        this.a0 = true;
        p pVar = new p(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, g2Var, g2Var2);
        g2 g2Var3 = g2Var;
        this.G0 = pVar;
        boolean needDelayOpenAnimation = g2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (g2Var3 != null) {
                g2Var3.onTransitionAnimationStart(false, false);
            }
            g2Var2.onTransitionAnimationStart(true, false);
        }
        this.Y0 = false;
        this.J = g2Var3;
        this.I = g2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? g2Var2.onCustomTransitionAnimation(true, new o(this, i16)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.w.b) && g2Var3 != null)) {
                g2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.L = onCustomTransitionAnimation;
            return true;
        }
        this.s.setAlpha(0.0f);
        if (z13) {
            this.s.setTranslationX(0.0f);
            this.s.setScaleX(0.9f);
            this.s.setScaleY(0.9f);
        } else {
            this.s.setTranslationX(48.0f);
            this.s.setScaleX(1.0f);
            this.s.setScaleY(1.0f);
        }
        if (!this.s.b && !this.w.b) {
            if (!g2Var2.needDelayOpenAnimation()) {
                h0(true, true, z13);
                return true;
            }
            v vVar = new v(this, g2Var2, z13, i11);
            this.e = vVar;
            org.telegram.messenger.g0.h3(vVar, 200L);
            return true;
        }
        if (g2Var3 != null && !z13) {
            g2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, g2Var3, g2Var2, z13);
        if (g2Var2.needDelayOpenAnimation()) {
            this.e = new m6.h(this, g2Var3, g2Var2, z13);
        }
        org.telegram.messenger.g0.h3(this.d, 250L);
        return true;
    }

    public final boolean V(g2 g2Var, boolean z10, boolean z11) {
        p4 p4Var = new p4(g2Var);
        p4Var.b = z10;
        p4Var.c = z11;
        p4Var.d = true;
        p4Var.e = false;
        return U(p4Var);
    }

    public final void W(g2 g2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (g2Var == null) {
            return;
        }
        g2Var.onBecomeFullyHidden();
        g2Var.onPause();
        if (z10) {
            g2Var.onFragmentDestroy();
            g2Var.setParentLayout(null);
            this.V0.remove(g2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = g2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                g2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(g2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(g2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = g2Var.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(g2Var.actionBar);
            }
            g2Var.detachSheets();
        }
        this.w.setVisibility(4);
    }

    public final void X(boolean z10, boolean z11) {
        if (this.a0 || this.R) {
            this.z0 = true;
            this.A0 = z10;
            this.B0 = z11;
            return;
        }
        int size = this.V0.size();
        if (!z10) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i7 = 0; i7 < size; i7++) {
            ((g2) this.V0.get(i7)).clearViews();
            ((g2) this.V0.get(i7)).setParentLayout(this);
        }
        o4 o4Var = this.Q0;
        if (o4Var != null) {
            o4Var.b(this, z10);
        }
        if (z11) {
            f0();
        }
    }

    public final void Y() {
        X(true, true);
    }

    public final void Z() {
        this.s.removeAllViews();
        this.w.removeAllViews();
        this.E = null;
        this.I = null;
        this.J = null;
    }

    public final void a0() {
        while (this.V0.size() > 0) {
            e0((g2) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.l1 l1Var = this.t1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.d0.add(iArr);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((v6) arrayList.get(i7)).c();
        }
    }

    public final void b0(int i7) {
        if (i7 < 0 || i7 >= getFragmentStack().size()) {
            return;
        }
        d0((g2) getFragmentStack().get(i7), false);
    }

    public final boolean c(int i7, g2 g2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        o4 o4Var = this.Q0;
        if ((o4Var != null && !o4Var.c(this, g2Var)) || !g2Var.onFragmentCreate() || this.V0.contains(g2Var)) {
            return false;
        }
        g2Var.setParentLayout(this);
        Activity activity = this.R0;
        if (i7 == -1 || i7 == -2) {
            if (!this.V0.isEmpty()) {
                g2 g2Var2 = (g2) p5.c.h(1, this.V0);
                g2Var2.onPause();
                k kVar = g2Var2.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(g2Var2.actionBar);
                }
                View view = g2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    g2Var2.onRemoveFromParent();
                    viewGroup.removeView(g2Var2.fragmentView);
                }
                g2Var2.detachSheets();
            }
            this.V0.add(g2Var);
            if (i7 != -2) {
                View view2 = g2Var.fragmentView;
                if (view2 == null) {
                    view2 = g2Var.performCreateView(activity);
                    if (view2 != null && g2Var.isSupportEdgeToEdge() && g2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(g2Var);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.i(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        g2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!g2Var.hasOwnBackground && view2.getBackground() == null) {
                    t6.h(m6.d6, view2, null);
                }
                this.s.addView(view2, ma.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(g2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(g2Var.drawEdgeNavigationBar());
                k kVar2 = g2Var.actionBar;
                if (kVar2 != null && kVar2.L) {
                    if (this.J0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) g2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(g2Var.actionBar);
                    }
                    this.s.addView(g2Var.actionBar);
                }
                g2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                g2Var.attachSheets(this.s);
                g2Var.onResume();
                g2Var.onTransitionAnimationEnd(false, true);
                g2Var.onTransitionAnimationEnd(true, true);
                g2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i7);
        } else {
            if (i7 == -3) {
                View view3 = g2Var.fragmentView;
                if (view3 == null) {
                    view3 = g2Var.performCreateView(activity);
                    if (view3 != null && g2Var.isSupportEdgeToEdge() && g2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(g2Var);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.i(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        g2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!g2Var.hasOwnBackground && view3.getBackground() == null) {
                    t6.h(m6.d6, view3, null);
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.j(0, wVar.getChildCount(), 0), ma.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(g2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(g2Var.drawEdgeNavigationBar());
                k kVar3 = g2Var.actionBar;
                if (kVar3 != null && kVar3.L) {
                    if (this.J0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) g2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(g2Var.actionBar);
                    }
                    this.s.addView(g2Var.actionBar);
                }
                g2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                g2Var.attachSheets(this.s);
                i7 = 0;
            }
            this.V0.add(i7, g2Var);
            L("addFragmentToStack");
        }
        if (!this.H0) {
            setVisibility(0);
            View view4 = this.I0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0(g2 g2Var) {
        d0(g2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.i0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.c0.add(iArr);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v6 v6Var = (v6) arrayList.get(i7);
            iArr[i7] = v6Var.c();
            u6 u6Var = v6Var.g;
            v6Var.g = null;
            if (u6Var != null) {
                ArrayList arrayList2 = this.k0;
                if (!arrayList2.contains(u6Var)) {
                    arrayList2.add(u6Var);
                }
            }
        }
    }

    public final void d0(g2 g2Var, boolean z10) {
        if ((this.V0.size() > 0 && p5.c.h(1, this.V0) == g2Var) || (this.V0.size() > 1 && p5.c.h(2, this.V0) == g2Var)) {
            N();
            K();
        }
        g("removeFragmentFromStack " + z10);
        if (this.H0 && this.V0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            l(true, false);
            return;
        }
        if (this.Q0 != null && this.V0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            this.Q0.k(this);
        }
        e0(g2Var, g2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.F == null || w(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.F.getMeasuredHeight() + this.u1.d), getWidth(), getHeight(), this.F.getBackgroundPaint());
        }
        this.b1 = true;
        if (this.T0) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.c1;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.T0) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        o4 o4Var = this.Q0;
        return (o4Var != null && o4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r3.d() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3.d() != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c2 c2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - w(true)) - this.u1.d));
        r rVar = this.H;
        c2 c2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            c2Var = this.H.getLastSheet();
            if (c2Var.y()) {
            }
        }
        c2Var = null;
        if (c2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            c2Var = getLastFragment().getLastSheet();
            if (c2Var.y()) {
            }
            if (c2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.r1 = z10;
                }
                if (!this.r1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.r1 = false;
                    }
                    return c2Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.r1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        c2Var2 = c2Var;
        if (c2Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.r1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0273, code lost:
    
        if (r21.a1 != (-1)) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0270  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        int i10;
        Canvas canvas2;
        int i11;
        w wVar;
        View childAt;
        int i12;
        int i13;
        WindowInsets rootWindowInsets;
        float f10;
        float min;
        r7 r7Var;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.P);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.w) {
            paddingLeft2 = org.telegram.messenger.g0.L(1.0f) + paddingRight;
        } else if (view == this.s) {
            i7 = paddingLeft2;
            i10 = paddingRight;
            int save = canvas.save();
            if (view != this.F || (r7Var = this.G) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.b1;
                boolean z11 = this.e1;
                int width2 = getWidth();
                getY();
                getHeight();
                r7Var.k(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.b1 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31 && !this.b && (paddingRight != 0 || this.a1 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f11 = paddingRight;
                        rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.k1) {
                                f10 = 56.0f;
                                min = org.telegram.messenger.g0.T1(1.0f, org.telegram.messenger.g0.T1(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.l(f11 / org.telegram.messenger.g0.N(56.0f)));
                            } else {
                                f10 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f11) / org.telegram.messenger.g0.N(56.0f));
                            }
                            float j10 = (paddingRight <= org.telegram.messenger.g0.L(f10) || this.U || !this.k1) ? Utilities.j(paddingRight, org.telegram.messenger.g0.L(f10), 0) : f11;
                            if (!this.k1 || this.n1) {
                                canvas2.translate(-j10, 0.0f);
                                i7 = (int) (i7 + j10);
                            } else {
                                canvas2.translate(-j10, 0.0f);
                                rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                                i7 = (int) (i7 + j10);
                            }
                            canvas2.scale(min, min, this.n1 ? rectF.right - org.telegram.messenger.g0.L(82.0f) : rectF.left + org.telegram.messenger.g0.L(82.0f), this.k1 ? this.m1 : rectF.centerY());
                        }
                        RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                        RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                        RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                        RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                        float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                        float[] fArr = this.d1;
                        fArr[1] = radius;
                        fArr[0] = radius;
                        float radius2 = roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius();
                        fArr[3] = radius2;
                        fArr[2] = radius2;
                        float radius3 = roundedCorner3 == null ? 0.0f : roundedCorner3.getRadius();
                        fArr[5] = radius3;
                        fArr[4] = radius3;
                        float radius4 = roundedCorner4 == null ? 0.0f : roundedCorner4.getRadius();
                        fArr[7] = radius4;
                        fArr[6] = radius4;
                        if (this.U0) {
                            float l10 = Utilities.l(Math.abs(paddingRight) / org.telegram.messenger.g0.N(12.0f));
                            fArr[0] = fArr[0] * l10;
                            fArr[1] = fArr[1] * l10;
                            fArr[6] = fArr[6] * l10;
                            fArr[7] = fArr[7] * l10;
                        }
                        Path path = this.c1;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.w && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    i7 += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (D()) {
                        i7 = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!B() && !this.h) {
                canvas2.clipRect(i10, 0, i7, getHeight());
            }
            if ((!this.h || this.b0) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.K == null) {
                    int L = org.telegram.messenger.g0.L(32.0f);
                    int measuredWidth = (getMeasuredWidth() - L) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - org.telegram.messenger.g0.L(12.0f));
                    m6.s0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    m6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas2.restoreToCount(save2);
            i12 = paddingRight != 0 ? -1 : -1;
            i13 = this.a1;
            if (i13 == i12) {
                i13 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = l9.b((i13 * ls.e4) / org.telegram.messenger.g0.L(20.0f), 0, ls.e4);
                if (b10 > 0) {
                    int i14 = w(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i11 < 31 || this.b) {
                        Drawable drawable = x1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                        x1.setAlpha(b10);
                        x1.draw(canvas2);
                    }
                }
            } else if (view == this.w) {
                y1.setColor(Color.argb((int) (l9.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.a1 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, y1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i10, 0.0f, i7, getHeight() * 1.5f, y1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i10 = paddingLeft;
        i7 = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.F) {
        }
        canvas2 = canvas;
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (view != this.s) {
            }
        }
        int save22 = canvas2.save();
        if (!B()) {
            canvas2.clipRect(i10, 0, i7, getHeight());
        }
        if (!this.h) {
        }
        this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r.draw(canvas2);
        if (this.K == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i13 = this.a1;
        if (i13 == i12) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z10) {
        Animator customSlideTransition;
        g2 g2Var = !this.V0.isEmpty() ? (g2) p5.c.h(1, this.V0) : null;
        if (g2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = g2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? ls.r5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(nr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.k1 ? org.telegram.messenger.g0.L(56.0f) : 0));
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(nr.h);
                }
            }
        }
        Animator customSlideTransition2 = g2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        g2 g2Var2 = (g2) p5.c.h(2, this.V0);
        if (g2Var2 != null && (customSlideTransition = g2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void e0(g2 g2Var, boolean z10) {
        if (this.V0.contains(g2Var)) {
            if (z10 && p5.c.h(1, this.V0) == g2Var) {
                g2Var.finishFragment();
                return;
            }
            if (p5.c.h(1, this.V0) == g2Var && this.V0.size() > 1) {
                g2Var.finishFragment(false);
                return;
            }
            g2Var.onPause();
            g2Var.onFragmentDestroy();
            g2Var.setParentLayout(null);
            this.V0.remove(g2Var);
            L("removeFragmentFromStackInternal " + z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        r0 = org.telegram.messenger.np.g1().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(q4 q4Var, Runnable runnable) {
        l6 l6Var;
        l6 l6Var2;
        if (this.a0 || this.R) {
            this.u0 = true;
            this.v0 = q4Var.a;
            this.x0 = q4Var.c;
            this.y0 = q4Var.b;
            this.w0 = q4Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.r0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r0 = null;
        }
        int size = q4Var.e ? 1 : this.V0.size();
        ai.b1 b1Var = new ai.b1(this, size, q4Var, runnable, 13);
        if (size < 1 || !q4Var.f || !q4Var.g) {
            b1Var.run();
            return;
        }
        if (q4Var.m == null) {
            g0(null);
        }
        int i7 = q4Var.b;
        if (i7 != -1 && (l6Var2 = q4Var.a) != null) {
            l6Var2.u(i7);
            m6.z1(q4Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            m6.u(q4Var.a, true, q4Var.c);
            b1Var.run();
            return;
        }
        l6 l6Var3 = q4Var.a;
        boolean z10 = q4Var.c;
        oi.c2 c2Var = new oi.c2(b1Var, 2);
        int i10 = m6.a;
        if (l6Var3 == null) {
            c2Var.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e10) {
            e = e10;
            l6Var = l6Var3;
        }
        if (l6Var3.b == null && l6Var3.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = np.g1().edit();
                edit.remove("theme");
                edit.apply();
            }
            m6.km.clear();
            m6.g0 = 0;
            m6.h0 = null;
            m6.e0 = null;
            m6.f0 = null;
            if (!z10 && m6.M == null) {
                m6.K = l6Var3;
                if (m6.I == m6.J) {
                    m6.T = 2000;
                    m6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.j2(19), 2100L);
                }
            }
            m6.I = l6Var3;
            m6.t1(false, false);
            l6Var = l6Var3;
            if (m6.M == null && !m6.Q) {
                np.u1(l6Var.F).G4(l6Var, l6Var.k(false), z10, false);
            }
            c2Var.run();
        }
        String[] strArr = new String[1];
        aa.c0 c0Var = new aa.c0(strArr, l6Var3, z10, c2Var, 25);
        l6Var = l6Var3;
        try {
            int i11 = m6.wm + 1;
            m6.wm = i11;
            bi.g5 g5Var = new bi.g5(i11, c2Var, c0Var);
            String str = l6Var.d;
            if (str != null) {
                Utilities.i.c(new org.telegram.messenger.camera.i(g5Var, obj, str, obj, 4));
            } else {
                Utilities.i.c(new org.telegram.messenger.camera.i(g5Var, new File(l6Var.b), obj, strArr, 4));
            }
        } catch (Exception e11) {
            e = e11;
            a8.g(e, true);
            if (m6.M == null) {
                np.u1(l6Var.F).G4(l6Var, l6Var.k(false), z10, false);
            }
            c2Var.run();
        }
    }

    public final void f0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.V0.isEmpty()) {
            return;
        }
        int size = this.V0.size() - 1;
        if (this.V0.isEmpty()) {
            return;
        }
        if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((g2) this.V0.get(size)).fragmentView == null) {
            for (int i7 = 0; i7 < size; i7++) {
                g2 g2Var = (g2) this.V0.get(i7);
                k kVar = g2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(g2Var.actionBar);
                }
                View view = g2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    g2Var.onPause();
                    g2Var.onRemoveFromParent();
                    viewGroup.removeView(g2Var.fragmentView);
                }
            }
            g2 g2Var2 = (g2) this.V0.get(size);
            g2Var2.setParentLayout(this);
            View view2 = g2Var2.fragmentView;
            if (view2 == null) {
                view2 = g2Var2.performCreateView(this.R0);
                if (view2 != null && g2Var2.isSupportEdgeToEdge() && g2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(g2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    g2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, ma.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(g2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(g2Var2.drawEdgeNavigationBar());
            k kVar2 = g2Var2.actionBar;
            if (kVar2 != null && kVar2.L) {
                if (this.J0) {
                    kVar2.setOccupyStatusBar(false);
                }
                org.telegram.messenger.g0.E2(g2Var2.actionBar);
                this.s.addView(g2Var2.actionBar);
            }
            g2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
            g2Var2.attachSheets(this.s);
            g2Var2.onResume();
            g2Var2.onBecomeFullyVisible();
            this.E = g2Var2.actionBar;
            if (g2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            t6.h(m6.d6, view2, null);
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.s2.a;
        ArrayList arrayList = this.p1;
        StringBuilder n10 = p5.c.n(str, " ");
        n10.append(this.V0.size());
        arrayList.add(0, n10.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < 10; i7++) {
                arrayList2.add((String) this.p1.get(i7));
            }
            this.p1 = arrayList2;
        }
        o oVar = this.q1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.h3(oVar, 500L);
    }

    public final void g0(zm zmVar) {
        try {
            int i7 = m6.f5;
            this.l0 = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                this.l0[i10] = zmVar != null ? zmVar.k(i10) : m6.x0(null, i10, false);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.l0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r4
    public g2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (g2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.r4
    public /* bridge */ /* synthetic */ w2 getBottomSheet() {
        return null;
    }

    public f3 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        g2 g2Var = this.J;
        return ((g2Var == null || !g2Var.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public o3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public List<g2> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public g2 getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (g2) p5.c.h(1, this.V0);
    }

    public g2 getLastFragmentIncludeMainTabs() {
        g2 lastFragment = getLastFragment();
        return lastFragment instanceof me0 ? ((me0) lastFragment).c0() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public u4 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public u4 getMessageDrawableOutStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.r4
    public List<h9> getPulledDialogs() {
        return this.W0;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public g2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            g2 g2Var = (g2) getFragmentStack().get(size);
            if (g2Var != null && g2Var.getContext() != null && !g2Var.isFinishing() && !g2Var.isRemovingFromStack()) {
                return g2Var;
            }
        }
        return null;
    }

    public ox getSheetFragment() {
        return x();
    }

    @Override // org.telegram.ui.ActionBar.r4
    public float getThemeAnimationValue() {
        return this.t0;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public Window getWindow() {
        Window window = this.c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.z0) {
            X(this.A0, this.B0);
            this.z0 = false;
        } else if (this.u0) {
            q4 q4Var = new q4(this.v0, this.y0, this.x0, true);
            boolean z10 = this.w0;
            if (!z10) {
                q4Var.g = z10;
                q4Var.f = z10;
            }
            f(q4Var, null);
            this.v0 = null;
            this.u0 = false;
        }
    }

    public final void h0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.K0 = sVar;
        org.telegram.messenger.g0.g3(sVar);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.b0) {
            return false;
        }
        if (this.a0 && (this.C0 < System.currentTimeMillis() - 1500 || this.h)) {
            H(true);
        }
        return this.a0;
    }

    public final boolean i0() {
        g2 g2Var = !this.V0.isEmpty() ? (g2) p5.c.h(1, this.V0) : null;
        return (g2Var == null || g2Var.getLastStoryViewer() == null || !g2Var.getLastStoryViewer().y()) ? false : true;
    }

    public final void j() {
        this.p0 = 0;
        this.q0 = null;
        this.l0 = null;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        g2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            o4 o4Var = this.Q0;
            if ((o4Var != null && !o4Var.k(this)) || i() || this.V0.isEmpty()) {
                return;
            }
            Activity activity = this.R0;
            if (activity.getCurrentFocus() != null) {
                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z12 = !z11 && (this.h || this.b0 || (z10 && np.g1().getBoolean("view_animations", true)));
            g2 g2Var = (g2) p5.c.h(1, this.V0);
            AnimatorSet animatorSet = null;
            g2 g2Var2 = this.V0.size() > 1 ? (g2) p5.c.h(2, this.V0) : null;
            if (g2Var2 != null) {
                org.telegram.messenger.g0.o3(activity, m6.x0(null, m6.s8, false) == -1 || (g2Var2.hasForceLightStatusBar() && !m6.D0().q()));
                w wVar = this.s;
                this.s = this.w;
                this.w = wVar;
                g2Var2.setParentLayout(this);
                View view = g2Var2.fragmentView;
                if (view == null && (view = g2Var2.performCreateView(activity)) != null && g2Var2.isSupportEdgeToEdge() && g2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(g2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        g2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(g2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(g2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = g2Var2.actionBar;
                    if (kVar != null && kVar.L) {
                        if (this.J0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(g2Var2.actionBar);
                        this.s.addView(g2Var2.actionBar);
                    }
                    g2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    g2Var2.attachSheets(this.s);
                }
                this.I = g2Var2;
                this.J = g2Var;
                g2Var2.onTransitionAnimationStart(true, true);
                g2Var.onTransitionAnimationStart(false, true);
                g2Var2.onResume();
                if (this.r0 != null) {
                    this.j0 = g2Var2.getThemeDescriptions();
                }
                this.E = g2Var2.actionBar;
                if (!g2Var2.hasOwnBackground && view.getBackground() == null) {
                    t6.h(m6.d6, view, null);
                }
                if (z12) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    g2Var.setRemovingFromStack(true);
                    this.F0 = new kg.y(this, g2Var, g2Var2, 23);
                    if (!this.h && !this.b0) {
                        animatorSet = g2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.w.b)) {
                            h0(false, true, z13 || this.b0);
                        } else {
                            j6.o oVar = new j6.o(this, 17);
                            this.d = oVar;
                            org.telegram.messenger.g0.h3(oVar, 200L);
                        }
                    } else {
                        this.L = animatorSet;
                        gc gcVar = gc.w;
                        if (gcVar != null && gcVar.l) {
                            gcVar.b();
                        }
                    }
                    L("closeLastFragment");
                } else {
                    m(g2Var);
                    g2Var.onTransitionAnimationEnd(false, true);
                    g2Var2.onTransitionAnimationEnd(true, true);
                    g2Var2.onBecomeFullyVisible();
                }
            } else if (!this.H0 || z11) {
                e0(g2Var, false);
                setVisibility(8);
                View view2 = this.I0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.C0 = System.currentTimeMillis();
                this.a0 = true;
                this.F0 = new z1(this, g2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view3 = this.I0;
                if (view3 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.L.setInterpolator(this.O);
                this.L.setDuration(200L);
                this.L.addListener(new q(this, 0));
                this.L.start();
            }
            g2Var.onFragmentClosed();
        }
    }

    public final void m(g2 g2Var) {
        g2Var.finishing = true;
        g2Var.onPause();
        g2Var.onFragmentDestroy();
        g2Var.setParentLayout(null);
        this.V0.remove(g2Var);
        this.w.setVisibility(4);
        this.w.setTranslationY(0.0f);
        bringChildToFront(this.s);
        w wVar = this.x;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        L("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((g2) p5.c.h(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.l1 l1Var) {
        boolean z10 = this.T0;
        if (z10) {
            if (!(view instanceof w) || !((w) view).y) {
                r0.i0.b(view, r0.l1.b);
                return;
            }
            int i7 = l1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i7 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.l1 l1Var2 = r0.l1.b;
            int i10 = Build.VERSION.SDK_INT;
            r0.a1 z0Var = i10 >= 34 ? new r0.z0(l1Var2) : i10 >= 30 ? new r0.y0(l1Var2) : i10 >= 29 ? new r0.x0(l1Var2) : new r0.w0(l1Var2);
            z0Var.c(8, i0.b.b(0, 0, 0, max));
            r0.i0.b(view, z0Var.b());
            return;
        }
        boolean z11 = this.U0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.u1;
        i0.b bVar2 = this.v1;
        if (view instanceof f3) {
            org.telegram.messenger.g0.z3(view, z11 ? 0 : bVar.a, 0, z12 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int w10 = w(false);
            int i11 = w10 > 0 ? bVar.d + w10 : 0;
            p3 p3Var = wVar.x;
            boolean z13 = p3Var == p3.c;
            int i12 = (z13 || z11) ? 0 : bVar2.a;
            int i13 = (z13 || z12) ? 0 : bVar2.c;
            int i14 = (!z13 || z11) ? bVar2.a : 0;
            int i15 = (!z13 || z12) ? bVar2.c : 0;
            if (p3Var == p3.a) {
                i11 = Math.max(i11, bVar2.d);
                r0.i0.b(view, r0.l1.b);
            } else {
                r0.i0.b(view, l1Var.a.m(i14, 0, i15, i11));
            }
            view.setPadding(i12, 0, i13, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.V0.isEmpty()) {
            return;
        }
        int size = this.V0.size();
        for (int i7 = 0; i7 < size; i7++) {
            g2 g2Var = (g2) this.V0.get(i7);
            g2Var.onConfigurationChanged(configuration);
            Dialog dialog = g2Var.visibleDialog;
            if (dialog instanceof w2) {
                ((w2) dialog).c0(configuration);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.U || i() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        k kVar;
        y yVar;
        if (i7 == 82 && !i() && !this.R && (kVar = this.E) != null && !kVar.x() && (yVar = kVar.F) != null) {
            int childCount = yVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (q0Var.t()) {
                            q0Var.V(null, null);
                            break;
                        }
                        if (q0Var.T) {
                            yVar.o(((Integer) q0Var.getTag()).intValue());
                            break;
                        }
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11 = getHeight() > getWidth();
        if (this.g1 != z11) {
            this.g1 = z11;
            this.h1 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i11 - i7) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                f3 f3Var = this.F;
                if (childAt == f3Var) {
                    f3Var.setCurrentAccount(k10.t0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & ls.x1;
                int i23 = absoluteGravity & 7;
                if (i23 == 1) {
                    i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin + paddingLeft;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i16 = paddingBottom - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        i18 = i19 + paddingTop;
                        if (childAt != this.F && this.h1 != 0 && (this.e1 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i18 = this.h1;
                        } else if (childAt == this.F) {
                            this.h1 = i18;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != this.F) {
                    }
                    if (childAt == this.F) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                } else {
                    i13 = paddingRight - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != this.F) {
                }
                if (childAt == this.F) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        g2 g2Var = !this.V0.isEmpty() ? (g2) p5.c.h(1, this.V0) : null;
        if (g2Var != null && !g2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            g2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, TLObject.FLAG_30));
            return;
        }
        o4 o4Var = this.Q0;
        if (o4Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i7;
            iArr[1] = i10;
            o4Var.f(iArr);
            i7 = iArr[0];
            i10 = iArr[1];
        }
        this.e1 = C() > org.telegram.messenger.g0.L(20.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!i() && !this.D0 && !this.U && !this.k1) {
            if (this.V0.size() > 1 && ((rVar = this.H) == null || rVar.getLastSheet() == null || !this.H.getLastSheet().s())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.E0) {
                        if (this.V == null) {
                            this.V = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.S));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.T);
                        this.V.addMovement(motionEvent);
                        if (this.a0 || this.h || !this.Q || this.R || max < org.telegram.messenger.g0.a1(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                            if (this.R) {
                                if (!this.W) {
                                    Activity activity = this.R0;
                                    if (activity.getCurrentFocus() != null) {
                                        org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                                    }
                                    ((g2) p5.c.h(1, this.V0)).onBeginSlide();
                                    this.W = true;
                                }
                                if (D()) {
                                    float f10 = max;
                                    this.s.setTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                                    setInnerTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                                } else {
                                    float f11 = max;
                                    this.s.setTranslationX(f11);
                                    setInnerTranslationX(f11);
                                }
                            }
                        } else if (((g2) p5.c.h(1, this.V0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.S = (int) motionEvent.getX();
                            R();
                        } else {
                            this.Q = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.E0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.V == null) {
                            this.V = VelocityTracker.obtain();
                        }
                        this.V.addMovement(motionEvent);
                        this.V.computeCurrentVelocity(1000);
                        g2 g2Var = (g2) p5.c.h(1, this.V0);
                        if (!this.h && !this.b0 && !this.R && g2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.V.getXVelocity();
                            float yVelocity = this.V.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && g2Var.canBeginSlide()) {
                                this.S = (int) motionEvent.getX();
                                R();
                                if (!this.W) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        org.telegram.messenger.g0.v1(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.W = true;
                                }
                            }
                        }
                        if (this.R) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.V.getXVelocity();
                            float yVelocity2 = this.V.getYVelocity();
                            if (!D() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.g0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z10 = true;
                                }
                            }
                            e(z10);
                        } else {
                            this.Q = false;
                            this.R = false;
                            w wVar = this.s;
                            if (wVar != null) {
                                wVar.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.V;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.V = null;
                        }
                    } else if (motionEvent == null) {
                        this.Q = false;
                        this.R = false;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.V;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.V = null;
                        }
                    }
                } else if (((g2) p5.c.h(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
                    this.E0 = motionEvent.getPointerId(0);
                    this.Q = true;
                    this.S = (int) motionEvent.getX();
                    this.T = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.V;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.Q = false;
                    this.R = false;
                    w wVar3 = this.s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.R;
        }
        return false;
    }

    public final void p(Canvas canvas, int i7, int i10) {
        if (w1 == null || !cz.D1) {
            return;
        }
        int i11 = i7 / 2;
        if (w1.getAlpha() != i11) {
            w1.setAlpha(i11);
        }
        w1.setBounds(0, i10, getMeasuredWidth(), w1.getIntrinsicHeight() + i10);
        w1.draw(canvas);
    }

    public final void q(Canvas canvas, int i7) {
        p(canvas, ls.e4, i7);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        g2 g2Var = (g2) p5.c.h(2, this.V0);
        g2 g2Var2 = (g2) p5.c.h(1, this.V0);
        g2Var2.fragmentView.setOutlineProvider(null);
        g2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        g2Var2.fragmentView.setLayoutParams(layoutParams);
        W(g2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(g2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(g2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new nr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ah.l(15, this, g2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(g2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(g2Var2.drawEdgeNavigationBar());
        g2Var2.setInPreviewMode(false);
        g2Var2.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (m6.x0(null, m6.s8, false) != -1 && (!g2Var2.hasForceLightStatusBar() || m6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.g0.o3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        return !this.V0.isEmpty() && ((g2) p5.c.h(1, this.V0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setDelegate(o4 o4Var) {
        this.Q0 = o4Var;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setDrawerLayoutContainer(o3 o3Var) {
        this.y = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setFragmentPanTranslationOffset(int i7) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setFragmentStack(List<g2> list) {
        this.V0 = list;
        f3 f3Var = this.F;
        if (f3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            f3Var.J.remove(oVar);
            f3Var.K.remove(oVar2);
            org.telegram.messenger.g0.E2(this.F);
            this.F = null;
        }
        boolean z10 = this.S0;
        Activity activity = this.R0;
        if (z10) {
            f3 f3Var2 = new f3(activity, this);
            this.F = f3Var2;
            this.G = new r7(f3Var2);
            f3 f3Var3 = this.F;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            f3Var3.J.add(oVar3);
            f3Var3.K.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            m3 m3Var = LaunchActivity.H1.x0;
            if (m3Var != null) {
                m3Var.setTabsView(this.F);
            }
        }
        w wVar = this.w;
        if (wVar != null) {
            org.telegram.messenger.g0.E2(wVar);
        }
        w wVar2 = new w(activity, this);
        this.w = wVar2;
        addView(wVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.w.setLayoutParams(layoutParams2);
        w wVar3 = this.s;
        if (wVar3 != null) {
            org.telegram.messenger.g0.E2(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        w wVar5 = this.x;
        if (wVar5 != null) {
            org.telegram.messenger.g0.E2(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.x = wVar6;
        this.i1.a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.x.setLayoutParams(layoutParams4);
        r rVar = this.H;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.H;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                org.telegram.messenger.g0.E2(view);
                this.x.addView(view, ma.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((g2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setInBubbleMode(boolean z10) {
        this.f = z10;
    }

    public void setInnerTranslationX(float f10) {
        int navigationBarColor;
        int navigationBarColor2;
        this.P = f10;
        invalidate();
        if (this.V0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float l10 = D() ? Utilities.l(f10 / (org.telegram.messenger.g0.L(56.0f) * 6)) : f10 / this.s.getMeasuredWidth();
        g2 g2Var = (g2) p5.c.h(2, this.V0);
        g2Var.onSlideProgress(false, l10);
        g2 g2Var2 = (g2) p5.c.h(1, this.V0);
        float a10 = l9.a(l10 * 2.0f, 0.0f, 1.0f);
        if (!g2Var2.isBeginToShow() || (navigationBarColor = g2Var2.getNavigationBarColor()) == (navigationBarColor2 = g2Var.getNavigationBarColor())) {
            return;
        }
        g2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setNavigationBarColor(int i7) {
        if (this.s1 != i7) {
            this.s1 = i7;
            invalidate();
        }
        o3 o3Var = this.y;
        if (o3Var != null) {
            o3Var.setInternalNavigationBarColor(i7);
        }
        f3 f3Var = this.F;
        if (f3Var != null) {
            f3Var.i(i7, (this.R || this.U) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i7) {
        this.a1 = i7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setPulledDialogs(List<h9> list) {
        this.W0 = list;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.J0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        this.t0 = f10;
        for (int i7 = 0; i7 < this.p0; i7++) {
            int f11 = i0.a.f(f10, this.n0[i7], this.o0[i7]);
            zm zmVar = this.q0;
            if (zmVar != null) {
                zmVar.l(this.m0[i7], f11);
            } else {
                int i10 = this.m0[i7];
                SparseIntArray sparseIntArray = m6.mm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i10, f11);
                }
            }
        }
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i11);
            int[] iArr = (int[]) this.c0.get(i11);
            int[] iArr2 = (int[]) this.d0.get(i11);
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                int red = Color.red(iArr2[i12]);
                int green = Color.green(iArr2[i12]);
                int blue = Color.blue(iArr2[i12]);
                int alpha = Color.alpha(iArr2[i12]);
                int red2 = Color.red(iArr[i12]);
                int green2 = Color.green(iArr[i12]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i12]);
                int i13 = size;
                int i14 = i11;
                int argb = Color.argb(Math.min(ls.e4, (int) (((alpha - r4) * f10) + Color.alpha(iArr[i12]))), Math.min(ls.e4, (int) (((red - red2) * f10) + red2)), Math.min(ls.e4, (int) (((green - green2) * f10) + green2)), Math.min(ls.e4, (int) (((blue - blue2) * f10) + blue2)));
                v6 v6Var = (v6) arrayList2.get(i12);
                int i15 = v6Var.e;
                h6 h6Var = v6Var.n;
                if (h6Var != null) {
                    h6Var.l(i15, argb);
                } else {
                    SparseIntArray sparseIntArray2 = m6.mm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i15, argb);
                    }
                }
                v6Var.e(argb, false, false);
                i12++;
                i11 = i14;
                arrayList = arrayList3;
                size = i13;
            }
            i11++;
        }
        ArrayList arrayList4 = this.k0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            u6 u6Var = (u6) arrayList4.get(i16);
            if (u6Var != null) {
                u6Var.b();
                u6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                v6 v6Var2 = (v6) this.j0.get(i17);
                v6Var2.e(m6.w0(v6Var2.e, v6Var2.n), false, false);
            }
        }
        wm wmVar = this.h0;
        if (wmVar != null) {
            zm zmVar2 = wmVar.a;
            zmVar2.G.A0.invalidate();
            zmVar2.t.K = f10;
            zmVar2.u.K = f10;
            zmVar2.u(f10);
        }
        o4 o4Var = this.Q0;
        if (o4Var != null) {
            o4Var.a(f10);
        }
        s6 s6Var = t6.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 >= 1.0f || currentAnimationTimeMillis != t6.c || f10 != t6.d) {
            t6.c = currentAnimationTimeMillis;
            t6.d = f10;
            t6.b0(this, f10 >= 1.0f);
        } else if (getWindowToken() == null) {
            t6.c0(this, false);
        }
        E();
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setUseAlphaAnimations(boolean z10) {
        this.H0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setWindow(Window window) {
        this.c = window;
    }

    public final g2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            g2 g2Var = (g2) getFragmentStack().get(size);
            if (g2Var != null && !g2Var.isFinishing() && !g2Var.isRemovingFromStack() && de0.class.isInstance(g2Var)) {
                return g2Var;
            }
        }
        return null;
    }

    public final void v() {
        if (this.h || this.b0) {
            if (!this.a0 || this.F0 == null) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    this.e = null;
                }
                l(true, false);
            }
        }
    }

    public final int w(boolean z10) {
        f3 f3Var;
        if (!this.S0 || (f3Var = this.F) == null) {
            return 0;
        }
        return z10 ? (int) f3Var.H : f3Var.I;
    }

    public final ox x() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            r rVar = new r(this);
            this.H = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.H;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                org.telegram.messenger.g0.E2(view);
                this.x.addView(view, ma.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
                this.x.setDrawNavigationBar(this.H.drawEdgeNavigationBar());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        return this.H;
    }

    public final boolean y() {
        return this.h || this.b0;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public void setHighlightActionButtons(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.r4
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r4
    public ViewGroup getView() {
        return this;
    }
}
