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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements td.b, w5 {
    public z A;
    public boolean A0;
    public d B;
    public dh.g B0;
    public String C;
    public boolean C0;
    public boolean D;
    public View.OnTouchListener D0;
    public boolean E;
    public final b6 E0;
    public boolean F;
    public xu0 F0;
    public boolean G;
    public boolean G0;
    public boolean H;
    public final Paint H0;
    public boolean I;
    public final Rect I0;
    public boolean J;
    public final com.google.firebase.messaging.l J0;
    public int K;
    public boolean K0;
    public AnimatorSet L;
    public boolean L0;
    public View[] M;
    public boolean M0;
    public boolean N;
    public tn N0;
    public iv0 O;
    public boolean O0;
    public a00 P;
    public Runnable P0;
    public Paint.FontMetricsInt Q;
    public ky0 Q0;
    public boolean R;
    public AnimatorSet R0;
    public Rect S;
    public int S0;
    public int T;
    public int T0;
    public boolean U;
    public boolean U0;
    public CharSequence V;
    public boolean V0;
    public Drawable W;
    public float W0;
    public final td.c X0;
    public final td.a Y0;
    public final td.c Z0;
    public kg.d a;
    public View.OnClickListener a0;
    public final td.a a1;
    public kg.d b;
    public String b0;
    public int b1;
    public kg.d c;
    public final Object[] c0;
    public int c1;
    public final x4 d;
    public Runnable d0;
    public boolean d1;
    public ImageView e;
    public boolean e0;
    public boolean e1;
    public o9 f;
    public Runnable f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public Drawable h;
    public int h0;
    public ih.k h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public float k0;
    public int k1;
    public int l0;
    public int l1;
    public int m0;
    public boolean m1;
    public final h5[] n;
    public int n0;
    public float n1;
    public int o0;
    public ValueAnimator o1;
    public o2 p0;
    public j q0;
    public h5 r;
    public int r0;
    public h5 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public View v;
    public boolean v0;
    public int w;
    public CharSequence w0;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public k(Context context, b6 b6Var) {
        super(context);
        this.d = x4.a;
        this.n = new h5[2];
        this.E = true;
        this.G = true;
        this.I = true;
        this.c0 = new Object[3];
        this.g0 = true;
        this.h0 = 255;
        this.r0 = 0;
        this.H0 = new Paint();
        this.I0 = new Rect();
        this.J0 = new com.google.firebase.messaging.l(this);
        gr grVar = gr.h;
        this.X0 = new td.c(0, this, grVar, 380L);
        this.Y0 = new td.a(0, this, grVar, 380L, false);
        this.Z0 = new td.c(0, this, grVar, 320L);
        this.a1 = new td.a(0, this, grVar, 320L, false);
        this.m1 = true;
        this.n1 = 1.0f;
        this.E0 = b6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public static View q(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i9, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.m0 = i9;
            if (this.F && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(f6.f0(i9, 1, -1));
            }
            d dVar = this.B;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.l0 = i9;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(f6.f0(i9, 1, -1));
        }
        z zVar = this.A;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i9, boolean z10) {
        if (z10) {
            this.o0 = i9;
            d dVar = this.B;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).b(i9);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.n0 = i9;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i9 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i9);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).j = i9;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.O0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.n0, PorterDuff.Mode.SRC_IN));
    }

    public final void D(int i9, boolean z10) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i9);
                }
                i10++;
            }
            return;
        }
        if (z10 || (zVar = this.A) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = zVar.getChildAt(i10);
            if (childAt2 instanceof w0) {
                ((w0) childAt2).B(i9);
            }
            i10++;
        }
    }

    public final void E(int i9, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i9, z10);
                }
                i10++;
            }
            return;
        }
        if (z11 || (zVar = this.A) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = zVar.getChildAt(i10);
            if (childAt2 instanceof w0) {
                ((w0) childAt2).G(i9, z10);
            }
            i10++;
        }
    }

    public final void F(int i9, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.B) != null) {
            dVar.setPopupItemsSelectorColor(i9);
        } else {
            if (z10 || (zVar = this.A) == null) {
                return;
            }
            zVar.setPopupItemsSelectorColor(i9);
        }
    }

    public final void G(int i9, boolean z10) {
        z zVar = this.A;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.C) {
                        if (z10) {
                            w0Var.getSearchField().setHintTextColor(i9);
                            return;
                        } else {
                            w0Var.getSearchField().setTextColor(i9);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void H(CharSequence charSequence, org.telegram.ui.Components.i5 i5Var) {
        h5[] h5VarArr = this.n;
        if (charSequence != null && h5VarArr[0] == null) {
            p(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setVisibility((charSequence == null || this.j0) ? 4 : 0);
            h5 h5Var2 = h5VarArr[0];
            this.V = charSequence;
            h5Var2.k(charSequence);
            if (this.y0) {
                Drawable drawable = this.W;
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.W = i5Var;
            h5Var3.i(i5Var);
            if (this.y0) {
                Drawable drawable2 = this.W;
                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.a0);
        }
        this.u0 = false;
    }

    public final void I(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        h5[] h5VarArr = this.n;
        if (h5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.s0 && !TextUtils.isEmpty(this.w0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            this.r.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(220L).start();
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
        this.u0 = z10;
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
        this.t0 = true;
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

    public final void J(String str, int i9, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        h5 h5Var;
        int indexOf;
        if (!this.U || this.p0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.c0;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i9);
        objArr[2] = runnable;
        if (this.U0) {
            return;
        }
        String str2 = this.b0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.b0 = str;
            if (this.h1 != null) {
                this.h1.a(i9 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i9) : this.V;
            Drawable drawable = str == null ? this.W : null;
            com.google.firebase.messaging.l lVar = this.J0;
            if (str == null || (indexOf = TextUtils.indexOf(string, "...")) < 0) {
                z10 = false;
                charSequence = string;
            } else {
                SpannableString valueOf = SpannableString.valueOf(string);
                lVar.u(valueOf, indexOf);
                z10 = true;
                charSequence = valueOf;
            }
            this.e0 = str != null;
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
                        p(1);
                    }
                    h5VarArr[1].k(charSequence);
                    h5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    h5VarArr[1].i(drawable);
                    h5VarArr[1].setRightDrawableOnClick(this.a0);
                    if (drawable instanceof org.telegram.ui.Components.i5) {
                        ((org.telegram.ui.Components.i5) drawable).l(h5VarArr[1]);
                    }
                    if (z10) {
                        lVar.c(h5VarArr[1]);
                    }
                    this.U0 = true;
                    h5 h5Var4 = h5VarArr[1];
                    h5VarArr[1] = h5VarArr[0];
                    h5VarArr[0] = h5Var4;
                    h5Var4.setAlpha(0.0f);
                    h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    h5VarArr[0].animate().alpha(this.j1 ? 1.0f - this.n1 : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.v0 = true;
                    alpha.setDuration(220L).setListener(new e(this, 1)).start();
                }
            } else {
                p(0);
                if (this.N) {
                    h5VarArr[0].invalidate();
                    invalidate();
                }
                h5VarArr[0].k(charSequence);
                h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                h5VarArr[0].i(drawable);
                h5VarArr[0].setRightDrawableOnClick(this.a0);
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).l(h5VarArr[0]);
                }
                if (z10) {
                    lVar.c(h5VarArr[0]);
                } else {
                    lVar.q(h5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.d0;
            }
            this.f0 = runnable;
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        invalidate();
    }

    public final void K() {
        this.C0 = true;
        if (this.B0 == null) {
            dh.g gVar = new dh.g(getContext(), 4);
            this.B0 = gVar;
            addView(gVar);
        }
    }

    public final void L(ig.a aVar, lg.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.K0 = true;
        this.M0 = z10;
        kg.d c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.o(AndroidUtilities.dp(6.0f));
        this.a = c10;
        if (z10) {
            c10.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.p(AndroidUtilities.dp(23.0f));
        }
        kg.d c11 = aVar.c(this, null, false);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.b = c11;
        kg.d c12 = aVar.c(this, null, false);
        c12.n(dVar);
        c12.p(AndroidUtilities.dp(23.0f));
        c12.o(AndroidUtilities.dp(6.0f));
        this.c = c12;
        z zVar = this.A;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.A.setGlassMode(true);
        }
        d dVar2 = this.B;
        if (dVar2 != null) {
            dVar2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.B.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean M(View view) {
        if (this.H) {
            h5[] h5VarArr = this.n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.r || view == this.A || view == this.e || view == this.s || view == this.B0) {
                return true;
            }
        }
        return false;
    }

    public void N(View[] viewArr, boolean[] zArr) {
        if (this.B == null || this.F) {
            return;
        }
        this.F = true;
        g();
        ArrayList arrayList = new ArrayList();
        int i9 = 2;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<d, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.M = viewArr;
        if (this.w == 0) {
            if (!this.j0) {
                h5 h5Var = this.n[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.w0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<h5, Float>) property, 0.0f));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 0.0f));
            }
        }
        int i10 = this.w;
        if (i10 == 0) {
            i10 = this.x;
        }
        if (i10 == 0 || this.K0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i10) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.Q0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i9));
            this.L.playTogether(ofFloat);
        }
        this.L.setDuration(200L);
        this.L.addListener(new fg.j(8, this, zArr));
        this.L.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h2) {
                ((h2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(f6.f0(this.m0, 1, -1));
        }
    }

    public final void O() {
        boolean z10 = this.y0 && this.z0;
        if (this.A0 != z10) {
            this.A0 = z10;
            com.google.firebase.messaging.l lVar = this.J0;
            if (!z10) {
                lVar.a = false;
                ((AnimatorSet) lVar.c).cancel();
                return;
            }
            lVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) lVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    public final boolean a(String str) {
        if (this.B == null) {
            return false;
        }
        String str2 = this.C;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void b() {
        if (this.i1) {
            if (this.j1) {
                dh.g gVar = this.B0;
                if (gVar != null) {
                    gVar.setAlpha(1.0f - this.n1);
                } else {
                    h5 h5Var = this.n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.n1);
                    }
                }
            }
            float f10 = this.n1;
            int i9 = this.l1;
            b6 b6Var = this.E0;
            int v02 = i9 == -1 ? 0 : f6.v0(i9, b6Var);
            int i10 = this.k1;
            int v03 = i10 == -1 ? 0 : f6.v0(i10, b6Var);
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f10, v02, v03));
            setShadowAlpha((int) ((1.0f - this.n1) * 255.0f));
            if (this.G0) {
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
        this.v0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        b();
        kg.d dVar = this.a;
        if (dVar != null) {
            dVar.u();
        }
        kg.d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.u();
        }
        kg.d dVar3 = this.b;
        if (dVar3 != null) {
            dVar3.u();
        }
        ih.k kVar = this.h1;
        if (kVar != null) {
            kVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i10 = this.d1 ? this.b1 : (int) this.Z0.e;
        if (this.e1) {
            i10 = Math.max((int) ((1.0f - this.W0) * this.c1), i10);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i11 = dp * 2;
        int i12 = height + dp2 + i11;
        kg.d dVar = this.a;
        td.a aVar = this.a1;
        if (dVar == null || this.L0) {
            f10 = 1.0f;
        } else {
            if (this.d1 || this.e1) {
                f10 = 1.0f;
                i9 = i10 > 0 ? dp : 0;
            } else {
                f10 = 1.0f;
                i9 = (int) (dp * aVar.e);
            }
            int i13 = i9 + i10;
            int i14 = dp + dp2;
            int max = Math.max(i13, i14);
            tn tnVar = this.N0;
            td.a aVar2 = this.Y0;
            int lerp = AndroidUtilities.lerp(i13, max, tnVar == null ? 0.0f : f10 - aVar2.e);
            int lerp2 = AndroidUtilities.lerp(z10 ? i14 : 0, i14, this.N0 == null ? 0.0f : f10 - aVar2.e);
            int width = getWidth() - lerp;
            int i15 = width - lerp2;
            if (this.N0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i15, ((int) this.X0.e) + i11), i15, Math.max(this.W0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.N0.getLayoutParams()).leftMargin) - this.N0.getLeftPadding()) + dp;
                this.N0.setTranslationX(dp3);
                this.N0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.a.setBounds(lerp2, height, width, i12);
            this.a.draw(canvas);
        }
        kg.d dVar2 = this.b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i11, i12);
            this.b.draw(canvas);
        }
        kg.d dVar3 = this.c;
        if (dVar3 != null && i10 > 0 && !this.L0 && !this.g1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i11, height, getWidth(), i12);
            this.c.setAlpha(this.d1 ? 255 : (int) (aVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.G0 && this.x != 0) {
            this.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i16 = this.x;
            Paint paint = this.H0;
            paint.setColor(i16);
            if (this.i1) {
                xu0 xu0Var = this.F0;
                float y10 = getY();
                float f11 = f10 - this.n1;
                xu0Var.getClass();
                xu0Var.K(canvas, y10, this.I0, paint, true, AndroidUtilities.lerp(255, Color.alpha(f6.v0((xu0.F() && SharedConfig.getDevicePerformanceClass() == 2) ? f6.xf : f6.yf, xu0Var.getResourceProvider())), f11));
            } else {
                this.F0.J(canvas, getY(), this.I0, paint, true);
            }
        }
        this.f1 = true;
        if (this.V0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.N0 != null && this.K0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View q10 = q(this, f10, f11, this.N0);
            if (q10 == null) {
                q10 = q(this, f10, f11, null);
            }
            kg.d dVar = this.a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x10, y10);
            if (q10 != null && q10 != this.N0) {
                kg.d dVar2 = this.b;
                boolean z11 = z10 | (dVar2 != null && dVar2.getBounds().contains(x10, y10));
                kg.d dVar3 = this.c;
                z10 = z11 | (dVar3 != null && dVar3.getBounds().contains(x10, y10));
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Drawable y02;
        float f10;
        boolean z11;
        zz zzVar;
        o2 o2Var = this.p0;
        if (o2Var != null && o2Var.getParentLayout() != null) {
            this.p0.getParentLayout().getClass();
        }
        if (this.x0 && view == this.e) {
            return true;
        }
        boolean M = M(view);
        if (M) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.E ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.N && !this.e0 && !LocaleController.isRTL) {
            h5[] h5VarArr = this.n;
            if ((view == h5VarArr[0] || view == h5VarArr[1] || (view == this.B0 && this.C0)) && (y02 = f6.y0()) != null) {
                h5 h5Var = view == this.B0 ? h5VarArr[0] : (h5) view;
                if (h5Var != null && h5Var.getVisibility() == 0 && (h5Var.getText() instanceof String)) {
                    TextPaint textPaint = h5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.Q);
                    textPaint.getTextBounds((String) h5Var.getText(), 0, 1, this.S);
                    int width = ((this.S.width() - (y02.getIntrinsicWidth() + f6.D1)) / 2) + h5Var.getTextStartX() + f6.D1;
                    f10 = 255.0f;
                    int textStartY = h5Var.getTextStartY() + f6.E1 + ((int) Math.ceil((h5Var.getTextHeight() - this.S.height()) / 2.0f)) + ((int) ((1.0f - this.B0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    y02.setBounds(width, textStartY - y02.getIntrinsicHeight(), y02.getIntrinsicWidth() + width, textStartY);
                    y02.setAlpha((int) (h5Var.getAlpha() * this.B0.getAlpha() * 255.0f));
                    y02.draw(canvas);
                    if (this.U0) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                }
                if (f6.G1) {
                    if (this.O == null) {
                        this.O = new iv0(0);
                    }
                } else if (!this.R && this.O != null) {
                    this.O = null;
                }
                iv0 iv0Var = this.O;
                if (iv0Var != null) {
                    iv0Var.b(canvas, this);
                } else {
                    a00 a00Var = this.P;
                    if (a00Var != null) {
                        ArrayList arrayList = a00Var.d;
                        ArrayList arrayList2 = a00Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                zz zzVar2 = (zz) arrayList2.get(i9);
                                Paint paint = zzVar2.k.a;
                                paint.setColor(zzVar2.j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * zzVar2.i);
                                paint.setAlpha((int) (zzVar2.f * f10));
                                canvas.drawPoint(zzVar2.a, zzVar2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i10 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.l0.B(20.0f, getMeasuredHeight(), i10)) + i10;
                                    int nextInt = Utilities.random.nextInt(4);
                                    int i11 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                    int i12 = 0;
                                    for (int i13 = 8; i12 < i13; i13 = 8) {
                                        float f11 = nextFloat;
                                        double nextInt2 = (Utilities.random.nextInt(270) - 225) * 0.017453292519943295d;
                                        float cos = (float) Math.cos(nextInt2);
                                        float sin = (float) Math.sin(nextInt2);
                                        if (arrayList.isEmpty()) {
                                            zzVar = new zz(a00Var);
                                        } else {
                                            zzVar = (zz) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        zzVar.a = f11;
                                        zzVar.b = nextFloat2;
                                        zzVar.c = cos * 1.5f;
                                        zzVar.d = sin;
                                        zzVar.j = i11;
                                        zzVar.f = 1.0f;
                                        zzVar.h = 0.0f;
                                        zzVar.i = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                                        zzVar.g = Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                        zzVar.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                                        arrayList2.add(zzVar);
                                        i12++;
                                        nextFloat = f11;
                                    }
                                }
                            }
                            int i14 = 0;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - a00Var.b);
                            int size2 = arrayList2.size();
                            while (i14 < size2) {
                                zz zzVar3 = (zz) arrayList2.get(i14);
                                float f12 = zzVar3.h;
                                float f13 = zzVar3.g;
                                if (f12 >= f13) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(zzVar3);
                                    }
                                    arrayList2.remove(i14);
                                    i14--;
                                    size2--;
                                    z11 = M;
                                } else {
                                    zzVar3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                                    float f14 = zzVar3.a;
                                    float f15 = zzVar3.c;
                                    float f16 = zzVar3.e;
                                    float f17 = min;
                                    z11 = M;
                                    zzVar3.a = aa.d.d(f15 * f16, f17, 500.0f, f14);
                                    float f18 = zzVar3.b;
                                    float f19 = zzVar3.d;
                                    zzVar3.b = (((f16 * f19) * f17) / 500.0f) + f18;
                                    zzVar3.d = (f17 / 100.0f) + f19;
                                    zzVar3.h += f17;
                                }
                                i14++;
                                M = z11;
                            }
                            z10 = M;
                            a00Var.b = currentTimeMillis;
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
        z10 = M;
        if (z10) {
        }
        return drawChild;
    }

    public final void e(boolean z10) {
        tn tnVar = this.N0;
        if (tnVar == null) {
            return;
        }
        pn pnVar = tnVar.e;
        boolean z11 = pnVar != null && pnVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.N0.getVisualWidth());
        td.c cVar = this.X0;
        if (z10) {
            float f10 = min;
            if ((cVar.g ? cVar.f : cVar.e) != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(min);
        }
        this.Y0.a(z11, z10);
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i9 = ((drawable instanceof h2) || (drawable instanceof c5)) ? 2 : 0;
        if (this.e.getLayerType() != i9) {
            this.e.setLayerType(i9, null);
            this.e.invalidate();
        }
    }

    public final void g() {
        z zVar = this.A;
        int max = Math.max(0, zVar != null ? (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.B;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.F) {
            max = max2;
        }
        this.a1.a(max > 0, this.f1);
        td.c cVar = this.Z0;
        float f10 = max;
        if ((cVar.g ? cVar.f : cVar.e) != f10) {
            if (this.f1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.q0;
    }

    public z getActionMode() {
        return this.B;
    }

    public float getActionModeFactor() {
        d dVar = this.B;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.h1;
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
        return this.g0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.E;
    }

    public o9 getSearchAvatarImageView() {
        return this.f;
    }

    public int getShadowAlpha() {
        return this.h0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.r == null || (charSequence = this.w0) == null) {
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
        return this.B0;
    }

    public void h(boolean z10) {
        z zVar;
        if (!this.j0 || (zVar = this.A) == null) {
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
            return this.B;
        }
        d dVar = this.B;
        if (dVar != null) {
            removeView(dVar);
            this.B = null;
        }
        this.C = str;
        d dVar2 = new d(this, getContext(), this);
        this.B = dVar2;
        dVar2.setTranslationX(this.K0 ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.B.setGlassMode(this.K0);
        d dVar3 = this.B;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.K0) {
            this.B.setBackgroundColor(f6.v0(f6.w8, this.E0));
        }
        addView(this.B, indexOfChild(this.e));
        this.B.setPadding(0, this.E ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.K;
        layoutParams.gravity = 5;
        this.B.setLayoutParams(layoutParams);
        this.B.setVisibility(4);
        return this.B;
    }

    public final void k() {
        if (this.h1 == null) {
            ih.k kVar = new ih.k(this, getContext(), this.E0, this.J0);
            this.h1 = kVar;
            kVar.setClipChildren(false);
            addView(this.h1);
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
        this.s.setTextColor(f6.v0(f6.B8, this.E0));
        addView(this.s, 0, g7.e6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(f6.f0(this.l0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, g7.e6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.A;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.A = zVar2;
        addView(zVar2, 0, g7.e6.e(-2, -1, 5));
        return this.A;
    }

    public final void o() {
        if (this.r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.r = h5Var;
        h5Var.setGravity(3);
        this.r.setVisibility(8);
        this.r.setTextColor(f6.v0(f6.B8, this.E0));
        addView(this.r, 0, g7.e6.e(-2, -2, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        O();
        if (this.F) {
            int i9 = this.w;
            if (i9 == 0) {
                i9 = this.x;
            }
            if (i9 == 0 || this.K0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i9) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        O();
        if (this.F) {
            int i9 = this.x;
            if (i9 == 0 || this.w == 0 || this.K0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i9) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.N && !this.e0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = f6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.R = true;
            iv0 iv0Var = this.O;
            h5[] h5VarArr = this.n;
            if (iv0Var == null) {
                this.P = null;
                this.O = new iv0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.O = null;
                a00 a00Var = new a00();
                a00Var.c = new ArrayList();
                a00Var.d = new ArrayList();
                Paint paint = new Paint(1);
                a00Var.a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(f6.w0(null, f6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i9 = 0; i9 < 20; i9++) {
                    a00Var.d.add(new zz(a00Var));
                }
                this.P = a00Var;
                h5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.D0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        h5[] h5VarArr;
        int measuredWidth;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int currentActionBarHeight;
        int i18 = this.E ? AndroidUtilities.statusBarHeight : 0;
        if (this.T0 != getMeasuredWidth()) {
            this.T0 = getMeasuredWidth();
            e(this.X0.g);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(this.K0 ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i18, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i18);
            dp = AndroidUtilities.dp(this.K0 ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i19 = dp + this.S0;
        z zVar = this.A;
        if (zVar != null && zVar.getVisibility() != 8) {
            int dp2 = this.A.p() ? AndroidUtilities.dp(this.i0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.A.getMeasuredWidth();
            z zVar2 = this.A;
            zVar2.layout(dp2, i18, zVar2.getMeasuredWidth() + dp2, this.A.getMeasuredHeight() + i18);
        }
        int i20 = 0;
        while (true) {
            h5VarArr = this.n;
            if (i20 >= 2) {
                break;
            }
            h5 h5Var = h5VarArr[i20];
            if (h5Var != null && h5Var.getVisibility() != 8) {
                boolean z11 = this.u0;
                if (((z11 && i20 == 0) || (!z11 && i20 == 1)) && this.s0 && this.t0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - h5VarArr[i20].getTextHeight()) / 2;
                } else {
                    h5 h5Var2 = this.r;
                    currentActionBarHeight = (h5Var2 == null || h5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - h5VarArr[i20].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - h5VarArr[i20].getTextHeight()) / 2);
                }
                h5 h5Var3 = h5VarArr[i20];
                int i21 = currentActionBarHeight + i18;
                h5Var3.layout(i19, i21 - h5Var3.getPaddingTop(), h5VarArr[i20].getMeasuredWidth() + i19, h5VarArr[i20].getPaddingBottom() + ((h5VarArr[i20].getTextHeight() + i21) - h5VarArr[i20].getPaddingTop()));
            }
            i20++;
        }
        if (this.h1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.h1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            ih.k kVar = this.h1;
            int i22 = currentActionBarHeight2 + i18;
            kVar.layout(i19, i22, kVar.getMeasuredWidth() + i19, this.h1.getMeasuredHeight() + i22);
        }
        h5 h5Var4 = this.r;
        if (h5Var4 != null && h5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            h5 h5Var5 = this.r;
            int i23 = currentActionBarHeight3 + i18;
            h5Var5.layout(i19, i23, h5Var5.getMeasuredWidth() + i19, this.r.getTextHeight() + i23);
        }
        h5 h5Var6 = this.s;
        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i24 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            h5 h5Var7 = this.s;
            int i25 = dp3 + i18;
            h5Var7.layout(i19, i25, h5Var7.getMeasuredWidth() + i19, this.s.getTextHeight() + i25);
        }
        o9 o9Var = this.f;
        if (o9Var != null) {
            o9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i18, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i18);
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != this.h1 && childAt != this.r && childAt != this.A && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i27 = layoutParams.gravity;
                if (i27 == -1) {
                    i27 = 51;
                }
                int i28 = i27 & 112;
                int i29 = i27 & 7;
                if (i29 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i29 != 5) {
                    i14 = layoutParams.leftMargin;
                    if (i28 != 16) {
                        i15 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    } else if (i28 != 80) {
                        i17 = layoutParams.topMargin;
                        childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                    } else {
                        i15 = (i12 - i10) - measuredHeight;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth2;
                    i13 = layoutParams.rightMargin;
                }
                i14 = measuredWidth - i13;
                if (i28 != 16) {
                }
                i17 = i15 - i16;
                childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int dp;
        h5[] h5VarArr;
        h5 h5Var;
        h5 h5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i11 = 1;
        kVar.D = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.B;
        if (dVar != null) {
            dVar.setPadding(0, kVar.E ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        kVar.D = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.E ? AndroidUtilities.statusBarHeight : 0) + kVar.K);
        ImageView imageView = kVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        z zVar = kVar.A;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (kVar.A.p() && !kVar.j0) {
                kVar.A.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int l10 = kVar.A.l();
                if (kVar.i0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.A.l() + (size - AndroidUtilities.dp(f10)), TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.A.r(-l10);
                }
            } else if (kVar.j0) {
                if (kVar.i0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = ll.d(f10, size, TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.A.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.y) {
                    kVar.A.r(0.0f);
                }
            }
            kVar.A.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i12 = 0;
        while (true) {
            h5VarArr = kVar.n;
            if (i12 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = kVar.r) != null && h5Var.getVisibility() != 8)) {
                z zVar2 = kVar.A;
                int max = Math.max(org.telegram.messenger.l0.B(16.0f, size - (zVar2 != null ? zVar2.getMeasuredWidth() : 0), dp) - kVar.T, 0);
                boolean z10 = kVar.u0;
                int i13 = 20;
                if (((z10 && i12 == 0) || (!z10 && i12 == i11)) && kVar.s0 && kVar.t0) {
                    h5 h5Var4 = h5VarArr[i12];
                    if (kVar.K0) {
                        i13 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i13 = 18;
                    }
                    h5Var4.setTextSize(i13);
                } else {
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 == null || h5Var5.getVisibility() == 8 || (h5Var2 = kVar.r) == null || h5Var2.getVisibility() == 8) {
                        h5 h5Var6 = h5VarArr[i12];
                        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
                            h5 h5Var7 = h5VarArr[i12];
                            if (kVar.K0) {
                                i13 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i13 = 18;
                            }
                            h5Var7.setTextSize(i13);
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
                        h5 h5Var10 = h5VarArr[i12];
                        if (h5Var10 != null) {
                            if (kVar.K0) {
                                i13 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i13 = 18;
                            }
                            h5Var10.setTextSize(i13);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        h5 h5Var11 = kVar.s;
                        if (h5Var11 != null) {
                            h5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                h5 h5Var12 = h5VarArr[i12];
                if (h5Var12 != null && h5Var12.getVisibility() != 8) {
                    h5VarArr[i12].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(h5VarArr[i12].getPaddingBottom() + h5VarArr[i12].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.v0) {
                        CharSequence text = h5VarArr[i12].getText();
                        h5 h5Var13 = h5VarArr[i12];
                        h5Var13.setPivotX(h5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i12].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i12].setPivotX(0.0f);
                        h5VarArr[i12].setPivotY(0.0f);
                    }
                }
                h5 h5Var14 = kVar.r;
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                ih.k kVar2 = kVar.h1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                h5 h5Var15 = kVar.s;
                if (h5Var15 != null && h5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i12++;
            i11 = 1;
        }
        o9 o9Var = kVar.f;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = kVar.getChildAt(i14);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != kVar.h1 && childAt != kVar.r && childAt != kVar.A && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i9, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i14++;
            kVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.I;
    }

    public final void p(int i9) {
        h5[] h5VarArr = this.n;
        if (h5VarArr[i9] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        h5VarArr[i9] = h5Var;
        h5Var.setGravity(19);
        int i10 = this.r0;
        if (i10 != 0) {
            h5VarArr[i9].setTextColor(i10);
        } else {
            h5VarArr[i9].setTextColor(f6.v0(f6.A8, this.E0));
        }
        h5 h5Var2 = h5VarArr[i9];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
        h5VarArr[i9].setTypeface(AndroidUtilities.bold());
        h5VarArr[i9].setDrawablePadding(AndroidUtilities.dp(4.0f));
        h5VarArr[i9].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        h5VarArr[i9].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.C0) {
            this.B0.addView(h5VarArr[i9], 0, g7.e6.e(-2, -2, 51));
        } else {
            addView(h5VarArr[i9], 0, g7.e6.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.B;
        if (dVar == null || !this.F) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).n();
            }
        }
        this.F = false;
        g();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<d, Float>) property, 0.0f));
        if (this.M != null) {
            int i11 = 0;
            while (true) {
                View[] viewArr = this.M;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.M[i11], (Property<View, Float>) property, 1.0f));
                }
                i11++;
            }
        }
        boolean z10 = this.j0;
        h5[] h5VarArr = this.n;
        if (!z10) {
            h5 h5Var = h5VarArr[0];
            if (h5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.w0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<h5, Float>) property, 1.0f));
            }
        }
        z zVar = this.A;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i12 = this.x;
        if (i12 == 0 || this.K0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i12) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.Q0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i9));
            this.L.playTogether(ofFloat);
        }
        this.L.setDuration(200L);
        this.L.addListener(new e(this, i9));
        this.L.start();
        if (!this.j0) {
            h5 h5Var2 = h5VarArr[0];
            if (h5Var2 != null) {
                h5Var2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.w0)) {
                this.r.setVisibility(0);
            }
        }
        z zVar2 = this.A;
        if (zVar2 != null) {
            zVar2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h2) {
                ((h2) drawable).c(0.0f, true);
            }
            this.e.setBackgroundDrawable(f6.f0(this.l0, 1, -1));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        return this.B != null && this.F;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.q0 = jVar;
    }

    public void setActionModeColor(int i9) {
        d dVar = this.B;
        if (dVar != null) {
            dVar.setBackgroundColor(i9);
        }
    }

    public void setActionModeOverrideColor(int i9) {
        this.w = i9;
    }

    public void setActionModeTopColor(int i9) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, f6.a7, f6.s8);
    }

    public void setAddToContainer(boolean z10) {
        this.G = z10;
    }

    public void setAdditionalTextLeft(int i9) {
        this.S0 = i9;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.U = z10;
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
        if (drawable instanceof h2) {
            h2 h2Var = (h2) drawable;
            h2Var.c(s() ? 1.0f : 0.0f, false);
            h2Var.b(this.o0);
            h2Var.a(this.n0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.k = this.x;
            c5Var.j = this.n0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.n0, PorterDuff.Mode.SRC_IN));
        }
        if (this.O0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.n0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i9) {
        if (this.e == null) {
            m();
        }
        this.e.setVisibility(i9 == 0 ? 8 : 0);
        this.e.setImageResource(i9);
        this.e.setColorFilter(new PorterDuffColorFilter(this.n0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        this.x = i9;
        if (!this.G0) {
            super.setBackgroundColor(i9);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).k = i9;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.g0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.g0 = z10;
    }

    public void setChatAvatarContainer(tn tnVar) {
        this.N0 = tnVar;
    }

    public void setClipContent(boolean z10) {
        this.H = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.x0 = z10;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(xu0 xu0Var) {
        this.G0 = true;
        this.F0 = xu0Var;
        xu0Var.P.add(this);
        setBackground(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        z zVar = this.A;
        if (zVar != null) {
            zVar.setEnabled(z10);
        }
        d dVar = this.B;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i9) {
        this.K = i9;
        d dVar = this.B;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.K;
            this.B.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.J = z10;
    }

    public void setForcedMenuMinWidth(int i9) {
        this.e1 = true;
        if (this.c1 != i9) {
            this.c1 = i9;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i9) {
        this.d1 = true;
        if (this.b1 != i9) {
            this.b1 = i9;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.D0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.I = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.E = z10;
        d dVar = this.B;
        if (dVar != null) {
            dVar.setPadding(0, z10 ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.s0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.a0 = onClickListener;
        h5[] h5VarArr = this.n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.a0);
        }
    }

    public void setSearchAvatarImageView(o9 o9Var) {
        o9 o9Var2 = this.f;
        if (o9Var2 == o9Var) {
            return;
        }
        if (o9Var2 != null) {
            removeView(o9Var2);
        }
        this.f = o9Var;
        if (o9Var != null) {
            addView(o9Var);
        }
    }

    public void setSearchCursorColor(int i9) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setSearchCursorColor(i9);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.W0 != f10) {
            this.W0 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.A.setSearchFieldText(str);
    }

    public void setSearchFilter(of.m0 m0Var) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setFilter(m0Var);
        }
    }

    public void setShadowAlpha(int i9) {
        if (this.h0 == i9) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.h0 = i9;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            o();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.r.setVisibility((isEmpty || this.j0) ? 8 : 0);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.w0 = charSequence;
        }
    }

    public void setSubtitleColor(int i9) {
        if (this.r == null) {
            o();
        }
        this.r.setTextColor(i9);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.N = z10;
        if (z10) {
            this.Q = new Paint.FontMetricsInt();
            this.S = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        H(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f0 = runnable;
        this.d0 = runnable;
    }

    public void setTitleColor(int i9) {
        h5[] h5VarArr = this.n;
        if (h5VarArr[0] == null) {
            p(0);
        }
        this.r0 = i9;
        h5VarArr[0].setTextColor(i9);
        h5VarArr[0].setEmojiColor(i9);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i9);
            h5VarArr[1].setEmojiColor(i9);
        }
    }

    public void setTitleRightMargin(int i9) {
        this.T = i9;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.n[0].setScrollNonFitText(z10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.H) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.B == null || !this.F) {
            return false;
        }
        String str2 = this.C;
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
        this.j0 = z10;
        g();
        AnimatorSet animatorSet = this.R0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.R0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            h5 h5Var = this.n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.w0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 1));
        this.R0.playTogether(ofFloat);
        int i9 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i9 >= size) {
                break;
            }
            View view = (View) arrayList.get(i9);
            float f10 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.R0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.R0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.R0;
            if (!z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10));
            i9++;
        }
        o9 o9Var = this.f;
        if (o9Var != null) {
            o9Var.setVisibility(0);
            this.R0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<o9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.v0 = true;
        requestLayout();
        this.R0.addListener(new f(this, arrayList, z10, u10));
        this.R0.setDuration(150L).start();
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

    public final void w() {
        e5 e5Var;
        z zVar = this.A;
        int childCount = zVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zVar.getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && (e5Var = w0Var.D) != null) {
                    e5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.A;
        if (zVar == null || str == null) {
            return;
        }
        boolean z10 = this.j0;
        boolean z11 = !z10;
        int childCount = zVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zVar.getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    if (!z10) {
                        zVar.b.v(w0Var.L(z11));
                    }
                    w0Var.H(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i9, int i10) {
        this.k1 = i9;
        this.l1 = i10;
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(3, this, recyclerView);
        recyclerView.j(new bg.o2(l0Var, 19));
        this.j1 = z10;
        if (this.i1) {
            l0Var.run();
            return;
        }
        this.i1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.m1 = !canScrollVertically;
        this.n1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public final void z(wk0 wk0Var, boolean z10) {
        y(wk0Var, z10, f6.a7, f6.s8);
    }

    public void setAdaptiveBackground(in0 in0Var) {
        int i9 = f6.a7;
        int i10 = f6.s8;
        this.k1 = i9;
        this.l1 = i10;
        b();
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(2, this, in0Var);
        in0Var.f.add(l0Var);
        if (this.i1) {
            l0Var.run();
            return;
        }
        this.i1 = true;
        boolean canScrollVertically = in0Var.canScrollVertically(-1);
        this.m1 = !canScrollVertically;
        this.n1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
