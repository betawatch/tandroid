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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a70 {
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
    public ArrayList P;
    public ArrayList Q;
    public final float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup a;
    public int a0;
    public ViewGroup b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.g2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.h6 d;
    public float d0;
    public final Context e;
    public float e0;
    public final View f;
    public boolean f0;
    public Drawable g;
    public boolean g0;
    public int h;
    public View h0;
    public int i;
    public n60 i0;
    public boolean j;
    public o60 j0;
    public int k;
    public final int[] k0;
    public int l;
    public Integer l0;
    public t60 m;
    public Integer m0;
    public ui.b n;
    public Integer n0;
    public final float[] o;
    public Integer o0;
    public Runnable p;
    public ValueAnimator p0;
    public float q;
    public boolean q0;
    public float r;
    public qk r0;
    public int s;
    public View s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public boolean v;
    public boolean w;
    public w60 x;
    public hl y;
    public final Rect z;

    public a70(org.telegram.ui.ActionBar.g2 g2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.r4 parentLayout;
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        if (g2Var.getContext() == null) {
            return;
        }
        if ((((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).J0) || (((g2Var instanceof org.telegram.ui.cx) && ((org.telegram.ui.cx) g2Var).X) || (((g2Var instanceof ContactsActivity) && ((ContactsActivity) g2Var).H) || ((g2Var instanceof org.telegram.ui.o31) && ((org.telegram.ui.o31) g2Var).O)))) && (parentLayout = g2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.g2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.me0) {
                g2Var = safeLastFragment;
            }
        }
        this.c = g2Var;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = g2Var.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, resourceProvider))) > 0.705d ? org.telegram.messenger.ls.n1 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        C();
    }

    public static void B(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (view != viewGroup) {
            float y10 = view.getY() + f10;
            float x10 = view.getX() + f11;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x10 -= view.getScrollX();
                y10 -= view.getScrollY();
            }
            f11 = x10;
            f10 = y10;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f11 - viewGroup.getPaddingLeft();
        fArr[1] = f10 - viewGroup.getPaddingTop();
    }

    public static a70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        return new a70(viewGroup, h6Var, view, false, false, false);
    }

    public static a70 H(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view, boolean z10) {
        return new a70(viewGroup, h6Var, view, z10, false, false);
    }

    public static a70 I(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new a70(g2Var, view, false, true);
    }

    public static a70 J(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new a70(g2Var, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i7) {
        if (viewGroup == null) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
            } else if (childAt instanceof ViewGroup) {
                V((ViewGroup) childAt, i7);
            }
        }
    }

    public static void a(a70 a70Var, ViewGroup viewGroup) {
        w60 w60Var = a70Var.x;
        if (w60Var == null) {
            return;
        }
        a70Var.x = null;
        ValueAnimator valueAnimator = a70Var.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w60Var.x, 0.0f);
        a70Var.p0 = ofFloat;
        ofFloat.addUpdateListener(new h60(w60Var, 2));
        a70Var.p0.addListener(new fi.a3(a70Var, w60Var, viewGroup, 8));
        if (a70Var.L) {
            a70Var.p0.setDuration(380L);
            a70Var.p0.setInterpolator(nr.h);
        } else {
            a70Var.p0.setDuration(150L);
        }
        a70Var.p0.start();
    }

    public static void f(a70 a70Var, fi.d6 d6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.y10 y10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = a70Var.e;
        bi.j6 j6Var = new bi.j6(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        j6Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        a70Var.r(j6Var, c8.ma.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, a70Var.e, a70Var.d, false, false);
            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.m6.E8;
            y0Var.c(i7, org.telegram.ui.ActionBar.m6.F8);
            y0Var.h(0.12f, i7);
            y0Var.j(org.telegram.messenger.hd.N0(2131744542, null), R.drawable.menu_album_add, null);
            y0Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(y0Var, c8.ma.o(-1, -2));
        }
        ArrayList arrayList2 = d6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final fi.i6 i6Var = (fi.i6) obj;
            final int i11 = i6Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, a70Var.e, a70Var.d, false, false);
            y0Var2.setChecked(contains);
            y0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.m6.E8;
            y0Var2.c(i12, org.telegram.ui.ActionBar.m6.F8);
            y0Var2.h(f10, i12);
            TLRPC.Photo photo = i6Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                y0Var2.j(i6Var.b, R.drawable.msg_folders, null);
            } else {
                y0Var2.k(i6Var.b, org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(i6Var.c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), i6Var.c), "50_50", null, null);
            }
            y0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11 = contains;
                    HashSet hashSet2 = hashSet;
                    int i13 = i11;
                    if (z11) {
                        hashSet2.remove(Integer.valueOf(i13));
                    } else {
                        hashSet2.add(Integer.valueOf(i13));
                    }
                    y10Var.a(i6Var);
                }
            });
            linearLayout.addView(y0Var2, c8.ma.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static void t(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof x60) {
            arrayList.add(view);
        }
        if (view instanceof y60) {
            arrayList2.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                t(viewGroup.getChildAt(i7), arrayList, arrayList2);
            }
        }
    }

    public static View w(View view, int i7, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i7 >= i11 && i7 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View w10 = w(viewGroup.getChildAt(childCount), i7, i10);
                        if (w10 != null) {
                            return w10;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.d1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final View A() {
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
        return this.D.M.getChildAt(r0.getItemsCount() - 1);
    }

    public final void C() {
        po poVar = new po(this, this.e, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = poVar;
        poVar.setDispatchKeyEventListener(new m60(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.n60] */
    public final void D() {
        O();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.h0 = view;
        view.getLocationOnScreen(this.k0);
        this.i0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.n60
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                t60 t60Var;
                a70 a70Var = a70.this;
                if (a70Var.h0 == null || (t60Var = a70Var.m) == null || !t60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                a70Var.h0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int[] iArr2 = a70Var.k0;
                if (i7 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i7;
                iArr2[1] = iArr[1];
                a70Var.P();
            }
        };
        this.h0.getViewTreeObserver().addOnScrollChangedListener(this.i0);
        o60 o60Var = new o60(this, 0);
        this.j0 = o60Var;
        this.h0.addOnLayoutChangeListener(o60Var);
    }

    public final boolean E() {
        t60 t60Var = this.m;
        return t60Var != null && t60Var.isShowing();
    }

    public final void F() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            ((org.telegram.ui.ActionBar.y0) childAt).setMultiline(false);
        }
    }

    public final a70 K() {
        a70 a70Var = new a70(this.D, this.d);
        a70Var.C = this.D.b(a70Var.B);
        return a70Var;
    }

    public final void L(a70 a70Var) {
        this.q0 = true;
        this.D.getSwipeBack().e(a70Var.C);
    }

    public final void M() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
            y0Var.setRightIcon(R.drawable.msg_text_check);
            y0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            y0Var.getRightIcon().setScaleX(0.85f);
            y0Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void N(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
            y0Var.setRightIcon(R.drawable.msg_mini_lock3);
            y0Var.getRightIcon().setAlpha(0.4f);
            y0Var.setOnClickListener(new p60(this, runnable, 3));
        }
    }

    public final void O() {
        View view = this.h0;
        if (view != null) {
            if (this.i0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.i0);
                }
            }
            o60 o60Var = this.j0;
            if (o60Var != null) {
                this.h0.removeOnLayoutChangeListener(o60Var);
            }
        }
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        View view;
        ViewGroup viewGroup;
        int i7;
        int x10;
        float width;
        float f10;
        int y10;
        t60 t60Var = this.m;
        if (t60Var == null || !t60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.o;
        B(view, viewGroup, fArr);
        float f11 = fArr[1];
        float f12 = fArr[0];
        if (this.f0) {
            viewGroup.getLocationOnScreen(new int[2]);
            f12 += r7[0];
            f11 += r7[1];
        }
        RectF rectF = new RectF();
        if (view instanceof z60) {
            ((z60) view).f(rectF);
        } else {
            int i10 = this.N;
            if (i10 == 0 || (i7 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i10, i7);
            }
        }
        float f13 = f12 + rectF.left;
        float f14 = f11 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f13 = 0.0f;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        if (org.telegram.messenger.g0.Q1()) {
            f14 += viewGroup.getPaddingTop();
            f13 -= viewGroup.getPaddingLeft();
        }
        int i11 = this.i;
        if (i11 == 3) {
            x10 = (int) (viewGroup.getX() + f13);
        } else {
            if (i11 == 5) {
                width = rectF.width() + viewGroup.getX() + f13;
                f10 = rectF2.right;
            } else if (i11 == 1) {
                width = (rectF.width() / 2.0f) + viewGroup.getX() + f13;
                f10 = this.A.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + f13 > viewGroup.getWidth()) {
                width = rectF.width() + viewGroup.getX() + f13;
                f10 = rectF2.right;
            } else {
                x10 = (int) ((viewGroup.getX() + f13) - rectF2.left);
            }
            x10 = (int) (width - f10);
        }
        float height = this.b0 ? 0.0f : rectF.height();
        if (this.Z) {
            y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.X || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.n) {
                f14 = (f14 - height) - this.A.getMeasuredHeight();
                if (this.Y && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y10 = (int) (viewGroup.getY() + f14 + height);
        }
        float f15 = x10 + this.q;
        this.d0 = f15;
        float f16 = y10 + this.r;
        this.e0 = f16;
        this.m.update((int) f15, (int) f16, -1, -1);
    }

    public final void Q(int i7) {
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i7);
            }
            i10++;
        }
    }

    public final void R(dh.c cVar, gh.e eVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            fh.g c10 = cVar.c(viewGroup, null, z10);
            c10.p(eVar);
            c10.q(org.telegram.messenger.g0.L(8.0f));
            c10.R.e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void S(ca caVar, float f10, float f11) {
        Drawable g10 = i5.c.g(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new fa(new ga(caVar, viewGroup, 5, false), this.A.getX() + this.d0 + f10, this.A.getY() + this.e0 + f11, g10, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new fa(new ga(caVar, childAt, 5, false), this.A.getX() + this.d0 + f10 + childAt.getX(), this.A.getY() + this.e0 + f11 + childAt.getY(), g10, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void T(int i7, int i10) {
        this.m0 = Integer.valueOf(i7);
        this.n0 = Integer.valueOf(i10);
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).d(i7, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).d(i7, i10);
            }
            i11++;
        }
    }

    public final void U(int i7) {
        this.l0 = Integer.valueOf(i7);
        if (this.A != null) {
            int i10 = 0;
            while (i10 < this.A.getChildCount()) {
                View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.d1) {
                            ((org.telegram.ui.ActionBar.d1) childAt2).setColor(i7);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                    ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
                }
                i10++;
            }
        }
    }

    public final void W(int i7) {
        this.i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).c = true;
            }
        }
    }

    public final void X(Drawable drawable) {
        this.g = drawable;
        this.h = 0;
        if (!(drawable instanceof ShapeDrawable) || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
    }

    public final void Y(float f10) {
        t60 t60Var = this.m;
        if (t60Var != null) {
            t60Var.update((int) this.d0, (int) (this.e0 + f10), -1, -1);
        }
    }

    public final void Z() {
        if (this.A == null) {
            return;
        }
        int i7 = 0;
        while (i7 < this.A.getChildCount()) {
            View childAt = i7 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = d61Var.getChildAt(0);
                    View childAt3 = d61Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.y0;
                    org.telegram.ui.ActionBar.h6 h6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).n(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof va0) || (childAt2 instanceof FrameLayout)) {
                        int i10 = org.telegram.ui.ActionBar.m6.I5;
                        org.telegram.ui.ActionBar.t6.Q(childAt2, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 12, childAt2 == childAt3 ? 12 : 0), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        int i11 = org.telegram.ui.ActionBar.m6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 12, childAt2 == childAt3 ? 12 : 0);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                        childAt2.setBackground(a02);
                        org.telegram.ui.ActionBar.t6.j(childAt2, a02, null, M, h6Var);
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.y0) {
                        ((org.telegram.ui.ActionBar.y0) childAt3).n(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof va0) || (childAt3 instanceof FrameLayout)) {
                        int i12 = org.telegram.ui.ActionBar.m6.I5;
                        org.telegram.ui.ActionBar.t6.Q(childAt3, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), childAt2 == childAt3 ? 12 : 0, 12), null, org.telegram.ui.ActionBar.t6.M(i12), h6Var);
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        int i13 = org.telegram.ui.ActionBar.m6.I5;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), childAt2 == childAt3 ? 12 : 0, 12);
                        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
                        childAt3.setBackground(a03);
                        org.telegram.ui.ActionBar.t6.j(childAt3, a03, null, M2, h6Var);
                    }
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0607 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0449 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        float f10;
        float f11;
        int i7;
        int i10;
        float f12;
        float f13;
        int width;
        int i11;
        int height;
        boolean z10;
        ViewGroup viewGroup;
        w60 w60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f14;
        float width2;
        float f15;
        w60 w60Var2;
        if (this.m != null || this.B != null || y() <= 0) {
            return;
        }
        Z();
        if (this.W > 0) {
            int i12 = 0;
            while (i12 < this.A.getChildCount() - 1) {
                View childAt = i12 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i12);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i13++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i13).getLayoutParams().width = org.telegram.messenger.g0.L(this.W);
                    }
                }
                i12++;
            }
        } else if (this.V > 0) {
            int i14 = 0;
            while (i14 < this.A.getChildCount() - 1) {
                View childAt2 = i14 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i14);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i15++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.M.getChildAt(i15).setMinimumWidth(org.telegram.messenger.g0.L(this.V));
                    }
                }
                i14++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new ui.b();
        }
        ViewGroup viewGroup2 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        ViewGroup overlayContainerView = viewGroup2 == null ? g2Var.getParentLayout().getOverlayContainerView() : viewGroup2;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float f16 = point.y / 2.0f;
        int i16 = 2;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            B(view, overlayContainerView, fArr);
            f16 = fArr[1];
            f11 = fArr[0];
            if (this.f0) {
                overlayContainerView.getLocationOnScreen(new int[2]);
                f10 = 2.0f;
                f11 += r15[0];
                f16 += r15[1];
            } else {
                f10 = 2.0f;
            }
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
        }
        RectF rectF = new RectF();
        if (view instanceof z60) {
            ((z60) view).f(rectF);
            i7 = 0;
        } else {
            int i17 = this.N;
            i7 = 0;
            if (i17 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i17, i10);
            }
        }
        float f17 = f11 + rectF.left;
        float f18 = f16 + rectF.top;
        if (this.j) {
            fArr[i7] = 0.0f;
            f17 = 0.0f;
        }
        this.P = null;
        this.Q = null;
        if (g2Var != null && g2Var.clipsScrimUnderOccluders() && overlayContainerView.getRootView() != null) {
            this.P = new ArrayList();
            this.Q = new ArrayList();
            t(overlayContainerView.getRootView(), this.P, this.Q);
        }
        if (this.s > 0 || this.u || this.v) {
            w60 w60Var3 = new w60(this, context);
            this.x = w60Var3;
            this.y = new hl(i16, w60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, c8.ma.c(-1.0f, -1));
            this.x.setProgress(0.0f);
            if (this.S) {
                if (view instanceof z60) {
                    ((z60) view).setScrimHidden(true);
                } else {
                    view.setVisibility(4);
                }
            }
            ValueAnimator valueAnimator = this.p0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.p0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.p0 = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 1));
            this.p0.addListener(new s60(this, i7));
            if (this.L) {
                f12 = f17;
                this.p0.setDuration(380L);
                this.p0.setInterpolator(nr.h);
            } else {
                f12 = f17;
                this.p0.setDuration(150L);
            }
            this.p0.start();
        } else {
            f12 = f17;
        }
        if (!this.L || (w60Var2 = this.x) == null || this.N == 0) {
            f13 = f12;
        } else {
            w60Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = org.telegram.messenger.g0.L(36.0f);
            }
            f13 = (-fArr[0]) + this.x.s + f12;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        t60 t60Var = new t60(this, this.A, overlayContainerView);
        this.m = t60Var;
        t60Var.setOnDismissListener(new u60(this, overlayContainerView));
        this.m.setOutsideTouchable(true);
        this.m.setFocusable(!this.T);
        this.m.setBackgroundDrawable(new ColorDrawable(0));
        this.m.setAnimationStyle(R.style.PopupContextAnimation);
        if (this.c0) {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(0);
        } else if (this.T) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else if (this.U) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            f18 += overlayContainerView.getPaddingTop();
            f13 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            int i18 = this.i;
            if (i18 == 3) {
                width = (int) (overlayContainerView.getX() + f13);
            } else {
                if (i18 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f13;
                    f15 = rectF2.right;
                } else {
                    if (i18 == 1) {
                        x10 = (rectF.width() / f10) + overlayContainerView.getX() + f13;
                        f14 = this.A.getMeasuredWidth() / f10;
                    } else if (rectF2.width() + f13 > overlayContainerView.getWidth()) {
                        width2 = rectF.width() + overlayContainerView.getX() + f13;
                        f15 = rectF2.right;
                    } else {
                        x10 = overlayContainerView.getX() + f13;
                        f14 = rectF2.left;
                    }
                    width = (int) (x10 - f14);
                }
                width = (int) (width2 - f15);
            }
        } else {
            width = (overlayContainerView.getWidth() - this.A.getMeasuredWidth()) / 2;
        }
        if (this.c0) {
            i11 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        }
        int i19 = (point.y - org.telegram.messenger.g0.n) - i11;
        float height2 = this.b0 ? 0.0f : rectF.height();
        if (this.Z) {
            float f19 = f18 + height2;
            height = this.L ? (int) f19 : (int) (overlayContainerView.getY() + (Math.min(f19, i19) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.X || f18 + height2 + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > i19) {
                f18 = (f18 - height2) - this.A.getMeasuredHeight();
                if (!this.Y || Math.max(0.0f, f18 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    height = (int) (overlayContainerView.getY() + f18 + height2);
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (w60Var = this.x) != null) {
                        float f20 = rectF.bottom;
                        float f21 = this.R;
                        float f22 = f20 * f21;
                        float f23 = ((f21 + 1.0f) * rectF.right) / f10;
                        w60Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f22)) / f10) + 0;
                        w60 w60Var4 = this.x;
                        int i20 = (int) (w60Var4.w + f22);
                        int measuredWidth = (int) (((w60Var4.s + f23) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                        if (this.M == 3) {
                            measuredWidth = (int) (this.x.s - org.telegram.messenger.g0.L(8.0f));
                        }
                        int i21 = measuredWidth;
                        height = i20;
                        width = i21;
                    }
                    if (!this.w) {
                        if (g2Var != null && g2Var.getFragmentView() != null) {
                            g2Var.getFragmentView().getRootView().dispatchTouchEvent(org.telegram.messenger.g0.R());
                        } else if (viewGroup2 != null) {
                            overlayContainerView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i22 = org.telegram.ui.ActionBar.m6.E8;
                        org.telegram.ui.ActionBar.h6 h6Var = this.d;
                        U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i22, h6Var)));
                        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i22);
                        if (this.A != null) {
                            int i23 = 0;
                            while (i23 < this.A.getChildCount()) {
                                View childAt3 = i23 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i23);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i24 = 0; i24 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i24++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.M.getChildAt(i24);
                                        if (childAt4 instanceof org.telegram.ui.ActionBar.d1) {
                                            org.telegram.ui.ActionBar.t6.i(childAt4, K, h6Var);
                                        }
                                    }
                                } else if (childAt3 instanceof org.telegram.ui.ActionBar.d1) {
                                    org.telegram.ui.ActionBar.t6.i(childAt3, K, h6Var);
                                }
                                i23++;
                            }
                        }
                        ui.b bVar = this.n;
                        fh.g c10 = new dh.c(bVar, bVar, bVar).c(this.A, null, true);
                        c10.p(c8.i0.l(h6Var));
                        c10.q(org.telegram.messenger.g0.L(8.0f));
                        c10.R.e = true;
                        c10.r(org.telegram.messenger.g0.L(12.0f));
                        float f24 = width;
                        float f25 = height;
                        c10.i(this.q + f24, this.r + f25);
                        viewGroup = this.A;
                        if (viewGroup == this.D && (viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getChildCount() > 1) {
                            final float f26 = f24 + this.q;
                            final float f27 = f25 + this.r;
                            for (int i25 = 0; i25 < this.A.getChildCount(); i25++) {
                                View childAt5 = this.A.getChildAt(i25);
                                if (childAt5 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ui.b bVar2 = this.n;
                                    final fh.g c11 = new dh.c(bVar2, bVar2, bVar2).c(childAt5, null, true);
                                    c11.p(c8.i0.l(h6Var));
                                    c11.q(org.telegram.messenger.g0.L(8.0f));
                                    c11.R.e = true;
                                    c11.r(org.telegram.messenger.g0.L(12.0f));
                                    c11.i(childAt5.getLeft() + f26, childAt5.getTop() + f27);
                                    childAt5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.r60
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33) {
                                            fh.g.this.i(f26 + i26, f27 + i27);
                                        }
                                    });
                                    childAt5.setBackground(c11);
                                }
                            }
                        } else {
                            this.A.setBackground(c10);
                        }
                    }
                    t60 t60Var2 = this.m;
                    t60Var2.g = this.I;
                    float f28 = width + this.q;
                    this.d0 = f28;
                    float f29 = height + this.r;
                    this.e0 = f29;
                    t60Var2.showAtLocation(overlayContainerView, 0, (int) f28, (int) f29);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        qk qkVar = new qk(new WeakReference(this), 3);
                        this.r0 = qkVar;
                        view.setOnTouchListener(qkVar);
                    }
                    if (this.g0) {
                        D();
                        return;
                    }
                    return;
                }
                f18 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f10) - height2) - overlayContainerView.getY();
            }
            z10 = false;
            height = (int) (overlayContainerView.getY() + f18 + height2);
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float f202 = rectF.bottom;
                float f212 = this.R;
                float f222 = f202 * f212;
                float f232 = ((f212 + 1.0f) * rectF.right) / f10;
                w60Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f222)) / f10) + 0;
                w60 w60Var42 = this.x;
                int i202 = (int) (w60Var42.w + f222);
                int measuredWidth2 = (int) (((w60Var42.s + f232) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                if (this.M == 3) {
                }
                int i212 = measuredWidth2;
                height = i202;
                width = i212;
            }
            if (!this.w) {
            }
            if (this.v) {
                int i222 = org.telegram.ui.ActionBar.m6.E8;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.d;
                U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i222, h6Var2)));
                org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.06f, i222);
                if (this.A != null) {
                }
                ui.b bVar3 = this.n;
                fh.g c102 = new dh.c(bVar3, bVar3, bVar3).c(this.A, null, true);
                c102.p(c8.i0.l(h6Var2));
                c102.q(org.telegram.messenger.g0.L(8.0f));
                c102.R.e = true;
                c102.r(org.telegram.messenger.g0.L(12.0f));
                float f242 = width;
                float f252 = height;
                c102.i(this.q + f242, this.r + f252);
                viewGroup = this.A;
                if (viewGroup == this.D) {
                }
                this.A.setBackground(c102);
            }
            t60 t60Var22 = this.m;
            t60Var22.g = this.I;
            float f282 = width + this.q;
            this.d0 = f282;
            float f292 = height + this.r;
            this.e0 = f292;
            t60Var22.showAtLocation(overlayContainerView, 0, (int) f282, (int) f292);
            if (this.w) {
                if (view.getParent() != null) {
                }
                qk qkVar2 = new qk(new WeakReference(this), 3);
                this.r0 = qkVar2;
                view.setOnTouchListener(qkVar2);
            }
            if (this.g0) {
            }
        } else {
            height = (overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / 2;
        }
        z10 = false;
        if (this.E) {
        }
        if (this.L) {
        }
        if (!this.w) {
        }
        if (this.v) {
        }
        t60 t60Var222 = this.m;
        t60Var222.g = this.I;
        float f2822 = width + this.q;
        this.d0 = f2822;
        float f2922 = height + this.r;
        this.e0 = f2922;
        t60Var222.showAtLocation(overlayContainerView, 0, (int) f2822, (int) f2922);
        if (this.w) {
        }
        if (this.g0) {
        }
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            y0Var.setText(charSequence);
        } else {
            y0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            y0Var.setSubtext(null);
        }
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 4));
        int i12 = this.V;
        if (i12 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, c8.ma.o(this.V, -2));
        }
    }

    public final void b0(float f10, float f11) {
        this.q += f10;
        this.r += f11;
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        b(i7, null, charSequence, z10 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.F8, z10 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.E8, runnable);
    }

    public final void c0(int i7, int i10) {
        View w10 = w(this.A, i7, i10);
        View view = this.s0;
        if (w10 != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.s0 = w10;
            if (w10 != null) {
                w10.setPressed(true);
            }
        }
        View view2 = this.s0;
        if (view2 != null) {
            view2.getLocationOnScreen(this.t0);
            this.s0.drawableHotspotChanged(i7 - r1[0], i10 - r1[1]);
        }
    }

    public final void d(org.telegram.ui.ActionBar.y0 y0Var) {
        org.telegram.messenger.g0.E2(y0Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(org.telegram.ui.ActionBar.m6.E8, org.telegram.ui.ActionBar.m6.F8);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, org.telegram.ui.ActionBar.m6.E8);
        }
        int i7 = this.V;
        if (i7 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(y0Var, c8.ma.o(this.V, -2));
        }
    }

    public final void e(int i7, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        int i11 = org.telegram.ui.ActionBar.m6.F8;
        TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(org.telegram.messenger.p10.q(f10));
        y0Var.setClipToPadding(false);
        y0Var.a.setPadding((y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().d = i7;
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.r(f10);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        q9Var.f(f10, b9Var);
        q9Var.setScaleX(z10 ? 0.84f : 1.0f);
        q9Var.setScaleY(z10 ? 0.84f : 1.0f);
        y0Var.addView(q9Var, c8.ma.d(34, 34.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i12 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.w0(i12, h6Var), L);
            view.setBackground(w5Var);
            org.telegram.ui.ActionBar.t6.x(view, w5Var, i12, h6Var, PorterDuff.Mode.SRC_IN);
            y0Var.addView(view, c8.ma.b(36.0f, 36.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(i10, i11);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i10);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 1));
        int i13 = this.V;
        if (i13 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(y0Var, c8.ma.o(this.V, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            y0Var.setText(chat.title);
            y0Var.setSubtext(org.telegram.messenger.v3.V(chat) ? org.telegram.messenger.hd.N0(2131751378, null) : org.telegram.messenger.hd.N0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y0Var.setText(org.telegram.messenger.p10.q(user));
            if (user.id == org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).e()) {
                y0Var.setSubtext(org.telegram.messenger.hd.N0(2131743104, null));
            } else if (org.telegram.messenger.p10.u(user)) {
                y0Var.setSubtext(org.telegram.messenger.hd.N0(2131753153, null));
            }
        }
        y0Var.setClipToPadding(false);
        y0Var.a.setPadding((y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        q9 q9Var = new q9(context);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        q9Var.f(tLObject, b9Var);
        q9Var.setScaleX(z10 ? 0.84f : 1.0f);
        q9Var.setScaleY(z10 ? 0.84f : 1.0f);
        y0Var.addView(q9Var, c8.ma.d(34, 34.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i11 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.w0(i11, h6Var), L);
            view.setBackground(w5Var);
            org.telegram.ui.ActionBar.t6.x(view, w5Var, i11, h6Var, PorterDuff.Mode.SRC_IN);
            y0Var.addView(view, c8.ma.b(36.0f, 36.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(i7, i10);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i7);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 2));
        int i12 = this.V;
        if (i12 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, c8.ma.o(this.V, -2));
        }
    }

    public final org.telegram.ui.ActionBar.y0 h() {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i7);
        }
        int i11 = this.V;
        if (i11 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
            return y0Var;
        }
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
        r(y0Var, c8.ma.o(this.V, -2));
        return y0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i7, oi.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        int i11 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0((i7 == 0 && z1Var == null) ? 1 : 2, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (z1Var != null) {
            y0Var.j(charSequence, 0, z1Var);
        } else if (i7 != 0) {
            y0Var.j(charSequence, i7, null);
        } else {
            y0Var.setText(charSequence);
        }
        y0Var.setChecked(z10);
        Integer num = this.m0;
        if (num == null && this.n0 == null) {
            y0Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            Integer num2 = this.n0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        }
        Integer num3 = this.o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i10);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 5));
        int i12 = this.V;
        if (i12 <= 0) {
            r(y0Var, c8.ma.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, c8.ma.o(this.V, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.e, this.d);
        d1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.l0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.ma.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i7, null, charSequence, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, runnable);
        }
    }

    public final void m(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        if (z10) {
            c(i7, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 0, 12);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, a02, null, M, h6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.f(tLObject, b9Var);
        frameLayout.addView(q9Var, c8.ma.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.p10.q((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.t6.U(m10, org.telegram.ui.ActionBar.m6.q5, h6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, c8.ma.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new p60(this, runnable, 0));
        r(frameLayout, c8.ma.o(-1, 52));
    }

    public final void o(boolean z10) {
        boolean z11 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z11) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z10 ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i7 = this.a0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ma.z(-1.0f), c8.ma.z(i7 > 0 ? i7 / org.telegram.messenger.g0.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, !z10 ? 4 : 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new m60(this, 1));
        this.A.addView(this.D, c8.ma.t(-1, -2, 48, !z10 ? -8 : 0, z10 ? -8 : 0, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        di.xb xbVar = new di.xb(this.e, 25);
        xbVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.j5, this.d);
        xbVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        xbVar.setText(org.telegram.messenger.j6.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(R.id.fit_width_tag, 1);
        xbVar.setTypeface(null);
        org.telegram.messenger.ls.i(xbVar);
        if (i10 > 0) {
            xbVar.setMaxWidth(i10);
        }
        r(xbVar, c8.ma.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, c8.ma.o(-1, -2));
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
        this.q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void u() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            x5 textView = ((org.telegram.ui.ActionBar.y0) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hi.l3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void v() {
        if (this.q0) {
            this.q0 = false;
            return;
        }
        t60 t60Var = this.m;
        if (t60Var != null) {
            t60Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View x(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i7);
                if (childAt2 != null) {
                    return childAt2;
                }
                i7 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i10++;
        }
        return null;
    }

    public final int y() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i7 = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i10 = 0;
        while (i7 < this.A.getChildCount() - 1) {
            View childAt = i7 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i10 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i10;
            }
            i7++;
        }
        return i10;
    }

    public final org.telegram.ui.ActionBar.y0 z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                return (org.telegram.ui.ActionBar.y0) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
            return (org.telegram.ui.ActionBar.y0) childAt2;
        }
        return null;
    }

    public a70(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.a = viewGroup;
        this.d = h6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var))) > 0.705d ? org.telegram.messenger.ls.n1 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        C();
    }

    public a70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = h6Var;
    }
}
