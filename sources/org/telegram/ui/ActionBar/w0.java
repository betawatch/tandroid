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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.x11;
import org.telegram.ui.sh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class w0 extends FrameLayout {
    public final TextView B;
    public r0 C;
    public boolean D;
    public h5 E;
    public Rect F;
    public int[] G;
    public View H;
    public p I;
    public int J;
    public int K;
    public int L;
    public s0 M;
    public t0 N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public m0 T;
    public int U;
    public int V;
    public boolean W;
    public FrameLayout a;
    public boolean a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public boolean b0;
    public final z c;
    public boolean c0;
    public p1 d;
    public final ArrayList d0;
    public kg.f e;
    public int e0;
    public LinearLayout f;
    public final AnimationNotificationsLocker f0;
    public float g0;
    public TextView h;
    public float h0;
    public View i0;
    public final f6 j0;
    public int k0;
    public View.OnClickListener l0;
    public boolean m0;
    public CharSequence n;
    public ng.a n0;
    public qg.d o0;
    public AnimatorSet p0;
    public ArrayList q0;
    public CharSequence r;
    public HashMap r0;
    public l0 s;
    public AnimatorSet v;
    public View w;
    public final jj0 x;
    public int y;

    public w0(Context context, int i10, int i11, boolean z4) {
        this(context, null, i10, i11, z4, null);
    }

    public static g1 c(boolean z4, boolean z10, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z11, f6 f6Var) {
        g1 g1Var = new g1(z11 ? 1 : 0, viewGroup.getContext(), f6Var, z4, z10);
        g1Var.g(charSequence, i10, null);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        return g1Var;
    }

    public final u0 A(u0 u0Var) {
        if (this.q0 == null) {
            this.q0 = new ArrayList();
        }
        this.q0.add(u0Var);
        if (this.r0 == null) {
            this.r0 = new HashMap();
        }
        this.r0.put(Integer.valueOf(u0Var.b), u0Var);
        return u0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i10) {
            return;
        }
        this.b.setBackgroundColor(i10);
        p1 p1Var = this.d;
        if (p1Var == null || !p1Var.isShowing()) {
            return;
        }
        this.b.invalidate();
    }

    public final void C(tf.e0 e0Var) {
        if (e0Var.h) {
            this.d0.remove(e0Var);
            int i10 = this.e0;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.e0 = r0.size() - 1;
            }
            y();
            this.e.hideActionMode();
        }
    }

    public final void D() {
        this.O = false;
    }

    public final void E(ng.a aVar, qg.d dVar) {
        this.n0 = aVar;
        this.o0 = dVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || aVar == null) {
            return;
        }
        pg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(12.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
    }

    public final void F() {
        if (this.c == null) {
            return;
        }
        this.D = true;
    }

    public final void G(int i10, boolean z4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
        int childCount = l1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = l1Var.getChildAt(i11);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i10);
            } else if (childAt instanceof g1) {
                if (z4) {
                    ((g1) childAt).setIconColor(i10);
                } else {
                    ((g1) childAt).setTextColor(i10);
                }
            }
        }
    }

    public final void H(CharSequence charSequence, boolean z4) {
        this.r = charSequence;
        if (this.h == null) {
            return;
        }
        this.a0 = z4;
        this.e.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.e.setSelection(charSequence.length());
    }

    public final void I(int i10, boolean z4) {
        if (z4) {
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
        HashMap hashMap = this.r0;
        u0 u0Var = hashMap == null ? null : (u0) hashMap.get(Integer.valueOf(i10));
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        org.telegram.ui.b.p(findViewWithTag.animate().alpha(1.0f), mr.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public final boolean L(boolean z4) {
        z zVar;
        jj0 iconView;
        Animator h;
        k();
        h5 h5Var = this.E;
        int i10 = 0;
        if (this.C == null || !(h5Var == null || h5Var.c())) {
            return false;
        }
        h5 h5Var2 = this.E;
        int i11 = 1;
        if (h5Var2 != null && (h = h5Var2.h()) != null) {
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
            if ((childAt instanceof w0) && (iconView = ((w0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i12++;
        }
        Object tag = this.C.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.C.setVisibility(0);
            this.C.setAlpha(0.0f);
            AnimatorSet animatorSet = this.p0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.p0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.p0 = animatorSet2;
            r0 r0Var = this.C;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(r0Var, (Property<r0, Float>) property, r0Var.getAlpha(), 1.0f));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.p0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), (Property<View, Float>) property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
            }
            this.p0.setDuration(150L);
            this.p0.addListener(new o0(this, arrayList, i11));
            this.p0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z4) {
                AndroidUtilities.showKeyboard(this.e);
            }
            this.C.setTag(1);
            h5 h5Var3 = this.E;
            if (h5Var3 != null) {
                h5Var3.n();
            }
            return true;
        }
        this.C.setTag(null);
        AnimatorSet animatorSet3 = this.p0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.p0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p0 = animatorSet4;
        r0 r0Var2 = this.C;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var2, (Property<r0, Float>) property, r0Var2.getAlpha(), 0.0f));
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((View) arrayList.get(i14)).setAlpha(0.0f);
            this.p0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i14), (Property<View, Float>) property, ((View) arrayList.get(i14)).getAlpha(), 1.0f));
        }
        this.p0.setDuration(150L);
        this.p0.addListener(new o0(this, arrayList, i10));
        this.p0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.d0;
        if (!arrayList2.isEmpty() && this.E != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                if (((tf.e0) arrayList2.get(i15)).h) {
                    this.E.o((tf.e0) arrayList2.get(i15));
                }
            }
        }
        h5 h5Var4 = this.E;
        if (h5Var4 != null) {
            h5Var4.m();
        }
        if (z4) {
            AndroidUtilities.hideKeyboard(this.e);
        }
        zVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.ViewGroup, android.widget.LinearLayout, dg.k0] */
    public final void M(View view, w0 w0Var) {
        float f10;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        p1 p1Var = this.d;
        f6 f6Var = this.j0;
        View view2 = null;
        if ((p1Var == null || !p1Var.isShowing()) && this.q0 != null) {
            for (int i10 = 0; i10 < this.q0.size(); i10++) {
                u0 u0Var = (u0) this.q0.get(i10);
                u0Var.getClass();
                o();
                View view3 = u0Var.i;
                if (view3 != null) {
                    this.b.addView(view3);
                } else {
                    int i11 = u0Var.a;
                    if (i11 == 0) {
                        g1 g1Var = new g1(0, getContext(), this.j0, false, false);
                        g1Var.g(u0Var.e, u0Var.c, u0Var.d);
                        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var.setTag(Integer.valueOf(u0Var.b));
                        this.b.addView(g1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        g1Var.setLayoutParams(layoutParams);
                        g1Var.setOnClickListener(new org.telegram.messenger.video.g(2, u0Var, this));
                        Integer num = u0Var.m;
                        if (num != null && u0Var.n != null) {
                            g1Var.c(num.intValue(), u0Var.n.intValue());
                        }
                        u0Var.i = g1Var;
                    } else if (i11 == 1) {
                        m1 m1Var = new m1(getContext(), j6.H8, f6Var);
                        m1Var.setTag(R.id.fit_width_tag, 1);
                        this.b.a(m1Var, k7.b6.n(-1, 8));
                        u0Var.i = m1Var;
                    } else if (i11 == 2) {
                        g1 g1Var2 = new g1(0, getContext(), this.j0, false, false);
                        g1Var2.g(u0Var.e, u0Var.c, u0Var.d);
                        g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var2.setRightIcon(R.drawable.msg_arrowright);
                        g1Var2.getRightIcon().setVisibility(u0Var.l);
                        this.b.addView(g1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        g1Var2.setLayoutParams(layoutParams2);
                        g1Var2.D = new g0(this, this.b.b(u0Var.g), 1);
                        g1Var2.setOnClickListener(new h0(g1Var2, 1));
                        this.b.c = true;
                        Integer num2 = u0Var.m;
                        if (num2 != null && u0Var.n != null) {
                            g1Var2.c(num2.intValue(), u0Var.n.intValue());
                        }
                        u0Var.i = g1Var2;
                    } else if (i11 == 3) {
                        f90 f90Var = new f90(getContext(), null);
                        f90Var.setTag(R.id.fit_width_tag, 1);
                        f90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        f90Var.setTextSize(1, u0Var.h);
                        f90Var.setTextColor(j6.w0(null, j6.E8, false));
                        f90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        f90Var.setLinkTextColor(j6.w0(null, j6.J6, false));
                        f90Var.setText(u0Var.e);
                        f90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.b.a(f90Var, k7.b6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        u0Var.i = f90Var;
                    }
                }
                View view4 = u0Var.i;
                if (view4 != null) {
                    view4.setVisibility(u0Var.k);
                    sh shVar = u0Var.j;
                    if (shVar != null) {
                        u0Var.i.setOnClickListener(shVar);
                    }
                }
            }
            f10 = 8.0f;
            this.q0.clear();
        } else {
            f10 = 8.0f;
        }
        if (this.b != null) {
            z zVar = this.c;
            if (zVar == null || !zVar.c || (kVar = zVar.b) == null || kVar.s()) {
                p pVar = this.I;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.I = null;
                }
                p1 p1Var2 = this.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.i0 = w0Var;
                t0 t0Var = this.N;
                if (t0Var != null) {
                    t0Var.e();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? k0Var = new dg.k0(this, getContext(), view);
                    k0Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.v ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        ng.a aVar = this.n0;
                        if (aVar != null) {
                            pg.b c3 = aVar.c(this.b, null, true);
                            c3.n(this.o0);
                            c3.p(AndroidUtilities.dp(12.0f));
                            c3.o(AndroidUtilities.dp(f10));
                            c3.h.e = true;
                            frameLayout.setBackground(c3);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, k7.b6.c(-2.0f, -1));
                    k0Var.addView(frameLayout, k7.b6.n(-1, -2));
                    k0Var.addView(this.b, k7.b6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = k0Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.n0 != null) {
                    p70.U(this.b, j6.l1(0.06f, j6.v0(j6.E8, f6Var)));
                }
                p1 p1Var3 = new p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = p1Var3;
                if (this.S) {
                    p1Var3.setAnimationStyle(0);
                } else {
                    p1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z4 = this.S;
                if (!z4) {
                    this.d.b = z4;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.R) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ActionBar.e0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        p1 p1Var4;
                        w0 w0Var2 = w0.this;
                        w0Var2.getClass();
                        if (i12 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (p1Var4 = w0Var2.d) == null || !p1Var4.isShowing()) {
                            return false;
                        }
                        w0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.f0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        t0 t0Var2 = w0.this.N;
                        if (t0Var2 != null) {
                            t0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.ui.b.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.Q = false;
                this.d.setFocusable(true);
                O(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                l1 l1Var = this.b.I;
                int childCount = l1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = l1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z10 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = l1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof g1) {
                            ((g1) childAt3).j(childAt3 == view2 || z10, childAt3 == view5);
                        }
                        z10 = tag != null;
                    }
                }
                if (this.b.getSwipeBack() != null) {
                    this.b.getSwipeBack().b(false);
                }
                this.d.h();
                float f11 = this.g0;
                if (f11 > 0.0f) {
                    this.d.c(f11);
                }
            }
        }
    }

    public final void N() {
        if (this.f != null) {
            for (int i10 = 0; i10 < this.f.getChildCount(); i10++) {
                if (this.f.getChildAt(i10) instanceof v0) {
                    ((v0) this.f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        f6 f6Var = this.j0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
                if (this.b.I.getChildAt(i11) instanceof g1) {
                    ((g1) this.b.I.getChildAt(i11)).setSelectorColor(j6.v0(j6.I5, f6Var));
                }
            }
        }
        kg.f fVar = this.e;
        if (fVar != null) {
            int i12 = j6.C8;
            fVar.setCursorColor(j6.v0(i12, f6Var));
            this.e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.e.setTextColor(j6.v0(i12, f6Var));
            this.e.setHighlightColor(j6.v0(j6.uf, f6Var));
            this.e.setHandlesColor(j6.v0(j6.vf, f6Var));
        }
    }

    public final void O(boolean z4, boolean z10) {
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.b.getMeasuredHeight());
            i10 = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            i10 = -((int) ((getMeasuredHeight() * scaleY) - ((this.J != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i11 = this.U;
        }
        int i12 = i10 + i11 + this.K;
        if (z4 && (scrollView = this.b.H) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.i0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.b;
            if (this.J == 0) {
                if (z4) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.L, i12);
                }
                if (z10) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.L, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z4) {
                if (this.b0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12);
                }
            }
            if (z10) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.J;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z4) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12);
                }
                if (z10) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (z4) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.V + this.L, i12);
            }
            if (z10) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.V + this.L, i12, -1, -1);
                return;
            }
            return;
        }
        if (z4) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12);
        }
        if (z10) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12, -1, -1);
        }
    }

    public final m1 a(int i10) {
        o();
        m1 m1Var = new m1(getContext(), j6.H8, this.j0);
        if (i10 != -1) {
            m1Var.setTag(Integer.valueOf(i10));
        }
        m1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(m1Var, k7.b6.n(-1, 8));
        return m1Var;
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

    public final g1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z4, boolean z10, f6 f6Var) {
        o();
        g1 g1Var = new g1(z10 ? 1 : 0, getContext(), f6Var, false, false);
        g1Var.g(charSequence, i11, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i10));
        this.b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new nh.a2(2, this, z4));
        return g1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.m0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.j0);
    }

    public final g1 f(int i10, int i11, String str, f6 f6Var) {
        return d(i10, i11, null, str, true, false, f6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(j6.v0(j6.E8, this.j0));
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
        jj0 jj0Var = this.x;
        return jj0Var != null ? jj0Var : this.B;
    }

    public jj0 getIconView() {
        return this.x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.l0;
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
        return this.C;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.e;
    }

    public TextView getTextView() {
        return this.B;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
            View childAt = this.b.I.getChildAt(i11);
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

    public final g1 i(int i10, x11 x11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        g1 g1Var = new g1(0, getContext(), this.j0, false, false);
        g1Var.g(str, i10, x11Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.D = new g0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new h0(g1Var, 0));
        this.b.c = true;
        return g1Var;
    }

    public final void j() {
        h5 h5Var;
        TextView textView;
        h5 h5Var2;
        if (this.s != null) {
            boolean p10 = p();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!p10 && TextUtils.isEmpty(this.e.getText()) && (((h5Var = this.E) == null || !h5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((h5Var2 = this.E) != null && !h5Var2.r())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.a0) {
                        this.s.setAlpha(0.0f);
                        this.s.setRotation(45.0f);
                        this.s.setScaleX(0.0f);
                        this.s.setScaleY(0.0f);
                        this.s.setVisibility(4);
                        this.a0 = true;
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(180L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.d0
                        public final /* synthetic */ w0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    w0 w0Var = this.b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    w0 w0Var2 = this.b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new n0(this, 0));
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
                if (this.a0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ActionBar.d0
                        public final /* synthetic */ w0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    w0 w0Var = this.b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        break;
                                    }
                                    break;
                                default:
                                    w0 w0Var2 = this.b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new n0(this, 1));
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
                this.a0 = true;
            }
        }
    }

    public final void k() {
        if (this.C == null && this.D) {
            r0 r0Var = new r0(this, getContext(), 0);
            this.C = r0Var;
            r0Var.setClipChildren(this.k0 != 0);
            this.a = null;
            r0 r0Var2 = this.C;
            LinearLayout.LayoutParams m9 = k7.b6.m(1.0f, 0, -1, this.k0 + 6, 0, 0);
            z zVar = this.c;
            zVar.addView(r0Var2, 0, m9);
            this.C.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = j6.C8;
            f6 f6Var = this.j0;
            textView2.setTextColor(j6.v0(i10, f6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            kg.f fVar = new kg.f(this, getContext(), 1);
            this.e = fVar;
            fVar.setScrollContainer(false);
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
                this.e.setCustomSelectionActionModeCallback(new j0(0));
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
                    w0 w0Var = w0.this;
                    AndroidUtilities.hideKeyboard(w0Var.e);
                    h5 h5Var = w0Var.E;
                    if (h5Var == null) {
                        return false;
                    }
                    h5Var.p(w0Var.e);
                    return false;
                }
            });
            this.e.addTextChangedListener(new k0(this));
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
                this.C.addView(this.f, k7.b6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.e, k7.b6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.h, k7.b6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.C.addView(this.h, k7.b6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.C.addView(this.e, k7.b6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.f, k7.b6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.s = l0Var;
            m0 m0Var = new m0(0, this);
            this.T = m0Var;
            l0Var.setImageDrawable(m0Var);
            this.s.setBackground(j6.f0(zVar.b.n0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new b0(this, 0));
            this.s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.C.addView(this.s, k7.b6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.b.getItemsCount()) {
                i10 = 8;
                break;
            } else if (this.b.I.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.d0;
            if (i10 >= arrayList.size()) {
                y();
                return;
            }
            if (((tf.e0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void n() {
        p1 p1Var = this.d;
        if (p1Var == null || !p1Var.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    public final void o() {
        if (this.b != null) {
            return;
        }
        this.F = new Rect();
        this.G = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.j0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ng.a aVar = this.n0;
        if (aVar != null) {
            pg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c3.n(this.o0);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
        }
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ActionBar.i0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                p1 p1Var;
                w0 w0Var = w0.this;
                w0Var.getClass();
                if (motionEvent.getActionMasked() != 0 || (p1Var = w0Var.d) == null || !p1Var.isShowing()) {
                    return false;
                }
                view.getHitRect(w0Var.F);
                if (w0Var.F.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                w0Var.d.d(true);
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
        TextView textView = this.B;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        p1 p1Var = this.d;
        if (p1Var != null && p1Var.isShowing()) {
            O(false, true);
        }
        h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.l();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.W && q() && ((p1Var3 = this.d) == null || !p1Var3.isShowing())) {
                p pVar = new p(this, 1);
                this.I = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            p1 p1Var4 = this.d;
            if (p1Var4 != null && p1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.H;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.H.getTag()).intValue());
                    } else {
                        s0 s0Var = this.M;
                        if (s0Var != null) {
                            s0Var.m(((Integer) this.H.getTag()).intValue());
                        }
                    }
                    this.d.d(this.O);
                } else if (this.c0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.H;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.H = null;
                }
            }
        } else if (this.c0 && q() && ((p1Var2 = this.d) == null || !p1Var2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                M(null, null);
                return true;
            }
        } else if (this.c0 && (p1Var = this.d) != null && p1Var.isShowing()) {
            getLocationOnScreen(this.G);
            float x10 = motionEvent.getX() + this.G[0];
            float y10 = motionEvent.getY();
            float f10 = y10 + r5[1];
            this.b.getLocationOnScreen(this.G);
            int[] iArr = this.G;
            float f11 = x10 - iArr[0];
            float f12 = f10 - iArr[1];
            this.H = null;
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                View childAt = this.b.I.getChildAt(i10);
                childAt.getHitRect(this.F);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.F.contains((int) f11, (int) f12)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f11, f12 - childAt.getTop());
                        this.H = childAt;
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
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((tf.e0) arrayList.get(i10)).h) {
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
        ArrayList arrayList = this.q0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void r(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.r0;
        u0 u0Var = hashMap == null ? null : (u0) hashMap.get(Integer.valueOf(i10));
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 8) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public final boolean s() {
        r0 r0Var = this.C;
        return r0Var != null && r0Var.getVisibility() == 0;
    }

    public void setAdditionalXOffset(int i10) {
        this.V = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.U = i10;
    }

    public void setDelegate(s0 s0Var) {
        this.M = s0Var;
    }

    public void setDimMenu(float f10) {
        this.g0 = f10;
    }

    public void setFitSubItems(boolean z4) {
        this.b.setFitItems(z4);
    }

    public void setFixBackground(boolean z4) {
        this.m0 = z4;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z4) {
        this.b0 = z4;
    }

    public void setIcon(Drawable drawable) {
        jj0 jj0Var = this.x;
        if (jj0Var == null) {
            return;
        }
        if (drawable instanceof gj0) {
            jj0Var.setAnimation((gj0) drawable);
        } else {
            jj0Var.setImageDrawable(drawable);
        }
        this.y = 0;
    }

    public void setIconColor(int i10) {
        jj0 jj0Var = this.x;
        if (jj0Var != null) {
            jj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        l0 l0Var = this.s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z4) {
        this.R = z4;
    }

    public void setLongClickEnabled(boolean z4) {
        this.W = z4;
    }

    public void setMenuXOffset(int i10) {
        this.L = i10;
    }

    public void setMenuYOffset(int i10) {
        this.K = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.l0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ActionBar.c0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(w0.this.Q));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z4) {
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.b = z4;
        }
        this.S = z4;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
        int childCount = l1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = l1Var.getChildAt(i11);
            if (childAt instanceof g1) {
                ((g1) childAt).setSelectorColor(i10);
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
        this.k0 = i10;
        r0 r0Var = this.C;
        if (r0Var != null) {
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            this.C.setClipChildren(this.k0 != 0);
            r0 r0Var2 = this.C;
            r0Var2.setLayoutParams(r0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z4) {
        m0 m0Var = this.T;
        if (m0Var == null) {
            return;
        }
        if (!z4) {
            m0Var.e = false;
            return;
        }
        m0Var.e = true;
        m0Var.b = System.currentTimeMillis();
        m0Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z4) {
        this.c0 = z4;
    }

    public void setShowedFromBottom(boolean z4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z4);
    }

    public void setSubMenuDelegate(t0 t0Var) {
        this.N = t0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.J = i10;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.B;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.h0 = f10;
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.h0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final boolean t() {
        p1 p1Var = this.d;
        return p1Var != null && p1Var.isShowing();
    }

    public final u0 u(int i10, int i11, String str) {
        u0 u0Var = new u0(0);
        u0Var.b = i10;
        u0Var.c = i11;
        u0Var.d = null;
        u0Var.e = str;
        u0Var.f = true;
        A(u0Var);
        return u0Var;
    }

    public final void v(gj0 gj0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.b = 29;
        u0Var.c = 0;
        u0Var.d = gj0Var;
        u0Var.e = str;
        u0Var.f = true;
        A(u0Var);
    }

    public final u0 w(int i10, io ioVar) {
        u0 u0Var = new u0(2);
        u0Var.c = i10;
        u0Var.d = null;
        u0Var.e = null;
        u0Var.g = ioVar;
        A(u0Var);
        return u0Var;
    }

    public final u0 x() {
        u0 u0Var = new u0(3);
        u0Var.e = "";
        u0Var.h = 13;
        A(u0Var);
        return u0Var;
    }

    public final void y() {
        ArrayList arrayList = this.d0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        r0 r0Var = this.C;
        if (r0Var != null && r0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new eg.j0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) mr.g);
            transitionSet.addListener((Transition.TransitionListener) new p0(this));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i10 = 0;
            while (i10 < this.f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f.getChildAt(i10)).getFilter())) {
                    this.f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            tf.e0 e0Var = (tf.e0) arrayList2.get(i11);
            e0Var.getClass();
            v0 v0Var = new v0(getContext(), this.j0);
            v0Var.setData(e0Var);
            v0Var.setOnClickListener(new org.telegram.messenger.video.g(1, this, v0Var));
            this.f.addView(v0Var, k7.b6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i12 = 0;
            while (i12 < this.f.getChildCount()) {
                ((v0) this.f.getChildAt(i12)).setExpanded(i12 == this.e0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x10 = this.e.getX();
        if (this.C.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new q0(this, x10));
        }
        j();
    }

    public final void z(boolean z4) {
        z zVar;
        k();
        r0 r0Var = this.C;
        if (r0Var == null || r0Var.getVisibility() == 0 || (zVar = this.c) == null) {
            return;
        }
        zVar.b.v(L(z4));
    }

    public w0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public w0(Context context, z zVar, int i10, int i11, boolean z4, f6 f6Var) {
        super(context);
        new ArrayList();
        this.O = true;
        this.S = true;
        this.a0 = true;
        this.c0 = true;
        this.d0 = new ArrayList();
        this.e0 = -1;
        this.f0 = new AnimationNotificationsLocker();
        this.j0 = f6Var;
        if (i10 != 0) {
            setBackgroundDrawable(j6.f0(i10, z4 ? 5 : 1, -1));
        }
        this.c = zVar;
        if (z4) {
            TextView textView = new TextView(context);
            this.B = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, k7.b6.c(-1.0f, -2));
            return;
        }
        jj0 jj0Var = new jj0(context);
        this.x = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.setImportantForAccessibility(2);
        addView(jj0Var, k7.b6.c(-1.0f, -1));
        if (i11 != 0) {
            jj0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        jj0 jj0Var = this.x;
        if (jj0Var == null) {
            return;
        }
        this.y = i10;
        jj0Var.setImageResource(i10);
    }
}
