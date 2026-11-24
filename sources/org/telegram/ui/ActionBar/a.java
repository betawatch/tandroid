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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class a extends FrameLayout implements x74, tjb, h07 {
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
    public r6 F;
    public boolean F0;
    public ValueAnimator F1;
    public t5 G;
    public a6 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final wjb K0;
    public boolean L;
    public cja L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final xf4 P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public cka T;
    public o72 T0;
    public oh4 U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public kl0 V0;
    public boolean W;
    public nl0 W0;
    public kl0 X0;
    public jx4 Y0;
    public int Z0;
    public il0 a;
    public Rect a0;
    public zha a1;
    public il0 b;
    public int b0;
    public r7 b1;
    public il0 c;
    public boolean c0;
    public final RectF c1;
    public final pi5 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public tl e0;
    public Runnable e1;
    public be0 f;
    public View.OnClickListener f0;
    public sr8 f1;
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
    public final y74 m1;
    public final jia[] n;
    public boolean n0;
    public final fm0 n1;
    public boolean o0;
    public final y74 o1;
    public float p0;
    public final fm0 p1;
    public int q0;
    public int q1;
    public jia r;
    public int r0;
    public int r1;
    public jia s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public d u0;
    public boolean u1;
    public c6 v0;
    public boolean v1;
    public View w;
    public int w0;
    public boolean w1;
    public int x;
    public boolean x0;
    public int x1;
    public int y;
    public boolean y0;
    public b6 y1;
    public boolean z0;
    public boolean z1;

    public a(Context context, wjb wjbVar) {
        super(context);
        this.d = pi5.a;
        this.n = new jia[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = kk7.d4;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new xf4(this);
        this.c1 = new RectF();
        s33 s33Var = s33.h;
        this.m1 = new y74(0, this, s33Var, 380L);
        this.n1 = new fm0(0, this, s33Var, 380L, false);
        this.o1 = new y74(0, this, s33Var, 320L);
        this.p1 = new fm0(0, this, s33Var, 320L, false);
        this.w1 = true;
        this.x1 = kk7.d4;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = wjbVar;
        setOnClickListener(new r5(this, (byte) 0));
    }

    public static int getCurrentActionBarHeight() {
        if (gl.O1()) {
            return gl.L(58.0f);
        }
        Point point = gl.q;
        return point.x > point.y ? gl.L(48.0f) : gl.L(56.0f);
    }

    public static View w(a aVar, float f, float f2, View view) {
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return false;
    }

    public void B(boolean z) {
        Property property;
        this.o0 = z;
        m();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean A = A();
        if (!A) {
            jia jiaVar = this.n[0];
            if (jiaVar != null) {
                arrayList.add(jiaVar);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new q5(this, (byte) 2));
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
        be0 be0Var = this.f;
        if (be0Var != null) {
            be0Var.setVisibility(0);
            this.g1.playTogether(ObjectAnimator.ofFloat(this.f, (Property<be0, Float>) property, z ? 1.0f : 0.0f));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new w5(this, arrayList, z, A));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a07) {
                a07 a07Var = (a07) drawable;
                a07Var.h = true;
                a07Var.a(true, z ? 1.0f : 0.0f);
            }
        }
    }

    public final void C() {
        r6 r6Var = this.F;
        int childCount = r6Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r6Var.getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v()) {
                    r7Var.F();
                }
            }
        }
    }

    public final void E() {
        r6 r6Var = this.F;
        if (r6Var != null) {
            boolean z = this.o0;
            boolean z2 = !z;
            int childCount = r6Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = r6Var.getChildAt(i);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.v()) {
                        if (!z) {
                            r6Var.b.B(r7Var.T(z2));
                        }
                        r7Var.P("", false);
                        r7Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void F(RecyclerView recyclerView, int i, int i2) {
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gl.O1();
        ee2 ee2Var = new ee2(this, recyclerView, (byte) 19);
        recyclerView.j(new y(ee2Var, (byte) 1));
        if (this.z1) {
            ee2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    public final void G(int i, boolean z) {
        ImageView imageView;
        if (z) {
            this.r0 = i;
            if (this.K && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(bkb.f0(i, 1, -1));
            }
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.s();
                return;
            }
            return;
        }
        this.q0 = i;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(bkb.f0(i, 1, -1));
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.s();
        }
    }

    public void H(int i, boolean z) {
        if (z) {
            this.t0 = i;
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof ed0) {
                    ((ed0) drawable).b(i);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof ed0) {
                    ((ed0) drawable2).a(i);
                } else if (drawable2 instanceof a07) {
                    ((a07) drawable2).j = i;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
            r6 r6Var = this.F;
            if (r6Var != null) {
                r6Var.t();
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
            t5 t5Var = this.G;
            if (t5Var != null) {
                int childCount = t5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = t5Var.getChildAt(i2);
                    if (childAt instanceof r7) {
                        ((r7) childAt).I(i);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount2 = r6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = r6Var.getChildAt(i2);
                if (childAt2 instanceof r7) {
                    ((r7) childAt2).I(i);
                }
                i2++;
            }
        }
    }

    public final void J(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (z2) {
            t5 t5Var = this.G;
            if (t5Var != null) {
                int childCount = t5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = t5Var.getChildAt(i2);
                    if (childAt instanceof r7) {
                        ((r7) childAt).O(i, z);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount2 = r6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = r6Var.getChildAt(i2);
                if (childAt2 instanceof r7) {
                    ((r7) childAt2).O(i, z);
                }
                i2++;
            }
        }
    }

    public final void K(int i, boolean z) {
        if (z) {
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.setPopupItemsSelectorColor(i);
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setPopupItemsSelectorColor(i);
        }
    }

    public final void L(int i, boolean z) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount = r6Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r6Var.getChildAt(i2);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.v()) {
                        if (z) {
                            r7Var.getSearchField().setHintTextColor(i);
                            return;
                        } else {
                            r7Var.getSearchField().setTextColor(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, tl tlVar) {
        jia[] jiaVarArr = this.n;
        if (charSequence != null && jiaVarArr[0] == null) {
            v(0);
        }
        jia jiaVar = jiaVarArr[0];
        if (jiaVar != null) {
            jiaVar.setVisibility((charSequence == null || this.o0) ? 4 : 0);
            jia jiaVar2 = jiaVarArr[0];
            this.d0 = charSequence;
            jiaVar2.k(charSequence);
            if (this.D0) {
                tl tlVar2 = this.e0;
                if (ug8.A(tlVar2)) {
                    tlVar2.l(null);
                }
            }
            jia jiaVar3 = jiaVarArr[0];
            this.e0 = tlVar;
            jiaVar3.i(tlVar);
            if (this.D0) {
                tl tlVar3 = this.e0;
                if (ug8.A(tlVar3)) {
                    tlVar3.l(jiaVarArr[0]);
                }
            }
            jiaVarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z, long j, s33 s33Var) {
        jia[] jiaVarArr = this.n;
        byte b = 0;
        if (jiaVarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z2 = this.x0 && !TextUtils.isEmpty(this.B0);
        if (z2) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            ug8.s(this.r.animate(), z ? 0.0f : 1.0f, 220L);
        }
        jia jiaVar = jiaVarArr[1];
        if (jiaVar != null) {
            if (jiaVar.getParent() != null) {
                ((ViewGroup) jiaVarArr[1].getParent()).removeView(jiaVarArr[1]);
            }
            jiaVarArr[1] = null;
        }
        jiaVarArr[1] = jiaVarArr[0];
        jiaVarArr[0] = null;
        setTitle(charSequence);
        this.z0 = z;
        jiaVarArr[0].setAlpha(0.0f);
        if (!z2) {
            jia jiaVar2 = jiaVarArr[0];
            int L = gl.L(20.0f);
            if (!z) {
                L = -L;
            }
            jiaVar2.setTranslationY(L);
        }
        ViewPropertyAnimator duration = jiaVarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (s33Var != null) {
            duration.setInterpolator(s33Var);
        }
        duration.start();
        this.y0 = true;
        ViewPropertyAnimator alpha = jiaVarArr[1].animate().alpha(0.0f);
        if (!z2) {
            int L2 = gl.L(20.0f);
            if (z) {
                L2 = -L2;
            }
            alpha.translationY(L2);
        }
        if (s33Var != null) {
            alpha.setInterpolator(s33Var);
        }
        alpha.setDuration(j).setListener(new x5(this, z2, z, b)).start();
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(String str, int i, Runnable runnable) {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        a6 a6Var;
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
        tl tlVar = null;
        if (this.y1 != null) {
            this.y1.a(i == 2131751793 ? gl.F2(k96.M0(2131743872, null), true, gl.L(2.6666667f), gl.L(2.0f)) : null, true);
        }
        if (str != null) {
            charSequence = k96.M0(i, str);
        } else {
            CharSequence charSequence3 = this.d0;
            tlVar = this.e0;
            charSequence = charSequence3;
        }
        xf4 xf4Var = this.P0;
        if (str == null || (indexOf = TextUtils.indexOf(charSequence, "...")) < 0) {
            z = false;
            charSequence2 = charSequence;
        } else {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            xf4Var.M(valueOf, indexOf);
            z = true;
            charSequence2 = valueOf;
        }
        this.j0 = str != null;
        jia[] jiaVarArr = this.n;
        if ((charSequence2 == null || jiaVarArr[0] != 0) && getMeasuredWidth() != 0 && ((a6Var = jiaVarArr[0]) == 0 || a6Var.getVisibility() == 0)) {
            a6 a6Var2 = jiaVarArr[0];
            if (a6Var2 != 0) {
                a6Var2.animate().cancel();
                a6 a6Var3 = jiaVarArr[1];
                if (a6Var3 != 0) {
                    a6Var3.animate().cancel();
                }
                if (jiaVarArr[1] == 0) {
                    v(1);
                }
                jiaVarArr[1].k(charSequence2);
                jiaVarArr[1].setDrawablePadding(gl.L(4.0f));
                jiaVarArr[1].i(tlVar);
                jiaVarArr[1].setRightDrawableOnClick(this.f0);
                if (ug8.A(tlVar)) {
                    tlVar.l(jiaVarArr[1]);
                }
                if (z) {
                    xf4Var.d(jiaVarArr[1]);
                }
                this.j1 = true;
                float alpha = jiaVarArr[0].getAlpha();
                a6 a6Var4 = jiaVarArr[1];
                jiaVarArr[1] = jiaVarArr[0];
                jiaVarArr[0] = a6Var4;
                a6Var4.setAlpha(0.0f);
                jiaVarArr[0].setTranslationY(-gl.L(20.0f));
                jiaVarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                ViewPropertyAnimator alpha2 = jiaVarArr[1].animate().alpha(0.0f);
                if (this.r == null) {
                    alpha2.translationY(gl.L(20.0f));
                } else {
                    alpha2.scaleY(0.7f).scaleX(0.7f);
                }
                requestLayout();
                this.A0 = true;
                alpha2.setDuration(220L).setListener(new v5(this, b)).start();
            }
        } else {
            v(0);
            if (this.S) {
                jiaVarArr[0].invalidate();
                invalidate();
            }
            jiaVarArr[0].k(charSequence2);
            jiaVarArr[0].setDrawablePadding(gl.L(4.0f));
            jiaVarArr[0].i(tlVar);
            jiaVarArr[0].setRightDrawableOnClick(this.f0);
            if (ug8.A(tlVar)) {
                tlVar.l(jiaVarArr[0]);
            }
            if (z) {
                xf4Var.d(jiaVarArr[0]);
            } else {
                xf4Var.F(jiaVarArr[0]);
            }
        }
        if (runnable == null) {
            runnable = this.i0;
        }
        this.k0 = runnable;
    }

    public final void P(kl0 kl0Var, nl0 nl0Var, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z;
        this.V0 = kl0Var;
        this.W0 = nl0Var;
        il0 c = kl0Var.c(this, null, false);
        c.p(nl0Var);
        c.q(gl.L(6.0f));
        this.a = c;
        if (z) {
            c.s(gl.L(18.33f), gl.L(23.0f), gl.L(23.0f), gl.L(18.33f));
        } else {
            c.r(gl.L(23.0f));
        }
        il0 c2 = kl0Var.c(this, null, false);
        c2.p(nl0Var);
        ug8.r(c2, gl.L(23.0f), 6.0f);
        this.b = c2;
        il0 c3 = kl0Var.c(this, null, false);
        c3.p(nl0Var);
        ug8.r(c3, gl.L(23.0f), 6.0f);
        this.c = c3;
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setTranslationX(-gl.L(10.0f));
            this.F.setGlassMode(true);
        }
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setTranslationX(-gl.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(gl.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            jia[] jiaVarArr = this.n;
            if (view == jiaVarArr[0] || view == jiaVarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
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
        m();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<t5, Float>) property, 0.0f, 1.0f));
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
                jia jiaVar = this.n[0];
                if (jiaVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<jia, Float>) property, 0.0f));
                }
            }
            r6 r6Var = this.F;
            if (r6Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, 0.0f));
            }
        }
        int i = this.x;
        if (i == 0) {
            i = this.y;
        }
        if (i == 0 || this.Q0) {
            kk7.e().k(kk7.t4, new Object[0]);
        } else if (bm2.h(i) < 0.699999988079071d) {
            gl.l3((Activity) getContext(), false);
        } else {
            gl.l3((Activity) getContext(), true);
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
            ofFloat.addUpdateListener(new q5(this, b));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new u5(this, zArr, b2));
        this.Q.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof ed0) {
                ((ed0) drawable).c(true, 1.0f);
            }
            this.e.setBackgroundDrawable(bkb.f0(this.r0, 1, -1));
        }
    }

    public final void S() {
        boolean z = this.D0 && this.E0;
        if (this.F0 != z) {
            this.F0 = z;
            xf4 xf4Var = this.P0;
            if (!z) {
                xf4Var.a = false;
                ((AnimatorSet) xf4Var.d).cancel();
                return;
            }
            xf4Var.a = true;
            AnimatorSet animatorSet = (AnimatorSet) xf4Var.d;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // h07
    public final boolean a() {
        return false;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override // h07
    public final void b(zha zhaVar, r7 r7Var) {
        this.a1 = zhaVar;
        this.b1 = r7Var;
        invalidate();
    }

    @Override // h07
    public final boolean c(r7 r7Var, RectF rectF) {
        int L = gl.L(6.0f);
        if (r7Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f = L;
            rectF.inset(f, f);
            return true;
        }
        float L2 = gl.L(46.0f) / 2.0f;
        View view = (View) r7Var.getParent();
        float width = (r7Var.getWidth() / 2.0f) + r7Var.getX() + (view != null ? view.getX() : 0.0f);
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + r0) / 2.0f)) + L2;
        rectF.set(width - L2, height - L2, width + L2, height + L2);
        return false;
    }

    public final boolean d(String str) {
        if (this.G == null) {
            return false;
        }
        String str2 = this.H;
        return str2 == null ? str == null : str2.equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        il0 il0Var;
        boolean z;
        r7 r7Var;
        jia[] jiaVarArr;
        jia jiaVar;
        int L = gl.L(6.0f);
        int L2 = gl.L(46.0f);
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
        il0 il0Var2 = this.a;
        fm0 fm0Var = this.p1;
        if (il0Var2 == null || this.R0 || !this.w1) {
            f = 1.0f;
        } else {
            if (!this.I0 || (jiaVar = (jiaVarArr = this.n)[0]) == null || jiaVar.getVisibility() != 0) {
                f = 1.0f;
                int i5 = ((this.s1 || this.t1) ? i2 > 0 ? L : 0 : (int) (L * fm0Var.e)) + i2;
                int i6 = L + L2;
                int max = Math.max(i5, i6);
                i = 2;
                o72 o72Var = this.T0;
                fm0 fm0Var2 = this.n1;
                int U1 = gl.U1(o72Var == null ? 0.0f : 1.0f - fm0Var2.e, i5, max);
                int U12 = gl.U1(this.T0 != null ? 1.0f - fm0Var2.e : 0.0f, z2 ? i6 : 0, i6);
                int width = getWidth() - U1;
                int i7 = width - U12;
                if (this.T0 != null) {
                    int U13 = gl.U1(Math.max(this.l1, actionModeFactor), Math.min(i7, ((int) this.m1.f) + i3), i7);
                    U12 = ((width + U12) - U13) / 2;
                    width = U12 + U13;
                    float L3 = gl.L(3.0f) + ((U12 - ((ViewGroup.MarginLayoutParams) this.T0.getLayoutParams()).leftMargin) - this.T0.getLeftPadding()) + L;
                    this.T0.setTranslationX(L3);
                    this.T0.setPivotX((r4.getMeasuredWidth() / 2.0f) - L3);
                }
                this.a.setBounds(U12, height, width, i4);
                if (!this.U0) {
                    this.a.draw(canvas);
                }
                il0Var = this.b;
                if (il0Var != null && z2) {
                    il0Var.setBounds(0, height, L2 + i3, i4);
                    this.b.draw(canvas);
                }
                if (this.c != null && i2 > 0 && !this.R0 && !this.v1 && ((r7Var = this.b1) == null || r7Var.getParent() != this.F || !c(this.b1, this.c1))) {
                    this.c.setBounds((getWidth() - Math.max(L2, i2)) - i3, height, getWidth(), i4);
                    this.c.setAlpha(!this.s1 ? 255 : (int) (fm0Var.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.M0 && this.y != 0) {
                    this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i8 = this.y;
                    Paint paint = this.N0;
                    paint.setColor(i8);
                    z = this.z1;
                    cja cjaVar = this.L0;
                    if (z) {
                        cjaVar.H(canvas, getY(), this.O0, paint, true);
                    } else {
                        float y = getY();
                        float f2 = f - (this.A1 ? f : this.E1);
                        cjaVar.getClass();
                        cjaVar.I(canvas, y, this.O0, paint, true, gl.U1(f2, kk7.d4, Color.alpha(bkb.v0((cja.E() && gba.o() == i) ? bkb.ng : bkb.og, cjaVar.getResourceProvider()))));
                    }
                }
                this.u1 = true;
                if (this.k1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            }
            f = 1.0f;
            int L4 = gl.L(48.0f) + ((int) Math.ceil(jiaVarArr[0].getTextWidth())) + i3;
            int round = Math.round(jiaVarArr[0].getTranslationX()) + ((getWidth() - L4) / 2);
            this.a.setBounds(round, height, L4 + round, i4);
            if (!this.U0) {
                this.a.draw(canvas);
            }
        }
        i = 2;
        il0Var = this.b;
        if (il0Var != null) {
            il0Var.setBounds(0, height, L2 + i3, i4);
            this.b.draw(canvas);
        }
        if (this.c != null) {
            this.c.setBounds((getWidth() - Math.max(L2, i2)) - i3, height, getWidth(), i4);
            this.c.setAlpha(!this.s1 ? 255 : (int) (fm0Var.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.M0) {
            this.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i82 = this.y;
            Paint paint2 = this.N0;
            paint2.setColor(i82);
            z = this.z1;
            cja cjaVar2 = this.L0;
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
            View w = w(this, f, f2, this.T0);
            if (w == null) {
                w = w(this, f, f2, null);
            }
            il0 il0Var = this.a;
            boolean z = il0Var != null && il0Var.getBounds().contains(x, y);
            if (w != null && w != this.T0) {
                il0 il0Var2 = this.b;
                boolean z2 = z | (il0Var2 != null && il0Var2.getBounds().contains(x, y));
                il0 il0Var3 = this.c;
                z = z2 | (il0Var3 != null && il0Var3.getBounds().contains(x, y));
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
        nh4 nh4Var;
        r7 r7Var;
        d dVar = this.u0;
        if (dVar != null && dVar.getParentLayout() != null) {
            this.u0.getParentLayout().getClass();
        }
        boolean z3 = true;
        if (this.C0 && view == this.e) {
            return true;
        }
        if (view == this.F && (r7Var = this.b1) != null && r7Var != null && r7Var.getParent() == this.F && c(this.b1, this.c1)) {
            return true;
        }
        boolean Q = Q(view);
        if (Q) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.J ? gl.m : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.S && !this.j0 && !k96.a0) {
            jia[] jiaVarArr = this.n;
            if ((view == jiaVarArr[0] || view == jiaVarArr[1] || (view == this.G0 && this.H0)) && (z0 = bkb.z0()) != null) {
                jia jiaVar = view == this.G0 ? jiaVarArr[0] : (jia) view;
                if (jiaVar != null && jiaVar.getVisibility() == 0 && (jiaVar.getText() instanceof String)) {
                    TextPaint textPaint = jiaVar.getTextPaint();
                    textPaint.getFontMetricsInt(this.V);
                    textPaint.getTextBounds((String) jiaVar.getText(), 0, 1, this.a0);
                    int width = ((this.a0.width() - (z0.getIntrinsicWidth() + bkb.C1)) / 2) + jiaVar.getTextStartX() + bkb.C1;
                    f = 255.0f;
                    f2 = 1.0f;
                    int textStartY = jiaVar.getTextStartY() + bkb.D1 + ((int) Math.ceil((jiaVar.getTextHeight() - this.a0.height()) / 2.0f)) + ((int) ((1.0f - this.G0.getScaleY()) * gl.L(8.0f)));
                    z0.setBounds(width, textStartY - z0.getIntrinsicHeight(), z0.getIntrinsicWidth() + width, textStartY);
                    z0.setAlpha((int) (jiaVar.getAlpha() * this.G0.getAlpha() * 255.0f));
                    z0.draw(canvas);
                    if (this.j1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f = 255.0f;
                    f2 = 1.0f;
                }
                if (bkb.F1) {
                    if (this.T == null) {
                        this.T = new cka(0);
                    }
                } else if (!this.W && this.T != null) {
                    this.T = null;
                }
                cka ckaVar = this.T;
                if (ckaVar != null) {
                    ckaVar.b(canvas, this);
                } else {
                    oh4 oh4Var = this.U;
                    if (oh4Var != null) {
                        ArrayList arrayList = (ArrayList) oh4Var.d;
                        ArrayList arrayList2 = (ArrayList) oh4Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i = 0; i < size; i++) {
                                nh4 nh4Var2 = (nh4) arrayList2.get(i);
                                Paint paint = (Paint) nh4Var2.k.b;
                                paint.setColor(nh4Var2.j);
                                paint.setStrokeWidth(gl.L(1.5f) * nh4Var2.i);
                                paint.setAlpha((int) (nh4Var2.f * f));
                                canvas.drawPoint(nh4Var2.a, nh4Var2.b, paint);
                            }
                            SecureRandom secureRandom = Utilities.b;
                            if (secureRandom.nextBoolean() && arrayList2.size() + 8 < 150) {
                                int i2 = gl.m;
                                float nextFloat = secureRandom.nextFloat() * getMeasuredWidth();
                                float f3 = 20.0f;
                                float nextFloat2 = (secureRandom.nextFloat() * ls6.x(20.0f, getMeasuredHeight(), i2)) + i2;
                                int nextInt = secureRandom.nextInt(4);
                                int i3 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                int i4 = 0;
                                while (i4 < 8) {
                                    SecureRandom secureRandom2 = Utilities.b;
                                    float f4 = f3;
                                    boolean z4 = drawChild;
                                    double nextInt2 = (secureRandom2.nextInt(kk7.s4) - 225) * 0.017453292519943295d;
                                    boolean z5 = z3;
                                    int i5 = i3;
                                    float cos = (float) Math.cos(nextInt2);
                                    float sin = (float) Math.sin(nextInt2);
                                    if (arrayList.isEmpty()) {
                                        nh4Var = new nh4(oh4Var);
                                    } else {
                                        nh4Var = (nh4) arrayList.get(0);
                                        arrayList.remove(0);
                                    }
                                    nh4Var.a = nextFloat;
                                    nh4Var.b = nextFloat2;
                                    nh4Var.c = cos * 1.5f;
                                    nh4Var.d = sin;
                                    i3 = i5;
                                    nh4Var.j = i3;
                                    float f5 = f2;
                                    nh4Var.f = f5;
                                    nh4Var.h = 0.0f;
                                    nh4Var.i = Math.max(f5, secureRandom2.nextFloat() * 1.5f);
                                    nh4Var.g = secureRandom2.nextInt(1000) + 1000;
                                    nh4Var.e = (secureRandom2.nextFloat() * 4.0f) + f4;
                                    arrayList2.add(nh4Var);
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
                            long min = Math.min(17L, currentTimeMillis - oh4Var.a);
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                nh4 nh4Var3 = (nh4) arrayList2.get(i6);
                                float f6 = nh4Var3.h;
                                float f7 = nh4Var3.g;
                                if (f6 >= f7) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(nh4Var3);
                                    }
                                    arrayList2.remove(i6);
                                    i6--;
                                    size2--;
                                    z2 = z6;
                                } else {
                                    z2 = z6;
                                    nh4Var3.f = 1.0f - gl.F.getInterpolation(f6 / f7);
                                    float f8 = nh4Var3.a;
                                    float f9 = nh4Var3.c;
                                    float f10 = nh4Var3.e;
                                    float f11 = min;
                                    nh4Var3.a = ls6.d(f9 * f10, f11, 500.0f, f8);
                                    float f12 = nh4Var3.b;
                                    float f13 = nh4Var3.d;
                                    nh4Var3.b = (((f10 * f13) * f11) / 500.0f) + f12;
                                    nh4Var3.d = (f11 / 100.0f) + f13;
                                    nh4Var3.h += f11;
                                }
                                i6++;
                                z6 = z2;
                            }
                            oh4Var.a = currentTimeMillis;
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

    @Override // h07
    public final boolean e() {
        return true;
    }

    @Override // h07
    public final boolean f() {
        return true;
    }

    @Override // h07
    public final boolean g() {
        return false;
    }

    public c6 getActionBarMenuOnItemClick() {
        return this.v0;
    }

    public r6 getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        t5 t5Var = this.G;
        if (t5Var != null) {
            return t5Var.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.y1;
    }

    public jia getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public pi5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override // h07
    public int getButtonsGlassBackgroundColor() {
        nl0 nl0Var = this.W0;
        if (nl0Var != null) {
            return nl0Var.a(nl0Var.e);
        }
        return 0;
    }

    @Override // h07
    public al0 getButtonsGlassColorProvider() {
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

    @Override // h07
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override // h07
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override // h07
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override // h07
    public al0 getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override // h07
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override // h07
    public wjb getMenuResourcesProvider() {
        return this.K0;
    }

    @Override // h07
    public int getMenuRise() {
        return this.Z0;
    }

    @Override // h07
    public View getMenuView() {
        return this.F;
    }

    public boolean getOccupyStatusBar() {
        return this.J;
    }

    @Override // h07
    public zha getOpenMenuOverlay() {
        return this.a1;
    }

    public be0 getSearchAvatarImageView() {
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
        jia jiaVar = this.r;
        if (jiaVar != null) {
            return jiaVar.getTextColor();
        }
        return 0;
    }

    public jia getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        jia jiaVar = this.n[0];
        if (jiaVar == null) {
            return null;
        }
        return jiaVar.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        jia jiaVar = this.n[0];
        if (jiaVar != null) {
            return jiaVar.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(gl.L((gl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public jia getTitleTextView() {
        return this.n[0];
    }

    public jia getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override // h07
    public final il0 h(zha zhaVar) {
        kl0 kl0Var = this.X0;
        if (kl0Var == null) {
            kl0Var = this.V0;
        }
        if (kl0Var == null) {
            return null;
        }
        il0 c = kl0Var.c(zhaVar, null, false);
        c.p(this.W0);
        ug8.r(c, gl.L(23.0f), 6.0f);
        return c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.z1) {
            float f = this.A1 ? 1.0f : this.E1;
            int i = this.C1;
            wjb wjbVar = this.K0;
            int v0 = i == -1 ? 0 : bkb.v0(i, wjbVar);
            int i2 = this.B1;
            int v02 = i2 == -1 ? 0 : bkb.v0(i2, wjbVar);
            if (v02 == 0) {
                v02 = bm2.o(v0, 0);
            }
            if (v0 == 0) {
                v0 = bm2.o(v02, 0);
            }
            setBackgroundColor(bm2.f(f, v0, v02));
            setShadowAlpha((int) ((1.0f - f) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void j() {
        if (k96.a0) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new z5((byte) 0));
        this.A0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) s33.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void k(boolean z) {
        o72 o72Var = this.T0;
        if (o72Var == null) {
            return;
        }
        k72 k72Var = o72Var.e;
        boolean z2 = k72Var != null && k72Var.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - gl.L(116.0f), this.T0.getVisualWidth());
        y74 y74Var = this.m1;
        if (z) {
            float f = min;
            if ((y74Var.h ? y74Var.g : y74Var.f) != f) {
                y74Var.a(f);
            }
        } else {
            y74Var.c(min);
        }
        this.n1.a(z2, z);
    }

    public final void l() {
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            int i = ((drawable instanceof ed0) || (drawable instanceof a07)) ? 2 : 0;
            if (this.e.getLayerType() != i) {
                this.e.setLayerType(i, null);
                this.e.invalidate();
            }
        }
    }

    public final void m() {
        r6 r6Var = this.F;
        int max = Math.max(0, r6Var != null ? (r6Var.getItemsWidth() - gl.L(1.0f)) - gl.L(1.0f) : 0);
        t5 t5Var = this.G;
        int max2 = Math.max(0, t5Var != null ? (t5Var.getItemsWidth() - gl.L(1.0f)) - gl.L(1.0f) : 0);
        Typeface typeface = gl.a;
        if (this.K) {
            max = max2;
        }
        this.p1.a(max > 0, this.u1);
        y74 y74Var = this.o1;
        float f = max;
        if ((y74Var.h ? y74Var.g : y74Var.f) != f) {
            if (this.u1) {
                y74Var.a(f);
            } else {
                y74Var.c(f);
            }
        }
    }

    public void n(boolean z) {
        r6 r6Var;
        if (!this.o0 || (r6Var = this.F) == null) {
            return;
        }
        r6Var.i(z);
    }

    public final r6 o() {
        return q(null);
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
                kk7.e().k(kk7.t4, new Object[0]);
            } else if (bm2.h(i) < 0.699999988079071d) {
                gl.l3((Activity) getContext(), false);
            } else {
                gl.l3((Activity) getContext(), true);
            }
        }
        tl tlVar = this.e0;
        if (ug8.A(tlVar)) {
            tlVar.l(this.n[0]);
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
                kk7.e().k(kk7.t4, new Object[0]);
            } else if (bm2.h(i) < 0.699999988079071d) {
                gl.l3((Activity) getContext(), false);
            } else {
                gl.l3((Activity) getContext(), true);
            }
        }
        tl tlVar = this.e0;
        if (ug8.A(tlVar)) {
            tlVar.l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z0;
        if (this.S && !this.j0 && !k96.a0 && motionEvent.getAction() == 0 && (z0 = bkb.z0()) != null && z0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            cka ckaVar = this.T;
            jia[] jiaVarArr = this.n;
            if (ckaVar == null) {
                this.U = null;
                this.T = new cka(0);
                jiaVarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                oh4 oh4Var = new oh4();
                oh4Var.c = new ArrayList();
                oh4Var.d = new ArrayList();
                Paint paint = new Paint(1);
                oh4Var.b = paint;
                paint.setStrokeWidth(gl.L(1.5f));
                paint.setColor(bkb.w0(null, bkb.z8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i = 0; i < 20; i++) {
                    ((ArrayList) oh4Var.d).add(new nh4(oh4Var));
                }
                this.U = oh4Var;
                jiaVarArr[0].invalidate();
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
        jia[] jiaVarArr;
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int currentActionBarHeight;
        int i10 = this.J ? gl.m : 0;
        if (this.i1 != getMeasuredWidth()) {
            this.i1 = getMeasuredWidth();
            k(this.m1.h);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = gl.L(this.Q0 ? 24.0f : gl.O1() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i10, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i10);
            L = gl.L(this.Q0 ? 76.0f : gl.O1() ? 80.0f : 72.0f);
        }
        int i11 = L + this.h1;
        r6 r6Var = this.F;
        if (r6Var != null && r6Var.getVisibility() != 8) {
            int L2 = this.F.p() ? gl.L(this.n0 ? 0.0f : gl.O1() ? 74.0f : 66.0f) : getMeasuredWidth() - this.F.getMeasuredWidth();
            r6 r6Var2 = this.F;
            r6Var2.layout(L2, i10, r6Var2.getMeasuredWidth() + L2, this.F.getMeasuredHeight() + i10);
        }
        int i12 = 0;
        while (true) {
            jiaVarArr = this.n;
            if (i12 >= 2) {
                break;
            }
            jia jiaVar = jiaVarArr[i12];
            if (jiaVar != null && jiaVar.getVisibility() != 8) {
                if (this.z0) {
                    jia jiaVar2 = this.r;
                    currentActionBarHeight = (jiaVar2 != null || jiaVar2.getVisibility() == 8) ? (getCurrentActionBarHeight() - jiaVarArr[i12].getTextHeight()) / 2 : gl.L((gl.O1() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + gl.L(2.0f) + (((getCurrentActionBarHeight() / 2) - jiaVarArr[i12].getTextHeight()) / 2);
                } else {
                    jia jiaVar22 = this.r;
                    if (jiaVar22 != null) {
                    }
                }
                int measuredWidth2 = this.I0 ? (getMeasuredWidth() - jiaVarArr[i12].getMeasuredWidth()) / 2 : i11;
                jia jiaVar3 = jiaVarArr[i12];
                int i13 = currentActionBarHeight + i10;
                jiaVar3.layout(measuredWidth2, i13 - jiaVar3.getPaddingTop(), jiaVarArr[i12].getMeasuredWidth() + measuredWidth2, jiaVarArr[i12].getPaddingBottom() + ((jiaVarArr[i12].getTextHeight() + i13) - jiaVarArr[i12].getPaddingTop()));
            }
            i12++;
        }
        if (this.y1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.y1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - gl.L(2.0f);
            b6 b6Var = this.y1;
            int i14 = currentActionBarHeight2 + i10;
            b6Var.layout(i11, i14, b6Var.getMeasuredWidth() + i11, this.y1.getMeasuredHeight() + i14);
        }
        jia jiaVar4 = this.r;
        if (jiaVar4 != null && jiaVar4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - gl.L(2.0f);
            int measuredWidth3 = this.I0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i11;
            jia jiaVar5 = this.r;
            int i15 = currentActionBarHeight3 + i10;
            jiaVar5.layout(measuredWidth3, i15, jiaVar5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i15);
        }
        jia jiaVar6 = this.s;
        if (jiaVar6 != null && jiaVar6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!gl.O1()) {
                int i16 = getResources().getConfiguration().orientation;
            }
            int L3 = currentActionBarHeight4 - gl.L(1.0f);
            jia jiaVar7 = this.s;
            int i17 = L3 + i10;
            jiaVar7.layout(i11, i17, jiaVar7.getMeasuredWidth() + i11, this.s.getTextHeight() + i17);
        }
        be0 be0Var = this.f;
        if (be0Var != null) {
            be0Var.layout(gl.L(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i10, this.f.getMeasuredWidth() + gl.L(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i10);
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != jiaVarArr[0] && childAt != jiaVarArr[1] && childAt != this.y1 && childAt != this.r && childAt != this.F && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i19 = layoutParams.gravity;
                if (i19 == -1) {
                    i19 = 51;
                }
                int i20 = i19 & kk7.w1;
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
        jia[] jiaVarArr;
        jia jiaVar;
        int i3;
        jia jiaVar2;
        jia jiaVar3;
        jia jiaVar4;
        b6 b6Var;
        jia jiaVar5;
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
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = gl.m;
        }
        t5 t5Var = aVar.G;
        if (t5Var != null) {
            t5Var.setPadding(0, aVar.J ? gl.m : 0, 0, 0);
        }
        aVar.I = false;
        aVar.setMeasuredDimension(size, currentActionBarHeight + (aVar.J ? gl.m : 0) + aVar.P);
        ImageView imageView = aVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            L = gl.L(gl.O1() ? 26.0f : 18.0f);
        } else {
            aVar.e.measure(View.MeasureSpec.makeMeasureSpec(gl.L(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            L = gl.L(gl.O1() ? 80.0f : 72.0f);
        }
        r6 r6Var = aVar.F;
        if (r6Var != null && r6Var.getVisibility() != 8) {
            float f = 66.0f;
            if (aVar.F.p() && !aVar.o0) {
                aVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k = aVar.F.k();
                if (aVar.n0) {
                    f = 0.0f;
                } else if (gl.O1()) {
                    f = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aVar.F.k() + (size - gl.L(f)), TLObject.FLAG_30);
                if (!aVar.E) {
                    aVar.F.r(-k);
                }
            } else if (aVar.o0) {
                if (aVar.n0) {
                    f = 0.0f;
                } else if (gl.O1()) {
                    f = 74.0f;
                }
                makeMeasureSpec = ug8.f(f, size, TLObject.FLAG_30);
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
            jiaVarArr = aVar.n;
            if (i5 >= 2) {
                break;
            }
            jia jiaVar6 = jiaVarArr[0];
            if ((jiaVar6 == null || jiaVar6.getVisibility() == 8) && ((jiaVar = aVar.r) == null || jiaVar.getVisibility() == 8)) {
                i3 = i4;
            } else {
                r6 r6Var2 = aVar.F;
                int measuredWidth = r6Var2 != null ? r6Var2.getMeasuredWidth() : 0;
                int max = Math.max(aVar.I0 ? size - (Math.max(L, (gl.L(16.0f) + measuredWidth) + aVar.b0) << i4) : ls6.x(16.0f, size - measuredWidth, L) - aVar.b0, 0);
                int i6 = 20;
                if (!aVar.z0 ? i5 == i4 : i5 == 0) {
                    if (aVar.x0 && aVar.y0) {
                        jia jiaVar7 = jiaVarArr[i5];
                        i3 = i4;
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!gl.O1() && aVar.getResources().getConfiguration().orientation == 2) {
                            i6 = 18;
                        }
                        jiaVar7.setTextSize(i6);
                        jiaVar3 = jiaVarArr[i5];
                        if (jiaVar3 != null && jiaVar3.getVisibility() != 8) {
                            jiaVarArr[i5].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(jiaVarArr[i5].getPaddingBottom() + jiaVarArr[i5].getPaddingTop() + gl.L(24.0f), TLObject.FLAG_31));
                            if (aVar.A0) {
                                jiaVarArr[i5].setPivotX(0.0f);
                                jiaVarArr[i5].setPivotY(0.0f);
                            } else {
                                CharSequence text = jiaVarArr[i5].getText();
                                jia jiaVar8 = jiaVarArr[i5];
                                jiaVar8.setPivotX(jiaVar8.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                                jiaVarArr[i5].setPivotY(gl.L(24.0f) >> 1);
                            }
                        }
                        jiaVar4 = aVar.r;
                        if (jiaVar4 != null && jiaVar4.getVisibility() != 8) {
                            aVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
                        }
                        b6Var = aVar.y1;
                        if (b6Var != null) {
                            b6Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                        jiaVar5 = aVar.s;
                        if (jiaVar5 != null && jiaVar5.getVisibility() != 8) {
                            aVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
                        }
                    }
                }
                i3 = i4;
                jia jiaVar9 = jiaVarArr[0];
                if (jiaVar9 == null || jiaVar9.getVisibility() == 8 || (jiaVar2 = aVar.r) == null || jiaVar2.getVisibility() == 8) {
                    jia jiaVar10 = jiaVarArr[i5];
                    if (jiaVar10 != null && jiaVar10.getVisibility() != 8) {
                        jia jiaVar11 = jiaVarArr[i5];
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!gl.O1() && aVar.getResources().getConfiguration().orientation == 2) {
                            i6 = 18;
                        }
                        jiaVar11.setTextSize(i6);
                    }
                    jia jiaVar12 = aVar.r;
                    if (jiaVar12 != null && jiaVar12.getVisibility() != 8) {
                        aVar.r.setTextSize((gl.O1() || aVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                    }
                    jia jiaVar13 = aVar.s;
                    if (jiaVar13 != null) {
                        jiaVar13.setTextSize((gl.O1() || aVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                    }
                } else {
                    jia jiaVar14 = jiaVarArr[i5];
                    if (jiaVar14 != null) {
                        if (aVar.Q0) {
                            i6 = 17;
                        } else if (!gl.O1()) {
                            i6 = 18;
                        }
                        jiaVar14.setTextSize(i6);
                    }
                    aVar.r.setTextSize(gl.O1() ? 16 : 14);
                    jia jiaVar15 = aVar.s;
                    if (jiaVar15 != null) {
                        jiaVar15.setTextSize(gl.O1() ? 16 : 14);
                    }
                }
                jiaVar3 = jiaVarArr[i5];
                if (jiaVar3 != null) {
                    jiaVarArr[i5].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(jiaVarArr[i5].getPaddingBottom() + jiaVarArr[i5].getPaddingTop() + gl.L(24.0f), TLObject.FLAG_31));
                    if (aVar.A0) {
                    }
                }
                jiaVar4 = aVar.r;
                if (jiaVar4 != null) {
                    aVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
                }
                b6Var = aVar.y1;
                if (b6Var != null) {
                }
                jiaVar5 = aVar.s;
                if (jiaVar5 != null) {
                    aVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
                }
            }
            i5++;
            i4 = i3;
        }
        int i7 = i4;
        be0 be0Var = aVar.f;
        if (be0Var != null) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), TLObject.FLAG_30));
        }
        int childCount = aVar.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = aVar.getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != jiaVarArr[0] && childAt != jiaVarArr[i7] && childAt != aVar.y1 && childAt != aVar.r && childAt != aVar.F && childAt != aVar.e && childAt != aVar.s && childAt != aVar.f) {
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

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        invalidate();
    }

    public final r6 q(String str) {
        boolean d = d(str);
        t5 t5Var = this.G;
        if (d) {
            return t5Var;
        }
        if (t5Var != null) {
            removeView(t5Var);
            this.G = null;
        }
        this.H = str;
        t5 t5Var2 = new t5(this, getContext(), this);
        this.G = t5Var2;
        t5Var2.setTranslationX(this.Q0 ? -gl.L(10.0f) : 0.0f);
        this.G.setGlassMode(this.Q0);
        t5 t5Var3 = this.G;
        t5Var3.c = true;
        t5Var3.setClickable(true);
        if (!this.Q0) {
            zkb.h(bkb.v8, this.K0, this.G);
        }
        addView(this.G, indexOfChild(this.e));
        this.G.setPadding(0, this.J ? gl.m : 0, 0, 0);
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
        jia jiaVar = new jia(getContext());
        this.s = jiaVar;
        jiaVar.setGravity(3);
        this.s.setVisibility(8);
        zkb.W(this.s, bkb.A8, this.K0);
        addView(this.s, 0, nme.e(-2, -2, 51));
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
        this.e.setBackgroundDrawable(bkb.f0(this.q0, 1, -1));
        this.e.setPadding(gl.L(1.0f), 0, 0, 0);
        addView(this.e, nme.e(54, 54, 51));
        this.e.setOnClickListener(new r5(this, (byte) 1));
        this.e.setContentDescription(k96.M0(2131754878, null));
    }

    public void setActionBarMenuOnItemClick(c6 c6Var) {
        this.v0 = c6Var;
    }

    public void setActionModeColor(int i) {
        t5 t5Var = this.G;
        if (t5Var != null) {
            ykb ykbVar = zkb.a;
            t5Var.setTag(R.id.theme_bind, null);
            this.G.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.x = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.w;
        if (view != null) {
            zkb.q(view);
            this.w.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(tu9 tu9Var) {
        int i = bkb.Z6;
        int i2 = bkb.r8;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gl.O1();
        i();
        ee2 ee2Var = new ee2(this, tu9Var, (byte) 18);
        tu9Var.M.add(ee2Var);
        if (this.z1) {
            ee2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = tu9Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
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
        if (drawable instanceof ed0) {
            ed0 ed0Var = (ed0) drawable;
            ed0Var.c(false, y() ? 1.0f : 0.0f);
            ed0Var.b(this.t0);
            ed0Var.a(this.s0);
        } else if (drawable instanceof a07) {
            a07 a07Var = (a07) drawable;
            a07Var.k = this.y;
            a07Var.j = this.s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.d1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        l();
    }

    public void setBackButtonImage(int i) {
        if (this.e == null) {
            s();
        }
        this.e.setVisibility(i == 0 ? 8 : 0);
        this.e.setImageResource(i);
        this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        l();
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
            if (drawable instanceof a07) {
                ((a07) drawable).k = i;
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
        jia[] jiaVarArr = this.n;
        int length = jiaVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            jia jiaVar = jiaVarArr[i];
            if (jiaVar != null) {
                jiaVar.setGravity(z ? 17 : 19);
            }
            i++;
        }
        jia jiaVar2 = this.r;
        if (jiaVar2 != null) {
            jiaVar2.setGravity(z ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(o72 o72Var) {
        this.T0 = o72Var;
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

    public void setDrawBlurBackground(cja cjaVar) {
        this.M0 = true;
        this.L0 = cjaVar;
        cjaVar.P.add(this);
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
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setEnabled(z);
        }
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.P = i;
        t5 t5Var = this.G;
        if (t5Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
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
        il0 il0Var = this.a;
        if (il0Var == null || il0Var.c == i) {
            return;
        }
        il0Var.setAlpha(i);
        invalidate();
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.N = z;
    }

    @Override // h07
    public void setMenuGlassFrostedProgress(float f) {
        jx4 jx4Var = this.Y0;
        if (jx4Var != null) {
            jx4Var.k(f);
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
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setPadding(0, z ? gl.m : 0, 0, 0);
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
        jia[] jiaVarArr = this.n;
        jia jiaVar = jiaVarArr[0];
        if (jiaVar != null) {
            jiaVar.setRightDrawableOnClick(onClickListener);
        }
        jia jiaVar2 = jiaVarArr[1];
        if (jiaVar2 != null) {
            jiaVar2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(be0 be0Var) {
        be0 be0Var2 = this.f;
        if (be0Var2 != be0Var) {
            if (be0Var2 != null) {
                removeView(be0Var2);
            }
            this.f = be0Var;
            if (be0Var != null) {
                addView(be0Var);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setSearchCursorColor(i);
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

    public void setSearchFilter(rf4 rf4Var) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setFilter(rf4Var);
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
            u();
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
            u();
        }
        zkb.q(this.r);
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
        jia[] jiaVarArr = this.n;
        if (jiaVarArr[0] == null) {
            v(0);
        }
        this.w0 = i;
        zkb.q(jiaVarArr[0]);
        jiaVarArr[0].setTextColor(i);
        jiaVarArr[0].setEmojiColor(i);
        jia jiaVar = jiaVarArr[1];
        if (jiaVar != null) {
            zkb.q(jiaVar);
            jiaVarArr[1].setTextColor(i);
            jiaVarArr[1].setEmojiColor(i);
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

    public final r6 t() {
        r6 r6Var = this.F;
        if (r6Var != null) {
            return r6Var;
        }
        r6 r6Var2 = new r6(getContext(), this);
        this.F = r6Var2;
        addView(r6Var2, 0, nme.e(-2, -1, 5));
        return this.F;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        jia jiaVar = new jia(getContext());
        this.r = jiaVar;
        jiaVar.setGravity(3);
        this.r.setVisibility(8);
        zkb.W(this.r, bkb.A8, this.K0);
        addView(this.r, 0, nme.e(-2, -2, 51));
    }

    @Override // tjb
    public final void updateColors() {
        i();
        il0 il0Var = this.a;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.c;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        il0 il0Var3 = this.b;
        if (il0Var3 != null) {
            il0Var3.updateColors();
        }
        b6 b6Var = this.y1;
        if (b6Var != null) {
            b6Var.b();
        }
    }

    public final void v(int i) {
        jia[] jiaVarArr = this.n;
        if (jiaVarArr[i] != null) {
            return;
        }
        jia jiaVar = new jia(getContext());
        jiaVarArr[i] = jiaVar;
        jiaVar.setGravity(this.I0 ? 17 : 19);
        int i2 = this.w0;
        if (i2 != 0) {
            jiaVarArr[i].setTextColor(i2);
        } else {
            zkb.W(jiaVarArr[i], bkb.z8, this.K0);
        }
        jia jiaVar2 = jiaVarArr[i];
        jiaVar2.setEmojiColor(jiaVar2.getTextColor());
        jiaVarArr[i].setTypeface(gl.o());
        jiaVarArr[i].setDrawablePadding(gl.L(4.0f));
        jiaVarArr[i].setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        jiaVarArr[i].setRightDrawableTopPadding(-gl.L(1.0f));
        if (this.H0) {
            this.G0.addView(jiaVarArr[i], 0, nme.e(-2, -2, 51));
        } else {
            addView(jiaVarArr[i], 0, nme.e(-2, -2, 51));
        }
    }

    public void x() {
        t5 t5Var = this.G;
        if (t5Var == null || !this.K) {
            return;
        }
        int childCount = t5Var.getChildCount();
        byte b = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = t5Var.getChildAt(i);
            if (childAt instanceof r7) {
                ((r7) childAt).p();
            }
        }
        this.K = false;
        m();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.G, (Property<t5, Float>) property, 0.0f));
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
        jia[] jiaVarArr = this.n;
        if (!z) {
            jia jiaVar = jiaVarArr[0];
            if (jiaVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<jia, Float>) property, 1.0f));
            }
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, 1.0f));
        }
        int i3 = this.y;
        if (i3 == 0 || this.Q0) {
            kk7.e().k(kk7.t4, new Object[0]);
        } else if (bm2.h(i3) < 0.699999988079071d) {
            gl.l3((Activity) getContext(), false);
        } else {
            gl.l3((Activity) getContext(), true);
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
            ofFloat.addUpdateListener(new q5(this, b));
            this.Q.playTogether(ofFloat);
        }
        this.Q.setDuration(200L);
        this.Q.addListener(new v5(this, b));
        this.Q.start();
        if (!this.o0) {
            jia jiaVar2 = jiaVarArr[0];
            if (jiaVar2 != null) {
                jiaVar2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                this.r.setVisibility(0);
            }
        }
        r6 r6Var2 = this.F;
        if (r6Var2 != null) {
            r6Var2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof ed0) {
                ((ed0) drawable).c(true, 0.0f);
            }
            this.e.setBackgroundDrawable(bkb.f0(this.q0, 1, -1));
        }
    }

    public final boolean y() {
        return this.G != null && this.K;
    }

    public final boolean z(String str) {
        if (this.G == null || !this.K) {
            return false;
        }
        String str2 = this.H;
        return str2 == null ? str == null : str2.equals(str);
    }

    @Override // h07
    public View getMenuHostView() {
        return this;
    }

    @Override // x74
    public final void D(float f, int i) {
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        F(recyclerView, bkb.Z6, bkb.r8);
    }
}
