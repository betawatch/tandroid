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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cs5 {
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
    public final wjb d;
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
    public bd i0;
    public boolean j;
    public gk1 j0;
    public int k;
    public final int[] k0;
    public int l;
    public Integer l0;
    public xr5 m;
    public Integer m0;
    public hx4 n;
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
    public zr5 x;
    public qr1 y;
    public final Rect z;

    public cs5(d dVar, View view, boolean z, boolean z2) {
        ui5 parentLayout;
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
        if ((((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).J0) || (((dVar instanceof cj3) && ((cj3) dVar).X) || (((dVar instanceof ContactsActivity) && ((ContactsActivity) dVar).H) || ((dVar instanceof d8a) && ((d8a) dVar).O)))) && (parentLayout = dVar.getParentLayout()) != null) {
            d safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof ah6) {
                dVar = safeLastFragment;
            }
        }
        this.c = dVar;
        wjb resourceProvider = dVar.getResourceProvider();
        this.d = resourceProvider;
        this.e = dVar.getContext();
        this.f = view;
        this.s = ((double) gl.B(bkb.v0(bkb.c6, resourceProvider))) > 0.705d ? (short) 102 : (short) 51;
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

    public static cs5 G(ViewGroup viewGroup, wjb wjbVar, View view) {
        return new cs5(viewGroup, wjbVar, view, false, false, false);
    }

    public static cs5 H(ViewGroup viewGroup, wjb wjbVar, View view, boolean z) {
        return new cs5(viewGroup, wjbVar, view, z, false, false);
    }

    public static cs5 I(d dVar, View view) {
        return new cs5(dVar, view, false, true);
    }

    public static cs5 J(d dVar, View view) {
        return new cs5(dVar, view, true, true);
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

    public static void e(cs5 cs5Var, u1b u1bVar, final HashSet hashSet, boolean z, Runnable runnable, final p8c p8cVar) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = cs5Var.e;
        zh3 zh3Var = new zh3(context, (byte) 3);
        LinearLayout linearLayout = new LinearLayout(context);
        zh3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        cs5Var.q(zh3Var, nme.o(-1, -2));
        float f = 0.12f;
        float f2 = 18.0f;
        if (z && runnable != null) {
            a8 a8Var = new a8(2, cs5Var.d, cs5Var.e, false, false);
            a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
            int i = bkb.D8;
            a8Var.c(i, bkb.E8);
            a8Var.h(0.12f, i);
            a8Var.j(k96.M0(2131744548, null), R.drawable.menu_album_add, null);
            a8Var.setOnClickListener(new nk3(runnable, (byte) 3));
            linearLayout.addView(a8Var, nme.o(-1, -2));
        }
        ArrayList arrayList2 = u1bVar.h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final z1b z1bVar = (z1b) obj;
            final int i3 = z1bVar.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i3));
            float f3 = f2;
            a8 a8Var2 = new a8(2, cs5Var.d, cs5Var.e, false, false);
            a8Var2.setChecked(contains);
            a8Var2.setPadding(gl.L(f3), 0, gl.L(f3), 0);
            int i4 = bkb.D8;
            a8Var2.c(i4, bkb.E8);
            a8Var2.h(f, i4);
            TLRPC.Photo photo = z1bVar.c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                a8Var2.j(z1bVar.b, R.drawable.msg_folders, null);
            } else {
                a8Var2.k(z1bVar.b, gl5.f(ba4.w(z1bVar.c.sizes, gl.L(24.0f), false, ba4.w(arrayList, 50, false, null, false), true), z1bVar.c), "50_50", null, null);
            }
            a8Var2.setOnClickListener(new View.OnClickListener() { // from class: vr5
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
                    p8cVar.a(z1bVar);
                }
            });
            linearLayout.addView(a8Var2, nme.o(-1, -2));
            f2 = f3;
            f = 0.12f;
        }
    }

    public static void s(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof as5) {
                arrayList.add(view);
            }
            if (view instanceof xg6) {
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
        wb2 wb2Var = new wb2(this, this.e, this.d, (this.E ? 1 : 0) | (this.F ? 2 : 0) | (this.G ? 0 : 4));
        this.D = wb2Var;
        wb2Var.setDispatchKeyEventListener(new tr5(this, (byte) 0));
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
        this.i0 = new bd(this, (byte) 2);
        this.h0.getViewTreeObserver().addOnScrollChangedListener(this.i0);
        gk1 gk1Var = new gk1(this, (byte) 3);
        this.j0 = gk1Var;
        this.h0.addOnLayoutChangeListener(gk1Var);
    }

    public final boolean E() {
        xr5 xr5Var = this.m;
        return xr5Var != null && xr5Var.isShowing();
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

    public final cs5 K() {
        cs5 cs5Var = new cs5(this.D, this.d);
        cs5Var.C = this.D.b(cs5Var.B);
        return cs5Var;
    }

    public final void L(cs5 cs5Var) {
        this.q0 = true;
        this.D.getSwipeBack().e(cs5Var.C);
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
            a8Var.setOnClickListener(new ur5(this, runnable, (byte) 3));
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
            gk1 gk1Var = this.j0;
            if (gk1Var != null) {
                this.h0.removeOnLayoutChangeListener(gk1Var);
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
        xr5 xr5Var = this.m;
        if (xr5Var == null || !xr5Var.isShowing() || (view = this.f) == 0 || (viewGroup = this.b) == null || this.A == null || this.D == null) {
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
        if (view instanceof bs5) {
            ((bs5) view).e(rectF);
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
        if (gl.O1()) {
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
            y = (int) (viewGroup.getY() + (Math.min(f5 + height, gl.q.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.X || f5 + height + this.A.getMeasuredHeight() + gl.L(16.0f) > gl.q.y - gl.n) {
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

    public final void R(kl0 kl0Var, nl0 nl0Var, boolean z) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            il0 c = kl0Var.c(viewGroup, null, z);
            c.p(nl0Var);
            c.q(gl.L(8.0f));
            c.S.e = true;
            c.r(gl.L(12.0f));
            viewGroup.setBackground(c);
        }
    }

    public final void S(sl0 sl0Var, float f, float f2) {
        Drawable d = b00.d(this.e, R.drawable.popup_fixed_alert4);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new vl0(new wl0(sl0Var, viewGroup, 5, false), this.A.getX() + this.d0 + f, this.A.getY() + this.e0 + f2, d, gl.L(12.0f)));
            return;
        }
        for (int i = 0; i < this.A.getChildCount(); i++) {
            View childAt = this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new vl0(new wl0(sl0Var, childAt, 5, false), this.A.getX() + this.d0 + f + childAt.getX(), this.A.getY() + this.e0 + f2 + childAt.getY(), d, gl.L(12.0f)));
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
        xr5 xr5Var = this.m;
        if (xr5Var != null) {
            xr5Var.update((int) this.d0, (int) (this.e0 + f), -1, -1);
        }
    }

    public final void Z() {
        if (this.A != null) {
            int i = 0;
            while (i < this.A.getChildCount()) {
                View childAt = i == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    pkb pkbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = pkbVar.getChildAt(0);
                        View childAt3 = pkbVar.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z = childAt2 instanceof a8;
                        wjb wjbVar = this.d;
                        if (z) {
                            ((a8) childAt2).n(true, childAt2 == childAt3);
                        } else if ((childAt2 instanceof k37) || (childAt2 instanceof FrameLayout)) {
                            int i2 = bkb.H5;
                            zkb.R(childAt2, bkb.Y(bkb.v0(i2, wjbVar), 12, childAt2 == childAt3 ? 12 : 0), null, zkb.M(i2), wjbVar);
                        } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                            int i3 = bkb.H5;
                            ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 12, childAt2 == childAt3 ? 12 : 0);
                            vkb M = zkb.M(i3);
                            childAt2.setBackground(Y);
                            zkb.j(childAt2, Y, null, M, wjbVar);
                        }
                        if (childAt3 instanceof a8) {
                            ((a8) childAt3).n(childAt3 == childAt2, true);
                        } else if ((childAt3 instanceof k37) || (childAt3 instanceof FrameLayout)) {
                            int i4 = bkb.H5;
                            zkb.R(childAt3, bkb.Y(bkb.v0(i4, wjbVar), childAt2 == childAt3 ? 12 : 0, 12), null, zkb.M(i4), wjbVar);
                        } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                            int i5 = bkb.H5;
                            ff0 Y2 = bkb.Y(bkb.v0(i5, wjbVar), childAt2 == childAt3 ? 12 : 0, 12);
                            vkb M2 = zkb.M(i5);
                            childAt3.setBackground(Y2);
                            zkb.j(childAt3, Y2, null, M2, wjbVar);
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
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        if (i == 0 && drawable == null) {
            a8Var.setText(charSequence);
        } else {
            a8Var.j(charSequence, i, drawable);
        }
        Integer num2 = this.m0;
        wjb wjbVar = this.d;
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
                a8Var.setOnClickListener(new ur5(this, runnable, (byte) 4));
                i4 = this.V;
                if (i4 > 0) {
                    q(a8Var, nme.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gl.L(i4));
                    q(a8Var, nme.o(this.V, -2));
                    return;
                }
            }
            intValue = bkb.v0(i3, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(i2, wjbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new ur5(this, runnable, (byte) 4));
        i4 = this.V;
        if (i4 > 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x061c  */
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
        zr5 zr5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x;
        float f5;
        float width2;
        float f6;
        zr5 zr5Var2;
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i5).getLayoutParams().width = gl.L(this.W);
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.M.getChildAt(i7).setMinimumWidth(gl.L(this.V));
                    }
                }
                i6++;
            }
        }
        if ((this.u || this.v) && this.n == null) {
            this.n = new hx4();
        }
        ViewGroup viewGroup2 = this.a;
        d dVar = this.c;
        ViewGroup overlayContainerView = viewGroup2 == null ? dVar.getParentLayout().getOverlayContainerView() : viewGroup2;
        this.b = overlayContainerView;
        Context context = this.e;
        if (context == null || overlayContainerView == null) {
            return;
        }
        Point point = gl.q;
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
        if (view instanceof bs5) {
            ((bs5) view).e(rectF);
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
        byte b = 3;
        if (this.s > 0 || this.u || this.v) {
            zr5 zr5Var3 = new zr5(this, context);
            this.x = zr5Var3;
            this.y = new qr1(zr5Var3, b);
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.y);
            overlayContainerView.addView(this.x, nme.c(-1.0f, -1));
            this.x.setProgress(0.0f);
            if (this.S) {
                if (view instanceof bs5) {
                    ((bs5) view).setScrimHidden(true);
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
            ofFloat.addUpdateListener(new ni4(this, (byte) 13));
            this.p0.addListener(new v85(this, (byte) 6));
            boolean z3 = this.L;
            ValueAnimator valueAnimator2 = this.p0;
            f3 = f8;
            if (z3) {
                valueAnimator2.setDuration(380L);
                this.p0.setInterpolator(s33.h);
            } else {
                valueAnimator2.setDuration(150L);
            }
            this.p0.start();
        } else {
            f3 = f8;
        }
        if (!this.L || (zr5Var2 = this.x) == null || this.N == 0) {
            f4 = f3;
        } else {
            zr5Var2.s = (overlayContainerView.getWidth() - this.N) / f;
            if (this.M == 3) {
                this.x.s = gl.L(36.0f);
            }
            f4 = (-fArr[i]) + this.x.s + f3;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), TLObject.FLAG_31));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        xr5 xr5Var = new xr5(this, this.A, overlayContainerView);
        this.m = xr5Var;
        xr5Var.setOnDismissListener(new bq(this, overlayContainerView, (byte) 1));
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
            xr5 xr5Var2 = this.m;
            if (z4) {
                xr5Var2.setInputMethodMode(1);
                this.m.setSoftInputMode(32);
            } else {
                xr5Var2.setInputMethodMode(2);
                this.m.setSoftInputMode(0);
            }
        }
        if (gl.O1()) {
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
            i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? gl.m : 0)) - gl.o1(rootView)) - (rect.bottom - rect.top));
        }
        int i11 = (point.y - gl.n) - i3;
        float height2 = this.b0 ? 0.0f : rectF.height();
        if (this.Z) {
            float f10 = f9 + height2;
            height = this.L ? (int) f10 : (int) (overlayContainerView.getY() + (Math.min(f10, i11) - this.A.getMeasuredHeight()));
        } else if (view != 0) {
            if (this.X || f9 + height2 + this.A.getMeasuredHeight() + gl.L(16.0f) > i11) {
                f9 = (f9 - height2) - this.A.getMeasuredHeight();
                if (!this.Y || Math.max(0.0f, f9 + height2) + this.A.getMeasuredHeight() <= fArr[1] + rectF.top || rectF.height() != view.getHeight()) {
                    z = true;
                    height = (int) (overlayContainerView.getY() + f9 + height2);
                    z2 = z;
                    if (this.E && z2 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                    }
                    if (this.L && (zr5Var = this.x) != null) {
                        float f11 = rectF.bottom;
                        float f12 = this.R;
                        float f13 = f11 * f12;
                        float f14 = ((f12 + 1.0f) * rectF.right) / f;
                        zr5Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f13)) / f) + 0.0f;
                        zr5 zr5Var4 = this.x;
                        int i12 = (int) (zr5Var4.w + f13);
                        int measuredWidth = (int) (((zr5Var4.s + f14) - this.A.getMeasuredWidth()) + gl.L(4.0f));
                        if (this.M == 3) {
                            measuredWidth = (int) (this.x.s - gl.L(8.0f));
                        }
                        height = i12;
                        i10 = measuredWidth;
                    }
                    if (!this.w) {
                        if (dVar != null && dVar.getFragmentView() != null) {
                            dVar.getFragmentView().getRootView().dispatchTouchEvent(gl.R());
                        } else if (viewGroup2 != null) {
                            overlayContainerView.dispatchTouchEvent(gl.R());
                        }
                    }
                    if (this.v && this.n != null) {
                        int i13 = bkb.D8;
                        wjb wjbVar = this.d;
                        U(bkb.p1(0.06f, bkb.v0(i13, wjbVar)));
                        vkb K = zkb.K(0.06f, i13);
                        if (this.A != null) {
                            int i14 = 0;
                            while (i14 < this.A.getChildCount()) {
                                View childAt3 = i14 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i14);
                                if (childAt3 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt3;
                                    for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout4.getItemsCount(); i15++) {
                                        View childAt4 = actionBarPopupWindow$ActionBarPopupWindowLayout4.M.getChildAt(i15);
                                        if (childAt4 instanceof j8) {
                                            zkb.i(childAt4, K, wjbVar);
                                        }
                                    }
                                } else if (childAt3 instanceof j8) {
                                    zkb.i(childAt3, K, wjbVar);
                                }
                                i14++;
                            }
                        }
                        hx4 hx4Var = this.n;
                        il0 c = new kl0(hx4Var, hx4Var, hx4Var).c(this.A, null, true);
                        c.p(nod.k(wjbVar));
                        c.q(gl.L(8.0f));
                        c.S.e = true;
                        c.r(gl.L(12.0f));
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
                                    hx4 hx4Var2 = this.n;
                                    final il0 c2 = new kl0(hx4Var2, hx4Var2, hx4Var2).c(childAt5, null, true);
                                    c2.p(nod.k(wjbVar));
                                    c2.q(gl.L(8.0f));
                                    c2.S.e = true;
                                    c2.r(gl.L(12.0f));
                                    c2.i(childAt5.getLeft() + f17, childAt5.getTop() + f18);
                                    childAt5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: wr5
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
                                            il0.this.i(f17 + i17, f18 + i18);
                                        }
                                    });
                                    childAt5.setBackground(c2);
                                }
                            }
                        } else {
                            this.A.setBackground(c);
                        }
                    }
                    xr5 xr5Var3 = this.m;
                    xr5Var3.g = this.I;
                    float f19 = i10 + this.q;
                    this.d0 = f19;
                    float f20 = height + this.r;
                    this.e0 = f20;
                    xr5Var3.showAtLocation(overlayContainerView, 0, (int) f19, (int) f20);
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
                zr5Var.w = ((overlayContainerView.getHeight() - (this.A.getMeasuredHeight() + f132)) / f) + 0.0f;
                zr5 zr5Var42 = this.x;
                int i122 = (int) (zr5Var42.w + f132);
                int measuredWidth2 = (int) (((zr5Var42.s + f142) - this.A.getMeasuredWidth()) + gl.L(4.0f));
                if (this.M == 3) {
                }
                height = i122;
                i10 = measuredWidth2;
            }
            if (!this.w) {
            }
            if (this.v) {
                int i132 = bkb.D8;
                wjb wjbVar2 = this.d;
                U(bkb.p1(0.06f, bkb.v0(i132, wjbVar2)));
                vkb K2 = zkb.K(0.06f, i132);
                if (this.A != null) {
                }
                hx4 hx4Var3 = this.n;
                il0 c3 = new kl0(hx4Var3, hx4Var3, hx4Var3).c(this.A, null, true);
                c3.p(nod.k(wjbVar2));
                c3.q(gl.L(8.0f));
                c3.S.e = true;
                c3.r(gl.L(12.0f));
                float f152 = i10;
                float f162 = height;
                c3.i(this.q + f152, this.r + f162);
                viewGroup = this.A;
                if (viewGroup == this.D) {
                }
                this.A.setBackground(c3);
            }
            xr5 xr5Var32 = this.m;
            xr5Var32.g = this.I;
            float f192 = i10 + this.q;
            this.d0 = f192;
            float f202 = height + this.r;
            this.e0 = f202;
            xr5Var32.showAtLocation(overlayContainerView, 0, (int) f192, (int) f202);
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
        xr5 xr5Var322 = this.m;
        xr5Var322.g = this.I;
        float f1922 = i10 + this.q;
        this.d0 = f1922;
        float f2022 = height + this.r;
        this.e0 = f2022;
        xr5Var322.showAtLocation(overlayContainerView, 0, (int) f1922, (int) f2022);
        if (this.w) {
        }
        if (this.g0) {
        }
    }

    public final void b(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = bkb.o7;
            i3 = i2;
        } else {
            i2 = bkb.E8;
            i3 = bkb.D8;
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
        gl.B2(a8Var);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        Integer num2 = this.m0;
        wjb wjbVar = this.d;
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            if (this.n0 == null) {
                a8Var.c(bkb.D8, bkb.E8);
                num = this.o0;
                if (num == null) {
                    a8Var.setSelectorColor(num.intValue());
                } else {
                    a8Var.h(0.12f, bkb.D8);
                }
                i = this.V;
                if (i > 0) {
                    q(a8Var, nme.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gl.L(i));
                    q(a8Var, nme.o(this.V, -2));
                    return;
                }
            }
            intValue = bkb.v0(bkb.D8, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(bkb.E8, wjbVar));
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
        int i3 = bkb.D8;
        int i4 = bkb.E8;
        TLRPC.User f = y6c.h(i).f();
        a8 a8Var = new a8(0, this.d, this.e, false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        a8Var.setText(l7c.q(f));
        a8Var.setClipToPadding(false);
        a8Var.a.setPadding((a8Var.d && a8Var.e == null) ? 0 : gl.L(43.0f), 0, (a8Var.d || a8Var.e != null) ? gl.L(43.0f) : 0, 0);
        be0 be0Var = new be0(context);
        be0Var.getImageReceiver().d = i;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(f);
        be0Var.setRoundRadius(gl.L(34.0f));
        be0Var.f(f, pb0Var);
        be0Var.setScaleX(z ? 0.84f : 1.0f);
        be0Var.setScaleY(z ? 0.84f : 1.0f);
        a8Var.addView(be0Var, nme.d(34, 34.0f, (k96.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        wjb wjbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = gl.L(34.0f);
            int i5 = bkb.Ei;
            pjb pjbVar = new pjb(gl.L(2.0f), bkb.v0(i5, wjbVar), L);
            view.setBackground(pjbVar);
            zkb.x(view, pjbVar, i5, wjbVar, PorterDuff.Mode.SRC_IN);
            a8Var.addView(view, nme.b(36.0f, 36.0f, (k96.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
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
                a8Var.setOnClickListener(new ur5(this, runnable, (byte) 1));
                i2 = this.V;
                if (i2 > 0) {
                    q(a8Var, nme.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gl.L(i2));
                    q(a8Var, nme.o(this.V, -2));
                    return;
                }
            }
            intValue = bkb.v0(i3, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(i4, wjbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new ur5(this, runnable, (byte) 1));
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
        int i2 = bkb.D8;
        int i3 = bkb.E8;
        a8 a8Var = new a8(0, this.d, this.e, false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            a8Var.setText(chat.title);
            a8Var.setSubtext(hc2.V(chat) ? k96.M0(2131751378, null) : k96.M0(2131754876, null).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            a8Var.setText(l7c.q(user));
            if (user.id == y6c.h(y6c.t0).e()) {
                a8Var.setSubtext(k96.M0(2131743107, null));
            } else if (l7c.u(user)) {
                a8Var.setSubtext(k96.M0(2131753153, null));
            }
        }
        a8Var.setClipToPadding(false);
        a8Var.a.setPadding((a8Var.d && a8Var.e == null) ? 0 : gl.L(43.0f), 0, (a8Var.d || a8Var.e != null) ? gl.L(43.0f) : 0, 0);
        be0 be0Var = new be0(context);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        be0Var.setRoundRadius(gl.L(34.0f));
        be0Var.f(tLObject, pb0Var);
        be0Var.setScaleX(z ? 0.84f : 1.0f);
        be0Var.setScaleY(z ? 0.84f : 1.0f);
        a8Var.addView(be0Var, nme.d(34, 34.0f, (k96.a0 ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        wjb wjbVar = this.d;
        if (z) {
            View view = new View(context);
            int L = gl.L(34.0f);
            int i4 = bkb.Ei;
            pjb pjbVar = new pjb(gl.L(2.0f), bkb.v0(i4, wjbVar), L);
            view.setBackground(pjbVar);
            zkb.x(view, pjbVar, i4, wjbVar, PorterDuff.Mode.SRC_IN);
            a8Var.addView(view, nme.b(36.0f, 36.0f, (k96.a0 ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
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
                a8Var.setOnClickListener(new ur5(this, runnable, (byte) 2));
                i = this.V;
                if (i > 0) {
                    q(a8Var, nme.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gl.L(i));
                    q(a8Var, nme.o(this.V, -2));
                    return;
                }
            }
            intValue = bkb.v0(i2, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(i3, wjbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new ur5(this, runnable, (byte) 2));
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
        int i2 = bkb.D8;
        int i3 = bkb.E8;
        a8 a8Var = new a8(1, this.d, this.e, false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        Integer num2 = this.m0;
        wjb wjbVar = this.d;
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
                    q(a8Var, nme.o(-1, -2));
                    return a8Var;
                }
                a8Var.setMinimumWidth(gl.L(i));
                q(a8Var, nme.o(this.V, -2));
                return a8Var;
            }
            intValue = bkb.v0(i2, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(i3, wjbVar));
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
    public final void i(boolean z, int i, fd9 fd9Var, String str, Runnable runnable) {
        int intValue;
        Integer num;
        int i2;
        if (this.e == null) {
            return;
        }
        int i3 = bkb.D8;
        int i4 = bkb.E8;
        a8 a8Var = new a8((i == 0 && fd9Var == null) ? 1 : 2, this.d, this.e, false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        if (fd9Var != null) {
            a8Var.j(str, 0, fd9Var);
        } else if (i != 0) {
            a8Var.j(str, i, null);
        } else {
            a8Var.setText(str);
        }
        a8Var.setChecked(z);
        Integer num2 = this.m0;
        wjb wjbVar = this.d;
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
                a8Var.setOnClickListener(new ur5(this, runnable, (byte) 5));
                i2 = this.V;
                if (i2 > 0) {
                    q(a8Var, nme.o(-1, -2));
                    return;
                } else {
                    a8Var.setMinimumWidth(gl.L(i2));
                    q(a8Var, nme.o(this.V, -2));
                    return;
                }
            }
            intValue = bkb.v0(i3, wjbVar);
        }
        Integer num3 = this.n0;
        a8Var.d(intValue, num3 != null ? num3.intValue() : bkb.v0(i4, wjbVar));
        num = this.o0;
        if (num == null) {
        }
        a8Var.setOnClickListener(new ur5(this, runnable, (byte) 5));
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
        q(j8Var, nme.o(-1, 8));
    }

    public final void k(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (z) {
            a(i, null, charSequence, bkb.E8, bkb.D8, runnable);
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
        int i = bkb.h6;
        wjb wjbVar = this.d;
        byte b = 0;
        ff0 Y = bkb.Y(bkb.v0(i, wjbVar), 0, 12);
        vkb M = zkb.M(i);
        frameLayout.setBackground(Y);
        zkb.j(frameLayout, Y, null, M, wjbVar);
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(17.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        be0Var.f(tLObject, pb0Var);
        frameLayout.addView(be0Var, nme.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(l7c.q((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        zkb.X(l, bkb.p5, wjbVar);
        l.setTextSize(1, 13.0f);
        l.setText(gl.F2(str, false, gl.L(1.0f), gl.L(0.66f)));
        frameLayout.addView(l, nme.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new ur5(this, runnable, b));
        q(frameLayout, nme.o(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(i3 > 0 ? i3 / gl.p : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, !z ? 4 : 0, this.d, context);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new tr5(this, (byte) 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (z) {
            i = -8;
            i2 = 0;
        } else {
            i2 = -8;
            i = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, nme.t(-1, -2, 48, i2, i, 0, 0));
    }

    public final void o(int i, int i2, CharSequence charSequence) {
        wb wbVar = new wb(this.e, (byte) 22);
        wbVar.setTextSize(1, i);
        zkb.X(wbVar, bkb.i5, this.d);
        wbVar.setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        wbVar.setText(vu3.m(charSequence, wbVar.getPaint().getFontMetricsInt(), false, null, 0));
        wbVar.setTag(R.id.fit_width_tag, 1);
        wbVar.setTypeface(null);
        kk7.i(wbVar);
        if (i2 > 0) {
            wbVar.setMaxWidth(i2);
        }
        q(wbVar, nme.o(-1, -2));
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        q(view, nme.o(-1, -2));
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
            fm textView = ((a8) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + je5.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.q0) {
            this.q0 = false;
            return;
        }
        xr5 xr5Var = this.m;
        if (xr5Var != null) {
            xr5Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(ViewGroup viewGroup) {
        zr5 zr5Var = this.x;
        if (zr5Var == null) {
            return;
        }
        this.x = null;
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(zr5Var.x, 0.0f);
        this.p0 = ofFloat;
        ofFloat.addUpdateListener(new ni4(zr5Var, (byte) 14));
        this.p0.addListener(new i8(this, zr5Var, viewGroup, (byte) 7));
        boolean z = this.L;
        ValueAnimator valueAnimator2 = this.p0;
        if (z) {
            valueAnimator2.setDuration(380L);
            this.p0.setInterpolator(s33.h);
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

    public cs5(ViewGroup viewGroup, wjb wjbVar, View view, boolean z, boolean z2, boolean z3) {
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
        this.d = wjbVar;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) gl.B(bkb.v0(bkb.c6, wjbVar))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.F = z2;
        this.G = z3;
        C();
    }

    public cs5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, wjb wjbVar) {
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
        this.d = wjbVar;
    }
}
