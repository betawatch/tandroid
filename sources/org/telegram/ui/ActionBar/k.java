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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements ne.d, x5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public y E;
    public boolean E0;
    public d F;
    public bi.i5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final c6 I0;
    public boolean J;
    public ow0 J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public final Paint L0;
    public boolean M;
    public final Rect M0;
    public boolean N;
    public final c2.b N0;
    public int O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public ro R0;
    public zw0 S;
    public boolean S0;
    public b10 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public uz0 U0;
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
    public final ne.e b1;
    public dh.d c;
    public CharSequence c0;
    public final ne.b c1;
    public final x4 d;
    public Drawable d0;
    public final ne.e d1;
    public ImageView e;
    public View.OnClickListener e0;
    public final ne.b e1;
    public z9 f;
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
    public boolean l1;
    public boolean m0;
    public bi.n m1;
    public final h5[] n;
    public boolean n0;
    public boolean n1;
    public float o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public h5 r;
    public int r0;
    public boolean r1;
    public h5 s;
    public int s0;
    public float s1;
    public m2 t0;
    public ValueAnimator t1;
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

    public k(Context context, c6 c6Var) {
        super(context);
        this.d = x4.a;
        this.n = new h5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = 255;
        this.v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new c2.b(this);
        es esVar = es.h;
        this.b1 = new ne.e(0, this, esVar, 380L);
        this.c1 = new ne.b(0, this, esVar, 380L, false);
        this.d1 = new ne.e(0, this, esVar, 320L);
        this.e1 = new ne.b(0, this, esVar, 320L, false);
        this.l1 = true;
        this.r1 = true;
        this.s1 = 1.0f;
        this.I0 = c6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public static View r(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(mm0 mm0Var, boolean z10) {
        z(mm0Var, z10, g6.a7, g6.s8);
    }

    public final void B(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(g6.g0(i10, 1, -1));
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
            imageView2.setBackgroundDrawable(g6.g0(i10, 1, -1));
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
                if (drawable instanceof f2) {
                    ((f2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof f2) {
                    ((f2) drawable2).a(i10);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).j = i10;
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
        if (imageView3 == null || !this.S0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public final void E(int i10, boolean z10) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    ((u0) childAt).B(i10);
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
            if (childAt2 instanceof u0) {
                ((u0) childAt2).B(i10);
            }
            i11++;
        }
    }

    public final void F(int i10, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    ((u0) childAt).G(i10, z10);
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
            if (childAt2 instanceof u0) {
                ((u0) childAt2).G(i10, z10);
            }
            i11++;
        }
    }

    public final void G(int i10, boolean z10) {
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

    public final void H(int i10, boolean z10) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.G) {
                        if (z10) {
                            u0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            u0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void I(CharSequence charSequence, org.telegram.ui.Components.q5 q5Var) {
        h5[] h5VarArr = this.n;
        if (charSequence != null && h5VarArr[0] == null) {
            q(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            h5 h5Var2 = h5VarArr[0];
            this.c0 = charSequence;
            h5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.d0 = q5Var;
            h5Var3.i(q5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        h5[] h5VarArr = this.n;
        if (h5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            yh.r(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            if (h5Var.getParent() != null) {
                ((ViewGroup) h5VarArr[1].getParent()).removeView(h5VarArr[1]);
            }
            h5VarArr[1] = null;
        }
        h5VarArr[1] = h5VarArr[0];
        h5VarArr[0] = null;
        setTitle(charSequence);
        this.y0 = z10;
        h5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            h5 h5Var2 = h5VarArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z10) {
                dp = -dp;
            }
            h5Var2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = h5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
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
        alpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
        requestLayout();
    }

    public final void K(String str, int i10, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        h5 h5Var;
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
            if (this.m1 != null) {
                this.m1.a(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i10) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            c2.b bVar = this.N0;
            if (str == null || (indexOf = TextUtils.indexOf(string, "...")) < 0) {
                z10 = false;
                charSequence = string;
            } else {
                SpannableString valueOf = SpannableString.valueOf(string);
                bVar.A(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.i0 = str != null;
            h5[] h5VarArr = this.n;
            if ((charSequence == null || h5VarArr[0] != null) && getMeasuredWidth() != 0 && ((h5Var = h5VarArr[0]) == null || h5Var.getVisibility() == 0)) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.animate().cancel();
                    h5 h5Var3 = h5VarArr[1];
                    if (h5Var3 != null) {
                        h5Var3.animate().cancel();
                    }
                    if (h5VarArr[1] == null) {
                        q(1);
                    }
                    h5VarArr[1].k(charSequence);
                    h5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    h5VarArr[1].i(drawable);
                    h5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.q5) {
                        ((org.telegram.ui.Components.q5) drawable).l(h5VarArr[1]);
                    }
                    if (z10) {
                        bVar.c(h5VarArr[1]);
                    }
                    this.Y0 = true;
                    h5 h5Var4 = h5VarArr[1];
                    h5VarArr[1] = h5VarArr[0];
                    h5VarArr[0] = h5Var4;
                    h5Var4.setAlpha(0.0f);
                    h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    h5VarArr[0].animate().alpha(this.o1 ? 1.0f - this.s1 : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
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
                q(0);
                if (this.R) {
                    h5VarArr[0].invalidate();
                    invalidate();
                }
                h5VarArr[0].k(charSequence);
                h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                h5VarArr[0].i(drawable);
                h5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).l(h5VarArr[0]);
                }
                if (z10) {
                    bVar.c(h5VarArr[0]);
                } else {
                    bVar.v(h5VarArr[0]);
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
            bi.i5 i5Var = new bi.i5(getContext(), 5);
            this.F0 = i5Var;
            addView(i5Var);
        }
    }

    public final void M(bh.b bVar, eh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.O0 = true;
        this.Q0 = z10;
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        c10.p(AndroidUtilities.dp(6.0f));
        this.a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.b = c11;
        dh.d c12 = bVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-AndroidUtilities.dp(10.0f));
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
            h5[] h5VarArr = this.n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
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
                h5 h5Var = this.n[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<h5, Float>) property, 0.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 0.0f));
            }
        }
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
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.U0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, 3));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new bi.t(10, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f2) {
                ((f2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(g6.g0(this.q0, 1, -1));
        }
    }

    public final void P() {
        boolean z10 = this.C0 && this.D0;
        if (this.E0 != z10) {
            this.E0 = z10;
            c2.b bVar = this.N0;
            if (!z10) {
                bVar.a = false;
                ((AnimatorSet) bVar.c).cancel();
                return;
            }
            bVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) bVar.c;
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
        if (this.n1) {
            if (this.o1) {
                bi.i5 i5Var = this.F0;
                if (i5Var != null) {
                    i5Var.setAlpha(1.0f - this.s1);
                } else {
                    h5 h5Var = this.n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.s1);
                    }
                }
            }
            float f7 = this.s1;
            int i10 = this.q1;
            c6 c6Var = this.I0;
            int w02 = i10 == -1 ? 0 : g6.w0(i10, c6Var);
            int i11 = this.p1;
            int w03 = i11 == -1 ? 0 : g6.w0(i11, c6Var);
            if (w03 == 0) {
                w03 = i0.a.k(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.k(w03, 0);
            }
            setBackgroundColor(i0.a.d(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - this.s1) * 255.0f));
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
        transitionSet.setInterpolator((TimeInterpolator) es.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        b();
        dh.d dVar = this.a;
        if (dVar != null) {
            dVar.v();
        }
        dh.d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.v();
        }
        dh.d dVar3 = this.b;
        if (dVar3 != null) {
            dVar3.v();
        }
        bi.n nVar = this.m1;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i12 = this.h1 ? this.f1 : (int) this.d1.e;
        if (this.i1) {
            i12 = Math.max((int) ((1.0f - this.a1) * this.g1), i12);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i13 = dp * 2;
        int i14 = height + dp2 + i13;
        dh.d dVar = this.a;
        ne.b bVar = this.e1;
        if (dVar == null || this.P0 || !this.l1) {
            f7 = 1.0f;
            i10 = 2;
        } else {
            if (this.h1 || this.i1) {
                f7 = 1.0f;
                i11 = i12 > 0 ? dp : 0;
            } else {
                f7 = 1.0f;
                i11 = (int) (dp * bVar.e);
            }
            int i15 = i11 + i12;
            int i16 = dp + dp2;
            int max = Math.max(i15, i16);
            i10 = 2;
            ro roVar = this.R0;
            ne.b bVar2 = this.c1;
            int lerp = AndroidUtilities.lerp(i15, max, roVar == null ? 0.0f : f7 - bVar2.e);
            int lerp2 = AndroidUtilities.lerp(z10 ? i16 : 0, i16, this.R0 != null ? f7 - bVar2.e : 0.0f);
            int width = getWidth() - lerp;
            int i17 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i17, ((int) this.b1.e) + i13), i17, Math.max(this.a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.a.setBounds(lerp2, height, width, i14);
            this.a.draw(canvas);
        }
        dh.d dVar2 = this.b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i13, i14);
            this.b.draw(canvas);
        }
        dh.d dVar3 = this.c;
        if (dVar3 != null && i12 > 0 && !this.P0 && !this.k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i12)) - i13, height, getWidth(), i14);
            this.c.setAlpha(this.h1 ? 255 : (int) (bVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.K0 && this.x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i18 = this.x;
            Paint paint = this.L0;
            paint.setColor(i18);
            if (this.n1) {
                ow0 ow0Var = this.J0;
                float y3 = getY();
                float f10 = f7 - this.s1;
                ow0Var.getClass();
                ow0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(g6.w0((ow0.F() && SharedConfig.getDevicePerformanceClass() == i10) ? g6.xf : g6.yf, ow0Var.getResourceProvider())), f10));
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
            View r10 = r(this, f7, f10, this.R0);
            if (r10 == null) {
                r10 = r(this, f7, f10, null);
            }
            dh.d dVar = this.a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x10, y3);
            if (r10 != null && r10 != this.R0) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e8  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Drawable z02;
        float f7;
        float f10;
        boolean z11;
        int i10;
        a10 a10Var;
        m2 m2Var = this.t0;
        if (m2Var != null && m2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        boolean z12 = true;
        if (this.B0 && view == this.e) {
            return true;
        }
        boolean N = N(view);
        int i11 = 0;
        if (N) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.R && !this.i0 && !LocaleController.isRTL) {
            h5[] h5VarArr = this.n;
            if ((view == h5VarArr[0] || view == h5VarArr[1] || (view == this.F0 && this.G0)) && (z02 = g6.z0()) != null) {
                h5 h5Var = view == this.F0 ? h5VarArr[0] : (h5) view;
                if (h5Var != null && h5Var.getVisibility() == 0 && (h5Var.getText() instanceof String)) {
                    TextPaint textPaint = h5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) h5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (z02.getIntrinsicWidth() + g6.D1)) / 2) + h5Var.getTextStartX() + g6.D1;
                    f7 = 255.0f;
                    f10 = 1.0f;
                    int textStartY = h5Var.getTextStartY() + g6.E1 + ((int) Math.ceil((h5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    z02.setBounds(width, textStartY - z02.getIntrinsicHeight(), z02.getIntrinsicWidth() + width, textStartY);
                    z02.setAlpha((int) (h5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    z02.draw(canvas);
                    if (this.Y0) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f7 = 255.0f;
                    f10 = 1.0f;
                }
                if (g6.G1) {
                    if (this.S == null) {
                        this.S = new zw0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                zw0 zw0Var = this.S;
                if (zw0Var != null) {
                    zw0Var.b(canvas, this);
                } else {
                    b10 b10Var = this.T;
                    if (b10Var != null) {
                        ArrayList arrayList = b10Var.d;
                        ArrayList arrayList2 = b10Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                a10 a10Var2 = (a10) arrayList2.get(i12);
                                Paint paint = a10Var2.k.a;
                                paint.setColor(a10Var2.j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * a10Var2.i);
                                paint.setAlpha((int) (a10Var2.f * f7));
                                canvas.drawPoint(a10Var2.a, a10Var2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i13 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float f11 = 20.0f;
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.q.D(20.0f, getMeasuredHeight(), i13)) + i13;
                                    int nextInt = Utilities.random.nextInt(4);
                                    int i14 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                    int i15 = 0;
                                    for (int i16 = 8; i15 < i16; i16 = 8) {
                                        boolean z13 = z12;
                                        float f12 = nextFloat;
                                        double nextInt2 = (Utilities.random.nextInt(270) - 225) * 0.017453292519943295d;
                                        float f13 = f11;
                                        float cos = (float) Math.cos(nextInt2);
                                        float sin = (float) Math.sin(nextInt2);
                                        if (arrayList.isEmpty()) {
                                            i10 = 0;
                                            a10Var = new a10(b10Var);
                                        } else {
                                            i10 = 0;
                                            a10Var = (a10) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        a10Var.a = f12;
                                        a10Var.b = nextFloat2;
                                        a10Var.c = cos * 1.5f;
                                        a10Var.d = sin;
                                        a10Var.j = i14;
                                        float f14 = f10;
                                        a10Var.f = f14;
                                        a10Var.h = 0.0f;
                                        a10Var.i = Math.max(f14, Utilities.random.nextFloat() * 1.5f);
                                        a10Var.g = Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                        a10Var.e = (Utilities.random.nextFloat() * 4.0f) + f13;
                                        arrayList2.add(a10Var);
                                        i15++;
                                        i11 = i10;
                                        nextFloat = f12;
                                        z12 = z13;
                                        f11 = f13;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            int i17 = i11;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - b10Var.b);
                            int size2 = arrayList2.size();
                            while (i17 < size2) {
                                a10 a10Var3 = (a10) arrayList2.get(i17);
                                float f15 = a10Var3.h;
                                float f16 = a10Var3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(a10Var3);
                                    }
                                    arrayList2.remove(i17);
                                    i17--;
                                    size2--;
                                    z11 = N;
                                } else {
                                    a10Var3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f15 / f16);
                                    float f17 = a10Var3.a;
                                    float f18 = a10Var3.c;
                                    float f19 = a10Var3.e;
                                    float f20 = min;
                                    z11 = N;
                                    a10Var3.a = a1.g.B(f18 * f19, f20, 500.0f, f17);
                                    float f21 = a10Var3.b;
                                    float f22 = a10Var3.d;
                                    a10Var3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    a10Var3.d = (f20 / 100.0f) + f22;
                                    a10Var3.h += f20;
                                }
                                i17++;
                                N = z11;
                            }
                            z10 = N;
                            b10Var.b = currentTimeMillis;
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
        ro roVar = this.R0;
        if (roVar == null) {
            return;
        }
        no noVar = roVar.e;
        boolean z11 = noVar != null && noVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        ne.e eVar = this.b1;
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
        int i10 = ((drawable instanceof f2) || (drawable instanceof c5)) ? 2 : 0;
        if (this.e.getLayerType() != i10) {
            this.e.setLayerType(i10, null);
            this.e.invalidate();
        }
    }

    public final void g() {
        y yVar = this.E;
        int max = Math.max(0, yVar != null ? (yVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.F;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.J) {
            max = max2;
        }
        this.e1.a(max > 0, this.j1);
        ne.e eVar = this.d1;
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
        return this.m1;
    }

    public h5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public x4 getBackButtonState() {
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

    public z9 getSearchAvatarImageView() {
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

    public h5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        h5 h5Var = this.n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        h5 h5Var = this.n[0];
        if (h5Var != null) {
            return h5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public h5 getTitleTextView() {
        return this.n[0];
    }

    public h5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        y yVar;
        if (!this.n0 || (yVar = this.E) == null) {
            return;
        }
        yVar.j(z10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final y i() {
        return j(null);
    }

    public final y j(String str) {
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
            this.F.setBackgroundColor(g6.w0(g6.w8, this.I0));
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
        if (this.m1 == null) {
            bi.n nVar = new bi.n(this, getContext(), this.I0, this.N0);
            this.m1 = nVar;
            nVar.setClipChildren(false);
            addView(this.m1);
        }
    }

    public final void l() {
        if (this.s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.s = h5Var;
        h5Var.setGravity(3);
        this.s.setVisibility(8);
        this.s.setTextColor(g6.w0(g6.B8, this.I0));
        addView(this.s, 0, w7.a6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(g6.g0(this.p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.a6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final y n() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, w7.a6.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.r = h5Var;
        h5Var.setGravity(3);
        this.r.setVisibility(8);
        this.r.setTextColor(g6.w0(g6.B8, this.I0));
        addView(this.r, 0, w7.a6.e(-2, -2, 51));
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
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(this.n[0]);
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
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z02;
        if (this.R && !this.i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (z02 = g6.z0()) != null && z02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            zw0 zw0Var = this.S;
            h5[] h5VarArr = this.n;
            if (zw0Var == null) {
                this.T = null;
                this.S = new zw0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                b10 b10Var = new b10();
                b10Var.c = new ArrayList();
                b10Var.d = new ArrayList();
                Paint paint = new Paint(1);
                b10Var.a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(g6.x0(null, g6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    b10Var.d.add(new a10(b10Var));
                }
                this.T = b10Var;
                h5VarArr[0].invalidate();
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
        h5[] h5VarArr;
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
        y yVar = this.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            int dp2 = this.E.p() ? AndroidUtilities.dp(this.m0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            y yVar2 = this.E;
            yVar2.layout(dp2, i19, yVar2.getMeasuredWidth() + dp2, this.E.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            h5VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            h5 h5Var = h5VarArr[i21];
            if (h5Var != null && h5Var.getVisibility() != 8) {
                boolean z11 = this.y0;
                if (((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - h5VarArr[i21].getTextHeight()) / 2;
                } else {
                    h5 h5Var2 = this.r;
                    currentActionBarHeight = (h5Var2 == null || h5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - h5VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - h5VarArr[i21].getTextHeight()) / 2);
                }
                h5 h5Var3 = h5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                h5Var3.layout(i20, i22 - h5Var3.getPaddingTop(), h5VarArr[i21].getMeasuredWidth() + i20, h5VarArr[i21].getPaddingBottom() + ((h5VarArr[i21].getTextHeight() + i22) - h5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.m1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.m1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            bi.n nVar = this.m1;
            int i23 = currentActionBarHeight2 + i19;
            nVar.layout(i20, i23, nVar.getMeasuredWidth() + i20, this.m1.getMeasuredHeight() + i23);
        }
        h5 h5Var4 = this.r;
        if (h5Var4 != null && h5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            h5 h5Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            h5Var5.layout(i20, i24, h5Var5.getMeasuredWidth() + i20, this.r.getTextHeight() + i24);
        }
        h5 h5Var6 = this.s;
        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            h5 h5Var7 = this.s;
            int i26 = dp3 + i19;
            h5Var7.layout(i20, i26, h5Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        z9 z9Var = this.f;
        if (z9Var != null) {
            z9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != this.m1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
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
        h5[] h5VarArr;
        h5 h5Var;
        int i12;
        h5 h5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i13 = 1;
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
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
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
                makeMeasureSpec = yh.z(f7, size, TLObject.FLAG_30);
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
        int i14 = 0;
        while (true) {
            h5VarArr = kVar.n;
            if (i14 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 == null || h5Var3.getVisibility() == 8) && ((h5Var = kVar.r) == null || h5Var.getVisibility() == 8)) {
                i12 = i13;
            } else {
                y yVar2 = kVar.E;
                int max = Math.max(org.telegram.messenger.q.D(16.0f, size - (yVar2 != null ? yVar2.getMeasuredWidth() : 0), dp) - kVar.a0, 0);
                boolean z10 = kVar.y0;
                int i15 = 20;
                if (((z10 && i14 == 0) || (!z10 && i14 == i13)) && kVar.w0 && kVar.x0) {
                    h5 h5Var4 = h5VarArr[i14];
                    i12 = i13;
                    if (kVar.O0) {
                        i15 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i15 = 18;
                    }
                    h5Var4.setTextSize(i15);
                } else {
                    i12 = i13;
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 == null || h5Var5.getVisibility() == 8 || (h5Var2 = kVar.r) == null || h5Var2.getVisibility() == 8) {
                        h5 h5Var6 = h5VarArr[i14];
                        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
                            h5 h5Var7 = h5VarArr[i14];
                            if (kVar.O0) {
                                i15 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 18;
                            }
                            h5Var7.setTextSize(i15);
                        }
                        h5 h5Var8 = kVar.r;
                        if (h5Var8 != null && h5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        h5 h5Var9 = kVar.s;
                        if (h5Var9 != null) {
                            h5Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        h5 h5Var10 = h5VarArr[i14];
                        if (h5Var10 != null) {
                            if (kVar.O0) {
                                i15 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i15 = 18;
                            }
                            h5Var10.setTextSize(i15);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        h5 h5Var11 = kVar.s;
                        if (h5Var11 != null) {
                            h5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                h5 h5Var12 = h5VarArr[i14];
                if (h5Var12 != null && h5Var12.getVisibility() != 8) {
                    h5VarArr[i14].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(h5VarArr[i14].getPaddingBottom() + h5VarArr[i14].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.z0) {
                        CharSequence text = h5VarArr[i14].getText();
                        h5 h5Var13 = h5VarArr[i14];
                        h5Var13.setPivotX(h5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i14].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i14].setPivotX(0.0f);
                        h5VarArr[i14].setPivotY(0.0f);
                    }
                }
                h5 h5Var14 = kVar.r;
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                bi.n nVar = kVar.m1;
                if (nVar != null) {
                    nVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                h5 h5Var15 = kVar.s;
                if (h5Var15 != null && h5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i14++;
            i13 = i12;
        }
        int i16 = i13;
        z9 z9Var = kVar.f;
        if (z9Var != null) {
            z9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = kVar.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[i16] && childAt != kVar.m1 && childAt != kVar.r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i17++;
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

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        invalidate();
    }

    public final void q(int i10) {
        h5[] h5VarArr = this.n;
        if (h5VarArr[i10] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        h5VarArr[i10] = h5Var;
        h5Var.setGravity(19);
        int i11 = this.v0;
        if (i11 != 0) {
            h5VarArr[i10].setTextColor(i11);
        } else {
            h5VarArr[i10].setTextColor(g6.w0(g6.A8, this.I0));
        }
        h5 h5Var2 = h5VarArr[i10];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
        h5VarArr[i10].setTypeface(AndroidUtilities.bold());
        h5VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        h5VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        h5VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(h5VarArr[i10], 0, w7.a6.e(-2, -2, 51));
        } else {
            addView(h5VarArr[i10], 0, w7.a6.e(-2, -2, 51));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void s() {
        d dVar = this.F;
        if (dVar == null || !this.J) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof u0) {
                ((u0) childAt).n();
            }
        }
        this.J = false;
        g();
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<d, Float>) property, 0.0f));
        if (this.Q != null) {
            int i13 = 0;
            while (true) {
                View[] viewArr = this.Q;
                if (i13 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i13];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.Q[i13], (Property<View, Float>) property, 1.0f));
                }
                i13++;
            }
        }
        boolean z10 = this.n0;
        h5[] h5VarArr = this.n;
        if (!z10) {
            h5 h5Var = h5VarArr[0];
            if (h5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<h5, Float>) property, 1.0f));
            }
        }
        y yVar = this.E;
        if (yVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<y, Float>) property, 1.0f));
        }
        int i14 = this.x;
        if (i14 == 0 || this.O0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i14) < 0.699999988079071d) {
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
            ofFloat.addUpdateListener(new a(this, i12));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i10));
        this.P.start();
        if (!this.n0) {
            h5 h5Var2 = h5VarArr[0];
            if (h5Var2 != null) {
                h5Var2.setVisibility(0);
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
            if (drawable instanceof f2) {
                ((f2) drawable).c(0.0f, true);
            }
            this.e.setBackgroundDrawable(g6.g0(this.p0, 1, -1));
        }
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
        z(recyclerView, false, g6.a7, g6.s8);
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
        if (drawable instanceof f2) {
            f2 f2Var = (f2) drawable;
            f2Var.c(t() ? 1.0f : 0.0f, false);
            f2Var.b(this.s0);
            f2Var.a(this.r0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.k = this.x;
            c5Var.j = this.r0;
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
            if (drawable instanceof c5) {
                ((c5) drawable).k = i10;
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

    public void setChatAvatarContainer(ro roVar) {
        this.R0 = roVar;
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

    public void setDrawBlurBackground(ow0 ow0Var) {
        this.K0 = true;
        this.J0 = ow0Var;
        ow0Var.T.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.l1 != z10) {
            this.l1 = z10;
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
        h5[] h5VarArr = this.n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(z9 z9Var) {
        z9 z9Var2 = this.f;
        if (z9Var2 == z9Var) {
            return;
        }
        if (z9Var2 != null) {
            removeView(z9Var2);
        }
        this.f = z9Var;
        if (z9Var != null) {
            addView(z9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i10);
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

    public void setSearchFilter(hg.p0 p0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(p0Var);
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
        h5[] h5VarArr = this.n;
        if (h5VarArr[0] == null) {
            q(0);
        }
        this.v0 = i10;
        h5VarArr[0].setTextColor(i10);
        h5VarArr[0].setEmojiColor(i10);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[1].setEmojiColor(i10);
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

    public final boolean t() {
        return this.F != null && this.J;
    }

    public final boolean u(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean v() {
        return false;
    }

    public void w(boolean z10) {
        Property property;
        this.n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean v = v();
        if (!v) {
            h5 h5Var = this.n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 2));
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
        z9 z9Var = this.f;
        if (z9Var != null) {
            z9Var.setVisibility(0);
            this.V0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<z9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, v));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                c5 c5Var = (c5) drawable;
                c5Var.h = true;
                c5Var.a(z10 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void x() {
        e5 e5Var;
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G && (e5Var = u0Var.H) != null) {
                    e5Var.p(u0Var.e);
                }
            }
        }
    }

    public final void y(String str) {
        y yVar = this.E;
        if (yVar == null || str == null) {
            return;
        }
        boolean z10 = this.n0;
        boolean z11 = !z10;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G) {
                    if (!z10) {
                        yVar.b.w(u0Var.L(z11));
                    }
                    u0Var.H(str, false);
                    u0Var.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public final void z(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        this.p1 = i10;
        this.q1 = i11;
        org.telegram.messenger.voip.j jVar = new org.telegram.messenger.voip.j(9, this, recyclerView);
        recyclerView.j(new ah.d0(jVar, 13));
        this.o1 = z10;
        if (this.n1) {
            jVar.run();
            return;
        }
        this.n1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.r1 = !canScrollVertically;
        this.s1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public void setAdaptiveBackground(ap0 ap0Var) {
        int i10 = g6.a7;
        int i11 = g6.s8;
        this.p1 = i10;
        this.q1 = i11;
        b();
        org.telegram.messenger.voip.j jVar = new org.telegram.messenger.voip.j(8, this, ap0Var);
        ap0Var.f.add(jVar);
        if (this.n1) {
            jVar.run();
            return;
        }
        this.n1 = true;
        boolean canScrollVertically = ap0Var.canScrollVertically(-1);
        this.r1 = !canScrollVertically;
        this.s1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
