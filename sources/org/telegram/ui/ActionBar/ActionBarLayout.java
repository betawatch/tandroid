package org.telegram.ui.ActionBar;

import ai.c9;
import ai.jc;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b90;
import org.telegram.ui.dz;
import org.telegram.ui.qg0;
import org.telegram.ui.rn;
import org.telegram.ui.un;
import org.telegram.ui.wn;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements b5, mg.b {
    public static Drawable p1;
    public static Drawable q1;
    public static Paint r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public s D0;
    public m3 E;
    public float E0;
    public cf.c F;
    public long F0;
    public r G;
    public String G0;
    public m2 H;
    public int H0;
    public m2 I;
    public b90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public y4 J0;
    public AnimatorSet K;
    public final Activity K0;
    public final DecelerateInterpolator L;
    public final boolean L0;
    public final OvershootInterpolator M;
    public boolean M0;
    public final AccelerateDecelerateInterpolator N;
    public boolean N0;
    public float O;
    public List O0;
    public boolean P;
    public List P0;
    public boolean Q;
    public final Rect Q0;
    public int R;
    public boolean R0;
    public int S;
    public Runnable S0;
    public boolean T;
    public int T0;
    public VelocityTracker U;
    public boolean U0;
    public boolean V;
    public final Path V0;
    public boolean W;
    public final float[] W0;
    public boolean X0;
    public final int[] Y0;
    public boolean Z0;
    public boolean a;
    public boolean a0;
    public int a1;
    public boolean b;
    public final ArrayList b0;
    public final org.telegram.ui.Components.e6 b1;
    public Window c;
    public final ArrayList c0;
    public boolean c1;
    public Runnable d;
    public final n7.z0 d0;
    public boolean d1;
    public Runnable e;
    public d5 e0;
    public boolean e1;
    public boolean f;
    public d5 f0;
    public float f1;
    public rn g0;
    public boolean g1;
    public boolean h;
    public final ArrayList h0;
    public AnimatorSet h1;
    public ArrayList i0;
    public ArrayList i1;
    public final ArrayList j0;
    public final o j1;
    public AnimatorSet k0;
    public boolean k1;
    public final AnimationNotificationsLocker l0;
    public int l1;
    public float m0;
    public r0.l1 m1;
    public boolean n;
    public boolean n0;
    public i0.b n1;
    public g6 o0;
    public i0.b o1;
    public boolean p0;
    public boolean q0;
    public ColorDrawable r;
    public int r0;
    public v s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public v v;
    public long v0;
    public v w;
    public boolean w0;
    public x3 x;
    public int x0;
    public k y;
    public Runnable y0;
    public Runnable z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        int i10 = 1;
        n7.z0 z0Var = new n7.z0(i10);
        z0Var.b = new SparseIntArray();
        z0Var.c = new int[]{h6.Aa, h6.Da, h6.Ea, h6.Fa, h6.ac, h6.Ca};
        this.d0 = z0Var;
        this.h0 = new ArrayList();
        this.j0 = new ArrayList();
        this.l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.b1 = new org.telegram.ui.Components.e6(this, 280L, rr.h);
        this.i1 = new ArrayList();
        this.j1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.n1 = bVar;
        this.o1 = bVar;
        this.K0 = (Activity) context;
        this.L0 = z10;
        if (q1 == null) {
            q1 = getResources().getDrawable(R.drawable.layer_shadow);
            p1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            r1 = new Paint();
        }
        n nVar = new n(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(this, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(ArrayList arrayList, View view) {
        if (view instanceof mg.b) {
            arrayList.addAll(((mg.b) view).z());
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
            if (actionBarLayout.O0.size() >= 2) {
                ((m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
                m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, actionBarLayout.O0);
                m2Var.prepareFragmentToSlide(false, false);
                m2Var.onPause();
                View view = m2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    m2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(m2Var.fragmentView);
                }
                k kVar = m2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(m2Var.actionBar);
                }
                m2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.O0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0);
            m2Var2.prepareFragmentToSlide(true, false);
            m2Var2.onPause();
            m2Var2.onFragmentDestroy();
            m2Var2.setParentLayout(null);
            List list = actionBarLayout.O0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            v vVar = actionBarLayout.s;
            vVar.setAlpha(1.0f);
            v vVar2 = actionBarLayout.v;
            actionBarLayout.s = vVar2;
            actionBarLayout.v = vVar;
            actionBarLayout.bringChildToFront(vVar2);
            View view2 = actionBarLayout.w;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.O0.size() > 0) {
                m2 m2Var3 = (m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0);
                actionBarLayout.y = m2Var3.actionBar;
                m2Var3.onResume();
                m2Var3.onBecomeFullyVisible();
                m2Var3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f7, float f10) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
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

    public static void x(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof x5) {
                ((x5) childAt).e();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    public final boolean A() {
        return this.M0;
    }

    public final boolean B() {
        return this.W || this.T;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.Q0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.d1 && this.e1;
    }

    public final void F(boolean z10) {
        H();
        K();
        Runnable runnable = this.d;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.K = null;
        }
        s sVar = this.D0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.D0 = null;
        }
        setAlpha(1.0f);
        this.s.setAlpha(1.0f);
        this.s.setScaleX(1.0f);
        this.s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (this.a0 || this.Q || j() || this.O0.isEmpty()) {
            return;
        }
        a30 a30Var = a30.d0;
        if (a30Var != null && a30Var.w) {
            a30Var.e(false);
            return;
        }
        if (!e0() && (kVar = this.y) != null && !kVar.s()) {
            k kVar2 = this.y;
            if (kVar2.n0) {
                kVar2.h(true);
                return;
            }
        }
        r rVar = this.G;
        if ((rVar == null || rVar.onBackPressed(true)) && ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
            l(true, false);
        }
    }

    public final void H() {
        if (!this.W || this.y0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            this.K = null;
            animatorSet.cancel();
        }
        this.W = false;
        this.a0 = false;
        this.v0 = 0L;
        this.H = null;
        this.I = null;
        Runnable runnable = this.y0;
        this.y0 = null;
        if (runnable != null) {
            runnable.run();
        }
        i();
        i();
    }

    public final void I(String str) {
        Runnable runnable = this.S0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        Iterator it = this.O0.iterator();
        while (it.hasNext()) {
            ((m2) it.next()).onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (!this.W || (runnable = this.z0) == null) {
            return;
        }
        this.W = false;
        this.a0 = false;
        this.v0 = 0L;
        this.H = null;
        this.I = null;
        this.z0 = null;
        runnable.run();
        i();
    }

    public final void L() {
        if (!this.O0.isEmpty()) {
            ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onPause();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onResume();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.E == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
        this.E.draw(canvas);
        canvas.restore();
    }

    public final void O() {
        int i10 = 0;
        this.P = false;
        this.Q = true;
        this.v.setVisibility(0);
        this.V = false;
        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        View view = m2Var.fragmentView;
        if (view == null && (view = m2Var.performCreateView(this.K0)) != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
            n nVar = new n(m2Var, i10);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            m2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = m2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.C0) {
                m2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(m2Var.actionBar);
        }
        m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        m2Var.attachSheets(this.v);
        if (!m2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(h6.w0(null, h6.d6, false));
        }
        m2Var.onResume();
        if (this.k0 != null) {
            this.i0 = m2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).prepareFragmentToSlide(true, true);
        m2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(m2 m2Var) {
        return R(new z4(m2Var));
    }

    public final boolean Q(m2 m2Var, boolean z10) {
        z4 z4Var = new z4(m2Var);
        z4Var.b = z10;
        return R(z4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0242, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(z4 z4Var) {
        y4 y4Var;
        ArrayList arrayList;
        y3 y3Var;
        m2 m2Var;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        m2 m2Var2 = z4Var.a;
        boolean z10 = z4Var.b;
        boolean z11 = z4Var.c;
        boolean z12 = z4Var.d;
        boolean z13 = z4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z4Var.f;
        int i11 = 0;
        if (m2Var2 == null || j() || !(((y4Var = this.J0) == null || !z12 || y4Var.l(this, z4Var)) && m2Var2.onFragmentCreate())) {
            return false;
        }
        y3 edgeToEdgeSupportMode = m2Var2.getEdgeToEdgeSupportMode();
        y3 y3Var2 = y3.a;
        int i12 = 1;
        boolean z14 = edgeToEdgeSupportMode != y3Var2;
        boolean drawEdgeNavigationBar = m2Var2.drawEdgeNavigationBar();
        m2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.G1) != null) {
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
                ArrayList arrayList3 = LaunchActivity.G1.E0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof wi) || (visibleDialog instanceof ei.k3))) {
            k2 k2Var = new k2();
            k2Var.a = true;
            lastFragment.showAsSheet(m2Var2, k2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + m2Var2.getClass().getSimpleName() + " args=" + m2Var2.getArguments());
        }
        int i13 = 0;
        while (true) {
            arrayList = jc.y1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((jc) arrayList.get(i13)).q(false);
            i13++;
        }
        arrayList.clear();
        m3 m3Var = this.E;
        if (m3Var != null && !m3Var.c) {
            LaunchActivity.L();
        }
        if (this.h && this.a0) {
            Runnable runnable = this.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.e = null;
            }
            l(false, true);
        }
        m2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.J;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.J = null;
        }
        this.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
        m2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.K0;
        if (activity.getCurrentFocus() != null && m2Var2.hideKeyboardOnShow() && !z13) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.O0.isEmpty()) {
            y3Var = y3Var2;
            m2Var = null;
        } else {
            y3Var = y3Var2;
            m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        }
        m2Var2.setParentLayout(this);
        View view = m2Var2.fragmentView;
        if (view == null) {
            view = m2Var2.performCreateView(activity);
            if (view != null && m2Var2.isSupportEdgeToEdge() && m2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(m2Var2, i11);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.j(view, nVar);
                this.v.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                m2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.v.addView(view);
        v vVar = this.v;
        if (z13) {
            edgeToEdgeSupportMode = y3Var;
        }
        vVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.v.setDrawNavigationBar(!z13 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.v.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i10 = AndroidUtilities.dp(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - i10) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i10 = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = m2Var2.getPreviewHeight();
            int i14 = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0 && previewHeight < getMeasuredHeight() - i14) {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i14) - previewHeight) / 2) + i14;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    layoutParams2.bottomMargin = org.telegram.messenger.f0.C(8.0f, i10, layoutParams2.bottomMargin);
                }
                int dp = AndroidUtilities.dp(8.0f);
                layoutParams2.leftMargin = dp;
                layoutParams2.rightMargin = dp;
            }
            float f7 = 24.0f;
            int dp2 = AndroidUtilities.dp(f7);
            layoutParams2.bottomMargin = dp2;
            layoutParams2.topMargin = dp2;
            int i15 = AndroidUtilities.statusBarHeight;
            int i16 = dp2 + i15;
            layoutParams2.topMargin = i16;
            if (z14) {
                layoutParams2.topMargin = i16 + i15;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            }
            int dp3 = AndroidUtilities.dp(8.0f);
            layoutParams2.leftMargin = dp3;
            layoutParams2.rightMargin = dp3;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        k kVar = m2Var2.actionBar;
        if (kVar != null && kVar.K) {
            if (this.C0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(m2Var2.actionBar);
            this.v.addView(m2Var2.actionBar);
        }
        m2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        m2Var2.attachSheets(this.v);
        this.O0.add(m2Var2);
        I("presentFragment");
        m2Var2.onResume();
        this.y = m2Var2.actionBar;
        if (!m2Var2.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(h6.w0(null, h6.d6, false));
        }
        v vVar2 = this.s;
        v vVar3 = this.v;
        this.s = vVar3;
        this.v = vVar2;
        vVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(m2Var2 instanceof wn)) {
                float dp4 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                ai.k2 k2Var2 = yf.i0.a;
                view.setOutlineProvider(new yf.h0(0, dp4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float dp5 = AndroidUtilities.dp(29.0f);
                ai.k2 k2Var3 = yf.i0.a;
                view.setOutlineProvider(new yf.h0(0, dp5));
            }
            view.setClipToOutline(true);
            view.setElevation(AndroidUtilities.dp(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineSpotShadowColor(-1342177280);
                view.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.r == null) {
                this.r = new ColorDrawable(771751936);
            }
            this.r.setAlpha(0);
            h6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        v vVar4 = this.w;
        if (vVar4 != null) {
            bringChildToFront(vVar4);
        }
        if (!z15) {
            T(m2Var, z10);
            View view2 = this.B0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.k0 != null) {
            this.i0 = m2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.B0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.B0.setVisibility(0);
            }
            if (m2Var != null) {
                m2Var.onTransitionAnimationStart(false, false);
                m2Var.onTransitionAnimationEnd(false, false);
            }
            m2Var2.onTransitionAnimationStart(true, false);
            m2Var2.onTransitionAnimationEnd(true, false);
            m2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.A0 && this.O0.size() == 1) {
            T(m2Var, z10);
            this.v0 = System.currentTimeMillis();
            this.W = true;
            this.z0 = new ki.n(29, m2Var, m2Var2);
            ArrayList arrayList4 = new ArrayList();
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
            View view4 = this.B0;
            if (view4 != null) {
                view4.setVisibility(0);
                arrayList4.add(ObjectAnimator.ofFloat(this.B0, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            if (m2Var != null) {
                m2Var.onTransitionAnimationStart(false, false);
            }
            m2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.K = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.K.setInterpolator(rr.h);
            this.K.setDuration(200L);
            this.K.addListener(new q(this, 1));
            this.K.start();
            return true;
        }
        this.a0 = z13;
        this.v0 = System.currentTimeMillis();
        this.W = true;
        sd sdVar = new sd(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, m2Var, m2Var2);
        m2 m2Var3 = m2Var;
        this.z0 = sdVar;
        boolean needDelayOpenAnimation = m2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (m2Var3 != null) {
                m2Var3.onTransitionAnimationStart(false, false);
            }
            m2Var2.onTransitionAnimationStart(true, false);
        }
        this.R0 = false;
        this.I = m2Var3;
        this.H = m2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? m2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.v.b) && m2Var3 != null)) {
                m2Var3.saveKeyboardPositionBeforeTransition();
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
        if (!this.s.b && !this.v.b) {
            if (!m2Var2.needDelayOpenAnimation()) {
                d0(true, true, z13);
                return true;
            }
            ji.g gVar = new ji.g(this, m2Var2, z13, i12);
            this.e = gVar;
            AndroidUtilities.runOnUIThread(gVar, 200L);
            return true;
        }
        if (m2Var3 != null && !z13) {
            m2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, m2Var3, m2Var2, z13);
        if (m2Var2.needDelayOpenAnimation()) {
            this.e = new j6.g(this, m2Var3, m2Var2, z13);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean S(m2 m2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(m2Var);
        z4Var.b = z10;
        z4Var.c = z11;
        z4Var.d = true;
        z4Var.e = false;
        return R(z4Var);
    }

    public final void T(m2 m2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (m2Var == null) {
            return;
        }
        m2Var.onBecomeFullyHidden();
        m2Var.onPause();
        if (z10) {
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
            this.O0.remove(m2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = m2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                m2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(m2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(m2Var.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            k kVar = m2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(m2Var.actionBar);
            }
            m2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z10, boolean z11) {
        if (this.W || this.Q) {
            this.s0 = true;
            this.t0 = z10;
            this.u0 = z11;
            return;
        }
        int size = this.O0.size();
        if (!z10) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ((m2) this.O0.get(i10)).clearViews();
            ((m2) this.O0.get(i10)).setParentLayout(this);
        }
        y4 y4Var = this.J0;
        if (y4Var != null) {
            y4Var.b(this, z10);
        }
        if (z11) {
            c0();
        }
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.s.removeAllViews();
        this.v.removeAllViews();
        this.y = null;
        this.H = null;
        this.I = null;
    }

    public final void X() {
        while (this.O0.size() > 0) {
            b0((m2) this.O0.get(0), false);
        }
        View view = this.B0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 < 0 || i10 >= getFragmentStack().size()) {
            return;
        }
        Z((m2) getFragmentStack().get(i10));
    }

    public final void Z(m2 m2Var) {
        a0(m2Var, false);
    }

    public final void a0(m2 m2Var, boolean z10) {
        if ((this.O0.size() > 0 && org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var) || (this.O0.size() > 1 && org.telegram.ui.Cells.c1.i(2, this.O0) == m2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z10);
        if (this.A0 && this.O0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.J0 != null && this.O0.size() == 1 && AndroidUtilities.isTablet()) {
            this.J0.k(this);
        }
        b0(m2Var, m2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.m1;
        if (l1Var != null) {
            o(view, l1Var);
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
            iArr[i10] = ((j6) arrayList.get(i10)).c();
        }
    }

    public final void b0(m2 m2Var, boolean z10) {
        if (this.O0.contains(m2Var)) {
            if (z10 && org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var) {
                m2Var.finishFragment();
                return;
            }
            if (org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var && this.O0.size() > 1) {
                m2Var.finishFragment(false);
                return;
            }
            m2Var.onPause();
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
            this.O0.remove(m2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, m2 m2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.J0;
        int i11 = 0;
        if ((y4Var != null && !y4Var.h(m2Var, this)) || !m2Var.onFragmentCreate() || this.O0.contains(m2Var)) {
            return false;
        }
        m2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 == -1 || i10 == -2) {
            if (!this.O0.isEmpty()) {
                m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
                m2Var2.onPause();
                k kVar = m2Var2.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(m2Var2.actionBar);
                }
                View view = m2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    m2Var2.onRemoveFromParent();
                    viewGroup.removeView(m2Var2.fragmentView);
                }
                m2Var2.detachSheets();
            }
            this.O0.add(m2Var);
            if (i10 != -2) {
                View view2 = m2Var.fragmentView;
                if (view2 == null) {
                    view2 = m2Var.performCreateView(activity);
                    if (view2 != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(m2Var, i11);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.j(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        m2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!m2Var.hasOwnBackground && view2.getBackground() == null) {
                    view2.setBackgroundColor(h6.w0(null, h6.d6, false));
                }
                this.s.addView(view2, w7.y5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
                k kVar2 = m2Var.actionBar;
                if (kVar2 != null && kVar2.K) {
                    if (this.C0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) m2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(m2Var.actionBar);
                    }
                    this.s.addView(m2Var.actionBar);
                }
                m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                m2Var.attachSheets(this.s);
                m2Var.onResume();
                m2Var.onTransitionAnimationEnd(false, true);
                m2Var.onTransitionAnimationEnd(true, true);
                m2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View view3 = m2Var.fragmentView;
                if (view3 == null) {
                    view3 = m2Var.performCreateView(activity);
                    if (view3 != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(m2Var, i11);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.j(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        m2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!m2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(h6.w0(null, h6.d6, false));
                }
                v vVar = this.s;
                vVar.addView(view3, Utilities.clamp(0, vVar.getChildCount(), 0), w7.y5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
                k kVar3 = m2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.C0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) m2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(m2Var.actionBar);
                    }
                    this.s.addView(m2Var.actionBar);
                }
                m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                m2Var.attachSheets(this.s);
                i10 = 0;
            }
            this.O0.add(i10, m2Var);
            I("addFragmentToStack");
        }
        if (!this.A0) {
            setVisibility(0);
            View view4 = this.B0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.O0.isEmpty()) {
            return;
        }
        int size = this.O0.size() - 1;
        if (this.O0.isEmpty()) {
            return;
        }
        if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((m2) this.O0.get(size)).fragmentView == null) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                m2 m2Var = (m2) this.O0.get(i11);
                k kVar = m2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(m2Var.actionBar);
                }
                View view = m2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    m2Var.onPause();
                    m2Var.onRemoveFromParent();
                    viewGroup.removeView(m2Var.fragmentView);
                }
            }
            m2 m2Var2 = (m2) this.O0.get(size);
            m2Var2.setParentLayout(this);
            View view2 = m2Var2.fragmentView;
            if (view2 == null) {
                view2 = m2Var2.performCreateView(this.K0);
                if (view2 != null && m2Var2.isSupportEdgeToEdge() && m2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(m2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.j(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    m2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, w7.y5.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(m2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(m2Var2.drawEdgeNavigationBar());
            k kVar2 = m2Var2.actionBar;
            if (kVar2 != null && kVar2.K) {
                if (this.C0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(m2Var2.actionBar);
                this.s.addView(m2Var2.actionBar);
            }
            m2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
            m2Var2.attachSheets(this.s);
            m2Var2.onResume();
            m2Var2.onBecomeFullyVisible();
            this.y = m2Var2.actionBar;
            if (m2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            view2.setBackgroundColor(h6.w0(null, h6.d6, false));
        }
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
            j6 j6Var = (j6) arrayList.get(i10);
            iArr[i10] = j6Var.c();
            i6 i6Var = j6Var.h;
            j6Var.h = null;
            if (i6Var != null) {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.contains(i6Var)) {
                    arrayList2.add(i6Var);
                }
            }
        }
    }

    public final void d0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.E0 = 0.0f;
            this.F0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.D0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E == null || v(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.n1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        }
        this.U0 = true;
        if (this.M0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.V0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.M0) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y4 y4Var = this.J0;
        return (y4Var != null && y4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r1.getWindowView() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.getWindowView() != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i2 i2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.n1.d));
        r rVar = this.G;
        i2 i2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            i2Var = this.G.getLastSheet();
            if (i2Var.attachedToParent()) {
            }
        }
        i2Var = null;
        if (i2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            i2Var = getLastFragment().getLastSheet();
            if (i2Var.attachedToParent()) {
            }
            if (i2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.k1 = z10;
                }
                if (!this.k1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.k1 = false;
                    }
                    return i2Var2.getWindowView().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.k1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        i2Var2 = i2Var;
        if (i2Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.k1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0278, code lost:
    
        if (r21.T0 != (-1)) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        v vVar;
        View childAt;
        int i13;
        int i14;
        WindowInsets rootWindowInsets;
        float f7;
        float min;
        cf.c cVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.O);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.v) {
            paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
        } else if (view == this.s) {
            i10 = paddingLeft2;
            i11 = paddingRight;
            int save = canvas.save();
            if (view != this.E || (cVar = this.F) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.U0;
                boolean z11 = this.X0;
                int width2 = getWidth();
                getY();
                getHeight();
                cVar.q(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.U0 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31 && !this.b && (paddingRight != 0 || this.T0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f10 = paddingRight;
                        rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.d1) {
                                f7 = 56.0f;
                                min = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.clamp01(f10 / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f7 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f10) / AndroidUtilities.dpf2(56.0f));
                            }
                            float clamp = (paddingRight <= AndroidUtilities.dp(f7) || this.T || !this.d1) ? Utilities.clamp(paddingRight, AndroidUtilities.dp(f7), 0) : f10;
                            if (!this.d1 || this.g1) {
                                canvas2.translate(-clamp, 0.0f);
                                i10 = (int) (i10 + clamp);
                            } else {
                                canvas2.translate(-clamp, 0.0f);
                                rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                                i10 = (int) (i10 + clamp);
                            }
                            canvas2.scale(min, min, this.g1 ? rectF.right - AndroidUtilities.dp(82.0f) : rectF.left + AndroidUtilities.dp(82.0f), this.d1 ? this.f1 : rectF.centerY());
                        }
                        RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                        RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                        RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                        RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                        float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                        float[] fArr = this.W0;
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
                        if (this.N0) {
                            float clamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            fArr[0] = fArr[0] * clamp01;
                            fArr[1] = fArr[1] * clamp01;
                            fArr[6] = fArr[6] * clamp01;
                            fArr[7] = fArr[7] * clamp01;
                        }
                        Path path = this.V0;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.v && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    i10 += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (D()) {
                        i10 = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!B() && !this.h) {
                canvas2.clipRect(i11, 0, i10, getHeight());
            }
            if ((!this.h || this.a0) && view == (vVar = this.s) && (childAt = vVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.J == null) {
                    int dp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - dp) / 2;
                    int translationY = (int) ((vVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    h6.s0.setBounds(measuredWidth, translationY, dp + measuredWidth, (dp / 2) + translationY);
                    h6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas2.restoreToCount(save2);
            i13 = paddingRight != 0 ? -1 : -1;
            i14 = this.T0;
            if (i14 == i13) {
                i14 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = w7.q.b((i14 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (b10 > 0) {
                    int i15 = v(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i12 < 31 || this.b) {
                        Drawable drawable = q1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i15);
                        q1.setAlpha(b10);
                        q1.draw(canvas2);
                    }
                }
            } else if (view == this.v) {
                r1.setColor(Color.argb((int) (w7.q.a(i14 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.T0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, r1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i11, 0.0f, i10, getHeight() * 1.5f, r1);
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
        if (!B()) {
            canvas2.clipRect(i11, 0, i10, getHeight());
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
        i14 = this.T0;
        if (i14 == i13) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z10) {
        Animator customSlideTransition;
        m2 m2Var = !this.O0.isEmpty() ? (m2) org.telegram.ui.Cells.c1.i(1, this.O0) : null;
        if (m2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = m2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? 320 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, 0.0f);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(rr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, r5.getMeasuredWidth() + (this.d1 ? AndroidUtilities.dp(56.0f) : 0));
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(rr.h);
                }
            }
        }
        Animator customSlideTransition2 = m2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        if (m2Var2 != null && (customSlideTransition = m2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        m2 m2Var = !this.O0.isEmpty() ? (m2) org.telegram.ui.Cells.c1.i(1, this.O0) : null;
        return (m2Var == null || m2Var.getLastStoryViewer() == null || !m2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ce, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r0.putString("theme", r7.m());
        r0.apply();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a5 a5Var, Runnable runnable) {
        g6 g6Var;
        final int i10 = 1;
        if (this.W || this.Q) {
            this.n0 = true;
            this.o0 = a5Var.a;
            this.q0 = a5Var.c;
            this.r0 = a5Var.b;
            this.p0 = a5Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.k0;
        File file = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.k0 = null;
        }
        int size = a5Var.e ? 1 : this.O0.size();
        c9 c9Var = new c9(this, size, a5Var, runnable, 8);
        if (size < 1 || !a5Var.f || !a5Var.g) {
            c9Var.run();
            return;
        }
        int i11 = a5Var.b;
        if (i11 != -1 && (g6Var = a5Var.a) != null) {
            g6Var.u(i11);
            h6.t1(a5Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            h6.t(a5Var.a, true, a5Var.c);
            c9Var.run();
            return;
        }
        g6 g6Var2 = a5Var.a;
        boolean z10 = a5Var.c;
        final int i12 = 0;
        p pVar = new p(c9Var, i12);
        int i13 = h6.a;
        if (g6Var2 == null) {
            pVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (g6Var2.b == null && g6Var2.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.apply();
            }
            h6.ql.clear();
            h6.g0 = 0;
            h6.h0 = null;
            h6.e0 = null;
            h6.f0 = null;
            if (!z10 && h6.M == null) {
                h6.K = g6Var2;
                if (h6.I != h6.J) {
                    i10 = 0;
                }
                if (i10 != 0) {
                    h6.T = 2000;
                    h6.U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new ai.f(16), 2100L);
                }
            }
            h6.I = g6Var2;
            h6.n1(false, false);
            if (h6.M == null && !h6.Q) {
                MessagesController.getInstance(g6Var2.E).saveTheme(g6Var2, g6Var2.k(false), z10, false);
            }
            pVar.run();
            return;
        }
        String[] strArr = new String[1];
        final ai.s4 s4Var = new ai.s4(strArr, g6Var2, z10, pVar, 10);
        String str = g6Var2.d;
        if (str != null) {
            Utilities.themeQueue.postRunnable(new ai.h5(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.j5
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    SparseIntArray sparseIntArray = (SparseIntArray) obj;
                    switch (i12) {
                        case 0:
                            h6.ql = sparseIntArray;
                            s4Var.run();
                            break;
                        default:
                            h6.ql = sparseIntArray;
                            s4Var.run();
                            break;
                    }
                }
            }, file, str, (String[]) (objArr2 == true ? 1 : 0)));
        } else {
            Utilities.themeQueue.postRunnable(new ai.h5(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.j5
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    SparseIntArray sparseIntArray = (SparseIntArray) obj;
                    switch (i10) {
                        case 0:
                            h6.ql = sparseIntArray;
                            s4Var.run();
                            break;
                        default:
                            h6.ql = sparseIntArray;
                            s4Var.run();
                            break;
                    }
                }
            }, new File(g6Var2.b), (String) (objArr == true ? 1 : 0), strArr));
        }
    }

    public final void g(g6 g6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(g6Var, i10, z10, z11), runnable);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public m2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (m2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public /* bridge */ /* synthetic */ e3 getBottomSheet() {
        return null;
    }

    public m3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.a0 && !this.n) {
            return 0.0f;
        }
        m2 m2Var = this.I;
        return ((m2Var == null || !m2Var.inPreviewMode) ? this.s : this.v).getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public List<m2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public m2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
    }

    public m2 getLastFragmentIncludeMainTabs() {
        m2 lastFragment = getLastFragment();
        return lastFragment instanceof yg0 ? ((yg0) lastFragment).X() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public d5 getMessageDrawableOutMediaStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public d5 getMessageDrawableOutStart() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.b5
    public List<n9> getPulledDialogs() {
        return this.P0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public m2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            m2 m2Var = (m2) getFragmentStack().get(size);
            if (m2Var != null && !m2Var.isFinishing() && !m2Var.isRemovingFromStack()) {
                return m2Var;
            }
        }
        return null;
    }

    public dz getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.b5
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override // org.telegram.ui.ActionBar.b5
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

    public final void h(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.i1;
            StringBuilder h = v7.j.h(str, " ");
            h.append(this.O0.size());
            arrayList.add(0, h.toString());
            if (this.i1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.i1.get(i10));
                }
                this.i1 = arrayList2;
            }
        }
        o oVar = this.j1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.s0) {
            U(this.t0, this.u0);
            this.s0 = false;
        } else if (this.n0) {
            a5 a5Var = new a5(this.o0, this.r0, this.q0, false);
            boolean z10 = this.p0;
            if (!z10) {
                a5Var.g = z10;
                a5Var.f = z10;
            }
            f(a5Var, null);
            this.o0 = null;
            this.n0 = false;
        }
    }

    public final boolean j() {
        if (this.a0) {
            return false;
        }
        if (this.W && (this.v0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.W;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        m2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            y4 y4Var = this.J0;
            if ((y4Var != null && !y4Var.k(this)) || j() || this.O0.isEmpty()) {
                return;
            }
            Activity activity = this.K0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i10 = 0;
            boolean z12 = !z11 && (this.h || this.a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
            AnimatorSet animatorSet = null;
            m2 m2Var2 = this.O0.size() > 1 ? (m2) org.telegram.ui.Cells.c1.i(2, this.O0) : null;
            if (m2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, h6.w0(null, h6.s8, false) == -1 || (m2Var2.hasForceLightStatusBar() && !h6.A0().q()));
                v vVar = this.s;
                this.s = this.v;
                this.v = vVar;
                m2Var2.setParentLayout(this);
                View view = m2Var2.fragmentView;
                if (view == null && (view = m2Var2.performCreateView(activity)) != null && m2Var2.isSupportEdgeToEdge() && m2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(m2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.j(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        m2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(m2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(m2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = m2Var2.actionBar;
                    if (kVar != null && kVar.K) {
                        if (this.C0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(m2Var2.actionBar);
                        this.s.addView(m2Var2.actionBar);
                    }
                    m2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    m2Var2.attachSheets(this.s);
                }
                this.H = m2Var2;
                this.I = m2Var;
                m2Var2.onTransitionAnimationStart(true, true);
                m2Var.onTransitionAnimationStart(false, true);
                m2Var2.onResume();
                if (this.k0 != null) {
                    this.i0 = m2Var2.getThemeDescriptions();
                }
                this.y = m2Var2.actionBar;
                if (!m2Var2.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(h6.w0(null, h6.d6, false));
                }
                if (z12) {
                    this.v0 = System.currentTimeMillis();
                    this.W = true;
                    m2Var.setRemovingFromStack(true);
                    int i11 = 3;
                    this.y0 = new org.telegram.messenger.video.o(this, m2Var, m2Var2, i11);
                    if (!this.h && !this.a0) {
                        animatorSet = m2Var.onCustomTransitionAnimation(false, new o(this, i11));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.v.b)) {
                            d0(false, true, z13 || this.a0);
                        } else {
                            u2 u2Var = new u2(this, 1);
                            this.d = u2Var;
                            AndroidUtilities.runOnUIThread(u2Var, 200L);
                        }
                    } else {
                        this.K = animatorSet;
                        qc qcVar = qc.w;
                        if (qcVar != null && qcVar.l) {
                            qcVar.b();
                        }
                    }
                    I("closeLastFragment");
                } else {
                    m(m2Var);
                    m2Var.onTransitionAnimationEnd(false, true);
                    m2Var2.onTransitionAnimationEnd(true, true);
                    m2Var2.onBecomeFullyVisible();
                }
            } else if (!this.A0 || z11) {
                b0(m2Var, false);
                setVisibility(8);
                View view2 = this.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.v0 = System.currentTimeMillis();
                this.W = true;
                this.y0 = new ki.n(28, this, m2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view3 = this.B0;
                if (view3 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.K = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.K.setInterpolator(this.N);
                this.K.setDuration(200L);
                this.K.addListener(new q(this, 0));
                this.K.start();
            }
            m2Var.onFragmentClosed();
        }
    }

    public final void m(m2 m2Var) {
        m2Var.finishing = true;
        m2Var.onPause();
        m2Var.onFragmentDestroy();
        m2Var.setParentLayout(null);
        this.O0.remove(m2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.s);
        v vVar = this.w;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((m2) org.telegram.ui.Cells.c1.i(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.l1 l1Var) {
        boolean z10 = this.M0;
        if (z10) {
            if (!(view instanceof v) || !((v) view).x) {
                r0.i0.b(view, r0.l1.b);
                return;
            }
            int i10 = l1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.l1 l1Var2 = r0.l1.b;
            int i11 = Build.VERSION.SDK_INT;
            r0.b1 a1Var = i11 >= 34 ? new r0.a1(l1Var2) : i11 >= 30 ? new r0.z0(l1Var2) : i11 >= 29 ? new r0.y0(l1Var2) : new r0.x0(l1Var2);
            a1Var.c(8, i0.b.b(0, 0, 0, max));
            r0.i0.b(view, a1Var.b());
            return;
        }
        boolean z11 = this.N0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.n1;
        i0.b bVar2 = this.o1;
        if (view instanceof m3) {
            AndroidUtilities.setViewLayoutMargins(view, z11 ? 0 : bVar.a, 0, z12 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof v) {
            v vVar = (v) view;
            int v = v(false);
            int i12 = v > 0 ? bVar.d + v : 0;
            y3 y3Var = vVar.w;
            boolean z13 = y3Var == y3.c;
            int i13 = (z13 || z11) ? 0 : bVar2.a;
            int i14 = (z13 || z12) ? 0 : bVar2.c;
            int i15 = (!z13 || z11) ? bVar2.a : 0;
            int i16 = (!z13 || z12) ? bVar2.c : 0;
            if (y3Var == y3.a) {
                i12 = Math.max(i12, bVar2.d);
                r0.i0.b(view, r0.l1.b);
            } else {
                r0.i0.b(view, l1Var.a.m(i15, 0, i16, i12));
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
        if (this.O0.isEmpty()) {
            return;
        }
        int size = this.O0.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2 m2Var = (m2) this.O0.get(i10);
            m2Var.onConfigurationChanged(configuration);
            Dialog dialog = m2Var.visibleDialog;
            if (dialog instanceof e3) {
                ((e3) dialog).onConfigurationChanged(configuration);
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
        return this.T || j() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        y yVar;
        if (i10 == 82 && !j() && !this.Q && (kVar = this.y) != null && !kVar.s() && (yVar = kVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (u0Var.q()) {
                            u0Var.M(null, null);
                            break;
                        }
                        if (u0Var.S) {
                            yVar.o(((Integer) u0Var.getTag()).intValue());
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
        if (this.Z0 != z11) {
            this.Z0 = z11;
            this.a1 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                m3 m3Var = this.E;
                if (childAt == m3Var) {
                    m3Var.setCurrentAccount(UserConfig.selectedAccount);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection());
                int i23 = i22 & 112;
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
                        if (childAt != this.E && this.a1 != 0 && (this.X0 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i19 = this.a1;
                        } else if (childAt == this.E) {
                            this.a1 = i19;
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
        m2 m2Var = !this.O0.isEmpty() ? (m2) org.telegram.ui.Cells.c1.i(1, this.O0) : null;
        if (m2Var != null && !m2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            m2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, TLObject.FLAG_30));
            return;
        }
        y4 y4Var = this.J0;
        if (y4Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            y4Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        this.X0 = C() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!j() && !this.w0 && !this.T && !this.d1) {
            if (this.O0.size() > 1 && ((rVar = this.G) == null || rVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                        this.U.addMovement(motionEvent);
                        if (this.W || this.h || !this.P || this.Q || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                            if (this.Q) {
                                if (!this.V) {
                                    Activity activity = this.K0;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onBeginSlide();
                                    this.V = true;
                                }
                                if (D()) {
                                    float f7 = max;
                                    this.s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                    setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                } else {
                                    float f10 = max;
                                    this.s.setTranslationX(f10);
                                    setInnerTranslationX(f10);
                                }
                            }
                        } else if (((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            O();
                        } else {
                            this.P = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        this.U.addMovement(motionEvent);
                        this.U.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
                        if (!this.h && !this.a0 && !this.Q && m2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.U.getXVelocity();
                            float yVelocity = this.U.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && m2Var.canBeginSlide()) {
                                this.R = (int) motionEvent.getX();
                                O();
                                if (!this.V) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.V = true;
                                }
                            }
                        }
                        if (this.Q) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.U.getXVelocity();
                            float yVelocity2 = this.U.getYVelocity();
                            if (!D() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z10 = true;
                                }
                            }
                            e(z10);
                        } else {
                            this.P = false;
                            this.Q = false;
                            v vVar = this.s;
                            if (vVar != null) {
                                vVar.setLayerType(0, null);
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
                        v vVar2 = this.s;
                        if (vVar2 != null) {
                            vVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.U;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.U = null;
                        }
                    }
                } else if (((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
                    this.x0 = motionEvent.getPointerId(0);
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
                    v vVar3 = this.s;
                    if (vVar3 != null) {
                        vVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.Q;
        }
        return false;
    }

    public final void p(Canvas canvas, int i10, int i11) {
        if (p1 == null || !SharedConfig.drawActionBarShadow) {
            return;
        }
        int i12 = i10 / 2;
        if (p1.getAlpha() != i12) {
            p1.setAlpha(i12);
        }
        p1.setBounds(0, i11, getMeasuredWidth(), p1.getIntrinsicHeight() + i11);
        p1.draw(canvas);
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        m2Var2.fragmentView.setOutlineProvider(null);
        m2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        m2Var2.fragmentView.setLayoutParams(layoutParams);
        T(m2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(m2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(m2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new rr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ai.z(12, this, m2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(m2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(m2Var2.drawEdgeNavigationBar());
        m2Var2.setInPreviewMode(false);
        m2Var2.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (h6.w0(null, h6.s8, false) != -1 && (!m2Var2.hasForceLightStatusBar() || h6.A0().q())) {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        return !this.O0.isEmpty() && ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setDelegate(y4 y4Var) {
        this.J0 = y4Var;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setDrawerLayoutContainer(x3 x3Var) {
        this.x = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setFragmentPanTranslationOffset(int i10) {
        v vVar = this.s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setFragmentStack(List<m2> list) {
        this.O0 = list;
        m3 m3Var = this.E;
        if (m3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            m3Var.I.remove(oVar);
            m3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            m3 m3Var2 = new m3(activity, this);
            this.E = m3Var2;
            this.F = new cf.c(m3Var2);
            m3 m3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            m3Var3.I.add(oVar3);
            m3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            v3 v3Var = LaunchActivity.G1.y0;
            if (v3Var != null) {
                v3Var.setTabsView(this.E);
            }
        }
        v vVar = this.v;
        if (vVar != null) {
            AndroidUtilities.removeFromParent(vVar);
        }
        v vVar2 = new v(activity, this);
        this.v = vVar2;
        addView(vVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        v vVar3 = this.s;
        if (vVar3 != null) {
            AndroidUtilities.removeFromParent(vVar3);
        }
        v vVar4 = new v(activity, this);
        this.s = vVar4;
        addView(vVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        v vVar5 = this.w;
        if (vVar5 != null) {
            AndroidUtilities.removeFromParent(vVar5);
        }
        v vVar6 = new v(activity, this);
        this.w = vVar6;
        this.b1.a = vVar6;
        addView(vVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.w.setLayoutParams(layoutParams4);
        r rVar = this.G;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.G;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, w7.y5.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        Iterator it = this.O0.iterator();
        while (it.hasNext()) {
            ((m2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setInBubbleMode(boolean z10) {
        this.f = z10;
    }

    public void setInnerTranslationX(float f7) {
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.O0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float clamp01 = D() ? Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6)) : f7 / this.s.getMeasuredWidth();
        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        m2Var.onSlideProgress(false, clamp01);
        m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        float a2 = w7.q.a(clamp01 * 2.0f, 0.0f, 1.0f);
        if (!m2Var2.isBeginToShow() || (navigationBarColor = m2Var2.getNavigationBarColor()) == (navigationBarColor2 = m2Var.getNavigationBarColor())) {
            return;
        }
        m2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setNavigationBarColor(int i10) {
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        x3 x3Var = this.x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i10);
        }
        m3 m3Var = this.E;
        if (m3Var != null) {
            m3Var.i(i10, (this.Q || this.T) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.T0 = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setPulledDialogs(List<n9> list) {
        this.P0 = list;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.C0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        this.m0 = f7;
        ArrayList arrayList = this.h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.b0.get(i10);
            int[] iArr2 = (int[]) this.c0.get(i10);
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                int red = Color.red(iArr2[i11]);
                int green = Color.green(iArr2[i11]);
                int blue = Color.blue(iArr2[i11]);
                int alpha = Color.alpha(iArr2[i11]);
                int red2 = Color.red(iArr[i11]);
                int green2 = Color.green(iArr[i11]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i11]);
                int i12 = size;
                int i13 = i10;
                int argb = Color.argb(Math.min(255, (int) (((alpha - r3) * f7) + Color.alpha(iArr[i11]))), Math.min(255, (int) (((red - red2) * f7) + red2)), Math.min(255, (int) (((green - green2) * f7) + green2)), Math.min(255, (int) (((blue - blue2) * f7) + blue2)));
                j6 j6Var = (j6) arrayList2.get(i11);
                int i14 = j6Var.f;
                d6 d6Var = j6Var.o;
                if (d6Var != null) {
                    d6Var.L0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = h6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                j6Var.e(argb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.j0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            i6 i6Var = (i6) arrayList4.get(i15);
            if (i6Var != null) {
                i6Var.b();
                i6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                j6 j6Var2 = (j6) this.i0.get(i16);
                j6Var2.e(h6.v0(j6Var2.f, j6Var2.o), false, false);
            }
        }
        rn rnVar = this.g0;
        if (rnVar != null) {
            un unVar = rnVar.a;
            unVar.V.x0.invalidate();
            unVar.I.I = f7;
            unVar.J.I = f7;
            unVar.k(f7);
        }
        y4 y4Var = this.J0;
        if (y4Var != null) {
            y4Var.a(f7);
        }
        x(this);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final m2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            m2 m2Var = (m2) getFragmentStack().get(size);
            if (m2Var != null && !m2Var.isFinishing() && !m2Var.isRemovingFromStack() && qg0.class.isInstance(m2Var)) {
                return m2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        m3 m3Var;
        if (!this.L0 || (m3Var = this.E) == null) {
            return 0;
        }
        return z10 ? (int) m3Var.G : m3Var.H;
    }

    public final dz w() {
        Activity activity = this.K0;
        if (activity == null) {
            return null;
        }
        if (this.G == null) {
            r rVar = new r(this);
            this.G = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.G;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, w7.y5.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        return this.h || this.a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg.b
    public final List z() {
        m2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof mg.b) {
            arrayList.addAll(((mg.b) lastFragment).z());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public ViewGroup getView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setHighlightActionButtons(boolean z10) {
    }
}
