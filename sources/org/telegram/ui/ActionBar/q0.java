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
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.ah;
import org.telegram.ui.s51;
import org.telegram.ui.yg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout {
    public int E;
    public final TextView F;
    public k0 G;
    public boolean H;
    public m0 I;
    public Rect J;
    public int[] K;
    public View L;
    public ci.e1 M;
    public int N;
    public int O;
    public int P;
    public l0 Q;
    public n0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public FrameLayout a;
    public gi.b2 a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final x c;
    public int c0;
    public f1 d;
    public boolean d0;
    public bh.g e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public final ArrayList h0;
    public int i0;
    public final g2.g j0;
    public float k0;
    public float l0;
    public View m0;
    public CharSequence n;
    public final e6 n0;
    public int o0;
    public View.OnClickListener p0;
    public boolean q0;
    public CharSequence r;
    public boolean r0;
    public e0 s;
    public PorterDuffColorFilter s0;
    public int t0;
    public eh.c u0;
    public hh.e v0;
    public AnimatorSet w;
    public m10 w0;
    public View x;
    public AnimatorSet x0;
    public final fh0 y;
    public ArrayList y0;
    public HashMap z0;

    public q0(Context context, int i3, int i10) {
        this(context, null, i3, i10, true, null);
    }

    public static y0 c(boolean z10, boolean z11, ViewGroup viewGroup, int i3, CharSequence charSequence, boolean z12, e6 e6Var) {
        y0 y0Var = new y0(z12 ? 1 : 0, viewGroup.getContext(), e6Var, z10, z11);
        y0Var.j(charSequence, i3, null);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        return y0Var;
    }

    private i5 getShownSubMenuOverlay() {
        s4 subMenuOverlayHost = getSubMenuOverlayHost();
        i5 openMenuOverlay = subMenuOverlayHost != null ? subMenuOverlayHost.getOpenMenuOverlay() : null;
        if (openMenuOverlay != null && openMenuOverlay.e == this && (openMenuOverlay.y || openMenuOverlay.N)) {
            return openMenuOverlay;
        }
        return null;
    }

    public final void A(ch0 ch0Var, String str) {
        o0 o0Var = new o0(0);
        o0Var.b = 29;
        o0Var.c = 0;
        o0Var.d = ch0Var;
        o0Var.e = str;
        o0Var.f = true;
        G(o0Var);
    }

    public final o0 B(ah ahVar) {
        o0 o0Var = new o0(2);
        o0Var.c = R.drawable.msg_mute;
        o0Var.d = null;
        o0Var.e = null;
        o0Var.g = null;
        o0Var.h = ahVar;
        G(o0Var);
        return o0Var;
    }

    public final o0 C() {
        o0 o0Var = new o0(3);
        o0Var.e = "";
        o0Var.i = 13;
        G(o0Var);
        return o0Var;
    }

    public final void D() {
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        k0 k0Var = this.G;
        if (k0Var != null && k0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new h0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.g);
            transitionSet.addListener((Transition.TransitionListener) new i0(0, this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i3 = 0;
            while (i3 < this.f.getChildCount()) {
                if (!arrayList2.remove(((p0) this.f.getChildAt(i3)).getFilter())) {
                    this.f.removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            kg.l0 l0Var = (kg.l0) arrayList2.get(i10);
            l0Var.getClass();
            p0 p0Var = new p0(getContext(), this.n0);
            p0Var.setData(l0Var);
            p0Var.setOnClickListener(new org.telegram.messenger.video.g(1, this, p0Var));
            this.f.addView(p0Var, mf.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i11 = 0;
            while (i11 < this.f.getChildCount()) {
                ((p0) this.f.getChildAt(i11)).setExpanded(i11 == this.i0);
                i11++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.G.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new j0(this, x10));
        }
        j();
    }

    public void E() {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.k(this.e);
        }
    }

    public void F(boolean z10) {
        x xVar;
        k();
        k0 k0Var = this.G;
        if (k0Var == null || k0Var.getVisibility() == 0 || (xVar = this.c) == null) {
            return;
        }
        xVar.b.y(T(z10));
    }

    public final o0 G(o0 o0Var) {
        if (this.y0 == null) {
            this.y0 = new ArrayList();
        }
        this.y0.add(o0Var);
        if (this.z0 == null) {
            this.z0 = new HashMap();
        }
        this.z0.put(Integer.valueOf(o0Var.b), o0Var);
        return o0Var;
    }

    public final void H(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i3) {
            return;
        }
        this.b.setBackgroundColor(i3);
        f1 f1Var = this.d;
        if (f1Var == null || !f1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void I(kg.l0 l0Var) {
        if (l0Var.h) {
            this.h0.remove(l0Var);
            int i3 = this.i0;
            if (i3 < 0 || i3 > r0.size() - 1) {
                this.i0 = r0.size() - 1;
            }
            D();
            this.e.m();
        }
    }

    public q0 J(m0 m0Var) {
        this.I = m0Var;
        return this;
    }

    public final void K() {
        this.S = false;
    }

    public final void L(eh.c cVar, hh.e eVar) {
        this.u0 = cVar;
        this.v0 = eVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || cVar == null) {
            return;
        }
        gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c2.p(eVar);
        c2.r(org.telegram.messenger.g0.L(12.0f));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
    }

    public q0 M() {
        return N();
    }

    public q0 N() {
        if (this.c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void O(int i3, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
        int childCount = s51Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = s51Var.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i3);
            } else if (childAt instanceof y0) {
                if (z10) {
                    ((y0) childAt).setIconColor(i3);
                } else {
                    ((y0) childAt).setTextColor(i3);
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.r = charSequence;
        if (this.h == null) {
            return;
        }
        this.e0 = z10;
        this.e.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.e.setSelection(charSequence.length());
    }

    public final void Q(int i3, boolean z10) {
        if (z10) {
            S(i3);
        } else {
            t(i3);
        }
    }

    public final void R(int i3) {
        S(i3);
    }

    public final void S(int i3) {
        View findViewWithTag;
        HashMap hashMap = this.z0;
        o0 o0Var = hashMap == null ? null : (o0) hashMap.get(Integer.valueOf(i3));
        if (o0Var != null) {
            o0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i3))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        org.telegram.messenger.camera.q.l(findViewWithTag.animate().alpha(1.0f), xq.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public boolean T(boolean z10) {
        x xVar;
        fh0 iconView;
        Animator e10;
        k();
        m0 m0Var = this.I;
        if (this.G == null || !(m0Var == null || m0Var.c())) {
            return false;
        }
        m0 m0Var2 = this.I;
        if (m0Var2 != null && (e10 = m0Var2.e()) != null) {
            e10.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            xVar = this.c;
            if (i3 >= xVar.getChildCount()) {
                break;
            }
            View childAt = xVar.getChildAt(i3);
            if ((childAt instanceof q0) && (iconView = ((q0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i3++;
        }
        Object tag = this.G.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.G.setVisibility(0);
            this.G.setAlpha(0.0f);
            AnimatorSet animatorSet = this.x0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.x0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.x0 = animatorSet2;
            k0 k0Var = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(k0Var, (Property<k0, Float>) property, k0Var.getAlpha(), 1.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), (Property<View, Float>) property, ((View) arrayList.get(i10)).getAlpha(), 0.0f));
            }
            this.x0.setDuration(150L);
            this.x0.addListener(new g0(this, arrayList, 1));
            this.x0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.K3(this.e);
            }
            this.G.setTag(1);
            m0 m0Var3 = this.I;
            if (m0Var3 != null) {
                m0Var3.i();
            }
            return true;
        }
        this.G.setTag(null);
        AnimatorSet animatorSet3 = this.x0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.x0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.x0 = animatorSet4;
        k0 k0Var2 = this.G;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(k0Var2, (Property<k0, Float>) property, k0Var2.getAlpha(), 0.0f));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((View) arrayList.get(i11)).setAlpha(0.0f);
            this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), (Property<View, Float>) property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
        }
        this.x0.setDuration(150L);
        this.x0.addListener(new g0(this, arrayList, 0));
        this.x0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.h0;
        if (!arrayList2.isEmpty() && this.I != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((kg.l0) arrayList2.get(i12)).h) {
                    this.I.j((kg.l0) arrayList2.get(i12));
                }
            }
        }
        m0 m0Var4 = this.I;
        if (m0Var4 != null) {
            m0Var4.h();
        }
        if (z10) {
            org.telegram.messenger.g0.v1(this.e);
        }
        xVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.view.ViewGroup, android.widget.LinearLayout, gi.y4] */
    public final void U(View view, q0 q0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        f1 f1Var;
        boolean z10;
        int i3 = 1;
        if (view == null) {
            s4 subMenuOverlayHost = getSubMenuOverlayHost();
            final i5 subMenuOverlay = subMenuOverlayHost != null ? getSubMenuOverlay() : null;
            if (subMenuOverlay != null && ((f1Var = this.d) == null || !f1Var.isShowing())) {
                y();
                if (s() && i()) {
                    if (subMenuOverlay.e == this && (((z10 = subMenuOverlay.y) || subMenuOverlay.N) && z10)) {
                        subMenuOverlay.a(true);
                        return;
                    }
                    this.U = false;
                    n0 n0Var = this.R;
                    if (n0Var != null) {
                        n0Var.g();
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                    WeakHashMap weakHashMap = subMenuOverlay.r;
                    if (subMenuOverlay.y && subMenuOverlay.d == subMenuOverlayHost && subMenuOverlay.e == this) {
                        return;
                    }
                    s4 s4Var = subMenuOverlay.d;
                    if (s4Var != null && (s4Var != subMenuOverlayHost || subMenuOverlay.e != this)) {
                        subMenuOverlay.c();
                    }
                    subMenuOverlay.d = subMenuOverlayHost;
                    subMenuOverlay.e = this;
                    subMenuOverlayHost.getClass();
                    subMenuOverlay.s = false;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = subMenuOverlay.f;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != popupLayout) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                            org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        }
                        subMenuOverlay.f = popupLayout;
                    }
                    subMenuOverlay.h(popupLayout, org.telegram.messenger.g0.L(5.0f));
                    popupLayout.setTranslationX(0.0f);
                    popupLayout.setTranslationY(0.0f);
                    popupLayout.setAlpha(1.0f);
                    r6.d0(popupLayout, false);
                    f60.U(popupLayout, k6.r1(0.06f, k6.w0(k6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                    popupLayout.f();
                    xe0 swipeBack = popupLayout.getSwipeBack();
                    if (swipeBack != null) {
                        swipeBack.b(false);
                        swipeBack.setForegroundOnGlass(true);
                        if (subMenuOverlay.b != swipeBack) {
                            subMenuOverlay.b = swipeBack;
                            swipeBack.y.add(new we0() { // from class: org.telegram.ui.ActionBar.g5
                                @Override // org.telegram.ui.Components.we0
                                public final void a(float f10, float f11) {
                                    i5.this.invalidate();
                                }
                            });
                        }
                        for (int i10 = 1; i10 < swipeBack.getChildCount(); i10++) {
                            if (swipeBack.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i10);
                                subMenuOverlay.h(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                                r6.d0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                                f60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, k6.r1(0.06f, k6.w0(k6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                            }
                        }
                    }
                    ScrollView scrollView = popupLayout.L;
                    if (scrollView != null) {
                        scrollView.scrollTo(0, 0);
                    }
                    if (popupLayout.getParent() != subMenuOverlay) {
                        org.telegram.messenger.g0.E2(popupLayout);
                        subMenuOverlay.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                    }
                    gh.g gVar = subMenuOverlay.h;
                    if (gVar == null || subMenuOverlay.n != subMenuOverlayHost) {
                        if (gVar != null) {
                            gVar.a.setEmpty();
                            subMenuOverlay.h.setBounds(0, 0, 0, 0);
                        }
                        gh.g gVar2 = (gh.g) weakHashMap.get(subMenuOverlayHost);
                        subMenuOverlay.h = gVar2;
                        if (gVar2 == null) {
                            gh.g c2 = subMenuOverlayHost.c(subMenuOverlay);
                            subMenuOverlay.h = c2;
                            if (c2 != null) {
                                c2.p(subMenuOverlay.c);
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
                    subMenuOverlay.G = SystemClock.uptimeMillis();
                    subMenuOverlay.f();
                    subMenuOverlayHost.d(subMenuOverlay, this);
                    subMenuOverlay.b();
                    if (!subMenuOverlay.E) {
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
        f1 f1Var2 = this.d;
        if (f1Var2 == null || !f1Var2.isShowing()) {
            y();
        }
        if (this.b != null) {
            x xVar = this.c;
            if (xVar == null || !xVar.c || (kVar = xVar.b) == null || kVar.v()) {
                ci.e1 e1Var = this.M;
                if (e1Var != null) {
                    org.telegram.messenger.g0.r(e1Var);
                    this.M = null;
                }
                f1 f1Var3 = this.d;
                if (f1Var3 != null && f1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = q0Var;
                n0 n0Var2 = this.R;
                if (n0Var2 != null) {
                    n0Var2.g();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = this.b;
                if (view != null) {
                    ?? y4Var = new gi.y4(this, getContext(), view);
                    y4Var.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.w ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof y0) || (view instanceof LinearLayout)) {
                        eh.c cVar = this.u0;
                        if (cVar != null) {
                            gh.g c10 = cVar.c(this.b, null, true);
                            c10.p(this.v0);
                            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c10.R.e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, mf.c(-2.0f, -1));
                    y4Var.addView(frameLayout, mf.o(-1, -2));
                    y4Var.addView(this.b, mf.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    r6 = frameLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = y4Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                }
                if (this.u0 != null) {
                    f60.U(this.b, k6.r1(0.06f, k6.w0(k6.E8, this.n0)));
                }
                f1 f1Var4 = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = f1Var4;
                if (this.W) {
                    f1Var4.setAnimationStyle(0);
                } else {
                    f1Var4.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z11 = this.W;
                if (!z11) {
                    this.d.b = z11;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.V) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.b0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                        f1 f1Var5;
                        q0 q0Var2 = q0.this;
                        q0Var2.getClass();
                        if (i11 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (f1Var5 = q0Var2.d) == null || !f1Var5.isShowing()) {
                            return false;
                        }
                        q0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new gi.m4(i3, this));
                Point point = org.telegram.messenger.g0.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                if (r6 != null && r6.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    r6.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.U = false;
                this.d.setFocusable(true);
                W(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                this.b.f();
                if (this.b.getSwipeBack() != null) {
                    this.b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.k0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void V() {
        if (this.f != null) {
            for (int i3 = 0; i3 < this.f.getChildCount(); i3++) {
                if (this.f.getChildAt(i3) instanceof p0) {
                    ((p0) this.f.getChildAt(i3)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        e6 e6Var = this.n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                if (this.b.M.getChildAt(i10) instanceof y0) {
                    ((y0) this.b.M.getChildAt(i10)).setSelectorColor(k6.w0(k6.I5, e6Var));
                }
            }
        }
        bh.g gVar = this.e;
        if (gVar != null) {
            int i11 = k6.C8;
            r6.m(gVar, 30, i11, e6Var);
            r6.E(this.e, k6.D8, e6Var);
            r6.V(this.e, i11, e6Var);
            r6.D(this.e, k6.ig, e6Var);
            r6.z(this.e, k6.jg, e6Var);
        }
    }

    public final void W(boolean z10, boolean z11) {
        int i3;
        int i10;
        ScrollView scrollView;
        x xVar = this.c;
        if (xVar != null) {
            i10 = xVar.getTop() + (-xVar.b.getMeasuredHeight());
            i3 = xVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            i3 = -((int) ((getMeasuredHeight() * scaleY) - ((this.N != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i10 = this.b0;
        }
        int i11 = i3 + i10 + this.O;
        if (z10 && (scrollView = this.b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.m0;
        if (view == null) {
            view = this;
        }
        if (xVar != null) {
            k kVar = xVar.b;
            if (this.N == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (xVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (xVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                return;
            }
            return;
        }
        int i12 = this.N;
        if (i12 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i11);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i11, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.c0 + this.P, i11, -1, -1);
                return;
            }
            return;
        }
        if (z10) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i11);
        }
        if (z11) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i11, -1, -1);
        }
    }

    public final c1 a(int i3) {
        p();
        c1 c1Var = new c1(k6.H8, getContext(), this.n0);
        if (i3 != -1) {
            c1Var.setTag(Integer.valueOf(i3));
        }
        c1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(c1Var, mf.o(-1, 8));
        return c1Var;
    }

    public final TextView b(int i3) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i3);
        textView.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.g0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final y0 d(int i3, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, e6 e6Var) {
        p();
        y0 y0Var = new y0(z11 ? 1 : 0, getContext(), e6Var, false, false);
        y0Var.j(charSequence, i10, drawable);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setTag(Integer.valueOf(i3));
        this.b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        y0Var.setOnClickListener(new ei.e2(2, this, z10));
        return y0Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final y0 e(int i3, int i10, CharSequence charSequence) {
        return d(i3, i10, null, charSequence, true, false, this.n0);
    }

    public final void f(int i3, String str) {
        p();
        TextView textView = new TextView(getContext());
        r6.V(textView, k6.E8, this.n0);
        textView.setBackgroundDrawable(k6.N0(false));
        if (bd.a0) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
        textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(org.telegram.messenger.g0.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(str);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new y(this, 3));
    }

    public final void g(org.telegram.ui.Cells.k kVar, int i3) {
        p();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i3));
        this.b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new y(this, 1));
        kVar.setBackgroundDrawable(k6.N0(false));
    }

    public View getContentView() {
        fh0 fh0Var = this.y;
        return fh0Var != null ? fh0Var : this.F;
    }

    public fh0 getIconView() {
        return this.y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.p0;
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
        return this.G;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.e;
    }

    public i5 getSubMenuOverlay() {
        m10 m10Var = this.w0;
        if (m10Var != null) {
            return (i5) m10Var.run();
        }
        return null;
    }

    public s4 getSubMenuOverlayHost() {
        x xVar;
        if (this.w0 == null || (xVar = this.c) == null) {
            return null;
        }
        return xVar.b;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i3 = 0;
        for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
            View childAt = this.b.M.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i3++;
            }
        }
        return i3;
    }

    public final y0 h(int i3, zz0 zz0Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        y0 y0Var = new y0(0, getContext(), this.n0, false, false);
        y0Var.j(str, i3, zz0Var);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        int i10 = 0;
        y0Var.Q = new c0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), i10);
        y0Var.setOnClickListener(new d0(y0Var, i10));
        this.b.c = true;
        return y0Var;
    }

    public boolean i() {
        k kVar;
        x xVar = this.c;
        return xVar == null || !xVar.c || (kVar = xVar.b) == null || kVar.v();
    }

    public final void j() {
        m0 m0Var;
        TextView textView;
        m0 m0Var2;
        if (this.s != null) {
            boolean r5 = r();
            final int i3 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i10 = 1;
            if (!r5 && TextUtils.isEmpty(this.e.getText()) && (((m0Var = this.I) == null || !m0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((m0Var2 = this.I) != null && !m0Var2.m())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.e0) {
                        this.s.setAlpha(0.0f);
                        this.s.setRotation(45.0f);
                        this.s.setScaleX(0.0f);
                        this.s.setScaleY(0.0f);
                        this.s.setVisibility(4);
                        this.e0 = true;
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(180L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.a0
                        public final /* synthetic */ q0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    q0 q0Var = this.b;
                                    q0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = q0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var2 = this.b;
                                    q0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = q0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new f0(this, 0));
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
                if (this.e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.a0
                        public final /* synthetic */ q0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    q0 q0Var = this.b;
                                    q0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = q0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var2 = this.b;
                                    q0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = q0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<e0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new f0(this, 1));
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
                this.e0 = true;
            }
        }
    }

    public final void k() {
        if (this.G == null && this.H) {
            int i3 = 0;
            k0 k0Var = new k0(0, getContext(), this);
            this.G = k0Var;
            int i10 = 1;
            k0Var.setClipChildren(this.o0 != 0);
            this.a = null;
            k0 k0Var2 = this.G;
            LinearLayout.LayoutParams m10 = mf.m(1.0f, 0, -1, this.o0 + 6, 0, 0);
            x xVar = this.c;
            xVar.addView(k0Var2, 0, m10);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = k6.C8;
            e6 e6Var = this.n0;
            r6.V(textView2, i11, e6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            int i12 = 3;
            this.h.setGravity(bd.a0 ? 5 : 3);
            bh.g gVar = new bh.g(i12, getContext(), this);
            this.e = gVar;
            gVar.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            r6.w(this.e, i11, e6Var);
            this.e.setTextSize(1, 18.0f);
            r6.E(this.e, k6.D8, e6Var);
            r6.V(this.e, i11, e6Var);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            this.e.setOnEditorActionListener(new ci.o(this, i12));
            this.e.addTextChangedListener(new bh.h(this, 12));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            r6.D(this.e, k6.ig, e6Var);
            r6.z(this.e, k6.jg, e6Var);
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
            if (bd.a0) {
                this.G.addView(this.f, mf.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.e, mf.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, mf.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.G.addView(this.h, mf.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.e, mf.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f, mf.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            e0 e0Var = new e0(0, getContext(), this);
            this.s = e0Var;
            gi.b2 b2Var = new gi.b2(i10, this);
            this.a0 = b2Var;
            e0Var.setImageDrawable(b2Var);
            this.s.setBackground(k6.h0(xVar.b.r0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new y(this, i3));
            this.s.setContentDescription(bd.M0(2131752099, null));
            this.G.addView(this.s, mf.e(48, -1, 21));
        }
    }

    public final void l() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.b.getItemsCount()) {
                i3 = 8;
                break;
            } else if (this.b.M.getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i3 != getVisibility()) {
            setVisibility(i3);
        }
    }

    public final void m() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h0;
            if (i3 >= arrayList.size()) {
                D();
                return;
            }
            if (((kg.l0) arrayList.get(i3)).h) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public void n() {
        this.r = null;
        bh.g gVar = this.e;
        if (gVar == null) {
            return;
        }
        gVar.setText("");
    }

    public final void o() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        f1 f1Var = this.d;
        if (f1Var == null || !f1Var.isShowing()) {
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
        TextView textView = this.F;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.isShowing()) {
            W(false, true);
        }
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ci.e1 e1Var;
        int i3;
        ci.e1 e1Var2;
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        boolean z10 = shownSubMenuOverlay != null && shownSubMenuOverlay.y;
        boolean z11 = getSubMenuOverlayHost() != null;
        f1 f1Var = this.d;
        boolean z12 = f1Var != null && f1Var.isShowing();
        if (motionEvent.getActionMasked() == 0) {
            this.r0 = false;
            if ((this.d0 || z11) && s() && !z12 && !z10) {
                ci.e1 e1Var3 = this.M;
                if (e1Var3 != null) {
                    org.telegram.messenger.g0.r(e1Var3);
                    this.M = null;
                }
                ci.e1 e1Var4 = new ci.e1(18, this, z11);
                this.M = e1Var4;
                org.telegram.messenger.g0.i3(e1Var4, z11 ? ViewConfiguration.getLongPressTimeout() : 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (e1Var2 = this.M) != null) {
                    org.telegram.messenger.g0.r(e1Var2);
                    this.M = null;
                }
            }
            if (!this.g0 || z11 || !s() || z12) {
                if ((this.g0 || this.r0) && (z12 || z10)) {
                    getLocationOnScreen(this.K);
                    float x10 = motionEvent.getX() + this.K[0];
                    float y9 = motionEvent.getY() + this.K[1];
                    this.L = null;
                    for (0; i3 < this.b.getItemsCount(); i3 + 1) {
                        View childAt = this.b.M.getChildAt(i3);
                        Object tag = childAt.getTag();
                        if (tag instanceof Integer) {
                            i3 = ((Integer) tag).intValue() >= 100 ? i3 + 1 : 0;
                            ((View) childAt.getParent()).getLocationOnScreen(this.K);
                            int[] iArr = this.K;
                            float f11 = x10 - iArr[0];
                            float f12 = y9 - iArr[1];
                            childAt.getHitRect(this.J);
                            if (childAt.getVisibility() == 0 || !this.J.contains((int) f11, (int) f12)) {
                                childAt.setPressed(false);
                                childAt.setSelected(false);
                            } else {
                                childAt.setPressed(true);
                                childAt.setSelected(true);
                                childAt.drawableHotspotChanged(f11 - childAt.getLeft(), f12 - childAt.getTop());
                                this.L = childAt;
                            }
                        } else {
                            if (!childAt.hasOnClickListeners()) {
                            }
                            ((View) childAt.getParent()).getLocationOnScreen(this.K);
                            int[] iArr2 = this.K;
                            float f112 = x10 - iArr2[0];
                            float f122 = y9 - iArr2[1];
                            childAt.getHitRect(this.J);
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
                this.r0 = true;
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1 && (z12 || z10)) {
            ci.e1 e1Var5 = this.M;
            if (e1Var5 != null) {
                org.telegram.messenger.g0.r(e1Var5);
                this.M = null;
            }
            View view = this.L;
            if (view != null) {
                view.setSelected(false);
                this.L.setPressed(false);
                View view2 = this.L;
                Object tag2 = view2.getTag();
                this.L = null;
                if (tag2 instanceof Integer) {
                    x xVar = this.c;
                    if (xVar != null) {
                        xVar.o(((Integer) tag2).intValue());
                    } else {
                        l0 l0Var = this.Q;
                        if (l0Var != null) {
                            l0Var.i(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        f1 f1Var2 = this.d;
                        if (f1Var2 != null) {
                            f1Var2.d(this.S);
                        }
                    }
                } else {
                    view2.performClick();
                }
            } else if (this.g0 && !z10) {
                this.d.d(true);
            }
            if (this.r0) {
                this.r0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (e1Var = this.M) != null) {
                org.telegram.messenger.g0.r(e1Var);
                this.M = null;
            }
            View view3 = this.L;
            if (view3 != null) {
                view3.setSelected(false);
                this.L.setPressed(false);
                this.L = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.n0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        eh.c cVar = this.u0;
        if (cVar != null) {
            gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c2.p(this.v0);
            c2.r(org.telegram.messenger.g0.L(12.0f));
            c2.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
        }
        this.b.setOnTouchListener(new gi.k4(1, this));
        this.b.setDispatchKeyEventListener(new l5.b(this, 27));
    }

    public final void q() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.d(this.S);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.h0;
        if (!arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((kg.l0) arrayList.get(i3)).h) {
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
        ArrayList arrayList = this.y0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public void setAdditionalXOffset(int i3) {
        this.c0 = i3;
    }

    public void setAdditionalYOffset(int i3) {
        this.b0 = i3;
    }

    public void setDelegate(l0 l0Var) {
        this.Q = l0Var;
    }

    public void setDimMenu(float f10) {
        this.k0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.q0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f0 = z10;
    }

    public void setIcon(Drawable drawable) {
        fh0 fh0Var = this.y;
        if (fh0Var == null) {
            return;
        }
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i3) {
        if (this.s0 == null || this.t0 != i3) {
            this.s0 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            this.t0 = i3;
        }
        fh0 fh0Var = this.y;
        if (fh0Var != null) {
            ColorFilter colorFilter = fh0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.s0;
            if (colorFilter != porterDuffColorFilter) {
                fh0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i3);
        }
        e0 e0Var = this.s;
        if (e0Var != null) {
            ColorFilter colorFilter2 = e0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.s0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.V = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.d0 = z10;
    }

    public void setMenuXOffset(int i3) {
        this.P = i3;
    }

    public void setMenuYOffset(int i3) {
        this.O = i3;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final u10 u10Var) {
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.z
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    u10 u10Var2 = u10Var;
                    if (u10Var2 != null) {
                        u10Var2.a(Boolean.valueOf(q0.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.b = z10;
        }
        this.W = z10;
    }

    public void setPopupItemsSelectorColor(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
        int childCount = s51Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = s51Var.getChildAt(i10);
            if (childAt instanceof y0) {
                ((y0) childAt).setSelectorColor(i3);
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

    public void setSearchPaddingStart(int i3) {
        this.o0 = i3;
        k0 k0Var = this.G;
        if (k0Var != null) {
            ((ViewGroup.MarginLayoutParams) k0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i3);
            this.G.setClipChildren(this.o0 != 0);
            k0 k0Var2 = this.G;
            k0Var2.setLayoutParams(k0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        gi.b2 b2Var = this.a0;
        if (b2Var == null) {
            return;
        }
        if (!z10) {
            b2Var.e = false;
            return;
        }
        b2Var.e = true;
        b2Var.b = System.currentTimeMillis();
        b2Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.g0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(n0 n0Var) {
        this.R = n0Var;
    }

    public void setSubMenuOpenSide(int i3) {
        this.N = i3;
    }

    public void setSubMenuOverlayProvider(m10 m10Var) {
        this.w0 = m10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.F;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.l0 = f10;
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.l0);
    }

    public void setupPopupRadialSelectors(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i3);
        }
    }

    public final void t(int i3) {
        View findViewWithTag;
        HashMap hashMap = this.z0;
        o0 o0Var = hashMap == null ? null : (o0) hashMap.get(Integer.valueOf(i3));
        if (o0Var != null) {
            o0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i3))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public boolean u() {
        return this.H;
    }

    public boolean v() {
        k0 k0Var = this.G;
        return k0Var != null && k0Var.getVisibility() == 0;
    }

    public boolean w() {
        k0 k0Var = this.G;
        return (k0Var == null || k0Var.getTag() == null) ? false : true;
    }

    public final boolean x() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.y;
        }
        f1 f1Var = this.d;
        return f1Var != null && f1Var.isShowing();
    }

    public final void y() {
        if (this.y0 == null) {
            return;
        }
        for (int i3 = 0; i3 < this.y0.size(); i3++) {
            o0 o0Var = (o0) this.y0.get(i3);
            o0Var.getClass();
            int i10 = 1;
            p();
            View view = o0Var.j;
            if (view != null) {
                this.b.addView(view);
            } else {
                int i11 = o0Var.a;
                int i12 = 2;
                if (i11 == 0) {
                    y0 y0Var = new y0(0, getContext(), this.n0, false, false);
                    y0Var.j(o0Var.e, o0Var.c, o0Var.d);
                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var.setTag(Integer.valueOf(o0Var.b));
                    this.b.addView(y0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
                    if (bd.a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var.setLayoutParams(layoutParams);
                    y0Var.setOnClickListener(new org.telegram.messenger.video.g(i12, o0Var, this));
                    Integer num = o0Var.n;
                    if (num != null && o0Var.o != null) {
                        y0Var.d(num.intValue(), o0Var.o.intValue());
                    }
                    o0Var.j = y0Var;
                } else if (i11 == 1) {
                    c1 c1Var = new c1(k6.H8, getContext(), this.n0);
                    c1Var.setTag(R.id.fit_width_tag, 1);
                    this.b.a(c1Var, mf.o(-1, 8));
                    o0Var.j = c1Var;
                } else if (i11 == 2) {
                    y0 y0Var2 = new y0(0, getContext(), this.n0, false, false);
                    y0Var2.j(o0Var.e, o0Var.c, o0Var.d);
                    y0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var2.setRightIcon(R.drawable.msg_arrowright);
                    y0Var2.getRightIcon().setVisibility(o0Var.m);
                    this.b.addView(y0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) y0Var2.getLayoutParams();
                    if (bd.a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var2.setLayoutParams(layoutParams2);
                    ah ahVar = o0Var.h;
                    if (ahVar != null) {
                        o0Var.g = (View) ahVar.run();
                        o0Var.h = null;
                    }
                    y0Var2.Q = new c0(this, this.b.b(o0Var.g), i10);
                    y0Var2.setOnClickListener(new d0(y0Var2, i10));
                    this.b.c = true;
                    Integer num2 = o0Var.n;
                    if (num2 != null && o0Var.o != null) {
                        y0Var2.d(num2.intValue(), o0Var.o.intValue());
                    }
                    o0Var.j = y0Var2;
                } else if (i11 == 3) {
                    s70 s70Var = new s70(getContext(), null);
                    s70Var.setTag(R.id.fit_width_tag, 1);
                    s70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    s70Var.setTextSize(1, o0Var.i);
                    r6.V(s70Var, k6.E8, null);
                    s70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    r6.H(s70Var, k6.J6, null);
                    s70Var.setText(o0Var.e);
                    s70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.b.a(s70Var, mf.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    o0Var.j = s70Var;
                }
            }
            View view2 = o0Var.j;
            if (view2 != null) {
                view2.setVisibility(o0Var.l);
                yg ygVar = o0Var.k;
                if (ygVar != null) {
                    o0Var.j.setOnClickListener(ygVar);
                }
            }
        }
        this.y0.clear();
    }

    public final o0 z(int i3, int i10, String str) {
        o0 o0Var = new o0(0);
        o0Var.b = i3;
        o0Var.c = i10;
        o0Var.d = null;
        o0Var.e = str;
        o0Var.f = true;
        G(o0Var);
        return o0Var;
    }

    public q0(Context context, x xVar, int i3) {
        this(context, xVar, 0, i3, false, null);
    }

    public q0(Context context, x xVar, int i3, int i10, boolean z10, e6 e6Var) {
        super(context);
        new ArrayList();
        this.S = true;
        this.W = true;
        this.e0 = true;
        this.g0 = true;
        this.h0 = new ArrayList();
        this.i0 = -1;
        this.j0 = new g2.g((int[]) null);
        this.n0 = e6Var;
        if (i3 != 0) {
            setBackgroundDrawable(k6.h0(i3, z10 ? 5 : 1, -1));
        }
        this.c = xVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.F = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i10 != 0) {
                textView.setTextColor(i10);
            }
            addView(textView, mf.c(-1.0f, -2));
            return;
        }
        fh0 fh0Var = new fh0(context);
        this.y = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.setImportantForAccessibility(2);
        addView(fh0Var, mf.c(-1.0f, -1));
        if (i10 != 0) {
            fh0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i3) {
        fh0 fh0Var = this.y;
        if (fh0Var == null) {
            return;
        }
        this.E = i3;
        fh0Var.setImageResource(i3);
    }
}
