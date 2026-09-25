package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.y70;
import org.telegram.ui.uh;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class u0 extends FrameLayout {
    public final TextView E;
    public p0 F;
    public boolean G;
    public e5 H;
    public Rect I;
    public int[] J;
    public View K;
    public p L;
    public int M;
    public int N;
    public int O;
    public q0 P;
    public r0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public ci.j2 W;
    public FrameLayout a;
    public int a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final y c;
    public boolean c0;
    public m1 d;
    public boolean d0;
    public ci.h2 e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public TextView h;
    public int h0;
    public final AnimationNotificationsLocker i0;
    public float j0;
    public float k0;
    public View l0;
    public final d6 m0;
    public CharSequence n;
    public int n0;
    public View.OnClickListener o0;
    public boolean p0;
    public ah.c q0;
    public CharSequence r;
    public dh.e r0;
    public j0 s;
    public AnimatorSet s0;
    public ArrayList t0;
    public HashMap u0;
    public AnimatorSet v;
    public View w;
    public final lj0 x;
    public int y;

    public u0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static e1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, d6 d6Var) {
        e1 e1Var = new e1(z12 ? 1 : 0, viewGroup.getContext(), d6Var, z10, z11);
        e1Var.g(charSequence, i10, null);
        e1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(e1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        e1Var.setLayoutParams(layoutParams);
        return e1Var;
    }

    public final s0 A(s0 s0Var) {
        if (this.t0 == null) {
            this.t0 = new ArrayList();
        }
        this.t0.add(s0Var);
        if (this.u0 == null) {
            this.u0 = new HashMap();
        }
        this.u0.put(Integer.valueOf(s0Var.b), s0Var);
        return s0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i10) {
            return;
        }
        this.b.setBackgroundColor(i10);
        m1 m1Var = this.d;
        if (m1Var == null || !m1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void C(gg.q0 q0Var) {
        if (q0Var.h) {
            this.g0.remove(q0Var);
            int i10 = this.h0;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.h0 = r0.size() - 1;
            }
            y();
            this.e.hideActionMode();
        }
    }

    public final void D() {
        this.R = false;
    }

    public final void E(ah.c cVar, dh.e eVar) {
        this.q0 = cVar;
        this.r0 = eVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || cVar == null) {
            return;
        }
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(12.0f));
        c10.p(AndroidUtilities.dp(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
    }

    public final void F() {
        if (this.c == null) {
            return;
        }
        this.G = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = i1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i1Var.getChildAt(i11);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i10);
            } else if (childAt instanceof e1) {
                if (z10) {
                    ((e1) childAt).setIconColor(i10);
                } else {
                    ((e1) childAt).setTextColor(i10);
                }
            }
        }
    }

    public final void H(CharSequence charSequence, boolean z10) {
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

    public final void I(int i10, boolean z10) {
        if (z10) {
            K(i10);
        } else {
            r(i10);
        }
    }

    public final void J(int i10) {
        K(i10);
    }

    public final void K(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.u0;
        s0 s0Var = hashMap == null ? null : (s0) hashMap.get(Integer.valueOf(i10));
        if (s0Var != null) {
            s0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        ok.s(findViewWithTag.animate().alpha(1.0f), rr.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public final boolean L(boolean z10) {
        y yVar;
        lj0 iconView;
        Animator h;
        k();
        e5 e5Var = this.H;
        int i10 = 0;
        if (this.F == null || !(e5Var == null || e5Var.c())) {
            return false;
        }
        e5 e5Var2 = this.H;
        int i11 = 1;
        if (e5Var2 != null && (h = e5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            yVar = this.c;
            if (i12 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i12);
            if ((childAt instanceof u0) && (iconView = ((u0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i12++;
        }
        Object tag = this.F.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.F.setVisibility(0);
            this.F.setAlpha(0.0f);
            AnimatorSet animatorSet = this.s0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.s0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.s0 = animatorSet2;
            p0 p0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(p0Var, (Property<p0, Float>) property, p0Var.getAlpha(), 1.0f));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), (Property<View, Float>) property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
            }
            this.s0.setDuration(150L);
            this.s0.addListener(new l0(this, arrayList, i11));
            this.s0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.e);
            }
            this.F.setTag(1);
            e5 e5Var3 = this.H;
            if (e5Var3 != null) {
                e5Var3.n();
            }
            return true;
        }
        this.F.setTag(null);
        AnimatorSet animatorSet3 = this.s0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.s0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.s0 = animatorSet4;
        p0 p0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(p0Var2, (Property<p0, Float>) property, p0Var2.getAlpha(), 0.0f));
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((View) arrayList.get(i14)).setAlpha(0.0f);
            this.s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i14), (Property<View, Float>) property, ((View) arrayList.get(i14)).getAlpha(), 1.0f));
        }
        this.s0.setDuration(150L);
        this.s0.addListener(new l0(this, arrayList, i10));
        this.s0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty() && this.H != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                if (((gg.q0) arrayList2.get(i15)).h) {
                    this.H.o((gg.q0) arrayList2.get(i15));
                }
            }
        }
        e5 e5Var4 = this.H;
        if (e5Var4 != null) {
            e5Var4.m();
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.e);
        }
        yVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.ViewGroup, android.widget.LinearLayout, ci.w5] */
    public final void M(View view, u0 u0Var) {
        float f7;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        m1 m1Var = this.d;
        d6 d6Var = this.m0;
        View view2 = null;
        if ((m1Var == null || !m1Var.isShowing()) && this.t0 != null) {
            for (int i10 = 0; i10 < this.t0.size(); i10++) {
                s0 s0Var = (s0) this.t0.get(i10);
                s0Var.getClass();
                o();
                View view3 = s0Var.i;
                if (view3 != null) {
                    this.b.addView(view3);
                } else {
                    int i11 = s0Var.a;
                    if (i11 == 0) {
                        e1 e1Var = new e1(0, getContext(), this.m0, false, false);
                        e1Var.g(s0Var.e, s0Var.c, s0Var.d);
                        e1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        e1Var.setTag(Integer.valueOf(s0Var.b));
                        this.b.addView(e1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        e1Var.setLayoutParams(layoutParams);
                        e1Var.setOnClickListener(new ai.f2(17, s0Var, this));
                        Integer num = s0Var.m;
                        if (num != null && s0Var.n != null) {
                            e1Var.c(num.intValue(), s0Var.n.intValue());
                        }
                        s0Var.i = e1Var;
                    } else if (i11 == 1) {
                        j1 j1Var = new j1(getContext(), h6.H8, d6Var);
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        this.b.a(j1Var, w7.y5.n(-1, 8));
                        s0Var.i = j1Var;
                    } else if (i11 == 2) {
                        e1 e1Var2 = new e1(0, getContext(), this.m0, false, false);
                        e1Var2.g(s0Var.e, s0Var.c, s0Var.d);
                        e1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        e1Var2.setRightIcon(R.drawable.msg_arrowright);
                        e1Var2.getRightIcon().setVisibility(s0Var.l);
                        this.b.addView(e1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) e1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        e1Var2.setLayoutParams(layoutParams2);
                        e1Var2.G = new f0(this, this.b.b(s0Var.g), 1);
                        e1Var2.setOnClickListener(new g0(e1Var2, 1));
                        this.b.c = true;
                        Integer num2 = s0Var.m;
                        if (num2 != null && s0Var.n != null) {
                            e1Var2.c(num2.intValue(), s0Var.n.intValue());
                        }
                        s0Var.i = e1Var2;
                    } else if (i11 == 3) {
                        n90 n90Var = new n90(getContext(), null);
                        n90Var.setTag(R.id.fit_width_tag, 1);
                        n90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        n90Var.setTextSize(1, s0Var.h);
                        n90Var.setTextColor(h6.w0(null, h6.E8, false));
                        n90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        n90Var.setLinkTextColor(h6.w0(null, h6.J6, false));
                        n90Var.setText(s0Var.e);
                        n90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.b.a(n90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        s0Var.i = n90Var;
                    }
                }
                View view4 = s0Var.i;
                if (view4 != null) {
                    view4.setVisibility(s0Var.k);
                    uh uhVar = s0Var.j;
                    if (uhVar != null) {
                        s0Var.i.setOnClickListener(uhVar);
                    }
                }
            }
            f7 = 8.0f;
            this.t0.clear();
        } else {
            f7 = 8.0f;
        }
        if (this.b != null) {
            y yVar = this.c;
            if (yVar == null || !yVar.c || (kVar = yVar.b) == null || kVar.s()) {
                p pVar = this.L;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.L = null;
                }
                m1 m1Var2 = this.d;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.l0 = u0Var;
                r0 r0Var = this.Q;
                if (r0Var != null) {
                    r0Var.e();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? w5Var = new ci.w5(this, getContext(), view);
                    w5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.v ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof e1) || (view instanceof LinearLayout)) {
                        ah.c cVar = this.q0;
                        if (cVar != null) {
                            ch.d c10 = cVar.c(this.b, null, true);
                            c10.o(this.r0);
                            c10.q(AndroidUtilities.dp(12.0f));
                            c10.p(AndroidUtilities.dp(f7));
                            c10.j.e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.y5.c(-2.0f, -1));
                    w5Var.addView(frameLayout, w7.y5.n(-1, -2));
                    w5Var.addView(this.b, w7.y5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = w5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.q0 != null) {
                    y70.U(this.b, h6.l1(0.06f, h6.v0(h6.E8, d6Var)));
                }
                m1 m1Var3 = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = m1Var3;
                if (this.V) {
                    m1Var3.setAnimationStyle(0);
                } else {
                    m1Var3.setAnimationStyle(R.style.PopupAnimation);
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.d0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        m1 m1Var4;
                        u0 u0Var2 = u0.this;
                        u0Var2.getClass();
                        if (i12 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (m1Var4 = u0Var2.d) == null || !m1Var4.isShowing()) {
                            return false;
                        }
                        u0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.e0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        r0 r0Var2 = u0.this.Q;
                        if (r0Var2 != null) {
                            r0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ok.c(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                O(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                i1 i1Var = this.b.L;
                int childCount = i1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = i1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = i1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof e1) {
                            ((e1) childAt3).j(childAt3 == view2 || z11, childAt3 == view5);
                        }
                        z11 = tag != null;
                    }
                }
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

    public final void N() {
        if (this.f != null) {
            for (int i10 = 0; i10 < this.f.getChildCount(); i10++) {
                if (this.f.getChildAt(i10) instanceof t0) {
                    ((t0) this.f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        d6 d6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
                if (this.b.L.getChildAt(i11) instanceof e1) {
                    ((e1) this.b.L.getChildAt(i11)).setSelectorColor(h6.v0(h6.I5, d6Var));
                }
            }
        }
        ci.h2 h2Var = this.e;
        if (h2Var != null) {
            int i12 = h6.C8;
            h2Var.setCursorColor(h6.v0(i12, d6Var));
            this.e.setHintTextColor(h6.v0(h6.D8, d6Var));
            this.e.setTextColor(h6.v0(i12, d6Var));
            this.e.setHighlightColor(h6.v0(h6.uf, d6Var));
            this.e.setHandlesColor(h6.v0(h6.vf, d6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
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
            k kVar = yVar.b;
            if (this.M == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.e0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12, -1, -1);
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
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.b0 + this.O, i12, -1, -1);
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

    public final j1 a(int i10) {
        o();
        j1 j1Var = new j1(getContext(), h6.H8, this.m0);
        if (i10 != -1) {
            j1Var.setTag(Integer.valueOf(i10));
        }
        j1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(j1Var, w7.y5.n(-1, 8));
        return j1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final e1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, d6 d6Var) {
        o();
        e1 e1Var = new e1(z11 ? 1 : 0, getContext(), d6Var, false, false);
        e1Var.g(charSequence, i11, drawable);
        e1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        e1Var.setTag(Integer.valueOf(i10));
        this.b.addView(e1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        e1Var.setLayoutParams(layoutParams);
        e1Var.setOnClickListener(new ai.j3(2, this, z10));
        return e1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final e1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.m0);
    }

    public final e1 f(int i10, int i11, String str, d6 d6Var) {
        return d(i10, i11, null, str, true, false, d6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(h6.v0(h6.E8, this.m0));
        textView.setBackgroundDrawable(h6.K0(false));
        if (LocaleController.isRTL) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(AndroidUtilities.dp(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(charSequence);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new a0(this, 3));
    }

    public View getContentView() {
        lj0 lj0Var = this.x;
        return lj0Var != null ? lj0Var : this.E;
    }

    public lj0 getIconView() {
        return this.x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.b == null) {
            o();
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

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new a0(this, 1));
        kVar.setBackgroundDrawable(h6.K0(false));
    }

    public final e1 i(int i10, i21 i21Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        e1 e1Var = new e1(0, getContext(), this.m0, false, false);
        e1Var.g(str, i10, i21Var);
        e1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        e1Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(e1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        e1Var.setLayoutParams(layoutParams);
        e1Var.G = new f0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        e1Var.setOnClickListener(new g0(e1Var, 0));
        this.b.c = true;
        return e1Var;
    }

    public final void j() {
        e5 e5Var;
        TextView textView;
        e5 e5Var2;
        if (this.s != null) {
            boolean p5 = p();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!p5 && TextUtils.isEmpty(this.e.getText()) && (((e5Var = this.H) == null || !e5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((e5Var2 = this.H) != null && !e5Var2.r())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.v;
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
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.c0
                        public final /* synthetic */ u0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    u0 u0Var = this.b;
                                    u0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = u0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var2 = this.b;
                                    u0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = u0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new k0(this, 0));
                    duration.start();
                    this.v = duration;
                    return;
                }
                return;
            }
            if (this.s.getTag() == null) {
                this.s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.s.setVisibility(0);
                if (this.d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.c0
                        public final /* synthetic */ u0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    u0 u0Var = this.b;
                                    u0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = u0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    u0 u0Var2 = this.b;
                                    u0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = u0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<j0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new k0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.s.setAlpha(1.0f);
                this.s.setRotation(0.0f);
                this.s.setScaleX(1.0f);
                this.s.setScaleY(1.0f);
                View view = this.w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.d0 = true;
            }
        }
    }

    public final void k() {
        if (this.F == null && this.G) {
            p0 p0Var = new p0(this, getContext(), 0);
            this.F = p0Var;
            p0Var.setClipChildren(this.n0 != 0);
            this.a = null;
            p0 p0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.y5.m(1.0f, 0, -1, this.n0 + 6, 0, 0);
            y yVar = this.c;
            yVar.addView(p0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = h6.C8;
            d6 d6Var = this.m0;
            textView2.setTextColor(h6.v0(i10, d6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            ci.h2 h2Var = new ci.h2(this, getContext(), 2);
            this.e = h2Var;
            h2Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            this.e.setCursorColor(h6.v0(i10, d6Var));
            this.e.setTextSize(1, 18.0f);
            this.e.setHintTextColor(h6.v0(h6.D8, d6Var));
            this.e.setTextColor(h6.v0(i10, d6Var));
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            if (Build.VERSION.SDK_INT < 23) {
                this.e.setCustomSelectionActionModeCallback(new ii.d1(1));
            }
            this.e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.ActionBar.z
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                    if (keyEvent == null) {
                        return false;
                    }
                    if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                        return false;
                    }
                    u0 u0Var = u0.this;
                    AndroidUtilities.hideKeyboard(u0Var.e);
                    e5 e5Var = u0Var.H;
                    if (e5Var == null) {
                        return false;
                    }
                    e5Var.p(u0Var.e);
                    return false;
                }
            });
            this.e.addTextChangedListener(new i0(this));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            this.e.setHighlightColor(h6.v0(h6.uf, d6Var));
            this.e.setHandlesColor(h6.v0(h6.vf, d6Var));
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
            if (LocaleController.isRTL) {
                this.F.addView(this.f, w7.y5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, w7.y5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.y5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.h, w7.y5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, w7.y5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f, w7.y5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            j0 j0Var = new j0(this, getContext(), 0);
            this.s = j0Var;
            ci.j2 j2Var = new ci.j2(1, this);
            this.W = j2Var;
            j0Var.setImageDrawable(j2Var);
            this.s.setBackground(h6.f0(yVar.b.q0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new a0(this, 0));
            this.s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.s, w7.y5.e(48, -1, 21));
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
                y();
                return;
            }
            if (((gg.q0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void n() {
        m1 m1Var = this.d;
        if (m1Var == null || !m1Var.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    public final void o() {
        if (this.b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ah.c cVar = this.q0;
        if (cVar != null) {
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.o(this.r0);
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ActionBar.h0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                m1 m1Var;
                u0 u0Var = u0.this;
                u0Var.getClass();
                if (motionEvent.getActionMasked() != 0 || (m1Var = u0Var.d) == null || !m1Var.isShowing()) {
                    return false;
                }
                view.getHitRect(u0Var.I);
                if (u0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                u0Var.d.d(true);
                return false;
            }
        });
        this.b.setDispatchKeyEventListener(new n(this, 2));
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x != null) {
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
        m1 m1Var = this.d;
        if (m1Var != null && m1Var.isShowing()) {
            O(false, true);
        }
        e5 e5Var = this.H;
        if (e5Var != null) {
            e5Var.l();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.c0 && q() && ((m1Var3 = this.d) == null || !m1Var3.isShowing())) {
                p pVar = new p(this, 1);
                this.L = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            m1 m1Var4 = this.d;
            if (m1Var4 != null && m1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.K;
                if (view != null) {
                    view.setSelected(false);
                    y yVar = this.c;
                    if (yVar != null) {
                        yVar.o(((Integer) this.K.getTag()).intValue());
                    } else {
                        q0 q0Var = this.P;
                        if (q0Var != null) {
                            q0Var.m(((Integer) this.K.getTag()).intValue());
                        }
                    }
                    this.d.d(this.R);
                } else if (this.f0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.K;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.K = null;
                }
            }
        } else if (this.f0 && q() && ((m1Var2 = this.d) == null || !m1Var2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                M(null, null);
                return true;
            }
        } else if (this.f0 && (m1Var = this.d) != null && m1Var.isShowing()) {
            getLocationOnScreen(this.J);
            float x10 = motionEvent.getX() + this.J[0];
            float y3 = motionEvent.getY();
            float f7 = y3 + r5[1];
            this.b.getLocationOnScreen(this.J);
            int[] iArr = this.J;
            float f10 = x10 - iArr[0];
            float f11 = f7 - iArr[1];
            this.K = null;
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                View childAt = this.b.L.getChildAt(i10);
                childAt.getHitRect(this.I);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.I.contains((int) f10, (int) f11)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.K = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((gg.q0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.b != null) {
            return true;
        }
        ArrayList arrayList = this.t0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void r(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.u0;
        s0 s0Var = hashMap == null ? null : (s0) hashMap.get(Integer.valueOf(i10));
        if (s0Var != null) {
            s0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public final boolean s() {
        p0 p0Var = this.F;
        return p0Var != null && p0Var.getVisibility() == 0;
    }

    public void setAdditionalXOffset(int i10) {
        this.b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.a0 = i10;
    }

    public void setDelegate(q0 q0Var) {
        this.P = q0Var;
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
        lj0 lj0Var = this.x;
        if (lj0Var == null) {
            return;
        }
        if (drawable instanceof ij0) {
            lj0Var.setAnimation((ij0) drawable);
        } else {
            lj0Var.setImageDrawable(drawable);
        }
        this.y = 0;
    }

    public void setIconColor(int i10) {
        lj0 lj0Var = this.x;
        if (lj0Var != null) {
            lj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        j0 j0Var = this.s;
        if (j0Var != null) {
            j0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        m1 m1Var = this.d;
        if (m1Var != null) {
            m1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.b0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(u0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        m1 m1Var = this.d;
        if (m1Var != null) {
            m1Var.b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = i1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i1Var.getChildAt(i11);
            if (childAt instanceof e1) {
                ((e1) childAt).setSelectorColor(i10);
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.w = view;
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
        p0 p0Var = this.F;
        if (p0Var != null) {
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            this.F.setClipChildren(this.n0 != 0);
            p0 p0Var2 = this.F;
            p0Var2.setLayoutParams(p0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        ci.j2 j2Var = this.W;
        if (j2Var == null) {
            return;
        }
        if (!z10) {
            j2Var.e = false;
            return;
        }
        j2Var.e = true;
        j2Var.b = System.currentTimeMillis();
        j2Var.invalidateSelf();
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

    public void setSubMenuDelegate(r0 r0Var) {
        this.Q = r0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.M = i10;
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

    public final boolean t() {
        m1 m1Var = this.d;
        return m1Var != null && m1Var.isShowing();
    }

    public final s0 u(int i10, int i11, String str) {
        s0 s0Var = new s0(0);
        s0Var.b = i10;
        s0Var.c = i11;
        s0Var.d = null;
        s0Var.e = str;
        s0Var.f = true;
        A(s0Var);
        return s0Var;
    }

    public final void v(ij0 ij0Var, String str) {
        s0 s0Var = new s0(0);
        s0Var.b = 29;
        s0Var.c = 0;
        s0Var.d = ij0Var;
        s0Var.e = str;
        s0Var.f = true;
        A(s0Var);
    }

    public final s0 w(int i10, oo ooVar) {
        s0 s0Var = new s0(2);
        s0Var.c = i10;
        s0Var.d = null;
        s0Var.e = null;
        s0Var.g = ooVar;
        A(s0Var);
        return s0Var;
    }

    public final s0 x() {
        s0 s0Var = new s0(3);
        s0Var.e = "";
        s0Var.h = 13;
        A(s0Var);
        return s0Var;
    }

    public final void y() {
        ArrayList arrayList = this.g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        p0 p0Var = this.F;
        if (p0Var != null && p0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new m0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) rr.g);
            transitionSet.addListener((Transition.TransitionListener) new n0(this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i10 = 0;
            while (i10 < this.f.getChildCount()) {
                if (!arrayList2.remove(((t0) this.f.getChildAt(i10)).getFilter())) {
                    this.f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            gg.q0 q0Var = (gg.q0) arrayList2.get(i11);
            q0Var.getClass();
            t0 t0Var = new t0(getContext(), this.m0);
            t0Var.setData(q0Var);
            t0Var.setOnClickListener(new ai.f2(16, this, t0Var));
            this.f.addView(t0Var, w7.y5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i12 = 0;
            while (i12 < this.f.getChildCount()) {
                ((t0) this.f.getChildAt(i12)).setExpanded(i12 == this.h0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new o0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        y yVar;
        k();
        p0 p0Var = this.F;
        if (p0Var == null || p0Var.getVisibility() == 0 || (yVar = this.c) == null) {
            return;
        }
        yVar.b.v(L(z10));
    }

    public u0(Context context, y yVar, int i10, int i11) {
        this(context, yVar, i10, i11, false, null);
    }

    public u0(Context context, y yVar, int i10, int i11, boolean z10, d6 d6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = -1;
        this.i0 = new AnimationNotificationsLocker();
        this.m0 = d6Var;
        if (i10 != 0) {
            setBackgroundDrawable(h6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.c = yVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, w7.y5.c(-1.0f, -2));
            return;
        }
        lj0 lj0Var = new lj0(context);
        this.x = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        lj0Var.setImportantForAccessibility(2);
        addView(lj0Var, w7.y5.c(-1.0f, -1));
        if (i11 != 0) {
            lj0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        lj0 lj0Var = this.x;
        if (lj0Var == null) {
            return;
        }
        this.y = i10;
        lj0Var.setImageResource(i10);
    }
}
