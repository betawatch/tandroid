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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ActionBarLayout extends FrameLayout implements ui5, aj4 {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public a E;
    public int E0;
    public qx0 F;
    public Runnable F0;
    public gl2 G;
    public Runnable G0;
    public k6 H;
    public boolean H0;
    public d I;
    public View I0;
    public d J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public l6 K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public rx5 P0;
    public boolean Q;
    public qi5 Q0;
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
    public final si5 e0;
    public boolean e1;
    public boolean f;
    public m17 f0;
    public final int[] f1;
    public m17 g0;
    public boolean g1;
    public boolean h;
    public hu1 h0;
    public int h1;
    public final ArrayList i0;
    public final lm i1;
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
    public ku1 q0;
    public final i6 q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public b s;
    public final on s0;
    public int s1;
    public float t0;
    public vxc t1;
    public boolean u0;
    public io5 u1;
    public akb v0;
    public io5 v1;
    public b w;
    public boolean w0;
    public b x;
    public boolean x0;
    public mq3 y;
    public int y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        si5 si5Var = new si5();
        si5Var.b = new SparseIntArray();
        si5Var.c = new int[]{bkb.qb, bkb.tb, bkb.ub, bkb.vb, bkb.Qc, bkb.sb};
        this.e0 = si5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new on(null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new lm(280L, this, s33.h);
        this.p1 = new ArrayList();
        this.q1 = new i6(this, (byte) 3);
        io5 io5Var = io5.e;
        this.u1 = io5Var;
        this.v1 = io5Var;
        this.R0 = (Activity) context;
        this.S0 = z;
        if (x1 == null) {
            x1 = getResources().getDrawable(R.drawable.layer_shadow);
            w1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            y1 = new Paint();
        }
        l0 l0Var = new l0(this, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(this, l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void D(ArrayList arrayList, View view) {
        if (view instanceof aj4) {
            arrayList.addAll(((aj4) view).E());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                D(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    public static View s(ViewGroup viewGroup, float f, float f2) {
        View s;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = gl.Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (s = s((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return s;
                    }
                }
            }
        }
        return null;
    }

    public static boolean x(int i, int i2, int i3) {
        if (i != bkb.f5 && i != bkb.Qc && i != bkb.He) {
            if (i != bkb.tb && i != bkb.ub && i != bkb.vb && i != bkb.De && i != bkb.Ee && i != bkb.Fe && i != bkb.Ge) {
                return true;
            }
            if (i2 != 0 && i3 != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A() {
        View rootView = getRootView();
        Rect rect = this.X0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? gl.m : 0)) - gl.o1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean B() {
        return this.k1 && this.l1;
    }

    public final void C() {
        for (int i = 0; i < this.V0.size(); i++) {
            if (((d) this.V0.get(i)).getFragmentView() != null) {
                try {
                    ((d) this.V0.get(i)).onThemeColorsChanged();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // aj4
    public final List E() {
        d lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof aj4) {
            arrayList.addAll(((aj4) lastFragment).E());
        }
        D(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final void F(boolean z) {
        I();
        L();
        Runnable runnable = this.d;
        if (runnable != null) {
            gl.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            if (z) {
                animatorSet.cancel();
            }
            this.L = null;
        }
        l6 l6Var = this.K0;
        if (l6Var != null) {
            gl.r(l6Var);
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

    public final void G() {
        pha phaVar;
        a aVar;
        if (this.b0 || this.R || h() || this.V0.isEmpty()) {
            return;
        }
        o85 o85Var = o85.f0;
        if (o85Var != null && o85Var.y) {
            o85Var.f(false);
            return;
        }
        if (!h0() && (aVar = this.E) != null && !aVar.y()) {
            a aVar2 = this.E;
            if (aVar2.o0) {
                aVar2.n(true);
                return;
            }
        }
        d dVar = (d) oo1.m(1, this.V0);
        if (h0() || (phaVar = dVar.simpleActionBar) == null || !phaVar.B()) {
            k6 k6Var = this.H;
            if ((k6Var == null || k6Var.onBackPressed(true)) && ((d) oo1.m(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
                j(true, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5.U == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(float f, float f2) {
        k6 k6Var;
        pha phaVar;
        if (this.U) {
            AnimatorSet animatorSet = this.o1;
            if (animatorSet != null) {
                animatorSet.end();
                this.o1 = null;
            }
            return false;
        }
        if (!this.k1 && !this.j1 && !this.b0 && !this.R && !h() && this.V0.size() > 1 && !w() && ((k6Var = this.H) == null || !k6Var.hasShownSheet())) {
            d dVar = (d) oo1.m(1, this.V0);
            if (dVar.onBackPressed(false) && (((phaVar = dVar.simpleActionBar) == null || (phaVar.R == null && (phaVar.H || !phaVar.G))) && !dVar.hasShownSheet() && dVar.canBeginSlide())) {
                this.l1 = false;
                this.k1 = true;
                this.j1 = true;
                this.n1 = f < ((float) gl.q.x) / 2.0f;
                this.m1 = f2;
                Q();
                Activity activity = this.R0;
                if (activity != null && activity.getCurrentFocus() != null) {
                    gl.t1(activity.getCurrentFocus());
                }
                dVar.onBeginSlide();
                return true;
            }
        }
        return false;
    }

    public final void I() {
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
        g();
        g();
    }

    public final void J(String str) {
        Runnable runnable = this.Z0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = fl5.z().f;
        for (int i = 0; i < arrayList.size(); i++) {
            ((km) arrayList.get(i)).z0 = 0;
        }
        f(str);
    }

    public final void K() {
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onLowMemory();
        }
    }

    public final void L() {
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
        g();
    }

    public final void M() {
        if (!this.V0.isEmpty()) {
            ((d) oo1.m(1, this.V0)).onPause();
        }
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.onPause();
        }
    }

    public final void N() {
        if (!this.V0.isEmpty()) {
            ((d) oo1.m(1, this.V0)).onResume();
        }
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.onResume();
        }
    }

    public final void O(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        List list = this.V0;
        if (z) {
            if (list.size() >= 2) {
                ((d) oo1.m(1, this.V0)).prepareFragmentToSlide(true, false);
                d dVar = (d) oo1.m(2, this.V0);
                dVar.prepareFragmentToSlide(false, false);
                dVar.onPause();
                View view = dVar.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    dVar.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(dVar.fragmentView);
                }
                a aVar = dVar.actionBar;
                if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(dVar.actionBar);
                }
                dVar.detachSheets();
            }
        } else {
            if (list.size() < 2) {
                f("onSlideAnimationEnd exit");
                return;
            }
            d dVar2 = (d) oo1.m(1, this.V0);
            dVar2.prepareFragmentToSlide(true, false);
            dVar2.onPause();
            dVar2.onFragmentDestroy();
            dVar2.setParentLayout(null);
            List list2 = this.V0;
            list2.remove(list2.size() - 1);
            J("onSlideAnimationEnd");
            b bVar = this.s;
            bVar.setAlpha(1.0f);
            b bVar2 = this.w;
            this.s = bVar2;
            this.w = bVar;
            bringChildToFront(bVar2);
            View view2 = this.x;
            if (view2 != null) {
                bringChildToFront(view2);
            }
            if (this.V0.size() > 0) {
                d dVar3 = (d) oo1.m(1, this.V0);
                this.E = dVar3.actionBar;
                dVar3.onResume();
                dVar3.onBecomeFullyVisible();
                dVar3.prepareFragmentToSlide(false, false);
            }
        }
        this.w.setVisibility(4);
        this.R = false;
        this.U = false;
        this.s.setTranslationX(0.0f);
        this.w.setTranslationX(0.0f);
        this.s.setLayerType(0, null);
        setInnerTranslationX(0.0f);
    }

    public final void P(Canvas canvas, ViewGroup viewGroup) {
        if (this.F == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.F.getX() + getX(), this.F.getY() + getY());
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void Q() {
        byte b = 0;
        this.Q = false;
        this.R = true;
        this.w.setVisibility(0);
        this.W = false;
        d dVar = (d) oo1.m(2, this.V0);
        View view = dVar.fragmentView;
        if (view == null && (view = dVar.performCreateView(this.R0)) != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
            h6 h6Var = new h6(dVar, b);
            WeakHashMap weakHashMap = jdc.a;
            bdc.i(view, h6Var);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            dVar.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        a aVar = dVar.actionBar;
        if (aVar != null && aVar.L) {
            gl.B2(aVar);
            if (this.J0) {
                dVar.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(dVar.actionBar);
        }
        dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        dVar.attachSheets(this.w);
        if (!dVar.hasOwnBackground && view.getBackground() == null) {
            zkb.h(bkb.c6, null, view);
        }
        dVar.onResume();
        if (this.r0 != null) {
            this.j0 = dVar.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((d) oo1.m(1, this.V0)).prepareFragmentToSlide(true, true);
        dVar.prepareFragmentToSlide(false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(ri5 ri5Var) {
        qi5 qi5Var;
        ArrayList arrayList;
        rs3 rs3Var;
        d dVar;
        int i;
        int i2;
        LaunchActivity launchActivity;
        Dialog dialog;
        d dVar2 = ri5Var.a;
        boolean z = ri5Var.b;
        boolean z2 = ri5Var.c;
        boolean z3 = ri5Var.d;
        boolean z4 = ri5Var.e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ri5Var.f;
        byte b = 0;
        if (dVar2 == null || h() || !(((qi5Var = this.Q0) == null || !z3 || qi5Var.l(this, ri5Var)) && dVar2.onFragmentCreate())) {
            return false;
        }
        rs3 edgeToEdgeSupportMode = dVar2.getEdgeToEdgeSupportMode();
        rs3 rs3Var2 = rs3.a;
        byte b2 = 1;
        boolean z5 = edgeToEdgeSupportMode != rs3Var2;
        boolean drawEdgeNavigationBar = dVar2.drawEdgeNavigationBar();
        d lastFragment = getLastFragment();
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
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof x02) || (visibleDialog instanceof ow0))) {
            ag0 ag0Var = new ag0();
            ag0Var.a = true;
            lastFragment.showAsSheet(dVar2, ag0Var);
            return true;
        }
        if (w01.a) {
            fa4.b("present fragment " + dVar2.getClass().getSimpleName() + " args=" + dVar2.getArguments());
        }
        int i3 = 0;
        while (true) {
            arrayList = m8b.y1;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((m8b) arrayList.get(i3)).o(false);
            i3++;
        }
        arrayList.clear();
        qx0 qx0Var = this.F;
        if (qx0Var != null && !qx0Var.c) {
            LaunchActivity.K();
        }
        if (this.h && this.b0) {
            Runnable runnable = this.e;
            if (runnable != null) {
                gl.r(runnable);
                this.e = null;
            }
            j(false, true);
        }
        dVar2.setInPreviewMode(z4);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.K;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.K.getParent()).removeView(this.K);
            }
            this.K = null;
        }
        this.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dVar2.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.R0;
        if (activity.getCurrentFocus() != null && dVar2.hideKeyboardOnShow() && !z4) {
            gl.t1(activity.getCurrentFocus());
        }
        boolean z6 = z4 || (!z2 && na7.c1().getBoolean("view_animations", true));
        if (this.V0.isEmpty()) {
            rs3Var = rs3Var2;
            dVar = null;
        } else {
            rs3Var = rs3Var2;
            dVar = (d) oo1.m(1, this.V0);
        }
        dVar2.setParentLayout(this);
        View view = dVar2.fragmentView;
        if (view == null) {
            view = dVar2.performCreateView(activity);
            if (view != null && dVar2.isSupportEdgeToEdge() && dVar2.drawEdgeNavigationBar()) {
                h6 h6Var = new h6(dVar2, b2);
                WeakHashMap weakHashMap = jdc.a;
                bdc.i(view, h6Var);
                this.w.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                dVar2.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.w.addView(view);
        b bVar = this.w;
        if (z4) {
            edgeToEdgeSupportMode = rs3Var;
        }
        bVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.w.setDrawNavigationBar(!z4 && drawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.w.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            i = gl.L(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - gl.n) - i) - gl.L(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z4) {
            int previewHeight = dVar2.getPreviewHeight();
            int i4 = gl.m;
            if (previewHeight > 0) {
                i2 = 2;
                if (previewHeight < getMeasuredHeight() - i4) {
                    layoutParams2.height = previewHeight;
                    layoutParams2.topMargin = (((getMeasuredHeight() - i4) - previewHeight) / 2) + i4;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        layoutParams2.bottomMargin = de9.w(8.0f, i, layoutParams2.bottomMargin);
                    }
                    int L = gl.L(8.0f);
                    layoutParams2.leftMargin = L;
                    layoutParams2.rightMargin = L;
                }
            } else {
                i2 = 2;
            }
            int L2 = gl.L(actionBarPopupWindow$ActionBarPopupWindowLayout != null ? 0.0f : 24.0f);
            layoutParams2.bottomMargin = L2;
            layoutParams2.topMargin = L2;
            int i5 = gl.m;
            int i6 = L2 + i5;
            layoutParams2.topMargin = i6;
            if (z5) {
                layoutParams2.topMargin = i6 + i5;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            }
            int L3 = gl.L(8.0f);
            layoutParams2.leftMargin = L3;
            layoutParams2.rightMargin = L3;
        } else {
            i2 = 2;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        a aVar = dVar2.actionBar;
        if (aVar != null && aVar.L) {
            if (this.J0) {
                aVar.setOccupyStatusBar(false);
            }
            gl.B2(dVar2.actionBar);
            this.w.addView(dVar2.actionBar);
        }
        dVar2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        dVar2.attachSheets(this.w);
        this.V0.add(dVar2);
        J("presentFragment");
        dVar2.onResume();
        this.E = dVar2.actionBar;
        if (!dVar2.hasOwnBackground && view.getBackground() == null) {
            zkb.h(bkb.c6, null, view);
        }
        b bVar2 = this.s;
        b bVar3 = this.w;
        this.s = bVar3;
        this.w = bVar2;
        bVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.s.setTranslationY(0.0f);
        if (z4) {
            if (!(dVar2 instanceof mu1)) {
                float L4 = gl.L(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                xi xiVar = zdc.a;
                view.setOutlineProvider(new xdc(0, L4));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                view.setOutlineProvider(new m6());
            } else {
                float L5 = gl.L(29.0f);
                xi xiVar2 = zdc.a;
                view.setOutlineProvider(new xdc(0, L5));
            }
            view.setClipToOutline(true);
            view.setElevation(gl.L(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineSpotShadowColor(-1342177280);
                view.setOutlineAmbientShadowColor(-1342177280);
            }
            ColorDrawable colorDrawable = this.r;
            if (colorDrawable == null) {
                colorDrawable = new ColorDrawable(771751936);
                this.r = colorDrawable;
            }
            colorDrawable.setAlpha(0);
            bkb.r0.setAlpha(0);
        }
        bringChildToFront(this.s);
        b bVar4 = this.x;
        if (bVar4 != null) {
            bringChildToFront(bVar4);
        }
        if (!z6) {
            V(dVar, z);
            View view2 = this.I0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.r0 != null) {
            this.j0 = dVar2.getThemeDescriptions();
        }
        if (!z6 && !z4) {
            View view3 = this.I0;
            if (view3 != null) {
                view3.setAlpha(1.0f);
                this.I0.setVisibility(0);
            }
            if (dVar != null) {
                dVar.onTransitionAnimationStart(false, false);
                dVar.onTransitionAnimationEnd(false, false);
            }
            dVar2.onTransitionAnimationStart(true, false);
            dVar2.onTransitionAnimationEnd(true, false);
            dVar2.onBecomeFullyVisible();
            return true;
        }
        if (this.H0 && this.V0.size() == 1) {
            V(dVar, z);
            this.C0 = System.currentTimeMillis();
            this.a0 = true;
            this.G0 = new ee2(dVar, dVar2, (byte) 21);
            ArrayList arrayList4 = new ArrayList();
            int i7 = i2;
            float[] fArr = new float[i7];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, fArr));
            float[] fArr2 = new float[i7];
            // fill-array-data instruction
            fArr2[0] = 0.9f;
            fArr2[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, fArr2));
            float[] fArr3 = new float[i7];
            // fill-array-data instruction
            fArr3[0] = 0.9f;
            fArr3[1] = 1.0f;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, fArr3));
            View view4 = this.I0;
            if (view4 != null) {
                view4.setVisibility(0);
                float[] fArr4 = new float[i7];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                arrayList4.add(ObjectAnimator.ofFloat(this.I0, (Property<View, Float>) property, fArr4));
            }
            if (dVar != null) {
                dVar.onTransitionAnimationStart(false, false);
            }
            dVar2.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.L = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.L.setInterpolator(s33.h);
            this.L.setDuration(200L);
            this.L.addListener(new j6(this, (byte) 1));
            this.L.start();
            return true;
        }
        this.b0 = z4;
        this.C0 = System.currentTimeMillis();
        this.a0 = true;
        d87 d87Var = new d87(this, z4, actionBarPopupWindow$ActionBarPopupWindowLayout, z, dVar, dVar2);
        d dVar3 = dVar;
        this.G0 = d87Var;
        boolean needDelayOpenAnimation = dVar2.needDelayOpenAnimation();
        boolean z7 = !needDelayOpenAnimation;
        if (!needDelayOpenAnimation) {
            if (dVar3 != null) {
                dVar3.onTransitionAnimationStart(false, false);
            }
            dVar2.onTransitionAnimationStart(true, false);
        }
        this.Y0 = false;
        this.J = dVar3;
        this.I = dVar2;
        AnimatorSet onCustomTransitionAnimation = !z4 ? dVar2.onCustomTransitionAnimation(true, new i6(this, (byte) 5)) : null;
        if (onCustomTransitionAnimation != null) {
            if (!z4 && ((this.s.b || this.w.b) && dVar3 != null)) {
                dVar3.saveKeyboardPositionBeforeTransition();
            }
            this.L = onCustomTransitionAnimation;
            return true;
        }
        this.s.setAlpha(0.0f);
        b bVar5 = this.s;
        if (z4) {
            bVar5.setTranslationX(0.0f);
            this.s.setScaleX(0.9f);
            this.s.setScaleY(0.9f);
        } else {
            bVar5.setTranslationX(48.0f);
            this.s.setScaleX(1.0f);
            this.s.setScaleY(1.0f);
        }
        if (!this.s.b && !this.w.b) {
            if (!dVar2.needDelayOpenAnimation()) {
                g0(true, true, z4);
                return true;
            }
            p6 p6Var = new p6(this, dVar2, z4, b);
            this.e = p6Var;
            gl.e3(p6Var, 200L);
            return true;
        }
        if (dVar3 != null && !z4) {
            dVar3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new n6(this, z7, dVar3, dVar2, z4);
        if (dVar2.needDelayOpenAnimation()) {
            this.e = new o6(this, dVar3, dVar2, z4);
        }
        gl.e3(this.d, 250L);
        return true;
    }

    public final boolean S(d dVar) {
        return R(new ri5(dVar));
    }

    public final boolean T(d dVar, boolean z) {
        ri5 ri5Var = new ri5(dVar);
        ri5Var.b = z;
        return R(ri5Var);
    }

    public final boolean U(d dVar, boolean z, boolean z2) {
        ri5 ri5Var = new ri5(dVar);
        ri5Var.b = z;
        ri5Var.c = z2;
        ri5Var.d = true;
        ri5Var.e = false;
        return R(ri5Var);
    }

    public final void V(d dVar, boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (dVar == null) {
            return;
        }
        dVar.onBecomeFullyHidden();
        dVar.onPause();
        if (z) {
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
            this.V0.remove(dVar);
            J("presentFragmentInternalRemoveOld");
        } else {
            View view = dVar.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                dVar.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(dVar.fragmentView);
                } catch (Exception e) {
                    fa4.g(e, true);
                    try {
                        viewGroup2.removeView(dVar.fragmentView);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
            }
            a aVar = dVar.actionBar;
            if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                viewGroup.removeViewInLayout(dVar.actionBar);
            }
            dVar.detachSheets();
        }
        this.w.setVisibility(4);
    }

    public final void W(boolean z, boolean z2) {
        if (this.a0 || this.R) {
            this.z0 = true;
            this.A0 = z;
            this.B0 = z2;
            return;
        }
        int size = this.V0.size();
        if (!z) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i = 0; i < size; i++) {
            ((d) this.V0.get(i)).clearViews();
            ((d) this.V0.get(i)).setParentLayout(this);
        }
        qi5 qi5Var = this.Q0;
        if (qi5Var != null) {
            qi5Var.b(this, z);
        }
        if (z2) {
            e0();
        }
    }

    public final void X() {
        W(true, true);
    }

    public final void Y() {
        this.s.removeAllViews();
        this.w.removeAllViews();
        this.E = null;
        this.I = null;
        this.J = null;
    }

    public final void Z() {
        byte b;
        while (true) {
            b = 0;
            if (this.V0.size() <= 0) {
                break;
            } else {
                d0((d) this.V0.get(0), false);
            }
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new i6(this, b)).start();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.d0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = ((blb) arrayList.get(i)).c();
            }
        }
    }

    public final void a0(int i) {
        if (i < 0 || i >= getFragmentStack().size()) {
            return;
        }
        c0((d) getFragmentStack().get(i), false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        vxc vxcVar = this.t1;
        if (vxcVar != null) {
            m(view, vxcVar);
        }
    }

    public final boolean b(int i, d dVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        qi5 qi5Var = this.Q0;
        if ((qi5Var != null && !qi5Var.h(dVar, this)) || !dVar.onFragmentCreate() || this.V0.contains(dVar)) {
            return false;
        }
        dVar.setParentLayout(this);
        Activity activity = this.R0;
        byte b = 1;
        if (i == -1 || i == -2) {
            if (!this.V0.isEmpty()) {
                d dVar2 = (d) oo1.m(1, this.V0);
                dVar2.onPause();
                a aVar = dVar2.actionBar;
                if (aVar != null && aVar.L && (viewGroup2 = (ViewGroup) aVar.getParent()) != null) {
                    viewGroup2.removeView(dVar2.actionBar);
                }
                View view = dVar2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    dVar2.onRemoveFromParent();
                    viewGroup.removeView(dVar2.fragmentView);
                }
                dVar2.detachSheets();
            }
            this.V0.add(dVar);
            if (i != -2) {
                View view2 = dVar.fragmentView;
                if (view2 == null) {
                    view2 = dVar.performCreateView(activity);
                    if (view2 != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
                        h6 h6Var = new h6(dVar, b);
                        WeakHashMap weakHashMap = jdc.a;
                        bdc.i(view2, h6Var);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                    if (viewGroup3 != null) {
                        dVar.onRemoveFromParent();
                        viewGroup3.removeView(view2);
                    }
                }
                if (!dVar.hasOwnBackground && view2.getBackground() == null) {
                    zkb.h(bkb.c6, null, view2);
                }
                this.s.addView(view2, nme.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
                a aVar2 = dVar.actionBar;
                if (aVar2 != null && aVar2.L) {
                    if (this.J0) {
                        aVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) dVar.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(dVar.actionBar);
                    }
                    this.s.addView(dVar.actionBar);
                }
                dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                dVar.attachSheets(this.s);
                dVar.onResume();
                dVar.onTransitionAnimationEnd(false, true);
                dVar.onTransitionAnimationEnd(true, true);
                dVar.onBecomeFullyVisible();
            }
            J("addFragmentToStack " + i);
        } else {
            if (i == -3) {
                View view3 = dVar.fragmentView;
                if (view3 == null) {
                    view3 = dVar.performCreateView(activity);
                    if (view3 != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
                        h6 h6Var2 = new h6(dVar, b);
                        WeakHashMap weakHashMap2 = jdc.a;
                        bdc.i(view3, h6Var2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        dVar.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!dVar.hasOwnBackground && view3.getBackground() == null) {
                    zkb.h(bkb.c6, null, view3);
                }
                b bVar = this.s;
                bVar.addView(view3, Utilities.j(0, bVar.getChildCount(), 0), nme.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
                a aVar3 = dVar.actionBar;
                if (aVar3 != null && aVar3.L) {
                    if (this.J0) {
                        aVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) dVar.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(dVar.actionBar);
                    }
                    this.s.addView(dVar.actionBar);
                }
                dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                dVar.attachSheets(this.s);
                i = 0;
            }
            this.V0.add(i, dVar);
            J("addFragmentToStack");
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

    public final void b0(d dVar) {
        c0(dVar, false);
    }

    public final void c(ArrayList arrayList) {
        if (arrayList != null) {
            this.i0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.c0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                blb blbVar = (blb) arrayList.get(i);
                iArr[i] = blbVar.c();
                alb albVar = blbVar.g;
                blbVar.g = null;
                if (albVar != null) {
                    ArrayList arrayList2 = this.k0;
                    if (!arrayList2.contains(albVar)) {
                        arrayList2.add(albVar);
                    }
                }
            }
        }
    }

    public final void c0(d dVar, boolean z) {
        if ((this.V0.size() > 0 && oo1.m(1, this.V0) == dVar) || (this.V0.size() > 1 && oo1.m(2, this.V0) == dVar)) {
            L();
            I();
        }
        f("removeFragmentFromStack " + z);
        if (this.H0 && this.V0.size() == 1 && gl.O1()) {
            j(true, false);
            return;
        }
        if (this.Q0 != null && this.V0.size() == 1 && gl.O1()) {
            this.Q0.k(this);
        }
        d0(dVar, dVar.allowFinishFragmentInsteadOfRemoveFromStack() && !z);
    }

    public final void d(boolean z) {
        Animator customSlideTransition;
        d dVar = !this.V0.isEmpty() ? (d) oo1.m(1, this.V0) : null;
        if (dVar == null) {
            return;
        }
        float x = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = dVar.shouldOverrideSlideTransition(false, z);
        b bVar = this.s;
        Property property = View.TRANSLATION_X;
        if (z) {
            int max = Math.max((int) ((320.0f / bVar.getMeasuredWidth()) * x), B() ? kk7.q5 : 120);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, (Property<b, Float>) property, 0.0f);
                long j = max;
                animatorSet.playTogether(ofFloat.setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j));
                if (B()) {
                    animatorSet.setInterpolator(s33.h);
                }
            }
        } else {
            x = Math.abs(bVar.getMeasuredWidth() - x);
            int max2 = Math.max((int) ((200.0f / this.s.getMeasuredWidth()) * x), B() ? 380 : 50);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, (Property<b, Float>) property, r5.getMeasuredWidth() + (this.k1 ? gl.L(56.0f) : 0));
                long j2 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j2));
                if (B()) {
                    animatorSet.setInterpolator(s33.h);
                }
            }
        }
        Animator customSlideTransition2 = dVar.getCustomSlideTransition(false, z, x);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        d dVar2 = (d) oo1.m(2, this.V0);
        if (dVar2 != null && (customSlideTransition = dVar2.getCustomSlideTransition(false, z, x)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new x5(this, z));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void d0(d dVar, boolean z) {
        if (this.V0.contains(dVar)) {
            if (z && oo1.m(1, this.V0) == dVar) {
                dVar.finishFragment();
                return;
            }
            if (oo1.m(1, this.V0) == dVar && this.V0.size() > 1) {
                dVar.finishFragment(false);
                return;
            }
            dVar.onPause();
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
            this.V0.remove(dVar);
            J("removeFragmentFromStackInternal " + z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.F == null || u(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.F.getMeasuredHeight() + this.u1.d), getWidth(), getHeight(), this.F.getBackgroundPaint());
        }
        this.b1 = true;
        if (this.T0) {
            canvas2.save();
            float L = gl.L(24.0f);
            RectF rectF = gl.P;
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
        qi5 qi5Var = this.Q0;
        return (qi5Var != null && qi5Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r3.d() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3.d() != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zf0 zf0Var;
        boolean z = motionEvent.getY() > ((float) ((getHeight() - u(true)) - this.u1.d));
        k6 k6Var = this.H;
        zf0 zf0Var2 = null;
        if (k6Var != null && k6Var.getLastSheet() != null) {
            zf0Var = this.H.getLastSheet();
            if (zf0Var.z()) {
            }
        }
        zf0Var = null;
        if (zf0Var == null && getLastFragment() != null && getLastFragment().getLastSheet() != null) {
            zf0Var = getLastFragment().getLastSheet();
            if (zf0Var.z()) {
            }
            if (zf0Var2 != null) {
                if (motionEvent.getAction() == 0) {
                    this.r1 = z;
                }
                if (!this.r1) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.r1 = false;
                    }
                    return zf0Var2.d().dispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                this.r1 = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        zf0Var2 = zf0Var;
        if (zf0Var2 != null) {
        }
        if (motionEvent.getAction() != 1) {
        }
        this.r1 = false;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0271, code lost:
    
        if (r21.a1 != (-1)) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        Canvas canvas2;
        int i3;
        b bVar;
        View childAt;
        int i4;
        int i5;
        Canvas canvas3;
        WindowInsets rootWindowInsets;
        float f;
        float min;
        gl2 gl2Var;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.P);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.w) {
            paddingLeft2 = gl.L(1.0f) + paddingRight;
        } else if (view == this.s) {
            i = paddingLeft2;
            i2 = paddingRight;
            int save = canvas.save();
            if (view != this.F || (gl2Var = this.G) == null) {
                canvas2 = canvas;
            } else {
                boolean z = this.b1;
                boolean z2 = this.e1;
                int width2 = getWidth();
                getY();
                getHeight();
                canvas2 = canvas;
                gl2Var.m(canvas2, z, z2, width2, 1.0f);
                this.b1 = false;
            }
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31 && !this.b && (paddingRight != 0 || this.a1 != -1)) {
                if (view != this.s) {
                    WindowInsets rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        RectF rectF = gl.P;
                        float f2 = paddingRight;
                        rectF.set(f2, 0.0f, getWidth() + paddingRight, getHeight());
                        if (B()) {
                            if (this.k1) {
                                f = 56.0f;
                                min = gl.R1(1.0f, gl.R1(0.9f, 0.85f, 1.0f - this.s.getAlpha()), Utilities.l(f2 / gl.N(56.0f)));
                            } else {
                                f = 56.0f;
                                min = 1.0f - Math.min(0.25f, (0.05f * f2) / gl.N(56.0f));
                            }
                            float j2 = (paddingRight <= gl.L(f) || this.U || !this.k1) ? Utilities.j(paddingRight, gl.L(f), 0) : f2;
                            if (!this.k1 || this.n1) {
                                canvas2.translate(-j2, 0.0f);
                                i = (int) (i + j2);
                            } else {
                                canvas2.translate(-j2, 0.0f);
                                rectF.set(f2, 0.0f, getWidth() + paddingRight, getHeight());
                                i = (int) (i + j2);
                            }
                            canvas2.scale(min, min, this.n1 ? rectF.right - gl.L(82.0f) : rectF.left + gl.L(82.0f), this.k1 ? this.m1 : rectF.centerY());
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
                            float l = Utilities.l(Math.abs(paddingRight) / gl.N(12.0f));
                            fArr[0] = fArr[0] * l;
                            fArr[1] = fArr[1] * l;
                            fArr[6] = fArr[6] * l;
                            fArr[7] = fArr[7] * l;
                        }
                        Path path = this.c1;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.w && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    i += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (B()) {
                        i = getPaddingLeft() + width;
                    }
                }
            }
            int save2 = canvas2.save();
            if (!z() && !this.h) {
                canvas2.clipRect(i2, 0, i, getHeight());
            }
            if ((!this.h || this.b0) && view == (bVar = this.s) && (childAt = bVar.getChildAt(0)) != null) {
                this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.r.draw(canvas2);
                if (this.K == null) {
                    int L = gl.L(32.0f);
                    int measuredWidth = (getMeasuredWidth() - L) / 2;
                    int translationY = (int) ((bVar.getTranslationY() + childAt.getTop()) - gl.L(12.0f));
                    bkb.r0.setBounds(measuredWidth, translationY, L + measuredWidth, (L / 2) + translationY);
                    bkb.r0.draw(canvas2);
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas2.restoreToCount(save2);
            i4 = paddingRight != 0 ? -1 : -1;
            i5 = this.a1;
            if (i5 == i4) {
                i5 = width - paddingRight;
            }
            if (view != this.s) {
                int b = moe.b((i5 * kk7.d4) / gl.L(20.0f), 0, kk7.d4);
                if (b > 0) {
                    int i6 = u(false) == 0 ? ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin : 0;
                    if (i3 < 31 || this.b) {
                        Drawable drawable = x1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i6);
                        x1.setAlpha(b);
                        x1.draw(canvas2);
                    }
                }
            } else if (view == this.w) {
                y1.setColor(Color.argb((int) (moe.a(i5 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.a1 != -1) {
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, y1);
                } else {
                    canvas3 = canvas;
                    canvas3.drawRect(i2, 0.0f, i, getHeight() * 1.5f, y1);
                }
                canvas3.restoreToCount(save);
                return drawChild;
            }
            canvas3 = canvas2;
            canvas3.restoreToCount(save);
            return drawChild;
        }
        i2 = paddingLeft;
        i = paddingLeft2;
        int save3 = canvas.save();
        if (view != this.F) {
        }
        canvas2 = canvas;
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            if (view != this.s) {
            }
        }
        int save22 = canvas2.save();
        if (!z()) {
            canvas2.clipRect(i2, 0, i, getHeight());
        }
        if (!this.h) {
        }
        this.r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r.draw(canvas2);
        if (this.K == null) {
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save22);
        if (paddingRight != 0) {
        }
        i5 = this.a1;
        if (i5 == i4) {
        }
        if (view != this.s) {
        }
        canvas3 = canvas2;
        canvas3.restoreToCount(save3);
        return drawChild2;
    }

    public final void e(ti5 ti5Var, Runnable runnable) {
        akb akbVar;
        if (this.a0 || this.R) {
            this.u0 = true;
            this.v0 = ti5Var.a;
            this.x0 = ti5Var.c;
            this.y0 = ti5Var.b;
            this.w0 = ti5Var.g;
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
        int size = ti5Var.e ? 1 : this.V0.size();
        tn6 tn6Var = new tn6((Object) this, size, (Object) ti5Var, (Object) runnable, (byte) 2);
        if (size < 1 || !ti5Var.f || !ti5Var.g) {
            tn6Var.run();
            return;
        }
        if (ti5Var.m == null) {
            f0(null);
        }
        int i = ti5Var.b;
        if (i != -1 && (akbVar = ti5Var.a) != null) {
            akbVar.u(i);
            bkb.x1(ti5Var.a, true, false, true, false, false);
        }
        akb akbVar2 = ti5Var.a;
        boolean z = ti5Var.c;
        if (runnable == null) {
            bkb.t(akbVar2, true, z);
            tn6Var.run();
            return;
        }
        b1 b1Var = new b1(tn6Var, (byte) 3);
        int i2 = bkb.a;
        if (akbVar2 == null) {
            b1Var.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
        } catch (Exception e) {
            e = e;
        }
        if (akbVar2.b == null && akbVar2.d == null) {
            if (!z) {
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.remove("theme");
                edit.apply();
            }
            bkb.jm.clear();
            bkb.f0 = 0;
            bkb.g0 = null;
            bkb.d0 = null;
            bkb.e0 = null;
            if (!z && bkb.M == null) {
                bkb.K = akbVar2;
                if (bkb.I == bkb.J) {
                    bkb.T = 2000;
                    bkb.U = SystemClock.elapsedRealtime();
                    gl.e3(new am6((byte) 2), 2100L);
                }
            }
            bkb.I = akbVar2;
            bkb.r1(false, false);
            if (bkb.M == null && !bkb.Q) {
                na7.q1(akbVar2.F).z4(akbVar2, akbVar2.i(false), z, false);
            }
            b1Var.run();
        }
        if (!z) {
            SharedPreferences.Editor edit2 = na7.c1().edit();
            edit2.putString("theme", akbVar2.k());
            edit2.apply();
        }
        String[] strArr = new String[1];
        try {
            d97 d97Var = new d97((Object) strArr, (Object) akbVar2, z, (Object) b1Var, (byte) 17);
            int i3 = bkb.vm + 1;
            bkb.vm = i3;
            a61 a61Var = new a61(i3, b1Var, d97Var);
            String str = akbVar2.d;
            if (str != null) {
                Utilities.i.c(new exa((Object) a61Var, obj, (Object) str, obj, (byte) 11));
            } else {
                Utilities.i.c(new exa((Object) a61Var, (Object) new File(akbVar2.b), obj, (Object) strArr, (byte) 11));
            }
        } catch (Exception e2) {
            e = e2;
            akbVar2 = akbVar2;
            z = z;
            b1Var = b1Var;
            fa4.g(e, true);
            if (bkb.M == null) {
                na7.q1(akbVar2.F).z4(akbVar2, akbVar2.i(false), z, false);
            }
            b1Var.run();
        }
    }

    public final void e0() {
        List list;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.V0.isEmpty()) {
            return;
        }
        int size = this.V0.size() - 1;
        if (this.V0.isEmpty()) {
            return;
        }
        if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((d) this.V0.get(size)).fragmentView == null) {
            byte b = 0;
            int i = 0;
            while (true) {
                list = this.V0;
                if (i >= size) {
                    break;
                }
                d dVar = (d) list.get(i);
                a aVar = dVar.actionBar;
                if (aVar != null && aVar.L && (viewGroup2 = (ViewGroup) aVar.getParent()) != null) {
                    viewGroup2.removeView(dVar.actionBar);
                }
                View view = dVar.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    dVar.onPause();
                    dVar.onRemoveFromParent();
                    viewGroup.removeView(dVar.fragmentView);
                }
                i++;
            }
            d dVar2 = (d) list.get(size);
            dVar2.setParentLayout(this);
            View view2 = dVar2.fragmentView;
            if (view2 == null) {
                view2 = dVar2.performCreateView(this.R0);
                if (view2 != null && dVar2.isSupportEdgeToEdge() && dVar2.drawEdgeNavigationBar()) {
                    h6 h6Var = new h6(dVar2, b);
                    WeakHashMap weakHashMap = jdc.a;
                    bdc.i(view2, h6Var);
                    this.s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    dVar2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.s.addView(view2, nme.c(-1.0f, -1));
            this.s.setShouldHandleBottomInsets(dVar2.getEdgeToEdgeSupportMode());
            this.s.setDrawNavigationBar(dVar2.drawEdgeNavigationBar());
            a aVar2 = dVar2.actionBar;
            if (aVar2 != null && aVar2.L) {
                if (this.J0) {
                    aVar2.setOccupyStatusBar(false);
                }
                gl.B2(dVar2.actionBar);
                this.s.addView(dVar2.actionBar);
            }
            dVar2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
            dVar2.attachSheets(this.s);
            dVar2.onResume();
            dVar2.onBecomeFullyVisible();
            this.E = dVar2.actionBar;
            if (dVar2.hasOwnBackground || view2.getBackground() != null) {
                return;
            }
            zkb.h(bkb.c6, null, view2);
        }
    }

    public final void f(String str) {
        boolean z = w01.a;
        ArrayList arrayList = this.p1;
        StringBuilder k = b00.k(str, " ");
        k.append(this.V0.size());
        arrayList.add(0, k.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 10; i++) {
                arrayList2.add((String) this.p1.get(i));
            }
            this.p1 = arrayList2;
        }
        i6 i6Var = this.q1;
        gl.r(i6Var);
        gl.e3(i6Var, 500L);
    }

    public final void f0(ku1 ku1Var) {
        try {
            int i = bkb.e5;
            this.l0 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.l0[i2] = ku1Var != null ? ku1Var.h(i2) : bkb.w0(null, i2, false);
            }
        } catch (Exception e) {
            fa4.g(e, true);
            this.l0 = null;
        }
    }

    public final void g() {
        if (this.z0) {
            W(this.A0, this.B0);
            this.z0 = false;
        } else if (this.u0) {
            ti5 ti5Var = new ti5(this.v0, this.y0, this.x0, true);
            boolean z = this.w0;
            if (!z) {
                ti5Var.g = z;
                ti5Var.f = z;
            }
            e(ti5Var, null);
            this.v0 = null;
            this.u0 = false;
        }
    }

    public final void g0(boolean z, boolean z2, boolean z3) {
        if (z2) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        l6 l6Var = new l6(this, z2, z3, z);
        this.K0 = l6Var;
        gl.d3(l6Var);
    }

    @Override // ui5
    public d getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (d) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    public fx0 getBottomSheet() {
        return null;
    }

    public qx0 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        d dVar = this.J;
        return ((dVar == null || !dVar.inPreviewMode) ? this.s : this.w).getAlpha();
    }

    public mq3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override // ui5
    public List<d> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override // ui5
    public d getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (d) oo1.m(1, this.V0);
    }

    public d getLastFragmentIncludeMainTabs() {
        d lastFragment = getLastFragment();
        return lastFragment instanceof ah6 ? ((ah6) lastFragment).b0() : lastFragment;
    }

    @Override // ui5
    public m17 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override // ui5
    public m17 getMessageDrawableOutStart() {
        return this.f0;
    }

    @Override // ui5
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        w26.j("NavigationLayout added in non-activity context!");
        return null;
    }

    @Override // ui5
    public List<cd0> getPulledDialogs() {
        return this.W0;
    }

    @Override // ui5
    public d getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            d dVar = (d) getFragmentStack().get(size);
            if (dVar != null && dVar.getContext() != null && !dVar.isFinishing() && !dVar.isRemovingFromStack()) {
                return dVar;
            }
        }
        return null;
    }

    public x14 getSheetFragment() {
        return v();
    }

    @Override // ui5
    public float getThemeAnimationValue() {
        return this.t0;
    }

    @Override // ui5
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

    public final boolean h() {
        if (this.b0) {
            return false;
        }
        if (this.a0 && (this.C0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.a0;
    }

    public final boolean h0() {
        d dVar = !this.V0.isEmpty() ? (d) oo1.m(1, this.V0) : null;
        return (dVar == null || dVar.getLastStoryViewer() == null || !dVar.getLastStoryViewer().z()) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        j(false, false);
    }

    public final void j(boolean z, boolean z2) {
        boolean z3;
        d lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            qi5 qi5Var = this.Q0;
            if ((qi5Var != null && !qi5Var.k(this)) || h() || this.V0.isEmpty()) {
                return;
            }
            Activity activity = this.R0;
            if (activity.getCurrentFocus() != null) {
                gl.t1(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            byte b = 0;
            byte b2 = 1;
            boolean z4 = !z2 && (this.h || this.b0 || (z && na7.c1().getBoolean("view_animations", true)));
            d dVar = (d) oo1.m(1, this.V0);
            AnimatorSet animatorSet = null;
            d dVar2 = this.V0.size() > 1 ? (d) oo1.m(2, this.V0) : null;
            if (dVar2 != null) {
                gl.l3(activity, bkb.w0(null, bkb.r8, false) == -1 || (dVar2.hasForceLightStatusBar() && !bkb.B0().o()));
                b bVar = this.s;
                this.s = this.w;
                this.w = bVar;
                dVar2.setParentLayout(this);
                View view = dVar2.fragmentView;
                if (view == null && (view = dVar2.performCreateView(activity)) != null && dVar2.isSupportEdgeToEdge() && dVar2.drawEdgeNavigationBar()) {
                    h6 h6Var = new h6(dVar2, b);
                    WeakHashMap weakHashMap = jdc.a;
                    bdc.i(view, h6Var);
                    this.s.invalidate();
                }
                if (!this.h) {
                    this.s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        dVar2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    this.s.addView(view);
                    this.s.setShouldHandleBottomInsets(dVar2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(dVar2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
                    a aVar = dVar2.actionBar;
                    if (aVar != null && aVar.L) {
                        if (this.J0) {
                            aVar.setOccupyStatusBar(false);
                        }
                        gl.B2(dVar2.actionBar);
                        this.s.addView(dVar2.actionBar);
                    }
                    dVar2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    dVar2.attachSheets(this.s);
                }
                this.I = dVar2;
                this.J = dVar;
                dVar2.onTransitionAnimationStart(true, true);
                dVar.onTransitionAnimationStart(false, true);
                dVar2.onResume();
                if (this.r0 != null) {
                    this.j0 = dVar2.getThemeDescriptions();
                }
                this.E = dVar2.actionBar;
                if (!dVar2.hasOwnBackground && view.getBackground() == null) {
                    zkb.h(bkb.c6, null, view);
                }
                if (z4) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    dVar.setRemovingFromStack(true);
                    this.F0 = new nn6((Object) this, (Object) dVar, (Object) dVar2, (byte) 7);
                    if (!this.h && !this.b0) {
                        animatorSet = dVar.onCustomTransitionAnimation(false, new i6(this, (byte) 4));
                    }
                    if (animatorSet == null) {
                        if (!this.h) {
                            if (this.s.b || this.w.b) {
                                o1 o1Var = new o1(this, b2);
                                this.d = o1Var;
                                gl.e3(o1Var, 200L);
                            } else if (!this.b0) {
                                z3 = false;
                                g0(false, true, z3);
                            }
                        }
                        z3 = true;
                        g0(false, true, z3);
                    } else {
                        this.L = animatorSet;
                        m21 m21Var = m21.w;
                        if (m21Var != null && m21Var.l) {
                            m21Var.b();
                        }
                    }
                    J("closeLastFragment");
                } else {
                    k(dVar);
                    dVar.onTransitionAnimationEnd(false, true);
                    dVar2.onTransitionAnimationEnd(true, true);
                    dVar2.onBecomeFullyVisible();
                }
            } else if (!this.H0 || z2) {
                d0(dVar, false);
                setVisibility(8);
                View view2 = this.I0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.C0 = System.currentTimeMillis();
                this.a0 = true;
                this.F0 = new ee2(this, dVar, (byte) 20);
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
                this.L.addListener(new j6(this, (byte) 0));
                this.L.start();
            }
            dVar.onFragmentClosed();
        }
    }

    public final void k(d dVar) {
        dVar.finishing = true;
        dVar.onPause();
        dVar.onFragmentDestroy();
        dVar.setParentLayout(null);
        this.V0.remove(dVar);
        this.w.setVisibility(4);
        this.w.setTranslationY(0.0f);
        bringChildToFront(this.s);
        b bVar = this.x;
        if (bVar != null) {
            bringChildToFront(bVar);
        }
        J("closeLastFragmentInternalRemoveOld");
    }

    public final void l() {
        List fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((d) oo1.m(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void m(View view, vxc vxcVar) {
        boolean z = this.T0;
        if (z) {
            if (!(view instanceof b) || !((b) view).y) {
                jdc.b(view, vxc.b);
                return;
            }
            int i = vxcVar.a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int max = Math.max(0, i - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            vxc vxcVar2 = vxc.b;
            int i2 = Build.VERSION.SDK_INT;
            lxc kxcVar = i2 >= 34 ? new kxc(vxcVar2) : i2 >= 30 ? new jxc(vxcVar2) : i2 >= 29 ? new ixc(vxcVar2) : new hxc(vxcVar2);
            kxcVar.c(8, io5.b(0, 0, 0, max));
            jdc.b(view, kxcVar.b());
            return;
        }
        boolean z2 = this.U0;
        boolean z3 = (z || z2 || !(getParent() instanceof RelativeLayout)) ? false : true;
        io5 io5Var = this.u1;
        io5 io5Var2 = this.v1;
        if (view instanceof qx0) {
            gl.w3(view, z2 ? 0 : io5Var.a, 0, z3 ? 0 : io5Var.c, io5Var.d);
            return;
        }
        if (view instanceof b) {
            b bVar = (b) view;
            int u = u(false);
            int i3 = u > 0 ? io5Var.d + u : 0;
            rs3 rs3Var = bVar.x;
            boolean z4 = rs3Var == rs3.c;
            int i4 = (z4 || z2) ? 0 : io5Var2.a;
            int i5 = (z4 || z3) ? 0 : io5Var2.c;
            int i6 = (!z4 || z2) ? io5Var2.a : 0;
            int i7 = (!z4 || z3) ? io5Var2.c : 0;
            if (rs3Var == rs3.a) {
                i3 = Math.max(i3, io5Var2.d);
                jdc.b(view, vxc.b);
            } else {
                jdc.b(view, vxcVar.a.m(i6, 0, i7, i3));
            }
            view.setPadding(i4, 0, i5, i3);
        }
    }

    public final void n(Canvas canvas, int i, int i2) {
        if (w1 == null || !gba.A1) {
            return;
        }
        int i3 = i / 2;
        if (w1.getAlpha() != i3) {
            w1.setAlpha(i3);
        }
        w1.setBounds(0, i2, getMeasuredWidth(), w1.getIntrinsicHeight() + i2);
        w1.draw(canvas);
    }

    public final void o(Canvas canvas, int i) {
        n(canvas, kk7.d4, i);
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
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.V0.get(i);
            dVar.onConfigurationChanged(configuration);
            Dialog dialog = dVar.visibleDialog;
            if (dialog instanceof fx0) {
                ((fx0) dialog).Z(configuration);
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
        return this.U || h() || onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        a aVar;
        r6 r6Var;
        if (i == 82 && !h() && !this.R && (aVar = this.E) != null && !aVar.y() && (r6Var = aVar.F) != null) {
            int childCount = r6Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = r6Var.getChildAt(i2);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.getVisibility() != 0) {
                        continue;
                    } else {
                        if (r7Var.t()) {
                            r7Var.U(null, null);
                            break;
                        }
                        if (r7Var.T) {
                            r6Var.o(((Integer) r7Var.getTag()).intValue());
                            break;
                        }
                    }
                }
                i2++;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2 = getHeight() > getWidth();
        if (this.g1 != z2) {
            this.g1 = z2;
            this.h1 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                qx0 qx0Var = this.F;
                if (childAt == qx0Var) {
                    qx0Var.setCurrentAccount(y6c.t0);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
                int i14 = i13 & kk7.w1;
                int i15 = absoluteGravity & 7;
                if (i15 == 1) {
                    i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin + paddingLeft;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i11 = layoutParams.topMargin;
                        } else if (i14 != 80) {
                            i11 = layoutParams.topMargin;
                        } else {
                            i8 = paddingBottom - measuredHeight;
                            i9 = layoutParams.bottomMargin;
                        }
                        i10 = i11 + paddingTop;
                        if (childAt != this.F && this.h1 != 0 && (this.e1 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i10 = this.h1;
                        } else if (childAt == this.F) {
                            this.h1 = i10;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                    } else {
                        i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt != this.F) {
                    }
                    if (childAt == this.F) {
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i14 == 16) {
                }
                i10 = i8 - i9;
                if (childAt != this.F) {
                }
                if (childAt == this.F) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        d dVar = !this.V0.isEmpty() ? (d) oo1.m(1, this.V0) : null;
        if (dVar != null && !dVar.isSupportEdgeToEdge() && h0()) {
            int A = A();
            dVar.setKeyboardHeightFromParent(A);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + A, TLObject.FLAG_30));
            return;
        }
        qi5 qi5Var = this.Q0;
        if (qi5Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i;
            iArr[1] = i2;
            qi5Var.e(iArr);
            i = iArr[0];
            i2 = iArr[1];
        }
        this.e1 = A() > gl.L(20.0f);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k6 k6Var;
        boolean z = false;
        if (!h() && !this.D0 && !this.U && !this.k1) {
            if (this.V0.size() > 1 && ((k6Var = this.H) == null || k6Var.getLastSheet() == null || !this.H.getLastSheet().t())) {
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        if (((d) oo1.m(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
                            this.E0 = motionEvent.getPointerId(0);
                            this.Q = true;
                            this.S = (int) motionEvent.getX();
                            this.T = (int) motionEvent.getY();
                            VelocityTracker velocityTracker = this.V;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        } else {
                            this.Q = false;
                            this.R = false;
                            b bVar = this.s;
                            if (bVar != null) {
                                bVar.setLayerType(0, null);
                                return false;
                            }
                        }
                    } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.E0) {
                        if (this.V == null) {
                            this.V = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.S));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.T);
                        this.V.addMovement(motionEvent);
                        if (this.a0 || this.h || !this.Q || this.R || max < gl.Z0(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                            if (this.R) {
                                if (!this.W) {
                                    Activity activity = this.R0;
                                    if (activity.getCurrentFocus() != null) {
                                        gl.t1(activity.getCurrentFocus());
                                    }
                                    ((d) oo1.m(1, this.V0)).onBeginSlide();
                                    this.W = true;
                                }
                                boolean B = B();
                                b bVar2 = this.s;
                                if (B) {
                                    float f = max;
                                    bVar2.setTranslationX((f / getWidth()) * gl.L(56.0f) * 5);
                                    setInnerTranslationX((f / getWidth()) * gl.L(56.0f) * 5);
                                } else {
                                    float f2 = max;
                                    bVar2.setTranslationX(f2);
                                    setInnerTranslationX(f2);
                                }
                            }
                        } else if (((d) oo1.m(1, this.V0)).canBeginSlide() && s(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.S = (int) motionEvent.getX();
                            Q();
                        } else {
                            this.Q = false;
                        }
                    }
                }
                if (motionEvent != null && motionEvent.getPointerId(0) == this.E0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    VelocityTracker velocityTracker2 = this.V;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.V = velocityTracker2;
                    }
                    velocityTracker2.addMovement(motionEvent);
                    this.V.computeCurrentVelocity(1000);
                    d dVar = (d) oo1.m(1, this.V0);
                    if (!this.h && !this.b0 && !this.R && dVar.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.V.getXVelocity();
                        float yVelocity = this.V.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && dVar.canBeginSlide()) {
                            this.S = (int) motionEvent.getX();
                            Q();
                            if (!this.W) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    gl.t1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.W = true;
                            }
                        }
                    }
                    if (this.R) {
                        float x = this.s.getX();
                        float xVelocity2 = this.V.getXVelocity();
                        float yVelocity2 = this.V.getYVelocity();
                        if (!B() ? x < this.s.getMeasuredWidth() / 3.0f : !(x >= gl.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z = true;
                            }
                        }
                        d(z);
                    } else {
                        this.Q = false;
                        this.R = false;
                        b bVar3 = this.s;
                        if (bVar3 != null) {
                            bVar3.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker3 = this.V;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.V = null;
                    }
                } else if (motionEvent == null) {
                    this.Q = false;
                    this.R = false;
                    b bVar4 = this.s;
                    if (bVar4 != null) {
                        bVar4.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker4 = this.V;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.V = null;
                    }
                }
            }
            return this.R;
        }
        return false;
    }

    public final void p() {
        boolean z = true;
        this.n = true;
        this.h = false;
        d dVar = (d) oo1.m(2, this.V0);
        d dVar2 = (d) oo1.m(1, this.V0);
        dVar2.fragmentView.setOutlineProvider(null);
        dVar2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        dVar2.fragmentView.setLayoutParams(layoutParams);
        V(dVar, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(dVar2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(dVar2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new s33(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new u5(this, dVar2, (byte) 2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(dVar2.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(dVar2.drawEdgeNavigationBar());
        dVar2.setInPreviewMode(false);
        dVar2.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (bkb.w0(null, bkb.r8, false) != -1 && (!dVar2.hasForceLightStatusBar() || bkb.B0().o())) {
                z = false;
            }
            gl.l3(activity, z);
        } catch (Exception unused2) {
        }
    }

    public final boolean q(Menu menu) {
        return !this.V0.isEmpty() && ((d) oo1.m(1, this.V0)).extendActionMode(menu);
    }

    public final d r() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            d dVar = (d) getFragmentStack().get(size);
            if (dVar != null && !dVar.isFinishing() && !dVar.isRemovingFromStack() && mf6.class.isInstance(dVar)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // ui5
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override // ui5
    public void setDelegate(qi5 qi5Var) {
        this.Q0 = qi5Var;
    }

    @Override // ui5
    public void setDrawerLayoutContainer(mq3 mq3Var) {
        this.y = mq3Var;
    }

    @Override // ui5
    public void setFragmentPanTranslationOffset(int i) {
        b bVar = this.s;
        if (bVar != null) {
            bVar.setFragmentPanTranslationOffset(i);
        }
    }

    @Override // ui5
    public void setFragmentStack(List<d> list) {
        this.V0 = list;
        qx0 qx0Var = this.F;
        byte b = 2;
        byte b2 = 1;
        if (qx0Var != null) {
            i6 i6Var = new i6(this, b2);
            i6 i6Var2 = new i6(this, b);
            qx0Var.J.remove(i6Var);
            qx0Var.K.remove(i6Var2);
            gl.B2(this.F);
            this.F = null;
        }
        boolean z = this.S0;
        Activity activity = this.R0;
        if (z) {
            qx0 qx0Var2 = new qx0(activity, this);
            this.F = qx0Var2;
            this.G = new gl2(qx0Var2);
            qx0 qx0Var3 = this.F;
            i6 i6Var3 = new i6(this, b2);
            i6 i6Var4 = new i6(this, b);
            qx0Var3.J.add(i6Var3);
            qx0Var3.K.add(i6Var4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            yx0 yx0Var = LaunchActivity.H1.x0;
            if (yx0Var != null) {
                yx0Var.setTabsView(this.F);
            }
        }
        b bVar = this.w;
        if (bVar != null) {
            gl.B2(bVar);
        }
        b bVar2 = new b(activity, this);
        this.w = bVar2;
        addView(bVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.w.setLayoutParams(layoutParams2);
        b bVar3 = this.s;
        if (bVar3 != null) {
            gl.B2(bVar3);
        }
        b bVar4 = new b(activity, this);
        this.s = bVar4;
        addView(bVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        b bVar5 = this.x;
        if (bVar5 != null) {
            gl.B2(bVar5);
        }
        b bVar6 = new b(activity, this);
        this.x = bVar6;
        this.i1.a = bVar6;
        addView(bVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.x.setLayoutParams(layoutParams4);
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.setParentLayout(this);
            k6 k6Var2 = this.H;
            View view = k6Var2.fragmentView;
            if (view == null) {
                view = k6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                gl.B2(view);
                this.x.addView(view, nme.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override // ui5
    public void setInBubbleMode(boolean z) {
        this.f = z;
    }

    public void setInnerTranslationX(float f) {
        int navigationBarColor;
        int navigationBarColor2;
        this.P = f;
        invalidate();
        if (this.V0.size() < 2 || this.s.getMeasuredWidth() <= 0) {
            return;
        }
        float l = B() ? Utilities.l(f / (gl.L(56.0f) * 6)) : f / this.s.getMeasuredWidth();
        d dVar = (d) oo1.m(2, this.V0);
        dVar.onSlideProgress(false, l);
        d dVar2 = (d) oo1.m(1, this.V0);
        float a = moe.a(l * 2.0f, 0.0f, 1.0f);
        if (!dVar2.isBeginToShow() || (navigationBarColor = dVar2.getNavigationBarColor()) == (navigationBarColor2 = dVar.getNavigationBarColor())) {
            return;
        }
        dVar2.setNavigationBarColor(bm2.f(a, navigationBarColor, navigationBarColor2));
    }

    @Override // ui5
    public void setIsSheet(boolean z) {
        this.b = z;
    }

    @Override // ui5
    public void setNavigationBarColor(int i) {
        if (this.s1 != i) {
            this.s1 = i;
            invalidate();
        }
        mq3 mq3Var = this.y;
        if (mq3Var != null) {
            mq3Var.setInternalNavigationBarColor(i);
        }
        qx0 qx0Var = this.F;
        if (qx0Var != null) {
            qx0Var.i(i, (this.R || this.U) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i) {
        this.a1 = i;
        invalidate();
    }

    @Override // ui5
    public void setPulledDialogs(List<cd0> list) {
        this.W0 = list;
    }

    @Override // ui5
    public void setRemoveActionBarExtraHeight(boolean z) {
        this.J0 = z;
    }

    public void setThemeAnimationValue(float f) {
        this.t0 = f;
        for (int i = 0; i < this.p0; i++) {
            int f2 = bm2.f(f, this.n0[i], this.o0[i]);
            ku1 ku1Var = this.q0;
            int[] iArr = this.m0;
            if (ku1Var != null) {
                ku1Var.i(iArr[i], f2);
            } else {
                int i2 = iArr[i];
                SparseIntArray sparseIntArray = bkb.lm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i2, f2);
                }
            }
        }
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i3);
            int[] iArr2 = (int[]) this.c0.get(i3);
            int[] iArr3 = (int[]) this.d0.get(i3);
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                int red = Color.red(iArr3[i4]);
                int green = Color.green(iArr3[i4]);
                int blue = Color.blue(iArr3[i4]);
                int alpha = Color.alpha(iArr3[i4]);
                int red2 = Color.red(iArr2[i4]);
                int green2 = Color.green(iArr2[i4]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr2[i4]);
                int i5 = size;
                int i6 = i3;
                int argb = Color.argb(Math.min(kk7.d4, (int) (((alpha - r4) * f) + Color.alpha(iArr2[i4]))), Math.min(kk7.d4, (int) (((red - red2) * f) + red2)), Math.min(kk7.d4, (int) (((green - green2) * f) + green2)), Math.min(kk7.d4, (int) (((blue - blue2) * f) + blue2)));
                blb blbVar = (blb) arrayList2.get(i4);
                wjb wjbVar = blbVar.n;
                int i7 = blbVar.e;
                if (wjbVar != null) {
                    wjbVar.i(i7, argb);
                } else {
                    SparseIntArray sparseIntArray2 = bkb.lm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i7, argb);
                    }
                }
                blbVar.e(argb, false, false);
                i4++;
                i3 = i6;
                arrayList = arrayList3;
                size = i5;
            }
            i3++;
        }
        ArrayList arrayList4 = this.k0;
        int size3 = arrayList4.size();
        for (int i8 = 0; i8 < size3; i8++) {
            alb albVar = (alb) arrayList4.get(i8);
            if (albVar != null) {
                albVar.b();
                albVar.a(f);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i9 = 0; i9 < size4; i9++) {
                blb blbVar2 = (blb) this.j0.get(i9);
                blbVar2.e(bkb.v0(blbVar2.e, blbVar2.n), false, false);
            }
        }
        hu1 hu1Var = this.h0;
        if (hu1Var != null) {
            ku1 ku1Var2 = hu1Var.a;
            ku1Var2.G.A0.invalidate();
            ku1Var2.t.K = f;
            ku1Var2.u.K = f;
            ku1Var2.t(f);
        }
        qi5 qi5Var = this.Q0;
        if (qi5Var != null) {
            qi5Var.a(f);
        }
        ykb ykbVar = zkb.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f >= 1.0f || currentAnimationTimeMillis != zkb.c || f != zkb.d) {
            zkb.c = currentAnimationTimeMillis;
            zkb.d = f;
            zkb.b0(this, f >= 1.0f);
        } else if (getWindowToken() == null) {
            zkb.c0(this, false);
        }
        C();
    }

    @Override // ui5
    public void setUseAlphaAnimations(boolean z) {
        this.H0 = z;
    }

    @Override // ui5
    public void setWindow(Window window) {
        this.c = window;
    }

    public final void t() {
        if (this.h || this.b0) {
            if (!this.a0 || this.F0 == null) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    gl.r(runnable);
                    this.e = null;
                }
                j(true, false);
            }
        }
    }

    public final int u(boolean z) {
        qx0 qx0Var;
        if (!this.S0 || (qx0Var = this.F) == null) {
            return 0;
        }
        return z ? (int) qx0Var.H : qx0Var.I;
    }

    public final x14 v() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            k6 k6Var = new k6(this);
            this.H = k6Var;
            k6Var.setParentLayout(this);
            k6 k6Var2 = this.H;
            View view = k6Var2.fragmentView;
            if (view == null) {
                view = k6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                gl.B2(view);
                this.x.addView(view, nme.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
                this.x.setDrawNavigationBar(this.H.drawEdgeNavigationBar());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        return this.H;
    }

    public final boolean w() {
        return this.h || this.b0;
    }

    public final boolean y() {
        return this.T0;
    }

    public final boolean z() {
        return this.a0 || this.U;
    }

    @Override // ui5
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override // ui5
    public ViewGroup getView() {
        return this;
    }

    @Override // ui5
    public void setHighlightActionButtons(boolean z) {
    }
}
