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
import android.graphics.Typeface;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class a extends FrameLayout implements s84, snb, o27 {
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
    public s6 F;
    public boolean F0;
    public ValueAnimator F1;
    public u5 G;
    public b6 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final vnb K0;
    public boolean L;
    public wma L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final vh4 P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public wna T;
    public f82 T0;
    public qj4 U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public ll0 V0;
    public boolean W;
    public ol0 W0;
    public ll0 X0;
    public pz4 Y0;
    public int Z0;
    public jl0 a;
    public Rect a0;
    public ula a1;
    public jl0 b;
    public int b0;
    public s7 b1;
    public jl0 c;
    public boolean c0;
    public final RectF c1;
    public final rk5 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public ul e0;
    public Runnable e1;
    public de0 f;
    public View.OnClickListener f0;
    public v59 f1;
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
    public final t84 m1;
    public final ema[] n;
    public boolean n0;
    public final fm0 n1;
    public boolean o0;
    public final t84 o1;
    public float p0;
    public final fm0 p1;
    public int q0;
    public int q1;
    public ema r;
    public int r0;
    public int r1;
    public ema s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public e u0;
    public boolean u1;
    public d6 v0;
    public boolean v1;
    public View w;
    public int w0;
    public boolean w1;
    public int x;
    public boolean x0;
    public int x1;
    public int y;
    public boolean y0;
    public c6 y1;
    public boolean z0;
    public boolean z1;

    public a(Context context, vnb vnbVar) {
        super(context);
        this.d = rk5.a;
        this.n = new ema[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = jn7.d4;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new vh4(this);
        this.c1 = new RectF();
        k43 k43Var = k43.h;
        this.m1 = new t84(0, this, k43Var, 380L);
        this.n1 = new fm0(0, this, k43Var, 380L, false);
        this.o1 = new t84(0, this, k43Var, 320L);
        this.p1 = new fm0(0, this, k43Var, 320L, false);
        this.w1 = true;
        this.x1 = jn7.d4;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = vnbVar;
        setOnClickListener(new s5(this, (byte) 0));
    }

    public static int getCurrentActionBarHeight() {
        if (hl.O1()) {
            return hl.L(58.0f);
        }
        Point point = hl.q;
        return point.x > point.y ? hl.L(48.0f) : hl.L(56.0f);
    }

    public static View x(a aVar, float f, float f2, View view) {
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean A(String str) {
        if (this.G == null || !this.K) {
            return false;
        }
        String str2 = this.H;
        return str2 == null ? str == null : str2.equals(str);
    }

    public boolean B() {
        return false;
    }

    public void C(boolean z) {
        Property property;
        this.o0 = z;
        n();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean B = B();
        if (!B) {
            ema emaVar = this.n[0];
            if (emaVar != null) {
                arrayList.add(emaVar);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new r5(this, (byte) 2));
        this.g1.playTogether(ofFloat);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i >= size) {
                break;
            }
            View view = (View) arrayList.get(i);
            float f = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.g1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 0.0f : 1.0f));
            this.g1.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.g1;
            if (!z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f));
            i++;
        }
        de0 de0Var = this.f;
        if (de0Var != null) {
            de0Var.setVisibility(0);
            this.g1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<de0, Float>) property, z ? 1.0f : 0.0f));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new x5(this, arrayList, z, B));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h27) {
                h27 h27Var = (h27) drawable;
                h27Var.h = true;
                h27Var.a(true, z ? 1.0f : 0.0f);
            }
        }
    }

    public final void D() {
        s6 s6Var = this.F;
        int childCount = s6Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s6Var.getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.F();
                }
            }
        }
    }

    public final void E() {
        s6 s6Var = this.F;
        if (s6Var != null) {
            boolean z = this.o0;
            boolean z2 = !z;
            int childCount = s6Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s6Var.getChildAt(i);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    if (s7Var.v()) {
                        if (!z) {
                            s6Var.b.C(s7Var.T(z2));
                        }
                        s7Var.P("", false);
                        s7Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void F(RecyclerView recyclerView, int i, int i2) {
        this.B1 = i;
        this.C1 = i2;
        this.A1 = hl.O1();
        ve2 ve2Var = new ve2(this, recyclerView, (byte) 19);
        recyclerView.j(new y(ve2Var, (byte) 1));
        if (this.z1) {
            ve2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        j();
    }

    public final void G(int i, boolean z) {
        ImageView imageView;
        if (z) {
            this.r0 = i;
            if (this.K && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(aob.f0(i, 1, -1));
            }
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.s();
                return;
            }
            return;
        }
        this.q0 = i;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(aob.f0(i, 1, -1));
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.s();
        }
    }

    public void H(int i, boolean z) {
        if (z) {
            this.t0 = i;
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof gd0) {
                    ((gd0) drawable).b(i);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof gd0) {
                    ((gd0) drawable2).a(i);
                } else if (drawable2 instanceof h27) {
                    ((h27) drawable2).j = i;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
            s6 s6Var = this.F;
            if (s6Var != null) {
                s6Var.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.d1) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
    }

    public final void I(int i, boolean z) {
        int i2 = 0;
        if (z) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                int childCount = u5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = u5Var.getChildAt(i2);
                    if (childAt instanceof s7) {
                        ((s7) childAt).I(i);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount2 = s6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = s6Var.getChildAt(i2);
                if (childAt2 instanceof s7) {
                    ((s7) childAt2).I(i);
                }
                i2++;
            }
        }
    }

    public final void J(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (z2) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                int childCount = u5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = u5Var.getChildAt(i2);
                    if (childAt instanceof s7) {
                        ((s7) childAt).O(i, z);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount2 = s6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = s6Var.getChildAt(i2);
                if (childAt2 instanceof s7) {
                    ((s7) childAt2).O(i, z);
                }
                i2++;
            }
        }
    }

    public final void K(int i, boolean z) {
        if (z) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.setPopupItemsSelectorColor(i);
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setPopupItemsSelectorColor(i);
        }
    }

    public final void L(int i, boolean z) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount = s6Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = s6Var.getChildAt(i2);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    if (s7Var.v()) {
                        if (z) {
                            s7Var.getSearchField().setHintTextColor(i);
                            return;
                        } else {
                            s7Var.getSearchField().setTextColor(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, ul ulVar) {
        ema[] emaVarArr = this.n;
        if (charSequence != null && emaVarArr[0] == null) {
            w(0);
        }
        ema emaVar = emaVarArr[0];
        if (emaVar != null) {
            emaVar.setVisibility((charSequence == null || this.o0) ? 4 : 0);
            ema emaVar2 = emaVarArr[0];
            this.d0 = charSequence;
            emaVar2.k(charSequence);
            if (this.D0) {
                ul ulVar2 = this.e0;
                if (ik8.A(ulVar2)) {
                    ulVar2.l(null);
                }
            }
            ema emaVar3 = emaVarArr[0];
            this.e0 = ulVar;
            emaVar3.i(ulVar);
            if (this.D0) {
                ul ulVar3 = this.e0;
                if (ik8.A(ulVar3)) {
                    ulVar3.l(emaVarArr[0]);
                }
            }
            emaVarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z, long j, k43 k43Var) {
        ema[] emaVarArr = this.n;
        byte b = 0;
        if (emaVarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z2 = this.x0 && !TextUtils.isEmpty(this.B0);
        if (z2) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            ik8.s(this.r.animate(), z ? 0.0f : 1.0f, 220L);
        }
        ema emaVar = emaVarArr[1];
        if (emaVar != null) {
            if (emaVar.getParent() != null) {
                ((ViewGroup) emaVarArr[1].getParent()).removeView(emaVarArr[1]);
            }
            emaVarArr[1] = null;
        }
        emaVarArr[1] = emaVarArr[0];
        emaVarArr[0] = null;
        setTitle(charSequence);
        this.z0 = z;
        emaVarArr[0].setAlpha(0.0f);
        if (!z2) {
            ema emaVar2 = emaVarArr[0];
            int L = hl.L(20.0f);
            if (!z) {
                L = -L;
            }
            emaVar2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = emaVarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (k43Var != null) {
            duration.setInterpolator(k43Var);
        }
        duration.start();
        this.y0 = true;
        ViewPropertyAnimator alpha = emaVarArr[1].animate().alpha(0.0f);
        if (!z2) {
            int L2 = hl.L(20.0f);
            if (z) {
                L2 = -L2;
            }
            alpha.translationY(L2);
        }
        if (k43Var != null) {
            alpha.setInterpolator(k43Var);
        }
        alpha.setDuration(j).setListener(new y5(this, z2, z, b)).start();
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(String str, int i, Runnable runnable) {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        a24 a24Var;
        int indexOf;
        if (!this.c0 || this.u0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.h0;
        objArr[0] = str;
        byte b = 1;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = runnable;
        if (this.j1) {
            return;
        }
        String str2 = this.g0;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        this.g0 = str;
        ul ulVar = null;
        if (this.y1 != null) {
            this.y1.a(i == 2131751770 ? hl.E2(ob6.M0(2131743766, null), true, hl.L(2.6666667f), hl.L(2.0f)) : null, true);
        }
        if (str != null) {
            charSequence = ob6.M0(i, str);
        } else {
            CharSequence charSequence3 = this.d0;
            ulVar = this.e0;
            charSequence = charSequence3;
        }
        vh4 vh4Var = this.P0;
        if (str == null || (indexOf = TextUtils.indexOf(charSequence, "...")) < 0) {
            z = false;
            charSequence2 = charSequence;
        } else {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            vh4Var.M(valueOf, indexOf);
            z = true;
            charSequence2 = valueOf;
        }
        this.j0 = str != null;
        ema[] emaVarArr = this.n;
        if ((charSequence2 == null || emaVarArr[0] != 0) && getMeasuredWidth() != 0 && ((a24Var = emaVarArr[0]) == 0 || a24Var.getVisibility() == 0)) {
            a24 a24Var2 = emaVarArr[0];
            if (a24Var2 != 0) {
                a24Var2.animate().cancel();
                a24 a24Var3 = emaVarArr[1];
                if (a24Var3 != 0) {
                    a24Var3.animate().cancel();
                }
                if (emaVarArr[1] == 0) {
                    w(1);
                }
                emaVarArr[1].k(charSequence2);
                emaVarArr[1].setDrawablePadding(hl.L(4.0f));
                emaVarArr[1].i(ulVar);
                emaVarArr[1].setRightDrawableOnClick(this.f0);
                if (ik8.A(ulVar)) {
                    ulVar.l(emaVarArr[1]);
                }
                if (z) {
                    vh4Var.c(emaVarArr[1]);
                }
                this.j1 = true;
                float alpha = emaVarArr[0].getAlpha();
                a24 a24Var4 = emaVarArr[1];
                emaVarArr[1] = emaVarArr[0];
                emaVarArr[0] = a24Var4;
                a24Var4.setAlpha(0.0f);
                emaVarArr[0].setTranslationY(-hl.L(20.0f));
                emaVarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                ViewPropertyAnimator alpha2 = emaVarArr[1].animate().alpha(0.0f);
                if (this.r == null) {
                    alpha2.translationY(hl.L(20.0f));
                } else {
                    alpha2.scaleY(0.7f).scaleX(0.7f);
                }
                requestLayout();
                this.A0 = true;
                alpha2.setDuration(220L).setListener(new w5(this, b)).start();
            }
        } else {
            w(0);
            if (this.S) {
                emaVarArr[0].invalidate();
                invalidate();
            }
            emaVarArr[0].k(charSequence2);
            emaVarArr[0].setDrawablePadding(hl.L(4.0f));
            emaVarArr[0].i(ulVar);
            emaVarArr[0].setRightDrawableOnClick(this.f0);
            if (ik8.A(ulVar)) {
                ulVar.l(emaVarArr[0]);
            }
            if (z) {
                vh4Var.c(emaVarArr[0]);
            } else {
                vh4Var.F(emaVarArr[0]);
            }
        }
        if (runnable == null) {
            runnable = this.i0;
        }
        this.k0 = runnable;
    }

    public final void P(ll0 ll0Var, ol0 ol0Var, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z;
        this.V0 = ll0Var;
        this.W0 = ol0Var;
        jl0 c = ll0Var.c(this, null, false);
        c.p(ol0Var);
        c.q(hl.L(6.0f));
        this.a = c;
        if (z) {
            c.s(hl.L(18.33f), hl.L(23.0f), hl.L(23.0f), hl.L(18.33f));
        } else {
            c.r(hl.L(23.0f));
        }
        jl0 c2 = ll0Var.c(this, null, false);
        c2.p(ol0Var);
        ik8.r(c2, hl.L(23.0f), 6.0f);
        this.b = c2;
        jl0 c3 = ll0Var.c(this, null, false);
        c3.p(ol0Var);
        ik8.r(c3, hl.L(23.0f), 6.0f);
        this.c = c3;
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setTranslationX(-hl.L(10.0f));
            this.F.setGlassMode(true);
        }
        u5 u5Var = this.G;
        if (u5Var != null) {
            u5Var.setTranslationX(-hl.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(hl.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            ema[] emaVarArr = this.n;
            if (view == emaVarArr[0] || view == emaVarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void R(View[] viewArr, boolean[] zArr) {
        if (this.G == null || this.K) {
            return;
        }
        byte b = 1;
        this.K = true;
        n();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<u5, Float>) property, 0.0f, 1.0f));
        byte b2 = 0;
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
                ema emaVar = this.n[0];
                if (emaVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<ema, Float>) property, 0.0f));
                }
            }
            s6 s6Var = this.F;
            if (s6Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(s6Var, (Property<s6, Float>) property, 0.0f));
            }
        }
        int i = this.x;
        if (i == 0) {
            i = this.y;
        }
        if (i == 0 || this.Q0) {
            jn7.e().k(jn7.u4, new Object[0]);
        } else if (vm2.h(i) < 0.699999988079071d) {
            hl.k3((Activity) getContext(), false);
        } else {
            hl.k3((Activity) getContext(), true);
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
            ofFloat.addUpdateListener(new r5(this, b));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new v5(this, zArr, b2));
        this.Q.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof gd0) {
                ((gd0) drawable).c(true, 1.0f);
            }
            this.e.setBackgroundDrawable(aob.f0(this.r0, 1, -1));
        }
    }

    public final void S() {
        boolean z = this.D0 && this.E0;
        if (this.F0 != z) {
            this.F0 = z;
            vh4 vh4Var = this.P0;
            if (!z) {
                vh4Var.a = false;
                ((AnimatorSet) vh4Var.d).cancel();
                return;
            }
            vh4Var.a = true;
            AnimatorSet animatorSet = (AnimatorSet) vh4Var.d;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // o27
    public final boolean a() {
        return false;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override // o27
    public final void b(ula ulaVar, s7 s7Var) {
        this.a1 = ulaVar;
        this.b1 = s7Var;
        invalidate();
    }

    @Override // o27
    public final boolean c(s7 s7Var, RectF rectF) {
        int L = hl.L(6.0f);
        if (s7Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f = L;
            rectF.inset(f, f);
            return true;
        }
        float L2 = hl.L(46.0f) / 2.0f;
        View view = (View) s7Var.getParent();
        float width = (s7Var.getWidth() / 2.0f) + s7Var.getX() + (view != null ? view.getX() : 0.0f);
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + r0) / 2.0f)) + L2;
        rectF.set(width - L2, height - L2, width + L2, height + L2);
        return false;
    }

    @Override // o27
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        jl0 jl0Var;
        boolean z;
        s7 s7Var;
        ema[] emaVarArr;
        ema emaVar;
        Canvas canvas2 = canvas;
        int L = hl.L(6.0f);
        int L2 = hl.L(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i2 = this.s1 ? this.q1 : (int) this.o1.f;
        if (this.t1) {
            i2 = Math.max((int) ((1.0f - this.l1) * this.r1), i2);
        }
        ImageView imageView = this.e;
        boolean z2 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L2) / 2)) - L;
        int i3 = L << 1;
        int i4 = height + L2 + i3;
        jl0 jl0Var2 = this.a;
        fm0 fm0Var = this.p1;
        if (jl0Var2 == null || this.R0 || !this.w1) {
            f = 1.0f;
        } else {
            if (!this.I0 || (emaVar = (emaVarArr = this.n)[0]) == null || emaVar.getVisibility() != 0) {
                f = 1.0f;
                int i5 = ((this.s1 || this.t1) ? i2 > 0 ? L : 0 : (int) (L * fm0Var.e)) + i2;
                int i6 = L + L2;
                int max = Math.max(i5, i6);
                i = 2;
                f82 f82Var = this.T0;
                fm0 fm0Var2 = this.n1;
                int U1 = hl.U1(f82Var == null ? 0.0f : 1.0f - fm0Var2.e, i5, max);
                int U12 = hl.U1(this.T0 != null ? 1.0f - fm0Var2.e : 0.0f, z2 ? i6 : 0, i6);
                int width = getWidth() - U1;
                int i7 = width - U12;
                if (this.T0 != null) {
                    int U13 = hl.U1(Math.max(this.l1, actionModeFactor), Math.min(i7, ((int) this.m1.f) + i3), i7);
                    U12 = ((width + U12) - U13) / 2;
                    width = U12 + U13;
                    float L3 = hl.L(3.0f) + ((U12 - ((ViewGroup.MarginLayoutParams) this.T0.getLayoutParams()).leftMargin) - this.T0.getLeftPadding()) + L;
                    this.T0.setTranslationX(L3);
                    this.T0.setPivotX((r4.getMeasuredWidth() / 2.0f) - L3);
                }
                this.a.setBounds(U12, height, width, i4);
                if (!this.U0) {
                    this.a.draw(canvas2);
                }
                jl0Var = this.b;
                if (jl0Var != null && z2) {
                    jl0Var.setBounds(0, height, L2 + i3, i4);
                    this.b.draw(canvas2);
                }
                if (this.c != null && i2 > 0 && !this.R0 && !this.v1 && ((s7Var = this.b1) == null || s7Var.getParent() != this.F || !c(this.b1, this.c1))) {
                    this.c.setBounds((getWidth() - Math.max(L2, i2)) - i3, height, getWidth(), i4);
                    this.c.setAlpha(!this.s1 ? 255 : (int) (fm0Var.e * 255.0f));
                    this.c.draw(canvas2);
                }
                if (this.M0 && this.y != 0) {
                    this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i8 = this.y;
                    Paint paint = this.N0;
                    paint.setColor(i8);
                    z = this.z1;
                    wma wmaVar = this.L0;
                    if (z) {
                        canvas2 = canvas;
                        wmaVar.H(canvas2, getY(), this.O0, paint, true);
                    } else {
                        float y = getY();
                        float f2 = f - (this.A1 ? f : this.E1);
                        wmaVar.getClass();
                        wmaVar.I(canvas2, y, this.O0, paint, true, hl.U1(f2, jn7.d4, Color.alpha(aob.v0((wma.E() && xea.o() == i) ? aob.og : aob.pg, wmaVar.getResourceProvider()))));
                        canvas2 = canvas;
                    }
                }
                this.u1 = true;
                if (this.k1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                ImageView imageView2 = this.e;
                if (imageView2 == null || imageView2.getVisibility() != 0) {
                    return;
                }
                drawChild(canvas2, this.e, getDrawingTime());
                return;
            }
            f = 1.0f;
            int L4 = hl.L(48.0f) + ((int) Math.ceil(emaVarArr[0].getTextWidth())) + i3;
            int round = Math.round(emaVarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
            this.a.setBounds(round, height, L4 + round, i4);
            if (!this.U0) {
                this.a.draw(canvas2);
            }
        }
        i = 2;
        jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.setBounds(0, height, L2 + i3, i4);
            this.b.draw(canvas2);
        }
        if (this.c != null) {
            this.c.setBounds((getWidth() - Math.max(L2, i2)) - i3, height, getWidth(), i4);
            this.c.setAlpha(!this.s1 ? 255 : (int) (fm0Var.e * 255.0f));
            this.c.draw(canvas2);
        }
        if (this.M0) {
            this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i82 = this.y;
            Paint paint2 = this.N0;
            paint2.setColor(i82);
            z = this.z1;
            wma wmaVar2 = this.L0;
            if (z) {
            }
        }
        this.u1 = true;
        if (this.k1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            float f = x;
            float f2 = y;
            View x2 = x(this, f, f2, this.T0);
            if (x2 == null) {
                x2 = x(this, f, f2, null);
            }
            jl0 jl0Var = this.a;
            boolean z = jl0Var != null && jl0Var.getBounds().contains(x, y);
            if (x2 != null && x2 != this.T0) {
                jl0 jl0Var2 = this.b;
                boolean z2 = z | (jl0Var2 != null && jl0Var2.getBounds().contains(x, y));
                jl0 jl0Var3 = this.c;
                z = z2 | (jl0Var3 != null && jl0Var3.getBounds().contains(x, y));
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable z0;
        float f;
        float f2;
        boolean z2;
        pj4 pj4Var;
        s7 s7Var;
        e eVar = this.u0;
        if (eVar != null && eVar.getParentLayout() != null) {
            this.u0.getParentLayout().getClass();
        }
        boolean z3 = true;
        if (this.C0 && view == this.e) {
            return true;
        }
        if (view == this.F && (s7Var = this.b1) != null && s7Var != null && s7Var.getParent() == this.F && c(this.b1, this.c1)) {
            return true;
        }
        boolean Q = Q(view);
        if (Q) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.J ? hl.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.S && !this.j0 && !ob6.a0) {
            ema[] emaVarArr = this.n;
            if ((view == emaVarArr[0] || view == emaVarArr[1] || (view == this.G0 && this.H0)) && (z0 = aob.z0()) != null) {
                ema emaVar = view == this.G0 ? emaVarArr[0] : (ema) view;
                if (emaVar != null && emaVar.getVisibility() == 0 && (emaVar.getText() instanceof String)) {
                    TextPaint textPaint = emaVar.getTextPaint();
                    textPaint.getFontMetricsInt(this.V);
                    textPaint.getTextBounds((String) emaVar.getText(), 0, 1, this.a0);
                    int width = ((this.a0.width() - (z0.getIntrinsicWidth() + aob.D1)) / 2) + emaVar.getTextStartX() + aob.D1;
                    f = 255.0f;
                    f2 = 1.0f;
                    int textStartY = emaVar.getTextStartY() + aob.E1 + ((int) Math.ceil((emaVar.getTextHeight() - this.a0.height()) / 2.0f)) + ((int) ((1.0f - this.G0.getScaleY()) * hl.L(8.0f)));
                    z0.setBounds(width, textStartY - z0.getIntrinsicHeight(), z0.getIntrinsicWidth() + width, textStartY);
                    z0.setAlpha((int) (emaVar.getAlpha() * this.G0.getAlpha() * 255.0f));
                    z0.draw(canvas);
                    if (this.j1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f = 255.0f;
                    f2 = 1.0f;
                }
                if (aob.G1) {
                    if (this.T == null) {
                        this.T = new wna(0);
                    }
                } else if (!this.W && this.T != null) {
                    this.T = null;
                }
                wna wnaVar = this.T;
                if (wnaVar != null) {
                    wnaVar.b(canvas, this);
                } else {
                    qj4 qj4Var = this.U;
                    if (qj4Var != null) {
                        ArrayList arrayList = (ArrayList) qj4Var.d;
                        ArrayList arrayList2 = (ArrayList) qj4Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i = 0; i < size; i++) {
                                pj4 pj4Var2 = (pj4) arrayList2.get(i);
                                Paint paint = (Paint) pj4Var2.k.b;
                                paint.setColor(pj4Var2.j);
                                paint.setStrokeWidth(hl.L(1.5f) * pj4Var2.i);
                                paint.setAlpha((int) (pj4Var2.f * f));
                                canvas.drawPoint(pj4Var2.a, pj4Var2.b, paint);
                            }
                            SecureRandom secureRandom = Utilities.b;
                            if (secureRandom.nextBoolean() && arrayList2.size() + 8 < 150) {
                                int i2 = hl.m;
                                float nextFloat = secureRandom.nextFloat() * getMeasuredWidth();
                                float f3 = 20.0f;
                                float nextFloat2 = (secureRandom.nextFloat() * qu6.x(20.0f, getMeasuredHeight(), i2)) + i2;
                                int nextInt = secureRandom.nextInt(4);
                                int i3 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                int i4 = 0;
                                while (i4 < 8) {
                                    SecureRandom secureRandom2 = Utilities.b;
                                    float f4 = f3;
                                    boolean z4 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(jn7.s4) - 225) * 0.017453292519943295d;
                                    boolean z5 = z3;
                                    int i5 = i3;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        pj4Var = new pj4(qj4Var);
                                    } else {
                                        pj4Var = (pj4) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    pj4Var.a = nextFloat;
                                    pj4Var.b = nextFloat2;
                                    pj4Var.c = cos * 1.5f;
                                    pj4Var.d = sin;
                                    i3 = i5;
                                    pj4Var.j = i3;
                                    float f5 = f2;
                                    pj4Var.f = f5;
                                    pj4Var.h = 0.0f;
                                    pj4Var.i = Math.max(f5, secureRandom2.nextFloat() * 1.5f);
                                    pj4Var.g = secureRandom2.nextInt(1000) + 1000;
                                    pj4Var.e = (secureRandom2.nextFloat() * 4.0f) + f4;
                                    arrayList2.add(pj4Var);
                                    i4++;
                                    drawChild = z4;
                                    z3 = z5;
                                    f3 = f4;
                                    f2 = 1.0f;
                                }
                            }
                            boolean z6 = z3;
                            z = drawChild;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - qj4Var.a);
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                pj4 pj4Var3 = (pj4) arrayList2.get(i6);
                                float f6 = pj4Var3.h;
                                float f7 = pj4Var3.g;
                                if (f6 >= f7) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(pj4Var3);
                                    }
                                    arrayList2.remove(i6);
                                    i6--;
                                    size2--;
                                    z2 = z6;
                                } else {
                                    z2 = z6;
                                    pj4Var3.f = 1.0f - hl.F.getInterpolation(f6 / f7);
                                    float f8 = pj4Var3.a;
                                    float f9 = pj4Var3.c;
                                    float f10 = pj4Var3.e;
                                    float f11 = min;
                                    pj4Var3.a = qu6.d(f9 * f10, f11, 500.0f, f8);
                                    float f12 = pj4Var3.b;
                                    float f13 = pj4Var3.d;
                                    pj4Var3.b = (((f10 * f13) * f11) / 500.0f) + f12;
                                    pj4Var3.d = (f11 / 100.0f) + f13;
                                    pj4Var3.h += f11;
                                }
                                i6++;
                                z6 = z2;
                            }
                            qj4Var.a = currentTimeMillis;
                            invalidate();
                            if (Q) {
                                canvas.restore();
                            }
                            return z;
                        }
                    }
                }
            }
        }
        z = drawChild;
        if (Q) {
        }
        return z;
    }

    public final boolean e(String str) {
        if (this.G == null) {
            return false;
        }
        String str2 = this.H;
        return str2 == null ? str == null : str2.equals(str);
    }

    @Override // o27
    public final boolean f() {
        return true;
    }

    @Override // o27
    public final boolean g() {
        return false;
    }

    public d6 getActionBarMenuOnItemClick() {
        return this.v0;
    }

    public s6 getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        u5 u5Var = this.G;
        if (u5Var != null) {
            return u5Var.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.y1;
    }

    public ema getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public rk5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // o27
    public int getButtonsGlassBackgroundColor() {
        ol0 ol0Var = this.W0;
        if (ol0Var != null) {
            return ol0Var.a(ol0Var.e);
        }
        return 0;
    }

    @Override // o27
    public bl0 getButtonsGlassColorProvider() {
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

    @Override // o27
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override // o27
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override // o27
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override // o27
    public bl0 getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override // o27
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override // o27
    public vnb getMenuResourcesProvider() {
        return this.K0;
    }

    @Override // o27
    public int getMenuRise() {
        return this.Z0;
    }

    @Override // o27
    public View getMenuView() {
        return this.F;
    }

    public boolean getOccupyStatusBar() {
        return this.J;
    }

    @Override // o27
    public ula getOpenMenuOverlay() {
        return this.a1;
    }

    public de0 getSearchAvatarImageView() {
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
        ema emaVar = this.r;
        if (emaVar != null) {
            return emaVar.getTextColor();
        }
        return 0;
    }

    public ema getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        ema emaVar = this.n[0];
        if (emaVar == null) {
            return null;
        }
        return emaVar.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        ema emaVar = this.n[0];
        if (emaVar != null) {
            return emaVar.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(hl.L((hl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public ema getTitleTextView() {
        return this.n[0];
    }

    public ema getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override // o27
    public final boolean h() {
        return false;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // o27
    public final jl0 i(ula ulaVar) {
        ll0 ll0Var = this.X0;
        if (ll0Var == null) {
            ll0Var = this.V0;
        }
        if (ll0Var == null) {
            return null;
        }
        jl0 c = ll0Var.c(ulaVar, null, false);
        c.p(this.W0);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    public final void j() {
        if (this.z1) {
            float f = this.A1 ? 1.0f : this.E1;
            int i = this.C1;
            vnb vnbVar = this.K0;
            int v0 = i == -1 ? 0 : aob.v0(i, vnbVar);
            int i2 = this.B1;
            int v02 = i2 == -1 ? 0 : aob.v0(i2, vnbVar);
            if (v02 == 0) {
                v02 = vm2.o(v0, 0);
            }
            if (v0 == 0) {
                v0 = vm2.o(v02, 0);
            }
            setBackgroundColor(vm2.f(f, v0, v02));
            setShadowAlpha((int) ((1.0f - f) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void k() {
        if (ob6.a0) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new a6((byte) 0));
        this.A0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) k43.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void l(boolean z) {
        f82 f82Var = this.T0;
        if (f82Var == null) {
            return;
        }
        b82 b82Var = f82Var.e;
        boolean z2 = b82Var != null && b82Var.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - hl.L(116.0f), this.T0.getVisualWidth());
        t84 t84Var = this.m1;
        if (z) {
            float f = min;
            if ((t84Var.h ? t84Var.g : t84Var.f) != f) {
                t84Var.a(f);
            }
        } else {
            t84Var.c(min);
        }
        this.n1.a(z2, z);
    }

    public final void m() {
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            int i = ((drawable instanceof gd0) || (drawable instanceof h27)) ? 2 : 0;
            if (this.e.getLayerType() != i) {
                this.e.setLayerType(i, null);
                this.e.invalidate();
            }
        }
    }

    public final void n() {
        s6 s6Var = this.F;
        int max = Math.max(0, s6Var != null ? (s6Var.getItemsWidth() - hl.L(1.0f)) - hl.L(1.0f) : 0);
        u5 u5Var = this.G;
        int max2 = Math.max(0, u5Var != null ? (u5Var.getItemsWidth() - hl.L(1.0f)) - hl.L(1.0f) : 0);
        Typeface typeface = hl.a;
        if (this.K) {
            max = max2;
        }
        this.p1.a(max > 0, this.u1);
        t84 t84Var = this.o1;
        float f = max;
        if ((t84Var.h ? t84Var.g : t84Var.f) != f) {
            if (this.u1) {
                t84Var.a(f);
            } else {
                t84Var.c(f);
            }
        }
    }

    public void o(boolean z) {
        s6 s6Var;
        if (!this.o0 || (s6Var = this.F) == null) {
            return;
        }
        s6Var.i(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        S();
        if (this.K) {
            int i = this.x;
            if (i == 0) {
                i = this.y;
            }
            if (i == 0 || this.Q0) {
                jn7.e().k(jn7.u4, new Object[0]);
            } else if (vm2.h(i) < 0.699999988079071d) {
                hl.k3((Activity) getContext(), false);
            } else {
                hl.k3((Activity) getContext(), true);
            }
        }
        ul ulVar = this.e0;
        if (ik8.A(ulVar)) {
            ulVar.l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        S();
        if (this.K) {
            int i = this.y;
            if (i == 0 || this.x == 0 || this.Q0) {
                jn7.e().k(jn7.u4, new Object[0]);
            } else if (vm2.h(i) < 0.699999988079071d) {
                hl.k3((Activity) getContext(), false);
            } else {
                hl.k3((Activity) getContext(), true);
            }
        }
        ul ulVar = this.e0;
        if (ik8.A(ulVar)) {
            ulVar.l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z0;
        if (this.S && !this.j0 && !ob6.a0 && motionEvent.getAction() == 0 && (z0 = aob.z0()) != null && z0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            wna wnaVar = this.T;
            ema[] emaVarArr = this.n;
            if (wnaVar == null) {
                this.U = null;
                this.T = new wna(0);
                emaVarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                qj4 qj4Var = new qj4();
                qj4Var.c = new ArrayList();
                qj4Var.d = new ArrayList();
                Paint paint = new Paint(1);
                qj4Var.b = paint;
                paint.setStrokeWidth(hl.L(1.5f));
                paint.setColor(aob.w0(null, aob.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i = 0; i < 20; i++) {
                    ((ArrayList) qj4Var.d).add(new pj4(qj4Var));
                }
                this.U = qj4Var;
                emaVarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.J0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r13.x0 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (r13.y0 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r4 = (getCurrentActionBarHeight() - r6[r3].getTextHeight()) / 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c6  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        ema[] emaVarArr;
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int currentActionBarHeight;
        int i10 = this.J ? hl.m : 0;
        if (this.i1 != getMeasuredWidth()) {
            this.i1 = getMeasuredWidth();
            l(this.m1.h);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = hl.L(this.Q0 ? 24.0f : hl.O1() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i10, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i10);
            L = hl.L(this.Q0 ? 76.0f : hl.O1() ? 80.0f : 72.0f);
        }
        int i11 = L + this.h1;
        s6 s6Var = this.F;
        if (s6Var != null && s6Var.getVisibility() != 8) {
            int L2 = this.F.p() ? hl.L(this.n0 ? 0.0f : hl.O1() ? 74.0f : 66.0f) : getMeasuredWidth() - this.F.getMeasuredWidth();
            s6 s6Var2 = this.F;
            s6Var2.layout(L2, i10, s6Var2.getMeasuredWidth() + L2, this.F.getMeasuredHeight() + i10);
        }
        int i12 = 0;
        while (true) {
            emaVarArr = this.n;
            if (i12 >= 2) {
                break;
            }
            ema emaVar = emaVarArr[i12];
            if (emaVar != null && emaVar.getVisibility() != 8) {
                if (this.z0) {
                    ema emaVar2 = this.r;
                    currentActionBarHeight = (emaVar2 != null || emaVar2.getVisibility() == 8) ? (getCurrentActionBarHeight() - emaVarArr[i12].getTextHeight()) / 2 : hl.L((hl.O1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + hl.L(2.0f) + (((getCurrentActionBarHeight() / 2) - emaVarArr[i12].getTextHeight()) / 2);
                } else {
                    ema emaVar22 = this.r;
                    if (emaVar22 != null) {
                    }
                }
                int measuredWidth2 = this.I0 ? (getMeasuredWidth() - emaVarArr[i12].getMeasuredWidth()) / 2 : i11;
                ema emaVar3 = emaVarArr[i12];
                int i13 = currentActionBarHeight + i10;
                emaVar3.layout(measuredWidth2, i13 - emaVar3.getPaddingTop(), emaVarArr[i12].getMeasuredWidth() + measuredWidth2, emaVarArr[i12].getPaddingBottom() + ((emaVarArr[i12].getTextHeight() + i13) - emaVarArr[i12].getPaddingTop()));
            }
            i12++;
        }
        if (this.y1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.y1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - hl.L(2.0f);
            c6 c6Var = this.y1;
            int i14 = currentActionBarHeight2 + i10;
            c6Var.layout(i11, i14, c6Var.getMeasuredWidth() + i11, this.y1.getMeasuredHeight() + i14);
        }
        ema emaVar4 = this.r;
        if (emaVar4 != null && emaVar4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - hl.L(2.0f);
            int measuredWidth3 = this.I0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i11;
            ema emaVar5 = this.r;
            int i15 = currentActionBarHeight3 + i10;
            emaVar5.layout(measuredWidth3, i15, emaVar5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i15);
        }
        ema emaVar6 = this.s;
        if (emaVar6 != null && emaVar6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!hl.O1()) {
                int i16 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - hl.L(1.0f);
            ema emaVar7 = this.s;
            int i17 = L3 + i10;
            emaVar7.layout(i11, i17, emaVar7.getMeasuredWidth() + i11, this.s.getTextHeight() + i17);
        }
        de0 de0Var = this.f;
        if (de0Var != null) {
            de0Var.layout(hl.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i10, this.f.getMeasuredWidth() + hl.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i10);
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != emaVarArr[0] && childAt != emaVarArr[1] && childAt != this.y1 && childAt != this.r && childAt != this.F && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i19 = layoutParams.gravity;
                if (i19 == -1) {
                    i19 = 51;
                }
                int i20 = i19 & jn7.w1;
                int i21 = i19 & 7;
                if (i21 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth4) / 2) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                } else if (i21 != 5) {
                    i6 = layoutParams.leftMargin;
                    if (i20 != 16) {
                        i7 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        i8 = layoutParams.bottomMargin;
                    } else if (i20 != 80) {
                        i9 = layoutParams.topMargin;
                        childAt.layout(i6, i9, measuredWidth4 + i6, measuredHeight + i9);
                    } else {
                        i7 = (i4 - i2) - measuredHeight;
                        i8 = layoutParams.bottomMargin;
                    }
                    i9 = i7 - i8;
                    childAt.layout(i6, i9, measuredWidth4 + i6, measuredHeight + i9);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth4;
                    i5 = layoutParams.rightMargin;
                }
                i6 = measuredWidth - i5;
                if (i20 != 16) {
                }
                i9 = i7 - i8;
                childAt.layout(i6, i9, measuredWidth4 + i6, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ce  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int L;
        ema[] emaVarArr;
        ema emaVar;
        int i3;
        ema emaVar2;
        ema emaVar3;
        ema emaVar4;
        c6 c6Var;
        ema emaVar5;
        int makeMeasureSpec;
        a aVar = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i4 = 1;
        aVar.I = true;
        View view = aVar.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = hl.m;
        }
        u5 u5Var = aVar.G;
        if (u5Var != null) {
            u5Var.setPadding(0, aVar.J ? hl.m : 0, 0, 0);
        }
        aVar.I = false;
        aVar.setMeasuredDimension(size, currentActionBarHeight + (aVar.J ? hl.m : 0) + aVar.P);
        ImageView imageView = aVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = hl.L(hl.O1() ? 26.0f : 18.0f);
        } else {
            aVar.e.measure(View.MeasureSpec.makeMeasureSpec(hl.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = hl.L(hl.O1() ? 80.0f : 72.0f);
        }
        s6 s6Var = aVar.F;
        if (s6Var != null && s6Var.getVisibility() != 8) {
            float f = 66.0f;
            if (aVar.F.p() && !aVar.o0) {
                aVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k = aVar.F.k();
                if (aVar.n0) {
                    f = 0.0f;
                } else if (hl.O1()) {
                    f = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aVar.F.k() + (size - hl.L(f)), TLObject.FLAG_30);
                if (!aVar.E) {
                    aVar.F.r(-k);
                }
            } else if (aVar.o0) {
                if (aVar.n0) {
                    f = 0.0f;
                } else if (hl.O1()) {
                    f = 74.0f;
                }
                makeMeasureSpec = ik8.f(f, size, TLObject.FLAG_30);
                if (!aVar.E) {
                    aVar.F.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!aVar.E) {
                    aVar.F.r(0.0f);
                }
            }
            aVar.F.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i5 = 0;
        while (true) {
            emaVarArr = aVar.n;
            if (i5 >= 2) {
                break;
            }
            ema emaVar6 = emaVarArr[0];
            if ((emaVar6 == null || emaVar6.getVisibility() == 8) && ((emaVar = aVar.r) == null || emaVar.getVisibility() == 8)) {
                i3 = i4;
            } else {
                s6 s6Var2 = aVar.F;
                int measuredWidth = s6Var2 != null ? s6Var2.getMeasuredWidth() : 0;
                int max = Math.max(aVar.I0 ? size - (Math.max(L, (hl.L(16.0f) + measuredWidth) + aVar.b0) << i4) : qu6.x(16.0f, size - measuredWidth, L) - aVar.b0, 0);
                int i6 = 20;
                if (!aVar.z0 ? i5 == i4 : i5 == 0) {
                    if (aVar.x0 && aVar.y0) {
                        ema emaVar7 = emaVarArr[i5];
                        i3 = i4;
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!hl.O1() && aVar.getResources().getConfiguration().orientation == 2) {
                            i6 = 18;
                        }
                        emaVar7.setTextSize(i6);
                        emaVar3 = emaVarArr[i5];
                        if (emaVar3 != null && emaVar3.getVisibility() != 8) {
                            emaVarArr[i5].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(emaVarArr[i5].getPaddingBottom() + emaVarArr[i5].getPaddingTop() + hl.L(24.0f), TLObject.FLAG_31));
                            if (aVar.A0) {
                                emaVarArr[i5].setPivotX(0.0f);
                                emaVarArr[i5].setPivotY(0.0f);
                            } else {
                                CharSequence text = emaVarArr[i5].getText();
                                ema emaVar8 = emaVarArr[i5];
                                emaVar8.setPivotX(emaVar8.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                                emaVarArr[i5].setPivotY(hl.L(24.0f) >> 1);
                            }
                        }
                        emaVar4 = aVar.r;
                        if (emaVar4 != null && emaVar4.getVisibility() != 8) {
                            aVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                        }
                        c6Var = aVar.y1;
                        if (c6Var != null) {
                            c6Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                        emaVar5 = aVar.s;
                        if (emaVar5 != null && emaVar5.getVisibility() != 8) {
                            aVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                        }
                    }
                }
                i3 = i4;
                ema emaVar9 = emaVarArr[0];
                if (emaVar9 == null || emaVar9.getVisibility() == 8 || (emaVar2 = aVar.r) == null || emaVar2.getVisibility() == 8) {
                    ema emaVar10 = emaVarArr[i5];
                    if (emaVar10 != null && emaVar10.getVisibility() != 8) {
                        ema emaVar11 = emaVarArr[i5];
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!hl.O1() && aVar.getResources().getConfiguration().orientation == 2) {
                            i6 = 18;
                        }
                        emaVar11.setTextSize(i6);
                    }
                    ema emaVar12 = aVar.r;
                    if (emaVar12 != null && emaVar12.getVisibility() != 8) {
                        aVar.r.setTextSize((hl.O1() || aVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                    }
                    ema emaVar13 = aVar.s;
                    if (emaVar13 != null) {
                        emaVar13.setTextSize((hl.O1() || aVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                    }
                } else {
                    ema emaVar14 = emaVarArr[i5];
                    if (emaVar14 != null) {
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!hl.O1()) {
                            i6 = 18;
                        }
                        emaVar14.setTextSize(i6);
                    }
                    aVar.r.setTextSize(hl.O1() ? 16 : 14);
                    ema emaVar15 = aVar.s;
                    if (emaVar15 != null) {
                        emaVar15.setTextSize(hl.O1() ? 16 : 14);
                    }
                }
                emaVar3 = emaVarArr[i5];
                if (emaVar3 != null) {
                    emaVarArr[i5].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(emaVarArr[i5].getPaddingBottom() + emaVarArr[i5].getPaddingTop() + hl.L(24.0f), TLObject.FLAG_31));
                    if (aVar.A0) {
                    }
                }
                emaVar4 = aVar.r;
                if (emaVar4 != null) {
                    aVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                }
                c6Var = aVar.y1;
                if (c6Var != null) {
                }
                emaVar5 = aVar.s;
                if (emaVar5 != null) {
                    aVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                }
            }
            i5++;
            i4 = i3;
        }
        int i7 = i4;
        de0 de0Var = aVar.f;
        if (de0Var != null) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = aVar.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = aVar.getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != emaVarArr[0] && childAt != emaVarArr[i7] && childAt != aVar.y1 && childAt != aVar.r && childAt != aVar.F && childAt != aVar.e && childAt != aVar.s && childAt != aVar.f) {
                aVar.measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(aVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i8++;
            aVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.N;
    }

    public final s6 p() {
        return q(null);
    }

    public final s6 q(String str) {
        boolean e = e(str);
        u5 u5Var = this.G;
        if (e) {
            return u5Var;
        }
        if (u5Var != null) {
            removeView(u5Var);
            this.G = null;
        }
        this.H = str;
        u5 u5Var2 = new u5(this, getContext(), this);
        this.G = u5Var2;
        u5Var2.setTranslationX(this.Q0 ? -hl.L(10.0f) : 0.0f);
        this.G.setGlassMode(this.Q0);
        u5 u5Var3 = this.G;
        u5Var3.c = true;
        u5Var3.setClickable(true);
        if (!this.Q0) {
            yob.h(aob.w8, this.K0, this.G);
        }
        addView(this.G, indexOfChild(this.e));
        this.G.setPadding(0, this.J ? hl.m : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.P;
        layoutParams.gravity = 5;
        this.G.setLayoutParams(layoutParams);
        this.G.setVisibility(4);
        return this.G;
    }

    public final void r() {
        if (this.s != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        this.s = emaVar;
        emaVar.setGravity(3);
        this.s.setVisibility(8);
        yob.W(this.s, aob.B8, this.K0);
        addView(this.s, 0, tre.e(-2, -2, 51));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(aob.f0(this.q0, 1, -1));
        this.e.setPadding(hl.L(1.0f), 0, 0, 0);
        addView(this.e, tre.e(54, 54, 51));
        this.e.setOnClickListener(new s5(this, (byte) 1));
        this.e.setContentDescription(ob6.M0(2131754874, null));
    }

    public void setActionBarMenuOnItemClick(d6 d6Var) {
        this.v0 = d6Var;
    }

    public void setActionModeColor(int i) {
        u5 u5Var = this.G;
        if (u5Var != null) {
            xob xobVar = yob.a;
            u5Var.setTag(R.id.theme_bind, null);
            this.G.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.x = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.w;
        if (view != null) {
            yob.q(view);
            this.w.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(ny9 ny9Var) {
        int i = aob.a7;
        int i2 = aob.s8;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = hl.O1();
        j();
        ve2 ve2Var = new ve2(this, ny9Var, (byte) 18);
        ny9Var.M.add(ve2Var);
        if (this.z1) {
            ve2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = ny9Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        j();
    }

    public void setAddToContainer(boolean z) {
        this.L = z;
    }

    public void setAdditionalTextLeft(int i) {
        this.h1 = i;
    }

    public void setAllowOverlayTitle(boolean z) {
        this.c0 = z;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.e == null) {
            s();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof gd0) {
            gd0 gd0Var = (gd0) drawable;
            gd0Var.c(false, z() ? 1.0f : 0.0f);
            gd0Var.b(this.t0);
            gd0Var.a(this.s0);
        } else if (drawable instanceof h27) {
            h27 h27Var = (h27) drawable;
            h27Var.k = this.y;
            h27Var.j = this.s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.d1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        m();
    }

    public void setBackButtonImage(int i) {
        if (this.e == null) {
            s();
        }
        this.e.setVisibility(i == 0 ? 8 : 0);
        this.e.setImageResource(i);
        this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        m();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.y = i;
        if (!this.M0) {
            super.setBackgroundColor(i);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h27) {
                ((h27) drawable).k = i;
            }
        }
    }

    public void setCastShadows(boolean z) {
        if (this.l0 != z && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.l0 = z;
    }

    public void setCenterTitleAndGlass(boolean z) {
        if (this.I0 == z) {
            return;
        }
        this.I0 = z;
        ema[] emaVarArr = this.n;
        int length = emaVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ema emaVar = emaVarArr[i];
            if (emaVar != null) {
                emaVar.setGravity(z ? 17 : 19);
            }
            i++;
        }
        ema emaVar2 = this.r;
        if (emaVar2 != null) {
            emaVar2.setGravity(z ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(f82 f82Var) {
        this.T0 = f82Var;
    }

    public void setClipContent(boolean z) {
        this.M = z;
    }

    public void setDrawBackButton(boolean z) {
        this.C0 = z;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(wma wmaVar) {
        this.M0 = true;
        this.L0 = wmaVar;
        wmaVar.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z) {
        if (this.w1 != z) {
            this.w1 = z;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setEnabled(z);
        }
        u5 u5Var = this.G;
        if (u5Var != null) {
            u5Var.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.P = i;
        u5 u5Var = this.G;
        if (u5Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u5Var.getLayoutParams();
            layoutParams.bottomMargin = this.P;
            this.G.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.O = z;
    }

    public void setForcedMenuMinWidth(int i) {
        this.t1 = true;
        if (this.r1 != i) {
            this.r1 = i;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i) {
        this.s1 = true;
        if (this.q1 != i) {
            this.q1 = i;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i) {
        if (this.x1 != i) {
            this.x1 = i;
            invalidate();
        }
        jl0 jl0Var = this.a;
        if (jl0Var == null || jl0Var.c == i) {
            return;
        }
        jl0Var.setAlpha(i);
        invalidate();
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.N = z;
    }

    @Override // o27
    public void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.Y0;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.E = z;
    }

    public void setMenuRise(int i) {
        this.Z0 = i;
    }

    public void setOccupyStatusBar(boolean z) {
        this.J = z;
        u5 u5Var = this.G;
        if (u5Var != null) {
            u5Var.setPadding(0, z ? hl.m : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.x0 = z;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
        ema[] emaVarArr = this.n;
        ema emaVar = emaVarArr[0];
        if (emaVar != null) {
            emaVar.setRightDrawableOnClick(onClickListener);
        }
        ema emaVar2 = emaVarArr[1];
        if (emaVar2 != null) {
            emaVar2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(de0 de0Var) {
        de0 de0Var2 = this.f;
        if (de0Var2 != de0Var) {
            if (de0Var2 != null) {
                removeView(de0Var2);
            }
            this.f = de0Var;
            if (de0Var != null) {
                addView(de0Var);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setSearchCursorColor(i);
        }
    }

    public void setSearchFactor(float f) {
        if (this.l1 != f) {
            this.l1 = f;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.F.setSearchFieldText(str);
    }

    public void setSearchFilter(ph4 ph4Var) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setFilter(ph4Var);
        }
    }

    public void setShadowAlpha(int i) {
        if (this.m0 == i) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.m0 = i;
    }

    public void setSkipDrawChild(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            v();
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

    public void setSubtitleColor(int i) {
        if (this.r == null) {
            v();
        }
        yob.q(this.r);
        this.r.setTextColor(i);
    }

    public void setSupportsHolidayImage(boolean z) {
        this.S = z;
        if (z) {
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

    public void setTitleColor(int i) {
        ema[] emaVarArr = this.n;
        if (emaVarArr[0] == null) {
            w(0);
        }
        this.w0 = i;
        yob.q(emaVarArr[0]);
        emaVarArr[0].setTextColor(i);
        emaVarArr[0].setEmojiColor(i);
        ema emaVar = emaVarArr[1];
        if (emaVar != null) {
            yob.q(emaVar);
            emaVarArr[1].setTextColor(i);
            emaVarArr[1].setEmojiColor(i);
        }
    }

    public void setTitleRightMargin(int i) {
        this.b0 = i;
    }

    public void setTitleScrollNonFitText(boolean z) {
        this.n[0].setScrollNonFitText(z);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.M) {
            invalidate();
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        invalidate();
    }

    public final s6 u() {
        s6 s6Var = this.F;
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6Var2 = new s6(getContext(), this);
        this.F = s6Var2;
        addView(s6Var2, 0, tre.e(-2, -1, 5));
        return this.F;
    }

    @Override // snb
    public final void updateColors() {
        j();
        jl0 jl0Var = this.a;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.c;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        jl0 jl0Var3 = this.b;
        if (jl0Var3 != null) {
            jl0Var3.updateColors();
        }
        c6 c6Var = this.y1;
        if (c6Var != null) {
            c6Var.b();
        }
    }

    public final void v() {
        if (this.r != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        this.r = emaVar;
        emaVar.setGravity(3);
        this.r.setVisibility(8);
        yob.W(this.r, aob.B8, this.K0);
        addView(this.r, 0, tre.e(-2, -2, 51));
    }

    public final void w(int i) {
        ema[] emaVarArr = this.n;
        if (emaVarArr[i] != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        emaVarArr[i] = emaVar;
        emaVar.setGravity(this.I0 ? 17 : 19);
        int i2 = this.w0;
        if (i2 != 0) {
            emaVarArr[i].setTextColor(i2);
        } else {
            yob.W(emaVarArr[i], aob.A8, this.K0);
        }
        ema emaVar2 = emaVarArr[i];
        emaVar2.setEmojiColor(emaVar2.getTextColor());
        emaVarArr[i].setTypeface(hl.o());
        emaVarArr[i].setDrawablePadding(hl.L(4.0f));
        emaVarArr[i].setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        emaVarArr[i].setRightDrawableTopPadding(-hl.L(1.0f));
        if (this.H0) {
            this.G0.addView(emaVarArr[i], 0, tre.e(-2, -2, 51));
        } else {
            addView(emaVarArr[i], 0, tre.e(-2, -2, 51));
        }
    }

    public void y() {
        u5 u5Var = this.G;
        if (u5Var == null || !this.K) {
            return;
        }
        int childCount = u5Var.getChildCount();
        byte b = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = u5Var.getChildAt(i);
            if (childAt instanceof s7) {
                ((s7) childAt).p();
            }
        }
        this.K = false;
        n();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<u5, Float>) property, 0.0f));
        if (this.R != null) {
            int i2 = 0;
            while (true) {
                View[] viewArr = this.R;
                if (i2 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i2];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.R[i2], (Property<View, Float>) property, 1.0f));
                }
                i2++;
            }
        }
        boolean z = this.o0;
        ema[] emaVarArr = this.n;
        if (!z) {
            ema emaVar = emaVarArr[0];
            if (emaVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<ema, Float>) property, 1.0f));
            }
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(s6Var, (Property<s6, Float>) property, 1.0f));
        }
        int i3 = this.y;
        if (i3 == 0 || this.Q0) {
            jn7.e().k(jn7.u4, new Object[0]);
        } else if (vm2.h(i3) < 0.699999988079071d) {
            hl.k3((Activity) getContext(), false);
        } else {
            hl.k3((Activity) getContext(), true);
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
            ofFloat.addUpdateListener(new r5(this, b));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new w5(this, b));
        this.Q.start();
        if (!this.o0) {
            ema emaVar2 = emaVarArr[0];
            if (emaVar2 != null) {
                emaVar2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                this.r.setVisibility(0);
            }
        }
        s6 s6Var2 = this.F;
        if (s6Var2 != null) {
            s6Var2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof gd0) {
                ((gd0) drawable).c(true, 0.0f);
            }
            this.e.setBackgroundDrawable(aob.f0(this.q0, 1, -1));
        }
    }

    public final boolean z() {
        return this.G != null && this.K;
    }

    @Override // o27
    public View getMenuHostView() {
        return this;
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        F(recyclerView, aob.a7, aob.s8);
    }
}
