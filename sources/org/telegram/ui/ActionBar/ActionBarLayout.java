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
import c8.ha;
import c8.j9;
import di.p9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.pd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ce0;
import org.telegram.ui.je0;
import org.telegram.ui.jx;
import org.telegram.ui.s60;
import org.telegram.ui.vm;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements q4, pg.b {
    public static Drawable v1;
    public static Drawable w1;
    public static Paint x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public k D;
    public int D0;
    public d3 E;
    public Runnable E0;
    public r7 F;
    public Runnable F0;
    public s G;
    public boolean G0;
    public f2 H;
    public View H0;
    public f2 I;
    public boolean I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public t J0;
    public AnimatorSet K;
    public float K0;
    public final DecelerateInterpolator L;
    public long L0;
    public final OvershootInterpolator M;
    public String M0;
    public final AccelerateDecelerateInterpolator N;
    public int N0;
    public float O;
    public s60 O0;
    public boolean P;
    public n4 P0;
    public boolean Q;
    public final Activity Q0;
    public int R;
    public final boolean R0;
    public int S;
    public boolean S0;
    public boolean T;
    public boolean T0;
    public VelocityTracker U;
    public List U0;
    public boolean V;
    public List V0;
    public boolean W;
    public final Rect W0;
    public boolean X0;
    public Runnable Y0;
    public int Z0;
    public boolean a;
    public boolean a0;
    public boolean a1;
    public boolean b;
    public final ArrayList b0;
    public final Path b1;
    public Window c;
    public final ArrayList c0;
    public final float[] c1;
    public Runnable d;
    public final fi.g5 d0;
    public boolean d1;
    public Runnable e;
    public t4 e0;
    public final int[] e1;
    public boolean f;
    public t4 f0;
    public boolean f1;
    public vm g0;
    public int g1;
    public boolean h;
    public final ArrayList h0;
    public final org.telegram.ui.Components.w5 h1;
    public ArrayList i0;
    public boolean i1;
    public final ArrayList j0;
    public boolean j1;
    public int[] k0;
    public boolean k1;
    public int[] l0;
    public float l1;
    public int[] m0;
    public boolean m1;
    public boolean n;
    public int[] n0;
    public AnimatorSet n1;
    public int o0;
    public ArrayList o1;
    public ym p0;
    public final o p1;
    public AnimatorSet q0;
    public boolean q1;
    public ColorDrawable r;
    public final h2.f r0;
    public int r1;
    public w s;
    public float s0;
    public r0.k1 s1;
    public boolean t0;
    public i0.b t1;
    public j6 u0;
    public i0.b u1;
    public boolean v0;
    public w w;
    public boolean w0;
    public w x;
    public int x0;
    public n3 y;
    public boolean y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z9) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        fi.g5 g5Var = new fi.g5();
        g5Var.b = new SparseIntArray();
        g5Var.c = new int[]{k6.ob, k6.rb, k6.sb, k6.tb, k6.Oc, k6.qb};
        this.d0 = g5Var;
        this.h0 = new ArrayList();
        this.j0 = new ArrayList();
        this.r0 = new h2.f((int[]) null);
        this.W0 = new Rect();
        this.Z0 = -1;
        this.b1 = new Path();
        this.c1 = new float[8];
        this.e1 = new int[2];
        this.h1 = new org.telegram.ui.Components.w5(this, 280L, xq.h);
        this.o1 = new ArrayList();
        this.p1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.t1 = bVar;
        this.u1 = bVar;
        this.Q0 = (Activity) context;
        this.R0 = z9;
        if (w1 == null) {
            w1 = getResources().getDrawable(R.drawable.layer_shadow);
            v1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            x1 = new Paint();
        }
        l2.y yVar = new l2.y(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(ArrayList arrayList, View view) {
        if (view instanceof pg.b) {
            arrayList.addAll(((pg.b) view).E());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                G(arrayList, viewGroup.getChildAt(i7));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z9) {
            if (actionBarLayout.U0.size() >= 2) {
                ((f2) rf.b.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
                f2 f2Var = (f2) rf.b.g(2, actionBarLayout.U0);
                f2Var.prepareFragmentToSlide(false, false);
                f2Var.onPause();
                View view = f2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    f2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(f2Var.fragmentView);
                }
                k kVar = f2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(f2Var.actionBar);
                }
                f2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            f2 f2Var2 = (f2) rf.b.g(1, actionBarLayout.U0);
            f2Var2.prepareFragmentToSlide(true, false);
            f2Var2.onPause();
            f2Var2.onFragmentDestroy();
            f2Var2.setParentLayout(null);
            List list = actionBarLayout.U0;
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
            if (actionBarLayout.U0.size() > 0) {
                f2 f2Var3 = (f2) rf.b.g(1, actionBarLayout.U0);
                actionBarLayout.D = f2Var3.actionBar;
                f2Var3.onResume();
                f2Var3.onBecomeFullyVisible();
                f2Var3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.w.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
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
        if (i7 != k6.g5 && i7 != k6.Oc && i7 != k6.Fe) {
            if (i7 != k6.rb && i7 != k6.sb && i7 != k6.tb && i7 != k6.Be && i7 != k6.Ce && i7 != k6.De && i7 != k6.Ee) {
                return true;
            }
            if (i10 != 0 && i11 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return this.S0;
    }

    public final boolean B() {
        return this.W || this.T;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.W0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.j1 && this.k1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pg.b
    public final List E() {
        f2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof pg.b) {
            arrayList.addAll(((pg.b) lastFragment).E());
        }
        G(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final void F() {
        for (int i7 = 0; i7 < this.U0.size(); i7++) {
            if (((f2) this.U0.get(i7)).getFragmentView() != null) {
                try {
                    ((f2) this.U0.get(i7)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void H(boolean z9) {
        K();
        N();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            if (z9) {
                animatorSet.cancel();
            }
            this.K = null;
        }
        t tVar = this.J0;
        if (tVar != null) {
            org.telegram.messenger.g0.r(tVar);
            this.J0 = null;
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
        y4 y4Var;
        k kVar;
        if (this.a0 || this.Q || i() || this.U0.isEmpty()) {
            return;
        }
        p10 p10Var = p10.e0;
        if (p10Var != null && p10Var.y) {
            p10Var.f(false);
            return;
        }
        if (!i0() && (kVar = this.D) != null && !kVar.v()) {
            k kVar2 = this.D;
            if (kVar2.n0) {
                kVar2.l(true);
                return;
            }
        }
        f2 f2Var = (f2) rf.b.g(1, this.U0);
        if (!i0() && (y4Var = f2Var.simpleActionBar) != null) {
            i5 i5Var = y4Var.Q;
            if (i5Var != null) {
                i5Var.a(true);
                return;
            } else if (!y4Var.G && y4Var.F) {
                y4Var.j(true);
                return;
            }
        }
        s sVar = this.G;
        if ((sVar == null || sVar.onBackPressed(true)) && ((f2) rf.b.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
            l(true, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5.T != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(float f10, float f11) {
        s sVar;
        y4 y4Var;
        if (this.T) {
            AnimatorSet animatorSet = this.n1;
            if (animatorSet != null) {
                animatorSet.end();
                this.n1 = null;
            }
            return false;
        }
        if (!this.j1 && !this.i1 && !this.a0 && !this.Q && !i() && this.U0.size() > 1 && !y() && ((sVar = this.G) == null || !sVar.hasShownSheet())) {
            f2 f2Var = (f2) rf.b.g(1, this.U0);
            if (f2Var.onBackPressed(false) && (((y4Var = f2Var.simpleActionBar) == null || (y4Var.Q == null && (y4Var.G || !y4Var.F))) && !f2Var.hasShownSheet() && f2Var.canBeginSlide())) {
                this.k1 = false;
                this.j1 = true;
                this.i1 = true;
                this.m1 = f10 < ((float) org.telegram.messenger.g0.q.x) / 2.0f;
                this.l1 = f11;
                R();
                Activity activity = this.Q0;
                if (activity != null && activity.getCurrentFocus() != null) {
                    org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                }
                f2Var.onBeginSlide();
                return true;
            }
        }
        return false;
    }

    public final void K() {
        if (!this.W || this.E0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            this.K = null;
            animatorSet.cancel();
        }
        this.W = false;
        this.a0 = false;
        this.B0 = 0L;
        this.H = null;
        this.I = null;
        Runnable runnable = this.E0;
        this.E0 = null;
        if (runnable != null) {
            runnable.run();
        }
        h();
        h();
    }

    public final void L(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = gc.D().f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.v5) arrayList.get(i7)).y0 = 0;
        }
        g(str);
    }

    public final void M() {
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((f2) it.next()).onLowMemory();
        }
    }

    public final void N() {
        Runnable runnable;
        if (!this.W || (runnable = this.F0) == null) {
            return;
        }
        this.W = false;
        this.a0 = false;
        this.B0 = 0L;
        this.H = null;
        this.I = null;
        this.F0 = null;
        runnable.run();
        h();
    }

    public final void O() {
        if (!this.U0.isEmpty()) {
            ((f2) rf.b.g(1, this.U0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void P() {
        if (!this.U0.isEmpty()) {
            ((f2) rf.b.g(1, this.U0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void Q(Canvas canvas, ViewGroup viewGroup) {
        if (this.E == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
        this.E.draw(canvas);
        canvas.restore();
    }

    public final void R() {
        this.P = false;
        this.Q = true;
        this.w.setVisibility(0);
        this.V = false;
        f2 f2Var = (f2) rf.b.g(2, this.U0);
        View view = f2Var.fragmentView;
        if (view == null && (view = f2Var.performCreateView(this.Q0)) != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
            n nVar = new n(f2Var);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view, nVar);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            f2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = f2Var.actionBar;
        if (kVar != null && kVar.K) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.I0) {
                f2Var.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(f2Var.actionBar);
        }
        f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        f2Var.attachSheets(this.w);
        if (!f2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        f2Var.onResume();
        if (this.q0 != null) {
            this.i0 = f2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((f2) rf.b.g(1, this.U0)).prepareFragmentToSlide(true, true);
        f2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(f2 f2Var) {
        return U(new o4(f2Var));
    }

    public final boolean T(f2 f2Var, boolean z9) {
        o4 o4Var = new o4(f2Var);
        o4Var.b = z9;
        return U(o4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(o4 o4Var) {
        n4 n4Var;
        ArrayList arrayList;
        o3 o3Var;
        f2 f2Var;
        int i7;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        f2 f2Var2 = o4Var.a;
        boolean z9 = o4Var.b;
        boolean z10 = o4Var.c;
        boolean z11 = o4Var.d;
        boolean z12 = o4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o4Var.f;
        if (f2Var2 == null || i() || !(((n4Var = this.P0) == null || !z11 || n4Var.l(this, o4Var)) && f2Var2.onFragmentCreate())) {
            return false;
        }
        o3 edgeToEdgeSupportMode = f2Var2.getEdgeToEdgeSupportMode();
        o3 o3Var2 = o3.a;
        int i11 = 1;
        boolean z13 = edgeToEdgeSupportMode != o3Var2;
        boolean drawEdgeNavigationBar = f2Var2.drawEdgeNavigationBar();
        f2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.G1) != null) {
            ArrayList arrayList2 = launchActivity.C0;
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
                ArrayList arrayList3 = LaunchActivity.G1.C0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof di) || (visibleDialog instanceof hi.a3))) {
            d2 d2Var = new d2();
            d2Var.a = true;
            lastFragment.showAsSheet(f2Var2, d2Var);
            return true;
        }
        if (org.telegram.messenger.r2.a) {
            a8.b("present fragment " + f2Var2.getClass().getSimpleName() + " args=" + f2Var2.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = p9.x1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((p9) arrayList.get(i12)).u(false);
            i12++;
        }
        arrayList.clear();
        d3 d3Var = this.E;
        if (d3Var != null && !d3Var.c) {
            LaunchActivity.J();
        }
        if (this.h && this.a0) {
            Runnable runnable = this.e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.e = null;
            }
            l(false, true);
        }
        f2Var2.setInPreviewMode(z12);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.J;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.J = null;
        }
        this.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
        f2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.Q0;
        if (activity.getCurrentFocus() != null && f2Var2.hideKeyboardOnShow() && !z12) {
            org.telegram.messenger.g0.v1(activity.getCurrentFocus());
        }
        boolean z14 = z12 || (!z10 && qp.e1().getBoolean("view_animations", true));
        if (this.U0.isEmpty()) {
            o3Var = o3Var2;
            f2Var = null;
        } else {
            o3Var = o3Var2;
            f2Var = (f2) rf.b.g(1, this.U0);
        }
        f2Var2.setParentLayout(this);
        View view = f2Var2.fragmentView;
        if (view == null) {
            view = f2Var2.performCreateView(activity);
            if (view != null && f2Var2.isSupportEdgeToEdge() && f2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(f2Var2);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, nVar);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                f2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        w wVar = this.w;
        if (z12) {
            edgeToEdgeSupportMode = o3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.w.setDrawNavigationBar(!z12 && drawEdgeNavigationBar);
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
        if (z12) {
            int previewHeight = f2Var2.getPreviewHeight();
            int i13 = org.telegram.messenger.g0.m;
            if (previewHeight > 0) {
                i10 = 2;
                if (previewHeight < getMeasuredHeight() - i13) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i13) - previewHeight) / 2) + i13;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = org.telegram.messenger.k5.C(8.0f, i7, layoutParams2.bottomMargin);
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
            if (z13) {
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
        k kVar = f2Var2.actionBar;
        if (kVar != null && kVar.K) {
            if (this.I0) {
                kVar.setOccupyStatusBar(false);
            }
            org.telegram.messenger.g0.E2(f2Var2.actionBar);
            this.w.addView(f2Var2.actionBar);
        }
        f2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        f2Var2.attachSheets(this.w);
        this.U0.add(f2Var2);
        L("presentFragment");
        f2Var2.onResume();
        this.D = f2Var2.actionBar;
        if (!f2Var2.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        w wVar2 = this.s;
        w wVar3 = this.w;
        this.s = wVar3;
        this.w = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z12) {
            if (!(f2Var2 instanceof an)) {
                float L4 = org.telegram.messenger.g0.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bg.q0 q0Var = bg.u0.a;
                view.setOutlineProvider(new bg.s0(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new u());
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
            k6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.x;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z14) {
            W(f2Var, z9);
            View view2 = this.H0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.q0 != null) {
            this.i0 = f2Var2.getThemeDescriptions();
        }
        if (!z14 && !z12) {
            View view3 = this.H0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.H0.setVisibility(0);
            }
            if (f2Var != null) {
                f2Var.onTransitionAnimationStart(false, false);
                f2Var.onTransitionAnimationEnd(false, false);
            }
            f2Var2.onTransitionAnimationStart(true, false);
            f2Var2.onTransitionAnimationEnd(true, false);
            f2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.G0 && this.U0.size() == 1) {
            W(f2Var, z9);
            this.B0 = System.currentTimeMillis();
            this.W = true;
            this.F0 = new p(f2Var, f2Var2);
            ArrayList arrayList4 = new ArrayList();
            int i16 = i10;
            float[] fArr = new float[i16];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, fArr));
            float[] fArr2 = new float[i16];
            // fill-array-data instruction
            fArr2[0] = 0.9f;
            fArr2[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, fArr2));
            float[] fArr3 = new float[i16];
            // fill-array-data instruction
            fArr3[0] = 0.9f;
            fArr3[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, fArr3));
            View view4 = this.H0;
            if (view4 != null) {
                view4.setVisibility(0);
                float[] fArr4 = new float[i16];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                arrayList4.add(ObjectAnimator.ofFloat(this.H0, (Property<View, Float>) property, fArr4));
            }
            if (f2Var != null) {
                f2Var.onTransitionAnimationStart(false, false);
            }
            f2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.K = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.K.setInterpolator(xq.h);
            this.K.setDuration(200L);
            this.K.addListener(new r(this, 1));
            this.K.start();
            return true;
        }
        this.a0 = z12;
        this.B0 = System.currentTimeMillis();
        this.W = true;
        q qVar = new q(this, z12, actionBarPopupWindow$ActionBarPopupWindowLayout, z9, f2Var, f2Var2);
        f2 f2Var3 = f2Var;
        this.F0 = qVar;
        boolean needDelayOpenAnimation = f2Var2.needDelayOpenAnimation();
        boolean z15 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (f2Var3 != null) {
                f2Var3.onTransitionAnimationStart(false, false);
            }
            f2Var2.onTransitionAnimationStart(true, false);
        }
        this.X0 = false;
        this.I = f2Var3;
        this.H = f2Var2;
        AnimatorSet onCustomTransitionAnimation = !z12 ? f2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z12 && ((this.s.b || this.w.b) && f2Var3 != null)) {
                f2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.K = onCustomTransitionAnimation;
            return true;
        }
        this.s.setAlpha(0.0f);
        if (z12) {
            this.s.setTranslationX(0.0f);
            this.s.setScaleX(0.9f);
            this.s.setScaleY(0.9f);
        } else {
            this.s.setTranslationX(48.0f);
            this.s.setScaleX(1.0f);
            this.s.setScaleY(1.0f);
        }
        if (!this.s.b && !this.w.b) {
            if (!f2Var2.needDelayOpenAnimation()) {
                h0(true, true, z12);
                return true;
            }
            mi.g gVar = new mi.g(this, f2Var2, z12, i11);
            this.e = gVar;
            org.telegram.messenger.g0.i3(gVar, 200L);
            return true;
        }
        if (f2Var3 != null && !z12) {
            f2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new v(this, z15, f2Var3, f2Var2, z12);
        if (f2Var2.needDelayOpenAnimation()) {
            this.e = new m6.h(this, f2Var3, f2Var2, z12);
        }
        org.telegram.messenger.g0.i3(this.d, 250L);
        return true;
    }

    public final boolean V(f2 f2Var, boolean z9, boolean z10) {
        o4 o4Var = new o4(f2Var);
        o4Var.b = z9;
        o4Var.c = z10;
        o4Var.d = true;
        o4Var.e = false;
        return U(o4Var);
    }

    public final void W(f2 f2Var, boolean z9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (f2Var == null) {
            return;
        }
        f2Var.onBecomeFullyHidden();
        f2Var.onPause();
        if (z9) {
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
            this.U0.remove(f2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = f2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                f2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(f2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(f2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = f2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(f2Var.actionBar);
            }
            f2Var.detachSheets();
        }
        this.w.setVisibility(4);
    }

    public final void X(boolean z9, boolean z10) {
        if (this.W || this.Q) {
            this.y0 = true;
            this.z0 = z9;
            this.A0 = z10;
            return;
        }
        int size = this.U0.size();
        if (!z9) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i7 = 0; i7 < size; i7++) {
            ((f2) this.U0.get(i7)).clearViews();
            ((f2) this.U0.get(i7)).setParentLayout(this);
        }
        n4 n4Var = this.P0;
        if (n4Var != null) {
            n4Var.b(this, z9);
        }
        if (z10) {
            f0();
        }
    }

    public final void Y() {
        X(true, true);
    }

    public final void Z() {
        this.s.removeAllViews();
        this.w.removeAllViews();
        this.D = null;
        this.H = null;
        this.I = null;
    }

    public final void a0() {
        while (this.U0.size() > 0) {
            e0((f2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.k1 k1Var = this.s1;
        if (k1Var != null) {
            o(view, k1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.c0.add(iArr);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((t6) arrayList.get(i7)).c();
        }
    }

    public final void b0(int i7) {
        if (i7 < 0 || i7 >= getFragmentStack().size()) {
            return;
        }
        d0((f2) getFragmentStack().get(i7), false);
    }

    public final boolean c(int i7, f2 f2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n4 n4Var = this.P0;
        if ((n4Var != null && !n4Var.h(f2Var, this)) || !f2Var.onFragmentCreate() || this.U0.contains(f2Var)) {
            return false;
        }
        f2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i7 == -1 || i7 == -2) {
            if (!this.U0.isEmpty()) {
                f2 f2Var2 = (f2) rf.b.g(1, this.U0);
                f2Var2.onPause();
                k kVar = f2Var2.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(f2Var2.actionBar);
                }
                View view = f2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    f2Var2.onRemoveFromParent();
                    viewGroup.removeView(f2Var2.fragmentView);
                }
                f2Var2.detachSheets();
            }
            this.U0.add(f2Var);
            if (i7 != -2) {
                View view2 = f2Var.fragmentView;
                if (view2 == null) {
                    view2 = f2Var.performCreateView(activity);
                    if (view2 != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(f2Var);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.i(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        f2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!f2Var.hasOwnBackground && view2.getBackground() == null) {
                    r6.i(k6.d6, view2, null);
                }
                this.s.addView(view2, ha.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
                k kVar2 = f2Var.actionBar;
                if (kVar2 != null && kVar2.K) {
                    if (this.I0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) f2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(f2Var.actionBar);
                    }
                    this.s.addView(f2Var.actionBar);
                }
                f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                f2Var.attachSheets(this.s);
                f2Var.onResume();
                f2Var.onTransitionAnimationEnd(false, true);
                f2Var.onTransitionAnimationEnd(true, true);
                f2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i7);
        } else {
            if (i7 == -3) {
                View view3 = f2Var.fragmentView;
                if (view3 == null) {
                    view3 = f2Var.performCreateView(activity);
                    if (view3 != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(f2Var);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.i(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        f2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!f2Var.hasOwnBackground && view3.getBackground() == null) {
                    r6.i(k6.d6, view3, null);
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.j(0, wVar.getChildCount(), 0), ha.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
                k kVar3 = f2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.I0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) f2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(f2Var.actionBar);
                    }
                    this.s.addView(f2Var.actionBar);
                }
                f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                f2Var.attachSheets(this.s);
                i7 = 0;
            }
            this.U0.add(i7, f2Var);
            L("addFragmentToStack");
        }
        if (!this.G0) {
            setVisibility(0);
            View view4 = this.H0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0(f2 f2Var) {
        d0(f2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.h0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.b0.add(iArr);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            t6 t6Var = (t6) arrayList.get(i7);
            iArr[i7] = t6Var.c();
            s6 s6Var = t6Var.g;
            t6Var.g = null;
            if (s6Var != null) {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.contains(s6Var)) {
                    arrayList2.add(s6Var);
                }
            }
        }
    }

    public final void d0(f2 f2Var, boolean z9) {
        if ((this.U0.size() > 0 && rf.b.g(1, this.U0) == f2Var) || (this.U0.size() > 1 && rf.b.g(2, this.U0) == f2Var)) {
            N();
            K();
        }
        g("removeFragmentFromStack " + z9);
        if (this.G0 && this.U0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            this.P0.k(this);
        }
        e0(f2Var, f2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E == null || w(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        }
        this.a1 = true;
        if (this.S0) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.b1;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.S0) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        n4 n4Var = this.P0;
        return (n4Var != null && n4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
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
        b2 b2Var;
        boolean z9 = motionEvent.getY() > ((float) ((getHeight() - w(true)) - this.t1.d));
        s sVar = this.G;
        b2 b2Var2 = null;
        if (sVar != null && sVar.getLastSheet() != null) {
            b2Var = this.G.getLastSheet();
            if (b2Var.y()) {
            }
        }
        b2Var = null;
        if (b2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            b2Var = getLastFragment().getLastSheet();
            if (b2Var.y()) {
            }
            if (b2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.q1 = z9;
                }
                if (!this.q1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.q1 = false;
                    }
                    return b2Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.q1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        b2Var2 = b2Var;
        if (b2Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.q1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0273, code lost:
    
        if (r21.Z0 != (-1)) goto L113;
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
        int paddingRight = getPaddingRight() + ((int) this.O);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.w) {
            paddingLeft2 = org.telegram.messenger.g0.L(1.0f) + paddingRight;
        } else if (view == this.s) {
            i7 = paddingLeft2;
            i10 = paddingRight;
            int save = canvas.save();
            if (view != this.E || (r7Var = this.F) == null) {
                canvas2 = canvas;
            } else {
                boolean z9 = this.a1;
                boolean z10 = this.d1;
                int width2 = getWidth();
                getY();
                getHeight();
                r7Var.j(canvas, z9, z10, width2, 1.0f);
                canvas2 = canvas;
                this.a1 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31 && !this.b && (paddingRight != 0 || this.Z0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f11 = paddingRight;
                        rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.j1) {
                                f10 = 56.0f;
                                min = org.telegram.messenger.g0.T1(1.0f, org.telegram.messenger.g0.T1(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.l(f11 / org.telegram.messenger.g0.N(56.0f)));
                            } else {
                                f10 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f11) / org.telegram.messenger.g0.N(56.0f));
                            }
                            float j10 = (paddingRight <= org.telegram.messenger.g0.L(f10) || this.T || !this.j1) ? Utilities.j(paddingRight, org.telegram.messenger.g0.L(f10), 0) : f11;
                            if (!this.j1 || this.m1) {
                                canvas2.translate(-j10, 0.0f);
                                i7 = (int) (i7 + j10);
                            } else {
                                canvas2.translate(-j10, 0.0f);
                                rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                                i7 = (int) (i7 + j10);
                            }
                            canvas2.scale(min, min, this.m1 ? rectF.right - org.telegram.messenger.g0.L(82.0f) : rectF.left + org.telegram.messenger.g0.L(82.0f), this.j1 ? this.l1 : rectF.centerY());
                        }
                        RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                        RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                        RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                        RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                        float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                        float[] fArr = this.c1;
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
                        if (this.T0) {
                            float l10 = Utilities.l(Math.abs(paddingRight) / org.telegram.messenger.g0.N(12.0f));
                            fArr[0] = fArr[0] * l10;
                            fArr[1] = fArr[1] * l10;
                            fArr[6] = fArr[6] * l10;
                            fArr[7] = fArr[7] * l10;
                        }
                        Path path = this.b1;
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
            if ((!this.h || this.a0) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.J == null) {
                    int L = org.telegram.messenger.g0.L(32.0f);
                    int measuredWidth = (getMeasuredWidth() - L) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - org.telegram.messenger.g0.L(12.0f));
                    k6.s0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    k6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas2.restoreToCount(save2);
            i12 = paddingRight != 0 ? -1 : -1;
            i13 = this.Z0;
            if (i13 == i12) {
                i13 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = j9.b((i13 * qs.e4) / org.telegram.messenger.g0.L(20.0f), 0, qs.e4);
                if (b10 > 0) {
                    int i14 = w(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i11 < 31 || this.b) {
                        Drawable drawable = w1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                        w1.setAlpha(b10);
                        w1.draw(canvas2);
                    }
                }
            } else if (view == this.w) {
                x1.setColor(Color.argb((int) (j9.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.Z0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, x1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i10, 0.0f, i7, getHeight() * 1.5f, x1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i10 = paddingLeft;
        i7 = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.E) {
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
        if (this.J == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i13 = this.Z0;
        if (i13 == i12) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z9) {
        Animator customSlideTransition;
        f2 f2Var = !this.U0.isEmpty() ? (f2) rf.b.g(1, this.U0) : null;
        if (f2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = f2Var.shouldOverrideSlideTransition(false, z9);
        Property property = View.TRANSLATION_X;
        if (z9) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? qs.r5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.j1 ? org.telegram.messenger.g0.L(56.0f) : 0));
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        }
        Animator customSlideTransition2 = f2Var.getCustomSlideTransition(false, z9, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        f2 f2Var2 = (f2) rf.b.g(2, this.U0);
        if (f2Var2 != null && (customSlideTransition = f2Var2.getCustomSlideTransition(false, z9, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z9));
        this.n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0(f2 f2Var, boolean z9) {
        if (this.U0.contains(f2Var)) {
            if (z9 && rf.b.g(1, this.U0) == f2Var) {
                f2Var.finishFragment();
                return;
            }
            if (rf.b.g(1, this.U0) == f2Var && this.U0.size() > 1) {
                f2Var.finishFragment(false);
                return;
            }
            f2Var.onPause();
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
            this.U0.remove(f2Var);
            L("removeFragmentFromStackInternal " + z9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r0 = org.telegram.messenger.qp.e1().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(p4 p4Var, Runnable runnable) {
        j6 j6Var;
        j6 j6Var2;
        if (this.W || this.Q) {
            this.t0 = true;
            this.u0 = p4Var.a;
            this.w0 = p4Var.c;
            this.x0 = p4Var.b;
            this.v0 = p4Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.q0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.q0 = null;
        }
        int size = p4Var.e ? 1 : this.U0.size();
        ai.a1 a1Var = new ai.a1(this, size, p4Var, runnable, 11);
        if (size < 1 || !p4Var.f || !p4Var.g) {
            a1Var.run();
            return;
        }
        if (p4Var.m == null) {
            g0(null);
        }
        int i7 = p4Var.b;
        if (i7 != -1 && (j6Var2 = p4Var.a) != null) {
            j6Var2.u(i7);
            k6.z1(p4Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            k6.u(p4Var.a, true, p4Var.c);
            a1Var.run();
            return;
        }
        j6 j6Var3 = p4Var.a;
        boolean z9 = p4Var.c;
        l2.w wVar = new l2.w(a1Var, 16);
        int i10 = k6.a;
        if (j6Var3 == null) {
            wVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e10) {
            e = e10;
            j6Var = j6Var3;
        }
        if (j6Var3.b == null && j6Var3.d == null) {
            if (!z9) {
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.remove("theme");
                edit.apply();
            }
            k6.hm.clear();
            k6.g0 = 0;
            k6.h0 = null;
            k6.e0 = null;
            k6.f0 = null;
            if (!z9 && k6.M == null) {
                k6.K = j6Var3;
                if (k6.I == k6.J) {
                    k6.T = 2000;
                    k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new pd(11), 2100L);
                }
            }
            k6.I = j6Var3;
            k6.t1(false, false);
            j6Var = j6Var3;
            if (k6.M == null && !k6.Q) {
                qp.s1(j6Var.E).x4(j6Var, j6Var.k(false), z9, false);
            }
            wVar.run();
        }
        String[] strArr = new String[1];
        aa.d0 d0Var = new aa.d0(strArr, j6Var3, z9, wVar, 25);
        j6Var = j6Var3;
        try {
            int i11 = k6.tm + 1;
            k6.tm = i11;
            hi.d4 d4Var = new hi.d4(i11, wVar, d0Var);
            String str = j6Var.d;
            if (str != null) {
                Utilities.i.c(new ai.d0(d4Var, obj, str, obj, 29));
            } else {
                Utilities.i.c(new ai.d0(d4Var, new File(j6Var.b), obj, strArr, 29));
            }
        } catch (Exception e11) {
            e = e11;
            a8.g(e, true);
            if (k6.M == null) {
                qp.s1(j6Var.E).x4(j6Var, j6Var.k(false), z9, false);
            }
            wVar.run();
        }
    }

    public final void f0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.U0.isEmpty()) {
            return;
        }
        int size = this.U0.size() - 1;
        if (this.U0.isEmpty()) {
            return;
        }
        if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((f2) this.U0.get(size)).fragmentView == null) {
            for (int i7 = 0; i7 < size; i7++) {
                f2 f2Var = (f2) this.U0.get(i7);
                k kVar = f2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(f2Var.actionBar);
                }
                View view = f2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    f2Var.onPause();
                    f2Var.onRemoveFromParent();
                    viewGroup.removeView(f2Var.fragmentView);
                }
            }
            f2 f2Var2 = (f2) this.U0.get(size);
            f2Var2.setParentLayout(this);
            View view2 = f2Var2.fragmentView;
            if (view2 == null) {
                view2 = f2Var2.performCreateView(this.Q0);
                if (view2 != null && f2Var2.isSupportEdgeToEdge() && f2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(f2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    f2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, ha.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(f2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(f2Var2.drawEdgeNavigationBar());
            k kVar2 = f2Var2.actionBar;
            if (kVar2 != null && kVar2.K) {
                if (this.I0) {
                    kVar2.setOccupyStatusBar(false);
                }
                org.telegram.messenger.g0.E2(f2Var2.actionBar);
                this.s.addView(f2Var2.actionBar);
            }
            f2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
            f2Var2.attachSheets(this.s);
            f2Var2.onResume();
            f2Var2.onBecomeFullyVisible();
            this.D = f2Var2.actionBar;
            if (f2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            r6.i(k6.d6, view2, null);
        }
    }

    public final void g(String str) {
        boolean z9 = org.telegram.messenger.r2.a;
        ArrayList arrayList = this.o1;
        StringBuilder j3 = rf.b.j(str, " ");
        j3.append(this.U0.size());
        arrayList.add(0, j3.toString());
        if (this.o1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < 10; i7++) {
                arrayList2.add((String) this.o1.get(i7));
            }
            this.o1 = arrayList2;
        }
        o oVar = this.p1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 500L);
    }

    public final void g0(ym ymVar) {
        try {
            int i7 = k6.f5;
            this.k0 = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                this.k0[i10] = ymVar != null ? ymVar.h(i10) : k6.x0(null, i10, false);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.k0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public f2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (f2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ v2 getBottomSheet() {
        return null;
    }

    public d3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.a0 && !this.n) {
            return 0.0f;
        }
        f2 f2Var = this.I;
        return ((f2Var == null || !f2Var.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public n3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public List<f2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public f2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (f2) rf.b.g(1, this.U0);
    }

    public f2 getLastFragmentIncludeMainTabs() {
        f2 lastFragment = getLastFragment();
        return lastFragment instanceof je0 ? ((je0) lastFragment).c0() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public t4 getMessageDrawableOutMediaStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public t4 getMessageDrawableOutStart() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.q4
    public List<c9> getPulledDialogs() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public f2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            f2 f2Var = (f2) getFragmentStack().get(size);
            if (f2Var != null && f2Var.getContext() != null && !f2Var.isFinishing() && !f2Var.isRemovingFromStack()) {
                return f2Var;
            }
        }
        return null;
    }

    public jx getSheetFragment() {
        return x();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public float getThemeAnimationValue() {
        return this.s0;
    }

    @Override // org.telegram.ui.ActionBar.q4
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
        if (this.y0) {
            X(this.z0, this.A0);
            this.y0 = false;
        } else if (this.t0) {
            p4 p4Var = new p4(this.u0, this.x0, this.w0, true);
            boolean z9 = this.v0;
            if (!z9) {
                p4Var.g = z9;
                p4Var.f = z9;
            }
            f(p4Var, null);
            this.u0 = null;
            this.t0 = false;
        }
    }

    public final void h0(boolean z9, boolean z10, boolean z11) {
        if (z10) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z10, z11, z9);
        this.J0 = tVar;
        org.telegram.messenger.g0.h3(tVar);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.a0) {
            return false;
        }
        if (this.W && (this.B0 < System.currentTimeMillis() - 1500 || this.h)) {
            H(true);
        }
        return this.W;
    }

    public final boolean i0() {
        f2 f2Var = !this.U0.isEmpty() ? (f2) rf.b.g(1, this.U0) : null;
        return (f2Var == null || f2Var.getLastStoryViewer() == null || !f2Var.getLastStoryViewer().y()) ? false : true;
    }

    public final void j() {
        this.o0 = 0;
        this.p0 = null;
        this.k0 = null;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z9, boolean z10) {
        f2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            n4 n4Var = this.P0;
            if ((n4Var != null && !n4Var.k(this)) || i() || this.U0.isEmpty()) {
                return;
            }
            Activity activity = this.Q0;
            if (activity.getCurrentFocus() != null) {
                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i7 = 0;
            boolean z11 = !z10 && (this.h || this.a0 || (z9 && qp.e1().getBoolean("view_animations", true)));
            f2 f2Var = (f2) rf.b.g(1, this.U0);
            AnimatorSet animatorSet = null;
            f2 f2Var2 = this.U0.size() > 1 ? (f2) rf.b.g(2, this.U0) : null;
            if (f2Var2 != null) {
                org.telegram.messenger.g0.p3(activity, k6.x0(null, k6.s8, false) == -1 || (f2Var2.hasForceLightStatusBar() && !k6.D0().q()));
                w wVar = this.s;
                this.s = this.w;
                this.w = wVar;
                f2Var2.setParentLayout(this);
                View view = f2Var2.fragmentView;
                if (view == null && (view = f2Var2.performCreateView(activity)) != null && f2Var2.isSupportEdgeToEdge() && f2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(f2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        f2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(f2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(f2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = f2Var2.actionBar;
                    if (kVar != null && kVar.K) {
                        if (this.I0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(f2Var2.actionBar);
                        this.s.addView(f2Var2.actionBar);
                    }
                    f2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    f2Var2.attachSheets(this.s);
                }
                this.H = f2Var2;
                this.I = f2Var;
                f2Var2.onTransitionAnimationStart(true, true);
                f2Var.onTransitionAnimationStart(false, true);
                f2Var2.onResume();
                if (this.q0 != null) {
                    this.i0 = f2Var2.getThemeDescriptions();
                }
                this.D = f2Var2.actionBar;
                if (!f2Var2.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.d6, view, null);
                }
                if (z11) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    f2Var.setRemovingFromStack(true);
                    this.E0 = new l2.z0(this, f2Var, f2Var2, 18);
                    if (!this.h && !this.a0) {
                        animatorSet = f2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z12 = this.h;
                        if (z12 || !(this.s.b || this.w.b)) {
                            h0(false, true, z12 || this.a0);
                        } else {
                            m.f3 f3Var = new m.f3(this, 14);
                            this.d = f3Var;
                            org.telegram.messenger.g0.i3(f3Var, 200L);
                        }
                    } else {
                        this.K = animatorSet;
                        cc ccVar = cc.w;
                        if (ccVar != null && ccVar.l) {
                            ccVar.b();
                        }
                    }
                    L("closeLastFragment");
                } else {
                    m(f2Var);
                    f2Var.onTransitionAnimationEnd(false, true);
                    f2Var2.onTransitionAnimationEnd(true, true);
                    f2Var2.onBecomeFullyVisible();
                }
            } else if (!this.G0 || z10) {
                e0(f2Var, false);
                setVisibility(8);
                View view2 = this.H0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.B0 = System.currentTimeMillis();
                this.W = true;
                this.E0 = new p(i7, this, f2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view3 = this.H0;
                if (view3 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.K = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.K.setInterpolator(this.N);
                this.K.setDuration(200L);
                this.K.addListener(new r(this, 0));
                this.K.start();
            }
            f2Var.onFragmentClosed();
        }
    }

    public final void m(f2 f2Var) {
        f2Var.finishing = true;
        f2Var.onPause();
        f2Var.onFragmentDestroy();
        f2Var.setParentLayout(null);
        this.U0.remove(f2Var);
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
        ((f2) rf.b.g(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z9 = this.S0;
        if (z9) {
            if (!(view instanceof w) || !((w) view).y) {
                r0.i0.b(view, r0.k1.b);
                return;
            }
            int i7 = k1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i7 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.k1 k1Var2 = r0.k1.b;
            int i10 = Build.VERSION.SDK_INT;
            r0.a1 z0Var = i10 >= 34 ? new r0.z0(k1Var2) : i10 >= 30 ? new r0.y0(k1Var2) : i10 >= 29 ? new r0.x0(k1Var2) : new r0.w0(k1Var2);
            z0Var.c(8, i0.b.b(0, 0, 0, max));
            r0.i0.b(view, z0Var.b());
            return;
        }
        boolean z10 = this.T0;
        boolean z11 = (z9 || z10 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.t1;
        i0.b bVar2 = this.u1;
        if (view instanceof d3) {
            org.telegram.messenger.g0.B3(view, z10 ? 0 : bVar.a, 0, z11 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int w10 = w(false);
            int i11 = w10 > 0 ? bVar.d + w10 : 0;
            o3 o3Var = wVar.x;
            boolean z12 = o3Var == o3.c;
            int i12 = (z12 || z10) ? 0 : bVar2.a;
            int i13 = (z12 || z11) ? 0 : bVar2.c;
            int i14 = (!z12 || z10) ? bVar2.a : 0;
            int i15 = (!z12 || z11) ? bVar2.c : 0;
            if (o3Var == o3.a) {
                i11 = Math.max(i11, bVar2.d);
                r0.i0.b(view, r0.k1.b);
            } else {
                r0.i0.b(view, k1Var.a.m(i14, 0, i15, i11));
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
        if (this.U0.isEmpty()) {
            return;
        }
        int size = this.U0.size();
        for (int i7 = 0; i7 < size; i7++) {
            f2 f2Var = (f2) this.U0.get(i7);
            f2Var.onConfigurationChanged(configuration);
            Dialog dialog = f2Var.visibleDialog;
            if (dialog instanceof v2) {
                ((v2) dialog).c0(configuration);
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
        return this.T || i() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        k kVar;
        y yVar;
        if (i7 == 82 && !i() && !this.Q && (kVar = this.D) != null && !kVar.v() && (yVar = kVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (r0Var.s()) {
                            r0Var.U(null, null);
                            break;
                        }
                        if (r0Var.S) {
                            yVar.o(((Integer) r0Var.getTag()).intValue());
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10 = getHeight() > getWidth();
        if (this.f1 != z10) {
            this.f1 = z10;
            this.g1 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i11 - i7) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                d3 d3Var = this.E;
                if (childAt == d3Var) {
                    d3Var.setCurrentAccount(org.telegram.messenger.p10.s0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & qs.x1;
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
                        if (childAt != this.E && this.g1 != 0 && (this.d1 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i18 = this.g1;
                        } else if (childAt == this.E) {
                            this.g1 = i18;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != this.E) {
                    }
                    if (childAt == this.E) {
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
                if (childAt != this.E) {
                }
                if (childAt == this.E) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        f2 f2Var = !this.U0.isEmpty() ? (f2) rf.b.g(1, this.U0) : null;
        if (f2Var != null && !f2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            f2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, TLObject.FLAG_30));
            return;
        }
        n4 n4Var = this.P0;
        if (n4Var != null) {
            int[] iArr = this.e1;
            iArr[0] = i7;
            iArr[1] = i10;
            n4Var.e(iArr);
            i7 = iArr[0];
            i10 = iArr[1];
        }
        this.d1 = C() > org.telegram.messenger.g0.L(20.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z9 = false;
        if (!i() && !this.C0 && !this.T && !this.j1) {
            if (this.U0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().s())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.D0) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                        this.U.addMovement(motionEvent);
                        if (this.W || this.h || !this.P || this.Q || max < org.telegram.messenger.g0.a1(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                            if (this.Q) {
                                if (!this.V) {
                                    Activity activity = this.Q0;
                                    if (activity.getCurrentFocus() != null) {
                                        org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                                    }
                                    ((f2) rf.b.g(1, this.U0)).onBeginSlide();
                                    this.V = true;
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
                        } else if (((f2) rf.b.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            R();
                        } else {
                            this.P = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        this.U.addMovement(motionEvent);
                        this.U.computeCurrentVelocity(1000);
                        f2 f2Var = (f2) rf.b.g(1, this.U0);
                        if (!this.h && !this.a0 && !this.Q && f2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.U.getXVelocity();
                            float yVelocity = this.U.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && f2Var.canBeginSlide()) {
                                this.R = (int) motionEvent.getX();
                                R();
                                if (!this.V) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        org.telegram.messenger.g0.v1(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.V = true;
                                }
                            }
                        }
                        if (this.Q) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.U.getXVelocity();
                            float yVelocity2 = this.U.getYVelocity();
                            if (!D() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.g0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z9 = true;
                                }
                            }
                            e(z9);
                        } else {
                            this.P = false;
                            this.Q = false;
                            w wVar = this.s;
                            if (wVar != null) {
                                wVar.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.U = null;
                        }
                    } else if (motionEvent == null) {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.U;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.U = null;
                        }
                    }
                } else if (((f2) rf.b.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
                    this.D0 = motionEvent.getPointerId(0);
                    this.P = true;
                    this.R = (int) motionEvent.getX();
                    this.S = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.U;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.P = false;
                    this.Q = false;
                    w wVar3 = this.s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.Q;
        }
        return false;
    }

    public final void p(Canvas canvas, int i7, int i10) {
        if (v1 == null || !iz.D1) {
            return;
        }
        int i11 = i7 / 2;
        if (v1.getAlpha() != i11) {
            v1.setAlpha(i11);
        }
        v1.setBounds(0, i10, getMeasuredWidth(), v1.getIntrinsicHeight() + i10);
        v1.draw(canvas);
    }

    public final void q(Canvas canvas, int i7) {
        p(canvas, qs.e4, i7);
    }

    public final void r() {
        boolean z9 = true;
        this.n = true;
        this.h = false;
        f2 f2Var = (f2) rf.b.g(2, this.U0);
        f2 f2Var2 = (f2) rf.b.g(1, this.U0);
        f2Var2.fragmentView.setOutlineProvider(null);
        f2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        f2Var2.fragmentView.setLayoutParams(layoutParams);
        W(f2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(f2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(f2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new xq(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ah.l(15, this, f2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(f2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(f2Var2.drawEdgeNavigationBar());
        f2Var2.setInPreviewMode(false);
        f2Var2.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (k6.x0(null, k6.s8, false) != -1 && (!f2Var2.hasForceLightStatusBar() || k6.D0().q())) {
                z9 = false;
            }
            org.telegram.messenger.g0.p3(activity, z9);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public final boolean s(Menu menu) {
        return !this.U0.isEmpty() && ((f2) rf.b.g(1, this.U0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setDelegate(n4 n4Var) {
        this.P0 = n4Var;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setDrawerLayoutContainer(n3 n3Var) {
        this.y = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setFragmentPanTranslationOffset(int i7) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setFragmentStack(List<f2> list) {
        this.U0 = list;
        d3 d3Var = this.E;
        if (d3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            d3Var.I.remove(oVar);
            d3Var.J.remove(oVar2);
            org.telegram.messenger.g0.E2(this.E);
            this.E = null;
        }
        boolean z9 = this.R0;
        Activity activity = this.Q0;
        if (z9) {
            d3 d3Var2 = new d3(activity, this);
            this.E = d3Var2;
            this.F = new r7(d3Var2);
            d3 d3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            d3Var3.I.add(oVar3);
            d3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            k3 k3Var = LaunchActivity.G1.w0;
            if (k3Var != null) {
                k3Var.setTabsView(this.E);
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
        this.h1.a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.x.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                org.telegram.messenger.g0.E2(view);
                this.x.addView(view, ha.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((f2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setInBubbleMode(boolean z9) {
        this.f = z9;
    }

    public void setInnerTranslationX(float f10) {
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f10;
        invalidate();
        if (this.U0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float l10 = D() ? Utilities.l(f10 / (org.telegram.messenger.g0.L(56.0f) * 6)) : f10 / this.s.getMeasuredWidth();
        f2 f2Var = (f2) rf.b.g(2, this.U0);
        f2Var.onSlideProgress(false, l10);
        f2 f2Var2 = (f2) rf.b.g(1, this.U0);
        float a10 = j9.a(l10 * 2.0f, 0.0f, 1.0f);
        if (!f2Var2.isBeginToShow() || (navigationBarColor = f2Var2.getNavigationBarColor()) == (navigationBarColor2 = f2Var.getNavigationBarColor())) {
            return;
        }
        f2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setIsSheet(boolean z9) {
        this.b = z9;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setNavigationBarColor(int i7) {
        if (this.r1 != i7) {
            this.r1 = i7;
            invalidate();
        }
        n3 n3Var = this.y;
        if (n3Var != null) {
            n3Var.setInternalNavigationBarColor(i7);
        }
        d3 d3Var = this.E;
        if (d3Var != null) {
            d3Var.i(i7, (this.Q || this.T) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i7) {
        this.Z0 = i7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setPulledDialogs(List<c9> list) {
        this.V0 = list;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setRemoveActionBarExtraHeight(boolean z9) {
        this.I0 = z9;
    }

    public void setThemeAnimationValue(float f10) {
        this.s0 = f10;
        for (int i7 = 0; i7 < this.o0; i7++) {
            int f11 = i0.a.f(f10, this.m0[i7], this.n0[i7]);
            ym ymVar = this.p0;
            if (ymVar != null) {
                ymVar.i(this.l0[i7], f11);
            } else {
                int i10 = this.l0[i7];
                SparseIntArray sparseIntArray = k6.jm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i10, f11);
                }
            }
        }
        ArrayList arrayList = this.h0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i11);
            int[] iArr = (int[]) this.b0.get(i11);
            int[] iArr2 = (int[]) this.c0.get(i11);
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
                int argb = Color.argb(Math.min(qs.e4, (int) (((alpha - r4) * f10) + Color.alpha(iArr[i12]))), Math.min(qs.e4, (int) (((red - red2) * f10) + red2)), Math.min(qs.e4, (int) (((green - green2) * f10) + green2)), Math.min(qs.e4, (int) (((blue - blue2) * f10) + blue2)));
                t6 t6Var = (t6) arrayList2.get(i12);
                int i15 = t6Var.e;
                f6 f6Var = t6Var.n;
                if (f6Var != null) {
                    f6Var.i(i15, argb);
                } else {
                    SparseIntArray sparseIntArray2 = k6.jm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i15, argb);
                    }
                }
                t6Var.e(argb, false, false);
                i12++;
                i11 = i14;
                arrayList = arrayList3;
                size = i13;
            }
            i11++;
        }
        ArrayList arrayList4 = this.j0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            s6 s6Var = (s6) arrayList4.get(i16);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                t6 t6Var2 = (t6) this.i0.get(i17);
                t6Var2.e(k6.w0(t6Var2.e, t6Var2.n), false, false);
            }
        }
        vm vmVar = this.g0;
        if (vmVar != null) {
            ym ymVar2 = vmVar.a;
            ymVar2.G.z0.invalidate();
            ymVar2.t.K = f10;
            ymVar2.u.K = f10;
            ymVar2.u(f10);
        }
        n4 n4Var = this.P0;
        if (n4Var != null) {
            n4Var.a(f10);
        }
        q6 q6Var = r6.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 >= 1.0f || currentAnimationTimeMillis != r6.c || f10 != r6.d) {
            r6.c = currentAnimationTimeMillis;
            r6.d = f10;
            r6.c0(this, f10 >= 1.0f);
        } else if (getWindowToken() == null) {
            r6.d0(this, false);
        }
        F();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setUseAlphaAnimations(boolean z9) {
        this.G0 = z9;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setWindow(Window window) {
        this.c = window;
    }

    public final f2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            f2 f2Var = (f2) getFragmentStack().get(size);
            if (f2Var != null && !f2Var.isFinishing() && !f2Var.isRemovingFromStack() && ce0.class.isInstance(f2Var)) {
                return f2Var;
            }
        }
        return null;
    }

    public final void v() {
        if (this.h || this.a0) {
            if (!this.W || this.E0 == null) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    this.e = null;
                }
                l(true, false);
            }
        }
    }

    public final int w(boolean z9) {
        d3 d3Var;
        if (!this.R0 || (d3Var = this.E) == null) {
            return 0;
        }
        return z9 ? (int) d3Var.G : d3Var.H;
    }

    public final jx x() {
        Activity activity = this.Q0;
        if (activity == null) {
            return null;
        }
        if (this.G == null) {
            s sVar = new s(this);
            this.G = sVar;
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                org.telegram.messenger.g0.E2(view);
                this.x.addView(view, ha.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.x.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        return this.h || this.a0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setHighlightActionButtons(boolean z9) {
    }

    @Override // org.telegram.ui.ActionBar.q4
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public ViewGroup getView() {
        return this;
    }
}
