package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class l extends FrameLayout implements fe.e, k6, b5 {
    public CharSequence A0;
    public int A1;
    public boolean B0;
    public boolean B1;
    public boolean C0;
    public float C1;
    public boolean D;
    public boolean D0;
    public ValueAnimator D1;
    public y E;
    public boolean E0;
    public d F;
    public org.telegram.ui.Cells.a5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final p6 J0;
    public boolean K;
    public uu0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final ac.a O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public fv0 S;
    public sn S0;
    public hh.c T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public tg.b U0;
    public boolean V;
    public wg.d V0;
    public Rect W;
    public tg.b W0;
    public hi.d X0;
    public s5 Y0;
    public t0 Z0;
    public vg.f a;
    public int a0;
    public final RectF a1;
    public vg.f b;
    public boolean b0;
    public boolean b1;
    public vg.f c;
    public CharSequence c0;
    public Runnable c1;
    public final u4 d;
    public Drawable d0;
    public wv0 d1;
    public ImageView e;
    public View.OnClickListener e0;
    public AnimatorSet e1;
    public g9 f;
    public String f0;
    public int f1;
    public final Object[] g0;
    public int g1;
    public Drawable h;
    public Runnable h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public Runnable j0;
    public float j1;
    public boolean k0;
    public final fe.f k1;
    public int l0;
    public final fe.b l1;
    public boolean m0;
    public final fe.f m1;
    public final u5[] n;
    public boolean n0;
    public final fe.b n1;
    public float o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public boolean q1;
    public u5 r;
    public int r0;
    public boolean r1;
    public u5 s;
    public int s0;
    public boolean s1;
    public k2 t0;
    public boolean t1;
    public k u0;
    public boolean u1;
    public int v0;
    public int v1;
    public View w;
    public boolean w0;
    public j w1;
    public int x;
    public boolean x0;
    public boolean x1;
    public int y;
    public boolean y0;
    public boolean y1;
    public boolean z0;
    public int z1;

    public l(Context context, p6 p6Var) {
        super(context);
        this.d = u4.a;
        this.n = new u5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = zs.e4;
        this.v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ac.a(this);
        this.a1 = new RectF();
        gr grVar = gr.h;
        this.k1 = new fe.f(0, this, grVar, 380L);
        this.l1 = new fe.b(0, this, grVar, 380L, false);
        this.m1 = new fe.f(0, this, grVar, 320L);
        this.n1 = new fe.b(0, this, grVar, 320L, false);
        this.u1 = true;
        this.v1 = zs.e4;
        this.B1 = true;
        this.C1 = 1.0f;
        this.J0 = p6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.i0.Q1()) {
            return org.telegram.messenger.i0.L(58.0f);
        }
        Point point = org.telegram.messenger.i0.q;
        return point.x > point.y ? org.telegram.messenger.i0.L(48.0f) : org.telegram.messenger.i0.L(56.0f);
    }

    public static View s(l lVar, float f7, float f10, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A() {
        y yVar = this.E;
        if (yVar != null) {
            boolean z10 = this.n0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.u()) {
                        if (!z10) {
                            yVar.b.y(t0Var.T(z11));
                        }
                        t0Var.P("", false);
                        t0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void B(RecyclerView recyclerView, int i10, int i11) {
        this.z1 = i10;
        this.A1 = i11;
        this.y1 = org.telegram.messenger.i0.Q1();
        mh.k kVar = new mh.k(23, this, recyclerView);
        recyclerView.j(new ag.u(kVar, 9));
        if (this.x1) {
            kVar.run();
            return;
        }
        this.x1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.B1 = !canScrollVertically;
        this.C1 = !canScrollVertically ? 1.0f : 0.0f;
        f();
    }

    public final void C(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(t6.h0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(t6.h0(i10, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void D(int i10, boolean z10) {
        if (z10) {
            this.s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof c2) {
                    ((c2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof c2) {
                    ((c2) drawable2).a(i10);
                } else if (drawable2 instanceof a5) {
                    ((a5) drawable2).j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.b1) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public final void F(int i10, boolean z10) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    ((t0) childAt).H(i10);
                }
                i11++;
            }
            return;
        }
        if (z10 || (yVar = this.E) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = yVar.getChildAt(i11);
            if (childAt2 instanceof t0) {
                ((t0) childAt2).H(i10);
            }
            i11++;
        }
    }

    public final void G(int i10, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    ((t0) childAt).O(i10, z10);
                }
                i11++;
            }
            return;
        }
        if (z11 || (yVar = this.E) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = yVar.getChildAt(i11);
            if (childAt2 instanceof t0) {
                ((t0) childAt2).O(i10, z10);
            }
            i11++;
        }
    }

    public final void H(int i10, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else {
            if (z10 || (yVar = this.E) == null) {
                return;
            }
            yVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void I(int i10, boolean z10) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.u()) {
                        if (z10) {
                            t0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            t0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void J(CharSequence charSequence, org.telegram.ui.Components.d5 d5Var) {
        u5[] u5VarArr = this.n;
        if (charSequence != null && u5VarArr[0] == null) {
            r(0);
        }
        u5 u5Var = u5VarArr[0];
        if (u5Var != null) {
            u5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            u5 u5Var2 = u5VarArr[0];
            this.c0 = charSequence;
            u5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.d5) {
                    ((org.telegram.ui.Components.d5) drawable).l(null);
                }
            }
            u5 u5Var3 = u5VarArr[0];
            this.d0 = d5Var;
            u5Var3.i(d5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.d5) {
                    ((org.telegram.ui.Components.d5) drawable2).l(u5VarArr[0]);
                }
            }
            u5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void K(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        u5[] u5VarArr = this.n;
        if (u5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            z20.l(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        u5 u5Var = u5VarArr[1];
        if (u5Var != null) {
            if (u5Var.getParent() != null) {
                ((ViewGroup) u5VarArr[1].getParent()).removeView(u5VarArr[1]);
            }
            u5VarArr[1] = null;
        }
        u5VarArr[1] = u5VarArr[0];
        u5VarArr[0] = null;
        setTitle(charSequence);
        this.y0 = z10;
        u5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            u5 u5Var2 = u5VarArr[0];
            int L = org.telegram.messenger.i0.L(20.0f);
            if (!z10) {
                L = -L;
            }
            u5Var2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = u5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = u5VarArr[1].animate().alpha(0.0f);
        if (!z11) {
            int L2 = org.telegram.messenger.i0.L(20.0f);
            if (z10) {
                L2 = -L2;
            }
            alpha.translationY(L2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
        requestLayout();
    }

    public final void L(String str, int i10, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        u5 u5Var;
        int indexOf;
        if (!this.b0 || this.t0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.g0;
        objArr[0] = str;
        int i11 = 1;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = runnable;
        if (this.h1) {
            return;
        }
        String str2 = this.f0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.f0 = str;
            if (this.w1 != null) {
                this.w1.c(i10 == 2131751805 ? org.telegram.messenger.i0.H2(cd.L0(2131744138, null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(2.0f)) : null, true);
            }
            CharSequence L0 = str != null ? cd.L0(i10, str) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            ac.a aVar = this.O0;
            if (str == null || (indexOf = TextUtils.indexOf(L0, "...")) < 0) {
                z10 = false;
                charSequence = L0;
            } else {
                SpannableString valueOf = SpannableString.valueOf(L0);
                aVar.D(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.i0 = str != null;
            u5[] u5VarArr = this.n;
            if ((charSequence == null || u5VarArr[0] != null) && getMeasuredWidth() != 0 && ((u5Var = u5VarArr[0]) == null || u5Var.getVisibility() == 0)) {
                u5 u5Var2 = u5VarArr[0];
                if (u5Var2 != null) {
                    u5Var2.animate().cancel();
                    u5 u5Var3 = u5VarArr[1];
                    if (u5Var3 != null) {
                        u5Var3.animate().cancel();
                    }
                    if (u5VarArr[1] == null) {
                        r(1);
                    }
                    u5VarArr[1].k(charSequence);
                    u5VarArr[1].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                    u5VarArr[1].i(drawable);
                    u5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.d5) {
                        ((org.telegram.ui.Components.d5) drawable).l(u5VarArr[1]);
                    }
                    if (z10) {
                        aVar.c(u5VarArr[1]);
                    }
                    this.h1 = true;
                    u5 u5Var4 = u5VarArr[1];
                    u5VarArr[1] = u5VarArr[0];
                    u5VarArr[0] = u5Var4;
                    u5Var4.setAlpha(0.0f);
                    u5VarArr[0].setTranslationY(-org.telegram.messenger.i0.L(20.0f));
                    u5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = u5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha.translationY(org.telegram.messenger.i0.L(20.0f));
                    } else {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.z0 = true;
                    alpha.setDuration(220L).setListener(new e(this, i11)).start();
                }
            } else {
                r(0);
                if (this.R) {
                    u5VarArr[0].invalidate();
                    invalidate();
                }
                u5VarArr[0].k(charSequence);
                u5VarArr[0].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                u5VarArr[0].i(drawable);
                u5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.d5) {
                    ((org.telegram.ui.Components.d5) drawable).l(u5VarArr[0]);
                }
                if (z10) {
                    aVar.c(u5VarArr[0]);
                } else {
                    aVar.w(u5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void M(tg.b bVar, wg.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        this.U0 = bVar;
        this.V0 = dVar;
        vg.f c10 = bVar.c(this, null, false);
        c10.o(dVar);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        this.a = c10;
        if (z10) {
            c10.r(org.telegram.messenger.i0.L(18.33f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(18.33f));
        } else {
            c10.q(org.telegram.messenger.i0.L(23.0f));
        }
        vg.f c11 = bVar.c(this, null, false);
        c11.o(dVar);
        z20.u(c11, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.b = c11;
        vg.f c12 = bVar.c(this, null, false);
        c12.o(dVar);
        z20.u(c12, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar2 = this.F;
        if (dVar2 != null) {
            dVar2.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            u5[] u5VarArr = this.n;
            if (view == u5VarArr[0] || view == u5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.F == null || this.J) {
            return;
        }
        int i10 = 1;
        this.J = true;
        j();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<d, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.Q = viewArr;
        if (this.x == 0) {
            if (!this.n0) {
                u5 u5Var = this.n[0];
                if (u5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<u5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<u5, Float>) property, 0.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 0.0f));
            }
        }
        int i11 = this.x;
        if (i11 == 0) {
            i11 = this.y;
        }
        if (i11 == 0 || this.P0) {
            zs.e().k(zs.r4, new Object[0]);
        } else if (i0.b.h(i11) < 0.699999988079071d) {
            org.telegram.messenger.i0.o3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.i0.o3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.d1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new bg.f(8, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c2) {
                ((c2) drawable).c(true, 1.0f);
            }
            this.e.setBackgroundDrawable(t6.h0(this.q0, 1, -1));
        }
    }

    public final void P() {
        boolean z10 = this.C0 && this.D0;
        if (this.E0 != z10) {
            this.E0 = z10;
            ac.a aVar = this.O0;
            if (!z10) {
                aVar.a = false;
                ((AnimatorSet) aVar.c).cancel();
                return;
            }
            aVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) aVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final boolean a(t0 t0Var, RectF rectF) {
        int L = org.telegram.messenger.i0.L(6.0f);
        if (t0Var.getParent() == this.E && this.c != null && !this.t1 && !this.Q0 && this.j1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f7 = L;
            rectF.inset(f7, f7);
            return true;
        }
        float L2 = org.telegram.messenger.i0.L(46.0f) / 2.0f;
        View view = (View) t0Var.getParent();
        float width = (t0Var.getWidth() / 2.0f) + t0Var.getX() + (view != null ? view.getX() : 0.0f);
        float height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + r0) / 2.0f)) + L2;
        rectF.set(width - L2, height - L2, width + L2, height + L2);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.A1));
        hashSet.add(Integer.valueOf(this.z1));
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final vg.f c(s5 s5Var) {
        tg.b bVar = this.W0;
        if (bVar == null) {
            bVar = this.U0;
        }
        if (bVar == null) {
            return null;
        }
        vg.f c10 = bVar.c(s5Var, null, false);
        c10.o(this.V0);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final void d(s5 s5Var, t0 t0Var) {
        this.Y0 = s5Var;
        this.Z0 = t0Var;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        vg.f fVar;
        t0 t0Var;
        u5[] u5VarArr;
        u5 u5Var;
        int L = org.telegram.messenger.i0.L(6.0f);
        int L2 = org.telegram.messenger.i0.L(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i11 = this.q1 ? this.o1 : (int) this.m1.f;
        if (this.r1) {
            i11 = Math.max((int) ((1.0f - this.j1) * this.p1), i11);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + L2) / 2)) - L;
        int i12 = L * 2;
        int i13 = height + L2 + i12;
        vg.f fVar2 = this.a;
        fe.b bVar = this.n1;
        if (fVar2 == null || this.Q0 || !this.u1) {
            f7 = 1.0f;
        } else {
            if (!this.H0 || (u5Var = (u5VarArr = this.n)[0]) == null || u5Var.getVisibility() != 0) {
                f7 = 1.0f;
                int i14 = ((this.q1 || this.r1) ? i11 > 0 ? L : 0 : (int) (L * bVar.e)) + i11;
                int i15 = L + L2;
                int max = Math.max(i14, i15);
                i10 = 2;
                sn snVar = this.S0;
                fe.b bVar2 = this.l1;
                int W1 = org.telegram.messenger.i0.W1(snVar == null ? 0.0f : 1.0f - bVar2.e, i14, max);
                int W12 = org.telegram.messenger.i0.W1(this.S0 != null ? 1.0f - bVar2.e : 0.0f, z10 ? i15 : 0, i15);
                int width = getWidth() - W1;
                int i16 = width - W12;
                if (this.S0 != null) {
                    int W13 = org.telegram.messenger.i0.W1(Math.max(this.j1, actionModeFactor), Math.min(i16, ((int) this.k1.f) + i12), i16);
                    W12 = ((width + W12) - W13) / 2;
                    width = W12 + W13;
                    float L3 = org.telegram.messenger.i0.L(3.0f) + ((W12 - ((ViewGroup.MarginLayoutParams) this.S0.getLayoutParams()).leftMargin) - this.S0.getLeftPadding()) + L;
                    this.S0.setTranslationX(L3);
                    this.S0.setPivotX((r4.getMeasuredWidth() / 2.0f) - L3);
                }
                this.a.setBounds(W12, height, width, i13);
                if (!this.T0) {
                    this.a.draw(canvas);
                }
                fVar = this.b;
                if (fVar != null && z10) {
                    fVar.setBounds(0, height, L2 + i12, i13);
                    this.b.draw(canvas);
                }
                if (this.c != null && i11 > 0 && !this.Q0 && !this.t1 && ((t0Var = this.Z0) == null || t0Var.getParent() != this.E || !a(this.Z0, this.a1))) {
                    this.c.setBounds((getWidth() - Math.max(L2, i11)) - i12, height, getWidth(), i13);
                    this.c.setAlpha(!this.q1 ? 255 : (int) (bVar.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.L0 && this.y != 0) {
                    this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i17 = this.y;
                    Paint paint = this.M0;
                    paint.setColor(i17);
                    if (this.x1) {
                        this.K0.H(canvas, getY(), this.N0, paint, true);
                    } else {
                        uu0 uu0Var = this.K0;
                        float y3 = getY();
                        float f10 = f7 - (this.y1 ? f7 : this.C1);
                        uu0Var.getClass();
                        uu0Var.I(canvas, y3, this.N0, paint, true, org.telegram.messenger.i0.W1(f10, zs.e4, Color.alpha(t6.w0((uu0.E() && tz.o() == i10) ? t6.lg : t6.mg, uu0Var.getResourceProvider()))));
                    }
                }
                this.s1 = true;
                if (this.i1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            }
            f7 = 1.0f;
            int L4 = org.telegram.messenger.i0.L(48.0f) + ((int) Math.ceil(u5VarArr[0].getTextWidth())) + i12;
            int round = Math.round(u5VarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
            this.a.setBounds(round, height, L4 + round, i13);
            if (!this.T0) {
                this.a.draw(canvas);
            }
        }
        i10 = 2;
        fVar = this.b;
        if (fVar != null) {
            fVar.setBounds(0, height, L2 + i12, i13);
            this.b.draw(canvas);
        }
        if (this.c != null) {
            this.c.setBounds((getWidth() - Math.max(L2, i11)) - i12, height, getWidth(), i13);
            this.c.setAlpha(!this.q1 ? 255 : (int) (bVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.L0) {
            this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i172 = this.y;
            Paint paint2 = this.M0;
            paint2.setColor(i172);
            if (this.x1) {
            }
        }
        this.s1 = true;
        if (this.i1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View s10 = s(this, f7, f10, this.S0);
            if (s10 == null) {
                s10 = s(this, f7, f10, null);
            }
            vg.f fVar = this.a;
            boolean z10 = fVar != null && fVar.getBounds().contains(x10, y3);
            if (s10 != null && s10 != this.S0) {
                vg.f fVar2 = this.b;
                boolean z11 = z10 | (fVar2 != null && fVar2.getBounds().contains(x10, y3));
                vg.f fVar3 = this.c;
                z10 = z11 | (fVar3 != null && fVar3.getBounds().contains(x10, y3));
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02ff  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Drawable B0;
        float f7;
        float f10;
        boolean z11;
        vz vzVar;
        t0 t0Var;
        k2 k2Var = this.t0;
        if (k2Var != null && k2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        boolean z12 = true;
        if (this.B0 && view == this.e) {
            return true;
        }
        if (view == this.E && (t0Var = this.Z0) != null && t0Var != null && t0Var.getParent() == this.E && a(this.Z0, this.a1)) {
            return true;
        }
        boolean N = N(view);
        if (N) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? org.telegram.messenger.i0.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.R && !this.i0 && !cd.X) {
            u5[] u5VarArr = this.n;
            if ((view == u5VarArr[0] || view == u5VarArr[1] || (view == this.F0 && this.G0)) && (B0 = t6.B0()) != null) {
                u5 u5Var = view == this.F0 ? u5VarArr[0] : (u5) view;
                if (u5Var != null && u5Var.getVisibility() == 0 && (u5Var.getText() instanceof String)) {
                    TextPaint textPaint = u5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) u5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (B0.getIntrinsicWidth() + t6.D1)) / 2) + u5Var.getTextStartX() + t6.D1;
                    f7 = 255.0f;
                    f10 = 1.0f;
                    int textStartY = u5Var.getTextStartY() + t6.E1 + ((int) Math.ceil((u5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * org.telegram.messenger.i0.L(8.0f)));
                    B0.setBounds(width, textStartY - B0.getIntrinsicHeight(), B0.getIntrinsicWidth() + width, textStartY);
                    B0.setAlpha((int) (u5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    B0.draw(canvas);
                    if (this.h1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f7 = 255.0f;
                    f10 = 1.0f;
                }
                if (t6.G1) {
                    if (this.S == null) {
                        this.S = new fv0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                fv0 fv0Var = this.S;
                if (fv0Var != null) {
                    fv0Var.b(canvas, this);
                } else {
                    hh.c cVar = this.T;
                    if (cVar != null) {
                        ArrayList arrayList = (ArrayList) cVar.d;
                        ArrayList arrayList2 = (ArrayList) cVar.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                vz vzVar2 = (vz) arrayList2.get(i10);
                                Paint paint = (Paint) vzVar2.k.b;
                                paint.setColor(vzVar2.j);
                                paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f) * vzVar2.i);
                                paint.setAlpha((int) (vzVar2.f * f7));
                                canvas.drawPoint(vzVar2.a, vzVar2.b, paint);
                            }
                            SecureRandom secureRandom = Utilities.b;
                            if (secureRandom.nextBoolean() && arrayList2.size() + 8 < 150) {
                                int i11 = org.telegram.messenger.i0.m;
                                float nextFloat = secureRandom.nextFloat() * getMeasuredWidth();
                                float f11 = 20.0f;
                                float nextFloat2 = (secureRandom.nextFloat() * org.telegram.messenger.m5.z(20.0f, getMeasuredHeight(), i11)) + i11;
                                int nextInt = secureRandom.nextInt(4);
                                int i12 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                int i13 = 0;
                                while (i13 < 8) {
                                    SecureRandom secureRandom2 = Utilities.b;
                                    float f12 = f11;
                                    boolean z13 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(zs.t4) - 225) * 0.017453292519943295d;
                                    boolean z14 = z12;
                                    int i14 = i12;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        vzVar = new vz(cVar);
                                    } else {
                                        vzVar = (vz) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    vzVar.a = nextFloat;
                                    vzVar.b = nextFloat2;
                                    vzVar.c = cos * 1.5f;
                                    vzVar.d = sin;
                                    i12 = i14;
                                    vzVar.j = i12;
                                    float f13 = f10;
                                    vzVar.f = f13;
                                    vzVar.h = 0.0f;
                                    vzVar.i = Math.max(f13, secureRandom2.nextFloat() * 1.5f);
                                    vzVar.g = secureRandom2.nextInt(1000) + 1000;
                                    vzVar.e = (secureRandom2.nextFloat() * 4.0f) + f12;
                                    arrayList2.add(vzVar);
                                    i13++;
                                    drawChild = z13;
                                    z12 = z14;
                                    f11 = f12;
                                    f10 = 1.0f;
                                }
                            }
                            boolean z15 = z12;
                            z10 = drawChild;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - cVar.a);
                            int size2 = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                vz vzVar3 = (vz) arrayList2.get(i15);
                                float f14 = vzVar3.h;
                                float f15 = vzVar3.g;
                                if (f14 >= f15) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(vzVar3);
                                    }
                                    arrayList2.remove(i15);
                                    i15--;
                                    size2--;
                                    z11 = z15;
                                } else {
                                    z11 = z15;
                                    vzVar3.f = 1.0f - org.telegram.messenger.i0.F.getInterpolation(f14 / f15);
                                    float f16 = vzVar3.a;
                                    float f17 = vzVar3.c;
                                    float f18 = vzVar3.e;
                                    float f19 = min;
                                    vzVar3.a = a1.g.A(f17 * f18, f19, 500.0f, f16);
                                    float f20 = vzVar3.b;
                                    float f21 = vzVar3.d;
                                    vzVar3.b = (((f18 * f21) * f19) / 500.0f) + f20;
                                    vzVar3.d = (f19 / 100.0f) + f21;
                                    vzVar3.h += f19;
                                }
                                i15++;
                                z15 = z11;
                            }
                            cVar.a = currentTimeMillis;
                            invalidate();
                            if (N) {
                                canvas.restore();
                            }
                            return z10;
                        }
                    }
                }
            }
        }
        z10 = drawChild;
        if (N) {
        }
        return z10;
    }

    public final boolean e(String str) {
        if (this.F == null) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void f() {
        if (this.x1) {
            float f7 = this.y1 ? 1.0f : this.C1;
            int i10 = this.A1;
            p6 p6Var = this.J0;
            int w02 = i10 == -1 ? 0 : t6.w0(i10, p6Var);
            int i11 = this.z1;
            int w03 = i11 == -1 ? 0 : t6.w0(i11, p6Var);
            if (w03 == 0) {
                w03 = i0.b.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.b.o(w03, 0);
            }
            setBackgroundColor(i0.b.f(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - f7) * 255.0f));
            if (this.L0) {
                invalidate();
            }
        }
    }

    public final void g() {
        if (cd.X) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new i(0));
        this.z0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public k getActionBarMenuOnItemClick() {
        return this.u0;
    }

    public y getActionMode() {
        return this.F;
    }

    public float getActionModeFactor() {
        d dVar = this.F;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.w1;
    }

    public u5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public u4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public int getButtonsGlassBackgroundColor() {
        wg.d dVar = this.V0;
        if (dVar != null) {
            return dVar.a(dVar.e);
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public wg.a getButtonsGlassColorProvider() {
        return this.V0;
    }

    public boolean getCastShadows() {
        return this.k0;
    }

    public int getExtraHeight() {
        return this.O;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.O;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public wg.a getMenuGlassColorProvider() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public p6 getMenuResourcesProvider() {
        return this.J0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public View getMenuView() {
        return this.E;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public s5 getOpenMenuOverlay() {
        return this.Y0;
    }

    public g9 getSearchAvatarImageView() {
        return this.f;
    }

    public int getShadowAlpha() {
        return this.l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.r == null || (charSequence = this.A0) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public int getSubtitleColorInternal() {
        u5 u5Var = this.r;
        if (u5Var != null) {
            return u5Var.getTextColor();
        }
        return 0;
    }

    public u5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        u5 u5Var = this.n[0];
        if (u5Var == null) {
            return null;
        }
        return u5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        u5 u5Var = this.n[0];
        if (u5Var != null) {
            return u5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L((org.telegram.messenger.i0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public u5 getTitleTextView() {
        return this.n[0];
    }

    public u5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h(boolean z10) {
        sn snVar = this.S0;
        if (snVar == null) {
            return;
        }
        on onVar = snVar.e;
        boolean z11 = onVar != null && onVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.i0.L(116.0f), this.S0.getVisualWidth());
        fe.f fVar = this.k1;
        if (z10) {
            float f7 = min;
            if ((fVar.h ? fVar.g : fVar.f) != f7) {
                fVar.a(f7);
            }
        } else {
            fVar.c(min);
        }
        this.l1.a(z11, z10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof c2) || (drawable instanceof a5)) ? 2 : 0;
        if (this.e.getLayerType() != i10) {
            this.e.setLayerType(i10, null);
            this.e.invalidate();
        }
    }

    public final void j() {
        y yVar = this.E;
        int max = Math.max(0, yVar != null ? (yVar.getItemsWidth() - org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(1.0f) : 0);
        d dVar = this.F;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(1.0f) : 0);
        org.telegram.messenger.i0.L(46.0f);
        if (this.J) {
            max = max2;
        }
        this.n1.a(max > 0, this.s1);
        fe.f fVar = this.m1;
        float f7 = max;
        if ((fVar.h ? fVar.g : fVar.f) != f7) {
            if (this.s1) {
                fVar.a(f7);
            } else {
                fVar.c(f7);
            }
        }
    }

    public void k(boolean z10) {
        y yVar;
        if (!this.n0 || (yVar = this.E) == null) {
            return;
        }
        yVar.i(z10);
    }

    public final y l() {
        return m(null);
    }

    public final y m(String str) {
        if (e(str)) {
            return this.F;
        }
        d dVar = this.F;
        if (dVar != null) {
            removeView(dVar);
            this.F = null;
        }
        this.G = str;
        d dVar2 = new d(this, getContext(), this);
        this.F = dVar2;
        dVar2.setTranslationX(this.P0 ? -org.telegram.messenger.i0.L(10.0f) : 0.0f);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            a7.i(t6.w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.e));
        this.F.setPadding(0, this.I ? org.telegram.messenger.i0.m : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    public final void n() {
        if (this.s != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        this.s = u5Var;
        u5Var.setGravity(3);
        this.s.setVisibility(8);
        a7.Y(this.s, t6.B8, this.J0);
        addView(this.s, 0, w7.b6.e(-2, -2, 51));
    }

    public final void o() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(t6.h0(this.p0, 1, -1));
        this.e.setPadding(org.telegram.messenger.i0.L(1.0f), 0, 0, 0);
        addView(this.e, w7.b6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(cd.L0(2131754878, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.x;
            if (i10 == 0) {
                i10 = this.y;
            }
            if (i10 == 0 || this.P0) {
                zs.e().k(zs.r4, new Object[0]);
            } else if (i0.b.h(i10) < 0.699999988079071d) {
                org.telegram.messenger.i0.o3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.i0.o3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.d5) {
            ((org.telegram.ui.Components.d5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.y;
            if (i10 == 0 || this.x == 0 || this.P0) {
                zs.e().k(zs.r4, new Object[0]);
            } else if (i0.b.h(i10) < 0.699999988079071d) {
                org.telegram.messenger.i0.o3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.i0.o3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.d5) {
            ((org.telegram.ui.Components.d5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.i0 && !cd.X && motionEvent.getAction() == 0 && (B0 = t6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            fv0 fv0Var = this.S;
            u5[] u5VarArr = this.n;
            if (fv0Var == null) {
                this.T = null;
                this.S = new fv0(0);
                u5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                hh.c cVar = new hh.c();
                cVar.c = new ArrayList();
                cVar.d = new ArrayList();
                Paint paint = new Paint(1);
                cVar.b = paint;
                paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
                paint.setColor(t6.x0(null, t6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    ((ArrayList) cVar.d).add(new vz(cVar));
                }
                this.T = cVar;
                u5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.I0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        u5[] u5VarArr;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int currentActionBarHeight;
        int i19 = this.I ? org.telegram.messenger.i0.m : 0;
        if (this.g1 != getMeasuredWidth()) {
            this.g1 = getMeasuredWidth();
            h(this.k1.h);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.i0.L(this.P0 ? 24.0f : org.telegram.messenger.i0.Q1() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i19, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i19);
            L = org.telegram.messenger.i0.L(this.P0 ? 76.0f : org.telegram.messenger.i0.Q1() ? 80.0f : 72.0f);
        }
        int i20 = L + this.f1;
        y yVar = this.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            int L2 = this.E.p() ? org.telegram.messenger.i0.L(this.m0 ? 0.0f : org.telegram.messenger.i0.Q1() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            y yVar2 = this.E;
            yVar2.layout(L2, i19, yVar2.getMeasuredWidth() + L2, this.E.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            u5VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            u5 u5Var = u5VarArr[i21];
            if (u5Var != null && u5Var.getVisibility() != 8) {
                boolean z11 = this.y0;
                if (((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - u5VarArr[i21].getTextHeight()) / 2;
                } else {
                    u5 u5Var2 = this.r;
                    currentActionBarHeight = (u5Var2 == null || u5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - u5VarArr[i21].getTextHeight()) / 2 : org.telegram.messenger.i0.L((org.telegram.messenger.i0.Q1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + org.telegram.messenger.i0.L(2.0f) + (((getCurrentActionBarHeight() / 2) - u5VarArr[i21].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.H0 ? (getMeasuredWidth() - u5VarArr[i21].getMeasuredWidth()) / 2 : i20;
                u5 u5Var3 = u5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                u5Var3.layout(measuredWidth2, i22 - u5Var3.getPaddingTop(), u5VarArr[i21].getMeasuredWidth() + measuredWidth2, u5VarArr[i21].getPaddingBottom() + ((u5VarArr[i21].getTextHeight() + i22) - u5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.w1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.w1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.i0.L(2.0f);
            j jVar = this.w1;
            int i23 = currentActionBarHeight2 + i19;
            jVar.layout(i20, i23, jVar.getMeasuredWidth() + i20, this.w1.getMeasuredHeight() + i23);
        }
        u5 u5Var4 = this.r;
        if (u5Var4 != null && u5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.i0.L(2.0f);
            int measuredWidth3 = this.H0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i20;
            u5 u5Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            u5Var5.layout(measuredWidth3, i24, u5Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i24);
        }
        u5 u5Var6 = this.s;
        if (u5Var6 != null && u5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!org.telegram.messenger.i0.Q1()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - org.telegram.messenger.i0.L(1.0f);
            u5 u5Var7 = this.s;
            int i26 = L3 + i19;
            u5Var7.layout(i20, i26, u5Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        g9 g9Var = this.f;
        if (g9Var != null) {
            g9Var.layout(org.telegram.messenger.i0.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + org.telegram.messenger.i0.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != u5VarArr[0] && childAt != u5VarArr[1] && childAt != this.w1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i28 = layoutParams.gravity;
                if (i28 == -1) {
                    i28 = 51;
                }
                int i29 = i28 & zs.x1;
                int i30 = i28 & 7;
                if (i30 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth4) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i30 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i29 != 16) {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i29 != 80) {
                        i18 = layoutParams.topMargin;
                        childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
                    } else {
                        i16 = (i13 - i11) - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth4;
                    i14 = layoutParams.rightMargin;
                }
                i15 = measuredWidth - i14;
                if (i29 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int L;
        u5[] u5VarArr;
        u5 u5Var;
        int i12;
        u5 u5Var2;
        int makeMeasureSpec;
        l lVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i13 = 1;
        lVar.H = true;
        View view = lVar.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.i0.m;
        }
        d dVar = lVar.F;
        if (dVar != null) {
            dVar.setPadding(0, lVar.I ? org.telegram.messenger.i0.m : 0, 0, 0);
        }
        lVar.H = false;
        lVar.setMeasuredDimension(size, currentActionBarHeight + (lVar.I ? org.telegram.messenger.i0.m : 0) + lVar.O);
        ImageView imageView = lVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 26.0f : 18.0f);
        } else {
            lVar.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 80.0f : 72.0f);
        }
        y yVar = lVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f7 = 66.0f;
            if (lVar.E.p() && !lVar.n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k10 = lVar.E.k();
                if (lVar.m0) {
                    f7 = 0.0f;
                } else if (org.telegram.messenger.i0.Q1()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.k() + (size - org.telegram.messenger.i0.L(f7)), TLObject.FLAG_30);
                if (!lVar.D) {
                    lVar.E.r(-k10);
                }
            } else if (lVar.n0) {
                if (lVar.m0) {
                    f7 = 0.0f;
                } else if (org.telegram.messenger.i0.Q1()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = z20.c(f7, size, TLObject.FLAG_30);
                if (!lVar.D) {
                    lVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!lVar.D) {
                    lVar.E.r(0.0f);
                }
            }
            lVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i14 = 0;
        while (true) {
            u5VarArr = lVar.n;
            if (i14 >= 2) {
                break;
            }
            u5 u5Var3 = u5VarArr[0];
            if ((u5Var3 == null || u5Var3.getVisibility() == 8) && ((u5Var = lVar.r) == null || u5Var.getVisibility() == 8)) {
                i12 = i13;
            } else {
                y yVar2 = lVar.E;
                int measuredWidth = yVar2 != null ? yVar2.getMeasuredWidth() : 0;
                int max = Math.max(lVar.H0 ? size - (Math.max(L, (org.telegram.messenger.i0.L(16.0f) + measuredWidth) + lVar.a0) * 2) : org.telegram.messenger.m5.z(16.0f, size - measuredWidth, L) - lVar.a0, 0);
                boolean z10 = lVar.y0;
                int i15 = 20;
                if (((z10 && i14 == 0) || (!z10 && i14 == i13)) && lVar.w0 && lVar.x0) {
                    u5 u5Var4 = u5VarArr[i14];
                    i12 = i13;
                    if (lVar.P0) {
                        i15 = 17;
                    } else if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                        i15 = 18;
                    }
                    u5Var4.setTextSize(i15);
                } else {
                    i12 = i13;
                    u5 u5Var5 = u5VarArr[0];
                    if (u5Var5 == null || u5Var5.getVisibility() == 8 || (u5Var2 = lVar.r) == null || u5Var2.getVisibility() == 8) {
                        u5 u5Var6 = u5VarArr[i14];
                        if (u5Var6 != null && u5Var6.getVisibility() != 8) {
                            u5 u5Var7 = u5VarArr[i14];
                            if (lVar.P0) {
                                i15 = 17;
                            } else if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 18;
                            }
                            u5Var7.setTextSize(i15);
                        }
                        u5 u5Var8 = lVar.r;
                        if (u5Var8 != null && u5Var8.getVisibility() != 8) {
                            lVar.r.setTextSize((org.telegram.messenger.i0.Q1() || lVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        u5 u5Var9 = lVar.s;
                        if (u5Var9 != null) {
                            u5Var9.setTextSize((org.telegram.messenger.i0.Q1() || lVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        u5 u5Var10 = u5VarArr[i14];
                        if (u5Var10 != null) {
                            if (lVar.P0) {
                                i15 = 17;
                            } else if (!org.telegram.messenger.i0.Q1()) {
                                i15 = 18;
                            }
                            u5Var10.setTextSize(i15);
                        }
                        lVar.r.setTextSize(org.telegram.messenger.i0.Q1() ? 16 : 14);
                        u5 u5Var11 = lVar.s;
                        if (u5Var11 != null) {
                            u5Var11.setTextSize(org.telegram.messenger.i0.Q1() ? 16 : 14);
                        }
                    }
                }
                u5 u5Var12 = u5VarArr[i14];
                if (u5Var12 != null && u5Var12.getVisibility() != 8) {
                    u5VarArr[i14].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(u5VarArr[i14].getPaddingBottom() + u5VarArr[i14].getPaddingTop() + org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_31));
                    if (lVar.z0) {
                        CharSequence text = u5VarArr[i14].getText();
                        u5 u5Var13 = u5VarArr[i14];
                        u5Var13.setPivotX(u5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        u5VarArr[i14].setPivotY(org.telegram.messenger.i0.L(24.0f) >> 1);
                    } else {
                        u5VarArr[i14].setPivotX(0.0f);
                        u5VarArr[i14].setPivotY(0.0f);
                    }
                }
                u5 u5Var14 = lVar.r;
                if (u5Var14 != null && u5Var14.getVisibility() != 8) {
                    lVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
                }
                j jVar = lVar.w1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                u5 u5Var15 = lVar.s;
                if (u5Var15 != null && u5Var15.getVisibility() != 8) {
                    lVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
                }
            }
            i14++;
            i13 = i12;
        }
        int i16 = i13;
        g9 g9Var = lVar.f;
        if (g9Var != null) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = lVar.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = lVar.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != u5VarArr[0] && childAt != u5VarArr[i16] && childAt != lVar.w1 && childAt != lVar.r && childAt != lVar.E && childAt != lVar.e && childAt != lVar.s && childAt != lVar.f) {
                lVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i17++;
            lVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.N) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.M;
    }

    public final y p() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, w7.b6.e(-2, -1, 5));
        return this.E;
    }

    public final void q() {
        if (this.r != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        this.r = u5Var;
        u5Var.setGravity(3);
        this.r.setVisibility(8);
        a7.Y(this.r, t6.B8, this.J0);
        addView(this.r, 0, w7.b6.e(-2, -2, 51));
    }

    public final void r(int i10) {
        u5[] u5VarArr = this.n;
        if (u5VarArr[i10] != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        u5VarArr[i10] = u5Var;
        u5Var.setGravity(this.H0 ? 17 : 19);
        int i11 = this.v0;
        if (i11 != 0) {
            u5VarArr[i10].setTextColor(i11);
        } else {
            a7.Y(u5VarArr[i10], t6.A8, this.J0);
        }
        u5 u5Var2 = u5VarArr[i10];
        u5Var2.setEmojiColor(u5Var2.getTextColor());
        u5VarArr[i10].setTypeface(org.telegram.messenger.i0.o());
        u5VarArr[i10].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        u5VarArr[i10].setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        u5VarArr[i10].setRightDrawableTopPadding(-org.telegram.messenger.i0.L(1.0f));
        if (this.G0) {
            this.F0.addView(u5VarArr[i10], 0, w7.b6.e(-2, -2, 51));
        } else {
            addView(u5VarArr[i10], 0, w7.b6.e(-2, -2, 51));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.u0 = kVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            z6 z6Var = a7.a;
            dVar.setTag(R.id.theme_bind, null);
            this.F.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.x = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.w;
        if (view != null) {
            a7.r(view);
            this.w.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        B(recyclerView, t6.a7, t6.s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.f1 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.b0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.e == null) {
            o();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof c2) {
            c2 c2Var = (c2) drawable;
            c2Var.c(false, u() ? 1.0f : 0.0f);
            c2Var.b(this.s0);
            c2Var.a(this.r0);
        } else if (drawable instanceof a5) {
            a5 a5Var = (a5) drawable;
            a5Var.k = this.y;
            a5Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.b1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        i();
    }

    public void setBackButtonImage(int i10) {
        if (this.e == null) {
            o();
        }
        this.e.setVisibility(i10 == 0 ? 8 : 0);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        i();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.y = i10;
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a5) {
                ((a5) drawable).k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        u5[] u5VarArr = this.n;
        int length = u5VarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            u5 u5Var = u5VarArr[i10];
            if (u5Var != null) {
                u5Var.setGravity(z10 ? 17 : 19);
            }
            i10++;
        }
        u5 u5Var2 = this.r;
        if (u5Var2 != null) {
            u5Var2.setGravity(z10 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(sn snVar) {
        this.S0 = snVar;
    }

    public void setClipContent(boolean z10) {
        this.L = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.B0 = z10;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(uu0 uu0Var) {
        this.L0 = true;
        this.K0 = uu0Var;
        uu0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z10);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        this.O = i10;
        d dVar = this.F;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.N = z10;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.r1 = true;
        if (this.p1 != i10) {
            this.p1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.q1 = true;
        if (this.o1 != i10) {
            this.o1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.v1 != i10) {
            this.v1 = i10;
            invalidate();
        }
        vg.f fVar = this.a;
        if (fVar == null || fVar.c == i10) {
            return;
        }
        fVar.setAlpha(i10);
        invalidate();
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.I0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setMenuGlassFrostedProgress(float f7) {
        hi.d dVar = this.X0;
        if (dVar != null) {
            dVar.b(f7);
        }
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.D = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.I = z10;
        d dVar = this.F;
        if (dVar != null) {
            dVar.setPadding(0, z10 ? org.telegram.messenger.i0.m : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.c1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
        u5[] u5VarArr = this.n;
        u5 u5Var = u5VarArr[0];
        if (u5Var != null) {
            u5Var.setRightDrawableOnClick(onClickListener);
        }
        u5 u5Var2 = u5VarArr[1];
        if (u5Var2 != null) {
            u5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(g9 g9Var) {
        g9 g9Var2 = this.f;
        if (g9Var2 == g9Var) {
            return;
        }
        if (g9Var2 != null) {
            removeView(g9Var2);
        }
        this.f = g9Var;
        if (g9Var != null) {
            addView(g9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.j1 != f7) {
            this.j1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(zf.e0 e0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.i1 != z10) {
            this.i1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            q();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.r.setVisibility((isEmpty || this.n0) ? 8 : 0);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.r == null) {
            q();
        }
        a7.r(this.r);
        this.r.setTextColor(i10);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.R = z10;
        if (z10) {
            this.U = new Paint.FontMetricsInt();
            this.W = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        J(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.j0 = runnable;
        this.h0 = runnable;
    }

    public void setTitleColor(int i10) {
        u5[] u5VarArr = this.n;
        if (u5VarArr[0] == null) {
            r(0);
        }
        this.v0 = i10;
        a7.r(u5VarArr[0]);
        u5VarArr[0].setTextColor(i10);
        u5VarArr[0].setEmojiColor(i10);
        u5 u5Var = u5VarArr[1];
        if (u5Var != null) {
            a7.r(u5Var);
            u5VarArr[1].setTextColor(i10);
            u5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.n[0].setScrollNonFitText(z10);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public void t() {
        d dVar = this.F;
        if (dVar == null || !this.J) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof t0) {
                ((t0) childAt).o();
            }
        }
        this.J = false;
        j();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<d, Float>) property, 0.0f));
        if (this.Q != null) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.Q;
                if (i12 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i12];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.Q[i12], (Property<View, Float>) property, 1.0f));
                }
                i12++;
            }
        }
        boolean z10 = this.n0;
        u5[] u5VarArr = this.n;
        if (!z10) {
            u5 u5Var = u5VarArr[0];
            if (u5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<u5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<u5, Float>) property, 1.0f));
            }
        }
        y yVar = this.E;
        if (yVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 1.0f));
        }
        int i13 = this.y;
        if (i13 == 0 || this.P0) {
            zs.e().k(zs.r4, new Object[0]);
        } else if (i0.b.h(i13) < 0.699999988079071d) {
            org.telegram.messenger.i0.o3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.i0.o3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.d1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i10));
        this.P.start();
        if (!this.n0) {
            u5 u5Var2 = u5VarArr[0];
            if (u5Var2 != null) {
                u5Var2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                this.r.setVisibility(0);
            }
        }
        y yVar2 = this.E;
        if (yVar2 != null) {
            yVar2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c2) {
                ((c2) drawable).c(true, 0.0f);
            }
            this.e.setBackgroundDrawable(t6.h0(this.p0, 1, -1));
        }
    }

    public final boolean u() {
        return this.F != null && this.J;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        f();
        vg.f fVar = this.a;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.c;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        vg.f fVar3 = this.b;
        if (fVar3 != null) {
            fVar3.updateColors();
        }
        j jVar = this.w1;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        invalidate();
    }

    public final boolean w(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean x() {
        return false;
    }

    public void y(boolean z10) {
        Property property;
        this.n0 = z10;
        j();
        AnimatorSet animatorSet = this.e1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.e1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean x10 = x();
        if (!x10) {
            u5 u5Var = this.n[0];
            if (u5Var != null) {
                arrayList.add(u5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 2));
        this.e1.playTogether(ofFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f7 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.e1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.e1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.e1;
            if (!z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f7));
            i10++;
        }
        g9 g9Var = this.f;
        if (g9Var != null) {
            g9Var.setVisibility(0);
            this.e1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<g9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.e1.addListener(new f(this, arrayList, z10, x10));
        this.e1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a5) {
                a5 a5Var = (a5) drawable;
                a5Var.h = true;
                a5Var.a(true, z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void z() {
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u()) {
                    t0Var.E();
                }
            }
        }
    }

    public void setAdaptiveBackground(in0 in0Var) {
        int i10 = t6.a7;
        int i11 = t6.s8;
        this.z1 = i10;
        this.A1 = i11;
        this.y1 = org.telegram.messenger.i0.Q1();
        f();
        mh.k kVar = new mh.k(22, this, in0Var);
        in0Var.L.add(kVar);
        if (this.x1) {
            kVar.run();
            return;
        }
        this.x1 = true;
        boolean canScrollVertically = in0Var.canScrollVertically(-1);
        this.B1 = !canScrollVertically;
        this.C1 = !canScrollVertically ? 1.0f : 0.0f;
        f();
    }

    @Override // org.telegram.ui.ActionBar.b5
    public View getMenuHostView() {
        return this;
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
