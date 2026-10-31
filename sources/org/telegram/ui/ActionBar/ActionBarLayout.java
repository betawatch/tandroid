package org.telegram.ui.ActionBar;

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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.rz;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hf0;
import org.telegram.ui.my;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.q70;
import org.telegram.ui.sn;
import org.telegram.ui.un;
import th.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements z4, fg.b {
    public static Drawable v1;
    public static Drawable w1;
    public static Paint x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public l D;
    public int D0;
    public i3 E;
    public Runnable E0;
    public bh.d F;
    public Runnable F0;
    public s G;
    public boolean G0;
    public k2 H;
    public View H0;
    public k2 I;
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
    public q70 O0;
    public boolean P;
    public v4 P0;
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
    public final x4 d0;
    public boolean d1;
    public Runnable e;
    public c5 e0;
    public final int[] e1;
    public boolean f;
    public c5 f0;
    public boolean f1;
    public pn g0;
    public int g1;
    public boolean h;
    public final ArrayList h0;
    public final org.telegram.ui.Components.t5 h1;
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
    public sn p0;
    public final p p1;
    public AnimatorSet q0;
    public boolean q1;
    public ColorDrawable r;
    public final e2.f r0;
    public int r1;
    public w s;
    public float s0;
    public r0.j1 s1;
    public boolean t0;
    public i0.c t1;
    public s6 u0;
    public i0.c u1;
    public boolean v0;
    public w w;
    public boolean w0;
    public w x;
    public int x0;
    public s3 y;
    public boolean y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        x4 x4Var = new x4();
        x4Var.b = new SparseIntArray();
        x4Var.c = new int[]{t6.ob, t6.rb, t6.sb, t6.tb, t6.Oc, t6.qb};
        this.d0 = x4Var;
        this.h0 = new ArrayList();
        this.j0 = new ArrayList();
        this.r0 = new e2.f(null);
        this.W0 = new Rect();
        this.Z0 = -1;
        this.b1 = new Path();
        int i10 = 8;
        this.c1 = new float[8];
        this.e1 = new int[2];
        this.h1 = new org.telegram.ui.Components.t5(this, 280L, gr.h);
        this.o1 = new ArrayList();
        this.p1 = new p(this, 2);
        i0.c cVar = i0.c.e;
        this.t1 = cVar;
        this.u1 = cVar;
        this.Q0 = (Activity) context;
        this.R0 = z10;
        if (w1 == null) {
            w1 = getResources().getDrawable(R.drawable.layer_shadow);
            v1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            x1 = new Paint();
        }
        mg.l lVar = new mg.l(this, i10);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(this, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(ArrayList arrayList, View view) {
        if (view instanceof fg.b) {
            arrayList.addAll(((fg.b) view).F());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                E(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z10) {
            if (actionBarLayout.U0.size() >= 2) {
                ((k2) sc.e.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
                k2 k2Var = (k2) sc.e.g(2, actionBarLayout.U0);
                k2Var.prepareFragmentToSlide(false, false);
                k2Var.onPause();
                View view = k2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    k2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(k2Var.fragmentView);
                }
                l lVar = k2Var.actionBar;
                if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(k2Var.actionBar);
                }
                k2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            k2 k2Var2 = (k2) sc.e.g(1, actionBarLayout.U0);
            k2Var2.prepareFragmentToSlide(true, false);
            k2Var2.onPause();
            k2Var2.onFragmentDestroy();
            k2Var2.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.K("onSlideAnimationEnd");
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
                k2 k2Var3 = (k2) sc.e.g(1, actionBarLayout.U0);
                actionBarLayout.D = k2Var3.actionBar;
                k2Var3.onResume();
                k2Var3.onBecomeFullyVisible();
                k2Var3.prepareFragmentToSlide(false, false);
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

    public static View u(ViewGroup viewGroup, float f7, float f10) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = org.telegram.messenger.i0.Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f7, (int) f10)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (u10 = u((ViewGroup) childAt, f7 - rect.left, f10 - rect.top)) != null) {
                        return u10;
                    }
                }
            }
        }
        return null;
    }

    public static boolean y(int i10, int i11, int i12) {
        if (i10 != t6.g5 && i10 != t6.Oc && i10 != t6.Fe) {
            if (i10 != t6.rb && i10 != t6.sb && i10 != t6.tb && i10 != t6.Be && i10 != t6.Ce && i10 != t6.De && i10 != t6.Ee) {
                return true;
            }
            if (i11 != 0 && i12 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return this.W || this.T;
    }

    public final int B() {
        View rootView = getRootView();
        Rect rect = this.W0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean C() {
        return this.j1 && this.k1;
    }

    public final void D() {
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            if (((k2) this.U0.get(i10)).getFragmentView() != null) {
                try {
                    ((k2) this.U0.get(i10)).onThemeColorsChanged();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fg.b
    public final List F() {
        k2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof fg.b) {
            arrayList.addAll(((fg.b) lastFragment).F());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final void G(boolean z10) {
        J();
        M();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.K = null;
        }
        t tVar = this.J0;
        if (tVar != null) {
            org.telegram.messenger.i0.r(tVar);
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

    public final void H() {
        i5 i5Var;
        l lVar;
        if (this.a0 || this.Q || i() || this.U0.isEmpty()) {
            return;
        }
        g20 g20Var = g20.d0;
        if (g20Var != null && g20Var.x) {
            g20Var.e(false);
            return;
        }
        if (!h0() && (lVar = this.D) != null && !lVar.u()) {
            l lVar2 = this.D;
            if (lVar2.n0) {
                lVar2.k(true);
                return;
            }
        }
        k2 k2Var = (k2) sc.e.g(1, this.U0);
        if (!h0() && (i5Var = k2Var.simpleActionBar) != null) {
            s5 s5Var = i5Var.Q;
            if (s5Var != null) {
                s5Var.a(true);
                return;
            } else if (!i5Var.G && i5Var.F) {
                i5Var.j(true);
                return;
            }
        }
        s sVar = this.G;
        if ((sVar == null || sVar.onBackPressed(true)) && ((k2) sc.e.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
            l(true, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5.T != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(float f7, float f10) {
        s sVar;
        i5 i5Var;
        if (this.T) {
            AnimatorSet animatorSet = this.n1;
            if (animatorSet != null) {
                animatorSet.end();
                this.n1 = null;
            }
            return false;
        }
        if (!this.j1 && !this.i1 && !this.a0 && !this.Q && !i() && this.U0.size() > 1 && !x() && ((sVar = this.G) == null || !sVar.hasShownSheet())) {
            k2 k2Var = (k2) sc.e.g(1, this.U0);
            if (k2Var.onBackPressed(false) && (((i5Var = k2Var.simpleActionBar) == null || (i5Var.Q == null && (i5Var.G || !i5Var.F))) && !k2Var.hasShownSheet() && k2Var.canBeginSlide())) {
                this.k1 = false;
                this.j1 = true;
                this.i1 = true;
                this.m1 = f7 < ((float) org.telegram.messenger.i0.q.x) / 2.0f;
                this.l1 = f10;
                Q();
                Activity activity = this.Q0;
                if (activity != null && activity.getCurrentFocus() != null) {
                    org.telegram.messenger.i0.v1(activity.getCurrentFocus());
                }
                k2Var.onBeginSlide();
                return true;
            }
        }
        return false;
    }

    public final void J() {
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

    public final void K(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = hc.D().f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.s5) arrayList.get(i10)).y0 = 0;
        }
        g(str);
    }

    public final void L() {
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).onLowMemory();
        }
    }

    public final void M() {
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

    public final void N() {
        if (!this.U0.isEmpty()) {
            ((k2) sc.e.g(1, this.U0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void O() {
        if (!this.U0.isEmpty()) {
            ((k2) sc.e.g(1, this.U0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void P(Canvas canvas, ViewGroup viewGroup) {
        if (this.E == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
        this.E.draw(canvas);
        canvas.restore();
    }

    public final void Q() {
        this.P = false;
        this.Q = true;
        this.w.setVisibility(0);
        this.V = false;
        k2 k2Var = (k2) sc.e.g(2, this.U0);
        View view = k2Var.fragmentView;
        if (view == null && (view = k2Var.performCreateView(this.Q0)) != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
            o oVar = new o(k2Var);
            WeakHashMap weakHashMap = r0.h0.a;
            r0.z.i(view, oVar);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            k2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        l lVar = k2Var.actionBar;
        if (lVar != null && lVar.K) {
            org.telegram.messenger.i0.E2(lVar);
            if (this.I0) {
                k2Var.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(k2Var.actionBar);
        }
        k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        k2Var.attachSheets(this.w);
        if (!k2Var.hasOwnBackground && view.getBackground() == null) {
            a7.i(t6.d6, view, null);
        }
        k2Var.onResume();
        if (this.q0 != null) {
            this.i0 = k2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((k2) sc.e.g(1, this.U0)).prepareFragmentToSlide(true, true);
        k2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean R(k2 k2Var) {
        return T(new w4(k2Var));
    }

    public final boolean S(k2 k2Var, boolean z10) {
        w4 w4Var = new w4(k2Var);
        w4Var.b = z10;
        return T(w4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(w4 w4Var) {
        v4 v4Var;
        ArrayList arrayList;
        t3 t3Var;
        k2 k2Var;
        int i10;
        int i11;
        LaunchActivity launchActivity;
        Dialog dialog;
        k2 k2Var2 = w4Var.a;
        boolean z10 = w4Var.b;
        boolean z11 = w4Var.c;
        boolean z12 = w4Var.d;
        boolean z13 = w4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w4Var.f;
        if (k2Var2 == null || i() || !(((v4Var = this.P0) == null || !z12 || v4Var.l(this, w4Var)) && k2Var2.onFragmentCreate())) {
            return false;
        }
        t3 edgeToEdgeSupportMode = k2Var2.getEdgeToEdgeSupportMode();
        t3 t3Var2 = t3.a;
        int i12 = 1;
        boolean z14 = edgeToEdgeSupportMode != t3Var2;
        boolean drawEdgeNavigationBar = k2Var2.drawEdgeNavigationBar();
        k2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.I1) != null) {
            ArrayList arrayList2 = launchActivity.E0;
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
                ArrayList arrayList3 = LaunchActivity.I1.E0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof bi) || (visibleDialog instanceof xh.m2))) {
            i2 i2Var = new i2();
            i2Var.a = true;
            lastFragment.showAsSheet(k2Var2, i2Var);
            return true;
        }
        if (org.telegram.messenger.v2.a) {
            f8.b("present fragment " + k2Var2.getClass().getSimpleName() + " args=" + k2Var2.getArguments());
        }
        int i13 = 0;
        while (true) {
            arrayList = o7.y1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((o7) arrayList.get(i13)).D(false);
            i13++;
        }
        arrayList.clear();
        i3 i3Var = this.E;
        if (i3Var != null && !i3Var.c) {
            LaunchActivity.J();
        }
        if (this.h && this.a0) {
            Runnable runnable = this.e;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.e = null;
            }
            l(false, true);
        }
        k2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.J;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.J = null;
        }
        this.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
        k2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.Q0;
        if (activity.getCurrentFocus() != null && k2Var2.hideKeyboardOnShow() && !z13) {
            org.telegram.messenger.i0.v1(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && vp.d1().getBoolean("view_animations", true));
        if (this.U0.isEmpty()) {
            t3Var = t3Var2;
            k2Var = null;
        } else {
            t3Var = t3Var2;
            k2Var = (k2) sc.e.g(1, this.U0);
        }
        k2Var2.setParentLayout(this);
        View view = k2Var2.fragmentView;
        if (view == null) {
            view = k2Var2.performCreateView(activity);
            if (view != null && k2Var2.isSupportEdgeToEdge() && k2Var2.drawEdgeNavigationBar()) {
                o oVar = new o(k2Var2);
                WeakHashMap weakHashMap = r0.h0.a;
                r0.z.i(view, oVar);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                k2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        w wVar = this.w;
        if (z13) {
            edgeToEdgeSupportMode = t3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.w.setDrawNavigationBar(!z13 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.w.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i10 = org.telegram.messenger.i0.L(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - org.telegram.messenger.i0.n) - i10) - org.telegram.messenger.i0.L(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i10 = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = k2Var2.getPreviewHeight();
            int i14 = org.telegram.messenger.i0.m;
            if (previewHeight > 0) {
                i11 = 2;
                if (previewHeight < getMeasuredHeight() - i14) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i14) - previewHeight) / 2) + i14;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = org.telegram.messenger.m5.C(8.0f, i10, layoutParams2.bottomMargin);
                    }
                    int L = org.telegram.messenger.i0.L(8.0f);
                    layoutParams2.leftMargin = L;
                    layoutParams2.rightMargin = L;
                }
            } else {
                i11 = 2;
            }
            int L2 = org.telegram.messenger.i0.L(actionBarPopupWindow$ActionBarPopupWindowLayout != null ? 0.0f : 24.0f);
            layoutParams2.bottomMargin = L2;
            layoutParams2.topMargin = L2;
            int i15 = org.telegram.messenger.i0.m;
            int i16 = L2 + i15;
            layoutParams2.topMargin = i16;
            if (z14) {
                layoutParams2.topMargin = i16 + i15;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            }
            int L3 = org.telegram.messenger.i0.L(8.0f);
            layoutParams2.leftMargin = L3;
            layoutParams2.rightMargin = L3;
        } else {
            i11 = 2;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        l lVar = k2Var2.actionBar;
        if (lVar != null && lVar.K) {
            if (this.I0) {
                lVar.setOccupyStatusBar(false);
            }
            org.telegram.messenger.i0.E2(k2Var2.actionBar);
            this.w.addView(k2Var2.actionBar);
        }
        k2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        k2Var2.attachSheets(this.w);
        this.U0.add(k2Var2);
        K("presentFragment");
        k2Var2.onResume();
        this.D = k2Var2.actionBar;
        if (!k2Var2.hasOwnBackground && view.getBackground() == null) {
            a7.i(t6.d6, view, null);
        }
        w wVar2 = this.s;
        w wVar3 = this.w;
        this.s = wVar3;
        this.w = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(k2Var2 instanceof un)) {
                float L4 = org.telegram.messenger.i0.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bi.d2 d2Var = rf.e0.a;
                view.setOutlineProvider(new rf.c0(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new u());
            } else {
                float L5 = org.telegram.messenger.i0.L(29.0f);
                bi.d2 d2Var2 = rf.e0.a;
                view.setOutlineProvider(new rf.c0(0, L5));
            }
            view.setClipToOutline(true);
            view.setElevation(org.telegram.messenger.i0.L(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineSpotShadowColor(-1342177280);
                view.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.r == null) {
                this.r = new ColorDrawable(771751936);
            }
            this.r.setAlpha(0);
            t6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.x;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            V(k2Var, z10);
            View view2 = this.H0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.q0 != null) {
            this.i0 = k2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.H0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.H0.setVisibility(0);
            }
            if (k2Var != null) {
                k2Var.onTransitionAnimationStart(false, false);
                k2Var.onTransitionAnimationEnd(false, false);
            }
            k2Var2.onTransitionAnimationStart(true, false);
            k2Var2.onTransitionAnimationEnd(true, false);
            k2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.G0 && this.U0.size() == 1) {
            V(k2Var, z10);
            this.B0 = System.currentTimeMillis();
            this.W = true;
            this.F0 = new mh.k(25, k2Var, k2Var2);
            ArrayList arrayList4 = new ArrayList();
            int i17 = i11;
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
            View view4 = this.H0;
            if (view4 != null) {
                view4.setVisibility(0);
                float[] fArr4 = new float[i17];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                arrayList4.add(ObjectAnimator.ofFloat(this.H0, (Property<View, Float>) property, fArr4));
            }
            if (k2Var != null) {
                k2Var.onTransitionAnimationStart(false, false);
            }
            k2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.K = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.K.setInterpolator(gr.h);
            this.K.setDuration(200L);
            this.K.addListener(new r(this, 1));
            this.K.start();
            return true;
        }
        this.a0 = z13;
        this.B0 = System.currentTimeMillis();
        this.W = true;
        q qVar = new q(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, k2Var, k2Var2);
        k2 k2Var3 = k2Var;
        this.F0 = qVar;
        boolean needDelayOpenAnimation = k2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (k2Var3 != null) {
                k2Var3.onTransitionAnimationStart(false, false);
            }
            k2Var2.onTransitionAnimationStart(true, false);
        }
        this.X0 = false;
        this.I = k2Var3;
        this.H = k2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? k2Var2.onCustomTransitionAnimation(true, new p(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.w.b) && k2Var3 != null)) {
                k2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.K = onCustomTransitionAnimation;
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
            if (!k2Var2.needDelayOpenAnimation()) {
                g0(true, true, z13);
                return true;
            }
            ci.h hVar = new ci.h(this, k2Var2, z13, i12);
            this.e = hVar;
            org.telegram.messenger.i0.h3(hVar, 200L);
            return true;
        }
        if (k2Var3 != null && !z13) {
            k2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new v(this, z16, k2Var3, k2Var2, z13);
        if (k2Var2.needDelayOpenAnimation()) {
            this.e = new j6.g(this, k2Var3, k2Var2, z13);
        }
        org.telegram.messenger.i0.h3(this.d, 250L);
        return true;
    }

    public final boolean U(k2 k2Var, boolean z10, boolean z11) {
        w4 w4Var = new w4(k2Var);
        w4Var.b = z10;
        w4Var.c = z11;
        w4Var.d = true;
        w4Var.e = false;
        return T(w4Var);
    }

    public final void V(k2 k2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (k2Var == null) {
            return;
        }
        k2Var.onBecomeFullyHidden();
        k2Var.onPause();
        if (z10) {
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
            this.U0.remove(k2Var);
            K("presentFragmentInternalRemoveOld");
        } else {
            View view = k2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                k2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(k2Var.fragmentView);
                } catch (Exception e) {
                    f8.g(e, true);
                    try {
                        viewGroup2.removeView(k2Var.fragmentView);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                }
            }
            l lVar = k2Var.actionBar;
            if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(k2Var.actionBar);
            }
            k2Var.detachSheets();
        }
        this.w.setVisibility(4);
    }

    public final void W(boolean z10, boolean z11) {
        if (this.W || this.Q) {
            this.y0 = true;
            this.z0 = z10;
            this.A0 = z11;
            return;
        }
        int size = this.U0.size();
        if (!z10) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ((k2) this.U0.get(i10)).clearViews();
            ((k2) this.U0.get(i10)).setParentLayout(this);
        }
        v4 v4Var = this.P0;
        if (v4Var != null) {
            v4Var.b(this, z10);
        }
        if (z11) {
            e0();
        }
    }

    public final void X() {
        W(true, true);
    }

    public final void Y() {
        this.s.removeAllViews();
        this.w.removeAllViews();
        this.D = null;
        this.H = null;
        this.I = null;
    }

    public final void Z() {
        while (this.U0.size() > 0) {
            d0((k2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new p(this, 5)).start();
        }
    }

    public final void a0(int i10) {
        if (i10 < 0 || i10 >= getFragmentStack().size()) {
            return;
        }
        c0((k2) getFragmentStack().get(i10), false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.j1 j1Var = this.s1;
        if (j1Var != null) {
            o(view, j1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.c0.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((c7) arrayList.get(i10)).c();
        }
    }

    public final void b0(k2 k2Var) {
        c0(k2Var, false);
    }

    public final boolean c(int i10, k2 k2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        v4 v4Var = this.P0;
        if ((v4Var != null && !v4Var.h(k2Var, this)) || !k2Var.onFragmentCreate() || this.U0.contains(k2Var)) {
            return false;
        }
        k2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i10 == -1 || i10 == -2) {
            if (!this.U0.isEmpty()) {
                k2 k2Var2 = (k2) sc.e.g(1, this.U0);
                k2Var2.onPause();
                l lVar = k2Var2.actionBar;
                if (lVar != null && lVar.K && (viewGroup2 = (ViewGroup) lVar.getParent()) != null) {
                    viewGroup2.removeView(k2Var2.actionBar);
                }
                View view = k2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    k2Var2.onRemoveFromParent();
                    viewGroup.removeView(k2Var2.fragmentView);
                }
                k2Var2.detachSheets();
            }
            this.U0.add(k2Var);
            if (i10 != -2) {
                View view2 = k2Var.fragmentView;
                if (view2 == null) {
                    view2 = k2Var.performCreateView(activity);
                    if (view2 != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(k2Var);
                        WeakHashMap weakHashMap = r0.h0.a;
                        r0.z.i(view2, oVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        k2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!k2Var.hasOwnBackground && view2.getBackground() == null) {
                    a7.i(t6.d6, view2, null);
                }
                this.s.addView(view2, w7.b6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
                l lVar2 = k2Var.actionBar;
                if (lVar2 != null && lVar2.K) {
                    if (this.I0) {
                        lVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) k2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(k2Var.actionBar);
                    }
                    this.s.addView(k2Var.actionBar);
                }
                k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                k2Var.attachSheets(this.s);
                k2Var.onResume();
                k2Var.onTransitionAnimationEnd(false, true);
                k2Var.onTransitionAnimationEnd(true, true);
                k2Var.onBecomeFullyVisible();
            }
            K("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View view3 = k2Var.fragmentView;
                if (view3 == null) {
                    view3 = k2Var.performCreateView(activity);
                    if (view3 != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
                        o oVar2 = new o(k2Var);
                        WeakHashMap weakHashMap2 = r0.h0.a;
                        r0.z.i(view3, oVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        k2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!k2Var.hasOwnBackground && view3.getBackground() == null) {
                    a7.i(t6.d6, view3, null);
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.j(0, wVar.getChildCount(), 0), w7.b6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
                l lVar3 = k2Var.actionBar;
                if (lVar3 != null && lVar3.K) {
                    if (this.I0) {
                        lVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) k2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(k2Var.actionBar);
                    }
                    this.s.addView(k2Var.actionBar);
                }
                k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                k2Var.attachSheets(this.s);
                i10 = 0;
            }
            this.U0.add(i10, k2Var);
            K("addFragmentToStack");
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

    public final void c0(k2 k2Var, boolean z10) {
        if ((this.U0.size() > 0 && sc.e.g(1, this.U0) == k2Var) || (this.U0.size() > 1 && sc.e.g(2, this.U0) == k2Var)) {
            M();
            J();
        }
        g("removeFragmentFromStack " + z10);
        if (this.G0 && this.U0.size() == 1 && org.telegram.messenger.i0.Q1()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && org.telegram.messenger.i0.Q1()) {
            this.P0.k(this);
        }
        d0(k2Var, k2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.h0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.b0.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c7 c7Var = (c7) arrayList.get(i10);
            iArr[i10] = c7Var.c();
            b7 b7Var = c7Var.g;
            c7Var.g = null;
            if (b7Var != null) {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.contains(b7Var)) {
                    arrayList2.add(b7Var);
                }
            }
        }
    }

    public final void d0(k2 k2Var, boolean z10) {
        if (this.U0.contains(k2Var)) {
            if (z10 && sc.e.g(1, this.U0) == k2Var) {
                k2Var.finishFragment();
                return;
            }
            if (sc.e.g(1, this.U0) == k2Var && this.U0.size() > 1) {
                k2Var.finishFragment(false);
                return;
            }
            k2Var.onPause();
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
            this.U0.remove(k2Var);
            K("removeFragmentFromStackInternal " + z10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E == null || v(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        }
        this.a1 = true;
        if (this.S0) {
            canvas2.save();
            float L = org.telegram.messenger.i0.L(24.0f);
            RectF rectF = org.telegram.messenger.i0.P;
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
        v4 v4Var = this.P0;
        return (v4Var != null && v4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
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
        g2 g2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.t1.d));
        s sVar = this.G;
        g2 g2Var2 = null;
        if (sVar != null && sVar.getLastSheet() != null) {
            g2Var = this.G.getLastSheet();
            if (g2Var.z()) {
            }
        }
        g2Var = null;
        if (g2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            g2Var = getLastFragment().getLastSheet();
            if (g2Var.z()) {
            }
            if (g2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.q1 = z10;
                }
                if (!this.q1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.q1 = false;
                    }
                    return g2Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.q1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        g2Var2 = g2Var;
        if (g2Var2 != null) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        w wVar;
        View childAt;
        int i13;
        int i14;
        WindowInsets rootWindowInsets;
        float f7;
        float min;
        bh.d dVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.O);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.w) {
            paddingLeft2 = org.telegram.messenger.i0.L(1.0f) + paddingRight;
        } else if (view == this.s) {
            i10 = paddingLeft2;
            i11 = paddingRight;
            int save = canvas.save();
            if (view != this.E || (dVar = this.F) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.a1;
                boolean z11 = this.d1;
                int width2 = getWidth();
                getY();
                getHeight();
                dVar.n(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.a1 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31 && !this.b && (paddingRight != 0 || this.Z0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = org.telegram.messenger.i0.P;
                        float f10 = paddingRight;
                        rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                        if (C()) {
                            if (this.j1) {
                                f7 = 56.0f;
                                min = org.telegram.messenger.i0.T1(1.0f, org.telegram.messenger.i0.T1(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.l(f10 / org.telegram.messenger.i0.N(56.0f)));
                            } else {
                                f7 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f10) / org.telegram.messenger.i0.N(56.0f));
                            }
                            float j11 = (paddingRight <= org.telegram.messenger.i0.L(f7) || this.T || !this.j1) ? Utilities.j(paddingRight, org.telegram.messenger.i0.L(f7), 0) : f10;
                            if (!this.j1 || this.m1) {
                                canvas2.translate(-j11, 0.0f);
                                i10 = (int) (i10 + j11);
                            } else {
                                canvas2.translate(-j11, 0.0f);
                                rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                                i10 = (int) (i10 + j11);
                            }
                            canvas2.scale(min, min, this.m1 ? rectF.right - org.telegram.messenger.i0.L(82.0f) : rectF.left + org.telegram.messenger.i0.L(82.0f), this.j1 ? this.l1 : rectF.centerY());
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
                            float l4 = Utilities.l(Math.abs(paddingRight) / org.telegram.messenger.i0.N(12.0f));
                            fArr[0] = fArr[0] * l4;
                            fArr[1] = fArr[1] * l4;
                            fArr[6] = fArr[6] * l4;
                            fArr[7] = fArr[7] * l4;
                        }
                        Path path = this.b1;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.w && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    i10 += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (C()) {
                        i10 = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!A() && !this.h) {
                canvas2.clipRect(i11, 0, i10, getHeight());
            }
            if ((!this.h || this.a0) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.J == null) {
                    int L = org.telegram.messenger.i0.L(32.0f);
                    int measuredWidth = (getMeasuredWidth() - L) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - org.telegram.messenger.i0.L(12.0f));
                    t6.s0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    t6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas2.restoreToCount(save2);
            i13 = paddingRight != 0 ? -1 : -1;
            i14 = this.Z0;
            if (i14 == i13) {
                i14 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = w7.u.b((i14 * zs.e4) / org.telegram.messenger.i0.L(20.0f), 0, zs.e4);
                if (b10 > 0) {
                    int i15 = v(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i12 < 31 || this.b) {
                        Drawable drawable = w1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i15);
                        w1.setAlpha(b10);
                        w1.draw(canvas2);
                    }
                }
            } else if (view == this.w) {
                x1.setColor(Color.argb((int) (w7.u.a(i14 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.Z0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, x1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i11, 0.0f, i10, getHeight() * 1.5f, x1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i11 = paddingLeft;
        i10 = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.E) {
        }
        canvas2 = canvas;
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            if (view != this.s) {
            }
        }
        int save22 = canvas2.save();
        if (!A()) {
            canvas2.clipRect(i11, 0, i10, getHeight());
        }
        if (!this.h) {
        }
        this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r.draw(canvas2);
        if (this.J == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i14 = this.Z0;
        if (i14 == i13) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z10) {
        Animator customSlideTransition;
        k2 k2Var = !this.U0.isEmpty() ? (k2) sc.e.g(1, this.U0) : null;
        if (k2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = k2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), C() ? zs.r5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (C()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), C() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.j1 ? org.telegram.messenger.i0.L(56.0f) : 0));
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j11));
                if (C()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        }
        Animator customSlideTransition2 = k2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        k2 k2Var2 = (k2) sc.e.g(2, this.U0);
        if (k2Var2 != null && (customSlideTransition = k2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.U0.isEmpty()) {
            return;
        }
        int size = this.U0.size() - 1;
        if (this.U0.isEmpty()) {
            return;
        }
        if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((k2) this.U0.get(size)).fragmentView == null) {
            for (int i10 = 0; i10 < size; i10++) {
                k2 k2Var = (k2) this.U0.get(i10);
                l lVar = k2Var.actionBar;
                if (lVar != null && lVar.K && (viewGroup2 = (ViewGroup) lVar.getParent()) != null) {
                    viewGroup2.removeView(k2Var.actionBar);
                }
                View view = k2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    k2Var.onPause();
                    k2Var.onRemoveFromParent();
                    viewGroup.removeView(k2Var.fragmentView);
                }
            }
            k2 k2Var2 = (k2) this.U0.get(size);
            k2Var2.setParentLayout(this);
            View view2 = k2Var2.fragmentView;
            if (view2 == null) {
                view2 = k2Var2.performCreateView(this.Q0);
                if (view2 != null && k2Var2.isSupportEdgeToEdge() && k2Var2.drawEdgeNavigationBar()) {
                    o oVar = new o(k2Var2);
                    WeakHashMap weakHashMap = r0.h0.a;
                    r0.z.i(view2, oVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    k2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, w7.b6.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(k2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(k2Var2.drawEdgeNavigationBar());
            l lVar2 = k2Var2.actionBar;
            if (lVar2 != null && lVar2.K) {
                if (this.I0) {
                    lVar2.setOccupyStatusBar(false);
                }
                org.telegram.messenger.i0.E2(k2Var2.actionBar);
                this.s.addView(k2Var2.actionBar);
            }
            k2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
            k2Var2.attachSheets(this.s);
            k2Var2.onResume();
            k2Var2.onBecomeFullyVisible();
            this.D = k2Var2.actionBar;
            if (k2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            a7.i(t6.d6, view2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
    
        r0 = org.telegram.messenger.vp.d1().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(y4 y4Var, Runnable runnable) {
        s6 s6Var;
        s6 s6Var2;
        if (this.W || this.Q) {
            this.t0 = true;
            this.u0 = y4Var.a;
            this.w0 = y4Var.c;
            this.x0 = y4Var.b;
            this.v0 = y4Var.g;
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
        int size = y4Var.e ? 1 : this.U0.size();
        ag.g3 g3Var = new ag.g3(this, size, y4Var, runnable, 6);
        if (size < 1 || !y4Var.f || !y4Var.g) {
            g3Var.run();
            return;
        }
        if (y4Var.m == null) {
            f0(null);
        }
        int i10 = y4Var.b;
        if (i10 != -1 && (s6Var2 = y4Var.a) != null) {
            s6Var2.u(i10);
            t6.z1(y4Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            t6.u(y4Var.a, true, y4Var.c);
            g3Var.run();
            return;
        }
        s6 s6Var3 = y4Var.a;
        boolean z10 = y4Var.c;
        lg.s sVar = new lg.s(g3Var, 15);
        int i11 = t6.a;
        if (s6Var3 == null) {
            sVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e) {
            e = e;
            s6Var = s6Var3;
        }
        if (s6Var3.b == null && s6Var3.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.remove("theme");
                edit.apply();
            }
            t6.hm.clear();
            t6.g0 = 0;
            t6.h0 = null;
            t6.e0 = null;
            t6.f0 = null;
            if (!z10 && t6.M == null) {
                t6.K = s6Var3;
                if (t6.I == t6.J) {
                    t6.T = 2000;
                    t6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.i0.h3(new rz(2), 2100L);
                }
            }
            t6.I = s6Var3;
            t6.t1(false, false);
            s6Var = s6Var3;
            if (t6.M == null && !t6.Q) {
                vp.r1(s6Var.E).u4(s6Var, s6Var.k(false), z10, false);
            }
            sVar.run();
        }
        String[] strArr = new String[1];
        bi.n4 n4Var = new bi.n4(strArr, s6Var3, z10, sVar, 23);
        s6Var = s6Var3;
        try {
            int i12 = t6.tm + 1;
            t6.tm = i12;
            jg.o2 o2Var = new jg.o2(i12, sVar, n4Var);
            String str = s6Var.d;
            if (str != null) {
                Utilities.i.c(new ag.q0(o2Var, obj, str, obj, 19));
            } else {
                Utilities.i.c(new ag.q0(o2Var, new File(s6Var.b), obj, strArr, 19));
            }
        } catch (Exception e7) {
            e = e7;
            f8.g(e, true);
            if (t6.M == null) {
                vp.r1(s6Var.E).u4(s6Var, s6Var.k(false), z10, false);
            }
            sVar.run();
        }
    }

    public final void f0(sn snVar) {
        try {
            int i10 = t6.f5;
            this.k0 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.k0[i11] = snVar != null ? snVar.h(i11) : t6.x0(null, i11, false);
            }
        } catch (Exception e) {
            f8.g(e, true);
            this.k0 = null;
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.v2.a;
        ArrayList arrayList = this.o1;
        StringBuilder i10 = sc.e.i(str, " ");
        i10.append(this.U0.size());
        arrayList.add(0, i10.toString());
        if (this.o1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < 10; i11++) {
                arrayList2.add((String) this.o1.get(i11));
            }
            this.o1 = arrayList2;
        }
        p pVar = this.p1;
        org.telegram.messenger.i0.r(pVar);
        org.telegram.messenger.i0.h3(pVar, 500L);
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.J0 = tVar;
        org.telegram.messenger.i0.g3(tVar);
    }

    @Override // org.telegram.ui.ActionBar.z4
    public k2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (k2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.z4
    public /* bridge */ /* synthetic */ z2 getBottomSheet() {
        return null;
    }

    public i3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.a0 && !this.n) {
            return 0.0f;
        }
        k2 k2Var = this.I;
        return ((k2Var == null || !k2Var.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public s3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public List<k2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public k2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (k2) sc.e.g(1, this.U0);
    }

    public k2 getLastFragmentIncludeMainTabs() {
        k2 lastFragment = getLastFragment();
        return lastFragment instanceof pf0 ? ((pf0) lastFragment).b0() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public c5 getMessageDrawableOutMediaStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public c5 getMessageDrawableOutStart() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.z4
    public List<x8> getPulledDialogs() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public k2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            k2 k2Var = (k2) getFragmentStack().get(size);
            if (k2Var != null && k2Var.getContext() != null && !k2Var.isFinishing() && !k2Var.isRemovingFromStack()) {
                return k2Var;
            }
        }
        return null;
    }

    public my getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.z4
    public float getThemeAnimationValue() {
        return this.s0;
    }

    @Override // org.telegram.ui.ActionBar.z4
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
            W(this.z0, this.A0);
            this.y0 = false;
        } else if (this.t0) {
            y4 y4Var = new y4(this.u0, this.x0, this.w0, true);
            boolean z10 = this.v0;
            if (!z10) {
                y4Var.g = z10;
                y4Var.f = z10;
            }
            f(y4Var, null);
            this.u0 = null;
            this.t0 = false;
        }
    }

    public final boolean h0() {
        k2 k2Var = !this.U0.isEmpty() ? (k2) sc.e.g(1, this.U0) : null;
        return (k2Var == null || k2Var.getLastStoryViewer() == null || !k2Var.getLastStoryViewer().z()) ? false : true;
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
            G(true);
        }
        return this.W;
    }

    public final void j() {
        this.o0 = 0;
        this.p0 = null;
        this.k0 = null;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        k2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            v4 v4Var = this.P0;
            if ((v4Var != null && !v4Var.k(this)) || i() || this.U0.isEmpty()) {
                return;
            }
            Activity activity = this.Q0;
            if (activity.getCurrentFocus() != null) {
                org.telegram.messenger.i0.v1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z12 = !z11 && (this.h || this.a0 || (z10 && vp.d1().getBoolean("view_animations", true)));
            k2 k2Var = (k2) sc.e.g(1, this.U0);
            AnimatorSet animatorSet = null;
            k2 k2Var2 = this.U0.size() > 1 ? (k2) sc.e.g(2, this.U0) : null;
            if (k2Var2 != null) {
                org.telegram.messenger.i0.o3(activity, t6.x0(null, t6.s8, false) == -1 || (k2Var2.hasForceLightStatusBar() && !t6.D0().q()));
                w wVar = this.s;
                this.s = this.w;
                this.w = wVar;
                k2Var2.setParentLayout(this);
                View view = k2Var2.fragmentView;
                if (view == null && (view = k2Var2.performCreateView(activity)) != null && k2Var2.isSupportEdgeToEdge() && k2Var2.drawEdgeNavigationBar()) {
                    o oVar = new o(k2Var2);
                    WeakHashMap weakHashMap = r0.h0.a;
                    r0.z.i(view, oVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        k2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(k2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(k2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    l lVar = k2Var2.actionBar;
                    if (lVar != null && lVar.K) {
                        if (this.I0) {
                            lVar.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.i0.E2(k2Var2.actionBar);
                        this.s.addView(k2Var2.actionBar);
                    }
                    k2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    k2Var2.attachSheets(this.s);
                }
                this.H = k2Var2;
                this.I = k2Var;
                k2Var2.onTransitionAnimationStart(true, true);
                k2Var.onTransitionAnimationStart(false, true);
                k2Var2.onResume();
                if (this.q0 != null) {
                    this.i0 = k2Var2.getThemeDescriptions();
                }
                this.D = k2Var2.actionBar;
                if (!k2Var2.hasOwnBackground && view.getBackground() == null) {
                    a7.i(t6.d6, view, null);
                }
                if (z12) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    k2Var.setRemovingFromStack(true);
                    this.E0 = new li.s(this, k2Var, k2Var2, 18);
                    if (!this.h && !this.a0) {
                        animatorSet = k2Var.onCustomTransitionAnimation(false, new p(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.w.b)) {
                            g0(false, true, z13 || this.a0);
                        } else {
                            mg.c2 c2Var = new mg.c2(this, 12);
                            this.d = c2Var;
                            org.telegram.messenger.i0.h3(c2Var, 200L);
                        }
                    } else {
                        this.K = animatorSet;
                        wb wbVar = wb.w;
                        if (wbVar != null && wbVar.l) {
                            wbVar.b();
                        }
                    }
                    K("closeLastFragment");
                } else {
                    m(k2Var);
                    k2Var.onTransitionAnimationEnd(false, true);
                    k2Var2.onTransitionAnimationEnd(true, true);
                    k2Var2.onBecomeFullyVisible();
                }
            } else if (!this.G0 || z11) {
                d0(k2Var, false);
                setVisibility(8);
                View view2 = this.H0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.B0 = System.currentTimeMillis();
                this.W = true;
                this.E0 = new mh.k(24, this, k2Var);
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
            k2Var.onFragmentClosed();
        }
    }

    public final void m(k2 k2Var) {
        k2Var.finishing = true;
        k2Var.onPause();
        k2Var.onFragmentDestroy();
        k2Var.setParentLayout(null);
        this.U0.remove(k2Var);
        this.w.setVisibility(4);
        this.w.setTranslationY(0.0f);
        bringChildToFront(this.s);
        w wVar = this.x;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        K("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((k2) sc.e.g(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.j1 j1Var) {
        boolean z10 = this.S0;
        if (z10) {
            if (!(view instanceof w) || !((w) view).y) {
                r0.h0.b(view, r0.j1.b);
                return;
            }
            int i10 = j1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.j1 j1Var2 = r0.j1.b;
            int i11 = Build.VERSION.SDK_INT;
            r0.z0 y0Var = i11 >= 34 ? new r0.y0(j1Var2) : i11 >= 30 ? new r0.x0(j1Var2) : i11 >= 29 ? new r0.w0(j1Var2) : new r0.v0(j1Var2);
            y0Var.c(8, i0.c.b(0, 0, 0, max));
            r0.h0.b(view, y0Var.b());
            return;
        }
        boolean z11 = this.T0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.c cVar = this.t1;
        i0.c cVar2 = this.u1;
        if (view instanceof i3) {
            org.telegram.messenger.i0.A3(view, z11 ? 0 : cVar.a, 0, z12 ? 0 : cVar.c, cVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int v = v(false);
            int i12 = v > 0 ? cVar.d + v : 0;
            t3 t3Var = wVar.x;
            boolean z13 = t3Var == t3.c;
            int i13 = (z13 || z11) ? 0 : cVar2.a;
            int i14 = (z13 || z12) ? 0 : cVar2.c;
            int i15 = (!z13 || z11) ? cVar2.a : 0;
            int i16 = (!z13 || z12) ? cVar2.c : 0;
            if (t3Var == t3.a) {
                i12 = Math.max(i12, cVar2.d);
                r0.h0.b(view, r0.j1.b);
            } else {
                r0.h0.b(view, j1Var.a.m(i15, 0, i16, i12));
            }
            view.setPadding(i13, 0, i14, i12);
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
        for (int i10 = 0; i10 < size; i10++) {
            k2 k2Var = (k2) this.U0.get(i10);
            k2Var.onConfigurationChanged(configuration);
            Dialog dialog = k2Var.visibleDialog;
            if (dialog instanceof z2) {
                ((z2) dialog).c0(configuration);
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
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        l lVar;
        y yVar;
        if (i10 == 82 && !i() && !this.Q && (lVar = this.D) != null && !lVar.u() && (yVar = lVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (t0Var.s()) {
                            t0Var.U(null, null);
                            break;
                        }
                        if (t0Var.S) {
                            yVar.o(((Integer) t0Var.getTag()).intValue());
                            break;
                        }
                    }
                }
                i11++;
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11 = getHeight() > getWidth();
        if (this.f1 != z11) {
            this.f1 = z11;
            this.g1 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                i3 i3Var = this.E;
                if (childAt == i3Var) {
                    i3Var.setCurrentAccount(d20.s0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection());
                int i23 = i22 & zs.x1;
                int i24 = absoluteGravity & 7;
                if (i24 == 1) {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin + paddingLeft;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i20 = layoutParams.topMargin;
                        } else if (i23 != 80) {
                            i20 = layoutParams.topMargin;
                        } else {
                            i17 = paddingBottom - measuredHeight;
                            i18 = layoutParams.bottomMargin;
                        }
                        i19 = i20 + paddingTop;
                        if (childAt != this.E && this.g1 != 0 && (this.d1 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i19 = this.g1;
                        } else if (childAt == this.E) {
                            this.g1 = i19;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != this.E) {
                    }
                    if (childAt == this.E) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != this.E) {
                }
                if (childAt == this.E) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        k2 k2Var = !this.U0.isEmpty() ? (k2) sc.e.g(1, this.U0) : null;
        if (k2Var != null && !k2Var.isSupportEdgeToEdge() && h0()) {
            int B = B();
            k2Var.setKeyboardHeightFromParent(B);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + B, TLObject.FLAG_30));
            return;
        }
        v4 v4Var = this.P0;
        if (v4Var != null) {
            int[] iArr = this.e1;
            iArr[0] = i10;
            iArr[1] = i11;
            v4Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        this.d1 = B() > org.telegram.messenger.i0.L(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
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
                        if (this.W || this.h || !this.P || this.Q || max < org.telegram.messenger.i0.a1(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                            if (this.Q) {
                                if (!this.V) {
                                    Activity activity = this.Q0;
                                    if (activity.getCurrentFocus() != null) {
                                        org.telegram.messenger.i0.v1(activity.getCurrentFocus());
                                    }
                                    ((k2) sc.e.g(1, this.U0)).onBeginSlide();
                                    this.V = true;
                                }
                                if (C()) {
                                    float f7 = max;
                                    this.s.setTranslationX((f7 / getWidth()) * org.telegram.messenger.i0.L(56.0f) * 5);
                                    setInnerTranslationX((f7 / getWidth()) * org.telegram.messenger.i0.L(56.0f) * 5);
                                } else {
                                    float f10 = max;
                                    this.s.setTranslationX(f10);
                                    setInnerTranslationX(f10);
                                }
                            }
                        } else if (((k2) sc.e.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            Q();
                        } else {
                            this.P = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        this.U.addMovement(motionEvent);
                        this.U.computeCurrentVelocity(1000);
                        k2 k2Var = (k2) sc.e.g(1, this.U0);
                        if (!this.h && !this.a0 && !this.Q && k2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.U.getXVelocity();
                            float yVelocity = this.U.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && k2Var.canBeginSlide()) {
                                this.R = (int) motionEvent.getX();
                                Q();
                                if (!this.V) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        org.telegram.messenger.i0.v1(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.V = true;
                                }
                            }
                        }
                        if (this.Q) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.U.getXVelocity();
                            float yVelocity2 = this.U.getYVelocity();
                            if (!C() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.i0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z10 = true;
                                }
                            }
                            e(z10);
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
                } else if (((k2) sc.e.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
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

    public final void p(Canvas canvas, int i10, int i11) {
        if (v1 == null || !tz.D1) {
            return;
        }
        int i12 = i10 / 2;
        if (v1.getAlpha() != i12) {
            v1.setAlpha(i12);
        }
        v1.setBounds(0, i11, getMeasuredWidth(), v1.getIntrinsicHeight() + i11);
        v1.draw(canvas);
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, zs.e4, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        k2 k2Var = (k2) sc.e.g(2, this.U0);
        k2 k2Var2 = (k2) sc.e.g(1, this.U0);
        k2Var2.fragmentView.setOutlineProvider(null);
        k2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        k2Var2.fragmentView.setLayoutParams(layoutParams);
        V(k2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(k2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(k2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new gr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bg.f(10, this, k2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(k2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(k2Var2.drawEdgeNavigationBar());
        k2Var2.setInPreviewMode(false);
        k2Var2.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (t6.x0(null, t6.s8, false) != -1 && (!k2Var2.hasForceLightStatusBar() || t6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.i0.o3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        return !this.U0.isEmpty() && ((k2) sc.e.g(1, this.U0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setDelegate(v4 v4Var) {
        this.P0 = v4Var;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setDrawerLayoutContainer(s3 s3Var) {
        this.y = s3Var;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setFragmentStack(List<k2> list) {
        this.U0 = list;
        i3 i3Var = this.E;
        if (i3Var != null) {
            p pVar = new p(this, 0);
            p pVar2 = new p(this, 1);
            i3Var.I.remove(pVar);
            i3Var.J.remove(pVar2);
            org.telegram.messenger.i0.E2(this.E);
            this.E = null;
        }
        boolean z10 = this.R0;
        Activity activity = this.Q0;
        if (z10) {
            i3 i3Var2 = new i3(activity, this);
            this.E = i3Var2;
            this.F = new bh.d(i3Var2);
            i3 i3Var3 = this.E;
            p pVar3 = new p(this, 0);
            p pVar4 = new p(this, 1);
            i3Var3.I.add(pVar3);
            i3Var3.J.add(pVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            q3 q3Var = LaunchActivity.I1.y0;
            if (q3Var != null) {
                q3Var.setTabsView(this.E);
            }
        }
        w wVar = this.w;
        if (wVar != null) {
            org.telegram.messenger.i0.E2(wVar);
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
            org.telegram.messenger.i0.E2(wVar3);
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
            org.telegram.messenger.i0.E2(wVar5);
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
                org.telegram.messenger.i0.E2(view);
                this.x.addView(view, w7.b6.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setInBubbleMode(boolean z10) {
        this.f = z10;
    }

    public void setInnerTranslationX(float f7) {
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.U0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float l4 = C() ? Utilities.l(f7 / (org.telegram.messenger.i0.L(56.0f) * 6)) : f7 / this.s.getMeasuredWidth();
        k2 k2Var = (k2) sc.e.g(2, this.U0);
        k2Var.onSlideProgress(false, l4);
        k2 k2Var2 = (k2) sc.e.g(1, this.U0);
        float a2 = w7.u.a(l4 * 2.0f, 0.0f, 1.0f);
        if (!k2Var2.isBeginToShow() || (navigationBarColor = k2Var2.getNavigationBarColor()) == (navigationBarColor2 = k2Var.getNavigationBarColor())) {
            return;
        }
        k2Var2.setNavigationBarColor(i0.b.f(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setNavigationBarColor(int i10) {
        if (this.r1 != i10) {
            this.r1 = i10;
            invalidate();
        }
        s3 s3Var = this.y;
        if (s3Var != null) {
            s3Var.setInternalNavigationBarColor(i10);
        }
        i3 i3Var = this.E;
        if (i3Var != null) {
            i3Var.i(i10, (this.Q || this.T) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Z0 = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setPulledDialogs(List<x8> list) {
        this.V0 = list;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.I0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        this.s0 = f7;
        for (int i10 = 0; i10 < this.o0; i10++) {
            int f10 = i0.b.f(f7, this.m0[i10], this.n0[i10]);
            sn snVar = this.p0;
            if (snVar != null) {
                snVar.i(this.l0[i10], f10);
            } else {
                int i11 = this.l0[i10];
                SparseIntArray sparseIntArray = t6.jm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i11, f10);
                }
            }
        }
        ArrayList arrayList = this.h0;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i12);
            int[] iArr = (int[]) this.b0.get(i12);
            int[] iArr2 = (int[]) this.c0.get(i12);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                int red = Color.red(iArr2[i13]);
                int green = Color.green(iArr2[i13]);
                int blue = Color.blue(iArr2[i13]);
                int alpha = Color.alpha(iArr2[i13]);
                int red2 = Color.red(iArr[i13]);
                int green2 = Color.green(iArr[i13]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i13]);
                int i14 = size;
                int i15 = i12;
                int argb = Color.argb(Math.min(zs.e4, (int) (((alpha - r4) * f7) + Color.alpha(iArr[i13]))), Math.min(zs.e4, (int) (((red - red2) * f7) + red2)), Math.min(zs.e4, (int) (((green - green2) * f7) + green2)), Math.min(zs.e4, (int) (((blue - blue2) * f7) + blue2)));
                c7 c7Var = (c7) arrayList2.get(i13);
                int i16 = c7Var.e;
                p6 p6Var = c7Var.n;
                if (p6Var != null) {
                    p6Var.i(i16, argb);
                } else {
                    SparseIntArray sparseIntArray2 = t6.jm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i16, argb);
                    }
                }
                c7Var.e(argb, false, false);
                i13++;
                i12 = i15;
                arrayList = arrayList3;
                size = i14;
            }
            i12++;
        }
        ArrayList arrayList4 = this.j0;
        int size3 = arrayList4.size();
        for (int i17 = 0; i17 < size3; i17++) {
            b7 b7Var = (b7) arrayList4.get(i17);
            if (b7Var != null) {
                b7Var.b();
                b7Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                c7 c7Var2 = (c7) this.i0.get(i18);
                c7Var2.e(t6.w0(c7Var2.e, c7Var2.n), false, false);
            }
        }
        pn pnVar = this.g0;
        if (pnVar != null) {
            sn snVar2 = pnVar.a;
            snVar2.G.z0.invalidate();
            snVar2.t.K = f7;
            snVar2.u.K = f7;
            snVar2.u(f7);
        }
        v4 v4Var = this.P0;
        if (v4Var != null) {
            v4Var.a(f7);
        }
        z6 z6Var = a7.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f7 >= 1.0f || currentAnimationTimeMillis != a7.c || f7 != a7.d) {
            a7.c = currentAnimationTimeMillis;
            a7.d = f7;
            a7.c0(this, f7 >= 1.0f);
        } else if (getWindowToken() == null) {
            a7.d0(this, false);
        }
        D();
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setUseAlphaAnimations(boolean z10) {
        this.G0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setWindow(Window window) {
        this.c = window;
    }

    public final k2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            k2 k2Var = (k2) getFragmentStack().get(size);
            if (k2Var != null && !k2Var.isFinishing() && !k2Var.isRemovingFromStack() && hf0.class.isInstance(k2Var)) {
                return k2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        i3 i3Var;
        if (!this.R0 || (i3Var = this.E) == null) {
            return 0;
        }
        return z10 ? (int) i3Var.G : i3Var.H;
    }

    public final my w() {
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
                org.telegram.messenger.i0.E2(view);
                this.x.addView(view, w7.b6.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.x.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean x() {
        return this.h || this.a0;
    }

    public final boolean z() {
        return this.S0;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public void setHighlightActionButtons(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.z4
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.z4
    public ViewGroup getView() {
        return this;
    }
}
