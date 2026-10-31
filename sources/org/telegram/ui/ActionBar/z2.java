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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class z2 extends Dialog implements g2 {
    public static final /* synthetic */ int h1 = 0;
    public int A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D;
    public boolean D0;
    public FrameLayout E;
    public float E0;
    public boolean F;
    public int F0;
    public mg.c2 G;
    public int G0;
    public int H;
    public DialogInterface.OnDismissListener H0;
    public boolean I;
    public p6 I0;
    public final boolean J;
    public boolean J0;
    public DialogInterface.OnClickListener K;
    public boolean K0;
    public CharSequence[] L;
    public final e2.f L0;
    public int[] M;
    public int M0;
    public ViewGroup N;
    public boolean N0;
    public CharSequence O;
    public ValueAnimator O0;
    public boolean P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public float S0;
    public int T;
    public boolean T0;
    public boolean U;
    public int U0;
    public boolean V;
    public boolean V0;
    public int W;
    public boolean W0;
    public Integer X;
    public final ei.r X0;
    public final y2 Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int a;
    public int a0;
    public int a1;
    public ViewGroup b;
    public boolean b0;
    public PorterDuffColorFilter b1;
    public final p2 c;
    public boolean c0;
    public boolean c1;
    public boolean d;
    public boolean d0;
    public int d1;
    public int e;
    public boolean e0;
    public long e1;
    public int f;
    public boolean f0;
    public k2 f1;
    public int g0;
    public c5.e g1;
    public WindowInsets h;
    public boolean h0;
    public final int i0;
    public final int j0;
    public Interpolator k0;
    public q2 l0;
    public boolean m0;
    public boolean n;
    public final int n0;
    public boolean o0;
    public int p0;
    public boolean q0;
    public boolean r;
    public Drawable r0;
    public boolean s;
    public int s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public final ArrayList w0;
    public boolean x;
    public final mg.l1 x0;
    public boolean y;
    public t2 y0;
    public AnimatorSet z0;

    public z2(Context context, p6 p6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, p6Var, z10);
    }

    public static /* synthetic */ WindowInsets A(z2 z2Var, WindowInsets windowInsets) {
        z2Var.t0(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void B(z2 z2Var) {
        int w02;
        Drawable drawable;
        int w03;
        p2 p2Var = z2Var.c;
        if (z2Var.a1 >= 0 && (drawable = z2Var.r0) != null && z2Var.b1 != null && drawable.getColorFilter() == z2Var.b1 && (w03 = t6.w0(z2Var.a1, z2Var.I0)) != z2Var.Z0) {
            Drawable drawable2 = z2Var.r0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            z2Var.b1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            z2Var.Z0 = w03;
            if (p2Var != null) {
                p2Var.invalidate();
            }
            ViewGroup viewGroup = z2Var.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i10 = z2Var.Y0;
        if (i10 < 0 || z2Var.F0 >= 0 || z2Var.d1 != z2Var.G0 || (w02 = t6.w0(i10, z2Var.I0)) == z2Var.G0) {
            return;
        }
        z2Var.G0 = w02;
        z2Var.d1 = w02;
        if (p2Var != null) {
            p2Var.invalidate();
        }
        boolean z10 = ((double) org.telegram.messenger.i0.B(w02)) > 0.721d;
        if (z2Var.f1 != null) {
            org.telegram.messenger.i0.n3(p2Var, z10);
        } else {
            org.telegram.messenger.i0.t3(z2Var, w02, false, null);
            org.telegram.messenger.i0.m3(z2Var, z10);
        }
    }

    public static int D(z2 z2Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (!z2Var.h0 || (windowInsets = z2Var.h) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (z2Var.d || !z2Var.n || systemGestureInsets == null) {
            return 0;
        }
        i10 = systemGestureInsets.left;
        if (i10 == 0) {
            i12 = systemGestureInsets.right;
            if (i12 == 0) {
                return 0;
            }
        }
        i11 = systemGestureInsets.bottom;
        return i11;
    }

    public final void A0(boolean z10) {
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.m0) {
            attributes.softInputMode = this.n0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void B0(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.S0, z10 ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(gr.f);
        duration.addUpdateListener(new l2(this, 4));
        duration.start();
    }

    public final void C0(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.w0;
            if (i10 >= arrayList.size()) {
                return;
            }
            s2 s2Var = (s2) arrayList.get(i10);
            s2Var.a.setTextColor(i11);
            s2Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void D0() {
        this.R0 = true;
    }

    public void E0(int i10) {
        this.d1 = i10;
        p2 p2Var = this.c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
        if (this.f1 != null) {
            LaunchActivity.I1.F(true, true, true);
            org.telegram.messenger.i0.n3(p2Var, org.telegram.messenger.i0.B(e(t6.w0(t6.a7, this.I0))) >= 0.721f);
        } else {
            org.telegram.messenger.i0.t3(this, this.d1, true, null);
            org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(this.d1)) > 0.721d);
        }
    }

    public final void F0(boolean z10) {
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        if (this.M0 > 0) {
            if (z10) {
                zs.e().k(zs.j1, Integer.valueOf(this.M0));
            } else {
                zs.e().k(zs.k1, Integer.valueOf(this.M0));
            }
        }
    }

    public final void G0(boolean z10) {
        this.Z = z10;
        int x02 = t6.x0(null, t6.s8, true);
        p2 p2Var = this.c;
        int systemUiVisibility = p2Var.getSystemUiVisibility();
        p2Var.setSystemUiVisibility((this.Z && x02 == -1) ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        if (this.f1 != null) {
            LaunchActivity.I1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.b0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.c0;
    }

    public boolean J(MotionEvent motionEvent) {
        return false;
    }

    public void K() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.z0 = null;
        }
        this.A0 = 0;
    }

    public void L() {
        k2 k2Var = this.f1;
        if (k2Var != null) {
            k2Var.removeSheet(this);
            org.telegram.messenger.i0.E2(this.c);
        } else {
            try {
                super.dismiss();
            } catch (Exception e) {
                f8.g(e, false);
            }
        }
    }

    public void N(int i10) {
        Integer num;
        if (this.I) {
            return;
        }
        int i11 = 1;
        this.I = true;
        K();
        this.A0 = 2;
        this.z0 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.i0.n, R())) + org.telegram.messenger.i0.L(10.0f) + S() + this.f);
        ofFloat.addUpdateListener(new l2(this, 2));
        this.z0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.i6.d, 0));
        this.z0.setDuration(this.W == 4 ? 330L : 180L);
        this.z0.setInterpolator(gr.g);
        int i12 = 3;
        this.z0.addListener(new bi.d5(this, i10, i12));
        zs.e().k(zs.j1, 512);
        this.z0.start();
        if (this.W != 4 || (num = this.X) == null) {
            return;
        }
        int intValue = num.intValue();
        ArrayList arrayList = this.w0;
        int currentTextColor = ((s2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
        int currentTextColor2 = ((s2) arrayList.get(i10)).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new l2(this, i12));
        ofArgb.setDuration(130L);
        gr grVar = gr.f;
        ofArgb.setInterpolator(grVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new nh.b(this, i10, i11));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(grVar);
        ofArgb2.start();
    }

    public final void O() {
        Q(t6.a7);
    }

    public final void P(int i10) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.F0 = -1;
        this.Y0 = -1;
        this.G0 = i10;
        E0(i10);
    }

    public final void Q(int i10) {
        P(t6.w0(i10, this.I0));
        this.Y0 = i10;
    }

    public int R() {
        return (int) ((1.0f - this.S0) * this.R);
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
        return (int) ((1.0f - this.S0) * r0.getSystemWindowInsetLeft());
    }

    public final int U() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.S0) * r0.getSystemWindowInsetRight());
    }

    public ArrayList V() {
        return null;
    }

    public final int W(int i10) {
        return t6.w0(i10, this.I0);
    }

    public final boolean X() {
        return this.I;
    }

    public boolean Y(float f7, float f10) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f10 >= childAt.getY() + this.E.getY()) {
                if (f10 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.E.getX()) {
                        if (f7 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f10 < ((float) this.b.getTop()) || f7 < ((float) this.b.getLeft()) || f7 > ((float) this.b.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(k2 k2Var) {
        if (org.telegram.messenger.i0.Q1()) {
            return;
        }
        if (k2Var == null || !k2Var.isSupportEdgeToEdge()) {
            this.f1 = k2Var;
            y2 y2Var = this.Y;
            if (y2Var != null) {
                ((Paint) y2Var.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j10;
        wb wbVar;
        t2 t2Var = this.y0;
        if ((t2Var == null || t2Var.y()) && !this.I) {
            int i10 = 1;
            this.I = true;
            DialogInterface.OnDismissListener onDismissListener = this.H0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            K();
            n0();
            if (this.N0) {
                org.telegram.messenger.i0.g3(new mg.l1(this, 3));
            } else if (!this.d0 || !j0()) {
                org.telegram.messenger.i0.v1(this.c);
                this.A0 = 2;
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 0.0f);
                this.B0 = ofFloat;
                ofFloat.addUpdateListener(new l2(this, 5));
                this.z0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    if (this.V0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, org.telegram.messenger.i0.L(48.0f));
                        ofFloat2.addUpdateListener(new l2(this, 6));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.i0.n, R())) + org.telegram.messenger.i0.L(10.0f) + S() + (this.c1 ? this.e : this.f));
                        ofFloat3.addUpdateListener(new l2(this, 7));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.i6.d, 0));
                arrayList.add(this.B0);
                G(arrayList, false);
                this.z0.playTogether(arrayList);
                if (this.V0) {
                    this.z0.setDuration(200L);
                    this.z0.setInterpolator(gr.f);
                    j10 = 0;
                } else {
                    j10 = 250;
                    this.z0.setDuration(250L);
                    this.z0.setInterpolator(gr.g);
                }
                this.z0.addListener(new r2(this, i10));
                zs.e().k(zs.j1, 512);
                this.z0.start();
                wbVar = wb.w;
                if (wbVar != null && wbVar.l && wbVar.r) {
                    if (j10 <= 0) {
                        wbVar.c((long) (j10 * 0.6f), vp.d1().getBoolean("view_animations", true));
                    } else {
                        wbVar.b();
                    }
                }
                F0(false);
            }
            j10 = 0;
            wbVar = wb.w;
            if (wbVar != null) {
                if (j10 <= 0) {
                }
            }
            F0(false);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int e(int i10) {
        float f7;
        ViewGroup viewGroup;
        if (!z() || (viewGroup = this.b) == null) {
            f7 = 0.0f;
        } else if (this.V0) {
            f7 = viewGroup.getAlpha();
        } else {
            f7 = Utilities.l(1.0f - (this.b.getTranslationY() / ((org.telegram.messenger.i0.L(10.0f) + (S() + this.f)) + (this.w ? Math.max(0, Math.min(org.telegram.messenger.i0.n, R())) : 0))));
        }
        return i0.b.f(f7, i10, this.G0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean f() {
        return this.Z;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f7) {
        p2 p2Var = this.c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i10;
        k2 k2Var = this.f1;
        int i11 = 1;
        p2 p2Var = this.c;
        if (k2Var != null) {
            k2Var.addSheet(this);
            if (this.f1.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1.getLayoutContainer().getWindowToken(), 2)) {
                org.telegram.messenger.i0.h3(new mg.l1(this, i11), 80L);
            } else {
                org.telegram.messenger.i0.E2(p2Var);
                this.f1.getLayoutContainer().addView(p2Var);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(p2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.Z && t6.x0(null, t6.s8, true) == -1) {
            p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        int i12 = 0;
        if (this.b == null) {
            jg.l0 l0Var = new jg.l0(this, getContext(), 8);
            this.b = l0Var;
            l0Var.setBackgroundDrawable(this.r0);
            this.b.setPadding(this.t0, ((this.u0 ? org.telegram.messenger.i0.L(8.0f) : 0) + this.s0) - 1, this.t0, this.v0 ? org.telegram.messenger.i0.L(8.0f) : 0);
        }
        this.b.setVisibility(4);
        p2Var.addView(this.b, 0, w7.b6.e(-1, -2, 80));
        if (this.E == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.E = frameLayout;
            p2Var.addView(frameLayout, p2Var.indexOfChild(this.b) + 1, w7.b6.e(-1, -2, 80));
        }
        if (this.O != null) {
            q2 q2Var = new q2(this, getContext(), i12);
            this.l0 = q2Var;
            q2Var.setText(this.O);
            if (this.P) {
                a7.V(this.l0, t6.j5, this.I0);
                this.l0.setTextSize(1, 20.0f);
                this.l0.setTypeface(org.telegram.messenger.i0.o());
                this.l0.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(this.Q ? 14.0f : 6.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(8.0f));
            } else {
                a7.V(this.l0, t6.q5, this.I0);
                this.l0.setTextSize(1, 16.0f);
                this.l0.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(this.Q ? 8.0f : 0.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
            }
            if (this.Q) {
                this.l0.setSingleLine(false);
                this.l0.setMaxLines(5);
                this.l0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.l0.setLines(1);
                this.l0.setSingleLine(true);
                this.l0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.l0.setGravity(16);
            i10 = 48;
            this.b.addView(this.l0, w7.b6.c(this.Q ? -2.0f : 48, -1));
            this.l0.setOnTouchListener(new n2(i12));
        } else {
            i10 = 0;
        }
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.N.getParent()).removeView(this.N);
            }
            if (this.T0) {
                this.b.addView(this.N, w7.b6.d(-1, -2.0f, this.U0, 0.0f, i10, 0.0f, 0.0f));
            } else {
                this.b.setClipToPadding(false);
                this.b.setClipChildren(false);
                p2Var.setClipToPadding(false);
                p2Var.setClipChildren(false);
                float f7 = i10;
                this.b.addView(this.N, w7.b6.d(-1, -2.0f, this.U0, 0.0f, f7, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(f7) + (-this.s0);
            }
        } else if (this.L != null) {
            int i13 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i13 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i13] != null) {
                    s2 s2Var = new s2(this.W, getContext(), this.I0);
                    CharSequence charSequence = this.L[i13];
                    int[] iArr = this.M;
                    s2Var.a(charSequence, iArr != null ? iArr[i13] : 0, null, this.P);
                    this.b.addView(s2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    s2Var.setTag(Integer.valueOf(i13));
                    s2Var.setOnClickListener(new ag.g(this, 18));
                    this.w0.add(s2Var);
                }
                i13++;
            }
        }
        if (this.f1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i14 = attributes.flags & (-3);
            attributes.flags = i14;
            if (this.m0) {
                attributes.softInputMode = this.n0;
            } else {
                attributes.flags = i14 | 131072;
            }
            if (this.V) {
                attributes.flags |= -2147416832;
                p2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.i0.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean j() {
        return false;
    }

    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public cc k() {
        return new cc(this.E, this.I0);
    }

    public boolean k0(View view, int i10, int i11, int i12, int i13) {
        return false;
    }

    public boolean l0(View view, int i10, int i11) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void o(Runnable runnable) {
        this.H0 = new m2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.f1 == null) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void p() {
        onBackPressed();
    }

    public void q0(float f7) {
        p2 p2Var = this.c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean s() {
        return !this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0() {
        if (!(this instanceof k6) || this.W0) {
            return;
        }
        this.W0 = true;
        try {
            ((k6) this).updateColors();
        } catch (Exception e) {
            f8.g(e, true);
        } finally {
            this.W0 = false;
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.O = charSequence;
        this.P = false;
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            if (this.f1 != null) {
                i0();
            } else {
                super.show();
            }
            F0(true);
            if (this.m0) {
                getWindow().setSoftInputMode(this.n0);
            }
            this.I = false;
            K();
            ViewGroup viewGroup = this.b;
            Point point = org.telegram.messenger.i0.q;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.t0 * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            boolean z10 = this.e0;
            y2 y2Var = this.Y;
            if (z10) {
                y2Var.setAlpha(this.o0 ? this.p0 : 0);
                this.b.setTranslationY(0.0f);
                h0();
                return;
            }
            y2Var.setAlpha(0);
            this.H = 2;
            this.b.setTranslationY(((1.0f - this.S0) * org.telegram.messenger.i0.m) + r1.getMeasuredHeight() + (this.w ? Math.max(0, Math.min(org.telegram.messenger.i0.n, R())) : 0));
            h0();
            long j10 = this.R0 ? 0L : 150L;
            if (this.D) {
                j10 = 500;
            }
            mg.c2 c2Var = new mg.c2(this, 14);
            this.G = c2Var;
            org.telegram.messenger.i0.h3(c2Var, j10);
        }
    }

    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.i0.E) && this.g0 != systemWindowInsetTop) {
            this.g0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.q0 = z10;
        if (z10) {
            return;
        }
        this.b.setTranslationY(0.0f);
        h0();
    }

    public final void v0(int i10) {
        this.r0.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        if (this.Z0 != i10) {
            this.Z0 = i10;
            p2 p2Var = this.c;
            if (p2Var != null) {
                p2Var.invalidate(0, p2Var.getMeasuredHeight() - p2Var.x, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i10) {
        v0(t6.w0(i10, this.I0));
        Drawable drawable = this.r0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.Z0, PorterDuff.Mode.MULTIPLY);
        this.b1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.a1 = i10;
    }

    public final void x0(boolean z10) {
        this.h0 = z10;
        this.n = z10;
    }

    public final void y0() {
        this.o0 = false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean z() {
        p2 p2Var = this.c;
        return p2Var != null && p2Var.isAttachedToWindow();
    }

    public final void z0() {
        this.p0 = 75;
    }

    public z2(Context context, boolean z10) {
        this(1, context, (p6) null, z10);
    }

    public z2(int i10, Context context, p6 p6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.a = d20.s0;
        this.J = true;
        y2 y2Var = new y2();
        this.Y = y2Var;
        this.Z = true;
        int i11 = t6.h5;
        this.a0 = i11;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.g0 = org.telegram.messenger.i0.m;
        this.j0 = 400;
        this.k0 = gr.h;
        this.n0 = 16;
        this.o0 = true;
        this.p0 = 51;
        this.q0 = true;
        this.u0 = true;
        this.v0 = true;
        this.w0 = new ArrayList();
        this.x0 = new mg.l1(this, 2);
        this.C0 = 0.0f;
        this.F0 = t6.a7;
        this.K0 = true;
        this.L0 = new e2.f(null);
        this.T0 = true;
        this.U0 = 51;
        this.X0 = new ei.r();
        this.Y0 = -1;
        this.a1 = i11;
        this.e1 = -1L;
        this.I0 = p6Var;
        int i12 = 0;
        if (i10 == 3) {
            org.telegram.messenger.i0.S(getWindow());
            this.n = false;
            this.r = false;
            this.s = false;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i10 != 1) {
                this.n0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        x2 x2Var = new x2(i0.a.f(context, R.drawable.sheet_shadow_round));
        this.r0 = x2Var;
        int w02 = t6.w0(i11, this.I0);
        this.Z0 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.b1 = porterDuffColorFilter;
        x2Var.setColorFilter(porterDuffColorFilter);
        this.r0.getPadding(rect);
        this.t0 = rect.left;
        this.s0 = rect.top;
        p2 p2Var = new p2(this, getContext());
        this.c = p2Var;
        p2Var.setClipChildren(false);
        p2Var.setClipToPadding(false);
        p2Var.setBackground(y2Var);
        this.m0 = z10;
        if (i10 == 1) {
            p2Var.setFitsSystemWindows(true);
            p2Var.setOnApplyWindowInsetsListener(new o2(this, i12));
        }
        if (i13 >= 30) {
            p2Var.setSystemUiVisibility(1792);
        } else {
            p2Var.setSystemUiVisibility(1280);
        }
        y2Var.setAlpha(0);
        if (i10 == 3) {
            mg.c cVar = new mg.c(this);
            WeakHashMap weakHashMap = r0.h0.a;
            r0.z.i(p2Var, cVar);
        }
    }

    public void F(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final /* synthetic */ void b(boolean z10) {
    }

    public r0.j1 b0(r0.j1 j1Var) {
        return j1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void h(int i10) {
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

    public void w() {
    }

    public void G(ArrayList arrayList, boolean z10) {
    }
}
