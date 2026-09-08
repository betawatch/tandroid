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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.f01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements le.d, z5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public bi.g5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final f6 I0;
    public boolean J;
    public ov0 J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public final Paint L0;
    public boolean M;
    public final Rect M0;
    public boolean N;
    public final com.google.firebase.messaging.m N0;
    public int O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public co R0;
    public zv0 S;
    public boolean S0;
    public p00 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public f01 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public dh.d a;
    public int a0;
    public float a1;
    public dh.d b;
    public boolean b0;
    public final le.e b1;
    public dh.d c;
    public CharSequence c0;
    public final le.b c1;
    public final z4 d;
    public Drawable d0;
    public final le.e d1;
    public ImageView e;
    public View.OnClickListener e0;
    public final le.b e1;
    public x9 f;
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
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public int l0;
    public bi.n l1;
    public boolean m0;
    public boolean m1;
    public final j5[] n;
    public boolean n0;
    public boolean n1;
    public float o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public boolean q1;
    public j5 r;
    public int r0;
    public float r1;
    public j5 s;
    public int s0;
    public ValueAnimator s1;
    public n2 t0;
    public j u0;
    public View v;
    public int v0;
    public int w;
    public boolean w0;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public k(Context context, f6 f6Var) {
        super(context);
        this.d = z4.a;
        this.n = new j5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = 255;
        this.v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new com.google.firebase.messaging.m(this);
        pr prVar = pr.h;
        this.b1 = new le.e(0, this, prVar, 380L);
        this.c1 = new le.b(0, this, prVar, 380L, false);
        this.d1 = new le.e(0, this, prVar, 320L);
        this.e1 = new le.b(0, this, prVar, 320L, false);
        this.q1 = true;
        this.r1 = 1.0f;
        this.I0 = f6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public static View q(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(ll0 ll0Var, boolean z10) {
        y(ll0Var, z10, j6.a7, j6.s8);
    }

    public final void B(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(j6.f0(i10, 1, -1));
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
            imageView2.setBackgroundDrawable(j6.f0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i10, boolean z10) {
        if (z10) {
            this.s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof g2) {
                    ((g2) drawable2).a(i10);
                } else if (drawable2 instanceof e5) {
                    ((e5) drawable2).j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.S0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public final void D(int i10, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).B(i10);
                }
                i11++;
            }
            return;
        }
        if (z10 || (zVar = this.E) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof v0) {
                ((v0) childAt2).B(i10);
            }
            i11++;
        }
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        invalidate();
    }

    public final void F(int i10, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).G(i10, z10);
                }
                i11++;
            }
            return;
        }
        if (z11 || (zVar = this.E) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof v0) {
                ((v0) childAt2).G(i10, z10);
            }
            i11++;
        }
    }

    public final void G(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else {
            if (z10 || (zVar = this.E) == null) {
                return;
            }
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void H(int i10, boolean z10) {
        z zVar = this.E;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.G) {
                        if (z10) {
                            v0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            v0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void I(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        j5[] j5VarArr = this.n;
        if (charSequence != null && j5VarArr[0] == null) {
            p(0);
        }
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            j5 j5Var2 = j5VarArr[0];
            this.c0 = charSequence;
            j5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            j5 j5Var3 = j5VarArr[0];
            this.d0 = o5Var;
            j5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(j5VarArr[0]);
                }
            }
            j5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            this.r.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(220L).start();
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
        this.y0 = z10;
        j5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            j5 j5Var2 = j5VarArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z10) {
                dp = -dp;
            }
            j5Var2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = j5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
        if (!z11) {
            int dp2 = AndroidUtilities.dp(20.0f);
            if (z10) {
                dp2 = -dp2;
            }
            alpha.translationY(dp2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j3).setListener(new g(this, z11, z10, 0)).start();
        requestLayout();
    }

    public final void K(String str, int i10, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        j5 j5Var;
        int indexOf;
        if (!this.b0 || this.t0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.g0;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = runnable;
        if (this.Y0) {
            return;
        }
        String str2 = this.f0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.f0 = str;
            if (this.l1 != null) {
                this.l1.a(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i10) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            com.google.firebase.messaging.m mVar = this.N0;
            if (str == null || (indexOf = TextUtils.indexOf(string, "...")) < 0) {
                z10 = false;
                charSequence = string;
            } else {
                SpannableString valueOf = SpannableString.valueOf(string);
                mVar.x(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.i0 = str != null;
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
                        p(1);
                    }
                    j5VarArr[1].k(charSequence);
                    j5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    j5VarArr[1].i(drawable);
                    j5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.o5) {
                        ((org.telegram.ui.Components.o5) drawable).l(j5VarArr[1]);
                    }
                    if (z10) {
                        mVar.c(j5VarArr[1]);
                    }
                    this.Y0 = true;
                    j5 j5Var4 = j5VarArr[1];
                    j5VarArr[1] = j5VarArr[0];
                    j5VarArr[0] = j5Var4;
                    j5Var4.setAlpha(0.0f);
                    j5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    j5VarArr[0].animate().alpha(this.n1 ? 1.0f - this.r1 : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.z0 = true;
                    alpha.setDuration(220L).setListener(new e(this, 1)).start();
                }
            } else {
                p(0);
                if (this.R) {
                    j5VarArr[0].invalidate();
                    invalidate();
                }
                j5VarArr[0].k(charSequence);
                j5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                j5VarArr[0].i(drawable);
                j5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(j5VarArr[0]);
                }
                if (z10) {
                    mVar.c(j5VarArr[0]);
                } else {
                    mVar.s(j5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void L() {
        this.G0 = true;
        if (this.F0 == null) {
            bi.g5 g5Var = new bi.g5(getContext(), 5);
            this.F0 = g5Var;
            addView(g5Var);
        }
    }

    public final void M(bh.b bVar, eh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.O0 = true;
        this.Q0 = z10;
        dh.d c10 = bVar.c(this, null, false);
        c10.n(eVar);
        c10.o(AndroidUtilities.dp(6.0f));
        this.a = c10;
        if (z10) {
            c10.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.p(AndroidUtilities.dp(23.0f));
        }
        dh.d c11 = bVar.c(this, null, false);
        c11.n(eVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.b = c11;
        dh.d c12 = bVar.c(this, null, false);
        c12.n(eVar);
        c12.p(AndroidUtilities.dp(23.0f));
        c12.o(AndroidUtilities.dp(6.0f));
        this.c = c12;
        z zVar = this.E;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            j5[] j5VarArr = this.n;
            if (view == j5VarArr[0] || view == j5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.F == null || this.J) {
            return;
        }
        this.J = true;
        g();
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
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
        if (this.w == 0) {
            if (!this.n0) {
                j5 j5Var = this.n[0];
                if (j5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<j5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<j5, Float>) property, 0.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 0.0f));
            }
        }
        int i11 = this.w;
        if (i11 == 0) {
            i11 = this.x;
        }
        if (i11 == 0 || this.O0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i11) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.U0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new bi.t(10, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g2) {
                ((g2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(j6.f0(this.q0, 1, -1));
        }
    }

    public final void P() {
        boolean z10 = this.C0 && this.D0;
        if (this.E0 != z10) {
            this.E0 = z10;
            com.google.firebase.messaging.m mVar = this.N0;
            if (!z10) {
                mVar.a = false;
                ((AnimatorSet) mVar.c).cancel();
                return;
            }
            mVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    public final boolean a(String str) {
        if (this.F == null) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void b() {
        if (this.m1) {
            if (this.n1) {
                bi.g5 g5Var = this.F0;
                if (g5Var != null) {
                    g5Var.setAlpha(1.0f - this.r1);
                } else {
                    j5 j5Var = this.n[0];
                    if (j5Var != null) {
                        j5Var.setAlpha(1.0f - this.r1);
                    }
                }
            }
            float f7 = this.r1;
            int i10 = this.p1;
            f6 f6Var = this.I0;
            int v02 = i10 == -1 ? 0 : j6.v0(i10, f6Var);
            int i11 = this.o1;
            int v03 = i11 == -1 ? 0 : j6.v0(i11, f6Var);
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.r1) * 255.0f));
            if (this.K0) {
                invalidate();
            }
        }
    }

    public final void c() {
        if (LocaleController.isRTL) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new i(0));
        this.z0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        b();
        dh.d dVar = this.a;
        if (dVar != null) {
            dVar.u();
        }
        dh.d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.u();
        }
        dh.d dVar3 = this.b;
        if (dVar3 != null) {
            dVar3.u();
        }
        bi.n nVar = this.l1;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i11 = this.h1 ? this.f1 : (int) this.d1.e;
        if (this.i1) {
            i11 = Math.max((int) ((1.0f - this.a1) * this.g1), i11);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i12 = dp * 2;
        int i13 = height + dp2 + i12;
        dh.d dVar = this.a;
        le.b bVar = this.e1;
        if (dVar == null || this.P0) {
            f7 = 1.0f;
        } else {
            if (this.h1 || this.i1) {
                f7 = 1.0f;
                i10 = i11 > 0 ? dp : 0;
            } else {
                f7 = 1.0f;
                i10 = (int) (dp * bVar.e);
            }
            int i14 = i10 + i11;
            int i15 = dp + dp2;
            int max = Math.max(i14, i15);
            co coVar = this.R0;
            le.b bVar2 = this.c1;
            int lerp = AndroidUtilities.lerp(i14, max, coVar == null ? 0.0f : f7 - bVar2.e);
            int lerp2 = AndroidUtilities.lerp(z10 ? i15 : 0, i15, this.R0 == null ? 0.0f : f7 - bVar2.e);
            int width = getWidth() - lerp;
            int i16 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i16, ((int) this.b1.e) + i12), i16, Math.max(this.a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.a.setBounds(lerp2, height, width, i13);
            this.a.draw(canvas);
        }
        dh.d dVar2 = this.b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i12, i13);
            this.b.draw(canvas);
        }
        dh.d dVar3 = this.c;
        if (dVar3 != null && i11 > 0 && !this.P0 && !this.k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i11)) - i12, height, getWidth(), i13);
            this.c.setAlpha(this.h1 ? 255 : (int) (bVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.K0 && this.x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i17 = this.x;
            Paint paint = this.L0;
            paint.setColor(i17);
            if (this.m1) {
                ov0 ov0Var = this.J0;
                float y3 = getY();
                float f10 = f7 - this.r1;
                ov0Var.getClass();
                ov0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(j6.v0((ov0.F() && SharedConfig.getDevicePerformanceClass() == 2) ? j6.xf : j6.yf, ov0Var.getResourceProvider())), f10));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.j1 = true;
        if (this.Z0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.R0 != null && this.O0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View q6 = q(this, f7, f10, this.R0);
            if (q6 == null) {
                q6 = q(this, f7, f10, null);
            }
            dh.d dVar = this.a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x10, y3);
            if (q6 != null && q6 != this.R0) {
                dh.d dVar2 = this.b;
                boolean z11 = z10 | (dVar2 != null && dVar2.getBounds().contains(x10, y3));
                dh.d dVar3 = this.c;
                z10 = z11 | (dVar3 != null && dVar3.getBounds().contains(x10, y3));
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02f0  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        Drawable y02;
        float f7;
        boolean z11;
        o00 o00Var;
        n2 n2Var = this.t0;
        if (n2Var != null && n2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        if (this.B0 && view == this.e) {
            return true;
        }
        boolean N = N(view);
        if (N) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.R && !this.i0 && !LocaleController.isRTL) {
            j5[] j5VarArr = this.n;
            if ((view == j5VarArr[0] || view == j5VarArr[1] || (view == this.F0 && this.G0)) && (y02 = j6.y0()) != null) {
                j5 j5Var = view == this.F0 ? j5VarArr[0] : (j5) view;
                if (j5Var != null && j5Var.getVisibility() == 0 && (j5Var.getText() instanceof String)) {
                    TextPaint textPaint = j5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) j5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (y02.getIntrinsicWidth() + j6.D1)) / 2) + j5Var.getTextStartX() + j6.D1;
                    f7 = 255.0f;
                    int textStartY = j5Var.getTextStartY() + j6.E1 + ((int) Math.ceil((j5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    y02.setBounds(width, textStartY - y02.getIntrinsicHeight(), y02.getIntrinsicWidth() + width, textStartY);
                    y02.setAlpha((int) (j5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    y02.draw(canvas);
                    if (this.Y0) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f7 = 255.0f;
                }
                if (j6.G1) {
                    if (this.S == null) {
                        this.S = new zv0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                zv0 zv0Var = this.S;
                if (zv0Var != null) {
                    zv0Var.b(canvas, this);
                } else {
                    p00 p00Var = this.T;
                    if (p00Var != null) {
                        ArrayList arrayList = p00Var.d;
                        ArrayList arrayList2 = p00Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                o00 o00Var2 = (o00) arrayList2.get(i10);
                                Paint paint = o00Var2.k.a;
                                paint.setColor(o00Var2.j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * o00Var2.i);
                                paint.setAlpha((int) (o00Var2.f * f7));
                                canvas.drawPoint(o00Var2.a, o00Var2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i11 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.w1.B(20.0f, getMeasuredHeight(), i11)) + i11;
                                    int nextInt = Utilities.random.nextInt(4);
                                    int i12 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                    int i13 = 0;
                                    for (int i14 = 8; i13 < i14; i14 = 8) {
                                        float f10 = nextFloat;
                                        double nextInt2 = (Utilities.random.nextInt(270) - 225) * 0.017453292519943295d;
                                        float cos = (float) Math.cos(nextInt2);
                                        float sin = (float) Math.sin(nextInt2);
                                        if (arrayList.isEmpty()) {
                                            o00Var = new o00(p00Var);
                                        } else {
                                            o00Var = (o00) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        o00Var.a = f10;
                                        o00Var.b = nextFloat2;
                                        o00Var.c = cos * 1.5f;
                                        o00Var.d = sin;
                                        o00Var.j = i12;
                                        o00Var.f = 1.0f;
                                        o00Var.h = 0.0f;
                                        o00Var.i = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                                        o00Var.g = Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                        o00Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                                        arrayList2.add(o00Var);
                                        i13++;
                                        nextFloat = f10;
                                    }
                                }
                            }
                            int i15 = 0;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - p00Var.b);
                            int size2 = arrayList2.size();
                            while (i15 < size2) {
                                o00 o00Var3 = (o00) arrayList2.get(i15);
                                float f11 = o00Var3.h;
                                float f12 = o00Var3.g;
                                if (f11 >= f12) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(o00Var3);
                                    }
                                    arrayList2.remove(i15);
                                    i15--;
                                    size2--;
                                    z11 = N;
                                } else {
                                    o00Var3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f11 / f12);
                                    float f13 = o00Var3.a;
                                    float f14 = o00Var3.c;
                                    float f15 = o00Var3.e;
                                    float f16 = min;
                                    z11 = N;
                                    o00Var3.a = a4.a.A(f14 * f15, f16, 500.0f, f13);
                                    float f17 = o00Var3.b;
                                    float f18 = o00Var3.d;
                                    o00Var3.b = (((f15 * f18) * f16) / 500.0f) + f17;
                                    o00Var3.d = (f16 / 100.0f) + f18;
                                    o00Var3.h += f16;
                                }
                                i15++;
                                N = z11;
                            }
                            z10 = N;
                            p00Var.b = currentTimeMillis;
                            invalidate();
                            if (z10) {
                                canvas.restore();
                            }
                            return drawChild;
                        }
                    }
                }
            }
        }
        z10 = N;
        if (z10) {
        }
        return drawChild;
    }

    public final void e(boolean z10) {
        co coVar = this.R0;
        if (coVar == null) {
            return;
        }
        yn ynVar = coVar.e;
        boolean z11 = ynVar != null && ynVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        le.e eVar = this.b1;
        if (z10) {
            float f7 = min;
            if ((eVar.g ? eVar.f : eVar.e) != f7) {
                eVar.a(f7);
            }
        } else {
            eVar.c(min);
        }
        this.c1.a(z11, z10);
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof g2) || (drawable instanceof e5)) ? 2 : 0;
        if (this.e.getLayerType() != i10) {
            this.e.setLayerType(i10, null);
            this.e.invalidate();
        }
    }

    public final void g() {
        z zVar = this.E;
        int max = Math.max(0, zVar != null ? (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.F;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.J) {
            max = max2;
        }
        this.e1.a(max > 0, this.j1);
        le.e eVar = this.d1;
        float f7 = max;
        if ((eVar.g ? eVar.f : eVar.e) != f7) {
            if (this.j1) {
                eVar.a(f7);
            } else {
                eVar.c(f7);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.u0;
    }

    public z getActionMode() {
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
        return this.l1;
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

    public z4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.x;
    }

    public boolean getCastShadows() {
        return this.k0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public x9 getSearchAvatarImageView() {
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

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        j5 j5Var = this.n[0];
        if (j5Var != null) {
            return j5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return this.n[0];
    }

    public j5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        z zVar;
        if (!this.n0 || (zVar = this.E) == null) {
            return;
        }
        zVar.j(z10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final z i() {
        return j(null);
    }

    public final z j(String str) {
        if (a(str)) {
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
        dVar2.setTranslationX(this.O0 ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.F.setGlassMode(this.O0);
        d dVar3 = this.F;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(j6.v0(j6.w8, this.I0));
        }
        addView(this.F, indexOfChild(this.e));
        this.F.setPadding(0, this.I ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    public final void k() {
        if (this.l1 == null) {
            bi.n nVar = new bi.n(this, getContext(), this.I0, this.N0);
            this.l1 = nVar;
            nVar.setClipChildren(false);
            addView(this.l1);
        }
    }

    public final void l() {
        if (this.s != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.s = j5Var;
        j5Var.setGravity(3);
        this.s.setVisibility(8);
        this.s.setTextColor(j6.v0(j6.B8, this.I0));
        addView(this.s, 0, w7.x5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.f0(this.p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.x5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, w7.x5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.r != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.r = j5Var;
        j5Var.setGravity(3);
        this.r.setVisibility(8);
        this.r.setTextColor(j6.v0(j6.B8, this.I0));
        addView(this.r, 0, w7.x5.e(-2, -2, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.w;
            if (i10 == 0) {
                i10 = this.x;
            }
            if (i10 == 0 || this.O0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.x;
            if (i10 == 0 || this.w == 0 || this.O0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = j6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            zv0 zv0Var = this.S;
            j5[] j5VarArr = this.n;
            if (zv0Var == null) {
                this.T = null;
                this.S = new zv0(0);
                j5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                p00 p00Var = new p00();
                p00Var.c = new ArrayList();
                p00Var.d = new ArrayList();
                Paint paint = new Paint(1);
                p00Var.a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(j6.w0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    p00Var.d.add(new o00(p00Var));
                }
                this.T = p00Var;
                j5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.H0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        j5[] j5VarArr;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int currentActionBarHeight;
        int i19 = this.I ? AndroidUtilities.statusBarHeight : 0;
        if (this.X0 != getMeasuredWidth()) {
            this.X0 = getMeasuredWidth();
            e(this.b1.g);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(this.O0 ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i19, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i19);
            dp = AndroidUtilities.dp(this.O0 ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i20 = dp + this.W0;
        z zVar = this.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            int dp2 = this.E.p() ? AndroidUtilities.dp(this.m0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            z zVar2 = this.E;
            zVar2.layout(dp2, i19, zVar2.getMeasuredWidth() + dp2, this.E.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            j5VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            j5 j5Var = j5VarArr[i21];
            if (j5Var != null && j5Var.getVisibility() != 8) {
                boolean z11 = this.y0;
                if (((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - j5VarArr[i21].getTextHeight()) / 2;
                } else {
                    j5 j5Var2 = this.r;
                    currentActionBarHeight = (j5Var2 == null || j5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - j5VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - j5VarArr[i21].getTextHeight()) / 2);
                }
                j5 j5Var3 = j5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                j5Var3.layout(i20, i22 - j5Var3.getPaddingTop(), j5VarArr[i21].getMeasuredWidth() + i20, j5VarArr[i21].getPaddingBottom() + ((j5VarArr[i21].getTextHeight() + i22) - j5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.l1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.l1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            bi.n nVar = this.l1;
            int i23 = currentActionBarHeight2 + i19;
            nVar.layout(i20, i23, nVar.getMeasuredWidth() + i20, this.l1.getMeasuredHeight() + i23);
        }
        j5 j5Var4 = this.r;
        if (j5Var4 != null && j5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            j5 j5Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            j5Var5.layout(i20, i24, j5Var5.getMeasuredWidth() + i20, this.r.getTextHeight() + i24);
        }
        j5 j5Var6 = this.s;
        if (j5Var6 != null && j5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            j5 j5Var7 = this.s;
            int i26 = dp3 + i19;
            j5Var7.layout(i20, i26, j5Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        x9 x9Var = this.f;
        if (x9Var != null) {
            x9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != this.l1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i28 = layoutParams.gravity;
                if (i28 == -1) {
                    i28 = 51;
                }
                int i29 = i28 & 112;
                int i30 = i28 & 7;
                if (i30 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i30 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i29 != 16) {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i29 != 80) {
                        i18 = layoutParams.topMargin;
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                    } else {
                        i16 = (i13 - i11) - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = measuredWidth - i14;
                if (i29 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int dp;
        j5[] j5VarArr;
        j5 j5Var;
        j5 j5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i12 = 1;
        kVar.H = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.F;
        if (dVar != null) {
            dVar.setPadding(0, kVar.I ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        kVar.H = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.I ? AndroidUtilities.statusBarHeight : 0) + kVar.O);
        ImageView imageView = kVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        z zVar = kVar.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f7 = 66.0f;
            if (kVar.E.p() && !kVar.n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f7 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f7)), TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.n0) {
                if (kVar.m0) {
                    f7 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = wl.d(f7, size, TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i13 = 0;
        while (true) {
            j5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            j5 j5Var3 = j5VarArr[0];
            if ((j5Var3 != null && j5Var3.getVisibility() != 8) || ((j5Var = kVar.r) != null && j5Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                int max = Math.max(org.telegram.messenger.w1.B(16.0f, size - (zVar2 != null ? zVar2.getMeasuredWidth() : 0), dp) - kVar.a0, 0);
                boolean z10 = kVar.y0;
                int i14 = 20;
                if (((z10 && i13 == 0) || (!z10 && i13 == i12)) && kVar.w0 && kVar.x0) {
                    j5 j5Var4 = j5VarArr[i13];
                    if (kVar.O0) {
                        i14 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    j5Var4.setTextSize(i14);
                } else {
                    j5 j5Var5 = j5VarArr[0];
                    if (j5Var5 == null || j5Var5.getVisibility() == 8 || (j5Var2 = kVar.r) == null || j5Var2.getVisibility() == 8) {
                        j5 j5Var6 = j5VarArr[i13];
                        if (j5Var6 != null && j5Var6.getVisibility() != 8) {
                            j5 j5Var7 = j5VarArr[i13];
                            if (kVar.O0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            j5Var7.setTextSize(i14);
                        }
                        j5 j5Var8 = kVar.r;
                        if (j5Var8 != null && j5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        j5 j5Var9 = kVar.s;
                        if (j5Var9 != null) {
                            j5Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        j5 j5Var10 = j5VarArr[i13];
                        if (j5Var10 != null) {
                            if (kVar.O0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i14 = 18;
                            }
                            j5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        j5 j5Var11 = kVar.s;
                        if (j5Var11 != null) {
                            j5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                j5 j5Var12 = j5VarArr[i13];
                if (j5Var12 != null && j5Var12.getVisibility() != 8) {
                    j5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(j5VarArr[i13].getPaddingBottom() + j5VarArr[i13].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.z0) {
                        CharSequence text = j5VarArr[i13].getText();
                        j5 j5Var13 = j5VarArr[i13];
                        j5Var13.setPivotX(j5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        j5VarArr[i13].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        j5VarArr[i13].setPivotX(0.0f);
                        j5VarArr[i13].setPivotY(0.0f);
                    }
                }
                j5 j5Var14 = kVar.r;
                if (j5Var14 != null && j5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                bi.n nVar = kVar.l1;
                if (nVar != null) {
                    nVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                j5 j5Var15 = kVar.s;
                if (j5Var15 != null && j5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = 1;
        }
        x9 x9Var = kVar.f;
        if (x9Var != null) {
            x9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = kVar.getChildAt(i15);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != kVar.l1 && childAt != kVar.r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i15++;
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

    public final void p(int i10) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[i10] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        j5VarArr[i10] = j5Var;
        j5Var.setGravity(19);
        int i11 = this.v0;
        if (i11 != 0) {
            j5VarArr[i10].setTextColor(i11);
        } else {
            j5VarArr[i10].setTextColor(j6.v0(j6.A8, this.I0));
        }
        j5 j5Var2 = j5VarArr[i10];
        j5Var2.setEmojiColor(j5Var2.getTextColor());
        j5VarArr[i10].setTypeface(AndroidUtilities.bold());
        j5VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        j5VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        j5VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(j5VarArr[i10], 0, w7.x5.e(-2, -2, 51));
        } else {
            addView(j5VarArr[i10], 0, w7.x5.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.F;
        if (dVar == null || !this.J) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof v0) {
                ((v0) childAt).n();
            }
        }
        this.J = false;
        g();
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
        j5[] j5VarArr = this.n;
        if (!z10) {
            j5 j5Var = j5VarArr[0];
            if (j5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<j5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<j5, Float>) property, 1.0f));
            }
        }
        z zVar = this.E;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i13 = this.x;
        if (i13 == 0 || this.O0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i13) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.U0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i10));
        this.P.start();
        if (!this.n0) {
            j5 j5Var2 = j5VarArr[0];
            if (j5Var2 != null) {
                j5Var2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                this.r.setVisibility(0);
            }
        }
        z zVar2 = this.E;
        if (zVar2 != null) {
            zVar2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g2) {
                ((g2) drawable).c(0.0f, true);
            }
            this.e.setBackgroundDrawable(j6.f0(this.p0, 1, -1));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        return this.F != null && this.J;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, j6.a7, j6.s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
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
            m();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof g2) {
            g2 g2Var = (g2) drawable;
            g2Var.c(s() ? 1.0f : 0.0f, false);
            g2Var.b(this.s0);
            g2Var.a(this.r0);
        } else if (drawable instanceof e5) {
            e5 e5Var = (e5) drawable;
            e5Var.k = this.x;
            e5Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        if (this.e == null) {
            m();
        }
        this.e.setVisibility(i10 == 0 ? 8 : 0);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof e5) {
                ((e5) drawable).k = i10;
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

    public void setChatAvatarContainer(co coVar) {
        this.R0 = coVar;
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

    public void setDrawBlurBackground(ov0 ov0Var) {
        this.K0 = true;
        this.J0 = ov0Var;
        ov0Var.T.add(this);
        setBackground(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.setEnabled(z10);
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
        this.i1 = true;
        if (this.g1 != i10) {
            this.g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.h1 = true;
        if (this.f1 != i10) {
            this.f1 = i10;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.H0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.I = z10;
        d dVar = this.F;
        if (dVar != null) {
            dVar.setPadding(0, z10 ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.T0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
        j5[] j5VarArr = this.n;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setRightDrawableOnClick(onClickListener);
        }
        j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(x9 x9Var) {
        x9 x9Var2 = this.f;
        if (x9Var2 == x9Var) {
            return;
        }
        if (x9Var2 != null) {
            removeView(x9Var2);
        }
        this.f = x9Var;
        if (x9Var != null) {
            addView(x9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.a1 != f7) {
            this.a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(hg.q0 q0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(q0Var);
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
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            o();
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
            o();
        }
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
        I(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.j0 = runnable;
        this.h0 = runnable;
    }

    public void setTitleColor(int i10) {
        j5[] j5VarArr = this.n;
        if (j5VarArr[0] == null) {
            p(0);
        }
        this.v0 = i10;
        j5VarArr[0].setTextColor(i10);
        j5VarArr[0].setEmojiColor(i10);
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[1].setEmojiColor(i10);
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

    public final boolean t(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean u() {
        return false;
    }

    public void v(boolean z10) {
        Property property;
        this.n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            j5 j5Var = this.n[0];
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 1));
        this.V0.playTogether(ofFloat);
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
            this.V0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.V0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.V0;
            if (!z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f7));
            i10++;
        }
        x9 x9Var = this.f;
        if (x9Var != null) {
            x9Var.setVisibility(0);
            this.V0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<x9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, u10));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof e5) {
                e5 e5Var = (e5) drawable;
                e5Var.h = true;
                e5Var.a(z10 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void w() {
        g5 g5Var;
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.G && (g5Var = v0Var.H) != null) {
                    g5Var.p(v0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.E;
        if (zVar == null || str == null) {
            return;
        }
        boolean z10 = this.n0;
        boolean z11 = !z10;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.G) {
                    if (!z10) {
                        zVar.b.v(v0Var.L(z11));
                    }
                    v0Var.H(str, false);
                    v0Var.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        this.o1 = i10;
        this.p1 = i11;
        ji.b5 b5Var = new ji.b5(27, this, recyclerView);
        recyclerView.j(new ah.e0(b5Var, 13));
        this.n1 = z10;
        if (this.m1) {
            b5Var.run();
            return;
        }
        this.m1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.q1 = !canScrollVertically;
        this.r1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public void setAdaptiveBackground(zn0 zn0Var) {
        int i10 = j6.a7;
        int i11 = j6.s8;
        this.o1 = i10;
        this.p1 = i11;
        b();
        ji.b5 b5Var = new ji.b5(26, this, zn0Var);
        zn0Var.f.add(b5Var);
        if (this.m1) {
            b5Var.run();
            return;
        }
        this.m1 = true;
        boolean canScrollVertically = zn0Var.canScrollVertically(-1);
        this.q1 = !canScrollVertically;
        this.r1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
