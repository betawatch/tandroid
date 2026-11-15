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
import c8.ja;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.st0;
import org.telegram.ui.pu0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements te.b, z5, q4 {
    public boolean A0;
    public boolean A1;
    public CharSequence B0;
    public int B1;
    public boolean C0;
    public int C1;
    public boolean D0;
    public boolean D1;
    public boolean E;
    public boolean E0;
    public float E1;
    public y F;
    public boolean F0;
    public ValueAnimator F1;
    public d G;
    public bi.v1 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final e6 K0;
    public boolean L;
    public st0 L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final ab.q P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public du0 T;
    public sn T0;
    public lz U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public dh.c V0;
    public boolean W;
    public gh.e W0;
    public dh.c X0;
    public ui.d Y0;
    public int Z0;
    public fh.g a;
    public Rect a0;
    public g5 a1;
    public fh.g b;
    public int b0;
    public q0 b1;
    public fh.g c;
    public boolean c0;
    public final RectF c1;
    public final k4 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public Drawable e0;
    public Runnable e1;
    public i9 f;
    public View.OnClickListener f0;
    public pu0 f1;
    public String g0;
    public AnimatorSet g1;
    public Drawable h;
    public final Object[] h0;
    public int h1;
    public Runnable i0;
    public int i1;
    public boolean j0;
    public boolean j1;
    public Runnable k0;
    public boolean k1;
    public boolean l0;
    public float l1;
    public int m0;
    public final te.c m1;
    public final j5[] n;
    public boolean n0;
    public final te.a n1;
    public boolean o0;
    public final te.c o1;
    public float p0;
    public final te.a p1;
    public int q0;
    public int q1;
    public j5 r;
    public int r0;
    public int r1;
    public j5 s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public e2 u0;
    public boolean u1;
    public j v0;
    public boolean v1;
    public View w;
    public int w0;
    public boolean w1;
    public int x;
    public boolean x0;
    public int x1;
    public int y;
    public boolean y0;
    public fi.j y1;
    public boolean z0;
    public boolean z1;

    public k(Context context, e6 e6Var) {
        super(context);
        this.d = k4.a;
        this.n = new j5[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = ns.e4;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new ab.q(this);
        this.c1 = new RectF();
        er erVar = er.h;
        this.m1 = new te.c(0, this, erVar, 380L);
        this.n1 = new te.a(0, this, erVar, 380L, false);
        this.o1 = new te.c(0, this, erVar, 320L);
        this.p1 = new te.a(0, this, erVar, 320L, false);
        this.w1 = true;
        this.x1 = ns.e4;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = e6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x > point.y ? org.telegram.messenger.g0.L(48.0f) : org.telegram.messenger.g0.L(56.0f);
    }

    public static View v(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void A(boolean z10) {
        Property property;
        this.o0 = z10;
        m();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean z11 = z();
        if (!z11) {
            j5 j5Var = this.n[0];
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 2));
        this.g1.playTogether(ofFloat);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i7 >= size) {
                break;
            }
            View view = (View) arrayList.get(i7);
            float f10 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.g1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.g1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.g1;
            if (!z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10));
            i7++;
        }
        i9 i9Var = this.f;
        if (i9Var != null) {
            i9Var.setVisibility(0);
            this.g1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<i9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new f(this, arrayList, z10, z11));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof p4) {
                p4 p4Var = (p4) drawable;
                p4Var.h = true;
                p4Var.a(true, z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void B() {
        y yVar = this.F;
        int childCount = yVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = yVar.getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.F();
                }
            }
        }
    }

    public final void C() {
        y yVar = this.F;
        if (yVar != null) {
            boolean z10 = this.o0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.v()) {
                        if (!z10) {
                            yVar.b.A(q0Var.U(z11));
                        }
                        q0Var.Q("", false);
                        q0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void D(RecyclerView recyclerView, int i7, int i10) {
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        oi.u4 u4Var = new oi.u4(18, this, recyclerView);
        recyclerView.j(new bi.z4(u4Var, 26));
        if (this.z1) {
            u4Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    public final void F(int i7, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.r0 = i7;
            if (this.K && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(j6.h0(i7, 1, -1));
            }
            d dVar = this.G;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.q0 = i7;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.h0(i7, 1, -1));
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.s();
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void H(int i7, boolean z10) {
        if (z10) {
            this.t0 = i7;
            d dVar = this.G;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof x1) {
                    ((x1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i7;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof x1) {
                    ((x1) drawable2).a(i7);
                } else if (drawable2 instanceof p4) {
                    ((p4) drawable2).j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.F;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.d1) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
    }

    public final void I(int i7, boolean z10) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).I(i7);
                }
                i10++;
            }
            return;
        }
        if (z10 || (yVar = this.F) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = yVar.getChildAt(i10);
            if (childAt2 instanceof q0) {
                ((q0) childAt2).I(i7);
            }
            i10++;
        }
    }

    public final void J(int i7, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).P(i7, z10);
                }
                i10++;
            }
            return;
        }
        if (z11 || (yVar = this.F) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = yVar.getChildAt(i10);
            if (childAt2 instanceof q0) {
                ((q0) childAt2).P(i7, z10);
            }
            i10++;
        }
    }

    public final void K(int i7, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.G) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else {
            if (z10 || (yVar = this.F) == null) {
                return;
            }
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void L(int i7, boolean z10) {
        y yVar = this.F;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.v()) {
                        if (z10) {
                            q0Var.getSearchField().setHintTextColor(i7);
                            return;
                        } else {
                            q0Var.getSearchField().setTextColor(i7);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, org.telegram.ui.Components.e5 e5Var) {
        j5[] j5VarArr = this.n;
        if (charSequence != null && j5VarArr[0] == null) {
            u(0);
        }
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setVisibility((charSequence == null || this.o0) ? 4 : 0);
            j5 j5Var2 = j5VarArr[0];
            this.d0 = charSequence;
            j5Var2.k(charSequence);
            if (this.D0) {
                Drawable drawable = this.e0;
                if (drawable instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable).l(null);
                }
            }
            j5 j5Var3 = j5VarArr[0];
            this.e0 = e5Var;
            j5Var3.i(e5Var);
            if (this.D0) {
                Drawable drawable2 = this.e0;
                if (drawable2 instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable2).l(j5VarArr[0]);
                }
            }
            j5VarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.x0 && !TextUtils.isEmpty(this.B0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            i20.m(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            if (j5Var.getParent() != null) {
                ((ViewGroup) j5VarArr[1].getParent()).removeView(j5VarArr[1]);
            }
            j5VarArr[1] = null;
        }
        j5VarArr[1] = j5VarArr[0];
        j5VarArr[0] = null;
        setTitle(charSequence);
        this.z0 = z10;
        j5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            j5 j5Var2 = j5VarArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            if (!z10) {
                L = -L;
            }
            j5Var2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = j5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.y0 = true;
        ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
        if (!z11) {
            int L2 = org.telegram.messenger.g0.L(20.0f);
            if (z10) {
                L2 = -L2;
            }
            alpha.translationY(L2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j3).setListener(new g(this, z11, z10, 0)).start();
        requestLayout();
    }

    public final void O(String str, int i7, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        j5 j5Var;
        int indexOf;
        if (!this.c0 || this.u0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.h0;
        objArr[0] = str;
        int i10 = 1;
        objArr[1] = Integer.valueOf(i7);
        objArr[2] = runnable;
        if (this.j1) {
            return;
        }
        String str2 = this.g0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.g0 = str;
            if (this.y1 != null) {
                this.y1.b(i7 == 2131751805 ? org.telegram.messenger.g0.I2(hd.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            }
            CharSequence M0 = str != null ? hd.M0(i7, str) : this.d0;
            Drawable drawable = str == null ? this.e0 : null;
            ab.q qVar = this.P0;
            if (str == null || (indexOf = TextUtils.indexOf(M0, "...")) < 0) {
                z10 = false;
                charSequence = M0;
            } else {
                SpannableString valueOf = SpannableString.valueOf(M0);
                qVar.F(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.j0 = str != null;
            j5[] j5VarArr = this.n;
            if ((charSequence == null || j5VarArr[0] != null) && getMeasuredWidth() != 0 && ((j5Var = j5VarArr[0]) == null || j5Var.getVisibility() == 0)) {
                j5 j5Var2 = j5VarArr[0];
                if (j5Var2 != null) {
                    j5Var2.animate().cancel();
                    j5 j5Var3 = j5VarArr[1];
                    if (j5Var3 != null) {
                        j5Var3.animate().cancel();
                    }
                    if (j5VarArr[1] == null) {
                        u(1);
                    }
                    j5VarArr[1].k(charSequence);
                    j5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    j5VarArr[1].i(drawable);
                    j5VarArr[1].setRightDrawableOnClick(this.f0);
                    if (drawable instanceof org.telegram.ui.Components.e5) {
                        ((org.telegram.ui.Components.e5) drawable).l(j5VarArr[1]);
                    }
                    if (z10) {
                        qVar.c(j5VarArr[1]);
                    }
                    this.j1 = true;
                    float alpha = j5VarArr[0].getAlpha();
                    j5 j5Var4 = j5VarArr[1];
                    j5VarArr[1] = j5VarArr[0];
                    j5VarArr[0] = j5Var4;
                    j5Var4.setAlpha(0.0f);
                    j5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                    j5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha2 = j5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                    } else {
                        alpha2.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.A0 = true;
                    alpha2.setDuration(220L).setListener(new e(this, i10)).start();
                }
            } else {
                u(0);
                if (this.S) {
                    j5VarArr[0].invalidate();
                    invalidate();
                }
                j5VarArr[0].k(charSequence);
                j5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                j5VarArr[0].i(drawable);
                j5VarArr[0].setRightDrawableOnClick(this.f0);
                if (drawable instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable).l(j5VarArr[0]);
                }
                if (z10) {
                    qVar.c(j5VarArr[0]);
                } else {
                    qVar.x(j5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.i0;
            }
            this.k0 = runnable;
        }
    }

    public final void P(dh.c cVar, gh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z10;
        this.V0 = cVar;
        this.W0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.a = c10;
        if (z10) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        i20.r(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        i20.r(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.c = c12;
        y yVar = this.F;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            j5[] j5VarArr = this.n;
            if (view == j5VarArr[0] || view == j5VarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void R(View[] viewArr, boolean[] zArr) {
        if (this.G == null || this.K) {
            return;
        }
        int i7 = 1;
        this.K = true;
        m();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<d, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.R = viewArr;
        if (this.x == 0) {
            if (!this.o0) {
                j5 j5Var = this.n[0];
                if (j5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<j5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<j5, Float>) property, 0.0f));
                }
            }
            y yVar = this.F;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 0.0f));
            }
        }
        int i10 = this.x;
        if (i10 == 0) {
            i10 = this.y;
        }
        if (i10 == 0 || this.Q0) {
            ns.e().k(ns.r4, new Object[0]);
        } else if (i0.a.h(i10) < 0.699999988079071d) {
            org.telegram.messenger.g0.p3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.p3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.f1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i7));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new ah.l(13, this, zArr));
        this.Q.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof x1) {
                ((x1) drawable).c(true, 1.0f);
            }
            this.e.setBackgroundDrawable(j6.h0(this.r0, 1, -1));
        }
    }

    public final void S() {
        boolean z10 = this.D0 && this.E0;
        if (this.F0 != z10) {
            this.F0 = z10;
            ab.q qVar = this.P0;
            if (!z10) {
                qVar.a = false;
                ((AnimatorSet) qVar.c).cancel();
                return;
            }
            qVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) qVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final boolean b(q0 q0Var, RectF rectF) {
        int L = org.telegram.messenger.g0.L(6.0f);
        if (q0Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f10 = L;
            rectF.inset(f10, f10);
            return true;
        }
        float L2 = org.telegram.messenger.g0.L(46.0f) / 2.0f;
        View view = (View) q0Var.getParent();
        float width = (q0Var.getWidth() / 2.0f) + q0Var.getX() + (view != null ? view.getX() : 0.0f);
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + r0) / 2.0f)) + L2;
        rectF.set(width - L2, height - L2, width + L2, height + L2);
        return false;
    }

    public final boolean c(String str) {
        if (this.G == null) {
            return false;
        }
        String str2 = this.H;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean d() {
        return true;
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
        float f10;
        int i7;
        fh.g gVar;
        q0 q0Var;
        j5[] j5VarArr;
        j5 j5Var;
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i10 = this.s1 ? this.q1 : (int) this.o1.f;
        if (this.t1) {
            i10 = Math.max((int) ((1.0f - this.l1) * this.r1), i10);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L2) / 2)) - L;
        int i11 = L * 2;
        int i12 = height + L2 + i11;
        fh.g gVar2 = this.a;
        te.a aVar = this.p1;
        if (gVar2 == null || this.R0 || !this.w1) {
            f10 = 1.0f;
        } else {
            if (!this.I0 || (j5Var = (j5VarArr = this.n)[0]) == null || j5Var.getVisibility() != 0) {
                f10 = 1.0f;
                int i13 = ((this.s1 || this.t1) ? i10 > 0 ? L : 0 : (int) (L * aVar.e)) + i10;
                int i14 = L + L2;
                int max = Math.max(i13, i14);
                i7 = 2;
                sn snVar = this.T0;
                te.a aVar2 = this.n1;
                int W1 = org.telegram.messenger.g0.W1(snVar == null ? 0.0f : 1.0f - aVar2.e, i13, max);
                int W12 = org.telegram.messenger.g0.W1(this.T0 != null ? 1.0f - aVar2.e : 0.0f, z10 ? i14 : 0, i14);
                int width = getWidth() - W1;
                int i15 = width - W12;
                if (this.T0 != null) {
                    int W13 = org.telegram.messenger.g0.W1(Math.max(this.l1, actionModeFactor), Math.min(i15, ((int) this.m1.f) + i11), i15);
                    W12 = ((width + W12) - W13) / 2;
                    width = W12 + W13;
                    float L3 = org.telegram.messenger.g0.L(3.0f) + ((W12 - ((ViewGroup.MarginLayoutParams) this.T0.getLayoutParams()).leftMargin) - this.T0.getLeftPadding()) + L;
                    this.T0.setTranslationX(L3);
                    this.T0.setPivotX((r4.getMeasuredWidth() / 2.0f) - L3);
                }
                this.a.setBounds(W12, height, width, i12);
                if (!this.U0) {
                    this.a.draw(canvas);
                }
                gVar = this.b;
                if (gVar != null && z10) {
                    gVar.setBounds(0, height, L2 + i11, i12);
                    this.b.draw(canvas);
                }
                if (this.c != null && i10 > 0 && !this.R0 && !this.v1 && ((q0Var = this.b1) == null || q0Var.getParent() != this.F || !b(this.b1, this.c1))) {
                    this.c.setBounds((getWidth() - Math.max(L2, i10)) - i11, height, getWidth(), i12);
                    this.c.setAlpha(!this.s1 ? 255 : (int) (aVar.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.M0 && this.y != 0) {
                    this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i16 = this.y;
                    Paint paint = this.N0;
                    paint.setColor(i16);
                    if (this.z1) {
                        this.L0.H(canvas, getY(), this.O0, paint, true);
                    } else {
                        st0 st0Var = this.L0;
                        float y10 = getY();
                        float f11 = f10 - (this.A1 ? f10 : this.E1);
                        st0Var.getClass();
                        st0Var.I(canvas, y10, this.O0, paint, true, org.telegram.messenger.g0.W1(f11, ns.e4, Color.alpha(j6.w0((st0.E() && gz.o() == i7) ? j6.og : j6.pg, st0Var.getResourceProvider()))));
                    }
                }
                this.u1 = true;
                if (this.k1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            }
            f10 = 1.0f;
            int L4 = org.telegram.messenger.g0.L(48.0f) + ((int) Math.ceil(j5VarArr[0].getTextWidth())) + i11;
            int round = Math.round(j5VarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
            this.a.setBounds(round, height, L4 + round, i12);
            if (!this.U0) {
                this.a.draw(canvas);
            }
        }
        i7 = 2;
        gVar = this.b;
        if (gVar != null) {
            gVar.setBounds(0, height, L2 + i11, i12);
            this.b.draw(canvas);
        }
        if (this.c != null) {
            this.c.setBounds((getWidth() - Math.max(L2, i10)) - i11, height, getWidth(), i12);
            this.c.setAlpha(!this.s1 ? 255 : (int) (aVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.M0) {
            this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i162 = this.y;
            Paint paint2 = this.N0;
            paint2.setColor(i162);
            if (this.z1) {
            }
        }
        this.u1 = true;
        if (this.k1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View v = v(this, f10, f11, this.T0);
            if (v == null) {
                v = v(this, f10, f11, null);
            }
            fh.g gVar = this.a;
            boolean z10 = gVar != null && gVar.getBounds().contains(x10, y10);
            if (v != null && v != this.T0) {
                fh.g gVar2 = this.b;
                boolean z11 = z10 | (gVar2 != null && gVar2.getBounds().contains(x10, y10));
                fh.g gVar3 = this.c;
                z10 = z11 | (gVar3 != null && gVar3.getBounds().contains(x10, y10));
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        Drawable B0;
        float f10;
        float f11;
        boolean z11;
        kz kzVar;
        q0 q0Var;
        e2 e2Var = this.u0;
        if (e2Var != null && e2Var.getParentLayout() != null) {
            this.u0.getParentLayout().getClass();
        }
        boolean z12 = true;
        if (this.C0 && view == this.e) {
            return true;
        }
        if (view == this.F && (q0Var = this.b1) != null && q0Var != null && q0Var.getParent() == this.F && b(this.b1, this.c1)) {
            return true;
        }
        boolean Q = Q(view);
        if (Q) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.J ? org.telegram.messenger.g0.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.S && !this.j0 && !hd.a0) {
            j5[] j5VarArr = this.n;
            if ((view == j5VarArr[0] || view == j5VarArr[1] || (view == this.G0 && this.H0)) && (B0 = j6.B0()) != null) {
                j5 j5Var = view == this.G0 ? j5VarArr[0] : (j5) view;
                if (j5Var != null && j5Var.getVisibility() == 0 && (j5Var.getText() instanceof String)) {
                    TextPaint textPaint = j5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.V);
                    textPaint.getTextBounds((String) j5Var.getText(), 0, 1, this.a0);
                    int width = ((this.a0.width() - (B0.getIntrinsicWidth() + j6.D1)) / 2) + j5Var.getTextStartX() + j6.D1;
                    f10 = 255.0f;
                    f11 = 1.0f;
                    int textStartY = j5Var.getTextStartY() + j6.E1 + ((int) Math.ceil((j5Var.getTextHeight() - this.a0.height()) / 2.0f)) + ((int) ((1.0f - this.G0.getScaleY()) * org.telegram.messenger.g0.L(8.0f)));
                    B0.setBounds(width, textStartY - B0.getIntrinsicHeight(), B0.getIntrinsicWidth() + width, textStartY);
                    B0.setAlpha((int) (j5Var.getAlpha() * this.G0.getAlpha() * 255.0f));
                    B0.draw(canvas);
                    if (this.j1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                    f11 = 1.0f;
                }
                if (j6.G1) {
                    if (this.T == null) {
                        this.T = new du0(0);
                    }
                } else if (!this.W && this.T != null) {
                    this.T = null;
                }
                du0 du0Var = this.T;
                if (du0Var != null) {
                    du0Var.b(canvas, this);
                } else {
                    lz lzVar = this.U;
                    if (lzVar != null) {
                        ArrayList arrayList = (ArrayList) lzVar.d;
                        ArrayList arrayList2 = (ArrayList) lzVar.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                kz kzVar2 = (kz) arrayList2.get(i7);
                                Paint paint = (Paint) kzVar2.k.b;
                                paint.setColor(kzVar2.j);
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f) * kzVar2.i);
                                paint.setAlpha((int) (kzVar2.f * f10));
                                canvas.drawPoint(kzVar2.a, kzVar2.b, paint);
                            }
                            SecureRandom secureRandom = Utilities.b;
                            if (secureRandom.nextBoolean() && arrayList2.size() + 8 < 150) {
                                int i10 = org.telegram.messenger.g0.m;
                                float nextFloat = secureRandom.nextFloat() * getMeasuredWidth();
                                float f12 = 20.0f;
                                float nextFloat2 = (secureRandom.nextFloat() * org.telegram.messenger.k5.z(20.0f, getMeasuredHeight(), i10)) + i10;
                                int nextInt = secureRandom.nextInt(4);
                                int i11 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                int i12 = 0;
                                while (i12 < 8) {
                                    SecureRandom secureRandom2 = Utilities.b;
                                    float f13 = f12;
                                    boolean z13 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(ns.t4) - 225) * 0.017453292519943295d;
                                    boolean z14 = z12;
                                    int i13 = i11;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        kzVar = new kz(lzVar);
                                    } else {
                                        kzVar = (kz) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    kzVar.a = nextFloat;
                                    kzVar.b = nextFloat2;
                                    kzVar.c = cos * 1.5f;
                                    kzVar.d = sin;
                                    i11 = i13;
                                    kzVar.j = i11;
                                    float f14 = f11;
                                    kzVar.f = f14;
                                    kzVar.h = 0.0f;
                                    kzVar.i = Math.max(f14, secureRandom2.nextFloat() * 1.5f);
                                    kzVar.g = secureRandom2.nextInt(1000) + 1000;
                                    kzVar.e = (secureRandom2.nextFloat() * 4.0f) + f13;
                                    arrayList2.add(kzVar);
                                    i12++;
                                    drawChild = z13;
                                    z12 = z14;
                                    f12 = f13;
                                    f11 = 1.0f;
                                }
                            }
                            boolean z15 = z12;
                            z10 = drawChild;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - lzVar.a);
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                kz kzVar3 = (kz) arrayList2.get(i14);
                                float f15 = kzVar3.h;
                                float f16 = kzVar3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(kzVar3);
                                    }
                                    arrayList2.remove(i14);
                                    i14--;
                                    size2--;
                                    z11 = z15;
                                } else {
                                    z11 = z15;
                                    kzVar3.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f15 / f16);
                                    float f17 = kzVar3.a;
                                    float f18 = kzVar3.c;
                                    float f19 = kzVar3.e;
                                    float f20 = min;
                                    kzVar3.a = a8.p0.f(f18 * f19, f20, 500.0f, f17);
                                    float f21 = kzVar3.b;
                                    float f22 = kzVar3.d;
                                    kzVar3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    kzVar3.d = (f20 / 100.0f) + f22;
                                    kzVar3.h += f20;
                                }
                                i14++;
                                z15 = z11;
                            }
                            lzVar.a = currentTimeMillis;
                            invalidate();
                            if (Q) {
                                canvas.restore();
                            }
                            return z10;
                        }
                    }
                }
            }
        }
        z10 = drawChild;
        if (Q) {
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final fh.g g(g5 g5Var) {
        dh.c cVar = this.X0;
        if (cVar == null) {
            cVar = this.V0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(g5Var, null, false);
        c10.p(this.W0);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.v0;
    }

    public y getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        d dVar = this.G;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.y1;
    }

    public j5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public k4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.W0;
        if (eVar != null) {
            return eVar.a(eVar.e);
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getButtonsGlassColorProvider() {
        return this.W0;
    }

    public boolean getCastShadows() {
        return this.l0;
    }

    public int getExtraHeight() {
        return this.P;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.P;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public e6 getMenuResourcesProvider() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public int getMenuRise() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuView() {
        return this.F;
    }

    public boolean getOccupyStatusBar() {
        return this.J;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public g5 getOpenMenuOverlay() {
        return this.a1;
    }

    public i9 getSearchAvatarImageView() {
        return this.f;
    }

    public int getShadowAlpha() {
        return this.m0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.r == null || (charSequence = this.B0) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public int getSubtitleColorInternal() {
        j5 j5Var = this.r;
        if (j5Var != null) {
            return j5Var.getTextColor();
        }
        return 0;
    }

    public j5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        j5 j5Var = this.n[0];
        if (j5Var == null) {
            return null;
        }
        return j5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        j5 j5Var = this.n[0];
        if (j5Var != null) {
            return j5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return this.n[0];
    }

    public j5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final void h(g5 g5Var, q0 q0Var) {
        this.a1 = g5Var;
        this.b1 = q0Var;
        invalidate();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.z1) {
            float f10 = this.A1 ? 1.0f : this.E1;
            int i7 = this.C1;
            e6 e6Var = this.K0;
            int w02 = i7 == -1 ? 0 : j6.w0(i7, e6Var);
            int i10 = this.B1;
            int w03 = i10 == -1 ? 0 : j6.w0(i10, e6Var);
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f10, w02, w03));
            setShadowAlpha((int) ((1.0f - f10) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void j() {
        if (hd.a0) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new i(0));
        this.A0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) er.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void k(boolean z10) {
        sn snVar = this.T0;
        if (snVar == null) {
            return;
        }
        on onVar = snVar.e;
        boolean z11 = onVar != null && onVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.T0.getVisualWidth());
        te.c cVar = this.m1;
        if (z10) {
            float f10 = min;
            if ((cVar.h ? cVar.g : cVar.f) != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(min);
        }
        this.n1.a(z11, z10);
    }

    public final void l() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i7 = ((drawable instanceof x1) || (drawable instanceof p4)) ? 2 : 0;
        if (this.e.getLayerType() != i7) {
            this.e.setLayerType(i7, null);
            this.e.invalidate();
        }
    }

    public final void m() {
        y yVar = this.F;
        int max = Math.max(0, yVar != null ? (yVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
        d dVar = this.G;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
        org.telegram.messenger.g0.L(46.0f);
        if (this.K) {
            max = max2;
        }
        this.p1.a(max > 0, this.u1);
        te.c cVar = this.o1;
        float f10 = max;
        if ((cVar.h ? cVar.g : cVar.f) != f10) {
            if (this.u1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public void n(boolean z10) {
        y yVar;
        if (!this.o0 || (yVar = this.F) == null) {
            return;
        }
        yVar.i(z10);
    }

    public final y o() {
        return p(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        S();
        if (this.K) {
            int i7 = this.x;
            if (i7 == 0) {
                i7 = this.y;
            }
            if (i7 == 0 || this.Q0) {
                ns.e().k(ns.r4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.p3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.p3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        S();
        if (this.K) {
            int i7 = this.y;
            if (i7 == 0 || this.x == 0 || this.Q0) {
                ns.e().k(ns.r4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.p3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.p3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.S && !this.j0 && !hd.a0 && motionEvent.getAction() == 0 && (B0 = j6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            du0 du0Var = this.T;
            j5[] j5VarArr = this.n;
            if (du0Var == null) {
                this.U = null;
                this.T = new du0(0);
                j5VarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                lz lzVar = new lz();
                lzVar.c = new ArrayList();
                lzVar.d = new ArrayList();
                Paint paint = new Paint(1);
                lzVar.b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(j6.x0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) lzVar.d).add(new kz(lzVar));
                }
                this.U = lzVar;
                j5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.J0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        j5[] j5VarArr;
        int measuredWidth;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int currentActionBarHeight;
        int i18 = this.J ? org.telegram.messenger.g0.m : 0;
        if (this.i1 != getMeasuredWidth()) {
            this.i1 = getMeasuredWidth();
            k(this.m1.h);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.g0.L(this.Q0 ? 24.0f : org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i18, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i18);
            L = org.telegram.messenger.g0.L(this.Q0 ? 76.0f : org.telegram.messenger.g0.Q1() ? 80.0f : 72.0f);
        }
        int i19 = L + this.h1;
        y yVar = this.F;
        if (yVar != null && yVar.getVisibility() != 8) {
            int L2 = this.F.p() ? org.telegram.messenger.g0.L(this.n0 ? 0.0f : org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f) : getMeasuredWidth() - this.F.getMeasuredWidth();
            y yVar2 = this.F;
            yVar2.layout(L2, i18, yVar2.getMeasuredWidth() + L2, this.F.getMeasuredHeight() + i18);
        }
        int i20 = 0;
        while (true) {
            j5VarArr = this.n;
            if (i20 >= 2) {
                break;
            }
            j5 j5Var = j5VarArr[i20];
            if (j5Var != null && j5Var.getVisibility() != 8) {
                boolean z11 = this.z0;
                if (((z11 && i20 == 0) || (!z11 && i20 == 1)) && this.x0 && this.y0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - j5VarArr[i20].getTextHeight()) / 2;
                } else {
                    j5 j5Var2 = this.r;
                    currentActionBarHeight = (j5Var2 == null || j5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - j5VarArr[i20].getTextHeight()) / 2 : org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + org.telegram.messenger.g0.L(2.0f) + (((getCurrentActionBarHeight() / 2) - j5VarArr[i20].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.I0 ? (getMeasuredWidth() - j5VarArr[i20].getMeasuredWidth()) / 2 : i19;
                j5 j5Var3 = j5VarArr[i20];
                int i21 = currentActionBarHeight + i18;
                j5Var3.layout(measuredWidth2, i21 - j5Var3.getPaddingTop(), j5VarArr[i20].getMeasuredWidth() + measuredWidth2, j5VarArr[i20].getPaddingBottom() + ((j5VarArr[i20].getTextHeight() + i21) - j5VarArr[i20].getPaddingTop()));
            }
            i20++;
        }
        if (this.y1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.y1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            fi.j jVar = this.y1;
            int i22 = currentActionBarHeight2 + i18;
            jVar.layout(i19, i22, jVar.getMeasuredWidth() + i19, this.y1.getMeasuredHeight() + i22);
        }
        j5 j5Var4 = this.r;
        if (j5Var4 != null && j5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            int measuredWidth3 = this.I0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i19;
            j5 j5Var5 = this.r;
            int i23 = currentActionBarHeight3 + i18;
            j5Var5.layout(measuredWidth3, i23, j5Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i23);
        }
        j5 j5Var6 = this.s;
        if (j5Var6 != null && j5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!org.telegram.messenger.g0.Q1()) {
                int i24 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - org.telegram.messenger.g0.L(1.0f);
            j5 j5Var7 = this.s;
            int i25 = L3 + i18;
            j5Var7.layout(i19, i25, j5Var7.getMeasuredWidth() + i19, this.s.getTextHeight() + i25);
        }
        i9 i9Var = this.f;
        if (i9Var != null) {
            i9Var.layout(org.telegram.messenger.g0.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i18, this.f.getMeasuredWidth() + org.telegram.messenger.g0.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i18);
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != this.y1 && childAt != this.r && childAt != this.F && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i27 = layoutParams.gravity;
                if (i27 == -1) {
                    i27 = 51;
                }
                int i28 = i27 & ns.x1;
                int i29 = i27 & 7;
                if (i29 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth4) / 2) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i29 != 5) {
                    i14 = layoutParams.leftMargin;
                    if (i28 != 16) {
                        i15 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    } else if (i28 != 80) {
                        i17 = layoutParams.topMargin;
                        childAt.layout(i14, i17, measuredWidth4 + i14, measuredHeight + i17);
                    } else {
                        i15 = (i12 - i10) - measuredHeight;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    childAt.layout(i14, i17, measuredWidth4 + i14, measuredHeight + i17);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth4;
                    i13 = layoutParams.rightMargin;
                }
                i14 = measuredWidth - i13;
                if (i28 != 16) {
                }
                i17 = i15 - i16;
                childAt.layout(i14, i17, measuredWidth4 + i14, measuredHeight + i17);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int L;
        j5[] j5VarArr;
        j5 j5Var;
        int i11;
        j5 j5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i12 = 1;
        kVar.I = true;
        View view = kVar.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.m;
        }
        d dVar = kVar.G;
        if (dVar != null) {
            dVar.setPadding(0, kVar.J ? org.telegram.messenger.g0.m : 0, 0, 0);
        }
        kVar.I = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.J ? org.telegram.messenger.g0.m : 0) + kVar.P);
        ImageView imageView = kVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f);
        } else {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 80.0f : 72.0f);
        }
        y yVar = kVar.F;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (kVar.F.p() && !kVar.o0) {
                kVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k10 = kVar.F.k();
                if (kVar.n0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.F.k() + (size - org.telegram.messenger.g0.L(f10)), TLObject.FLAG_30);
                if (!kVar.E) {
                    kVar.F.r(-k10);
                }
            } else if (kVar.o0) {
                if (kVar.n0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = i20.c(f10, size, TLObject.FLAG_30);
                if (!kVar.E) {
                    kVar.F.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.E) {
                    kVar.F.r(0.0f);
                }
            }
            kVar.F.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i13 = 0;
        while (true) {
            j5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            j5 j5Var3 = j5VarArr[0];
            if ((j5Var3 == null || j5Var3.getVisibility() == 8) && ((j5Var = kVar.r) == null || j5Var.getVisibility() == 8)) {
                i11 = i12;
            } else {
                y yVar2 = kVar.F;
                int measuredWidth = yVar2 != null ? yVar2.getMeasuredWidth() : 0;
                int max = Math.max(kVar.I0 ? size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + measuredWidth) + kVar.b0) * 2) : org.telegram.messenger.k5.z(16.0f, size - measuredWidth, L) - kVar.b0, 0);
                boolean z10 = kVar.z0;
                int i14 = 20;
                if (((z10 && i13 == 0) || (!z10 && i13 == i12)) && kVar.x0 && kVar.y0) {
                    j5 j5Var4 = j5VarArr[i13];
                    i11 = i12;
                    if (kVar.Q0) {
                        i14 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    j5Var4.setTextSize(i14);
                } else {
                    i11 = i12;
                    j5 j5Var5 = j5VarArr[0];
                    if (j5Var5 == null || j5Var5.getVisibility() == 8 || (j5Var2 = kVar.r) == null || j5Var2.getVisibility() == 8) {
                        j5 j5Var6 = j5VarArr[i13];
                        if (j5Var6 != null && j5Var6.getVisibility() != 8) {
                            j5 j5Var7 = j5VarArr[i13];
                            if (kVar.Q0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            j5Var7.setTextSize(i14);
                        }
                        j5 j5Var8 = kVar.r;
                        if (j5Var8 != null && j5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        j5 j5Var9 = kVar.s;
                        if (j5Var9 != null) {
                            j5Var9.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        j5 j5Var10 = j5VarArr[i13];
                        if (j5Var10 != null) {
                            if (kVar.Q0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i14 = 18;
                            }
                            j5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        j5 j5Var11 = kVar.s;
                        if (j5Var11 != null) {
                            j5Var11.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        }
                    }
                }
                j5 j5Var12 = j5VarArr[i13];
                if (j5Var12 != null && j5Var12.getVisibility() != 8) {
                    j5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(j5VarArr[i13].getPaddingBottom() + j5VarArr[i13].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    if (kVar.A0) {
                        CharSequence text = j5VarArr[i13].getText();
                        j5 j5Var13 = j5VarArr[i13];
                        j5Var13.setPivotX(j5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        j5VarArr[i13].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        j5VarArr[i13].setPivotX(0.0f);
                        j5VarArr[i13].setPivotY(0.0f);
                    }
                }
                j5 j5Var14 = kVar.r;
                if (j5Var14 != null && j5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                fi.j jVar = kVar.y1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                j5 j5Var15 = kVar.s;
                if (j5Var15 != null && j5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = i11;
        }
        int i15 = i12;
        i9 i9Var = kVar.f;
        if (i9Var != null) {
            i9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = kVar.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[i15] && childAt != kVar.y1 && childAt != kVar.r && childAt != kVar.F && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i16++;
            kVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.N;
    }

    public final y p(String str) {
        if (c(str)) {
            return this.G;
        }
        d dVar = this.G;
        if (dVar != null) {
            removeView(dVar);
            this.G = null;
        }
        this.H = str;
        d dVar2 = new d(this, getContext(), this);
        this.G = dVar2;
        dVar2.setTranslationX(this.Q0 ? -org.telegram.messenger.g0.L(10.0f) : 0.0f);
        this.G.setGlassMode(this.Q0);
        d dVar3 = this.G;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.Q0) {
            q6.h(j6.w8, this.G, this.K0);
        }
        addView(this.G, indexOfChild(this.e));
        this.G.setPadding(0, this.J ? org.telegram.messenger.g0.m : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.P;
        layoutParams.gravity = 5;
        this.G.setLayoutParams(layoutParams);
        this.G.setVisibility(4);
        return this.G;
    }

    public final void q() {
        if (this.s != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.s = j5Var;
        j5Var.setGravity(3);
        this.s.setVisibility(8);
        q6.X(this.s, j6.B8, this.K0);
        addView(this.s, 0, ja.e(-2, -2, 51));
    }

    public final void r() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.h0(this.q0, 1, -1));
        this.e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.e, ja.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(hd.M0(2131754878, null));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final y s() {
        y yVar = this.F;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.F = yVar2;
        addView(yVar2, 0, ja.e(-2, -1, 5));
        return this.F;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.v0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.G;
        if (dVar != null) {
            p6 p6Var = q6.a;
            dVar.setTag(R.id.theme_bind, null);
            this.G.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.w;
        if (view != null) {
            q6.q(view);
            this.w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        D(recyclerView, j6.a7, j6.s8);
    }

    public void setAddToContainer(boolean z10) {
        this.L = z10;
    }

    public void setAdditionalTextLeft(int i7) {
        this.h1 = i7;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.c0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.e == null) {
            r();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof x1) {
            x1 x1Var = (x1) drawable;
            x1Var.c(false, x() ? 1.0f : 0.0f);
            x1Var.b(this.t0);
            x1Var.a(this.s0);
        } else if (drawable instanceof p4) {
            p4 p4Var = (p4) drawable;
            p4Var.k = this.y;
            p4Var.j = this.s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.d1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        l();
    }

    public void setBackButtonImage(int i7) {
        if (this.e == null) {
            r();
        }
        this.e.setVisibility(i7 == 0 ? 8 : 0);
        this.e.setImageResource(i7);
        this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        l();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.y = i7;
        if (!this.M0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof p4) {
                ((p4) drawable).k = i7;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.l0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.l0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        if (this.I0 == z10) {
            return;
        }
        this.I0 = z10;
        j5[] j5VarArr = this.n;
        int length = j5VarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            j5 j5Var = j5VarArr[i7];
            if (j5Var != null) {
                j5Var.setGravity(z10 ? 17 : 19);
            }
            i7++;
        }
        j5 j5Var2 = this.r;
        if (j5Var2 != null) {
            j5Var2.setGravity(z10 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(sn snVar) {
        this.T0 = snVar;
    }

    public void setClipContent(boolean z10) {
        this.M = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.C0 = z10;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(st0 st0Var) {
        this.M0 = true;
        this.L0 = st0Var;
        st0Var.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.w1 != z10) {
            this.w1 = z10;
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
        y yVar = this.F;
        if (yVar != null) {
            yVar.setEnabled(z10);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        this.P = i7;
        d dVar = this.G;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.P;
            this.G.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.O = z10;
    }

    public void setForcedMenuMinWidth(int i7) {
        this.t1 = true;
        if (this.r1 != i7) {
            this.r1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.s1 = true;
        if (this.q1 != i7) {
            this.q1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.x1 != i7) {
            this.x1 = i7;
            invalidate();
        }
        fh.g gVar = this.a;
        if (gVar == null || gVar.c == i7) {
            return;
        }
        gVar.setAlpha(i7);
        invalidate();
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.N = z10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.Y0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.E = z10;
    }

    public void setMenuRise(int i7) {
        this.Z0 = i7;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.J = z10;
        d dVar = this.G;
        if (dVar != null) {
            dVar.setPadding(0, z10 ? org.telegram.messenger.g0.m : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.x0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
        j5[] j5VarArr = this.n;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setRightDrawableOnClick(onClickListener);
        }
        j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(i9 i9Var) {
        i9 i9Var2 = this.f;
        if (i9Var2 == i9Var) {
            return;
        }
        if (i9Var2 != null) {
            removeView(i9Var2);
        }
        this.f = i9Var;
        if (i9Var != null) {
            addView(i9Var);
        }
    }

    public void setSearchCursorColor(int i7) {
        y yVar = this.F;
        if (yVar != null) {
            yVar.setSearchCursorColor(i7);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.l1 != f10) {
            this.l1 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.F.setSearchFieldText(str);
    }

    public void setSearchFilter(jg.o0 o0Var) {
        y yVar = this.F;
        if (yVar != null) {
            yVar.setFilter(o0Var);
        }
    }

    public void setShadowAlpha(int i7) {
        if (this.m0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.m0 = i7;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.k1 != z10) {
            this.k1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            t();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.r.setVisibility((isEmpty || this.o0) ? 8 : 0);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.r == null) {
            t();
        }
        q6.q(this.r);
        this.r.setTextColor(i7);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.S = z10;
        if (z10) {
            this.V = new Paint.FontMetricsInt();
            this.a0 = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        M(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.k0 = runnable;
        this.i0 = runnable;
    }

    public void setTitleColor(int i7) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[0] == null) {
            u(0);
        }
        this.w0 = i7;
        q6.q(j5VarArr[0]);
        j5VarArr[0].setTextColor(i7);
        j5VarArr[0].setEmojiColor(i7);
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            q6.q(j5Var);
            j5VarArr[1].setTextColor(i7);
            j5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.b0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.n[0].setScrollNonFitText(z10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.M) {
            invalidate();
        }
    }

    public final void t() {
        if (this.r != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.r = j5Var;
        j5Var.setGravity(3);
        this.r.setVisibility(8);
        q6.X(this.r, j6.B8, this.K0);
        addView(this.r, 0, ja.e(-2, -2, 51));
    }

    public final void u(int i7) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[i7] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        j5VarArr[i7] = j5Var;
        j5Var.setGravity(this.I0 ? 17 : 19);
        int i10 = this.w0;
        if (i10 != 0) {
            j5VarArr[i7].setTextColor(i10);
        } else {
            q6.X(j5VarArr[i7], j6.A8, this.K0);
        }
        j5 j5Var2 = j5VarArr[i7];
        j5Var2.setEmojiColor(j5Var2.getTextColor());
        j5VarArr[i7].setTypeface(org.telegram.messenger.g0.o());
        j5VarArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        j5VarArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        j5VarArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.H0) {
            this.G0.addView(j5VarArr[i7], 0, ja.e(-2, -2, 51));
        } else {
            addView(j5VarArr[i7], 0, ja.e(-2, -2, 51));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        i();
        fh.g gVar = this.a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fi.j jVar = this.y1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void w() {
        d dVar = this.G;
        if (dVar == null || !this.K) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof q0) {
                ((q0) childAt).p();
            }
        }
        this.K = false;
        m();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<d, Float>) property, 0.0f));
        if (this.R != null) {
            int i11 = 0;
            while (true) {
                View[] viewArr = this.R;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.R[i11], (Property<View, Float>) property, 1.0f));
                }
                i11++;
            }
        }
        boolean z10 = this.o0;
        j5[] j5VarArr = this.n;
        if (!z10) {
            j5 j5Var = j5VarArr[0];
            if (j5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<j5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<j5, Float>) property, 1.0f));
            }
        }
        y yVar = this.F;
        if (yVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 1.0f));
        }
        int i12 = this.y;
        if (i12 == 0 || this.Q0) {
            ns.e().k(ns.r4, new Object[0]);
        } else if (i0.a.h(i12) < 0.699999988079071d) {
            org.telegram.messenger.g0.p3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.p3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.f1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i7));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new e(this, i7));
        this.Q.start();
        if (!this.o0) {
            j5 j5Var2 = j5VarArr[0];
            if (j5Var2 != null) {
                j5Var2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                this.r.setVisibility(0);
            }
        }
        y yVar2 = this.F;
        if (yVar2 != null) {
            yVar2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof x1) {
                ((x1) drawable).c(true, 0.0f);
            }
            this.e.setBackgroundDrawable(j6.h0(this.q0, 1, -1));
        }
    }

    public final boolean x() {
        return this.G != null && this.K;
    }

    public final boolean y(String str) {
        if (this.G == null || !this.K) {
            return false;
        }
        String str2 = this.H;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean z() {
        return false;
    }

    public void setAdaptiveBackground(lm0 lm0Var) {
        int i7 = j6.a7;
        int i10 = j6.s8;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        i();
        oi.u4 u4Var = new oi.u4(17, this, lm0Var);
        lm0Var.M.add(u4Var);
        if (this.z1) {
            u4Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = lm0Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
