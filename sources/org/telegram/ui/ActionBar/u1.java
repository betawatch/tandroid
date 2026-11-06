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
import bi.eb;
import bi.u7;
import bi.uc;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class u1 extends Dialog implements Drawable.Callback, ls {
    public static final /* synthetic */ int j1 = 0;
    public final Rect A0;
    public final float B0;
    public Bitmap C0;
    public final BitmapDrawable[] D;
    public Matrix D0;
    public final boolean[] E;
    public BitmapShader E0;
    public final AnimatorSet[] F;
    public Paint F0;
    public int G;
    public Paint G0;
    public boolean H;
    public boolean H0;
    public int I;
    public boolean I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public u1 K;
    public boolean K0;
    public int L;
    public final bi.r4 L0;
    public DialogInterface.OnClickListener M;
    public final bi.r4 M0;
    public DialogInterface.OnDismissListener N;
    public final ArrayList N0;
    public c20 O;
    public float O0;
    public CharSequence[] P;
    public boolean P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public final f6 R0;
    public String S;
    public boolean S0;
    public CharSequence T;
    public boolean T0;
    public int U;
    public int U0;
    public View V;
    public int V0;
    public boolean W;
    public long W0;
    public int X;
    public boolean X0;
    public int Y;
    public FrameLayout Y0;
    public Map Z;
    public bi.c Z0;
    public int a;
    public int a0;
    public q1 a1;
    public View b;
    public Drawable b0;
    public int b1;
    public TextView c;
    public int c0;
    public int c1;
    public lt d;
    public int d0;
    public int d1;
    public int e;
    public f6 e0;
    public int e1;
    public xh.l f;
    public final int f0;
    public int f1;
    public int g0;
    public boolean g1;
    public TextView h;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public final s1 i1;
    public boolean j0;
    public ch0 k0;
    public CharSequence l0;
    public r1 m0;
    public lt n;
    public CharSequence n0;
    public r1 o0;
    public String p0;
    public li.c4 q0;
    public FrameLayout r;
    public CharSequence r0;
    public FrameLayout s;
    public r1 s0;
    public ViewGroup t0;
    public h70 u0;
    public TextView v0;
    public m1 w;
    public o60 w0;
    public LinearLayout x;
    public final int[] x0;
    public p1 y;
    public boolean y0;
    public final Drawable z0;

    public u1(Context context) {
        this(3, context, null);
    }

    public static void a(u1 u1Var, int i7, boolean z9) {
        boolean[] zArr = u1Var.E;
        AnimatorSet[] animatorSetArr = u1Var.F;
        if ((!z9 || zArr[i7]) && (z9 || !zArr[i7])) {
            return;
        }
        zArr[i7] = z9;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i7] = animatorSet2;
        BitmapDrawable bitmapDrawable = u1Var.D[i7];
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z9 ? qs.e4 : 0));
        }
        animatorSetArr[i7].setDuration(150L);
        animatorSetArr[i7].addListener(new hi.m2(u1Var, i7, 4));
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
        long currentTimeMillis = System.currentTimeMillis() - this.W0;
        if (currentTimeMillis < j3) {
            org.telegram.messenger.g0.i3(new bi.r4(this, 2), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i7) {
        ViewGroup viewGroup = this.t0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i7));
        }
        return null;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lt ltVar;
        if (i7 != qs.i4 || (ltVar = this.n) == null) {
            return;
        }
        ltVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        c20 c20Var = this.O;
        if (c20Var != null) {
            this.O = null;
            c20Var.a(new bi.r4(this, 2));
            return;
        }
        if (this.h1) {
            return;
        }
        this.h1 = true;
        qs.e().n(this, qs.i4);
        DialogInterface.OnDismissListener onDismissListener = this.N;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        u1 u1Var = this.K;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        org.telegram.messenger.g0.r(this.M0);
        if (this.E0 == null || (bitmap = this.C0) == null) {
            return;
        }
        bitmap.recycle();
        this.E0 = null;
        this.F0 = null;
        this.C0 = null;
    }

    public final int e() {
        int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(48.0f)) - (this.V0 * 2));
        Rect rect = this.A0;
        return min + rect.left + rect.right;
    }

    public int f(int i7) {
        return k6.w0(i7, this.R0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup g(boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q1 q1Var = new q1(this, getContext());
        this.a1 = q1Var;
        final int i7 = 1;
        q1Var.setOrientation(1);
        boolean z10 = this.T0;
        int i10 = this.f0;
        int i11 = 3;
        final int i12 = 0;
        if ((z10 || i10 == 3) && i10 != 2) {
            this.a1.setBackground(null);
            this.a1.setPadding(0, 0, 0, 0);
            if (this.T0) {
                this.a1.setWillNotDraw(false);
            }
        } else {
            this.a1.setBackground(null);
            this.a1.setPadding(0, 0, 0, 0);
            this.a1.setBackground(this.z0);
            q1 q1Var2 = this.a1;
            int L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(20.0f);
            bg.q0 q0Var = bg.u0.a;
            q1Var2.setOutlineProvider(new bg.s0(L, L2));
            this.a1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.a1;
        boolean z11 = this.X0;
        f6 f6Var = this.R0;
        if (z11) {
            if (this.Y0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Y0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.k1
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
                                new uc(u1Var.getContext(), u1Var.R0).show();
                                break;
                            default:
                                u1 u1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.Z0 == null) {
                bi.c cVar = new bi.c(p10.s0, getContext(), f6Var);
                this.Z0 = cVar;
                ka.a(cVar);
                this.Z0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.k1
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
                                new uc(u1Var.getContext(), u1Var.R0).show();
                                break;
                            default:
                                u1 u1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.a1);
            org.telegram.messenger.g0.E2(this.Z0);
            this.Y0.addView(this.a1, ha.e(-2, -2, 17));
            this.Y0.addView(this.Z0, ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Y0;
        }
        if (z9) {
            if (this.X0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = qs.E1;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        Object[] objArr = (this.l0 == null && this.n0 == null && this.p0 == null && this.r0 == null) ? false : true;
        int i13 = 5;
        if (this.U == 0 && this.X == 0 && this.b0 == null) {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.a1.addView(this.V, ha.t(-1, this.a0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        } else {
            f10 = 16.0f;
            ch0 ch0Var = new ch0(getContext());
            this.k0 = ch0Var;
            Drawable drawable = this.b0;
            if (drawable != null) {
                ch0Var.setImageDrawable(drawable);
                Drawable drawable2 = this.b0;
                if (drawable2 instanceof org.telegram.ui.Components.r6) {
                    org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) drawable2;
                    this.k0.addOnAttachStateChangeListener(new bi.m6(r6Var, i13));
                    r6Var.a(this.k0);
                }
            } else {
                int i14 = this.U;
                if (i14 != 0) {
                    ch0Var.setImageResource(i14);
                } else {
                    ch0Var.setAutoRepeat(this.S0);
                    ch0 ch0Var2 = this.k0;
                    int i15 = this.X;
                    int i16 = this.Y;
                    ch0Var2.f(i15, i16, i16, null);
                    if (this.Z != null) {
                        zg0 animatedDrawable = this.k0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.G();
                        }
                        this.c1 = this.c0;
                    }
                    this.k0.d();
                }
            }
            this.k0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.k0.setBackground(new t1(this.k0, this.c0, org.telegram.messenger.g0.L(52.0f) + this.Y, this.d0, this.e0));
                this.a0 = 92;
            } else if (this.d0 >= 0) {
                r6.C(this.k0, k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.c0), r6.N(this.d0), this.e0);
            } else {
                this.k0.setBackground(k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.c0));
            }
            if (this.W) {
                this.k0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.k0.setTranslationY(0.0f);
            }
            this.k0.setPadding(0, 0, 0, 0);
            this.a1.addView(this.k0, ha.t(-1, this.a0, 51, 0, 0, 0, 0));
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.a1.addView(frameLayout2, ha.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            xh.l lVar = new xh.l(getContext(), null, false);
            this.f = lVar;
            qs.i(lVar);
            xh.l lVar2 = this.f;
            lVar2.s = 3;
            lVar2.setText(this.R);
            xh.l lVar3 = this.f;
            int f16 = f(k6.j5);
            this.e1 = f16;
            lVar3.setTextColor(f16);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setGravity((this.W ? 1 : hd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            xh.l lVar4 = this.f;
            boolean z12 = this.W;
            frameLayout3.addView(lVar4, ha.d(-2, -2.0f, (z12 ? 1 : hd.a0 ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z12 ? 4.0f : this.S != null ? 2 : this.P != null ? 14 : 10));
        }
        String str2 = this.S;
        s1 s1Var = this.i1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            r6.V(this.h, k6.J5, s1Var);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((hd.a0 ? 5 : 3) | 48);
            f11 = 20.0f;
            this.a1.addView(this.h, ha.t(-2, -2, (hd.a0 ? 5 : 3) | 48, 24, 0, 24, this.P != null ? 14 : 10));
        } else {
            f11 = 20.0f;
        }
        if (i10 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.D;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            m1 m1Var = new m1(this, getContext(), null == true ? 1 : 0);
            this.w = m1Var;
            m1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.z3(this.w, f(k6.A5));
            this.a1.addView(this.w, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            f12 = 4.0f;
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f12 = 4.0f;
        }
        lt ltVar = new lt(getContext());
        this.n = ltVar;
        qs.i(ltVar);
        lt ltVar2 = this.n;
        int f17 = f(this.W ? k6.y6 : k6.j5);
        this.f1 = f17;
        ltVar2.setTextColor(f17);
        this.n.setTextSize(1, f10);
        this.n.setMovementMethod(new org.telegram.messenger.c0((boolean) (null == true ? 1 : 0)));
        r6.H(this.n, k6.k5, s1Var);
        if (!this.h0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.W ? 1 : hd.a0 ? 5 : 3) | 48);
        if (i10 == 2) {
            this.a1.addView(this.n, ha.t(-2, -2, (hd.a0 ? 5 : 3) | 48, 24, this.R == null ? 19 : 0, 24, 20));
            h70 h70Var = new h70(getContext());
            this.u0 = h70Var;
            h70Var.a(false, this.g0 / 100.0f);
            this.u0.setProgressColor(f(k6.F5));
            this.u0.setBackColor(f(k6.G5));
            this.a1.addView(this.u0, ha.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.v0 = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            this.v0.setGravity((hd.a0 ? 5 : 3) | 48);
            r6.V(this.v0, k6.q5, s1Var);
            this.v0.setTextSize(1, 14.0f);
            this.a1.addView(this.v0, ha.t(-2, -2, (hd.a0 ? 5 : 3) | 48, 23, 4, 23, 24));
            this.v0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        } else if (i10 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i17 = k6.M5;
            this.b1 = i17;
            this.U0 = f(i17);
            if (!this.T0) {
                this.r.setBackgroundDrawable(k6.d0(org.telegram.messenger.g0.L(18.0f), this.U0));
            }
            this.a1.addView(this.r, ha.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(k6.N5));
            this.r.addView(radialProgressView, ha.e(86, 86, 17));
        } else {
            lt ltVar3 = this.d;
            if (ltVar3 != null) {
                this.x.addView(ltVar3, ha.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.x.addView(this.n, ha.t(-2, -2, (this.W ? 1 : hd.a0 ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.P == null) ? 0 : this.G));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.x.addView(textView3, ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.T)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.T);
            this.n.setVisibility(0);
        }
        if (this.P != null) {
            int i18 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i18 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i18] != null) {
                    o1 o1Var = new o1(getContext(), f6Var);
                    CharSequence charSequence = this.P[i18];
                    int[] iArr = this.Q;
                    o1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    o1Var.setTag(Integer.valueOf(i18));
                    this.N0.add(o1Var);
                    this.x.addView(o1Var, ha.o(-1, 50));
                    final int i19 = 2;
                    o1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.k1
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
                                    new uc(u1Var.getContext(), u1Var.R0).show();
                                    break;
                                default:
                                    u1 u1Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = u1Var2.M;
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
            this.x.addView(this.b, ha.o(-1, this.e));
        }
        int i20 = 28;
        if (objArr != false) {
            if (!this.I0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.l0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0) : 0;
                if (this.n0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.n0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.p0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str3 = this.p0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.r0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.r0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (measureText > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (!this.J0 || this.l0 == null || this.n0 == null || this.p0 == null || this.r0 == null) {
                        this.I0 = true;
                    } else {
                        this.K0 = true;
                    }
                }
            }
            if (this.I0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.t0 = linearLayout2;
            } else {
                this.t0 = new bi.e5(9, getContext(), this);
            }
            if (this.c != null) {
                this.t0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f12));
                this.t0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.t0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            this.a1.addView(this.t0, ha.o(-1, this.K0 ? 96 : 52));
            if (this.W) {
                this.t0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.l0 != null) {
                f13 = 64.0f;
                n1 n1Var = new n1(getContext(), null == true ? 1 : 0);
                n1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                n1Var.setTag(-1);
                n1Var.setTextSize(1, 16.0f);
                r6.V(n1Var, this.I, s1Var);
                n1Var.setGravity(17);
                n1Var.setTypeface(org.telegram.messenger.g0.o());
                n1Var.setText(this.l0);
                f14 = 6.0f;
                n1Var.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.I0) {
                    f15 = 12.0f;
                    this.t0.addView(n1Var, ha.r(-1, 40, 7));
                } else {
                    f15 = 12.0f;
                    this.t0.addView(n1Var, ha.e(-2, 40, 53));
                }
                n1Var.setOnClickListener(new bi.r(27, this, n1Var));
            } else {
                f13 = 64.0f;
                f14 = 6.0f;
                f15 = 12.0f;
            }
            if (this.n0 != null) {
                n1 n1Var2 = new n1(getContext(), i7);
                n1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var2.setTag(-2);
                n1Var2.setTextSize(1, 16.0f);
                r6.V(n1Var2, this.I, s1Var);
                n1Var2.setGravity(17);
                n1Var2.setTypeface(org.telegram.messenger.g0.o());
                n1Var2.setEllipsize(TextUtils.TruncateAt.END);
                n1Var2.setSingleLine(true);
                n1Var2.setText(this.n0.toString());
                n1Var2.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var2.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.t0.addView(n1Var2, 0, ha.r(-1, 40, 7));
                } else {
                    this.t0.addView(n1Var2, ha.e(-2, 40, 53));
                }
                n1Var2.setOnClickListener(new bi.r(i20, this, n1Var2));
            }
            if (this.r0 != null) {
                n1 n1Var3 = new n1(getContext(), 2);
                n1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var3.setTag(-3);
                n1Var3.setTextSize(1, 16.0f);
                r6.V(n1Var3, this.I, s1Var);
                n1Var3.setGravity(17);
                n1Var3.setTypeface(org.telegram.messenger.g0.o());
                n1Var3.setEllipsize(TextUtils.TruncateAt.END);
                n1Var3.setSingleLine(true);
                n1Var3.setText(this.r0.toString());
                n1Var3.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var3.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.t0.addView(n1Var3, 1, ha.r(-1, 40, 7));
                } else {
                    this.t0.addView(n1Var3, ha.e(-2, 40, 51));
                }
                n1Var3.setOnClickListener(new bi.r(29, this, n1Var3));
            }
            if (this.p0 != null) {
                n1 n1Var4 = new n1(getContext(), i11);
                n1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var4.setTag(-4);
                n1Var4.setTextSize(1, 16.0f);
                r6.V(n1Var4, this.I, s1Var);
                n1Var4.setGravity(17);
                n1Var4.setTypeface(org.telegram.messenger.g0.o());
                n1Var4.setEllipsize(TextUtils.TruncateAt.END);
                n1Var4.setSingleLine(true);
                n1Var4.setText(this.p0.toString());
                n1Var4.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var4.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.t0.addView(n1Var4, 0, ha.r(-1, 40, 7));
                } else {
                    this.t0.addView(n1Var4, ha.e(-2, 40, 53));
                }
                n1Var4.setOnClickListener(new l1(null == true ? 1 : 0, this, n1Var4));
            }
            if (this.I0) {
                while (i7 < this.t0.getChildCount()) {
                    ((ViewGroup.MarginLayoutParams) this.t0.getChildAt(i7).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f14);
                    i7++;
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.X0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.L = org.telegram.messenger.g0.q.x;
            this.a1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i10 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.P0) {
                layoutParams3.dimAmount = this.Q0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.L = org.telegram.messenger.g0.q.x;
            layoutParams3.width = e();
        }
        View view3 = this.b;
        if (view3 != null && this.y0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.T0) {
            org.telegram.messenger.g0.l2(new ii.c(this, 14), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final vf.b h(int i7, boolean z9, boolean z10) {
        View d = d(i7);
        if (z10) {
            this.j0 = false;
        }
        return new vf.b(new j1(0, d), new u7(this, d, z9, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            r6.V(textView, k6.q7, this.i1);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i7) {
        this.b1 = -1;
        this.U0 = i7;
        Drawable drawable = this.z0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.i0 = false;
    }

    public final void l(boolean z9) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.H0) {
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
            ArrayList arrayList = this.N0;
            if (i7 >= arrayList.size()) {
                return;
            }
            o1 o1Var = (o1) arrayList.get(i7);
            o1Var.a.setTextColor(i10);
            o1Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
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

    public final void o(int i7) {
        this.g0 = i7;
        h70 h70Var = this.u0;
        if (h70Var != null) {
            h70Var.a(true, i7 / 100.0f);
            this.v0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        o60 o60Var = this.w0;
        if (o60Var != null) {
            o60Var.g(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        qs.e().c(this, qs.i4);
    }

    public final void p(int i7) {
        this.g1 = true;
        xh.l lVar = this.f;
        if (lVar != null) {
            lVar.setTextColor(i7);
        }
        lt ltVar = this.n;
        if (ltVar != null) {
            ltVar.setTextColor(i7);
        }
    }

    public final void q() {
        if (this.i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.R0);
            String M0 = hd.M0(2131744833, null);
            u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131744834, null);
            alertDialog$Builder.k(hd.M0(2131743214, null), null);
            alertDialog$Builder.h(hd.M0(2131744842, null), new l2.y(this, 27));
            alertDialog$Builder.j(new eb(this, 9));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j3) {
        bi.r4 r4Var = this.M0;
        org.telegram.messenger.g0.r(r4Var);
        org.telegram.messenger.g0.i3(r4Var, j3);
    }

    public final void s() {
        ch0 ch0Var;
        int w02;
        if (this.d0 < 0 || this.Z == null || (ch0Var = this.k0) == null || ch0Var.getAnimatedDrawable() == null || (w02 = k6.w0(this.d0, this.e0)) == this.c1) {
            return;
        }
        zg0 animatedDrawable = this.k0.getAnimatedDrawable();
        for (Map.Entry entry : this.Z.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.c1) {
                entry.setValue(Integer.valueOf(w02));
                animatedDrawable.Q(w02, (String) entry.getKey());
            }
        }
        this.c1 = w02;
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
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        xh.l lVar = this.f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            this.h1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.f0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.W0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        m1 m1Var = this.w;
        if (m1Var != null) {
            m1Var.removeCallbacks(runnable);
        }
    }

    public u1(int i7, Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.D = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = k6.H5;
        this.a0 = qs.Q1;
        this.d0 = -1;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.x0 = new int[2];
        this.y0 = true;
        this.L0 = new bi.r4(this, 2);
        this.M0 = new bi.r4(this, 3);
        this.N0 = new ArrayList();
        this.P0 = true;
        this.Q0 = 0.5f;
        this.S0 = true;
        this.b1 = -1;
        this.i1 = new s1(this, 0);
        this.R0 = f6Var;
        this.f0 = i7;
        int i10 = k6.h5;
        this.b1 = i10;
        int f10 = f(i10);
        this.U0 = f10;
        boolean z9 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.T0 = iz.o() >= 2 && rc.e(256) && z9;
        Rect rect = new Rect();
        this.A0 = rect;
        if (i7 != 3 || this.T0) {
            Drawable h = jg.g.h(context, R.drawable.popup_fixed_alert4);
            this.z0 = h;
            this.B0 = i7 == 3 ? 0.55f : z9 ? 0.8f : 0.985f;
            h.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
            h.getPadding(rect);
        }
        this.H = i7 == 3;
    }
}
