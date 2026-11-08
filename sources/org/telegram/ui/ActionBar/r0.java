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
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;
import org.telegram.ui.ch;
import org.telegram.ui.eh;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class r0 extends FrameLayout {
    public int D;
    public final TextView E;
    public l0 F;
    public boolean G;
    public n0 H;
    public Rect I;
    public int[] J;
    public View K;
    public bi.k1 L;
    public int M;
    public int N;
    public int O;
    public m0 P;
    public o0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public fi.c2 W;
    public FrameLayout a;
    public int a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final y c;
    public boolean c0;
    public g1 d;
    public boolean d0;
    public ah.i e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public TextView h;
    public int h0;
    public final h2.f i0;
    public float j0;
    public float k0;
    public View l0;
    public final f6 m0;
    public CharSequence n;
    public int n0;
    public View.OnClickListener o0;
    public boolean p0;
    public boolean q0;
    public CharSequence r;
    public PorterDuffColorFilter r0;
    public f0 s;
    public int s0;
    public dh.c t0;
    public gh.e u0;
    public u10 v0;
    public AnimatorSet w;
    public AnimatorSet w0;
    public View x;
    public ArrayList x0;
    public final ch0 y;
    public HashMap y0;

    public r0(Context context, int i7, int i10) {
        this(context, null, i7, i10, true, null);
    }

    public static z0 c(boolean z9, boolean z10, ViewGroup viewGroup, int i7, CharSequence charSequence, boolean z11, f6 f6Var) {
        z0 z0Var = new z0(z11 ? 1 : 0, viewGroup.getContext(), f6Var, z9, z10);
        z0Var.j(charSequence, i7, null);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (id.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        return z0Var;
    }

    private i5 getShownSubMenuOverlay() {
        s4 subMenuOverlayHost = getSubMenuOverlayHost();
        i5 openMenuOverlay = subMenuOverlayHost != null ? subMenuOverlayHost.getOpenMenuOverlay() : null;
        if (openMenuOverlay != null && openMenuOverlay.e == this && (openMenuOverlay.y || openMenuOverlay.M)) {
            return openMenuOverlay;
        }
        return null;
    }

    public final void A(zg0 zg0Var, String str) {
        p0 p0Var = new p0(0);
        p0Var.b = 29;
        p0Var.c = 0;
        p0Var.d = zg0Var;
        p0Var.e = str;
        p0Var.f = true;
        G(p0Var);
    }

    public final p0 B(eh ehVar) {
        p0 p0Var = new p0(2);
        p0Var.c = R.drawable.msg_mute;
        p0Var.d = null;
        p0Var.e = null;
        p0Var.g = null;
        p0Var.h = ehVar;
        G(p0Var);
        return p0Var;
    }

    public final p0 C() {
        p0 p0Var = new p0(3);
        p0Var.e = "";
        p0Var.i = 13;
        G(p0Var);
        return p0Var;
    }

    public final void D() {
        ArrayList arrayList = this.g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        l0 l0Var = this.F;
        if (l0Var != null && l0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new i0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.g);
            transitionSet.addListener((Transition.TransitionListener) new j0(0, this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i7 = 0;
            while (i7 < this.f.getChildCount()) {
                if (!arrayList2.remove(((q0) this.f.getChildAt(i7)).getFilter())) {
                    this.f.removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            q0 q0Var = new q0(getContext(), this.m0);
            q0Var.setData(o0Var);
            q0Var.setOnClickListener(new bi.r(25, this, q0Var));
            this.f.addView(q0Var, ha.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i11 = 0;
            while (i11 < this.f.getChildCount()) {
                ((q0) this.f.getChildAt(i11)).setExpanded(i11 == this.h0);
                i11++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new k0(this, x10));
        }
        j();
    }

    public void E() {
        n0 n0Var = this.H;
        if (n0Var != null) {
            n0Var.k(this.e);
        }
    }

    public void F(boolean z9) {
        y yVar;
        k();
        l0 l0Var = this.F;
        if (l0Var == null || l0Var.getVisibility() == 0 || (yVar = this.c) == null) {
            return;
        }
        yVar.b.y(T(z9));
    }

    public final p0 G(p0 p0Var) {
        if (this.x0 == null) {
            this.x0 = new ArrayList();
        }
        this.x0.add(p0Var);
        if (this.y0 == null) {
            this.y0 = new HashMap();
        }
        this.y0.put(Integer.valueOf(p0Var.b), p0Var);
        return p0Var;
    }

    public final void H(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i7) {
            return;
        }
        this.b.setBackgroundColor(i7);
        g1 g1Var = this.d;
        if (g1Var == null || !g1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void I(jg.o0 o0Var) {
        if (o0Var.h) {
            this.g0.remove(o0Var);
            int i7 = this.h0;
            if (i7 < 0 || i7 > r0.size() - 1) {
                this.h0 = r0.size() - 1;
            }
            D();
            this.e.m();
        }
    }

    public r0 J(n0 n0Var) {
        this.H = n0Var;
        return this;
    }

    public final void K() {
        this.R = false;
    }

    public final void L(dh.c cVar, gh.e eVar) {
        this.t0 = cVar;
        this.u0 = eVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || cVar == null) {
            return;
        }
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(12.0f));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
    }

    public r0 M() {
        return N();
    }

    public r0 N() {
        if (this.c == null) {
            return this;
        }
        this.G = true;
        return this;
    }

    public final void O(int i7, boolean z9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = c61Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c61Var.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i7);
            } else if (childAt instanceof z0) {
                if (z9) {
                    ((z0) childAt).setIconColor(i7);
                } else {
                    ((z0) childAt).setTextColor(i7);
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z9) {
        this.r = charSequence;
        if (this.h == null) {
            return;
        }
        this.d0 = z9;
        this.e.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.e.setSelection(charSequence.length());
    }

    public final void Q(int i7, boolean z9) {
        if (z9) {
            S(i7);
        } else {
            t(i7);
        }
    }

    public final void R(int i7) {
        S(i7);
    }

    public final void S(int i7) {
        View findViewWithTag;
        HashMap hashMap = this.y0;
        p0 p0Var = hashMap == null ? null : (p0) hashMap.get(Integer.valueOf(i7));
        if (p0Var != null) {
            p0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        org.telegram.messenger.camera.q.l(findViewWithTag.animate().alpha(1.0f), xq.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public boolean T(boolean z9) {
        y yVar;
        ch0 iconView;
        Animator e10;
        k();
        n0 n0Var = this.H;
        if (this.F == null || !(n0Var == null || n0Var.c())) {
            return false;
        }
        n0 n0Var2 = this.H;
        if (n0Var2 != null && (e10 = n0Var2.e()) != null) {
            e10.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            yVar = this.c;
            if (i7 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i7);
            if ((childAt instanceof r0) && (iconView = ((r0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i7++;
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
            l0 l0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(l0Var, (Property<l0, Float>) property, l0Var.getAlpha(), 1.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), (Property<View, Float>) property, ((View) arrayList.get(i10)).getAlpha(), 0.0f));
            }
            this.w0.setDuration(150L);
            this.w0.addListener(new h0(this, arrayList, 1));
            this.w0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z9) {
                org.telegram.messenger.g0.K3(this.e);
            }
            this.F.setTag(1);
            n0 n0Var3 = this.H;
            if (n0Var3 != null) {
                n0Var3.i();
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
        l0 l0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(l0Var2, (Property<l0, Float>) property, l0Var2.getAlpha(), 0.0f));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((View) arrayList.get(i11)).setAlpha(0.0f);
            this.w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), (Property<View, Float>) property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
        }
        this.w0.setDuration(150L);
        this.w0.addListener(new h0(this, arrayList, 0));
        this.w0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty() && this.H != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((jg.o0) arrayList2.get(i12)).h) {
                    this.H.j((jg.o0) arrayList2.get(i12));
                }
            }
        }
        n0 n0Var4 = this.H;
        if (n0Var4 != null) {
            n0Var4.h();
        }
        if (z9) {
            org.telegram.messenger.g0.v1(this.e);
        }
        yVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.view.ViewGroup, android.widget.LinearLayout, fi.a5] */
    public final void U(View view, r0 r0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        g1 g1Var;
        boolean z9;
        int i7 = 1;
        if (view == null) {
            s4 subMenuOverlayHost = getSubMenuOverlayHost();
            final i5 subMenuOverlay = subMenuOverlayHost != null ? getSubMenuOverlay() : null;
            if (subMenuOverlay != null && ((g1Var = this.d) == null || !g1Var.isShowing())) {
                y();
                if (s() && i()) {
                    if (subMenuOverlay.e == this && (((z9 = subMenuOverlay.y) || subMenuOverlay.M) && z9)) {
                        subMenuOverlay.a(true);
                        return;
                    }
                    this.T = false;
                    o0 o0Var = this.Q;
                    if (o0Var != null) {
                        o0Var.n();
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
                    subMenuOverlay.i(popupLayout, org.telegram.messenger.g0.L(5.0f));
                    popupLayout.setTranslationX(0.0f);
                    popupLayout.setTranslationY(0.0f);
                    popupLayout.setAlpha(1.0f);
                    r6.d0(popupLayout, false);
                    k60.U(popupLayout, k6.r1(0.06f, k6.w0(k6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                    popupLayout.f();
                    ve0 swipeBack = popupLayout.getSwipeBack();
                    if (swipeBack != null) {
                        swipeBack.b(false);
                        swipeBack.setForegroundOnGlass(true);
                        if (subMenuOverlay.b != swipeBack) {
                            subMenuOverlay.b = swipeBack;
                            swipeBack.y.add(new ue0() { // from class: org.telegram.ui.ActionBar.g5
                                @Override // org.telegram.ui.Components.ue0
                                public final void a(float f10, float f11) {
                                    i5.this.invalidate();
                                }
                            });
                        }
                        for (int i10 = 1; i10 < swipeBack.getChildCount(); i10++) {
                            if (swipeBack.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i10);
                                subMenuOverlay.i(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                                r6.d0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                                k60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, k6.r1(0.06f, k6.w0(k6.E8, subMenuOverlay.d.getMenuResourcesProvider())));
                            }
                        }
                    }
                    ScrollView scrollView = popupLayout.K;
                    if (scrollView != null) {
                        scrollView.scrollTo(0, 0);
                    }
                    if (popupLayout.getParent() != subMenuOverlay) {
                        org.telegram.messenger.g0.E2(popupLayout);
                        subMenuOverlay.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                    }
                    fh.g gVar = subMenuOverlay.h;
                    if (gVar == null || subMenuOverlay.n != subMenuOverlayHost) {
                        if (gVar != null) {
                            gVar.a.setEmpty();
                            subMenuOverlay.h.setBounds(0, 0, 0, 0);
                        }
                        fh.g gVar2 = (fh.g) weakHashMap.get(subMenuOverlayHost);
                        subMenuOverlay.h = gVar2;
                        if (gVar2 == null) {
                            fh.g c10 = subMenuOverlayHost.c(subMenuOverlay);
                            subMenuOverlay.h = c10;
                            if (c10 != null) {
                                c10.p(subMenuOverlay.c);
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
                    subMenuOverlay.g();
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
        g1 g1Var2 = this.d;
        if (g1Var2 == null || !g1Var2.isShowing()) {
            y();
        }
        if (this.b != null) {
            y yVar = this.c;
            if (yVar == null || !yVar.c || (kVar = yVar.b) == null || kVar.v()) {
                bi.k1 k1Var = this.L;
                if (k1Var != null) {
                    org.telegram.messenger.g0.r(k1Var);
                    this.L = null;
                }
                g1 g1Var3 = this.d;
                if (g1Var3 != null && g1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.l0 = r0Var;
                o0 o0Var2 = this.Q;
                if (o0Var2 != null) {
                    o0Var2.n();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = this.b;
                if (view != null) {
                    ?? a5Var = new fi.a5(this, getContext(), view);
                    a5Var.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.w ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof z0) || (view instanceof LinearLayout)) {
                        dh.c cVar = this.t0;
                        if (cVar != null) {
                            fh.g c11 = cVar.c(this.b, null, true);
                            c11.p(this.u0);
                            org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c11.Q.e = true;
                            frameLayout.setBackground(c11);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, ha.c(-2.0f, -1));
                    a5Var.addView(frameLayout, ha.o(-1, -2));
                    a5Var.addView(this.b, ha.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    r6 = frameLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                }
                if (this.t0 != null) {
                    k60.U(this.b, k6.r1(0.06f, k6.w0(k6.E8, this.m0)));
                }
                g1 g1Var4 = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = g1Var4;
                if (this.V) {
                    g1Var4.setAnimationStyle(0);
                } else {
                    g1Var4.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z10 = this.V;
                if (!z10) {
                    this.d.b = z10;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.U) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.c0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                        g1 g1Var5;
                        r0 r0Var2 = r0.this;
                        r0Var2.getClass();
                        if (i11 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (g1Var5 = r0Var2.d) == null || !g1Var5.isShowing()) {
                            return false;
                        }
                        r0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new fi.p4(i7, this));
                Point point = org.telegram.messenger.g0.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                if (r6 != null && r6.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    r6.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                W(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                this.b.f();
                if (this.b.getSwipeBack() != null) {
                    this.b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.j0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void V() {
        if (this.f != null) {
            for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                if (this.f.getChildAt(i7) instanceof q0) {
                    ((q0) this.f.getChildAt(i7)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        f6 f6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                if (this.b.L.getChildAt(i10) instanceof z0) {
                    ((z0) this.b.L.getChildAt(i10)).setSelectorColor(k6.w0(k6.I5, f6Var));
                }
            }
        }
        ah.i iVar = this.e;
        if (iVar != null) {
            int i11 = k6.C8;
            r6.m(iVar, 30, i11, f6Var);
            r6.E(this.e, k6.D8, f6Var);
            r6.V(this.e, i11, f6Var);
            r6.D(this.e, k6.ig, f6Var);
            r6.z(this.e, k6.jg, f6Var);
        }
    }

    public final void W(boolean z9, boolean z10) {
        int i7;
        int i10;
        ScrollView scrollView;
        y yVar = this.c;
        if (yVar != null) {
            i10 = yVar.getTop() + (-yVar.b.getMeasuredHeight());
            i7 = yVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            i7 = -((int) ((getMeasuredHeight() * scaleY) - ((this.M != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i10 = this.a0;
        }
        int i11 = i7 + i10 + this.N;
        if (z9 && (scrollView = this.b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.l0;
        if (view == null) {
            view = this;
        }
        if (yVar != null) {
            k kVar = yVar.b;
            if (this.M == 0) {
                if (z9) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i11);
                }
                if (z10) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z9) {
                if (this.e0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11);
                }
            }
            if (z10) {
                this.d.update(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11, -1, -1);
                return;
            }
            return;
        }
        int i12 = this.M;
        if (i12 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z9) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i11);
                }
                if (z10) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i11, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (z9) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.b0 + this.O, i11);
            }
            if (z10) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.b0 + this.O, i11, -1, -1);
                return;
            }
            return;
        }
        if (z9) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i11);
        }
        if (z10) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.b0 + this.O, i11, -1, -1);
        }
    }

    public final d1 a(int i7) {
        p();
        d1 d1Var = new d1(k6.H8, getContext(), this.m0);
        if (i7 != -1) {
            d1Var.setTag(Integer.valueOf(i7));
        }
        d1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(d1Var, ha.o(-1, 8));
        return d1Var;
    }

    public final TextView b(int i7) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i7);
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

    public final z0 d(int i7, int i10, Drawable drawable, CharSequence charSequence, boolean z9, boolean z10, f6 f6Var) {
        p();
        z0 z0Var = new z0(z10 ? 1 : 0, getContext(), f6Var, false, false);
        z0Var.j(charSequence, i10, drawable);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setTag(Integer.valueOf(i7));
        this.b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (id.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.setOnClickListener(new di.a2(2, this, z9));
        return z0Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final z0 e(int i7, int i10, CharSequence charSequence) {
        return d(i7, i10, null, charSequence, true, false, this.m0);
    }

    public final void f(int i7, String str) {
        p();
        TextView textView = new TextView(getContext());
        r6.V(textView, k6.E8, this.m0);
        textView.setBackgroundDrawable(k6.N0(false));
        if (id.a0) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
        textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(org.telegram.messenger.g0.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i7));
        textView.setText(str);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (id.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new z(this, 3));
    }

    public final void g(org.telegram.ui.Cells.k kVar, int i7) {
        p();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i7));
        this.b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new z(this, 1));
        kVar.setBackgroundDrawable(k6.N0(false));
    }

    public View getContentView() {
        ch0 ch0Var = this.y;
        return ch0Var != null ? ch0Var : this.E;
    }

    public ch0 getIconView() {
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

    public i5 getSubMenuOverlay() {
        u10 u10Var = this.v0;
        if (u10Var != null) {
            return (i5) u10Var.run();
        }
        return null;
    }

    public s4 getSubMenuOverlayHost() {
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
        int i7 = 0;
        for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
            View childAt = this.b.L.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    public final z0 h(int i7, a01 a01Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        z0 z0Var = new z0(0, getContext(), this.m0, false, false);
        z0Var.j(str, i7, a01Var);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (id.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        int i10 = 0;
        z0Var.P = new d0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), i10);
        z0Var.setOnClickListener(new e0(z0Var, i10));
        this.b.c = true;
        return z0Var;
    }

    public boolean i() {
        k kVar;
        y yVar = this.c;
        return yVar == null || !yVar.c || (kVar = yVar.b) == null || kVar.v();
    }

    public final void j() {
        n0 n0Var;
        TextView textView;
        n0 n0Var2;
        if (this.s != null) {
            boolean r10 = r();
            final int i7 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i10 = 1;
            if (!r10 && TextUtils.isEmpty(this.e.getText()) && (((n0Var = this.H) == null || !n0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((n0Var2 = this.H) != null && !n0Var2.m())))) {
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
                        public final /* synthetic */ r0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    r0 r0Var = this.b;
                                    r0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = r0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var2 = this.b;
                                    r0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = r0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new g0(this, 0));
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
                        public final /* synthetic */ r0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    r0 r0Var = this.b;
                                    r0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = r0Var.x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var2 = this.b;
                                    r0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = r0Var2.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<f0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new g0(this, 1));
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
            int i7 = 0;
            l0 l0Var = new l0(0, getContext(), this);
            this.F = l0Var;
            int i10 = 1;
            l0Var.setClipChildren(this.n0 != 0);
            this.a = null;
            l0 l0Var2 = this.F;
            LinearLayout.LayoutParams m10 = ha.m(1.0f, 0, -1, this.n0 + 6, 0, 0);
            y yVar = this.c;
            yVar.addView(l0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = k6.C8;
            f6 f6Var = this.m0;
            r6.V(textView2, i11, f6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            int i12 = 3;
            this.h.setGravity(id.a0 ? 5 : 3);
            ah.i iVar = new ah.i(i12, getContext(), this);
            this.e = iVar;
            iVar.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            r6.w(this.e, i11, f6Var);
            this.e.setTextSize(1, 18.0f);
            r6.E(this.e, k6.D8, f6Var);
            r6.V(this.e, i11, f6Var);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            this.e.setOnEditorActionListener(new bi.p(this, i12));
            this.e.addTextChangedListener(new ah.j(this, 12));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            r6.D(this.e, k6.ig, f6Var);
            r6.z(this.e, k6.jg, f6Var);
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
            if (id.a0) {
                this.F.addView(this.f, ha.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, ha.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, ha.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.h, ha.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, ha.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f, ha.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            f0 f0Var = new f0(0, getContext(), this);
            this.s = f0Var;
            fi.c2 c2Var = new fi.c2(i10, this);
            this.W = c2Var;
            f0Var.setImageDrawable(c2Var);
            this.s.setBackground(k6.h0(yVar.b.q0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new z(this, i7));
            this.s.setContentDescription(id.M0(2131752099, null));
            this.F.addView(this.s, ha.e(48, -1, 21));
        }
    }

    public final void l() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.b.getItemsCount()) {
                i7 = 8;
                break;
            } else if (this.b.L.getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i7 != getVisibility()) {
            setVisibility(i7);
        }
    }

    public final void m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i7 >= arrayList.size()) {
                D();
                return;
            }
            if (((jg.o0) arrayList.get(i7)).h) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public void n() {
        this.r = null;
        ah.i iVar = this.e;
        if (iVar == null) {
            return;
        }
        iVar.setText("");
    }

    public final void o() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var == null || !g1Var.isShowing()) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            W(false, true);
        }
        n0 n0Var = this.H;
        if (n0Var != null) {
            n0Var.g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bi.k1 k1Var;
        int i7;
        bi.k1 k1Var2;
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        boolean z9 = shownSubMenuOverlay != null && shownSubMenuOverlay.y;
        boolean z10 = getSubMenuOverlayHost() != null;
        g1 g1Var = this.d;
        boolean z11 = g1Var != null && g1Var.isShowing();
        if (motionEvent.getActionMasked() == 0) {
            this.q0 = false;
            if ((this.c0 || z10) && s() && !z11 && !z9) {
                bi.k1 k1Var3 = this.L;
                if (k1Var3 != null) {
                    org.telegram.messenger.g0.r(k1Var3);
                    this.L = null;
                }
                bi.k1 k1Var4 = new bi.k1(18, this, z10);
                this.L = k1Var4;
                org.telegram.messenger.g0.i3(k1Var4, z10 ? ViewConfiguration.getLongPressTimeout() : 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.L != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (k1Var2 = this.L) != null) {
                    org.telegram.messenger.g0.r(k1Var2);
                    this.L = null;
                }
            }
            if (!this.f0 || z10 || !s() || z11) {
                if ((this.f0 || this.q0) && (z11 || z9)) {
                    getLocationOnScreen(this.J);
                    float x10 = motionEvent.getX() + this.J[0];
                    float y10 = motionEvent.getY() + this.J[1];
                    this.K = null;
                    for (0; i7 < this.b.getItemsCount(); i7 + 1) {
                        View childAt = this.b.L.getChildAt(i7);
                        Object tag = childAt.getTag();
                        if (tag instanceof Integer) {
                            i7 = ((Integer) tag).intValue() >= 100 ? i7 + 1 : 0;
                            ((View) childAt.getParent()).getLocationOnScreen(this.J);
                            int[] iArr = this.J;
                            float f11 = x10 - iArr[0];
                            float f12 = y10 - iArr[1];
                            childAt.getHitRect(this.I);
                            if (childAt.getVisibility() == 0 || !this.I.contains((int) f11, (int) f12)) {
                                childAt.setPressed(false);
                                childAt.setSelected(false);
                            } else {
                                childAt.setPressed(true);
                                childAt.setSelected(true);
                                childAt.drawableHotspotChanged(f11 - childAt.getLeft(), f12 - childAt.getTop());
                                this.K = childAt;
                            }
                        } else {
                            if (!childAt.hasOnClickListeners()) {
                            }
                            ((View) childAt.getParent()).getLocationOnScreen(this.J);
                            int[] iArr2 = this.J;
                            float f112 = x10 - iArr2[0];
                            float f122 = y10 - iArr2[1];
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
        } else if (motionEvent.getActionMasked() == 1 && (z11 || z9)) {
            bi.k1 k1Var5 = this.L;
            if (k1Var5 != null) {
                org.telegram.messenger.g0.r(k1Var5);
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
                        m0 m0Var = this.P;
                        if (m0Var != null) {
                            m0Var.i(((Integer) tag2).intValue());
                        }
                    }
                    if (z9) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        g1 g1Var2 = this.d;
                        if (g1Var2 != null) {
                            g1Var2.d(this.R);
                        }
                    }
                } else {
                    view2.performClick();
                }
            } else if (this.f0 && !z9) {
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
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (k1Var = this.L) != null) {
                org.telegram.messenger.g0.r(k1Var);
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
        dh.c cVar = this.t0;
        if (cVar != null) {
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.p(this.u0);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.b.setOnTouchListener(new fi.n4(1, this));
        this.b.setDispatchKeyEventListener(new l2.y(this, 26));
    }

    public final void q() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.d(this.R);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
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

    public void setAdditionalXOffset(int i7) {
        this.b0 = i7;
    }

    public void setAdditionalYOffset(int i7) {
        this.a0 = i7;
    }

    public void setDelegate(m0 m0Var) {
        this.P = m0Var;
    }

    public void setDimMenu(float f10) {
        this.j0 = f10;
    }

    public void setFitSubItems(boolean z9) {
        this.b.setFitItems(z9);
    }

    public void setFixBackground(boolean z9) {
        this.p0 = z9;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z9) {
        this.e0 = z9;
    }

    public void setIcon(Drawable drawable) {
        ch0 ch0Var = this.y;
        if (ch0Var == null) {
            return;
        }
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        this.D = 0;
    }

    public void setIconColor(int i7) {
        if (this.r0 == null || this.s0 != i7) {
            this.r0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            this.s0 = i7;
        }
        ch0 ch0Var = this.y;
        if (ch0Var != null) {
            ColorFilter colorFilter = ch0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.r0;
            if (colorFilter != porterDuffColorFilter) {
                ch0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        f0 f0Var = this.s;
        if (f0Var != null) {
            ColorFilter colorFilter2 = f0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.r0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z9) {
        this.U = z9;
    }

    public void setLongClickEnabled(boolean z9) {
        this.c0 = z9;
    }

    public void setMenuXOffset(int i7) {
        this.O = i7;
    }

    public void setMenuYOffset(int i7) {
        this.N = i7;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.o0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final c20 c20Var) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.a0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    c20 c20Var2 = c20Var;
                    if (c20Var2 != null) {
                        c20Var2.a(Boolean.valueOf(r0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z9) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.b = z9;
        }
        this.V = z9;
    }

    public void setPopupItemsSelectorColor(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = c61Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c61Var.getChildAt(i10);
            if (childAt instanceof z0) {
                ((z0) childAt).setSelectorColor(i7);
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

    public void setSearchPaddingStart(int i7) {
        this.n0 = i7;
        l0 l0Var = this.F;
        if (l0Var != null) {
            ((ViewGroup.MarginLayoutParams) l0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i7);
            this.F.setClipChildren(this.n0 != 0);
            l0 l0Var2 = this.F;
            l0Var2.setLayoutParams(l0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z9) {
        fi.c2 c2Var = this.W;
        if (c2Var == null) {
            return;
        }
        if (!z9) {
            c2Var.e = false;
            return;
        }
        c2Var.e = true;
        c2Var.b = System.currentTimeMillis();
        c2Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z9) {
        this.f0 = z9;
    }

    public void setShowedFromBottom(boolean z9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z9);
    }

    public void setSubMenuDelegate(o0 o0Var) {
        this.Q = o0Var;
    }

    public void setSubMenuOpenSide(int i7) {
        this.M = i7;
    }

    public void setSubMenuOverlayProvider(u10 u10Var) {
        this.v0 = u10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.k0 = f10;
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.k0);
    }

    public void setupPopupRadialSelectors(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i7);
        }
    }

    public final void t(int i7) {
        View findViewWithTag;
        HashMap hashMap = this.y0;
        p0 p0Var = hashMap == null ? null : (p0) hashMap.get(Integer.valueOf(i7));
        if (p0Var != null) {
            p0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public boolean u() {
        return this.G;
    }

    public boolean v() {
        l0 l0Var = this.F;
        return l0Var != null && l0Var.getVisibility() == 0;
    }

    public boolean w() {
        l0 l0Var = this.F;
        return (l0Var == null || l0Var.getTag() == null) ? false : true;
    }

    public final boolean x() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.y;
        }
        g1 g1Var = this.d;
        return g1Var != null && g1Var.isShowing();
    }

    public final void y() {
        if (this.x0 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.x0.size(); i7++) {
            p0 p0Var = (p0) this.x0.get(i7);
            p0Var.getClass();
            int i10 = 1;
            p();
            View view = p0Var.j;
            if (view != null) {
                this.b.addView(view);
            } else {
                int i11 = p0Var.a;
                if (i11 == 0) {
                    z0 z0Var = new z0(0, getContext(), this.m0, false, false);
                    z0Var.j(p0Var.e, p0Var.c, p0Var.d);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var.setTag(Integer.valueOf(p0Var.b));
                    this.b.addView(z0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
                    if (id.a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var.setLayoutParams(layoutParams);
                    z0Var.setOnClickListener(new bi.r(26, p0Var, this));
                    Integer num = p0Var.n;
                    if (num != null && p0Var.o != null) {
                        z0Var.d(num.intValue(), p0Var.o.intValue());
                    }
                    p0Var.j = z0Var;
                } else if (i11 == 1) {
                    d1 d1Var = new d1(k6.H8, getContext(), this.m0);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    this.b.a(d1Var, ha.o(-1, 8));
                    p0Var.j = d1Var;
                } else if (i11 == 2) {
                    z0 z0Var2 = new z0(0, getContext(), this.m0, false, false);
                    z0Var2.j(p0Var.e, p0Var.c, p0Var.d);
                    z0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var2.setRightIcon(R.drawable.msg_arrowright);
                    z0Var2.getRightIcon().setVisibility(p0Var.m);
                    this.b.addView(z0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) z0Var2.getLayoutParams();
                    if (id.a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var2.setLayoutParams(layoutParams2);
                    eh ehVar = p0Var.h;
                    if (ehVar != null) {
                        p0Var.g = (View) ehVar.run();
                        p0Var.h = null;
                    }
                    z0Var2.P = new d0(this, this.b.b(p0Var.g), i10);
                    z0Var2.setOnClickListener(new e0(z0Var2, i10));
                    this.b.c = true;
                    Integer num2 = p0Var.n;
                    if (num2 != null && p0Var.o != null) {
                        z0Var2.d(num2.intValue(), p0Var.o.intValue());
                    }
                    p0Var.j = z0Var2;
                } else if (i11 == 3) {
                    w70 w70Var = new w70(getContext(), null);
                    w70Var.setTag(R.id.fit_width_tag, 1);
                    w70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    w70Var.setTextSize(1, p0Var.i);
                    r6.V(w70Var, k6.E8, null);
                    w70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    r6.H(w70Var, k6.J6, null);
                    w70Var.setText(p0Var.e);
                    w70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.b.a(w70Var, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    p0Var.j = w70Var;
                }
            }
            View view2 = p0Var.j;
            if (view2 != null) {
                view2.setVisibility(p0Var.l);
                ch chVar = p0Var.k;
                if (chVar != null) {
                    p0Var.j.setOnClickListener(chVar);
                }
            }
        }
        this.x0.clear();
    }

    public final p0 z(int i7, int i10, String str) {
        p0 p0Var = new p0(0);
        p0Var.b = i7;
        p0Var.c = i10;
        p0Var.d = null;
        p0Var.e = str;
        p0Var.f = true;
        G(p0Var);
        return p0Var;
    }

    public r0(Context context, y yVar, int i7) {
        this(context, yVar, 0, i7, false, null);
    }

    public r0(Context context, y yVar, int i7, int i10, boolean z9, f6 f6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = -1;
        this.i0 = new h2.f((int[]) null);
        this.m0 = f6Var;
        if (i7 != 0) {
            setBackgroundDrawable(k6.h0(i7, z9 ? 5 : 1, -1));
        }
        this.c = yVar;
        if (z9) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i10 != 0) {
                textView.setTextColor(i10);
            }
            addView(textView, ha.c(-1.0f, -2));
            return;
        }
        ch0 ch0Var = new ch0(context);
        this.y = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.setImportantForAccessibility(2);
        addView(ch0Var, ha.c(-1.0f, -1));
        if (i10 != 0) {
            ch0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i7) {
        ch0 ch0Var = this.y;
        if (ch0Var == null) {
            return;
        }
        this.D = i7;
        ch0Var.setImageResource(i7);
    }
}
