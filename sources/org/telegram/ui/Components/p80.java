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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p80 {
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
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public f80 f0;
    public Drawable g;
    public g80 g0;
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
    public k80 m;
    public ValueAnimator m0;
    public fh.b n;
    public boolean n0;
    public final float[] o;
    public wk o0;
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
    public n80 x;
    public hu y;
    public final Rect z;

    public p80(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
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
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).I0) || (((n2Var instanceof org.telegram.ui.ty) && ((org.telegram.ui.ty) n2Var).W) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).I) || ((n2Var instanceof org.telegram.ui.i91) && ((org.telegram.ui.i91) n2Var).M)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.fh0) {
                n2Var = safeLastFragment;
            }
        }
        this.c = n2Var;
        org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = n2Var.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static p80 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        return new p80(viewGroup, e6Var, view, false, false, false);
    }

    public static p80 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10) {
        return new p80(viewGroup, e6Var, view, z10, false, false);
    }

    public static p80 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new p80(n2Var, view, false, true);
    }

    public static p80 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new p80(n2Var, view, true, true);
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

    public static void a(p80 p80Var, ViewGroup viewGroup) {
        n80 n80Var = p80Var.x;
        if (n80Var == null) {
            return;
        }
        p80Var.x = null;
        ValueAnimator valueAnimator = p80Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(n80Var.w, 0.0f);
        p80Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new j80(n80Var, 1));
        p80Var.m0.addListener(new ai.z4(p80Var, n80Var, viewGroup, 7));
        if (p80Var.L) {
            p80Var.m0.setDuration(380L);
            p80Var.m0.setInterpolator(hs.h);
        } else {
            p80Var.m0.setDuration(150L);
        }
        p80Var.m0.start();
    }

    public static void f(p80 p80Var, ai.y8 y8Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        boolean z11;
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = p80Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = p80Var.d;
        m80 m80Var = new m80(context);
        LinearLayout linearLayout = new LinearLayout(context);
        m80Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        p80Var.r(m80Var, w7.x5.n(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, p80Var.e, p80Var.d, false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.i6.E8;
            f1Var.c(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var));
            f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
            f1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            f1Var.setOnClickListener(new w6(2, runnable));
            linearLayout.addView(f1Var, w7.x5.n(-1, -2));
        }
        ArrayList arrayList2 = y8Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final ai.f9 f9Var = (ai.f9) obj2;
            final int i12 = f9Var.a;
            float f11 = f10;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, p80Var.e, p80Var.d, false, false);
            f1Var2.setChecked(contains);
            f1Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
            int i13 = org.telegram.ui.ActionBar.i6.E8;
            f1Var2.c(org.telegram.ui.ActionBar.i6.w0(i13, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var));
            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(f7, org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
            TLRPC.Photo photo = f9Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                z11 = true;
                obj = null;
                f1Var2.g(f9Var.b, R.drawable.msg_folders, null);
            } else {
                z11 = true;
                f1Var2.h(f9Var.b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(f9Var.c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), f9Var.c), "50_50", null, null);
                obj = null;
            }
            f1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.i80
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
                    callback.run(f9Var);
                }
            });
            linearLayout.addView(f1Var2, w7.x5.n(-1, -2));
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.k1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        dp dpVar = new dp(this, this.e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = dpVar;
        dpVar.setDispatchKeyEventListener(new e80(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.f80] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.f80
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                k80 k80Var;
                p80 p80Var = p80.this;
                if (p80Var.e0 == null || (k80Var = p80Var.m) == null || !k80Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                p80Var.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = p80Var.h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                p80Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        g80 g80Var = new g80(this, 0);
        this.g0 = g80Var;
        this.e0.addOnLayoutChangeListener(g80Var);
    }

    public final boolean D() {
        k80 k80Var = this.m;
        return k80Var != null && k80Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            ((org.telegram.ui.ActionBar.f1) childAt).setMultiline(false);
        }
    }

    public final p80 J() {
        p80 p80Var = new p80(this.D, this.d);
        p80Var.C = this.D.b(p80Var.B);
        return p80Var;
    }

    public final void K(p80 p80Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(p80Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
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
        View childAt = this.D.L.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
            f1Var.setRightIcon(R.drawable.msg_mini_lock3);
            f1Var.getRightIcon().setAlpha(0.4f);
            f1Var.setOnClickListener(new h80(this, runnable, 2));
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
            g80 g80Var = this.g0;
            if (g80Var != null) {
                this.e0.removeOnLayoutChangeListener(g80Var);
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
        k80 k80Var = this.m;
        if (k80Var == null || !k80Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof o80) {
            ((o80) view).a(rectF);
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

    public final void Q(ah.c cVar, dh.e eVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ch.d c10 = cVar.c(viewGroup, null, z10);
            c10.o(eVar);
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void R(ma maVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new pa(new qa(maVar, viewGroup, 5, false), this.A.getX() + this.a0 + f7, this.A.getY() + this.b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new pa(new qa(maVar, childAt, 5, false), this.A.getX() + this.a0 + f7 + childAt.getX(), this.A.getY() + this.b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
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

    public final void X(float f7) {
        k80 k80Var = this.m;
        if (k80Var != null) {
            k80Var.update((int) this.a0, (int) (this.b0 + f7), -1, -1);
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
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = j1Var.getChildAt(0);
                    View childAt3 = j1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.f1;
                    org.telegram.ui.ActionBar.e6 e6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof uc0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, e6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, e6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof uc0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, e6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, e6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0418  */
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
        n80 n80Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f13;
        float width2;
        float f14;
        n80 n80Var2;
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
            this.n = new fh.b();
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
        if (view instanceof o80) {
            ((o80) view).a(rectF);
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
            n80 n80Var3 = new n80(this, context);
            this.x = n80Var3;
            this.y = new hu(i13, n80Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, w7.x5.d(-1.0f, -1));
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
            ofFloat.addUpdateListener(new j80(this, i12));
            this.m0.addListener(new t8(this, 25));
            if (this.L) {
                f11 = f16;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(hs.h);
            } else {
                f11 = f16;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f11 = f16;
        }
        if (!this.L || (n80Var2 = this.x) == null || this.N == 0) {
            f12 = f11;
        } else {
            n80Var2.s = (overlayContainerView.getWidth() - this.N) / f10;
            if (this.M == 3) {
                this.x.s = AndroidUtilities.dp(36.0f);
            }
            f12 = (-fArr[0]) + this.x.s + f11;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        k80 k80Var = new k80(this, this.A, overlayContainerView);
        this.m = k80Var;
        k80Var.setOnDismissListener(new l80(this, overlayContainerView));
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
                    if (this.L && (n80Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f18 = rectF.bottom;
                        n80Var.v = (height3 - (measuredHeight + f18)) / f10;
                        n80 n80Var4 = this.x;
                        height = (int) (n80Var4.v + f18);
                        width = (int) (((n80Var4.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
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
                        int i21 = org.telegram.ui.ActionBar.i6.E8;
                        org.telegram.ui.ActionBar.e6 e6Var = this.d;
                        T(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i21, e6Var)));
                        ch.d c10 = new ah.c(this.n).c(this.A, null, true);
                        c10.o(eh.b.k(e6Var));
                        c10.p(AndroidUtilities.dp(8.0f));
                        c10.j.e = true;
                        c10.q(AndroidUtilities.dp(12.0f));
                        c10.t(width + this.q, height + this.r);
                        this.A.setBackground(c10);
                    }
                    k80 k80Var2 = this.m;
                    k80Var2.g = this.I;
                    float f19 = width + this.q;
                    this.a0 = f19;
                    float f20 = height + this.r;
                    this.b0 = f20;
                    k80Var2.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        wk wkVar = new wk(new WeakReference(this), 3);
                        this.o0 = wkVar;
                        view.setOnTouchListener(wkVar);
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
                n80Var.v = (height32 - (measuredHeight2 + f182)) / f10;
                n80 n80Var42 = this.x;
                height = (int) (n80Var42.v + f182);
                width = (int) (((n80Var42.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i212 = org.telegram.ui.ActionBar.i6.E8;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.d;
                T(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i212, e6Var2)));
                ch.d c102 = new ah.c(this.n).c(this.A, null, true);
                c102.o(eh.b.k(e6Var2));
                c102.p(AndroidUtilities.dp(8.0f));
                c102.j.e = true;
                c102.q(AndroidUtilities.dp(12.0f));
                c102.t(width + this.q, height + this.r);
                this.A.setBackground(c102);
            }
            k80 k80Var22 = this.m;
            k80Var22.g = this.I;
            float f192 = width + this.q;
            this.a0 = f192;
            float f202 = height + this.r;
            this.b0 = f202;
            k80Var22.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                wk wkVar2 = new wk(new WeakReference(this), 3);
                this.o0 = wkVar2;
                view.setOnTouchListener(wkVar2);
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
        k80 k80Var222 = this.m;
        k80Var222.g = this.I;
        float f1922 = width + this.q;
        this.a0 = f1922;
        float f2022 = height + this.r;
        this.b0 = f2022;
        k80Var222.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
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
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            f1Var.setText(charSequence);
        } else {
            f1Var.g(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            f1Var.setSubtext(null);
        }
        Integer num = this.j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)));
        f1Var.setOnClickListener(new h80(this, runnable, 3));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, w7.x5.n(this.S, -2));
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
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.F8, z10 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.f1 f1Var) {
        AndroidUtilities.removeFromParent(f1Var);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ai, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, e6Var)));
        int i10 = this.S;
        if (i10 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(f1Var, w7.x5.n(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        int i12 = org.telegram.ui.ActionBar.i6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(UserObject.getUserName(currentUser));
        f1Var.setClipToPadding(false);
        f1Var.a.setPadding((f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!f1Var.d && f1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setCurrentAccount(i10);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.r(currentUser);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.e(currentUser, j9Var);
        y9Var.setScaleX(z10 ? 0.84f : 1.0f);
        y9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(y9Var, w7.x5.a(34.0f, -5.0f, 0.0f, -5.0f, 0.0f, 34, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, w7.x5.c(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        f1Var.setOnClickListener(new h80(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, w7.x5.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        int i11 = org.telegram.ui.ActionBar.i6.F8;
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
        y9 y9Var = new y9(context);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p(tLObject);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.e(tLObject, j9Var);
        y9Var.setScaleX(z10 ? 0.84f : 1.0f);
        y9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(y9Var, w7.x5.a(34.0f, -5.0f, 0.0f, -5.0f, 0.0f, 34, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, w7.x5.c(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        f1Var.setOnClickListener(new h80(this, runnable, 1));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(f1Var, w7.x5.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.f1 h() {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        int i11 = org.telegram.ui.ActionBar.i6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
            return f1Var;
        }
        f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
        r(f1Var, w7.x5.n(this.S, -2));
        return f1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ii.c2 c2Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        int i12 = org.telegram.ui.ActionBar.i6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1((i10 == 0 && c2Var == null) ? 1 : 2, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (c2Var != null) {
            f1Var.g(charSequence, 0, c2Var);
        } else if (i10 != 0) {
            f1Var.g(charSequence, i10, null);
        } else {
            f1Var.setText(charSequence);
        }
        f1Var.setChecked(z10);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        Integer num2 = this.k0;
        f1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        Integer num3 = this.l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        f1Var.setOnClickListener(new h80(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, w7.x5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, w7.x5.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this.e, this.d);
        k1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            k1Var.setColor(num.intValue());
        }
        r(k1Var, w7.x5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.i6.F8, org.telegram.ui.ActionBar.i6.E8, runnable);
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
        int i10 = org.telegram.ui.ActionBar.i6.i6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), 0, 12));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p(tLObject);
        y9Var.e(tLObject, j9Var);
        frameLayout.addView(y9Var, w7.x5.a(34.0f, 13.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.x5.a(-2.0f, 59.0f, 6.0f, 16.0f, 0.0f, -2, 55), context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.q5, e6Var, g10, 1, 13.0f);
        g10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(g10, w7.x5.a(-2.0f, 59.0f, 27.0f, 16.0f, 0.0f, -2, 55));
        frameLayout.setOnClickListener(new h80(this, runnable, 0));
        r(frameLayout, w7.x5.n(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(i10 > 0 ? i10 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new e80(this, 1));
        this.A.addView(this.D, w7.x5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.q4 q4Var = new ai.q4(this.e, 23);
        q4Var.setTextSize(1, i10);
        q4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, this.d));
        q4Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        q4Var.setText(Emoji.replaceEmoji(charSequence, q4Var.getPaint().getFontMetricsInt(), false));
        q4Var.setTag(R.id.fit_width_tag, 1);
        q4Var.setTypeface(null);
        NotificationCenter.listenEmojiLoading(q4Var);
        if (i11 > 0) {
            q4Var.setMaxWidth(i11);
        }
        r(q4Var, w7.x5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.x5.n(-1, -2));
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
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            a6 textView = ((org.telegram.ui.ActionBar.f1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ci.d4.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        k80 k80Var = this.m;
        if (k80Var != null) {
            k80Var.dismiss();
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
        View childAt2 = this.D.L.getChildAt(r0.getItemsCount() - 1);
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
        return this.D.L.getChildAt(r0.getItemsCount() - 1);
    }

    public p80(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public p80(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.e6 e6Var) {
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
