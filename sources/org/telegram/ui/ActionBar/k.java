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
import bi.ce;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y9;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class k extends FrameLayout implements oe.d, p6 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public di.i4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final u6 J0;
    public boolean K;
    public ww0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final c2.b O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public hx0 S;
    public po S0;
    public x00 T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public boolean U0;
    public boolean V;
    public Runnable V0;
    public Rect W;
    public oy0 W0;
    public AnimatorSet X0;
    public int Y0;
    public int Z0;
    public eh.d a;
    public int a0;
    public boolean a1;
    public eh.d b;
    public boolean b0;
    public boolean b1;
    public eh.d c;
    public CharSequence c0;
    public float c1;
    public final e5 d;
    public Drawable d0;
    public final oe.e d1;
    public ImageView e;
    public View.OnClickListener e0;
    public final oe.b e1;
    public y9 f;
    public String f0;
    public final oe.e f1;
    public final Object[] g0;
    public final oe.b g1;
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
    public final b6[] n;
    public boolean n0;
    public boolean n1;
    public float o0;
    public int o1;
    public int p0;
    public di.k p1;
    public int q0;
    public boolean q1;
    public b6 r;
    public int r0;
    public boolean r1;
    public b6 s;
    public int s0;
    public int s1;
    public r2 t0;
    public int t1;
    public j u0;
    public boolean u1;
    public View v;
    public int v0;
    public float v1;
    public int w;
    public boolean w0;
    public ValueAnimator w1;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public k(Context context, u6 u6Var) {
        super(context);
        this.d = e5.a;
        this.n = new b6[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.g0 = new Object[3];
        this.k0 = true;
        this.l0 = 255;
        this.v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new c2.b(this);
        ds dsVar = ds.h;
        this.d1 = new oe.e(0, this, dsVar, 380L);
        this.e1 = new oe.b(0, this, dsVar, 380L, false);
        this.f1 = new oe.e(0, this, dsVar, 320L);
        this.g1 = new oe.b(0, this, dsVar, 320L, false);
        this.n1 = true;
        this.o1 = 255;
        this.u1 = true;
        this.v1 = 1.0f;
        this.J0 = u6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public static View o(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i10, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).H(i10);
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
            if (childAt2 instanceof w0) {
                ((w0) childAt2).H(i10);
            }
            i11++;
        }
    }

    public final void B(int i10, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).O(i10, z10);
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
            if (childAt2 instanceof w0) {
                ((w0) childAt2).O(i10, z10);
            }
            i11++;
        }
    }

    public final void C(int i10, boolean z10) {
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

    public final void D(int i10, boolean z10) {
        z zVar = this.E;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.u()) {
                        if (z10) {
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

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public final void F(CharSequence charSequence, org.telegram.ui.Components.r5 r5Var) {
        b6[] b6VarArr = this.n;
        if (charSequence != null && b6VarArr[0] == null) {
            n(0);
        }
        b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            b6Var.setVisibility((charSequence == null || this.n0) ? 4 : 0);
            b6 b6Var2 = b6VarArr[0];
            this.c0 = charSequence;
            b6Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.d0;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable).l(null);
                }
            }
            b6 b6Var3 = b6VarArr[0];
            this.d0 = r5Var;
            b6Var3.i(r5Var);
            if (this.C0) {
                Drawable drawable2 = this.d0;
                if (drawable2 instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable2).l(b6VarArr[0]);
                }
            }
            b6VarArr[0].setRightDrawableOnClick(this.e0);
        }
        this.y0 = false;
    }

    public final void G(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        b6[] b6VarArr = this.n;
        if (b6VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.w0 && !TextUtils.isEmpty(this.A0);
        if (z11) {
            if (this.r.getVisibility() != 0) {
                this.r.setVisibility(0);
                this.r.setAlpha(0.0f);
            }
            wh.p(this.r.animate(), z10 ? 0.0f : 1.0f, 220L);
        }
        b6 b6Var = b6VarArr[1];
        if (b6Var != null) {
            if (b6Var.getParent() != null) {
                ((ViewGroup) b6VarArr[1].getParent()).removeView(b6VarArr[1]);
            }
            b6VarArr[1] = null;
        }
        b6VarArr[1] = b6VarArr[0];
        b6VarArr[0] = null;
        setTitle(charSequence);
        this.y0 = z10;
        b6VarArr[0].setAlpha(0.0f);
        if (!z11) {
            b6 b6Var2 = b6VarArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z10) {
                dp = -dp;
            }
            b6Var2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = b6VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.x0 = true;
        ViewPropertyAnimator alpha = b6VarArr[1].animate().alpha(0.0f);
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

    public final void H(String str, int i10, Runnable runnable) {
        boolean z10;
        CharSequence charSequence;
        b6 b6Var;
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
            if (this.p1 != null) {
                this.p1.c(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i10) : this.c0;
            Drawable drawable = str == null ? this.d0 : null;
            c2.b bVar = this.O0;
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
            b6[] b6VarArr = this.n;
            if ((charSequence == null || b6VarArr[0] != null) && getMeasuredWidth() != 0 && ((b6Var = b6VarArr[0]) == null || b6Var.getVisibility() == 0)) {
                b6 b6Var2 = b6VarArr[0];
                if (b6Var2 != null) {
                    b6Var2.animate().cancel();
                    b6 b6Var3 = b6VarArr[1];
                    if (b6Var3 != null) {
                        b6Var3.animate().cancel();
                    }
                    if (b6VarArr[1] == null) {
                        n(1);
                    }
                    b6VarArr[1].k(charSequence);
                    b6VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    b6VarArr[1].i(drawable);
                    b6VarArr[1].setRightDrawableOnClick(this.e0);
                    if (drawable instanceof org.telegram.ui.Components.r5) {
                        ((org.telegram.ui.Components.r5) drawable).l(b6VarArr[1]);
                    }
                    if (z10) {
                        bVar.c(b6VarArr[1]);
                    }
                    this.a1 = true;
                    b6 b6Var4 = b6VarArr[1];
                    b6VarArr[1] = b6VarArr[0];
                    b6VarArr[0] = b6Var4;
                    b6Var4.setAlpha(0.0f);
                    b6VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    b6VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = b6VarArr[1].animate().alpha(0.0f);
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
                n(0);
                if (this.R) {
                    b6VarArr[0].invalidate();
                    invalidate();
                }
                b6VarArr[0].k(charSequence);
                b6VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                b6VarArr[0].i(drawable);
                b6VarArr[0].setRightDrawableOnClick(this.e0);
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable).l(b6VarArr[0]);
                }
                if (z10) {
                    bVar.c(b6VarArr[0]);
                } else {
                    bVar.v(b6VarArr[0]);
                }
            }
            if (runnable == null) {
                runnable = this.h0;
            }
            this.j0 = runnable;
        }
    }

    public final void I(ch.b bVar, fh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        eh.d c10 = bVar.c(this, null, false);
        c10.v(eVar);
        c10.w(AndroidUtilities.dp(6.0f));
        this.a = c10;
        if (z10) {
            c10.y(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.x(AndroidUtilities.dp(23.0f));
        }
        eh.d c11 = bVar.c(this, null, false);
        c11.v(eVar);
        wh.s(c11, AndroidUtilities.dp(23.0f), 6.0f);
        this.b = c11;
        eh.d c12 = bVar.c(this, null, false);
        c12.v(eVar);
        wh.s(c12, AndroidUtilities.dp(23.0f), 6.0f);
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

    public boolean J(View view) {
        if (this.L) {
            b6[] b6VarArr = this.n;
            if (view == b6VarArr[0] || view == b6VarArr[1] || view == this.r || view == this.E || view == this.e || view == this.s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void K(View[] viewArr, boolean[] zArr) {
        if (this.F == null || this.J) {
            return;
        }
        int i10 = 1;
        this.J = true;
        f();
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
                b6 b6Var = this.n[0];
                if (b6Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) property, 0.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<b6, Float>) property, 0.0f));
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
        if (i11 == 0 || this.P0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.h(i11) < 0.699999988079071d) {
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
            ofFloat.addUpdateListener(new a(this, i10));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new ce(11, this, zArr));
        this.P.start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof j2) {
                ((j2) drawable).c(1.0f, true);
            }
            this.e.setBackgroundDrawable(y6.g0(this.q0, 1, -1));
        }
    }

    public final void L() {
        boolean z10 = this.C0 && this.D0;
        if (this.E0 != z10) {
            this.E0 = z10;
            c2.b bVar = this.O0;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.t1));
        hashSet.add(Integer.valueOf(this.s1));
    }

    public final void b() {
        if (this.q1) {
            float f7 = this.r1 ? 1.0f : this.v1;
            int i10 = this.t1;
            u6 u6Var = this.J0;
            int w02 = i10 == -1 ? 0 : y6.w0(i10, u6Var);
            int i11 = this.s1;
            int w03 = i11 == -1 ? 0 : y6.w0(i11, u6Var);
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - f7) * 255.0f));
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
        transitionSet.setInterpolator((TimeInterpolator) ds.f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final void d(boolean z10) {
        po poVar = this.S0;
        if (poVar == null) {
            return;
        }
        lo loVar = poVar.e;
        boolean z11 = loVar != null && loVar.getVisibility() == 0;
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.S0.getVisualWidth());
        oe.e eVar = this.d1;
        if (z10) {
            float f7 = min;
            if ((eVar.h ? eVar.g : eVar.f) != f7) {
                eVar.a(f7);
            }
        } else {
            eVar.c(min);
        }
        this.e1.a(z11, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        eh.d dVar;
        eh.d dVar2;
        b6[] b6VarArr;
        b6 b6Var;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int i11 = this.j1 ? this.h1 : (int) this.f1.f;
        if (this.k1) {
            i11 = Math.max((int) ((1.0f - this.c1) * this.i1), i11);
        }
        ImageView imageView = this.e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i12 = dp * 2;
        int i13 = height + dp2 + i12;
        eh.d dVar3 = this.a;
        oe.b bVar = this.g1;
        if (dVar3 == null || this.Q0 || !this.n1) {
            f7 = 1.0f;
        } else {
            if (!this.H0 || (b6Var = (b6VarArr = this.n)[0]) == null || b6Var.getVisibility() != 0) {
                f7 = 1.0f;
                int i14 = ((this.j1 || this.k1) ? i11 > 0 ? dp : 0 : (int) (dp * bVar.e)) + i11;
                int i15 = dp + dp2;
                int max = Math.max(i14, i15);
                i10 = 2;
                po poVar = this.S0;
                oe.b bVar2 = this.e1;
                int lerp = AndroidUtilities.lerp(i14, max, poVar == null ? 0.0f : 1.0f - bVar2.e);
                int lerp2 = AndroidUtilities.lerp(z10 ? i15 : 0, i15, this.S0 != null ? 1.0f - bVar2.e : 0.0f);
                int width = getWidth() - lerp;
                int i16 = width - lerp2;
                if (this.S0 != null) {
                    int lerp3 = AndroidUtilities.lerp(Math.min(i16, ((int) this.d1.f) + i12), i16, Math.max(this.c1, actionModeFactor));
                    lerp2 = ((width + lerp2) - lerp3) / 2;
                    width = lerp2 + lerp3;
                    float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.S0.getLayoutParams()).leftMargin) - this.S0.getLeftPadding()) + dp;
                    this.S0.setTranslationX(dp3);
                    this.S0.setPivotX((r4.getMeasuredWidth() / 2.0f) - dp3);
                }
                this.a.setBounds(lerp2, height, width, i13);
                if (!this.T0) {
                    this.a.draw(canvas);
                }
                dVar = this.b;
                if (dVar != null && z10) {
                    dVar.setBounds(0, height, dp2 + i12, i13);
                    this.b.draw(canvas);
                }
                dVar2 = this.c;
                if (dVar2 != null && i11 > 0 && !this.Q0 && !this.m1) {
                    dVar2.setBounds((getWidth() - Math.max(dp2, i11)) - i12, height, getWidth(), i13);
                    this.c.setAlpha(!this.j1 ? 255 : (int) (bVar.e * 255.0f));
                    this.c.draw(canvas);
                }
                if (this.L0 && this.x != 0) {
                    this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    int i17 = this.x;
                    Paint paint = this.M0;
                    paint.setColor(i17);
                    if (this.q1) {
                        this.K0.H(canvas, getY(), this.N0, paint, true);
                    } else {
                        ww0 ww0Var = this.K0;
                        float y3 = getY();
                        float f10 = f7 - (this.r1 ? f7 : this.v1);
                        ww0Var.getClass();
                        ww0Var.J(canvas, y3, this.N0, paint, true, AndroidUtilities.lerp(255, Color.alpha(y6.w0((ww0.E() && SharedConfig.getDevicePerformanceClass() == i10) ? y6.xf : y6.yf, ww0Var.getResourceProvider())), f10));
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
            int dp4 = AndroidUtilities.dp(48.0f) + ((int) Math.ceil(b6VarArr[0].getTextWidth())) + i12;
            int round = Math.round(b6VarArr[0].getTranslationX()) + ((getWidth() - dp4) / 2);
            this.a.setBounds(round, height, dp4 + round, i13);
            if (!this.T0) {
                this.a.draw(canvas);
            }
        }
        i10 = 2;
        dVar = this.b;
        if (dVar != null) {
            dVar.setBounds(0, height, dp2 + i12, i13);
            this.b.draw(canvas);
        }
        dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.setBounds((getWidth() - Math.max(dp2, i11)) - i12, height, getWidth(), i13);
            this.c.setAlpha(!this.j1 ? 255 : (int) (bVar.e * 255.0f));
            this.c.draw(canvas);
        }
        if (this.L0) {
            this.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i172 = this.x;
            Paint paint2 = this.M0;
            paint2.setColor(i172);
            if (this.q1) {
            }
        }
        this.l1 = true;
        if (this.b1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x9;
            float f10 = y3;
            View o10 = o(this, f7, f10, this.S0);
            if (o10 == null) {
                o10 = o(this, f7, f10, null);
            }
            eh.d dVar = this.a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x9, y3);
            if (o10 != null && o10 != this.S0) {
                eh.d dVar2 = this.b;
                boolean z11 = z10 | (dVar2 != null && dVar2.getBounds().contains(x9, y3));
                eh.d dVar3 = this.c;
                z10 = z11 | (dVar3 != null && dVar3.getBounds().contains(x9, y3));
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
        Drawable A0;
        float f7;
        float f10;
        boolean z11;
        int i10;
        w00 w00Var;
        r2 r2Var = this.t0;
        if (r2Var != null && r2Var.getParentLayout() != null) {
            this.t0.getParentLayout().getClass();
        }
        boolean z12 = true;
        if (this.B0 && view == this.e) {
            return true;
        }
        boolean J = J(view);
        int i11 = 0;
        if (J) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.I ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.R && !this.i0 && !LocaleController.isRTL) {
            b6[] b6VarArr = this.n;
            if ((view == b6VarArr[0] || view == b6VarArr[1] || (view == this.F0 && this.G0)) && (A0 = y6.A0()) != null) {
                b6 b6Var = view == this.F0 ? b6VarArr[0] : (b6) view;
                if (b6Var != null && b6Var.getVisibility() == 0 && (b6Var.getText() instanceof String)) {
                    TextPaint textPaint = b6Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.U);
                    textPaint.getTextBounds((String) b6Var.getText(), 0, 1, this.W);
                    int width = ((this.W.width() - (A0.getIntrinsicWidth() + y6.D1)) / 2) + b6Var.getTextStartX() + y6.D1;
                    f7 = 255.0f;
                    f10 = 1.0f;
                    int textStartY = b6Var.getTextStartY() + y6.E1 + ((int) Math.ceil((b6Var.getTextHeight() - this.W.height()) / 2.0f)) + ((int) ((1.0f - this.F0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    A0.setBounds(width, textStartY - A0.getIntrinsicHeight(), A0.getIntrinsicWidth() + width, textStartY);
                    A0.setAlpha((int) (b6Var.getAlpha() * this.F0.getAlpha() * 255.0f));
                    A0.draw(canvas);
                    if (this.a1) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f7 = 255.0f;
                    f10 = 1.0f;
                }
                if (y6.G1) {
                    if (this.S == null) {
                        this.S = new hx0(0);
                    }
                } else if (!this.V && this.S != null) {
                    this.S = null;
                }
                hx0 hx0Var = this.S;
                if (hx0Var != null) {
                    hx0Var.b(canvas, this);
                } else {
                    x00 x00Var = this.T;
                    if (x00Var != null) {
                        ArrayList arrayList = x00Var.d;
                        ArrayList arrayList2 = x00Var.c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                w00 w00Var2 = (w00) arrayList2.get(i12);
                                Paint paint = w00Var2.k.a;
                                paint.setColor(w00Var2.j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * w00Var2.i);
                                paint.setAlpha((int) (w00Var2.f * f7));
                                canvas.drawPoint(w00Var2.a, w00Var2.b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i13 = AndroidUtilities.statusBarHeight;
                                    float nextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float f11 = 20.0f;
                                    float nextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.t.C(20.0f, getMeasuredHeight(), i13)) + i13;
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
                                            w00Var = new w00(x00Var);
                                        } else {
                                            i10 = 0;
                                            w00Var = (w00) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        w00Var.a = f12;
                                        w00Var.b = nextFloat2;
                                        w00Var.c = cos * 1.5f;
                                        w00Var.d = sin;
                                        w00Var.j = i14;
                                        float f14 = f10;
                                        w00Var.f = f14;
                                        w00Var.h = 0.0f;
                                        w00Var.i = Math.max(f14, Utilities.random.nextFloat() * 1.5f);
                                        w00Var.g = Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                        w00Var.e = (Utilities.random.nextFloat() * 4.0f) + f13;
                                        arrayList2.add(w00Var);
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
                            long min = Math.min(17L, currentTimeMillis - x00Var.b);
                            int size2 = arrayList2.size();
                            while (i17 < size2) {
                                w00 w00Var3 = (w00) arrayList2.get(i17);
                                float f15 = w00Var3.h;
                                float f16 = w00Var3.g;
                                if (f15 >= f16) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(w00Var3);
                                    }
                                    arrayList2.remove(i17);
                                    i17--;
                                    size2--;
                                    z11 = J;
                                } else {
                                    w00Var3.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f15 / f16);
                                    float f17 = w00Var3.a;
                                    float f18 = w00Var3.c;
                                    float f19 = w00Var3.e;
                                    float f20 = min;
                                    z11 = J;
                                    w00Var3.a = a1.g.C(f18 * f19, f20, 500.0f, f17);
                                    float f21 = w00Var3.b;
                                    float f22 = w00Var3.d;
                                    w00Var3.b = (((f19 * f22) * f20) / 500.0f) + f21;
                                    w00Var3.d = (f20 / 100.0f) + f22;
                                    w00Var3.h += f20;
                                }
                                i17++;
                                J = z11;
                            }
                            z10 = J;
                            x00Var.b = currentTimeMillis;
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
        z10 = J;
        if (z10) {
        }
        return drawChild;
    }

    public final void e() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof j2) || (drawable instanceof k5)) ? 2 : 0;
        if (this.e.getLayerType() != i10) {
            this.e.setLayerType(i10, null);
            this.e.invalidate();
        }
    }

    public final void f() {
        z zVar = this.E;
        int max = Math.max(0, zVar != null ? (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.F;
        int max2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.J) {
            max = max2;
        }
        this.g1.a(max > 0, this.l1);
        oe.e eVar = this.f1;
        float f7 = max;
        if ((eVar.h ? eVar.g : eVar.f) != f7) {
            if (this.l1) {
                eVar.a(f7);
            } else {
                eVar.c(f7);
            }
        }
    }

    public void g(boolean z10) {
        z zVar;
        if (!this.n0 || (zVar = this.E) == null) {
            return;
        }
        zVar.i(z10);
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
        return this.p1;
    }

    public b6 getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public e5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.x;
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

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public y9 getSearchAvatarImageView() {
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
        b6 b6Var = this.r;
        if (b6Var != null) {
            return b6Var.getTextColor();
        }
        return 0;
    }

    public b6 getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        b6 b6Var = this.n[0];
        if (b6Var == null) {
            return null;
        }
        return b6Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        b6 b6Var = this.n[0];
        if (b6Var != null) {
            return b6Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public b6 getTitleTextView() {
        return this.n[0];
    }

    public b6 getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final z h() {
        return i(null);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final z i(String str) {
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
            f7.i(y6.w8, this.F, this.J0);
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

    public final void j() {
        if (this.s != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        this.s = b6Var;
        b6Var.setGravity(3);
        this.s.setVisibility(8);
        f7.Y(this.s, y6.B8, this.J0);
        addView(this.s, 0, kb1.i(-2, -2, 51));
    }

    public final void k() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(y6.g0(this.p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, kb1.i(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z l() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, kb1.i(-2, -1, 5));
        return this.E;
    }

    public final void m() {
        if (this.r != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        this.r = b6Var;
        b6Var.setGravity(3);
        this.r.setVisibility(8);
        f7.Y(this.r, y6.B8, this.J0);
        addView(this.r, 0, kb1.i(-2, -2, 51));
    }

    public final void n(int i10) {
        b6[] b6VarArr = this.n;
        if (b6VarArr[i10] != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        b6VarArr[i10] = b6Var;
        b6Var.setGravity(this.H0 ? 17 : 19);
        int i11 = this.v0;
        if (i11 != 0) {
            b6VarArr[i10].setTextColor(i11);
        } else {
            f7.Y(b6VarArr[i10], y6.A8, this.J0);
        }
        b6 b6Var2 = b6VarArr[i10];
        b6Var2.setEmojiColor(b6Var2.getTextColor());
        b6VarArr[i10].setTypeface(AndroidUtilities.bold());
        b6VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        b6VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        b6VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(b6VarArr[i10], 0, kb1.i(-2, -2, 51));
        } else {
            addView(b6VarArr[i10], 0, kb1.i(-2, -2, 51));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        L();
        if (this.J) {
            int i10 = this.w;
            if (i10 == 0) {
                i10 = this.x;
            }
            if (i10 == 0 || this.P0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.h(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).l(this.n[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        L();
        if (this.J) {
            int i10 = this.x;
            if (i10 == 0 || this.w == 0 || this.P0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.a.h(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.d0;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).l(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable A0;
        if (this.R && !this.i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (A0 = y6.A0()) != null && A0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            hx0 hx0Var = this.S;
            b6[] b6VarArr = this.n;
            if (hx0Var == null) {
                this.T = null;
                this.S = new hx0(0);
                b6VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                x00 x00Var = new x00();
                x00Var.c = new ArrayList();
                x00Var.d = new ArrayList();
                Paint paint = new Paint(1);
                x00Var.a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(y6.x0(null, y6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    x00Var.d.add(new w00(x00Var));
                }
                this.T = x00Var;
                b6VarArr[0].invalidate();
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
        b6[] b6VarArr;
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
            d(this.d1.h);
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
            int dp2 = this.E.o() ? AndroidUtilities.dp(this.m0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f) : getMeasuredWidth() - this.E.getMeasuredWidth();
            z zVar2 = this.E;
            zVar2.layout(dp2, i19, zVar2.getMeasuredWidth() + dp2, this.E.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            b6VarArr = this.n;
            if (i21 >= 2) {
                break;
            }
            b6 b6Var = b6VarArr[i21];
            if (b6Var != null && b6Var.getVisibility() != 8) {
                boolean z11 = this.y0;
                if (((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.w0 && this.x0) {
                    currentActionBarHeight = (getCurrentActionBarHeight() - b6VarArr[i21].getTextHeight()) / 2;
                } else {
                    b6 b6Var2 = this.r;
                    currentActionBarHeight = (b6Var2 == null || b6Var2.getVisibility() == 8) ? (getCurrentActionBarHeight() - b6VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - b6VarArr[i21].getTextHeight()) / 2);
                }
                int measuredWidth2 = this.H0 ? (getMeasuredWidth() - b6VarArr[i21].getMeasuredWidth()) / 2 : i20;
                b6 b6Var3 = b6VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                b6Var3.layout(measuredWidth2, i22 - b6Var3.getPaddingTop(), b6VarArr[i21].getMeasuredWidth() + measuredWidth2, b6VarArr[i21].getPaddingBottom() + ((b6VarArr[i21].getTextHeight() + i22) - b6VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.p1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.p1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            di.k kVar = this.p1;
            int i23 = currentActionBarHeight2 + i19;
            kVar.layout(i20, i23, kVar.getMeasuredWidth() + i20, this.p1.getMeasuredHeight() + i23);
        }
        b6 b6Var4 = this.r;
        if (b6Var4 != null && b6Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            int measuredWidth3 = this.H0 ? (getMeasuredWidth() - this.r.getMeasuredWidth()) / 2 : i20;
            b6 b6Var5 = this.r;
            int i24 = currentActionBarHeight3 + i19;
            b6Var5.layout(measuredWidth3, i24, b6Var5.getMeasuredWidth() + measuredWidth3, this.r.getTextHeight() + i24);
        }
        b6 b6Var6 = this.s;
        if (b6Var6 != null && b6Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            b6 b6Var7 = this.s;
            int i26 = dp3 + i19;
            b6Var7.layout(i20, i26, b6Var7.getMeasuredWidth() + i20, this.s.getTextHeight() + i26);
        }
        y9 y9Var = this.f;
        if (y9Var != null) {
            y9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f.getMeasuredHeight()) / 2) + i19, this.f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != b6VarArr[0] && childAt != b6VarArr[1] && childAt != this.p1 && childAt != this.r && childAt != this.E && childAt != this.e && childAt != this.s && childAt != this.f) {
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
        b6[] b6VarArr;
        b6 b6Var;
        int i12;
        b6 b6Var2;
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
        z zVar = kVar.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f7 = 66.0f;
            if (kVar.E.o() && !kVar.n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), makeMeasureSpec2);
                int k10 = kVar.E.k();
                if (kVar.m0) {
                    f7 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.k() + (size - AndroidUtilities.dp(f7)), TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.E.q(-k10);
                }
            } else if (kVar.n0) {
                if (kVar.m0) {
                    f7 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f7 = 74.0f;
                }
                makeMeasureSpec = wh.x(f7, size, TLObject.FLAG_30);
                if (!kVar.y) {
                    kVar.E.q(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31);
                if (!kVar.y) {
                    kVar.E.q(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i14 = 0;
        while (true) {
            b6VarArr = kVar.n;
            if (i14 >= 2) {
                break;
            }
            b6 b6Var3 = b6VarArr[0];
            if ((b6Var3 == null || b6Var3.getVisibility() == 8) && ((b6Var = kVar.r) == null || b6Var.getVisibility() == 8)) {
                i12 = i13;
            } else {
                z zVar2 = kVar.E;
                int measuredWidth = zVar2 != null ? zVar2.getMeasuredWidth() : 0;
                int max = Math.max(kVar.H0 ? size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + measuredWidth) + kVar.a0) * 2) : org.telegram.messenger.t.C(16.0f, size - measuredWidth, dp) - kVar.a0, 0);
                boolean z10 = kVar.y0;
                int i15 = 20;
                if (((z10 && i14 == 0) || (!z10 && i14 == i13)) && kVar.w0 && kVar.x0) {
                    b6 b6Var4 = b6VarArr[i14];
                    i12 = i13;
                    if (kVar.P0) {
                        i15 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i15 = 18;
                    }
                    b6Var4.setTextSize(i15);
                } else {
                    i12 = i13;
                    b6 b6Var5 = b6VarArr[0];
                    if (b6Var5 == null || b6Var5.getVisibility() == 8 || (b6Var2 = kVar.r) == null || b6Var2.getVisibility() == 8) {
                        b6 b6Var6 = b6VarArr[i14];
                        if (b6Var6 != null && b6Var6.getVisibility() != 8) {
                            b6 b6Var7 = b6VarArr[i14];
                            if (kVar.P0) {
                                i15 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 18;
                            }
                            b6Var7.setTextSize(i15);
                        }
                        b6 b6Var8 = kVar.r;
                        if (b6Var8 != null && b6Var8.getVisibility() != 8) {
                            kVar.r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        b6 b6Var9 = kVar.s;
                        if (b6Var9 != null) {
                            b6Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        b6 b6Var10 = b6VarArr[i14];
                        if (b6Var10 != null) {
                            if (kVar.P0) {
                                i15 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i15 = 18;
                            }
                            b6Var10.setTextSize(i15);
                        }
                        kVar.r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        b6 b6Var11 = kVar.s;
                        if (b6Var11 != null) {
                            b6Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                b6 b6Var12 = b6VarArr[i14];
                if (b6Var12 != null && b6Var12.getVisibility() != 8) {
                    b6VarArr[i14].measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(b6VarArr[i14].getPaddingBottom() + b6VarArr[i14].getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    if (kVar.z0) {
                        CharSequence text = b6VarArr[i14].getText();
                        b6 b6Var13 = b6VarArr[i14];
                        b6Var13.setPivotX(b6Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        b6VarArr[i14].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        b6VarArr[i14].setPivotX(0.0f);
                        b6VarArr[i14].setPivotY(0.0f);
                    }
                }
                b6 b6Var14 = kVar.r;
                if (b6Var14 != null && b6Var14.getVisibility() != 8) {
                    kVar.r.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                di.k kVar2 = kVar.p1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                }
                b6 b6Var15 = kVar.s;
                if (b6Var15 != null && b6Var15.getVisibility() != 8) {
                    kVar.s.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
            }
            i14++;
            i13 = i12;
        }
        int i16 = i13;
        y9 y9Var = kVar.f;
        if (y9Var != null) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
        }
        int childCount = kVar.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = kVar.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != b6VarArr[0] && childAt != b6VarArr[i16] && childAt != kVar.p1 && childAt != kVar.r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.s && childAt != kVar.f) {
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

    public void p() {
        d dVar = this.F;
        if (dVar == null || !this.J) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof w0) {
                ((w0) childAt).o();
            }
        }
        this.J = false;
        f();
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
        b6[] b6VarArr = this.n;
        if (!z10) {
            b6 b6Var = b6VarArr[0];
            if (b6Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) property, 1.0f));
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<b6, Float>) property, 1.0f));
            }
        }
        z zVar = this.E;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i13 = this.x;
        if (i13 == 0 || this.P0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.a.h(i13) < 0.699999988079071d) {
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
            ofFloat.addUpdateListener(new a(this, 2));
            this.P.playTogether(ofFloat);
        }
        this.P.setDuration(200L);
        this.P.addListener(new e(this, i10));
        this.P.start();
        if (!this.n0) {
            b6 b6Var2 = b6VarArr[0];
            if (b6Var2 != null) {
                b6Var2.setVisibility(0);
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
            if (drawable instanceof j2) {
                ((j2) drawable).c(0.0f, true);
            }
            this.e.setBackgroundDrawable(y6.g0(this.p0, 1, -1));
        }
    }

    public final boolean q() {
        return this.F != null && this.J;
    }

    public final boolean r(String str) {
        if (this.F == null || !this.J) {
            return false;
        }
        String str2 = this.G;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public boolean s() {
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            f7.r(dVar);
            this.F.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            f7.r(view);
            this.v.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        w(recyclerView, y6.a7, y6.s8);
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
            k();
        }
        this.e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof j2) {
            j2 j2Var = (j2) drawable;
            j2Var.c(q() ? 1.0f : 0.0f, false);
            j2Var.b(this.s0);
            j2Var.a(this.r0);
        } else if (drawable instanceof k5) {
            k5 k5Var = (k5) drawable;
            k5Var.k = this.x;
            k5Var.j = this.r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.U0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        }
        e();
    }

    public void setBackButtonImage(int i10) {
        if (this.e == null) {
            k();
        }
        this.e.setVisibility(i10 == 0 ? 8 : 0);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
        e();
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
            if (drawable instanceof k5) {
                ((k5) drawable).k = i10;
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
        b6[] b6VarArr = this.n;
        int length = b6VarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            b6 b6Var = b6VarArr[i10];
            if (b6Var != null) {
                b6Var.setGravity(z10 ? 17 : 19);
            }
            i10++;
        }
        b6 b6Var2 = this.r;
        if (b6Var2 != null) {
            b6Var2.setGravity(z10 ? 17 : 19);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(po poVar) {
        this.S0 = poVar;
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

    public void setDrawBlurBackground(ww0 ww0Var) {
        this.L0 = true;
        this.K0 = ww0Var;
        ww0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.n1 != z10) {
            this.n1 = z10;
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
        if (this.o1 != i10) {
            this.o1 = i10;
            invalidate();
        }
        eh.d dVar = this.a;
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
        b6[] b6VarArr = this.n;
        b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            b6Var.setRightDrawableOnClick(onClickListener);
        }
        b6 b6Var2 = b6VarArr[1];
        if (b6Var2 != null) {
            b6Var2.setRightDrawableOnClick(this.e0);
        }
    }

    public void setSearchAvatarImageView(y9 y9Var) {
        y9 y9Var2 = this.f;
        if (y9Var2 == y9Var) {
            return;
        }
        if (y9Var2 != null) {
            removeView(y9Var2);
        }
        this.f = y9Var;
        if (y9Var != null) {
            addView(y9Var);
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

    public void setSearchFilter(ig.p0 p0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(p0Var);
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
            m();
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
            m();
        }
        f7.r(this.r);
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
        b6[] b6VarArr = this.n;
        if (b6VarArr[0] == null) {
            n(0);
        }
        this.v0 = i10;
        f7.r(b6VarArr[0]);
        b6VarArr[0].setTextColor(i10);
        b6VarArr[0].setEmojiColor(i10);
        b6 b6Var = b6VarArr[1];
        if (b6Var != null) {
            f7.r(b6Var);
            b6VarArr[1].setTextColor(i10);
            b6VarArr[1].setEmojiColor(i10);
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

    public void t(boolean z10) {
        Property property;
        this.n0 = z10;
        f();
        AnimatorSet animatorSet = this.X0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean s10 = s();
        if (!s10) {
            b6 b6Var = this.n[0];
            if (b6Var != null) {
                arrayList.add(b6Var);
            }
            if (this.r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.r);
                this.r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new a(this, 3));
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
        y9 y9Var = this.f;
        if (y9Var != null) {
            y9Var.setVisibility(0);
            this.X0.playTogether(ObjectAnimator.ofFloat(this.f, (Property<y9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.z0 = true;
        requestLayout();
        this.X0.addListener(new f(this, arrayList, z10, s10));
        this.X0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof k5) {
                k5 k5Var = (k5) drawable;
                k5Var.h = true;
                k5Var.a(z10 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void u() {
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u()) {
                    w0Var.E();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        b();
        eh.d dVar = this.a;
        if (dVar != null) {
            dVar.updateColors();
        }
        eh.d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        eh.d dVar3 = this.b;
        if (dVar3 != null) {
            dVar3.updateColors();
        }
        di.k kVar = this.p1;
        if (kVar != null) {
            kVar.d();
        }
    }

    public final void v() {
        z zVar = this.E;
        if (zVar != null) {
            boolean z10 = this.n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.u()) {
                        if (!z10) {
                            zVar.b.t(w0Var.T(z11));
                        }
                        w0Var.P("", false);
                        w0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void w(RecyclerView recyclerView, int i10, int i11) {
        this.s1 = i10;
        this.t1 = i11;
        this.r1 = AndroidUtilities.isTablet();
        org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(4, this, recyclerView);
        recyclerView.j(new ai.b(m0Var, 21));
        if (this.q1) {
            m0Var.run();
            return;
        }
        this.q1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.u1 = !canScrollVertically;
        this.v1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public final void x(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(y6.g0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.r();
                return;
            }
            return;
        }
        this.p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(y6.g0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.r();
        }
    }

    public void y(int i10, boolean z10) {
        if (z10) {
            this.s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof j2) {
                    ((j2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof j2) {
                    ((j2) drawable2).a(i10);
                } else if (drawable2 instanceof k5) {
                    ((k5) drawable2).j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.s();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null || !this.U0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.r0, PorterDuff.Mode.SRC_IN));
    }

    public void setAdaptiveBackground(hp0 hp0Var) {
        int i10 = y6.a7;
        int i11 = y6.s8;
        this.s1 = i10;
        this.t1 = i11;
        this.r1 = AndroidUtilities.isTablet();
        b();
        org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(3, this, hp0Var);
        hp0Var.L.add(m0Var);
        if (this.q1) {
            m0Var.run();
            return;
        }
        this.q1 = true;
        boolean canScrollVertically = hp0Var.canScrollVertically(-1);
        this.u1 = !canScrollVertically;
        this.v1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
