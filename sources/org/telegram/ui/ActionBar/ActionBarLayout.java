package org.telegram.ui.ActionBar;

import ai.db;
import ai.ne;
import ai.x9;
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
import ci.z9;
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
import org.telegram.messenger.fd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ig0;
import org.telegram.ui.nn;
import org.telegram.ui.p80;
import org.telegram.ui.qn;
import org.telegram.ui.rg0;
import org.telegram.ui.ry;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements h5, ng.b {
    public static Drawable v1;
    public static Drawable w1;
    public static Paint x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public int D0;
    public q3 E;
    public Runnable E0;
    public com.google.android.gms.internal.cast.z5 F;
    public Runnable F0;
    public r G;
    public boolean G0;
    public o2 H;
    public View H0;
    public o2 I;
    public boolean I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public s J0;
    public AnimatorSet K;
    public float K0;
    public final DecelerateInterpolator L;
    public long L0;
    public final OvershootInterpolator M;
    public String M0;
    public final AccelerateDecelerateInterpolator N;
    public int N0;
    public float O;
    public p80 O0;
    public boolean P;
    public d5 P0;
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
    public final f5 d0;
    public boolean d1;
    public Runnable e;
    public j5 e0;
    public final int[] e1;
    public boolean f;
    public j5 f0;
    public boolean f1;
    public nn g0;
    public int g1;
    public boolean h;
    public final ArrayList h0;
    public final org.telegram.ui.Components.f6 h1;
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
    public qn p0;
    public final o p1;
    public AnimatorSet q0;
    public boolean q1;
    public ColorDrawable r;
    public final AnimationNotificationsLocker r0;
    public int r1;
    public v s;
    public float s0;
    public r0.k1 s1;
    public boolean t0;
    public i0.b t1;
    public j6 u0;
    public i0.b u1;
    public v v;
    public boolean v0;
    public v w;
    public boolean w0;
    public b4 x;
    public int x0;
    public k y;
    public boolean y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        f5 f5Var = new f5();
        f5Var.b = new SparseIntArray();
        f5Var.c = new int[]{k6.Aa, k6.Da, k6.Ea, k6.Fa, k6.ac, k6.Ca};
        this.d0 = f5Var;
        this.h0 = new ArrayList();
        this.j0 = new ArrayList();
        this.r0 = new AnimationNotificationsLocker();
        this.W0 = new Rect();
        this.Z0 = -1;
        this.b1 = new Path();
        this.c1 = new float[8];
        this.e1 = new int[2];
        this.h1 = new org.telegram.ui.Components.f6(this, 280L, bs.h);
        this.o1 = new ArrayList();
        this.p1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.t1 = bVar;
        this.u1 = bVar;
        this.Q0 = (Activity) context;
        this.R0 = z10;
        if (w1 == null) {
            w1 = getResources().getDrawable(R.drawable.layer_shadow);
            v1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            x1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F(ArrayList arrayList, View view) {
        if (view instanceof ng.b) {
            arrayList.addAll(((ng.b) view).B());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                F(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z10) {
            if (actionBarLayout.U0.size() >= 2) {
                ((o2) si.o0.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
                o2 o2Var = (o2) si.o0.g(2, actionBarLayout.U0);
                o2Var.prepareFragmentToSlide(false, false);
                o2Var.onPause();
                View view = o2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    o2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                }
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(o2Var.actionBar);
                }
                o2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            o2 o2Var2 = (o2) si.o0.g(1, actionBarLayout.U0);
            o2Var2.prepareFragmentToSlide(true, false);
            o2Var2.onPause();
            o2Var2.onFragmentDestroy();
            o2Var2.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.J("onSlideAnimationEnd");
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
            if (actionBarLayout.U0.size() > 0) {
                o2 o2Var3 = (o2) si.o0.g(1, actionBarLayout.U0);
                actionBarLayout.y = o2Var3.actionBar;
                o2Var3.onResume();
                o2Var3.onBecomeFullyVisible();
                o2Var3.prepareFragmentToSlide(false, false);
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

    public static boolean y(int i10, int i11, int i12) {
        if (i10 != k6.g5 && i10 != k6.ac && i10 != k6.Rd) {
            if (i10 != k6.Da && i10 != k6.Ea && i10 != k6.Fa && i10 != k6.Nd && i10 != k6.Od && i10 != k6.Pd && i10 != k6.Qd) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.b
    public final List B() {
        o2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof ng.b) {
            arrayList.addAll(((ng.b) lastFragment).B());
        }
        F(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.W0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.j1 && this.k1;
    }

    public final void E() {
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            if (((o2) this.U0.get(i10)).getFragmentView() != null) {
                try {
                    ((o2) this.U0.get(i10)).onThemeColorsChanged();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void G(boolean z10) {
        I();
        L();
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
        s sVar = this.J0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.J0 = null;
        }
        setAlpha(1.0f);
        this.s.setAlpha(1.0f);
        this.s.setScaleX(1.0f);
        this.s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void H() {
        k kVar;
        if (this.a0 || this.Q || i() || this.U0.isEmpty()) {
            return;
        }
        i30 i30Var = i30.d0;
        if (i30Var != null && i30Var.w) {
            i30Var.e(false);
            return;
        }
        if (!g0() && (kVar = this.y) != null && !kVar.s()) {
            k kVar2 = this.y;
            if (kVar2.n0) {
                kVar2.g(true);
                return;
            }
        }
        r rVar = this.G;
        if ((rVar == null || rVar.onBackPressed(true)) && ((o2) si.o0.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
            l(true, false);
        }
    }

    public final void I() {
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

    public final void J(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        g(str);
    }

    public final void K() {
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((o2) it.next()).onLowMemory();
        }
    }

    public final void L() {
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

    public final void M() {
        if (!this.U0.isEmpty()) {
            ((o2) si.o0.g(1, this.U0)).onPause();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void N() {
        if (!this.U0.isEmpty()) {
            ((o2) si.o0.g(1, this.U0)).onResume();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void O(Canvas canvas, ViewGroup viewGroup) {
        if (this.E == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
        this.E.draw(canvas);
        canvas.restore();
    }

    public final void P() {
        int i10 = 0;
        this.P = false;
        this.Q = true;
        this.v.setVisibility(0);
        this.V = false;
        o2 o2Var = (o2) si.o0.g(2, this.U0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.Q0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            n nVar = new n(o2Var, i10);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view, nVar);
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
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.I0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        o2Var.onResume();
        if (this.q0 != null) {
            this.i0 = o2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((o2) si.o0.g(1, this.U0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean Q(o2 o2Var) {
        return S(new e5(o2Var));
    }

    public final boolean R(o2 o2Var, boolean z10) {
        e5 e5Var = new e5(o2Var);
        e5Var.b = z10;
        return S(e5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(e5 e5Var) {
        d5 d5Var;
        ArrayList arrayList;
        c4 c4Var;
        o2 o2Var;
        int i10;
        int i11;
        LaunchActivity launchActivity;
        Dialog dialog;
        o2 o2Var2 = e5Var.a;
        boolean z10 = e5Var.b;
        boolean z11 = e5Var.c;
        boolean z12 = e5Var.d;
        boolean z13 = e5Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.f;
        int i12 = 0;
        if (o2Var2 == null || i() || !(((d5Var = this.P0) == null || !z12 || d5Var.l(this, e5Var)) && o2Var2.onFragmentCreate())) {
            return false;
        }
        c4 edgeToEdgeSupportMode = o2Var2.getEdgeToEdgeSupportMode();
        c4 c4Var2 = c4.a;
        boolean z14 = edgeToEdgeSupportMode != c4Var2;
        boolean drawEdgeNavigationBar = o2Var2.drawEdgeNavigationBar();
        o2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.J1) != null) {
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
                ArrayList arrayList3 = LaunchActivity.J1.E0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof ti) || (visibleDialog instanceof gi.d3))) {
            m2 m2Var = new m2();
            m2Var.a = true;
            lastFragment.showAsSheet(o2Var2, m2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + o2Var2.getClass().getSimpleName() + " args=" + o2Var2.getArguments());
        }
        int i13 = 0;
        while (true) {
            arrayList = z9.y1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((z9) arrayList.get(i13)).q(false);
            i13++;
        }
        arrayList.clear();
        q3 q3Var = this.E;
        if (q3Var != null && !q3Var.c) {
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
        o2Var2.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.J;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.J = null;
        }
        this.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
        o2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.Q0;
        if (activity.getCurrentFocus() != null && o2Var2.hideKeyboardOnShow() && !z13) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.U0.isEmpty()) {
            c4Var = c4Var2;
            o2Var = null;
        } else {
            c4Var = c4Var2;
            o2Var = (o2) si.o0.g(1, this.U0);
        }
        o2Var2.setParentLayout(this);
        View view = o2Var2.fragmentView;
        if (view == null) {
            view = o2Var2.performCreateView(activity);
            if (view != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(o2Var2, i12);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, nVar);
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
        v vVar = this.v;
        if (z13) {
            edgeToEdgeSupportMode = c4Var;
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
            int previewHeight = o2Var2.getPreviewHeight();
            int i14 = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0) {
                i11 = 2;
                if (previewHeight < getMeasuredHeight() - i14) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i14) - previewHeight) / 2) + i14;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = org.telegram.messenger.v0.C(8.0f, i10, layoutParams2.bottomMargin);
                    }
                    int dp = AndroidUtilities.dp(8.0f);
                    layoutParams2.leftMargin = dp;
                    layoutParams2.rightMargin = dp;
                }
            } else {
                i11 = 2;
            }
            int dp2 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout != null ? 0.0f : 24.0f);
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
            i11 = 2;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        k kVar = o2Var2.actionBar;
        if (kVar != null && kVar.K) {
            if (this.I0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(o2Var2.actionBar);
            this.v.addView(o2Var2.actionBar);
        }
        o2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        o2Var2.attachSheets(this.v);
        this.U0.add(o2Var2);
        J("presentFragment");
        o2Var2.onResume();
        this.y = o2Var2.actionBar;
        if (!o2Var2.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.d6, view, null);
        }
        v vVar2 = this.s;
        v vVar3 = this.v;
        this.s = vVar3;
        this.v = vVar2;
        vVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z13) {
            if (!(o2Var2 instanceof sn)) {
                float dp4 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                ci.n1 n1Var = zf.j0.a;
                view.setOutlineProvider(new zf.i0(0, dp4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float dp5 = AndroidUtilities.dp(29.0f);
                ci.n1 n1Var2 = zf.j0.a;
                view.setOutlineProvider(new zf.i0(0, dp5));
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
            k6.s0.setAlpha(0);
        }
        bringChildToFront(this.s);
        v vVar4 = this.w;
        if (vVar4 != null) {
            bringChildToFront(vVar4);
        }
        if (!z15) {
            U(o2Var, z10);
            View view2 = this.H0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.q0 != null) {
            this.i0 = o2Var2.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view3 = this.H0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.H0.setVisibility(0);
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
        if (this.G0 && this.U0.size() == 1) {
            U(o2Var, z10);
            this.B0 = System.currentTimeMillis();
            this.W = true;
            this.F0 = new m4.z(25, o2Var, o2Var2);
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
            if (o2Var != null) {
                o2Var.onTransitionAnimationStart(false, false);
            }
            o2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.K = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.K.setInterpolator(bs.h);
            this.K.setDuration(200L);
            this.K.addListener(new q(this, 1));
            this.K.start();
            return true;
        }
        this.a0 = z13;
        this.B0 = System.currentTimeMillis();
        this.W = true;
        fd fdVar = new fd(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, o2Var, o2Var2);
        o2 o2Var3 = o2Var;
        this.F0 = fdVar;
        boolean needDelayOpenAnimation = o2Var2.needDelayOpenAnimation();
        boolean z16 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (o2Var3 != null) {
                o2Var3.onTransitionAnimationStart(false, false);
            }
            o2Var2.onTransitionAnimationStart(true, false);
        }
        this.X0 = false;
        this.I = o2Var3;
        this.H = o2Var2;
        AnimatorSet onCustomTransitionAnimation = !z13 ? o2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z13 && ((this.s.b || this.v.b) && o2Var3 != null)) {
                o2Var3.saveKeyboardPositionBeforeTransition();
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
            if (!o2Var2.needDelayOpenAnimation()) {
                f0(true, true, z13);
                return true;
            }
            ad.l lVar = new ad.l(this, o2Var2, z13, 2);
            this.e = lVar;
            AndroidUtilities.runOnUIThread(lVar, 200L);
            return true;
        }
        if (o2Var3 != null && !z13) {
            o2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, o2Var3, o2Var2, z13);
        if (o2Var2.needDelayOpenAnimation()) {
            this.e = new j6.g(this, o2Var3, o2Var2, z13);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean T(o2 o2Var, boolean z10, boolean z11) {
        e5 e5Var = new e5(o2Var);
        e5Var.b = z10;
        e5Var.c = z11;
        e5Var.d = true;
        e5Var.e = false;
        return S(e5Var);
    }

    public final void U(o2 o2Var, boolean z10) {
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
            this.U0.remove(o2Var);
            J("presentFragmentInternalRemoveOld");
        } else {
            View view = o2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                o2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(o2Var.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            k kVar = o2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var.actionBar);
            }
            o2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void V(boolean z10, boolean z11) {
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
            ((o2) this.U0.get(i10)).clearViews();
            ((o2) this.U0.get(i10)).setParentLayout(this);
        }
        d5 d5Var = this.P0;
        if (d5Var != null) {
            d5Var.b(this, z10);
        }
        if (z11) {
            d0();
        }
    }

    public final void W() {
        V(true, true);
    }

    public final void X() {
        this.s.removeAllViews();
        this.v.removeAllViews();
        this.y = null;
        this.H = null;
        this.I = null;
    }

    public final void Y() {
        while (this.U0.size() > 0) {
            c0((o2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Z(int i10) {
        if (i10 < 0 || i10 >= getFragmentStack().size()) {
            return;
        }
        a0((o2) getFragmentStack().get(i10));
    }

    public final void a0(o2 o2Var) {
        b0(o2Var, false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
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
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((t6) arrayList.get(i10)).c();
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        if ((this.U0.size() > 0 && si.o0.g(1, this.U0) == o2Var) || (this.U0.size() > 1 && si.o0.g(2, this.U0) == o2Var)) {
            L();
            I();
        }
        g("removeFragmentFromStack " + z10);
        if (this.G0 && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            this.P0.k(this);
        }
        c0(o2Var, o2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    public final boolean c(int i10, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        d5 d5Var = this.P0;
        int i11 = 0;
        if ((d5Var != null && !d5Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.U0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i10 == -1 || i10 == -2) {
            if (!this.U0.isEmpty()) {
                o2 o2Var2 = (o2) si.o0.g(1, this.U0);
                o2Var2.onPause();
                k kVar = o2Var2.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(o2Var2.actionBar);
                }
                View view = o2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup.removeView(o2Var2.fragmentView);
                }
                o2Var2.detachSheets();
            }
            this.U0.add(o2Var);
            if (i10 != -2) {
                View view2 = o2Var.fragmentView;
                if (view2 == null) {
                    view2 = o2Var.performCreateView(activity);
                    if (view2 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, i11);
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.a0.i(view2, nVar);
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
                    r6.i(k6.d6, view2, null);
                }
                this.s.addView(view2, w7.z5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar2 = o2Var.actionBar;
                if (kVar2 != null && kVar2.K) {
                    if (this.I0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                o2Var.attachSheets(this.s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            J("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(o2Var, i11);
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        r0.a0.i(view3, nVar2);
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
                    r6.i(k6.d6, view3, null);
                }
                v vVar = this.s;
                vVar.addView(view3, Utilities.clamp(0, vVar.getChildCount(), 0), w7.z5.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar3 = o2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.I0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                o2Var.attachSheets(this.s);
                i10 = 0;
            }
            this.U0.add(i10, o2Var);
            J("addFragmentToStack");
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

    public final void c0(o2 o2Var, boolean z10) {
        if (this.U0.contains(o2Var)) {
            if (z10 && si.o0.g(1, this.U0) == o2Var) {
                o2Var.finishFragment();
                return;
            }
            if (si.o0.g(1, this.U0) == o2Var && this.U0.size() > 1) {
                o2Var.finishFragment(false);
                return;
            }
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.U0.remove(o2Var);
            J("removeFragmentFromStackInternal " + z10);
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
            t6 t6Var = (t6) arrayList.get(i10);
            iArr[i10] = t6Var.c();
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

    public final void d0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.U0.isEmpty()) {
            return;
        }
        int size = this.U0.size() - 1;
        if (this.U0.isEmpty()) {
            return;
        }
        if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((o2) this.U0.get(size)).fragmentView == null) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                o2 o2Var = (o2) this.U0.get(i11);
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(o2Var.actionBar);
                }
                View view = o2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    o2Var.onPause();
                    o2Var.onRemoveFromParent();
                    viewGroup.removeView(o2Var.fragmentView);
                }
            }
            o2 o2Var2 = (o2) this.U0.get(size);
            o2Var2.setParentLayout(this);
            View view2 = o2Var2.fragmentView;
            if (view2 == null) {
                view2 = o2Var2.performCreateView(this.Q0);
                if (view2 != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(o2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, w7.z5.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
            k kVar2 = o2Var2.actionBar;
            if (kVar2 != null && kVar2.K) {
                if (this.I0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(o2Var2.actionBar);
                this.s.addView(o2Var2.actionBar);
            }
            o2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
            o2Var2.attachSheets(this.s);
            o2Var2.onResume();
            o2Var2.onBecomeFullyVisible();
            this.y = o2Var2.actionBar;
            if (o2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            r6.i(k6.d6, view2, null);
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
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.b1;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
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
        d5 d5Var = this.P0;
        return (d5Var != null && d5Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r3.getWindowView() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3.getWindowView() != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k2 k2Var;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.t1.d));
        r rVar = this.G;
        k2 k2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            k2Var = this.G.getLastSheet();
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
                    this.q1 = z10;
                }
                if (!this.q1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.q1 = false;
                    }
                    return k2Var2.getWindowView().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.q1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        k2Var2 = k2Var;
        if (k2Var2 != null) {
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
        v vVar;
        View childAt;
        int i13;
        int i14;
        WindowInsets rootWindowInsets;
        float f7;
        float min;
        com.google.android.gms.internal.cast.z5 z5Var;
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
            if (view != this.E || (z5Var = this.F) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.a1;
                boolean z11 = this.d1;
                int width2 = getWidth();
                getY();
                getHeight();
                z5Var.n(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.a1 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31 && !this.b && (paddingRight != 0 || this.Z0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f10 = paddingRight;
                        rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.j1) {
                                f7 = 56.0f;
                                min = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.clamp01(f10 / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f7 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f10) / AndroidUtilities.dpf2(56.0f));
                            }
                            float clamp = (paddingRight <= AndroidUtilities.dp(f7) || this.T || !this.j1) ? Utilities.clamp(paddingRight, AndroidUtilities.dp(f7), 0) : f10;
                            if (!this.j1 || this.m1) {
                                canvas2.translate(-clamp, 0.0f);
                                i10 = (int) (i10 + clamp);
                            } else {
                                canvas2.translate(-clamp, 0.0f);
                                rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                                i10 = (int) (i10 + clamp);
                            }
                            canvas2.scale(min, min, this.m1 ? rectF.right - AndroidUtilities.dp(82.0f) : rectF.left + AndroidUtilities.dp(82.0f), this.j1 ? this.l1 : rectF.centerY());
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
                            float clamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            fArr[0] = fArr[0] * clamp01;
                            fArr[1] = fArr[1] * clamp01;
                            fArr[6] = fArr[6] * clamp01;
                            fArr[7] = fArr[7] * clamp01;
                        }
                        Path path = this.b1;
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
            if (!A() && !this.h) {
                canvas2.clipRect(i11, 0, i10, getHeight());
            }
            if ((!this.h || this.a0) && view == (vVar = this.s) && (childAt = vVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.J == null) {
                    int dp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - dp) / 2;
                    int translationY = (int) ((vVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    k6.s0.setBounds(measuredWidth, translationY, dp + measuredWidth, (dp / 2) + translationY);
                    k6.s0.draw(canvas2);
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
                int b10 = w7.r.b((i14 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (b10 > 0) {
                    int i15 = v(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i12 < 31 || this.b) {
                        Drawable drawable = w1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i15);
                        w1.setAlpha(b10);
                        w1.draw(canvas2);
                    }
                }
            } else if (view == this.v) {
                x1.setColor(Color.argb((int) (w7.r.a(i14 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
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
        o2 o2Var = !this.U0.isEmpty() ? (o2) si.o0.g(1, this.U0) : null;
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, 0.0f);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(bs.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<v, Float>) property, r5.getMeasuredWidth() + (this.j1 ? AndroidUtilities.dp(56.0f) : 0));
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(bs.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) si.o0.g(2, this.U0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0(qn qnVar) {
        try {
            int i10 = k6.f5;
            this.k0 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.k0[i11] = qnVar != null ? qnVar.g(i11) : k6.x0(null, i11, false);
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.k0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(g5 g5Var, Runnable runnable) {
        j6 j6Var;
        j6 j6Var2;
        boolean z10 = true;
        if (this.W || this.Q) {
            this.t0 = true;
            this.u0 = g5Var.a;
            this.w0 = g5Var.c;
            this.x0 = g5Var.b;
            this.v0 = g5Var.g;
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
        int size = g5Var.e ? 1 : this.U0.size();
        db dbVar = new db(this, size, g5Var, runnable, 9);
        if (size < 1 || !g5Var.f || !g5Var.g) {
            dbVar.run();
            return;
        }
        if (g5Var.m == null) {
            e0(null);
        }
        int i10 = g5Var.b;
        if (i10 != -1 && (j6Var2 = g5Var.a) != null) {
            j6Var2.u(i10);
            k6.w1(g5Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            k6.t(g5Var.a, true, g5Var.c);
            dbVar.run();
            return;
        }
        j6 j6Var3 = g5Var.a;
        boolean z11 = g5Var.c;
        p pVar = new p(dbVar, 0);
        int i11 = k6.a;
        if (j6Var3 == null) {
            pVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e) {
            e = e;
            j6Var = j6Var3;
        }
        if (j6Var3.b == null && j6Var3.d == null) {
            if (!z11) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.apply();
            }
            k6.tl.clear();
            k6.g0 = 0;
            k6.h0 = null;
            k6.e0 = null;
            k6.f0 = null;
            if (!z11 && k6.M == null) {
                k6.K = j6Var3;
                if (k6.I != k6.J) {
                    z10 = false;
                }
                if (z10) {
                    k6.T = 2000;
                    k6.U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new ah.j(21), 2100L);
                }
            }
            k6.I = j6Var3;
            k6.q1(false, false);
            j6Var = j6Var3;
            if (k6.M == null && !k6.Q) {
                MessagesController.getInstance(j6Var.E).saveTheme(j6Var, j6Var.k(false), z11, false);
            }
            pVar.run();
        }
        String[] strArr = new String[1];
        x9 x9Var = new x9(strArr, j6Var3, z11, pVar, 9);
        j6Var = j6Var3;
        try {
            int i12 = k6.Fl + 1;
            k6.Fl = i12;
            gi.g4 g4Var = new gi.g4(i12, pVar, x9Var);
            String str = j6Var.d;
            if (str != null) {
                Utilities.themeQueue.postRunnable(new org.telegram.messenger.camera.i(g4Var, obj, str, obj, 3));
            } else {
                Utilities.themeQueue.postRunnable(new org.telegram.messenger.camera.i(g4Var, new File(j6Var.b), obj, strArr, 3));
            }
        } catch (Exception e7) {
            e = e7;
            FileLog.e(e);
            if (k6.M == null) {
                MessagesController.getInstance(j6Var.E).saveTheme(j6Var, j6Var.k(false), z11, false);
            }
            pVar.run();
        }
    }

    public final void f0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.J0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    public final void g(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.o1;
            StringBuilder i10 = si.o0.i(str, " ");
            i10.append(this.U0.size());
            arrayList.add(0, i10.toString());
            if (this.o1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < 10; i11++) {
                    arrayList2.add((String) this.o1.get(i11));
                }
                this.o1 = arrayList2;
            }
        }
        o oVar = this.p1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    public final boolean g0() {
        o2 o2Var = !this.U0.isEmpty() ? (o2) si.o0.g(1, this.U0) : null;
        return (o2Var == null || o2Var.getLastStoryViewer() == null || !o2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public o2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (o2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public /* bridge */ /* synthetic */ h3 getBottomSheet() {
        return null;
    }

    public q3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.a0 && !this.n) {
            return 0.0f;
        }
        o2 o2Var = this.I;
        return ((o2Var == null || !o2Var.inPreviewMode) ? this.s : this.v).getAlpha();
    }

    public b4 getDrawerLayoutContainer() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public List<o2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public o2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (o2) si.o0.g(1, this.U0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        return lastFragment instanceof rg0 ? ((rg0) lastFragment).X() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public j5 getMessageDrawableOutMediaStart() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public j5 getMessageDrawableOutStart() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.h5
    public List<n9> getPulledDialogs() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public o2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            o2 o2Var = (o2) getFragmentStack().get(size);
            if (o2Var != null && o2Var.getContext() != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack()) {
                return o2Var;
            }
        }
        return null;
    }

    public ry getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public float getThemeAnimationValue() {
        return this.s0;
    }

    @Override // org.telegram.ui.ActionBar.h5
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
            V(this.z0, this.A0);
            this.y0 = false;
        } else if (this.t0) {
            g5 g5Var = new g5(this.u0, this.x0, this.w0, true);
            boolean z10 = this.v0;
            if (!z10) {
                g5Var.g = z10;
                g5Var.f = z10;
            }
            f(g5Var, null);
            this.u0 = null;
            this.t0 = false;
        }
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

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        o2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            d5 d5Var = this.P0;
            if ((d5Var != null && !d5Var.k(this)) || i() || this.U0.isEmpty()) {
                return;
            }
            Activity activity = this.Q0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i10 = 0;
            boolean z12 = !z11 && (this.h || this.a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            o2 o2Var = (o2) si.o0.g(1, this.U0);
            AnimatorSet animatorSet = null;
            o2 o2Var2 = this.U0.size() > 1 ? (o2) si.o0.g(2, this.U0) : null;
            if (o2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, k6.x0(null, k6.s8, false) == -1 || (o2Var2.hasForceLightStatusBar() && !k6.C0().q()));
                v vVar = this.s;
                this.s = this.v;
                this.v = vVar;
                o2Var2.setParentLayout(this);
                View view = o2Var2.fragmentView;
                if (view == null && (view = o2Var2.performCreateView(activity)) != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(o2Var2, i10);
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.a0.i(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        o2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            FileLog.e(e);
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
                    if (kVar != null && kVar.K) {
                        if (this.I0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    o2Var2.attachSheets(this.s);
                }
                this.H = o2Var2;
                this.I = o2Var;
                o2Var2.onTransitionAnimationStart(true, true);
                o2Var.onTransitionAnimationStart(false, true);
                o2Var2.onResume();
                if (this.q0 != null) {
                    this.i0 = o2Var2.getThemeDescriptions();
                }
                this.y = o2Var2.actionBar;
                if (!o2Var2.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.d6, view, null);
                }
                if (z12) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    o2Var.setRemovingFromStack(true);
                    this.E0 = new ig.d2(this, o2Var, o2Var2, 19);
                    if (!this.h && !this.a0) {
                        animatorSet = o2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.s.b || this.v.b)) {
                            f0(false, true, z13 || this.a0);
                        } else {
                            w2 w2Var = new w2(this, 1);
                            this.d = w2Var;
                            AndroidUtilities.runOnUIThread(w2Var, 200L);
                        }
                    } else {
                        this.K = animatorSet;
                        qc qcVar = qc.w;
                        if (qcVar != null && qcVar.l) {
                            qcVar.b();
                        }
                    }
                    J("closeLastFragment");
                } else {
                    m(o2Var);
                    o2Var.onTransitionAnimationEnd(false, true);
                    o2Var2.onTransitionAnimationEnd(true, true);
                    o2Var2.onBecomeFullyVisible();
                }
            } else if (!this.G0 || z11) {
                c0(o2Var, false);
                setVisibility(8);
                View view2 = this.H0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.B0 = System.currentTimeMillis();
                this.W = true;
                this.E0 = new m4.z(24, this, o2Var);
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
                this.K.addListener(new q(this, 0));
                this.K.start();
            }
            o2Var.onFragmentClosed();
        }
    }

    public final void m(o2 o2Var) {
        o2Var.finishing = true;
        o2Var.onPause();
        o2Var.onFragmentDestroy();
        o2Var.setParentLayout(null);
        this.U0.remove(o2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.s);
        v vVar = this.w;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        J("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((o2) si.o0.g(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z10 = this.S0;
        if (z10) {
            if (!(view instanceof v) || !((v) view).x) {
                r0.i0.b(view, r0.k1.b);
                return;
            }
            int i10 = k1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.k1 k1Var2 = r0.k1.b;
            int i11 = Build.VERSION.SDK_INT;
            r0.a1 z0Var = i11 >= 34 ? new r0.z0(k1Var2) : i11 >= 30 ? new r0.y0(k1Var2) : i11 >= 29 ? new r0.x0(k1Var2) : new r0.w0(k1Var2);
            z0Var.c(8, i0.b.b(0, 0, 0, max));
            r0.i0.b(view, z0Var.b());
            return;
        }
        boolean z11 = this.T0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.t1;
        i0.b bVar2 = this.u1;
        if (view instanceof q3) {
            AndroidUtilities.setViewLayoutMargins(view, z11 ? 0 : bVar.a, 0, z12 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof v) {
            v vVar = (v) view;
            int v = v(false);
            int i12 = v > 0 ? bVar.d + v : 0;
            c4 c4Var = vVar.w;
            boolean z13 = c4Var == c4.c;
            int i13 = (z13 || z11) ? 0 : bVar2.a;
            int i14 = (z13 || z12) ? 0 : bVar2.c;
            int i15 = (!z13 || z11) ? bVar2.a : 0;
            int i16 = (!z13 || z12) ? bVar2.c : 0;
            if (c4Var == c4.a) {
                i12 = Math.max(i12, bVar2.d);
                r0.i0.b(view, r0.k1.b);
            } else {
                r0.i0.b(view, k1Var.a.m(i15, 0, i16, i12));
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
            o2 o2Var = (o2) this.U0.get(i10);
            o2Var.onConfigurationChanged(configuration);
            Dialog dialog = o2Var.visibleDialog;
            if (dialog instanceof h3) {
                ((h3) dialog).onConfigurationChanged(configuration);
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
        k kVar;
        y yVar;
        if (i10 == 82 && !i() && !this.Q && (kVar = this.y) != null && !kVar.s() && (yVar = kVar.E) != null) {
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
                q3 q3Var = this.E;
                if (childAt == q3Var) {
                    q3Var.setCurrentAccount(UserConfig.selectedAccount);
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
        o2 o2Var = !this.U0.isEmpty() ? (o2) si.o0.g(1, this.U0) : null;
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && g0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, TLObject.FLAG_30));
            return;
        }
        d5 d5Var = this.P0;
        if (d5Var != null) {
            int[] iArr = this.e1;
            iArr[0] = i10;
            iArr[1] = i11;
            d5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        this.d1 = C() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!i() && !this.C0 && !this.T && !this.j1) {
            if (this.U0.size() > 1 && ((rVar = this.G) == null || rVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.D0) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                        this.U.addMovement(motionEvent);
                        if (this.W || this.h || !this.P || this.Q || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                            if (this.Q) {
                                if (!this.V) {
                                    Activity activity = this.Q0;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((o2) si.o0.g(1, this.U0)).onBeginSlide();
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
                        } else if (((o2) si.o0.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            P();
                        } else {
                            this.P = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.U == null) {
                            this.U = VelocityTracker.obtain();
                        }
                        this.U.addMovement(motionEvent);
                        this.U.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        o2 o2Var = (o2) si.o0.g(1, this.U0);
                        if (!this.h && !this.a0 && !this.Q && o2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.U.getXVelocity();
                            float yVelocity = this.U.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && o2Var.canBeginSlide()) {
                                this.R = (int) motionEvent.getX();
                                P();
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
                } else if (((o2) si.o0.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
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
        if (v1 == null || !SharedConfig.drawActionBarShadow) {
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
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.n = true;
        this.h = false;
        o2 o2Var = (o2) si.o0.g(2, this.U0);
        o2 o2Var2 = (o2) si.o0.g(1, this.U0);
        o2Var2.fragmentView.setOutlineProvider(null);
        o2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var2.fragmentView.setLayoutParams(layoutParams);
        U(o2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new bs(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ne(13, this, o2Var2));
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
            Activity activity = this.Q0;
            if (k6.x0(null, k6.s8, false) != -1 && (!o2Var2.hasForceLightStatusBar() || k6.C0().q())) {
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
        return !this.U0.isEmpty() && ((o2) si.o0.g(1, this.U0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setDelegate(d5 d5Var) {
        this.P0 = d5Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setDrawerLayoutContainer(b4 b4Var) {
        this.x = b4Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setFragmentPanTranslationOffset(int i10) {
        v vVar = this.s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setFragmentStack(List<o2> list) {
        this.U0 = list;
        q3 q3Var = this.E;
        if (q3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            q3Var.I.remove(oVar);
            q3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.R0;
        Activity activity = this.Q0;
        if (z10) {
            q3 q3Var2 = new q3(activity, this);
            this.E = q3Var2;
            this.F = new com.google.android.gms.internal.cast.z5(q3Var2);
            q3 q3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            q3Var3.I.add(oVar3);
            q3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            z3 z3Var = LaunchActivity.J1.y0;
            if (z3Var != null) {
                z3Var.setTabsView(this.E);
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
        this.h1.a = vVar6;
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
                this.w.addView(view, w7.z5.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            ((o2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.h5
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
        float clamp01 = D() ? Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6)) : f7 / this.s.getMeasuredWidth();
        o2 o2Var = (o2) si.o0.g(2, this.U0);
        o2Var.onSlideProgress(false, clamp01);
        o2 o2Var2 = (o2) si.o0.g(1, this.U0);
        float a2 = w7.r.a(clamp01 * 2.0f, 0.0f, 1.0f);
        if (!o2Var2.isBeginToShow() || (navigationBarColor = o2Var2.getNavigationBarColor()) == (navigationBarColor2 = o2Var.getNavigationBarColor())) {
            return;
        }
        o2Var2.setNavigationBarColor(i0.a.f(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setIsSheet(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setNavigationBarColor(int i10) {
        if (this.r1 != i10) {
            this.r1 = i10;
            invalidate();
        }
        b4 b4Var = this.x;
        if (b4Var != null) {
            b4Var.setInternalNavigationBarColor(i10);
        }
        q3 q3Var = this.E;
        if (q3Var != null) {
            q3Var.i(i10, (this.Q || this.T) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Z0 = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setPulledDialogs(List<n9> list) {
        this.V0 = list;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.I0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        this.s0 = f7;
        for (int i10 = 0; i10 < this.o0; i10++) {
            int f10 = i0.a.f(f7, this.m0[i10], this.n0[i10]);
            qn qnVar = this.p0;
            if (qnVar != null) {
                qnVar.h(this.l0[i10], f10);
            } else {
                int i11 = this.l0[i10];
                SparseIntArray sparseIntArray = k6.vl;
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
                int argb = Color.argb(Math.min(255, (int) (((alpha - r4) * f7) + Color.alpha(iArr[i13]))), Math.min(255, (int) (((red - red2) * f7) + red2)), Math.min(255, (int) (((green - green2) * f7) + green2)), Math.min(255, (int) (((blue - blue2) * f7) + blue2)));
                t6 t6Var = (t6) arrayList2.get(i13);
                int i16 = t6Var.e;
                g6 g6Var = t6Var.n;
                if (g6Var != null) {
                    g6Var.h(i16, argb);
                } else {
                    SparseIntArray sparseIntArray2 = k6.vl;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i16, argb);
                    }
                }
                t6Var.e(argb, false, false);
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
            s6 s6Var = (s6) arrayList4.get(i17);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                t6 t6Var2 = (t6) this.i0.get(i18);
                t6Var2.e(k6.w0(t6Var2.e, t6Var2.n), false, false);
            }
        }
        nn nnVar = this.g0;
        if (nnVar != null) {
            qn qnVar2 = nnVar.a;
            qnVar2.F.x0.invalidate();
            qnVar2.s.K = f7;
            qnVar2.t.K = f7;
            qnVar2.s(f7);
        }
        d5 d5Var = this.P0;
        if (d5Var != null) {
            d5Var.a(f7);
        }
        q6 q6Var = r6.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f7 >= 1.0f || currentAnimationTimeMillis != r6.c || f7 != r6.d) {
            r6.c = currentAnimationTimeMillis;
            r6.d = f7;
            r6.e0(this, f7 >= 1.0f);
        } else if (getWindowToken() == null) {
            q6 N = r6.N(false, 0, null);
            try {
                N.b(this);
            } finally {
                N.a();
            }
        }
        E();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setUseAlphaAnimations(boolean z10) {
        this.G0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final o2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            o2 o2Var = (o2) getFragmentStack().get(size);
            if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack() && ig0.class.isInstance(o2Var)) {
                return o2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        q3 q3Var;
        if (!this.R0 || (q3Var = this.E) == null) {
            return 0;
        }
        return z10 ? (int) q3Var.G : q3Var.H;
    }

    public final ry w() {
        Activity activity = this.Q0;
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
                this.w.addView(view, w7.z5.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
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

    @Override // org.telegram.ui.ActionBar.h5
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public ViewGroup getView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void setHighlightActionButtons(boolean z10) {
    }
}
