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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.zn;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements xd.b, a6 {
    public boolean A0;
    public z B;
    public boolean B0;
    public d C;
    public dh.d C0;
    public String D;
    public boolean D0;
    public boolean E;
    public View.OnTouchListener E0;
    public boolean F;
    public final f6 F0;
    public boolean G;
    public qv0 G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public final Paint I0;
    public boolean J;
    public final Rect J0;
    public boolean K;
    public final cb.m K0;
    public int L;
    public boolean L0;
    public AnimatorSet M;
    public boolean M0;
    public View[] N;
    public boolean N0;
    public boolean O;
    public zn O0;
    public bw0 P;
    public boolean P0;
    public p00 Q;
    public Runnable Q0;
    public Paint.FontMetricsInt R;
    public vy0 R0;
    public boolean S;
    public AnimatorSet S0;
    public Rect T;
    public int T0;
    public int U;
    public int U0;
    public boolean V;
    public boolean V0;
    public CharSequence W;
    public boolean W0;
    public float X0;
    public final xd.c Y0;
    public final xd.a Z0;
    public pg.b a;
    public Drawable a0;
    public final xd.c a1;
    public pg.b b;
    public View.OnClickListener b0;
    public final xd.a b1;
    public pg.b c;
    public String c0;
    public int c1;
    public final a5 d;
    public final Object[] d0;
    public int d1;
    public ImageView e;
    public Runnable e0;
    public boolean e1;
    public p9 f;
    public boolean f0;
    public boolean f1;
    public Runnable g0;
    public boolean g1;
    public Drawable h;
    public boolean h0;
    public boolean h1;
    public int i0;
    public nh.j i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public float l0;
    public int l1;
    public int m0;
    public int m1;
    public final k5[] n;
    public int n0;
    public boolean n1;
    public int o0;
    public float o1;
    public int p0;
    public ValueAnimator p1;
    public p2 q0;
    public k5 r;
    public j r0;
    public k5 s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public View v;
    public boolean v0;
    public int w;
    public boolean w0;
    public int x;
    public CharSequence x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public k(Context context, f6 f6Var) {
        super(context);
        this.d = a5.a;
        this.n = new k5[2];
        this.F = true;
        this.H = true;
        this.J = true;
        this.d0 = new Object[3];
        this.h0 = true;
        this.i0 = 255;
        this.s0 = 0;
        this.I0 = new Paint();
        this.J0 = new Rect();
        this.K0 = new cb.m(this);
        nr nrVar = nr.h;
        this.Y0 = new xd.c(0, this, nrVar, 380L);
        this.Z0 = new xd.a(0, this, nrVar, 380L, false);
        this.a1 = new xd.c(0, this, nrVar, 320L);
        this.b1 = new xd.a(0, this, nrVar, 320L, false);
        this.n1 = true;
        this.o1 = 1.0f;
        this.F0 = f6Var;
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

    public final void A(sl0 sl0Var, boolean z4) {
        y(sl0Var, z4, j6.a7, j6.s8);
    }

    public final void B(int i10, boolean z4) {
        ImageView imageView;
        if (z4) {
            this.n0 = i10;
            if (this.G && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(j6.f0(i10, 1, -1));
            }
            d dVar = this.C;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.m0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.f0(i10, 1, -1));
        }
        z zVar = this.B;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i10, boolean z4) {
        if (z4) {
            this.p0 = i10;
            d dVar = this.C;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.o0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof i2) {
                    ((i2) drawable2).a(i10);
                } else if (drawable2 instanceof f5) {
                    ((f5) drawable2).j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.P0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.o0, PorterDuff.Mode.SRC_IN));
    }

    public final void D(int i10, boolean z4) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z4 && (dVar = this.C) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i10);
                }
                i11++;
            }
            return;
        }
        if (z4 || (zVar = this.B) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof w0) {
                ((w0) childAt2).B(i10);
            }
            i11++;
        }
    }

    public final void E(int i10, boolean z4, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.C) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i10, z4);
                }
                i11++;
            }
            return;
        }
        if (z10 || (zVar = this.B) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof w0) {
                ((w0) childAt2).G(i10, z4);
            }
            i11++;
        }
    }

    public final void F(int i10, boolean z4) {
        z zVar;
        d dVar;
        if (z4 && (dVar = this.C) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else {
            if (z4 || (zVar = this.B) == null) {
                return;
            }
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void G(int i10, boolean z4) {
        z zVar = this.B;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.D) {
                        if (z4) {
                            w0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            w0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void H(CharSequence charSequence, org.telegram.ui.Components.j5 j5Var) {
        k5[] k5VarArr = this.n;
        if (charSequence != null && k5VarArr[0] == null) {
            p(0);
        }
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setVisibility((charSequence == null || this.k0) ? 4 : 0);
            k5 k5Var2 = k5VarArr[0];
            this.W = charSequence;
            k5Var2.k(charSequence);
            if (this.z0) {
                Drawable drawable = this.a0;
                if (drawable instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable).l(null);
                }
            }
            k5 k5Var3 = k5VarArr[0];
            this.a0 = j5Var;
            k5Var3.i(j5Var);
            if (this.z0) {
                Drawable drawable2 = this.a0;
                if (drawable2 instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable2).l(k5VarArr[0]);
                }
            }
            k5VarArr[0].setRightDrawableOnClick(this.b0);
        }
        this.v0 = false;
    }

    public final void I(CharSequence charSequence, boolean z4, long j10, Interpolator interpolator) {
        k5[] k5VarArr = this.n;
        if (k5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z10 = this.t0 && !TextUtils.isEmpty(this.x0);
        if (z10) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            this.r.animate().alpha(z4 ? 0.0f : 1.0f).setDuration(220L).start();
        }
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            if (k5Var.getParent() != null) {
                ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
            }
            k5VarArr[1] = null;
        }
        k5VarArr[1] = k5VarArr[0];
        k5VarArr[0] = null;
        setTitle(charSequence);
        this.v0 = z4;
        k5VarArr[0].setAlpha(0.0f);
        if (!z10) {
            k5 k5Var2 = k5VarArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z4) {
                dp = -dp;
            }
            k5Var2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.u0 = true;
        ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
        if (!z10) {
            int dp2 = AndroidUtilities.dp(20.0f);
            if (z4) {
                dp2 = -dp2;
            }
            alpha.translationY(dp2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j10).setListener(new g(this, z10, z4, 0)).start();
        requestLayout();
    }

    public final void J(String str, int i10, Runnable runnable) {
        boolean z4;
        CharSequence charSequence;
        k5 k5Var;
        int indexOf;
        if (!this.V || this.q0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.d0;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = runnable;
        if (this.V0) {
            return;
        }
        String str2 = this.c0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.c0 = str;
            if (this.i1 != null) {
                this.i1.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i10) : this.W;
            Drawable drawable = str == null ? this.a0 : null;
            cb.m mVar = this.K0;
            if (str == null || (indexOf = TextUtils.indexOf(string, "...")) < 0) {
                z4 = false;
                charSequence = string;
            } else {
                SpannableString valueOf = SpannableString.valueOf(string);
                mVar.x(valueOf, indexOf);
                z4 = true;
                charSequence = valueOf;
            }
            this.f0 = str != null;
            k5[] k5VarArr = this.n;
            if ((charSequence == null || k5VarArr[0] != null) && getMeasuredWidth() != 0 && ((k5Var = k5VarArr[0]) == null || k5Var.getVisibility() == 0)) {
                k5 k5Var2 = k5VarArr[0];
                if (k5Var2 != null) {
                    k5Var2.animate().cancel();
                    k5 k5Var3 = k5VarArr[1];
                    if (k5Var3 != null) {
                        k5Var3.animate().cancel();
                    }
                    if (k5VarArr[1] == null) {
                        p(1);
                    }
                    k5VarArr[1].k(charSequence);
                    k5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    k5VarArr[1].i(drawable);
                    k5VarArr[1].setRightDrawableOnClick(this.b0);
                    if (drawable instanceof org.telegram.ui.Components.j5) {
                        ((org.telegram.ui.Components.j5) drawable).l(k5VarArr[1]);
                    }
                    if (z4) {
                        mVar.c(k5VarArr[1]);
                    }
                    this.V0 = true;
                    k5 k5Var4 = k5VarArr[1];
                    k5VarArr[1] = k5VarArr[0];
                    k5VarArr[0] = k5Var4;
                    k5Var4.setAlpha(0.0f);
                    k5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    k5VarArr[0].animate().alpha(this.k1 ? 1.0f - this.o1 : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
                    if (this.r == null) {
                        alpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.w0 = true;
                    alpha.setDuration(220L).setListener(new e(this, 1)).start();
                }
            } else {
                p(0);
                if (this.O) {
                    k5VarArr[0].invalidate();
                    invalidate();
                }
                k5VarArr[0].k(charSequence);
                k5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                k5VarArr[0].i(drawable);
                k5VarArr[0].setRightDrawableOnClick(this.b0);
                if (drawable instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable).l(k5VarArr[0]);
                }
                if (z4) {
                    mVar.c(k5VarArr[0]);
                } else {
                    mVar.t(k5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.e0;
            }
            this.g0 = runnable;
        }
    }

    public final void K() {
        this.D0 = true;
        if (this.C0 == null) {
            dh.d dVar = new dh.d(getContext(), 5);
            this.C0 = dVar;
            addView(dVar);
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        invalidate();
    }

    public final void M(ng.a aVar, qg.d dVar, boolean z4) {
        setBackground(null);
        setClipChildren(false);
        this.L0 = true;
        this.N0 = z4;
        pg.b c3 = aVar.c(this, null, false);
        c3.n(dVar);
        c3.o(AndroidUtilities.dp(6.0f));
        this.a = c3;
        if (z4) {
            c3.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c3.p(AndroidUtilities.dp(23.0f));
        }
        pg.b c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(23.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        this.b = c10;
        pg.b c11 = aVar.c(this, null, false);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.c = c11;
        z zVar = this.B;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.B.setGlassMode(true);
        }
        d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.C.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.I) {
            k5[] k5VarArr = this.n;
            if (view == k5VarArr[0] || view == k5VarArr[1] || view == this.r || view == this.B || view == this.e || view == this.s || view == this.C0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.C == null || this.G) {
            return;
        }
        this.G = true;
        g();
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.C, (Property<d, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.N = viewArr;
        if (this.w == 0) {
            if (!this.k0) {
                k5 k5Var = this.n[0];
                if (k5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<k5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.x0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<k5, Float>) property, 0.0f));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 0.0f));
            }
        }
        int i11 = this.w;
        if (i11 == 0) {
            i11 = this.x;
        }
        if (i11 == 0 || this.L0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i11) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.M = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.R0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.M.playTogether(ofFloat);
        }
        this.M.setDuration(200L);
        this.M.addListener(new dg.y2(7, this, zArr));
        this.M.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof i2) {
                ((i2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(j6.f0(this.n0, 1, -1));
        }
    }

    public final void P() {
        boolean z4 = this.z0 && this.A0;
        if (this.B0 != z4) {
            this.B0 = z4;
            cb.m mVar = this.K0;
            if (!z4) {
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
        if (this.C == null) {
            return false;
        }
        String str2 = this.D;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void b() {
        if (this.j1) {
            if (this.k1) {
                dh.d dVar = this.C0;
                if (dVar != null) {
                    dVar.setAlpha(1.0f - this.o1);
                } else {
                    k5 k5Var = this.n[0];
                    if (k5Var != null) {
                        k5Var.setAlpha(1.0f - this.o1);
                    }
                }
            }
            float f10 = this.o1;
            int i10 = this.m1;
            f6 f6Var = this.F0;
            int v02 = i10 == -1 ? 0 : j6.v0(i10, f6Var);
            int i11 = this.l1;
            int v03 = i11 == -1 ? 0 : j6.v0(i11, f6Var);
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f10, v02, v03));
            setShadowAlpha((int) ((1.0f - this.o1) * 255.0f));
            if (this.H0) {
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
        this.w0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void d(boolean z4) {
        zn znVar = this.O0;
        if (znVar == null) {
            return;
        }
        vn vnVar = znVar.e;
        boolean z10 = vnVar != null && vnVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.O0.getVisualWidth());
        xd.c cVar = this.Y0;
        if (z4) {
            float f10 = min;
            if ((cVar.g ? cVar.f : cVar.e) != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(min);
        }
        this.Z0.a(z10, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i11 = this.e1 ? this.c1 : (int) this.a1.e;
        if (this.f1) {
            i11 = Math.max((int) ((1.0f - this.X0) * this.d1), i11);
        }
        ImageView imageView = this.e;
        boolean z4 = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i12 = dp * 2;
        int i13 = height + dp2 + i12;
        pg.b bVar = this.a;
        xd.a aVar = this.b1;
        if (bVar == null || this.M0) {
            f10 = 1.0f;
        } else {
            if (this.e1 || this.f1) {
                f10 = 1.0f;
                i10 = i11 > 0 ? dp : 0;
            } else {
                f10 = 1.0f;
                i10 = (int) (dp * aVar.e);
            }
            int i14 = i10 + i11;
            int i15 = dp + dp2;
            int max = Math.max(i14, i15);
            zn znVar = this.O0;
            xd.a aVar2 = this.Z0;
            int lerp = AndroidUtilities.lerp(i14, max, znVar == null ? 0.0f : f10 - aVar2.e);
            int lerp2 = AndroidUtilities.lerp(z4 ? i15 : 0, i15, this.O0 == null ? 0.0f : f10 - aVar2.e);
            int width = getWidth() - lerp;
            int i16 = width - lerp2;
            if (this.O0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i16, ((int) this.Y0.e) + i12), i16, Math.max(this.X0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.O0.getLayoutParams()).leftMargin) - this.O0.getLeftPadding()) + dp;
                this.O0.setTranslationX(dp3);
                this.O0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.a.setBounds(lerp2, height, width, i13);
            this.a.draw(canvas);
        }
        pg.b bVar2 = this.b;
        if (bVar2 != null && z4) {
            bVar2.setBounds(0, height, dp2 + i12, i13);
            this.b.draw(canvas);
        }
        pg.b bVar3 = this.c;
        if (bVar3 != null && i11 > 0 && !this.M0 && !this.h1) {
            bVar3.setBounds((getWidth() - Math.max(dp2, i11)) - i12, height, getWidth(), i13);
            this.c.setAlpha(this.e1 ? 255 : (int) (aVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.H0 && this.x != 0) {
            this.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i17 = this.x;
            Paint paint = this.I0;
            paint.setColor(i17);
            if (this.j1) {
                qv0 qv0Var = this.G0;
                float y10 = getY();
                float f11 = f10 - this.o1;
                qv0Var.getClass();
                qv0Var.K(canvas, y10, this.J0, paint, true, AndroidUtilities.lerp(255, Color.alpha(j6.v0((qv0.F() && SharedConfig.getDevicePerformanceClass() == 2) ? j6.xf : j6.yf, qv0Var.getResourceProvider())), f11));
            } else {
                this.G0.J(canvas, getY(), this.J0, paint, true);
            }
        }
        this.g1 = true;
        if (this.W0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.O0 != null && this.L0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View q10 = q(this, f10, f11, this.O0);
            if (q10 == null) {
                q10 = q(this, f10, f11, null);
            }
            pg.b bVar = this.a;
            boolean z4 = bVar != null && bVar.getBounds().contains(x10, y10);
            if (q10 != null && q10 != this.O0) {
                pg.b bVar2 = this.b;
                boolean z10 = z4 | (bVar2 != null && bVar2.getBounds().contains(x10, y10));
                pg.b bVar3 = this.c;
                z4 = z10 | (bVar3 != null && bVar3.getBounds().contains(x10, y10));
            }
            if (!z4) {
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
        boolean z4;
        Drawable y02;
        float f10;
        boolean z10;
        o00 o00Var;
        p2 p2Var = this.q0;
        if (p2Var != null && p2Var.getParentLayout() != null) {
            this.q0.getParentLayout().getClass();
        }
        if (this.y0 && view == this.e) {
            return true;
        }
        boolean N = N(view);
        if (N) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.F ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.O && !this.f0 && !LocaleController.isRTL) {
            k5[] k5VarArr = this.n;
            if ((view == k5VarArr[0] || view == k5VarArr[1] || (view == this.C0 && this.D0)) && (y02 = j6.y0()) != null) {
                k5 k5Var = view == this.C0 ? k5VarArr[0] : (k5) view;
                if (k5Var != null && k5Var.getVisibility() == 0 && (k5Var.getText() instanceof String)) {
                    TextPaint textPaint = k5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.R);
                    textPaint.getTextBounds((String) k5Var.getText(), 0, 1, this.T);
                    int width = ((this.T.width() - (y02.getIntrinsicWidth() + j6.D1)) / 2) + k5Var.getTextStartX() + j6.D1;
                    f10 = 255.0f;
                    int textStartY = k5Var.getTextStartY() + j6.E1 + ((int) Math.ceil((k5Var.getTextHeight() - this.T.height()) / 2.0f)) + ((int) ((1.0f - this.C0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    y02.setBounds(width, textStartY - y02.getIntrinsicHeight(), y02.getIntrinsicWidth() + width, textStartY);
                    y02.setAlpha((int) (k5Var.getAlpha() * this.C0.getAlpha() * 255.0f));
                    y02.draw(canvas);
                    if (this.V0) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                }
                if (j6.G1) {
                    if (this.P == null) {
                        this.P = new bw0(0);
                    }
                } else if (!this.S && this.P != null) {
                    this.P = null;
                }
                bw0 bw0Var = this.P;
                if (bw0Var != null) {
                    bw0Var.b(canvas, this);
                } else {
                    p00 p00Var = this.Q;
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
                                paint.setAlpha((int) (o00Var2.f * f10));
                                canvas.drawPoint(o00Var2.a, o00Var2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i11 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.y3.B(20.0f, getMeasuredHeight(), i11)) + i11;
                                    int nextInt = Utilities.random.nextInt(4);
                                    int i12 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                    int i13 = 0;
                                    for (int i14 = 8; i13 < i14; i14 = 8) {
                                        float f11 = nextFloat;
                                        double nextInt2 = (Utilities.random.nextInt(270) - 225) * 0.017453292519943295d;
                                        float cos = (float) Math.cos(nextInt2);
                                        float sin = (float) Math.sin(nextInt2);
                                        if (arrayList.isEmpty()) {
                                            o00Var = new o00(p00Var);
                                        } else {
                                            o00Var = (o00) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        o00Var.a = f11;
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
                                        nextFloat = f11;
                                    }
                                }
                            }
                            int i15 = 0;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - p00Var.b);
                            int size2 = arrayList2.size();
                            while (i15 < size2) {
                                o00 o00Var3 = (o00) arrayList2.get(i15);
                                float f12 = o00Var3.h;
                                float f13 = o00Var3.g;
                                if (f12 >= f13) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(o00Var3);
                                    }
                                    arrayList2.remove(i15);
                                    i15--;
                                    size2--;
                                    z10 = N;
                                } else {
                                    o00Var3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                                    float f14 = o00Var3.a;
                                    float f15 = o00Var3.c;
                                    float f16 = o00Var3.e;
                                    float f17 = min;
                                    z10 = N;
                                    o00Var3.a = android.support.v4.media.a.d(f15 * f16, f17, 500.0f, f14);
                                    float f18 = o00Var3.b;
                                    float f19 = o00Var3.d;
                                    o00Var3.b = (((f16 * f19) * f17) / 500.0f) + f18;
                                    o00Var3.d = (f17 / 100.0f) + f19;
                                    o00Var3.h += f17;
                                }
                                i15++;
                                N = z10;
                            }
                            z4 = N;
                            p00Var.b = currentTimeMillis;
                            invalidate();
                            if (z4) {
                                canvas.restore();
                            }
                            return drawChild;
                        }
                    }
                }
            }
        }
        z4 = N;
        if (z4) {
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        b();
        pg.b bVar = this.a;
        if (bVar != null) {
            bVar.u();
        }
        pg.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.u();
        }
        pg.b bVar3 = this.b;
        if (bVar3 != null) {
            bVar3.u();
        }
        nh.j jVar = this.i1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof i2) || (drawable instanceof f5)) ? 2 : 0;
        if (this.e.getLayerType() != i10) {
            this.e.setLayerType(i10, null);
            this.e.invalidate();
        }
    }

    public final void g() {
        z zVar = this.B;
        int max = Math.max(0, zVar != null ? (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.C;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.G) {
            max = max2;
        }
        this.b1.a(max > 0, this.g1);
        xd.c cVar = this.a1;
        float f10 = max;
        if ((cVar.g ? cVar.f : cVar.e) != f10) {
            if (this.g1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.r0;
    }

    public z getActionMode() {
        return this.C;
    }

    public float getActionModeFactor() {
        d dVar = this.C;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.i1;
    }

    public k5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public a5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.x;
    }

    public boolean getCastShadows() {
        return this.h0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.F;
    }

    public p9 getSearchAvatarImageView() {
        return this.f;
    }

    public int getShadowAlpha() {
        return this.i0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.r == null || (charSequence = this.x0) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public k5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        k5 k5Var = this.n[0];
        if (k5Var == null) {
            return null;
        }
        return k5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        k5 k5Var = this.n[0];
        if (k5Var != null) {
            return k5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return this.n[0];
    }

    public k5 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.C0;
    }

    public void h(boolean z4) {
        z zVar;
        if (!this.k0 || (zVar = this.B) == null) {
            return;
        }
        zVar.j(z4);
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
            return this.C;
        }
        d dVar = this.C;
        if (dVar != null) {
            removeView(dVar);
            this.C = null;
        }
        this.D = str;
        d dVar2 = new d(this, getContext(), this);
        this.C = dVar2;
        dVar2.setTranslationX(this.L0 ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.C.setGlassMode(this.L0);
        d dVar3 = this.C;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.L0) {
            this.C.setBackgroundColor(j6.v0(j6.w8, this.F0));
        }
        addView(this.C, indexOfChild(this.e));
        this.C.setPadding(0, this.F ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.L;
        layoutParams.gravity = 5;
        this.C.setLayoutParams(layoutParams);
        this.C.setVisibility(4);
        return this.C;
    }

    public final void k() {
        if (this.i1 == null) {
            nh.j jVar = new nh.j(this, getContext(), this.F0, this.K0);
            this.i1 = jVar;
            jVar.setClipChildren(false);
            addView(this.i1);
        }
    }

    public final void l() {
        if (this.s != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.s = k5Var;
        k5Var.setGravity(3);
        this.s.setVisibility(8);
        this.s.setTextColor(j6.v0(j6.B8, this.F0));
        addView(this.s, 0, k7.b6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.f0(this.m0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, k7.b6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.B = zVar2;
        addView(zVar2, 0, k7.b6.e(-2, -1, 5));
        return this.B;
    }

    public final void o() {
        if (this.r != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.r = k5Var;
        k5Var.setGravity(3);
        this.r.setVisibility(8);
        this.r.setTextColor(j6.v0(j6.B8, this.F0));
        addView(this.r, 0, k7.b6.e(-2, -2, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0 = true;
        P();
        if (this.G) {
            int i10 = this.w;
            if (i10 == 0) {
                i10 = this.x;
            }
            if (i10 == 0 || this.L0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0 = false;
        P();
        if (this.G) {
            int i10 = this.x;
            if (i10 == 0 || this.w == 0 || this.L0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.O && !this.f0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = j6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.S = true;
            bw0 bw0Var = this.P;
            k5[] k5VarArr = this.n;
            if (bw0Var == null) {
                this.Q = null;
                this.P = new bw0(0);
                k5VarArr[0].invalidate();
                invalidate();
            } else {
                this.P = null;
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
                this.Q = p00Var;
                k5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.E0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        k5[] k5VarArr;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int currentActionBarHeight;
        int i19 = this.F ? AndroidUtilities.statusBarHeight : 0;
        if (this.U0 != getMeasuredWidth()) {
            this.U0 = getMeasuredWidth();
            d(this.Y0.g);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(this.L0 ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i19, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i19);
            dp = AndroidUtilities.dp(this.L0 ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i20 = dp + this.T0;
        z zVar = this.B;
        if (zVar != null && zVar.getVisibility() != 8) {
            int dp2 = this.B.p() ? AndroidUtilities.dp(this.j0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.B.getMeasuredWidth();
            z zVar2 = this.B;
            zVar2.layout(dp2, i19, zVar2.getMeasuredWidth() + dp2, this.B.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            k5VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            k5 k5Var = k5VarArr[i21];
            if (k5Var != null && k5Var.getVisibility() != 8) {
                boolean z10 = this.v0;
                if (((z10 && i21 == 0) || (!z10 && i21 == 1)) && this.t0 && this.u0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - k5VarArr[i21].getTextHeight()) / 2;
                } else {
                    k5 k5Var2 = this.r;
                    currentActionBarHeight = (k5Var2 == null || k5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - k5VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - k5VarArr[i21].getTextHeight()) / 2);
                }
                k5 k5Var3 = k5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                k5Var3.layout(i20, i22 - k5Var3.getPaddingTop(), k5VarArr[i21].getMeasuredWidth() + i20, k5VarArr[i21].getPaddingBottom() + ((k5VarArr[i21].getTextHeight() + i22) - k5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.i1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.i1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            nh.j jVar = this.i1;
            int i23 = currentActionBarHeight2 + i19;
            jVar.layout(i20, i23, jVar.getMeasuredWidth() + i20, this.i1.getMeasuredHeight() + i23);
        }
        k5 k5Var4 = this.r;
        if (k5Var4 != null && k5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            k5 k5Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            k5Var5.layout(i20, i24, k5Var5.getMeasuredWidth() + i20, this.r.getTextHeight() + i24);
        }
        k5 k5Var6 = this.s;
        if (k5Var6 != null && k5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            k5 k5Var7 = this.s;
            int i26 = dp3 + i19;
            k5Var7.layout(i20, i26, k5Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        p9 p9Var = this.f;
        if (p9Var != null) {
            p9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != this.i1 && childAt != this.r && childAt != this.B && childAt != this.e && childAt != this.s && childAt != this.f) {
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
        k5[] k5VarArr;
        k5 k5Var;
        k5 k5Var2;
        int makeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30);
        int i12 = 1;
        kVar.E = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.C;
        if (dVar != null) {
            dVar.setPadding(0, kVar.F ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        kVar.E = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.F ? AndroidUtilities.statusBarHeight : 0) + kVar.L);
        ImageView imageView = kVar.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), TLObject.FLAG_30), makeMeasureSpec2);
            dp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        z zVar = kVar.B;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (kVar.B.p() && !kVar.k0) {
                kVar.B.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int l10 = kVar.B.l();
                if (kVar.j0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.B.l() + (size - AndroidUtilities.dp(f10)), TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.B.r(-l10);
                }
            } else if (kVar.k0) {
                if (kVar.j0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                makeMeasureSpec = org.telegram.ui.b.d(f10, size, TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.B.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.y) {
                    kVar.B.r(0.0f);
                }
            }
            kVar.B.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i13 = 0;
        while (true) {
            k5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            k5 k5Var3 = k5VarArr[0];
            if ((k5Var3 != null && k5Var3.getVisibility() != 8) || ((k5Var = kVar.r) != null && k5Var.getVisibility() != 8)) {
                z zVar2 = kVar.B;
                int max = Math.max(org.telegram.messenger.y3.B(16.0f, size - (zVar2 != null ? zVar2.getMeasuredWidth() : 0), dp) - kVar.U, 0);
                boolean z4 = kVar.v0;
                int i14 = 20;
                if (((z4 && i13 == 0) || (!z4 && i13 == i12)) && kVar.t0 && kVar.u0) {
                    k5 k5Var4 = k5VarArr[i13];
                    if (kVar.L0) {
                        i14 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    k5Var4.setTextSize(i14);
                } else {
                    k5 k5Var5 = k5VarArr[0];
                    if (k5Var5 == null || k5Var5.getVisibility() == 8 || (k5Var2 = kVar.r) == null || k5Var2.getVisibility() == 8) {
                        k5 k5Var6 = k5VarArr[i13];
                        if (k5Var6 != null && k5Var6.getVisibility() != 8) {
                            k5 k5Var7 = k5VarArr[i13];
                            if (kVar.L0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            k5Var7.setTextSize(i14);
                        }
                        k5 k5Var8 = kVar.r;
                        if (k5Var8 != null && k5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        k5 k5Var9 = kVar.s;
                        if (k5Var9 != null) {
                            k5Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        k5 k5Var10 = k5VarArr[i13];
                        if (k5Var10 != null) {
                            if (kVar.L0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i14 = 18;
                            }
                            k5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        k5 k5Var11 = kVar.s;
                        if (k5Var11 != null) {
                            k5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                k5 k5Var12 = k5VarArr[i13];
                if (k5Var12 != null && k5Var12.getVisibility() != 8) {
                    k5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(k5VarArr[i13].getPaddingBottom() + k5VarArr[i13].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.w0) {
                        CharSequence text = k5VarArr[i13].getText();
                        k5 k5Var13 = k5VarArr[i13];
                        k5Var13.setPivotX(k5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        k5VarArr[i13].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        k5VarArr[i13].setPivotX(0.0f);
                        k5VarArr[i13].setPivotY(0.0f);
                    }
                }
                k5 k5Var14 = kVar.r;
                if (k5Var14 != null && k5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                nh.j jVar = kVar.i1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                k5 k5Var15 = kVar.s;
                if (k5Var15 != null && k5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = 1;
        }
        p9 p9Var = kVar.f;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = kVar.getChildAt(i15);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != kVar.i1 && childAt != kVar.r && childAt != kVar.B && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), TLObject.FLAG_30), 0);
            }
            i15++;
            kVar = this;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.J;
    }

    public final void p(int i10) {
        k5[] k5VarArr = this.n;
        if (k5VarArr[i10] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        k5VarArr[i10] = k5Var;
        k5Var.setGravity(19);
        int i11 = this.s0;
        if (i11 != 0) {
            k5VarArr[i10].setTextColor(i11);
        } else {
            k5VarArr[i10].setTextColor(j6.v0(j6.A8, this.F0));
        }
        k5 k5Var2 = k5VarArr[i10];
        k5Var2.setEmojiColor(k5Var2.getTextColor());
        k5VarArr[i10].setTypeface(AndroidUtilities.bold());
        k5VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        k5VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        k5VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.D0) {
            this.C0.addView(k5VarArr[i10], 0, k7.b6.e(-2, -2, 51));
        } else {
            addView(k5VarArr[i10], 0, k7.b6.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.C;
        if (dVar == null || !this.G) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof w0) {
                ((w0) childAt).n();
            }
        }
        this.G = false;
        g();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.C, (Property<d, Float>) property, 0.0f));
        if (this.N != null) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.N;
                if (i12 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i12];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.N[i12], (Property<View, Float>) property, 1.0f));
                }
                i12++;
            }
        }
        boolean z4 = this.k0;
        k5[] k5VarArr = this.n;
        if (!z4) {
            k5 k5Var = k5VarArr[0];
            if (k5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<k5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.x0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<k5, Float>) property, 1.0f));
            }
        }
        z zVar = this.B;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i13 = this.x;
        if (i13 == 0 || this.L0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.f(i13) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.M = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.R0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i10));
            this.M.playTogether(ofFloat);
        }
        this.M.setDuration(200L);
        this.M.addListener(new e(this, i10));
        this.M.start();
        if (!this.k0) {
            k5 k5Var2 = k5VarArr[0];
            if (k5Var2 != null) {
                k5Var2.setVisibility(0);
            }
            if (this.r != null && !TextUtils.isEmpty(this.x0)) {
                this.r.setVisibility(0);
            }
        }
        z zVar2 = this.B;
        if (zVar2 != null) {
            zVar2.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof i2) {
                ((i2) drawable).c(0.0f, true);
            }
            this.e.setBackgroundDrawable(j6.f0(this.m0, 1, -1));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        return this.C != null && this.G;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.r0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.C;
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

    public void setAddToContainer(boolean z4) {
        this.H = z4;
    }

    public void setAdditionalTextLeft(int i10) {
        this.T0 = i10;
    }

    public void setAllowOverlayTitle(boolean z4) {
        this.V = z4;
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
        if (drawable instanceof i2) {
            i2 i2Var = (i2) drawable;
            i2Var.c(s() ? 1.0f : 0.0f, false);
            i2Var.b(this.p0);
            i2Var.a(this.o0);
        } else if (drawable instanceof f5) {
            f5 f5Var = (f5) drawable;
            f5Var.k = this.x;
            f5Var.j = this.o0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.o0, PorterDuff.Mode.SRC_IN));
        }
        if (this.P0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.o0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        if (this.e == null) {
            m();
        }
        this.e.setVisibility(i10 == 0 ? 8 : 0);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.o0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.x = i10;
        if (!this.H0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                ((f5) drawable).k = i10;
            }
        }
    }

    public void setCastShadows(boolean z4) {
        if (this.h0 != z4 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.h0 = z4;
    }

    public void setChatAvatarContainer(zn znVar) {
        this.O0 = znVar;
    }

    public void setClipContent(boolean z4) {
        this.I = z4;
    }

    public void setDrawBackButton(boolean z4) {
        this.y0 = z4;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(qv0 qv0Var) {
        this.H0 = true;
        this.G0 = qv0Var;
        qv0Var.Q.add(this);
        setBackground(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z4);
        }
        z zVar = this.B;
        if (zVar != null) {
            zVar.setEnabled(z4);
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.setEnabled(z4);
        }
    }

    public void setExtraHeight(int i10) {
        this.L = i10;
        d dVar = this.C;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.L;
            this.C.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z4) {
        this.K = z4;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.f1 = true;
        if (this.d1 != i10) {
            this.d1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.e1 = true;
        if (this.c1 != i10) {
            this.c1 = i10;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.E0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z4) {
        this.J = z4;
    }

    public void setMenuOffsetSuppressed(boolean z4) {
        this.y = z4;
    }

    public void setOccupyStatusBar(boolean z4) {
        this.F = z4;
        d dVar = this.C;
        if (dVar != null) {
            dVar.setPadding(0, z4 ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z4) {
        this.t0 = z4;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.b0 = onClickListener;
        k5[] k5VarArr = this.n;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setRightDrawableOnClick(onClickListener);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setRightDrawableOnClick(this.b0);
        }
    }

    public void setSearchAvatarImageView(p9 p9Var) {
        p9 p9Var2 = this.f;
        if (p9Var2 == p9Var) {
            return;
        }
        if (p9Var2 != null) {
            removeView(p9Var2);
        }
        this.f = p9Var;
        if (p9Var != null) {
            addView(p9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.B;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.X0 != f10) {
            this.X0 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.B.setSearchFieldText(str);
    }

    public void setSearchFilter(tf.e0 e0Var) {
        z zVar = this.B;
        if (zVar != null) {
            zVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.i0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.i0 = i10;
    }

    public void setSkipDrawChild(boolean z4) {
        if (this.W0 != z4) {
            this.W0 = z4;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.r == null) {
            o();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.r.setVisibility((isEmpty || this.k0) ? 8 : 0);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.x0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.r == null) {
            o();
        }
        this.r.setTextColor(i10);
    }

    public void setSupportsHolidayImage(boolean z4) {
        this.O = z4;
        if (z4) {
            this.R = new Paint.FontMetricsInt();
            this.T = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        H(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.g0 = runnable;
        this.e0 = runnable;
    }

    public void setTitleColor(int i10) {
        k5[] k5VarArr = this.n;
        if (k5VarArr[0] == null) {
            p(0);
        }
        this.s0 = i10;
        k5VarArr[0].setTextColor(i10);
        k5VarArr[0].setEmojiColor(i10);
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.U = i10;
    }

    public void setTitleScrollNonFitText(boolean z4) {
        this.n[0].setScrollNonFitText(z4);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.I) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.C == null || !this.G) {
            return false;
        }
        String str2 = this.D;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean u() {
        return false;
    }

    public void v(boolean z4) {
        Property property;
        this.k0 = z4;
        g();
        AnimatorSet animatorSet = this.S0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.S0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            k5 k5Var = this.n[0];
            if (k5Var != null) {
                arrayList.add(k5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.x0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z4 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, z4 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 1));
        this.S0.playTogether(ofFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f10 = 0.95f;
            if (!z4) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.S0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z4 ? 0.0f : 1.0f));
            this.S0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z4 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.S0;
            if (!z4) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10));
            i10++;
        }
        p9 p9Var = this.f;
        if (p9Var != null) {
            p9Var.setVisibility(0);
            this.S0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<p9, Float>) property, z4 ? 1.0f : 0.0f));
        }
        this.w0 = true;
        requestLayout();
        this.S0.addListener(new f(this, arrayList, z4, u10));
        this.S0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                f5 f5Var = (f5) drawable;
                f5Var.h = true;
                f5Var.a(z4 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void w() {
        h5 h5Var;
        z zVar = this.B;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D && (h5Var = w0Var.E) != null) {
                    h5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.B;
        if (zVar == null || str == null) {
            return;
        }
        boolean z4 = this.k0;
        boolean z10 = !z4;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D) {
                    if (!z4) {
                        zVar.b.v(w0Var.L(z10));
                    }
                    w0Var.H(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z4, int i10, int i11) {
        this.l1 = i10;
        this.m1 = i11;
        org.telegram.messenger.voip.b bVar = new org.telegram.messenger.voip.b(9, this, recyclerView);
        recyclerView.j(new eg.f2(bVar, 13));
        this.k1 = z4;
        if (this.j1) {
            bVar.run();
            return;
        }
        this.j1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.n1 = !canScrollVertically;
        this.o1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public void setAdaptiveBackground(eo0 eo0Var) {
        int i10 = j6.a7;
        int i11 = j6.s8;
        this.l1 = i10;
        this.m1 = i11;
        b();
        org.telegram.messenger.voip.b bVar = new org.telegram.messenger.voip.b(8, this, eo0Var);
        eo0Var.f.add(bVar);
        if (this.j1) {
            bVar.run();
            return;
        }
        this.j1 = true;
        boolean canScrollVertically = eo0Var.canScrollVertically(-1);
        this.n1 = !canScrollVertically;
        this.o1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
