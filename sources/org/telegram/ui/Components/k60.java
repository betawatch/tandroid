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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k60 {
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
    public final org.telegram.ui.ActionBar.f2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public d60 f0;
    public Drawable g;
    public z50 g0;
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
    public f60 m;
    public ValueAnimator m0;
    public ri.b n;
    public boolean n0;
    public final float[] o;
    public zj o0;
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
    public i60 x;
    public rk y;
    public final Rect z;

    public k60(org.telegram.ui.ActionBar.f2 f2Var, View view, boolean z9, boolean z10) {
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
        if (f2Var.getContext() == null) {
            return;
        }
        if ((((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).I0) || (((f2Var instanceof org.telegram.ui.ww) && ((org.telegram.ui.ww) f2Var).W) || (((f2Var instanceof ContactsActivity) && ((ContactsActivity) f2Var).G) || ((f2Var instanceof org.telegram.ui.m31) && ((org.telegram.ui.m31) f2Var).N)))) && (parentLayout = f2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.f2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.je0) {
                f2Var = safeLastFragment;
            }
        }
        this.c = f2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = f2Var.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, resourceProvider))) > 0.705d ? org.telegram.messenger.qs.n1 : 51;
        this.E = z9;
        this.G = z10;
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

    public static k60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new k60(viewGroup, f6Var, view, false, false, false);
    }

    public static k60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z9) {
        return new k60(viewGroup, f6Var, view, z9, false, false);
    }

    public static k60 H(org.telegram.ui.ActionBar.f2 f2Var, View view) {
        return new k60(f2Var, view, false, true);
    }

    public static k60 I(org.telegram.ui.ActionBar.f2 f2Var, View view) {
        return new k60(f2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i7) {
        if (viewGroup == null) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i7);
            }
        }
    }

    public static void a(k60 k60Var, ViewGroup viewGroup) {
        i60 i60Var = k60Var.x;
        if (i60Var == null) {
            return;
        }
        k60Var.x = null;
        ValueAnimator valueAnimator = k60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i60Var.x, 0.0f);
        k60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new c60(i60Var, 0));
        k60Var.m0.addListener(new di.h3(k60Var, i60Var, viewGroup, 8));
        if (k60Var.L) {
            k60Var.m0.setDuration(380L);
            k60Var.m0.setInterpolator(xq.h);
        } else {
            k60Var.m0.setDuration(150L);
        }
        k60Var.m0.start();
    }

    public static void f(k60 k60Var, di.m6 m6Var, final HashSet hashSet, boolean z9, Runnable runnable, final org.telegram.messenger.c20 c20Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = k60Var.e;
        h60 h60Var = new h60(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        h60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        k60Var.r(h60Var, c8.ha.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z9 && runnable != null) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, k60Var.e, k60Var.d, false, false);
            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.k6.E8;
            z0Var.c(i7, org.telegram.ui.ActionBar.k6.F8);
            z0Var.h(0.12f, i7);
            z0Var.j(org.telegram.messenger.hd.M0(2131744786, null), R.drawable.menu_album_add, null);
            z0Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(z0Var, c8.ha.o(-1, -2));
        }
        ArrayList arrayList2 = m6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final di.r6 r6Var = (di.r6) obj;
            final int i11 = r6Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, k60Var.e, k60Var.d, false, false);
            z0Var2.setChecked(contains);
            z0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.k6.E8;
            z0Var2.c(i12, org.telegram.ui.ActionBar.k6.F8);
            z0Var2.h(f10, i12);
            TLRPC.Photo photo = r6Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                z0Var2.j(r6Var.b, R.drawable.msg_folders, null);
            } else {
                z0Var2.k(r6Var.b, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(r6Var.c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), r6Var.c), "50_50", null, null);
            }
            z0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z10 = contains;
                    HashSet hashSet2 = hashSet;
                    int i13 = i11;
                    if (z10) {
                        hashSet2.remove(Integer.valueOf(i13));
                    } else {
                        hashSet2.add(Integer.valueOf(i13));
                    }
                    c20Var.a(r6Var);
                }
            });
            linearLayout.addView(z0Var2, c8.ha.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i7, int i10) {
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
                        View v = v(viewGroup.getChildAt(childCount), i7, i10);
                        if (v != null) {
                            return v;
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

    public final void B() {
        wn wnVar = new wn(this, this.e, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = wnVar;
        wnVar.setDispatchKeyEventListener(new y50(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.d60] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.d60
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                f60 f60Var;
                k60 k60Var = k60.this;
                if (k60Var.e0 == null || (f60Var = k60Var.m) == null || !f60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                k60Var.e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int[] iArr2 = k60Var.h0;
                if (i7 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i7;
                iArr2[1] = iArr[1];
                k60Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        z50 z50Var = new z50(this, 0);
        this.g0 = z50Var;
        this.e0.addOnLayoutChangeListener(z50Var);
    }

    public final boolean D() {
        f60 f60Var = this.m;
        return f60Var != null && f60Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.z0) {
            ((org.telegram.ui.ActionBar.z0) childAt).setMultiline(false);
        }
    }

    public final k60 J() {
        k60 k60Var = new k60(this.D, this.d);
        k60Var.C = this.D.b(k60Var.B);
        return k60Var;
    }

    public final void K(k60 k60Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(k60Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.z0) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
            z0Var.setRightIcon(R.drawable.msg_text_check);
            z0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            z0Var.getRightIcon().setScaleX(0.85f);
            z0Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.z0) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
            z0Var.setRightIcon(R.drawable.msg_mini_lock3);
            z0Var.getRightIcon().setAlpha(0.4f);
            z0Var.setOnClickListener(new a60(this, runnable, 3));
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
            z50 z50Var = this.g0;
            if (z50Var != null) {
                this.e0.removeOnLayoutChangeListener(z50Var);
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
        int i7;
        int x10;
        float width;
        float f10;
        int y10;
        f60 f60Var = this.m;
        if (f60Var == null || !f60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof j60) {
            ((j60) view).g(rectF);
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
        float height = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.n) {
                f14 = (f14 - height) - this.A.getMeasuredHeight();
                if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y10 = (int) (viewGroup.getY() + f14 + height);
        }
        float f15 = x10 + this.q;
        this.a0 = f15;
        float f16 = y10 + this.r;
        this.b0 = f16;
        this.m.update((int) f15, (int) f16, -1, -1);
    }

    public final void P(int i7) {
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i7);
            }
            i10++;
        }
    }

    public final void Q(dh.c cVar, gh.e eVar, boolean z9) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            fh.g c10 = cVar.c(viewGroup, null, z9);
            c10.p(eVar);
            c10.q(org.telegram.messenger.g0.L(8.0f));
            c10.Q.e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void R(y9 y9Var, float f10, float f11) {
        Drawable h = jg.g.h(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ba(new ca(y9Var, viewGroup, 5, false), this.A.getX() + this.a0 + f10, this.A.getY() + this.b0 + f11, h, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ba(new ca(y9Var, childAt, 5, false), this.A.getX() + this.a0 + f10 + childAt.getX(), this.A.getY() + this.b0 + f11 + childAt.getY(), h, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void S(int i7, int i10) {
        this.j0 = Integer.valueOf(i7);
        this.k0 = Integer.valueOf(i10);
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                        ((org.telegram.ui.ActionBar.z0) childAt2).d(i7, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                ((org.telegram.ui.ActionBar.z0) childAt).d(i7, i10);
            }
            i11++;
        }
    }

    public final void T(int i7) {
        this.i0 = Integer.valueOf(i7);
        if (this.A != null) {
            int i10 = 0;
            while (i10 < this.A.getChildCount()) {
                View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
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

    public final void V(int i7) {
        this.i = i7;
        if (i7 == 5 && this.E) {
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
        f60 f60Var = this.m;
        if (f60Var != null) {
            f60Var.update((int) this.a0, (int) (this.b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        if (this.A == null) {
            return;
        }
        int i7 = 0;
        while (i7 < this.A.getChildCount()) {
            View childAt = i7 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = c61Var.getChildAt(0);
                    View childAt3 = c61Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z9 = childAt2 instanceof org.telegram.ui.ActionBar.z0;
                    org.telegram.ui.ActionBar.f6 f6Var = this.d;
                    if (z9) {
                        ((org.telegram.ui.ActionBar.z0) childAt2).n(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof ha0) || (childAt2 instanceof FrameLayout)) {
                        int i10 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.ActionBar.r6.R(childAt2, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 12, childAt2 == childAt3 ? 12 : 0), null, org.telegram.ui.ActionBar.r6.N(i10), f6Var);
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        int i11 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 12, childAt2 == childAt3 ? 12 : 0);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                        childAt2.setBackground(a02);
                        org.telegram.ui.ActionBar.r6.k(childAt2, a02, null, N, f6Var);
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.z0) {
                        ((org.telegram.ui.ActionBar.z0) childAt3).n(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof ha0) || (childAt3 instanceof FrameLayout)) {
                        int i12 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.ActionBar.r6.R(childAt3, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), childAt2 == childAt3 ? 12 : 0, 12), null, org.telegram.ui.ActionBar.r6.N(i12), f6Var);
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        int i13 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var), childAt2 == childAt3 ? 12 : 0, 12);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
                        childAt3.setBackground(a03);
                        org.telegram.ui.ActionBar.r6.k(childAt3, a03, null, N2, f6Var);
                    }
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0555 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f10;
        float f11;
        int i7;
        int i10;
        float f12;
        float f13;
        int width;
        int i11;
        int height;
        boolean z9;
        boolean z10;
        i60 i60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f14;
        float width2;
        float f15;
        i60 i60Var2;
        if (this.m != null || this.B != null || x() <= 0) {
            return;
        }
        Y();
        if (this.T > 0) {
            int i12 = 0;
            while (i12 < this.A.getChildCount() - 1) {
                View childAt = i12 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i12);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i13++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i13).getLayoutParams().width = org.telegram.messenger.g0.L(this.T);
                    }
                }
                i12++;
            }
        } else if (this.S > 0) {
            int i14 = 0;
            while (i14 < this.A.getChildCount() - 1) {
                View childAt2 = i14 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i14);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i15++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.L.getChildAt(i15).setMinimumWidth(org.telegram.messenger.g0.L(this.S));
                    }
                }
                i14++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new ri.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? f2Var.getParentLayout().getOverlayContainerView() : viewGroup;
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
        if (view instanceof j60) {
            ((j60) view).g(rectF);
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
        if (this.s > 0 || this.u || this.v) {
            i60 i60Var3 = new i60(this, context);
            this.x = i60Var3;
            this.y = new rk(i16, i60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, c8.ha.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new n61(this, 1));
            this.m0.addListener(new e60(this, i7));
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
        if (!this.L || (i60Var2 = this.x) == null || this.N == 0) {
            f13 = f12;
        } else {
            i60Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = org.telegram.messenger.g0.L(36.0f);
            }
            f13 = (-fArr[0]) + this.x.s + f12;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        f60 f60Var = new f60(this, this.A, overlayContainerView);
        this.m = f60Var;
        f60Var.setOnDismissListener(new g60(this, overlayContainerView));
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
        if (this.Z) {
            i11 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        }
        int i19 = (point.y - org.telegram.messenger.g0.n) - i11;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            height = this.L ? (int) (f18 + height2) : (int) (overlayContainerView.getY() + (Math.min(f18 + height2, i19) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.U || f18 + height2 + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > i19) {
                f18 = (f18 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f18 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z9 = true;
                    int y10 = (int) (overlayContainerView.getY() + f18 + height2);
                    z10 = z9;
                    height = y10;
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (i60Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f19 = rectF.bottom;
                        i60Var.w = (height3 - (measuredHeight + f19)) / f10;
                        i60 i60Var4 = this.x;
                        height = (int) (i60Var4.w + f19);
                        width = (int) (((i60Var4.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - org.telegram.messenger.g0.L(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (f2Var != null && f2Var.getFragmentView() != null) {
                            f2Var.getFragmentView().getRootView().dispatchTouchEvent(org.telegram.messenger.g0.R());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i20 = org.telegram.ui.ActionBar.k6.E8;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i20, f6Var)));
                        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i20);
                        if (this.A != null) {
                            int i21 = 0;
                            while (i21 < this.A.getChildCount()) {
                                View childAt3 = i21 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i21);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i22 = 0; i22 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i22++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.L.getChildAt(i22);
                                        if (childAt4 instanceof org.telegram.ui.ActionBar.d1) {
                                            org.telegram.ui.ActionBar.r6.j(childAt4, L, f6Var);
                                        }
                                    }
                                } else if (childAt3 instanceof org.telegram.ui.ActionBar.d1) {
                                    org.telegram.ui.ActionBar.r6.j(childAt3, L, f6Var);
                                }
                                i21++;
                            }
                        }
                        ri.b bVar = this.n;
                        fh.g c10 = new dh.c(bVar, bVar, bVar).c(this.A, null, true);
                        c10.p(c8.g0.k(f6Var));
                        c10.q(org.telegram.messenger.g0.L(8.0f));
                        c10.Q.e = true;
                        c10.r(org.telegram.messenger.g0.L(12.0f));
                        c10.i(width + this.q, height + this.r);
                        this.A.setBackground(c10);
                    }
                    f60 f60Var2 = this.m;
                    f60Var2.g = this.I;
                    float f20 = width + this.q;
                    this.a0 = f20;
                    float f21 = height + this.r;
                    this.b0 = f21;
                    f60Var2.showAtLocation(overlayContainerView, 0, (int) f20, (int) f21);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        zj zjVar = new zj(new WeakReference(this), 3);
                        this.o0 = zjVar;
                        view.setOnTouchListener(zjVar);
                    }
                    if (this.d0) {
                        C();
                        return;
                    }
                    return;
                }
                f18 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f10) - height2) - overlayContainerView.getY();
            }
            z9 = false;
            int y102 = (int) (overlayContainerView.getY() + f18 + height2);
            z10 = z9;
            height = y102;
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height32 = overlayContainerView.getHeight();
                float measuredHeight2 = this.A.getMeasuredHeight();
                float f192 = rectF.bottom;
                i60Var.w = (height32 - (measuredHeight2 + f192)) / f10;
                i60 i60Var42 = this.x;
                height = (int) (i60Var42.w + f192);
                width = (int) (((i60Var42.s + rectF.right) - this.A.getMeasuredWidth()) + org.telegram.messenger.g0.L(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i202 = org.telegram.ui.ActionBar.k6.E8;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.d;
                T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i202, f6Var2)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.06f, i202);
                if (this.A != null) {
                }
                ri.b bVar2 = this.n;
                fh.g c102 = new dh.c(bVar2, bVar2, bVar2).c(this.A, null, true);
                c102.p(c8.g0.k(f6Var2));
                c102.q(org.telegram.messenger.g0.L(8.0f));
                c102.Q.e = true;
                c102.r(org.telegram.messenger.g0.L(12.0f));
                c102.i(width + this.q, height + this.r);
                this.A.setBackground(c102);
            }
            f60 f60Var22 = this.m;
            f60Var22.g = this.I;
            float f202 = width + this.q;
            this.a0 = f202;
            float f212 = height + this.r;
            this.b0 = f212;
            f60Var22.showAtLocation(overlayContainerView, 0, (int) f202, (int) f212);
            if (this.w) {
                if (view.getParent() != null) {
                }
                zj zjVar2 = new zj(new WeakReference(this), 3);
                this.o0 = zjVar2;
                view.setOnTouchListener(zjVar2);
            }
            if (this.d0) {
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
        f60 f60Var222 = this.m;
        f60Var222.g = this.I;
        float f2022 = width + this.q;
        this.a0 = f2022;
        float f2122 = height + this.r;
        this.b0 = f2122;
        f60Var222.showAtLocation(overlayContainerView, 0, (int) f2022, (int) f2122);
        if (this.w) {
        }
        if (this.d0) {
        }
    }

    public final void a0(float f10, float f11) {
        this.q += f10;
        this.r += f11;
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            z0Var.setText(charSequence);
        } else {
            z0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            z0Var.setSubtext(null);
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 4));
        int i12 = this.S;
        if (i12 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
        } else {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ha.o(this.S, -2));
        }
    }

    public final void b0(int i7, int i10) {
        View v = v(this.A, i7, i10);
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
            this.p0.drawableHotspotChanged(i7 - r1[0], i10 - r1[1]);
        }
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z9) {
        b(i7, null, charSequence, z9 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.F8, z9 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.z0 z0Var) {
        org.telegram.messenger.g0.E2(z0Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, org.telegram.ui.ActionBar.k6.E8);
        }
        int i7 = this.S;
        if (i7 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
        } else {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(z0Var, c8.ha.o(this.S, -2));
        }
    }

    public final void e(int i7, boolean z9, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(org.telegram.messenger.t10.p(f10));
        z0Var.setClipToPadding(false);
        z0Var.a.setPadding((z0Var.d && z0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!z0Var.d && z0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        l9 l9Var = new l9(context);
        l9Var.getImageReceiver().d = i7;
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.r(f10);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        l9Var.e(f10, w8Var);
        l9Var.setScaleX(z9 ? 0.84f : 1.0f);
        l9Var.setScaleY(z9 ? 0.84f : 1.0f);
        z0Var.addView(l9Var, c8.ha.d(34, 34.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z9) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i12, f6Var), L);
            view.setBackground(v5Var);
            org.telegram.ui.ActionBar.r6.y(view, v5Var, i12, f6Var, PorterDuff.Mode.SRC_IN);
            z0Var.addView(view, c8.ha.b(36.0f, 36.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(i10, i11);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i10);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 1));
        int i13 = this.S;
        if (i13 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
        } else {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(z0Var, c8.ha.o(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z9, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            z0Var.setText(chat.title);
            z0Var.setSubtext(org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.hd.M0(2131751391, null) : org.telegram.messenger.hd.M0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z0Var.setText(org.telegram.messenger.t10.p(user));
            if (user.id == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e()) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131743350, null));
            } else if (org.telegram.messenger.t10.t(user)) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131753156, null));
            }
        }
        z0Var.setClipToPadding(false);
        z0Var.a.setPadding((z0Var.d && z0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!z0Var.d && z0Var.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        l9 l9Var = new l9(context);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        l9Var.e(tLObject, w8Var);
        l9Var.setScaleX(z9 ? 0.84f : 1.0f);
        l9Var.setScaleY(z9 ? 0.84f : 1.0f);
        z0Var.addView(l9Var, c8.ha.d(34, 34.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z9) {
            View view = new View(context);
            int L = org.telegram.messenger.g0.L(34.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i11, f6Var), L);
            view.setBackground(v5Var);
            org.telegram.ui.ActionBar.r6.y(view, v5Var, i11, f6Var, PorterDuff.Mode.SRC_IN);
            z0Var.addView(view, c8.ha.b(36.0f, 36.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(i7, i10);
        } else {
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i7);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 2));
        int i12 = this.S;
        if (i12 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
        } else {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ha.o(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.z0 h() {
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, this.e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i7);
        }
        int i11 = this.S;
        if (i11 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
            return z0Var;
        }
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
        r(z0Var, c8.ha.o(this.S, -2));
        return z0Var;
    }

    public final void i(Runnable runnable, String str, boolean z9) {
        j(z9, 0, null, str, runnable);
    }

    public final void j(boolean z9, int i7, li.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0((i7 == 0 && z1Var == null) ? 1 : 2, this.e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (z1Var != null) {
            z0Var.j(charSequence, 0, z1Var);
        } else if (i7 != 0) {
            z0Var.j(charSequence, i7, null);
        } else {
            z0Var.setText(charSequence);
        }
        z0Var.setChecked(z9);
        Integer num = this.j0;
        if (num == null && this.k0 == null) {
            z0Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            Integer num2 = this.k0;
            z0Var.d(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        }
        Integer num3 = this.l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i10);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 5));
        int i12 = this.S;
        if (i12 <= 0) {
            r(z0Var, c8.ha.o(-1, -2));
        } else {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ha.o(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.e, this.d);
        d1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.ha.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z9) {
        if (z9) {
            b(i7, null, charSequence, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
        }
    }

    public final void m(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        if (z9) {
            c(i7, str, runnable, z10);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), 0, 12);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, null, N, f6Var);
        l9 l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        l9Var.e(tLObject, w8Var);
        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.t10.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView i10 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.r6.V(i10, org.telegram.ui.ActionBar.k6.q5, f6Var);
        i10.setTextSize(1, 13.0f);
        i10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(i10, c8.ha.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new a60(this, runnable, 0));
        r(frameLayout, c8.ha.o(-1, 52));
    }

    public final void o() {
        boolean z9 = this.A instanceof LinearLayout;
        int i7 = 1;
        Context context = this.e;
        if (!z9) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(i10 > 0 ? i10 / org.telegram.messenger.g0.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new y50(this, i7));
        this.A.addView(this.D, c8.ha.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        bi.md mdVar = new bi.md(this.e, 25);
        mdVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.j5, this.d);
        mdVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        mdVar.setText(org.telegram.messenger.i6.m(charSequence, mdVar.getPaint().getFontMetricsInt(), false, null, 0));
        mdVar.setTag(R.id.fit_width_tag, 1);
        mdVar.setTypeface(null);
        org.telegram.messenger.qs.i(mdVar);
        if (i10 > 0) {
            mdVar.setMaxWidth(i10);
        }
        r(mdVar, c8.ha.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, c8.ha.o(-1, -2));
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
        if (childAt instanceof org.telegram.ui.ActionBar.z0) {
            q5 textView = ((org.telegram.ui.ActionBar.z0) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + fi.m3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        f60 f60Var = this.m;
        if (f60Var != null) {
            f60Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i7);
                if (childAt2 != null) {
                    return childAt2;
                }
                i7 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i10++;
        }
        return null;
    }

    public final int x() {
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

    public final org.telegram.ui.ActionBar.z0 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                return (org.telegram.ui.ActionBar.z0) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) childAt2;
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

    public k60(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z9, boolean z10, boolean z11) {
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
        this.d = f6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var))) > 0.705d ? org.telegram.messenger.qs.n1 : 51;
        this.E = z9;
        this.F = z10;
        this.G = z11;
        B();
    }

    public k60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.d = f6Var;
    }
}
