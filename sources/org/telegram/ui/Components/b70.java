package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b70 {
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
    public final org.telegram.ui.ActionBar.n2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.c6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public r60 f0;
    public Drawable g;
    public s60 g0;
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
    public w60 m;
    public ValueAnimator m0;
    public og.b n;
    public boolean n0;
    public final float[] o;
    public jr o0;
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
    public z60 x;
    public ct y;
    public final Rect z;

    public b70(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        if (n2Var.getContext() == null) {
            return;
        }
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).E0) || (((n2Var instanceof org.telegram.ui.gy) && ((org.telegram.ui.gy) n2Var).S) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).E) || ((n2Var instanceof org.telegram.ui.x71) && ((org.telegram.ui.x71) n2Var).I)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.qg0) {
                n2Var = safeLastFragment;
            }
        }
        this.c = n2Var;
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = n2Var.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, resourceProvider))) > 0.705d ? 102 : 51;
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
            float y10 = view.getY() + f10;
            float x8 = view.getX() + f11;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x8 -= view.getScrollX();
                y10 -= view.getScrollY();
            }
            f11 = x8;
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

    public static b70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        return new b70(viewGroup, c6Var, view, false, false, false);
    }

    public static b70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10) {
        return new b70(viewGroup, c6Var, view, z10, false, false);
    }

    public static b70 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new b70(n2Var, view, false, true);
    }

    public static b70 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new b70(n2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup == null) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i10);
            }
        }
    }

    public static void a(b70 b70Var, ViewGroup viewGroup) {
        z60 z60Var = b70Var.x;
        if (z60Var == null) {
            return;
        }
        b70Var.x = null;
        ValueAnimator valueAnimator = b70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z60Var.w, 0.0f);
        b70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new v60(z60Var, 0));
        b70Var.m0.addListener(new jh.h3(b70Var, z60Var, viewGroup, 7));
        if (b70Var.L) {
            b70Var.m0.setDuration(380L);
            b70Var.m0.setInterpolator(er.h);
        } else {
            b70Var.m0.setDuration(150L);
        }
        b70Var.m0.start();
    }

    public static void f(b70 b70Var, jh.f6 f6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = b70Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = b70Var.d;
        y60 y60Var = new y60(context);
        LinearLayout linearLayout = new LinearLayout(context);
        y60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        b70Var.r(y60Var, h7.z5.n(-1, -2));
        float f10 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, b70Var.e, b70Var.d, false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            f1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            f1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            f1Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(f1Var, h7.z5.n(-1, -2));
        }
        ArrayList arrayList2 = f6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final jh.k6 k6Var = (jh.k6) obj2;
            final int i12 = k6Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, b70Var.e, b70Var.d, false, false);
            f1Var2.setChecked(contains);
            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.g6.E8;
            f1Var2.c(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(f10, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            TLRPC.Photo photo = k6Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                obj = null;
                f1Var2.g(k6Var.b, R.drawable.msg_folders, null);
            } else {
                f1Var2.h(k6Var.b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(k6Var.c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), k6Var.c), "50_50", null, null);
                obj = null;
            }
            f1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u60
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
                    callback.run(k6Var);
                }
            });
            linearLayout.addView(f1Var2, h7.z5.n(-1, -2));
            f10 = 0.12f;
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.k1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        ao aoVar = new ao(this, this.e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = aoVar;
        aoVar.setDispatchKeyEventListener(new q60(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.r60] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.r60
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                w60 w60Var;
                b70 b70Var = b70.this;
                if (b70Var.e0 == null || (w60Var = b70Var.m) == null || !w60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                b70Var.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = b70Var.h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                b70Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        s60 s60Var = new s60(this, 0);
        this.g0 = s60Var;
        this.e0.addOnLayoutChangeListener(s60Var);
    }

    public final boolean D() {
        w60 w60Var = this.m;
        return w60Var != null && w60Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            ((org.telegram.ui.ActionBar.f1) childAt).setMultiline(false);
        }
    }

    public final b70 J() {
        b70 b70Var = new b70(this.D, this.d);
        b70Var.C = this.D.b(b70Var.B);
        return b70Var;
    }

    public final void K(b70 b70Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(b70Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
            f1Var.setRightIcon(R.drawable.msg_text_check);
            f1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            f1Var.getRightIcon().setScaleX(0.85f);
            f1Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
            f1Var.setRightIcon(R.drawable.msg_mini_lock3);
            f1Var.getRightIcon().setAlpha(0.4f);
            f1Var.setOnClickListener(new t60(this, runnable, 2));
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
            s60 s60Var = this.g0;
            if (s60Var != null) {
                this.e0.removeOnLayoutChangeListener(s60Var);
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
        int x8;
        float width;
        float f10;
        int y10;
        w60 w60Var = this.m;
        if (w60Var == null || !w60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof a70) {
            ((a70) view).a(rectF);
        } else {
            int i11 = this.N;
            if (i11 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i11, i10);
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
        if (AndroidUtilities.isTablet()) {
            f14 += viewGroup.getPaddingTop();
            f13 -= viewGroup.getPaddingLeft();
        }
        int i12 = this.i;
        if (i12 == 3) {
            x8 = (int) (viewGroup.getX() + f13);
        } else {
            if (i12 == 5) {
                width = rectF.width() + viewGroup.getX() + f13;
                f10 = rectF2.right;
            } else if (i12 == 1) {
                width = (rectF.width() / 2.0f) + viewGroup.getX() + f13;
                f10 = this.A.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + f13 > viewGroup.getWidth()) {
                width = rectF.width() + viewGroup.getX() + f13;
                f10 = rectF2.right;
            } else {
                x8 = (int) ((viewGroup.getX() + f13) - rectF2.left);
            }
            x8 = (int) (width - f10);
        }
        float height = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || f14 + height + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                f14 = (f14 - height) - this.A.getMeasuredHeight();
                if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y10 = (int) (viewGroup.getY() + f14 + height);
        }
        float f15 = x8 + this.q;
        this.a0 = f15;
        float f16 = y10 + this.r;
        this.b0 = f16;
        this.m.update((int) f15, (int) f16, -1, -1);
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

    public final void Q(jg.a aVar, mg.d dVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            lg.d c10 = aVar.c(viewGroup, null, z10);
            c10.n(dVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            c10.p(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void R(z9 z9Var, float f10, float f11) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ca(new da(z9Var, viewGroup, 5, false), this.A.getX() + this.a0 + f10, this.A.getY() + this.b0 + f11, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ca(new da(z9Var, childAt, 5, false), this.A.getX() + this.a0 + f10 + childAt.getX(), this.A.getY() + this.b0 + f11 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
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
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                ((org.telegram.ui.ActionBar.f1) childAt).c(i10, i11);
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.k1) {
                            ((org.telegram.ui.ActionBar.k1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                    ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
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

    public final void X(float f10) {
        w60 w60Var = this.m;
        if (w60Var != null) {
            w60Var.update((int) this.a0, (int) (this.b0 + f10), -1, -1);
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
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = j1Var.getChildAt(0);
                    View childAt3 = j1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.f1;
                    org.telegram.ui.ActionBar.c6 c6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof fb0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof fb0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0408 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f10;
        float f11;
        int i10;
        char c10;
        float f12;
        float f13;
        int width;
        int i11;
        int height;
        boolean z10;
        z60 z60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x8;
        float f14;
        float width2;
        float f15;
        z60 z60Var2;
        if (this.m != null || this.B != null || x() <= 0) {
            return;
        }
        Y();
        int i12 = 1;
        if (this.T > 0) {
            int i13 = 0;
            while (i13 < this.A.getChildCount() - 1) {
                View childAt = i13 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i13);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i14 = 0; i14 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i14++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i14).getLayoutParams().width = AndroidUtilities.dp(this.T);
                    }
                }
                i13++;
            }
        } else if (this.S > 0) {
            int i15 = 0;
            while (i15 < this.A.getChildCount() - 1) {
                View childAt2 = i15 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i15);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i16 = 0; i16 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i16++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.H.getChildAt(i16).setMinimumWidth(AndroidUtilities.dp(this.S));
                    }
                }
                i15++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new og.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? n2Var.getParentLayout().getOverlayContainerView() : viewGroup;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        float f16 = AndroidUtilities.displaySize.y / 2.0f;
        int i17 = 2;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            A(view, overlayContainerView, fArr);
            f16 = fArr[1];
            f10 = fArr[0];
            if (this.c0) {
                overlayContainerView.getLocationOnScreen(new int[2]);
                f10 += r14[0];
                f16 += r14[1];
            }
        } else {
            f10 = 0.0f;
        }
        RectF rectF = new RectF();
        if (view instanceof a70) {
            ((a70) view).a(rectF);
            f11 = 2.0f;
        } else {
            int i18 = this.N;
            f11 = 2.0f;
            if (i18 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i18, i10);
            }
        }
        float f17 = f10 + rectF.left;
        float f18 = f16 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f17 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            z60 z60Var3 = new z60(this, context);
            this.x = z60Var3;
            this.y = new ct(i12, z60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            c10 = 0;
            overlayContainerView.addView(this.x, h7.z5.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new e6(this, 29));
            this.m0.addListener(new sz(this, i17));
            if (this.L) {
                f12 = f17;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(er.h);
            } else {
                f12 = f17;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f12 = f17;
            c10 = 0;
        }
        if (!this.L || (z60Var2 = this.x) == null || this.N == 0) {
            f13 = f12;
        } else {
            z60Var2.s = (overlayContainerView.getWidth() - this.N) / f11;
            if (this.M == 3) {
                this.x.s = AndroidUtilities.dp(36.0f);
            }
            f13 = (-fArr[c10]) + this.x.s + f12;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        w60 w60Var = new w60(this, this.A, overlayContainerView);
        this.m = w60Var;
        w60Var.setOnDismissListener(new x60(this, overlayContainerView));
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
        if (AndroidUtilities.isTablet()) {
            f18 += overlayContainerView.getPaddingTop();
            f13 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            int i19 = this.i;
            if (i19 == 3) {
                width = (int) (overlayContainerView.getX() + f13);
            } else {
                if (i19 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f13;
                    f15 = rectF2.right;
                } else {
                    if (i19 == 1) {
                        x8 = (rectF.width() / f11) + overlayContainerView.getX() + f13;
                        f14 = this.A.getMeasuredWidth() / f11;
                    } else if (rectF2.width() + f13 > overlayContainerView.getWidth()) {
                        width2 = rectF.width() + overlayContainerView.getX() + f13;
                        f15 = rectF2.right;
                    } else {
                        x8 = overlayContainerView.getX() + f13;
                        f14 = rectF2.left;
                    }
                    width = (int) (x8 - f14);
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
            i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        }
        int i20 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - i11;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            height = (int) (this.L ? f18 + height2 : overlayContainerView.getY() + (Math.min(f18 + height2, i20) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.U || f18 + height2 + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i20) {
                f18 = (f18 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f18 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    height = (int) (overlayContainerView.getY() + f18 + height2);
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (z60Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f19 = rectF.bottom;
                        z60Var.v = (height3 - (measuredHeight + f19)) / f11;
                        z60 z60Var4 = this.x;
                        height = (int) (z60Var4.v + f19);
                        width = (int) (((z60Var4.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - AndroidUtilities.dp(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (n2Var != null && n2Var.getFragmentView() != null) {
                            n2Var.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i21 = org.telegram.ui.ActionBar.g6.E8;
                        org.telegram.ui.ActionBar.c6 c6Var = this.d;
                        T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i21, c6Var)));
                        og.b bVar = this.n;
                        bVar.getClass();
                        lg.f fVar = new lg.f(bVar);
                        fVar.n(null);
                        fVar.n(ng.c.j(c6Var));
                        fVar.o(AndroidUtilities.dp(8.0f));
                        fVar.h.e = true;
                        fVar.p(AndroidUtilities.dp(12.0f));
                        fVar.s(width + this.q, height + this.r);
                        this.A.setBackground(fVar);
                    }
                    w60 w60Var2 = this.m;
                    w60Var2.g = this.I;
                    float f20 = width + this.q;
                    this.a0 = f20;
                    float f21 = height + this.r;
                    this.b0 = f21;
                    w60Var2.showAtLocation(overlayContainerView, 0, (int) f20, (int) f21);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        jr jrVar = new jr(new WeakReference(this), i12);
                        this.o0 = jrVar;
                        view.setOnTouchListener(jrVar);
                    }
                    if (this.d0) {
                        C();
                        return;
                    }
                    return;
                }
                f18 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f11) - height2) - overlayContainerView.getY();
            }
            z10 = false;
            height = (int) (overlayContainerView.getY() + f18 + height2);
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height32 = overlayContainerView.getHeight();
                float measuredHeight2 = this.A.getMeasuredHeight();
                float f192 = rectF.bottom;
                z60Var.v = (height32 - (measuredHeight2 + f192)) / f11;
                z60 z60Var42 = this.x;
                height = (int) (z60Var42.v + f192);
                width = (int) (((z60Var42.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i212 = org.telegram.ui.ActionBar.g6.E8;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.d;
                T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i212, c6Var2)));
                og.b bVar2 = this.n;
                bVar2.getClass();
                lg.f fVar2 = new lg.f(bVar2);
                fVar2.n(null);
                fVar2.n(ng.c.j(c6Var2));
                fVar2.o(AndroidUtilities.dp(8.0f));
                fVar2.h.e = true;
                fVar2.p(AndroidUtilities.dp(12.0f));
                fVar2.s(width + this.q, height + this.r);
                this.A.setBackground(fVar2);
            }
            w60 w60Var22 = this.m;
            w60Var22.g = this.I;
            float f202 = width + this.q;
            this.a0 = f202;
            float f212 = height + this.r;
            this.b0 = f212;
            w60Var22.showAtLocation(overlayContainerView, 0, (int) f202, (int) f212);
            if (this.w) {
                if (view.getParent() != null) {
                }
                jr jrVar2 = new jr(new WeakReference(this), i12);
                this.o0 = jrVar2;
                view.setOnTouchListener(jrVar2);
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
        w60 w60Var222 = this.m;
        w60Var222.g = this.I;
        float f2022 = width + this.q;
        this.a0 = f2022;
        float f2122 = height + this.r;
        this.b0 = f2122;
        w60Var222.showAtLocation(overlayContainerView, 0, (int) f2022, (int) f2122);
        if (this.w) {
        }
        if (this.d0) {
        }
    }

    public final void a0(float f10, float f11) {
        this.q += f10;
        this.r += f11;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            f1Var.setText(charSequence);
        } else {
            f1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 3));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
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
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.F8, z10 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.f1 f1Var) {
        AndroidUtilities.removeFromParent(f1Var);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ai, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        int i10 = this.S;
        if (i10 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        int i12 = org.telegram.ui.ActionBar.g6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(UserObject.getUserName(currentUser));
        f1Var.setClipToPadding(false);
        f1Var.a.setPadding((f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        n9 n9Var = new n9(context);
        n9Var.getImageReceiver().setCurrentAccount(i10);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(currentUser);
        n9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        n9Var.e(currentUser, y8Var);
        n9Var.setScaleX(z10 ? 0.84f : 1.0f);
        n9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(n9Var, h7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, h7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            f1Var.setText(chat.title);
            f1Var.setSubtext(ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.DiscussChannel) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            f1Var.setText(UserObject.getUserName(user));
            if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                f1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                f1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        f1Var.setClipToPadding(false);
        f1Var.a.setPadding((f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        n9 n9Var = new n9(context);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        n9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        n9Var.e(tLObject, y8Var);
        n9Var.setScaleX(z10 ? 0.84f : 1.0f);
        n9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(n9Var, h7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, h7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 1));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.f1 h() {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
            return f1Var;
        }
        f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
        r(f1Var, h7.z5.n(this.S, -2));
        return f1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, rh.v1 v1Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        int i12 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1((i10 == 0 && v1Var == null) ? 1 : 2, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (v1Var != null) {
            f1Var.g(charSequence, 0, v1Var);
        } else if (i10 != 0) {
            f1Var.g(charSequence, i10, null);
        } else {
            f1Var.setText(charSequence);
        }
        f1Var.setChecked(z10);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this.e, this.d);
        k1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            k1Var.setColor(num.intValue());
        }
        r(k1Var, h7.z5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.g6.F8, org.telegram.ui.ActionBar.g6.E8, runnable);
        }
    }

    public final void m(boolean z10, int i10, String str, boolean z11, Runnable runnable) {
        if (z10) {
            c(i10, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), 0, 12));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        n9Var.e(tLObject, y8Var);
        frameLayout.addView(n9Var, h7.z5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView h = org.telegram.ui.Cells.pa.h(frameLayout, textView, h7.z5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.q5, c6Var, h, 1, 13.0f);
        h.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(h, h7.z5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new t60(this, runnable, 0));
        r(frameLayout, h7.z5.n(-1, 52));
    }

    public final void o() {
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(i10 > 0 ? i10 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new q60(this, 1));
        this.A.addView(this.D, h7.z5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        cg.q qVar = new cg.q(this.e, 24);
        qVar.setTextSize(1, i10);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, this.d));
        qVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        qVar.setText(Emoji.replaceEmoji(charSequence, qVar.getPaint().getFontMetricsInt(), false));
        qVar.setTag(R.id.fit_width_tag, 1);
        qVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(qVar);
        if (i11 > 0) {
            qVar.setMaxWidth(i11);
        }
        r(qVar, h7.z5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, h7.z5.n(-1, -2));
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
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            s5 textView = ((org.telegram.ui.ActionBar.f1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + lh.w3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        w60 w60Var = this.m;
        if (w60Var != null) {
            w60Var.dismiss();
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
            return actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
        }
        int i11 = 0;
        while (i11 < this.A.getChildCount() - 1) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i10);
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

    public final org.telegram.ui.ActionBar.f1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                return (org.telegram.ui.ActionBar.f1) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
            return (org.telegram.ui.ActionBar.f1) childAt2;
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
        return this.D.H.getChildAt(r0.getItemsCount() - 1);
    }

    public b70(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.d = c6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public b70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.d = c6Var;
    }
}
