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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class u2 extends Dialog implements a2 {
    public static final /* synthetic */ int l1 = 0;
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
    public j6.o H;
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
    public final h2.f M0;
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
    public final ri.q Y0;
    public final t2 Z;
    public g5 Z0;
    public int a;
    public boolean a0;
    public ri.a a1;
    public ViewGroup b;
    public int b0;
    public h5 b1;
    public final k2 c;
    public boolean c0;
    public int c1;
    public boolean d;
    public boolean d0;
    public int d1;
    public int e;
    public boolean e0;
    public int e1;
    public int f;
    public boolean f0;
    public PorterDuffColorFilter f1;
    public boolean g0;
    public boolean g1;
    public WindowInsets h;
    public int h0;
    public int h1;
    public boolean i0;
    public long i1;
    public final int j0;
    public e2 j1;
    public final int k0;
    public bg.v0 k1;
    public Interpolator l0;
    public l2 m0;
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
    public final f2 y0;
    public o2 z0;

    public u2(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, e6Var, z10);
    }

    public static void A(u2 u2Var) {
        int w02;
        Drawable drawable;
        int w03;
        k2 k2Var = u2Var.c;
        if (u2Var.e1 >= 0 && (drawable = u2Var.s0) != null && u2Var.f1 != null && drawable.getColorFilter() == u2Var.f1 && (w03 = j6.w0(u2Var.e1, u2Var.J0)) != u2Var.d1) {
            Drawable drawable2 = u2Var.s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            u2Var.f1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            u2Var.d1 = w03;
            if (k2Var != null) {
                k2Var.invalidate();
            }
            ViewGroup viewGroup = u2Var.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = u2Var.c1;
        if (i7 < 0 || u2Var.G0 >= 0 || u2Var.h1 != u2Var.H0 || (w02 = j6.w0(i7, u2Var.J0)) == u2Var.H0) {
            return;
        }
        u2Var.H0 = w02;
        u2Var.h1 = w02;
        if (k2Var != null) {
            k2Var.invalidate();
        }
        boolean z10 = ((double) org.telegram.messenger.g0.B(w02)) > 0.721d;
        if (u2Var.j1 != null) {
            org.telegram.messenger.g0.o3(k2Var, z10);
        } else {
            org.telegram.messenger.g0.t3(u2Var, w02, false, null);
            org.telegram.messenger.g0.n3(u2Var, z10);
        }
    }

    public static int B(u2 u2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (!u2Var.i0 || (windowInsets = u2Var.h) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (u2Var.d || !u2Var.n || systemGestureInsets == null) {
            return 0;
        }
        i7 = systemGestureInsets.left;
        if (i7 == 0) {
            i11 = systemGestureInsets.right;
            if (i11 == 0) {
                return 0;
            }
        }
        i10 = systemGestureInsets.bottom;
        return i10;
    }

    public static /* synthetic */ WindowInsets z(u2 u2Var, WindowInsets windowInsets) {
        u2Var.t0(windowInsets);
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
        duration.setInterpolator(er.f);
        duration.addUpdateListener(new g2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.x0;
            if (i7 >= arrayList.size()) {
                return;
            }
            n2 n2Var = (n2) arrayList.get(i7);
            n2Var.a.setTextColor(i10);
            n2Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i7) {
        this.h1 = i7;
        k2 k2Var = this.c;
        if (k2Var != null) {
            k2Var.invalidate();
        }
        if (this.j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            org.telegram.messenger.g0.o3(k2Var, org.telegram.messenger.g0.B(e(j6.w0(j6.a7, this.J0))) >= 0.721f);
        } else {
            org.telegram.messenger.g0.t3(this, this.h1, true, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.h1)) > 0.721d);
        }
    }

    public final void F0(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        if (this.N0 > 0) {
            if (z10) {
                ns.e().k(ns.j1, Integer.valueOf(this.N0));
            } else {
                ns.e().k(ns.k1, Integer.valueOf(this.N0));
            }
        }
    }

    public final void G0(boolean z10) {
        this.a0 = z10;
        int x02 = j6.x0(null, j6.s8, true);
        k2 k2Var = this.c;
        int systemUiVisibility = k2Var.getSystemUiVisibility();
        k2Var.setSystemUiVisibility((this.a0 && x02 == -1) ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        if (this.j1 != null) {
            LaunchActivity.H1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.c0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.d0;
    }

    public boolean J(MotionEvent motionEvent) {
        return false;
    }

    public void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = 0;
    }

    public void L() {
        e2 e2Var = this.j1;
        if (e2Var != null) {
            e2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.c);
        } else {
            try {
                super.dismiss();
            } catch (Exception e10) {
                a8.g(e10, false);
            }
        }
    }

    public void M(int i7) {
        Integer num;
        if (this.J) {
            return;
        }
        this.J = true;
        K();
        this.B0 = 2;
        this.A0 = new AnimatorSet();
        int i10 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, R())) + org.telegram.messenger.g0.L(10.0f) + S() + this.f);
        ofFloat.addUpdateListener(new g2(this, 2));
        this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
        this.A0.setDuration(this.X == 4 ? 330L : 180L);
        this.A0.setInterpolator(er.g);
        this.A0.addListener(new ki.j2(this, i7, 5));
        ns.e().k(ns.j1, 512);
        this.A0.start();
        if (this.X != 4 || (num = this.Y) == null) {
            return;
        }
        int intValue = num.intValue();
        ArrayList arrayList = this.x0;
        int currentTextColor = ((n2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
        int currentTextColor2 = ((n2) arrayList.get(i7)).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new g2(this, 3));
        ofArgb.setDuration(130L);
        er erVar = er.f;
        ofArgb.setInterpolator(erVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new h2(this, i7, i10));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(erVar);
        ofArgb2.start();
    }

    public final void O() {
        Q(j6.a7);
    }

    public final void P(int i7) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.G0 = -1;
        this.c1 = -1;
        this.H0 = i7;
        E0(i7);
    }

    public final void Q(int i7) {
        P(j6.w0(i7, this.J0));
        this.c1 = i7;
    }

    public int R() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int S() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int T() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.T0) * r0.getSystemWindowInsetLeft());
    }

    public final int U() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.T0) * r0.getSystemWindowInsetRight());
    }

    public ArrayList V() {
        return null;
    }

    public final int W(int i7) {
        return j6.w0(i7, this.J0);
    }

    public final boolean X() {
        return this.J;
    }

    public boolean Y(float f10, float f11) {
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

    @Override // org.telegram.ui.ActionBar.a2
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(e2 e2Var) {
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        if (e2Var == null || !e2Var.isSupportEdgeToEdge()) {
            this.j1 = e2Var;
            t2 t2Var = this.Z;
            if (t2Var != null) {
                ((Paint) t2Var.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final View d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j3;
        xb xbVar;
        o2 o2Var = this.z0;
        if ((o2Var == null || o2Var.x()) && !this.J) {
            int i7 = 1;
            this.J = true;
            g5 g5Var = this.Z0;
            if (g5Var != null) {
                g5Var.a(false);
            }
            DialogInterface.OnDismissListener onDismissListener = this.I0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            K();
            n0();
            int i10 = 2;
            if (this.O0) {
                org.telegram.messenger.g0.h3(new f2(this, i10));
            } else if (!this.e0 || !j0()) {
                org.telegram.messenger.g0.v1(this.c);
                this.B0 = 2;
                ValueAnimator valueAnimator = this.C0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 0.0f);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new g2(this, 5));
                this.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    if (this.W0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, org.telegram.messenger.g0.L(48.0f));
                        ofFloat2.addUpdateListener(new g2(this, 6));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, R())) + org.telegram.messenger.g0.L(10.0f) + S() + (this.g1 ? this.e : this.f));
                        ofFloat3.addUpdateListener(new g2(this, 7));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
                arrayList.add(this.C0);
                F(arrayList, false);
                this.A0.playTogether(arrayList);
                if (this.W0) {
                    this.A0.setDuration(200L);
                    this.A0.setInterpolator(er.f);
                    j3 = 0;
                } else {
                    j3 = 250;
                    this.A0.setDuration(250L);
                    this.A0.setInterpolator(er.g);
                }
                this.A0.addListener(new m2(this, i7));
                ns.e().k(ns.j1, 512);
                this.A0.start();
                xbVar = xb.w;
                if (xbVar != null && xbVar.l && xbVar.r) {
                    if (j3 <= 0) {
                        xbVar.c((long) (j3 * 0.6f), np.e1().getBoolean("view_animations", true));
                    } else {
                        xbVar.b();
                    }
                }
                F0(false);
            }
            j3 = 0;
            xbVar = xb.w;
            if (xbVar != null) {
                if (j3 <= 0) {
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

    @Override // org.telegram.ui.ActionBar.a2
    public final int e(int i7) {
        float f10;
        ViewGroup viewGroup;
        if (!y() || (viewGroup = this.b) == null) {
            f10 = 0.0f;
        } else if (this.W0) {
            f10 = viewGroup.getAlpha();
        } else {
            f10 = Utilities.l(1.0f - (this.b.getTranslationY() / ((org.telegram.messenger.g0.L(10.0f) + (S() + this.f)) + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, R())) : 0))));
        }
        return i0.a.f(f10, i7, this.H0);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public boolean f() {
        return this.a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        k2 k2Var = this.c;
        if (k2Var != null) {
            k2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i7;
        e2 e2Var = this.j1;
        k2 k2Var = this.c;
        int i10 = 0;
        if (e2Var != null) {
            e2Var.addSheet(this);
            if (this.j1.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.j1.getLayoutContainer().getWindowToken(), 2)) {
                org.telegram.messenger.g0.i3(new f2(this, i10), 80L);
            } else {
                org.telegram.messenger.g0.E2(k2Var);
                this.j1.getLayoutContainer().addView(k2Var);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(k2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        int i11 = 1;
        if (this.a0 && j6.x0(null, j6.s8, true) == -1) {
            k2Var.setSystemUiVisibility(k2Var.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        if (this.b == null) {
            bi.g2 g2Var = new bi.g2(11, getContext(), this);
            this.b = g2Var;
            g2Var.setBackgroundDrawable(this.s0);
            this.b.setPadding(this.u0, ((this.v0 ? org.telegram.messenger.g0.L(8.0f) : 0) + this.t0) - 1, this.u0, this.w0 ? org.telegram.messenger.g0.L(8.0f) : 0);
        }
        this.b.setVisibility(4);
        k2Var.addView(this.b, 0, ja.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            k2Var.addView(frameLayout, k2Var.indexOfChild(this.b) + 1, ja.e(-1, -2, 80));
        }
        if (this.P != null) {
            l2 l2Var = new l2(i10, getContext(), this);
            this.m0 = l2Var;
            l2Var.setText(this.P);
            if (this.Q) {
                q6.U(this.m0, j6.j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                this.m0.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(this.R ? 14.0f : 6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                q6.U(this.m0, j6.q5, this.J0);
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
            i7 = 48;
            this.b.addView(this.m0, ja.c(this.R ? -2.0f : 48, -1));
            this.m0.setOnTouchListener(new gi.a(i11));
        } else {
            i7 = 0;
        }
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            if (this.U0) {
                this.b.addView(this.O, ja.d(-1, -2.0f, this.V0, 0.0f, i7, 0.0f, 0.0f));
            } else {
                this.b.setClipToPadding(false);
                this.b.setClipChildren(false);
                k2Var.setClipToPadding(false);
                k2Var.setClipChildren(false);
                float f10 = i7;
                this.b.addView(this.O, ja.d(-1, -2.0f, this.V0, 0.0f, f10, 0.0f, 0.0f));
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
                    n2 n2Var = new n2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i12];
                    int[] iArr = this.N;
                    n2Var.a(charSequence, iArr != null ? iArr[i12] : 0, null, this.Q);
                    this.b.addView(n2Var, ja.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    n2Var.setTag(Integer.valueOf(i12));
                    n2Var.setOnClickListener(new hi.p5(this, 21));
                    this.x0.add(n2Var);
                }
                i12++;
            }
        }
        if (this.j1 == null && window != null) {
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
                k2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.g0.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean j() {
        return false;
    }

    public boolean j0() {
        return false;
    }

    public cc k() {
        return new cc(this.F, this.J0);
    }

    public boolean k0(View view, int i7, int i10, int i11, int i12) {
        return false;
    }

    public boolean l0(View view, int i7, int i10) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void n(Runnable runnable) {
        this.I0 = new i2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        g5 g5Var = this.Z0;
        if (g5Var != null && g5Var.E) {
            g5Var.a(true);
        } else if (this.j1 == null) {
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

    @Override // org.telegram.ui.ActionBar.a2
    public final void p() {
        onBackPressed();
    }

    public void q0(float f10) {
        k2 k2Var = this.c;
        if (k2Var != null) {
            k2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
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
            if (this.j1 != null) {
                i0();
            } else {
                super.show();
            }
            F0(true);
            if (this.n0) {
                getWindow().setSoftInputMode(this.o0);
            }
            this.J = false;
            K();
            ViewGroup viewGroup = this.b;
            Point point = org.telegram.messenger.g0.q;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.u0 * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            boolean z10 = this.f0;
            t2 t2Var = this.Z;
            if (z10) {
                t2Var.setAlpha(this.p0 ? this.q0 : 0);
                this.b.setTranslationY(0.0f);
                h0();
                return;
            }
            t2Var.setAlpha(0);
            this.I = 2;
            this.b.setTranslationY(((1.0f - this.T0) * org.telegram.messenger.g0.m) + r1.getMeasuredHeight() + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, R())) : 0));
            h0();
            long j3 = this.S0 ? 0L : 150L;
            if (this.E) {
                j3 = 500;
            }
            j6.o oVar = new j6.o(this, 19);
            this.H = oVar;
            org.telegram.messenger.g0.i3(oVar, j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
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

    public final void v0(int i7) {
        this.s0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.d1 != i7) {
            this.d1 = i7;
            k2 k2Var = this.c;
            if (k2Var != null) {
                k2Var.invalidate(0, k2Var.getMeasuredHeight() - k2Var.x, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(j6.w0(i7, this.J0));
        Drawable drawable = this.s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.d1, PorterDuff.Mode.MULTIPLY);
        this.f1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.e1 = i7;
    }

    public final void x0(boolean z10) {
        this.i0 = z10;
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean y() {
        k2 k2Var = this.c;
        return k2Var != null && k2Var.isAttachedToWindow();
    }

    public final void y0() {
        this.p0 = false;
    }

    public final void z0() {
        this.q0 = 75;
    }

    public u2(Context context, boolean z10) {
        this(1, context, (e6) null, z10);
    }

    public u2(int i7, Context context, e6 e6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.a = m10.t0;
        int i10 = 1;
        this.K = true;
        t2 t2Var = new t2();
        this.Z = t2Var;
        this.a0 = true;
        int i11 = j6.h5;
        this.b0 = i11;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.h0 = org.telegram.messenger.g0.m;
        this.k0 = 400;
        this.l0 = er.h;
        this.o0 = 16;
        this.p0 = true;
        this.q0 = 51;
        this.r0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = new ArrayList();
        this.y0 = new f2(this, i10);
        this.D0 = 0.0f;
        this.G0 = j6.a7;
        this.L0 = true;
        this.M0 = new h2.f((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new ri.q();
        this.c1 = -1;
        this.e1 = i11;
        this.i1 = -1L;
        this.J0 = e6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.n = false;
            this.r = false;
            this.s = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        s2 s2Var = new s2(i5.c.g(context, R.drawable.sheet_shadow_round));
        this.s0 = s2Var;
        int w02 = j6.w0(i11, this.J0);
        this.d1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f1 = porterDuffColorFilter;
        s2Var.setColorFilter(porterDuffColorFilter);
        this.s0.getPadding(rect);
        this.u0 = rect.left;
        this.t0 = rect.top;
        k2 k2Var = new k2(this, getContext());
        this.c = k2Var;
        k2Var.setClipChildren(false);
        k2Var.setClipToPadding(false);
        k2Var.setBackground(t2Var);
        this.n0 = z10;
        if (i7 == 1) {
            k2Var.setFitsSystemWindows(true);
            k2Var.setOnApplyWindowInsetsListener(new ki.b2(this, i10));
        }
        if (i12 >= 30) {
            k2Var.setSystemUiVisibility(1792);
        } else {
            k2Var.setSystemUiVisibility(1280);
        }
        t2Var.setAlpha(0);
        if (i7 == 3) {
            j2 j2Var = new j2(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(k2Var, j2Var);
        }
    }

    public void D(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final /* synthetic */ void b(boolean z10) {
    }

    public r0.k1 b0(r0.k1 k1Var) {
        return k1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void h(int i7) {
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

    public void F(ArrayList arrayList, boolean z10) {
    }
}
