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
import c8.ja;
import fi.i9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ce0;
import org.telegram.ui.je0;
import org.telegram.ui.kx;
import org.telegram.ui.q60;
import org.telegram.ui.vm;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements o4, pg.b {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public k E;
    public int E0;
    public c3 F;
    public Runnable F0;
    public r7 G;
    public Runnable G0;
    public r H;
    public boolean H0;
    public e2 I;
    public View I0;
    public e2 J;
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
    public q60 P0;
    public boolean Q;
    public l4 Q0;
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
    public final hi.e5 e0;
    public boolean e1;
    public boolean f;
    public r4 f0;
    public final int[] f1;
    public r4 g0;
    public boolean g1;
    public boolean h;
    public vm h0;
    public int h1;
    public final ArrayList i0;
    public final org.telegram.ui.Components.u5 i1;
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
    public ym q0;
    public final o q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public w s;
    public final h2.f s0;
    public int s1;
    public float t0;
    public r0.k1 t1;
    public boolean u0;
    public i0.c u1;
    public i6 v0;
    public i0.c v1;
    public w w;
    public boolean w0;
    public w x;
    public boolean x0;
    public l3 y;
    public int y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        hi.e5 e5Var = new hi.e5();
        e5Var.b = new SparseIntArray();
        e5Var.c = new int[]{j6.rb, j6.ub, j6.vb, j6.wb, j6.Rc, j6.tb};
        this.e0 = e5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new h2.f((int[]) null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new org.telegram.ui.Components.u5(this, 280L, er.h);
        this.p1 = new ArrayList();
        this.q1 = new o(this, 2);
        i0.c cVar = i0.c.e;
        this.u1 = cVar;
        this.v1 = cVar;
        this.R0 = (Activity) context;
        this.S0 = z10;
        if (x1 == null) {
            x1 = getResources().getDrawable(R.drawable.layer_shadow);
            w1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            y1 = new Paint();
        }
        ki.e eVar = new ki.e(this, 29);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, eVar);
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
                ((e2) r.b.h(1, actionBarLayout.V0)).prepareFragmentToSlide(true, false);
                e2 e2Var = (e2) r.b.h(2, actionBarLayout.V0);
                e2Var.prepareFragmentToSlide(false, false);
                e2Var.onPause();
                View view = e2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    e2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(e2Var.fragmentView);
                }
                k kVar = e2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(e2Var.actionBar);
                }
                e2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.V0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            e2 e2Var2 = (e2) r.b.h(1, actionBarLayout.V0);
            e2Var2.prepareFragmentToSlide(true, false);
            e2Var2.onPause();
            e2Var2.onFragmentDestroy();
            e2Var2.setParentLayout(null);
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
                e2 e2Var3 = (e2) r.b.h(1, actionBarLayout.V0);
                actionBarLayout.E = e2Var3.actionBar;
                e2Var3.onResume();
                e2Var3.onBecomeFullyVisible();
                e2Var3.prepareFragmentToSlide(false, false);
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
        if (i7 != j6.g5 && i7 != j6.Rc && i7 != j6.Ie) {
            if (i7 != j6.ub && i7 != j6.vb && i7 != j6.wb && i7 != j6.Ee && i7 != j6.Fe && i7 != j6.Ge && i7 != j6.He) {
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
            if (((e2) this.V0.get(i7)).getFragmentView() != null) {
                try {
                    ((e2) this.V0.get(i7)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pg.b
    public final List F() {
        e2 lastFragment = getLastFragment();
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
        w4 w4Var;
        k kVar;
        if (this.b0 || this.R || i() || this.V0.isEmpty()) {
            return;
        }
        s10 s10Var = s10.f0;
        if (s10Var != null && s10Var.y) {
            s10Var.f(false);
            return;
        }
        if (!i0() && (kVar = this.E) != null && !kVar.x()) {
            k kVar2 = this.E;
            if (kVar2.o0) {
                kVar2.n(true);
                return;
            }
        }
        e2 e2Var = (e2) r.b.h(1, this.V0);
        if (!i0() && (w4Var = e2Var.simpleActionBar) != null) {
            g5 g5Var = w4Var.R;
            if (g5Var != null) {
                g5Var.a(true);
                return;
            } else if (!w4Var.H && w4Var.G) {
                w4Var.m(true);
                return;
            }
        }
        r rVar = this.H;
        if ((rVar == null || rVar.onBackPressed(true)) && ((e2) r.b.h(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
            l(true, false);
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
        w4 w4Var;
        if (this.U) {
            AnimatorSet animatorSet = this.o1;
            if (animatorSet != null) {
                animatorSet.end();
                this.o1 = null;
            }
            return false;
        }
        if (!this.k1 && !this.j1 && !this.b0 && !this.R && !i() && this.V0.size() > 1 && !y() && ((rVar = this.H) == null || !rVar.hasShownSheet())) {
            e2 e2Var = (e2) r.b.h(1, this.V0);
            if (e2Var.onBackPressed(false) && (((w4Var = e2Var.simpleActionBar) == null || (w4Var.R == null && (w4Var.H || !w4Var.G))) && !e2Var.hasShownSheet() && e2Var.canBeginSlide())) {
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
                e2Var.onBeginSlide();
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
            ((org.telegram.ui.Components.t5) arrayList.get(i7)).z0 = 0;
        }
        g(str);
    }

    public final void M() {
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).onLowMemory();
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
            ((e2) r.b.h(1, this.V0)).onPause();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void P() {
        if (!this.V0.isEmpty()) {
            ((e2) r.b.h(1, this.V0)).onResume();
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
        e2 e2Var = (e2) r.b.h(2, this.V0);
        View view = e2Var.fragmentView;
        if (view == null && (view = e2Var.performCreateView(this.R0)) != null && e2Var.isSupportEdgeToEdge() && e2Var.drawEdgeNavigationBar()) {
            n nVar = new n(e2Var);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view, nVar);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            e2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(e2Var.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(e2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = e2Var.actionBar;
        if (kVar != null && kVar.L) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.J0) {
                e2Var.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(e2Var.actionBar);
        }
        e2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        e2Var.attachSheets(this.w);
        if (!e2Var.hasOwnBackground && view.getBackground() == null) {
            q6.h(j6.d6, view, null);
        }
        e2Var.onResume();
        if (this.r0 != null) {
            this.j0 = e2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((e2) r.b.h(1, this.V0)).prepareFragmentToSlide(true, true);
        e2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(e2 e2Var) {
        return U(new m4(e2Var));
    }

    public final boolean T(e2 e2Var, boolean z10) {
        m4 m4Var = new m4(e2Var);
        m4Var.b = z10;
        return U(m4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(m4 m4Var) {
        l4 l4Var;
        ArrayList arrayList;
        m3 m3Var;
        e2 e2Var;
        int i7;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        e2 e2Var2 = m4Var.a;
        boolean z10 = m4Var.b;
        boolean z11 = m4Var.c;
        boolean z12 = m4Var.d;
        boolean z13 = m4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m4Var.f;
        int i11 = 0;
        if (e2Var2 == null || i() || !(((l4Var = this.Q0) == null || !z12 || l4Var.l(this, m4Var)) && e2Var2.onFragmentCreate())) {
            return false;
        }
        m3 edgeToEdgeSupportMode = e2Var2.getEdgeToEdgeSupportMode();
        m3 m3Var2 = m3.a;
        boolean z14 = edgeToEdgeSupportMode != m3Var2;
        boolean drawEdgeNavigationBar = e2Var2.drawEdgeNavigationBar();
        e2 lastFragment = getLastFragment();
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof ki) || (visibleDialog instanceof ki.x2))) {
            c2 c2Var = new c2();
            c2Var.a = true;
            lastFragment.showAsSheet(e2Var2, c2Var);
            return true;
        }
        if (org.telegram.messenger.r2.a) {
            a8.b("present fragment " + e2Var2.getClass().getSimpleName() + " args=" + e2Var2.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = i9.y1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((i9) arrayList.get(i12)).u(false);
            i12++;
        }
        arrayList.clear();
        c3 c3Var = this.F;
        if (c3Var != null && !c3Var.c) {
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
        e2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.K;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.K.getParent()).removeView(this.K);
            }
            this.K = null;
        }
        this.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
        e2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.R0;
        if (activity.getCurrentFocus() != null && e2Var2.hideKeyboardOnShow() && !z13) {
            org.telegram.messenger.g0.v1(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && np.e1().getBoolean("view_animations", true));
        if (this.V0.isEmpty()) {
            m3Var = m3Var2;
            e2Var = null;
        } else {
            m3Var = m3Var2;
            e2Var = (e2) r.b.h(1, this.V0);
        }
        e2Var2.setParentLayout(this);
        View view = e2Var2.fragmentView;
        if (view == null) {
            view = e2Var2.performCreateView(activity);
            if (view != null && e2Var2.isSupportEdgeToEdge() && e2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(e2Var2);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, nVar);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                e2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        w wVar = this.w;
        if (z13) {
            edgeToEdgeSupportMode = m3Var;
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
            int previewHeight = e2Var2.getPreviewHeight();
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
        k kVar = e2Var2.actionBar;
        if (kVar != null && kVar.L) {
            if (this.J0) {
                kVar.setOccupyStatusBar(false);
            }
            org.telegram.messenger.g0.E2(e2Var2.actionBar);
            this.w.addView(e2Var2.actionBar);
        }
        e2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        e2Var2.attachSheets(this.w);
        this.V0.add(e2Var2);
        L("presentFragment");
        e2Var2.onResume();
        this.E = e2Var2.actionBar;
        if (!e2Var2.hasOwnBackground && view.getBackground() == null) {
            q6.h(j6.d6, view, null);
        }
        w wVar2 = this.s;
        w wVar3 = this.w;
        this.s = wVar3;
        this.w = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(e2Var2 instanceof an)) {
                float L4 = org.telegram.messenger.g0.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bg.p0 p0Var = bg.t0.a;
                view.setOutlineProvider(new bg.r0(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float L5 = org.telegram.messenger.g0.L(29.0f);
                bg.p0 p0Var2 = bg.t0.a;
                view.setOutlineProvider(new bg.r0(0, L5));
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
            j6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.x;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            W(e2Var, z10);
            View view2 = this.I0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.r0 != null) {
            this.j0 = e2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.I0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.I0.setVisibility(0);
            }
            if (e2Var != null) {
                e2Var.onTransitionAnimationStart(false, false);
                e2Var.onTransitionAnimationEnd(false, false);
            }
            e2Var2.onTransitionAnimationStart(true, false);
            e2Var2.onTransitionAnimationEnd(true, false);
            e2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.H0 && this.V0.size() == 1) {
            W(e2Var, z10);
            this.C0 = System.currentTimeMillis();
            this.a0 = true;
            this.G0 = new oi.u4(20, e2Var, e2Var2);
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
            View view4 = this.I0;
            if (view4 != null) {
                view4.setVisibility(0);
                float[] fArr4 = new float[i16];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                arrayList4.add(ObjectAnimator.ofFloat(this.I0, (Property<View, Float>) property, fArr4));
            }
            if (e2Var != null) {
                e2Var.onTransitionAnimationStart(false, false);
            }
            e2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.L = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.L.setInterpolator(er.h);
            this.L.setDuration(200L);
            this.L.addListener(new q(this, 1));
            this.L.start();
            return true;
        }
        this.b0 = z13;
        this.C0 = System.currentTimeMillis();
        this.a0 = true;
        p pVar = new p(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, e2Var, e2Var2);
        e2 e2Var3 = e2Var;
        this.G0 = pVar;
        boolean needDelayOpenAnimation = e2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (e2Var3 != null) {
                e2Var3.onTransitionAnimationStart(false, false);
            }
            e2Var2.onTransitionAnimationStart(true, false);
        }
        this.Y0 = false;
        this.J = e2Var3;
        this.I = e2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? e2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.w.b) && e2Var3 != null)) {
                e2Var3.saveKeyboardPositionBeforeTransition();
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
            if (!e2Var2.needDelayOpenAnimation()) {
                h0(true, true, z13);
                return true;
            }
            v vVar = new v(this, e2Var2, z13, i11);
            this.e = vVar;
            org.telegram.messenger.g0.i3(vVar, 200L);
            return true;
        }
        if (e2Var3 != null && !z13) {
            e2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, e2Var3, e2Var2, z13);
        if (e2Var2.needDelayOpenAnimation()) {
            this.e = new m6.h(this, e2Var3, e2Var2, z13);
        }
        org.telegram.messenger.g0.i3(this.d, 250L);
        return true;
    }

    public final boolean V(e2 e2Var, boolean z10, boolean z11) {
        m4 m4Var = new m4(e2Var);
        m4Var.b = z10;
        m4Var.c = z11;
        m4Var.d = true;
        m4Var.e = false;
        return U(m4Var);
    }

    public final void W(e2 e2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (e2Var == null) {
            return;
        }
        e2Var.onBecomeFullyHidden();
        e2Var.onPause();
        if (z10) {
            e2Var.onFragmentDestroy();
            e2Var.setParentLayout(null);
            this.V0.remove(e2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = e2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                e2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(e2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(e2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = e2Var.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(e2Var.actionBar);
            }
            e2Var.detachSheets();
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
            ((e2) this.V0.get(i7)).clearViews();
            ((e2) this.V0.get(i7)).setParentLayout(this);
        }
        l4 l4Var = this.Q0;
        if (l4Var != null) {
            l4Var.b(this, z10);
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
            e0((e2) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.k1 k1Var = this.t1;
        if (k1Var != null) {
            o(view, k1Var);
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
            iArr[i7] = ((s6) arrayList.get(i7)).c();
        }
    }

    public final void b0(int i7) {
        if (i7 < 0 || i7 >= getFragmentStack().size()) {
            return;
        }
        d0((e2) getFragmentStack().get(i7), false);
    }

    public final boolean c(int i7, e2 e2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        l4 l4Var = this.Q0;
        if ((l4Var != null && !l4Var.h(e2Var, this)) || !e2Var.onFragmentCreate() || this.V0.contains(e2Var)) {
            return false;
        }
        e2Var.setParentLayout(this);
        Activity activity = this.R0;
        if (i7 == -1 || i7 == -2) {
            if (!this.V0.isEmpty()) {
                e2 e2Var2 = (e2) r.b.h(1, this.V0);
                e2Var2.onPause();
                k kVar = e2Var2.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(e2Var2.actionBar);
                }
                View view = e2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    e2Var2.onRemoveFromParent();
                    viewGroup.removeView(e2Var2.fragmentView);
                }
                e2Var2.detachSheets();
            }
            this.V0.add(e2Var);
            if (i7 != -2) {
                View view2 = e2Var.fragmentView;
                if (view2 == null) {
                    view2 = e2Var.performCreateView(activity);
                    if (view2 != null && e2Var.isSupportEdgeToEdge() && e2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(e2Var);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.i(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        e2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!e2Var.hasOwnBackground && view2.getBackground() == null) {
                    q6.h(j6.d6, view2, null);
                }
                this.s.addView(view2, ja.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(e2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(e2Var.drawEdgeNavigationBar());
                k kVar2 = e2Var.actionBar;
                if (kVar2 != null && kVar2.L) {
                    if (this.J0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) e2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(e2Var.actionBar);
                    }
                    this.s.addView(e2Var.actionBar);
                }
                e2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                e2Var.attachSheets(this.s);
                e2Var.onResume();
                e2Var.onTransitionAnimationEnd(false, true);
                e2Var.onTransitionAnimationEnd(true, true);
                e2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i7);
        } else {
            if (i7 == -3) {
                View view3 = e2Var.fragmentView;
                if (view3 == null) {
                    view3 = e2Var.performCreateView(activity);
                    if (view3 != null && e2Var.isSupportEdgeToEdge() && e2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(e2Var);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.i(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        e2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!e2Var.hasOwnBackground && view3.getBackground() == null) {
                    q6.h(j6.d6, view3, null);
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.j(0, wVar.getChildCount(), 0), ja.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(e2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(e2Var.drawEdgeNavigationBar());
                k kVar3 = e2Var.actionBar;
                if (kVar3 != null && kVar3.L) {
                    if (this.J0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) e2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(e2Var.actionBar);
                    }
                    this.s.addView(e2Var.actionBar);
                }
                e2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                e2Var.attachSheets(this.s);
                i7 = 0;
            }
            this.V0.add(i7, e2Var);
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

    public final void c0(e2 e2Var) {
        d0(e2Var, false);
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
            s6 s6Var = (s6) arrayList.get(i7);
            iArr[i7] = s6Var.c();
            r6 r6Var = s6Var.g;
            s6Var.g = null;
            if (r6Var != null) {
                ArrayList arrayList2 = this.k0;
                if (!arrayList2.contains(r6Var)) {
                    arrayList2.add(r6Var);
                }
            }
        }
    }

    public final void d0(e2 e2Var, boolean z10) {
        if ((this.V0.size() > 0 && r.b.h(1, this.V0) == e2Var) || (this.V0.size() > 1 && r.b.h(2, this.V0) == e2Var)) {
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
        e0(e2Var, e2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
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
        l4 l4Var = this.Q0;
        return (l4Var != null && l4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
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
        a2 a2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - w(true)) - this.u1.d));
        r rVar = this.H;
        a2 a2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            a2Var = this.H.getLastSheet();
            if (a2Var.y()) {
            }
        }
        a2Var = null;
        if (a2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            a2Var = getLastFragment().getLastSheet();
            if (a2Var.y()) {
            }
            if (a2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.r1 = z10;
                }
                if (!this.r1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.r1 = false;
                    }
                    return a2Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.r1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        a2Var2 = a2Var;
        if (a2Var2 != null) {
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
                    j6.s0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    j6.s0.draw(canvas2);
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
                int b10 = c8.i9.b((i13 * ns.e4) / org.telegram.messenger.g0.L(20.0f), 0, ns.e4);
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
                y1.setColor(Color.argb((int) (c8.i9.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
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
        e2 e2Var = !this.V0.isEmpty() ? (e2) r.b.h(1, this.V0) : null;
        if (e2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = e2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? ns.r5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(er.h);
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
                    animatorSet.setInterpolator(er.h);
                }
            }
        }
        Animator customSlideTransition2 = e2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        e2 e2Var2 = (e2) r.b.h(2, this.V0);
        if (e2Var2 != null && (customSlideTransition = e2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void e0(e2 e2Var, boolean z10) {
        if (this.V0.contains(e2Var)) {
            if (z10 && r.b.h(1, this.V0) == e2Var) {
                e2Var.finishFragment();
                return;
            }
            if (r.b.h(1, this.V0) == e2Var && this.V0.size() > 1) {
                e2Var.finishFragment(false);
                return;
            }
            e2Var.onPause();
            e2Var.onFragmentDestroy();
            e2Var.setParentLayout(null);
            this.V0.remove(e2Var);
            L("removeFragmentFromStackInternal " + z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r0 = org.telegram.messenger.np.e1().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(n4 n4Var, Runnable runnable) {
        i6 i6Var;
        i6 i6Var2;
        if (this.a0 || this.R) {
            this.u0 = true;
            this.v0 = n4Var.a;
            this.x0 = n4Var.c;
            this.y0 = n4Var.b;
            this.w0 = n4Var.g;
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
        int size = n4Var.e ? 1 : this.V0.size();
        ci.p0 p0Var = new ci.p0(this, size, n4Var, runnable, 11);
        if (size < 1 || !n4Var.f || !n4Var.g) {
            p0Var.run();
            return;
        }
        if (n4Var.m == null) {
            g0(null);
        }
        int i7 = n4Var.b;
        if (i7 != -1 && (i6Var2 = n4Var.a) != null) {
            i6Var2.u(i7);
            j6.z1(n4Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            j6.u(n4Var.a, true, n4Var.c);
            p0Var.run();
            return;
        }
        i6 i6Var3 = n4Var.a;
        boolean z10 = n4Var.c;
        kg.j1 j1Var = new kg.j1(p0Var, 28);
        int i10 = j6.a;
        if (i6Var3 == null) {
            j1Var.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e10) {
            e = e10;
            i6Var = i6Var3;
        }
        if (i6Var3.b == null && i6Var3.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = np.e1().edit();
                edit.remove("theme");
                edit.apply();
            }
            j6.km.clear();
            j6.g0 = 0;
            j6.h0 = null;
            j6.e0 = null;
            j6.f0 = null;
            if (!z10 && j6.M == null) {
                j6.K = i6Var3;
                if (j6.I == j6.J) {
                    j6.T = 2000;
                    j6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new org.telegram.messenger.c6(17), 2100L);
                }
            }
            j6.I = i6Var3;
            j6.t1(false, false);
            i6Var = i6Var3;
            if (j6.M == null && !j6.Q) {
                np.s1(i6Var.F).x4(i6Var, i6Var.k(false), z10, false);
            }
            j1Var.run();
        }
        String[] strArr = new String[1];
        aa.c0 c0Var = new aa.c0(strArr, i6Var3, z10, j1Var, 25);
        i6Var = i6Var3;
        try {
            int i11 = j6.wm + 1;
            j6.wm = i11;
            bi.w2 w2Var = new bi.w2(i11, j1Var, c0Var);
            String str = i6Var.d;
            if (str != null) {
                Utilities.i.c(new m5(w2Var, obj, str, obj, 0));
            } else {
                Utilities.i.c(new m5(w2Var, new File(i6Var.b), obj, strArr, 0));
            }
        } catch (Exception e11) {
            e = e11;
            a8.g(e, true);
            if (j6.M == null) {
                np.s1(i6Var.F).x4(i6Var, i6Var.k(false), z10, false);
            }
            j1Var.run();
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
        if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((e2) this.V0.get(size)).fragmentView == null) {
            for (int i7 = 0; i7 < size; i7++) {
                e2 e2Var = (e2) this.V0.get(i7);
                k kVar = e2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(e2Var.actionBar);
                }
                View view = e2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    e2Var.onPause();
                    e2Var.onRemoveFromParent();
                    viewGroup.removeView(e2Var.fragmentView);
                }
            }
            e2 e2Var2 = (e2) this.V0.get(size);
            e2Var2.setParentLayout(this);
            View view2 = e2Var2.fragmentView;
            if (view2 == null) {
                view2 = e2Var2.performCreateView(this.R0);
                if (view2 != null && e2Var2.isSupportEdgeToEdge() && e2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(e2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    e2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, ja.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(e2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(e2Var2.drawEdgeNavigationBar());
            k kVar2 = e2Var2.actionBar;
            if (kVar2 != null && kVar2.L) {
                if (this.J0) {
                    kVar2.setOccupyStatusBar(false);
                }
                org.telegram.messenger.g0.E2(e2Var2.actionBar);
                this.s.addView(e2Var2.actionBar);
            }
            e2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
            e2Var2.attachSheets(this.s);
            e2Var2.onResume();
            e2Var2.onBecomeFullyVisible();
            this.E = e2Var2.actionBar;
            if (e2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            q6.h(j6.d6, view2, null);
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.r2.a;
        ArrayList arrayList = this.p1;
        StringBuilder m10 = r.b.m(str, " ");
        m10.append(this.V0.size());
        arrayList.add(0, m10.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < 10; i7++) {
                arrayList2.add((String) this.p1.get(i7));
            }
            this.p1 = arrayList2;
        }
        o oVar = this.q1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 500L);
    }

    public final void g0(ym ymVar) {
        try {
            int i7 = j6.f5;
            this.l0 = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                this.l0[i10] = ymVar != null ? ymVar.h(i10) : j6.x0(null, i10, false);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.l0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o4
    public e2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (e2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.o4
    public /* bridge */ /* synthetic */ u2 getBottomSheet() {
        return null;
    }

    public c3 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        e2 e2Var = this.J;
        return ((e2Var == null || !e2Var.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public l3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public List<e2> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public e2 getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (e2) r.b.h(1, this.V0);
    }

    public e2 getLastFragmentIncludeMainTabs() {
        e2 lastFragment = getLastFragment();
        return lastFragment instanceof je0 ? ((je0) lastFragment).c0() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public r4 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public r4 getMessageDrawableOutStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.o4
    public List<z8> getPulledDialogs() {
        return this.W0;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public e2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            e2 e2Var = (e2) getFragmentStack().get(size);
            if (e2Var != null && e2Var.getContext() != null && !e2Var.isFinishing() && !e2Var.isRemovingFromStack()) {
                return e2Var;
            }
        }
        return null;
    }

    public kx getSheetFragment() {
        return x();
    }

    @Override // org.telegram.ui.ActionBar.o4
    public float getThemeAnimationValue() {
        return this.t0;
    }

    @Override // org.telegram.ui.ActionBar.o4
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
            n4 n4Var = new n4(this.v0, this.y0, this.x0, true);
            boolean z10 = this.w0;
            if (!z10) {
                n4Var.g = z10;
                n4Var.f = z10;
            }
            f(n4Var, null);
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
        org.telegram.messenger.g0.h3(sVar);
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
        e2 e2Var = !this.V0.isEmpty() ? (e2) r.b.h(1, this.V0) : null;
        return (e2Var == null || e2Var.getLastStoryViewer() == null || !e2Var.getLastStoryViewer().y()) ? false : true;
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
        e2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            l4 l4Var = this.Q0;
            if ((l4Var != null && !l4Var.k(this)) || i() || this.V0.isEmpty()) {
                return;
            }
            Activity activity = this.R0;
            if (activity.getCurrentFocus() != null) {
                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z12 = !z11 && (this.h || this.b0 || (z10 && np.e1().getBoolean("view_animations", true)));
            e2 e2Var = (e2) r.b.h(1, this.V0);
            AnimatorSet animatorSet = null;
            e2 e2Var2 = this.V0.size() > 1 ? (e2) r.b.h(2, this.V0) : null;
            int i7 = 19;
            if (e2Var2 != null) {
                org.telegram.messenger.g0.p3(activity, j6.x0(null, j6.s8, false) == -1 || (e2Var2.hasForceLightStatusBar() && !j6.D0().q()));
                w wVar = this.s;
                this.s = this.w;
                this.w = wVar;
                e2Var2.setParentLayout(this);
                View view = e2Var2.fragmentView;
                if (view == null && (view = e2Var2.performCreateView(activity)) != null && e2Var2.isSupportEdgeToEdge() && e2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(e2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        e2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(e2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(e2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = e2Var2.actionBar;
                    if (kVar != null && kVar.L) {
                        if (this.J0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(e2Var2.actionBar);
                        this.s.addView(e2Var2.actionBar);
                    }
                    e2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    e2Var2.attachSheets(this.s);
                }
                this.I = e2Var2;
                this.J = e2Var;
                e2Var2.onTransitionAnimationStart(true, true);
                e2Var.onTransitionAnimationStart(false, true);
                e2Var2.onResume();
                if (this.r0 != null) {
                    this.j0 = e2Var2.getThemeDescriptions();
                }
                this.E = e2Var2.actionBar;
                if (!e2Var2.hasOwnBackground && view.getBackground() == null) {
                    q6.h(j6.d6, view, null);
                }
                if (z12) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    e2Var.setRemovingFromStack(true);
                    this.F0 = new ki.n(this, e2Var, e2Var2, i7);
                    if (!this.h && !this.b0) {
                        animatorSet = e2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.w.b)) {
                            h0(false, true, z13 || this.b0);
                        } else {
                            j6.o oVar = new j6.o(this, 17);
                            this.d = oVar;
                            org.telegram.messenger.g0.i3(oVar, 200L);
                        }
                    } else {
                        this.L = animatorSet;
                        xb xbVar = xb.w;
                        if (xbVar != null && xbVar.l) {
                            xbVar.b();
                        }
                    }
                    L("closeLastFragment");
                } else {
                    m(e2Var);
                    e2Var.onTransitionAnimationEnd(false, true);
                    e2Var2.onTransitionAnimationEnd(true, true);
                    e2Var2.onBecomeFullyVisible();
                }
            } else if (!this.H0 || z11) {
                e0(e2Var, false);
                setVisibility(8);
                View view2 = this.I0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.C0 = System.currentTimeMillis();
                this.a0 = true;
                this.F0 = new oi.u4(i7, this, e2Var);
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
            e2Var.onFragmentClosed();
        }
    }

    public final void m(e2 e2Var) {
        e2Var.finishing = true;
        e2Var.onPause();
        e2Var.onFragmentDestroy();
        e2Var.setParentLayout(null);
        this.V0.remove(e2Var);
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
        ((e2) r.b.h(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z10 = this.T0;
        if (z10) {
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
            z0Var.c(8, i0.c.b(0, 0, 0, max));
            r0.i0.b(view, z0Var.b());
            return;
        }
        boolean z11 = this.U0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.c cVar = this.u1;
        i0.c cVar2 = this.v1;
        if (view instanceof c3) {
            org.telegram.messenger.g0.A3(view, z11 ? 0 : cVar.a, 0, z12 ? 0 : cVar.c, cVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int w10 = w(false);
            int i11 = w10 > 0 ? cVar.d + w10 : 0;
            m3 m3Var = wVar.x;
            boolean z13 = m3Var == m3.c;
            int i12 = (z13 || z11) ? 0 : cVar2.a;
            int i13 = (z13 || z12) ? 0 : cVar2.c;
            int i14 = (!z13 || z11) ? cVar2.a : 0;
            int i15 = (!z13 || z12) ? cVar2.c : 0;
            if (m3Var == m3.a) {
                i11 = Math.max(i11, cVar2.d);
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
        if (this.V0.isEmpty()) {
            return;
        }
        int size = this.V0.size();
        for (int i7 = 0; i7 < size; i7++) {
            e2 e2Var = (e2) this.V0.get(i7);
            e2Var.onConfigurationChanged(configuration);
            Dialog dialog = e2Var.visibleDialog;
            if (dialog instanceof u2) {
                ((u2) dialog).c0(configuration);
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
                c3 c3Var = this.F;
                if (childAt == c3Var) {
                    c3Var.setCurrentAccount(m10.t0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & ns.x1;
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
        e2 e2Var = !this.V0.isEmpty() ? (e2) r.b.h(1, this.V0) : null;
        if (e2Var != null && !e2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            e2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, TLObject.FLAG_30));
            return;
        }
        l4 l4Var = this.Q0;
        if (l4Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i7;
            iArr[1] = i10;
            l4Var.e(iArr);
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
                                    ((e2) r.b.h(1, this.V0)).onBeginSlide();
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
                        } else if (((e2) r.b.h(1, this.V0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                        e2 e2Var = (e2) r.b.h(1, this.V0);
                        if (!this.h && !this.b0 && !this.R && e2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.V.getXVelocity();
                            float yVelocity = this.V.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && e2Var.canBeginSlide()) {
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
                } else if (((e2) r.b.h(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
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
        if (w1 == null || !gz.D1) {
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
        p(canvas, ns.e4, i7);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        e2 e2Var = (e2) r.b.h(2, this.V0);
        e2 e2Var2 = (e2) r.b.h(1, this.V0);
        e2Var2.fragmentView.setOutlineProvider(null);
        e2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        e2Var2.fragmentView.setLayoutParams(layoutParams);
        W(e2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(e2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(e2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new er(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ah.l(15, this, e2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(e2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(e2Var2.drawEdgeNavigationBar());
        e2Var2.setInPreviewMode(false);
        e2Var2.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (j6.x0(null, j6.s8, false) != -1 && (!e2Var2.hasForceLightStatusBar() || j6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        return !this.V0.isEmpty() && ((e2) r.b.h(1, this.V0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setDelegate(l4 l4Var) {
        this.Q0 = l4Var;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setDrawerLayoutContainer(l3 l3Var) {
        this.y = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setFragmentPanTranslationOffset(int i7) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setFragmentStack(List<e2> list) {
        this.V0 = list;
        c3 c3Var = this.F;
        if (c3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            c3Var.J.remove(oVar);
            c3Var.K.remove(oVar2);
            org.telegram.messenger.g0.E2(this.F);
            this.F = null;
        }
        boolean z10 = this.S0;
        Activity activity = this.R0;
        if (z10) {
            c3 c3Var2 = new c3(activity, this);
            this.F = c3Var2;
            this.G = new r7(c3Var2);
            c3 c3Var3 = this.F;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            c3Var3.J.add(oVar3);
            c3Var3.K.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            j3 j3Var = LaunchActivity.H1.x0;
            if (j3Var != null) {
                j3Var.setTabsView(this.F);
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
                this.x.addView(view, ja.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.o4
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
        e2 e2Var = (e2) r.b.h(2, this.V0);
        e2Var.onSlideProgress(false, l10);
        e2 e2Var2 = (e2) r.b.h(1, this.V0);
        float a10 = c8.i9.a(l10 * 2.0f, 0.0f, 1.0f);
        if (!e2Var2.isBeginToShow() || (navigationBarColor = e2Var2.getNavigationBarColor()) == (navigationBarColor2 = e2Var.getNavigationBarColor())) {
            return;
        }
        e2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setNavigationBarColor(int i7) {
        if (this.s1 != i7) {
            this.s1 = i7;
            invalidate();
        }
        l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.setInternalNavigationBarColor(i7);
        }
        c3 c3Var = this.F;
        if (c3Var != null) {
            c3Var.i(i7, (this.R || this.U) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i7) {
        this.a1 = i7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setPulledDialogs(List<z8> list) {
        this.W0 = list;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.J0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        this.t0 = f10;
        for (int i7 = 0; i7 < this.p0; i7++) {
            int f11 = i0.a.f(f10, this.n0[i7], this.o0[i7]);
            ym ymVar = this.q0;
            if (ymVar != null) {
                ymVar.i(this.m0[i7], f11);
            } else {
                int i10 = this.m0[i7];
                SparseIntArray sparseIntArray = j6.mm;
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
                int argb = Color.argb(Math.min(ns.e4, (int) (((alpha - r4) * f10) + Color.alpha(iArr[i12]))), Math.min(ns.e4, (int) (((red - red2) * f10) + red2)), Math.min(ns.e4, (int) (((green - green2) * f10) + green2)), Math.min(ns.e4, (int) (((blue - blue2) * f10) + blue2)));
                s6 s6Var = (s6) arrayList2.get(i12);
                int i15 = s6Var.e;
                e6 e6Var = s6Var.n;
                if (e6Var != null) {
                    e6Var.i(i15, argb);
                } else {
                    SparseIntArray sparseIntArray2 = j6.mm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i15, argb);
                    }
                }
                s6Var.e(argb, false, false);
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
            r6 r6Var = (r6) arrayList4.get(i16);
            if (r6Var != null) {
                r6Var.b();
                r6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                s6 s6Var2 = (s6) this.j0.get(i17);
                s6Var2.e(j6.w0(s6Var2.e, s6Var2.n), false, false);
            }
        }
        vm vmVar = this.h0;
        if (vmVar != null) {
            ym ymVar2 = vmVar.a;
            ymVar2.G.A0.invalidate();
            ymVar2.t.K = f10;
            ymVar2.u.K = f10;
            ymVar2.u(f10);
        }
        l4 l4Var = this.Q0;
        if (l4Var != null) {
            l4Var.a(f10);
        }
        p6 p6Var = q6.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 >= 1.0f || currentAnimationTimeMillis != q6.c || f10 != q6.d) {
            q6.c = currentAnimationTimeMillis;
            q6.d = f10;
            q6.b0(this, f10 >= 1.0f);
        } else if (getWindowToken() == null) {
            q6.c0(this, false);
        }
        E();
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setUseAlphaAnimations(boolean z10) {
        this.H0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public void setWindow(Window window) {
        this.c = window;
    }

    public final e2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            e2 e2Var = (e2) getFragmentStack().get(size);
            if (e2Var != null && !e2Var.isFinishing() && !e2Var.isRemovingFromStack() && ce0.class.isInstance(e2Var)) {
                return e2Var;
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
        c3 c3Var;
        if (!this.S0 || (c3Var = this.F) == null) {
            return 0;
        }
        return z10 ? (int) c3Var.H : c3Var.I;
    }

    public final kx x() {
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
                this.x.addView(view, ja.c(-1.0f, -1));
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

    @Override // org.telegram.ui.ActionBar.o4
    public void setHighlightActionButtons(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.o4
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public ViewGroup getView() {
        return this;
    }
}
