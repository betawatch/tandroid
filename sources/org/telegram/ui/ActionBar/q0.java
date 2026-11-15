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
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.r10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout {
    public int E;
    public final TextView F;
    public ai.k0 G;
    public boolean H;
    public m0 I;
    public Rect J;
    public int[] K;
    public View L;
    public ai.q M;
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
    public hi.b2 a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final y c;
    public int c0;
    public g1 d;
    public boolean d0;
    public ah.i e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public final ArrayList h0;
    public int i0;
    public final h2.f j0;
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
    public f0 s;
    public PorterDuffColorFilter s0;
    public int t0;
    public dh.c u0;
    public gh.e v0;
    public AnimatorSet w;
    public r10 w0;
    public View x;
    public AnimatorSet x0;
    public final fh0 y;
    public ArrayList y0;
    public HashMap z0;

    public q0(Context context, int i7, int i10) {
        this(context, null, i7, i10, true, null);
    }

    public static z0 c(boolean z10, boolean z11, ViewGroup viewGroup, int i7, CharSequence charSequence, boolean z12, e6 e6Var) {
        z0 z0Var = new z0(z12 ? 1 : 0, viewGroup.getContext(), e6Var, z10, z11);
        z0Var.j(charSequence, i7, null);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        return z0Var;
    }

    private g5 getShownSubMenuOverlay() {
        q4 subMenuOverlayHost = getSubMenuOverlayHost();
        g5 openMenuOverlay = subMenuOverlayHost != null ? subMenuOverlayHost.getOpenMenuOverlay() : null;
        if (openMenuOverlay != null && openMenuOverlay.e == this && (openMenuOverlay.E || openMenuOverlay.O)) {
            return openMenuOverlay;
        }
        return null;
    }

    public final o0 A(int i7, int i10, String str) {
        o0 o0Var = new o0(0);
        o0Var.b = i7;
        o0Var.c = i10;
        o0Var.d = null;
        o0Var.e = str;
        o0Var.f = true;
        H(o0Var);
        return o0Var;
    }

    public final void B(ch0 ch0Var, String str) {
        o0 o0Var = new o0(0);
        o0Var.b = 29;
        o0Var.c = 0;
        o0Var.d = ch0Var;
        o0Var.e = str;
        o0Var.f = true;
        H(o0Var);
    }

    public final o0 C(eh ehVar) {
        o0 o0Var = new o0(2);
        o0Var.c = R.drawable.msg_mute;
        o0Var.d = null;
        o0Var.e = null;
        o0Var.g = null;
        o0Var.h = ehVar;
        H(o0Var);
        return o0Var;
    }

    public final o0 D() {
        o0 o0Var = new o0(3);
        o0Var.e = "";
        o0Var.i = 13;
        H(o0Var);
        return o0Var;
    }

    public final void E() {
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        ai.k0 k0Var = this.G;
        if (k0Var != null && k0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new i0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) er.g);
            transitionSet.addListener((Transition.TransitionListener) new j0(0, this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i7 = 0;
            while (i7 < this.f.getChildCount()) {
                if (!arrayList2.remove(((p0) this.f.getChildAt(i7)).getFilter())) {
                    this.f.removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            p0 p0Var = new p0(getContext(), this.n0);
            p0Var.setData(o0Var);
            p0Var.setOnClickListener(new org.telegram.messenger.video.e(2, this, p0Var));
            this.f.addView(p0Var, ja.t(-2, -1, 0, 0, 0, 6, 0));
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
            this.e.getViewTreeObserver().addOnPreDrawListener(new k0(this, x10));
        }
        k();
    }

    public void F() {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.k(this.e);
        }
    }

    public void G(boolean z10) {
        y yVar;
        l();
        ai.k0 k0Var = this.G;
        if (k0Var == null || k0Var.getVisibility() == 0 || (yVar = this.c) == null) {
            return;
        }
        yVar.b.A(U(z10));
    }

    public final o0 H(o0 o0Var) {
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

    public final void I(int i7) {
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

    public final void J(jg.o0 o0Var) {
        if (o0Var.h) {
            this.h0.remove(o0Var);
            int i7 = this.i0;
            if (i7 < 0 || i7 > r0.size() - 1) {
                this.i0 = r0.size() - 1;
            }
            E();
            this.e.m();
        }
    }

    public q0 K(m0 m0Var) {
        this.I = m0Var;
        return this;
    }

    public final void L() {
        this.S = false;
    }

    public final void M(dh.c cVar, gh.e eVar) {
        this.u0 = cVar;
        this.v0 = eVar;
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

    public q0 N() {
        return O();
    }

    public q0 O() {
        if (this.c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void P(int i7, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        z51 z51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
        int childCount = z51Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = z51Var.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i7);
            } else if (childAt instanceof z0) {
                if (z10) {
                    ((z0) childAt).setIconColor(i7);
                } else {
                    ((z0) childAt).setTextColor(i7);
                }
            }
        }
    }

    public void Q(CharSequence charSequence, boolean z10) {
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

    public final void R(int i7, boolean z10) {
        if (z10) {
            T(i7);
        } else {
            u(i7);
        }
    }

    public final void S(int i7) {
        T(i7);
    }

    public final void T(int i7) {
        View findViewWithTag;
        HashMap hashMap = this.z0;
        o0 o0Var = hashMap == null ? null : (o0) hashMap.get(Integer.valueOf(i7));
        if (o0Var != null) {
            o0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        i20.n(findViewWithTag.animate().alpha(1.0f), er.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public boolean U(boolean z10) {
        y yVar;
        fh0 iconView;
        Animator e10;
        l();
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
        int i7 = 0;
        while (true) {
            yVar = this.c;
            if (i7 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i7);
            if ((childAt instanceof q0) && (iconView = ((q0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i7++;
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
            ai.k0 k0Var = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property, k0Var.getAlpha(), 1.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), (Property<View, Float>) property, ((View) arrayList.get(i10)).getAlpha(), 0.0f));
            }
            this.x0.setDuration(150L);
            this.x0.addListener(new h0(this, arrayList, 1));
            this.x0.start();
            setVisibility(8);
            n();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.J3(this.e);
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
        ai.k0 k0Var2 = this.G;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(k0Var2, (Property<ai.k0, Float>) property, k0Var2.getAlpha(), 0.0f));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((View) arrayList.get(i11)).setAlpha(0.0f);
            this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), (Property<View, Float>) property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
        }
        this.x0.setDuration(150L);
        this.x0.addListener(new h0(this, arrayList, 0));
        this.x0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.h0;
        if (!arrayList2.isEmpty() && this.I != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((jg.o0) arrayList2.get(i12)).h) {
                    this.I.j((jg.o0) arrayList2.get(i12));
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
        yVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.view.ViewGroup, android.widget.LinearLayout, hi.y4] */
    public final void V(View view, q0 q0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        g1 g1Var;
        boolean z10;
        FrameLayout frameLayout = null;
        int i7 = 1;
        if (view == null) {
            q4 subMenuOverlayHost = getSubMenuOverlayHost();
            g5 subMenuOverlay = subMenuOverlayHost != null ? getSubMenuOverlay() : null;
            if (subMenuOverlay != null && ((g1Var = this.d) == null || !g1Var.isShowing())) {
                z();
                if (t() && j()) {
                    if (subMenuOverlay.e == this && (((z10 = subMenuOverlay.E) || subMenuOverlay.O) && z10)) {
                        subMenuOverlay.a(true);
                        return;
                    }
                    this.U = false;
                    n0 n0Var = this.R;
                    if (n0Var != null) {
                        n0Var.k();
                    }
                    subMenuOverlay.d(subMenuOverlayHost, this, getPopupLayout());
                    return;
                }
                return;
            }
        }
        g1 g1Var2 = this.d;
        if (g1Var2 == null || !g1Var2.isShowing()) {
            z();
        }
        if (this.b != null) {
            y yVar = this.c;
            if (yVar == null || !yVar.c || (kVar = yVar.b) == null || kVar.x()) {
                ai.q qVar = this.M;
                if (qVar != null) {
                    org.telegram.messenger.g0.r(qVar);
                    this.M = null;
                }
                g1 g1Var3 = this.d;
                if (g1Var3 != null && g1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = q0Var;
                n0 n0Var2 = this.R;
                if (n0Var2 != null) {
                    n0Var2.k();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? y4Var = new hi.y4(this, getContext(), view);
                    y4Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    frameLayout2.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.w ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof z0) || (view instanceof LinearLayout)) {
                        dh.c cVar = this.u0;
                        if (cVar != null) {
                            fh.g c10 = cVar.c(this.b, null, true);
                            c10.p(this.v0);
                            i20.r(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c10.R.e = true;
                            frameLayout2.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, ja.c(-2.0f, -1));
                    y4Var.addView(frameLayout2, ja.o(-1, -2));
                    y4Var.addView(this.b, ja.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = y4Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.u0 != null) {
                    m60.U(this.b, j6.r1(0.06f, j6.w0(j6.E8, this.n0)));
                }
                g1 g1Var4 = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = g1Var4;
                if (this.W) {
                    g1Var4.setAnimationStyle(0);
                } else {
                    g1Var4.setAnimationStyle(R.style.PopupAnimation);
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new ai.d0(3, this));
                this.d.setOnDismissListener(new hi.m4(i7, this));
                Point point = org.telegram.messenger.g0.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i20.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.U = false;
                this.d.setFocusable(true);
                X(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
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

    public final void W() {
        if (this.f != null) {
            for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                if (this.f.getChildAt(i7) instanceof p0) {
                    ((p0) this.f.getChildAt(i7)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        e6 e6Var = this.n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                if (this.b.M.getChildAt(i10) instanceof z0) {
                    ((z0) this.b.M.getChildAt(i10)).setSelectorColor(j6.w0(j6.I5, e6Var));
                }
            }
        }
        ah.i iVar = this.e;
        if (iVar != null) {
            int i11 = j6.C8;
            q6.l(iVar, 30, i11, e6Var);
            q6.D(this.e, j6.D8, e6Var);
            q6.U(this.e, i11, e6Var);
            q6.C(this.e, j6.lg, e6Var);
            q6.y(this.e, j6.mg, e6Var);
        }
    }

    public final void X(boolean z10, boolean z11) {
        int i7;
        int i10;
        ScrollView scrollView;
        y yVar = this.c;
        if (yVar != null) {
            i10 = yVar.getTop() + (-yVar.b.getMeasuredHeight());
            i7 = yVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            i7 = -((int) ((getMeasuredHeight() * scaleY) - ((this.N != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i10 = this.b0;
        }
        int i11 = i7 + i10 + this.O;
        if (z10 && (scrollView = this.b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.m0;
        if (view == null) {
            view = this;
        }
        if (yVar != null) {
            k kVar = yVar.b;
            if (this.N == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11, -1, -1);
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

    public final d1 a(int i7) {
        q();
        d1 d1Var = new d1(j6.H8, getContext(), this.n0);
        if (i7 != -1) {
            d1Var.setTag(Integer.valueOf(i7));
        }
        d1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(d1Var, ja.o(-1, 8));
        return d1Var;
    }

    public final TextView b(int i7) {
        q();
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

    public final z0 d(int i7, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, e6 e6Var) {
        q();
        z0 z0Var = new z0(z11 ? 1 : 0, getContext(), e6Var, false, false);
        z0Var.j(charSequence, i10, drawable);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setTag(Integer.valueOf(i7));
        this.b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.setOnClickListener(new fi.x1(2, this, z10));
        return z0Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final z0 e(int i7, int i10, CharSequence charSequence) {
        return d(i7, i10, null, charSequence, true, false, this.n0);
    }

    public final z0 f(Drawable drawable, String str, int i7, boolean z10, int i10) {
        return d(i7, i10, drawable, str, z10, false, this.n0);
    }

    public final void g(int i7, String str) {
        q();
        TextView textView = new TextView(getContext());
        q6.U(textView, j6.E8, this.n0);
        textView.setBackgroundDrawable(j6.N0(false));
        if (hd.a0) {
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
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new a0(this, 3));
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
            q();
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
        l();
        return this.e;
    }

    public g5 getSubMenuOverlay() {
        r10 r10Var = this.w0;
        if (r10Var != null) {
            return (g5) r10Var.run();
        }
        return null;
    }

    public q4 getSubMenuOverlayHost() {
        y yVar;
        if (this.w0 == null || (yVar = this.c) == null) {
            return null;
        }
        return yVar.b;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
            View childAt = this.b.M.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i7) {
        q();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i7));
        this.b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new a0(this, 1));
        kVar.setBackgroundDrawable(j6.N0(false));
    }

    public final z0 i(int i7, c01 c01Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q();
        z0 z0Var = new z0(0, getContext(), this.n0, false, false);
        z0Var.j(str, i7, c01Var);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        int i10 = 0;
        z0Var.Q = new d0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), i10);
        z0Var.setOnClickListener(new e0(z0Var, i10));
        this.b.c = true;
        return z0Var;
    }

    public boolean j() {
        k kVar;
        y yVar = this.c;
        return yVar == null || !yVar.c || (kVar = yVar.b) == null || kVar.x();
    }

    public final void k() {
        m0 m0Var;
        TextView textView;
        m0 m0Var2;
        if (this.s != null) {
            boolean s5 = s();
            final int i7 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i10 = 1;
            if (!s5 && TextUtils.isEmpty(this.e.getText()) && (((m0Var = this.I) == null || !m0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((m0Var2 = this.I) != null && !m0Var2.m())))) {
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
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.c0
                        public final /* synthetic */ q0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
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
                if (this.e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.c0
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
                this.e0 = true;
            }
        }
    }

    public final void l() {
        if (this.G == null && this.H) {
            int i7 = 1;
            ai.k0 k0Var = new ai.k0(1, getContext(), this);
            this.G = k0Var;
            int i10 = 0;
            k0Var.setClipChildren(this.o0 != 0);
            this.a = null;
            ai.k0 k0Var2 = this.G;
            LinearLayout.LayoutParams m10 = ja.m(1.0f, 0, -1, this.o0 + 6, 0, 0);
            y yVar = this.c;
            yVar.addView(k0Var2, 0, m10);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = j6.C8;
            e6 e6Var = this.n0;
            q6.U(textView2, i11, e6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            int i12 = 3;
            this.h.setGravity(hd.a0 ? 5 : 3);
            ah.i iVar = new ah.i(i12, getContext(), this);
            this.e = iVar;
            iVar.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            q6.v(this.e, i11, e6Var);
            this.e.setTextSize(1, 18.0f);
            q6.D(this.e, j6.D8, e6Var);
            q6.U(this.e, i11, e6Var);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            this.e.setOnEditorActionListener(new di.m(this, i12));
            this.e.addTextChangedListener(new ah.j(this, 14));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            q6.C(this.e, j6.lg, e6Var);
            q6.y(this.e, j6.mg, e6Var);
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
            if (hd.a0) {
                this.G.addView(this.f, ja.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.e, ja.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, ja.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.G.addView(this.h, ja.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.e, ja.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f, ja.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            f0 f0Var = new f0(0, getContext(), this);
            this.s = f0Var;
            hi.b2 b2Var = new hi.b2(i7, this);
            this.a0 = b2Var;
            f0Var.setImageDrawable(b2Var);
            this.s.setBackground(j6.h0(yVar.b.r0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new a0(this, i10));
            this.s.setContentDescription(hd.M0(2131752099, null));
            this.G.addView(this.s, ja.e(48, -1, 21));
        }
    }

    public final void m() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.b.getItemsCount()) {
                i7 = 8;
                break;
            } else if (this.b.M.getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i7 != getVisibility()) {
            setVisibility(i7);
        }
    }

    public final void n() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h0;
            if (i7 >= arrayList.size()) {
                E();
                return;
            }
            if (((jg.o0) arrayList.get(i7)).h) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public void o() {
        this.r = null;
        ah.i iVar = this.e;
        if (iVar == null) {
            return;
        }
        iVar.setText("");
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            X(false, true);
        }
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ai.q qVar;
        int i7;
        ai.q qVar2;
        g5 shownSubMenuOverlay = getShownSubMenuOverlay();
        boolean z10 = shownSubMenuOverlay != null && shownSubMenuOverlay.E;
        boolean z11 = getSubMenuOverlayHost() != null;
        g1 g1Var = this.d;
        boolean z12 = g1Var != null && g1Var.isShowing();
        if (motionEvent.getActionMasked() == 0) {
            this.r0 = false;
            if ((this.d0 || z11) && t() && !z12 && !z10) {
                ai.q qVar3 = this.M;
                if (qVar3 != null) {
                    org.telegram.messenger.g0.r(qVar3);
                    this.M = null;
                }
                ai.q qVar4 = new ai.q(19, this, z11);
                this.M = qVar4;
                org.telegram.messenger.g0.i3(qVar4, z11 ? ViewConfiguration.getLongPressTimeout() : 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (qVar2 = this.M) != null) {
                    org.telegram.messenger.g0.r(qVar2);
                    this.M = null;
                }
            }
            if (!this.g0 || z11 || !t() || z12) {
                if ((this.g0 || this.r0) && (z12 || z10)) {
                    getLocationOnScreen(this.K);
                    float x10 = motionEvent.getX() + this.K[0];
                    float y10 = motionEvent.getY() + this.K[1];
                    this.L = null;
                    for (0; i7 < this.b.getItemsCount(); i7 + 1) {
                        View childAt = this.b.M.getChildAt(i7);
                        Object tag = childAt.getTag();
                        if (tag instanceof Integer) {
                            i7 = ((Integer) tag).intValue() >= 100 ? i7 + 1 : 0;
                            ((View) childAt.getParent()).getLocationOnScreen(this.K);
                            int[] iArr = this.K;
                            float f11 = x10 - iArr[0];
                            float f12 = y10 - iArr[1];
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
                            float f122 = y10 - iArr2[1];
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
                V(null, null);
                this.r0 = true;
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1 && (z12 || z10)) {
            ai.q qVar5 = this.M;
            if (qVar5 != null) {
                org.telegram.messenger.g0.r(qVar5);
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
                    y yVar = this.c;
                    if (yVar != null) {
                        yVar.o(((Integer) tag2).intValue());
                    } else {
                        l0 l0Var = this.Q;
                        if (l0Var != null) {
                            l0Var.g(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        g1 g1Var2 = this.d;
                        if (g1Var2 != null) {
                            g1Var2.d(this.S);
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
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (qVar = this.M) != null) {
                org.telegram.messenger.g0.r(qVar);
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
        g5 shownSubMenuOverlay = getShownSubMenuOverlay();
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

    public final void q() {
        if (this.b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.n0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.c cVar = this.u0;
        if (cVar != null) {
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.p(this.v0);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.b.setOnTouchListener(new hi.k4(1, this));
        this.b.setDispatchKeyEventListener(new z(this, 0));
    }

    public final void r() {
        g5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.d(this.S);
        }
    }

    public final boolean s() {
        ArrayList arrayList = this.h0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAdditionalXOffset(int i7) {
        this.c0 = i7;
    }

    public void setAdditionalYOffset(int i7) {
        this.b0 = i7;
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

    public void setIconColor(int i7) {
        if (this.s0 == null || this.t0 != i7) {
            this.s0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            this.t0 = i7;
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
            textView.setTextColor(i7);
        }
        f0 f0Var = this.s;
        if (f0Var != null) {
            ColorFilter colorFilter2 = f0Var.getColorFilter();
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

    public void setMenuXOffset(int i7) {
        this.P = i7;
    }

    public void setMenuYOffset(int i7) {
        this.O = i7;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final z10 z10Var) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.b0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    z10 z10Var2 = z10Var;
                    if (z10Var2 != null) {
                        z10Var2.a(Boolean.valueOf(q0.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.b = z10;
        }
        this.W = z10;
    }

    public void setPopupItemsSelectorColor(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        z51 z51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
        int childCount = z51Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = z51Var.getChildAt(i10);
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
        this.o0 = i7;
        ai.k0 k0Var = this.G;
        if (k0Var != null) {
            ((ViewGroup.MarginLayoutParams) k0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i7);
            this.G.setClipChildren(this.o0 != 0);
            ai.k0 k0Var2 = this.G;
            k0Var2.setLayoutParams(k0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        hi.b2 b2Var = this.a0;
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

    public void setSubMenuOpenSide(int i7) {
        this.N = i7;
    }

    public void setSubMenuOverlayProvider(r10 r10Var) {
        this.w0 = r10Var;
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

    public void setupPopupRadialSelectors(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i7);
        }
    }

    public final boolean t() {
        if (this.b != null) {
            return true;
        }
        ArrayList arrayList = this.y0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void u(int i7) {
        View findViewWithTag;
        HashMap hashMap = this.z0;
        o0 o0Var = hashMap == null ? null : (o0) hashMap.get(Integer.valueOf(i7));
        if (o0Var != null) {
            o0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public boolean v() {
        return this.H;
    }

    public boolean w() {
        ai.k0 k0Var = this.G;
        return k0Var != null && k0Var.getVisibility() == 0;
    }

    public boolean x() {
        ai.k0 k0Var = this.G;
        return (k0Var == null || k0Var.getTag() == null) ? false : true;
    }

    public final boolean y() {
        g5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.E;
        }
        g1 g1Var = this.d;
        return g1Var != null && g1Var.isShowing();
    }

    public final void z() {
        if (this.y0 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.y0.size(); i7++) {
            o0 o0Var = (o0) this.y0.get(i7);
            o0Var.getClass();
            int i10 = 1;
            q();
            View view = o0Var.j;
            if (view != null) {
                this.b.addView(view);
            } else {
                int i11 = o0Var.a;
                int i12 = 3;
                if (i11 == 0) {
                    z0 z0Var = new z0(0, getContext(), this.n0, false, false);
                    z0Var.j(o0Var.e, o0Var.c, o0Var.d);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var.setTag(Integer.valueOf(o0Var.b));
                    this.b.addView(z0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
                    if (hd.a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var.setLayoutParams(layoutParams);
                    z0Var.setOnClickListener(new org.telegram.messenger.video.e(i12, o0Var, this));
                    Integer num = o0Var.n;
                    if (num != null && o0Var.o != null) {
                        z0Var.d(num.intValue(), o0Var.o.intValue());
                    }
                    o0Var.j = z0Var;
                } else if (i11 == 1) {
                    d1 d1Var = new d1(j6.H8, getContext(), this.n0);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    this.b.a(d1Var, ja.o(-1, 8));
                    o0Var.j = d1Var;
                } else if (i11 == 2) {
                    z0 z0Var2 = new z0(0, getContext(), this.n0, false, false);
                    z0Var2.j(o0Var.e, o0Var.c, o0Var.d);
                    z0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var2.setRightIcon(R.drawable.msg_arrowright);
                    z0Var2.getRightIcon().setVisibility(o0Var.m);
                    this.b.addView(z0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) z0Var2.getLayoutParams();
                    if (hd.a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var2.setLayoutParams(layoutParams2);
                    eh ehVar = o0Var.h;
                    if (ehVar != null) {
                        o0Var.g = (View) ehVar.run();
                        o0Var.h = null;
                    }
                    z0Var2.Q = new d0(this, this.b.b(o0Var.g), i10);
                    z0Var2.setOnClickListener(new e0(z0Var2, i10));
                    this.b.c = true;
                    Integer num2 = o0Var.n;
                    if (num2 != null && o0Var.o != null) {
                        z0Var2.d(num2.intValue(), o0Var.o.intValue());
                    }
                    o0Var.j = z0Var2;
                } else if (i11 == 3) {
                    z70 z70Var = new z70(getContext(), null);
                    z70Var.setTag(R.id.fit_width_tag, 1);
                    z70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    z70Var.setTextSize(1, o0Var.i);
                    q6.U(z70Var, j6.E8, null);
                    z70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    q6.G(z70Var, j6.J6, null);
                    z70Var.setText(o0Var.e);
                    z70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.b.a(z70Var, ja.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    o0Var.j = z70Var;
                }
            }
            View view2 = o0Var.j;
            if (view2 != null) {
                view2.setVisibility(o0Var.l);
                ch chVar = o0Var.k;
                if (chVar != null) {
                    o0Var.j.setOnClickListener(chVar);
                }
            }
        }
        this.y0.clear();
    }

    public q0(Context context, y yVar, int i7) {
        this(context, yVar, 0, i7, false, null);
    }

    public q0(Context context, y yVar, int i7, int i10, boolean z10, e6 e6Var) {
        super(context);
        new ArrayList();
        this.S = true;
        this.W = true;
        this.e0 = true;
        this.g0 = true;
        this.h0 = new ArrayList();
        this.i0 = -1;
        this.j0 = new h2.f((int[]) null);
        this.n0 = e6Var;
        if (i7 != 0) {
            setBackgroundDrawable(j6.h0(i7, z10 ? 5 : 1, -1));
        }
        this.c = yVar;
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
            addView(textView, ja.c(-1.0f, -2));
            return;
        }
        fh0 fh0Var = new fh0(context);
        this.y = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.setImportantForAccessibility(2);
        addView(fh0Var, ja.c(-1.0f, -1));
        if (i10 != 0) {
            fh0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i7) {
        fh0 fh0Var = this.y;
        if (fh0Var == null) {
            return;
        }
        this.E = i7;
        fh0Var.setImageResource(i7);
    }
}
