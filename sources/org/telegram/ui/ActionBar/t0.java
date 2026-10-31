package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i20;
import org.telegram.messenger.q20;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.sh;
import org.telegram.ui.u71;
import org.telegram.ui.uh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class t0 extends FrameLayout {
    public int D;
    public final TextView E;
    public m0 F;
    public boolean G;
    public p0 H;
    public Rect I;
    public int[] J;
    public View K;
    public k2.v L;
    public int M;
    public int N;
    public int O;
    public o0 P;
    public q0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public h0 W;
    public FrameLayout a;
    public int a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final y c;
    public boolean c0;
    public k1 d;
    public boolean d0;
    public n0 e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public TextView h;
    public int h0;
    public final e2.f i0;
    public float j0;
    public float k0;
    public View l0;
    public final p6 m0;
    public CharSequence n;
    public int n0;
    public View.OnClickListener o0;
    public boolean p0;
    public boolean q0;
    public CharSequence r;
    public PorterDuffColorFilter r0;
    public g0 s;
    public int s0;
    public tg.b t0;
    public wg.d u0;
    public i20 v0;
    public AnimatorSet w;
    public AnimatorSet w0;
    public View x;
    public ArrayList x0;
    public final ei0 y;
    public HashMap y0;

    public t0(Context context, int i10, int i11) {
        this(context, null, i10, i11, true, null);
    }

    public static b1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, p6 p6Var) {
        b1 b1Var = new b1(z12 ? 1 : 0, viewGroup.getContext(), p6Var, z10, z11);
        b1Var.j(charSequence, i10, null);
        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        viewGroup.addView(b1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b1Var.getLayoutParams();
        if (cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        b1Var.setLayoutParams(layoutParams);
        return b1Var;
    }

    private s5 getShownSubMenuOverlay() {
        b5 subMenuOverlayHost = getSubMenuOverlayHost();
        s5 openMenuOverlay = subMenuOverlayHost != null ? subMenuOverlayHost.getOpenMenuOverlay() : null;
        if (openMenuOverlay != null && openMenuOverlay.e == this && (openMenuOverlay.y || openMenuOverlay.M)) {
            return openMenuOverlay;
        }
        return null;
    }

    public final void A(bi0 bi0Var, String str) {
        r0 r0Var = new r0(0);
        r0Var.b = 29;
        r0Var.c = 0;
        r0Var.d = bi0Var;
        r0Var.e = str;
        r0Var.f = true;
        G(r0Var);
    }

    public final r0 B(uh uhVar) {
        r0 r0Var = new r0(2);
        r0Var.c = R.drawable.msg_mute;
        r0Var.d = null;
        r0Var.e = null;
        r0Var.g = null;
        r0Var.h = uhVar;
        G(r0Var);
        return r0Var;
    }

    public final r0 C() {
        r0 r0Var = new r0(3);
        r0Var.e = "";
        r0Var.i = 13;
        G(r0Var);
        return r0Var;
    }

    public final void D() {
        ArrayList arrayList = this.g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        m0 m0Var = this.F;
        if (m0Var != null && m0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new kg.g0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.g);
            transitionSet.addListener((Transition.TransitionListener) new k0(0, this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i10 = 0;
            while (i10 < this.f.getChildCount()) {
                if (!arrayList2.remove(((s0) this.f.getChildAt(i10)).getFilter())) {
                    this.f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zf.e0 e0Var = (zf.e0) arrayList2.get(i11);
            e0Var.getClass();
            s0 s0Var = new s0(getContext(), this.m0);
            s0Var.setData(e0Var);
            s0Var.setOnClickListener(new ag.t0(17, this, s0Var));
            this.f.addView(s0Var, w7.b6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i12 = 0;
            while (i12 < this.f.getChildCount()) {
                ((s0) this.f.getChildAt(i12)).setExpanded(i12 == this.h0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new l0(this, x10));
        }
        j();
    }

    public void E() {
        p0 p0Var = this.H;
        if (p0Var != null) {
            p0Var.k(this.e);
        }
    }

    public void F(boolean z10) {
        y yVar;
        k();
        m0 m0Var = this.F;
        if (m0Var == null || m0Var.getVisibility() == 0 || (yVar = this.c) == null) {
            return;
        }
        yVar.b.y(T(z10));
    }

    public final r0 G(r0 r0Var) {
        if (this.x0 == null) {
            this.x0 = new ArrayList();
        }
        this.x0.add(r0Var);
        if (this.y0 == null) {
            this.y0 = new HashMap();
        }
        this.y0.put(Integer.valueOf(r0Var.b), r0Var);
        return r0Var;
    }

    public final void H(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i10) {
            return;
        }
        this.b.setBackgroundColor(i10);
        k1 k1Var = this.d;
        if (k1Var == null || !k1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void I(zf.e0 e0Var) {
        if (e0Var.h) {
            this.g0.remove(e0Var);
            int i10 = this.h0;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.h0 = r0.size() - 1;
            }
            D();
            this.e.m();
        }
    }

    public t0 J(p0 p0Var) {
        this.H = p0Var;
        return this;
    }

    public final void K() {
        this.R = false;
    }

    public final void L(tg.b bVar, wg.d dVar) {
        this.t0 = bVar;
        this.u0 = dVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || bVar == null) {
            return;
        }
        vg.f c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c10.o(dVar);
        c10.q(org.telegram.messenger.i0.L(12.0f));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
    }

    public t0 M() {
        return N();
    }

    public t0 N() {
        if (this.c == null) {
            return this;
        }
        this.G = true;
        return this;
    }

    public final void O(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        u71 u71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = u71Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = u71Var.getChildAt(i11);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i10);
            } else if (childAt instanceof b1) {
                if (z10) {
                    ((b1) childAt).setIconColor(i10);
                } else {
                    ((b1) childAt).setTextColor(i10);
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.r = charSequence;
        if (this.h == null) {
            return;
        }
        this.d0 = z10;
        this.e.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.e.setSelection(charSequence.length());
    }

    public final void Q(int i10, boolean z10) {
        if (z10) {
            S(i10);
        } else {
            t(i10);
        }
    }

    public final void R(int i10) {
        S(i10);
    }

    public final void S(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.y0;
        r0 r0Var = hashMap == null ? null : (r0) hashMap.get(Integer.valueOf(i10));
        if (r0Var != null) {
            r0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        z20.m(findViewWithTag.animate().alpha(1.0f), gr.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public boolean T(boolean z10) {
        y yVar;
        ei0 iconView;
        Animator e;
        k();
        p0 p0Var = this.H;
        if (this.F == null || !(p0Var == null || p0Var.c())) {
            return false;
        }
        p0 p0Var2 = this.H;
        if (p0Var2 != null && (e = p0Var2.e()) != null) {
            e.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            yVar = this.c;
            if (i10 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i10);
            if ((childAt instanceof t0) && (iconView = ((t0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i10++;
        }
        Object tag = this.F.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.F.setVisibility(0);
            this.F.setAlpha(0.0f);
            AnimatorSet animatorSet = this.w0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.w0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.w0 = animatorSet2;
            m0 m0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(m0Var, (Property<m0, Float>) property, m0Var.getAlpha(), 1.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), (Property<View, Float>) property, ((View) arrayList.get(i11)).getAlpha(), 0.0f));
            }
            this.w0.setDuration(150L);
            this.w0.addListener(new j0(this, arrayList, 1));
            this.w0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                org.telegram.messenger.i0.J3(this.e);
            }
            this.F.setTag(1);
            p0 p0Var3 = this.H;
            if (p0Var3 != null) {
                p0Var3.i();
            }
            return true;
        }
        this.F.setTag(null);
        AnimatorSet animatorSet3 = this.w0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.w0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.w0 = animatorSet4;
        m0 m0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(m0Var2, (Property<m0, Float>) property, m0Var2.getAlpha(), 0.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((View) arrayList.get(i12)).setAlpha(0.0f);
            this.w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), (Property<View, Float>) property, ((View) arrayList.get(i12)).getAlpha(), 1.0f));
        }
        this.w0.setDuration(150L);
        this.w0.addListener(new j0(this, arrayList, 0));
        this.w0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty() && this.H != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((zf.e0) arrayList2.get(i13)).h) {
                    this.H.j((zf.e0) arrayList2.get(i13));
                }
            }
        }
        p0 p0Var4 = this.H;
        if (p0Var4 != null) {
            p0Var4.h();
        }
        if (z10) {
            org.telegram.messenger.i0.v1(this.e);
        }
        yVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.view.ViewGroup, android.widget.LinearLayout, jg.d0] */
    public final void U(View view, t0 t0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        l lVar;
        k1 k1Var;
        boolean z10;
        int i10 = 1;
        if (view == null) {
            b5 subMenuOverlayHost = getSubMenuOverlayHost();
            final s5 subMenuOverlay = subMenuOverlayHost != null ? getSubMenuOverlay() : null;
            if (subMenuOverlay != null && ((k1Var = this.d) == null || !k1Var.isShowing())) {
                y();
                if (s() && i()) {
                    if (subMenuOverlay.e == this && (((z10 = subMenuOverlay.y) || subMenuOverlay.M) && z10)) {
                        subMenuOverlay.a(true);
                        return;
                    }
                    this.T = false;
                    q0 q0Var = this.Q;
                    if (q0Var != null) {
                        q0Var.e();
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                    WeakHashMap weakHashMap = subMenuOverlay.r;
                    if (subMenuOverlay.y && subMenuOverlay.d == subMenuOverlayHost && subMenuOverlay.e == this) {
                        return;
                    }
                    b5 b5Var = subMenuOverlay.d;
                    if (b5Var != null && (b5Var != subMenuOverlayHost || subMenuOverlay.e != this)) {
                        subMenuOverlay.c();
                    }
                    subMenuOverlay.d = subMenuOverlayHost;
                    subMenuOverlay.e = this;
                    subMenuOverlayHost.getClass();
                    subMenuOverlay.s = false;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = subMenuOverlay.f;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != popupLayout) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                            org.telegram.messenger.i0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        }
                        subMenuOverlay.f = popupLayout;
                    }
                    subMenuOverlay.h(popupLayout, org.telegram.messenger.i0.L(5.0f));
                    popupLayout.setTranslationX(0.0f);
                    popupLayout.setTranslationY(0.0f);
                    popupLayout.setAlpha(1.0f);
                    a7.d0(popupLayout, false);
                    z60.U(popupLayout, t6.r1(0.06f, t6.w0(t6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                    popupLayout.f();
                    yf0 swipeBack = popupLayout.getSwipeBack();
                    if (swipeBack != null) {
                        swipeBack.b(false);
                        swipeBack.setForegroundOnGlass(true);
                        if (subMenuOverlay.b != swipeBack) {
                            subMenuOverlay.b = swipeBack;
                            swipeBack.y.add(new xf0() { // from class: org.telegram.ui.ActionBar.q5
                                @Override // org.telegram.ui.Components.xf0
                                public final void a(float f7, float f10) {
                                    s5.this.invalidate();
                                }
                            });
                        }
                        for (int i11 = 1; i11 < swipeBack.getChildCount(); i11++) {
                            if (swipeBack.getChildAt(i11) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i11);
                                subMenuOverlay.h(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                                a7.d0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                                z60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, t6.r1(0.06f, t6.w0(t6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                            }
                        }
                    }
                    ScrollView scrollView = popupLayout.K;
                    if (scrollView != null) {
                        scrollView.scrollTo(0, 0);
                    }
                    if (popupLayout.getParent() != subMenuOverlay) {
                        org.telegram.messenger.i0.E2(popupLayout);
                        subMenuOverlay.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                    }
                    vg.f fVar = subMenuOverlay.h;
                    if (fVar == null || subMenuOverlay.n != subMenuOverlayHost) {
                        if (fVar != null) {
                            fVar.a.setEmpty();
                            subMenuOverlay.h.setBounds(0, 0, 0, 0);
                        }
                        vg.f fVar2 = (vg.f) weakHashMap.get(subMenuOverlayHost);
                        subMenuOverlay.h = fVar2;
                        if (fVar2 == null) {
                            vg.f c10 = subMenuOverlayHost.c(subMenuOverlay);
                            subMenuOverlay.h = c10;
                            if (c10 != null) {
                                c10.o(subMenuOverlay.c);
                                weakHashMap.put(subMenuOverlayHost, subMenuOverlay.h);
                            }
                        }
                        subMenuOverlay.n = subMenuOverlayHost;
                    }
                    ViewParent parent = subMenuOverlay.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).bringChildToFront(subMenuOverlay);
                    }
                    subMenuOverlay.setVisibility(0);
                    subMenuOverlay.y = true;
                    subMenuOverlay.F = SystemClock.uptimeMillis();
                    subMenuOverlay.f();
                    subMenuOverlayHost.d(subMenuOverlay, this);
                    subMenuOverlay.b();
                    if (!subMenuOverlay.D) {
                        getIconView().setAlpha(0.0f);
                    }
                    r6 = subMenuOverlay.getRootView() != null ? subMenuOverlay.getRootView().findFocus() : null;
                    if ((r6 instanceof EditText) && r6.isShown()) {
                        return;
                    }
                    subMenuOverlay.setFocusableInTouchMode(true);
                    subMenuOverlay.requestFocus();
                    return;
                }
                return;
            }
        }
        k1 k1Var2 = this.d;
        if (k1Var2 == null || !k1Var2.isShowing()) {
            y();
        }
        if (this.b != null) {
            y yVar = this.c;
            if (yVar == null || !yVar.c || (lVar = yVar.b) == null || lVar.u()) {
                k2.v vVar = this.L;
                if (vVar != null) {
                    org.telegram.messenger.i0.r(vVar);
                    this.L = null;
                }
                k1 k1Var3 = this.d;
                if (k1Var3 != null && k1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.l0 = t0Var;
                q0 q0Var2 = this.Q;
                if (q0Var2 != null) {
                    q0Var2.e();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = this.b;
                if (view != null) {
                    ?? d0Var = new jg.d0(this, getContext(), view);
                    d0Var.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.w ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof b1) || (view instanceof LinearLayout)) {
                        tg.b bVar = this.t0;
                        if (bVar != null) {
                            vg.f c11 = bVar.c(this.b, null, true);
                            c11.o(this.u0);
                            z20.u(c11, org.telegram.messenger.i0.L(12.0f), 8.0f);
                            c11.M.e = true;
                            frameLayout.setBackground(c11);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.b6.c(-2.0f, -1));
                    d0Var.addView(frameLayout, w7.b6.o(-1, -2));
                    d0Var.addView(this.b, w7.b6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    r6 = frameLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = d0Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                }
                if (this.t0 != null) {
                    z60.U(this.b, t6.r1(0.06f, t6.w0(t6.E8, this.m0)));
                }
                k1 k1Var4 = new k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = k1Var4;
                if (this.V) {
                    k1Var4.setAnimationStyle(0);
                } else {
                    k1Var4.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z11 = this.V;
                if (!z11) {
                    this.d.b = z11;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.U) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.d0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i12, KeyEvent keyEvent) {
                        k1 k1Var5;
                        t0 t0Var2 = t0.this;
                        t0Var2.getClass();
                        if (i12 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (k1Var5 = t0Var2.d) == null || !k1Var5.isShowing()) {
                            return false;
                        }
                        t0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new jg.t(i10, this));
                Point point = org.telegram.messenger.i0.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(z20.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                if (r6 != null && r6.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    r6.getLayoutParams().width = org.telegram.messenger.i0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                W(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                this.b.f();
                if (this.b.getSwipeBack() != null) {
                    this.b.getSwipeBack().b(false);
                }
                this.d.h();
                float f7 = this.j0;
                if (f7 > 0.0f) {
                    this.d.c(f7);
                }
            }
        }
    }

    public final void V() {
        if (this.f != null) {
            for (int i10 = 0; i10 < this.f.getChildCount(); i10++) {
                if (this.f.getChildAt(i10) instanceof s0) {
                    ((s0) this.f.getChildAt(i10)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        p6 p6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
                if (this.b.L.getChildAt(i11) instanceof b1) {
                    ((b1) this.b.L.getChildAt(i11)).setSelectorColor(t6.w0(t6.I5, p6Var));
                }
            }
        }
        n0 n0Var = this.e;
        if (n0Var != null) {
            int i12 = t6.C8;
            a7.m(n0Var, 30, i12, p6Var);
            a7.E(this.e, t6.D8, p6Var);
            a7.V(this.e, i12, p6Var);
            a7.D(this.e, t6.ig, p6Var);
            a7.z(this.e, t6.jg, p6Var);
        }
    }

    public final void W(boolean z10, boolean z11) {
        int i10;
        int i11;
        ScrollView scrollView;
        y yVar = this.c;
        if (yVar != null) {
            i11 = yVar.getTop() + (-yVar.b.getMeasuredHeight());
            i10 = yVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            i10 = -((int) ((getMeasuredHeight() * scaleY) - ((this.M != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i11 = this.a0;
        }
        int i12 = i10 + i11 + this.N;
        if (z10 && (scrollView = this.b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.l0;
        if (view == null) {
            view = this;
        }
        if (yVar != null) {
            l lVar = yVar.b;
            if (this.M == 0) {
                if (z10) {
                    this.d.showAsDropDown(lVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12);
                }
                if (z11) {
                    this.d.update(lVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.e0) {
                    this.d.showAtLocation(lVar, 51, (getLeft() - org.telegram.messenger.i0.L(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                } else {
                    this.d.showAsDropDown(lVar, (getLeft() - org.telegram.messenger.i0.L(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                }
            }
            if (z11) {
                this.d.update(lVar, (getLeft() - org.telegram.messenger.i0.L(8.0f)) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.M;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i12, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.i0.L(8.0f)) + this.b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-org.telegram.messenger.i0.L(8.0f)) + this.b0 + this.O, i12, -1, -1);
                return;
            }
            return;
        }
        if (z10) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i12);
        }
        if (z11) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i12, -1, -1);
        }
    }

    public final h1 a(int i10) {
        p();
        h1 h1Var = new h1(t6.H8, getContext(), this.m0);
        if (i10 != -1) {
            h1Var.setTag(Integer.valueOf(i10));
        }
        h1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(h1Var, w7.b6.o(-1, 8));
        return h1Var;
    }

    public final TextView b(int i10) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.i0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final b1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, p6 p6Var) {
        p();
        b1 b1Var = new b1(z11 ? 1 : 0, getContext(), p6Var, false, false);
        b1Var.j(charSequence, i11, drawable);
        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        b1Var.setTag(Integer.valueOf(i10));
        this.b.addView(b1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b1Var.getLayoutParams();
        if (cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        b1Var.setLayoutParams(layoutParams);
        b1Var.setOnClickListener(new c0(0, this, z10));
        return b1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final b1 e(int i10, int i11, CharSequence charSequence) {
        return d(i10, i11, null, charSequence, true, false, this.m0);
    }

    public final void f(int i10, String str) {
        p();
        TextView textView = new TextView(getContext());
        a7.V(textView, t6.E8, this.m0);
        textView.setBackgroundDrawable(t6.N0(false));
        if (cd.X) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
        textView.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(org.telegram.messenger.i0.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new z(this, 3));
    }

    public final void g(org.telegram.ui.Cells.j jVar, int i10) {
        p();
        jVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.b.addView(jVar);
        jVar.setTag(8);
        jVar.setOnClickListener(new z(this, 1));
        jVar.setBackgroundDrawable(t6.N0(false));
    }

    public View getContentView() {
        ei0 ei0Var = this.y;
        return ei0Var != null ? ei0Var : this.E;
    }

    public ei0 getIconView() {
        return this.y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.b == null) {
            p();
        }
        return this.b;
    }

    public ImageView getSearchClearButton() {
        return this.s;
    }

    public FrameLayout getSearchContainer() {
        return this.F;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.e;
    }

    public s5 getSubMenuOverlay() {
        i20 i20Var = this.v0;
        if (i20Var != null) {
            return (s5) i20Var.run();
        }
        return null;
    }

    public b5 getSubMenuOverlayHost() {
        y yVar;
        if (this.v0 == null || (yVar = this.c) == null) {
            return null;
        }
        return yVar.b;
    }

    public TextView getTextView() {
        return this.E;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
            View childAt = this.b.L.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final b1 h(int i10, f11 f11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        b1 b1Var = new b1(0, getContext(), this.m0, false, false);
        b1Var.j(str, i10, f11Var);
        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        b1Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(b1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b1Var.getLayoutParams();
        if (cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        b1Var.setLayoutParams(layoutParams);
        int i11 = 0;
        b1Var.P = new e0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), i11);
        b1Var.setOnClickListener(new f0(b1Var, i11));
        this.b.c = true;
        return b1Var;
    }

    public boolean i() {
        l lVar;
        y yVar = this.c;
        return yVar == null || !yVar.c || (lVar = yVar.b) == null || lVar.u();
    }

    public final void j() {
        p0 p0Var;
        TextView textView;
        p0 p0Var2;
        if (this.s != null) {
            boolean r10 = r();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!r10 && TextUtils.isEmpty(this.e.getText()) && (((p0Var = this.H) == null || !p0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((p0Var2 = this.H) != null && !p0Var2.m())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.d0) {
                        this.s.setAlpha(0.0f);
                        this.s.setRotation(45.0f);
                        this.s.setScaleX(0.0f);
                        this.s.setScaleY(0.0f);
                        this.s.setVisibility(4);
                        this.d0 = true;
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(180L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.b0
                        public final /* synthetic */ t0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    t0 t0Var = this.b;
                                    t0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = t0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.i0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var2 = this.b;
                                    t0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = t0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.i0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new i0(this, 0));
                    duration.start();
                    this.w = duration;
                    return;
                }
                return;
            }
            if (this.s.getTag() == null) {
                this.s.setTag(1);
                AnimatorSet animatorSet2 = this.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.s.setVisibility(0);
                if (this.d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.b0
                        public final /* synthetic */ t0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    t0 t0Var = this.b;
                                    t0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = t0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.i0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var2 = this.b;
                                    t0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = t0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.i0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<g0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new i0(this, 1));
                    duration2.start();
                    this.w = duration2;
                    return;
                }
                this.s.setAlpha(1.0f);
                this.s.setRotation(0.0f);
                this.s.setScaleX(1.0f);
                this.s.setScaleY(1.0f);
                View view = this.x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.d0 = true;
            }
        }
    }

    public final void k() {
        if (this.F == null && this.G) {
            int i10 = 0;
            m0 m0Var = new m0(this, getContext(), 0);
            this.F = m0Var;
            m0Var.setClipChildren(this.n0 != 0);
            this.a = null;
            m0 m0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.b6.m(1.0f, 0, -1, this.n0 + 6, 0, 0);
            y yVar = this.c;
            yVar.addView(m0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = t6.C8;
            p6 p6Var = this.m0;
            a7.V(textView2, i11, p6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(cd.X ? 5 : 3);
            n0 n0Var = new n0(this, getContext(), i10);
            this.e = n0Var;
            n0Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            a7.w(this.e, i11, p6Var);
            this.e.setTextSize(1, 18.0f);
            a7.E(this.e, t6.D8, p6Var);
            a7.V(this.e, i11, p6Var);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            this.e.setOnEditorActionListener(new ag.r1(this, 2));
            this.e.addTextChangedListener(new ag.a1(this, 7));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            a7.D(this.e, t6.ig, p6Var);
            a7.z(this.e, t6.jg, p6Var);
            CharSequence charSequence = this.n;
            if (charSequence != null) {
                this.e.setHint(charSequence);
                setContentDescription(this.n);
            }
            CharSequence charSequence2 = this.r;
            if (charSequence2 != null) {
                this.e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.f.setVisibility(0);
            if (cd.X) {
                this.F.addView(this.f, w7.b6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, w7.b6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.b6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.h, w7.b6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, w7.b6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f, w7.b6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            g0 g0Var = new g0(this, getContext(), 0);
            this.s = g0Var;
            h0 h0Var = new h0(i10, this);
            this.W = h0Var;
            g0Var.setImageDrawable(h0Var);
            this.s.setBackground(t6.h0(yVar.b.q0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new z(this, i10));
            this.s.setContentDescription(cd.L0(2131752099, null));
            this.F.addView(this.s, w7.b6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.b.getItemsCount()) {
                i10 = 8;
                break;
            } else if (this.b.L.getChildAt(i11).getVisibility() == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (i10 != getVisibility()) {
            setVisibility(i10);
        }
    }

    public final void m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i10 >= arrayList.size()) {
                D();
                return;
            }
            if (((zf.e0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public void n() {
        this.r = null;
        n0 n0Var = this.e;
        if (n0Var == null) {
            return;
        }
        n0Var.setText("");
    }

    public final void o() {
        s5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        k1 k1Var = this.d;
        if (k1Var == null || !k1Var.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.y != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.E;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k1 k1Var = this.d;
        if (k1Var != null && k1Var.isShowing()) {
            W(false, true);
        }
        p0 p0Var = this.H;
        if (p0Var != null) {
            p0Var.g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k2.v vVar;
        int i10;
        k2.v vVar2;
        s5 shownSubMenuOverlay = getShownSubMenuOverlay();
        boolean z10 = shownSubMenuOverlay != null && shownSubMenuOverlay.y;
        boolean z11 = getSubMenuOverlayHost() != null;
        k1 k1Var = this.d;
        boolean z12 = k1Var != null && k1Var.isShowing();
        if (motionEvent.getActionMasked() == 0) {
            this.q0 = false;
            if ((this.c0 || z11) && s() && !z12 && !z10) {
                k2.v vVar3 = this.L;
                if (vVar3 != null) {
                    org.telegram.messenger.i0.r(vVar3);
                    this.L = null;
                }
                k2.v vVar4 = new k2.v(8, this, z11);
                this.L = vVar4;
                org.telegram.messenger.i0.h3(vVar4, z11 ? ViewConfiguration.getLongPressTimeout() : 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.L != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f7 = -scaledTouchSlop;
                if ((motionEvent.getX() < f7 || motionEvent.getY() < f7 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (vVar2 = this.L) != null) {
                    org.telegram.messenger.i0.r(vVar2);
                    this.L = null;
                }
            }
            if (!this.f0 || z11 || !s() || z12) {
                if ((this.f0 || this.q0) && (z12 || z10)) {
                    getLocationOnScreen(this.J);
                    float x10 = motionEvent.getX() + this.J[0];
                    float y3 = motionEvent.getY() + this.J[1];
                    this.K = null;
                    for (0; i10 < this.b.getItemsCount(); i10 + 1) {
                        View childAt = this.b.L.getChildAt(i10);
                        Object tag = childAt.getTag();
                        if (tag instanceof Integer) {
                            i10 = ((Integer) tag).intValue() >= 100 ? i10 + 1 : 0;
                            ((View) childAt.getParent()).getLocationOnScreen(this.J);
                            int[] iArr = this.J;
                            float f10 = x10 - iArr[0];
                            float f11 = y3 - iArr[1];
                            childAt.getHitRect(this.I);
                            if (childAt.getVisibility() == 0 || !this.I.contains((int) f10, (int) f11)) {
                                childAt.setPressed(false);
                                childAt.setSelected(false);
                            } else {
                                childAt.setPressed(true);
                                childAt.setSelected(true);
                                childAt.drawableHotspotChanged(f10 - childAt.getLeft(), f11 - childAt.getTop());
                                this.K = childAt;
                            }
                        } else {
                            if (!childAt.hasOnClickListeners()) {
                            }
                            ((View) childAt.getParent()).getLocationOnScreen(this.J);
                            int[] iArr2 = this.J;
                            float f102 = x10 - iArr2[0];
                            float f112 = y3 - iArr2[1];
                            childAt.getHitRect(this.I);
                            if (childAt.getVisibility() == 0) {
                            }
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                        }
                    }
                }
            } else if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                U(null, null);
                this.q0 = true;
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1 && (z12 || z10)) {
            k2.v vVar5 = this.L;
            if (vVar5 != null) {
                org.telegram.messenger.i0.r(vVar5);
                this.L = null;
            }
            View view = this.K;
            if (view != null) {
                view.setSelected(false);
                this.K.setPressed(false);
                View view2 = this.K;
                Object tag2 = view2.getTag();
                this.K = null;
                if (tag2 instanceof Integer) {
                    y yVar = this.c;
                    if (yVar != null) {
                        yVar.o(((Integer) tag2).intValue());
                    } else {
                        o0 o0Var = this.P;
                        if (o0Var != null) {
                            o0Var.k(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        k1 k1Var2 = this.d;
                        if (k1Var2 != null) {
                            k1Var2.d(this.R);
                        }
                    }
                } else {
                    view2.performClick();
                }
            } else if (this.f0 && !z10) {
                this.d.d(true);
            }
            if (this.q0) {
                this.q0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (vVar = this.L) != null) {
                org.telegram.messenger.i0.r(vVar);
                this.L = null;
            }
            View view3 = this.K;
            if (view3 != null) {
                view3.setSelected(false);
                this.K.setPressed(false);
                this.K = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        tg.b bVar = this.t0;
        if (bVar != null) {
            vg.f c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.o(this.u0);
            c10.q(org.telegram.messenger.i0.L(12.0f));
            c10.p(org.telegram.messenger.i0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.b.setOnTouchListener(new jg.r(1, this));
        this.b.setDispatchKeyEventListener(new mg.l(this, 9));
    }

    public final void q() {
        s5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        k1 k1Var = this.d;
        if (k1Var != null) {
            k1Var.d(this.R);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((zf.e0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        if (this.b != null) {
            return true;
        }
        ArrayList arrayList = this.x0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public void setAdditionalXOffset(int i10) {
        this.b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.a0 = i10;
    }

    public void setDelegate(o0 o0Var) {
        this.P = o0Var;
    }

    public void setDimMenu(float f7) {
        this.j0 = f7;
    }

    public void setFitSubItems(boolean z10) {
        this.b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.p0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.e0 = z10;
    }

    public void setIcon(Drawable drawable) {
        ei0 ei0Var = this.y;
        if (ei0Var == null) {
            return;
        }
        if (drawable instanceof bi0) {
            ei0Var.setAnimation((bi0) drawable);
        } else {
            ei0Var.setImageDrawable(drawable);
        }
        this.D = 0;
    }

    public void setIconColor(int i10) {
        if (this.r0 == null || this.s0 != i10) {
            this.r0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.s0 = i10;
        }
        ei0 ei0Var = this.y;
        if (ei0Var != null) {
            ColorFilter colorFilter = ei0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.r0;
            if (colorFilter != porterDuffColorFilter) {
                ei0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        g0 g0Var = this.s;
        if (g0Var != null) {
            ColorFilter colorFilter2 = g0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.r0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.U = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.c0 = z10;
    }

    public void setMenuXOffset(int i10) {
        this.O = i10;
    }

    public void setMenuYOffset(int i10) {
        this.N = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.o0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final q20 q20Var) {
        k1 k1Var = this.d;
        if (k1Var != null) {
            k1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.a0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    q20 q20Var2 = q20Var;
                    if (q20Var2 != null) {
                        q20Var2.a(Boolean.valueOf(t0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        k1 k1Var = this.d;
        if (k1Var != null) {
            k1Var.b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        u71 u71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = u71Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = u71Var.getChildAt(i11);
            if (childAt instanceof b1) {
                ((b1) childAt).setSelectorColor(i10);
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.x = view;
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        if (this.h == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setText(charSequence);
        }
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.n = charSequence;
        if (this.h == null) {
            return;
        }
        this.e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        this.n0 = i10;
        m0 m0Var = this.F;
        if (m0Var != null) {
            ((ViewGroup.MarginLayoutParams) m0Var.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(i10);
            this.F.setClipChildren(this.n0 != 0);
            m0 m0Var2 = this.F;
            m0Var2.setLayoutParams(m0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        h0 h0Var = this.W;
        if (h0Var == null) {
            return;
        }
        if (!z10) {
            h0Var.e = false;
            return;
        }
        h0Var.e = true;
        h0Var.b = System.currentTimeMillis();
        h0Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(q0 q0Var) {
        this.Q = q0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.M = i10;
    }

    public void setSubMenuOverlayProvider(i20 i20Var) {
        this.v0 = i20Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f7) {
        this.k0 = f7;
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7 + this.k0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final void t(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.y0;
        r0 r0Var = hashMap == null ? null : (r0) hashMap.get(Integer.valueOf(i10));
        if (r0Var != null) {
            r0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public boolean u() {
        return this.G;
    }

    public boolean v() {
        m0 m0Var = this.F;
        return m0Var != null && m0Var.getVisibility() == 0;
    }

    public boolean w() {
        m0 m0Var = this.F;
        return (m0Var == null || m0Var.getTag() == null) ? false : true;
    }

    public final boolean x() {
        s5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.y;
        }
        k1 k1Var = this.d;
        return k1Var != null && k1Var.isShowing();
    }

    public final void y() {
        if (this.x0 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.x0.size(); i10++) {
            r0 r0Var = (r0) this.x0.get(i10);
            r0Var.getClass();
            int i11 = 1;
            p();
            View view = r0Var.j;
            if (view != null) {
                this.b.addView(view);
            } else {
                int i12 = r0Var.a;
                if (i12 == 0) {
                    b1 b1Var = new b1(0, getContext(), this.m0, false, false);
                    b1Var.j(r0Var.e, r0Var.c, r0Var.d);
                    b1Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                    b1Var.setTag(Integer.valueOf(r0Var.b));
                    this.b.addView(b1Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b1Var.getLayoutParams();
                    if (cd.X) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.i0.L(48.0f);
                    b1Var.setLayoutParams(layoutParams);
                    b1Var.setOnClickListener(new ag.t0(18, r0Var, this));
                    Integer num = r0Var.n;
                    if (num != null && r0Var.o != null) {
                        b1Var.d(num.intValue(), r0Var.o.intValue());
                    }
                    r0Var.j = b1Var;
                } else if (i12 == 1) {
                    h1 h1Var = new h1(t6.H8, getContext(), this.m0);
                    h1Var.setTag(R.id.fit_width_tag, 1);
                    this.b.a(h1Var, w7.b6.o(-1, 8));
                    r0Var.j = h1Var;
                } else if (i12 == 2) {
                    b1 b1Var2 = new b1(0, getContext(), this.m0, false, false);
                    b1Var2.j(r0Var.e, r0Var.c, r0Var.d);
                    b1Var2.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                    b1Var2.setRightIcon(R.drawable.msg_arrowright);
                    b1Var2.getRightIcon().setVisibility(r0Var.m);
                    this.b.addView(b1Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b1Var2.getLayoutParams();
                    if (cd.X) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.i0.L(48.0f);
                    b1Var2.setLayoutParams(layoutParams2);
                    uh uhVar = r0Var.h;
                    if (uhVar != null) {
                        r0Var.g = (View) uhVar.run();
                        r0Var.h = null;
                    }
                    b1Var2.P = new e0(this, this.b.b(r0Var.g), i11);
                    b1Var2.setOnClickListener(new f0(b1Var2, i11));
                    this.b.c = true;
                    Integer num2 = r0Var.n;
                    if (num2 != null && r0Var.o != null) {
                        b1Var2.d(num2.intValue(), r0Var.o.intValue());
                    }
                    r0Var.j = b1Var2;
                } else if (i12 == 3) {
                    p80 p80Var = new p80(getContext(), null);
                    p80Var.setTag(R.id.fit_width_tag, 1);
                    p80Var.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
                    p80Var.setTextSize(1, r0Var.i);
                    a7.V(p80Var, t6.E8, null);
                    p80Var.setMovementMethod(LinkMovementMethod.getInstance());
                    a7.H(p80Var, t6.J6, null);
                    p80Var.setText(r0Var.e);
                    p80Var.setMaxWidth(org.telegram.messenger.i0.L(200.0f));
                    this.b.a(p80Var, w7.b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    r0Var.j = p80Var;
                }
            }
            View view2 = r0Var.j;
            if (view2 != null) {
                view2.setVisibility(r0Var.l);
                sh shVar = r0Var.k;
                if (shVar != null) {
                    r0Var.j.setOnClickListener(shVar);
                }
            }
        }
        this.x0.clear();
    }

    public final r0 z(int i10, int i11, String str) {
        r0 r0Var = new r0(0);
        r0Var.b = i10;
        r0Var.c = i11;
        r0Var.d = null;
        r0Var.e = str;
        r0Var.f = true;
        G(r0Var);
        return r0Var;
    }

    public t0(Context context, y yVar, int i10) {
        this(context, yVar, 0, i10, false, null);
    }

    public t0(Context context, y yVar, int i10, int i11, boolean z10, p6 p6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = -1;
        this.i0 = new e2.f(null);
        this.m0 = p6Var;
        if (i10 != 0) {
            setBackgroundDrawable(t6.h0(i10, z10 ? 5 : 1, -1));
        }
        this.c = yVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, w7.b6.c(-1.0f, -2));
            return;
        }
        ei0 ei0Var = new ei0(context);
        this.y = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.setImportantForAccessibility(2);
        addView(ei0Var, w7.b6.c(-1.0f, -1));
        if (i11 != 0) {
            ei0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        ei0 ei0Var = this.y;
        if (ei0Var == null) {
            return;
        }
        this.D = i10;
        ei0Var.setImageResource(i10);
    }
}
