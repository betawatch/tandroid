package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class t2 extends Dialog implements z1 {
    public static final /* synthetic */ int i1 = 0;
    public AnimatorSet A0;
    public int B0;
    public ValueAnimator C0;
    public float D0;
    public boolean E;
    public boolean E0;
    public FrameLayout F;
    public float F0;
    public boolean G;
    public int G0;
    public mi.b0 H;
    public int H0;
    public int I;
    public DialogInterface.OnDismissListener I0;
    public boolean J;
    public e6 J0;
    public final boolean K;
    public boolean K0;
    public DialogInterface.OnClickListener L;
    public boolean L0;
    public CharSequence[] M;
    public final g2.g M0;
    public int[] N;
    public int N0;
    public ViewGroup O;
    public boolean O0;
    public CharSequence P;
    public ValueAnimator P0;
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public int S;
    public boolean S0;
    public int T;
    public float T0;
    public int U;
    public boolean U0;
    public boolean V;
    public int V0;
    public boolean W;
    public boolean W0;
    public int X;
    public boolean X0;
    public Integer Y;
    public final pi.q Y0;
    public final s2 Z;
    public int Z0;
    public int a;
    public boolean a0;
    public int a1;
    public ViewGroup b;
    public int b0;
    public int b1;
    public final j2 c;
    public boolean c0;
    public PorterDuffColorFilter c1;
    public boolean d;
    public boolean d0;
    public boolean d1;
    public int e;
    public boolean e0;
    public int e1;
    public int f;
    public boolean f0;
    public long f1;
    public boolean g0;
    public d2 g1;
    public WindowInsets h;
    public int h0;
    public cg.v0 h1;
    public boolean i0;
    public final int j0;
    public final int k0;
    public Interpolator l0;
    public k2 m0;
    public boolean n;
    public boolean n0;
    public final int o0;
    public boolean p0;
    public int q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public Drawable s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final e2 y0;
    public n2 z0;

    public t2(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, e6Var, z10);
    }

    public static void A(t2 t2Var) {
        int w02;
        Drawable drawable;
        int w03;
        j2 j2Var = t2Var.c;
        if (t2Var.b1 >= 0 && (drawable = t2Var.s0) != null && t2Var.c1 != null && drawable.getColorFilter() == t2Var.c1 && (w03 = k6.w0(t2Var.b1, t2Var.J0)) != t2Var.a1) {
            Drawable drawable2 = t2Var.s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            t2Var.c1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            t2Var.a1 = w03;
            if (j2Var != null) {
                j2Var.invalidate();
            }
            ViewGroup viewGroup = t2Var.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i3 = t2Var.Z0;
        if (i3 < 0 || t2Var.G0 >= 0 || t2Var.e1 != t2Var.H0 || (w02 = k6.w0(i3, t2Var.J0)) == t2Var.H0) {
            return;
        }
        t2Var.H0 = w02;
        t2Var.e1 = w02;
        if (j2Var != null) {
            j2Var.invalidate();
        }
        boolean z10 = ((double) org.telegram.messenger.g0.B(w02)) > 0.721d;
        if (t2Var.g1 != null) {
            org.telegram.messenger.g0.o3(j2Var, z10);
        } else {
            org.telegram.messenger.g0.u3(t2Var, w02, false, null);
            org.telegram.messenger.g0.n3(t2Var, z10);
        }
    }

    public static int B(t2 t2Var) {
        WindowInsets windowInsets;
        int i3;
        int i10;
        int i11;
        if (!t2Var.i0 || (windowInsets = t2Var.h) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (t2Var.d || !t2Var.n || systemGestureInsets == null) {
            return 0;
        }
        i3 = systemGestureInsets.left;
        if (i3 == 0) {
            i11 = systemGestureInsets.right;
            if (i11 == 0) {
                return 0;
            }
        }
        i10 = systemGestureInsets.bottom;
        return i10;
    }

    public static /* synthetic */ WindowInsets z(t2 t2Var, WindowInsets windowInsets) {
        t2Var.t0(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.n0) {
            attributes.softInputMode = this.o0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void B0(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.T0, z10 ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(xq.f);
        duration.addUpdateListener(new f2(this, 4));
        duration.start();
    }

    public final void C0(int i3, int i10, int i11) {
        if (i3 >= 0) {
            ArrayList arrayList = this.x0;
            if (i3 >= arrayList.size()) {
                return;
            }
            m2 m2Var = (m2) arrayList.get(i3);
            m2Var.a.setTextColor(i10);
            m2Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i3) {
        this.e1 = i3;
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.invalidate();
        }
        if (this.g1 != null) {
            LaunchActivity.K1.F(true, true, true);
            org.telegram.messenger.g0.o3(j2Var, org.telegram.messenger.g0.B(e(k6.w0(k6.a7, this.J0))) >= 0.721f);
        } else {
            org.telegram.messenger.g0.u3(this, this.e1, true, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.e1)) > 0.721d);
        }
    }

    public final void F0(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        if (this.N0 > 0) {
            if (z10) {
                hs.e().k(hs.j1, Integer.valueOf(this.N0));
            } else {
                hs.e().k(hs.k1, Integer.valueOf(this.N0));
            }
        }
    }

    public boolean G() {
        return this.c0;
    }

    public final void G0(boolean z10) {
        this.a0 = z10;
        int x02 = k6.x0(null, k6.s8, true);
        j2 j2Var = this.c;
        int systemUiVisibility = j2Var.getSystemUiVisibility();
        j2Var.setSystemUiVisibility((this.a0 && x02 == -1) ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        if (this.g1 != null) {
            LaunchActivity.K1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.d0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I(MotionEvent motionEvent) {
        return false;
    }

    public void J() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = 0;
    }

    public void K() {
        d2 d2Var = this.g1;
        if (d2Var != null) {
            d2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.c);
        } else {
            try {
                super.dismiss();
            } catch (Exception e10) {
                a8.g(e10, false);
            }
        }
    }

    public void L(int i3) {
        Integer num;
        if (this.J) {
            return;
        }
        this.J = true;
        J();
        this.B0 = 2;
        this.A0 = new AnimatorSet();
        int i10 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + this.f);
        ofFloat.addUpdateListener(new f2(this, 2));
        this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
        this.A0.setDuration(this.X == 4 ? 330L : 180L);
        this.A0.setInterpolator(xq.g);
        this.A0.addListener(new ii.m2(this, i3, 5));
        hs.e().k(hs.j1, 512);
        this.A0.start();
        if (this.X != 4 || (num = this.Y) == null) {
            return;
        }
        int intValue = num.intValue();
        ArrayList arrayList = this.x0;
        int currentTextColor = ((m2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
        int currentTextColor2 = ((m2) arrayList.get(i3)).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new f2(this, 3));
        ofArgb.setDuration(130L);
        xq xqVar = xq.f;
        ofArgb.setInterpolator(xqVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new g2(this, i3, i10));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(xqVar);
        ofArgb2.start();
    }

    public final void N() {
        P(k6.a7);
    }

    public final void O(int i3) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.G0 = -1;
        this.Z0 = -1;
        this.H0 = i3;
        E0(i3);
    }

    public final void P(int i3) {
        O(k6.w0(i3, this.J0));
        this.Z0 = i3;
    }

    public int Q() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int R() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int S() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.T0) * r0.getSystemWindowInsetLeft());
    }

    public final int T() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.T0) * r0.getSystemWindowInsetRight());
    }

    public ArrayList U() {
        return null;
    }

    public final int V(int i3) {
        return k6.w0(i3, this.J0);
    }

    public final boolean W() {
        return this.J;
    }

    public boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f11 >= childAt.getY() + this.F.getY()) {
                if (f11 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.F.getX()) {
                        if (f10 <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f11 < ((float) this.b.getTop()) || f10 < ((float) this.b.getLeft()) || f10 > ((float) this.b.getRight());
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(d2 d2Var) {
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        if (d2Var == null || !d2Var.isSupportEdgeToEdge()) {
            this.g1 = d2Var;
            s2 s2Var = this.Z;
            if (s2Var != null) {
                ((Paint) s2Var.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final View d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j10;
        ac acVar;
        n2 n2Var = this.z0;
        if ((n2Var == null || n2Var.x()) && !this.J) {
            int i3 = 1;
            this.J = true;
            DialogInterface.OnDismissListener onDismissListener = this.I0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            J();
            n0();
            int i10 = 2;
            if (this.O0) {
                org.telegram.messenger.g0.h3(new e2(this, i10));
            } else if (!this.e0 || !j0()) {
                org.telegram.messenger.g0.v1(this.c);
                this.B0 = 2;
                ValueAnimator valueAnimator = this.C0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 0.0f);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new f2(this, 5));
                this.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    if (this.W0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, org.telegram.messenger.g0.L(48.0f));
                        ofFloat2.addUpdateListener(new f2(this, 6));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + (this.d1 ? this.e : this.f));
                        ofFloat3.addUpdateListener(new f2(this, 7));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
                arrayList.add(this.C0);
                E(arrayList, false);
                this.A0.playTogether(arrayList);
                if (this.W0) {
                    this.A0.setDuration(200L);
                    this.A0.setInterpolator(xq.f);
                    j10 = 0;
                } else {
                    j10 = 250;
                    this.A0.setDuration(250L);
                    this.A0.setInterpolator(xq.g);
                }
                this.A0.addListener(new l2(this, i3));
                hs.e().k(hs.j1, 512);
                this.A0.start();
                acVar = ac.w;
                if (acVar != null && acVar.l && acVar.r) {
                    if (j10 <= 0) {
                        acVar.c((long) (j10 * 0.6f), hp.e1().getBoolean("view_animations", true));
                    } else {
                        acVar.b();
                    }
                }
                F0(false);
            }
            j10 = 0;
            acVar = ac.w;
            if (acVar != null) {
                if (j10 <= 0) {
                }
            }
            F0(false);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final int e(int i3) {
        float f10;
        ViewGroup viewGroup;
        if (!y() || (viewGroup = this.b) == null) {
            f10 = 0.0f;
        } else if (this.W0) {
            f10 = viewGroup.getAlpha();
        } else {
            f10 = Utilities.l(1.0f - (this.b.getTranslationY() / ((org.telegram.messenger.g0.L(10.0f) + (R() + this.f)) + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) : 0))));
        }
        return i0.a.f(f10, i3, this.H0);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public boolean f() {
        return this.a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i3;
        d2 d2Var = this.g1;
        j2 j2Var = this.c;
        int i10 = 0;
        if (d2Var != null) {
            d2Var.addSheet(this);
            if (this.g1.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.g1.getLayoutContainer().getWindowToken(), 2)) {
                org.telegram.messenger.g0.i3(new e2(this, i10), 80L);
            } else {
                org.telegram.messenger.g0.E2(j2Var);
                this.g1.getLayoutContainer().addView(j2Var);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(j2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        int i11 = 1;
        if (this.a0 && k6.x0(null, k6.s8, true) == -1) {
            j2Var.setSystemUiVisibility(j2Var.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        if (this.b == null) {
            ai.o2 o2Var = new ai.o2(11, getContext(), this);
            this.b = o2Var;
            o2Var.setBackgroundDrawable(this.s0);
            this.b.setPadding(this.u0, ((this.v0 ? org.telegram.messenger.g0.L(8.0f) : 0) + this.t0) - 1, this.u0, this.w0 ? org.telegram.messenger.g0.L(8.0f) : 0);
        }
        this.b.setVisibility(4);
        j2Var.addView(this.b, 0, mf.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            j2Var.addView(frameLayout, j2Var.indexOfChild(this.b) + 1, mf.e(-1, -2, 80));
        }
        if (this.P != null) {
            k2 k2Var = new k2(i10, getContext(), this);
            this.m0 = k2Var;
            k2Var.setText(this.P);
            if (this.Q) {
                r6.V(this.m0, k6.j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                this.m0.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(this.R ? 14.0f : 6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                r6.V(this.m0, k6.q5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                this.m0.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(this.R ? 8.0f : 0.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            }
            if (this.R) {
                this.m0.setSingleLine(false);
                this.m0.setMaxLines(5);
                this.m0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.m0.setLines(1);
                this.m0.setSingleLine(true);
                this.m0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.m0.setGravity(16);
            i3 = 48;
            this.b.addView(this.m0, mf.c(this.R ? -2.0f : 48, -1));
            this.m0.setOnTouchListener(new fi.a(i11));
        } else {
            i3 = 0;
        }
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            if (this.U0) {
                this.b.addView(this.O, mf.d(-1, -2.0f, this.V0, 0.0f, i3, 0.0f, 0.0f));
            } else {
                this.b.setClipToPadding(false);
                this.b.setClipChildren(false);
                j2Var.setClipToPadding(false);
                j2Var.setClipChildren(false);
                float f10 = i3;
                this.b.addView(this.O, mf.d(-1, -2.0f, this.V0, 0.0f, f10, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f10) + (-this.t0);
            }
        } else if (this.M != null) {
            int i12 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i12 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i12] != null) {
                    m2 m2Var = new m2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i12];
                    int[] iArr = this.N;
                    m2Var.a(charSequence, iArr != null ? iArr[i12] : 0, null, this.Q);
                    this.b.addView(m2Var, mf.d(-1, 48.0f, 51, 0.0f, i3, 0.0f, 0.0f));
                    i3 += 48;
                    m2Var.setTag(Integer.valueOf(i12));
                    m2Var.setOnClickListener(new ii.m(this, 18));
                    this.x0.add(m2Var);
                }
                i12++;
            }
        }
        if (this.g1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i13 = attributes.flags & (-3);
            attributes.flags = i13;
            if (this.n0) {
                attributes.softInputMode = this.o0;
            } else {
                attributes.flags = i13 | 131072;
            }
            if (this.W) {
                attributes.flags |= -2147416832;
                j2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.g0.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean j() {
        return false;
    }

    public boolean j0() {
        return false;
    }

    public fc k() {
        return new fc(this.F, this.J0);
    }

    public boolean k0(View view, int i3, int i10, int i11, int i12) {
        return false;
    }

    public boolean l0(View view, int i3, int i10) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void n(Runnable runnable) {
        this.I0 = new h2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.g1 == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void p() {
        onBackPressed();
    }

    public void q0(float f10) {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean s() {
        return !this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0() {
        if (!(this instanceof z5) || this.X0) {
            return;
        }
        this.X0 = true;
        try {
            ((z5) this).updateColors();
        } catch (Exception e10) {
            a8.g(e10, true);
        } finally {
            this.X0 = false;
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = false;
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            if (this.g1 != null) {
                i0();
            } else {
                super.show();
            }
            F0(true);
            if (this.n0) {
                getWindow().setSoftInputMode(this.o0);
            }
            this.J = false;
            J();
            ViewGroup viewGroup = this.b;
            Point point = org.telegram.messenger.g0.q;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.u0 * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            boolean z10 = this.f0;
            s2 s2Var = this.Z;
            if (z10) {
                s2Var.setAlpha(this.p0 ? this.q0 : 0);
                this.b.setTranslationY(0.0f);
                h0();
                return;
            }
            s2Var.setAlpha(0);
            this.I = 2;
            this.b.setTranslationY(((1.0f - this.T0) * org.telegram.messenger.g0.m) + r1.getMeasuredHeight() + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) : 0));
            h0();
            long j10 = this.S0 ? 0L : 150L;
            if (this.E) {
                j10 = 500;
            }
            mi.b0 b0Var = new mi.b0(this, 15);
            this.H = b0Var;
            org.telegram.messenger.g0.i3(b0Var, j10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.h0 != systemWindowInsetTop) {
            this.h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.r0 = z10;
        if (z10) {
            return;
        }
        this.b.setTranslationY(0.0f);
        h0();
    }

    public final void v0(int i3) {
        this.s0.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
        if (this.a1 != i3) {
            this.a1 = i3;
            j2 j2Var = this.c;
            if (j2Var != null) {
                j2Var.invalidate(0, j2Var.getMeasuredHeight() - j2Var.x, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i3) {
        v0(k6.w0(i3, this.J0));
        Drawable drawable = this.s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.a1, PorterDuff.Mode.MULTIPLY);
        this.c1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.b1 = i3;
    }

    public final void x0(boolean z10) {
        this.i0 = z10;
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean y() {
        j2 j2Var = this.c;
        return j2Var != null && j2Var.isAttachedToWindow();
    }

    public final void y0() {
        this.p0 = false;
    }

    public final void z0() {
        this.q0 = 75;
    }

    public t2(Context context, boolean z10) {
        this(1, context, (e6) null, z10);
    }

    public t2(int i3, Context context, e6 e6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.a = h10.t0;
        int i10 = 1;
        this.K = true;
        s2 s2Var = new s2();
        this.Z = s2Var;
        this.a0 = true;
        int i11 = k6.h5;
        this.b0 = i11;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.h0 = org.telegram.messenger.g0.m;
        this.k0 = 400;
        this.l0 = xq.h;
        this.o0 = 16;
        this.p0 = true;
        this.q0 = 51;
        this.r0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = new ArrayList();
        this.y0 = new e2(this, i10);
        this.D0 = 0.0f;
        this.G0 = k6.a7;
        this.L0 = true;
        this.M0 = new g2.g((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new pi.q();
        this.Z0 = -1;
        this.b1 = i11;
        this.f1 = -1L;
        this.J0 = e6Var;
        if (i3 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.n = false;
            this.r = false;
            this.s = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i3 != 1) {
                this.o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        r2 r2Var = new r2(k2.p1.g(context, R.drawable.sheet_shadow_round));
        this.s0 = r2Var;
        int w02 = k6.w0(i11, this.J0);
        this.a1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.c1 = porterDuffColorFilter;
        r2Var.setColorFilter(porterDuffColorFilter);
        this.s0.getPadding(rect);
        this.u0 = rect.left;
        this.t0 = rect.top;
        j2 j2Var = new j2(this, getContext());
        this.c = j2Var;
        j2Var.setClipChildren(false);
        j2Var.setClipToPadding(false);
        j2Var.setBackground(s2Var);
        this.n0 = z10;
        if (i3 == 1) {
            j2Var.setFitsSystemWindows(true);
            j2Var.setOnApplyWindowInsetsListener(new ii.b2(this, i10));
        }
        if (i12 >= 30) {
            j2Var.setSystemUiVisibility(1792);
        } else {
            j2Var.setSystemUiVisibility(1280);
        }
        s2Var.setAlpha(0);
        if (i3 == 3) {
            i2 i2Var = new i2(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(j2Var, i2Var);
        }
    }

    public void D(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final /* synthetic */ void b(boolean z10) {
    }

    public r0.k1 b0(r0.k1 k1Var) {
        return k1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void h(int i3) {
    }

    public void d0() {
    }

    public void e0() {
    }

    public void h0() {
    }

    public void n0() {
    }

    public void p0() {
    }

    public void r0() {
    }

    public void v() {
    }

    public void E(ArrayList arrayList, boolean z10) {
    }
}
