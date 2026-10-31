package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z60 {
    public ViewGroup A;
    public final LinearLayout B;
    public int C;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup a;
    public float a0;
    public ViewGroup b;
    public float b0;
    public final org.telegram.ui.ActionBar.k2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.p6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public s60 f0;
    public Drawable g;
    public o60 g0;
    public int h;
    public final int[] h0;
    public int i;
    public Integer i0;
    public boolean j;
    public Integer j0;
    public int k;
    public Integer k0;
    public int l;
    public Integer l0;
    public u60 m;
    public ValueAnimator m0;
    public hi.b n;
    public boolean n0;
    public final float[] o;
    public bk o0;
    public Runnable p;
    public View p0;
    public float q;
    public final int[] q0;
    public float r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public x60 x;
    public dt y;
    public final Rect z;

    public z60(org.telegram.ui.ActionBar.k2 k2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.z4 parentLayout;
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        if (k2Var.getContext() == null) {
            return;
        }
        if ((((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).I0) || (((k2Var instanceof org.telegram.ui.ay) && ((org.telegram.ui.ay) k2Var).W) || (((k2Var instanceof ContactsActivity) && ((ContactsActivity) k2Var).G) || ((k2Var instanceof org.telegram.ui.e51) && ((org.telegram.ui.e51) k2Var).N)))) && (parentLayout = k2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.k2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.pf0) {
                k2Var = safeLastFragment;
            }
        }
        this.c = k2Var;
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = k2Var.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, resourceProvider))) > 0.705d ? org.telegram.messenger.zs.n1 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f7 = 0.0f;
        float f10 = 0.0f;
        while (view != viewGroup) {
            float y3 = view.getY() + f7;
            float x10 = view.getX() + f10;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x10 -= view.getScrollX();
                y3 -= view.getScrollY();
            }
            f10 = x10;
            f7 = y3;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f10 - viewGroup.getPaddingLeft();
        fArr[1] = f7 - viewGroup.getPaddingTop();
    }

    public static z60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view) {
        return new z60(viewGroup, p6Var, view, false, false, false);
    }

    public static z60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view, boolean z10) {
        return new z60(viewGroup, p6Var, view, z10, false, false);
    }

    public static z60 H(org.telegram.ui.ActionBar.k2 k2Var, View view) {
        return new z60(k2Var, view, false, true);
    }

    public static z60 I(org.telegram.ui.ActionBar.k2 k2Var, View view) {
        return new z60(k2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup == null) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                ((org.telegram.ui.ActionBar.h1) childAt).setColor(i10);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i10);
            }
        }
    }

    public static void a(z60 z60Var, ViewGroup viewGroup) {
        x60 x60Var = z60Var.x;
        if (x60Var == null) {
            return;
        }
        z60Var.x = null;
        ValueAnimator valueAnimator = z60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x60Var.x, 0.0f);
        z60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new r60(x60Var, 0));
        z60Var.m0.addListener(new org.telegram.ui.ActionBar.g1(z60Var, x60Var, viewGroup, 7));
        if (z60Var.L) {
            z60Var.m0.setDuration(380L);
            z60Var.m0.setInterpolator(gr.h);
        } else {
            z60Var.m0.setDuration(150L);
        }
        z60Var.m0.start();
    }

    public static void f(z60 z60Var, th.t4 t4Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.q20 q20Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = z60Var.e;
        w60 w60Var = new w60(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        w60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        z60Var.r(w60Var, w7.b6.o(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, z60Var.e, z60Var.d, false, false);
            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.t6.E8;
            b1Var.c(i10, org.telegram.ui.ActionBar.t6.F8);
            b1Var.h(0.12f, i10);
            b1Var.j(org.telegram.messenger.cd.L0(2131744803, null), R.drawable.menu_album_add, null);
            b1Var.setOnClickListener(new k6(2, runnable));
            linearLayout.addView(b1Var, w7.b6.o(-1, -2));
        }
        ArrayList arrayList2 = t4Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            final th.y4 y4Var = (th.y4) obj;
            final int i12 = y4Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            float f11 = f10;
            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(2, z60Var.e, z60Var.d, false, false);
            b1Var2.setChecked(contains);
            b1Var2.setPadding(org.telegram.messenger.i0.L(f11), 0, org.telegram.messenger.i0.L(f11), 0);
            int i13 = org.telegram.ui.ActionBar.t6.E8;
            b1Var2.c(i13, org.telegram.ui.ActionBar.t6.F8);
            b1Var2.h(f7, i13);
            TLRPC.Photo photo = y4Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                b1Var2.j(y4Var.b, R.drawable.msg_folders, null);
            } else {
                b1Var2.k(y4Var.b, org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(y4Var.c.sizes, org.telegram.messenger.i0.L(24.0f), false, org.telegram.messenger.b8.w(arrayList, 50, false, null, false), true), y4Var.c), "50_50", null, null);
            }
            b1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11 = contains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z11) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    q20Var.a(y4Var);
                }
            });
            linearLayout.addView(b1Var2, w7.b6.o(-1, -2));
            f10 = f11;
            f7 = 0.12f;
        }
    }

    public static View v(View view, int i10, int i11) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            int width = view.getWidth() + i12;
            int height = view.getHeight() + i13;
            if (i10 >= i12 && i10 < width && i11 >= i13 && i11 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i10, i11);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.h1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        eo eoVar = new eo(this, this.e, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = eoVar;
        eoVar.setDispatchKeyEventListener(new n60(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.s60] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.s60
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                u60 u60Var;
                z60 z60Var = z60.this;
                if (z60Var.e0 == null || (u60Var = z60Var.m) == null || !u60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                z60Var.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = z60Var.h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                z60Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        o60 o60Var = new o60(this, 0);
        this.g0 = o60Var;
        this.e0.addOnLayoutChangeListener(o60Var);
    }

    public final boolean D() {
        u60 u60Var = this.m;
        return u60Var != null && u60Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.b1) {
            ((org.telegram.ui.ActionBar.b1) childAt).setMultiline(false);
        }
    }

    public final z60 J() {
        z60 z60Var = new z60(this.D, this.d);
        z60Var.C = this.D.b(z60Var.B);
        return z60Var;
    }

    public final void K(z60 z60Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(z60Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.b1) {
            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
            b1Var.setRightIcon(R.drawable.msg_text_check);
            b1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            b1Var.getRightIcon().setScaleX(0.85f);
            b1Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.b1) {
            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
            b1Var.setRightIcon(R.drawable.msg_mini_lock3);
            b1Var.getRightIcon().setAlpha(0.4f);
            b1Var.setOnClickListener(new p60(this, runnable, 3));
        }
    }

    public final void N() {
        View view = this.e0;
        if (view != null) {
            if (this.f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f0);
                }
            }
            o60 o60Var = this.g0;
            if (o60Var != null) {
                this.e0.removeOnLayoutChangeListener(o60Var);
            }
        }
        this.f0 = null;
        this.g0 = null;
        this.e0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x10;
        float width;
        float f7;
        int y3;
        u60 u60Var = this.m;
        if (u60Var == null || !u60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.o;
        A(view, viewGroup, fArr);
        float f10 = fArr[1];
        float f11 = fArr[0];
        if (this.c0) {
            viewGroup.getLocationOnScreen(new int[2]);
            f11 += r7[0];
            f10 += r7[1];
        }
        RectF rectF = new RectF();
        if (view instanceof y60) {
            ((y60) view).a(rectF);
        } else {
            int i11 = this.N;
            if (i11 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i11, i10);
            }
        }
        float f12 = f11 + rectF.left;
        float f13 = f10 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f12 = 0.0f;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        if (org.telegram.messenger.i0.Q1()) {
            f13 += viewGroup.getPaddingTop();
            f12 -= viewGroup.getPaddingLeft();
        }
        int i12 = this.i;
        if (i12 == 3) {
            x10 = (int) (viewGroup.getX() + f12);
        } else {
            if (i12 == 5) {
                width = rectF.width() + viewGroup.getX() + f12;
                f7 = rectF2.right;
            } else if (i12 == 1) {
                width = (rectF.width() / 2.0f) + viewGroup.getX() + f12;
                f7 = this.A.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + f12 > viewGroup.getWidth()) {
                width = rectF.width() + viewGroup.getX() + f12;
                f7 = rectF2.right;
            } else {
                x10 = (int) ((viewGroup.getX() + f12) - rectF2.left);
            }
            x10 = (int) (width - f7);
        }
        float height = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            y3 = (int) (viewGroup.getY() + (Math.min(f13 + height, org.telegram.messenger.i0.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || f13 + height + this.A.getMeasuredHeight() + org.telegram.messenger.i0.L(16.0f) > org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.n) {
                f13 = (f13 - height) - this.A.getMeasuredHeight();
                if (this.V && Math.max(0.0f, f13 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f13 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y3 = (int) (viewGroup.getY() + f13 + height);
        }
        float f14 = x10 + this.q;
        this.a0 = f14;
        float f15 = y3 + this.r;
        this.b0 = f15;
        this.m.update((int) f14, (int) f15, -1, -1);
    }

    public final void P(int i10) {
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i10);
            }
            i11++;
        }
    }

    public final void Q(s9 s9Var, float f7, float f10) {
        Drawable f11 = i0.a.f(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new v9(new w9(s9Var, viewGroup, 5, false), this.A.getX() + this.a0 + f7, this.A.getY() + this.b0 + f10, f11, org.telegram.messenger.i0.L(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new v9(new w9(s9Var, childAt, 5, false), this.A.getX() + this.a0 + f7 + childAt.getX(), this.A.getY() + this.b0 + f10 + childAt.getY(), f11, org.telegram.messenger.i0.L(12.0f)));
            }
        }
    }

    public final void R(tg.b bVar, wg.d dVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            vg.f c10 = bVar.c(viewGroup, null, z10);
            c10.o(dVar);
            c10.p(org.telegram.messenger.i0.L(8.0f));
            c10.M.e = true;
            c10.q(org.telegram.messenger.i0.L(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void S(int i10, int i11) {
        this.j0 = Integer.valueOf(i10);
        this.k0 = Integer.valueOf(i11);
        int i12 = 0;
        while (i12 < this.A.getChildCount()) {
            View childAt = i12 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i12);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i13++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                        ((org.telegram.ui.ActionBar.b1) childAt2).d(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                ((org.telegram.ui.ActionBar.b1) childAt).d(i10, i11);
            }
            i12++;
        }
    }

    public final void T(int i10) {
        this.i0 = Integer.valueOf(i10);
        if (this.A != null) {
            int i11 = 0;
            while (i11 < this.A.getChildCount()) {
                View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.h1) {
                            ((org.telegram.ui.ActionBar.h1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                    ((org.telegram.ui.ActionBar.h1) childAt).setColor(i10);
                }
                i11++;
            }
        }
    }

    public final void V(int i10) {
        this.i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.g = drawable;
        this.h = 0;
        if (!(drawable instanceof ShapeDrawable) || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
    }

    public final void X(float f7) {
        u60 u60Var = this.m;
        if (u60Var != null) {
            u60Var.update((int) this.a0, (int) (this.b0 + f7), -1, -1);
        }
    }

    public final void Y() {
        if (this.A == null) {
            return;
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.u71 u71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = u71Var.getChildAt(0);
                    View childAt3 = u71Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.b1;
                    org.telegram.ui.ActionBar.p6 p6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.b1) childAt2).n(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof za0) || (childAt2 instanceof FrameLayout)) {
                        int i11 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.ActionBar.a7.R(childAt2, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 12, childAt2 == childAt3 ? 12 : 0), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        int i12 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 12, childAt2 == childAt3 ? 12 : 0);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                        childAt2.setBackground(a02);
                        org.telegram.ui.ActionBar.a7.k(childAt2, a02, null, N, p6Var);
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.b1) {
                        ((org.telegram.ui.ActionBar.b1) childAt3).n(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof za0) || (childAt3 instanceof FrameLayout)) {
                        int i13 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.ActionBar.a7.R(childAt3, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), childAt2 == childAt3 ? 12 : 0, 12), null, org.telegram.ui.ActionBar.a7.N(i13), p6Var);
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        int i14 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), childAt2 == childAt3 ? 12 : 0, 12);
                        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
                        childAt3.setBackground(a03);
                        org.telegram.ui.ActionBar.a7.k(childAt3, a03, null, N2, p6Var);
                    }
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f7;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        int width;
        int i12;
        int height;
        boolean z10;
        boolean z11;
        x60 x60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f13;
        float width2;
        float f14;
        x60 x60Var2;
        if (this.m != null || this.B != null || x() <= 0) {
            return;
        }
        Y();
        int i13 = 1;
        if (this.T > 0) {
            int i14 = 0;
            while (i14 < this.A.getChildCount() - 1) {
                View childAt = i14 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i14);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i15++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i15).getLayoutParams().width = org.telegram.messenger.i0.L(this.T);
                    }
                }
                i14++;
            }
        } else if (this.S > 0) {
            int i16 = 0;
            while (i16 < this.A.getChildCount() - 1) {
                View childAt2 = i16 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i16);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i17 = 0; i17 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i17++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.L.getChildAt(i17).setMinimumWidth(org.telegram.messenger.i0.L(this.S));
                    }
                }
                i16++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new hi.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? k2Var.getParentLayout().getOverlayContainerView() : viewGroup;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = org.telegram.messenger.i0.q;
        float f15 = point.y / 2.0f;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            A(view, overlayContainerView, fArr);
            f15 = fArr[1];
            f10 = fArr[0];
            if (this.c0) {
                overlayContainerView.getLocationOnScreen(new int[2]);
                f7 = 2.0f;
                f10 += r15[0];
                f15 += r15[1];
            } else {
                f7 = 2.0f;
            }
        } else {
            f7 = 2.0f;
            f10 = 0.0f;
        }
        RectF rectF = new RectF();
        if (view instanceof y60) {
            ((y60) view).a(rectF);
            i10 = 0;
        } else {
            int i18 = this.N;
            i10 = 0;
            if (i18 == 0 || (i11 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i18, i11);
            }
        }
        float f16 = f10 + rectF.left;
        float f17 = f15 + rectF.top;
        if (this.j) {
            fArr[i10] = 0.0f;
            f16 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            x60 x60Var3 = new x60(this, context);
            this.x = x60Var3;
            this.y = new dt(i13, x60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, w7.b6.c(-1.0f, -1));
            this.x.setProgress(0.0f);
            if (this.P) {
                view.setVisibility(4);
            }
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 29));
            this.m0.addListener(new t60(this, i10));
            if (this.L) {
                f11 = f16;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(gr.h);
            } else {
                f11 = f16;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f11 = f16;
        }
        if (!this.L || (x60Var2 = this.x) == null || this.N == 0) {
            f12 = f11;
        } else {
            x60Var2.s = (overlayContainerView.getWidth() - this.N) / f7;
            if (this.M == 3) {
                this.x.s = org.telegram.messenger.i0.L(36.0f);
            }
            f12 = (-fArr[0]) + this.x.s + f11;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        u60 u60Var = new u60(this, this.A, overlayContainerView);
        this.m = u60Var;
        u60Var.setOnDismissListener(new v60(this, overlayContainerView));
        this.m.setOutsideTouchable(true);
        this.m.setFocusable(!this.Q);
        this.m.setBackgroundDrawable(new ColorDrawable(0));
        this.m.setAnimationStyle(R.style.PopupContextAnimation);
        if (this.Z) {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(0);
        } else if (this.Q) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else if (this.R) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(0);
        }
        if (org.telegram.messenger.i0.Q1()) {
            f17 += overlayContainerView.getPaddingTop();
            f12 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            int i19 = this.i;
            if (i19 == 3) {
                width = (int) (overlayContainerView.getX() + f12);
            } else {
                if (i19 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f12;
                    f14 = rectF2.right;
                } else {
                    if (i19 == 1) {
                        x10 = (rectF.width() / f7) + overlayContainerView.getX() + f12;
                        f13 = this.A.getMeasuredWidth() / f7;
                    } else if (rectF2.width() + f12 > overlayContainerView.getWidth()) {
                        width2 = rectF.width() + overlayContainerView.getX() + f12;
                        f14 = rectF2.right;
                    } else {
                        x10 = overlayContainerView.getX() + f12;
                        f13 = rectF2.left;
                    }
                    width = (int) (x10 - f13);
                }
                width = (int) (width2 - f14);
            }
        } else {
            width = (overlayContainerView.getWidth() - this.A.getMeasuredWidth()) / 2;
        }
        if (this.Z) {
            i12 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
        }
        int i20 = (point.y - org.telegram.messenger.i0.n) - i12;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            height = this.L ? (int) (f17 + height2) : (int) (overlayContainerView.getY() + (Math.min(f17 + height2, i20) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.U || f17 + height2 + this.A.getMeasuredHeight() + org.telegram.messenger.i0.L(16.0f) > i20) {
                f17 = (f17 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f17 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    int y3 = (int) (overlayContainerView.getY() + f17 + height2);
                    z11 = z10;
                    height = y3;
                    if (this.E && z11 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (x60Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f18 = rectF.bottom;
                        x60Var.w = (height3 - (measuredHeight + f18)) / f7;
                        x60 x60Var4 = this.x;
                        height = (int) (x60Var4.w + f18);
                        width = (int) (((x60Var4.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.i0.L(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - org.telegram.messenger.i0.L(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (k2Var != null && k2Var.getFragmentView() != null) {
                            k2Var.getFragmentView().getRootView().dispatchTouchEvent(org.telegram.messenger.i0.R());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(org.telegram.messenger.i0.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i21 = org.telegram.ui.ActionBar.t6.E8;
                        org.telegram.ui.ActionBar.p6 p6Var = this.d;
                        T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i21, p6Var)));
                        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i21);
                        if (this.A != null) {
                            int i22 = 0;
                            while (i22 < this.A.getChildCount()) {
                                View childAt3 = i22 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i22);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i23 = 0; i23 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i23++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.L.getChildAt(i23);
                                        if (childAt4 instanceof org.telegram.ui.ActionBar.h1) {
                                            org.telegram.ui.ActionBar.a7.j(childAt4, L, p6Var);
                                        }
                                    }
                                } else if (childAt3 instanceof org.telegram.ui.ActionBar.h1) {
                                    org.telegram.ui.ActionBar.a7.j(childAt3, L, p6Var);
                                }
                                i22++;
                            }
                        }
                        vg.f c10 = new tg.b(this.n).c(this.A, null, true);
                        c10.o(w7.b9.k(p6Var));
                        c10.p(org.telegram.messenger.i0.L(8.0f));
                        c10.M.e = true;
                        c10.q(org.telegram.messenger.i0.L(12.0f));
                        c10.i(width + this.q, height + this.r);
                        this.A.setBackground(c10);
                    }
                    u60 u60Var2 = this.m;
                    u60Var2.g = this.I;
                    float f19 = width + this.q;
                    this.a0 = f19;
                    float f20 = height + this.r;
                    this.b0 = f20;
                    u60Var2.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        bk bkVar = new bk(new WeakReference(this), 3);
                        this.o0 = bkVar;
                        view.setOnTouchListener(bkVar);
                    }
                    if (this.d0) {
                        C();
                        return;
                    }
                    return;
                }
                f17 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f7) - height2) - overlayContainerView.getY();
            }
            z10 = false;
            int y32 = (int) (overlayContainerView.getY() + f17 + height2);
            z11 = z10;
            height = y32;
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height32 = overlayContainerView.getHeight();
                float measuredHeight2 = this.A.getMeasuredHeight();
                float f182 = rectF.bottom;
                x60Var.w = (height32 - (measuredHeight2 + f182)) / f7;
                x60 x60Var42 = this.x;
                height = (int) (x60Var42.w + f182);
                width = (int) (((x60Var42.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.i0.L(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i212 = org.telegram.ui.ActionBar.t6.E8;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.d;
                T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i212, p6Var2)));
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.06f, i212);
                if (this.A != null) {
                }
                vg.f c102 = new tg.b(this.n).c(this.A, null, true);
                c102.o(w7.b9.k(p6Var2));
                c102.p(org.telegram.messenger.i0.L(8.0f));
                c102.M.e = true;
                c102.q(org.telegram.messenger.i0.L(12.0f));
                c102.i(width + this.q, height + this.r);
                this.A.setBackground(c102);
            }
            u60 u60Var22 = this.m;
            u60Var22.g = this.I;
            float f192 = width + this.q;
            this.a0 = f192;
            float f202 = height + this.r;
            this.b0 = f202;
            u60Var22.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                bk bkVar2 = new bk(new WeakReference(this), 3);
                this.o0 = bkVar2;
                view.setOnTouchListener(bkVar2);
            }
            if (this.d0) {
            }
        } else {
            height = (overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / 2;
        }
        z11 = false;
        if (this.E) {
        }
        if (this.L) {
        }
        if (!this.w) {
        }
        if (this.v) {
        }
        u60 u60Var222 = this.m;
        u60Var222.g = this.I;
        float f1922 = width + this.q;
        this.a0 = f1922;
        float f2022 = height + this.r;
        this.b0 = f2022;
        u60Var222.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
        if (this.w) {
        }
        if (this.d0) {
        }
    }

    public final void a0(float f7, float f10) {
        this.q += f7;
        this.r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            b1Var.setText(charSequence);
        } else {
            b1Var.j(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            b1Var.setSubtext(null);
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(i12, i11);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i12);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
        } else {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i13));
            r(b1Var, w7.b6.o(this.S, -2));
        }
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.p0;
        if (view2 != null) {
            view2.getLocationOnScreen(this.q0);
            this.p0.drawableHotspotChanged(i10 - r1[0], i11 - r1[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.F8, z10 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.b1 b1Var) {
        org.telegram.messenger.i0.E2(b1Var);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(org.telegram.ui.ActionBar.t6.E8, org.telegram.ui.ActionBar.t6.F8);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, org.telegram.ui.ActionBar.t6.E8);
        }
        int i10 = this.S;
        if (i10 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
        } else {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i10));
            r(b1Var, w7.b6.o(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        int i12 = org.telegram.ui.ActionBar.t6.F8;
        TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(org.telegram.messenger.h20.p(f7));
        b1Var.setClipToPadding(false);
        b1Var.a.setPadding((b1Var.d && b1Var.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0, (!b1Var.d && b1Var.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0);
        g9 g9Var = new g9(context);
        g9Var.getImageReceiver().d = i10;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(f7);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(34.0f));
        g9Var.e(f7, r8Var);
        g9Var.setScaleX(z10 ? 0.84f : 1.0f);
        g9Var.setScaleY(z10 ? 0.84f : 1.0f);
        b1Var.addView(g9Var, w7.b6.d(34, 34.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.i0.L(34.0f);
            int i13 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var), L);
            view.setBackground(f6Var);
            org.telegram.ui.ActionBar.a7.y(view, f6Var, i13, p6Var, PorterDuff.Mode.SRC_IN);
            b1Var.addView(view, w7.b6.b(36.0f, 36.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(i11, i12);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i11);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 1));
        int i14 = this.S;
        if (i14 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
        } else {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i14));
            r(b1Var, w7.b6.o(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            b1Var.setText(chat.title);
            b1Var.setSubtext(org.telegram.messenger.w3.V(chat) ? org.telegram.messenger.cd.L0(2131751391, null) : org.telegram.messenger.cd.L0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            b1Var.setText(org.telegram.messenger.h20.p(user));
            if (user.id == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).e()) {
                b1Var.setSubtext(org.telegram.messenger.cd.L0(2131743375, null));
            } else if (org.telegram.messenger.h20.t(user)) {
                b1Var.setSubtext(org.telegram.messenger.cd.L0(2131753156, null));
            }
        }
        b1Var.setClipToPadding(false);
        b1Var.a.setPadding((b1Var.d && b1Var.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0, (!b1Var.d && b1Var.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0);
        g9 g9Var = new g9(context);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(34.0f));
        g9Var.e(tLObject, r8Var);
        g9Var.setScaleX(z10 ? 0.84f : 1.0f);
        g9Var.setScaleY(z10 ? 0.84f : 1.0f);
        b1Var.addView(g9Var, w7.b6.d(34, 34.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.i0.L(34.0f);
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.w0(i12, p6Var), L);
            view.setBackground(f6Var);
            org.telegram.ui.ActionBar.a7.y(view, f6Var, i12, p6Var, PorterDuff.Mode.SRC_IN);
            b1Var.addView(view, w7.b6.b(36.0f, 36.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(i10, i11);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i10);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 2));
        int i13 = this.S;
        if (i13 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
        } else {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i13));
            r(b1Var, w7.b6.o(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.b1 h() {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i10);
        }
        int i12 = this.S;
        if (i12 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
            return b1Var;
        }
        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i12));
        r(b1Var, w7.b6.o(this.S, -2));
        return b1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, bi.i2 i2Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        int i12 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1((i10 == 0 && i2Var == null) ? 1 : 2, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (i2Var != null) {
            b1Var.j(charSequence, 0, i2Var);
        } else if (i10 != 0) {
            b1Var.j(charSequence, i10, null);
        } else {
            b1Var.setText(charSequence);
        }
        b1Var.setChecked(z10);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            b1Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            Integer num2 = this.k0;
            b1Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i11);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(b1Var, w7.b6.o(-1, -2));
        } else {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i13));
            r(b1Var, w7.b6.o(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(this.e, this.d);
        h1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            h1Var.setColor(num.intValue());
        }
        r(h1Var, w7.b6.o(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, runnable);
        }
    }

    public final void m(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        if (z10) {
            c(i10, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 0, 12);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, a02, null, N, p6Var);
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(17.0f));
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        g9Var.e(tLObject, r8Var);
        frameLayout.addView(g9Var, w7.b6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.h20.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.q5, p6Var);
        l4.setTextSize(1, 13.0f);
        l4.setText(org.telegram.messenger.i0.H2(str, false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(0.66f)));
        frameLayout.addView(l4, w7.b6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new p60(this, runnable, 0));
        r(frameLayout, w7.b6.o(-1, 52));
    }

    public final void o() {
        boolean z10 = this.A instanceof LinearLayout;
        int i10 = 1;
        Context context = this.e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i11 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.b6.z(-1.0f), w7.b6.z(i11 > 0 ? i11 / org.telegram.messenger.i0.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new n60(this, i10));
        this.A.addView(this.D, w7.b6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ag.j3 j3Var = new ag.j3(this.e, 22);
        j3Var.setTextSize(1, i10);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.j5, this.d);
        j3Var.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        j3Var.setText(org.telegram.messenger.k6.m(charSequence, j3Var.getPaint().getFontMetricsInt(), false, null, 0));
        j3Var.setTag(R.id.fit_width_tag, 1);
        j3Var.setTypeface(null);
        org.telegram.messenger.zs.i(j3Var);
        if (i11 > 0) {
            j3Var.setMaxWidth(i11);
        }
        r(j3Var, w7.b6.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.b6.o(-1, -2));
    }

    public final void r(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            this.D.a(view, layoutParams);
        }
    }

    public final void s() {
        this.n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.b1) {
            n5 textView = ((org.telegram.ui.ActionBar.b1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + vh.p2.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        u60 u60Var = this.m;
        if (u60Var != null) {
            u60Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
        }
        int i11 = 0;
        while (i11 < this.A.getChildCount() - 1) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i10);
                if (childAt2 != null) {
                    return childAt2;
                }
                i10 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i11++;
        }
        return null;
    }

    public final int x() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i10 = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i11 = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i11 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i11;
            }
            i10++;
        }
        return i11;
    }

    public final org.telegram.ui.ActionBar.b1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                return (org.telegram.ui.ActionBar.b1) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
            return (org.telegram.ui.ActionBar.b1) childAt2;
        }
        return null;
    }

    public final View z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            return linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        return this.D.L.getChildAt(r0.getItemsCount() - 1);
    }

    public z60(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.a = viewGroup;
        this.d = p6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var))) > 0.705d ? org.telegram.messenger.zs.n1 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public z60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = p6Var;
    }
}
