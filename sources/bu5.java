// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bu5 {
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
    public byte M;
    public int N;
    public int O;
    public ArrayList P;
    public ArrayList Q;
    public final float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public short W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup a;
    public int a0;
    public ViewGroup b;
    public boolean b0;
    public final d c;
    public boolean c0;
    public final ylb d;
    public float d0;
    public final Context e;
    public float e0;
    public final View f;
    public boolean f0;
    public Drawable g;
    public boolean g0;
    public int h;
    public View h0;
    public byte i;
    public be i0;
    public boolean j;
    public ol1 j0;
    public int k;
    public final int[] k0;
    public int l;
    public Integer l0;
    public wt5 m;
    public Integer m0;
    public jz4 n;
    public Integer n0;
    public final float[] o;
    public Integer o0;
    public Runnable p;
    public ValueAnimator p0;
    public float q;
    public boolean q0;
    public float r;
    public a7 r0;
    public short s;
    public View s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public boolean v;
    public boolean w;
    public yt5 x;
    public cc y;
    public final Rect z;

    public bu5(d dVar, View view, boolean z, boolean z2) {
        tk5 parentLayout;
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        if (dVar.getContext() == null) {
            return;
        }
        if ((((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).J0) || (((dVar instanceof nk3) && ((nk3) dVar).X) || (((dVar instanceof ContactsActivity) && ((ContactsActivity) dVar).H) || ((dVar instanceof daa) && ((daa) dVar).O)))) && (parentLayout = dVar.getParentLayout()) != null) {
            d safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof bj6) {
                dVar = safeLastFragment;
            }
        }
        this.c = dVar;
        ylb resourceProvider = dVar.getResourceProvider();
        this.d = resourceProvider;
        this.e = dVar.getContext();
        this.f = view;
        this.s = ((double) gm.B(cmb.v0(cmb.c6, resourceProvider))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.G = z2;
        this.F = false;
        C();
    }

    public static void B(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        while (view != viewGroup) {
            float y = view.getY() + f;
            float x = view.getX() + f2;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x -= view.getScrollX();
                y -= view.getScrollY();
            }
            f2 = x;
            f = y;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f2 - viewGroup.getPaddingLeft();
        fArr[1] = f - viewGroup.getPaddingTop();
    }

    public static bu5 G(ViewGroup viewGroup, ylb ylbVar, View view) {
        return new bu5(viewGroup, ylbVar, view, false, false, false);
    }

    public static bu5 H(ViewGroup viewGroup, ylb ylbVar, View view, boolean z) {
        return new bu5(viewGroup, ylbVar, view, z, false, false);
    }

    public static bu5 I(d dVar, View view) {
        return new bu5(dVar, view, false, true);
    }

    public static bu5 J(d dVar, View view) {
        return new bu5(dVar, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof j8) {
                    ((j8) childAt).setColor(i);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i);
                }
            }
        }
    }

    public static void e(bu5 bu5Var, v3b v3bVar, final HashSet hashSet, boolean z, Runnable runnable, final qac qacVar) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = bu5Var.e;
        lj3 lj3Var = new lj3(context, (byte) 3);
        LinearLayout linearLayout = new LinearLayout(context);
        lj3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        bu5Var.q(lj3Var, qoe.o(-1, -2));
        float f = 0.12f;
        float f2 = 18.0f;
        if (z && runnable != null) {
            a8 a8Var = new a8(2, bu5Var.d, bu5Var.e, false, false);
            a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            int i = cmb.D8;
            a8Var.c(i, cmb.E8);
            a8Var.h(0.12f, i);
            a8Var.j(jb6.M0(2131744474, null), R.drawable.menu_album_add, null);
            a8Var.setOnClickListener(new xl3(runnable, (byte) 3));
            linearLayout.addView(a8Var, qoe.o(-1, -2));
        }
        ArrayList arrayList2 = v3bVar.h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final a4b a4bVar = (a4b) obj;
            final int i3 = a4bVar.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i3));
            float f3 = f2;
            a8 a8Var2 = new a8(2, bu5Var.d, bu5Var.e, false, false);
            a8Var2.setChecked(contains);
            a8Var2.setPadding(gm.L(f3), 0, gm.L(f3), 0);
            int i4 = cmb.D8;
            a8Var2.c(i4, cmb.E8);
            a8Var2.h(f, i4);
            TLRPC.Photo photo = a4bVar.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                a8Var2.j(a4bVar.b, R.drawable.msg_folders, null);
            } else {
                a8Var2.k(a4bVar.b, gn5.f(bc4.w(a4bVar.c.sizes, gm.L(24.0f), false, bc4.w(arrayList, 50, false, null, false), true), a4bVar.c), "50_50", null, null);
            }
            a8Var2.setOnClickListener(new View.OnClickListener() { // from class: ut5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z2 = contains;
                    HashSet hashSet2 = hashSet;
                    int i5 = i3;
                    if (z2) {
                        hashSet2.remove(Integer.valueOf(i5));
                    } else {
                        hashSet2.add(Integer.valueOf(i5));
                    }
                    qacVar.a(a4bVar);
                }
            });
            linearLayout.addView(a8Var2, qoe.o(-1, -2));
            f2 = f3;
            f = 0.12f;
        }
    }

    public static void s(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof zt5) {
                arrayList.add(view);
            }
            if (view instanceof yi6) {
                arrayList2.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    s(viewGroup.getChildAt(i), arrayList, arrayList2);
                }
            }
        }
    }

    public static View w(View view, int i, int i2) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = view.getWidth() + i3;
            int height = view.getHeight() + i4;
            if (i >= i3 && i < width && i2 >= i4 && i2 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View w = w(viewGroup.getChildAt(childCount), i, i2);
                        if (w != null) {
                            return w;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof j8)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final View A() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                return linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        return this.D.M.getChildAt(r1.getItemsCount() - 1);
    }

    public final void C() {
        hd2 hd2Var = new hd2(this, this.e, this.d, (this.E ? 1 : 0) | (this.F ? 2 : 0) | (this.G ? 0 : 4));
        this.D = hd2Var;
        hd2Var.setDispatchKeyEventListener(new st5(this, (byte) 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.h0 = view;
        view.getLocationOnScreen(this.k0);
        this.i0 = new be(this, (byte) 2);
        this.h0.getViewTreeObserver().addOnScrollChangedListener(this.i0);
        ol1 ol1Var = new ol1(this, (byte) 3);
        this.j0 = ol1Var;
        this.h0.addOnLayoutChangeListener(ol1Var);
    }

    public final boolean E() {
        wt5 wt5Var = this.m;
        return wt5Var != null && wt5Var.isShowing();
    }

    public final void F() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r1.getItemsCount() - 1);
        if (childAt instanceof a8) {
            ((a8) childAt).setMultiline(false);
        }
    }

    public final bu5 K() {
        bu5 bu5Var = new bu5(this.D, this.d);
        bu5Var.C = this.D.b(bu5Var.B);
        return bu5Var;
    }

    public final void L(bu5 bu5Var) {
        this.q0 = true;
        this.D.getSwipeBack().e(bu5Var.C);
    }

    public final void M() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r3.getItemsCount() - 1);
        if (childAt instanceof a8) {
            a8 a8Var = (a8) childAt;
            a8Var.setRightIcon(R.drawable.msg_text_check);
            a8Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            a8Var.getRightIcon().setScaleX(0.85f);
            a8Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void N(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof a8) {
            a8 a8Var = (a8) childAt;
            a8Var.setRightIcon(R.drawable.msg_mini_lock3);
            a8Var.getRightIcon().setAlpha(0.4f);
            a8Var.setOnClickListener(new tt5(this, runnable, (byte) 3));
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
            ol1 ol1Var = this.j0;
            if (ol1Var != null) {
                this.h0.removeOnLayoutChangeListener(ol1Var);
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
        int i;
        int x;
        float width;
        float f;
        int y;
        wt5 wt5Var = this.m;
        if (wt5Var == null || !wt5Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.o;
        B(view, viewGroup, fArr);
        float f2 = fArr[1];
        float f3 = fArr[0];
        if (this.f0) {
            viewGroup.getLocationOnScreen(new int[2]);
            f3 += r7[0];
            f2 += r7[1];
        }
        RectF rectF = new RectF();
        if (view instanceof au5) {
            ((au5) view).e(rectF);
        } else {
            int i2 = this.N;
            if (i2 == 0 || (i = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i2, i);
            }
        }
        float f4 = f3 + rectF.left;
        float f5 = f2 + rectF.top;
        if (this.j) {
            fArr[0] = 0.0f;
            f4 = 0.0f;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        if (gm.O1()) {
            f5 += viewGroup.getPaddingTop();
            f4 -= viewGroup.getPaddingLeft();
        }
        byte b = this.i;
        if (b == 3) {
            x = (int) (viewGroup.getX() + f4);
        } else {
            if (b == 5) {
                width = rectF.width() + viewGroup.getX() + f4;
                f = rectF2.right;
            } else if (b == 1) {
                width = (rectF.width() / 2.0f) + viewGroup.getX() + f4;
                f = this.A.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + f4 > viewGroup.getWidth()) {
                width = rectF.width() + viewGroup.getX() + f4;
                f = rectF2.right;
            } else {
                x = (int) ((viewGroup.getX() + f4) - rectF2.left);
            }
            x = (int) (width - f);
        }
        float height = this.b0 ? 0.0f : rectF.height();
        if (this.Z) {
            y = (int) (viewGroup.getY() + (Math.min(f5 + height, gm.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.X || f5 + height + this.A.getMeasuredHeight() + gm.L(16.0f) > gm.q.y - gm.n) {
                f5 = (f5 - height) - this.A.getMeasuredHeight();
                if (this.Y && Math.max(0.0f, f5 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f5 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y = (int) (viewGroup.getY() + f5 + height);
        }
        float f6 = x + this.q;
        this.d0 = f6;
        float f7 = y + this.r;
        this.e0 = f7;
        this.m.update((int) f6, (int) f7, -1, -1);
    }

    public final void Q(int i) {
        int i2 = 0;
        while (i2 < this.A.getChildCount()) {
            View childAt = i2 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i);
            }
            i2++;
        }
    }

    public final void R(km0 km0Var, nm0 nm0Var, boolean z) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            im0 c = km0Var.c(viewGroup, null, z);
            c.p(nm0Var);
            c.q(gm.L(8.0f));
            c.S.e = true;
            c.r(gm.L(12.0f));
            viewGroup.setBackground(c);
        }
    }

    public final void S(sm0 sm0Var, float f, float f2) {
        Drawable d = b10.d(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new vm0(new wm0(sm0Var, viewGroup, 5, false), this.A.getX() + this.d0 + f, this.A.getY() + this.e0 + f2, d, gm.L(12.0f)));
            return;
        }
        for (int i = 0; i < this.A.getChildCount(); i++) {
            View childAt = this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new vm0(new wm0(sm0Var, childAt, 5, false), this.A.getX() + this.d0 + f + childAt.getX(), this.A.getY() + this.e0 + f2 + childAt.getY(), d, gm.L(12.0f)));
            }
        }
    }

    public final void T(int i, int i2) {
        this.m0 = Integer.valueOf(i);
        this.n0 = Integer.valueOf(i2);
        int i3 = 0;
        while (i3 < this.A.getChildCount()) {
            View childAt = i3 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i4);
                    if (childAt2 instanceof a8) {
                        ((a8) childAt2).d(i, i2);
                    }
                }
            } else if (childAt instanceof a8) {
                ((a8) childAt).d(i, i2);
            }
            i3++;
        }
    }

    public final void U(int i) {
        this.l0 = Integer.valueOf(i);
        if (this.A != null) {
            int i2 = 0;
            while (i2 < this.A.getChildCount()) {
                View childAt = i2 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i2);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                        if (childAt2 instanceof j8) {
                            ((j8) childAt2).setColor(i);
                        }
                    }
                } else if (childAt instanceof j8) {
                    ((j8) childAt).setColor(i);
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i) {
        this.i = i;
        if (i == 5 && this.E) {
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

    public final void Y(float f) {
        wt5 wt5Var = this.m;
        if (wt5Var != null) {
            wt5Var.update((int) this.d0, (int) (this.e0 + f), -1, -1);
        }
    }

    public final void Z() {
        if (this.A != null) {
            int i = 0;
            while (i < this.A.getChildCount()) {
                View childAt = i == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    qmb qmbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = qmbVar.getChildAt(0);
                        View childAt3 = qmbVar.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z = childAt2 instanceof a8;
                        ylb ylbVar = this.d;
                        if (z) {
                            ((a8) childAt2).n(true, childAt2 == childAt3);
                        } else if ((childAt2 instanceof k57) || (childAt2 instanceof FrameLayout)) {
                            int i2 = cmb.H5;
                            anb.R(childAt2, cmb.Y(cmb.v0(i2, ylbVar), 12, childAt2 == childAt3 ? 12 : 0), null, anb.M(i2), ylbVar);
                        } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                            int i3 = cmb.H5;
                            fg0 Y = cmb.Y(cmb.v0(i3, ylbVar), 12, childAt2 == childAt3 ? 12 : 0);
                            wmb M = anb.M(i3);
                            childAt2.setBackground(Y);
                            anb.j(childAt2, Y, null, M, ylbVar);
                        }
                        if (childAt3 instanceof a8) {
                            ((a8) childAt3).n(childAt3 == childAt2, true);
                        } else if ((childAt3 instanceof k57) || (childAt3 instanceof FrameLayout)) {
                            int i4 = cmb.H5;
                            anb.R(childAt3, cmb.Y(cmb.v0(i4, ylbVar), childAt2 == childAt3 ? 12 : 0, 12), null, anb.M(i4), ylbVar);
                        } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                            int i5 = cmb.H5;
                            fg0 Y2 = cmb.Y(cmb.v0(i5, ylbVar), childAt2 == childAt3 ? 12 : 0, 12);
                            wmb M2 = anb.M(i5);
                            childAt3.setBackground(Y2);
                            anb.j(childAt3, Y2, null, M2, ylbVar);
                        }
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, Drawable drawable, CharSequence charSequence, int i2, int i3, Runnable runnable) {
        int intValue;
        Integer num;
        int i4;
        if (this.e == null) {
            return;
        }
        a8 a8Var = new a8(0, this.d, this.e, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        if (i == 0 && drawable == null) {
            a8Var.setText(charSequence);
        } else {
            a8Var.j(charSequence, i, drawable);
        }
        Integer num2 = this.m0;
        ylb ylbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(i3, i2);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, i3);
                }
                a8Var.setOnClickListener(new tt5(this, runnable, (byte) 4));
                i4 = this.V;
                if (i4 > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gm.L(i4));
                    q(a8Var, qoe.o(this.V, -2));
                    return;
                }
            }
            intValue = cmb.v0(i3, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(i2, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new tt5(this, runnable, (byte) 4));
        i4 = this.V;
        if (i4 > 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0443 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float f4;
        int width;
        int i3;
        int height;
        boolean z;
        boolean z2;
        ViewGroup viewGroup;
        yt5 yt5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x;
        float f5;
        float width2;
        float f6;
        yt5 yt5Var2;
        if (this.m != null || this.B != null || y() <= 0) {
            return;
        }
        Z();
        if (this.W > 0) {
            int i4 = 0;
            while (i4 < this.A.getChildCount() - 1) {
                View childAt = i4 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i4);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i5 = 0; i5 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i5++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i5).getLayoutParams().width = gm.L(this.W);
                    }
                }
                i4++;
            }
        } else if (this.V > 0) {
            int i6 = 0;
            while (i6 < this.A.getChildCount() - 1) {
                View childAt2 = i6 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i6);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i7++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.M.getChildAt(i7).setMinimumWidth(gm.L(this.V));
                    }
                }
                i6++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new jz4();
        }
        ViewGroup viewGroup2 = this.a;
        d dVar = this.c;
        ViewGroup overlayContainerView = viewGroup2 == null ? dVar.getParentLayout().getOverlayContainerView() : viewGroup2;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = gm.q;
        float f7 = point.y / 2.0f;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            B(view, overlayContainerView, fArr);
            f7 = fArr[1];
            f2 = fArr[0];
            if (this.f0) {
                overlayContainerView.getLocationOnScreen(new int[2]);
                f = 2.0f;
                f2 += r15[0];
                f7 += r15[1];
            } else {
                f = 2.0f;
            }
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        RectF rectF = new RectF();
        if (view instanceof au5) {
            ((au5) view).e(rectF);
            i = 0;
        } else {
            int i8 = this.N;
            i = 0;
            if (i8 == 0 || (i2 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i8, i2);
            }
        }
        float f8 = f2 + rectF.left;
        float f9 = f7 + rectF.top;
        if (this.j) {
            fArr[i] = 0.0f;
            f8 = 0.0f;
        }
        this.P = null;
        this.Q = null;
        if (dVar != null && dVar.clipsScrimUnderOccluders() && overlayContainerView.getRootView() != null) {
            this.P = new ArrayList();
            this.Q = new ArrayList();
            s(overlayContainerView.getRootView(), this.P, this.Q);
        }
        byte b = 5;
        if (this.s > 0 || this.u || this.v) {
            yt5 yt5Var3 = new yt5(this, context);
            this.x = yt5Var3;
            this.y = new cc(yt5Var3, b);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, qoe.c(-1.0f, -1));
            this.x.setProgress(0.0f);
            if (this.S) {
                if (view instanceof au5) {
                    ((au5) view).setScrimHidden(true);
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
            ofFloat.addUpdateListener(new fh4(this, (byte) 15));
            this.p0.addListener(new v85(this, (byte) 8));
            boolean z3 = this.L;
            ValueAnimator valueAnimator2 = this.p0;
            f3 = f8;
            if (z3) {
                valueAnimator2.setDuration(380L);
                this.p0.setInterpolator(d53.h);
            } else {
                valueAnimator2.setDuration(150L);
            }
            this.p0.start();
        } else {
            f3 = f8;
        }
        if (!this.L || (yt5Var2 = this.x) == null || this.N == 0) {
            f4 = f3;
        } else {
            yt5Var2.s = (overlayContainerView.getWidth() - this.N) / f;
            if (this.M == 3) {
                this.x.s = gm.L(36.0f);
            }
            f4 = (-fArr[i]) + this.x.s + f3;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        wt5 wt5Var = new wt5(this, this.A, overlayContainerView);
        this.m = wt5Var;
        wt5Var.setOnDismissListener(new br(this, overlayContainerView, (byte) 1));
        this.m.setOutsideTouchable(true);
        this.m.setFocusable(!this.T);
        int i9 = i;
        this.m.setBackgroundDrawable(new ColorDrawable(i9));
        this.m.setAnimationStyle(R.style.PopupContextAnimation);
        if (this.c0) {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(i9);
        } else if (this.T) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else {
            boolean z4 = this.U;
            wt5 wt5Var2 = this.m;
            if (z4) {
                wt5Var2.setInputMethodMode(1);
                this.m.setSoftInputMode(32);
            } else {
                wt5Var2.setInputMethodMode(2);
                this.m.setSoftInputMode(0);
            }
        }
        if (gm.O1()) {
            f9 += overlayContainerView.getPaddingTop();
            f4 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            byte b2 = this.i;
            if (b2 == 3) {
                width = (int) (overlayContainerView.getX() + f4);
            } else {
                if (b2 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f4;
                    f6 = rectF2.right;
                } else {
                    if (b2 == 1) {
                        x = (rectF.width() / f) + overlayContainerView.getX() + f4;
                        f5 = this.A.getMeasuredWidth() / f;
                    } else if (rectF2.width() + f4 > overlayContainerView.getWidth()) {
                        width2 = rectF.width() + overlayContainerView.getX() + f4;
                        f6 = rectF2.right;
                    } else {
                        x = overlayContainerView.getX() + f4;
                        f5 = rectF2.left;
                    }
                    width = (int) (x - f5);
                }
                width = (int) (width2 - f6);
            }
        } else {
            width = (overlayContainerView.getWidth() - this.A.getMeasuredWidth()) / 2;
        }
        int i10 = width;
        if (this.c0) {
            i3 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? gm.m : 0)) - gm.o1(rootView)) - (rect.bottom - rect.top));
        }
        int i11 = (point.y - gm.n) - i3;
        float height2 = this.b0 ? 0.0f : rectF.height();
        if (this.Z) {
            float f10 = f9 + height2;
            height = this.L ? (int) f10 : (int) (overlayContainerView.getY() + (Math.min(f10, i11) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.X || f9 + height2 + this.A.getMeasuredHeight() + gm.L(16.0f) > i11) {
                f9 = (f9 - height2) - this.A.getMeasuredHeight();
                if (!this.Y || Math.max(0.0f, f9 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z = true;
                    height = (int) (overlayContainerView.getY() + f9 + height2);
                    z2 = z;
                    if (this.E && z2 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (yt5Var = this.x) != null) {
                        float f11 = rectF.bottom;
                        float f12 = this.R;
                        float f13 = f11 * f12;
                        float f14 = ((f12 + 1.0f) * rectF.right) / f;
                        yt5Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f13)) / f) + 0.0f;
                        yt5 yt5Var4 = this.x;
                        int i12 = (int) (yt5Var4.w + f13);
                        int measuredWidth = (int) (((yt5Var4.s + f14) - this.A.getMeasuredWidth()) + gm.L(4.0f));
                        if (this.M == 3) {
                            measuredWidth = (int) (this.x.s - gm.L(8.0f));
                        }
                        height = i12;
                        i10 = measuredWidth;
                    }
                    if (!this.w) {
                        if (dVar != null && dVar.getFragmentView() != null) {
                            dVar.getFragmentView().getRootView().dispatchTouchEvent(gm.R());
                        } else if (viewGroup2 != null) {
                            overlayContainerView.dispatchTouchEvent(gm.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i13 = cmb.D8;
                        ylb ylbVar = this.d;
                        U(cmb.p1(0.06f, cmb.v0(i13, ylbVar)));
                        wmb K = anb.K(0.06f, i13);
                        if (this.A != null) {
                            int i14 = 0;
                            while (i14 < this.A.getChildCount()) {
                                View childAt3 = i14 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i14);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i15++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.M.getChildAt(i15);
                                        if (childAt4 instanceof j8) {
                                            anb.i(childAt4, K, ylbVar);
                                        }
                                    }
                                } else if (childAt3 instanceof j8) {
                                    anb.i(childAt3, K, ylbVar);
                                }
                                i14++;
                            }
                        }
                        jz4 jz4Var = this.n;
                        im0 c = new km0(jz4Var, jz4Var, jz4Var).c(this.A, null, true);
                        c.p(qqd.k(ylbVar));
                        c.q(gm.L(8.0f));
                        c.S.e = true;
                        c.r(gm.L(12.0f));
                        float f15 = i10;
                        float f16 = height;
                        c.i(this.q + f15, this.r + f16);
                        viewGroup = this.A;
                        if (viewGroup == this.D && (viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getChildCount() > 1) {
                            final float f17 = f15 + this.q;
                            final float f18 = f16 + this.r;
                            for (int i16 = 0; i16 < this.A.getChildCount(); i16++) {
                                View childAt5 = this.A.getChildAt(i16);
                                if (childAt5 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    jz4 jz4Var2 = this.n;
                                    final im0 c2 = new km0(jz4Var2, jz4Var2, jz4Var2).c(childAt5, null, true);
                                    c2.p(qqd.k(ylbVar));
                                    c2.q(gm.L(8.0f));
                                    c2.S.e = true;
                                    c2.r(gm.L(12.0f));
                                    c2.i(childAt5.getLeft() + f17, childAt5.getTop() + f18);
                                    childAt5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vt5
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
                                            im0.this.i(f17 + i17, f18 + i18);
                                        }
                                    });
                                    childAt5.setBackground(c2);
                                }
                            }
                        } else {
                            this.A.setBackground(c);
                        }
                    }
                    wt5 wt5Var3 = this.m;
                    wt5Var3.g = this.I;
                    float f19 = i10 + this.q;
                    this.d0 = f19;
                    float f20 = height + this.r;
                    this.e0 = f20;
                    wt5Var3.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        a7 a7Var = new a7(new WeakReference(this), (byte) 7);
                        this.r0 = a7Var;
                        view.setOnTouchListener(a7Var);
                    }
                    if (this.g0) {
                        D();
                        return;
                    }
                    return;
                }
                f9 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f) - height2) - overlayContainerView.getY();
            }
            z = false;
            height = (int) (overlayContainerView.getY() + f9 + height2);
            z2 = z;
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float f112 = rectF.bottom;
                float f122 = this.R;
                float f132 = f112 * f122;
                float f142 = ((f122 + 1.0f) * rectF.right) / f;
                yt5Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f132)) / f) + 0.0f;
                yt5 yt5Var42 = this.x;
                int i122 = (int) (yt5Var42.w + f132);
                int measuredWidth2 = (int) (((yt5Var42.s + f142) - this.A.getMeasuredWidth()) + gm.L(4.0f));
                if (this.M == 3) {
                }
                height = i122;
                i10 = measuredWidth2;
            }
            if (!this.w) {
            }
            if (this.v) {
                int i132 = cmb.D8;
                ylb ylbVar2 = this.d;
                U(cmb.p1(0.06f, cmb.v0(i132, ylbVar2)));
                wmb K2 = anb.K(0.06f, i132);
                if (this.A != null) {
                }
                jz4 jz4Var3 = this.n;
                im0 c3 = new km0(jz4Var3, jz4Var3, jz4Var3).c(this.A, null, true);
                c3.p(qqd.k(ylbVar2));
                c3.q(gm.L(8.0f));
                c3.S.e = true;
                c3.r(gm.L(12.0f));
                float f152 = i10;
                float f162 = height;
                c3.i(this.q + f152, this.r + f162);
                viewGroup = this.A;
                if (viewGroup == this.D) {
                }
                this.A.setBackground(c3);
            }
            wt5 wt5Var32 = this.m;
            wt5Var32.g = this.I;
            float f192 = i10 + this.q;
            this.d0 = f192;
            float f202 = height + this.r;
            this.e0 = f202;
            wt5Var32.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                a7 a7Var2 = new a7(new WeakReference(this), (byte) 7);
                this.r0 = a7Var2;
                view.setOnTouchListener(a7Var2);
            }
            if (this.g0) {
            }
        } else {
            height = (overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / 2;
        }
        z2 = false;
        if (this.E) {
        }
        if (this.L) {
        }
        if (!this.w) {
        }
        if (this.v) {
        }
        wt5 wt5Var322 = this.m;
        wt5Var322.g = this.I;
        float f1922 = i10 + this.q;
        this.d0 = f1922;
        float f2022 = height + this.r;
        this.e0 = f2022;
        wt5Var322.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
        if (this.w) {
        }
        if (this.g0) {
        }
    }

    public final void b(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = cmb.o7;
            i3 = i2;
        } else {
            i2 = cmb.E8;
            i3 = cmb.D8;
        }
        a(i, null, charSequence, i2, i3, runnable);
    }

    public final void b0(float f, float f2) {
        this.q += f;
        this.r += f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(a8 a8Var) {
        int intValue;
        Integer num;
        int i;
        gm.B2(a8Var);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        Integer num2 = this.m0;
        ylb ylbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(cmb.D8, cmb.E8);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, cmb.D8);
                }
                i = this.V;
                if (i > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gm.L(i));
                    q(a8Var, qoe.o(this.V, -2));
                    return;
                }
            }
            intValue = cmb.v0(cmb.D8, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(cmb.E8, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        i = this.V;
        if (i > 0) {
        }
    }

    public final void c0(int i, int i2) {
        View w = w(this.A, i, i2);
        View view = this.s0;
        if (w != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.s0 = w;
            if (w != null) {
                w.setPressed(true);
            }
        }
        View view2 = this.s0;
        if (view2 != null) {
            view2.getLocationOnScreen(this.t0);
            this.s0.drawableHotspotChanged(i - r1[0], i2 - r1[1]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z, Runnable runnable) {
        int intValue;
        Integer num;
        int i2;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i3 = cmb.D8;
        int i4 = cmb.E8;
        TLRPC.User f = z8c.h(i).f();
        a8 a8Var = new a8(0, this.d, this.e, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.setText(m9c.r(f));
        a8Var.setClipToPadding(false);
        a8Var.a.setPadding((a8Var.d && a8Var.e == null) ? 0 : gm.L(43.0f), 0, (a8Var.d || a8Var.e != null) ? gm.L(43.0f) : 0, 0);
        bf0 bf0Var = new bf0(context);
        bf0Var.getImageReceiver().d = i;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(f);
        bf0Var.setRoundRadius(gm.L(34.0f));
        bf0Var.f(f, pc0Var);
        bf0Var.setScaleX(z ? 0.84f : 1.0f);
        bf0Var.setScaleY(z ? 0.84f : 1.0f);
        a8Var.addView(bf0Var, qoe.d(34, 34.0f, (jb6.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        ylb ylbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = gm.L(34.0f);
            int i5 = cmb.Ei;
            rlb rlbVar = new rlb(gm.L(2.0f), cmb.v0(i5, ylbVar), L);
            view.setBackground(rlbVar);
            anb.x(view, rlbVar, i5, ylbVar, PorterDuff.Mode.SRC_IN);
            a8Var.addView(view, qoe.b(36.0f, 36.0f, (jb6.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num2 = this.m0;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(i3, i4);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, i3);
                }
                a8Var.setOnClickListener(new tt5(this, runnable, (byte) 1));
                i2 = this.V;
                if (i2 > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gm.L(i2));
                    q(a8Var, qoe.o(this.V, -2));
                    return;
                }
            }
            intValue = cmb.v0(i3, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(i4, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new tt5(this, runnable, (byte) 1));
        i2 = this.V;
        if (i2 > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(TLObject tLObject, boolean z, Runnable runnable) {
        int intValue;
        Integer num;
        int i;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i2 = cmb.D8;
        int i3 = cmb.E8;
        a8 a8Var = new a8(0, this.d, this.e, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            a8Var.setText(chat.title);
            a8Var.setSubtext(sd2.V(chat) ? jb6.M0(2131751327, null) : jb6.M0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            a8Var.setText(m9c.r(user));
            if (user.id == z8c.h(z8c.t0).e()) {
                a8Var.setSubtext(jb6.M0(2131743033, null));
            } else if (m9c.v(user)) {
                a8Var.setSubtext(jb6.M0(2131753121, null));
            }
        }
        a8Var.setClipToPadding(false);
        a8Var.a.setPadding((a8Var.d && a8Var.e == null) ? 0 : gm.L(43.0f), 0, (a8Var.d || a8Var.e != null) ? gm.L(43.0f) : 0, 0);
        bf0 bf0Var = new bf0(context);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        bf0Var.setRoundRadius(gm.L(34.0f));
        bf0Var.f(tLObject, pc0Var);
        bf0Var.setScaleX(z ? 0.84f : 1.0f);
        bf0Var.setScaleY(z ? 0.84f : 1.0f);
        a8Var.addView(bf0Var, qoe.d(34, 34.0f, (jb6.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        ylb ylbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = gm.L(34.0f);
            int i4 = cmb.Ei;
            rlb rlbVar = new rlb(gm.L(2.0f), cmb.v0(i4, ylbVar), L);
            view.setBackground(rlbVar);
            anb.x(view, rlbVar, i4, ylbVar, PorterDuff.Mode.SRC_IN);
            a8Var.addView(view, qoe.b(36.0f, 36.0f, (jb6.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num2 = this.m0;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(i2, i3);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, i2);
                }
                a8Var.setOnClickListener(new tt5(this, runnable, (byte) 2));
                i = this.V;
                if (i > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gm.L(i));
                    q(a8Var, qoe.o(this.V, -2));
                    return;
                }
            }
            intValue = cmb.v0(i2, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(i3, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new tt5(this, runnable, (byte) 2));
        i = this.V;
        if (i > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a8 g() {
        int intValue;
        Integer num;
        int i;
        int i2 = cmb.D8;
        int i3 = cmb.E8;
        a8 a8Var = new a8(1, this.d, this.e, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        Integer num2 = this.m0;
        ylb ylbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(i2, i3);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, i2);
                }
                i = this.V;
                if (i > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return a8Var;
                }
                a8Var.setMinimumWidth(gm.L(i));
                q(a8Var, qoe.o(this.V, -2));
                return a8Var;
            }
            intValue = cmb.v0(i2, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(i3, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        i = this.V;
        if (i > 0) {
        }
    }

    public final void h(Runnable runnable, String str, boolean z) {
        i(z, 0, null, str, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z, int i, hf9 hf9Var, String str, Runnable runnable) {
        int intValue;
        Integer num;
        int i2;
        if (this.e == null) {
            return;
        }
        int i3 = cmb.D8;
        int i4 = cmb.E8;
        a8 a8Var = new a8((i == 0 && hf9Var == null) ? 1 : 2, this.d, this.e, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        if (hf9Var != null) {
            a8Var.j(str, 0, hf9Var);
        } else if (i != 0) {
            a8Var.j(str, i, null);
        } else {
            a8Var.setText(str);
        }
        a8Var.setChecked(z);
        Integer num2 = this.m0;
        ylb ylbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(i3, i4);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, i3);
                }
                a8Var.setOnClickListener(new tt5(this, runnable, (byte) 5));
                i2 = this.V;
                if (i2 > 0) {
                    q(a8Var, qoe.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gm.L(i2));
                    q(a8Var, qoe.o(this.V, -2));
                    return;
                }
            }
            intValue = cmb.v0(i3, ylbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : cmb.v0(i4, ylbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new tt5(this, runnable, (byte) 5));
        i2 = this.V;
        if (i2 > 0) {
        }
    }

    public final void j() {
        j8 j8Var = new j8(this.e, this.d);
        j8Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.l0;
        if (num != null) {
            j8Var.setColor(num.intValue());
        }
        q(j8Var, qoe.o(-1, 8));
    }

    public final void k(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (z) {
            a(i, null, charSequence, cmb.E8, cmb.D8, runnable);
        }
    }

    public final void l(int i, Runnable runnable, String str, boolean z, boolean z2) {
        if (z) {
            b(i, str, runnable, z2);
        }
    }

    public final void m(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i = cmb.h6;
        ylb ylbVar = this.d;
        byte b = 0;
        fg0 Y = cmb.Y(cmb.v0(i, ylbVar), 0, 12);
        wmb M = anb.M(i);
        frameLayout.setBackground(Y);
        anb.j(frameLayout, Y, null, M, ylbVar);
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(17.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        bf0Var.f(tLObject, pc0Var);
        frameLayout.addView(bf0Var, qoe.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(m9c.r((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l = wi8.l(frameLayout, textView, qoe.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        anb.X(l, cmb.p5, ylbVar);
        l.setTextSize(1, 13.0f);
        l.setText(gm.E2(str, false, gm.L(1.0f), gm.L(0.66f)));
        frameLayout.addView(l, qoe.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new tt5(this, runnable, b));
        q(frameLayout, qoe.o(-1, 52));
    }

    public final void n(boolean z) {
        int i;
        int i2;
        boolean z2 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z2) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i3 = this.a0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(i3 > 0 ? i3 / gm.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, !z ? 4 : 0, this.d, context);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new st5(this, (byte) 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (z) {
            i = -8;
            i2 = 0;
        } else {
            i2 = -8;
            i = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, qoe.t(-1, -2, 48, i2, i, 0, 0));
    }

    public final void o(int i, int i2, CharSequence charSequence) {
        wb wbVar = new wb(this.e, (byte) 22);
        wbVar.setTextSize(1, i);
        anb.X(wbVar, cmb.i5, this.d);
        wbVar.setPadding(gm.L(13.0f), gm.L(8.0f), gm.L(13.0f), gm.L(8.0f));
        wbVar.setText(gw3.m(charSequence, wbVar.getPaint().getFontMetricsInt(), false, null, 0));
        wbVar.setTag(R.id.fit_width_tag, 1);
        wbVar.setTypeface(null);
        nm7.i(wbVar);
        if (i2 > 0) {
            wbVar.setMaxWidth(i2);
        }
        q(wbVar, qoe.o(-1, -2));
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        q(view, qoe.o(-1, -2));
    }

    public final void q(View view, LinearLayout.LayoutParams layoutParams) {
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

    public final void r() {
        this.q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r2.getItemsCount() - 1);
        if (childAt instanceof a8) {
            fn textView = ((a8) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hg5.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.q0) {
            this.q0 = false;
            return;
        }
        wt5 wt5Var = this.m;
        if (wt5Var != null) {
            wt5Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(ViewGroup viewGroup) {
        yt5 yt5Var = this.x;
        if (yt5Var == null) {
            return;
        }
        this.x = null;
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(yt5Var.x, 0.0f);
        this.p0 = ofFloat;
        ofFloat.addUpdateListener(new fh4(yt5Var, (byte) 16));
        this.p0.addListener(new i8(this, yt5Var, viewGroup, (byte) 8));
        boolean z = this.L;
        ValueAnimator valueAnimator2 = this.p0;
        if (z) {
            valueAnimator2.setDuration(380L);
            this.p0.setInterpolator(d53.h);
        } else {
            valueAnimator2.setDuration(150L);
        }
        this.p0.start();
    }

    public final View x(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
        }
        int i2 = 0;
        while (i2 < this.A.getChildCount() - 1) {
            View childAt = i2 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i);
                if (childAt2 != null) {
                    return childAt2;
                }
                i -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i2++;
        }
        return null;
    }

    public final int y() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i2 = 0;
        while (i < this.A.getChildCount() - 1) {
            View childAt = i == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i2;
            }
            i++;
        }
        return i2;
    }

    public final a8 z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof a8) {
                return (a8) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.M.getChildAt(r1.getItemsCount() - 1);
        if (childAt2 instanceof a8) {
            return (a8) childAt2;
        }
        return null;
    }

    public bu5(ViewGroup viewGroup, ylb ylbVar, View view, boolean z, boolean z2, boolean z3) {
        this.i = (byte) 5;
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
        this.d = ylbVar;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) gm.B(cmb.v0(cmb.c6, ylbVar))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.F = z2;
        this.G = z3;
        C();
    }

    public bu5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, ylb ylbVar) {
        this.i = (byte) 5;
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
        this.d = ylbVar;
    }
}
