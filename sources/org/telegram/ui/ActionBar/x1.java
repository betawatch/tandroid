package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.m70;
import rh.y7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class x1 extends Dialog implements Drawable.Callback, us {
    public static final /* synthetic */ int l1 = 0;
    public boolean A0;
    public final Drawable B0;
    public final Rect C0;
    public final BitmapDrawable[] D;
    public final float D0;
    public final boolean[] E;
    public Bitmap E0;
    public final AnimatorSet[] F;
    public Matrix F0;
    public int G;
    public BitmapShader G0;
    public boolean H;
    public Paint H0;
    public int I;
    public Paint I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public x1 K;
    public boolean K0;
    public int L;
    public boolean L0;
    public DialogInterface.OnClickListener M;
    public boolean M0;
    public DialogInterface.OnDismissListener N;
    public final n1 N0;
    public q20 O;
    public final n1 O0;
    public CharSequence[] P;
    public final ArrayList P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public boolean R0;
    public String S;
    public float S0;
    public CharSequence T;
    public final p6 T0;
    public int U;
    public boolean U0;
    public View V;
    public boolean V0;
    public boolean W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public long Y0;
    public Map Z;
    public boolean Z0;
    public int a;
    public int a0;
    public FrameLayout a1;
    public View b;
    public Drawable b0;
    public rh.a b1;
    public TextView c;
    public int c0;
    public t1 c1;
    public xt d;
    public int d0;
    public int d1;
    public int e;
    public p6 e0;
    public int e1;
    public nh.p f;
    public final int f0;
    public int f1;
    public int g0;
    public int g1;
    public TextView h;
    public boolean h0;
    public int h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public final v1 k1;
    public boolean l0;
    public ei0 m0;
    public xt n;
    public CharSequence n0;
    public u1 o0;
    public CharSequence p0;
    public u1 q0;
    public FrameLayout r;
    public String r0;
    public FrameLayout s;
    public bi.m4 s0;
    public CharSequence t0;
    public u1 u0;
    public ViewGroup v0;
    public p1 w;
    public a80 w0;
    public LinearLayout x;
    public TextView x0;
    public s1 y;
    public m70 y0;
    public final int[] z0;

    public x1(Context context) {
        this(3, context, null);
    }

    public static void a(x1 x1Var, int i10, boolean z10) {
        boolean[] zArr = x1Var.E;
        AnimatorSet[] animatorSetArr = x1Var.F;
        if ((!z10 || zArr[i10]) && (z10 || !zArr[i10])) {
            return;
        }
        zArr[i10] = z10;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        BitmapDrawable bitmapDrawable = x1Var.D[i10];
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? zs.e4 : 0));
        }
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new bi.d5(x1Var, i10, 2));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - this.Y0;
        if (currentTimeMillis < j10) {
            org.telegram.messenger.i0.h3(new n1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.v0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xt xtVar;
        if (i10 != zs.i4 || (xtVar = this.n) == null) {
            return;
        }
        xtVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        q20 q20Var = this.O;
        if (q20Var != null) {
            this.O = null;
            q20Var.a(new n1(this, 0));
            return;
        }
        if (this.j1) {
            return;
        }
        this.j1 = true;
        zs.e().n(this, zs.i4);
        DialogInterface.OnDismissListener onDismissListener = this.N;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        x1 x1Var = this.K;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        org.telegram.messenger.i0.r(this.O0);
        if (this.G0 == null || (bitmap = this.E0) == null) {
            return;
        }
        bitmap.recycle();
        this.G0 = null;
        this.H0 = null;
        this.E0 = null;
    }

    public final int e() {
        int min = Math.min(org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.P1() ? org.telegram.messenger.i0.L(446.0f) : org.telegram.messenger.i0.L(496.0f) : org.telegram.messenger.i0.L(356.0f), (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(48.0f)) - (this.X0 * 2));
        Rect rect = this.C0;
        return min + rect.left + rect.right;
    }

    public int f(int i10) {
        return t6.w0(i10, this.T0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup g(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        t1 t1Var = new t1(this, getContext());
        this.c1 = t1Var;
        final int i10 = 1;
        t1Var.setOrientation(1);
        boolean z11 = this.V0;
        int i11 = this.f0;
        int i12 = 3;
        final int i13 = 0;
        if ((z11 || i11 == 3) && i11 != 2) {
            this.c1.setBackground(null);
            this.c1.setPadding(0, 0, 0, 0);
            if (this.V0) {
                this.c1.setWillNotDraw(false);
            }
            this.k0 = false;
        } else {
            boolean z12 = this.l0;
            Drawable drawable = this.B0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.c1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.k0 = true;
            } else {
                this.c1.setBackground(null);
                this.c1.setPadding(0, 0, 0, 0);
                this.c1.setBackground(drawable);
                t1 t1Var2 = this.c1;
                int L = org.telegram.messenger.i0.L(8.0f);
                float L2 = org.telegram.messenger.i0.L(20.0f);
                bi.d2 d2Var = rf.e0.a;
                t1Var2.setOutlineProvider(new rf.c0(L, L2));
                this.c1.setClipToOutline(true);
                this.k0 = false;
            }
        }
        ViewGroup viewGroup = this.c1;
        boolean z13 = this.Z0;
        p6 p6Var = this.T0;
        if (z13) {
            if (this.a1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.a1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.o1
                    public final /* synthetic */ x1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                x1 x1Var = this.b;
                                new y7(x1Var.getContext(), x1Var.T0).show();
                                break;
                            default:
                                x1 x1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(x1Var2, ((Integer) view.getTag()).intValue());
                                }
                                x1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.b1 == null) {
                rh.a aVar = new rh.a(d20.s0, getContext(), p6Var);
                this.b1 = aVar;
                w7.e6.a(aVar);
                this.b1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.o1
                    public final /* synthetic */ x1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                x1 x1Var = this.b;
                                new y7(x1Var.getContext(), x1Var.T0).show();
                                break;
                            default:
                                x1 x1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(x1Var2, ((Integer) view.getTag()).intValue());
                                }
                                x1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            org.telegram.messenger.i0.E2(this.c1);
            org.telegram.messenger.i0.E2(this.b1);
            this.a1.addView(this.c1, w7.b6.e(-2, -2, 17));
            this.a1.addView(this.b1, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.a1;
        }
        if (z10) {
            if (this.Z0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = zs.E1;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        Object[] objArr = (this.n0 == null && this.p0 == null && this.r0 == null && this.t0 == null) ? false : true;
        if (this.U == 0 && this.X == 0 && this.b0 == null) {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.c1.addView(this.V, w7.b6.t(-1, this.a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        } else {
            f7 = 16.0f;
            ei0 ei0Var = new ei0(getContext());
            this.m0 = ei0Var;
            Drawable drawable2 = this.b0;
            if (drawable2 != null) {
                ei0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.b0;
                if (drawable3 instanceof org.telegram.ui.Components.n6) {
                    org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) drawable3;
                    this.m0.addOnAttachStateChangeListener(new l.d(n6Var, i12));
                    n6Var.a(this.m0);
                }
            } else {
                int i14 = this.U;
                if (i14 != 0) {
                    ei0Var.setImageResource(i14);
                } else {
                    ei0Var.setAutoRepeat(this.U0);
                    ei0 ei0Var2 = this.m0;
                    int i15 = this.X;
                    int i16 = this.Y;
                    ei0Var2.f(i15, i16, i16, null);
                    if (this.Z != null) {
                        bi0 animatedDrawable = this.m0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.G();
                        }
                        this.e1 = this.c0;
                    }
                    this.m0.d();
                }
            }
            this.m0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.m0.setBackground(new w1(this.m0, this.c0, org.telegram.messenger.i0.L(52.0f) + this.Y, this.d0, this.e0));
                this.a0 = 92;
            } else if (this.d0 >= 0) {
                a7.C(this.m0, t6.e0(org.telegram.messenger.i0.L(10.0f), 0, this.c0), a7.N(this.d0), this.e0);
            } else {
                this.m0.setBackground(t6.e0(org.telegram.messenger.i0.L(10.0f), 0, this.c0));
            }
            if (this.W) {
                this.m0.setTranslationY(org.telegram.messenger.i0.L(16.0f));
            } else {
                this.m0.setTranslationY(0.0f);
            }
            this.m0.setPadding(0, 0, 0, 0);
            this.c1.addView(this.m0, w7.b6.t(-1, this.a0, 51, 0, 0, 0, 0));
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.c1.addView(frameLayout2, w7.b6.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            nh.p pVar = new nh.p(getContext(), null, false);
            this.f = pVar;
            zs.i(pVar);
            nh.p pVar2 = this.f;
            pVar2.s = 3;
            pVar2.setText(this.R);
            nh.p pVar3 = this.f;
            int f15 = f(t6.j5);
            this.g1 = f15;
            pVar3.setTextColor(f15);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(org.telegram.messenger.i0.o());
            this.f.setGravity((this.W ? 1 : cd.X ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            nh.p pVar4 = this.f;
            boolean z14 = this.W;
            frameLayout3.addView(pVar4, w7.b6.d(-2, -2.0f, (z14 ? 1 : cd.X ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z14 ? 4.0f : this.S != null ? 2 : this.P != null ? 14 : 10));
        }
        String str2 = this.S;
        v1 v1Var = this.k1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            a7.V(this.h, t6.J5, v1Var);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((cd.X ? 5 : 3) | 48);
            f10 = 20.0f;
            this.c1.addView(this.h, w7.b6.t(-2, -2, (cd.X ? 5 : 3) | 48, 24, 0, 24, this.P != null ? 14 : 10));
        } else {
            f10 = 20.0f;
        }
        if (i11 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.D;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            p1 p1Var = new p1(this, getContext(), null == true ? 1 : 0);
            this.w = p1Var;
            p1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.i0.y3(this.w, f(t6.A5));
            this.c1.addView(this.w, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 4.0f;
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f11 = 4.0f;
        }
        xt xtVar = new xt(getContext());
        this.n = xtVar;
        zs.i(xtVar);
        xt xtVar2 = this.n;
        int f16 = f(this.W ? t6.y6 : t6.j5);
        this.h1 = f16;
        xtVar2.setTextColor(f16);
        this.n.setTextSize(1, f7);
        this.n.setMovementMethod(new org.telegram.messenger.e0((boolean) (null == true ? 1 : 0)));
        a7.H(this.n, t6.k5, v1Var);
        if (!this.h0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.W ? 1 : cd.X ? 5 : 3) | 48);
        int i17 = 19;
        if (i11 == 2) {
            this.c1.addView(this.n, w7.b6.t(-2, -2, (cd.X ? 5 : 3) | 48, 24, this.R == null ? 19 : 0, 24, 20));
            a80 a80Var = new a80(getContext());
            this.w0 = a80Var;
            a80Var.a(false, this.g0 / 100.0f);
            this.w0.setProgressColor(f(t6.F5));
            this.w0.setBackColor(f(t6.G5));
            this.c1.addView(this.w0, w7.b6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.x0 = textView2;
            textView2.setTypeface(org.telegram.messenger.i0.o());
            this.x0.setGravity((cd.X ? 5 : 3) | 48);
            a7.V(this.x0, t6.q5, v1Var);
            this.x0.setTextSize(1, 14.0f);
            this.c1.addView(this.x0, w7.b6.t(-2, -2, (cd.X ? 5 : 3) | 48, 23, 4, 23, 24));
            this.x0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i18 = t6.M5;
            this.d1 = i18;
            this.W0 = f(i18);
            if (!this.V0) {
                this.r.setBackgroundDrawable(t6.d0(org.telegram.messenger.i0.L(18.0f), this.W0));
            }
            this.c1.addView(this.r, w7.b6.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), p6Var);
            radialProgressView.setSize(org.telegram.messenger.i0.L(32.0f));
            radialProgressView.setProgressColor(f(t6.N5));
            this.r.addView(radialProgressView, w7.b6.e(86, 86, 17));
        } else {
            xt xtVar3 = this.d;
            if (xtVar3 != null) {
                this.x.addView(xtVar3, w7.b6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.x.addView(this.n, w7.b6.t(-2, -2, (this.W ? 1 : cd.X ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.P == null) ? 0 : this.G));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.x.addView(textView3, w7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.T)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.T);
            this.n.setVisibility(0);
        }
        if (this.P != null) {
            int i19 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i19 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i19] != null) {
                    r1 r1Var = new r1(getContext(), p6Var);
                    CharSequence charSequence = this.P[i19];
                    int[] iArr = this.Q;
                    r1Var.a(iArr != null ? iArr[i19] : 0, charSequence);
                    r1Var.setTag(Integer.valueOf(i19));
                    this.P0.add(r1Var);
                    this.x.addView(r1Var, w7.b6.o(-1, 50));
                    final int i20 = 2;
                    r1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.o1
                        public final /* synthetic */ x1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i20) {
                                case 0:
                                    this.b.dismiss();
                                    break;
                                case 1:
                                    x1 x1Var = this.b;
                                    new y7(x1Var.getContext(), x1Var.T0).show();
                                    break;
                                default:
                                    x1 x1Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(x1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    x1Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i19++;
            }
        }
        View view2 = this.b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.x.addView(this.b, w7.b6.o(-1, this.e));
        }
        if (objArr != false) {
            if (!this.K0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                CharSequence charSequence2 = this.n0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.i0.L(24.0f) + 0) : 0;
                if (this.p0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.i0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.p0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.i0.L(24.0f) + measureText);
                }
                if (this.r0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.i0.L(8.0f);
                    }
                    String str3 = this.r0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + org.telegram.messenger.i0.L(24.0f) + measureText);
                }
                if (this.t0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.i0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.t0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.i0.L(24.0f) + measureText);
                }
                if (measureText > org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(64.0f)) {
                    if (!this.L0 || this.n0 == null || this.p0 == null || this.r0 == null || this.t0 == null) {
                        this.K0 = true;
                    } else {
                        this.M0 = true;
                    }
                }
            }
            int i21 = 7;
            if (this.K0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.v0 = linearLayout2;
            } else {
                this.v0 = new jg.l0(this, getContext(), i21);
            }
            if (this.c != null) {
                this.v0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(f11));
                this.v0.setTranslationY(-org.telegram.messenger.i0.L(6.0f));
                f12 = 64.0f;
            } else {
                f12 = 64.0f;
                this.v0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            this.c1.addView(this.v0, w7.b6.o(-1, this.M0 ? 96 : 52));
            if (this.W) {
                this.v0.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            }
            if (this.n0 != null) {
                q1 q1Var = new q1(getContext(), null == true ? 1 : 0);
                q1Var.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var.setTag(-1);
                q1Var.setTextSize(1, 16.0f);
                a7.V(q1Var, this.I, v1Var);
                q1Var.setGravity(17);
                q1Var.setTypeface(org.telegram.messenger.i0.o());
                q1Var.setText(this.n0);
                f13 = 6.0f;
                q1Var.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                if (this.K0) {
                    f14 = 12.0f;
                    this.v0.addView(q1Var, w7.b6.r(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.v0.addView(q1Var, w7.b6.e(-2, 40, 53));
                }
                q1Var.setOnClickListener(new ag.t0(i17, this, q1Var));
            } else {
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.p0 != null) {
                q1 q1Var2 = new q1(getContext(), i10);
                q1Var2.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var2.setTag(-2);
                q1Var2.setTextSize(1, 16.0f);
                a7.V(q1Var2, this.I, v1Var);
                q1Var2.setGravity(17);
                q1Var2.setTypeface(org.telegram.messenger.i0.o());
                q1Var2.setEllipsize(TextUtils.TruncateAt.END);
                q1Var2.setSingleLine(true);
                q1Var2.setText(this.p0.toString());
                q1Var2.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var2.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.v0.addView(q1Var2, 0, w7.b6.r(-1, 40, 7));
                } else {
                    this.v0.addView(q1Var2, w7.b6.e(-2, 40, 53));
                }
                q1Var2.setOnClickListener(new ag.t0(20, this, q1Var2));
            }
            if (this.t0 != null) {
                q1 q1Var3 = new q1(getContext(), 2);
                q1Var3.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var3.setTag(-3);
                q1Var3.setTextSize(1, 16.0f);
                a7.V(q1Var3, this.I, v1Var);
                q1Var3.setGravity(17);
                q1Var3.setTypeface(org.telegram.messenger.i0.o());
                q1Var3.setEllipsize(TextUtils.TruncateAt.END);
                q1Var3.setSingleLine(true);
                q1Var3.setText(this.t0.toString());
                q1Var3.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var3.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.v0.addView(q1Var3, 1, w7.b6.r(-1, 40, 7));
                } else {
                    this.v0.addView(q1Var3, w7.b6.e(-2, 40, 51));
                }
                q1Var3.setOnClickListener(new ag.t0(21, this, q1Var3));
            }
            if (this.r0 != null) {
                q1 q1Var4 = new q1(getContext(), i12);
                q1Var4.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var4.setTag(-4);
                q1Var4.setTextSize(1, 16.0f);
                a7.V(q1Var4, this.I, v1Var);
                q1Var4.setGravity(17);
                q1Var4.setTypeface(org.telegram.messenger.i0.o());
                q1Var4.setEllipsize(TextUtils.TruncateAt.END);
                q1Var4.setSingleLine(true);
                q1Var4.setText(this.r0.toString());
                q1Var4.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var4.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.v0.addView(q1Var4, 0, w7.b6.r(-1, 40, 7));
                } else {
                    this.v0.addView(q1Var4, w7.b6.e(-2, 40, 53));
                }
                q1Var4.setOnClickListener(new ag.t0(22, this, q1Var4));
            }
            if (this.K0) {
                while (i10 < this.v0.getChildCount()) {
                    ((ViewGroup.MarginLayoutParams) this.v0.getChildAt(i10).getLayoutParams()).topMargin = org.telegram.messenger.i0.L(f13);
                    i10++;
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Z0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.L = org.telegram.messenger.i0.q.x;
            this.c1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.R0) {
                layoutParams3.dimAmount = this.S0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.L = org.telegram.messenger.i0.q.x;
            layoutParams3.width = e();
        }
        View view3 = this.b;
        if (view3 != null && this.A0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.V0) {
            org.telegram.messenger.i0.l2(new ag.l(this, 25), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final gf.e h(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.j0 = false;
        }
        return new gf.e(new jg.u1(1, d), new ag.j0(this, d, z10, 9));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            a7.V(textView, t6.q7, this.k1);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i10) {
        this.d1 = -1;
        this.W0 = i10;
        Drawable drawable = this.B0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.i0 = false;
    }

    public final void l(boolean z10) {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.J0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P0;
            if (i10 >= arrayList.size()) {
                return;
            }
            r1 r1Var = (r1) arrayList.get(i10);
            r1Var.a.setTextColor(i11);
            r1Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void n(String str) {
        this.T = str;
        if (this.n != null) {
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(this.T);
                this.n.setVisibility(0);
            }
        }
    }

    public final void o(int i10) {
        this.g0 = i10;
        a80 a80Var = this.w0;
        if (a80Var != null) {
            a80Var.a(true, i10 / 100.0f);
            this.x0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        m70 m70Var = this.y0;
        if (m70Var != null) {
            m70Var.h(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        zs.e().c(this, zs.i4);
    }

    public final void p(int i10) {
        this.i1 = true;
        nh.p pVar = this.f;
        if (pVar != null) {
            pVar.setTextColor(i10);
        }
        xt xtVar = this.n;
        if (xtVar != null) {
            xtVar.setTextColor(i10);
        }
    }

    public final void q() {
        if (this.i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.T0);
            String L0 = cd.L0(2131744850, null);
            x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131744851, null);
            alertDialog$Builder.k(cd.L0(2131743239, null), null);
            alertDialog$Builder.h(cd.L0(2131744859, null), new mg.l(this, 10));
            alertDialog$Builder.j(new ag.x(this, 7));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        n1 n1Var = this.O0;
        org.telegram.messenger.i0.r(n1Var);
        org.telegram.messenger.i0.h3(n1Var, j10);
    }

    public final void s() {
        ei0 ei0Var;
        int w02;
        if (this.d0 < 0 || this.Z == null || (ei0Var = this.m0) == null || ei0Var.getAnimatedDrawable() == null || (w02 = t6.w0(this.d0, this.e0)) == this.e1) {
            return;
        }
        bi0 animatedDrawable = this.m0.getAnimatedDrawable();
        for (Map.Entry entry : this.Z.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.e1) {
                entry.setValue(Integer.valueOf(w02));
                animatedDrawable.Q(w02, (String) entry.getKey());
            }
        }
        this.e1 = w02;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        p1 p1Var = this.w;
        if (p1Var != null) {
            p1Var.postDelayed(runnable, j10);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        nh.p pVar = this.f;
        if (pVar != null) {
            pVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            this.j1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.f0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.Y0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        p1 p1Var = this.w;
        if (p1Var != null) {
            p1Var.removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x1(int i10, Context context, p6 p6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.D = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = t6.H5;
        this.a0 = zs.Q1;
        this.d0 = -1;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.z0 = new int[2];
        this.A0 = true;
        int i11 = 0;
        this.N0 = new n1(this, i11);
        this.O0 = new n1(this, 1 == true ? 1 : 0);
        this.P0 = new ArrayList();
        this.R0 = true;
        this.S0 = 0.5f;
        this.U0 = true;
        this.d1 = -1;
        this.k1 = new v1(this, i11);
        this.T0 = p6Var;
        this.f0 = i10;
        int i12 = t6.h5;
        this.d1 = i12;
        int f7 = f(i12);
        this.W0 = f7;
        Object[] objArr = org.telegram.messenger.i0.B(f7) < 0.721f;
        this.V0 = tz.o() >= 2 && sc.e(256) && objArr == true;
        Rect rect = new Rect();
        this.C0 = rect;
        if (i10 != 3 || this.V0) {
            Drawable f10 = i0.a.f(context, R.drawable.popup_fixed_alert4);
            this.B0 = f10;
            this.D0 = i10 == 3 ? 0.55f : objArr != false ? 0.8f : 0.985f;
            f10.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
            f10.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
