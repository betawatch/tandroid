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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fu5 {
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
    public int P;
    public int Q;
    public ArrayList R;
    public ArrayList S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public short Z;
    public final ViewGroup a;
    public boolean a0;
    public ViewGroup b;
    public boolean b0;
    public final e c;
    public boolean c0;
    public final vnb d;
    public int d0;
    public final Context e;
    public boolean e0;
    public final View f;
    public boolean f0;
    public Drawable g;
    public float g0;
    public int h;
    public float h0;
    public byte i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public int k;
    public View k0;
    public int l;
    public cd l0;
    public zt5 m;
    public pk1 m0;
    public nz4 n;
    public final int[] n0;
    public final float[] o;
    public Integer o0;
    public Runnable p;
    public Integer p0;
    public float q;
    public Integer q0;
    public float r;
    public Integer r0;
    public short s;
    public ValueAnimator s0;
    public boolean t;
    public boolean t0;
    public boolean u;
    public b7 u0;
    public boolean v;
    public View v0;
    public boolean w;
    public final int[] w0;
    public bu5 x;
    public es1 y;
    public final Rect z;

    public fu5(e eVar, View view, boolean z, boolean z2) {
        wk5 parentLayout;
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        if (eVar.getContext() == null) {
            return;
        }
        if ((((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).J0) || (((eVar instanceof uj3) && ((uj3) eVar).X) || (((eVar instanceof ContactsActivity) && ((ContactsActivity) eVar).H) || ((eVar instanceof tba) && ((tba) eVar).O)))) && (parentLayout = eVar.getParentLayout()) != null) {
            e safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof fj6) {
                eVar = safeLastFragment;
            }
        }
        this.c = eVar;
        vnb resourceProvider = eVar.getResourceProvider();
        this.d = resourceProvider;
        this.e = eVar.getContext();
        this.f = view;
        this.s = ((double) hl.B(aob.v0(aob.d6, resourceProvider))) > 0.705d ? (short) 102 : (short) 51;
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

    public static fu5 G(ViewGroup viewGroup, vnb vnbVar, View view) {
        return new fu5(viewGroup, vnbVar, view, false, false, false);
    }

    public static fu5 H(ViewGroup viewGroup, vnb vnbVar, View view, boolean z) {
        return new fu5(viewGroup, vnbVar, view, z, false, false);
    }

    public static fu5 I(e eVar, View view) {
        return new fu5(eVar, view, false, true);
    }

    public static fu5 J(e eVar, View view) {
        return new fu5(eVar, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof k8) {
                    ((k8) childAt).setColor(i);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i);
                }
            }
        }
    }

    public static void e(fu5 fu5Var, q5b q5bVar, final HashSet hashSet, boolean z, Runnable runnable, final pcc pccVar) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = fu5Var.e;
        ti3 ti3Var = new ti3(context, (byte) 3);
        LinearLayout linearLayout = new LinearLayout(context);
        ti3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        fu5Var.q(ti3Var, tre.o(-1, -2));
        float f = 0.12f;
        float f2 = 18.0f;
        if (z && runnable != null) {
            b8 b8Var = new b8(2, fu5Var.d, fu5Var.e, false, false);
            b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
            int i = aob.E8;
            b8Var.c(i, aob.F8);
            b8Var.h(0.12f, i);
            b8Var.j(ob6.M0(2131744442, null), R.drawable.menu_album_add, null);
            b8Var.setOnClickListener(new el3(runnable, (byte) 3));
            linearLayout.addView(b8Var, tre.o(-1, -2));
        }
        ArrayList arrayList2 = q5bVar.h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final v5b v5bVar = (v5b) obj;
            final int i3 = v5bVar.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i3));
            float f3 = f2;
            b8 b8Var2 = new b8(2, fu5Var.d, fu5Var.e, false, false);
            b8Var2.setChecked(contains);
            b8Var2.setPadding(hl.L(f3), 0, hl.L(f3), 0);
            int i4 = aob.E8;
            b8Var2.c(i4, aob.F8);
            b8Var2.h(f, i4);
            TLRPC.Photo photo = v5bVar.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                b8Var2.j(v5bVar.b, R.drawable.msg_folders, null);
            } else {
                b8Var2.k(v5bVar.b, jn5.f(xb4.w(v5bVar.c.sizes, hl.L(24.0f), false, xb4.w(arrayList, 50, false, null, false), true), v5bVar.c), "50_50", null, null);
            }
            b8Var2.setOnClickListener(new View.OnClickListener() { // from class: xt5
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
                    pccVar.a(v5bVar);
                }
            });
            linearLayout.addView(b8Var2, tre.o(-1, -2));
            f2 = f3;
            f = 0.12f;
        }
    }

    public static void s(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof cu5) {
                arrayList.add(view);
            }
            if (view instanceof du5) {
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof k8)) {
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
        mc2 mc2Var = new mc2(this, this.e, this.d, (this.E ? 1 : 0) | (this.F ? 2 : 0) | (this.G ? 0 : 4));
        this.D = mc2Var;
        mc2Var.setDispatchKeyEventListener(new vt5(this, (byte) 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.k0 = view;
        view.getLocationOnScreen(this.n0);
        this.l0 = new cd(this, (byte) 2);
        this.k0.getViewTreeObserver().addOnScrollChangedListener(this.l0);
        pk1 pk1Var = new pk1(this, (byte) 3);
        this.m0 = pk1Var;
        this.k0.addOnLayoutChangeListener(pk1Var);
    }

    public final boolean E() {
        zt5 zt5Var = this.m;
        return zt5Var != null && zt5Var.isShowing();
    }

    public final void F() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r1.getItemsCount() - 1);
        if (childAt instanceof b8) {
            ((b8) childAt).setMultiline(false);
        }
    }

    public final fu5 K() {
        fu5 fu5Var = new fu5(this.D, this.d);
        fu5Var.C = this.D.b(fu5Var.B);
        return fu5Var;
    }

    public final void L(fu5 fu5Var) {
        this.t0 = true;
        this.D.getSwipeBack().e(fu5Var.C);
    }

    public final void M() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r3.getItemsCount() - 1);
        if (childAt instanceof b8) {
            b8 b8Var = (b8) childAt;
            b8Var.setRightIcon(R.drawable.msg_text_check);
            b8Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            b8Var.getRightIcon().setScaleX(0.85f);
            b8Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void N(Runnable runnable) {
        if (runnable == null || this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r0.getItemsCount() - 1);
        if (childAt instanceof b8) {
            b8 b8Var = (b8) childAt;
            b8Var.setRightIcon(R.drawable.msg_mini_lock3);
            b8Var.getRightIcon().setAlpha(0.4f);
            b8Var.setOnClickListener(new wt5(this, runnable, (byte) 2));
        }
    }

    public final void O() {
        View view = this.k0;
        if (view != null) {
            if (this.l0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.l0);
                }
            }
            pk1 pk1Var = this.m0;
            if (pk1Var != null) {
                this.k0.removeOnLayoutChangeListener(pk1Var);
            }
        }
        this.l0 = null;
        this.m0 = null;
        this.k0 = null;
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
        zt5 zt5Var = this.m;
        if (zt5Var == null || !zt5Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.o;
        B(view, viewGroup, fArr);
        float f2 = fArr[1];
        float f3 = fArr[0];
        if (this.i0) {
            viewGroup.getLocationOnScreen(new int[2]);
            f3 += r7[0];
            f2 += r7[1];
        }
        RectF rectF = new RectF();
        if (view instanceof eu5) {
            ((eu5) view).e(rectF);
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
        if (hl.O1()) {
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
        float height = this.e0 ? 0.0f : rectF.height();
        if (this.c0) {
            y = (int) (viewGroup.getY() + (Math.min(f5 + height, hl.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.a0 || f5 + height + this.A.getMeasuredHeight() + hl.L(16.0f) > hl.q.y - hl.n) {
                f5 = (f5 - height) - this.A.getMeasuredHeight();
                if (this.b0 && Math.max(0.0f, f5 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    f5 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                }
            }
            y = (int) (viewGroup.getY() + f5 + height);
        }
        float f6 = x + this.q;
        this.g0 = f6;
        float f7 = y + this.r;
        this.h0 = f7;
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

    public final void R(ll0 ll0Var, ol0 ol0Var, boolean z) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            jl0 c = ll0Var.c(viewGroup, null, z);
            c.p(ol0Var);
            c.q(hl.L(8.0f));
            c.S.e = true;
            c.r(hl.L(12.0f));
            viewGroup.setBackground(c);
        }
    }

    public final void S(tl0 tl0Var, float f, float f2) {
        Drawable e = c00.e(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new wl0(new xl0(tl0Var, viewGroup, 5, false), this.A.getX() + this.g0 + f, this.A.getY() + this.h0 + f2, e, hl.L(12.0f)));
            return;
        }
        for (int i = 0; i < this.A.getChildCount(); i++) {
            View childAt = this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new wl0(new xl0(tl0Var, childAt, 5, false), this.A.getX() + this.g0 + f + childAt.getX(), this.A.getY() + this.h0 + f2 + childAt.getY(), e, hl.L(12.0f)));
            }
        }
    }

    public final void T(int i, int i2) {
        this.p0 = Integer.valueOf(i);
        this.q0 = Integer.valueOf(i2);
        int i3 = 0;
        while (i3 < this.A.getChildCount()) {
            View childAt = i3 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i4);
                    if (childAt2 instanceof b8) {
                        ((b8) childAt2).d(i, i2);
                    }
                }
            } else if (childAt instanceof b8) {
                ((b8) childAt).d(i, i2);
            }
            i3++;
        }
    }

    public final void U(int i) {
        this.o0 = Integer.valueOf(i);
        if (this.A != null) {
            int i2 = 0;
            while (i2 < this.A.getChildCount()) {
                View childAt = i2 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i2);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                        if (childAt2 instanceof k8) {
                            ((k8) childAt2).setColor(i);
                        }
                    }
                } else if (childAt instanceof k8) {
                    ((k8) childAt).setColor(i);
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
        zt5 zt5Var = this.m;
        if (zt5Var != null) {
            zt5Var.update((int) this.g0, (int) (this.h0 + f), -1, -1);
        }
    }

    public final void Z() {
        if (this.A != null) {
            int i = 0;
            while (i < this.A.getChildCount()) {
                View childAt = i == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    oob oobVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = oobVar.getChildAt(0);
                        View childAt3 = oobVar.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z = childAt2 instanceof b8;
                        vnb vnbVar = this.d;
                        if (z) {
                            ((b8) childAt2).n(true, childAt2 == childAt3);
                        } else if ((childAt2 instanceof r57) || (childAt2 instanceof FrameLayout)) {
                            int i2 = aob.I5;
                            yob.R(childAt2, aob.Y(aob.v0(i2, vnbVar), 12, childAt2 == childAt3 ? 12 : 0), null, yob.M(i2), vnbVar);
                        } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                            int i3 = aob.I5;
                            hf0 Y = aob.Y(aob.v0(i3, vnbVar), 12, childAt2 == childAt3 ? 12 : 0);
                            uob M = yob.M(i3);
                            childAt2.setBackground(Y);
                            yob.j(childAt2, Y, null, M, vnbVar);
                        }
                        if (childAt3 instanceof b8) {
                            ((b8) childAt3).n(childAt3 == childAt2, true);
                        } else if ((childAt3 instanceof r57) || (childAt3 instanceof FrameLayout)) {
                            int i4 = aob.I5;
                            yob.R(childAt3, aob.Y(aob.v0(i4, vnbVar), childAt2 == childAt3 ? 12 : 0, 12), null, yob.M(i4), vnbVar);
                        } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                            int i5 = aob.I5;
                            hf0 Y2 = aob.Y(aob.v0(i5, vnbVar), childAt2 == childAt3 ? 12 : 0, 12);
                            uob M2 = yob.M(i5);
                            childAt3.setBackground(Y2);
                            yob.j(childAt3, Y2, null, M2, vnbVar);
                        }
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, Drawable drawable, CharSequence charSequence, String str, int i2, int i3, Runnable runnable) {
        int intValue;
        Integer num;
        int i4;
        if (this.e == null) {
            return;
        }
        b8 b8Var = new b8(0, this.d, this.e, false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        if (i == 0 && drawable == null) {
            b8Var.setText(charSequence);
        } else {
            b8Var.j(charSequence, i, drawable);
        }
        if (!TextUtils.isEmpty(str)) {
            b8Var.setSubtext(str);
        }
        Integer num2 = this.p0;
        vnb vnbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(i3, i2);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, i3);
                }
                b8Var.setOnClickListener(new wt5(this, runnable, (byte) 4));
                i4 = this.Y;
                if (i4 > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return;
                } else {
                    b8Var.setMinimumWidth(hl.L(i4));
                    q(b8Var, tre.o(this.Y, -2));
                    return;
                }
            }
            intValue = aob.v0(i3, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(i2, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        b8Var.setOnClickListener(new wt5(this, runnable, (byte) 4));
        i4 = this.Y;
        if (i4 > 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0440 A[ADDED_TO_REGION] */
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
        bu5 bu5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x;
        float f5;
        float width2;
        float f6;
        bu5 bu5Var2;
        if (this.m != null || this.B != null || y() <= 0) {
            return;
        }
        Z();
        if (this.Z > 0) {
            int i4 = 0;
            while (i4 < this.A.getChildCount() - 1) {
                View childAt = i4 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i4);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i5 = 0; i5 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i5++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i5).getLayoutParams().width = hl.L(this.Z);
                    }
                }
                i4++;
            }
        } else if (this.Y > 0) {
            int i6 = 0;
            while (i6 < this.A.getChildCount() - 1) {
                View childAt2 = i6 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i6);
                if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                    for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i7++) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.M.getChildAt(i7).setMinimumWidth(hl.L(this.Y));
                    }
                }
                i6++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new nz4();
        }
        ViewGroup viewGroup2 = this.a;
        e eVar = this.c;
        ViewGroup overlayContainerView = viewGroup2 == null ? eVar.getParentLayout().getOverlayContainerView() : viewGroup2;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = hl.q;
        float f7 = point.y / 2.0f;
        float[] fArr = this.o;
        View view = this.f;
        if (view != 0) {
            B(view, overlayContainerView, fArr);
            f7 = fArr[1];
            f2 = fArr[0];
            if (this.i0) {
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
        if (view instanceof eu5) {
            ((eu5) view).e(rectF);
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
        this.R = null;
        this.S = null;
        if (eVar != null && eVar.clipsScrimUnderOccluders() && overlayContainerView.getRootView() != null) {
            this.R = new ArrayList();
            this.S = new ArrayList();
            s(overlayContainerView.getRootView(), this.R, this.S);
        }
        byte b = 5;
        byte b2 = 3;
        if (this.s > 0 || this.u || this.v) {
            bu5 bu5Var3 = new bu5(this, context);
            this.x = bu5Var3;
            this.y = new es1(bu5Var3, b2);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, tre.c(-1.0f, -1));
            this.x.setProgress(0.0f);
            if (this.V) {
                if (view instanceof eu5) {
                    ((eu5) view).setScrimHidden(true);
                } else {
                    view.setVisibility(4);
                }
            }
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.s0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new ch4(this, (byte) 16));
            this.s0.addListener(new ad5(this, b));
            boolean z3 = this.L;
            ValueAnimator valueAnimator2 = this.s0;
            f3 = f8;
            if (z3) {
                valueAnimator2.setDuration(380L);
                this.s0.setInterpolator(k43.h);
            } else {
                valueAnimator2.setDuration(150L);
            }
            this.s0.start();
        } else {
            f3 = f8;
        }
        if (!this.L || (bu5Var2 = this.x) == null || this.N == 0) {
            f4 = f3;
        } else {
            bu5Var2.s = (overlayContainerView.getWidth() - this.N) / f;
            if (this.M == 3) {
                this.x.s = hl.L(36.0f);
            }
            f4 = (-fArr[i]) + this.x.s + f3;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        zt5 zt5Var = new zt5(this, this.A, overlayContainerView);
        this.m = zt5Var;
        zt5Var.setOnDismissListener(new cq(this, overlayContainerView, (byte) 1));
        this.m.setOutsideTouchable(true);
        this.m.setFocusable(!this.W);
        int i9 = i;
        this.m.setBackgroundDrawable(new ColorDrawable(i9));
        this.m.setAnimationStyle(R.style.PopupContextAnimation);
        if (this.f0) {
            this.m.setInputMethodMode(2);
            this.m.setSoftInputMode(i9);
        } else if (this.W) {
            this.m.setInputMethodMode(1);
            this.m.setSoftInputMode(32);
        } else {
            boolean z4 = this.X;
            zt5 zt5Var2 = this.m;
            if (z4) {
                zt5Var2.setInputMethodMode(1);
                this.m.setSoftInputMode(32);
            } else {
                zt5Var2.setInputMethodMode(2);
                this.m.setSoftInputMode(0);
            }
        }
        if (hl.O1()) {
            f9 += overlayContainerView.getPaddingTop();
            f4 -= overlayContainerView.getPaddingLeft();
        }
        if (view != 0) {
            byte b3 = this.i;
            if (b3 == 3) {
                width = (int) (overlayContainerView.getX() + f4);
            } else {
                if (b3 == 5) {
                    width2 = rectF.width() + overlayContainerView.getX() + f4;
                    f6 = rectF2.right;
                } else {
                    if (b3 == 1) {
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
        if (this.f0) {
            i3 = 0;
        } else {
            Rect rect = new Rect();
            View rootView = overlayContainerView.getRootView();
            overlayContainerView.getWindowVisibleDisplayFrame(rect);
            i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? hl.m : 0)) - hl.o1(rootView)) - (rect.bottom - rect.top));
        }
        int i10 = (point.y - hl.n) - i3;
        float height2 = this.e0 ? 0.0f : rectF.height();
        if (this.c0) {
            float f10 = f9 + height2;
            height = this.L ? (int) f10 : (int) (overlayContainerView.getY() + (Math.min(f10, i10) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.a0 || f9 + height2 + this.A.getMeasuredHeight() + hl.L(16.0f) > i10) {
                f9 = (f9 - height2) - this.A.getMeasuredHeight();
                if (!this.b0 || Math.max(0.0f, f9 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z = true;
                    z2 = z;
                    height = (int) (overlayContainerView.getY() + f9 + height2);
                    if (this.E && z2 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (bu5Var = this.x) != null) {
                        float f11 = rectF.bottom;
                        float f12 = this.U;
                        float f13 = f11 * f12;
                        float f14 = ((f12 + 1.0f) * rectF.right) / f;
                        bu5Var.w = ((((overlayContainerView.getHeight() - this.P) - this.Q) - (this.A.getMeasuredHeight() + f13)) / f) + this.P;
                        bu5 bu5Var4 = this.x;
                        int i11 = (int) (bu5Var4.w + f13);
                        int measuredWidth = (int) (((bu5Var4.s + f14) - this.A.getMeasuredWidth()) + hl.L(4.0f));
                        if (this.M == 3) {
                            measuredWidth = (int) (this.x.s - hl.L(8.0f));
                        }
                        int i12 = measuredWidth;
                        height = i11;
                        width = i12;
                    }
                    if (!this.w) {
                        if (eVar != null && eVar.getFragmentView() != null) {
                            eVar.getFragmentView().getRootView().dispatchTouchEvent(hl.R());
                        } else if (viewGroup2 != null) {
                            overlayContainerView.dispatchTouchEvent(hl.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i13 = aob.E8;
                        vnb vnbVar = this.d;
                        U(aob.p1(0.06f, aob.v0(i13, vnbVar)));
                        uob K = yob.K(0.06f, i13);
                        if (this.A != null) {
                            int i14 = 0;
                            while (i14 < this.A.getChildCount()) {
                                View childAt3 = i14 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i14);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i15++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.M.getChildAt(i15);
                                        if (childAt4 instanceof k8) {
                                            yob.i(childAt4, K, vnbVar);
                                        }
                                    }
                                } else if (childAt3 instanceof k8) {
                                    yob.i(childAt3, K, vnbVar);
                                }
                                i14++;
                            }
                        }
                        nz4 nz4Var = this.n;
                        jl0 c = new ll0(nz4Var, nz4Var, nz4Var).c(this.A, null, true);
                        c.p(dtd.k(vnbVar));
                        c.q(hl.L(8.0f));
                        c.S.e = true;
                        c.r(hl.L(12.0f));
                        float f15 = width;
                        float f16 = height;
                        c.i(this.q + f15, this.r + f16);
                        viewGroup = this.A;
                        if (viewGroup == this.D && (viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getChildCount() > 1) {
                            final float f17 = f15 + this.q;
                            final float f18 = f16 + this.r;
                            for (int i16 = 0; i16 < this.A.getChildCount(); i16++) {
                                View childAt5 = this.A.getChildAt(i16);
                                if (childAt5 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    nz4 nz4Var2 = this.n;
                                    final jl0 c2 = new ll0(nz4Var2, nz4Var2, nz4Var2).c(childAt5, null, true);
                                    c2.p(dtd.k(vnbVar));
                                    c2.q(hl.L(8.0f));
                                    c2.S.e = true;
                                    c2.r(hl.L(12.0f));
                                    c2.i(childAt5.getLeft() + f17, childAt5.getTop() + f18);
                                    childAt5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: yt5
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
                                            jl0.this.i(f17 + i17, f18 + i18);
                                        }
                                    });
                                    childAt5.setBackground(c2);
                                }
                            }
                        } else {
                            this.A.setBackground(c);
                        }
                    }
                    zt5 zt5Var3 = this.m;
                    zt5Var3.g = this.I;
                    float f19 = width + this.q;
                    this.g0 = f19;
                    float f20 = height + this.r;
                    this.h0 = f20;
                    zt5Var3.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
                    if (this.w && view != 0) {
                        if (view.getParent() != null) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        b7 b7Var = new b7(new WeakReference(this), (byte) 7);
                        this.u0 = b7Var;
                        view.setOnTouchListener(b7Var);
                    }
                    if (this.j0) {
                        D();
                        return;
                    }
                    return;
                }
                f9 = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f) - height2) - overlayContainerView.getY();
            }
            z = false;
            z2 = z;
            height = (int) (overlayContainerView.getY() + f9 + height2);
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float f112 = rectF.bottom;
                float f122 = this.U;
                float f132 = f112 * f122;
                float f142 = ((f122 + 1.0f) * rectF.right) / f;
                bu5Var.w = ((((overlayContainerView.getHeight() - this.P) - this.Q) - (this.A.getMeasuredHeight() + f132)) / f) + this.P;
                bu5 bu5Var42 = this.x;
                int i112 = (int) (bu5Var42.w + f132);
                int measuredWidth2 = (int) (((bu5Var42.s + f142) - this.A.getMeasuredWidth()) + hl.L(4.0f));
                if (this.M == 3) {
                }
                int i122 = measuredWidth2;
                height = i112;
                width = i122;
            }
            if (!this.w) {
            }
            if (this.v) {
                int i132 = aob.E8;
                vnb vnbVar2 = this.d;
                U(aob.p1(0.06f, aob.v0(i132, vnbVar2)));
                uob K2 = yob.K(0.06f, i132);
                if (this.A != null) {
                }
                nz4 nz4Var3 = this.n;
                jl0 c3 = new ll0(nz4Var3, nz4Var3, nz4Var3).c(this.A, null, true);
                c3.p(dtd.k(vnbVar2));
                c3.q(hl.L(8.0f));
                c3.S.e = true;
                c3.r(hl.L(12.0f));
                float f152 = width;
                float f162 = height;
                c3.i(this.q + f152, this.r + f162);
                viewGroup = this.A;
                if (viewGroup == this.D) {
                }
                this.A.setBackground(c3);
            }
            zt5 zt5Var32 = this.m;
            zt5Var32.g = this.I;
            float f192 = width + this.q;
            this.g0 = f192;
            float f202 = height + this.r;
            this.h0 = f202;
            zt5Var32.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
            if (this.w) {
                if (view.getParent() != null) {
                }
                b7 b7Var2 = new b7(new WeakReference(this), (byte) 7);
                this.u0 = b7Var2;
                view.setOnTouchListener(b7Var2);
            }
            if (this.j0) {
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
        zt5 zt5Var322 = this.m;
        zt5Var322.g = this.I;
        float f1922 = width + this.q;
        this.g0 = f1922;
        float f2022 = height + this.r;
        this.h0 = f2022;
        zt5Var322.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
        if (this.w) {
        }
        if (this.j0) {
        }
    }

    public final void b(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = aob.p7;
            i3 = i2;
        } else {
            i2 = aob.F8;
            i3 = aob.E8;
        }
        a(i, null, charSequence, null, i2, i3, runnable);
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
    public final void c(b8 b8Var) {
        int intValue;
        Integer num;
        int i;
        hl.B2(b8Var);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        Integer num2 = this.p0;
        vnb vnbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(aob.E8, aob.F8);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, aob.E8);
                }
                i = this.Y;
                if (i > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return;
                } else {
                    b8Var.setMinimumWidth(hl.L(i));
                    q(b8Var, tre.o(this.Y, -2));
                    return;
                }
            }
            intValue = aob.v0(aob.E8, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(aob.F8, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        i = this.Y;
        if (i > 0) {
        }
    }

    public final void c0(int i, int i2) {
        View w = w(this.A, i, i2);
        View view = this.v0;
        if (w != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.v0 = w;
            if (w != null) {
                w.setPressed(true);
            }
        }
        View view2 = this.v0;
        if (view2 != null) {
            view2.getLocationOnScreen(this.w0);
            this.v0.drawableHotspotChanged(i - r1[0], i2 - r1[1]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
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
        int i3 = aob.E8;
        int i4 = aob.F8;
        TLRPC.User f = yac.h(i).f();
        b8 b8Var = new b8(0, this.d, this.e, false, false);
        byte b = 0;
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.setText(lbc.r(f));
        b8Var.setClipToPadding(false);
        b8Var.a.setPadding((b8Var.d && b8Var.e == null) ? 0 : hl.L(43.0f), 0, (b8Var.d || b8Var.e != null) ? hl.L(43.0f) : 0, 0);
        de0 de0Var = new de0(context);
        de0Var.getImageReceiver().d = i;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(f);
        de0Var.setRoundRadius(hl.L(34.0f));
        de0Var.f(f, rb0Var);
        de0Var.setScaleX(z ? 0.84f : 1.0f);
        de0Var.setScaleY(z ? 0.84f : 1.0f);
        b8Var.addView(de0Var, tre.d(34, 34.0f, (ob6.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        vnb vnbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = hl.L(34.0f);
            int i5 = aob.Fi;
            onb onbVar = new onb(hl.L(2.0f), aob.v0(i5, vnbVar), L);
            view.setBackground(onbVar);
            yob.x(view, onbVar, i5, vnbVar, PorterDuff.Mode.SRC_IN);
            b8Var.addView(view, tre.b(36.0f, 36.0f, (ob6.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num2 = this.p0;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(i3, i4);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, i3);
                }
                b8Var.setOnClickListener(new wt5(this, runnable, b));
                i2 = this.Y;
                if (i2 > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return;
                } else {
                    b8Var.setMinimumWidth(hl.L(i2));
                    q(b8Var, tre.o(this.Y, -2));
                    return;
                }
            }
            intValue = aob.v0(i3, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(i4, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        b8Var.setOnClickListener(new wt5(this, runnable, b));
        i2 = this.Y;
        if (i2 > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
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
        int i2 = aob.E8;
        int i3 = aob.F8;
        b8 b8Var = new b8(0, this.d, this.e, false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            b8Var.setText(chat.title);
            b8Var.setSubtext(xc2.V(chat) ? ob6.M0(2131751355, null) : ob6.M0(2131754872, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            b8Var.setText(lbc.r(user));
            if (user.id == yac.h(yac.t0).e()) {
                b8Var.setSubtext(ob6.M0(2131743001, null));
            } else if (lbc.v(user)) {
                b8Var.setSubtext(ob6.M0(2131753149, null));
            }
        }
        b8Var.setClipToPadding(false);
        b8Var.a.setPadding((b8Var.d && b8Var.e == null) ? 0 : hl.L(43.0f), 0, (b8Var.d || b8Var.e != null) ? hl.L(43.0f) : 0, 0);
        de0 de0Var = new de0(context);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        de0Var.setRoundRadius(hl.L(34.0f));
        de0Var.f(tLObject, rb0Var);
        de0Var.setScaleX(z ? 0.84f : 1.0f);
        de0Var.setScaleY(z ? 0.84f : 1.0f);
        byte b = 3;
        b8Var.addView(de0Var, tre.d(34, 34.0f, (ob6.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        vnb vnbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = hl.L(34.0f);
            int i4 = aob.Fi;
            onb onbVar = new onb(hl.L(2.0f), aob.v0(i4, vnbVar), L);
            view.setBackground(onbVar);
            yob.x(view, onbVar, i4, vnbVar, PorterDuff.Mode.SRC_IN);
            b8Var.addView(view, tre.b(36.0f, 36.0f, (ob6.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num2 = this.p0;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(i2, i3);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, i2);
                }
                b8Var.setOnClickListener(new wt5(this, runnable, b));
                i = this.Y;
                if (i > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return;
                } else {
                    b8Var.setMinimumWidth(hl.L(i));
                    q(b8Var, tre.o(this.Y, -2));
                    return;
                }
            }
            intValue = aob.v0(i2, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(i3, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        b8Var.setOnClickListener(new wt5(this, runnable, b));
        i = this.Y;
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
    public final b8 g() {
        int intValue;
        Integer num;
        int i;
        int i2 = aob.E8;
        int i3 = aob.F8;
        b8 b8Var = new b8(1, this.d, this.e, false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        Integer num2 = this.p0;
        vnb vnbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(i2, i3);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, i2);
                }
                i = this.Y;
                if (i > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return b8Var;
                }
                b8Var.setMinimumWidth(hl.L(i));
                q(b8Var, tre.o(this.Y, -2));
                return b8Var;
            }
            intValue = aob.v0(i2, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(i3, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        i = this.Y;
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
    public final void i(boolean z, int i, wg9 wg9Var, String str, Runnable runnable) {
        int intValue;
        Integer num;
        int i2;
        if (this.e == null) {
            return;
        }
        int i3 = aob.E8;
        int i4 = aob.F8;
        b8 b8Var = new b8((i == 0 && wg9Var == null) ? 1 : 2, this.d, this.e, false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        if (wg9Var != null) {
            b8Var.j(str, 0, wg9Var);
        } else if (i != 0) {
            b8Var.j(str, i, null);
        } else {
            b8Var.setText(str);
        }
        b8Var.setChecked(z);
        Integer num2 = this.p0;
        vnb vnbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.q0 == null) {
                b8Var.c(i3, i4);
                num = this.r0;
                if (num == null) {
                    b8Var.setSelectorColor(num.intValue());
                } else {
                    b8Var.h(0.12f, i3);
                }
                b8Var.setOnClickListener(new wt5(this, runnable, (byte) 5));
                i2 = this.Y;
                if (i2 > 0) {
                    q(b8Var, tre.o(-1, -2));
                    return;
                } else {
                    b8Var.setMinimumWidth(hl.L(i2));
                    q(b8Var, tre.o(this.Y, -2));
                    return;
                }
            }
            intValue = aob.v0(i3, vnbVar);
        }
        Integer num3 = this.q0;
        b8Var.d(intValue, num3 != null ? num3.intValue() : aob.v0(i4, vnbVar));
        num = this.r0;
        if (num == null) {
        }
        b8Var.setOnClickListener(new wt5(this, runnable, (byte) 5));
        i2 = this.Y;
        if (i2 > 0) {
        }
    }

    public final void j() {
        k8 k8Var = new k8(this.e, this.d);
        k8Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.o0;
        if (num != null) {
            k8Var.setColor(num.intValue());
        }
        q(k8Var, tre.o(-1, 8));
    }

    public final void k(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (z) {
            a(i, null, charSequence, null, aob.F8, aob.E8, runnable);
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
        int i = aob.i6;
        vnb vnbVar = this.d;
        hf0 Y = aob.Y(aob.v0(i, vnbVar), 0, 12);
        uob M = yob.M(i);
        frameLayout.setBackground(Y);
        yob.j(frameLayout, Y, null, M, vnbVar);
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(17.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        de0Var.f(tLObject, rb0Var);
        frameLayout.addView(de0Var, tre.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yob.X(textView, aob.j5, vnbVar);
        byte b = 1;
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(lbc.r((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l = ik8.l(frameLayout, textView, tre.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        yob.X(l, aob.q5, vnbVar);
        l.setTextSize(1, 13.0f);
        l.setText(hl.E2(str, false, hl.L(1.0f), hl.L(0.66f)));
        frameLayout.addView(l, tre.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new wt5(this, runnable, b));
        q(frameLayout, tre.o(-1, 52));
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
            int i3 = this.d0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(i3 > 0 ? i3 / hl.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, !z ? 4 : 0, this.d, context);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vt5(this, (byte) 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (z) {
            i = -8;
            i2 = 0;
        } else {
            i2 = -8;
            i = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, tre.t(-1, -2, 48, i2, i, 0, 0));
    }

    public final void o(int i, int i2, CharSequence charSequence) {
        xb xbVar = new xb(this.e, (byte) 22);
        xbVar.setTextSize(1, i);
        yob.X(xbVar, aob.j5, this.d);
        xbVar.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        xbVar.setText(pv3.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(R.id.fit_width_tag, 1);
        xbVar.setTypeface(null);
        jn7.i(xbVar);
        if (i2 > 0) {
            xbVar.setMaxWidth(i2);
        }
        q(xbVar, tre.o(-1, -2));
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        q(view, tre.o(-1, -2));
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
        this.t0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        View childAt = this.D.M.getChildAt(r2.getItemsCount() - 1);
        if (childAt instanceof b8) {
            gm textView = ((b8) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + kg5.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.t0) {
            this.t0 = false;
            return;
        }
        zt5 zt5Var = this.m;
        if (zt5Var != null) {
            zt5Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(ViewGroup viewGroup) {
        bu5 bu5Var = this.x;
        if (bu5Var == null) {
            return;
        }
        this.x = null;
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(bu5Var.x, 0.0f);
        this.s0 = ofFloat;
        ofFloat.addUpdateListener(new ch4(bu5Var, (byte) 15));
        this.s0.addListener(new j8(this, bu5Var, viewGroup, (byte) 8));
        boolean z = this.L;
        ValueAnimator valueAnimator2 = this.s0;
        if (z) {
            valueAnimator2.setDuration(380L);
            this.s0.setInterpolator(k43.h);
        } else {
            valueAnimator2.setDuration(150L);
        }
        this.s0.start();
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

    public final b8 z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof b8) {
                return (b8) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View childAt2 = this.D.M.getChildAt(r1.getItemsCount() - 1);
        if (childAt2 instanceof b8) {
            return (b8) childAt2;
        }
        return null;
    }

    public fu5(ViewGroup viewGroup, vnb vnbVar, View view, boolean z, boolean z2, boolean z3) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.a = viewGroup;
        this.d = vnbVar;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) hl.B(aob.v0(aob.d6, vnbVar))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.F = z2;
        this.G = z3;
        C();
    }

    public fu5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, vnb vnbVar) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = vnbVar;
    }
}
