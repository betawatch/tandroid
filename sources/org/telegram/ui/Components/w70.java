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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w70 {
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
    public final org.telegram.ui.ActionBar.p2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public m70 f0;
    public Drawable g;
    public n70 g0;
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
    public r70 m;
    public ValueAnimator m0;
    public eh.b n;
    public boolean n0;
    public final float[] o;
    public bs o0;
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
    public u70 x;
    public vt y;
    public final Rect z;

    public w70(org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f5 parentLayout;
        this.i = 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.h0 = new int[2];
        this.q0 = new int[2];
        if (p2Var.getContext() == null) {
            return;
        }
        if ((((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).I0) || (((p2Var instanceof org.telegram.ui.wy) && ((org.telegram.ui.wy) p2Var).W) || (((p2Var instanceof ContactsActivity) && ((ContactsActivity) p2Var).I) || ((p2Var instanceof org.telegram.ui.k91) && ((org.telegram.ui.k91) p2Var).M)))) && (parentLayout = p2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.p2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.fh0) {
                p2Var = safeLastFragment;
            }
        }
        this.c = p2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = p2Var.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static w70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new w70(viewGroup, f6Var, view, false, false, false);
    }

    public static w70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10) {
        return new w70(viewGroup, f6Var, view, z10, false, false);
    }

    public static w70 H(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new w70(p2Var, view, false, true);
    }

    public static w70 I(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new w70(p2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup == null) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.m1) {
                ((org.telegram.ui.ActionBar.m1) childAt).setColor(i10);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i10);
            }
        }
    }

    public static void a(w70 w70Var, ViewGroup viewGroup) {
        u70 u70Var = w70Var.x;
        if (u70Var == null) {
            return;
        }
        w70Var.x = null;
        ValueAnimator valueAnimator = w70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u70Var.w, 0.0f);
        w70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new q70(u70Var, 0));
        w70Var.m0.addListener(new org.telegram.ui.ActionBar.l1(w70Var, u70Var, viewGroup, 6));
        if (w70Var.L) {
            w70Var.m0.setDuration(380L);
            w70Var.m0.setInterpolator(wr.h);
        } else {
            w70Var.m0.setDuration(150L);
        }
        w70Var.m0.start();
    }

    public static void f(w70 w70Var, zh.w4 w4Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = w70Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = w70Var.d;
        t70 t70Var = new t70(context);
        LinearLayout linearLayout = new LinearLayout(context);
        t70Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        w70Var.r(t70Var, w7.a6.n(-1, -2));
        float f7 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, w70Var.e, w70Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(g1Var, w7.a6.n(-1, -2));
        }
        ArrayList arrayList2 = w4Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final zh.b5 b5Var = (zh.b5) obj2;
            final int i12 = b5Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, w70Var.e, w70Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.j6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            TLRPC.Photo photo = b5Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                obj = null;
                g1Var2.g(b5Var.b, R.drawable.msg_folders, null);
            } else {
                g1Var2.h(b5Var.b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(b5Var.c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), b5Var.c), "50_50", null, null);
                obj = null;
            }
            g1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.p70
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
                    callback.run(b5Var);
                }
            });
            linearLayout.addView(g1Var2, w7.a6.n(-1, -2));
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.m1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        so soVar = new so(this, this.e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = soVar;
        soVar.setDispatchKeyEventListener(new l70(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.m70] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.m70
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                r70 r70Var;
                w70 w70Var = w70.this;
                if (w70Var.e0 == null || (r70Var = w70Var.m) == null || !r70Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                w70Var.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = w70Var.h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                w70Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        n70 n70Var = new n70(this, 0);
        this.g0 = n70Var;
        this.e0.addOnLayoutChangeListener(n70Var);
    }

    public final boolean D() {
        r70 r70Var = this.m;
        return r70Var != null && r70Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
        }
    }

    public final w70 J() {
        w70 w70Var = new w70(this.D, this.d);
        w70Var.C = this.D.b(w70Var.B);
        return w70Var;
    }

    public final void K(w70 w70Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(w70Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
            g1Var.setRightIcon(R.drawable.msg_text_check);
            g1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            g1Var.getRightIcon().setScaleX(0.85f);
            g1Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
            g1Var.setRightIcon(R.drawable.msg_mini_lock3);
            g1Var.getRightIcon().setAlpha(0.4f);
            g1Var.setOnClickListener(new o70(this, runnable, 2));
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
            n70 n70Var = this.g0;
            if (n70Var != null) {
                this.e0.removeOnLayoutChangeListener(n70Var);
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
        r70 r70Var = this.m;
        if (r70Var == null || !r70Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof v70) {
            ((v70) view).a(rectF);
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

    public final void Q(ia iaVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new la(new ma(iaVar, viewGroup, 5, false), this.A.getX() + this.a0 + f7, this.A.getY() + this.b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new la(new ma(iaVar, childAt, 5, false), this.A.getX() + this.a0 + f7 + childAt.getX(), this.A.getY() + this.b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void R(zg.a aVar, ch.e eVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            bh.d c10 = aVar.c(viewGroup, null, z10);
            c10.n(eVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            c10.p(AndroidUtilities.dp(12.0f));
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
                    if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).c(i10, i11);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.m1) {
                            ((org.telegram.ui.ActionBar.m1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.m1) {
                    ((org.telegram.ui.ActionBar.m1) childAt).setColor(i10);
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
        r70 r70Var = this.m;
        if (r70Var != null) {
            r70Var.update((int) this.a0, (int) (this.b0 + f7), -1, -1);
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
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = k1Var.getChildAt(0);
                    View childAt3 = k1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                    org.telegram.ui.ActionBar.f6 f6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof dc0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof dc0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f7;
        float f10;
        int i10;
        char c10;
        float f11;
        float f12;
        int width;
        int i11;
        int height;
        boolean z10;
        u70 u70Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f13;
        float width2;
        float f14;
        u70 u70Var2;
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i14).getLayoutParams().width = AndroidUtilities.dp(this.T);
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.L.getChildAt(i16).setMinimumWidth(AndroidUtilities.dp(this.S));
                    }
                }
                i15++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new eh.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? p2Var.getParentLayout().getOverlayContainerView() : viewGroup;
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
        if (view instanceof v70) {
            ((v70) view).a(rectF);
            f10 = 2.0f;
        } else {
            int i17 = this.N;
            f10 = 2.0f;
            if (i17 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i17, i10);
            }
        }
        float f16 = f7 + rectF.left;
        float f17 = f15 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f16 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            u70 u70Var3 = new u70(this, context);
            this.x = u70Var3;
            this.y = new vt(i12, u70Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            c10 = 0;
            overlayContainerView.addView(this.x, w7.a6.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new j6(this, 29));
            this.m0.addListener(new rm(this, 14));
            if (this.L) {
                f11 = f16;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(wr.h);
            } else {
                f11 = f16;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f11 = f16;
            c10 = 0;
        }
        if (!this.L || (u70Var2 = this.x) == null || this.N == 0) {
            f12 = f11;
        } else {
            u70Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = AndroidUtilities.dp(36.0f);
            }
            f12 = (-fArr[c10]) + this.x.s + f11;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        r70 r70Var = new r70(this, this.A, overlayContainerView);
        this.m = r70Var;
        r70Var.setOnDismissListener(new s70(this, overlayContainerView));
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
            int i18 = this.i;
            if (i18 == 3) {
                width = (int) (overlayContainerView.getX() + f12);
            } else {
                if (i18 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f12;
                    f14 = rectF2.right;
                } else {
                    if (i18 == 1) {
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
        int i19 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - i11;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            height = (int) (this.L ? f17 + height2 : overlayContainerView.getY() + (Math.min(f17 + height2, i19) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.U || f17 + height2 + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i19) {
                f17 = (f17 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f17 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    height = (int) (overlayContainerView.getY() + f17 + height2);
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (u70Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f18 = rectF.bottom;
                        u70Var.v = (height3 - (measuredHeight + f18)) / f10;
                        u70 u70Var4 = this.x;
                        height = (int) (u70Var4.v + f18);
                        width = (int) (((u70Var4.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - AndroidUtilities.dp(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (p2Var != null && p2Var.getFragmentView() != null) {
                            p2Var.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i20 = org.telegram.ui.ActionBar.j6.E8;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i20, f6Var)));
                        eh.b bVar = this.n;
                        bVar.getClass();
                        bh.f fVar = new bh.f(bVar);
                        fVar.n(null);
                        fVar.n(dh.c.k(f6Var));
                        fVar.o(AndroidUtilities.dp(8.0f));
                        fVar.h.e = true;
                        fVar.p(AndroidUtilities.dp(12.0f));
                        fVar.s(width + this.q, height + this.r);
                        this.A.setBackground(fVar);
                    }
                    r70 r70Var2 = this.m;
                    r70Var2.g = this.I;
                    float f19 = width + this.q;
                    this.a0 = f19;
                    float f20 = height + this.r;
                    this.b0 = f20;
                    r70Var2.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        bs bsVar = new bs(new WeakReference(this), i12);
                        this.o0 = bsVar;
                        view.setOnTouchListener(bsVar);
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
                u70Var.v = (height32 - (measuredHeight2 + f182)) / f10;
                u70 u70Var42 = this.x;
                height = (int) (u70Var42.v + f182);
                width = (int) (((u70Var42.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i202 = org.telegram.ui.ActionBar.j6.E8;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.d;
                T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i202, f6Var2)));
                eh.b bVar2 = this.n;
                bVar2.getClass();
                bh.f fVar2 = new bh.f(bVar2);
                fVar2.n(null);
                fVar2.n(dh.c.k(f6Var2));
                fVar2.o(AndroidUtilities.dp(8.0f));
                fVar2.h.e = true;
                fVar2.p(AndroidUtilities.dp(12.0f));
                fVar2.s(width + this.q, height + this.r);
                this.A.setBackground(fVar2);
            }
            r70 r70Var22 = this.m;
            r70Var22.g = this.I;
            float f192 = width + this.q;
            this.a0 = f192;
            float f202 = height + this.r;
            this.b0 = f202;
            r70Var22.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                bs bsVar2 = new bs(new WeakReference(this), i12);
                this.o0 = bsVar2;
                view.setOnTouchListener(bsVar2);
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
        r70 r70Var222 = this.m;
        r70Var222.g = this.I;
        float f1922 = width + this.q;
        this.a0 = f1922;
        float f2022 = height + this.r;
        this.b0 = f2022;
        r70Var222.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
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
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        g1Var.setOnClickListener(new o70(this, runnable, 3));
        int i13 = this.S;
        if (i13 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, w7.a6.n(this.S, -2));
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
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.F8, z10 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ai, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        int i10 = this.S;
        if (i10 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(g1Var, w7.a6.n(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        int i12 = org.telegram.ui.ActionBar.j6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(UserObject.getUserName(currentUser));
        g1Var.setClipToPadding(false);
        g1Var.a.setPadding((g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setCurrentAccount(i10);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(currentUser);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(currentUser, g9Var);
        w9Var.setScaleX(z10 ? 0.84f : 1.0f);
        w9Var.setScaleY(z10 ? 0.84f : 1.0f);
        g1Var.addView(w9Var, w7.a6.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new fh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), AndroidUtilities.dp(34.0f)));
            g1Var.addView(view, w7.a6.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        g1Var.setOnClickListener(new o70(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, w7.a6.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            g1Var.setText(chat.title);
            g1Var.setSubtext(ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.DiscussChannel) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            g1Var.setText(UserObject.getUserName(user));
            if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                g1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                g1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        g1Var.setClipToPadding(false);
        g1Var.a.setPadding((g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        w9 w9Var = new w9(context);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(tLObject, g9Var);
        w9Var.setScaleX(z10 ? 0.84f : 1.0f);
        w9Var.setScaleY(z10 ? 0.84f : 1.0f);
        g1Var.addView(w9Var, w7.a6.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new fh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), AndroidUtilities.dp(34.0f)));
            g1Var.addView(view, w7.a6.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        g1Var.setOnClickListener(new o70(this, runnable, 1));
        int i12 = this.S;
        if (i12 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, w7.a6.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        int i12 = this.S;
        if (i12 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
            return g1Var;
        }
        g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
        r(g1Var, w7.a6.n(this.S, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, hi.e2 e2Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        int i12 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1((i10 == 0 && e2Var == null) ? 1 : 2, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (e2Var != null) {
            g1Var.g(charSequence, 0, e2Var);
        } else if (i10 != 0) {
            g1Var.g(charSequence, i10, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        g1Var.setOnClickListener(new o70(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(g1Var, w7.a6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, w7.a6.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this.e, this.d);
        m1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            m1Var.setColor(num.intValue());
        }
        r(m1Var, w7.a6.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
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
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 0, 12));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        w9Var.e(tLObject, g9Var);
        frameLayout.addView(w9Var, w7.a6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.q5, f6Var, f7, 1, 13.0f);
        f7.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(f7, w7.a6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new o70(this, runnable, 0));
        r(frameLayout, w7.a6.n(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(i10 > 0 ? i10 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new l70(this, 1));
        this.A.addView(this.D, w7.a6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        di.h hVar = new di.h(this.e, 22);
        hVar.setTextSize(1, i10);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.d));
        hVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        hVar.setText(Emoji.replaceEmoji(charSequence, hVar.getPaint().getFontMetricsInt(), false));
        hVar.setTag(R.id.fit_width_tag, 1);
        hVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(hVar);
        if (i11 > 0) {
            hVar.setMaxWidth(i11);
        }
        r(hVar, w7.a6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.a6.n(-1, -2));
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
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            x5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + bi.x4.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        r70 r70Var = this.m;
        if (r70Var != null) {
            r70Var.dismiss();
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

    public final org.telegram.ui.ActionBar.g1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                return (org.telegram.ui.ActionBar.g1) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
            return (org.telegram.ui.ActionBar.g1) childAt2;
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

    public w70(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public w70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
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
