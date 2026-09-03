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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import lh.p6;
import n7.qa;
import nh.i9;
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
import org.telegram.messenger.wd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ez;
import org.telegram.ui.pg0;
import org.telegram.ui.un;
import org.telegram.ui.xg0;
import org.telegram.ui.xn;
import org.telegram.ui.z80;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class ActionBarLayout extends FrameLayout implements e5, zf.b {
    public static Drawable m1;
    public static Drawable n1;
    public static Paint o1;
    public s A0;
    public n3 B;
    public float B0;
    public c5.j C;
    public long C0;
    public r D;
    public String D0;
    public p2 E;
    public int E0;
    public p2 F;
    public z80 F0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout G;
    public b5 G0;
    public AnimatorSet H;
    public final Activity H0;
    public final DecelerateInterpolator I;
    public final boolean I0;
    public final OvershootInterpolator J;
    public boolean J0;
    public final AccelerateDecelerateInterpolator K;
    public boolean K0;
    public float L;
    public List L0;
    public boolean M;
    public List M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public boolean O0;
    public int P;
    public Runnable P0;
    public boolean Q;
    public int Q0;
    public VelocityTracker R;
    public boolean R0;
    public boolean S;
    public final Path S0;
    public boolean T;
    public final float[] T0;
    public boolean U;
    public boolean U0;
    public final ArrayList V;
    public final int[] V0;
    public final ArrayList W;
    public boolean W0;
    public int X0;
    public final org.telegram.ui.Components.z5 Y0;
    public boolean Z0;
    public boolean a;
    public final qa a0;
    public boolean a1;
    public boolean b;
    public g5 b0;
    public boolean b1;
    public Window c;
    public g5 c0;
    public float c1;
    public Runnable d;
    public un d0;
    public boolean d1;
    public Runnable e;
    public final ArrayList e0;
    public AnimatorSet e1;
    public boolean f;
    public ArrayList f0;
    public ArrayList f1;
    public final ArrayList g0;
    public final o g1;
    public boolean h;
    public AnimatorSet h0;
    public boolean h1;
    public final AnimationNotificationsLocker i0;
    public int i1;
    public float j0;
    public r0.m1 j1;
    public boolean k0;
    public i0.b k1;
    public i6 l0;
    public i0.b l1;
    public boolean m0;
    public boolean n;
    public boolean n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public ColorDrawable r;
    public boolean r0;
    public w s;
    public long s0;
    public boolean t0;
    public int u0;
    public w v;
    public Runnable v0;
    public w w;
    public Runnable w0;
    public y3 x;
    public boolean x0;
    public k y;
    public View y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z4) {
        super(context);
        this.I = new DecelerateInterpolator(1.5f);
        this.J = new OvershootInterpolator(1.02f);
        this.K = new AccelerateDecelerateInterpolator();
        this.V = new ArrayList();
        this.W = new ArrayList();
        qa qaVar = new qa(8);
        qaVar.b = new SparseIntArray();
        qaVar.c = new int[]{j6.Aa, j6.Da, j6.Ea, j6.Fa, j6.ac, j6.Ca};
        this.a0 = qaVar;
        this.e0 = new ArrayList();
        this.g0 = new ArrayList();
        this.i0 = new AnimationNotificationsLocker();
        this.N0 = new Rect();
        this.Q0 = -1;
        this.S0 = new Path();
        this.T0 = new float[8];
        this.V0 = new int[2];
        this.Y0 = new org.telegram.ui.Components.z5(this, 280L, mr.h);
        this.f1 = new ArrayList();
        this.g1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.k1 = bVar;
        this.l1 = bVar;
        this.H0 = (Activity) context;
        this.I0 = z4;
        if (n1 == null) {
            n1 = getResources().getDrawable(R.drawable.layer_shadow);
            m1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            o1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(this, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(ArrayList arrayList, View view) {
        if (view instanceof zf.b) {
            arrayList.addAll(((zf.b) view).B());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                E(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z4) {
            if (actionBarLayout.L0.size() >= 2) {
                ((p2) ai.j(1, actionBarLayout.L0)).prepareFragmentToSlide(true, false);
                p2 p2Var = (p2) ai.j(2, actionBarLayout.L0);
                p2Var.prepareFragmentToSlide(false, false);
                p2Var.onPause();
                View view = p2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    p2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(p2Var.fragmentView);
                }
                k kVar = p2Var.actionBar;
                if (kVar != null && kVar.H && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(p2Var.actionBar);
                }
                p2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.L0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            p2 p2Var2 = (p2) ai.j(1, actionBarLayout.L0);
            p2Var2.prepareFragmentToSlide(true, false);
            p2Var2.onPause();
            p2Var2.onFragmentDestroy();
            p2Var2.setParentLayout(null);
            List list = actionBarLayout.L0;
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
            if (actionBarLayout.L0.size() > 0) {
                p2 p2Var3 = (p2) ai.j(1, actionBarLayout.L0);
                actionBarLayout.y = p2Var3.actionBar;
                p2Var3.onResume();
                p2Var3.onBecomeFullyVisible();
                p2Var3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.N = false;
        actionBarLayout.Q = false;
        actionBarLayout.s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
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
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof a6) {
                ((a6) childAt).e();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    public final boolean A() {
        return this.T || this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zf.b
    public final List B() {
        p2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof zf.b) {
            arrayList.addAll(((zf.b) lastFragment).B());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final int C() {
        View rootView = getRootView();
        Rect rect = this.N0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        return this.a1 && this.b1;
    }

    public final void F(boolean z4) {
        H();
        K();
        Runnable runnable = this.d;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            if (z4) {
                animatorSet.cancel();
            }
            this.H = null;
        }
        s sVar = this.A0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.A0 = null;
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
        if (this.U || this.N || j() || this.L0.isEmpty()) {
            return;
        }
        b30 b30Var = b30.a0;
        if (b30Var != null && b30Var.w) {
            b30Var.e(false);
            return;
        }
        if (!e0() && (kVar = this.y) != null && !kVar.s()) {
            k kVar2 = this.y;
            if (kVar2.k0) {
                kVar2.h(true);
                return;
            }
        }
        r rVar = this.D;
        if ((rVar == null || rVar.onBackPressed(true)) && ((p2) ai.j(1, this.L0)).onBackPressed(true) && !this.L0.isEmpty()) {
            l(true, false);
        }
    }

    public final void H() {
        if (!this.T || this.v0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            this.H = null;
            animatorSet.cancel();
        }
        this.T = false;
        this.U = false;
        this.s0 = 0L;
        this.E = null;
        this.F = null;
        Runnable runnable = this.v0;
        this.v0 = null;
        if (runnable != null) {
            runnable.run();
        }
        i();
        i();
    }

    public final void I(String str) {
        Runnable runnable = this.P0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        Iterator it = this.L0.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (!this.T || (runnable = this.w0) == null) {
            return;
        }
        this.T = false;
        this.U = false;
        this.s0 = 0L;
        this.E = null;
        this.F = null;
        this.w0 = null;
        runnable.run();
        i();
    }

    public final void L() {
        if (!this.L0.isEmpty()) {
            ((p2) ai.j(1, this.L0)).onPause();
        }
        r rVar = this.D;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.L0.isEmpty()) {
            ((p2) ai.j(1, this.L0)).onResume();
        }
        r rVar = this.D;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.B == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.B.getX() + getX(), this.B.getY() + getY());
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void O() {
        int i10 = 0;
        this.M = false;
        this.N = true;
        this.v.setVisibility(0);
        this.S = false;
        p2 p2Var = (p2) ai.j(2, this.L0);
        View view = p2Var.fragmentView;
        if (view == null && (view = p2Var.performCreateView(this.H0)) != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
            n nVar = new n(p2Var, i10);
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            p2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = p2Var.actionBar;
        if (kVar != null && kVar.H) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.z0) {
                p2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(p2Var.actionBar);
        }
        p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
        p2Var.attachSheets(this.v);
        if (!p2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.d6, false));
        }
        p2Var.onResume();
        if (this.h0 != null) {
            this.f0 = p2Var.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((p2) ai.j(1, this.L0)).prepareFragmentToSlide(true, true);
        p2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(p2 p2Var) {
        return R(new c5(p2Var));
    }

    public final boolean Q(p2 p2Var, boolean z4) {
        c5 c5Var = new c5(p2Var);
        c5Var.b = z4;
        return R(c5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0242, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(c5 c5Var) {
        b5 b5Var;
        ArrayList arrayList;
        z3 z3Var;
        p2 p2Var;
        int i10;
        LaunchActivity launchActivity;
        Dialog dialog;
        p2 p2Var2 = c5Var.a;
        boolean z4 = c5Var.b;
        boolean z10 = c5Var.c;
        boolean z11 = c5Var.d;
        boolean z12 = c5Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.f;
        int i11 = 0;
        if (p2Var2 == null || j() || !(((b5Var = this.G0) == null || !z11 || b5Var.l(this, c5Var)) && p2Var2.onFragmentCreate())) {
            return false;
        }
        z3 edgeToEdgeSupportMode = p2Var2.getEdgeToEdgeSupportMode();
        z3 z3Var2 = z3.a;
        int i12 = 1;
        boolean z13 = edgeToEdgeSupportMode != z3Var2;
        boolean drawEdgeNavigationBar = p2Var2.drawEdgeNavigationBar();
        p2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.D1) != null) {
            ArrayList arrayList2 = launchActivity.B0;
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
                ArrayList arrayList3 = LaunchActivity.D1.B0;
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof li) || (visibleDialog instanceof rh.p2))) {
            n2 n2Var = new n2();
            n2Var.a = true;
            lastFragment.showAsSheet(p2Var2, n2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + p2Var2.getClass().getSimpleName() + " args=" + p2Var2.getArguments());
        }
        int i13 = 0;
        while (true) {
            arrayList = i9.v1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((i9) arrayList.get(i13)).q(false);
            i13++;
        }
        arrayList.clear();
        n3 n3Var = this.B;
        if (n3Var != null && !n3Var.c) {
            LaunchActivity.L();
        }
        if (this.h && this.U) {
            Runnable runnable = this.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.e = null;
            }
            l(false, true);
        }
        p2Var2.setInPreviewMode(z12);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.G;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.G.getParent()).removeView(this.G);
            }
            this.G = null;
        }
        this.G = actionBarPopupWindow$ActionBarPopupWindowLayout;
        p2Var2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.H0;
        if (activity.getCurrentFocus() != null && p2Var2.hideKeyboardOnShow() && !z12) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z14 = z12 || (!z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.L0.isEmpty()) {
            z3Var = z3Var2;
            p2Var = null;
        } else {
            z3Var = z3Var2;
            p2Var = (p2) ai.j(1, this.L0);
        }
        p2Var2.setParentLayout(this);
        View view = p2Var2.fragmentView;
        if (view == null) {
            view = p2Var2.performCreateView(activity);
            if (view != null && p2Var2.isSupportEdgeToEdge() && p2Var2.drawEdgeNavigationBar()) {
                n nVar = new n(p2Var2, i11);
                WeakHashMap weakHashMap = r0.j0.a;
                r0.b0.j(view, nVar);
                this.v.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                p2Var2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.v.addView(view);
        w wVar = this.v;
        if (z12) {
            edgeToEdgeSupportMode = z3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.v.setDrawNavigationBar(!z12 && drawEdgeNavigationBar);
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
        if (z12) {
            int previewHeight = p2Var2.getPreviewHeight();
            int i14 = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0 && previewHeight < getMeasuredHeight() - i14) {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i14) - previewHeight) / 2) + i14;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    layoutParams2.bottomMargin = org.telegram.messenger.y3.C(8.0f, i10, layoutParams2.bottomMargin);
                }
                int dp = AndroidUtilities.dp(8.0f);
                layoutParams2.leftMargin = dp;
                layoutParams2.rightMargin = dp;
            }
            float f10 = 24.0f;
            int dp2 = AndroidUtilities.dp(f10);
            layoutParams2.bottomMargin = dp2;
            layoutParams2.topMargin = dp2;
            int i15 = AndroidUtilities.statusBarHeight;
            int i16 = dp2 + i15;
            layoutParams2.topMargin = i16;
            if (z13) {
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
        k kVar = p2Var2.actionBar;
        if (kVar != null && kVar.H) {
            if (this.z0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(p2Var2.actionBar);
            this.v.addView(p2Var2.actionBar);
        }
        p2Var2.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
        p2Var2.attachSheets(this.v);
        this.L0.add(p2Var2);
        I("presentFragment");
        p2Var2.onResume();
        this.y = p2Var2.actionBar;
        if (!p2Var2.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.d6, false));
        }
        w wVar2 = this.s;
        w wVar3 = this.v;
        this.s = wVar3;
        this.v = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z12) {
            if (!(p2Var2 instanceof zn)) {
                float dp4 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                gg.j1 j1Var = kf.r0.a;
                view.setOutlineProvider(new kf.q0(0, dp4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new t());
            } else {
                float dp5 = AndroidUtilities.dp(29.0f);
                gg.j1 j1Var2 = kf.r0.a;
                view.setOutlineProvider(new kf.q0(0, dp5));
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
        if (!z14) {
            T(p2Var, z4);
            View view2 = this.y0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.h0 != null) {
            this.f0 = p2Var2.getThemeDescriptions();
        }
        if (!z14 && !z12) {
            View view3 = this.y0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.y0.setVisibility(0);
            }
            if (p2Var != null) {
                p2Var.onTransitionAnimationStart(false, false);
                p2Var.onTransitionAnimationEnd(false, false);
            }
            p2Var2.onTransitionAnimationStart(true, false);
            p2Var2.onTransitionAnimationEnd(true, false);
            p2Var2.onBecomeFullyVisible();
            return true;
        }
        if (this.x0 && this.L0.size() == 1) {
            T(p2Var, z4);
            this.s0 = System.currentTimeMillis();
            this.T = true;
            this.w0 = new org.telegram.messenger.voip.h(10, p2Var, p2Var2);
            ArrayList arrayList4 = new ArrayList();
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
            View view4 = this.y0;
            if (view4 != null) {
                view4.setVisibility(0);
                arrayList4.add(ObjectAnimator.ofFloat(this.y0, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            if (p2Var != null) {
                p2Var.onTransitionAnimationStart(false, false);
            }
            p2Var2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.H = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.H.setInterpolator(mr.h);
            this.H.setDuration(200L);
            this.H.addListener(new q(this, 1));
            this.H.start();
            return true;
        }
        this.U = z12;
        this.s0 = System.currentTimeMillis();
        this.T = true;
        wd wdVar = new wd(this, z12, actionBarPopupWindow$ActionBarPopupWindowLayout, z4, p2Var, p2Var2);
        p2 p2Var3 = p2Var;
        this.w0 = wdVar;
        boolean needDelayOpenAnimation = p2Var2.needDelayOpenAnimation();
        boolean z15 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (p2Var3 != null) {
                p2Var3.onTransitionAnimationStart(false, false);
            }
            p2Var2.onTransitionAnimationStart(true, false);
        }
        this.O0 = false;
        this.F = p2Var3;
        this.E = p2Var2;
        AnimatorSet onCustomTransitionAnimation = !z12 ? p2Var2.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z12 && ((this.s.b || this.v.b) && p2Var3 != null)) {
                p2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.H = onCustomTransitionAnimation;
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
        if (!this.s.b && !this.v.b) {
            if (!p2Var2.needDelayOpenAnimation()) {
                d0(true, true, z12);
                return true;
            }
            kc.j jVar = new kc.j(this, p2Var2, z12, i12);
            this.e = jVar;
            AndroidUtilities.runOnUIThread(jVar, 200L);
            return true;
        }
        if (p2Var3 != null && !z12) {
            p2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z15, p2Var3, p2Var2, z12);
        if (p2Var2.needDelayOpenAnimation()) {
            this.e = new v(this, p2Var3, p2Var2, z12);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean S(p2 p2Var, boolean z4, boolean z10) {
        c5 c5Var = new c5(p2Var);
        c5Var.b = z4;
        c5Var.c = z10;
        c5Var.d = true;
        c5Var.e = false;
        return R(c5Var);
    }

    public final void T(p2 p2Var, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (p2Var == null) {
            return;
        }
        p2Var.onBecomeFullyHidden();
        p2Var.onPause();
        if (z4) {
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.L0.remove(p2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = p2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                p2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(p2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(p2Var.fragmentView);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            }
            k kVar = p2Var.actionBar;
            if (kVar != null && kVar.H && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(p2Var.actionBar);
            }
            p2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z4, boolean z10) {
        if (this.T || this.N) {
            this.p0 = true;
            this.q0 = z4;
            this.r0 = z10;
            return;
        }
        int size = this.L0.size();
        if (!z4) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ((p2) this.L0.get(i10)).clearViews();
            ((p2) this.L0.get(i10)).setParentLayout(this);
        }
        b5 b5Var = this.G0;
        if (b5Var != null) {
            b5Var.b(this, z4);
        }
        if (z10) {
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
        this.E = null;
        this.F = null;
    }

    public final void X() {
        while (this.L0.size() > 0) {
            b0((p2) this.L0.get(0), false);
        }
        View view = this.y0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 < 0 || i10 >= getFragmentStack().size()) {
            return;
        }
        Z((p2) getFragmentStack().get(i10));
    }

    public final void Z(p2 p2Var) {
        a0(p2Var, false);
    }

    public final void a0(p2 p2Var, boolean z4) {
        if ((this.L0.size() > 0 && ai.j(1, this.L0) == p2Var) || (this.L0.size() > 1 && ai.j(2, this.L0) == p2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z4);
        if (this.x0 && this.L0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.G0 != null && this.L0.size() == 1 && AndroidUtilities.isTablet()) {
            this.G0.k(this);
        }
        b0(p2Var, p2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.j1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.W.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((l6) arrayList.get(i10)).b();
        }
    }

    public final void b0(p2 p2Var, boolean z4) {
        if (this.L0.contains(p2Var)) {
            if (z4 && ai.j(1, this.L0) == p2Var) {
                p2Var.finishFragment();
                return;
            }
            if (ai.j(1, this.L0) == p2Var && this.L0.size() > 1) {
                p2Var.finishFragment(false);
                return;
            }
            p2Var.onPause();
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.L0.remove(p2Var);
            I("removeFragmentFromStackInternal " + z4);
        }
    }

    public final boolean c(int i10, p2 p2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        b5 b5Var = this.G0;
        int i11 = 0;
        if ((b5Var != null && !b5Var.h(p2Var, this)) || !p2Var.onFragmentCreate() || this.L0.contains(p2Var)) {
            return false;
        }
        p2Var.setParentLayout(this);
        Activity activity = this.H0;
        if (i10 == -1 || i10 == -2) {
            if (!this.L0.isEmpty()) {
                p2 p2Var2 = (p2) ai.j(1, this.L0);
                p2Var2.onPause();
                k kVar = p2Var2.actionBar;
                if (kVar != null && kVar.H && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(p2Var2.actionBar);
                }
                View view = p2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    p2Var2.onRemoveFromParent();
                    viewGroup.removeView(p2Var2.fragmentView);
                }
                p2Var2.detachSheets();
            }
            this.L0.add(p2Var);
            if (i10 != -2) {
                View view2 = p2Var.fragmentView;
                if (view2 == null) {
                    view2 = p2Var.performCreateView(activity);
                    if (view2 != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(p2Var, i11);
                        WeakHashMap weakHashMap = r0.j0.a;
                        r0.b0.j(view2, nVar);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!p2Var.hasOwnBackground && view2.getBackground() == null) {
                    view2.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                this.s.addView(view2, k7.b6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                k kVar2 = p2Var.actionBar;
                if (kVar2 != null && kVar2.H) {
                    if (this.z0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(p2Var.actionBar);
                    }
                    this.s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                p2Var.attachSheets(this.s);
                p2Var.onResume();
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var.onTransitionAnimationEnd(true, true);
                p2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View view3 = p2Var.fragmentView;
                if (view3 == null) {
                    view3 = p2Var.performCreateView(activity);
                    if (view3 != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(p2Var, i11);
                        WeakHashMap weakHashMap2 = r0.j0.a;
                        r0.b0.j(view3, nVar2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!p2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                w wVar = this.s;
                wVar.addView(view3, Utilities.clamp(0, wVar.getChildCount(), 0), k7.b6.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                k kVar3 = p2Var.actionBar;
                if (kVar3 != null && kVar3.H) {
                    if (this.z0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(p2Var.actionBar);
                    }
                    this.s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                p2Var.attachSheets(this.s);
                i10 = 0;
            }
            this.L0.add(i10, p2Var);
            I("addFragmentToStack");
        }
        if (!this.x0) {
            setVisibility(0);
            View view4 = this.y0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.L0.isEmpty()) {
            return;
        }
        int size = this.L0.size() - 1;
        if (this.L0.isEmpty()) {
            return;
        }
        if (this.L0.isEmpty() || this.L0.size() - 1 != size || ((p2) this.L0.get(size)).fragmentView == null) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                p2 p2Var = (p2) this.L0.get(i11);
                k kVar = p2Var.actionBar;
                if (kVar != null && kVar.H && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(p2Var.actionBar);
                }
                View view = p2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    p2Var.onPause();
                    p2Var.onRemoveFromParent();
                    viewGroup.removeView(p2Var.fragmentView);
                }
            }
            p2 p2Var2 = (p2) this.L0.get(size);
            p2Var2.setParentLayout(this);
            View view2 = p2Var2.fragmentView;
            if (view2 == null) {
                view2 = p2Var2.performCreateView(this.H0);
                if (view2 != null && p2Var2.isSupportEdgeToEdge() && p2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(p2Var2, i10);
                    WeakHashMap weakHashMap = r0.j0.a;
                    r0.b0.j(view2, nVar);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    p2Var2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, k7.b6.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(p2Var2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(p2Var2.drawEdgeNavigationBar());
            k kVar2 = p2Var2.actionBar;
            if (kVar2 != null && kVar2.H) {
                if (this.z0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(p2Var2.actionBar);
                this.s.addView(p2Var2.actionBar);
            }
            p2Var2.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
            p2Var2.attachSheets(this.s);
            p2Var2.onResume();
            p2Var2.onBecomeFullyVisible();
            this.y = p2Var2.actionBar;
            if (p2Var2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            view2.setBackgroundColor(j6.w0(null, j6.d6, false));
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.e0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.V.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l6 l6Var = (l6) arrayList.get(i10);
            iArr[i10] = l6Var.b();
            k6 k6Var = l6Var.h;
            l6Var.h = null;
            if (k6Var != null) {
                ArrayList arrayList2 = this.g0;
                if (!arrayList2.contains(k6Var)) {
                    arrayList2.add(k6Var);
                }
            }
        }
    }

    public final void d0(boolean z4, boolean z10, boolean z11) {
        if (z10) {
            this.B0 = 0.0f;
            this.C0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z10, z11, z4);
        this.A0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.B == null || v(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.B.getMeasuredHeight() + this.k1.d), getWidth(), getHeight(), this.B.getBackgroundPaint());
        }
        this.R0 = true;
        if (this.J0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.S0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.J0) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        b5 b5Var = this.G0;
        return (b5Var != null && b5Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
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
        l2 l2Var;
        boolean z4 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.k1.d));
        r rVar = this.D;
        l2 l2Var2 = null;
        if (rVar != null && rVar.getLastSheet() != null) {
            l2Var = this.D.getLastSheet();
            if (l2Var.attachedToParent()) {
            }
        }
        l2Var = null;
        if (l2Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            l2Var = getLastFragment().getLastSheet();
            if (l2Var.attachedToParent()) {
            }
            if (l2Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.h1 = z4;
                }
                if (!this.h1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.h1 = false;
                    }
                    return l2Var2.getWindowView().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.h1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        l2Var2 = l2Var;
        if (l2Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.h1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0278, code lost:
    
        if (r21.Q0 != (-1)) goto L113;
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
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        w wVar;
        View childAt;
        int i13;
        int i14;
        WindowInsets rootWindowInsets;
        float f10;
        float min;
        c5.j jVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.L);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.v) {
            paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
        } else if (view == this.s) {
            i10 = paddingLeft2;
            i11 = paddingRight;
            int save = canvas.save();
            if (view != this.B || (jVar = this.C) == null) {
                canvas2 = canvas;
            } else {
                boolean z4 = this.R0;
                boolean z10 = this.U0;
                int width2 = getWidth();
                getY();
                getHeight();
                jVar.s(canvas, z4, z10, width2, 1.0f);
                canvas2 = canvas;
                this.R0 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31 && !this.b && (paddingRight != 0 || this.Q0 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = paddingRight;
                        rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.a1) {
                                f10 = 56.0f;
                                min = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.clamp01(f11 / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f10 = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f11) / AndroidUtilities.dpf2(56.0f));
                            }
                            float clamp = (paddingRight <= AndroidUtilities.dp(f10) || this.Q || !this.a1) ? Utilities.clamp(paddingRight, AndroidUtilities.dp(f10), 0) : f11;
                            if (!this.a1 || this.d1) {
                                canvas2.translate(-clamp, 0.0f);
                                i10 = (int) (i10 + clamp);
                            } else {
                                canvas2.translate(-clamp, 0.0f);
                                rectF.set(f11, 0.0f, getWidth() + paddingRight, getHeight());
                                i10 = (int) (i10 + clamp);
                            }
                            canvas2.scale(min, min, this.d1 ? rectF.right - AndroidUtilities.dp(82.0f) : rectF.left + AndroidUtilities.dp(82.0f), this.a1 ? this.c1 : rectF.centerY());
                        }
                        RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                        RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                        RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                        RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                        float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                        float[] fArr = this.T0;
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
                        if (this.K0) {
                            float clamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            fArr[0] = fArr[0] * clamp01;
                            fArr[1] = fArr[1] * clamp01;
                            fArr[6] = fArr[6] * clamp01;
                            fArr[7] = fArr[7] * clamp01;
                        }
                        Path path = this.S0;
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
            if ((!this.h || this.U) && view == (wVar = this.s) && (childAt = wVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.G == null) {
                    int dp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - dp) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    j6.s0.setBounds(measuredWidth, translationY, dp + measuredWidth, (dp / 2) + translationY);
                    j6.s0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas2.restoreToCount(save2);
            i13 = paddingRight != 0 ? -1 : -1;
            i14 = this.Q0;
            if (i14 == i13) {
                i14 = width - paddingRight;
            }
            if (view != this.s) {
                int b10 = k7.n.b((i14 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (b10 > 0) {
                    int i15 = v(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i12 < 31 || this.b) {
                        Drawable drawable = n1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i15);
                        n1.setAlpha(b10);
                        n1.draw(canvas2);
                    }
                }
            } else if (view == this.v) {
                o1.setColor(Color.argb((int) (k7.n.a(i14 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.Q0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, o1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i11, 0.0f, i10, getHeight() * 1.5f, o1);
                }
            }
            canvas2.restoreToCount(save);
            return drawChild;
        }
        i11 = paddingLeft;
        i10 = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.B) {
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
        if (this.G == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i14 = this.Q0;
        if (i14 == i13) {
        }
        if (view != this.s) {
        }
        canvas2.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(boolean z4) {
        Animator customSlideTransition;
        p2 p2Var = !this.L0.isEmpty() ? (p2) ai.j(1, this.L0) : null;
        if (p2Var == null) {
            return;
        }
        float x10 = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = p2Var.shouldOverrideSlideTransition(false, z4);
        Property property = View.TRANSLATION_X;
        if (z4) {
            int max = Math.max((int) ((320.0f / this.s.getMeasuredWidth()) * x10), D() ? 320 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, 0.0f);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(mr.h);
                }
            }
        } else {
            x10 = Math.abs(this.s.getMeasuredWidth() - x10);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x10), D() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<w, Float>) property, r5.getMeasuredWidth() + (this.a1 ? AndroidUtilities.dp(56.0f) : 0));
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(mr.h);
                }
            }
        }
        Animator customSlideTransition2 = p2Var.getCustomSlideTransition(false, z4, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        p2 p2Var2 = (p2) ai.j(2, this.L0);
        if (p2Var2 != null && (customSlideTransition = p2Var2.getCustomSlideTransition(false, z4, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z4));
        this.e1 = animatorSet;
        animatorSet.start();
        this.Q = true;
    }

    public final boolean e0() {
        p2 p2Var = !this.L0.isEmpty() ? (p2) ai.j(1, this.L0) : null;
        return (p2Var == null || p2Var.getLastStoryViewer() == null || !p2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r0.putString("theme", r12.m());
        r0.apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(d5 d5Var, Runnable runnable) {
        i6 i6Var;
        i6 i6Var2;
        final int i10 = 1;
        if (this.T || this.N) {
            this.k0 = true;
            this.l0 = d5Var.a;
            this.n0 = d5Var.c;
            this.o0 = d5Var.b;
            this.m0 = d5Var.g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.h0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h0 = null;
        }
        int size = d5Var.e ? 1 : this.L0.size();
        cg.v1 v1Var = new cg.v1(this, size, d5Var, runnable, 7);
        if (size < 1 || !d5Var.f || !d5Var.g) {
            v1Var.run();
            return;
        }
        int i11 = d5Var.b;
        if (i11 != -1 && (i6Var2 = d5Var.a) != null) {
            i6Var2.u(i11);
            j6.t1(d5Var.a, true, false, true, false, false);
        }
        if (runnable == null) {
            j6.t(d5Var.a, true, d5Var.c);
            v1Var.run();
            return;
        }
        i6 i6Var3 = d5Var.a;
        boolean z4 = d5Var.c;
        final int i12 = 0;
        p pVar = new p(v1Var, i12);
        int i13 = j6.a;
        if (i6Var3 == null) {
            pVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
        } catch (Exception e) {
            e = e;
            i6Var = i6Var3;
        }
        if (i6Var3.b == null && i6Var3.d == null) {
            if (!z4) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.apply();
            }
            j6.ql.clear();
            j6.g0 = 0;
            j6.h0 = null;
            j6.e0 = null;
            j6.f0 = null;
            if (!z4 && j6.M == null) {
                j6.K = i6Var3;
                if (j6.I != j6.J) {
                    i10 = 0;
                }
                if (i10 != 0) {
                    j6.T = 2000;
                    j6.U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new cg.n0(19), 2100L);
                }
            }
            j6.I = i6Var3;
            j6.n1(false, false);
            i6Var = i6Var3;
            if (j6.M == null && !j6.Q) {
                MessagesController.getInstance(i6Var.B).saveTheme(i6Var, i6Var.k(false), z4, false);
            }
            pVar.run();
        }
        String[] strArr = new String[1];
        final cg.u0 u0Var = new cg.u0(strArr, i6Var3, z4, pVar, 5);
        i6Var = i6Var3;
        try {
            String str = i6Var.d;
            if (str != null) {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.c(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.m5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i12) {
                            case 0:
                                j6.ql = sparseIntArray;
                                u0Var.run();
                                break;
                            default:
                                j6.ql = sparseIntArray;
                                u0Var.run();
                                break;
                        }
                    }
                }, obj, str, obj, 20));
            } else {
                Utilities.themeQueue.postRunnable(new androidx.car.app.utils.c(new Utilities.Callback() { // from class: org.telegram.ui.ActionBar.m5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                        switch (i10) {
                            case 0:
                                j6.ql = sparseIntArray;
                                u0Var.run();
                                break;
                            default:
                                j6.ql = sparseIntArray;
                                u0Var.run();
                                break;
                        }
                    }
                }, new File(i6Var.b), obj, strArr, 20));
            }
        } catch (Exception e6) {
            e = e6;
            FileLog.e(e);
            if (j6.M == null) {
                MessagesController.getInstance(i6Var.B).saveTheme(i6Var, i6Var.k(false), z4, false);
            }
            pVar.run();
        }
    }

    public final void g(i6 i6Var, int i10, boolean z4, boolean z10, Runnable runnable) {
        f(new d5(i6Var, i10, z4, z10), runnable);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public p2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (p2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public /* bridge */ /* synthetic */ g3 getBottomSheet() {
        return null;
    }

    public n3 getBottomSheetTabs() {
        return this.B;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.U && !this.n) {
            return 0.0f;
        }
        p2 p2Var = this.F;
        return ((p2Var == null || !p2Var.inPreviewMode) ? this.s : this.v).getAlpha();
    }

    public y3 getDrawerLayoutContainer() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public List<p2> getFragmentStack() {
        return this.L0;
    }

    public float getInnerTranslationX() {
        return this.L;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public p2 getLastFragment() {
        if (this.L0.isEmpty()) {
            return null;
        }
        return (p2) ai.j(1, this.L0);
    }

    public p2 getLastFragmentIncludeMainTabs() {
        p2 lastFragment = getLastFragment();
        return lastFragment instanceof xg0 ? ((xg0) lastFragment).X() : lastFragment;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public g5 getMessageDrawableOutMediaStart() {
        return this.c0;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public g5 getMessageDrawableOutStart() {
        return this.b0;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override // org.telegram.ui.ActionBar.e5
    public List<g9> getPulledDialogs() {
        return this.M0;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public p2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            p2 p2Var = (p2) getFragmentStack().get(size);
            if (p2Var != null && !p2Var.isFinishing() && !p2Var.isRemovingFromStack()) {
                return p2Var;
            }
        }
        return null;
    }

    public ez getSheetFragment() {
        return w();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public float getThemeAnimationValue() {
        return this.j0;
    }

    @Override // org.telegram.ui.ActionBar.e5
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
            ArrayList arrayList = this.f1;
            StringBuilder f10 = vh.w2.f(str, " ");
            f10.append(this.L0.size());
            arrayList.add(0, f10.toString());
            if (this.f1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f1.get(i10));
                }
                this.f1 = arrayList2;
            }
        }
        o oVar = this.g1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.p0) {
            U(this.q0, this.r0);
            this.p0 = false;
        } else if (this.k0) {
            d5 d5Var = new d5(this.l0, this.o0, this.n0, false);
            boolean z4 = this.m0;
            if (!z4) {
                d5Var.g = z4;
                d5Var.f = z4;
            }
            f(d5Var, null);
            this.l0 = null;
            this.k0 = false;
        }
    }

    public final boolean j() {
        if (this.U) {
            return false;
        }
        if (this.T && (this.s0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.T;
    }

    public final void k(boolean z4) {
        l(z4, false);
    }

    public final void l(boolean z4, boolean z10) {
        p2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            b5 b5Var = this.G0;
            if ((b5Var != null && !b5Var.k(this)) || j() || this.L0.isEmpty()) {
                return;
            }
            Activity activity = this.H0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i10 = 0;
            boolean z11 = !z10 && (this.h || this.U || (z4 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            p2 p2Var = (p2) ai.j(1, this.L0);
            AnimatorSet animatorSet = null;
            p2 p2Var2 = this.L0.size() > 1 ? (p2) ai.j(2, this.L0) : null;
            if (p2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, j6.w0(null, j6.s8, false) == -1 || (p2Var2.hasForceLightStatusBar() && !j6.A0().q()));
                w wVar = this.s;
                this.s = this.v;
                this.v = wVar;
                p2Var2.setParentLayout(this);
                View view = p2Var2.fragmentView;
                if (view == null && (view = p2Var2.performCreateView(activity)) != null && p2Var2.isSupportEdgeToEdge() && p2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(p2Var2, i10);
                    WeakHashMap weakHashMap = r0.j0.a;
                    r0.b0.j(view, nVar);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        p2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(p2Var2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(p2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    k kVar = p2Var2.actionBar;
                    if (kVar != null && kVar.H) {
                        if (this.z0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(p2Var2.actionBar);
                        this.s.addView(p2Var2.actionBar);
                    }
                    p2Var2.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                    p2Var2.attachSheets(this.s);
                }
                this.E = p2Var2;
                this.F = p2Var;
                p2Var2.onTransitionAnimationStart(true, true);
                p2Var.onTransitionAnimationStart(false, true);
                p2Var2.onResume();
                if (this.h0 != null) {
                    this.f0 = p2Var2.getThemeDescriptions();
                }
                this.y = p2Var2.actionBar;
                if (!p2Var2.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                if (z11) {
                    this.s0 = System.currentTimeMillis();
                    this.T = true;
                    p2Var.setRemovingFromStack(true);
                    this.v0 = new p6(this, p2Var, p2Var2, 17);
                    if (!this.h && !this.U) {
                        animatorSet = p2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSet == null) {
                        boolean z12 = this.h;
                        if (z12 || !(this.s.b || this.v.b)) {
                            d0(false, true, z12 || this.U);
                        } else {
                            w2 w2Var = new w2(this, 1);
                            this.d = w2Var;
                            AndroidUtilities.runOnUIThread(w2Var, 200L);
                        }
                    } else {
                        this.H = animatorSet;
                        ic icVar = ic.w;
                        if (icVar != null && icVar.l) {
                            icVar.b();
                        }
                    }
                    I("closeLastFragment");
                } else {
                    m(p2Var);
                    p2Var.onTransitionAnimationEnd(false, true);
                    p2Var2.onTransitionAnimationEnd(true, true);
                    p2Var2.onBecomeFullyVisible();
                }
            } else if (!this.x0 || z10) {
                b0(p2Var, false);
                setVisibility(8);
                View view2 = this.y0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.s0 = System.currentTimeMillis();
                this.T = true;
                this.v0 = new org.telegram.messenger.voip.h(9, this, p2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view3 = this.y0;
                if (view3 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.H.setInterpolator(this.K);
                this.H.setDuration(200L);
                this.H.addListener(new q(this, 0));
                this.H.start();
            }
            p2Var.onFragmentClosed();
        }
    }

    public final void m(p2 p2Var) {
        p2Var.finishing = true;
        p2Var.onPause();
        p2Var.onFragmentDestroy();
        p2Var.setParentLayout(null);
        this.L0.remove(p2Var);
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
        ((p2) ai.j(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.m1 m1Var) {
        boolean z4 = this.J0;
        if (z4) {
            if (!(view instanceof w) || !((w) view).x) {
                r0.j0.b(view, r0.m1.b);
                return;
            }
            int i10 = m1Var.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.m1 m1Var2 = r0.m1.b;
            int i11 = Build.VERSION.SDK_INT;
            r0.c1 b1Var = i11 >= 34 ? new r0.b1(m1Var2) : i11 >= 30 ? new r0.a1(m1Var2) : i11 >= 29 ? new r0.z0(m1Var2) : new r0.y0(m1Var2);
            b1Var.c(8, i0.b.b(0, 0, 0, max));
            r0.j0.b(view, b1Var.b());
            return;
        }
        boolean z10 = this.K0;
        boolean z11 = (z4 || z10 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.b bVar = this.k1;
        i0.b bVar2 = this.l1;
        if (view instanceof n3) {
            AndroidUtilities.setViewLayoutMargins(view, z10 ? 0 : bVar.a, 0, z11 ? 0 : bVar.c, bVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int v = v(false);
            int i12 = v > 0 ? bVar.d + v : 0;
            z3 z3Var = wVar.w;
            boolean z12 = z3Var == z3.c;
            int i13 = (z12 || z10) ? 0 : bVar2.a;
            int i14 = (z12 || z11) ? 0 : bVar2.c;
            int i15 = (!z12 || z10) ? bVar2.a : 0;
            int i16 = (!z12 || z11) ? bVar2.c : 0;
            if (z3Var == z3.a) {
                i12 = Math.max(i12, bVar2.d);
                r0.j0.b(view, r0.m1.b);
            } else {
                r0.j0.b(view, m1Var.a.m(i15, 0, i16, i12));
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
        if (this.L0.isEmpty()) {
            return;
        }
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            p2 p2Var = (p2) this.L0.get(i10);
            p2Var.onConfigurationChanged(configuration);
            Dialog dialog = p2Var.visibleDialog;
            if (dialog instanceof g3) {
                ((g3) dialog).onConfigurationChanged(configuration);
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
        return this.Q || j() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i10 == 82 && !j() && !this.N && (kVar = this.y) != null && !kVar.s() && (zVar = kVar.B) != null) {
            int childCount = zVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (w0Var.q()) {
                            w0Var.M(null, null);
                            break;
                        }
                        if (w0Var.P) {
                            zVar.o(((Integer) w0Var.getTag()).intValue());
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10 = getHeight() > getWidth();
        if (this.W0 != z10) {
            this.W0 = z10;
            this.X0 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                n3 n3Var = this.B;
                if (childAt == n3Var) {
                    n3Var.setCurrentAccount(UserConfig.selectedAccount);
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
                        if (childAt != this.B && this.X0 != 0 && (this.U0 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i19 = this.X0;
                        } else if (childAt == this.B) {
                            this.X0 = i19;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != this.B) {
                    }
                    if (childAt == this.B) {
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
                if (childAt != this.B) {
                }
                if (childAt == this.B) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        p2 p2Var = !this.L0.isEmpty() ? (p2) ai.j(1, this.L0) : null;
        if (p2Var != null && !p2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            p2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, TLObject.FLAG_30));
            return;
        }
        b5 b5Var = this.G0;
        if (b5Var != null) {
            int[] iArr = this.V0;
            iArr[0] = i10;
            iArr[1] = i11;
            b5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        this.U0 = C() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z4 = false;
        if (!j() && !this.t0 && !this.Q && !this.a1) {
            if (this.L0.size() > 1 && ((rVar = this.D) == null || rVar.getLastSheet() == null || !this.D.getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.u0) {
                        if (this.R == null) {
                            this.R = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.O));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.P);
                        this.R.addMovement(motionEvent);
                        if (this.T || this.h || !this.M || this.N || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                            if (this.N) {
                                if (!this.S) {
                                    Activity activity = this.H0;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((p2) ai.j(1, this.L0)).onBeginSlide();
                                    this.S = true;
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
                        } else if (((p2) ai.j(1, this.L0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.O = (int) motionEvent.getX();
                            O();
                        } else {
                            this.M = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.u0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.R == null) {
                            this.R = VelocityTracker.obtain();
                        }
                        this.R.addMovement(motionEvent);
                        this.R.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        p2 p2Var = (p2) ai.j(1, this.L0);
                        if (!this.h && !this.U && !this.N && p2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.R.getXVelocity();
                            float yVelocity = this.R.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && p2Var.canBeginSlide()) {
                                this.O = (int) motionEvent.getX();
                                O();
                                if (!this.S) {
                                    if (((Activity) getContext()).getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                    }
                                    this.S = true;
                                }
                            }
                        }
                        if (this.N) {
                            float x10 = this.s.getX();
                            float xVelocity2 = this.R.getXVelocity();
                            float yVelocity2 = this.R.getYVelocity();
                            if (!D() ? x10 < this.s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z4 = true;
                                }
                            }
                            e(z4);
                        } else {
                            this.M = false;
                            this.N = false;
                            w wVar = this.s;
                            if (wVar != null) {
                                wVar.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.R;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.R = null;
                        }
                    } else if (motionEvent == null) {
                        this.M = false;
                        this.N = false;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.R;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.R = null;
                        }
                    }
                } else if (((p2) ai.j(1, this.L0)).isSwipeBackEnabled(motionEvent)) {
                    this.u0 = motionEvent.getPointerId(0);
                    this.M = true;
                    this.O = (int) motionEvent.getX();
                    this.P = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.R;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.M = false;
                    this.N = false;
                    w wVar3 = this.s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.N;
        }
        return false;
    }

    public final void p(Canvas canvas, int i10, int i11) {
        if (m1 == null || !SharedConfig.drawActionBarShadow) {
            return;
        }
        int i12 = i10 / 2;
        if (m1.getAlpha() != i12) {
            m1.setAlpha(i12);
        }
        m1.setBounds(0, i11, getMeasuredWidth(), m1.getIntrinsicHeight() + i11);
        m1.draw(canvas);
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z4 = true;
        this.n = true;
        this.h = false;
        p2 p2Var = (p2) ai.j(2, this.L0);
        p2 p2Var2 = (p2) ai.j(1, this.L0);
        p2Var2.fragmentView.setOutlineProvider(null);
        p2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        p2Var2.fragmentView.setLayoutParams(layoutParams);
        T(p2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(p2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(p2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new mr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new dg.y2(9, this, p2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(p2Var2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(p2Var2.drawEdgeNavigationBar());
        p2Var2.setInPreviewMode(false);
        p2Var2.setInMenuMode(false);
        try {
            Activity activity = this.H0;
            if (j6.w0(null, j6.s8, false) != -1 && (!p2Var2.hasForceLightStatusBar() || j6.A0().q())) {
                z4 = false;
            }
            AndroidUtilities.setLightStatusBar(activity, z4);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public final boolean s(Menu menu) {
        return !this.L0.isEmpty() && ((p2) ai.j(1, this.L0)).extendActionMode(menu);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setBackgroundView(View view) {
        this.y0 = view;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setDelegate(b5 b5Var) {
        this.G0 = b5Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setDrawerLayoutContainer(y3 y3Var) {
        this.x = y3Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setFragmentStack(List<p2> list) {
        this.L0 = list;
        n3 n3Var = this.B;
        if (n3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            n3Var.F.remove(oVar);
            n3Var.G.remove(oVar2);
            AndroidUtilities.removeFromParent(this.B);
            this.B = null;
        }
        boolean z4 = this.I0;
        Activity activity = this.H0;
        if (z4) {
            n3 n3Var2 = new n3(activity, this);
            this.B = n3Var2;
            this.C = new c5.j(n3Var2);
            n3 n3Var3 = this.B;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            n3Var3.F.add(oVar3);
            n3Var3.G.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.B, layoutParams);
            w3 w3Var = LaunchActivity.D1.v0;
            if (w3Var != null) {
                w3Var.setTabsView(this.B);
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
        this.Y0.a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.w.setLayoutParams(layoutParams4);
        r rVar = this.D;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.D;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, k7.b6.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.D.getEdgeToEdgeSupportMode());
            }
            this.D.onResume();
            this.D.onBecomeFullyVisible();
        }
        Iterator it = this.L0.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.P0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setInBubbleMode(boolean z4) {
        this.f = z4;
    }

    public void setInnerTranslationX(float f10) {
        int navigationBarColor;
        int navigationBarColor2;
        this.L = f10;
        invalidate();
        if (this.L0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float clamp01 = D() ? Utilities.clamp01(f10 / (AndroidUtilities.dp(56.0f) * 6)) : f10 / this.s.getMeasuredWidth();
        p2 p2Var = (p2) ai.j(2, this.L0);
        p2Var.onSlideProgress(false, clamp01);
        p2 p2Var2 = (p2) ai.j(1, this.L0);
        float a2 = k7.n.a(clamp01 * 2.0f, 0.0f, 1.0f);
        if (!p2Var2.isBeginToShow() || (navigationBarColor = p2Var2.getNavigationBarColor()) == (navigationBarColor2 = p2Var.getNavigationBarColor())) {
            return;
        }
        p2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setIsSheet(boolean z4) {
        this.b = z4;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setNavigationBarColor(int i10) {
        if (this.i1 != i10) {
            this.i1 = i10;
            invalidate();
        }
        y3 y3Var = this.x;
        if (y3Var != null) {
            y3Var.setInternalNavigationBarColor(i10);
        }
        n3 n3Var = this.B;
        if (n3Var != null) {
            n3Var.i(i10, (this.N || this.Q) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Q0 = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setPulledDialogs(List<g9> list) {
        this.M0 = list;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setRemoveActionBarExtraHeight(boolean z4) {
        this.z0 = z4;
    }

    public void setThemeAnimationValue(float f10) {
        this.j0 = f10;
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.V.get(i10);
            int[] iArr2 = (int[]) this.W.get(i10);
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
                int argb = Color.argb(Math.min(255, (int) (((alpha - r3) * f10) + Color.alpha(iArr[i11]))), Math.min(255, (int) (((red - red2) * f10) + red2)), Math.min(255, (int) (((green - green2) * f10) + green2)), Math.min(255, (int) (((blue - blue2) * f10) + blue2)));
                l6 l6Var = (l6) arrayList2.get(i11);
                int i14 = l6Var.f;
                f6 f6Var = l6Var.o;
                if (f6Var != null) {
                    f6Var.J0(i14, argb);
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
        ArrayList arrayList4 = this.g0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            k6 k6Var = (k6) arrayList4.get(i15);
            if (k6Var != null) {
                k6Var.b();
                k6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                l6 l6Var2 = (l6) this.f0.get(i16);
                l6Var2.d(j6.v0(l6Var2.f, l6Var2.o), false, false);
            }
        }
        un unVar = this.d0;
        if (unVar != null) {
            xn xnVar = unVar.a;
            xnVar.S.u0.invalidate();
            xnVar.F.I = f10;
            xnVar.G.I = f10;
            xnVar.k(f10);
        }
        b5 b5Var = this.G0;
        if (b5Var != null) {
            b5Var.a(f10);
        }
        x(this);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setUseAlphaAnimations(boolean z4) {
        this.x0 = z4;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final p2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            p2 p2Var = (p2) getFragmentStack().get(size);
            if (p2Var != null && !p2Var.isFinishing() && !p2Var.isRemovingFromStack() && pg0.class.isInstance(p2Var)) {
                return p2Var;
            }
        }
        return null;
    }

    public final int v(boolean z4) {
        n3 n3Var;
        if (!this.I0 || (n3Var = this.B) == null) {
            return 0;
        }
        return z4 ? (int) n3Var.D : n3Var.E;
    }

    public final ez w() {
        Activity activity = this.H0;
        if (activity == null) {
            return null;
        }
        if (this.D == null) {
            r rVar = new r(this);
            this.D = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.D;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.w) {
                AndroidUtilities.removeFromParent(view);
                this.w.addView(view, k7.b6.c(-1.0f, -1));
                this.w.setShouldHandleBottomInsets(this.D.getEdgeToEdgeSupportMode());
                this.w.setDrawNavigationBar(this.D.drawEdgeNavigationBar());
            }
            this.D.onResume();
            this.D.onBecomeFullyVisible();
        }
        return this.D;
    }

    public final boolean y() {
        return this.h || this.U;
    }

    public final boolean z() {
        return this.J0;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public ViewGroup getView() {
        return this;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public void setHighlightActionButtons(boolean z4) {
    }
}
