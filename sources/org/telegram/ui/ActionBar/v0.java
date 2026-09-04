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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xh;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout {
    public final TextView E;
    public q0 F;
    public boolean G;
    public g5 H;
    public Rect I;
    public int[] J;
    public View K;
    public q L;
    public int M;
    public int N;
    public int O;
    public r0 P;
    public s0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public di.j2 W;
    public FrameLayout a;
    public int a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final z c;
    public boolean c0;
    public n1 d;
    public boolean d0;
    public di.h2 e;
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
    public final f6 m0;
    public CharSequence n;
    public int n0;
    public View.OnClickListener o0;
    public boolean p0;
    public bh.b q0;
    public CharSequence r;
    public eh.e r0;
    public k0 s;
    public AnimatorSet s0;
    public ArrayList t0;
    public HashMap u0;
    public AnimatorSet v;
    public View w;
    public final aj0 x;
    public int y;

    public v0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static f1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, f6 f6Var) {
        f1 f1Var = new f1(z12 ? 1 : 0, viewGroup.getContext(), f6Var, z10, z11);
        f1Var.g(charSequence, i10, null);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        return f1Var;
    }

    public final t0 A(t0 t0Var) {
        if (this.t0 == null) {
            this.t0 = new ArrayList();
        }
        this.t0.add(t0Var);
        if (this.u0 == null) {
            this.u0 = new HashMap();
        }
        this.u0.put(Integer.valueOf(t0Var.b), t0Var);
        return t0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i10) {
            return;
        }
        this.b.setBackgroundColor(i10);
        n1 n1Var = this.d;
        if (n1Var == null || !n1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void C(hg.q0 q0Var) {
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

    public final void E(bh.b bVar, eh.e eVar) {
        this.q0 = bVar;
        this.r0 = eVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || bVar == null) {
            return;
        }
        dh.d c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(12.0f));
        c10.o(AndroidUtilities.dp(8.0f));
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
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = j1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j1Var.getChildAt(i11);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i10);
            } else if (childAt instanceof f1) {
                if (z10) {
                    ((f1) childAt).setIconColor(i10);
                } else {
                    ((f1) childAt).setTextColor(i10);
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
        t0 t0Var = hashMap == null ? null : (t0) hashMap.get(Integer.valueOf(i10));
        if (t0Var != null) {
            t0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        wl.q(findViewWithTag.animate().alpha(1.0f), pr.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public final boolean L(boolean z10) {
        z zVar;
        aj0 iconView;
        Animator h;
        k();
        g5 g5Var = this.H;
        int i10 = 0;
        if (this.F == null || !(g5Var == null || g5Var.c())) {
            return false;
        }
        g5 g5Var2 = this.H;
        int i11 = 1;
        if (g5Var2 != null && (h = g5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            zVar = this.c;
            if (i12 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i12);
            if ((childAt instanceof v0) && (iconView = ((v0) childAt).getIconView()) != null) {
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
            q0 q0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<q0, Float>) property, q0Var.getAlpha(), 1.0f));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), (Property<View, Float>) property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
            }
            this.s0.setDuration(150L);
            this.s0.addListener(new m0(this, arrayList, i11));
            this.s0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.e);
            }
            this.F.setTag(1);
            g5 g5Var3 = this.H;
            if (g5Var3 != null) {
                g5Var3.n();
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
        q0 q0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, (Property<q0, Float>) property, q0Var2.getAlpha(), 0.0f));
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((View) arrayList.get(i14)).setAlpha(0.0f);
            this.s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i14), (Property<View, Float>) property, ((View) arrayList.get(i14)).getAlpha(), 1.0f));
        }
        this.s0.setDuration(150L);
        this.s0.addListener(new m0(this, arrayList, i10));
        this.s0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty() && this.H != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                if (((hg.q0) arrayList2.get(i15)).h) {
                    this.H.o((hg.q0) arrayList2.get(i15));
                }
            }
        }
        g5 g5Var4 = this.H;
        if (g5Var4 != null) {
            g5Var4.m();
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.e);
        }
        zVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.ViewGroup, android.widget.LinearLayout, di.x5] */
    public final void M(View view, v0 v0Var) {
        float f7;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        n1 n1Var = this.d;
        f6 f6Var = this.m0;
        View view2 = null;
        if ((n1Var == null || !n1Var.isShowing()) && this.t0 != null) {
            for (int i10 = 0; i10 < this.t0.size(); i10++) {
                t0 t0Var = (t0) this.t0.get(i10);
                t0Var.getClass();
                o();
                View view3 = t0Var.i;
                if (view3 != null) {
                    this.b.addView(view3);
                } else {
                    int i11 = t0Var.a;
                    if (i11 == 0) {
                        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
                        f1Var.g(t0Var.e, t0Var.c, t0Var.d);
                        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var.setTag(Integer.valueOf(t0Var.b));
                        this.b.addView(f1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        f1Var.setLayoutParams(layoutParams);
                        f1Var.setOnClickListener(new bi.u1(17, t0Var, this));
                        Integer num = t0Var.m;
                        if (num != null && t0Var.n != null) {
                            f1Var.c(num.intValue(), t0Var.n.intValue());
                        }
                        t0Var.i = f1Var;
                    } else if (i11 == 1) {
                        k1 k1Var = new k1(getContext(), j6.H8, f6Var);
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        this.b.a(k1Var, w7.x5.n(-1, 8));
                        t0Var.i = k1Var;
                    } else if (i11 == 2) {
                        f1 f1Var2 = new f1(0, getContext(), this.m0, false, false);
                        f1Var2.g(t0Var.e, t0Var.c, t0Var.d);
                        f1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var2.setRightIcon(R.drawable.msg_arrowright);
                        f1Var2.getRightIcon().setVisibility(t0Var.l);
                        this.b.addView(f1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) f1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        f1Var2.setLayoutParams(layoutParams2);
                        f1Var2.G = new g0(this, this.b.b(t0Var.g), 1);
                        f1Var2.setOnClickListener(new h0(f1Var2, 1));
                        this.b.c = true;
                        Integer num2 = t0Var.m;
                        if (num2 != null && t0Var.n != null) {
                            f1Var2.c(num2.intValue(), t0Var.n.intValue());
                        }
                        t0Var.i = f1Var2;
                    } else if (i11 == 3) {
                        d90 d90Var = new d90(getContext(), null);
                        d90Var.setTag(R.id.fit_width_tag, 1);
                        d90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        d90Var.setTextSize(1, t0Var.h);
                        d90Var.setTextColor(j6.w0(null, j6.E8, false));
                        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        d90Var.setLinkTextColor(j6.w0(null, j6.J6, false));
                        d90Var.setText(t0Var.e);
                        d90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.b.a(d90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        t0Var.i = d90Var;
                    }
                }
                View view4 = t0Var.i;
                if (view4 != null) {
                    view4.setVisibility(t0Var.k);
                    xh xhVar = t0Var.j;
                    if (xhVar != null) {
                        t0Var.i.setOnClickListener(xhVar);
                    }
                }
            }
            f7 = 8.0f;
            this.t0.clear();
        } else {
            f7 = 8.0f;
        }
        if (this.b != null) {
            z zVar = this.c;
            if (zVar == null || !zVar.c || (kVar = zVar.b) == null || kVar.s()) {
                q qVar = this.L;
                if (qVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar);
                    this.L = null;
                }
                n1 n1Var2 = this.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.l0 = v0Var;
                s0 s0Var = this.Q;
                if (s0Var != null) {
                    s0Var.e();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? x5Var = new di.x5(this, getContext(), view);
                    x5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.v ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof f1) || (view instanceof LinearLayout)) {
                        bh.b bVar = this.q0;
                        if (bVar != null) {
                            dh.d c10 = bVar.c(this.b, null, true);
                            c10.n(this.r0);
                            c10.p(AndroidUtilities.dp(12.0f));
                            c10.o(AndroidUtilities.dp(f7));
                            c10.h.e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.x5.c(-2.0f, -1));
                    x5Var.addView(frameLayout, w7.x5.n(-1, -2));
                    x5Var.addView(this.b, w7.x5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = x5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.q0 != null) {
                    n70.U(this.b, j6.l1(0.06f, j6.v0(j6.E8, f6Var)));
                }
                n1 n1Var3 = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = n1Var3;
                if (this.V) {
                    n1Var3.setAnimationStyle(0);
                } else {
                    n1Var3.setAnimationStyle(R.style.PopupAnimation);
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.e0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        n1 n1Var4;
                        v0 v0Var2 = v0.this;
                        v0Var2.getClass();
                        if (i12 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (n1Var4 = v0Var2.d) == null || !n1Var4.isShowing()) {
                            return false;
                        }
                        v0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.f0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        s0 s0Var2 = v0.this.Q;
                        if (s0Var2 != null) {
                            s0Var2.d();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(wl.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                O(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                j1 j1Var = this.b.L;
                int childCount = j1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = j1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = j1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof f1) {
                            ((f1) childAt3).j(childAt3 == view2 || z11, childAt3 == view5);
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
                if (this.f.getChildAt(i10) instanceof u0) {
                    ((u0) this.f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        f6 f6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
                if (this.b.L.getChildAt(i11) instanceof f1) {
                    ((f1) this.b.L.getChildAt(i11)).setSelectorColor(j6.v0(j6.I5, f6Var));
                }
            }
        }
        di.h2 h2Var = this.e;
        if (h2Var != null) {
            int i12 = j6.C8;
            h2Var.setCursorColor(j6.v0(i12, f6Var));
            this.e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.e.setTextColor(j6.v0(i12, f6Var));
            this.e.setHighlightColor(j6.v0(j6.uf, f6Var));
            this.e.setHandlesColor(j6.v0(j6.vf, f6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.b.getMeasuredHeight());
            i10 = zVar.getPaddingTop();
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
        if (zVar != null) {
            k kVar = zVar.b;
            if (this.M == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12, -1, -1);
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

    public final k1 a(int i10) {
        o();
        k1 k1Var = new k1(getContext(), j6.H8, this.m0);
        if (i10 != -1) {
            k1Var.setTag(Integer.valueOf(i10));
        }
        k1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(k1Var, w7.x5.n(-1, 8));
        return k1Var;
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

    public final f1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, f6 f6Var) {
        o();
        f1 f1Var = new f1(z11 ? 1 : 0, getContext(), f6Var, false, false);
        f1Var.g(charSequence, i11, drawable);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setTag(Integer.valueOf(i10));
        this.b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.setOnClickListener(new bi.w2(2, this, z10));
        return f1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final f1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.m0);
    }

    public final f1 f(int i10, int i11, String str, f6 f6Var) {
        return d(i10, i11, null, str, true, false, f6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(j6.v0(j6.E8, this.m0));
        textView.setBackgroundDrawable(j6.K0(false));
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
        textView.setOnClickListener(new b0(this, 3));
    }

    public View getContentView() {
        aj0 aj0Var = this.x;
        return aj0Var != null ? aj0Var : this.E;
    }

    public aj0 getIconView() {
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
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(j6.K0(false));
    }

    public final f1 i(int i10, u11 u11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
        f1Var.g(str, i10, u11Var);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.G = new g0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        f1Var.setOnClickListener(new h0(f1Var, 0));
        this.b.c = true;
        return f1Var;
    }

    public final void j() {
        g5 g5Var;
        TextView textView;
        g5 g5Var2;
        if (this.s != null) {
            boolean p5 = p();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!p5 && TextUtils.isEmpty(this.e.getText()) && (((g5Var = this.H) == null || !g5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((g5Var2 = this.H) != null && !g5Var2.r())))) {
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
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.d0
                        public final /* synthetic */ v0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    v0 v0Var = this.b;
                                    v0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var2 = this.b;
                                    v0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new l0(this, 0));
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
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.d0
                        public final /* synthetic */ v0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    v0 v0Var = this.b;
                                    v0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var2 = this.b;
                                    v0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<k0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new l0(this, 1));
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
            q0 q0Var = new q0(this, getContext(), 0);
            this.F = q0Var;
            q0Var.setClipChildren(this.n0 != 0);
            this.a = null;
            q0 q0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.x5.m(1.0f, 0, -1, this.n0 + 6, 0, 0);
            z zVar = this.c;
            zVar.addView(q0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = j6.C8;
            f6 f6Var = this.m0;
            textView2.setTextColor(j6.v0(i10, f6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            di.h2 h2Var = new di.h2(this, getContext(), 2);
            this.e = h2Var;
            h2Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            this.e.setCursorColor(j6.v0(i10, f6Var));
            this.e.setTextSize(1, 18.0f);
            this.e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.e.setTextColor(j6.v0(i10, f6Var));
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | TLObject.FLAG_19);
            if (Build.VERSION.SDK_INT < 23) {
                this.e.setCustomSelectionActionModeCallback(new ji.c1(1));
            }
            this.e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.ActionBar.a0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                    if (keyEvent == null) {
                        return false;
                    }
                    if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                        return false;
                    }
                    v0 v0Var = v0.this;
                    AndroidUtilities.hideKeyboard(v0Var.e);
                    g5 g5Var = v0Var.H;
                    if (g5Var == null) {
                        return false;
                    }
                    g5Var.p(v0Var.e);
                    return false;
                }
            });
            this.e.addTextChangedListener(new j0(this));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            this.e.setHighlightColor(j6.v0(j6.uf, f6Var));
            this.e.setHandlesColor(j6.v0(j6.vf, f6Var));
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
                this.F.addView(this.f, w7.x5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, w7.x5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.x5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.h, w7.x5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, w7.x5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f, w7.x5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            k0 k0Var = new k0(this, getContext(), 0);
            this.s = k0Var;
            di.j2 j2Var = new di.j2(1, this);
            this.W = j2Var;
            k0Var.setImageDrawable(j2Var);
            this.s.setBackground(j6.f0(zVar.b.q0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new b0(this, 0));
            this.s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.s, w7.x5.e(48, -1, 21));
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
            if (((hg.q0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void n() {
        n1 n1Var = this.d;
        if (n1Var == null || !n1Var.isShowing()) {
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
        bh.b bVar = this.q0;
        if (bVar != null) {
            dh.d c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(this.r0);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ActionBar.i0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n1 n1Var;
                v0 v0Var = v0.this;
                v0Var.getClass();
                if (motionEvent.getActionMasked() != 0 || (n1Var = v0Var.d) == null || !n1Var.isShowing()) {
                    return false;
                }
                view.getHitRect(v0Var.I);
                if (v0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                v0Var.d.d(true);
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
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.isShowing()) {
            O(false, true);
        }
        g5 g5Var = this.H;
        if (g5Var != null) {
            g5Var.l();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.c0 && q() && ((n1Var3 = this.d) == null || !n1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.L = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            n1 n1Var4 = this.d;
            if (n1Var4 != null && n1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.K;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.K.getTag()).intValue());
                    } else {
                        r0 r0Var = this.P;
                        if (r0Var != null) {
                            r0Var.m(((Integer) this.K.getTag()).intValue());
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
        } else if (this.f0 && q() && ((n1Var2 = this.d) == null || !n1Var2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                M(null, null);
                return true;
            }
        } else if (this.f0 && (n1Var = this.d) != null && n1Var.isShowing()) {
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
                if (((hg.q0) arrayList.get(i10)).h) {
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
        t0 t0Var = hashMap == null ? null : (t0) hashMap.get(Integer.valueOf(i10));
        if (t0Var != null) {
            t0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public final boolean s() {
        q0 q0Var = this.F;
        return q0Var != null && q0Var.getVisibility() == 0;
    }

    public void setAdditionalXOffset(int i10) {
        this.b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.a0 = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.P = r0Var;
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
        aj0 aj0Var = this.x;
        if (aj0Var == null) {
            return;
        }
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        this.y = 0;
    }

    public void setIconColor(int i10) {
        aj0 aj0Var = this.x;
        if (aj0Var != null) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        k0 k0Var = this.s;
        if (k0Var != null) {
            k0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        n1 n1Var = this.d;
        if (n1Var != null) {
            n1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.c0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(v0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        n1 n1Var = this.d;
        if (n1Var != null) {
            n1Var.b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        int childCount = j1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j1Var.getChildAt(i11);
            if (childAt instanceof f1) {
                ((f1) childAt).setSelectorColor(i10);
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
        q0 q0Var = this.F;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            this.F.setClipChildren(this.n0 != 0);
            q0 q0Var2 = this.F;
            q0Var2.setLayoutParams(q0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        di.j2 j2Var = this.W;
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

    public void setSubMenuDelegate(s0 s0Var) {
        this.Q = s0Var;
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
        n1 n1Var = this.d;
        return n1Var != null && n1Var.isShowing();
    }

    public final t0 u(int i10, int i11, String str) {
        t0 t0Var = new t0(0);
        t0Var.b = i10;
        t0Var.c = i11;
        t0Var.d = null;
        t0Var.e = str;
        t0Var.f = true;
        A(t0Var);
        return t0Var;
    }

    public final void v(xi0 xi0Var, String str) {
        t0 t0Var = new t0(0);
        t0Var.b = 29;
        t0Var.c = 0;
        t0Var.d = xi0Var;
        t0Var.e = str;
        t0Var.f = true;
        A(t0Var);
    }

    public final t0 w(int i10, mo moVar) {
        t0 t0Var = new t0(2);
        t0Var.c = i10;
        t0Var.d = null;
        t0Var.e = null;
        t0Var.g = moVar;
        A(t0Var);
        return t0Var;
    }

    public final t0 x() {
        t0 t0Var = new t0(3);
        t0Var.e = "";
        t0Var.h = 13;
        A(t0Var);
        return t0Var;
    }

    public final void y() {
        ArrayList arrayList = this.g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new n0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) pr.g);
            transitionSet.addListener((Transition.TransitionListener) new o0(this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i10 = 0;
            while (i10 < this.f.getChildCount()) {
                if (!arrayList2.remove(((u0) this.f.getChildAt(i10)).getFilter())) {
                    this.f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            hg.q0 q0Var2 = (hg.q0) arrayList2.get(i11);
            q0Var2.getClass();
            u0 u0Var = new u0(getContext(), this.m0);
            u0Var.setData(q0Var2);
            u0Var.setOnClickListener(new bi.u1(16, this, u0Var));
            this.f.addView(u0Var, w7.x5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i12 = 0;
            while (i12 < this.f.getChildCount()) {
                ((u0) this.f.getChildAt(i12)).setExpanded(i12 == this.h0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.F;
        if (q0Var == null || q0Var.getVisibility() == 0 || (zVar = this.c) == null) {
            return;
        }
        zVar.b.v(L(z10));
    }

    public v0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public v0(Context context, z zVar, int i10, int i11, boolean z10, f6 f6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = -1;
        this.i0 = new AnimationNotificationsLocker();
        this.m0 = f6Var;
        if (i10 != 0) {
            setBackgroundDrawable(j6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.c = zVar;
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
            addView(textView, w7.x5.c(-1.0f, -2));
            return;
        }
        aj0 aj0Var = new aj0(context);
        this.x = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setImportantForAccessibility(2);
        addView(aj0Var, w7.x5.c(-1.0f, -1));
        if (i11 != 0) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.x;
        if (aj0Var == null) {
            return;
        }
        this.y = i10;
        aj0Var.setImageResource(i10);
    }
}
