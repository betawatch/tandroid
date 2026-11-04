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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f60 {
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
    public final org.telegram.ui.ActionBar.d2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public z50 f0;
    public Drawable g;
    public v50 g0;
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
    public b60 m;
    public ValueAnimator m0;
    public si.b n;
    public boolean n0;
    public final float[] o;
    public yj o0;
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
    public d60 x;
    public pk y;
    public final Rect z;

    public f60(org.telegram.ui.ActionBar.d2 d2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        if (d2Var.getContext() == null) {
            return;
        }
        if ((((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).J0) || (((d2Var instanceof org.telegram.ui.uw) && ((org.telegram.ui.uw) d2Var).X) || (((d2Var instanceof ContactsActivity) && ((ContactsActivity) d2Var).H) || ((d2Var instanceof org.telegram.ui.c31) && ((org.telegram.ui.c31) d2Var).O)))) && (parentLayout = d2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.d2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ee0) {
                d2Var = safeLastFragment;
            }
        }
        this.c = d2Var;
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = d2Var.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, resourceProvider))) > 0.705d ? org.telegram.messenger.hs.n1 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (view != viewGroup) {
            float y9 = view.getY() + f10;
            float x10 = view.getX() + f11;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x10 -= view.getScrollX();
                y9 -= view.getScrollY();
            }
            f11 = x10;
            f10 = y9;
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

    public static f60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        return new f60(viewGroup, e6Var, view, false, false, false);
    }

    public static f60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10) {
        return new f60(viewGroup, e6Var, view, z10, false, false);
    }

    public static f60 H(org.telegram.ui.ActionBar.d2 d2Var, View view) {
        return new f60(d2Var, view, false, true);
    }

    public static f60 I(org.telegram.ui.ActionBar.d2 d2Var, View view) {
        return new f60(d2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i3) {
        if (viewGroup == null) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                ((org.telegram.ui.ActionBar.c1) childAt).setColor(i3);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i3);
            }
        }
    }

    public static void a(f60 f60Var, ViewGroup viewGroup) {
        d60 d60Var = f60Var.x;
        if (d60Var == null) {
            return;
        }
        f60Var.x = null;
        ValueAnimator valueAnimator = f60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(d60Var.x, 0.0f);
        f60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new y50(d60Var, 0));
        f60Var.m0.addListener(new ei.k3(f60Var, d60Var, viewGroup, 8));
        if (f60Var.L) {
            f60Var.m0.setDuration(380L);
            f60Var.m0.setInterpolator(xq.h);
        } else {
            f60Var.m0.setDuration(150L);
        }
        f60Var.m0.start();
    }

    public static void f(f60 f60Var, ei.n6 n6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.u10 u10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = f60Var.e;
        ai.l4 l4Var = new ai.l4(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        l4Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        f60Var.r(l4Var, b8.mf.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, f60Var.e, f60Var.d, false, false);
            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i3 = org.telegram.ui.ActionBar.k6.E8;
            y0Var.c(i3, org.telegram.ui.ActionBar.k6.F8);
            y0Var.h(0.12f, i3);
            y0Var.j(org.telegram.messenger.bd.M0(2131744795, null), R.drawable.menu_album_add, null);
            y0Var.setOnClickListener(new m6(2, runnable));
            linearLayout.addView(y0Var, b8.mf.o(-1, -2));
        }
        ArrayList arrayList2 = n6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final ei.s6 s6Var = (ei.s6) obj;
            final int i11 = s6Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, f60Var.e, f60Var.d, false, false);
            y0Var2.setChecked(contains);
            y0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.k6.E8;
            y0Var2.c(i12, org.telegram.ui.ActionBar.k6.F8);
            y0Var2.h(f10, i12);
            TLRPC.Photo photo = s6Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                y0Var2.j(s6Var.b, R.drawable.msg_folders, null);
            } else {
                y0Var2.k(s6Var.b, org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(s6Var.c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), s6Var.c), "50_50", null, null);
            }
            y0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x50
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
                    u10Var.a(s6Var);
                }
            });
            linearLayout.addView(y0Var2, b8.mf.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i3, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i3 >= i11 && i3 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i3, i10);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.c1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        vn vnVar = new vn(this, this.e, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = vnVar;
        vnVar.setDispatchKeyEventListener(new u50(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.z50] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.z50
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                b60 b60Var;
                f60 f60Var = f60.this;
                if (f60Var.e0 == null || (b60Var = f60Var.m) == null || !b60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                f60Var.e0.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int[] iArr2 = f60Var.h0;
                if (i3 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i3;
                iArr2[1] = iArr[1];
                f60Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        v50 v50Var = new v50(this, 0);
        this.g0 = v50Var;
        this.e0.addOnLayoutChangeListener(v50Var);
    }

    public final boolean D() {
        b60 b60Var = this.m;
        return b60Var != null && b60Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            ((org.telegram.ui.ActionBar.y0) childAt).setMultiline(false);
        }
    }

    public final f60 J() {
        f60 f60Var = new f60(this.D, this.d);
        f60Var.C = this.D.b(f60Var.B);
        return f60Var;
    }

    public final void K(f60 f60Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(f60Var.C);
    }

    public final void L() {
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

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
            y0Var.setRightIcon(R.drawable.msg_mini_lock3);
            y0Var.getRightIcon().setAlpha(0.4f);
            y0Var.setOnClickListener(new w50(this, runnable, 3));
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
            v50 v50Var = this.g0;
            if (v50Var != null) {
                this.e0.removeOnLayoutChangeListener(v50Var);
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
        int i3;
        int x10;
        float width;
        float f10;
        int y9;
        b60 b60Var = this.m;
        if (b60Var == null || !b60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.o;
        A(view, viewGroup, fArr);
        float f11 = fArr[1];
        float f12 = fArr[0];
        if (this.c0) {
            viewGroup.getLocationOnScreen(new int[2]);
            f12 += r7[0];
            f11 += r7[1];
        }
        RectF rectF = new RectF();
        if (view instanceof e60) {
            ((e60) view).g(rectF);
        } else {
            int i10 = this.N;
            if (i10 == 0 || (i3 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i10, i3);
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
        float height = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            y9 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.n) {
                f14 = (f14 - height) - this.A.getMeasuredHeight();
                if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y9 = (int) (viewGroup.getY() + f14 + height);
        }
        float f15 = x10 + this.q;
        this.a0 = f15;
        float f16 = y9 + this.r;
        this.b0 = f16;
        this.m.update((int) f15, (int) f16, -1, -1);
    }

    public final void P(int i3) {
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i3);
            }
            i10++;
        }
    }

    public final void Q(eh.c cVar, hh.e eVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            gh.g c2 = cVar.c(viewGroup, null, z10);
            c2.p(eVar);
            c2.q(org.telegram.messenger.g0.L(8.0f));
            c2.R.e = true;
            c2.r(org.telegram.messenger.g0.L(12.0f));
            viewGroup.setBackground(c2);
        }
    }

    public final void R(x9 x9Var, float f10, float f11) {
        Drawable g7 = k2.p1.g(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new aa(new ba(x9Var, viewGroup, 5, false), this.A.getX() + this.a0 + f10, this.A.getY() + this.b0 + f11, g7, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i3 = 0; i3 < this.A.getChildCount(); i3++) {
            View childAt = this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new aa(new ba(x9Var, childAt, 5, false), this.A.getX() + this.a0 + f10 + childAt.getX(), this.A.getY() + this.b0 + f11 + childAt.getY(), g7, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void S(int i3, int i10) {
        this.j0 = Integer.valueOf(i3);
        this.k0 = Integer.valueOf(i10);
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).d(i3, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).d(i3, i10);
            }
            i11++;
        }
    }

    public final void T(int i3) {
        this.i0 = Integer.valueOf(i3);
        if (this.A != null) {
            int i10 = 0;
            while (i10 < this.A.getChildCount()) {
                View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.c1) {
                            ((org.telegram.ui.ActionBar.c1) childAt2).setColor(i3);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                    ((org.telegram.ui.ActionBar.c1) childAt).setColor(i3);
                }
                i10++;
            }
        }
    }

    public final void V(int i3) {
        this.i = i3;
        if (i3 == 5 && this.E) {
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

    public final void X(float f10) {
        b60 b60Var = this.m;
        if (b60Var != null) {
            b60Var.update((int) this.a0, (int) (this.b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        if (this.A == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.A.getChildCount()) {
            View childAt = i3 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = s51Var.getChildAt(0);
                    View childAt3 = s51Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.y0;
                    org.telegram.ui.ActionBar.e6 e6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).n(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof ca0) || (childAt2 instanceof FrameLayout)) {
                        int i10 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.ActionBar.r6.R(childAt2, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 12, childAt2 == childAt3 ? 12 : 0), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        int i11 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 12, childAt2 == childAt3 ? 12 : 0);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                        childAt2.setBackground(a02);
                        org.telegram.ui.ActionBar.r6.k(childAt2, a02, null, N, e6Var);
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.y0) {
                        ((org.telegram.ui.ActionBar.y0) childAt3).n(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof ca0) || (childAt3 instanceof FrameLayout)) {
                        int i12 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.ActionBar.r6.R(childAt3, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), childAt2 == childAt3 ? 12 : 0, 12), null, org.telegram.ui.ActionBar.r6.N(i12), e6Var);
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        int i13 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), childAt2 == childAt3 ? 12 : 0, 12);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
                        childAt3.setBackground(a03);
                        org.telegram.ui.ActionBar.r6.k(childAt3, a03, null, N2, e6Var);
                    }
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f10;
        float f11;
        int i3;
        float f12;
        float f13;
        int width;
        int i10;
        int height;
        boolean z10;
        boolean z11;
        d60 d60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f14;
        float width2;
        float f15;
        d60 d60Var2;
        if (this.m != null || this.B != null || x() <= 0) {
            return;
        }
        Y();
        if (this.T > 0) {
            int i11 = 0;
            while (i11 < this.A.getChildCount() - 1) {
                View childAt = i11 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i11);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i12++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i12).getLayoutParams().width = org.telegram.messenger.g0.L(this.T);
                    }
                }
                i11++;
            }
        } else if (this.S > 0) {
            int i13 = 0;
            while (i13 < this.A.getChildCount() - 1) {
                View childAt2 = i13 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i13);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i14 = 0; i14 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i14++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.M.getChildAt(i14).setMinimumWidth(org.telegram.messenger.g0.L(this.S));
                    }
                }
                i13++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new si.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? d2Var.getParentLayout().getOverlayContainerView() : viewGroup;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float f16 = point.y / 2.0f;
        int i15 = 2;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            A(view, overlayContainerView, fArr);
            f16 = fArr[1];
            f11 = fArr[0];
            if (this.c0) {
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
        if (view instanceof e60) {
            ((e60) view).g(rectF);
        } else {
            int i16 = this.N;
            if (i16 == 0 || (i3 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i16, i3);
            }
        }
        float f17 = f11 + rectF.left;
        float f18 = f16 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f17 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            d60 d60Var3 = new d60(this, context);
            this.x = d60Var3;
            this.y = new pk(i15, d60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, b8.mf.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new c6(this, 29));
            this.m0.addListener(new a60(this, 0));
            if (this.L) {
                f12 = f17;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(xq.h);
            } else {
                f12 = f17;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f12 = f17;
        }
        if (!this.L || (d60Var2 = this.x) == null || this.N == 0) {
            f13 = f12;
        } else {
            d60Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = org.telegram.messenger.g0.L(36.0f);
            }
            f13 = (-fArr[0]) + this.x.s + f12;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        b60 b60Var = new b60(this, this.A, overlayContainerView);
        this.m = b60Var;
        b60Var.setOnDismissListener(new c60(this, overlayContainerView));
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
        if (org.telegram.messenger.g0.Q1()) {
            f18 += overlayContainerView.getPaddingTop();
            f13 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            int i17 = this.i;
            if (i17 == 3) {
                width = (int) (overlayContainerView.getX() + f13);
            } else {
                if (i17 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f13;
                    f15 = rectF2.right;
                } else {
                    if (i17 == 1) {
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
        if (this.Z) {
            i10 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i10 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        }
        int i18 = (point.y - org.telegram.messenger.g0.n) - i10;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            height = this.L ? (int) (f18 + height2) : (int) (overlayContainerView.getY() + (Math.min(f18 + height2, i18) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.U || f18 + height2 + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > i18) {
                f18 = (f18 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f18 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    int y9 = (int) (overlayContainerView.getY() + f18 + height2);
                    z11 = z10;
                    height = y9;
                    if (this.E && z11 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (d60Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f19 = rectF.bottom;
                        d60Var.w = (height3 - (measuredHeight + f19)) / f10;
                        d60 d60Var4 = this.x;
                        height = (int) (d60Var4.w + f19);
                        width = (int) (((d60Var4.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - org.telegram.messenger.g0.L(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (d2Var != null && d2Var.getFragmentView() != null) {
                            d2Var.getFragmentView().getRootView().dispatchTouchEvent(org.telegram.messenger.g0.R());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i19 = org.telegram.ui.ActionBar.k6.E8;
                        org.telegram.ui.ActionBar.e6 e6Var = this.d;
                        T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i19, e6Var)));
                        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i19);
                        if (this.A != null) {
                            int i20 = 0;
                            while (i20 < this.A.getChildCount()) {
                                View childAt3 = i20 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i20);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i21 = 0; i21 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i21++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.M.getChildAt(i21);
                                        if (childAt4 instanceof org.telegram.ui.ActionBar.c1) {
                                            org.telegram.ui.ActionBar.r6.j(childAt4, L, e6Var);
                                        }
                                    }
                                } else if (childAt3 instanceof org.telegram.ui.ActionBar.c1) {
                                    org.telegram.ui.ActionBar.r6.j(childAt3, L, e6Var);
                                }
                                i20++;
                            }
                        }
                        si.b bVar = this.n;
                        gh.g c2 = new eh.c(bVar, bVar, bVar).c(this.A, null, true);
                        c2.p(b8.cd.k(e6Var));
                        c2.q(org.telegram.messenger.g0.L(8.0f));
                        c2.R.e = true;
                        c2.r(org.telegram.messenger.g0.L(12.0f));
                        c2.i(width + this.q, height + this.r);
                        this.A.setBackground(c2);
                    }
                    b60 b60Var2 = this.m;
                    b60Var2.g = this.I;
                    float f20 = width + this.q;
                    this.a0 = f20;
                    float f21 = height + this.r;
                    this.b0 = f21;
                    b60Var2.showAtLocation(overlayContainerView, 0, (int) f20, (int) f21);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        yj yjVar = new yj(new WeakReference(this), 3);
                        this.o0 = yjVar;
                        view.setOnTouchListener(yjVar);
                    }
                    if (this.d0) {
                        C();
                        return;
                    }
                    return;
                }
                f18 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f10) - height2) - overlayContainerView.getY();
            }
            z10 = false;
            int y92 = (int) (overlayContainerView.getY() + f18 + height2);
            z11 = z10;
            height = y92;
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height32 = overlayContainerView.getHeight();
                float measuredHeight2 = this.A.getMeasuredHeight();
                float f192 = rectF.bottom;
                d60Var.w = (height32 - (measuredHeight2 + f192)) / f10;
                d60 d60Var42 = this.x;
                height = (int) (d60Var42.w + f192);
                width = (int) (((d60Var42.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i192 = org.telegram.ui.ActionBar.k6.E8;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.d;
                T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i192, e6Var2)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.06f, i192);
                if (this.A != null) {
                }
                si.b bVar2 = this.n;
                gh.g c22 = new eh.c(bVar2, bVar2, bVar2).c(this.A, null, true);
                c22.p(b8.cd.k(e6Var2));
                c22.q(org.telegram.messenger.g0.L(8.0f));
                c22.R.e = true;
                c22.r(org.telegram.messenger.g0.L(12.0f));
                c22.i(width + this.q, height + this.r);
                this.A.setBackground(c22);
            }
            b60 b60Var22 = this.m;
            b60Var22.g = this.I;
            float f202 = width + this.q;
            this.a0 = f202;
            float f212 = height + this.r;
            this.b0 = f212;
            b60Var22.showAtLocation(overlayContainerView, 0, (int) f202, (int) f212);
            if (this.w) {
                if (view.getParent() != null) {
                }
                yj yjVar2 = new yj(new WeakReference(this), 3);
                this.o0 = yjVar2;
                view.setOnTouchListener(yjVar2);
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
        b60 b60Var222 = this.m;
        b60Var222.g = this.I;
        float f2022 = width + this.q;
        this.a0 = f2022;
        float f2122 = height + this.r;
        this.b0 = f2122;
        b60Var222.showAtLocation(overlayContainerView, 0, (int) f2022, (int) f2122);
        if (this.w) {
        }
        if (this.d0) {
        }
    }

    public final void a0(float f10, float f11) {
        this.q += f10;
        this.r += f11;
    }

    public final void b(int i3, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i3 == 0 && drawable == null) {
            y0Var.setText(charSequence);
        } else {
            y0Var.j(charSequence, i3, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            y0Var.setSubtext(null);
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 4));
        int i12 = this.S;
        if (i12 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, b8.mf.o(this.S, -2));
        }
    }

    public final void b0(int i3, int i10) {
        View v = v(this.A, i3, i10);
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
            this.p0.drawableHotspotChanged(i3 - r1[0], i10 - r1[1]);
        }
    }

    public final void c(int i3, CharSequence charSequence, Runnable runnable, boolean z10) {
        b(i3, null, charSequence, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.F8, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.y0 y0Var) {
        org.telegram.messenger.g0.E2(y0Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, org.telegram.ui.ActionBar.k6.E8);
        }
        int i3 = this.S;
        if (i3 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i3));
            r(y0Var, b8.mf.o(this.S, -2));
        }
    }

    public final void e(int i3, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(org.telegram.messenger.l10.p(f10));
        y0Var.setClipToPadding(false);
        y0Var.a.setPadding((y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        k9 k9Var = new k9(context);
        k9Var.getImageReceiver().d = i3;
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(f10);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        k9Var.e(f10, u8Var);
        k9Var.setScaleX(z10 ? 0.84f : 1.0f);
        k9Var.setScaleY(z10 ? 0.84f : 1.0f);
        y0Var.addView(k9Var, b8.mf.d(34, 34.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i12, e6Var), L);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.r6.y(view, u5Var, i12, e6Var, PorterDuff.Mode.SRC_IN);
            y0Var.addView(view, b8.mf.b(36.0f, 36.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(i10, i11);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i10);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 1));
        int i13 = this.S;
        if (i13 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(y0Var, b8.mf.o(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            y0Var.setText(chat.title);
            y0Var.setSubtext(org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.bd.M0(2131751391, null) : org.telegram.messenger.bd.M0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y0Var.setText(org.telegram.messenger.l10.p(user));
            if (user.id == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e()) {
                y0Var.setSubtext(org.telegram.messenger.bd.M0(2131743359, null));
            } else if (org.telegram.messenger.l10.t(user)) {
                y0Var.setSubtext(org.telegram.messenger.bd.M0(2131753156, null));
            }
        }
        y0Var.setClipToPadding(false);
        y0Var.a.setPadding((y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!y0Var.d && y0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        k9 k9Var = new k9(context);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        k9Var.e(tLObject, u8Var);
        k9Var.setScaleX(z10 ? 0.84f : 1.0f);
        k9Var.setScaleY(z10 ? 0.84f : 1.0f);
        y0Var.addView(k9Var, b8.mf.d(34, 34.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i11, e6Var), L);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.r6.y(view, u5Var, i11, e6Var, PorterDuff.Mode.SRC_IN);
            y0Var.addView(view, b8.mf.b(36.0f, 36.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(i3, i10);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i3);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 2));
        int i12 = this.S;
        if (i12 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, b8.mf.o(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.y0 h() {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(i3, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i3);
        }
        int i11 = this.S;
        if (i11 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
            return y0Var;
        }
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
        r(y0Var, b8.mf.o(this.S, -2));
        return y0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i3, mi.a2 a2Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0((i3 == 0 && a2Var == null) ? 1 : 2, this.e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (a2Var != null) {
            y0Var.j(charSequence, 0, a2Var);
        } else if (i3 != 0) {
            y0Var.j(charSequence, i3, null);
        } else {
            y0Var.setText(charSequence);
        }
        y0Var.setChecked(z10);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            y0Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            Integer num2 = this.k0;
            y0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i10);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 5));
        int i12 = this.S;
        if (i12 <= 0) {
            r(y0Var, b8.mf.o(-1, -2));
        } else {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, b8.mf.o(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.e, this.d);
        c1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            c1Var.setColor(num.intValue());
        }
        r(c1Var, b8.mf.o(-1, 8));
    }

    public final void l(int i3, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i3, null, charSequence, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
        }
    }

    public final void m(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        if (z10) {
            c(i3, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), 0, 12);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, null, N, e6Var);
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        k9Var.e(tLObject, u8Var);
        frameLayout.addView(k9Var, b8.mf.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.l10.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.r6.V(m10, org.telegram.ui.ActionBar.k6.q5, e6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, b8.mf.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new w50(this, runnable, 0));
        r(frameLayout, b8.mf.o(-1, 52));
    }

    public final void o() {
        boolean z10 = this.A instanceof LinearLayout;
        int i3 = 1;
        Context context = this.e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b8.mf.z(-1.0f), b8.mf.z(i10 > 0 ? i10 / org.telegram.messenger.g0.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new u50(this, i3));
        this.A.addView(this.D, b8.mf.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i3, int i10, CharSequence charSequence) {
        ci.ec ecVar = new ci.ec(this.e, 25);
        ecVar.setTextSize(1, i3);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.j5, this.d);
        ecVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        ecVar.setText(org.telegram.messenger.i6.m(charSequence, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        ecVar.setTag(R.id.fit_width_tag, 1);
        ecVar.setTypeface(null);
        org.telegram.messenger.hs.i(ecVar);
        if (i10 > 0) {
            ecVar.setMaxWidth(i10);
        }
        r(ecVar, b8.mf.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, b8.mf.o(-1, -2));
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
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
            o5 textView = ((org.telegram.ui.ActionBar.y0) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + gi.l3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        b60 b60Var = this.m;
        if (b60Var != null) {
            b60Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i3);
                if (childAt2 != null) {
                    return childAt2;
                }
                i3 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i10++;
        }
        return null;
    }

    public final int x() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i3 = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i10 = 0;
        while (i3 < this.A.getChildCount() - 1) {
            View childAt = i3 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i10 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i10;
            }
            i3++;
        }
        return i10;
    }

    public final org.telegram.ui.ActionBar.y0 y() {
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
        return this.D.M.getChildAt(r0.getItemsCount() - 1);
    }

    public f60(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.d = e6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var))) > 0.705d ? org.telegram.messenger.hs.n1 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public f60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.d = e6Var;
    }
}
