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
import bi.k8;
import bi.pb;
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
import org.telegram.messenger.td;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao;
import org.telegram.ui.co;
import org.telegram.ui.eh0;
import org.telegram.ui.g90;
import org.telegram.ui.hz;
import org.telegram.ui.wg0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements d5, ng.b {
    public static Drawable p1;
    public static Drawable q1;
    public static Paint r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public t D0;
    public o3 E;
    public float E0;
    public cf.c F;
    public long F0;
    public s G;
    public String G0;
    public n2 H;
    public int H0;
    public n2 I;
    public g90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public a5 J0;
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
    public f5 e0;
    public boolean e1;
    public boolean f;
    public f5 f0;
    public float f1;
    public xn g0;
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
    public i0.c n1;
    public i6 o0;
    public i0.c o1;
    public boolean p0;
    public boolean q0;
    public ColorDrawable r;
    public int r0;
    public w s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public w v;
    public long v0;
    public w w;
    public boolean w0;
    public z3 x;
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
        n7.z0 z0Var = new n7.z0(i10, false);
        z0Var.b = new SparseIntArray();
        z0Var.c = new int[]{j6.Aa, j6.Da, j6.Ea, j6.Fa, j6.ac, j6.Ca};
        this.d0 = z0Var;
        this.h0 = new ArrayList();
        this.j0 = new ArrayList();
        this.l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.b1 = new org.telegram.ui.Components.e6(this, 280L, pr.h);
        this.i1 = new ArrayList();
        this.j1 = new o(this, 2);
        i0.c cVar = i0.c.e;
        this.n1 = cVar;
        this.o1 = cVar;
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
        if (view instanceof ng.b) {
            arrayList.addAll(((ng.b) view).A());
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
                ((n2) p6.g(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
                n2 n2Var = (n2) p6.g(2, actionBarLayout.O0);
                n2Var.prepareFragmentToSlide(false, false);
                n2Var.onPause();
                View view = n2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    n2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(n2Var.fragmentView);
                }
                k kVar = n2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(n2Var.actionBar);
                }
                n2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.O0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            n2 n2Var2 = (n2) p6.g(1, actionBarLayout.O0);
            n2Var2.prepareFragmentToSlide(true, false);
            n2Var2.onPause();
            n2Var2.onFragmentDestroy();
            n2Var2.setParentLayout(null);
            List list = actionBarLayout.O0;
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
            if (actionBarLayout.O0.size() > 0) {
                n2 n2Var3 = (n2) p6.g(1, actionBarLayout.O0);
                actionBarLayout.y = n2Var3.actionBar;
                n2Var3.onResume();
                n2Var3.onBecomeFullyVisible();
                n2Var3.prepareFragmentToSlide(false, false);
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
            if (childAt instanceof z5) {
                ((z5) childAt).d();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.b
    public final List A() {
        n2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof ng.b) {
            arrayList.addAll(((ng.b) lastFragment).A());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
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
        t tVar = this.D0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
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
        z20 z20Var = z20.d0;
        if (z20Var != null && z20Var.w) {
            z20Var.e(false);
            return;
        }
        if (!e0() && (kVar = this.y) != null && !kVar.s()) {
            k kVar2 = this.y;
            if (kVar2.n0) {
                kVar2.h(true);
                return;
            }
        }
        s sVar = this.G;
        if ((sVar == null || sVar.onBackPressed(true)) && ((n2) p6.g(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
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
            ((n2) it.next()).onLowMemory();
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
            ((n2) p6.g(1, this.O0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((n2) p6.g(1, this.O0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
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
        n2 n2Var = (n2) p6.g(2, this.O0);
        View view = n2Var.fragmentView;
        if (view == null && (view = n2Var.performCreateView(this.K0)) != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
            n nVar = new n(n2Var, i10);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            n2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = n2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.C0) {
                n2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(n2Var.actionBar);
        }
        n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        n2Var.attachSheets(this.v);
        if (!n2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.d6, false));
        }
        n2Var.onResume();
        if (this.k0 != null) {
            this.i0 = n2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((n2) p6.g(1, this.O0)).prepareFragmentToSlide(true, true);
        n2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(n2 n2Var) {
        return R(new b5(n2Var));
    }

    public final boolean Q(n2 n2Var, boolean z10) {
        b5 b5Var = new b5(n2Var);
        b5Var.b = z10;
        return R(b5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0242, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(b5 b5Var) {
        a5 a5Var;
        ArrayList arrayList;
        a4 a4Var;
        n2 n2Var;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        n2 n2Var2 = b5Var.a;
        boolean z10 = b5Var.b;
        boolean z11 = b5Var.c;
        boolean z12 = b5Var.d;
        boolean z13 = b5Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.f;
        int i11 = 0;
        if (n2Var2 == null || j() || !(((a5Var = this.J0) == null || !z12 || a5Var.l(this, b5Var)) && n2Var2.onFragmentCreate())) {
            return false;
        }
        a4 edgeToEdgeSupportMode = n2Var2.getEdgeToEdgeSupportMode();
        a4 a4Var2 = a4.a;
        int i12 = 1;
        boolean z14 = edgeToEdgeSupportMode != a4Var2;
        boolean drawEdgeNavigationBar = n2Var2.drawEdgeNavigationBar();
        n2 lastFragment = getLastFragment();
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof vi) || (visibleDialog instanceof fi.k3))) {
            l2 l2Var = new l2();
            l2Var.a = true;
            lastFragment.showAsSheet(n2Var2, l2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + n2Var2.getClass().getSimpleName() + " args=" + n2Var2.getArguments());
        }
        int i13 = 0;
        while (true) {
            arrayList = pb.y1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((pb) arrayList.get(i13)).q(false);
            i13++;
        }
        arrayList.clear();
        o3 o3Var = this.E;
        if (o3Var != null && !o3Var.c) {
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
        n2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.J;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.J = null;
        }
        this.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
        n2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.K0;
        if (activity.getCurrentFocus() != null && n2Var2.hideKeyboardOnShow() && !z13) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.O0.isEmpty()) {
            a4Var = a4Var2;
            n2Var = null;
        } else {
            a4Var = a4Var2;
            n2Var = (n2) p6.g(1, this.O0);
        }
        n2Var2.setParentLayout(this);
        View view = n2Var2.fragmentView;
        if (view == null) {
            view = n2Var2.performCreateView(activity);
            if (view != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(n2Var2, i11);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.j(view, nVar);
                this.v.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                n2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.v.addView(view);
        w wVar = this.v;
        if (z13) {
            edgeToEdgeSupportMode = a4Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
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
            int previewHeight = n2Var2.getPreviewHeight();
            int i14 = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0 && previewHeight < getMeasuredHeight() - i14) {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i14) - previewHeight) / 2) + i14;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    layoutParams2.bottomMargin = org.telegram.messenger.w1.C(8.0f, i10, layoutParams2.bottomMargin);
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
        k kVar = n2Var2.actionBar;
        if (kVar != null && kVar.K) {
            if (this.C0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(n2Var2.actionBar);
            this.v.addView(n2Var2.actionBar);
        }
        n2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        n2Var2.attachSheets(this.v);
        this.O0.add(n2Var2);
        I("presentFragment");
        n2Var2.onResume();
        this.y = n2Var2.actionBar;
        if (!n2Var2.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.d6, false));
        }
        w wVar2 = this.s;
        w wVar3 = this.v;
        this.s = wVar3;
        this.v = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(n2Var2 instanceof co)) {
                float dp4 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                bi.z1 z1Var = yf.j0.a;
                view.setOutlineProvider(new yf.i0(0, dp4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new u());
            } else {
                float dp5 = AndroidUtilities.dp(29.0f);
                bi.z1 z1Var2 = yf.j0.a;
                view.setOutlineProvider(new yf.i0(0, dp5));
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
            j6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        w wVar4 = this.w;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            T(n2Var, z10);
            View view2 = this.B0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.k0 != null) {
            this.i0 = n2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.B0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.B0.setVisibility(0);
            }
            if (n2Var != null) {
                n2Var.onTransitionAnimationStart(false, false);
                n2Var.onTransitionAnimationEnd(false, false);
            }
            n2Var2.onTransitionAnimationStart(true, false);
            n2Var2.onTransitionAnimationEnd(true, false);
            n2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.A0 && this.O0.size() == 1) {
            T(n2Var, z10);
            this.v0 = System.currentTimeMillis();
            this.W = true;
            this.z0 = new ji.b5(29, n2Var, n2Var2);
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
            if (n2Var != null) {
                n2Var.onTransitionAnimationStart(false, false);
            }
            n2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.K = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.K.setInterpolator(pr.h);
            this.K.setDuration(200L);
            this.K.addListener(new r(this, 1));
            this.K.start();
            return true;
        }
        this.a0 = z13;
        this.v0 = System.currentTimeMillis();
        this.W = true;
        td tdVar = new td(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, n2Var, n2Var2);
        n2 n2Var3 = n2Var;
        this.z0 = tdVar;
        boolean needDelayOpenAnimation = n2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (n2Var3 != null) {
                n2Var3.onTransitionAnimationStart(false, false);
            }
            n2Var2.onTransitionAnimationStart(true, false);
        }
        this.R0 = false;
        this.I = n2Var3;
        this.H = n2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? n2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.v.b) && n2Var3 != null)) {
                n2Var3.saveKeyboardPositionBeforeTransition();
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
            if (!n2Var2.needDelayOpenAnimation()) {
                d0(true, true, z13);
                return true;
            }
            ki.h hVar = new ki.h(this, n2Var2, z13, i12);
            this.e = hVar;
            AndroidUtilities.runOnUIThread(hVar, 200L);
            return true;
        }
        if (n2Var3 != null && !z13) {
            n2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new v(this, z16, n2Var3, n2Var2, z13);
        if (n2Var2.needDelayOpenAnimation()) {
            this.e = new j6.g(this, n2Var3, n2Var2, z13);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean S(n2 n2Var, boolean z10, boolean z11) {
        b5 b5Var = new b5(n2Var);
        b5Var.b = z10;
        b5Var.c = z11;
        b5Var.d = true;
        b5Var.e = false;
        return R(b5Var);
    }

    public final void T(n2 n2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (n2Var == null) {
            return;
        }
        n2Var.onBecomeFullyHidden();
        n2Var.onPause();
        if (z10) {
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            this.O0.remove(n2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = n2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                n2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(n2Var.fragmentView);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    try {
                        viewGroup2.removeView(n2Var.fragmentView);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
            k kVar = n2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(n2Var.actionBar);
            }
            n2Var.detachSheets();
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
            ((n2) this.O0.get(i10)).clearViews();
            ((n2) this.O0.get(i10)).setParentLayout(this);
        }
        a5 a5Var = this.J0;
        if (a5Var != null) {
            a5Var.b(this, z10);
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
            b0((n2) this.O0.get(0), false);
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
        Z((n2) getFragmentStack().get(i10));
    }

    public final void Z(n2 n2Var) {
        a0(n2Var, false);
    }

    public final void a0(n2 n2Var, boolean z10) {
        if ((this.O0.size() > 0 && p6.g(1, this.O0) == n2Var) || (this.O0.size() > 1 && p6.g(2, this.O0) == n2Var)) {
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
        b0(n2Var, n2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
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
            iArr[i10] = ((l6) arrayList.get(i10)).b();
        }
    }

    public final void b0(n2 n2Var, boolean z10) {
        if (this.O0.contains(n2Var)) {
            if (z10 && p6.g(1, this.O0) == n2Var) {
                n2Var.finishFragment();
                return;
            }
            if (p6.g(1, this.O0) == n2Var && this.O0.size() > 1) {
                n2Var.finishFragment(false);
                return;
            }
            n2Var.onPause();
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            this.O0.remove(n2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, n2 n2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        a5 a5Var = this.J0;
        int i11 = 0;
        if ((a5Var != null && !a5Var.h(n2Var, this)) || !n2Var.onFragmentCreate() || this.O0.contains(n2Var)) {
            return false;
        }
        n2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 == -1 || i10 == -2) {
            if (!this.O0.isEmpty()) {
                n2 n2Var2 = (n2) p6.g(1, this.O0);
                n2Var2.onPause();
                k kVar = n2Var2.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(n2Var2.actionBar);
                }
                View view = n2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    n2Var2.onRemoveFromParent();
                    viewGroup.removeView(n2Var2.fragmentView);
                }
                n2Var2.detachSheets();
            }
            this.O0.add(n2Var);
            if (i10 != -2) {
                View view2 = n2Var.fragmentView;
                if (view2 == null) {
                    view2 = n2Var.performCreateView(activity);
                    if (view2 != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(n2Var, i11);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.j(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!n2Var.hasOwnBackground && view2.getBackground() == null) {
                    view2.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                this.s.addView(view2, w7.x5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar2 = n2Var.actionBar;
                if (kVar2 != null && kVar2.K) {
                    if (this.C0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(n2Var.actionBar);
                    }
                    this.s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                n2Var.attachSheets(this.s);
                n2Var.onResume();
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var.onTransitionAnimationEnd(true, true);
                n2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View view3 = n2Var.fragmentView;
                if (view3 == null) {
                    view3 = n2Var.performCreateView(activity);
                    if (view3 != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(n2Var, i11);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.j(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!n2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.clamp(0, wVar.getChildCount(), 0), w7.x5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar3 = n2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.C0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(n2Var.actionBar);
                    }
                    this.s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                n2Var.attachSheets(this.s);
                i10 = 0;
            }
            this.O0.add(i10, n2Var);
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
        if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((n2) this.O0.get(size)).fragmentView == null) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                n2 n2Var = (n2) this.O0.get(i11);
                k kVar = n2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(n2Var.actionBar);
                }
                View view = n2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    n2Var.onPause();
                    n2Var.onRemoveFromParent();
                    viewGroup.removeView(n2Var.fragmentView);
                }
            }
            n2 n2Var2 = (n2) this.O0.get(size);
            n2Var2.setParentLayout(this);
            View view2 = n2Var2.fragmentView;
            if (view2 == null) {
                view2 = n2Var2.performCreateView(this.K0);
                if (view2 != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(n2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.j(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    n2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, w7.x5.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
            k kVar2 = n2Var2.actionBar;
            if (kVar2 != null && kVar2.K) {
                if (this.C0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(n2Var2.actionBar);
                this.s.addView(n2Var2.actionBar);
            }
            n2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
            n2Var2.attachSheets(this.s);
            n2Var2.onResume();
            n2Var2.onBecomeFullyVisible();
            this.y = n2Var2.actionBar;
            if (n2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            view2.setBackgroundColor(j6.w0(null, j6.d6, false));
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
            l6 l6Var = (l6) arrayList.get(i10);
            iArr[i10] = l6Var.b();
            k6 k6Var = l6Var.h;
            l6Var.h = null;
            if (k6Var != null) {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.contains(k6Var)) {
                    arrayList2.add(k6Var);
                }
            }
        }
    }

    public final void d0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.E0 = 0.0f;
            this.F0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.D0 = tVar;
        AndroidUtilities.runOnUIThread(tVar);
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
        a5 a5Var = this.J0;
        return (a5Var != null && a5Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
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
        j2 j2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.n1.d));
        s sVar = this.G;
        j2 j2Var2 = null;
        if (sVar != null && sVar.getLastSheet() != null) {
            j2Var = this.G.getLastSheet();
            if (j2Var.attachedToParent()) {
            }
        }
        j2Var = null;
        if (j2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            j2Var = getLastFragment().getLastSheet();
            if (j2Var.attachedToParent()) {
            }
            if (j2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.k1 = z10;
                }
                if (!this.k1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.k1 = false;
                    }
                    return j2Var2.getWindowView().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.k1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        j2Var2 = j2Var;
        if (j2Var2 != null) {
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
        w wVar;
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
                cVar.m(canvas, z10, z11, width2, 1.0f);
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
            if ((!this.h || this.a0) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.J == null) {
                    int dp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - dp) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    j6.s0.setBounds(measuredWidth, translationY, dp + measuredWidth, (dp / 2) + translationY);
                    j6.s0.draw(canvas2);
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
                int b10 = w7.p.b((i14 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
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
                r1.setColor(Color.argb((int) (w7.p.a(i14 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
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
        n2 n2Var = !this.O0.isEmpty() ? (n2) p6.g(1, this.O0) : null;
        if (n2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = n2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? 320 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(pr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.d1 ? AndroidUtilities.dp(56.0f) : 0));
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(pr.h);
                }
            }
        }
        Animator customSlideTransition2 = n2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        n2 n2Var2 = (n2) p6.g(2, this.O0);
        if (n2Var2 != null && (customSlideTransition = n2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        n2 n2Var = !this.O0.isEmpty() ? (n2) p6.g(1, this.O0) : null;
        return (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(c5 c5Var, Runnable runnable) {
        i6 i6Var;
        i6 i6Var2;
        final int i10 = 1;
        if (this.W || this.Q) {
            this.n0 = true;
            this.o0 = c5Var.a;
            this.q0 = c5Var.c;
            this.r0 = c5Var.b;
            this.p0 = c5Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.k0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.k0 = null;
        }
        int size = c5Var.e ? 1 : this.O0.size();
        k8 k8Var = new k8(this, size, c5Var, runnable, 8);
        if (size < 1 || !c5Var.f || !c5Var.g) {
            k8Var.run();
            return;
        }
        int i11 = c5Var.b;
        if (i11 != -1 && (i6Var2 = c5Var.a) != null) {
            i6Var2.u(i11);
            j6.t1(c5Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            j6.t(c5Var.a, true, c5Var.c);
            k8Var.run();
            return;
        }
        i6 i6Var3 = c5Var.a;
        boolean z10 = c5Var.c;
        final int i12 = 0;
        q qVar = new q(k8Var, i12);
        int i13 = j6.a;
        if (i6Var3 == null) {
            qVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
        } catch (Exception e7) {
            e = e7;
            i6Var = i6Var3;
        }
        if (i6Var3.b == null && i6Var3.d == null) {
            if (!z10) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.apply();
            }
            j6.ql.clear();
            j6.g0 = 0;
            j6.h0 = null;
            j6.e0 = null;
            j6.f0 = null;
            if (!z10 && j6.M == null) {
                j6.K = i6Var3;
                if (j6.I != j6.J) {
                    i10 = 0;
                }
                if (i10 != 0) {
                    j6.T = 2000;
                    j6.U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                }
            }
            j6.I = i6Var3;
            j6.n1(false, false);
            i6Var = i6Var3;
            if (j6.M == null && !j6.Q) {
                MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z10, false);
            }
            qVar.run();
        }
        String[] strArr = new String[1];
        final bi.e4 e4Var = new bi.e4(strArr, i6Var3, z10, qVar, 9);
        i6Var = i6Var3;
        try {
            String str = i6Var.d;
            if (str != null) {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.b(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.l5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i12) {
                            case 0:
                                j6.ql = sparseIntArray;
                                e4Var.run();
                                break;
                            default:
                                j6.ql = sparseIntArray;
                                e4Var.run();
                                break;
                        }
                    }
                }, obj, str, obj, 29));
            } else {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.b(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.l5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i10) {
                            case 0:
                                j6.ql = sparseIntArray;
                                e4Var.run();
                                break;
                            default:
                                j6.ql = sparseIntArray;
                                e4Var.run();
                                break;
                        }
                    }
                }, new File(i6Var.b), obj, strArr, 29));
            }
        } catch (Exception e10) {
            e = e10;
            FileLog.e(e);
            if (j6.M == null) {
                MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z10, false);
            }
            qVar.run();
        }
    }

    public final void g(i6 i6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new c5(i6Var, i10, z10, z11), runnable);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public n2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (n2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public /* bridge */ /* synthetic */ f3 getBottomSheet() {
        return null;
    }

    public o3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.a0 && !this.n) {
            return 0.0f;
        }
        n2 n2Var = this.I;
        return ((n2Var == null || !n2Var.inPreviewMode) ? this.s : this.v).getAlpha();
    }

    public z3 getDrawerLayoutContainer() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public List<n2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public n2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (n2) p6.g(1, this.O0);
    }

    public n2 getLastFragmentIncludeMainTabs() {
        n2 lastFragment = getLastFragment();
        return lastFragment instanceof eh0 ? ((eh0) lastFragment).X() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public f5 getMessageDrawableOutMediaStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public f5 getMessageDrawableOutStart() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.d5
    public List<o9> getPulledDialogs() {
        return this.P0;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public n2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) getFragmentStack().get(size);
            if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack()) {
                return n2Var;
            }
        }
        return null;
    }

    public hz getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.d5
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override // org.telegram.ui.ActionBar.d5
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
            StringBuilder g10 = w.f.g(str, " ");
            g10.append(this.O0.size());
            arrayList.add(0, g10.toString());
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
            c5 c5Var = new c5(this.o0, this.r0, this.q0, false);
            boolean z10 = this.p0;
            if (!z10) {
                c5Var.g = z10;
                c5Var.f = z10;
            }
            f(c5Var, null);
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
        n2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            a5 a5Var = this.J0;
            if ((a5Var != null && !a5Var.k(this)) || j() || this.O0.isEmpty()) {
                return;
            }
            Activity activity = this.K0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i10 = 0;
            boolean z12 = !z11 && (this.h || this.a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            n2 n2Var = (n2) p6.g(1, this.O0);
            AnimatorSet animatorSet = null;
            n2 n2Var2 = this.O0.size() > 1 ? (n2) p6.g(2, this.O0) : null;
            if (n2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, j6.w0(null, j6.s8, false) == -1 || (n2Var2.hasForceLightStatusBar() && !j6.A0().q()));
                w wVar = this.s;
                this.s = this.v;
                this.v = wVar;
                n2Var2.setParentLayout(this);
                View view = n2Var2.fragmentView;
                if (view == null && (view = n2Var2.performCreateView(activity)) != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(n2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.j(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        n2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = n2Var2.actionBar;
                    if (kVar != null && kVar.K) {
                        if (this.C0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(n2Var2.actionBar);
                        this.s.addView(n2Var2.actionBar);
                    }
                    n2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    n2Var2.attachSheets(this.s);
                }
                this.H = n2Var2;
                this.I = n2Var;
                n2Var2.onTransitionAnimationStart(true, true);
                n2Var.onTransitionAnimationStart(false, true);
                n2Var2.onResume();
                if (this.k0 != null) {
                    this.i0 = n2Var2.getThemeDescriptions();
                }
                this.y = n2Var2.actionBar;
                if (!n2Var2.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                if (z12) {
                    this.v0 = System.currentTimeMillis();
                    this.W = true;
                    n2Var.setRemovingFromStack(true);
                    this.y0 = new p(this, n2Var, n2Var2, i10);
                    if (!this.h && !this.a0) {
                        animatorSet = n2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.v.b)) {
                            d0(false, true, z13 || this.a0);
                        } else {
                            v2 v2Var = new v2(this, 1);
                            this.d = v2Var;
                            AndroidUtilities.runOnUIThread(v2Var, 200L);
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
                    m(n2Var);
                    n2Var.onTransitionAnimationEnd(false, true);
                    n2Var2.onTransitionAnimationEnd(true, true);
                    n2Var2.onBecomeFullyVisible();
                }
            } else if (!this.A0 || z11) {
                b0(n2Var, false);
                setVisibility(8);
                View view2 = this.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.v0 = System.currentTimeMillis();
                this.W = true;
                this.y0 = new ji.b5(28, this, n2Var);
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
                this.K.addListener(new r(this, 0));
                this.K.start();
            }
            n2Var.onFragmentClosed();
        }
    }

    public final void m(n2 n2Var) {
        n2Var.finishing = true;
        n2Var.onPause();
        n2Var.onFragmentDestroy();
        n2Var.setParentLayout(null);
        this.O0.remove(n2Var);
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
        ((n2) p6.g(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.l1 l1Var) {
        boolean z10 = this.M0;
        if (z10) {
            if (!(view instanceof w) || !((w) view).x) {
                r0.i0.b(view, r0.l1.b);
                return;
            }
            int i10 = l1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.l1 l1Var2 = r0.l1.b;
            int i11 = Build.VERSION.SDK_INT;
            r0.b1 a1Var = i11 >= 34 ? new r0.a1(l1Var2) : i11 >= 30 ? new r0.z0(l1Var2) : i11 >= 29 ? new r0.y0(l1Var2) : new r0.x0(l1Var2);
            a1Var.c(8, i0.c.b(0, 0, 0, max));
            r0.i0.b(view, a1Var.b());
            return;
        }
        boolean z11 = this.N0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.c cVar = this.n1;
        i0.c cVar2 = this.o1;
        if (view instanceof o3) {
            AndroidUtilities.setViewLayoutMargins(view, z11 ? 0 : cVar.a, 0, z12 ? 0 : cVar.c, cVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int v = v(false);
            int i12 = v > 0 ? cVar.d + v : 0;
            a4 a4Var = wVar.w;
            boolean z13 = a4Var == a4.c;
            int i13 = (z13 || z11) ? 0 : cVar2.a;
            int i14 = (z13 || z12) ? 0 : cVar2.c;
            int i15 = (!z13 || z11) ? cVar2.a : 0;
            int i16 = (!z13 || z12) ? cVar2.c : 0;
            if (a4Var == a4.a) {
                i12 = Math.max(i12, cVar2.d);
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
            n2 n2Var = (n2) this.O0.get(i10);
            n2Var.onConfigurationChanged(configuration);
            Dialog dialog = n2Var.visibleDialog;
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
        return this.T || j() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i10 == 82 && !j() && !this.Q && (kVar = this.y) != null && !kVar.s() && (zVar = kVar.E) != null) {
            int childCount = zVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (v0Var.q()) {
                            v0Var.M(null, null);
                            break;
                        }
                        if (v0Var.S) {
                            zVar.o(((Integer) v0Var.getTag()).intValue());
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
                o3 o3Var = this.E;
                if (childAt == o3Var) {
                    o3Var.setCurrentAccount(UserConfig.selectedAccount);
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
        n2 n2Var = !this.O0.isEmpty() ? (n2) p6.g(1, this.O0) : null;
        if (n2Var != null && !n2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            n2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, TLObject.FLAG_30));
            return;
        }
        a5 a5Var = this.J0;
        if (a5Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            a5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        this.X0 = C() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
        if (!j() && !this.w0 && !this.T && !this.d1) {
            if (this.O0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
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
                                    ((n2) p6.g(1, this.O0)).onBeginSlide();
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
                        } else if (((n2) p6.g(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                        n2 n2Var = (n2) p6.g(1, this.O0);
                        if (!this.h && !this.a0 && !this.Q && n2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.U.getXVelocity();
                            float yVelocity = this.U.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && n2Var.canBeginSlide()) {
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
                } else if (((n2) p6.g(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
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
        n2 n2Var = (n2) p6.g(2, this.O0);
        n2 n2Var2 = (n2) p6.g(1, this.O0);
        n2Var2.fragmentView.setOutlineProvider(null);
        n2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        n2Var2.fragmentView.setLayoutParams(layoutParams);
        T(n2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(n2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(n2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new pr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bi.t(12, this, n2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
        n2Var2.setInPreviewMode(false);
        n2Var2.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (j6.w0(null, j6.s8, false) != -1 && (!n2Var2.hasForceLightStatusBar() || j6.A0().q())) {
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
        return !this.O0.isEmpty() && ((n2) p6.g(1, this.O0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setDelegate(a5 a5Var) {
        this.J0 = a5Var;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setDrawerLayoutContainer(z3 z3Var) {
        this.x = z3Var;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setFragmentStack(List<n2> list) {
        this.O0 = list;
        o3 o3Var = this.E;
        if (o3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            o3Var.I.remove(oVar);
            o3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            o3 o3Var2 = new o3(activity, this);
            this.E = o3Var2;
            this.F = new cf.c(o3Var2);
            o3 o3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            o3Var3.I.add(oVar3);
            o3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            x3 x3Var = LaunchActivity.G1.y0;
            if (x3Var != null) {
                x3Var.setTabsView(this.E);
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
        this.b1.a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.w.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, w7.x5.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        Iterator it = this.O0.iterator();
        while (it.hasNext()) {
            ((n2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.d5
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
        n2 n2Var = (n2) p6.g(2, this.O0);
        n2Var.onSlideProgress(false, clamp01);
        n2 n2Var2 = (n2) p6.g(1, this.O0);
        float a2 = w7.p.a(clamp01 * 2.0f, 0.0f, 1.0f);
        if (!n2Var2.isBeginToShow() || (navigationBarColor = n2Var2.getNavigationBarColor()) == (navigationBarColor2 = n2Var.getNavigationBarColor())) {
            return;
        }
        n2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setNavigationBarColor(int i10) {
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        z3 z3Var = this.x;
        if (z3Var != null) {
            z3Var.setInternalNavigationBarColor(i10);
        }
        o3 o3Var = this.E;
        if (o3Var != null) {
            o3Var.i(i10, (this.Q || this.T) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.T0 = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setPulledDialogs(List<o9> list) {
        this.P0 = list;
    }

    @Override // org.telegram.ui.ActionBar.d5
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
                l6 l6Var = (l6) arrayList2.get(i11);
                int i14 = l6Var.f;
                f6 f6Var = l6Var.o;
                if (f6Var != null) {
                    f6Var.O0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = j6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                l6Var.d(argb, false, false);
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
            k6 k6Var = (k6) arrayList4.get(i15);
            if (k6Var != null) {
                k6Var.b();
                k6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                l6 l6Var2 = (l6) this.i0.get(i16);
                l6Var2.d(j6.v0(l6Var2.f, l6Var2.o), false, false);
            }
        }
        xn xnVar = this.g0;
        if (xnVar != null) {
            ao aoVar = xnVar.a;
            aoVar.V.x0.invalidate();
            aoVar.I.I = f7;
            aoVar.J.I = f7;
            aoVar.k(f7);
        }
        a5 a5Var = this.J0;
        if (a5Var != null) {
            a5Var.a(f7);
        }
        x(this);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final n2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) getFragmentStack().get(size);
            if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack() && wg0.class.isInstance(n2Var)) {
                return n2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        o3 o3Var;
        if (!this.L0 || (o3Var = this.E) == null) {
            return 0;
        }
        return z10 ? (int) o3Var.G : o3Var.H;
    }

    public final hz w() {
        Activity activity = this.K0;
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
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, w7.x5.c(-1.0f, -1));
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

    public final boolean z() {
        return this.M0;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public ViewGroup getView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void setHighlightActionButtons(boolean z10) {
    }
}
