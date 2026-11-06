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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class v2 extends Dialog implements b2 {
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
    public m.f3 G;
    public int G0;
    public int H;
    public DialogInterface.OnDismissListener H0;
    public boolean I;
    public f6 I0;
    public final boolean J;
    public boolean J0;
    public DialogInterface.OnClickListener K;
    public boolean K0;
    public CharSequence[] L;
    public final h2.f L0;
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
    public final oi.q X0;
    public final u2 Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int a;
    public int a0;
    public int a1;
    public ViewGroup b;
    public boolean b0;
    public PorterDuffColorFilter b1;
    public final l2 c;
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
    public f2 f1;
    public int g0;
    public bg.w0 g1;
    public WindowInsets h;
    public boolean h0;
    public final int i0;
    public final int j0;
    public Interpolator k0;
    public m2 l0;
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
    public final g2 x0;
    public boolean y;
    public p2 y0;
    public AnimatorSet z0;

    public v2(Context context, f6 f6Var, boolean z9, boolean z10) {
        this(z10 ? 2 : 1, context, f6Var, z9);
    }

    public static void A(v2 v2Var) {
        int w02;
        Drawable drawable;
        int w03;
        l2 l2Var = v2Var.c;
        if (v2Var.a1 >= 0 && (drawable = v2Var.r0) != null && v2Var.b1 != null && drawable.getColorFilter() == v2Var.b1 && (w03 = k6.w0(v2Var.a1, v2Var.I0)) != v2Var.Z0) {
            Drawable drawable2 = v2Var.r0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            v2Var.b1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            v2Var.Z0 = w03;
            if (l2Var != null) {
                l2Var.invalidate();
            }
            ViewGroup viewGroup = v2Var.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = v2Var.Y0;
        if (i7 < 0 || v2Var.F0 >= 0 || v2Var.d1 != v2Var.G0 || (w02 = k6.w0(i7, v2Var.I0)) == v2Var.G0) {
            return;
        }
        v2Var.G0 = w02;
        v2Var.d1 = w02;
        if (l2Var != null) {
            l2Var.invalidate();
        }
        boolean z9 = ((double) org.telegram.messenger.g0.B(w02)) > 0.721d;
        if (v2Var.f1 != null) {
            org.telegram.messenger.g0.o3(l2Var, z9);
        } else {
            org.telegram.messenger.g0.u3(v2Var, w02, false, null);
            org.telegram.messenger.g0.n3(v2Var, z9);
        }
    }

    public static int B(v2 v2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (!v2Var.h0 || (windowInsets = v2Var.h) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (v2Var.d || !v2Var.n || systemGestureInsets == null) {
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

    public static /* synthetic */ WindowInsets z(v2 v2Var, WindowInsets windowInsets) {
        v2Var.t0(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z9) {
        if (this.m0 == z9) {
            return;
        }
        this.m0 = z9;
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

    public final void B0(boolean z9) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.S0, z9 ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(xq.f);
        duration.addUpdateListener(new h2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.w0;
            if (i7 >= arrayList.size()) {
                return;
            }
            o2 o2Var = (o2) arrayList.get(i7);
            o2Var.a.setTextColor(i10);
            o2Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void D0() {
        this.R0 = true;
    }

    public void E0(int i7) {
        this.d1 = i7;
        l2 l2Var = this.c;
        if (l2Var != null) {
            l2Var.invalidate();
        }
        if (this.f1 != null) {
            LaunchActivity.G1.F(true, true, true);
            org.telegram.messenger.g0.o3(l2Var, org.telegram.messenger.g0.B(e(k6.w0(k6.a7, this.I0))) >= 0.721f);
        } else {
            org.telegram.messenger.g0.u3(this, this.d1, true, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.d1)) > 0.721d);
        }
    }

    public final void F0(boolean z9) {
        if (this.f0 == z9) {
            return;
        }
        this.f0 = z9;
        if (this.M0 > 0) {
            if (z9) {
                qs.e().k(qs.j1, Integer.valueOf(this.M0));
            } else {
                qs.e().k(qs.k1, Integer.valueOf(this.M0));
            }
        }
    }

    public boolean G() {
        return this.b0;
    }

    public final void G0(boolean z9) {
        this.Z = z9;
        int x02 = k6.x0(null, k6.s8, true);
        l2 l2Var = this.c;
        int systemUiVisibility = l2Var.getSystemUiVisibility();
        l2Var.setSystemUiVisibility((this.Z && x02 == -1) ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        if (this.f1 != null) {
            LaunchActivity.G1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.c0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I(MotionEvent motionEvent) {
        return false;
    }

    public void J() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.z0 = null;
        }
        this.A0 = 0;
    }

    public void K() {
        f2 f2Var = this.f1;
        if (f2Var != null) {
            f2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.c);
        } else {
            try {
                super.dismiss();
            } catch (Exception e10) {
                a8.g(e10, false);
            }
        }
    }

    public void L(int i7) {
        Integer num;
        if (this.I) {
            return;
        }
        this.I = true;
        J();
        this.A0 = 2;
        this.z0 = new AnimatorSet();
        int i10 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + this.f);
        ofFloat.addUpdateListener(new h2(this, 2));
        this.z0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.m6.d, 0));
        this.z0.setDuration(this.W == 4 ? 330L : 180L);
        this.z0.setInterpolator(xq.g);
        this.z0.addListener(new hi.m2(this, i7, 5));
        qs.e().k(qs.j1, 512);
        this.z0.start();
        if (this.W != 4 || (num = this.X) == null) {
            return;
        }
        int intValue = num.intValue();
        ArrayList arrayList = this.w0;
        int currentTextColor = ((o2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
        int currentTextColor2 = ((o2) arrayList.get(i7)).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new h2(this, 3));
        ofArgb.setDuration(130L);
        xq xqVar = xq.f;
        ofArgb.setInterpolator(xqVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new i2(this, i7, i10));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(xqVar);
        ofArgb2.start();
    }

    public final void N() {
        P(k6.a7);
    }

    public final void O(int i7) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.F0 = -1;
        this.Y0 = -1;
        this.G0 = i7;
        E0(i7);
    }

    public final void P(int i7) {
        O(k6.w0(i7, this.I0));
        this.Y0 = i7;
    }

    public int Q() {
        return (int) ((1.0f - this.S0) * this.R);
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
        return (int) ((1.0f - this.S0) * r0.getSystemWindowInsetLeft());
    }

    public final int T() {
        if (this.h == null) {
            return 0;
        }
        return (int) ((1.0f - this.S0) * r0.getSystemWindowInsetRight());
    }

    public ArrayList U() {
        return null;
    }

    public final int V(int i7) {
        return k6.w0(i7, this.I0);
    }

    public final boolean W() {
        return this.I;
    }

    public boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f11 >= childAt.getY() + this.E.getY()) {
                if (f11 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.E.getX()) {
                        if (f10 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f11 < ((float) this.b.getTop()) || f10 < ((float) this.b.getLeft()) || f10 > ((float) this.b.getRight());
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void a(boolean z9) {
        dismiss();
    }

    public final void a0(f2 f2Var) {
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        if (f2Var == null || !f2Var.isSupportEdgeToEdge()) {
            this.f1 = f2Var;
            u2 u2Var = this.Y;
            if (u2Var != null) {
                ((Paint) u2Var.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final View d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j3;
        cc ccVar;
        p2 p2Var = this.y0;
        if ((p2Var == null || p2Var.x()) && !this.I) {
            int i7 = 1;
            this.I = true;
            DialogInterface.OnDismissListener onDismissListener = this.H0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            J();
            n0();
            int i10 = 2;
            if (this.N0) {
                org.telegram.messenger.g0.h3(new g2(this, i10));
            } else if (!this.d0 || !j0()) {
                org.telegram.messenger.g0.v1(this.c);
                this.A0 = 2;
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 0.0f);
                this.B0 = ofFloat;
                ofFloat.addUpdateListener(new h2(this, 5));
                this.z0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    if (this.V0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, org.telegram.messenger.g0.L(48.0f));
                        ofFloat2.addUpdateListener(new h2(this, 6));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + (this.c1 ? this.e : this.f));
                        ofFloat3.addUpdateListener(new h2(this, 7));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.m6.d, 0));
                arrayList.add(this.B0);
                E(arrayList, false);
                this.z0.playTogether(arrayList);
                if (this.V0) {
                    this.z0.setDuration(200L);
                    this.z0.setInterpolator(xq.f);
                    j3 = 0;
                } else {
                    j3 = 250;
                    this.z0.setDuration(250L);
                    this.z0.setInterpolator(xq.g);
                }
                this.z0.addListener(new n2(this, i7));
                qs.e().k(qs.j1, 512);
                this.z0.start();
                ccVar = cc.w;
                if (ccVar != null && ccVar.l && ccVar.r) {
                    if (j3 <= 0) {
                        ccVar.c((long) (j3 * 0.6f), qp.e1().getBoolean("view_animations", true));
                    } else {
                        ccVar.b();
                    }
                }
                F0(false);
            }
            j3 = 0;
            ccVar = cc.w;
            if (ccVar != null) {
                if (j3 <= 0) {
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

    @Override // org.telegram.ui.ActionBar.b2
    public final int e(int i7) {
        float f10;
        ViewGroup viewGroup;
        if (!y() || (viewGroup = this.b) == null) {
            f10 = 0.0f;
        } else if (this.V0) {
            f10 = viewGroup.getAlpha();
        } else {
            f10 = Utilities.l(1.0f - (this.b.getTranslationY() / ((org.telegram.messenger.g0.L(10.0f) + (R() + this.f)) + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) : 0))));
        }
        return i0.a.f(f10, i7, this.G0);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public boolean f() {
        return this.Z;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        l2 l2Var = this.c;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i7;
        f2 f2Var = this.f1;
        l2 l2Var = this.c;
        int i10 = 0;
        if (f2Var != null) {
            f2Var.addSheet(this);
            if (this.f1.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1.getLayoutContainer().getWindowToken(), 2)) {
                org.telegram.messenger.g0.i3(new g2(this, i10), 80L);
            } else {
                org.telegram.messenger.g0.E2(l2Var);
                this.f1.getLayoutContainer().addView(l2Var);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(l2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        int i11 = 1;
        if (this.Z && k6.x0(null, k6.s8, true) == -1) {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        if (this.b == null) {
            bi.e5 e5Var = new bi.e5(10, getContext(), this);
            this.b = e5Var;
            e5Var.setBackgroundDrawable(this.r0);
            this.b.setPadding(this.t0, ((this.u0 ? org.telegram.messenger.g0.L(8.0f) : 0) + this.s0) - 1, this.t0, this.v0 ? org.telegram.messenger.g0.L(8.0f) : 0);
        }
        this.b.setVisibility(4);
        l2Var.addView(this.b, 0, ha.e(-1, -2, 80));
        if (this.E == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.E = frameLayout;
            l2Var.addView(frameLayout, l2Var.indexOfChild(this.b) + 1, ha.e(-1, -2, 80));
        }
        if (this.O != null) {
            m2 m2Var = new m2(i10, getContext(), this);
            this.l0 = m2Var;
            m2Var.setText(this.O);
            if (this.P) {
                r6.V(this.l0, k6.j5, this.I0);
                this.l0.setTextSize(1, 20.0f);
                this.l0.setTypeface(org.telegram.messenger.g0.o());
                this.l0.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(this.Q ? 14.0f : 6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                r6.V(this.l0, k6.q5, this.I0);
                this.l0.setTextSize(1, 16.0f);
                this.l0.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(this.Q ? 8.0f : 0.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
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
            i7 = 48;
            this.b.addView(this.l0, ha.c(this.Q ? -2.0f : 48, -1));
            this.l0.setOnTouchListener(new ei.b(i11));
        } else {
            i7 = 0;
        }
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.N.getParent()).removeView(this.N);
            }
            if (this.T0) {
                this.b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, i7, 0.0f, 0.0f));
            } else {
                this.b.setClipToPadding(false);
                this.b.setClipChildren(false);
                l2Var.setClipToPadding(false);
                l2Var.setClipChildren(false);
                float f10 = i7;
                this.b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, f10, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f10) + (-this.s0);
            }
        } else if (this.L != null) {
            int i12 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i12 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i12] != null) {
                    o2 o2Var = new o2(this.W, getContext(), this.I0);
                    CharSequence charSequence = this.L[i12];
                    int[] iArr = this.M;
                    o2Var.a(charSequence, iArr != null ? iArr[i12] : 0, null, this.P);
                    this.b.addView(o2Var, ha.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    o2Var.setTag(Integer.valueOf(i12));
                    o2Var.setOnClickListener(new ii.g(this, 15));
                    this.w0.add(o2Var);
                }
                i12++;
            }
        }
        if (this.f1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i13 = attributes.flags & (-3);
            attributes.flags = i13;
            if (this.m0) {
                attributes.softInputMode = this.n0;
            } else {
                attributes.flags = i13 | 131072;
            }
            if (this.V) {
                attributes.flags |= -2147416832;
                l2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.g0.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean j() {
        return false;
    }

    public boolean j0() {
        return false;
    }

    public hc k() {
        return new hc(this.E, this.I0);
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

    @Override // org.telegram.ui.ActionBar.b2
    public void n(Runnable runnable) {
        this.H0 = new j2(0, runnable);
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

    @Override // org.telegram.ui.ActionBar.b2
    public final void p() {
        onBackPressed();
    }

    public void q0(float f10) {
        l2 l2Var = this.c;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean s() {
        return !this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0() {
        if (!(this instanceof a6) || this.W0) {
            return;
        }
        this.W0 = true;
        try {
            ((a6) this).updateColors();
        } catch (Exception e10) {
            a8.g(e10, true);
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
        if (org.telegram.messenger.g0.M1(getContext())) {
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
            J();
            ViewGroup viewGroup = this.b;
            Point point = org.telegram.messenger.g0.q;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.t0 * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            boolean z9 = this.e0;
            u2 u2Var = this.Y;
            if (z9) {
                u2Var.setAlpha(this.o0 ? this.p0 : 0);
                this.b.setTranslationY(0.0f);
                h0();
                return;
            }
            u2Var.setAlpha(0);
            this.H = 2;
            this.b.setTranslationY(((1.0f - this.S0) * org.telegram.messenger.g0.m) + r1.getMeasuredHeight() + (this.w ? Math.max(0, Math.min(org.telegram.messenger.g0.n, Q())) : 0));
            h0();
            long j3 = this.R0 ? 0L : 150L;
            if (this.D) {
                j3 = 500;
            }
            m.f3 f3Var = new m.f3(this, 16);
            this.G = f3Var;
            org.telegram.messenger.g0.i3(f3Var, j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.g0 != systemWindowInsetTop) {
            this.g0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.c.requestLayout();
        p0();
    }

    public void u0(boolean z9) {
        this.q0 = z9;
        if (z9) {
            return;
        }
        this.b.setTranslationY(0.0f);
        h0();
    }

    public final void v0(int i7) {
        this.r0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.Z0 != i7) {
            this.Z0 = i7;
            l2 l2Var = this.c;
            if (l2Var != null) {
                l2Var.invalidate(0, l2Var.getMeasuredHeight() - l2Var.x, l2Var.getMeasuredWidth(), l2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(k6.w0(i7, this.I0));
        Drawable drawable = this.r0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.Z0, PorterDuff.Mode.MULTIPLY);
        this.b1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.a1 = i7;
    }

    public final void x0(boolean z9) {
        this.h0 = z9;
        this.n = z9;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean y() {
        l2 l2Var = this.c;
        return l2Var != null && l2Var.isAttachedToWindow();
    }

    public final void y0() {
        this.o0 = false;
    }

    public final void z0() {
        this.p0 = 75;
    }

    public v2(Context context, boolean z9) {
        this(1, context, (f6) null, z9);
    }

    public v2(int i7, Context context, f6 f6Var, boolean z9) {
        super(context, R.style.TransparentDialog);
        this.a = p10.s0;
        int i10 = 1;
        this.J = true;
        u2 u2Var = new u2();
        this.Y = u2Var;
        this.Z = true;
        int i11 = k6.h5;
        this.a0 = i11;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.g0 = org.telegram.messenger.g0.m;
        this.j0 = 400;
        this.k0 = xq.h;
        this.n0 = 16;
        this.o0 = true;
        this.p0 = 51;
        this.q0 = true;
        this.u0 = true;
        this.v0 = true;
        this.w0 = new ArrayList();
        this.x0 = new g2(this, i10);
        this.C0 = 0.0f;
        this.F0 = k6.a7;
        this.K0 = true;
        this.L0 = new h2.f((int[]) null);
        this.T0 = true;
        this.U0 = 51;
        this.X0 = new oi.q();
        this.Y0 = -1;
        this.a1 = i11;
        this.e1 = -1L;
        this.I0 = f6Var;
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
                this.n0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        t2 t2Var = new t2(jg.g.h(context, R.drawable.sheet_shadow_round));
        this.r0 = t2Var;
        int w02 = k6.w0(i11, this.I0);
        this.Z0 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.b1 = porterDuffColorFilter;
        t2Var.setColorFilter(porterDuffColorFilter);
        this.r0.getPadding(rect);
        this.t0 = rect.left;
        this.s0 = rect.top;
        l2 l2Var = new l2(this, getContext());
        this.c = l2Var;
        l2Var.setClipChildren(false);
        l2Var.setClipToPadding(false);
        l2Var.setBackground(u2Var);
        this.m0 = z9;
        if (i7 == 1) {
            l2Var.setFitsSystemWindows(true);
            l2Var.setOnApplyWindowInsetsListener(new hi.b2(this, i10));
        }
        if (i12 >= 30) {
            l2Var.setSystemUiVisibility(1792);
        } else {
            l2Var.setSystemUiVisibility(1280);
        }
        u2Var.setAlpha(0);
        if (i7 == 3) {
            k2 k2Var = new k2(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(l2Var, k2Var);
        }
    }

    public void D(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final /* synthetic */ void b(boolean z9) {
    }

    public r0.k1 b0(r0.k1 k1Var) {
        return k1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override // org.telegram.ui.ActionBar.b2
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

    public void E(ArrayList arrayList, boolean z9) {
    }
}
