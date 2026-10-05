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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.hz0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements le.d, y5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public ai.w5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final d6 J0;
    public boolean K;
    public mw0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final com.google.firebase.messaging.m O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public xw0 S;
    public ho S0;
    public s00 T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public boolean U0;
    public boolean V;
    public Runnable V0;
    public Rect W;
    public hz0 W0;
    public AnimatorSet X0;
    public int Y0;
    public int Z0;
    public ch.d a;
    public int a0;
    public boolean a1;
    public ch.d b;
    public boolean b0;
    public boolean b1;
    public ch.d c;
    public CharSequence c0;
    public float c1;
    public final y4 d;
    public Drawable d0;
    public final le.e d1;
    public ImageView e;
    public View.OnClickListener e0;
    public final le.b e1;
    public w9 f;
    public String f0;
    public final le.e f1;
    public final Object[] g0;
    public final le.b g1;
    public Drawable h;
    public Runnable h0;
    public int h1;
    public boolean i0;
    public int i1;
    public Runnable j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public int l0;
    public boolean l1;
    public boolean m0;
    public boolean m1;
    public final i5[] n;
    public boolean n0;
    public int n1;
    public float o0;
    public ai.s o1;
    public int p0;
    public boolean p1;
    public int q0;
    public int q1;
    public i5 r;
    public int r0;
    public int r1;
    public i5 s;
    public int s0;
    public boolean s1;
    public n2 t0;
    public float t1;
    public j u0;
    public ValueAnimator u1;
    public View v;
    public int v0;
    public int w;
    public boolean w0;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public k(Context context, d6 d6Var) {
        super(context);
        this.d = y4.a;
        this.n = new i5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = 255;
        this.v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new com.google.firebase.messaging.m(this);
        tr trVar = tr.h;
        this.d1 = new le.e(0, this, trVar, 380L);
        this.e1 = new le.b(0, this, trVar, 380L, false);
        this.f1 = new le.e(0, this, trVar, 320L);
        this.g1 = new le.b(0, this, trVar, 320L, false);
        this.n1 = 255;
        this.s1 = true;
        this.t1 = 1.0f;
        this.J0 = d6Var;
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

    public void A(int i10, boolean z10) {
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
                } else if (drawable2 instanceof d5) {
                    ((d5) drawable2).j = i10;
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
        if (imageView3 == null || !this.U0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public final void B(int i10, boolean z10) {
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

    public final void C(int i10, boolean z10, boolean z11) {
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

    public final void D(int i10, boolean z10) {
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

    public final void E(int i10, boolean z10) {
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

    public final void F(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        i5[] i5VarArr = this.n;
        if (charSequence != null && i5VarArr[0] == null) {
            p(0);
        }
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            i5 i5Var2 = i5VarArr[0];
            this.c0 = charSequence;
            i5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            i5 i5Var3 = i5VarArr[0];
            this.d0 = o5Var;
            i5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(i5VarArr[0]);
                }
            }
            i5VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void G(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        i5[] i5VarArr = this.n;
        if (i5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            bi.q(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            if (i5Var.getParent() != null) {
                ((ViewGroup) i5VarArr[1].getParent()).removeView(i5VarArr[1]);
            }
            i5VarArr[1] = null;
        }
        i5VarArr[1] = i5VarArr[0];
        i5VarArr[0] = null;
        setTitle(charSequence);
        this.y0 = z10;
        i5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            i5 i5Var2 = i5VarArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z10) {
                dp = -dp;
            }
            i5Var2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = i5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = i5VarArr[1].animate().alpha(0.0f);
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

    public final void H(String str, int i10, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        i5 i5Var;
        int indexOf;
        if (!this.b0 || this.t0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.g0;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = runnable;
        if (this.a1) {
            return;
        }
        String str2 = this.f0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.f0 = str;
            if (this.o1 != null) {
                this.o1.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i10) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            com.google.firebase.messaging.m mVar = this.O0;
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
            i5[] i5VarArr = this.n;
            if ((charSequence == null || i5VarArr[0] != null) && getMeasuredWidth() != 0 && ((i5Var = i5VarArr[0]) == null || i5Var.getVisibility() == 0)) {
                i5 i5Var2 = i5VarArr[0];
                if (i5Var2 != null) {
                    i5Var2.animate().cancel();
                    i5 i5Var3 = i5VarArr[1];
                    if (i5Var3 != null) {
                        i5Var3.animate().cancel();
                    }
                    if (i5VarArr[1] == null) {
                        p(1);
                    }
                    i5VarArr[1].k(charSequence);
                    i5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    i5VarArr[1].i(drawable);
                    i5VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.o5) {
                        ((org.telegram.ui.Components.o5) drawable).l(i5VarArr[1]);
                    }
                    if (z10) {
                        mVar.c(i5VarArr[1]);
                    }
                    this.a1 = true;
                    i5 i5Var4 = i5VarArr[1];
                    i5VarArr[1] = i5VarArr[0];
                    i5VarArr[0] = i5Var4;
                    i5Var4.setAlpha(0.0f);
                    i5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    i5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = i5VarArr[1].animate().alpha(0.0f);
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
                    i5VarArr[0].invalidate();
                    invalidate();
                }
                i5VarArr[0].k(charSequence);
                i5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                i5VarArr[0].i(drawable);
                i5VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(i5VarArr[0]);
                }
                if (z10) {
                    mVar.c(i5VarArr[0]);
                } else {
                    mVar.s(i5VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void I() {
        this.G0 = true;
        if (this.F0 == null) {
            ai.w5 w5Var = new ai.w5(getContext(), 5);
            this.F0 = w5Var;
            addView(w5Var);
        }
    }

    public final void J(ah.c cVar, dh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        ch.d c10 = cVar.c(this, null, false);
        c10.w(eVar);
        c10.x(AndroidUtilities.dp(6.0f));
        this.a = c10;
        if (z10) {
            c10.z(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.y(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.w(eVar);
        c11.y(AndroidUtilities.dp(23.0f));
        c11.x(AndroidUtilities.dp(6.0f));
        this.b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.w(eVar);
        c12.y(AndroidUtilities.dp(23.0f));
        c12.x(AndroidUtilities.dp(6.0f));
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

    public boolean K(View view) {
        if (this.L) {
            i5[] i5VarArr = this.n;
            if (view == i5VarArr[0] || view == i5VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void L(View[] viewArr, boolean[] zArr) {
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
                i5 i5Var = this.n[0];
                if (i5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<i5, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<i5, Float>) property, 0.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 0.0f));
            }
        }
        int i10 = this.w;
        if (i10 == 0) {
            i10 = this.x;
        }
        if (i10 == 0 || this.P0) {
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
        if (this.W0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, 3));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new ai.z(10, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g2) {
                ((g2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(i6.f0(this.q0, 1, -1));
        }
    }

    public final void M() {
        boolean z10 = this.C0 && this.D0;
        if (this.E0 != z10) {
            this.E0 = z10;
            com.google.firebase.messaging.m mVar = this.O0;
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

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        invalidate();
    }

    public final void b() {
        if (this.p1) {
            float f7 = this.t1;
            int i10 = this.r1;
            d6 d6Var = this.J0;
            int v02 = i10 == -1 ? 0 : i6.v0(i10, d6Var);
            int i11 = this.q1;
            int v03 = i11 == -1 ? 0 : i6.v0(i11, d6Var);
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.t1) * 255.0f));
            if (this.L0) {
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
        transitionSet.setInterpolator((TimeInterpolator) tr.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void d(boolean z10) {
        ho hoVar = this.S0;
        if (hoVar == null) {
            return;
        }
        co coVar = hoVar.e;
        boolean z11 = coVar != null && coVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.S0.getVisualWidth());
        le.e eVar = this.d1;
        if (z10) {
            float f7 = min;
            if ((eVar.g ? eVar.f : eVar.e) != f7) {
                eVar.a(f7);
            }
        } else {
            eVar.c(min);
        }
        this.e1.a(z11, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0211  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        ch.d dVar;
        ch.d dVar2;
        i5[] i5VarArr;
        i5 i5Var;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i10 = this.j1 ? this.h1 : (int) this.f1.e;
        if (this.k1) {
            i10 = Math.max((int) ((1.0f - this.c1) * this.i1), i10);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i11 = dp * 2;
        int i12 = height + dp2 + i11;
        ch.d dVar3 = this.a;
        le.b bVar = this.g1;
        if (dVar3 == null || this.Q0) {
            f7 = 1.0f;
        } else {
            if (!this.H0 || (i5Var = (i5VarArr = this.n)[0]) == null || i5Var.getVisibility() != 0) {
                f7 = 1.0f;
                int i13 = ((this.j1 || this.k1) ? i10 > 0 ? dp : 0 : (int) (dp * bVar.e)) + i10;
                int i14 = dp + dp2;
                int max = Math.max(i13, i14);
                ho hoVar = this.S0;
                le.b bVar2 = this.e1;
                int lerp = AndroidUtilities.lerp(i13, max, hoVar == null ? 0.0f : 1.0f - bVar2.e);
                int lerp2 = AndroidUtilities.lerp(z10 ? i14 : 0, i14, this.S0 == null ? 0.0f : 1.0f - bVar2.e);
                int width = getWidth() - lerp;
                int i15 = width - lerp2;
                if (this.S0 != null) {
                    int lerp3 = AndroidUtilities.lerp(Math.min(i15, ((int) this.d1.e) + i11), i15, Math.max(this.c1, actionModeFactor));
                    lerp2 = ((width + lerp2) - lerp3) / 2;
                    width = lerp2 + lerp3;
                    float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.S0.getLayoutParams()).leftMargin) - this.S0.getLeftPadding()) + dp;
                    this.S0.setTranslationX(dp3);
                    this.S0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
                }
                this.a.setBounds(lerp2, height, width, i12);
                if (!this.T0) {
                    this.a.draw(canvas);
                }
                dVar = this.b;
                if (dVar != null && z10) {
                    dVar.setBounds(0, height, dp2 + i11, i12);
                    this.b.draw(canvas);
                }
                dVar2 = this.c;
                if (dVar2 != null && i10 > 0 && !this.Q0 && !this.m1) {
                    dVar2.setBounds((getWidth() - Math.max(dp2, i10)) - i11, height, getWidth(), i12);
                    this.c.setAlpha(!this.j1 ? 255 : (int) (bVar.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.L0 && this.x != 0) {
                    this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i16 = this.x;
                    Paint paint = this.M0;
                    paint.setColor(i16);
                    if (this.p1) {
                        this.K0.J(canvas, getY(), this.N0, paint, true);
                    } else {
                        mw0 mw0Var = this.K0;
                        float y3 = getY();
                        float f10 = f7 - this.t1;
                        mw0Var.getClass();
                        mw0Var.K(canvas, y3, this.N0, paint, true, AndroidUtilities.lerp(255, Color.alpha(i6.v0((mw0.G() && SharedConfig.getDevicePerformanceClass() == 2) ? i6.xf : i6.yf, mw0Var.getResourceProvider())), f10));
                    }
                }
                this.l1 = true;
                if (this.b1) {
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            }
            f7 = 1.0f;
            int dp4 = AndroidUtilities.dp(48.0f) + ((int) Math.ceil(i5VarArr[0].getTextWidth())) + i11;
            int round = Math.round(i5VarArr[0].getTranslationX()) + ((getWidth() - dp4) / 2);
            this.a.setBounds(round, height, dp4 + round, i12);
            if (!this.T0) {
                this.a.draw(canvas);
            }
        }
        dVar = this.b;
        if (dVar != null) {
            dVar.setBounds(0, height, dp2 + i11, i12);
            this.b.draw(canvas);
        }
        dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.setBounds((getWidth() - Math.max(dp2, i10)) - i11, height, getWidth(), i12);
            this.c.setAlpha(!this.j1 ? 255 : (int) (bVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.L0) {
            this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i162 = this.x;
            Paint paint2 = this.M0;
            paint2.setColor(i162);
            if (this.p1) {
            }
        }
        this.l1 = true;
        if (this.b1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View q6 = q(this, f7, f10, this.S0);
            if (q6 == null) {
                q6 = q(this, f7, f10, null);
            }
            ch.d dVar = this.a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x10, y3);
            if (q6 != null && q6 != this.S0) {
                ch.d dVar2 = this.b;
                boolean z11 = z10 | (dVar2 != null && dVar2.getBounds().contains(x10, y3));
                ch.d dVar3 = this.c;
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
        r00 r00Var;
        n2 n2Var = this.t0;
        if (n2Var != null && n2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        if (this.B0 && view == this.e) {
            return true;
        }
        boolean K = K(view);
        if (K) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.R && !this.i0 && !LocaleController.isRTL) {
            i5[] i5VarArr = this.n;
            if ((view == i5VarArr[0] || view == i5VarArr[1] || (view == this.F0 && this.G0)) && (y02 = i6.y0()) != null) {
                i5 i5Var = view == this.F0 ? i5VarArr[0] : (i5) view;
                if (i5Var != null && i5Var.getVisibility() == 0 && (i5Var.getText() instanceof String)) {
                    TextPaint textPaint = i5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) i5Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (y02.getIntrinsicWidth() + i6.D1)) / 2) + i5Var.getTextStartX() + i6.D1;
                    f7 = 255.0f;
                    int textStartY = i5Var.getTextStartY() + i6.E1 + ((int) Math.ceil((i5Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    y02.setBounds(width, textStartY - y02.getIntrinsicHeight(), y02.getIntrinsicWidth() + width, textStartY);
                    y02.setAlpha((int) (i5Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    y02.draw(canvas);
                    if (this.a1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f7 = 255.0f;
                }
                if (i6.G1) {
                    if (this.S == null) {
                        this.S = new xw0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                xw0 xw0Var = this.S;
                if (xw0Var != null) {
                    xw0Var.b(canvas, this);
                } else {
                    s00 s00Var = this.T;
                    if (s00Var != null) {
                        ArrayList arrayList = s00Var.d;
                        ArrayList arrayList2 = s00Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                r00 r00Var2 = (r00) arrayList2.get(i10);
                                Paint paint = r00Var2.k.a;
                                paint.setColor(r00Var2.j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * r00Var2.i);
                                paint.setAlpha((int) (r00Var2.f * f7));
                                canvas.drawPoint(r00Var2.a, r00Var2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i11 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.q.B(20.0f, getMeasuredHeight(), i11)) + i11;
                                    int nextInt = Utilities.random.nextInt(4);
                                    int i12 = nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? -5752 : -15088582 : -207021 : -843755 : -13357350;
                                    int i13 = 0;
                                    for (int i14 = 8; i13 < i14; i14 = 8) {
                                        float f10 = nextFloat;
                                        double nextInt2 = (Utilities.random.nextInt(270) - 225) * 0.017453292519943295d;
                                        float cos = (float) Math.cos(nextInt2);
                                        float sin = (float) Math.sin(nextInt2);
                                        if (arrayList.isEmpty()) {
                                            r00Var = new r00(s00Var);
                                        } else {
                                            r00Var = (r00) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        r00Var.a = f10;
                                        r00Var.b = nextFloat2;
                                        r00Var.c = cos * 1.5f;
                                        r00Var.d = sin;
                                        r00Var.j = i12;
                                        r00Var.f = 1.0f;
                                        r00Var.h = 0.0f;
                                        r00Var.i = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                                        r00Var.g = Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                        r00Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                                        arrayList2.add(r00Var);
                                        i13++;
                                        nextFloat = f10;
                                    }
                                }
                            }
                            int i15 = 0;
                            long currentTimeMillis = System.currentTimeMillis();
                            long min = Math.min(17L, currentTimeMillis - s00Var.b);
                            int size2 = arrayList2.size();
                            while (i15 < size2) {
                                r00 r00Var3 = (r00) arrayList2.get(i15);
                                float f11 = r00Var3.h;
                                float f12 = r00Var3.g;
                                if (f11 >= f12) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(r00Var3);
                                    }
                                    arrayList2.remove(i15);
                                    i15--;
                                    size2--;
                                    z11 = K;
                                } else {
                                    r00Var3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f11 / f12);
                                    float f13 = r00Var3.a;
                                    float f14 = r00Var3.c;
                                    float f15 = r00Var3.e;
                                    float f16 = min;
                                    z11 = K;
                                    r00Var3.a = a4.a.B(f14 * f15, f16, 500.0f, f13);
                                    float f17 = r00Var3.b;
                                    float f18 = r00Var3.d;
                                    r00Var3.b = (((f15 * f18) * f16) / 500.0f) + f17;
                                    r00Var3.d = (f16 / 100.0f) + f18;
                                    r00Var3.h += f16;
                                }
                                i15++;
                                K = z11;
                            }
                            z10 = K;
                            s00Var.b = currentTimeMillis;
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
        z10 = K;
        if (z10) {
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        b();
        ch.d dVar = this.a;
        if (dVar != null) {
            dVar.k();
        }
        ch.d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.k();
        }
        ch.d dVar3 = this.b;
        if (dVar3 != null) {
            dVar3.k();
        }
        ai.s sVar = this.o1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof g2) || (drawable instanceof d5)) ? 2 : 0;
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
        this.g1.a(max > 0, this.l1);
        le.e eVar = this.f1;
        float f7 = max;
        if ((eVar.g ? eVar.f : eVar.e) != f7) {
            if (this.l1) {
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
        return this.o1;
    }

    public i5 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public y4 getBackButtonState() {
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

    public int getExtraHeight() {
        return this.O;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.O;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
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

    public i5 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        i5 i5Var = this.n[0];
        if (i5Var == null) {
            return null;
        }
        return i5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        i5 i5Var = this.n[0];
        if (i5Var != null) {
            return i5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public i5 getTitleTextView() {
        return this.n[0];
    }

    public i5 getTitleTextView2() {
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
        dVar2.setTranslationX(this.P0 ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            this.F.setBackgroundColor(i6.v0(i6.w8, this.J0));
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
        if (this.o1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.J0, this.O0);
            this.o1 = sVar;
            sVar.setClipChildren(false);
            addView(this.o1);
        }
    }

    public final void l() {
        if (this.s != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.s = i5Var;
        i5Var.setGravity(3);
        this.s.setVisibility(8);
        this.s.setTextColor(i6.v0(i6.B8, this.J0));
        addView(this.s, 0, w7.z5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(i6.f0(this.p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.z5.e(54, 54, 51));
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
        addView(zVar2, 0, w7.z5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.r != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.r = i5Var;
        i5Var.setGravity(3);
        this.r.setVisibility(8);
        this.r.setTextColor(i6.v0(i6.B8, this.J0));
        addView(this.r, 0, w7.z5.e(-2, -2, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        M();
        if (this.J) {
            int i10 = this.w;
            if (i10 == 0) {
                i10 = this.x;
            }
            if (i10 == 0 || this.P0) {
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
        M();
        if (this.J) {
            int i10 = this.x;
            if (i10 == 0 || this.w == 0 || this.P0) {
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
        if (this.R && !this.i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = i6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            xw0 xw0Var = this.S;
            i5[] i5VarArr = this.n;
            if (xw0Var == null) {
                this.T = null;
                this.S = new xw0(0);
                i5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                s00 s00Var = new s00();
                s00Var.c = new ArrayList();
                s00Var.d = new ArrayList();
                Paint paint = new Paint(1);
                s00Var.a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(i6.w0(null, i6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    s00Var.d.add(new r00(s00Var));
                }
                this.T = s00Var;
                i5VarArr[0].invalidate();
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        i5[] i5VarArr;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int currentActionBarHeight;
        int i19 = this.I ? AndroidUtilities.statusBarHeight : 0;
        if (this.Z0 != getMeasuredWidth()) {
            this.Z0 = getMeasuredWidth();
            d(this.d1.g);
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 8) {
            dp = AndroidUtilities.dp(this.P0 ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.e;
            imageView2.layout(0, i19, imageView2.getMeasuredWidth(), this.e.getMeasuredHeight() + i19);
            dp = AndroidUtilities.dp(this.P0 ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i20 = dp + this.Y0;
        z zVar = this.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            int dp2 = this.E.p() ? AndroidUtilities.dp(this.m0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            z zVar2 = this.E;
            zVar2.layout(dp2, i19, zVar2.getMeasuredWidth() + dp2, this.E.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            i5VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            i5 i5Var = i5VarArr[i21];
            if (i5Var != null && i5Var.getVisibility() != 8) {
                boolean z11 = this.y0;
                if (((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - i5VarArr[i21].getTextHeight()) / 2;
                } else {
                    i5 i5Var2 = this.r;
                    currentActionBarHeight = (i5Var2 == null || i5Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - i5VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - i5VarArr[i21].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.H0 ? (getMeasuredWidth() - i5VarArr[i21].getMeasuredWidth()) / 2 : i20;
                i5 i5Var3 = i5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                i5Var3.layout(measuredWidth2, i22 - i5Var3.getPaddingTop(), i5VarArr[i21].getMeasuredWidth() + measuredWidth2, i5VarArr[i21].getPaddingBottom() + ((i5VarArr[i21].getTextHeight() + i22) - i5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.o1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.o1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            ai.s sVar = this.o1;
            int i23 = currentActionBarHeight2 + i19;
            sVar.layout(i20, i23, sVar.getMeasuredWidth() + i20, this.o1.getMeasuredHeight() + i23);
        }
        i5 i5Var4 = this.r;
        if (i5Var4 != null && i5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            int measuredWidth3 = this.H0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i20;
            i5 i5Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            i5Var5.layout(measuredWidth3, i24, i5Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i24);
        }
        i5 i5Var6 = this.s;
        if (i5Var6 != null && i5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            i5 i5Var7 = this.s;
            int i26 = dp3 + i19;
            i5Var7.layout(i20, i26, i5Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        w9 w9Var = this.f;
        if (w9Var != null) {
            w9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != i5VarArr[0] && childAt != i5VarArr[1] && childAt != this.o1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth4 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i28 = layoutParams.gravity;
                if (i28 == -1) {
                    i28 = 51;
                }
                int i29 = i28 & 112;
                int i30 = i28 & 7;
                if (i30 == 1) {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth4) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i30 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i29 != 16) {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i29 != 80) {
                        i18 = layoutParams.topMargin;
                        childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
                    } else {
                        i16 = (i13 - i11) - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
                } else {
                    measuredWidth = getMeasuredWidth() - measuredWidth4;
                    i14 = layoutParams.rightMargin;
                }
                i15 = measuredWidth - i14;
                if (i29 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth4 + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int dp;
        i5[] i5VarArr;
        i5 i5Var;
        i5 i5Var2;
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
                makeMeasureSpec = bi.c(f7, size, TLObject.FLAG_30);
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
            i5VarArr = kVar.n;
            if (i13 >= 2) {
                break;
            }
            i5 i5Var3 = i5VarArr[0];
            if ((i5Var3 != null && i5Var3.getVisibility() != 8) || ((i5Var = kVar.r) != null && i5Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                int measuredWidth = zVar2 != null ? zVar2.getMeasuredWidth() : 0;
                int max = Math.max(kVar.H0 ? size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + measuredWidth) + kVar.a0) * 2) : org.telegram.messenger.q.B(16.0f, size - measuredWidth, dp) - kVar.a0, 0);
                boolean z10 = kVar.y0;
                int i14 = 20;
                if (((z10 && i13 == 0) || (!z10 && i13 == i12)) && kVar.w0 && kVar.x0) {
                    i5 i5Var4 = i5VarArr[i13];
                    if (kVar.P0) {
                        i14 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    i5Var4.setTextSize(i14);
                } else {
                    i5 i5Var5 = i5VarArr[0];
                    if (i5Var5 == null || i5Var5.getVisibility() == 8 || (i5Var2 = kVar.r) == null || i5Var2.getVisibility() == 8) {
                        i5 i5Var6 = i5VarArr[i13];
                        if (i5Var6 != null && i5Var6.getVisibility() != 8) {
                            i5 i5Var7 = i5VarArr[i13];
                            if (kVar.P0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            i5Var7.setTextSize(i14);
                        }
                        i5 i5Var8 = kVar.r;
                        if (i5Var8 != null && i5Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        i5 i5Var9 = kVar.s;
                        if (i5Var9 != null) {
                            i5Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        i5 i5Var10 = i5VarArr[i13];
                        if (i5Var10 != null) {
                            if (kVar.P0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i14 = 18;
                            }
                            i5Var10.setTextSize(i14);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        i5 i5Var11 = kVar.s;
                        if (i5Var11 != null) {
                            i5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                i5 i5Var12 = i5VarArr[i13];
                if (i5Var12 != null && i5Var12.getVisibility() != 8) {
                    i5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i5VarArr[i13].getPaddingBottom() + i5VarArr[i13].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.z0) {
                        CharSequence text = i5VarArr[i13].getText();
                        i5 i5Var13 = i5VarArr[i13];
                        i5Var13.setPivotX(i5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        i5VarArr[i13].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        i5VarArr[i13].setPivotX(0.0f);
                        i5VarArr[i13].setPivotY(0.0f);
                    }
                }
                i5 i5Var14 = kVar.r;
                if (i5Var14 != null && i5Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                ai.s sVar = kVar.o1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                i5 i5Var15 = kVar.s;
                if (i5Var15 != null && i5Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i13++;
            i12 = 1;
        }
        w9 w9Var = kVar.f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = kVar.getChildAt(i15);
            if (childAt.getVisibility() != 8 && childAt != i5VarArr[0] && childAt != i5VarArr[1] && childAt != kVar.o1 && childAt != kVar.r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
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
        i5[] i5VarArr = this.n;
        if (i5VarArr[i10] != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        i5VarArr[i10] = i5Var;
        i5Var.setGravity(this.H0 ? 17 : 19);
        int i11 = this.v0;
        if (i11 != 0) {
            i5VarArr[i10].setTextColor(i11);
        } else {
            i5VarArr[i10].setTextColor(i6.v0(i6.A8, this.J0));
        }
        i5 i5Var2 = i5VarArr[i10];
        i5Var2.setEmojiColor(i5Var2.getTextColor());
        i5VarArr[i10].setTypeface(AndroidUtilities.bold());
        i5VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        i5VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        i5VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(i5VarArr[i10], 0, w7.z5.e(-2, -2, 51));
        } else {
            addView(i5VarArr[i10], 0, w7.z5.e(-2, -2, 51));
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
        i5[] i5VarArr = this.n;
        if (!z10) {
            i5 i5Var = i5VarArr[0];
            if (i5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<i5, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<i5, Float>) property, 1.0f));
            }
        }
        z zVar = this.E;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i14 = this.x;
        if (i14 == 0 || this.P0) {
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
        if (this.W0 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, i12));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i10));
        this.P.start();
        if (!this.n0) {
            i5 i5Var2 = i5VarArr[0];
            if (i5Var2 != null) {
                i5Var2.setVisibility(0);
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
            this.e.setBackgroundDrawable(i6.f0(this.p0, 1, -1));
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
        y(recyclerView, i6.a7, i6.s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.Y0 = i10;
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
        } else if (drawable instanceof d5) {
            d5 d5Var = (d5) drawable;
            d5Var.k = this.x;
            d5Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.U0) {
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
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof d5) {
                ((d5) drawable).k = i10;
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

    public void setCenterTitleAndGlass(boolean z10) {
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        i5[] i5VarArr = this.n;
        int length = i5VarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            i5 i5Var = i5VarArr[i10];
            if (i5Var != null) {
                i5Var.setGravity(z10 ? 17 : 19);
            }
            i10++;
        }
        i5 i5Var2 = this.r;
        if (i5Var2 != null) {
            i5Var2.setGravity(z10 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(ho hoVar) {
        this.S0 = hoVar;
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

    public void setDrawBlurBackground(mw0 mw0Var) {
        this.L0 = true;
        this.K0 = mw0Var;
        mw0Var.T.add(this);
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
        this.k1 = true;
        if (this.i1 != i10) {
            this.i1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.j1 = true;
        if (this.h1 != i10) {
            this.h1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.n1 != i10) {
            this.n1 = i10;
            invalidate();
        }
        ch.d dVar = this.a;
        if (dVar == null || dVar.b == i10) {
            return;
        }
        dVar.setAlpha(i10);
        invalidate();
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.I0 = onTouchListener;
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
        this.V0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
        i5[] i5VarArr = this.n;
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setRightDrawableOnClick(onClickListener);
        }
        i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f;
        if (w9Var2 == w9Var) {
            return;
        }
        if (w9Var2 != null) {
            removeView(w9Var2);
        }
        this.f = w9Var;
        if (w9Var != null) {
            addView(w9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.c1 != f7) {
            this.c1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(gg.q0 q0Var) {
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
        if (this.b1 != z10) {
            this.b1 = z10;
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
        F(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.j0 = runnable;
        this.h0 = runnable;
    }

    public void setTitleColor(int i10) {
        i5[] i5VarArr = this.n;
        if (i5VarArr[0] == null) {
            p(0);
        }
        this.v0 = i10;
        i5VarArr[0].setTextColor(i10);
        i5VarArr[0].setEmojiColor(i10);
        i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            i5Var.setTextColor(i10);
            i5VarArr[1].setEmojiColor(i10);
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
        AnimatorSet animatorSet = this.X0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            i5 i5Var = this.n[0];
            if (i5Var != null) {
                arrayList.add(i5Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 2));
        this.X0.playTogether(ofFloat);
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
            this.X0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.X0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.X0;
            if (!z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f7));
            i10++;
        }
        w9 w9Var = this.f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            this.X0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<w9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.X0.addListener(new f(this, arrayList, z10, u10));
        this.X0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof d5) {
                d5 d5Var = (d5) drawable;
                d5Var.h = true;
                d5Var.a(z10 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void w() {
        f5 f5Var;
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.G && (f5Var = v0Var.H) != null) {
                    f5Var.p(v0Var.e);
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

    public final void y(RecyclerView recyclerView, int i10, int i11) {
        this.q1 = i10;
        this.r1 = i11;
        ki.h0 h0Var = new ki.h0(25, this, recyclerView);
        recyclerView.j(new ai.r(h0Var, 13));
        if (this.p1) {
            h0Var.run();
            return;
        }
        this.p1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.s1 = !canScrollVertically;
        this.t1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public final void z(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(i6.f0(i10, 1, -1));
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
            imageView2.setBackgroundDrawable(i6.f0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void setAdaptiveBackground(so0 so0Var) {
        int i10 = i6.a7;
        int i11 = i6.s8;
        this.q1 = i10;
        this.r1 = i11;
        b();
        ki.h0 h0Var = new ki.h0(24, this, so0Var);
        so0Var.L.add(h0Var);
        if (this.p1) {
            h0Var.run();
            return;
        }
        this.p1 = true;
        boolean canScrollVertically = so0Var.canScrollVertically(-1);
        this.s1 = !canScrollVertically;
        this.t1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
