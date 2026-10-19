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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i80 {
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
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public x70 f0;
    public Drawable g;
    public y70 g0;
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
    public d80 m;
    public ValueAnimator m0;
    public gh.b n;
    public boolean n0;
    public final float[] o;
    public rk o0;
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
    public g80 x;
    public au y;
    public final Rect z;

    public i80(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d5 parentLayout;
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
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).J0) || (((n2Var instanceof org.telegram.ui.cy) && ((org.telegram.ui.cy) n2Var).W) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).I) || ((n2Var instanceof org.telegram.ui.x71) && ((org.telegram.ui.x71) n2Var).M)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ng0) {
                n2Var = safeLastFragment;
            }
        }
        this.c = n2Var;
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = n2Var.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static i80 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        return new i80(viewGroup, d6Var, view, false, false, false);
    }

    public static i80 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view, boolean z10) {
        return new i80(viewGroup, d6Var, view, z10, false, false);
    }

    public static i80 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new i80(n2Var, view, false, true);
    }

    public static i80 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new i80(n2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup == null) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.j1) {
                ((org.telegram.ui.ActionBar.j1) childAt).setColor(i10);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i10);
            }
        }
    }

    public static void a(i80 i80Var, ViewGroup viewGroup) {
        g80 g80Var = i80Var.x;
        if (g80Var == null) {
            return;
        }
        i80Var.x = null;
        ValueAnimator valueAnimator = i80Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g80Var.w, 0.0f);
        i80Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new b80(g80Var, 1));
        i80Var.m0.addListener(new ci.p3(i80Var, g80Var, viewGroup, 7));
        if (i80Var.L) {
            i80Var.m0.setDuration(380L);
            i80Var.m0.setInterpolator(bs.h);
        } else {
            i80Var.m0.setDuration(150L);
        }
        i80Var.m0.start();
    }

    public static void f(i80 i80Var, ci.w6 w6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        boolean z11;
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = i80Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = i80Var.d;
        f80 f80Var = new f80(context);
        LinearLayout linearLayout = new LinearLayout(context);
        f80Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        i80Var.r(f80Var, w7.z5.n(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, i80Var.e, i80Var.d, false, false);
            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            e1Var.c(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
            e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
            e1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            e1Var.setOnClickListener(new v6(2, runnable));
            linearLayout.addView(e1Var, w7.z5.n(-1, -2));
        }
        ArrayList arrayList2 = w6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final ci.b7 b7Var = (ci.b7) obj2;
            final int i12 = b7Var.a;
            float f11 = f10;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, i80Var.e, i80Var.d, false, false);
            e1Var2.setChecked(contains);
            e1Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
            int i13 = org.telegram.ui.ActionBar.h6.E8;
            e1Var2.c(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
            e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(f7, org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            TLRPC.Photo photo = b7Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                z11 = true;
                obj = null;
                e1Var2.g(b7Var.b, R.drawable.msg_folders, null);
            } else {
                z11 = true;
                e1Var2.h(b7Var.b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(b7Var.c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), b7Var.c), "50_50", null, null);
                obj = null;
            }
            e1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z12 = contains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z12) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    callback.run(b7Var);
                }
            });
            linearLayout.addView(e1Var2, w7.z5.n(-1, -2));
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.j1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        xo xoVar = new xo(this, this.e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = xoVar;
        xoVar.setDispatchKeyEventListener(new w70(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.x70] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.x70
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                d80 d80Var;
                i80 i80Var = i80.this;
                if (i80Var.e0 == null || (d80Var = i80Var.m) == null || !d80Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                i80Var.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = i80Var.h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                i80Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        y70 y70Var = new y70(this, 0);
        this.g0 = y70Var;
        this.e0.addOnLayoutChangeListener(y70Var);
    }

    public final boolean D() {
        d80 d80Var = this.m;
        return d80Var != null && d80Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) childAt).setMultiline(false);
        }
    }

    public final i80 J() {
        i80 i80Var = new i80(this.D, this.d);
        i80Var.C = this.D.b(i80Var.B);
        return i80Var;
    }

    public final void K(i80 i80Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(i80Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.e1) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt;
            e1Var.setRightIcon(R.drawable.msg_text_check);
            e1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            e1Var.getRightIcon().setScaleX(0.85f);
            e1Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.e1) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt;
            e1Var.setRightIcon(R.drawable.msg_mini_lock3);
            e1Var.getRightIcon().setAlpha(0.4f);
            e1Var.setOnClickListener(new z70(this, runnable, 2));
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
            y70 y70Var = this.g0;
            if (y70Var != null) {
                this.e0.removeOnLayoutChangeListener(y70Var);
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
        d80 d80Var = this.m;
        if (d80Var == null || !d80Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof h80) {
            ((h80) view).a(rectF);
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
        if (AndroidUtilities.isTablet()) {
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
            y3 = (int) (viewGroup.getY() + (Math.min(f13 + height, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || f13 + height + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
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

    public final void Q(bh.b bVar, eh.e eVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            dh.d c10 = bVar.c(viewGroup, null, z10);
            c10.o(eVar);
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void R(ja jaVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ma(new na(jaVar, viewGroup, 5, false), this.A.getX() + this.a0 + f7, this.A.getY() + this.b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ma(new na(jaVar, childAt, 5, false), this.A.getX() + this.a0 + f7 + childAt.getX(), this.A.getY() + this.b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
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
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                        ((org.telegram.ui.ActionBar.e1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                ((org.telegram.ui.ActionBar.e1) childAt).c(i10, i11);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.j1) {
                            ((org.telegram.ui.ActionBar.j1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.j1) {
                    ((org.telegram.ui.ActionBar.j1) childAt).setColor(i10);
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
        d80 d80Var = this.m;
        if (d80Var != null) {
            d80Var.update((int) this.a0, (int) (this.b0 + f7), -1, -1);
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
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = i1Var.getChildAt(0);
                    View childAt3 = i1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.e1;
                    org.telegram.ui.ActionBar.d6 d6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.e1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof nc0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.e1) {
                        ((org.telegram.ui.ActionBar.e1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof nc0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0416  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        int width;
        int i11;
        int height;
        boolean z10;
        g80 g80Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f13;
        float width2;
        float f14;
        g80 g80Var2;
        if (this.m != null || this.B != null || x() <= 0) {
            return;
        }
        Y();
        int i12 = 0;
        int i13 = 1;
        if (this.T > 0) {
            int i14 = 0;
            while (i14 < this.A.getChildCount() - 1) {
                View childAt = i14 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i14);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i15++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i15).getLayoutParams().width = AndroidUtilities.dp(this.T);
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.L.getChildAt(i17).setMinimumWidth(AndroidUtilities.dp(this.S));
                    }
                }
                i16++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new gh.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? n2Var.getParentLayout().getOverlayContainerView() : viewGroup;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        float f15 = AndroidUtilities.displaySize.y / 2.0f;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            A(view, overlayContainerView, fArr);
            f15 = fArr[1];
            f7 = fArr[0];
            if (this.c0) {
                overlayContainerView.getLocationOnScreen(new int[2]);
                f7 += r14[0];
                f15 += r14[1];
            }
        } else {
            f7 = 0.0f;
        }
        RectF rectF = new RectF();
        if (view instanceof h80) {
            ((h80) view).a(rectF);
            f10 = 2.0f;
        } else {
            int i18 = this.N;
            f10 = 2.0f;
            if (i18 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i18, i10);
            }
        }
        float f16 = f7 + rectF.left;
        float f17 = f15 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f16 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            g80 g80Var3 = new g80(this, context);
            this.x = g80Var3;
            this.y = new au(i13, g80Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, w7.z5.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new b80(this, i12));
            this.m0.addListener(new c80(this, i12));
            if (this.L) {
                f11 = f16;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(bs.h);
            } else {
                f11 = f16;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f11 = f16;
        }
        if (!this.L || (g80Var2 = this.x) == null || this.N == 0) {
            f12 = f11;
        } else {
            g80Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = AndroidUtilities.dp(36.0f);
            }
            f12 = (-fArr[0]) + this.x.s + f11;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        d80 d80Var = new d80(this, this.A, overlayContainerView);
        this.m = d80Var;
        d80Var.setOnDismissListener(new e80(this, overlayContainerView));
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
                        x10 = (rectF.width() / f10) + overlayContainerView.getX() + f12;
                        f13 = this.A.getMeasuredWidth() / f10;
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
            if (!this.L) {
                height2 = Math.min(f17 + height2, i20) - this.A.getMeasuredHeight();
                f17 = overlayContainerView.getY();
            }
            height = (int) (f17 + height2);
        } else if (view != 0) {
            if (this.U || f17 + height2 + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i20) {
                f17 = (f17 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f17 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    height = (int) (overlayContainerView.getY() + f17 + height2);
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (g80Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f18 = rectF.bottom;
                        g80Var.v = (height3 - (measuredHeight + f18)) / f10;
                        g80 g80Var4 = this.x;
                        height = (int) (g80Var4.v + f18);
                        width = (int) (((g80Var4.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
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
                        int i21 = org.telegram.ui.ActionBar.h6.E8;
                        org.telegram.ui.ActionBar.d6 d6Var = this.d;
                        T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i21, d6Var)));
                        dh.d c10 = new bh.b(this.n).c(this.A, null, true);
                        c10.o(fh.c.k(d6Var));
                        c10.p(AndroidUtilities.dp(8.0f));
                        c10.j.e = true;
                        c10.q(AndroidUtilities.dp(12.0f));
                        c10.t(width + this.q, height + this.r);
                        this.A.setBackground(c10);
                    }
                    d80 d80Var2 = this.m;
                    d80Var2.g = this.I;
                    float f19 = width + this.q;
                    this.a0 = f19;
                    float f20 = height + this.r;
                    this.b0 = f20;
                    d80Var2.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        rk rkVar = new rk(new WeakReference(this), 3);
                        this.o0 = rkVar;
                        view.setOnTouchListener(rkVar);
                    }
                    if (this.d0) {
                        C();
                        return;
                    }
                    return;
                }
                f17 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f10) - height2) - overlayContainerView.getY();
            }
            z10 = false;
            height = (int) (overlayContainerView.getY() + f17 + height2);
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height32 = overlayContainerView.getHeight();
                float measuredHeight2 = this.A.getMeasuredHeight();
                float f182 = rectF.bottom;
                g80Var.v = (height32 - (measuredHeight2 + f182)) / f10;
                g80 g80Var42 = this.x;
                height = (int) (g80Var42.v + f182);
                width = (int) (((g80Var42.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i212 = org.telegram.ui.ActionBar.h6.E8;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.d;
                T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i212, d6Var2)));
                dh.d c102 = new bh.b(this.n).c(this.A, null, true);
                c102.o(fh.c.k(d6Var2));
                c102.p(AndroidUtilities.dp(8.0f));
                c102.j.e = true;
                c102.q(AndroidUtilities.dp(12.0f));
                c102.t(width + this.q, height + this.r);
                this.A.setBackground(c102);
            }
            d80 d80Var22 = this.m;
            d80Var22.g = this.I;
            float f192 = width + this.q;
            this.a0 = f192;
            float f202 = height + this.r;
            this.b0 = f202;
            d80Var22.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                rk rkVar2 = new rk(new WeakReference(this), 3);
                this.o0 = rkVar2;
                view.setOnTouchListener(rkVar2);
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
        d80 d80Var222 = this.m;
        d80Var222.g = this.I;
        float f1922 = width + this.q;
        this.a0 = f1922;
        float f2022 = height + this.r;
        this.b0 = f2022;
        d80Var222.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
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
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            e1Var.setText(charSequence);
        } else {
            e1Var.g(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            e1Var.setSubtext(null);
        }
        Integer num = this.j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)));
        e1Var.setOnClickListener(new z70(this, runnable, 3));
        int i13 = this.S;
        if (i13 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
        } else {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.z5.n(this.S, -2));
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
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.F8, z10 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.e1 e1Var) {
        AndroidUtilities.removeFromParent(e1Var);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ai, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
        int i10 = this.S;
        if (i10 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
        } else {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(e1Var, w7.z5.n(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        int i12 = org.telegram.ui.ActionBar.h6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(UserObject.getUserName(currentUser));
        e1Var.setClipToPadding(false);
        e1Var.a.setPadding((e1Var.d && e1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!e1Var.d && e1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setCurrentAccount(i10);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(currentUser);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(currentUser, h9Var);
        w9Var.setScaleX(z10 ? 0.84f : 1.0f);
        w9Var.setScaleY(z10 ? 0.84f : 1.0f);
        e1Var.addView(w9Var, w7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), AndroidUtilities.dp(34.0f)));
            e1Var.addView(view, w7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        e1Var.setOnClickListener(new z70(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
        } else {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.z5.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            e1Var.setText(chat.title);
            e1Var.setSubtext(ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.DiscussChannel) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            e1Var.setText(UserObject.getUserName(user));
            if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                e1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                e1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        e1Var.setClipToPadding(false);
        e1Var.a.setPadding((e1Var.d && e1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!e1Var.d && e1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(tLObject, h9Var);
        w9Var.setScaleX(z10 ? 0.84f : 1.0f);
        w9Var.setScaleY(z10 ? 0.84f : 1.0f);
        e1Var.addView(w9Var, w7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), AndroidUtilities.dp(34.0f)));
            e1Var.addView(view, w7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        e1Var.setOnClickListener(new z70(this, runnable, 1));
        int i12 = this.S;
        if (i12 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
        } else {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(e1Var, w7.z5.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.e1 h() {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        int i12 = this.S;
        if (i12 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
            return e1Var;
        }
        e1Var.setMinimumWidth(AndroidUtilities.dp(i12));
        r(e1Var, w7.z5.n(this.S, -2));
        return e1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ki.b2 b2Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        int i12 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1((i10 == 0 && b2Var == null) ? 1 : 2, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (b2Var != null) {
            e1Var.g(charSequence, 0, b2Var);
        } else if (i10 != 0) {
            e1Var.g(charSequence, i10, null);
        } else {
            e1Var.setText(charSequence);
        }
        e1Var.setChecked(z10);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        Integer num2 = this.k0;
        e1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        Integer num3 = this.l0;
        e1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        e1Var.setOnClickListener(new z70(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(e1Var, w7.z5.n(-1, -2));
        } else {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.z5.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(this.e, this.d);
        j1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            j1Var.setColor(num.intValue());
        }
        r(j1Var, w7.z5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.h6.F8, org.telegram.ui.ActionBar.h6.E8, runnable);
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
        int i10 = org.telegram.ui.ActionBar.h6.i6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), 0, 12));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout.addView(w9Var, w7.z5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, w7.z5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.q5, d6Var, j10, 1, 13.0f);
        j10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(j10, w7.z5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new z70(this, runnable, 0));
        r(frameLayout, w7.z5.n(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(i10 > 0 ? i10 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new w70(this, 1));
        this.A.addView(this.D, w7.z5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.vd vdVar = new ai.vd(this.e, 24);
        vdVar.setTextSize(1, i10);
        vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, this.d));
        vdVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        vdVar.setText(Emoji.replaceEmoji(charSequence, vdVar.getPaint().getFontMetricsInt(), false));
        vdVar.setTag(R.id.fit_width_tag, 1);
        vdVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(vdVar);
        if (i11 > 0) {
            vdVar.setMaxWidth(i11);
        }
        r(vdVar, w7.z5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.z5.n(-1, -2));
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
        if (childAt instanceof org.telegram.ui.ActionBar.e1) {
            z5 textView = ((org.telegram.ui.ActionBar.e1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ei.x3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        d80 d80Var = this.m;
        if (d80Var != null) {
            d80Var.dismiss();
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

    public final org.telegram.ui.ActionBar.e1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                return (org.telegram.ui.ActionBar.e1) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
            return (org.telegram.ui.ActionBar.e1) childAt2;
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

    public i80(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.d = d6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public i80(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.d = d6Var;
    }
}
