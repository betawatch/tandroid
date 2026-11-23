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
import c8.ma;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.ru0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements te.b, b6, t4 {
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
    public bi.t2 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final h6 K0;
    public boolean L;
    public du0 L0;
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
    public ou0 T;
    public co T0;
    public uz U;
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
    public j5 a1;
    public fh.g b;
    public int b0;
    public q0 b1;
    public fh.g c;
    public boolean c0;
    public final RectF c1;
    public final n4 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public Drawable e0;
    public Runnable e1;
    public q9 f;
    public View.OnClickListener f0;
    public ru0 f1;
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
    public final m5[] n;
    public boolean n0;
    public final te.a n1;
    public boolean o0;
    public final te.c o1;
    public float p0;
    public final te.a p1;
    public int q0;
    public int q1;
    public m5 r;
    public int r0;
    public int r1;
    public m5 s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public g2 u0;
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

    public k(Context context, h6 h6Var) {
        super(context);
        this.d = n4.a;
        this.n = new m5[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = ls.e4;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new ab.q(this);
        this.c1 = new RectF();
        nr nrVar = nr.h;
        this.m1 = new te.c(0, this, nrVar, 380L);
        this.n1 = new te.a(0, this, nrVar, 380L, false);
        this.o1 = new te.c(0, this, nrVar, 320L);
        this.p1 = new te.a(0, this, nrVar, 320L, false);
        this.w1 = true;
        this.x1 = ls.e4;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = h6Var;
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
            m5 m5Var = this.n[0];
            if (m5Var != null) {
                arrayList.add(m5Var);
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
        q9 q9Var = this.f;
        if (q9Var != null) {
            q9Var.setVisibility(0);
            this.g1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<q9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new f(this, arrayList, z10, z11));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof s4) {
                s4 s4Var = (s4) drawable;
                s4Var.h = true;
                s4Var.a(true, z10 ? 1.0f : 0.0f);
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

    public final void E(RecyclerView recyclerView, int i7, int i10) {
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        z1 z1Var = new z1(2, this, recyclerView);
        recyclerView.j(new bi.u1(z1Var, 27));
        if (this.z1) {
            z1Var.run();
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
                imageView.setBackgroundDrawable(m6.h0(i7, 1, -1));
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
            imageView2.setBackgroundDrawable(m6.h0(i7, 1, -1));
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void G(int i7, boolean z10) {
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
                } else if (drawable2 instanceof s4) {
                    ((s4) drawable2).j = i7;
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

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
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

    public final void M(CharSequence charSequence, org.telegram.ui.Components.n5 n5Var) {
        m5[] m5VarArr = this.n;
        if (charSequence != null && m5VarArr[0] == null) {
            u(0);
        }
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            m5Var.setVisibility((charSequence == null || this.o0) ? 4 : 0);
            m5 m5Var2 = m5VarArr[0];
            this.d0 = charSequence;
            m5Var2.k(charSequence);
            if (this.D0) {
                Drawable drawable = this.e0;
                if (drawable instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable).l(null);
                }
            }
            m5 m5Var3 = m5VarArr[0];
            this.e0 = n5Var;
            m5Var3.i(n5Var);
            if (this.D0) {
                Drawable drawable2 = this.e0;
                if (drawable2 instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable2).l(m5VarArr[0]);
                }
            }
            m5VarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        m5[] m5VarArr = this.n;
        if (m5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.x0 && !TextUtils.isEmpty(this.B0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            o10.n(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        m5 m5Var = m5VarArr[1];
        if (m5Var != null) {
            if (m5Var.getParent() != null) {
                ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
            }
            m5VarArr[1] = null;
        }
        m5VarArr[1] = m5VarArr[0];
        m5VarArr[0] = null;
        setTitle(charSequence);
        this.z0 = z10;
        m5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            m5 m5Var2 = m5VarArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            if (!z10) {
                L = -L;
            }
            m5Var2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = m5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.y0 = true;
        ViewPropertyAnimator alpha = m5VarArr[1].animate().alpha(0.0f);
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
        m5 m5Var;
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
                this.y1.b(i7 == 2131751793 ? org.telegram.messenger.g0.I2(hd.N0(2131743870, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            }
            CharSequence N0 = str != null ? hd.N0(i7, str) : this.d0;
            Drawable drawable = str == null ? this.e0 : null;
            ab.q qVar = this.P0;
            if (str == null || (indexOf = TextUtils.indexOf(N0, "...")) < 0) {
                z10 = false;
                charSequence = N0;
            } else {
                SpannableString valueOf = SpannableString.valueOf(N0);
                qVar.F(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.j0 = str != null;
            m5[] m5VarArr = this.n;
            if ((charSequence == null || m5VarArr[0] != null) && getMeasuredWidth() != 0 && ((m5Var = m5VarArr[0]) == null || m5Var.getVisibility() == 0)) {
                m5 m5Var2 = m5VarArr[0];
                if (m5Var2 != null) {
                    m5Var2.animate().cancel();
                    m5 m5Var3 = m5VarArr[1];
                    if (m5Var3 != null) {
                        m5Var3.animate().cancel();
                    }
                    if (m5VarArr[1] == null) {
                        u(1);
                    }
                    m5VarArr[1].k(charSequence);
                    m5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    m5VarArr[1].i(drawable);
                    m5VarArr[1].setRightDrawableOnClick(this.f0);
                    if (drawable instanceof org.telegram.ui.Components.n5) {
                        ((org.telegram.ui.Components.n5) drawable).l(m5VarArr[1]);
                    }
                    if (z10) {
                        qVar.c(m5VarArr[1]);
                    }
                    this.j1 = true;
                    float alpha = m5VarArr[0].getAlpha();
                    m5 m5Var4 = m5VarArr[1];
                    m5VarArr[1] = m5VarArr[0];
                    m5VarArr[0] = m5Var4;
                    m5Var4.setAlpha(0.0f);
                    m5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                    m5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha2 = m5VarArr[1].animate().alpha(0.0f);
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
                    m5VarArr[0].invalidate();
                    invalidate();
                }
                m5VarArr[0].k(charSequence);
                m5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                m5VarArr[0].i(drawable);
                m5VarArr[0].setRightDrawableOnClick(this.f0);
                if (drawable instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable).l(m5VarArr[0]);
                }
                if (z10) {
                    qVar.c(m5VarArr[0]);
                } else {
                    qVar.y(m5VarArr[0]);
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
        o10.s(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        o10.s(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
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
            m5[] m5VarArr = this.n;
            if (view == m5VarArr[0] || view == m5VarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
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
                m5 m5Var = this.n[0];
                if (m5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<m5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<m5, Float>) property, 0.0f));
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
            ls.e().k(ls.u4, new Object[0]);
        } else if (i0.a.h(i10) < 0.699999988079071d) {
            org.telegram.messenger.g0.o3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.o3((Activity) getContext(), true);
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
            this.e.setBackgroundDrawable(m6.h0(this.r0, 1, -1));
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

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override // org.telegram.ui.ActionBar.t4
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

    @Override // org.telegram.ui.ActionBar.t4
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
        m5[] m5VarArr;
        m5 m5Var;
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
            if (!this.I0 || (m5Var = (m5VarArr = this.n)[0]) == null || m5Var.getVisibility() != 0) {
                f10 = 1.0f;
                int i13 = ((this.s1 || this.t1) ? i10 > 0 ? L : 0 : (int) (L * aVar.e)) + i10;
                int i14 = L + L2;
                int max = Math.max(i13, i14);
                i7 = 2;
                co coVar = this.T0;
                te.a aVar2 = this.n1;
                int W1 = org.telegram.messenger.g0.W1(coVar == null ? 0.0f : 1.0f - aVar2.e, i13, max);
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
                        du0 du0Var = this.L0;
                        float y10 = getY();
                        float f11 = f10 - (this.A1 ? f10 : this.E1);
                        du0Var.getClass();
                        du0Var.I(canvas, y10, this.O0, paint, true, org.telegram.messenger.g0.W1(f11, ls.e4, Color.alpha(m6.w0((du0.E() && cz.o() == i7) ? m6.og : m6.pg, du0Var.getResourceProvider()))));
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
            int L4 = org.telegram.messenger.g0.L(48.0f) + ((int) Math.ceil(m5VarArr[0].getTextWidth())) + i11;
            int round = Math.round(m5VarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
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
        tz tzVar;
        q0 q0Var;
        g2 g2Var = this.u0;
        if (g2Var != null && g2Var.getParentLayout() != null) {
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
            m5[] m5VarArr = this.n;
            if ((view == m5VarArr[0] || view == m5VarArr[1] || (view == this.G0 && this.H0)) && (B0 = m6.B0()) != null) {
                m5 m5Var = view == this.G0 ? m5VarArr[0] : (m5) view;
                if (m5Var != null && m5Var.getVisibility() == 0 && (m5Var.getText() instanceof String)) {
                    TextPaint textPaint = m5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.V);
                    textPaint.getTextBounds((String) m5Var.getText(), 0, 1, this.a0);
                    int width = ((this.a0.width() - (B0.getIntrinsicWidth() + m6.D1)) / 2) + m5Var.getTextStartX() + m6.D1;
                    f10 = 255.0f;
                    f11 = 1.0f;
                    int textStartY = m5Var.getTextStartY() + m6.E1 + ((int) Math.ceil((m5Var.getTextHeight() - this.a0.height()) / 2.0f)) + ((int) ((1.0f - this.G0.getScaleY()) * org.telegram.messenger.g0.L(8.0f)));
                    B0.setBounds(width, textStartY - B0.getIntrinsicHeight(), B0.getIntrinsicWidth() + width, textStartY);
                    B0.setAlpha((int) (m5Var.getAlpha() * this.G0.getAlpha() * 255.0f));
                    B0.draw(canvas);
                    if (this.j1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                    f11 = 1.0f;
                }
                if (m6.G1) {
                    if (this.T == null) {
                        this.T = new ou0(0);
                    }
                } else if (!this.W && this.T != null) {
                    this.T = null;
                }
                ou0 ou0Var = this.T;
                if (ou0Var != null) {
                    ou0Var.b(canvas, this);
                } else {
                    uz uzVar = this.U;
                    if (uzVar != null) {
                        ArrayList arrayList = (ArrayList) uzVar.d;
                        ArrayList arrayList2 = (ArrayList) uzVar.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                tz tzVar2 = (tz) arrayList2.get(i7);
                                Paint paint = (Paint) tzVar2.k.b;
                                paint.setColor(tzVar2.j);
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f) * tzVar2.i);
                                paint.setAlpha((int) (tzVar2.f * f10));
                                canvas.drawPoint(tzVar2.a, tzVar2.b, paint);
                            }
                            SecureRandom secureRandom = Utilities.b;
                            if (secureRandom.nextBoolean() && arrayList2.size() + 8 < 150) {
                                int i10 = org.telegram.messenger.g0.m;
                                float nextFloat = secureRandom.nextFloat() * getMeasuredWidth();
                                float f12 = 20.0f;
                                float nextFloat2 = (secureRandom.nextFloat() * org.telegram.messenger.f3.z(20.0f, getMeasuredHeight(), i10)) + i10;
                                int nextInt = secureRandom.nextInt(4);
                                int i11 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                int i12 = 0;
                                while (i12 < 8) {
                                    SecureRandom secureRandom2 = Utilities.b;
                                    float f13 = f12;
                                    boolean z13 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(ls.t4) - 225) * 0.017453292519943295d;
                                    boolean z14 = z12;
                                    int i13 = i11;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        tzVar = new tz(uzVar);
                                    } else {
                                        tzVar = (tz) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    tzVar.a = nextFloat;
                                    tzVar.b = nextFloat2;
                                    tzVar.c = cos * 1.5f;
                                    tzVar.d = sin;
                                    i11 = i13;
                                    tzVar.j = i11;
                                    float f14 = f11;
                                    tzVar.f = f14;
                                    tzVar.h = 0.0f;
                                    tzVar.i = Math.max(f14, secureRandom2.nextFloat() * 1.5f);
                                    tzVar.g = secureRandom2.nextInt(1000) + 1000;
                                    tzVar.e = (secureRandom2.nextFloat() * 4.0f) + f13;
                                    arrayList2.add(tzVar);
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
                            long min = Math.min(17L, currentTimeMillis - uzVar.a);
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                tz tzVar3 = (tz) arrayList2.get(i14);
                                float f15 = tzVar3.h;
                                float f16 = tzVar3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(tzVar3);
                                    }
                                    arrayList2.remove(i14);
                                    i14--;
                                    size2--;
                                    z11 = z15;
                                } else {
                                    z11 = z15;
                                    tzVar3.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f15 / f16);
                                    float f17 = tzVar3.a;
                                    float f18 = tzVar3.c;
                                    float f19 = tzVar3.e;
                                    float f20 = min;
                                    tzVar3.a = a8.p0.f(f18 * f19, f20, 500.0f, f17);
                                    float f21 = tzVar3.b;
                                    float f22 = tzVar3.d;
                                    tzVar3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    tzVar3.d = (f20 / 100.0f) + f22;
                                    tzVar3.h += f20;
                                }
                                i14++;
                                z15 = z11;
                            }
                            uzVar.a = currentTimeMillis;
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

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final fh.g g(j5 j5Var) {
        dh.c cVar = this.X0;
        if (cVar == null) {
            cVar = this.V0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(j5Var, null, false);
        c10.p(this.W0);
        o10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
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

    public m5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public n4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.W0;
        if (eVar != null) {
            return eVar.a(eVar.e);
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
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

    @Override // org.telegram.ui.ActionBar.t4
    public /* bridge */ /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* bridge */ /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* bridge */ /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* bridge */ /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public h6 getMenuResourcesProvider() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getMenuRise() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuView() {
        return this.F;
    }

    public boolean getOccupyStatusBar() {
        return this.J;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public j5 getOpenMenuOverlay() {
        return this.a1;
    }

    public q9 getSearchAvatarImageView() {
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
        m5 m5Var = this.r;
        if (m5Var != null) {
            return m5Var.getTextColor();
        }
        return 0;
    }

    public m5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        m5 m5Var = this.n[0];
        if (m5Var == null) {
            return null;
        }
        return m5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        m5 m5Var = this.n[0];
        if (m5Var != null) {
            return m5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public m5 getTitleTextView() {
        return this.n[0];
    }

    public m5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void h(j5 j5Var, q0 q0Var) {
        this.a1 = j5Var;
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
            h6 h6Var = this.K0;
            int w02 = i7 == -1 ? 0 : m6.w0(i7, h6Var);
            int i10 = this.B1;
            int w03 = i10 == -1 ? 0 : m6.w0(i10, h6Var);
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
        transitionSet.setInterpolator((TimeInterpolator) nr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void k(boolean z10) {
        co coVar = this.T0;
        if (coVar == null) {
            return;
        }
        yn ynVar = coVar.e;
        boolean z11 = ynVar != null && ynVar.getVisibility() == 0;
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
        int i7 = ((drawable instanceof x1) || (drawable instanceof s4)) ? 2 : 0;
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
                ls.e().k(ls.u4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.o3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.o3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.e0;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(this.n[0]);
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
                ls.e().k(ls.u4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.o3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.o3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.e0;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.S && !this.j0 && !hd.a0 && motionEvent.getAction() == 0 && (B0 = m6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            ou0 ou0Var = this.T;
            m5[] m5VarArr = this.n;
            if (ou0Var == null) {
                this.U = null;
                this.T = new ou0(0);
                m5VarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                uz uzVar = new uz();
                uzVar.c = new ArrayList();
                uzVar.d = new ArrayList();
                Paint paint = new Paint(1);
                uzVar.b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(m6.x0(null, m6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) uzVar.d).add(new tz(uzVar));
                }
                this.U = uzVar;
                m5VarArr[0].invalidate();
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
        m5[] m5VarArr;
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
            m5VarArr = this.n;
            if (i20 >= 2) {
                break;
            }
            m5 m5Var = m5VarArr[i20];
            if (m5Var != null && m5Var.getVisibility() != 8) {
                boolean z11 = this.z0;
                if (((z11 && i20 == 0) || (!z11 && i20 == 1)) && this.x0 && this.y0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - m5VarArr[i20].getTextHeight()) / 2;
                } else {
                    m5 m5Var2 = this.r;
                    currentActionBarHeight = (m5Var2 == null || m5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - m5VarArr[i20].getTextHeight()) / 2 : org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + org.telegram.messenger.g0.L(2.0f) + (((getCurrentActionBarHeight() / 2) - m5VarArr[i20].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.I0 ? (getMeasuredWidth() - m5VarArr[i20].getMeasuredWidth()) / 2 : i19;
                m5 m5Var3 = m5VarArr[i20];
                int i21 = currentActionBarHeight + i18;
                m5Var3.layout(measuredWidth2, i21 - m5Var3.getPaddingTop(), m5VarArr[i20].getMeasuredWidth() + measuredWidth2, m5VarArr[i20].getPaddingBottom() + ((m5VarArr[i20].getTextHeight() + i21) - m5VarArr[i20].getPaddingTop()));
            }
            i20++;
        }
        if (this.y1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.y1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            fi.j jVar = this.y1;
            int i22 = currentActionBarHeight2 + i18;
            jVar.layout(i19, i22, jVar.getMeasuredWidth() + i19, this.y1.getMeasuredHeight() + i22);
        }
        m5 m5Var4 = this.r;
        if (m5Var4 != null && m5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            int measuredWidth3 = this.I0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i19;
            m5 m5Var5 = this.r;
            int i23 = currentActionBarHeight3 + i18;
            m5Var5.layout(measuredWidth3, i23, m5Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i23);
        }
        m5 m5Var6 = this.s;
        if (m5Var6 != null && m5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!org.telegram.messenger.g0.Q1()) {
                int i24 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - org.telegram.messenger.g0.L(1.0f);
            m5 m5Var7 = this.s;
            int i25 = L3 + i18;
            m5Var7.layout(i19, i25, m5Var7.getMeasuredWidth() + i19, this.s.getTextHeight() + i25);
        }
        q9 q9Var = this.f;
        if (q9Var != null) {
            q9Var.layout(org.telegram.messenger.g0.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i18, this.f.getMeasuredWidth() + org.telegram.messenger.g0.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i18);
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != m5VarArr[0] && childAt != m5VarArr[1] && childAt != this.y1 && childAt != this.r && childAt != this.F && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i27 = layoutParams.gravity;
                if (i27 == -1) {
                    i27 = 51;
                }
                int i28 = i27 & ls.x1;
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
        m5[] m5VarArr;
        m5 m5Var;
        int i11;
        m5 m5Var2;
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
                makeMeasureSpec = o10.c(f10, size, TLObject.FLAG_30);
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
            m5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            m5 m5Var3 = m5VarArr[0];
            if ((m5Var3 == null || m5Var3.getVisibility() == 8) && ((m5Var = kVar.r) == null || m5Var.getVisibility() == 8)) {
                i11 = i12;
            } else {
                y yVar2 = kVar.F;
                int measuredWidth = yVar2 != null ? yVar2.getMeasuredWidth() : 0;
                int max = Math.max(kVar.I0 ? size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + measuredWidth) + kVar.b0) * 2) : org.telegram.messenger.f3.z(16.0f, size - measuredWidth, L) - kVar.b0, 0);
                boolean z10 = kVar.z0;
                int i14 = 20;
                if (((z10 && i13 == 0) || (!z10 && i13 == i12)) && kVar.x0 && kVar.y0) {
                    m5 m5Var4 = m5VarArr[i13];
                    i11 = i12;
                    if (kVar.Q0) {
                        i14 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    m5Var4.setTextSize(i14);
                } else {
                    i11 = i12;
                    m5 m5Var5 = m5VarArr[0];
                    if (m5Var5 == null || m5Var5.getVisibility() == 8 || (m5Var2 = kVar.r) == null || m5Var2.getVisibility() == 8) {
                        m5 m5Var6 = m5VarArr[i13];
                        if (m5Var6 != null && m5Var6.getVisibility() != 8) {
                            m5 m5Var7 = m5VarArr[i13];
                            if (kVar.Q0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            m5Var7.setTextSize(i14);
                        }
                        m5 m5Var8 = kVar.r;
                        if (m5Var8 != null && m5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        m5 m5Var9 = kVar.s;
                        if (m5Var9 != null) {
                            m5Var9.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        m5 m5Var10 = m5VarArr[i13];
                        if (m5Var10 != null) {
                            if (kVar.Q0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i14 = 18;
                            }
                            m5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        m5 m5Var11 = kVar.s;
                        if (m5Var11 != null) {
                            m5Var11.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        }
                    }
                }
                m5 m5Var12 = m5VarArr[i13];
                if (m5Var12 != null && m5Var12.getVisibility() != 8) {
                    m5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(m5VarArr[i13].getPaddingBottom() + m5VarArr[i13].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    if (kVar.A0) {
                        CharSequence text = m5VarArr[i13].getText();
                        m5 m5Var13 = m5VarArr[i13];
                        m5Var13.setPivotX(m5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        m5VarArr[i13].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        m5VarArr[i13].setPivotX(0.0f);
                        m5VarArr[i13].setPivotY(0.0f);
                    }
                }
                m5 m5Var14 = kVar.r;
                if (m5Var14 != null && m5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                fi.j jVar = kVar.y1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                m5 m5Var15 = kVar.s;
                if (m5Var15 != null && m5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = i11;
        }
        int i15 = i12;
        q9 q9Var = kVar.f;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = kVar.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != m5VarArr[0] && childAt != m5VarArr[i15] && childAt != kVar.y1 && childAt != kVar.r && childAt != kVar.F && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
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
            t6.h(m6.w8, this.G, this.K0);
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
        m5 m5Var = new m5(getContext());
        this.s = m5Var;
        m5Var.setGravity(3);
        this.s.setVisibility(8);
        t6.X(this.s, m6.B8, this.K0);
        addView(this.s, 0, ma.e(-2, -2, 51));
    }

    public final void r() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(m6.h0(this.q0, 1, -1));
        this.e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.e, ma.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(hd.N0(2131754878, null));
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
        addView(yVar2, 0, ma.e(-2, -1, 5));
        return this.F;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.v0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.G;
        if (dVar != null) {
            s6 s6Var = t6.a;
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
            t6.q(view);
            this.w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        E(recyclerView, m6.a7, m6.s8);
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
        } else if (drawable instanceof s4) {
            s4 s4Var = (s4) drawable;
            s4Var.k = this.y;
            s4Var.j = this.s0;
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
            if (drawable instanceof s4) {
                ((s4) drawable).k = i7;
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
        m5[] m5VarArr = this.n;
        int length = m5VarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            m5 m5Var = m5VarArr[i7];
            if (m5Var != null) {
                m5Var.setGravity(z10 ? 17 : 19);
            }
            i7++;
        }
        m5 m5Var2 = this.r;
        if (m5Var2 != null) {
            m5Var2.setGravity(z10 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(co coVar) {
        this.T0 = coVar;
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

    public void setDrawBlurBackground(du0 du0Var) {
        this.M0 = true;
        this.L0 = du0Var;
        du0Var.P.add(this);
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

    @Override // org.telegram.ui.ActionBar.t4
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
        m5[] m5VarArr = this.n;
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            m5Var.setRightDrawableOnClick(onClickListener);
        }
        m5 m5Var2 = m5VarArr[1];
        if (m5Var2 != null) {
            m5Var2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(q9 q9Var) {
        q9 q9Var2 = this.f;
        if (q9Var2 == q9Var) {
            return;
        }
        if (q9Var2 != null) {
            removeView(q9Var2);
        }
        this.f = q9Var;
        if (q9Var != null) {
            addView(q9Var);
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
        t6.q(this.r);
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
        m5[] m5VarArr = this.n;
        if (m5VarArr[0] == null) {
            u(0);
        }
        this.w0 = i7;
        t6.q(m5VarArr[0]);
        m5VarArr[0].setTextColor(i7);
        m5VarArr[0].setEmojiColor(i7);
        m5 m5Var = m5VarArr[1];
        if (m5Var != null) {
            t6.q(m5Var);
            m5VarArr[1].setTextColor(i7);
            m5VarArr[1].setEmojiColor(i7);
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
        m5 m5Var = new m5(getContext());
        this.r = m5Var;
        m5Var.setGravity(3);
        this.r.setVisibility(8);
        t6.X(this.r, m6.B8, this.K0);
        addView(this.r, 0, ma.e(-2, -2, 51));
    }

    public final void u(int i7) {
        m5[] m5VarArr = this.n;
        if (m5VarArr[i7] != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        m5VarArr[i7] = m5Var;
        m5Var.setGravity(this.I0 ? 17 : 19);
        int i10 = this.w0;
        if (i10 != 0) {
            m5VarArr[i7].setTextColor(i10);
        } else {
            t6.X(m5VarArr[i7], m6.A8, this.K0);
        }
        m5 m5Var2 = m5VarArr[i7];
        m5Var2.setEmojiColor(m5Var2.getTextColor());
        m5VarArr[i7].setTypeface(org.telegram.messenger.g0.o());
        m5VarArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        m5VarArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        m5VarArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.H0) {
            this.G0.addView(m5VarArr[i7], 0, ma.e(-2, -2, 51));
        } else {
            addView(m5VarArr[i7], 0, ma.e(-2, -2, 51));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
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
        m5[] m5VarArr = this.n;
        if (!z10) {
            m5 m5Var = m5VarArr[0];
            if (m5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<m5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<m5, Float>) property, 1.0f));
            }
        }
        y yVar = this.F;
        if (yVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 1.0f));
        }
        int i12 = this.y;
        if (i12 == 0 || this.Q0) {
            ls.e().k(ls.u4, new Object[0]);
        } else if (i0.a.h(i12) < 0.699999988079071d) {
            org.telegram.messenger.g0.o3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.o3((Activity) getContext(), true);
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
            m5 m5Var2 = m5VarArr[0];
            if (m5Var2 != null) {
                m5Var2.setVisibility(0);
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
            this.e.setBackgroundDrawable(m6.h0(this.q0, 1, -1));
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

    public void setAdaptiveBackground(wm0 wm0Var) {
        int i7 = m6.a7;
        int i10 = m6.s8;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        i();
        z1 z1Var = new z1(1, this, wm0Var);
        wm0Var.M.add(z1Var);
        if (this.z1) {
            z1Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = wm0Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
