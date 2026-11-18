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
import c8.ma;
import c8.ra;
import di.gb;
import di.t9;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xt;
import org.telegram.ui.p60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class u1 extends Dialog implements Drawable.Callback, fs {
    public static final /* synthetic */ int k1 = 0;
    public final Drawable A0;
    public final Rect B0;
    public final float C0;
    public Bitmap D0;
    public final BitmapDrawable[] E;
    public Matrix E0;
    public final boolean[] F;
    public BitmapShader F0;
    public final AnimatorSet[] G;
    public Paint G0;
    public int H;
    public Paint H0;
    public boolean I;
    public boolean I0;
    public int J;
    public boolean J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public u1 L;
    public boolean L0;
    public int M;
    public final di.u3 M0;
    public DialogInterface.OnClickListener N;
    public final di.u3 N0;
    public DialogInterface.OnDismissListener O;
    public final ArrayList O0;
    public x10 P;
    public float P0;
    public CharSequence[] Q;
    public boolean Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public final i6 S0;
    public String T;
    public boolean T0;
    public CharSequence U;
    public boolean U0;
    public int V;
    public int V0;
    public View W;
    public int W0;
    public boolean X;
    public long X0;
    public int Y;
    public boolean Y0;
    public int Z;
    public FrameLayout Z0;
    public int a;
    public Map a0;
    public di.b a1;
    public View b;
    public int b0;
    public q1 b1;
    public TextView c;
    public Drawable c0;
    public int c1;
    public xt d;
    public int d0;
    public int d1;
    public int e;
    public int e0;
    public int e1;
    public xh.l f;
    public i6 f0;
    public int f1;
    public final int g0;
    public int g1;
    public TextView h;
    public int h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public final s1 j1;
    public boolean k0;
    public ph0 l0;
    public CharSequence m0;
    public xt n;
    public r1 n0;
    public CharSequence o0;
    public r1 p0;
    public String q0;
    public FrameLayout r;
    public oi.b4 r0;
    public FrameLayout s;
    public CharSequence s0;
    public r1 t0;
    public ViewGroup u0;
    public v70 v0;
    public m1 w;
    public TextView w0;
    public LinearLayout x;
    public p60 x0;
    public p1 y;
    public final int[] y0;
    public boolean z0;

    public u1(Context context) {
        this(3, context, null);
    }

    public static void a(u1 u1Var, int i7, boolean z10) {
        boolean[] zArr = u1Var.F;
        AnimatorSet[] animatorSetArr = u1Var.G;
        if ((!z10 || zArr[i7]) && (z10 || !zArr[i7])) {
            return;
        }
        zArr[i7] = z10;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i7] = animatorSet2;
        BitmapDrawable bitmapDrawable = u1Var.E[i7];
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? ks.e4 : 0));
        }
        animatorSetArr[i7].setDuration(150L);
        animatorSetArr[i7].addListener(new ki.f2(u1Var, i7, 4));
        try {
            animatorSetArr[i7].start();
        } catch (Exception e10) {
            a8.g(e10, true);
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

    public final void c(long j3) {
        long currentTimeMillis = System.currentTimeMillis() - this.X0;
        if (currentTimeMillis < j3) {
            org.telegram.messenger.g0.h3(new di.u3(this, 2), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i7) {
        ViewGroup viewGroup = this.u0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i7));
        }
        return null;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xt xtVar;
        if (i7 != ks.l4 || (xtVar = this.n) == null) {
            return;
        }
        xtVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        x10 x10Var = this.P;
        if (x10Var != null) {
            this.P = null;
            x10Var.a(new di.u3(this, 2));
            return;
        }
        if (this.i1) {
            return;
        }
        this.i1 = true;
        ks.e().n(this, ks.l4);
        DialogInterface.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        u1 u1Var = this.L;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        org.telegram.messenger.g0.r(this.N0);
        if (this.F0 == null || (bitmap = this.D0) == null) {
            return;
        }
        bitmap.recycle();
        this.F0 = null;
        this.G0 = null;
        this.D0 = null;
    }

    public final int e() {
        int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(48.0f)) - (this.W0 * 2));
        Rect rect = this.B0;
        return min + rect.left + rect.right;
    }

    public int f(int i7) {
        return n6.w0(i7, this.S0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup g(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        q1 q1Var = new q1(this, getContext());
        this.b1 = q1Var;
        final int i7 = 1;
        q1Var.setOrientation(1);
        boolean z11 = this.U0;
        int i10 = this.g0;
        int i11 = 3;
        final int i12 = 0;
        if ((z11 || i10 == 3) && i10 != 2) {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            if (this.U0) {
                this.b1.setWillNotDraw(false);
            }
        } else {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            this.b1.setBackground(this.A0);
            q1 q1Var2 = this.b1;
            int L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(20.0f);
            bg.q0 q0Var = bg.u0.a;
            q1Var2.setOutlineProvider(new bg.s0(L, L2));
            this.b1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.b1;
        boolean z12 = this.Y0;
        i6 i6Var = this.S0;
        if (z12) {
            if (this.Z0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Z0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.l1
                    public final /* synthetic */ u1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                u1 u1Var = this.b;
                                new gb(u1Var.getContext(), u1Var.S0).show();
                                break;
                            default:
                                u1 u1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.a1 == null) {
                di.b bVar = new di.b(j10.t0, getContext(), i6Var);
                this.a1 = bVar;
                ra.a(bVar);
                this.a1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.l1
                    public final /* synthetic */ u1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                u1 u1Var = this.b;
                                new gb(u1Var.getContext(), u1Var.S0).show();
                                break;
                            default:
                                u1 u1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.b1);
            org.telegram.messenger.g0.E2(this.a1);
            this.Z0.addView(this.b1, ma.e(-2, -2, 17));
            this.Z0.addView(this.a1, ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Z0;
        }
        if (z10) {
            if (this.Y0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = ks.E1;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        Object[] objArr = (this.m0 == null && this.o0 == null && this.q0 == null && this.s0 == null) ? false : true;
        if (this.V == 0 && this.Y == 0 && this.c0 == null) {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.b1.addView(this.W, ma.t(-1, this.b0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        } else {
            f10 = 16.0f;
            ph0 ph0Var = new ph0(getContext());
            this.l0 = ph0Var;
            Drawable drawable = this.c0;
            if (drawable != null) {
                ph0Var.setImageDrawable(drawable);
                Drawable drawable2 = this.c0;
                if (drawable2 instanceof org.telegram.ui.Components.v6) {
                    org.telegram.ui.Components.v6 v6Var = (org.telegram.ui.Components.v6) drawable2;
                    this.l0.addOnAttachStateChangeListener(new bi.r2(v6Var, 9));
                    v6Var.a(this.l0);
                }
            } else {
                int i13 = this.V;
                if (i13 != 0) {
                    ph0Var.setImageResource(i13);
                } else {
                    ph0Var.setAutoRepeat(this.T0);
                    ph0 ph0Var2 = this.l0;
                    int i14 = this.Y;
                    int i15 = this.Z;
                    ph0Var2.f(i14, i15, i15, null);
                    if (this.a0 != null) {
                        mh0 animatedDrawable = this.l0.getAnimatedDrawable();
                        for (Map.Entry entry : this.a0.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.G();
                        }
                        this.d1 = this.d0;
                    }
                    this.l0.d();
                }
            }
            this.l0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.l0.setBackground(new t1(this.l0, this.d0, org.telegram.messenger.g0.L(52.0f) + this.Z, this.e0, this.f0));
                this.b0 = 92;
            } else if (this.e0 >= 0) {
                u6.B(this.l0, n6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.d0), u6.M(this.e0), this.f0);
            } else {
                this.l0.setBackground(n6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.d0));
            }
            if (this.X) {
                this.l0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.l0.setTranslationY(0.0f);
            }
            this.l0.setPadding(0, 0, 0, 0);
            this.b1.addView(this.l0, ma.t(-1, this.b0, 51, 0, 0, 0, 0));
        }
        int i16 = 10;
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            f11 = 4.0f;
            this.b1.addView(frameLayout2, ma.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            xh.l lVar = new xh.l(getContext(), null, false);
            this.f = lVar;
            ks.i(lVar);
            xh.l lVar2 = this.f;
            lVar2.s = 3;
            lVar2.setText(this.S);
            xh.l lVar3 = this.f;
            int f14 = f(n6.j5);
            this.f1 = f14;
            lVar3.setTextColor(f14);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setGravity((this.X ? 1 : gd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            xh.l lVar4 = this.f;
            boolean z13 = this.X;
            frameLayout3.addView(lVar4, ma.d(-2, -2.0f, (z13 ? 1 : gd.a0 ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z13 ? 4.0f : this.T != null ? 2 : this.Q != null ? 14 : 10));
        } else {
            f11 = 4.0f;
        }
        String str2 = this.T;
        s1 s1Var = this.j1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            u6.U(this.h, n6.J5, s1Var);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((gd.a0 ? 5 : 3) | 48);
            f12 = 20.0f;
            this.b1.addView(this.h, ma.t(-2, -2, (gd.a0 ? 5 : 3) | 48, 24, 0, 24, this.Q != null ? 14 : 10));
        } else {
            f12 = 20.0f;
        }
        if (i10 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.E;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            m1 m1Var = new m1(this, getContext(), null == true ? 1 : 0);
            this.w = m1Var;
            m1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.x3(this.w, f(n6.A5));
            this.b1.addView(this.w, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        }
        xt xtVar = new xt(getContext());
        this.n = xtVar;
        ks.i(xtVar);
        xt xtVar2 = this.n;
        int f15 = f(this.X ? n6.y6 : n6.j5);
        this.g1 = f15;
        xtVar2.setTextColor(f15);
        this.n.setTextSize(1, f10);
        this.n.setMovementMethod(new org.telegram.messenger.c0((boolean) (null == true ? 1 : 0)));
        u6.G(this.n, n6.k5, s1Var);
        if (!this.i0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.X ? 1 : gd.a0 ? 5 : 3) | 48);
        if (i10 == 2) {
            this.b1.addView(this.n, ma.t(-2, -2, (gd.a0 ? 5 : 3) | 48, 24, this.S == null ? 19 : 0, 24, 20));
            v70 v70Var = new v70(getContext());
            this.v0 = v70Var;
            v70Var.a(false, this.h0 / 100.0f);
            this.v0.setProgressColor(f(n6.F5));
            this.v0.setBackColor(f(n6.G5));
            this.b1.addView(this.v0, ma.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.w0 = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            this.w0.setGravity((gd.a0 ? 5 : 3) | 48);
            u6.U(this.w0, n6.q5, s1Var);
            this.w0.setTextSize(1, 14.0f);
            this.b1.addView(this.w0, ma.t(-2, -2, (gd.a0 ? 5 : 3) | 48, 23, 4, 23, 24));
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        } else if (i10 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i17 = n6.M5;
            this.c1 = i17;
            this.V0 = f(i17);
            if (!this.U0) {
                this.r.setBackgroundDrawable(n6.d0(org.telegram.messenger.g0.L(18.0f), this.V0));
            }
            this.b1.addView(this.r, ma.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), i6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(n6.N5));
            this.r.addView(radialProgressView, ma.e(86, 86, 17));
        } else {
            xt xtVar3 = this.d;
            if (xtVar3 != null) {
                this.x.addView(xtVar3, ma.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.x.addView(this.n, ma.t(-2, -2, (this.X ? 1 : gd.a0 ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.Q == null) ? 0 : this.H));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.x.addView(textView3, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.U)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.U);
            this.n.setVisibility(0);
        }
        if (this.Q != null) {
            int i18 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i18 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i18] != null) {
                    o1 o1Var = new o1(getContext(), i6Var);
                    CharSequence charSequence = this.Q[i18];
                    int[] iArr = this.R;
                    o1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    o1Var.setTag(Integer.valueOf(i18));
                    this.O0.add(o1Var);
                    this.x.addView(o1Var, ma.o(-1, 50));
                    final int i19 = 2;
                    o1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.l1
                        public final /* synthetic */ u1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    this.b.dismiss();
                                    break;
                                case 1:
                                    u1 u1Var = this.b;
                                    new gb(u1Var.getContext(), u1Var.S0).show();
                                    break;
                                default:
                                    u1 u1Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = u1Var2.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(u1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    u1Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i18++;
            }
        }
        View view2 = this.b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.x.addView(this.b, ma.o(-1, this.e));
        }
        if (objArr != false) {
            if (!this.J0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.m0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0) : 0;
                if (this.o0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.o0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.q0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str3 = this.q0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.s0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.s0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (measureText > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (!this.K0 || this.m0 == null || this.o0 == null || this.q0 == null || this.s0 == null) {
                        this.J0 = true;
                    } else {
                        this.L0 = true;
                    }
                }
            }
            if (this.J0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.u0 = linearLayout2;
            } else {
                this.u0 = new bi.a3(i16, getContext(), this);
            }
            if (this.c != null) {
                this.u0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f11));
                this.u0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.u0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            this.b1.addView(this.u0, ma.o(-1, this.L0 ? 96 : 52));
            if (this.X) {
                this.u0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.m0 != null) {
                n1 n1Var = new n1(getContext(), null == true ? 1 : 0);
                n1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                n1Var.setTag(-1);
                n1Var.setTextSize(1, 16.0f);
                u6.U(n1Var, this.J, s1Var);
                n1Var.setGravity(17);
                n1Var.setTypeface(org.telegram.messenger.g0.o());
                n1Var.setText(this.m0);
                n1Var.setBackground(n6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                n1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    f13 = 64.0f;
                    this.u0.addView(n1Var, ma.r(-1, 40, 7));
                } else {
                    f13 = 64.0f;
                    this.u0.addView(n1Var, ma.e(-2, 40, 53));
                }
                n1Var.setOnClickListener(new d0(this, n1Var, 2));
            } else {
                f13 = 64.0f;
            }
            if (this.o0 != null) {
                n1 n1Var2 = new n1(getContext(), i7);
                n1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var2.setTag(-2);
                n1Var2.setTextSize(1, 16.0f);
                u6.U(n1Var2, this.J, s1Var);
                n1Var2.setGravity(17);
                n1Var2.setTypeface(org.telegram.messenger.g0.o());
                n1Var2.setEllipsize(TextUtils.TruncateAt.END);
                n1Var2.setSingleLine(true);
                n1Var2.setText(this.o0.toString());
                n1Var2.setBackground(n6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                n1Var2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.u0.addView(n1Var2, 0, ma.r(-1, 40, 7));
                } else {
                    this.u0.addView(n1Var2, ma.e(-2, 40, 53));
                }
                n1Var2.setOnClickListener(new d0(this, n1Var2, i11));
            }
            if (this.s0 != null) {
                n1 n1Var3 = new n1(getContext(), 2);
                n1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var3.setTag(-3);
                n1Var3.setTextSize(1, 16.0f);
                u6.U(n1Var3, this.J, s1Var);
                n1Var3.setGravity(17);
                n1Var3.setTypeface(org.telegram.messenger.g0.o());
                n1Var3.setEllipsize(TextUtils.TruncateAt.END);
                n1Var3.setSingleLine(true);
                n1Var3.setText(this.s0.toString());
                n1Var3.setBackground(n6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                n1Var3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.u0.addView(n1Var3, 1, ma.r(-1, 40, 7));
                } else {
                    this.u0.addView(n1Var3, ma.e(-2, 40, 51));
                }
                n1Var3.setOnClickListener(new d0(this, n1Var3, 4));
            }
            if (this.q0 != null) {
                n1 n1Var4 = new n1(getContext(), i11);
                n1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var4.setTag(-4);
                n1Var4.setTextSize(1, 16.0f);
                u6.U(n1Var4, this.J, s1Var);
                n1Var4.setGravity(17);
                n1Var4.setTypeface(org.telegram.messenger.g0.o());
                n1Var4.setEllipsize(TextUtils.TruncateAt.END);
                n1Var4.setSingleLine(true);
                n1Var4.setText(this.q0.toString());
                n1Var4.setBackground(n6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                n1Var4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.u0.addView(n1Var4, 0, ma.r(-1, 40, 7));
                } else {
                    this.u0.addView(n1Var4, ma.e(-2, 40, 53));
                }
                n1Var4.setOnClickListener(new d0(this, n1Var4, 5));
            }
            if (this.J0) {
                while (i7 < this.u0.getChildCount()) {
                    ((ViewGroup.MarginLayoutParams) this.u0.getChildAt(i7).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(6.0f);
                    i7++;
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Y0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = org.telegram.messenger.g0.q.x;
            this.b1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i10 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.Q0) {
                layoutParams3.dimAmount = this.R0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.M = org.telegram.messenger.g0.q.x;
            layoutParams3.width = e();
        }
        View view3 = this.b;
        if (view3 != null && this.z0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.U0) {
            org.telegram.messenger.g0.l2(new hi.t6(this, 20), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final vf.b h(int i7, boolean z10, boolean z11) {
        View d = d(i7);
        if (z11) {
            this.k0 = false;
        }
        return new vf.b(new k1(0, d), new di.p6(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            u6.U(textView, n6.q7, this.j1);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i7) {
        this.c1 = -1;
        this.V0 = i7;
        Drawable drawable = this.A0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.j0 = false;
    }

    public final void l(boolean z10) {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.I0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.O0;
            if (i7 >= arrayList.size()) {
                return;
            }
            o1 o1Var = (o1) arrayList.get(i7);
            o1Var.a.setTextColor(i10);
            o1Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void n(String str) {
        this.U = str;
        if (this.n != null) {
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(this.U);
                this.n.setVisibility(0);
            }
        }
    }

    public final void o(int i7) {
        this.h0 = i7;
        v70 v70Var = this.v0;
        if (v70Var != null) {
            v70Var.a(true, i7 / 100.0f);
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        p60 p60Var = this.x0;
        if (p60Var != null) {
            p60Var.h(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        ks.e().c(this, ks.l4);
    }

    public final void p(int i7) {
        this.h1 = true;
        xh.l lVar = this.f;
        if (lVar != null) {
            lVar.setTextColor(i7);
        }
        xt xtVar = this.n;
        if (xtVar != null) {
            xtVar.setTextColor(i7);
        }
    }

    public final void q() {
        if (this.j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.S0);
            String M0 = gd.M0(2131744597, null);
            u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131744598, null);
            alertDialog$Builder.k(gd.M0(2131742976, null), null);
            alertDialog$Builder.h(gd.M0(2131744606, null), new p(this, 2));
            alertDialog$Builder.j(new t9(this, 9));
            try {
                this.L = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j3) {
        di.u3 u3Var = this.N0;
        org.telegram.messenger.g0.r(u3Var);
        org.telegram.messenger.g0.h3(u3Var, j3);
    }

    public final void s() {
        ph0 ph0Var;
        int w02;
        if (this.e0 < 0 || this.a0 == null || (ph0Var = this.l0) == null || ph0Var.getAnimatedDrawable() == null || (w02 = n6.w0(this.e0, this.f0)) == this.d1) {
            return;
        }
        mh0 animatedDrawable = this.l0.getAnimatedDrawable();
        for (Map.Entry entry : this.a0.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.d1) {
                entry.setValue(Integer.valueOf(w02));
                animatedDrawable.Q(w02, (String) entry.getKey());
            }
        }
        this.d1 = w02;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        m1 m1Var = this.w;
        if (m1Var != null) {
            m1Var.postDelayed(runnable, j3);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.K = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.S = charSequence;
        xh.l lVar = this.f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            this.i1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.g0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.X0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        m1 m1Var = this.w;
        if (m1Var != null) {
            m1Var.removeCallbacks(runnable);
        }
    }

    public u1(int i7, Context context, i6 i6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = 12;
        this.J = n6.H5;
        this.b0 = ks.Q1;
        this.e0 = -1;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.y0 = new int[2];
        this.z0 = true;
        this.M0 = new di.u3(this, 2);
        this.N0 = new di.u3(this, 3);
        this.O0 = new ArrayList();
        this.Q0 = true;
        this.R0 = 0.5f;
        this.T0 = true;
        this.c1 = -1;
        this.j1 = new s1(this, 0);
        this.S0 = i6Var;
        this.g0 = i7;
        int i10 = n6.h5;
        this.c1 = i10;
        int f10 = f(i10);
        this.V0 = f10;
        boolean z10 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.U0 = bz.o() >= 2 && pc.e(256) && z10;
        Rect rect = new Rect();
        this.B0 = rect;
        if (i7 != 3 || this.U0) {
            Drawable g10 = i5.c.g(context, R.drawable.popup_fixed_alert4);
            this.A0 = g10;
            this.C0 = i7 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            g10.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
            g10.getPadding(rect);
        }
        this.I = i7 == 3;
    }
}
