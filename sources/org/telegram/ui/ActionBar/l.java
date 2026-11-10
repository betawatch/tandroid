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
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class l extends FrameLayout implements te.b, c6, t4 {
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
    public e F;
    public di.b4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final h6 J0;
    public boolean K;
    public st0 K0;
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
    public du0 S;
    public jn S0;
    public hz T;
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
    public final n4 d;
    public Drawable d0;
    public Runnable d1;
    public ImageView e;
    public View.OnClickListener e0;
    public uu0 e1;
    public k9 f;
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
    public final m5[] n;
    public boolean n0;
    public final te.c n1;
    public float o0;
    public final te.a o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public m5 r;
    public int r0;
    public boolean r1;
    public m5 s;
    public int s0;
    public boolean s1;
    public f2 t0;
    public boolean t1;
    public k u0;
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

    public l(Context context, h6 h6Var) {
        super(context);
        this.d = n4.a;
        this.n = new m5[2];
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
        wq wqVar = wq.h;
        this.l1 = new te.c(0, this, wqVar, 380L);
        this.m1 = new te.a(0, this, wqVar, 380L, false);
        this.n1 = new te.c(0, this, wqVar, 320L);
        this.o1 = new te.a(0, this, wqVar, 320L, false);
        this.v1 = true;
        this.w1 = qs.e4;
        this.C1 = true;
        this.D1 = 1.0f;
        this.J0 = h6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x > point.y ? org.telegram.messenger.g0.L(48.0f) : org.telegram.messenger.g0.L(56.0f);
    }

    public static View v(l lVar, float f10, float f11, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void A(boolean z9) {
        Property property;
        this.n0 = z9;
        l();
        AnimatorSet animatorSet = this.f1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean z10 = z();
        if (!z10) {
            m5 m5Var = this.n[0];
            if (m5Var != null) {
                arrayList.add(m5Var);
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
        k9 k9Var = this.f;
        if (k9Var != null) {
            k9Var.setVisibility(0);
            this.f1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<k9, Float>) property, z9 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.f1.addListener(new g(this, arrayList, z9, z10));
        this.f1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof s4) {
                s4 s4Var = (s4) drawable;
                s4Var.h = true;
                s4Var.a(true, z9 ? 1.0f : 0.0f);
            }
        }
    }

    public final void B() {
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

    public final void C() {
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
                            yVar.b.A(r0Var.T(z10));
                        }
                        r0Var.P("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void D(RecyclerView recyclerView, int i7, int i10) {
        this.A1 = i7;
        this.B1 = i10;
        this.z1 = org.telegram.messenger.g0.Q1();
        c cVar = new c(0, this, recyclerView);
        recyclerView.j(new ai.b(cVar, 24));
        if (this.y1) {
            cVar.run();
            return;
        }
        this.y1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        h();
    }

    public final void E(int i7, boolean z9) {
        ImageView imageView;
        if (z9) {
            this.q0 = i7;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(m6.h0(i7, 1, -1));
            }
            e eVar = this.F;
            if (eVar != null) {
                eVar.s();
                return;
            }
            return;
        }
        this.p0 = i7;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(m6.h0(i7, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void G(int i7, boolean z9) {
        if (z9) {
            this.s0 = i7;
            e eVar = this.F;
            if (eVar != null) {
                eVar.t();
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
                } else if (drawable2 instanceof s4) {
                    ((s4) drawable2).j = i7;
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

    public final void H(int i7, boolean z9) {
        y yVar;
        e eVar;
        int i10 = 0;
        if (z9 && (eVar = this.F) != null) {
            int childCount = eVar.getChildCount();
            while (i10 < childCount) {
                View childAt = eVar.getChildAt(i10);
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

    public final void I(int i7, boolean z9, boolean z10) {
        y yVar;
        e eVar;
        int i10 = 0;
        if (z10 && (eVar = this.F) != null) {
            int childCount = eVar.getChildCount();
            while (i10 < childCount) {
                View childAt = eVar.getChildAt(i10);
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

    public final void J(int i7, boolean z9) {
        y yVar;
        e eVar;
        if (z9 && (eVar = this.F) != null) {
            eVar.setPopupItemsSelectorColor(i7);
        } else {
            if (z9 || (yVar = this.E) == null) {
                return;
            }
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void K(int i7, boolean z9) {
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

    public final void L(CharSequence charSequence, org.telegram.ui.Components.f5 f5Var) {
        m5[] m5VarArr = this.n;
        if (charSequence != null && m5VarArr[0] == null) {
            u(0);
        }
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            m5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            m5 m5Var2 = m5VarArr[0];
            this.c0 = charSequence;
            m5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable).l(null);
                }
            }
            m5 m5Var3 = m5VarArr[0];
            this.d0 = f5Var;
            m5Var3.i(f5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable2).l(m5VarArr[0]);
                }
            }
            m5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void M(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        m5[] m5VarArr = this.n;
        if (m5VarArr[0] == null || charSequence == null) {
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
        this.y0 = z9;
        m5VarArr[0].setAlpha(0.0f);
        if (!z10) {
            m5 m5Var2 = m5VarArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            if (!z9) {
                L = -L;
            }
            m5Var2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = m5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = m5VarArr[1].animate().alpha(0.0f);
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
        alpha.setDuration(j3).setListener(new h(this, z10, z9, 0)).start();
        requestLayout();
    }

    public final void N(String str, int i7, Runnable runnable) {
        boolean z9;
        CharSequence charSequence;
        m5 m5Var;
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
                    m5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.f5) {
                        ((org.telegram.ui.Components.f5) drawable).l(m5VarArr[1]);
                    }
                    if (z9) {
                        qVar.c(m5VarArr[1]);
                    }
                    this.i1 = true;
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
                    this.z0 = true;
                    alpha2.setDuration(220L).setListener(new f(this, i10)).start();
                }
            } else {
                u(0);
                if (this.R) {
                    m5VarArr[0].invalidate();
                    invalidate();
                }
                m5VarArr[0].k(charSequence);
                m5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                m5VarArr[0].i(drawable);
                m5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable).l(m5VarArr[0]);
                }
                if (z9) {
                    qVar.c(m5VarArr[0]);
                } else {
                    qVar.x(m5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void O(dh.c cVar, gh.e eVar, boolean z9) {
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
        e eVar2 = this.F;
        if (eVar2 != null) {
            eVar2.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean P(View view) {
        if (this.L) {
            m5[] m5VarArr = this.n;
            if (view == m5VarArr[0] || view == m5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void Q(View[] viewArr, boolean[] zArr) {
        if (this.F == null || this.J) {
            return;
        }
        int i7 = 1;
        this.J = true;
        l();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<e, Float>) property, 0.0f, 1.0f));
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
                m5 m5Var = this.n[0];
                if (m5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<m5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<m5, Float>) property, 0.0f));
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
            this.e.setBackgroundDrawable(m6.h0(this.q0, 1, -1));
        }
    }

    public final void R() {
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

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.B1));
        hashSet.add(Integer.valueOf(this.A1));
    }

    @Override // org.telegram.ui.ActionBar.t4
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
        r0 r0Var;
        m5[] m5VarArr;
        m5 m5Var;
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
            if (!this.H0 || (m5Var = (m5VarArr = this.n)[0]) == null || m5Var.getVisibility() != 0) {
                f10 = 1.0f;
                int i13 = ((this.r1 || this.s1) ? i10 > 0 ? L : 0 : (int) (L * aVar.e)) + i10;
                int i14 = L + L2;
                int max = Math.max(i13, i14);
                i7 = 2;
                jn jnVar = this.S0;
                te.a aVar2 = this.m1;
                int W1 = org.telegram.messenger.g0.W1(jnVar == null ? 0.0f : 1.0f - aVar2.e, i13, max);
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
                        st0 st0Var = this.K0;
                        float y10 = getY();
                        float f11 = f10 - (this.z1 ? f10 : this.D1);
                        st0Var.getClass();
                        st0Var.I(canvas, y10, this.N0, paint, true, org.telegram.messenger.g0.W1(f11, qs.e4, Color.alpha(m6.w0((st0.E() && iz.o() == i7) ? m6.lg : m6.mg, st0Var.getResourceProvider()))));
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
            int L4 = org.telegram.messenger.g0.L(48.0f) + ((int) Math.ceil(m5VarArr[0].getTextWidth())) + i11;
            int round = Math.round(m5VarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
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
            View v = v(this, f10, f11, this.S0);
            if (v == null) {
                v = v(this, f10, f11, null);
            }
            fh.g gVar = this.a;
            boolean z9 = gVar != null && gVar.getBounds().contains(x10, y10);
            if (v != null && v != this.S0) {
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
        gz gzVar;
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
        boolean P = P(view);
        if (P) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? org.telegram.messenger.g0.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.R && !this.i0 && !id.a0) {
            m5[] m5VarArr = this.n;
            if ((view == m5VarArr[0] || view == m5VarArr[1] || (view == this.F0 && this.G0)) && (B0 = m6.B0()) != null) {
                m5 m5Var = view == this.F0 ? m5VarArr[0] : (m5) view;
                if (m5Var != null && m5Var.getVisibility() == 0 && (m5Var.getText() instanceof String)) {
                    TextPaint textPaint = m5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) m5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (B0.getIntrinsicWidth() + m6.D1)) / 2) + m5Var.getTextStartX() + m6.D1;
                    f10 = 255.0f;
                    f11 = 1.0f;
                    int textStartY = m5Var.getTextStartY() + m6.E1 + ((int) Math.ceil((m5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * org.telegram.messenger.g0.L(8.0f)));
                    B0.setBounds(width, textStartY - B0.getIntrinsicHeight(), B0.getIntrinsicWidth() + width, textStartY);
                    B0.setAlpha((int) (m5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    B0.draw(canvas);
                    if (this.i1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                    f11 = 1.0f;
                }
                if (m6.G1) {
                    if (this.S == null) {
                        this.S = new du0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                du0 du0Var = this.S;
                if (du0Var != null) {
                    du0Var.b(canvas, this);
                } else {
                    hz hzVar = this.T;
                    if (hzVar != null) {
                        ArrayList arrayList = (ArrayList) hzVar.d;
                        ArrayList arrayList2 = (ArrayList) hzVar.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                gz gzVar2 = (gz) arrayList2.get(i7);
                                Paint paint = (Paint) gzVar2.k.b;
                                paint.setColor(gzVar2.j);
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f) * gzVar2.i);
                                paint.setAlpha((int) (gzVar2.f * f10));
                                canvas.drawPoint(gzVar2.a, gzVar2.b, paint);
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
                                        gzVar = new gz(hzVar);
                                    } else {
                                        gzVar = (gz) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    gzVar.a = nextFloat;
                                    gzVar.b = nextFloat2;
                                    gzVar.c = cos * 1.5f;
                                    gzVar.d = sin;
                                    i11 = i13;
                                    gzVar.j = i11;
                                    float f14 = f11;
                                    gzVar.f = f14;
                                    gzVar.h = 0.0f;
                                    gzVar.i = Math.max(f14, secureRandom2.nextFloat() * 1.5f);
                                    gzVar.g = secureRandom2.nextInt(1000) + 1000;
                                    gzVar.e = (secureRandom2.nextFloat() * 4.0f) + f13;
                                    arrayList2.add(gzVar);
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
                            long min = Math.min(17L, currentTimeMillis - hzVar.a);
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                gz gzVar3 = (gz) arrayList2.get(i14);
                                float f15 = gzVar3.h;
                                float f16 = gzVar3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(gzVar3);
                                    }
                                    arrayList2.remove(i14);
                                    i14--;
                                    size2--;
                                    z10 = z14;
                                } else {
                                    z10 = z14;
                                    gzVar3.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f15 / f16);
                                    float f17 = gzVar3.a;
                                    float f18 = gzVar3.c;
                                    float f19 = gzVar3.e;
                                    float f20 = min;
                                    gzVar3.a = a8.p0.f(f18 * f19, f20, 500.0f, f17);
                                    float f21 = gzVar3.b;
                                    float f22 = gzVar3.d;
                                    gzVar3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    gzVar3.d = (f20 / 100.0f) + f22;
                                    gzVar3.h += f20;
                                }
                                i14++;
                                z14 = z10;
                            }
                            hzVar.a = currentTimeMillis;
                            invalidate();
                            if (P) {
                                canvas.restore();
                            }
                            return z9;
                        }
                    }
                }
            }
        }
        z9 = drawChild;
        if (P) {
        }
        return z9;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final fh.g f(j5 j5Var) {
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

    @Override // org.telegram.ui.ActionBar.t4
    public final void g(j5 j5Var, r0 r0Var) {
        this.Z0 = j5Var;
        this.a1 = r0Var;
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.u0;
    }

    public y getActionMode() {
        return this.F;
    }

    public float getActionModeFactor() {
        e eVar = this.F;
        if (eVar != null) {
            return eVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.x1;
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
        gh.e eVar = this.V0;
        if (eVar != null) {
            return eVar.a(eVar.e);
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
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

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getMenuGlassColorProvider() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public h6 getMenuResourcesProvider() {
        return this.J0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getMenuRise() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuView() {
        return this.E;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public j5 getOpenMenuOverlay() {
        return this.Z0;
    }

    public k9 getSearchAvatarImageView() {
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
        return this.v0;
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
        return this.F0;
    }

    public final void h() {
        if (this.y1) {
            float f10 = this.z1 ? 1.0f : this.D1;
            int i7 = this.B1;
            h6 h6Var = this.J0;
            int w02 = i7 == -1 ? 0 : m6.w0(i7, h6Var);
            int i10 = this.A1;
            int w03 = i10 == -1 ? 0 : m6.w0(i10, h6Var);
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

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (id.a0) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new j(0));
        this.z0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) wq.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void j(boolean z9) {
        jn jnVar = this.S0;
        if (jnVar == null) {
            return;
        }
        fn fnVar = jnVar.e;
        boolean z10 = fnVar != null && fnVar.getVisibility() == 0;
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

    public final void k() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i7 = ((drawable instanceof y1) || (drawable instanceof s4)) ? 2 : 0;
        if (this.e.getLayerType() != i7) {
            this.e.setLayerType(i7, null);
            this.e.invalidate();
        }
    }

    public final void l() {
        y yVar = this.E;
        int max = Math.max(0, yVar != null ? (yVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
        e eVar = this.F;
        int max2 = Math.max(0, eVar != null ? (eVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f) : 0);
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

    public final void m() {
        n(true);
    }

    public void n(boolean z9) {
        y yVar;
        if (!this.n0 || (yVar = this.E) == null) {
            return;
        }
        yVar.i(z9);
    }

    public final y o() {
        return p(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        R();
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
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        R();
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
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.i0 && !id.a0 && motionEvent.getAction() == 0 && (B0 = m6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            du0 du0Var = this.S;
            m5[] m5VarArr = this.n;
            if (du0Var == null) {
                this.T = null;
                this.S = new du0(0);
                m5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                hz hzVar = new hz();
                hzVar.c = new ArrayList();
                hzVar.d = new ArrayList();
                Paint paint = new Paint(1);
                hzVar.b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(m6.x0(null, m6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) hzVar.d).add(new gz(hzVar));
                }
                this.T = hzVar;
                m5VarArr[0].invalidate();
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
        m5[] m5VarArr;
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
            j(this.l1.h);
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
            m5VarArr = this.n;
            if (i20 >= 2) {
                break;
            }
            m5 m5Var = m5VarArr[i20];
            if (m5Var != null && m5Var.getVisibility() != 8) {
                boolean z10 = this.y0;
                if (((z10 && i20 == 0) || (!z10 && i20 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - m5VarArr[i20].getTextHeight()) / 2;
                } else {
                    m5 m5Var2 = this.r;
                    currentActionBarHeight = (m5Var2 == null || m5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - m5VarArr[i20].getTextHeight()) / 2 : org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + org.telegram.messenger.g0.L(2.0f) + (((getCurrentActionBarHeight() / 2) - m5VarArr[i20].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.H0 ? (getMeasuredWidth() - m5VarArr[i20].getMeasuredWidth()) / 2 : i19;
                m5 m5Var3 = m5VarArr[i20];
                int i21 = currentActionBarHeight + i18;
                m5Var3.layout(measuredWidth2, i21 - m5Var3.getPaddingTop(), m5VarArr[i20].getMeasuredWidth() + measuredWidth2, m5VarArr[i20].getPaddingBottom() + ((m5VarArr[i20].getTextHeight() + i21) - m5VarArr[i20].getPaddingTop()));
            }
            i20++;
        }
        if (this.x1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.x1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            di.j jVar = this.x1;
            int i22 = currentActionBarHeight2 + i18;
            jVar.layout(i19, i22, jVar.getMeasuredWidth() + i19, this.x1.getMeasuredHeight() + i22);
        }
        m5 m5Var4 = this.r;
        if (m5Var4 != null && m5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - org.telegram.messenger.g0.L(2.0f);
            int measuredWidth3 = this.H0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i19;
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
        k9 k9Var = this.f;
        if (k9Var != null) {
            k9Var.layout(org.telegram.messenger.g0.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i18, this.f.getMeasuredWidth() + org.telegram.messenger.g0.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i18);
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != m5VarArr[0] && childAt != m5VarArr[1] && childAt != this.x1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
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
        m5[] m5VarArr;
        m5 m5Var;
        int i11;
        m5 m5Var2;
        int makeMeasureSpec;
        l lVar = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i12 = 1;
        lVar.H = true;
        View view = lVar.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.m;
        }
        e eVar = lVar.F;
        if (eVar != null) {
            eVar.setPadding(0, lVar.I ? org.telegram.messenger.g0.m : 0, 0, 0);
        }
        lVar.H = false;
        lVar.setMeasuredDimension(size, currentActionBarHeight + (lVar.I ? org.telegram.messenger.g0.m : 0) + lVar.O);
        ImageView imageView = lVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f);
        } else {
            lVar.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 80.0f : 72.0f);
        }
        y yVar = lVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (lVar.E.p() && !lVar.n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k10 = lVar.E.k();
                if (lVar.m0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.k() + (size - org.telegram.messenger.g0.L(f10)), TLObject.FLAG_30);
                if (!lVar.D) {
                    lVar.E.r(-k10);
                }
            } else if (lVar.n0) {
                if (lVar.m0) {
                    f10 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = org.telegram.messenger.camera.q.c(f10, size, TLObject.FLAG_30);
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
        int i13 = 0;
        while (true) {
            m5VarArr = lVar.n;
            if (i13 >= 2) {
                break;
            }
            m5 m5Var3 = m5VarArr[0];
            if ((m5Var3 == null || m5Var3.getVisibility() == 8) && ((m5Var = lVar.r) == null || m5Var.getVisibility() == 8)) {
                i11 = i12;
            } else {
                y yVar2 = lVar.E;
                int measuredWidth = yVar2 != null ? yVar2.getMeasuredWidth() : 0;
                int max = Math.max(lVar.H0 ? size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + measuredWidth) + lVar.a0) * 2) : org.telegram.messenger.k5.z(16.0f, size - measuredWidth, L) - lVar.a0, 0);
                boolean z9 = lVar.y0;
                int i14 = 20;
                if (((z9 && i13 == 0) || (!z9 && i13 == i12)) && lVar.w0 && lVar.x0) {
                    m5 m5Var4 = m5VarArr[i13];
                    i11 = i12;
                    if (lVar.P0) {
                        i14 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    m5Var4.setTextSize(i14);
                } else {
                    i11 = i12;
                    m5 m5Var5 = m5VarArr[0];
                    if (m5Var5 == null || m5Var5.getVisibility() == 8 || (m5Var2 = lVar.r) == null || m5Var2.getVisibility() == 8) {
                        m5 m5Var6 = m5VarArr[i13];
                        if (m5Var6 != null && m5Var6.getVisibility() != 8) {
                            m5 m5Var7 = m5VarArr[i13];
                            if (lVar.P0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            m5Var7.setTextSize(i14);
                        }
                        m5 m5Var8 = lVar.r;
                        if (m5Var8 != null && m5Var8.getVisibility() != 8) {
                            lVar.r.setTextSize((org.telegram.messenger.g0.Q1() || lVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        m5 m5Var9 = lVar.s;
                        if (m5Var9 != null) {
                            m5Var9.setTextSize((org.telegram.messenger.g0.Q1() || lVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        m5 m5Var10 = m5VarArr[i13];
                        if (m5Var10 != null) {
                            if (lVar.P0) {
                                i14 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i14 = 18;
                            }
                            m5Var10.setTextSize(i14);
                        }
                        lVar.r.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        m5 m5Var11 = lVar.s;
                        if (m5Var11 != null) {
                            m5Var11.setTextSize(org.telegram.messenger.g0.Q1() ? 16 : 14);
                        }
                    }
                }
                m5 m5Var12 = m5VarArr[i13];
                if (m5Var12 != null && m5Var12.getVisibility() != 8) {
                    m5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(m5VarArr[i13].getPaddingBottom() + m5VarArr[i13].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    if (lVar.z0) {
                        CharSequence text = m5VarArr[i13].getText();
                        m5 m5Var13 = m5VarArr[i13];
                        m5Var13.setPivotX(m5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        m5VarArr[i13].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        m5VarArr[i13].setPivotX(0.0f);
                        m5VarArr[i13].setPivotY(0.0f);
                    }
                }
                m5 m5Var14 = lVar.r;
                if (m5Var14 != null && m5Var14.getVisibility() != 8) {
                    lVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                di.j jVar = lVar.x1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                m5 m5Var15 = lVar.s;
                if (m5Var15 != null && m5Var15.getVisibility() != 8) {
                    lVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = i11;
        }
        int i15 = i12;
        k9 k9Var = lVar.f;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = lVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = lVar.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != m5VarArr[0] && childAt != m5VarArr[i15] && childAt != lVar.x1 && childAt != lVar.r && childAt != lVar.E && childAt != lVar.e && childAt != lVar.s && childAt != lVar.f) {
                lVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i16++;
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

    public final y p(String str) {
        if (c(str)) {
            return this.F;
        }
        e eVar = this.F;
        if (eVar != null) {
            removeView(eVar);
            this.F = null;
        }
        this.G = str;
        e eVar2 = new e(this, getContext(), this);
        this.F = eVar2;
        eVar2.setTranslationX(this.P0 ? -org.telegram.messenger.g0.L(10.0f) : 0.0f);
        this.F.setGlassMode(this.P0);
        e eVar3 = this.F;
        eVar3.c = true;
        eVar3.setClickable(true);
        if (!this.P0) {
            t6.h(m6.w8, this.F, this.J0);
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

    public final void q() {
        if (this.s != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        this.s = m5Var;
        m5Var.setGravity(3);
        this.s.setVisibility(8);
        t6.X(this.s, m6.B8, this.J0);
        addView(this.s, 0, ha.e(-2, -2, 51));
    }

    public final void r() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(m6.h0(this.p0, 1, -1));
        this.e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.e, ha.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(id.M0(2131754878, null));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final y s() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, ha.e(-2, -1, 5));
        return this.E;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.u0 = kVar;
    }

    public void setActionModeColor(int i7) {
        e eVar = this.F;
        if (eVar != null) {
            s6 s6Var = t6.a;
            eVar.setTag(R.id.theme_bind, null);
            this.F.setBackgroundColor(i7);
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
        D(recyclerView, m6.a7, m6.s8);
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
            r();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            y1Var.c(false, x() ? 1.0f : 0.0f);
            y1Var.b(this.s0);
            y1Var.a(this.r0);
        } else if (drawable instanceof s4) {
            s4 s4Var = (s4) drawable;
            s4Var.k = this.y;
            s4Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.c1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        k();
    }

    public void setBackButtonImage(int i7) {
        if (this.e == null) {
            r();
        }
        this.e.setVisibility(i7 == 0 ? 8 : 0);
        this.e.setImageResource(i7);
        this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        k();
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
            if (drawable instanceof s4) {
                ((s4) drawable).k = i7;
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
        m5[] m5VarArr = this.n;
        int length = m5VarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            m5 m5Var = m5VarArr[i7];
            if (m5Var != null) {
                m5Var.setGravity(z9 ? 17 : 19);
            }
            i7++;
        }
        m5 m5Var2 = this.r;
        if (m5Var2 != null) {
            m5Var2.setGravity(z9 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(jn jnVar) {
        this.S0 = jnVar;
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

    public void setDrawBlurBackground(st0 st0Var) {
        this.L0 = true;
        this.K0 = st0Var;
        st0Var.O.add(this);
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
        e eVar = this.F;
        if (eVar != null) {
            eVar.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        this.O = i7;
        e eVar = this.F;
        if (eVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.getLayoutParams();
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

    @Override // org.telegram.ui.ActionBar.t4
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
        e eVar = this.F;
        if (eVar != null) {
            eVar.setPadding(0, z9 ? org.telegram.messenger.g0.m : 0, 0, 0);
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
        m5[] m5VarArr = this.n;
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            m5Var.setRightDrawableOnClick(onClickListener);
        }
        m5 m5Var2 = m5VarArr[1];
        if (m5Var2 != null) {
            m5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(k9 k9Var) {
        k9 k9Var2 = this.f;
        if (k9Var2 == k9Var) {
            return;
        }
        if (k9Var2 != null) {
            removeView(k9Var2);
        }
        this.f = k9Var;
        if (k9Var != null) {
            addView(k9Var);
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
            t();
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
            t();
        }
        t6.q(this.r);
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
        L(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.j0 = runnable;
        this.h0 = runnable;
    }

    public void setTitleColor(int i7) {
        m5[] m5VarArr = this.n;
        if (m5VarArr[0] == null) {
            u(0);
        }
        this.v0 = i7;
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

    public final void t() {
        if (this.r != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        this.r = m5Var;
        m5Var.setGravity(3);
        this.r.setVisibility(8);
        t6.X(this.r, m6.B8, this.J0);
        addView(this.r, 0, ha.e(-2, -2, 51));
    }

    public final void u(int i7) {
        m5[] m5VarArr = this.n;
        if (m5VarArr[i7] != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        m5VarArr[i7] = m5Var;
        m5Var.setGravity(this.H0 ? 17 : 19);
        int i10 = this.v0;
        if (i10 != 0) {
            m5VarArr[i7].setTextColor(i10);
        } else {
            t6.X(m5VarArr[i7], m6.A8, this.J0);
        }
        m5 m5Var2 = m5VarArr[i7];
        m5Var2.setEmojiColor(m5Var2.getTextColor());
        m5VarArr[i7].setTypeface(org.telegram.messenger.g0.o());
        m5VarArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        m5VarArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        m5VarArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.G0) {
            this.F0.addView(m5VarArr[i7], 0, ha.e(-2, -2, 51));
        } else {
            addView(m5VarArr[i7], 0, ha.e(-2, -2, 51));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        h();
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

    public void w() {
        e eVar = this.F;
        if (eVar == null || !this.J) {
            return;
        }
        int childCount = eVar.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof r0) {
                ((r0) childAt).o();
            }
        }
        this.J = false;
        l();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<e, Float>) property, 0.0f));
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
        m5[] m5VarArr = this.n;
        if (!z9) {
            m5 m5Var = m5VarArr[0];
            if (m5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<m5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<m5, Float>) property, 1.0f));
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
        this.P.addListener(new f(this, i7));
        this.P.start();
        if (!this.n0) {
            m5 m5Var2 = m5VarArr[0];
            if (m5Var2 != null) {
                m5Var2.setVisibility(0);
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
            this.e.setBackgroundDrawable(m6.h0(this.p0, 1, -1));
        }
    }

    public final boolean x() {
        return this.F != null && this.J;
    }

    public final boolean y(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean z() {
        return false;
    }

    public void setAdaptiveBackground(hm0 hm0Var) {
        int i7 = m6.a7;
        int i10 = m6.s8;
        this.A1 = i7;
        this.B1 = i10;
        this.z1 = org.telegram.messenger.g0.Q1();
        h();
        li.j3 j3Var = new li.j3(29, this, hm0Var);
        hm0Var.L.add(j3Var);
        if (this.y1) {
            j3Var.run();
            return;
        }
        this.y1 = true;
        boolean canScrollVertically = hm0Var.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        h();
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
