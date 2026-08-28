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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ih.m9;
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
import org.telegram.messenger.od;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.ki;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.l80;
import org.telegram.ui.ln;
import org.telegram.ui.ng0;
import org.telegram.ui.on;
import org.telegram.ui.qn;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements b5, uf.b {
    public static Drawable l1;
    public static Drawable m1;
    public static Paint n1;
    public m3 A;
    public float A0;
    public b3.b B;
    public long B0;
    public r C;
    public String C0;
    public o2 D;
    public int D0;
    public o2 E;
    public l80 E0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public y4 F0;
    public AnimatorSet G;
    public final Activity G0;
    public final DecelerateInterpolator H;
    public final boolean H0;
    public final OvershootInterpolator I;
    public boolean I0;
    public final AccelerateDecelerateInterpolator J;
    public boolean J0;
    public float K;
    public List K0;
    public boolean L;
    public List L0;
    public boolean M;
    public final Rect M0;
    public int N;
    public boolean N0;
    public int O;
    public Runnable O0;
    public boolean P;
    public int P0;
    public VelocityTracker Q;
    public boolean Q0;
    public boolean R;
    public final Path R0;
    public boolean S;
    public final float[] S0;
    public boolean T;
    public boolean T0;
    public final ArrayList U;
    public final int[] U0;
    public final ArrayList V;
    public boolean V0;
    public final g5.b W;
    public int W0;
    public final org.telegram.ui.Components.y5 X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a;
    public d5 a0;
    public boolean a1;
    public boolean b;
    public d5 b0;
    public float b1;
    public Window c;
    public ln c0;
    public boolean c1;
    public Runnable d;
    public final ArrayList d0;
    public AnimatorSet d1;
    public Runnable e;
    public ArrayList e0;
    public ArrayList e1;
    public boolean f;
    public final ArrayList f0;
    public final o f1;
    public AnimatorSet g0;
    public boolean g1;
    public boolean h;
    public final AnimationNotificationsLocker h0;
    public int h1;
    public float i0;
    public r0.m1 i1;
    public boolean j0;
    public i0.b j1;
    public e6 k0;
    public i0.b k1;
    public boolean l0;
    public boolean m0;
    public boolean n;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public ColorDrawable r;
    public long r0;
    public w s;
    public boolean s0;
    public int t0;
    public Runnable u0;
    public w v;
    public Runnable v0;
    public w w;
    public boolean w0;
    public x3 x;
    public View x0;
    public k y;
    public boolean y0;
    public s z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.H = new DecelerateInterpolator(1.5f);
        this.I = new OvershootInterpolator(1.02f);
        this.J = new AccelerateDecelerateInterpolator();
        this.U = new ArrayList();
        this.V = new ArrayList();
        g5.b bVar = new g5.b(28);
        bVar.b = new SparseIntArray();
        bVar.c = new int[]{f6.Aa, f6.Da, f6.Ea, f6.Fa, f6.ac, f6.Ca};
        this.W = bVar;
        this.d0 = new ArrayList();
        this.f0 = new ArrayList();
        this.h0 = new AnimationNotificationsLocker();
        this.M0 = new Rect();
        this.P0 = -1;
        this.R0 = new Path();
        this.S0 = new float[8];
        this.U0 = new int[2];
        this.X0 = new org.telegram.ui.Components.y5(this, 280L, gr.h);
        this.e1 = new ArrayList();
        this.f1 = new o(this, 2);
        i0.b bVar2 = i0.b.e;
        this.j1 = bVar2;
        this.k1 = bVar2;
        this.G0 = (Activity) context;
        this.H0 = z10;
        if (m1 == null) {
            m1 = getResources().getDrawable(R.drawable.layer_shadow);
            l1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            n1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(this, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(ArrayList arrayList, View view) {
        if (view instanceof uf.b) {
            arrayList.addAll(((uf.b) view).A());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                E(arrayList, viewGroup.getChildAt(i9));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z10) {
            if (actionBarLayout.K0.size() >= 2) {
                ((o2) j3.r0.k(1, actionBarLayout.K0)).prepareFragmentToSlide(true, false);
                o2 o2Var = (o2) j3.r0.k(2, actionBarLayout.K0);
                o2Var.prepareFragmentToSlide(false, false);
                o2Var.onPause();
                View view = o2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    o2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                }
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(o2Var.actionBar);
                }
                o2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.K0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            o2 o2Var2 = (o2) j3.r0.k(1, actionBarLayout.K0);
            o2Var2.prepareFragmentToSlide(true, false);
            o2Var2.onPause();
            o2Var2.onFragmentDestroy();
            o2Var2.setParentLayout(null);
            List list = actionBarLayout.K0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view2 = actionBarLayout.w;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.K0.size() > 0) {
                o2 o2Var3 = (o2) j3.r0.k(1, actionBarLayout.K0);
                actionBarLayout.y = o2Var3.actionBar;
                o2Var3.onResume();
                o2Var3.onBecomeFullyVisible();
                o2Var3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.M = false;
        actionBarLayout.P = false;
        actionBarLayout.s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
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

    public static void x(ViewGroup viewGroup) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof w5) {
                ((w5) childAt).d();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uf.b
    public final List A() {
        o2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof uf.b) {
            arrayList.addAll(((uf.b) lastFragment).A());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final boolean B() {
        return this.S || this.P;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.M0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.Z0 && this.a1;
    }

    public final void F(boolean z10) {
        H();
        K();
        Runnable runnable = this.d;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.G = null;
        }
        s sVar = this.z0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.z0 = null;
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
        if (this.T || this.M || j() || this.K0.isEmpty()) {
            return;
        }
        j20 j20Var = j20.Z;
        if (j20Var != null && j20Var.w) {
            j20Var.e(false);
            return;
        }
        if (!e0() && (kVar = this.y) != null && !kVar.s()) {
            k kVar2 = this.y;
            if (kVar2.j0) {
                kVar2.h(true);
                return;
            }
        }
        r rVar = this.C;
        if ((rVar == null || rVar.onBackPressed(true)) && ((o2) j3.r0.k(1, this.K0)).onBackPressed(true) && !this.K0.isEmpty()) {
            l(true, false);
        }
    }

    public final void H() {
        if (!this.S || this.u0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            this.G = null;
            animatorSet.cancel();
        }
        this.S = false;
        this.T = false;
        this.r0 = 0L;
        this.D = null;
        this.E = null;
        Runnable runnable = this.u0;
        this.u0 = null;
        if (runnable != null) {
            runnable.run();
        }
        i();
        i();
    }

    public final void I(String str) {
        Runnable runnable = this.O0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((o2) it.next()).onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (!this.S || (runnable = this.v0) == null) {
            return;
        }
        this.S = false;
        this.T = false;
        this.r0 = 0L;
        this.D = null;
        this.E = null;
        this.v0 = null;
        runnable.run();
        i();
    }

    public final void L() {
        if (!this.K0.isEmpty()) {
            ((o2) j3.r0.k(1, this.K0)).onPause();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.K0.isEmpty()) {
            ((o2) j3.r0.k(1, this.K0)).onResume();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.A == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.A.getX() + getX(), this.A.getY() + getY());
        this.A.draw(canvas);
        canvas.restore();
    }

    public final void O() {
        int i9 = 0;
        this.L = false;
        this.M = true;
        this.v.setVisibility(0);
        this.R = false;
        o2 o2Var = (o2) j3.r0.k(2, this.K0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.G0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            n nVar = new n(o2Var, i9);
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            o2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = o2Var.actionBar;
        if (kVar != null && kVar.G) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.y0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(f6.w0(null, f6.d6, false));
        }
        o2Var.onResume();
        if (this.g0 != null) {
            this.e0 = o2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((o2) j3.r0.k(1, this.K0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(o2 o2Var) {
        return R(new z4(o2Var));
    }

    public final boolean Q(o2 o2Var, boolean z10) {
        z4 z4Var = new z4(o2Var);
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
        o2 o2Var;
        int i9;
        LaunchActivity launchActivity;
        Dialog dialog;
        o2 o2Var2 = z4Var.a;
        boolean z10 = z4Var.b;
        boolean z11 = z4Var.c;
        boolean z12 = z4Var.d;
        boolean z13 = z4Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z4Var.f;
        int i10 = 0;
        if (o2Var2 == null || j() || !(((y4Var = this.F0) == null || !z12 || y4Var.l(this, z4Var)) && o2Var2.onFragmentCreate())) {
            return false;
        }
        y3 edgeToEdgeSupportMode = o2Var2.getEdgeToEdgeSupportMode();
        y3 y3Var2 = y3.a;
        int i11 = 1;
        boolean z14 = edgeToEdgeSupportMode != y3Var2;
        boolean drawEdgeNavigationBar = o2Var2.drawEdgeNavigationBar();
        o2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.C1) != null) {
            ArrayList arrayList2 = launchActivity.A0;
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
                ArrayList arrayList3 = LaunchActivity.C1.A0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof ki) || (visibleDialog instanceof mh.c3))) {
            m2 m2Var = new m2();
            m2Var.a = true;
            lastFragment.showAsSheet(o2Var2, m2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + o2Var2.getClass().getSimpleName() + " args=" + o2Var2.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = m9.u1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((m9) arrayList.get(i12)).q(false);
            i12++;
        }
        arrayList.clear();
        m3 m3Var = this.A;
        if (m3Var != null && !m3Var.c) {
            LaunchActivity.L();
        }
        if (this.h && this.T) {
            Runnable runnable = this.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.e = null;
            }
            l(false, true);
        }
        o2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.F;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.F.getParent()).removeView(this.F);
            }
            this.F = null;
        }
        this.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
        o2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.G0;
        if (activity.getCurrentFocus() != null && o2Var2.hideKeyboardOnShow() && !z13) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.K0.isEmpty()) {
            y3Var = y3Var2;
            o2Var = null;
        } else {
            y3Var = y3Var2;
            o2Var = (o2) j3.r0.k(1, this.K0);
        }
        o2Var2.setParentLayout(this);
        View view = o2Var2.fragmentView;
        if (view == null) {
            view = o2Var2.performCreateView(activity);
            if (view != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(o2Var2, i10);
                WeakHashMap weakHashMap = r0.j0.a;
                r0.b0.j(view, nVar);
                this.v.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                o2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.v.addView(view);
        w wVar = this.v;
        if (z13) {
            edgeToEdgeSupportMode = y3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.v.setDrawNavigationBar(!z13 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.v.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i9 = AndroidUtilities.dp(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - i9) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i9 = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = o2Var2.getPreviewHeight();
            int i13 = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0 && previewHeight < getMeasuredHeight() - i13) {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i13) - previewHeight) / 2) + i13;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    layoutParams2.bottomMargin = org.telegram.messenger.l0.C(8.0f, i9, layoutParams2.bottomMargin);
                }
                int dp = AndroidUtilities.dp(8.0f);
                layoutParams2.leftMargin = dp;
                layoutParams2.rightMargin = dp;
            }
            float f10 = 24.0f;
            int dp2 = AndroidUtilities.dp(f10);
            layoutParams2.bottomMargin = dp2;
            layoutParams2.topMargin = dp2;
            int i14 = AndroidUtilities.statusBarHeight;
            int i15 = dp2 + i14;
            layoutParams2.topMargin = i15;
            if (z14) {
                layoutParams2.topMargin = i15 + i14;
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
        k kVar = o2Var2.actionBar;
        if (kVar != null && kVar.G) {
            if (this.y0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(o2Var2.actionBar);
            this.v.addView(o2Var2.actionBar);
        }
        o2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        o2Var2.attachSheets(this.v);
        this.K0.add(o2Var2);
        I("presentFragment");
        o2Var2.onResume();
        this.y = o2Var2.actionBar;
        if (!o2Var2.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(f6.w0(null, f6.d6, false));
        }
        w wVar2 = this.s;
        w wVar3 = this.v;
        this.s = wVar3;
        this.v = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(o2Var2 instanceof qn)) {
                float dp4 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bg.q1 q1Var = ff.r0.a;
                view.setOutlineProvider(new ff.q0(0, dp4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float dp5 = AndroidUtilities.dp(29.0f);
                bg.q1 q1Var2 = ff.r0.a;
                view.setOutlineProvider(new ff.q0(0, dp5));
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
            f6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.w;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            T(o2Var, z10);
            View view2 = this.x0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.g0 != null) {
            this.e0 = o2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.x0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.x0.setVisibility(0);
            }
            if (o2Var != null) {
                o2Var.onTransitionAnimationStart(false, false);
                o2Var.onTransitionAnimationEnd(false, false);
            }
            o2Var2.onTransitionAnimationStart(true, false);
            o2Var2.onTransitionAnimationEnd(true, false);
            o2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.w0 && this.K0.size() == 1) {
            T(o2Var, z10);
            this.r0 = System.currentTimeMillis();
            this.S = true;
            this.v0 = new org.telegram.messenger.voip.l0(5, o2Var, o2Var2);
            ArrayList arrayList4 = new ArrayList();
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
            View view4 = this.x0;
            if (view4 != null) {
                view4.setVisibility(0);
                arrayList4.add(ObjectAnimator.ofFloat(this.x0, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            if (o2Var != null) {
                o2Var.onTransitionAnimationStart(false, false);
            }
            o2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.G.setInterpolator(gr.h);
            this.G.setDuration(200L);
            this.G.addListener(new q(this, 1));
            this.G.start();
            return true;
        }
        this.T = z13;
        this.r0 = System.currentTimeMillis();
        this.S = true;
        od odVar = new od(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, o2Var, o2Var2);
        o2 o2Var3 = o2Var;
        this.v0 = odVar;
        boolean needDelayOpenAnimation = o2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (o2Var3 != null) {
                o2Var3.onTransitionAnimationStart(false, false);
            }
            o2Var2.onTransitionAnimationStart(true, false);
        }
        this.N0 = false;
        this.E = o2Var3;
        this.D = o2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? o2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.v.b) && o2Var3 != null)) {
                o2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.G = onCustomTransitionAnimation;
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
            if (!o2Var2.needDelayOpenAnimation()) {
                d0(true, true, z13);
                return true;
            }
            gc.j jVar = new gc.j(this, o2Var2, z13, i11);
            this.e = jVar;
            AndroidUtilities.runOnUIThread(jVar, 200L);
            return true;
        }
        if (o2Var3 != null && !z13) {
            o2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, o2Var3, o2Var2, z13);
        if (o2Var2.needDelayOpenAnimation()) {
            this.e = new v(this, o2Var3, o2Var2, z13);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean S(o2 o2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(o2Var);
        z4Var.b = z10;
        z4Var.c = z11;
        z4Var.d = true;
        z4Var.e = false;
        return R(z4Var);
    }

    public final void T(o2 o2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (o2Var == null) {
            return;
        }
        o2Var.onBecomeFullyHidden();
        o2Var.onPause();
        if (z10) {
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.K0.remove(o2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = o2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                o2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    try {
                        viewGroup2.removeView(o2Var.fragmentView);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
            }
            k kVar = o2Var.actionBar;
            if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var.actionBar);
            }
            o2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z10, boolean z11) {
        if (this.S || this.M) {
            this.o0 = true;
            this.p0 = z10;
            this.q0 = z11;
            return;
        }
        int size = this.K0.size();
        if (!z10) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i9 = 0; i9 < size; i9++) {
            ((o2) this.K0.get(i9)).clearViews();
            ((o2) this.K0.get(i9)).setParentLayout(this);
        }
        y4 y4Var = this.F0;
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
        this.D = null;
        this.E = null;
    }

    public final void X() {
        while (this.K0.size() > 0) {
            b0((o2) this.K0.get(0), false);
        }
        View view = this.x0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i9) {
        if (i9 < 0 || i9 >= getFragmentStack().size()) {
            return;
        }
        Z((o2) getFragmentStack().get(i9));
    }

    public final void Z(o2 o2Var) {
        a0(o2Var, false);
    }

    public final void a0(o2 o2Var, boolean z10) {
        if ((this.K0.size() > 0 && j3.r0.k(1, this.K0) == o2Var) || (this.K0.size() > 1 && j3.r0.k(2, this.K0) == o2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z10);
        if (this.w0 && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.F0 != null && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            this.F0.k(this);
        }
        b0(o2Var, o2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        r0.m1 m1Var = this.i1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.V.add(iArr);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = ((h6) arrayList.get(i9)).b();
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        if (this.K0.contains(o2Var)) {
            if (z10 && j3.r0.k(1, this.K0) == o2Var) {
                o2Var.finishFragment();
                return;
            }
            if (j3.r0.k(1, this.K0) == o2Var && this.K0.size() > 1) {
                o2Var.finishFragment(false);
                return;
            }
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.K0.remove(o2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i9, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.F0;
        int i10 = 0;
        if ((y4Var != null && !y4Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.K0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.G0;
        if (i9 == -1 || i9 == -2) {
            if (!this.K0.isEmpty()) {
                o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
                o2Var2.onPause();
                k kVar = o2Var2.actionBar;
                if (kVar != null && kVar.G && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(o2Var2.actionBar);
                }
                View view = o2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup.removeView(o2Var2.fragmentView);
                }
                o2Var2.detachSheets();
            }
            this.K0.add(o2Var);
            if (i9 != -2) {
                View view2 = o2Var.fragmentView;
                if (view2 == null) {
                    view2 = o2Var.performCreateView(activity);
                    if (view2 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, i10);
                        WeakHashMap weakHashMap = r0.j0.a;
                        r0.b0.j(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!o2Var.hasOwnBackground && view2.getBackground() == null) {
                    view2.setBackgroundColor(f6.w0(null, f6.d6, false));
                }
                this.s.addView(view2, g7.e6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar2 = o2Var.actionBar;
                if (kVar2 != null && kVar2.G) {
                    if (this.y0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i9);
        } else {
            if (i9 == -3) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(o2Var, i10);
                        WeakHashMap weakHashMap2 = r0.j0.a;
                        r0.b0.j(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!o2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(f6.w0(null, f6.d6, false));
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.clamp(0, wVar.getChildCount(), 0), g7.e6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar3 = o2Var.actionBar;
                if (kVar3 != null && kVar3.G) {
                    if (this.y0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.s);
                i9 = 0;
            }
            this.K0.add(i9, o2Var);
            I("addFragmentToStack");
        }
        if (!this.w0) {
            setVisibility(0);
            View view4 = this.x0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.K0.isEmpty()) {
            return;
        }
        int size = this.K0.size() - 1;
        if (this.K0.isEmpty()) {
            return;
        }
        if (this.K0.isEmpty() || this.K0.size() - 1 != size || ((o2) this.K0.get(size)).fragmentView == null) {
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                o2 o2Var = (o2) this.K0.get(i10);
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.G && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(o2Var.actionBar);
                }
                View view = o2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    o2Var.onPause();
                    o2Var.onRemoveFromParent();
                    viewGroup.removeView(o2Var.fragmentView);
                }
            }
            o2 o2Var2 = (o2) this.K0.get(size);
            o2Var2.setParentLayout(this);
            View view2 = o2Var2.fragmentView;
            if (view2 == null) {
                view2 = o2Var2.performCreateView(this.G0);
                if (view2 != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(o2Var2, i9);
                    WeakHashMap weakHashMap = r0.j0.a;
                    r0.b0.j(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, g7.e6.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
            k kVar2 = o2Var2.actionBar;
            if (kVar2 != null && kVar2.G) {
                if (this.y0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(o2Var2.actionBar);
                this.s.addView(o2Var2.actionBar);
            }
            o2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
            o2Var2.attachSheets(this.s);
            o2Var2.onResume();
            o2Var2.onBecomeFullyVisible();
            this.y = o2Var2.actionBar;
            if (o2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            view2.setBackgroundColor(f6.w0(null, f6.d6, false));
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.d0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.U.add(iArr);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            h6 h6Var = (h6) arrayList.get(i9);
            iArr[i9] = h6Var.b();
            g6 g6Var = h6Var.h;
            h6Var.h = null;
            if (g6Var != null) {
                ArrayList arrayList2 = this.f0;
                if (!arrayList2.contains(g6Var)) {
                    arrayList2.add(g6Var);
                }
            }
        }
    }

    public final void d0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.A0 = 0.0f;
            this.B0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.z0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.A == null || v(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.A.getMeasuredHeight() + this.j1.d), getWidth(), getHeight(), this.A.getBackgroundPaint());
        }
        this.Q0 = true;
        if (this.I0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.R0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.I0) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y4 y4Var = this.F0;
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
        k2 k2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.j1.d));
        r rVar = this.C;
        k2 k2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            k2Var = this.C.getLastSheet();
            if (k2Var.attachedToParent()) {
            }
        }
        k2Var = null;
        if (k2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            k2Var = getLastFragment().getLastSheet();
            if (k2Var.attachedToParent()) {
            }
            if (k2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.g1 = z10;
                }
                if (!this.g1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.g1 = false;
                    }
                    return k2Var2.getWindowView().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.g1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        k2Var2 = k2Var;
        if (k2Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.g1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0278, code lost:
    
        if (r21.P0 != (-1)) goto L113;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i9;
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
        b3.b bVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.K);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.v) {
            paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
        } else if (view == this.s) {
            i9 = paddingLeft2;
            i10 = paddingRight;
            int save = canvas.save();
            if (view != this.A || (bVar = this.B) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.Q0;
                boolean z11 = this.T0;
                int width2 = getWidth();
                getY();
                getHeight();
                bVar.l(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.Q0 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31 && !this.b && (paddingRight != 0 || this.P0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = paddingRight;
                        rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.Z0) {
                                f10 = 56.0f;
                                min = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.clamp01(f11 / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f10 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f11) / AndroidUtilities.dpf2(56.0f));
                            }
                            float clamp = (paddingRight <= AndroidUtilities.dp(f10) || this.P || !this.Z0) ? Utilities.clamp(paddingRight, AndroidUtilities.dp(f10), 0) : f11;
                            if (!this.Z0 || this.c1) {
                                canvas2.translate(-clamp, 0.0f);
                                i9 = (int) (i9 + clamp);
                            } else {
                                canvas2.translate(-clamp, 0.0f);
                                rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                                i9 = (int) (i9 + clamp);
                            }
                            canvas2.scale(min, min, this.c1 ? rectF.right - AndroidUtilities.dp(82.0f) : rectF.left + AndroidUtilities.dp(82.0f), this.Z0 ? this.b1 : rectF.centerY());
                        }
                        RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                        RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                        RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                        RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                        float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                        float[] fArr = this.S0;
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
                        if (this.J0) {
                            float clamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            fArr[0] = fArr[0] * clamp01;
                            fArr[1] = fArr[1] * clamp01;
                            fArr[6] = fArr[6] * clamp01;
                            fArr[7] = fArr[7] * clamp01;
                        }
                        Path path = this.R0;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.v && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    i9 += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (D()) {
                        i9 = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!B() && !this.h) {
                canvas2.clipRect(i10, 0, i9, getHeight());
            }
            if ((!this.h || this.T) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.F == null) {
                    int dp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - dp) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    f6.s0.setBounds(measuredWidth, translationY, dp + measuredWidth, (dp / 2) + translationY);
                    f6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas2.restoreToCount(save2);
            i12 = paddingRight != 0 ? -1 : -1;
            i13 = this.P0;
            if (i13 == i12) {
                i13 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = g7.n.b((i13 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (b10 > 0) {
                    int i14 = v(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i11 < 31 || this.b) {
                        Drawable drawable = m1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                        m1.setAlpha(b10);
                        m1.draw(canvas2);
                    }
                }
            } else if (view == this.v) {
                n1.setColor(Color.argb((int) (g7.n.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.P0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, n1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i10, 0.0f, i9, getHeight() * 1.5f, n1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i10 = paddingLeft;
        i9 = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.A) {
        }
        canvas2 = canvas;
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (view != this.s) {
            }
        }
        int save22 = canvas2.save();
        if (!B()) {
            canvas2.clipRect(i10, 0, i9, getHeight());
        }
        if (!this.h) {
        }
        this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r.draw(canvas2);
        if (this.F == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i13 = this.P0;
        if (i13 == i12) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z10) {
        Animator customSlideTransition;
        o2 o2Var = !this.K0.isEmpty() ? (o2) j3.r0.k(1, this.K0) : null;
        if (o2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = o2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? 320 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.Z0 ? AndroidUtilities.dp(56.0f) : 0));
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) j3.r0.k(2, this.K0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.d1 = animatorSet;
        animatorSet.start();
        this.P = true;
    }

    public final boolean e0() {
        o2 o2Var = !this.K0.isEmpty() ? (o2) j3.r0.k(1, this.K0) : null;
        return (o2Var == null || o2Var.getLastStoryViewer() == null || !o2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a5 a5Var, Runnable runnable) {
        e6 e6Var;
        e6 e6Var2;
        final int i9 = 1;
        if (this.S || this.M) {
            this.j0 = true;
            this.k0 = a5Var.a;
            this.m0 = a5Var.c;
            this.n0 = a5Var.b;
            this.l0 = a5Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.g0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.g0 = null;
        }
        int size = a5Var.e ? 1 : this.K0.size();
        c3.d dVar = new c3.d(this, size, a5Var, runnable, 8);
        if (size < 1 || !a5Var.f || !a5Var.g) {
            dVar.run();
            return;
        }
        int i10 = a5Var.b;
        if (i10 != -1 && (e6Var2 = a5Var.a) != null) {
            e6Var2.u(i10);
            f6.t1(a5Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            f6.t(a5Var.a, true, a5Var.c);
            dVar.run();
            return;
        }
        e6 e6Var3 = a5Var.a;
        boolean z10 = a5Var.c;
        final int i11 = 0;
        p pVar = new p(dVar, i11);
        int i12 = f6.a;
        if (e6Var3 == null) {
            pVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
        } catch (Exception e10) {
            e = e10;
            e6Var = e6Var3;
        }
        if (e6Var3.b == null && e6Var3.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.apply();
            }
            f6.ql.clear();
            f6.g0 = 0;
            f6.h0 = null;
            f6.e0 = null;
            f6.f0 = null;
            if (!z10 && f6.M == null) {
                f6.K = e6Var3;
                if (f6.I != f6.J) {
                    i9 = 0;
                }
                if (i9 != 0) {
                    f6.T = 2000;
                    f6.U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new bg.d2(21), 2100L);
                }
            }
            f6.I = e6Var3;
            f6.n1(false, false);
            e6Var = e6Var3;
            if (f6.M == null && !f6.Q) {
                MessagesController.getInstance(e6Var.A).saveTheme(e6Var, e6Var.k(false), z10, false);
            }
            pVar.run();
        }
        String[] strArr = new String[1];
        final bg.d dVar2 = new bg.d(strArr, e6Var3, z10, pVar, 7);
        e6Var = e6Var3;
        try {
            String str = e6Var.d;
            if (str != null) {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.c(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.j5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i11) {
                            case 0:
                                f6.ql = sparseIntArray;
                                dVar2.run();
                                break;
                            default:
                                f6.ql = sparseIntArray;
                                dVar2.run();
                                break;
                        }
                    }
                }, obj, str, obj, 28));
            } else {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.c(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.j5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i9) {
                            case 0:
                                f6.ql = sparseIntArray;
                                dVar2.run();
                                break;
                            default:
                                f6.ql = sparseIntArray;
                                dVar2.run();
                                break;
                        }
                    }
                }, new File(e6Var.b), obj, strArr, 28));
            }
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
            if (f6.M == null) {
                MessagesController.getInstance(e6Var.A).saveTheme(e6Var, e6Var.k(false), z10, false);
            }
            pVar.run();
        }
    }

    public final void g(e6 e6Var, int i9, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(e6Var, i9, z10, z11), runnable);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public o2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (o2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public /* bridge */ /* synthetic */ f3 getBottomSheet() {
        return null;
    }

    public m3 getBottomSheetTabs() {
        return this.A;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.T && !this.n) {
            return 0.0f;
        }
        o2 o2Var = this.E;
        return ((o2Var == null || !o2Var.inPreviewMode) ? this.s : this.v).getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public List<o2> getFragmentStack() {
        return this.K0;
    }

    public float getInnerTranslationX() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public o2 getLastFragment() {
        if (this.K0.isEmpty()) {
            return null;
        }
        return (o2) j3.r0.k(1, this.K0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        return lastFragment instanceof ng0 ? ((ng0) lastFragment).W() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public d5 getMessageDrawableOutMediaStart() {
        return this.b0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public d5 getMessageDrawableOutStart() {
        return this.a0;
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
    public List<f9> getPulledDialogs() {
        return this.L0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public o2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            o2 o2Var = (o2) getFragmentStack().get(size);
            if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack()) {
                return o2Var;
            }
        }
        return null;
    }

    public qy getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.b5
    public float getThemeAnimationValue() {
        return this.i0;
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
            ArrayList arrayList = this.e1;
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append(this.K0.size());
            arrayList.add(0, e10.toString());
            if (this.e1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < 10; i9++) {
                    arrayList2.add((String) this.e1.get(i9));
                }
                this.e1 = arrayList2;
            }
        }
        o oVar = this.f1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.o0) {
            U(this.p0, this.q0);
            this.o0 = false;
        } else if (this.j0) {
            a5 a5Var = new a5(this.k0, this.n0, this.m0, false);
            boolean z10 = this.l0;
            if (!z10) {
                a5Var.g = z10;
                a5Var.f = z10;
            }
            f(a5Var, null);
            this.k0 = null;
            this.j0 = false;
        }
    }

    public final boolean j() {
        if (this.T) {
            return false;
        }
        if (this.S && (this.r0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.S;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        o2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            y4 y4Var = this.F0;
            if ((y4Var != null && !y4Var.k(this)) || j() || this.K0.isEmpty()) {
                return;
            }
            Activity activity = this.G0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i9 = 0;
            boolean z12 = !z11 && (this.h || this.T || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            o2 o2Var = (o2) j3.r0.k(1, this.K0);
            AnimatorSet animatorSet = null;
            o2 o2Var2 = this.K0.size() > 1 ? (o2) j3.r0.k(2, this.K0) : null;
            if (o2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, f6.w0(null, f6.s8, false) == -1 || (o2Var2.hasForceLightStatusBar() && !f6.A0().q()));
                w wVar = this.s;
                this.s = this.v;
                this.v = wVar;
                o2Var2.setParentLayout(this);
                View view = o2Var2.fragmentView;
                if (view == null && (view = o2Var2.performCreateView(activity)) != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(o2Var2, i9);
                    WeakHashMap weakHashMap = r0.j0.a;
                    r0.b0.j(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        o2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = o2Var2.actionBar;
                    if (kVar != null && kVar.G) {
                        if (this.y0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                    o2Var2.attachSheets(this.s);
                }
                this.D = o2Var2;
                this.E = o2Var;
                o2Var2.onTransitionAnimationStart(true, true);
                o2Var.onTransitionAnimationStart(false, true);
                o2Var2.onResume();
                if (this.g0 != null) {
                    this.e0 = o2Var2.getThemeDescriptions();
                }
                this.y = o2Var2.actionBar;
                if (!o2Var2.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(f6.w0(null, f6.d6, false));
                }
                if (z12) {
                    this.r0 = System.currentTimeMillis();
                    this.S = true;
                    o2Var.setRemovingFromStack(true);
                    this.u0 = new org.telegram.messenger.video.e(this, o2Var, o2Var2, 5);
                    if (!this.h && !this.T) {
                        animatorSet = o2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.v.b)) {
                            d0(false, true, z13 || this.T);
                        } else {
                            v2 v2Var = new v2(this, 1);
                            this.d = v2Var;
                            AndroidUtilities.runOnUIThread(v2Var, 200L);
                        }
                    } else {
                        this.G = animatorSet;
                        gc gcVar = gc.w;
                        if (gcVar != null && gcVar.l) {
                            gcVar.b();
                        }
                    }
                    I("closeLastFragment");
                } else {
                    m(o2Var);
                    o2Var.onTransitionAnimationEnd(false, true);
                    o2Var2.onTransitionAnimationEnd(true, true);
                    o2Var2.onBecomeFullyVisible();
                }
            } else if (!this.w0 || z11) {
                b0(o2Var, false);
                setVisibility(8);
                View view2 = this.x0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.r0 = System.currentTimeMillis();
                this.S = true;
                this.u0 = new org.telegram.messenger.voip.l0(4, this, o2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view3 = this.x0;
                if (view3 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.G.setInterpolator(this.J);
                this.G.setDuration(200L);
                this.G.addListener(new q(this, 0));
                this.G.start();
            }
            o2Var.onFragmentClosed();
        }
    }

    public final void m(o2 o2Var) {
        o2Var.finishing = true;
        o2Var.onPause();
        o2Var.onFragmentDestroy();
        o2Var.setParentLayout(null);
        this.K0.remove(o2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.s);
        w wVar = this.w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((o2) j3.r0.k(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.m1 m1Var) {
        boolean z10 = this.I0;
        if (z10) {
            if (!(view instanceof w) || !((w) view).x) {
                r0.j0.b(view, r0.m1.b);
                return;
            }
            int i9 = m1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i9 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.m1 m1Var2 = r0.m1.b;
            int i10 = Build.VERSION.SDK_INT;
            r0.c1 b1Var = i10 >= 34 ? new r0.b1(m1Var2) : i10 >= 30 ? new r0.a1(m1Var2) : i10 >= 29 ? new r0.z0(m1Var2) : new r0.y0(m1Var2);
            b1Var.c(8, i0.b.b(0, 0, 0, max));
            r0.j0.b(view, b1Var.b());
            return;
        }
        boolean z11 = this.J0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.j1;
        i0.b bVar2 = this.k1;
        if (view instanceof m3) {
            AndroidUtilities.setViewLayoutMargins(view, z11 ? 0 : bVar.a, 0, z12 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int v = v(false);
            int i11 = v > 0 ? bVar.d + v : 0;
            y3 y3Var = wVar.w;
            boolean z13 = y3Var == y3.c;
            int i12 = (z13 || z11) ? 0 : bVar2.a;
            int i13 = (z13 || z12) ? 0 : bVar2.c;
            int i14 = (!z13 || z11) ? bVar2.a : 0;
            int i15 = (!z13 || z12) ? bVar2.c : 0;
            if (y3Var == y3.a) {
                i11 = Math.max(i11, bVar2.d);
                r0.j0.b(view, r0.m1.b);
            } else {
                r0.j0.b(view, m1Var.a.m(i14, 0, i15, i11));
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
        if (this.K0.isEmpty()) {
            return;
        }
        int size = this.K0.size();
        for (int i9 = 0; i9 < size; i9++) {
            o2 o2Var = (o2) this.K0.get(i9);
            o2Var.onConfigurationChanged(configuration);
            Dialog dialog = o2Var.visibleDialog;
            if (dialog instanceof f3) {
                ((f3) dialog).onConfigurationChanged(configuration);
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
        return this.P || j() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i9 == 82 && !j() && !this.M && (kVar = this.y) != null && !kVar.s() && (zVar = kVar.A) != null) {
            int childCount = zVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (w0Var.q()) {
                            w0Var.M(null, null);
                            break;
                        }
                        if (w0Var.O) {
                            zVar.o(((Integer) w0Var.getTag()).intValue());
                            break;
                        }
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i9, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11 = getHeight() > getWidth();
        if (this.V0 != z11) {
            this.V0 = z11;
            this.W0 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i11 - i9) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                m3 m3Var = this.A;
                if (childAt == m3Var) {
                    m3Var.setCurrentAccount(UserConfig.selectedAccount);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & 112;
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
                        if (childAt != this.A && this.W0 != 0 && (this.T0 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i18 = this.W0;
                        } else if (childAt == this.A) {
                            this.W0 = i18;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != this.A) {
                    }
                    if (childAt == this.A) {
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
                if (childAt != this.A) {
                }
                if (childAt == this.A) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        o2 o2Var = !this.K0.isEmpty() ? (o2) j3.r0.k(1, this.K0) : null;
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, TLObject.FLAG_30));
            return;
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            int[] iArr = this.U0;
            iArr[0] = i9;
            iArr[1] = i10;
            y4Var.e(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        }
        this.T0 = C() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!j() && !this.s0 && !this.P && !this.Z0) {
            if (this.K0.size() > 1 && ((rVar = this.C) == null || rVar.getLastSheet() == null || !this.C.getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t0) {
                        if (this.Q == null) {
                            this.Q = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.N));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.O);
                        this.Q.addMovement(motionEvent);
                        if (this.S || this.h || !this.L || this.M || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                            if (this.M) {
                                if (!this.R) {
                                    Activity activity = this.G0;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((o2) j3.r0.k(1, this.K0)).onBeginSlide();
                                    this.R = true;
                                }
                                if (D()) {
                                    float f10 = max;
                                    this.s.setTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                    setInnerTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                } else {
                                    float f11 = max;
                                    this.s.setTranslationX(f11);
                                    setInnerTranslationX(f11);
                                }
                            }
                        } else if (((o2) j3.r0.k(1, this.K0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.N = (int) motionEvent.getX();
                            O();
                        } else {
                            this.L = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.Q == null) {
                            this.Q = VelocityTracker.obtain();
                        }
                        this.Q.addMovement(motionEvent);
                        this.Q.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        o2 o2Var = (o2) j3.r0.k(1, this.K0);
                        if (!this.h && !this.T && !this.M && o2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.Q.getXVelocity();
                            float yVelocity = this.Q.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && o2Var.canBeginSlide()) {
                                this.N = (int) motionEvent.getX();
                                O();
                                if (!this.R) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.R = true;
                                }
                            }
                        }
                        if (this.M) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.Q.getXVelocity();
                            float yVelocity2 = this.Q.getYVelocity();
                            if (!D() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z10 = true;
                                }
                            }
                            e(z10);
                        } else {
                            this.L = false;
                            this.M = false;
                            w wVar = this.s;
                            if (wVar != null) {
                                wVar.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.Q;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.Q = null;
                        }
                    } else if (motionEvent == null) {
                        this.L = false;
                        this.M = false;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.Q;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.Q = null;
                        }
                    }
                } else if (((o2) j3.r0.k(1, this.K0)).isSwipeBackEnabled(motionEvent)) {
                    this.t0 = motionEvent.getPointerId(0);
                    this.L = true;
                    this.N = (int) motionEvent.getX();
                    this.O = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.Q;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.L = false;
                    this.M = false;
                    w wVar3 = this.s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.M;
        }
        return false;
    }

    public final void p(Canvas canvas, int i9, int i10) {
        if (l1 == null || !SharedConfig.drawActionBarShadow) {
            return;
        }
        int i11 = i9 / 2;
        if (l1.getAlpha() != i11) {
            l1.setAlpha(i11);
        }
        l1.setBounds(0, i10, getMeasuredWidth(), l1.getIntrinsicHeight() + i10);
        l1.draw(canvas);
    }

    public final void q(Canvas canvas, int i9) {
        p(canvas, 255, i9);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        o2 o2Var = (o2) j3.r0.k(2, this.K0);
        o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
        o2Var2.fragmentView.setOutlineProvider(null);
        o2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var2.fragmentView.setLayoutParams(layoutParams);
        T(o2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new gr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new fg.j(10, this, o2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
        o2Var2.setInPreviewMode(false);
        o2Var2.setInMenuMode(false);
        try {
            Activity activity = this.G0;
            if (f6.w0(null, f6.s8, false) != -1 && (!o2Var2.hasForceLightStatusBar() || f6.A0().q())) {
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
        return !this.K0.isEmpty() && ((o2) j3.r0.k(1, this.K0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setBackgroundView(View view) {
        this.x0 = view;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setDelegate(y4 y4Var) {
        this.F0 = y4Var;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setDrawerLayoutContainer(x3 x3Var) {
        this.x = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setFragmentPanTranslationOffset(int i9) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i9);
        }
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setFragmentStack(List<o2> list) {
        this.K0 = list;
        m3 m3Var = this.A;
        if (m3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            m3Var.E.remove(oVar);
            m3Var.F.remove(oVar2);
            AndroidUtilities.removeFromParent(this.A);
            this.A = null;
        }
        boolean z10 = this.H0;
        Activity activity = this.G0;
        if (z10) {
            m3 m3Var2 = new m3(activity, this);
            this.A = m3Var2;
            this.B = new b3.b(m3Var2);
            m3 m3Var3 = this.A;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            m3Var3.E.add(oVar3);
            m3Var3.F.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.A, layoutParams);
            v3 v3Var = LaunchActivity.C1.u0;
            if (v3Var != null) {
                v3Var.setTabsView(this.A);
            }
        }
        w wVar = this.v;
        if (wVar != null) {
            AndroidUtilities.removeFromParent(wVar);
        }
        w wVar2 = new w(activity, this);
        this.v = wVar2;
        addView(wVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        w wVar3 = this.s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        w wVar5 = this.w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.w = wVar6;
        this.X0.a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.w.setLayoutParams(layoutParams4);
        r rVar = this.C;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.C;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, g7.e6.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((o2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.O0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setInBubbleMode(boolean z10) {
        this.f = z10;
    }

    public void setInnerTranslationX(float f10) {
        int navigationBarColor;
        int navigationBarColor2;
        this.K = f10;
        invalidate();
        if (this.K0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float clamp01 = D() ? Utilities.clamp01(f10 / (AndroidUtilities.dp(56.0f) * 6)) : f10 / this.s.getMeasuredWidth();
        o2 o2Var = (o2) j3.r0.k(2, this.K0);
        o2Var.onSlideProgress(false, clamp01);
        o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
        float a2 = g7.n.a(clamp01 * 2.0f, 0.0f, 1.0f);
        if (!o2Var2.isBeginToShow() || (navigationBarColor = o2Var2.getNavigationBarColor()) == (navigationBarColor2 = o2Var.getNavigationBarColor())) {
            return;
        }
        o2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setNavigationBarColor(int i9) {
        if (this.h1 != i9) {
            this.h1 = i9;
            invalidate();
        }
        x3 x3Var = this.x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i9);
        }
        m3 m3Var = this.A;
        if (m3Var != null) {
            m3Var.i(i9, (this.M || this.P) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i9) {
        this.P0 = i9;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setPulledDialogs(List<f9> list) {
        this.L0 = list;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.y0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        this.i0 = f10;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i9);
            int[] iArr = (int[]) this.U.get(i9);
            int[] iArr2 = (int[]) this.V.get(i9);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                int red = Color.red(iArr2[i10]);
                int green = Color.green(iArr2[i10]);
                int blue = Color.blue(iArr2[i10]);
                int alpha = Color.alpha(iArr2[i10]);
                int red2 = Color.red(iArr[i10]);
                int green2 = Color.green(iArr[i10]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i10]);
                int i11 = size;
                int i12 = i9;
                int argb = Color.argb(Math.min(255, (int) (((alpha - r3) * f10) + Color.alpha(iArr[i10]))), Math.min(255, (int) (((red - red2) * f10) + red2)), Math.min(255, (int) (((green - green2) * f10) + green2)), Math.min(255, (int) (((blue - blue2) * f10) + blue2)));
                h6 h6Var = (h6) arrayList2.get(i10);
                int i13 = h6Var.f;
                b6 b6Var = h6Var.o;
                if (b6Var != null) {
                    b6Var.c1(i13, argb);
                } else {
                    SparseIntArray sparseIntArray = f6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i13, argb);
                    }
                }
                h6Var.d(argb, false, false);
                i10++;
                i9 = i12;
                arrayList = arrayList3;
                size = i11;
            }
            i9++;
        }
        ArrayList arrayList4 = this.f0;
        int size3 = arrayList4.size();
        for (int i14 = 0; i14 < size3; i14++) {
            g6 g6Var = (g6) arrayList4.get(i14);
            if (g6Var != null) {
                g6Var.b();
                g6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.e0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i15 = 0; i15 < size4; i15++) {
                h6 h6Var2 = (h6) this.e0.get(i15);
                h6Var2.d(f6.v0(h6Var2.f, h6Var2.o), false, false);
            }
        }
        ln lnVar = this.c0;
        if (lnVar != null) {
            on onVar = lnVar.a;
            onVar.R.t0.invalidate();
            onVar.E.I = f10;
            onVar.F.I = f10;
            onVar.k(f10);
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            y4Var.a(f10);
        }
        x(this);
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setUseAlphaAnimations(boolean z10) {
        this.w0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final o2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            o2 o2Var = (o2) getFragmentStack().get(size);
            if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack() && fg0.class.isInstance(o2Var)) {
                return o2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        m3 m3Var;
        if (!this.H0 || (m3Var = this.A) == null) {
            return 0;
        }
        return z10 ? (int) m3Var.C : m3Var.D;
    }

    public final qy w() {
        Activity activity = this.G0;
        if (activity == null) {
            return null;
        }
        if (this.C == null) {
            r rVar = new r(this);
            this.C = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.C;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, g7.e6.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
                this.w.setDrawNavigationBar(this.C.drawEdgeNavigationBar());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        return this.C;
    }

    public final boolean y() {
        return this.h || this.T;
    }

    public final boolean z() {
        return this.I0;
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
