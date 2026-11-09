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
import c8.ha;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements te.b, b6, s4 {
    public CharSequence A0;
    public int A1;
    public boolean B0;
    public int B1;
    public boolean C0;
    public boolean C1;
    public boolean D;
    public boolean D0;
    public float D1;
    public y E;
    public boolean E0;
    public ValueAnimator E1;
    public d F;
    public di.b4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final g6 J0;
    public boolean K;
    public tt0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final ab.q O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public eu0 S;
    public kn S0;
    public iz T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public dh.c U0;
    public boolean V;
    public gh.e V0;
    public Rect W;
    public dh.c W0;
    public ri.d X0;
    public int Y0;
    public j5 Z0;
    public fh.g a;
    public int a0;
    public r0 a1;
    public fh.g b;
    public boolean b0;
    public final RectF b1;
    public fh.g c;
    public CharSequence c0;
    public boolean c1;
    public final m4 d;
    public Drawable d0;
    public Runnable d1;
    public ImageView e;
    public View.OnClickListener e0;
    public tu0 e1;
    public l9 f;
    public String f0;
    public AnimatorSet f1;
    public final Object[] g0;
    public int g1;
    public Drawable h;
    public Runnable h0;
    public int h1;
    public boolean i0;
    public boolean i1;
    public Runnable j0;
    public boolean j1;
    public boolean k0;
    public float k1;
    public int l0;
    public final te.c l1;
    public boolean m0;
    public final te.a m1;
    public final l5[] n;
    public boolean n0;
    public final te.c n1;
    public float o0;
    public final te.a o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public l5 r;
    public int r0;
    public boolean r1;
    public l5 s;
    public int s0;
    public boolean s1;
    public f2 t0;
    public boolean t1;
    public j u0;
    public boolean u1;
    public int v0;
    public boolean v1;
    public View w;
    public boolean w0;
    public int w1;
    public int x;
    public boolean x0;
    public di.j x1;
    public int y;
    public boolean y0;
    public boolean y1;
    public boolean z0;
    public boolean z1;

    public k(Context context, g6 g6Var) {
        super(context);
        this.d = m4.a;
        this.n = new l5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = qs.e4;
        this.v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ab.q(this);
        this.b1 = new RectF();
        xq xqVar = xq.h;
        this.l1 = new te.c(0, this, xqVar, 380L);
        this.m1 = new te.a(0, this, xqVar, 380L, false);
        this.n1 = new te.c(0, this, xqVar, 320L);
        this.o1 = new te.a(0, this, xqVar, 320L, false);
        this.v1 = true;
        this.w1 = qs.e4;
        this.C1 = true;
        this.D1 = 1.0f;
        this.J0 = g6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x > point.y ? org.telegram.messenger.g0.L(48.0f) : org.telegram.messenger.g0.L(56.0f);
    }

    public static View u(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A() {
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = yVar.getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u()) {
                    r0Var.E();
                }
            }
        }
    }

    public final void B() {
        y yVar = this.E;
        if (yVar != null) {
            boolean z9 = this.n0;
            boolean z10 = !z9;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (!z9) {
                            yVar.b.z(r0Var.T(z10));
                        }
                        r0Var.P("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void C(RecyclerView recyclerView, int i7, int i10) {
        this.A1 = i7;
        this.B1 = i10;
        this.z1 = org.telegram.messenger.g0.Q1();
        li.j3 j3Var = new li.j3(29, this, recyclerView);
        recyclerView.j(new ai.b(j3Var, 24));
        if (this.y1) {
            j3Var.run();
            return;
        }
        this.y1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        g();
    }

    public final void D(int i7, boolean z9) {
        ImageView imageView;
        if (z9) {
            this.q0 = i7;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(l6.h0(i7, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.p0 = i7;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(l6.h0(i7, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void E(int i7, boolean z9) {
        if (z9) {
            this.s0 = i7;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.r0 = i7;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof y1) {
                    ((y1) drawable2).a(i7);
                } else if (drawable2 instanceof r4) {
                    ((r4) drawable2).j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.c1) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public final void G(int i7, boolean z9) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z9 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).H(i7);
                }
                i10++;
            }
            return;
        }
        if (z9 || (yVar = this.E) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = yVar.getChildAt(i10);
            if (childAt2 instanceof r0) {
                ((r0) childAt2).H(i7);
            }
            i10++;
        }
    }

    public final void H(int i7, boolean z9, boolean z10) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).O(i7, z9);
                }
                i10++;
            }
            return;
        }
        if (z10 || (yVar = this.E) == null) {
            return;
        }
        int childCount2 = yVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = yVar.getChildAt(i10);
            if (childAt2 instanceof r0) {
                ((r0) childAt2).O(i7, z9);
            }
            i10++;
        }
    }

    public final void I(int i7, boolean z9) {
        y yVar;
        d dVar;
        if (z9 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else {
            if (z9 || (yVar = this.E) == null) {
                return;
            }
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void J(int i7, boolean z9) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (z9) {
                            r0Var.getSearchField().setHintTextColor(i7);
                            return;
                        } else {
                            r0Var.getSearchField().setTextColor(i7);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void K(CharSequence charSequence, org.telegram.ui.Components.g5 g5Var) {
        l5[] l5VarArr = this.n;
        if (charSequence != null && l5VarArr[0] == null) {
            t(0);
        }
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            l5 l5Var2 = l5VarArr[0];
            this.c0 = charSequence;
            l5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).l(null);
                }
            }
            l5 l5Var3 = l5VarArr[0];
            this.d0 = g5Var;
            l5Var3.i(g5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable2).l(l5VarArr[0]);
                }
            }
            l5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void L(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        l5[] l5VarArr = this.n;
        if (l5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z10 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z10) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            org.telegram.messenger.camera.q.k(this.r.animate(), z9 ? 0.0f : 1.0f, 220L);
        }
        l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            if (l5Var.getParent() != null) {
                ((ViewGroup) l5VarArr[1].getParent()).removeView(l5VarArr[1]);
            }
            l5VarArr[1] = null;
        }
        l5VarArr[1] = l5VarArr[0];
        l5VarArr[0] = null;
        setTitle(charSequence);
        this.y0 = z9;
        l5VarArr[0].setAlpha(0.0f);
        if (!z10) {
            l5 l5Var2 = l5VarArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            if (!z9) {
                L = -L;
            }
            l5Var2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = l5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
        if (!z10) {
            int L2 = org.telegram.messenger.g0.L(20.0f);
            if (z9) {
                L2 = -L2;
            }
            alpha.translationY(L2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j3).setListener(new g(this, z10, z9, 0)).start();
        requestLayout();
    }

    public final void M(String str, int i7, Runnable runnable) {
        boolean z9;
        CharSequence charSequence;
        l5 l5Var;
        int indexOf;
        if (!this.b0 || this.t0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.g0;
        objArr[0] = str;
        int i10 = 1;
        objArr[1] = Integer.valueOf(i7);
        objArr[2] = runnable;
        if (this.i1) {
            return;
        }
        String str2 = this.f0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.f0 = str;
            if (this.x1 != null) {
                this.x1.b(i7 == 2131751805 ? org.telegram.messenger.g0.I2(id.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            }
            CharSequence M0 = str != null ? id.M0(i7, str) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            ab.q qVar = this.O0;
            if (str == null || (indexOf = TextUtils.indexOf(M0, "...")) < 0) {
                z9 = false;
                charSequence = M0;
            } else {
                SpannableString valueOf = SpannableString.valueOf(M0);
                qVar.E(valueOf, indexOf);
                z9 = true;
                charSequence = valueOf;
            }
            this.i0 = str != null;
            l5[] l5VarArr = this.n;
            if ((charSequence == null || l5VarArr[0] != null) && getMeasuredWidth() != 0 && ((l5Var = l5VarArr[0]) == null || l5Var.getVisibility() == 0)) {
                l5 l5Var2 = l5VarArr[0];
                if (l5Var2 != null) {
                    l5Var2.animate().cancel();
                    l5 l5Var3 = l5VarArr[1];
                    if (l5Var3 != null) {
                        l5Var3.animate().cancel();
                    }
                    if (l5VarArr[1] == null) {
                        t(1);
                    }
                    l5VarArr[1].k(charSequence);
                    l5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    l5VarArr[1].i(drawable);
                    l5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.g5) {
                        ((org.telegram.ui.Components.g5) drawable).l(l5VarArr[1]);
                    }
                    if (z9) {
                        qVar.c(l5VarArr[1]);
                    }
                    this.i1 = true;
                    float alpha = l5VarArr[0].getAlpha();
                    l5 l5Var4 = l5VarArr[1];
                    l5VarArr[1] = l5VarArr[0];
                    l5VarArr[0] = l5Var4;
                    l5Var4.setAlpha(0.0f);
                    l5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                    l5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha2 = l5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                    } else {
                        alpha2.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.z0 = true;
                    alpha2.setDuration(220L).setListener(new e(this, i10)).start();
                }
            } else {
                t(0);
                if (this.R) {
                    l5VarArr[0].invalidate();
                    invalidate();
                }
                l5VarArr[0].k(charSequence);
                l5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                l5VarArr[0].i(drawable);
                l5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).l(l5VarArr[0]);
                }
                if (z9) {
                    qVar.c(l5VarArr[0]);
                } else {
                    qVar.x(l5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void N(dh.c cVar, gh.e eVar, boolean z9) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z9;
        this.U0 = cVar;
        this.V0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.a = c10;
        if (z9) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean O(View view) {
        if (this.L) {
            l5[] l5VarArr = this.n;
            if (view == l5VarArr[0] || view == l5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void P(View[] viewArr, boolean[] zArr) {
        if (this.F == null || this.J) {
            return;
        }
        int i7 = 1;
        this.J = true;
        k();
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
                l5 l5Var = this.n[0];
                if (l5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<l5, Float>) property, 0.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 0.0f));
            }
        }
        int i10 = this.x;
        if (i10 == 0) {
            i10 = this.y;
        }
        if (i10 == 0 || this.P0) {
            qs.e().k(qs.r4, new Object[0]);
        } else if (i0.a.h(i10) < 0.699999988079071d) {
            org.telegram.messenger.g0.p3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.p3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.e1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i7));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new ah.l(13, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof y1) {
                ((y1) drawable).c(true, 1.0f);
            }
            this.e.setBackgroundDrawable(l6.h0(this.q0, 1, -1));
        }
    }

    public final void Q() {
        boolean z9 = this.C0 && this.D0;
        if (this.E0 != z9) {
            this.E0 = z9;
            ab.q qVar = this.O0;
            if (!z9) {
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

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.B1));
        hashSet.add(Integer.valueOf(this.A1));
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final boolean b(r0 r0Var, RectF rectF) {
        int L = org.telegram.messenger.g0.L(6.0f);
        if (r0Var.getParent() == this.E && this.c != null && !this.u1 && !this.Q0 && this.k1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f10 = L;
            rectF.inset(f10, f10);
            return true;
        }
        float L2 = org.telegram.messenger.g0.L(46.0f) / 2.0f;
        View view = (View) r0Var.getParent();
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + (view != null ? view.getX() : 0.0f);
        float height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + r0) / 2.0f)) + L2;
        rectF.set(width - L2, height - L2, width + L2, height + L2);
        return false;
    }

    public final boolean c(String str) {
        if (this.F == null) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final boolean d() {
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
        r0 r0Var;
        l5[] l5VarArr;
        l5 l5Var;
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i10 = this.r1 ? this.p1 : (int) this.n1.f;
        if (this.s1) {
            i10 = Math.max((int) ((1.0f - this.k1) * this.q1), i10);
        }
        ImageView imageView = this.e;
        boolean z9 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + L2) / 2)) - L;
        int i11 = L * 2;
        int i12 = height + L2 + i11;
        fh.g gVar2 = this.a;
        te.a aVar = this.o1;
        if (gVar2 == null || this.Q0 || !this.v1) {
            f10 = 1.0f;
        } else {
            if (!this.H0 || (l5Var = (l5VarArr = this.n)[0]) == null || l5Var.getVisibility() != 0) {
                f10 = 1.0f;
                int i13 = ((this.r1 || this.s1) ? i10 > 0 ? L : 0 : (int) (L * aVar.e)) + i10;
                int i14 = L + L2;
                int max = Math.max(i13, i14);
                i7 = 2;
                kn knVar = this.S0;
                te.a aVar2 = this.m1;
                int W1 = org.telegram.messenger.g0.W1(knVar == null ? 0.0f : 1.0f - aVar2.e, i13, max);
                int W12 = org.telegram.messenger.g0.W1(this.S0 != null ? 1.0f - aVar2.e : 0.0f, z9 ? i14 : 0, i14);
                int width = getWidth() - W1;
                int i15 = width - W12;
                if (this.S0 != null) {
                    int W13 = org.telegram.messenger.g0.W1(Math.max(this.k1, actionModeFactor), Math.min(i15, ((int) this.l1.f) + i11), i15);
                    W12 = ((width + W12) - W13) / 2;
                    width = W12 + W13;
                    float L3 = org.telegram.messenger.g0.L(3.0f) + ((W12 - ((ViewGroup.MarginLayoutParams) this.S0.getLayoutParams()).leftMargin) - this.S0.getLeftPadding()) + L;
                    this.S0.setTranslationX(L3);
                    this.S0.setPivotX((r4.getMeasuredWidth() / 2.0f) - L3);
                }
                this.a.setBounds(W12, height, width, i12);
                if (!this.T0) {
                    this.a.draw(canvas);
                }
                gVar = this.b;
                if (gVar != null && z9) {
                    gVar.setBounds(0, height, L2 + i11, i12);
                    this.b.draw(canvas);
                }
                if (this.c != null && i10 > 0 && !this.Q0 && !this.u1 && ((r0Var = this.a1) == null || r0Var.getParent() != this.E || !b(this.a1, this.b1))) {
                    this.c.setBounds((getWidth() - Math.max(L2, i10)) - i11, height, getWidth(), i12);
                    this.c.setAlpha(!this.r1 ? 255 : (int) (aVar.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.L0 && this.y != 0) {
                    this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i16 = this.y;
                    Paint paint = this.M0;
                    paint.setColor(i16);
                    if (this.y1) {
                        this.K0.H(canvas, getY(), this.N0, paint, true);
                    } else {
                        tt0 tt0Var = this.K0;
                        float y10 = getY();
                        float f11 = f10 - (this.z1 ? f10 : this.D1);
                        tt0Var.getClass();
                        tt0Var.I(canvas, y10, this.N0, paint, true, org.telegram.messenger.g0.W1(f11, qs.e4, Color.alpha(l6.w0((tt0.E() && org.telegram.messenger.iz.o() == i7) ? l6.lg : l6.mg, tt0Var.getResourceProvider()))));
                    }
                }
                this.t1 = true;
                if (this.j1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            }
            f10 = 1.0f;
            int L4 = org.telegram.messenger.g0.L(48.0f) + ((int) Math.ceil(l5VarArr[0].getTextWidth())) + i11;
            int round = Math.round(l5VarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
            this.a.setBounds(round, height, L4 + round, i12);
            if (!this.T0) {
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
            this.c.setAlpha(!this.r1 ? 255 : (int) (aVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.L0) {
            this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i162 = this.y;
            Paint paint2 = this.M0;
            paint2.setColor(i162);
            if (this.y1) {
            }
        }
        this.t1 = true;
        if (this.j1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View u10 = u(this, f10, f11, this.S0);
            if (u10 == null) {
                u10 = u(this, f10, f11, null);
            }
            fh.g gVar = this.a;
            boolean z9 = gVar != null && gVar.getBounds().contains(x10, y10);
            if (u10 != null && u10 != this.S0) {
                fh.g gVar2 = this.b;
                boolean z10 = z9 | (gVar2 != null && gVar2.getBounds().contains(x10, y10));
                fh.g gVar3 = this.c;
                z9 = z10 | (gVar3 != null && gVar3.getBounds().contains(x10, y10));
            }
            if (!z9) {
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
        boolean z9;
        Drawable B0;
        float f10;
        float f11;
        boolean z10;
        hz hzVar;
        r0 r0Var;
        f2 f2Var = this.t0;
        if (f2Var != null && f2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        boolean z11 = true;
        if (this.B0 && view == this.e) {
            return true;
        }
        if (view == this.E && (r0Var = this.a1) != null && r0Var != null && r0Var.getParent() == this.E && b(this.a1, this.b1)) {
            return true;
        }
        boolean O = O(view);
        if (O) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? org.telegram.messenger.g0.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.R && !this.i0 && !id.a0) {
            l5[] l5VarArr = this.n;
            if ((view == l5VarArr[0] || view == l5VarArr[1] || (view == this.F0 && this.G0)) && (B0 = l6.B0()) != null) {
                l5 l5Var = view == this.F0 ? l5VarArr[0] : (l5) view;
                if (l5Var != null && l5Var.getVisibility() == 0 && (l5Var.getText() instanceof String)) {
                    TextPaint textPaint = l5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) l5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (B0.getIntrinsicWidth() + l6.D1)) / 2) + l5Var.getTextStartX() + l6.D1;
                    f10 = 255.0f;
                    f11 = 1.0f;
                    int textStartY = l5Var.getTextStartY() + l6.E1 + ((int) Math.ceil((l5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * org.telegram.messenger.g0.L(8.0f)));
                    B0.setBounds(width, textStartY - B0.getIntrinsicHeight(), B0.getIntrinsicWidth() + width, textStartY);
                    B0.setAlpha((int) (l5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    B0.draw(canvas);
                    if (this.i1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                    f11 = 1.0f;
                }
                if (l6.G1) {
                    if (this.S == null) {
                        this.S = new eu0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                eu0 eu0Var = this.S;
                if (eu0Var != null) {
                    eu0Var.b(canvas, this);
                } else {
                    iz izVar = this.T;
                    if (izVar != null) {
                        ArrayList arrayList = (ArrayList) izVar.d;
                        ArrayList arrayList2 = (ArrayList) izVar.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                hz hzVar2 = (hz) arrayList2.get(i7);
                                Paint paint = (Paint) hzVar2.k.b;
                                paint.setColor(hzVar2.j);
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f) * hzVar2.i);
                                paint.setAlpha((int) (hzVar2.f * f10));
                                canvas.drawPoint(hzVar2.a, hzVar2.b, paint);
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
                                    boolean z12 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(qs.t4) - 225) * 0.017453292519943295d;
                                    boolean z13 = z11;
                                    int i13 = i11;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        hzVar = new hz(izVar);
                                    } else {
                                        hzVar = (hz) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    hzVar.a = nextFloat;
                                    hzVar.b = nextFloat2;
                                    hzVar.c = cos * 1.5f;
                                    hzVar.d = sin;
                                    i11 = i13;
                                    hzVar.j = i11;
                                    float f14 = f11;
                                    hzVar.f = f14;
                                    hzVar.h = 0.0f;
                                    hzVar.i = Math.max(f14, secureRandom2.nextFloat() * 1.5f);
                                    hzVar.g = secureRandom2.nextInt(1000) + 1000;
                                    hzVar.e = (secureRandom2.nextFloat() * 4.0f) + f13;
                                    arrayList2.add(hzVar);
                                    i12++;
                                    drawChild = z12;
                                    z11 = z13;
                                    f12 = f13;
                                    f11 = 1.0f;
                                }
                            }
                            boolean z14 = z11;
                            z9 = drawChild;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - izVar.a);
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                hz hzVar3 = (hz) arrayList2.get(i14);
                                float f15 = hzVar3.h;
                                float f16 = hzVar3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(hzVar3);
                                    }
                                    arrayList2.remove(i14);
                                    i14--;
                                    size2--;
                                    z10 = z14;
                                } else {
                                    z10 = z14;
                                    hzVar3.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f15 / f16);
                                    float f17 = hzVar3.a;
                                    float f18 = hzVar3.c;
                                    float f19 = hzVar3.e;
                                    float f20 = min;
                                    hzVar3.a = a8.p0.f(f18 * f19, f20, 500.0f, f17);
                                    float f21 = hzVar3.b;
                                    float f22 = hzVar3.d;
                                    hzVar3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    hzVar3.d = (f20 / 100.0f) + f22;
                                    hzVar3.h += f20;
                                }
                                i14++;
                                z14 = z10;
                            }
                            izVar.a = currentTimeMillis;
                            invalidate();
                            if (O) {
                                canvas.restore();
                            }
                            return z9;
                        }
                    }
                }
            }
        }
        z9 = drawChild;
        if (O) {
        }
        return z9;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final fh.g e(j5 j5Var) {
        dh.c cVar = this.W0;
        if (cVar == null) {
            cVar = this.U0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(j5Var, null, false);
        c10.p(this.V0);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final void f(j5 j5Var, r0 r0Var) {
        this.Z0 = j5Var;
        this.a1 = r0Var;
        invalidate();
    }

    public final void g() {
        if (this.y1) {
            float f10 = this.z1 ? 1.0f : this.D1;
            int i7 = this.B1;
            g6 g6Var = this.J0;
            int w02 = i7 == -1 ? 0 : l6.w0(i7, g6Var);
            int i10 = this.A1;
            int w03 = i10 == -1 ? 0 : l6.w0(i10, g6Var);
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f10, w02, w03));
            setShadowAlpha((int) ((1.0f - f10) * 255.0f));
            if (this.L0) {
                invalidate();
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
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
        return this.x1;
    }

    public l5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public m4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.V0;
        if (eVar != null) {
            return eVar.a(eVar.e);
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public gh.a getButtonsGlassColorProvider() {
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

    @Override // org.telegram.ui.ActionBar.s4
    public gh.a getMenuGlassColorProvider() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public g6 getMenuResourcesProvider() {
        return this.J0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public int getMenuRise() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public View getMenuView() {
        return this.E;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public j5 getOpenMenuOverlay() {
        return this.Z0;
    }

    public l9 getSearchAvatarImageView() {
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
        l5 l5Var = this.r;
        if (l5Var != null) {
            return l5Var.getTextColor();
        }
        return 0;
    }

    public l5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        l5 l5Var = this.n[0];
        if (l5Var == null) {
            return null;
        }
        return l5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        l5 l5Var = this.n[0];
        if (l5Var != null) {
            return l5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public l5 getTitleTextView() {
        return this.n[0];
    }

    public l5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h() {
        if (id.a0) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new i(0));
        this.z0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) xq.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(boolean z9) {
        kn knVar = this.S0;
        if (knVar == null) {
            return;
        }
        gn gnVar = knVar.e;
        boolean z10 = gnVar != null && gnVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.S0.getVisualWidth());
        te.c cVar = this.l1;
        if (z9) {
            float f10 = min;
            if ((cVar.h ? cVar.g : cVar.f) != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(min);
        }
        this.m1.a(z10, z9);
    }

    public final void j() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i7 = ((drawable instanceof y1) || (drawable instanceof r4)) ? 2 : 0;
        if (this.e.getLayerType() != i7) {
            this.e.setLayerType(i7, null);
            this.e.invalidate();
        }
    }

    public final void k() {
        y yVar = this.E;
        int max = Math.max(0, yVar != null ? (yVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
        d dVar = this.F;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
        org.telegram.messenger.g0.L(46.0f);
        if (this.J) {
            max = max2;
        }
        this.o1.a(max > 0, this.t1);
        te.c cVar = this.n1;
        float f10 = max;
        if ((cVar.h ? cVar.g : cVar.f) != f10) {
            if (this.t1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public final void l() {
        m(true);
    }

    public void m(boolean z9) {
        y yVar;
        if (!this.n0 || (yVar = this.E) == null) {
            return;
        }
        yVar.i(z9);
    }

    public final y n() {
        return o(null);
    }

    public final y o(String str) {
        if (c(str)) {
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
        dVar2.setTranslationX(this.P0 ? -org.telegram.messenger.g0.L(10.0f) : 0.0f);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            s6.h(l6.w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.e));
        this.F.setPadding(0, this.I ? org.telegram.messenger.g0.m : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        Q();
        if (this.J) {
            int i7 = this.x;
            if (i7 == 0) {
                i7 = this.y;
            }
            if (i7 == 0 || this.P0) {
                qs.e().k(qs.r4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.p3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.p3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        Q();
        if (this.J) {
            int i7 = this.y;
            if (i7 == 0 || this.x == 0 || this.P0) {
                qs.e().k(qs.r4, new Object[0]);
            } else if (i0.a.h(i7) < 0.699999988079071d) {
                org.telegram.messenger.g0.p3((Activity) getContext(), false);
            } else {
                org.telegram.messenger.g0.p3((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.i0 && !id.a0 && motionEvent.getAction() == 0 && (B0 = l6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            eu0 eu0Var = this.S;
            l5[] l5VarArr = this.n;
            if (eu0Var == null) {
                this.T = null;
                this.S = new eu0(0);
                l5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                iz izVar = new iz();
                izVar.c = new ArrayList();
                izVar.d = new ArrayList();
                Paint paint = new Paint(1);
                izVar.b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(l6.x0(null, l6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) izVar.d).add(new hz(izVar));
                }
                this.T = izVar;
                l5VarArr[0].invalidate();
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        l5[] l5VarArr;
        int measuredWidth;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int currentActionBarHeight;
        int i18 = this.I ? org.telegram.messenger.g0.m : 0;
        if (this.h1 != getMeasuredWidth()) {
            this.h1 = getMeasuredWidth();
            i(this.l1.h);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.g0.L(this.P0 ? 24.0f : org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i18, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i18);
            L = org.telegram.messenger.g0.L(this.P0 ? 76.0f : org.telegram.messenger.g0.Q1() ? 80.0f : 72.0f);
        }
        int i19 = L + this.g1;
        y yVar = this.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            int L2 = this.E.p() ? org.telegram.messenger.g0.L(this.m0 ? 0.0f : org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            y yVar2 = this.E;
            yVar2.layout(L2, i18, yVar2.getMeasuredWidth() + L2, this.E.getMeasuredHeight() + i18);
        }
        int i20 = 0;
        while (true) {
            l5VarArr = this.n;
            if (i20 >= 2) {
                break;
            }
            l5 l5Var = l5VarArr[i20];
            if (l5Var != null && l5Var.getVisibility() != 8) {
                boolean z10 = this.y0;
                if (((z10 && i20 == 0) || (!z10 && i20 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - l5VarArr[i20].getTextHeight()) / 2;
                } else {
                    l5 l5Var2 = this.r;
                    currentActionBarHeight = (l5Var2 == null || l5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - l5VarArr[i20].getTextHeight()) / 2 : org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + org.telegram.messenger.g0.L(2.0f) + (((getCurrentActionBarHeight() / 2) - l5VarArr[i20].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.H0 ? (getMeasuredWidth() - l5VarArr[i20].getMeasuredWidth()) / 2 : i19;
                l5 l5Var3 = l5VarArr[i20];
                int i21 = currentActionBarHeight + i18;
                l5Var3.layout(measuredWidth2, i21 - l5Var3.getPaddingTop(), l5VarArr[i20].getMeasuredWidth() + measuredWidth2, l5VarArr[i20].getPaddingBottom() + ((l5VarArr[i20].getTextHeight() + i21) - l5VarArr[i20].getPaddingTop()));
            }
            i20++;
        }
        if (this.x1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.x1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            di.j jVar = this.x1;
            int i22 = currentActionBarHeight2 + i18;
            jVar.layout(i19, i22, jVar.getMeasuredWidth() + i19, this.x1.getMeasuredHeight() + i22);
        }
        l5 l5Var4 = this.r;
        if (l5Var4 != null && l5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            int measuredWidth3 = this.H0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i19;
            l5 l5Var5 = this.r;
            int i23 = currentActionBarHeight3 + i18;
            l5Var5.layout(measuredWidth3, i23, l5Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i23);
        }
        l5 l5Var6 = this.s;
        if (l5Var6 != null && l5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!org.telegram.messenger.g0.Q1()) {
                int i24 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - org.telegram.messenger.g0.L(1.0f);
            l5 l5Var7 = this.s;
            int i25 = L3 + i18;
            l5Var7.layout(i19, i25, l5Var7.getMeasuredWidth() + i19, this.s.getTextHeight() + i25);
        }
        l9 l9Var = this.f;
        if (l9Var != null) {
            l9Var.layout(org.telegram.messenger.g0.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i18, this.f.getMeasuredWidth() + org.telegram.messenger.g0.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i18);
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != l5VarArr[0] && childAt != l5VarArr[1] && childAt != this.x1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i27 = layoutParams.gravity;
                if (i27 == -1) {
                    i27 = 51;
                }
                int i28 = i27 & qs.x1;
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
        l5[] l5VarArr;
        l5 l5Var;
        int i11;
        l5 l5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i12 = 1;
        kVar.H = true;
        View view = kVar.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.m;
        }
        d dVar = kVar.F;
        if (dVar != null) {
            dVar.setPadding(0, kVar.I ? org.telegram.messenger.g0.m : 0, 0, 0);
        }
        kVar.H = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.I ? org.telegram.messenger.g0.m : 0) + kVar.O);
        ImageView imageView = kVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f);
        } else {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 80.0f : 72.0f);
        }
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (kVar.E.p() && !kVar.n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k10 = kVar.E.k();
                if (kVar.m0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.k() + (size - org.telegram.messenger.g0.L(f10)), TLObject.FLAG_30);
                if (!kVar.D) {
                    kVar.E.r(-k10);
                }
            } else if (kVar.n0) {
                if (kVar.m0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = org.telegram.messenger.camera.q.c(f10, size, TLObject.FLAG_30);
                if (!kVar.D) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.D) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i13 = 0;
        while (true) {
            l5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            l5 l5Var3 = l5VarArr[0];
            if ((l5Var3 == null || l5Var3.getVisibility() == 8) && ((l5Var = kVar.r) == null || l5Var.getVisibility() == 8)) {
                i11 = i12;
            } else {
                y yVar2 = kVar.E;
                int measuredWidth = yVar2 != null ? yVar2.getMeasuredWidth() : 0;
                int max = Math.max(kVar.H0 ? size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + measuredWidth) + kVar.a0) * 2) : org.telegram.messenger.k5.z(16.0f, size - measuredWidth, L) - kVar.a0, 0);
                boolean z9 = kVar.y0;
                int i14 = 20;
                if (((z9 && i13 == 0) || (!z9 && i13 == i12)) && kVar.w0 && kVar.x0) {
                    l5 l5Var4 = l5VarArr[i13];
                    i11 = i12;
                    if (kVar.P0) {
                        i14 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    l5Var4.setTextSize(i14);
                } else {
                    i11 = i12;
                    l5 l5Var5 = l5VarArr[0];
                    if (l5Var5 == null || l5Var5.getVisibility() == 8 || (l5Var2 = kVar.r) == null || l5Var2.getVisibility() == 8) {
                        l5 l5Var6 = l5VarArr[i13];
                        if (l5Var6 != null && l5Var6.getVisibility() != 8) {
                            l5 l5Var7 = l5VarArr[i13];
                            if (kVar.P0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            l5Var7.setTextSize(i14);
                        }
                        l5 l5Var8 = kVar.r;
                        if (l5Var8 != null && l5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        l5 l5Var9 = kVar.s;
                        if (l5Var9 != null) {
                            l5Var9.setTextSize((org.telegram.messenger.g0.Q1() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        l5 l5Var10 = l5VarArr[i13];
                        if (l5Var10 != null) {
                            if (kVar.P0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i14 = 18;
                            }
                            l5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        l5 l5Var11 = kVar.s;
                        if (l5Var11 != null) {
                            l5Var11.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        }
                    }
                }
                l5 l5Var12 = l5VarArr[i13];
                if (l5Var12 != null && l5Var12.getVisibility() != 8) {
                    l5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(l5VarArr[i13].getPaddingBottom() + l5VarArr[i13].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    if (kVar.z0) {
                        CharSequence text = l5VarArr[i13].getText();
                        l5 l5Var13 = l5VarArr[i13];
                        l5Var13.setPivotX(l5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        l5VarArr[i13].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        l5VarArr[i13].setPivotX(0.0f);
                        l5VarArr[i13].setPivotY(0.0f);
                    }
                }
                l5 l5Var14 = kVar.r;
                if (l5Var14 != null && l5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                di.j jVar = kVar.x1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                l5 l5Var15 = kVar.s;
                if (l5Var15 != null && l5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = i11;
        }
        int i15 = i12;
        l9 l9Var = kVar.f;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = kVar.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != l5VarArr[0] && childAt != l5VarArr[i15] && childAt != kVar.x1 && childAt != kVar.r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i16++;
            kVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.N) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.M;
    }

    public final void p() {
        if (this.s != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.s = l5Var;
        l5Var.setGravity(3);
        this.s.setVisibility(8);
        s6.X(this.s, l6.B8, this.J0);
        addView(this.s, 0, ha.e(-2, -2, 51));
    }

    public final void q() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(l6.h0(this.p0, 1, -1));
        this.e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.e, ha.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(id.M0(2131754878, null));
    }

    public final y r() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, ha.e(-2, -1, 5));
        return this.E;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        if (this.r != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.r = l5Var;
        l5Var.setGravity(3);
        this.r.setVisibility(8);
        s6.X(this.r, l6.B8, this.J0);
        addView(this.r, 0, ha.e(-2, -2, 51));
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.u0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.F;
        if (dVar != null) {
            r6 r6Var = s6.a;
            dVar.setTag(R.id.theme_bind, null);
            this.F.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.w;
        if (view != null) {
            s6.q(view);
            this.w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        C(recyclerView, l6.a7, l6.s8);
    }

    public void setAddToContainer(boolean z9) {
        this.K = z9;
    }

    public void setAdditionalTextLeft(int i7) {
        this.g1 = i7;
    }

    public void setAllowOverlayTitle(boolean z9) {
        this.b0 = z9;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.e == null) {
            q();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            y1Var.c(false, w() ? 1.0f : 0.0f);
            y1Var.b(this.s0);
            y1Var.a(this.r0);
        } else if (drawable instanceof r4) {
            r4 r4Var = (r4) drawable;
            r4Var.k = this.y;
            r4Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.c1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        j();
    }

    public void setBackButtonImage(int i7) {
        if (this.e == null) {
            q();
        }
        this.e.setVisibility(i7 == 0 ? 8 : 0);
        this.e.setImageResource(i7);
        this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        j();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.y = i7;
        if (!this.L0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                ((r4) drawable).k = i7;
            }
        }
    }

    public void setCastShadows(boolean z9) {
        if (this.k0 != z9 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.k0 = z9;
    }

    public void setCenterTitleAndGlass(boolean z9) {
        if (this.H0 == z9) {
            return;
        }
        this.H0 = z9;
        l5[] l5VarArr = this.n;
        int length = l5VarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            l5 l5Var = l5VarArr[i7];
            if (l5Var != null) {
                l5Var.setGravity(z9 ? 17 : 19);
            }
            i7++;
        }
        l5 l5Var2 = this.r;
        if (l5Var2 != null) {
            l5Var2.setGravity(z9 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(kn knVar) {
        this.S0 = knVar;
    }

    public void setClipContent(boolean z9) {
        this.L = z9;
    }

    public void setDrawBackButton(boolean z9) {
        this.B0 = z9;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(tt0 tt0Var) {
        this.L0 = true;
        this.K0 = tt0Var;
        tt0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z9) {
        if (this.v1 != z9) {
            this.v1 = z9;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z9);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z9);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        this.O = i7;
        d dVar = this.F;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.N = z9;
    }

    public void setForcedMenuMinWidth(int i7) {
        this.s1 = true;
        if (this.q1 != i7) {
            this.q1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.r1 = true;
        if (this.p1 != i7) {
            this.p1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.w1 != i7) {
            this.w1 = i7;
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
        this.I0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z9) {
        this.M = z9;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = this.X0;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public void setMenuOffsetSuppressed(boolean z9) {
        this.D = z9;
    }

    public void setMenuRise(int i7) {
        this.Y0 = i7;
    }

    public void setOccupyStatusBar(boolean z9) {
        this.I = z9;
        d dVar = this.F;
        if (dVar != null) {
            dVar.setPadding(0, z9 ? org.telegram.messenger.g0.m : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.d1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z9) {
        this.w0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
        l5[] l5VarArr = this.n;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setRightDrawableOnClick(onClickListener);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(l9 l9Var) {
        l9 l9Var2 = this.f;
        if (l9Var2 == l9Var) {
            return;
        }
        if (l9Var2 != null) {
            removeView(l9Var2);
        }
        this.f = l9Var;
        if (l9Var != null) {
            addView(l9Var);
        }
    }

    public void setSearchCursorColor(int i7) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i7);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.k1 != f10) {
            this.k1 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(jg.o0 o0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(o0Var);
        }
    }

    public void setShadowAlpha(int i7) {
        if (this.l0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.l0 = i7;
    }

    public void setSkipDrawChild(boolean z9) {
        if (this.j1 != z9) {
            this.j1 = z9;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            s();
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

    public void setSubtitleColor(int i7) {
        if (this.r == null) {
            s();
        }
        s6.q(this.r);
        this.r.setTextColor(i7);
    }

    public void setSupportsHolidayImage(boolean z9) {
        this.R = z9;
        if (z9) {
            this.U = new Paint.FontMetricsInt();
            this.W = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        K(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.j0 = runnable;
        this.h0 = runnable;
    }

    public void setTitleColor(int i7) {
        l5[] l5VarArr = this.n;
        if (l5VarArr[0] == null) {
            t(0);
        }
        this.v0 = i7;
        s6.q(l5VarArr[0]);
        l5VarArr[0].setTextColor(i7);
        l5VarArr[0].setEmojiColor(i7);
        l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            s6.q(l5Var);
            l5VarArr[1].setTextColor(i7);
            l5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.a0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z9) {
        this.n[0].setScrollNonFitText(z9);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.L) {
            invalidate();
        }
    }

    public final void t(int i7) {
        l5[] l5VarArr = this.n;
        if (l5VarArr[i7] != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        l5VarArr[i7] = l5Var;
        l5Var.setGravity(this.H0 ? 17 : 19);
        int i10 = this.v0;
        if (i10 != 0) {
            l5VarArr[i7].setTextColor(i10);
        } else {
            s6.X(l5VarArr[i7], l6.A8, this.J0);
        }
        l5 l5Var2 = l5VarArr[i7];
        l5Var2.setEmojiColor(l5Var2.getTextColor());
        l5VarArr[i7].setTypeface(org.telegram.messenger.g0.o());
        l5VarArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        l5VarArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        l5VarArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.G0) {
            this.F0.addView(l5VarArr[i7], 0, ha.e(-2, -2, 51));
        } else {
            addView(l5VarArr[i7], 0, ha.e(-2, -2, 51));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        g();
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
        di.j jVar = this.x1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void v() {
        d dVar = this.F;
        if (dVar == null || !this.J) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof r0) {
                ((r0) childAt).o();
            }
        }
        this.J = false;
        k();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<d, Float>) property, 0.0f));
        if (this.Q != null) {
            int i11 = 0;
            while (true) {
                View[] viewArr = this.Q;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.Q[i11], (Property<View, Float>) property, 1.0f));
                }
                i11++;
            }
        }
        boolean z9 = this.n0;
        l5[] l5VarArr = this.n;
        if (!z9) {
            l5 l5Var = l5VarArr[0];
            if (l5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<l5, Float>) property, 1.0f));
            }
        }
        y yVar = this.E;
        if (yVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 1.0f));
        }
        int i12 = this.y;
        if (i12 == 0 || this.P0) {
            qs.e().k(qs.r4, new Object[0]);
        } else if (i0.a.h(i12) < 0.699999988079071d) {
            org.telegram.messenger.g0.p3((Activity) getContext(), false);
        } else {
            org.telegram.messenger.g0.p3((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.e1 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i7));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i7));
        this.P.start();
        if (!this.n0) {
            l5 l5Var2 = l5VarArr[0];
            if (l5Var2 != null) {
                l5Var2.setVisibility(0);
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
            if (drawable instanceof y1) {
                ((y1) drawable).c(true, 0.0f);
            }
            this.e.setBackgroundDrawable(l6.h0(this.p0, 1, -1));
        }
    }

    public final boolean w() {
        return this.F != null && this.J;
    }

    public final boolean x(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean y() {
        return false;
    }

    public void z(boolean z9) {
        Property property;
        this.n0 = z9;
        k();
        AnimatorSet animatorSet = this.f1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean y10 = y();
        if (!y10) {
            l5 l5Var = this.n[0];
            if (l5Var != null) {
                arrayList.add(l5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z9 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z9 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f1.playTogether(ofFloat);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i7 >= size) {
                break;
            }
            View view = (View) arrayList.get(i7);
            float f10 = 0.95f;
            if (!z9) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.f1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z9 ? 0.0f : 1.0f));
            this.f1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z9 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.f1;
            if (!z9) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10));
            i7++;
        }
        l9 l9Var = this.f;
        if (l9Var != null) {
            l9Var.setVisibility(0);
            this.f1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<l9, Float>) property, z9 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.f1.addListener(new f(this, arrayList, z9, y10));
        this.f1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                r4 r4Var = (r4) drawable;
                r4Var.h = true;
                r4Var.a(true, z9 ? 1.0f : 0.0f);
            }
        }
    }

    public void setAdaptiveBackground(im0 im0Var) {
        int i7 = l6.a7;
        int i10 = l6.s8;
        this.A1 = i7;
        this.B1 = i10;
        this.z1 = org.telegram.messenger.g0.Q1();
        g();
        li.j3 j3Var = new li.j3(28, this, im0Var);
        im0Var.L.add(j3Var);
        if (this.y1) {
            j3Var.run();
            return;
        }
        this.y1 = true;
        boolean canScrollVertically = im0Var.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        g();
    }

    @Override // org.telegram.ui.ActionBar.s4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
