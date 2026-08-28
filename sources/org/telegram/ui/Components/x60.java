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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x60 {
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
    public final org.telegram.ui.ActionBar.o2 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.b6 d;
    public boolean d0;
    public final Context e;
    public View e0;
    public final View f;
    public m60 f0;
    public Drawable g;
    public n60 g0;
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
    public s60 m;
    public ValueAnimator m0;
    public ng.b n;
    public boolean n0;
    public final float[] o;
    public lr o0;
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
    public v60 x;
    public dt y;
    public final Rect z;

    public x60(org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, boolean z11) {
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
        if (o2Var.getContext() == null) {
            return;
        }
        if ((((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).E0) || (((o2Var instanceof org.telegram.ui.dy) && ((org.telegram.ui.dy) o2Var).S) || (((o2Var instanceof ContactsActivity) && ((ContactsActivity) o2Var).E) || ((o2Var instanceof org.telegram.ui.z71) && ((org.telegram.ui.z71) o2Var).I)))) && (parentLayout = o2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.o2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ng0) {
                o2Var = safeLastFragment;
            }
        }
        this.c = o2Var;
        org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = o2Var.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static x60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        return new x60(viewGroup, b6Var, view, false, false, false);
    }

    public static x60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view, boolean z10) {
        return new x60(viewGroup, b6Var, view, z10, false, false);
    }

    public static x60 H(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new x60(o2Var, view, false, true);
    }

    public static x60 I(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new x60(o2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i9) {
        if (viewGroup == null) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                ((org.telegram.ui.ActionBar.l1) childAt).setColor(i9);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i9);
            }
        }
    }

    public static void a(x60 x60Var, ViewGroup viewGroup) {
        v60 v60Var = x60Var.x;
        if (v60Var == null) {
            return;
        }
        x60Var.x = null;
        ValueAnimator valueAnimator = x60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(v60Var.w, 0.0f);
        x60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new q60(v60Var, 0));
        x60Var.m0.addListener(new ih.j3(x60Var, v60Var, viewGroup, 7));
        if (x60Var.L) {
            x60Var.m0.setDuration(380L);
            x60Var.m0.setInterpolator(gr.h);
        } else {
            x60Var.m0.setDuration(150L);
        }
        x60Var.m0.start();
    }

    public static void f(x60 x60Var, ih.j6 j6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = x60Var.e;
        org.telegram.ui.ActionBar.b6 b6Var = x60Var.d;
        u60 u60Var = new u60(context);
        LinearLayout linearLayout = new LinearLayout(context);
        u60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        x60Var.r(u60Var, g7.e6.n(-1, -2));
        float f10 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, x60Var.e, x60Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i9 = org.telegram.ui.ActionBar.f6.E8;
            g1Var.c(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(g1Var, g7.e6.n(-1, -2));
        }
        ArrayList arrayList2 = j6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            final ih.o6 o6Var = (ih.o6) obj2;
            final int i11 = o6Var.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, x60Var.e, x60Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i12 = org.telegram.ui.ActionBar.f6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            TLRPC.Photo photo = o6Var.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                obj = null;
                g1Var2.g(o6Var.b, R.drawable.msg_folders, null);
            } else {
                g1Var2.h(o6Var.b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(o6Var.c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), o6Var.c), "50_50", null, null);
                obj = null;
            }
            g1Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.p60
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
                    callback.run(o6Var);
                }
            });
            linearLayout.addView(g1Var2, g7.e6.n(-1, -2));
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i9, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i9 >= i11 && i9 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i9, i10);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.l1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        co coVar = new co(this, this.e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = coVar;
        coVar.setDispatchKeyEventListener(new l60(this, 0));
        this.A = this.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.m60] */
    public final void C() {
        N();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e0 = view;
        view.getLocationOnScreen(this.h0);
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.Components.m60
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                s60 s60Var;
                x60 x60Var = x60.this;
                if (x60Var.e0 == null || (s60Var = x60Var.m) == null || !s60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                x60Var.e0.getLocationOnScreen(iArr);
                int i9 = iArr[0];
                int[] iArr2 = x60Var.h0;
                if (i9 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i9;
                iArr2[1] = iArr[1];
                x60Var.O();
            }
        };
        this.e0.getViewTreeObserver().addOnScrollChangedListener(this.f0);
        n60 n60Var = new n60(this, 0);
        this.g0 = n60Var;
        this.e0.addOnLayoutChangeListener(n60Var);
    }

    public final boolean D() {
        s60 s60Var = this.m;
        return s60Var != null && s60Var.isShowing();
    }

    public final void E() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
        }
    }

    public final x60 J() {
        x60 x60Var = new x60(this.D, this.d);
        x60Var.C = this.D.b(x60Var.B);
        return x60Var;
    }

    public final void K(x60 x60Var) {
        this.n0 = true;
        this.D.getSwipeBack().e(x60Var.C);
    }

    public final void L() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
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
        View childAt = this.D.H.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
            g1Var.setRightIcon(R.drawable.msg_mini_lock3);
            g1Var.getRightIcon().setAlpha(0.4f);
            g1Var.setOnClickListener(new o60(this, runnable, 2));
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
            n60 n60Var = this.g0;
            if (n60Var != null) {
                this.e0.removeOnLayoutChangeListener(n60Var);
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
        int i9;
        int x10;
        float width;
        float f10;
        int y10;
        s60 s60Var = this.m;
        if (s60Var == null || !s60Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof w60) {
            ((w60) view).a(rectF);
        } else {
            int i10 = this.N;
            if (i10 == 0 || (i9 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i10, i9);
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
        float f15 = x10 + this.q;
        this.a0 = f15;
        float f16 = y10 + this.r;
        this.b0 = f16;
        this.m.update((int) f15, (int) f16, -1, -1);
    }

    public final void P(int i9) {
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i9);
            }
            i10++;
        }
    }

    public final void Q(ig.a aVar, lg.d dVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            kg.d c10 = aVar.c(viewGroup, null, z10);
            c10.n(dVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            c10.p(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(c10);
        }
    }

    public final void R(ba baVar, float f10, float f11) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ea(new fa(baVar, viewGroup, 5, false), this.A.getX() + this.a0 + f10, this.A.getY() + this.b0 + f11, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i9 = 0; i9 < this.A.getChildCount(); i9++) {
            View childAt = this.A.getChildAt(i9);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ea(new fa(baVar, childAt, 5, false), this.A.getX() + this.a0 + f10 + childAt.getX(), this.A.getY() + this.b0 + f11 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i9, int i10) {
        this.j0 = Integer.valueOf(i9);
        this.k0 = Integer.valueOf(i10);
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).c(i9, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).c(i9, i10);
            }
            i11++;
        }
    }

    public final void T(int i9) {
        this.i0 = Integer.valueOf(i9);
        if (this.A != null) {
            int i10 = 0;
            while (i10 < this.A.getChildCount()) {
                View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.l1) {
                            ((org.telegram.ui.ActionBar.l1) childAt2).setColor(i9);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                    ((org.telegram.ui.ActionBar.l1) childAt).setColor(i9);
                }
                i10++;
            }
        }
    }

    public final void V(int i9) {
        this.i = i9;
        if (i9 == 5 && this.E) {
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
        s60 s60Var = this.m;
        if (s60Var != null) {
            s60Var.update((int) this.a0, (int) (this.b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        if (this.A == null) {
            return;
        }
        int i9 = 0;
        while (i9 < this.A.getChildCount()) {
            View childAt = i9 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i9);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = k1Var.getChildAt(0);
                    View childAt3 = k1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                    org.telegram.ui.ActionBar.b6 b6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof bb0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof bb0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i9++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0418  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        float f10;
        float f11;
        int i9;
        float f12;
        float f13;
        int width;
        int i10;
        int height;
        boolean z10;
        int i11;
        v60 v60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x10;
        float f14;
        float width2;
        float f15;
        v60 v60Var2;
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i15).getLayoutParams().width = AndroidUtilities.dp(this.T);
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.H.getChildAt(i17).setMinimumWidth(AndroidUtilities.dp(this.S));
                    }
                }
                i16++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new ng.b();
        }
        ViewGroup viewGroup = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = this.c;
        ViewGroup overlayContainerView = viewGroup == null ? o2Var.getParentLayout().getOverlayContainerView() : viewGroup;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        float f16 = AndroidUtilities.displaySize.y / 2.0f;
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
        if (view instanceof w60) {
            ((w60) view).a(rectF);
            f11 = 2.0f;
        } else {
            int i18 = this.N;
            f11 = 2.0f;
            if (i18 == 0 || (i9 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i18, i9);
            }
        }
        float f17 = f10 + rectF.left;
        float f18 = f16 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f17 = 0.0f;
        }
        if (this.s > 0 || this.u || this.v) {
            v60 v60Var3 = new v60(this, context);
            this.x = v60Var3;
            this.y = new dt(i13, v60Var3);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, g7.e6.c(-1.0f, -1));
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
            this.m0.addListener(new r60(this, i12));
            if (this.L) {
                f12 = f17;
                this.m0.setDuration(380L);
                this.m0.setInterpolator(gr.h);
            } else {
                f12 = f17;
                this.m0.setDuration(150L);
            }
            this.m0.start();
        } else {
            f12 = f17;
        }
        if (!this.L || (v60Var2 = this.x) == null || this.N == 0) {
            f13 = f12;
        } else {
            v60Var2.s = (overlayContainerView.getWidth() - this.N) / f11;
            if (this.M == 3) {
                this.x.s = AndroidUtilities.dp(36.0f);
            }
            f13 = (-fArr[0]) + this.x.s + f12;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        s60 s60Var = new s60(this, this.A, overlayContainerView);
        this.m = s60Var;
        s60Var.setOnDismissListener(new t60(this, overlayContainerView));
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
                        x10 = (rectF.width() / f11) + overlayContainerView.getX() + f13;
                        f14 = this.A.getMeasuredWidth() / f11;
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
            i10 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        }
        int i20 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - i10;
        float height2 = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            if (!this.L) {
                height2 = Math.min(f18 + height2, i20) - this.A.getMeasuredHeight();
                f18 = overlayContainerView.getY();
            }
            height = (int) (f18 + height2);
        } else if (view != 0) {
            if (this.U || f18 + height2 + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i20) {
                f18 = (f18 - height2) - this.A.getMeasuredHeight();
                if (!this.V || Math.max(0.0f, f18 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z10 = true;
                    height = (int) (overlayContainerView.getY() + f18 + height2);
                    if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (v60Var = this.x) != null) {
                        float height3 = overlayContainerView.getHeight();
                        float measuredHeight = this.A.getMeasuredHeight();
                        float f19 = rectF.bottom;
                        v60Var.v = (height3 - (measuredHeight + f19)) / f11;
                        v60 v60Var4 = this.x;
                        height = (int) (v60Var4.v + f19);
                        width = (int) (((v60Var4.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                        if (this.M == 3) {
                            width = (int) (this.x.s - AndroidUtilities.dp(8.0f));
                        }
                    }
                    if (!this.w) {
                        if (o2Var != null && o2Var.getFragmentView() != null) {
                            o2Var.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        } else if (viewGroup != null) {
                            overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i21 = org.telegram.ui.ActionBar.f6.E8;
                        org.telegram.ui.ActionBar.b6 b6Var = this.d;
                        T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i21, b6Var)));
                        ng.b bVar = this.n;
                        bVar.getClass();
                        kg.f fVar = new kg.f(bVar);
                        fVar.n(null);
                        fVar.n(mg.c.j(b6Var));
                        fVar.o(AndroidUtilities.dp(8.0f));
                        fVar.h.e = true;
                        fVar.p(AndroidUtilities.dp(12.0f));
                        fVar.s(width + this.q, height + this.r);
                        this.A.setBackground(fVar);
                    }
                    s60 s60Var2 = this.m;
                    s60Var2.g = this.I;
                    float f20 = width + this.q;
                    this.a0 = f20;
                    float f21 = height + this.r;
                    this.b0 = f21;
                    s60Var2.showAtLocation(overlayContainerView, 0, (int) f20, (int) f21);
                    if (this.w && view != 0) {
                        if (view.getParent() == null) {
                            i11 = 1;
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            i11 = 1;
                        }
                        lr lrVar = new lr(new WeakReference(this), i11);
                        this.o0 = lrVar;
                        view.setOnTouchListener(lrVar);
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
                v60Var.v = (height32 - (measuredHeight2 + f192)) / f11;
                v60 v60Var42 = this.x;
                height = (int) (v60Var42.v + f192);
                width = (int) (((v60Var42.s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                }
            }
            if (!this.w) {
            }
            if (this.v) {
                int i212 = org.telegram.ui.ActionBar.f6.E8;
                org.telegram.ui.ActionBar.b6 b6Var2 = this.d;
                T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i212, b6Var2)));
                ng.b bVar2 = this.n;
                bVar2.getClass();
                kg.f fVar2 = new kg.f(bVar2);
                fVar2.n(null);
                fVar2.n(mg.c.j(b6Var2));
                fVar2.o(AndroidUtilities.dp(8.0f));
                fVar2.h.e = true;
                fVar2.p(AndroidUtilities.dp(12.0f));
                fVar2.s(width + this.q, height + this.r);
                this.A.setBackground(fVar2);
            }
            s60 s60Var22 = this.m;
            s60Var22.g = this.I;
            float f202 = width + this.q;
            this.a0 = f202;
            float f212 = height + this.r;
            this.b0 = f212;
            s60Var22.showAtLocation(overlayContainerView, 0, (int) f202, (int) f212);
            if (this.w) {
                if (view.getParent() == null) {
                }
                lr lrVar2 = new lr(new WeakReference(this), i11);
                this.o0 = lrVar2;
                view.setOnTouchListener(lrVar2);
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
        s60 s60Var222 = this.m;
        s60Var222.g = this.I;
        float f2022 = width + this.q;
        this.a0 = f2022;
        float f2122 = height + this.r;
        this.b0 = f2122;
        s60Var222.showAtLocation(overlayContainerView, 0, (int) f2022, (int) f2122);
        if (this.w) {
        }
        if (this.d0) {
        }
    }

    public final void a0(float f10, float f11) {
        this.q += f10;
        this.r += f11;
    }

    public final void b(int i9, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i9 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.g(charSequence, i9, drawable);
        }
        Integer num = this.j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        g1Var.setOnClickListener(new o60(this, runnable, 3));
        int i12 = this.S;
        if (i12 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, g7.e6.n(this.S, -2));
        }
    }

    public final void b0(int i9, int i10) {
        View v = v(this.A, i9, i10);
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
            this.p0.drawableHotspotChanged(i9 - r1[0], i10 - r1[1]);
        }
    }

    public final void c(int i9, CharSequence charSequence, Runnable runnable, boolean z10) {
        b(i9, null, charSequence, z10 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.F8, z10 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ai, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
        int i9 = this.S;
        if (i9 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i9));
            r(g1Var, g7.e6.n(this.S, -2));
        }
    }

    public final void e(int i9, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        int i11 = org.telegram.ui.ActionBar.f6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(UserObject.getUserName(currentUser));
        g1Var.setClipToPadding(false);
        g1Var.a.setPadding((g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!g1Var.d && g1Var.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        o9 o9Var = new o9(context);
        o9Var.getImageReceiver().setCurrentAccount(i9);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(currentUser);
        o9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        o9Var.e(currentUser, z8Var);
        o9Var.setScaleX(z10 ? 0.84f : 1.0f);
        o9Var.setScaleY(z10 ? 0.84f : 1.0f);
        g1Var.addView(o9Var, g7.e6.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new og.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), AndroidUtilities.dp(34.0f)));
            g1Var.addView(view, g7.e6.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        g1Var.setOnClickListener(new o60(this, runnable, 4));
        int i12 = this.S;
        if (i12 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, g7.e6.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        int i10 = org.telegram.ui.ActionBar.f6.F8;
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
        o9 o9Var = new o9(context);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        o9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        o9Var.e(tLObject, z8Var);
        o9Var.setScaleX(z10 ? 0.84f : 1.0f);
        o9Var.setScaleY(z10 ? 0.84f : 1.0f);
        g1Var.addView(o9Var, g7.e6.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new og.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), AndroidUtilities.dp(34.0f)));
            g1Var.addView(view, g7.e6.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.j0;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        g1Var.setOnClickListener(new o60(this, runnable, 1));
        int i11 = this.S;
        if (i11 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i11));
            r(g1Var, g7.e6.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        int i10 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        int i11 = this.S;
        if (i11 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
            return g1Var;
        }
        g1Var.setMinimumWidth(AndroidUtilities.dp(i11));
        r(g1Var, g7.e6.n(this.S, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i9, qh.v1 v1Var, CharSequence charSequence, Runnable runnable) {
        if (this.e == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        int i11 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1((i9 == 0 && v1Var == null) ? 1 : 2, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (v1Var != null) {
            g1Var.g(charSequence, 0, v1Var);
        } else if (i9 != 0) {
            g1Var.g(charSequence, i9, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        Integer num2 = this.k0;
        g1Var.c(intValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        Integer num3 = this.l0;
        g1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        g1Var.setOnClickListener(new o60(this, runnable, 5));
        int i12 = this.S;
        if (i12 <= 0) {
            r(g1Var, g7.e6.n(-1, -2));
        } else {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, g7.e6.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this.e, this.d);
        l1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.i0;
        if (num != null) {
            l1Var.setColor(num.intValue());
        }
        r(l1Var, g7.e6.n(-1, 8));
    }

    public final void l(int i9, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i9, null, charSequence, org.telegram.ui.ActionBar.f6.F8, org.telegram.ui.ActionBar.f6.E8, runnable);
        }
    }

    public final void m(boolean z10, int i9, String str, boolean z11, Runnable runnable) {
        if (z10) {
            c(i9, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i9 = org.telegram.ui.ActionBar.f6.i6;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), 0, 12));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        o9Var.e(tLObject, z8Var);
        frameLayout.addView(o9Var, g7.e6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.q5, b6Var, g10, 1, 13.0f);
        g10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(g10, g7.e6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new o60(this, runnable, 0));
        r(frameLayout, g7.e6.n(-1, 52));
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
            int i9 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(i9 > 0 ? i9 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new l60(this, 1));
        this.A.addView(this.D, g7.e6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i9, int i10, CharSequence charSequence) {
        bg.t tVar = new bg.t(this.e, 24);
        tVar.setTextSize(1, i9);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, this.d));
        tVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        tVar.setText(Emoji.replaceEmoji(charSequence, tVar.getPaint().getFontMetricsInt(), false));
        tVar.setTag(R.id.fit_width_tag, 1);
        tVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(tVar);
        if (i10 > 0) {
            tVar.setMaxWidth(i10);
        }
        r(tVar, g7.e6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, g7.e6.n(-1, -2));
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
        if (childAt instanceof org.telegram.ui.ActionBar.g1) {
            s5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + kh.x3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.n0) {
            this.n0 = false;
            return;
        }
        s60 s60Var = this.m;
        if (s60Var != null) {
            s60Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i9);
                if (childAt2 != null) {
                    return childAt2;
                }
                i9 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i10++;
        }
        return null;
    }

    public final int x() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i9 = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i10 = 0;
        while (i9 < this.A.getChildCount() - 1) {
            View childAt = i9 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i9);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i10 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i10;
            }
            i9++;
        }
        return i10;
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
        View childAt2 = this.D.H.getChildAt(r0.getItemsCount() - 1);
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
        return this.D.H.getChildAt(r0.getItemsCount() - 1);
    }

    public x60(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view, boolean z10, boolean z11, boolean z12) {
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
        this.d = b6Var;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public x60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.b6 b6Var) {
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
        this.d = b6Var;
    }
}
