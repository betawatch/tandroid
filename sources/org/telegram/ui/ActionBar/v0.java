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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.nh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout {
    public final TextView A;
    public q0 B;
    public boolean C;
    public e5 D;
    public Rect E;
    public int[] F;
    public View G;
    public p H;
    public int I;
    public int J;
    public int K;
    public r0 L;
    public s0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public lh.c2 S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public FrameLayout a;
    public boolean a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public boolean b0;
    public final z c;
    public final ArrayList c0;
    public n1 d;
    public int d0;
    public gg.g e;
    public final AnimationNotificationsLocker e0;
    public LinearLayout f;
    public float f0;
    public float g0;
    public TextView h;
    public View h0;
    public final c6 i0;
    public int j0;
    public View.OnClickListener k0;
    public boolean l0;
    public jg.a m0;
    public CharSequence n;
    public mg.d n0;
    public AnimatorSet o0;
    public ArrayList p0;
    public HashMap q0;
    public CharSequence r;
    public l0 s;
    public AnimatorSet v;
    public View w;
    public final ri0 x;
    public int y;

    public v0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static f1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, c6 c6Var) {
        f1 f1Var = new f1(z12 ? 1 : 0, viewGroup.getContext(), c6Var, z10, z11);
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
        if (this.p0 == null) {
            this.p0 = new ArrayList();
        }
        this.p0.add(t0Var);
        if (this.q0 == null) {
            this.q0 = new HashMap();
        }
        this.q0.put(Integer.valueOf(t0Var.b), t0Var);
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

    public final void C(pf.e0 e0Var) {
        if (e0Var.h) {
            this.c0.remove(e0Var);
            int i10 = this.d0;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.d0 = r0.size() - 1;
            }
            y();
            this.e.hideActionMode();
        }
    }

    public final void D() {
        this.N = false;
    }

    public final void E(jg.a aVar, mg.d dVar) {
        this.m0 = aVar;
        this.n0 = dVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || aVar == null) {
            return;
        }
        lg.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(12.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
    }

    public final void F() {
        if (this.c == null) {
            return;
        }
        this.C = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
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
        this.W = z10;
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
        HashMap hashMap = this.q0;
        t0 t0Var = hashMap == null ? null : (t0) hashMap.get(Integer.valueOf(i10));
        if (t0Var != null) {
            t0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || findViewWithTag.getVisibility() == 0) {
            return;
        }
        findViewWithTag.setAlpha(0.0f);
        rl.o(findViewWithTag.animate().alpha(1.0f), er.f, 150L);
        findViewWithTag.setVisibility(0);
    }

    public final boolean L(boolean z10) {
        z zVar;
        ri0 iconView;
        Animator h;
        k();
        e5 e5Var = this.D;
        int i10 = 0;
        if (this.B == null || !(e5Var == null || e5Var.c())) {
            return false;
        }
        e5 e5Var2 = this.D;
        int i11 = 1;
        if (e5Var2 != null && (h = e5Var2.h()) != null) {
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
        Object tag = this.B.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.B.setVisibility(0);
            this.B.setAlpha(0.0f);
            AnimatorSet animatorSet = this.o0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.o0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.o0 = animatorSet2;
            q0 q0Var = this.B;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<q0, Float>) property, q0Var.getAlpha(), 1.0f));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), (Property<View, Float>) property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
            }
            this.o0.setDuration(150L);
            this.o0.addListener(new n0(this, arrayList, i11));
            this.o0.start();
            setVisibility(8);
            m();
            this.e.setText("");
            this.e.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.e);
            }
            this.B.setTag(1);
            e5 e5Var3 = this.D;
            if (e5Var3 != null) {
                e5Var3.n();
            }
            return true;
        }
        this.B.setTag(null);
        AnimatorSet animatorSet3 = this.o0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.o0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o0 = animatorSet4;
        q0 q0Var2 = this.B;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, (Property<q0, Float>) property, q0Var2.getAlpha(), 0.0f));
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((View) arrayList.get(i14)).setAlpha(0.0f);
            this.o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i14), (Property<View, Float>) property, ((View) arrayList.get(i14)).getAlpha(), 1.0f));
        }
        this.o0.setDuration(150L);
        this.o0.addListener(new n0(this, arrayList, i10));
        this.o0.start();
        this.e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.c0;
        if (!arrayList2.isEmpty() && this.D != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                if (((pf.e0) arrayList2.get(i15)).h) {
                    this.D.o((pf.e0) arrayList2.get(i15));
                }
            }
        }
        e5 e5Var4 = this.D;
        if (e5Var4 != null) {
            e5Var4.m();
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.e);
        }
        zVar.requestLayout();
        requestLayout();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.ViewGroup, android.widget.LinearLayout, lh.m5] */
    public final void M(View view, v0 v0Var) {
        float f10;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        View childAt;
        k kVar;
        n1 n1Var = this.d;
        c6 c6Var = this.i0;
        View view2 = null;
        if ((n1Var == null || !n1Var.isShowing()) && this.p0 != null) {
            for (int i10 = 0; i10 < this.p0.size(); i10++) {
                t0 t0Var = (t0) this.p0.get(i10);
                t0Var.getClass();
                o();
                View view3 = t0Var.i;
                if (view3 != null) {
                    this.b.addView(view3);
                } else {
                    int i11 = t0Var.a;
                    if (i11 == 0) {
                        f1 f1Var = new f1(0, getContext(), this.i0, false, false);
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
                        f1Var.setOnClickListener(new nh.x1(5, t0Var, this));
                        Integer num = t0Var.m;
                        if (num != null && t0Var.n != null) {
                            f1Var.c(num.intValue(), t0Var.n.intValue());
                        }
                        t0Var.i = f1Var;
                    } else if (i11 == 1) {
                        k1 k1Var = new k1(getContext(), g6.H8, c6Var);
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        this.b.a(k1Var, h7.z5.n(-1, 8));
                        t0Var.i = k1Var;
                    } else if (i11 == 2) {
                        f1 f1Var2 = new f1(0, getContext(), this.i0, false, false);
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
                        f1Var2.C = new g0(this, this.b.b(t0Var.g), 1);
                        f1Var2.setOnClickListener(new h0(f1Var2, 1));
                        this.b.c = true;
                        Integer num2 = t0Var.m;
                        if (num2 != null && t0Var.n != null) {
                            f1Var2.c(num2.intValue(), t0Var.n.intValue());
                        }
                        t0Var.i = f1Var2;
                    } else if (i11 == 3) {
                        p80 p80Var = new p80(getContext(), null);
                        p80Var.setTag(R.id.fit_width_tag, 1);
                        p80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        p80Var.setTextSize(1, t0Var.h);
                        p80Var.setTextColor(g6.w0(null, g6.E8, false));
                        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
                        p80Var.setLinkTextColor(g6.w0(null, g6.J6, false));
                        p80Var.setText(t0Var.e);
                        p80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.b.a(p80Var, h7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        t0Var.i = p80Var;
                    }
                }
                View view4 = t0Var.i;
                if (view4 != null) {
                    view4.setVisibility(t0Var.k);
                    nh nhVar = t0Var.j;
                    if (nhVar != null) {
                        t0Var.i.setOnClickListener(nhVar);
                    }
                }
            }
            f10 = 8.0f;
            this.p0.clear();
        } else {
            f10 = 8.0f;
        }
        if (this.b != null) {
            z zVar = this.c;
            if (zVar == null || !zVar.c || (kVar = zVar.b) == null || kVar.t()) {
                p pVar = this.H;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.H = null;
                }
                n1 n1Var2 = this.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.h0 = v0Var;
                s0 s0Var = this.M;
                if (s0Var != null) {
                    s0Var.d();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? m5Var = new lh.m5(this, getContext(), view);
                    m5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.b.v ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof f1) || (view instanceof LinearLayout)) {
                        jg.a aVar = this.m0;
                        if (aVar != null) {
                            lg.d c10 = aVar.c(this.b, null, true);
                            c10.n(this.n0);
                            c10.p(AndroidUtilities.dp(12.0f));
                            c10.o(AndroidUtilities.dp(f10));
                            c10.h.e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, h7.z5.c(-2.0f, -1));
                    m5Var.addView(frameLayout, h7.z5.n(-1, -2));
                    m5Var.addView(this.b, h7.z5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = m5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.m0 != null) {
                    b70.U(this.b, g6.l1(0.06f, g6.v0(g6.E8, c6Var)));
                }
                n1 n1Var3 = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = n1Var3;
                if (this.R) {
                    n1Var3.setAnimationStyle(0);
                } else {
                    n1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z10 = this.R;
                if (!z10) {
                    this.d.b = z10;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.Q) {
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
                        s0 s0Var2 = v0.this.M;
                        if (s0Var2 != null) {
                            s0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(rl.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.P = false;
                this.d.setFocusable(true);
                O(true, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0);
                j1 j1Var = this.b.H;
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
                float f11 = this.f0;
                if (f11 > 0.0f) {
                    this.d.c(f11);
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
        c6 c6Var = this.i0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
                if (this.b.H.getChildAt(i11) instanceof f1) {
                    ((f1) this.b.H.getChildAt(i11)).setSelectorColor(g6.v0(g6.I5, c6Var));
                }
            }
        }
        gg.g gVar = this.e;
        if (gVar != null) {
            int i12 = g6.C8;
            gVar.setCursorColor(g6.v0(i12, c6Var));
            this.e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.e.setTextColor(g6.v0(i12, c6Var));
            this.e.setHighlightColor(g6.v0(g6.uf, c6Var));
            this.e.setHandlesColor(g6.v0(g6.vf, c6Var));
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
            i10 = -((int) ((getMeasuredHeight() * scaleY) - ((this.I != 2 ? getTranslationY() : 0.0f) / scaleY)));
            i11 = this.T;
        }
        int i12 = i10 + i11 + this.J;
        if (z10 && (scrollView = this.b.G) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.h0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.b;
            if (this.I == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i12);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.a0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.I;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i12, -1, -1);
                return;
            }
            return;
        }
        if (z10) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12);
        }
        if (z11) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12, -1, -1);
        }
    }

    public final k1 a(int i10) {
        o();
        k1 k1Var = new k1(getContext(), g6.H8, this.i0);
        if (i10 != -1) {
            k1Var.setTag(Integer.valueOf(i10));
        }
        k1Var.setTag(R.id.fit_width_tag, 1);
        this.b.a(k1Var, h7.z5.n(-1, 8));
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

    public final f1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, c6 c6Var) {
        o();
        f1 f1Var = new f1(z11 ? 1 : 0, getContext(), c6Var, false, false);
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
        f1Var.setOnClickListener(new jh.a2(2, this, z10));
        return f1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.l0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final f1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.i0);
    }

    public final f1 f(int i10, int i11, String str, c6 c6Var) {
        return d(i10, i11, null, str, true, false, c6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(g6.v0(g6.E8, this.i0));
        textView.setBackgroundDrawable(g6.K0(false));
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
        ri0 ri0Var = this.x;
        return ri0Var != null ? ri0Var : this.A;
    }

    public ri0 getIconView() {
        return this.x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.k0;
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
        return this.B;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.e;
    }

    public TextView getTextView() {
        return this.A;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.b.getItemsCount(); i11++) {
            View childAt = this.b.H.getChildAt(i11);
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
        kVar.setBackgroundDrawable(g6.K0(false));
    }

    public final f1 i(int i10, c11 c11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        f1 f1Var = new f1(0, getContext(), this.i0, false, false);
        f1Var.g(str, i10, c11Var);
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
        f1Var.C = new g0(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        f1Var.setOnClickListener(new h0(f1Var, 0));
        this.b.c = true;
        return f1Var;
    }

    public final void j() {
        e5 e5Var;
        TextView textView;
        e5 e5Var2;
        if (this.s != null) {
            boolean p6 = p();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!p6 && TextUtils.isEmpty(this.e.getText()) && (((e5Var = this.D) == null || !e5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((e5Var2 = this.D) != null && !e5Var2.r())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.W) {
                        this.s.setAlpha(0.0f);
                        this.s.setRotation(45.0f);
                        this.s.setScaleX(0.0f);
                        this.s.setScaleY(0.0f);
                        this.s.setVisibility(4);
                        this.W = true;
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
                    duration.playTogether(ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property, 45.0f), ofFloat);
                    duration.addListener(new m0(this, 0));
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
                if (this.W) {
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
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<l0, Float>) property, 0.0f), ofFloat2);
                    duration2.addListener(new m0(this, 1));
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
                this.W = true;
            }
        }
    }

    public final void k() {
        if (this.B == null && this.C) {
            q0 q0Var = new q0(this, getContext(), 0);
            this.B = q0Var;
            q0Var.setClipChildren(this.j0 != 0);
            this.a = null;
            q0 q0Var2 = this.B;
            LinearLayout.LayoutParams m10 = h7.z5.m(1.0f, 0, -1, this.j0 + 6, 0, 0);
            z zVar = this.c;
            zVar.addView(q0Var2, 0, m10);
            this.B.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = g6.C8;
            c6 c6Var = this.i0;
            textView2.setTextColor(g6.v0(i10, c6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            gg.g gVar = new gg.g(this, getContext(), 3);
            this.e = gVar;
            gVar.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            this.e.setCursorColor(g6.v0(i10, c6Var));
            this.e.setTextSize(1, 18.0f);
            this.e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.e.setTextColor(g6.v0(i10, c6Var));
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
                    v0 v0Var = v0.this;
                    AndroidUtilities.hideKeyboard(v0Var.e);
                    e5 e5Var = v0Var.D;
                    if (e5Var == null) {
                        return false;
                    }
                    e5Var.p(v0Var.e);
                    return false;
                }
            });
            this.e.addTextChangedListener(new k0(this));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            this.e.setHighlightColor(g6.v0(g6.uf, c6Var));
            this.e.setHandlesColor(g6.v0(g6.vf, c6Var));
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
                this.B.addView(this.f, h7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.e, h7.z5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.h, h7.z5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.B.addView(this.h, h7.z5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.B.addView(this.e, h7.z5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f, h7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.s = l0Var;
            lh.c2 c2Var = new lh.c2(1, this);
            this.S = c2Var;
            l0Var.setImageDrawable(c2Var);
            this.s.setBackground(g6.f0(zVar.b.m0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new b0(this, 0));
            this.s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.B.addView(this.s, h7.z5.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.b.getItemsCount()) {
                i10 = 8;
                break;
            } else if (this.b.H.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.c0;
            if (i10 >= arrayList.size()) {
                y();
                return;
            }
            if (((pf.e0) arrayList.get(i10)).h) {
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
        this.E = new Rect();
        this.F = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.i0);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        jg.a aVar = this.m0;
        if (aVar != null) {
            lg.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(this.n0);
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
                view.getHitRect(v0Var.E);
                if (v0Var.E.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
        TextView textView = this.A;
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
        e5 e5Var = this.D;
        if (e5Var != null) {
            e5Var.l();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.V && q() && ((n1Var3 = this.d) == null || !n1Var3.isShowing())) {
                p pVar = new p(this, 1);
                this.H = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            n1 n1Var4 = this.d;
            if (n1Var4 != null && n1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.G;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.G.getTag()).intValue());
                    } else {
                        r0 r0Var = this.L;
                        if (r0Var != null) {
                            r0Var.h(((Integer) this.G.getTag()).intValue());
                        }
                    }
                    this.d.d(this.N);
                } else if (this.b0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.G;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.G = null;
                }
            }
        } else if (this.b0 && q() && ((n1Var2 = this.d) == null || !n1Var2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                M(null, null);
                return true;
            }
        } else if (this.b0 && (n1Var = this.d) != null && n1Var.isShowing()) {
            getLocationOnScreen(this.F);
            float x8 = motionEvent.getX() + this.F[0];
            float y10 = motionEvent.getY();
            float f10 = y10 + r5[1];
            this.b.getLocationOnScreen(this.F);
            int[] iArr = this.F;
            float f11 = x8 - iArr[0];
            float f12 = f10 - iArr[1];
            this.G = null;
            for (int i10 = 0; i10 < this.b.getItemsCount(); i10++) {
                View childAt = this.b.H.getChildAt(i10);
                childAt.getHitRect(this.E);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.E.contains((int) f11, (int) f12)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f11, f12 - childAt.getTop());
                        this.G = childAt;
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
        ArrayList arrayList = this.c0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((pf.e0) arrayList.get(i10)).h) {
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
        ArrayList arrayList = this.p0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void r(int i10) {
        View findViewWithTag;
        HashMap hashMap = this.q0;
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
        q0 q0Var = this.B;
        return q0Var != null && q0Var.getVisibility() == 0;
    }

    public void setAdditionalXOffset(int i10) {
        this.U = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.T = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.L = r0Var;
    }

    public void setDimMenu(float f10) {
        this.f0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.l0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.a0 = z10;
    }

    public void setIcon(Drawable drawable) {
        ri0 ri0Var = this.x;
        if (ri0Var == null) {
            return;
        }
        if (drawable instanceof oi0) {
            ri0Var.setAnimation((oi0) drawable);
        } else {
            ri0Var.setImageDrawable(drawable);
        }
        this.y = 0;
    }

    public void setIconColor(int i10) {
        ri0 ri0Var = this.x;
        if (ri0Var != null) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        l0 l0Var = this.s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.Q = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.V = z10;
    }

    public void setMenuXOffset(int i10) {
        this.K = i10;
    }

    public void setMenuYOffset(int i10) {
        this.J = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.k0 = onClickListener;
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
                        callback2.run(Boolean.valueOf(v0.this.P));
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
        this.R = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
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
        this.j0 = i10;
        q0 q0Var = this.B;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            this.B.setClipChildren(this.j0 != 0);
            q0 q0Var2 = this.B;
            q0Var2.setLayoutParams(q0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        lh.c2 c2Var = this.S;
        if (c2Var == null) {
            return;
        }
        if (!z10) {
            c2Var.e = false;
            return;
        }
        c2Var.e = true;
        c2Var.b = System.currentTimeMillis();
        c2Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.b0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(s0 s0Var) {
        this.M = s0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.I = i10;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.g0 = f10;
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.g0);
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

    public final void v(oi0 oi0Var, String str) {
        t0 t0Var = new t0(0);
        t0Var.b = 29;
        t0Var.c = 0;
        t0Var.d = oi0Var;
        t0Var.e = str;
        t0Var.f = true;
        A(t0Var);
    }

    public final t0 w(int i10, ao aoVar) {
        t0 t0Var = new t0(2);
        t0Var.c = i10;
        t0Var.d = null;
        t0Var.e = null;
        t0Var.g = aoVar;
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
        ArrayList arrayList = this.c0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.B;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new ag.u0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) er.g);
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
            pf.e0 e0Var = (pf.e0) arrayList2.get(i11);
            e0Var.getClass();
            u0 u0Var = new u0(getContext(), this.i0);
            u0Var.setData(e0Var);
            u0Var.setOnClickListener(new nh.x1(4, this, u0Var));
            this.f.addView(u0Var, h7.z5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            int i12 = 0;
            while (i12 < this.f.getChildCount()) {
                ((u0) this.f.getChildAt(i12)).setExpanded(i12 == this.d0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setTag(!isEmpty ? 1 : null);
        }
        float x8 = this.e.getX();
        if (this.B.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x8));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.B;
        if (q0Var == null || q0Var.getVisibility() == 0 || (zVar = this.c) == null) {
            return;
        }
        zVar.b.w(L(z10));
    }

    public v0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public v0(Context context, z zVar, int i10, int i11, boolean z10, c6 c6Var) {
        super(context);
        new ArrayList();
        this.N = true;
        this.R = true;
        this.W = true;
        this.b0 = true;
        this.c0 = new ArrayList();
        this.d0 = -1;
        this.e0 = new AnimationNotificationsLocker();
        this.i0 = c6Var;
        if (i10 != 0) {
            setBackgroundDrawable(g6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.c = zVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.A = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, h7.z5.c(-1.0f, -2));
            return;
        }
        ri0 ri0Var = new ri0(context);
        this.x = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setImportantForAccessibility(2);
        addView(ri0Var, h7.z5.c(-1.0f, -1));
        if (i11 != 0) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        ri0 ri0Var = this.x;
        if (ri0Var == null) {
            return;
        }
        this.y = i10;
        ri0Var.setImageResource(i10);
    }
}
