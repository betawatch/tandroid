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
import b8.be;
import b8.ke;
import b8.mf;
import ci.u8;
import ei.r9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hc;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ee0;
import org.telegram.ui.gx;
import org.telegram.ui.m60;
import org.telegram.ui.rm;
import org.telegram.ui.um;
import org.telegram.ui.wm;
import org.telegram.ui.xd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements q4, qg.b {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public k E;
    public int E0;
    public b3 F;
    public Runnable F0;
    public ke G;
    public Runnable G0;
    public r H;
    public boolean H0;
    public d2 I;
    public View I0;
    public d2 J;
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
    public m60 P0;
    public boolean Q;
    public n4 Q0;
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
    public final gi.e5 e0;
    public boolean e1;
    public boolean f;
    public t4 f0;
    public final int[] f1;
    public t4 g0;
    public boolean g1;
    public boolean h;
    public rm h0;
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
    public um q0;
    public final o q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public v s;
    public final g2.g s0;
    public int s1;
    public float t0;
    public r0.k1 t1;
    public boolean u0;
    public i0.b u1;
    public j6 v0;
    public i0.b v1;
    public v w;
    public boolean w0;
    public v x;
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
        gi.e5 e5Var = new gi.e5();
        e5Var.b = new SparseIntArray();
        e5Var.c = new int[]{k6.ob, k6.rb, k6.sb, k6.tb, k6.Oc, k6.qb};
        this.e0 = e5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new g2.g((int[]) null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new org.telegram.ui.Components.u5(this, 280L, xq.h);
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
        l5.b bVar2 = new l5.b(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(ArrayList arrayList, View view) {
        if (view instanceof qg.b) {
            arrayList.addAll(((qg.b) view).E());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                G(arrayList, viewGroup.getChildAt(i3));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z10) {
            if (actionBarLayout.V0.size() >= 2) {
                ((d2) t4.c.d(1, actionBarLayout.V0)).prepareFragmentToSlide(true, false);
                d2 d2Var = (d2) t4.c.d(2, actionBarLayout.V0);
                d2Var.prepareFragmentToSlide(false, false);
                d2Var.onPause();
                View view = d2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    d2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(d2Var.fragmentView);
                }
                k kVar = d2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(d2Var.actionBar);
                }
                d2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.V0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            d2 d2Var2 = (d2) t4.c.d(1, actionBarLayout.V0);
            d2Var2.prepareFragmentToSlide(true, false);
            d2Var2.onPause();
            d2Var2.onFragmentDestroy();
            d2Var2.setParentLayout(null);
            List list = actionBarLayout.V0;
            list.remove(list.size() - 1);
            actionBarLayout.L("onSlideAnimationEnd");
            v vVar = actionBarLayout.s;
            vVar.setAlpha(1.0f);
            v vVar2 = actionBarLayout.w;
            actionBarLayout.s = vVar2;
            actionBarLayout.w = vVar;
            actionBarLayout.bringChildToFront(vVar2);
            View view2 = actionBarLayout.x;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.V0.size() > 0) {
                d2 d2Var3 = (d2) t4.c.d(1, actionBarLayout.V0);
                actionBarLayout.E = d2Var3.actionBar;
                d2Var3.onResume();
                d2Var3.onBecomeFullyVisible();
                d2Var3.prepareFragmentToSlide(false, false);
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
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
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

    public static boolean z(int i3, int i10, int i11) {
        if (i3 != k6.g5 && i3 != k6.Oc && i3 != k6.Fe) {
            if (i3 != k6.rb && i3 != k6.sb && i3 != k6.tb && i3 != k6.Be && i3 != k6.Ce && i3 != k6.De && i3 != k6.Ee) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg.b
    public final List E() {
        d2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof qg.b) {
            arrayList.addAll(((qg.b) lastFragment).E());
        }
        G(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final void F() {
        for (int i3 = 0; i3 < this.V0.size(); i3++) {
            if (((d2) this.V0.get(i3)).getFragmentView() != null) {
                try {
                    ((d2) this.V0.get(i3)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
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
        y4 y4Var;
        k kVar;
        if (this.b0 || this.R || i() || this.V0.isEmpty()) {
            return;
        }
        l10 l10Var = l10.e0;
        if (l10Var != null && l10Var.x) {
            l10Var.e(false);
            return;
        }
        if (!i0() && (kVar = this.E) != null && !kVar.v()) {
            k kVar2 = this.E;
            if (kVar2.o0) {
                kVar2.l(true);
                return;
            }
        }
        d2 d2Var = (d2) t4.c.d(1, this.V0);
        if (!i0() && (y4Var = d2Var.simpleActionBar) != null) {
            i5 i5Var = y4Var.R;
            if (i5Var != null) {
                i5Var.a(true);
                return;
            } else if (!y4Var.H && y4Var.G) {
                y4Var.j(true);
                return;
            }
        }
        r rVar = this.H;
        if ((rVar == null || rVar.onBackPressed(true)) && ((d2) t4.c.d(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
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
        y4 y4Var;
        if (this.U) {
            AnimatorSet animatorSet = this.o1;
            if (animatorSet != null) {
                animatorSet.end();
                this.o1 = null;
            }
            return false;
        }
        if (!this.k1 && !this.j1 && !this.b0 && !this.R && !i() && this.V0.size() > 1 && !y() && ((rVar = this.H) == null || !rVar.hasShownSheet())) {
            d2 d2Var = (d2) t4.c.d(1, this.V0);
            if (d2Var.onBackPressed(false) && (((y4Var = d2Var.simpleActionBar) == null || (y4Var.R == null && (y4Var.H || !y4Var.G))) && !d2Var.hasShownSheet() && d2Var.canBeginSlide())) {
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
                d2Var.onBeginSlide();
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
        ArrayList arrayList = zb.D().f;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.t5) arrayList.get(i3)).z0 = 0;
        }
        g(str);
    }

    public final void M() {
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((d2) it.next()).onLowMemory();
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
            ((d2) t4.c.d(1, this.V0)).onPause();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void P() {
        if (!this.V0.isEmpty()) {
            ((d2) t4.c.d(1, this.V0)).onResume();
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
        d2 d2Var = (d2) t4.c.d(2, this.V0);
        View view = d2Var.fragmentView;
        if (view == null && (view = d2Var.performCreateView(this.R0)) != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
            n nVar = new n(d2Var);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view, nVar);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            d2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = d2Var.actionBar;
        if (kVar != null && kVar.L) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.J0) {
                d2Var.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(d2Var.actionBar);
        }
        d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        d2Var.attachSheets(this.w);
        if (!d2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        d2Var.onResume();
        if (this.r0 != null) {
            this.j0 = d2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((d2) t4.c.d(1, this.V0)).prepareFragmentToSlide(true, true);
        d2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(d2 d2Var) {
        return U(new o4(d2Var));
    }

    public final boolean T(d2 d2Var, boolean z10) {
        o4 o4Var = new o4(d2Var);
        o4Var.b = z10;
        return U(o4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(o4 o4Var) {
        n4 n4Var;
        ArrayList arrayList;
        m3 m3Var;
        d2 d2Var;
        int i3;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        d2 d2Var2 = o4Var.a;
        boolean z10 = o4Var.b;
        boolean z11 = o4Var.c;
        boolean z12 = o4Var.d;
        boolean z13 = o4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o4Var.f;
        if (d2Var2 == null || i() || !(((n4Var = this.Q0) == null || !z12 || n4Var.l(this, o4Var)) && d2Var2.onFragmentCreate())) {
            return false;
        }
        m3 edgeToEdgeSupportMode = d2Var2.getEdgeToEdgeSupportMode();
        m3 m3Var2 = m3.a;
        int i11 = 1;
        boolean z14 = edgeToEdgeSupportMode != m3Var2;
        boolean drawEdgeNavigationBar = d2Var2.drawEdgeNavigationBar();
        d2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.K1) != null) {
            ArrayList arrayList2 = launchActivity.F0;
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
                ArrayList arrayList3 = LaunchActivity.K1.F0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof bi) || (visibleDialog instanceof ii.a3))) {
            b2 b2Var = new b2();
            b2Var.a = true;
            lastFragment.showAsSheet(d2Var2, b2Var);
            return true;
        }
        if (org.telegram.messenger.r2.a) {
            a8.b("present fragment " + d2Var2.getClass().getSimpleName() + " args=" + d2Var2.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = r9.z1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((r9) arrayList.get(i12)).D(false);
            i12++;
        }
        arrayList.clear();
        b3 b3Var = this.F;
        if (b3Var != null && !b3Var.c) {
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
        d2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.K;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.K.getParent()).removeView(this.K);
            }
            this.K = null;
        }
        this.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
        d2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.R0;
        if (activity.getCurrentFocus() != null && d2Var2.hideKeyboardOnShow() && !z13) {
            org.telegram.messenger.g0.v1(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && hp.e1().getBoolean("view_animations", true));
        if (this.V0.isEmpty()) {
            m3Var = m3Var2;
            d2Var = null;
        } else {
            m3Var = m3Var2;
            d2Var = (d2) t4.c.d(1, this.V0);
        }
        d2Var2.setParentLayout(this);
        View view = d2Var2.fragmentView;
        if (view == null) {
            view = d2Var2.performCreateView(activity);
            if (view != null && d2Var2.isSupportEdgeToEdge() && d2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(d2Var2);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, nVar);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                d2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        v vVar = this.w;
        if (z13) {
            edgeToEdgeSupportMode = m3Var;
        }
        vVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.w.setDrawNavigationBar(!z13 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.w.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i3 = org.telegram.messenger.g0.L(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - org.telegram.messenger.g0.n) - i3) - org.telegram.messenger.g0.L(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i3 = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = d2Var2.getPreviewHeight();
            int i13 = org.telegram.messenger.g0.m;
            if (previewHeight > 0) {
                i10 = 2;
                if (previewHeight < getMeasuredHeight() - i13) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i13) - previewHeight) / 2) + i13;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = org.telegram.messenger.k5.C(8.0f, i3, layoutParams2.bottomMargin);
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
        k kVar = d2Var2.actionBar;
        if (kVar != null && kVar.L) {
            if (this.J0) {
                kVar.setOccupyStatusBar(false);
            }
            org.telegram.messenger.g0.E2(d2Var2.actionBar);
            this.w.addView(d2Var2.actionBar);
        }
        d2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        d2Var2.attachSheets(this.w);
        this.V0.add(d2Var2);
        L("presentFragment");
        d2Var2.onResume();
        this.E = d2Var2.actionBar;
        if (!d2Var2.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        v vVar2 = this.s;
        v vVar3 = this.w;
        this.s = vVar3;
        this.w = vVar2;
        vVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(d2Var2 instanceof wm)) {
                float L4 = org.telegram.messenger.g0.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                cg.p0 p0Var = cg.t0.a;
                view.setOutlineProvider(new cg.r0(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float L5 = org.telegram.messenger.g0.L(29.0f);
                cg.p0 p0Var2 = cg.t0.a;
                view.setOutlineProvider(new cg.r0(0, L5));
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
        v vVar4 = this.x;
        if (vVar4 != null) {
            bringChildToFront(vVar4);
        }
        if (!z15) {
            W(d2Var, z10);
            View view2 = this.I0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.r0 != null) {
            this.j0 = d2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.I0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.I0.setVisibility(0);
            }
            if (d2Var != null) {
                d2Var.onTransitionAnimationStart(false, false);
                d2Var.onTransitionAnimationEnd(false, false);
            }
            d2Var2.onTransitionAnimationStart(true, false);
            d2Var2.onTransitionAnimationEnd(true, false);
            d2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.H0 && this.V0.size() == 1) {
            W(d2Var, z10);
            this.C0 = System.currentTimeMillis();
            this.a0 = true;
            this.G0 = new org.telegram.messenger.voip.l0(6, d2Var, d2Var2);
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
            if (d2Var != null) {
                d2Var.onTransitionAnimationStart(false, false);
            }
            d2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.L = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.L.setInterpolator(xq.h);
            this.L.setDuration(200L);
            this.L.addListener(new q(this, 1));
            this.L.start();
            return true;
        }
        this.b0 = z13;
        this.C0 = System.currentTimeMillis();
        this.a0 = true;
        p pVar = new p(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, d2Var, d2Var2);
        d2 d2Var3 = d2Var;
        this.G0 = pVar;
        boolean needDelayOpenAnimation = d2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (d2Var3 != null) {
                d2Var3.onTransitionAnimationStart(false, false);
            }
            d2Var2.onTransitionAnimationStart(true, false);
        }
        this.Y0 = false;
        this.J = d2Var3;
        this.I = d2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? d2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.w.b) && d2Var3 != null)) {
                d2Var3.saveKeyboardPositionBeforeTransition();
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
            if (!d2Var2.needDelayOpenAnimation()) {
                h0(true, true, z13);
                return true;
            }
            ni.g gVar = new ni.g(this, d2Var2, z13, i11);
            this.e = gVar;
            org.telegram.messenger.g0.i3(gVar, 200L);
            return true;
        }
        if (d2Var3 != null && !z13) {
            d2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, d2Var3, d2Var2, z13);
        if (d2Var2.needDelayOpenAnimation()) {
            this.e = new l6.g(this, d2Var3, d2Var2, z13);
        }
        org.telegram.messenger.g0.i3(this.d, 250L);
        return true;
    }

    public final boolean V(d2 d2Var, boolean z10, boolean z11) {
        o4 o4Var = new o4(d2Var);
        o4Var.b = z10;
        o4Var.c = z11;
        o4Var.d = true;
        o4Var.e = false;
        return U(o4Var);
    }

    public final void W(d2 d2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (d2Var == null) {
            return;
        }
        d2Var.onBecomeFullyHidden();
        d2Var.onPause();
        if (z10) {
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
            this.V0.remove(d2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = d2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                d2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(d2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(d2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = d2Var.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(d2Var.actionBar);
            }
            d2Var.detachSheets();
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
        for (int i3 = 0; i3 < size; i3++) {
            ((d2) this.V0.get(i3)).clearViews();
            ((d2) this.V0.get(i3)).setParentLayout(this);
        }
        n4 n4Var = this.Q0;
        if (n4Var != null) {
            n4Var.b(this, z10);
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
            e0((d2) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
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
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((t6) arrayList.get(i3)).c();
        }
    }

    public final void b0(int i3) {
        if (i3 < 0 || i3 >= getFragmentStack().size()) {
            return;
        }
        d0((d2) getFragmentStack().get(i3), false);
    }

    public final boolean c(int i3, d2 d2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n4 n4Var = this.Q0;
        if ((n4Var != null && !n4Var.h(d2Var, this)) || !d2Var.onFragmentCreate() || this.V0.contains(d2Var)) {
            return false;
        }
        d2Var.setParentLayout(this);
        Activity activity = this.R0;
        if (i3 == -1 || i3 == -2) {
            if (!this.V0.isEmpty()) {
                d2 d2Var2 = (d2) t4.c.d(1, this.V0);
                d2Var2.onPause();
                k kVar = d2Var2.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(d2Var2.actionBar);
                }
                View view = d2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    d2Var2.onRemoveFromParent();
                    viewGroup.removeView(d2Var2.fragmentView);
                }
                d2Var2.detachSheets();
            }
            this.V0.add(d2Var);
            if (i3 != -2) {
                View view2 = d2Var.fragmentView;
                if (view2 == null) {
                    view2 = d2Var.performCreateView(activity);
                    if (view2 != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(d2Var);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.i(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        d2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!d2Var.hasOwnBackground && view2.getBackground() == null) {
                    r6.i(k6.d6, view2, null);
                }
                this.s.addView(view2, mf.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
                k kVar2 = d2Var.actionBar;
                if (kVar2 != null && kVar2.L) {
                    if (this.J0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) d2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(d2Var.actionBar);
                    }
                    this.s.addView(d2Var.actionBar);
                }
                d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                d2Var.attachSheets(this.s);
                d2Var.onResume();
                d2Var.onTransitionAnimationEnd(false, true);
                d2Var.onTransitionAnimationEnd(true, true);
                d2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i3);
        } else {
            if (i3 == -3) {
                View view3 = d2Var.fragmentView;
                if (view3 == null) {
                    view3 = d2Var.performCreateView(activity);
                    if (view3 != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(d2Var);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.i(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        d2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!d2Var.hasOwnBackground && view3.getBackground() == null) {
                    r6.i(k6.d6, view3, null);
                }
                v vVar = this.s;
                vVar.addView(view3, Utilities.j(0, vVar.getChildCount(), 0), mf.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
                k kVar3 = d2Var.actionBar;
                if (kVar3 != null && kVar3.L) {
                    if (this.J0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) d2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(d2Var.actionBar);
                    }
                    this.s.addView(d2Var.actionBar);
                }
                d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                d2Var.attachSheets(this.s);
                i3 = 0;
            }
            this.V0.add(i3, d2Var);
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

    public final void c0(d2 d2Var) {
        d0(d2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.i0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.c0.add(iArr);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t6 t6Var = (t6) arrayList.get(i3);
            iArr[i3] = t6Var.c();
            s6 s6Var = t6Var.g;
            t6Var.g = null;
            if (s6Var != null) {
                ArrayList arrayList2 = this.k0;
                if (!arrayList2.contains(s6Var)) {
                    arrayList2.add(s6Var);
                }
            }
        }
    }

    public final void d0(d2 d2Var, boolean z10) {
        if ((this.V0.size() > 0 && t4.c.d(1, this.V0) == d2Var) || (this.V0.size() > 1 && t4.c.d(2, this.V0) == d2Var)) {
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
        e0(d2Var, d2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
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
        n4 n4Var = this.Q0;
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
        z1 z1Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - w(true)) - this.u1.d));
        r rVar = this.H;
        z1 z1Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            z1Var = this.H.getLastSheet();
            if (z1Var.y()) {
            }
        }
        z1Var = null;
        if (z1Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            z1Var = getLastFragment().getLastSheet();
            if (z1Var.y()) {
            }
            if (z1Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.r1 = z10;
                }
                if (!this.r1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.r1 = false;
                    }
                    return z1Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.r1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        z1Var2 = z1Var;
        if (z1Var2 != null) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i3;
        int i10;
        Canvas canvas2;
        int i11;
        v vVar;
        View childAt;
        int i12;
        int i13;
        WindowInsets rootWindowInsets;
        float f10;
        float min;
        ke keVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.P);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.w) {
            paddingLeft2 = org.telegram.messenger.g0.L(1.0f) + paddingRight;
        } else if (view == this.s) {
            i3 = paddingLeft2;
            i10 = paddingRight;
            int save = canvas.save();
            if (view != this.F || (keVar = this.G) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.b1;
                boolean z11 = this.e1;
                int width2 = getWidth();
                getY();
                getHeight();
                keVar.j(canvas, z10, z11, width2, 1.0f);
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
                            float j11 = (paddingRight <= org.telegram.messenger.g0.L(f10) || this.U || !this.k1) ? Utilities.j(paddingRight, org.telegram.messenger.g0.L(f10), 0) : f11;
                            if (!this.k1 || this.n1) {
                                canvas2.translate(-j11, 0.0f);
                                i3 = (int) (i3 + j11);
                            } else {
                                canvas2.translate(-j11, 0.0f);
                                rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                                i3 = (int) (i3 + j11);
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
                    i3 += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (D()) {
                        i3 = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!B() && !this.h) {
                canvas2.clipRect(i10, 0, i3, getHeight());
            }
            if ((!this.h || this.b0) && view == (vVar = this.s) && (childAt = vVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.K == null) {
                    int L = org.telegram.messenger.g0.L(32.0f);
                    int measuredWidth = (getMeasuredWidth() - L) / 2;
                    int translationY = (int) ((vVar.getTranslationY() + childAt.getTop()) - org.telegram.messenger.g0.L(12.0f));
                    k6.s0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    k6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas2.restoreToCount(save2);
            i12 = paddingRight != 0 ? -1 : -1;
            i13 = this.a1;
            if (i13 == i12) {
                i13 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = be.b((i13 * hs.e4) / org.telegram.messenger.g0.L(20.0f), 0, hs.e4);
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
                y1.setColor(Color.argb((int) (be.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.a1 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, y1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i10, 0.0f, i3, getHeight() * 1.5f, y1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i10 = paddingLeft;
        i3 = paddingLeft2;
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
            canvas2.clipRect(i10, 0, i3, getHeight());
        }
        if (!this.h) {
        }
        this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r.draw(canvas2);
        if (this.K == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
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
        d2 d2Var = !this.V0.isEmpty() ? (d2) t4.c.d(1, this.V0) : null;
        if (d2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = d2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? hs.r5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, 0.0f);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, r5.getMeasuredWidth() + (this.k1 ? org.telegram.messenger.g0.L(56.0f) : 0));
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        }
        Animator customSlideTransition2 = d2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        d2 d2Var2 = (d2) t4.c.d(2, this.V0);
        if (d2Var2 != null && (customSlideTransition = d2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void e0(d2 d2Var, boolean z10) {
        if (this.V0.contains(d2Var)) {
            if (z10 && t4.c.d(1, this.V0) == d2Var) {
                d2Var.finishFragment();
                return;
            }
            if (t4.c.d(1, this.V0) == d2Var && this.V0.size() > 1) {
                d2Var.finishFragment(false);
                return;
            }
            d2Var.onPause();
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
            this.V0.remove(d2Var);
            L("removeFragmentFromStackInternal " + z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r0 = org.telegram.messenger.hp.e1().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(p4 p4Var, Runnable runnable) {
        j6 j6Var;
        j6 j6Var2;
        if (this.a0 || this.R) {
            this.u0 = true;
            this.v0 = p4Var.a;
            this.x0 = p4Var.c;
            this.y0 = p4Var.b;
            this.w0 = p4Var.g;
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
        int size = p4Var.e ? 1 : this.V0.size();
        bi.q0 q0Var = new bi.q0(this, size, p4Var, runnable, 12);
        if (size < 1 || !p4Var.f || !p4Var.g) {
            q0Var.run();
            return;
        }
        if (p4Var.m == null) {
            g0(null);
        }
        int i3 = p4Var.b;
        if (i3 != -1 && (j6Var2 = p4Var.a) != null) {
            j6Var2.u(i3);
            k6.z1(p4Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            k6.u(p4Var.a, true, p4Var.c);
            q0Var.run();
            return;
        }
        j6 j6Var3 = p4Var.a;
        boolean z10 = p4Var.c;
        lg.n nVar = new lg.n(q0Var, 19);
        int i10 = k6.a;
        if (j6Var3 == null) {
            nVar.run();
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
            if (!z10) {
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.remove("theme");
                edit.apply();
            }
            k6.hm.clear();
            k6.g0 = 0;
            k6.h0 = null;
            k6.e0 = null;
            k6.f0 = null;
            if (!z10 && k6.M == null) {
                k6.K = j6Var3;
                if (k6.I == k6.J) {
                    k6.T = 2000;
                    k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new hc(15), 2100L);
                }
            }
            k6.I = j6Var3;
            k6.t1(false, false);
            j6Var = j6Var3;
            if (k6.M == null && !k6.Q) {
                hp.s1(j6Var.F).x4(j6Var, j6Var.k(false), z10, false);
            }
            nVar.run();
        }
        String[] strArr = new String[1];
        u8 u8Var = new u8(strArr, j6Var3, z10, nVar, 25);
        j6Var = j6Var3;
        try {
            int i11 = k6.tm + 1;
            k6.tm = i11;
            ai.g3 g3Var = new ai.g3(i11, nVar, u8Var);
            String str = j6Var.d;
            if (str != null) {
                Utilities.i.c(new o4.b1(g3Var, obj, str, obj, 5));
            } else {
                Utilities.i.c(new o4.b1(g3Var, new File(j6Var.b), obj, strArr, 5));
            }
        } catch (Exception e11) {
            e = e11;
            a8.g(e, true);
            if (k6.M == null) {
                hp.s1(j6Var.F).x4(j6Var, j6Var.k(false), z10, false);
            }
            nVar.run();
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
        if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((d2) this.V0.get(size)).fragmentView == null) {
            for (int i3 = 0; i3 < size; i3++) {
                d2 d2Var = (d2) this.V0.get(i3);
                k kVar = d2Var.actionBar;
                if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(d2Var.actionBar);
                }
                View view = d2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    d2Var.onPause();
                    d2Var.onRemoveFromParent();
                    viewGroup.removeView(d2Var.fragmentView);
                }
            }
            d2 d2Var2 = (d2) this.V0.get(size);
            d2Var2.setParentLayout(this);
            View view2 = d2Var2.fragmentView;
            if (view2 == null) {
                view2 = d2Var2.performCreateView(this.R0);
                if (view2 != null && d2Var2.isSupportEdgeToEdge() && d2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(d2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    d2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, mf.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(d2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(d2Var2.drawEdgeNavigationBar());
            k kVar2 = d2Var2.actionBar;
            if (kVar2 != null && kVar2.L) {
                if (this.J0) {
                    kVar2.setOccupyStatusBar(false);
                }
                org.telegram.messenger.g0.E2(d2Var2.actionBar);
                this.s.addView(d2Var2.actionBar);
            }
            d2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
            d2Var2.attachSheets(this.s);
            d2Var2.onResume();
            d2Var2.onBecomeFullyVisible();
            this.E = d2Var2.actionBar;
            if (d2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            r6.i(k6.d6, view2, null);
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.r2.a;
        ArrayList arrayList = this.p1;
        StringBuilder h = t4.c.h(str, " ");
        h.append(this.V0.size());
        arrayList.add(0, h.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < 10; i3++) {
                arrayList2.add((String) this.p1.get(i3));
            }
            this.p1 = arrayList2;
        }
        o oVar = this.q1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 500L);
    }

    public final void g0(um umVar) {
        try {
            int i3 = k6.f5;
            this.l0 = new int[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                this.l0[i10] = umVar != null ? umVar.h(i10) : k6.x0(null, i10, false);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.l0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public d2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (d2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ t2 getBottomSheet() {
        return null;
    }

    public b3 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        d2 d2Var = this.J;
        return ((d2Var == null || !d2Var.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public l3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public List<d2> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public d2 getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (d2) t4.c.d(1, this.V0);
    }

    public d2 getLastFragmentIncludeMainTabs() {
        d2 lastFragment = getLastFragment();
        return lastFragment instanceof ee0 ? ((ee0) lastFragment).c0() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public t4 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public t4 getMessageDrawableOutStart() {
        return this.f0;
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
    public List<a9> getPulledDialogs() {
        return this.W0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public d2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            d2 d2Var = (d2) getFragmentStack().get(size);
            if (d2Var != null && d2Var.getContext() != null && !d2Var.isFinishing() && !d2Var.isRemovingFromStack()) {
                return d2Var;
            }
        }
        return null;
    }

    public gx getSheetFragment() {
        return x();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public float getThemeAnimationValue() {
        return this.t0;
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
        if (this.z0) {
            X(this.A0, this.B0);
            this.z0 = false;
        } else if (this.u0) {
            p4 p4Var = new p4(this.v0, this.y0, this.x0, true);
            boolean z10 = this.w0;
            if (!z10) {
                p4Var.g = z10;
                p4Var.f = z10;
            }
            f(p4Var, null);
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
        d2 d2Var = !this.V0.isEmpty() ? (d2) t4.c.d(1, this.V0) : null;
        return (d2Var == null || d2Var.getLastStoryViewer() == null || !d2Var.getLastStoryViewer().y()) ? false : true;
    }

    public final void j() {
        this.p0 = 0;
        this.q0 = null;
        this.l0 = null;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        d2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            n4 n4Var = this.Q0;
            if ((n4Var != null && !n4Var.k(this)) || i() || this.V0.isEmpty()) {
                return;
            }
            Activity activity = this.R0;
            if (activity.getCurrentFocus() != null) {
                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z12 = !z11 && (this.h || this.b0 || (z10 && hp.e1().getBoolean("view_animations", true)));
            d2 d2Var = (d2) t4.c.d(1, this.V0);
            AnimatorSet animatorSet = null;
            d2 d2Var2 = this.V0.size() > 1 ? (d2) t4.c.d(2, this.V0) : null;
            if (d2Var2 != null) {
                org.telegram.messenger.g0.p3(activity, k6.x0(null, k6.s8, false) == -1 || (d2Var2.hasForceLightStatusBar() && !k6.D0().q()));
                v vVar = this.s;
                this.s = this.w;
                this.w = vVar;
                d2Var2.setParentLayout(this);
                View view = d2Var2.fragmentView;
                if (view == null && (view = d2Var2.performCreateView(activity)) != null && d2Var2.isSupportEdgeToEdge() && d2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(d2Var2);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        d2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(d2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(d2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = d2Var2.actionBar;
                    if (kVar != null && kVar.L) {
                        if (this.J0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(d2Var2.actionBar);
                        this.s.addView(d2Var2.actionBar);
                    }
                    d2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    d2Var2.attachSheets(this.s);
                }
                this.I = d2Var2;
                this.J = d2Var;
                d2Var2.onTransitionAnimationStart(true, true);
                d2Var.onTransitionAnimationStart(false, true);
                d2Var2.onResume();
                if (this.r0 != null) {
                    this.j0 = d2Var2.getThemeDescriptions();
                }
                this.E = d2Var2.actionBar;
                if (!d2Var2.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.d6, view, null);
                }
                if (z12) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    d2Var.setRemovingFromStack(true);
                    this.F0 = new lg.y(this, d2Var, d2Var2, 22);
                    if (!this.h && !this.b0) {
                        animatorSet = d2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.w.b)) {
                            h0(false, true, z13 || this.b0);
                        } else {
                            mi.b0 b0Var = new mi.b0(this, 13);
                            this.d = b0Var;
                            org.telegram.messenger.g0.i3(b0Var, 200L);
                        }
                    } else {
                        this.L = animatorSet;
                        ac acVar = ac.w;
                        if (acVar != null && acVar.l) {
                            acVar.b();
                        }
                    }
                    L("closeLastFragment");
                } else {
                    m(d2Var);
                    d2Var.onTransitionAnimationEnd(false, true);
                    d2Var2.onTransitionAnimationEnd(true, true);
                    d2Var2.onBecomeFullyVisible();
                }
            } else if (!this.H0 || z11) {
                e0(d2Var, false);
                setVisibility(8);
                View view2 = this.I0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.C0 = System.currentTimeMillis();
                this.a0 = true;
                this.F0 = new org.telegram.messenger.voip.l0(5, this, d2Var);
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
            d2Var.onFragmentClosed();
        }
    }

    public final void m(d2 d2Var) {
        d2Var.finishing = true;
        d2Var.onPause();
        d2Var.onFragmentDestroy();
        d2Var.setParentLayout(null);
        this.V0.remove(d2Var);
        this.w.setVisibility(4);
        this.w.setTranslationY(0.0f);
        bringChildToFront(this.s);
        v vVar = this.x;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        L("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((d2) t4.c.d(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z10 = this.T0;
        if (z10) {
            if (!(view instanceof v) || !((v) view).y) {
                r0.i0.b(view, r0.k1.b);
                return;
            }
            int i3 = k1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i3 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.k1 k1Var2 = r0.k1.b;
            int i10 = Build.VERSION.SDK_INT;
            r0.a1 z0Var = i10 >= 34 ? new r0.z0(k1Var2) : i10 >= 30 ? new r0.y0(k1Var2) : i10 >= 29 ? new r0.x0(k1Var2) : new r0.w0(k1Var2);
            z0Var.c(8, i0.b.b(0, 0, 0, max));
            r0.i0.b(view, z0Var.b());
            return;
        }
        boolean z11 = this.U0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.u1;
        i0.b bVar2 = this.v1;
        if (view instanceof b3) {
            org.telegram.messenger.g0.B3(view, z11 ? 0 : bVar.a, 0, z12 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof v) {
            v vVar = (v) view;
            int w10 = w(false);
            int i11 = w10 > 0 ? bVar.d + w10 : 0;
            m3 m3Var = vVar.x;
            boolean z13 = m3Var == m3.c;
            int i12 = (z13 || z11) ? 0 : bVar2.a;
            int i13 = (z13 || z12) ? 0 : bVar2.c;
            int i14 = (!z13 || z11) ? bVar2.a : 0;
            int i15 = (!z13 || z12) ? bVar2.c : 0;
            if (m3Var == m3.a) {
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
        if (this.V0.isEmpty()) {
            return;
        }
        int size = this.V0.size();
        for (int i3 = 0; i3 < size; i3++) {
            d2 d2Var = (d2) this.V0.get(i3);
            d2Var.onConfigurationChanged(configuration);
            Dialog dialog = d2Var.visibleDialog;
            if (dialog instanceof t2) {
                ((t2) dialog).c0(configuration);
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
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        k kVar;
        x xVar;
        if (i3 == 82 && !i() && !this.R && (kVar = this.E) != null && !kVar.v() && (xVar = kVar.F) != null) {
            int childCount = xVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = xVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (q0Var.s()) {
                            q0Var.U(null, null);
                            break;
                        }
                        if (q0Var.T) {
                            xVar.o(((Integer) q0Var.getTag()).intValue());
                            break;
                        }
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i3, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        int paddingRight = (i11 - i3) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                b3 b3Var = this.F;
                if (childAt == b3Var) {
                    b3Var.setCurrentAccount(h10.t0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & hs.x1;
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
    public final void onMeasure(int i3, int i10) {
        d2 d2Var = !this.V0.isEmpty() ? (d2) t4.c.d(1, this.V0) : null;
        if (d2Var != null && !d2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            d2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, TLObject.FLAG_30));
            return;
        }
        n4 n4Var = this.Q0;
        if (n4Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i3;
            iArr[1] = i10;
            n4Var.e(iArr);
            i3 = iArr[0];
            i10 = iArr[1];
        }
        this.e1 = C() > org.telegram.messenger.g0.L(20.0f);
        super.onMeasure(i3, i10);
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
                                    ((d2) t4.c.d(1, this.V0)).onBeginSlide();
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
                        } else if (((d2) t4.c.d(1, this.V0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                        d2 d2Var = (d2) t4.c.d(1, this.V0);
                        if (!this.h && !this.b0 && !this.R && d2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.V.getXVelocity();
                            float yVelocity = this.V.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && d2Var.canBeginSlide()) {
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
                            v vVar = this.s;
                            if (vVar != null) {
                                vVar.setLayerType(0, null);
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
                        v vVar2 = this.s;
                        if (vVar2 != null) {
                            vVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.V;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.V = null;
                        }
                    }
                } else if (((d2) t4.c.d(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
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
                    v vVar3 = this.s;
                    if (vVar3 != null) {
                        vVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.R;
        }
        return false;
    }

    public final void p(Canvas canvas, int i3, int i10) {
        if (w1 == null || !az.D1) {
            return;
        }
        int i11 = i3 / 2;
        if (w1.getAlpha() != i11) {
            w1.setAlpha(i11);
        }
        w1.setBounds(0, i10, getMeasuredWidth(), w1.getIntrinsicHeight() + i10);
        w1.draw(canvas);
    }

    public final void q(Canvas canvas, int i3) {
        p(canvas, hs.e4, i3);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        d2 d2Var = (d2) t4.c.d(2, this.V0);
        d2 d2Var2 = (d2) t4.c.d(1, this.V0);
        d2Var2.fragmentView.setOutlineProvider(null);
        d2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        d2Var2.fragmentView.setLayoutParams(layoutParams);
        W(d2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(d2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(d2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new xq(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bh.j(14, this, d2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(d2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(d2Var2.drawEdgeNavigationBar());
        d2Var2.setInPreviewMode(false);
        d2Var2.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (k6.x0(null, k6.s8, false) != -1 && (!d2Var2.hasForceLightStatusBar() || k6.D0().q())) {
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
        return !this.V0.isEmpty() && ((d2) t4.c.d(1, this.V0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setDelegate(n4 n4Var) {
        this.Q0 = n4Var;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setDrawerLayoutContainer(l3 l3Var) {
        this.y = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setFragmentPanTranslationOffset(int i3) {
        v vVar = this.s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setFragmentStack(List<d2> list) {
        this.V0 = list;
        b3 b3Var = this.F;
        if (b3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            b3Var.J.remove(oVar);
            b3Var.K.remove(oVar2);
            org.telegram.messenger.g0.E2(this.F);
            this.F = null;
        }
        boolean z10 = this.S0;
        Activity activity = this.R0;
        if (z10) {
            b3 b3Var2 = new b3(activity, this);
            this.F = b3Var2;
            this.G = new ke(b3Var2);
            b3 b3Var3 = this.F;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            b3Var3.J.add(oVar3);
            b3Var3.K.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            j3 j3Var = LaunchActivity.K1.z0;
            if (j3Var != null) {
                j3Var.setTabsView(this.F);
            }
        }
        v vVar = this.w;
        if (vVar != null) {
            org.telegram.messenger.g0.E2(vVar);
        }
        v vVar2 = new v(activity, this);
        this.w = vVar2;
        addView(vVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.w.setLayoutParams(layoutParams2);
        v vVar3 = this.s;
        if (vVar3 != null) {
            org.telegram.messenger.g0.E2(vVar3);
        }
        v vVar4 = new v(activity, this);
        this.s = vVar4;
        addView(vVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        v vVar5 = this.x;
        if (vVar5 != null) {
            org.telegram.messenger.g0.E2(vVar5);
        }
        v vVar6 = new v(activity, this);
        this.x = vVar6;
        this.i1.a = vVar6;
        addView(vVar6);
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
                this.x.addView(view, mf.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((d2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.q4
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
        d2 d2Var = (d2) t4.c.d(2, this.V0);
        d2Var.onSlideProgress(false, l10);
        d2 d2Var2 = (d2) t4.c.d(1, this.V0);
        float a10 = be.a(l10 * 2.0f, 0.0f, 1.0f);
        if (!d2Var2.isBeginToShow() || (navigationBarColor = d2Var2.getNavigationBarColor()) == (navigationBarColor2 = d2Var.getNavigationBarColor())) {
            return;
        }
        d2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setNavigationBarColor(int i3) {
        if (this.s1 != i3) {
            this.s1 = i3;
            invalidate();
        }
        l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.setInternalNavigationBarColor(i3);
        }
        b3 b3Var = this.F;
        if (b3Var != null) {
            b3Var.i(i3, (this.R || this.U) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i3) {
        this.a1 = i3;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setPulledDialogs(List<a9> list) {
        this.W0 = list;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.J0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        this.t0 = f10;
        for (int i3 = 0; i3 < this.p0; i3++) {
            int f11 = i0.a.f(f10, this.n0[i3], this.o0[i3]);
            um umVar = this.q0;
            if (umVar != null) {
                umVar.i(this.m0[i3], f11);
            } else {
                int i10 = this.m0[i3];
                SparseIntArray sparseIntArray = k6.jm;
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
                int argb = Color.argb(Math.min(hs.e4, (int) (((alpha - r4) * f10) + Color.alpha(iArr[i12]))), Math.min(hs.e4, (int) (((red - red2) * f10) + red2)), Math.min(hs.e4, (int) (((green - green2) * f10) + green2)), Math.min(hs.e4, (int) (((blue - blue2) * f10) + blue2)));
                t6 t6Var = (t6) arrayList2.get(i12);
                int i15 = t6Var.e;
                e6 e6Var = t6Var.n;
                if (e6Var != null) {
                    e6Var.i(i15, argb);
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
        ArrayList arrayList4 = this.k0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            s6 s6Var = (s6) arrayList4.get(i16);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                t6 t6Var2 = (t6) this.j0.get(i17);
                t6Var2.e(k6.w0(t6Var2.e, t6Var2.n), false, false);
            }
        }
        rm rmVar = this.h0;
        if (rmVar != null) {
            um umVar2 = rmVar.a;
            umVar2.G.A0.invalidate();
            umVar2.t.K = f10;
            umVar2.u.K = f10;
            umVar2.u(f10);
        }
        n4 n4Var = this.Q0;
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
    public void setUseAlphaAnimations(boolean z10) {
        this.H0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setWindow(Window window) {
        this.c = window;
    }

    public final d2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            d2 d2Var = (d2) getFragmentStack().get(size);
            if (d2Var != null && !d2Var.isFinishing() && !d2Var.isRemovingFromStack() && xd0.class.isInstance(d2Var)) {
                return d2Var;
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
        b3 b3Var;
        if (!this.S0 || (b3Var = this.F) == null) {
            return 0;
        }
        return z10 ? (int) b3Var.H : b3Var.I;
    }

    public final gx x() {
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
                this.x.addView(view, mf.c(-1.0f, -1));
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

    @Override // org.telegram.ui.ActionBar.q4
    public void setHighlightActionButtons(boolean z10) {
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
