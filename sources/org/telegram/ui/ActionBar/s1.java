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
import b8.mf;
import b8.pf;
import ci.ba;
import ci.nb;
import ci.v6;
import gi.j8;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.i60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class s1 extends Dialog implements Drawable.Callback, cs {
    public static final /* synthetic */ int m1 = 0;
    public final int[] A0;
    public boolean B0;
    public final Drawable C0;
    public final Rect D0;
    public final BitmapDrawable[] E;
    public final float E0;
    public final boolean[] F;
    public Bitmap F0;
    public final AnimatorSet[] G;
    public Matrix G0;
    public int H;
    public BitmapShader H0;
    public boolean I;
    public Paint I0;
    public int J;
    public Paint J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public s1 L;
    public boolean L0;
    public int M;
    public boolean M0;
    public DialogInterface.OnClickListener N;
    public boolean N0;
    public DialogInterface.OnDismissListener O;
    public final ci.b4 O0;
    public u10 P;
    public final ci.b4 P0;
    public CharSequence[] Q;
    public final ArrayList Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public boolean S0;
    public String T;
    public float T0;
    public CharSequence U;
    public final e6 U0;
    public int V;
    public boolean V0;
    public View W;
    public boolean W0;
    public boolean X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public long Z0;
    public int a;
    public Map a0;
    public boolean a1;
    public View b;
    public int b0;
    public FrameLayout b1;
    public TextView c;
    public Drawable c0;
    public ci.c c1;
    public kt d;
    public int d0;
    public o1 d1;
    public int e;
    public int e0;
    public int e1;
    public yh.l f;
    public e6 f0;
    public int f1;
    public final int g0;
    public int g1;
    public TextView h;
    public int h0;
    public int h1;
    public boolean i0;
    public int i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public boolean l0;
    public final q1 l1;
    public boolean m0;
    public kt n;
    public fh0 n0;
    public CharSequence o0;
    public p1 p0;
    public CharSequence q0;
    public FrameLayout r;
    public p1 r0;
    public FrameLayout s;
    public String s0;
    public mi.c4 t0;
    public CharSequence u0;
    public p1 v0;
    public k1 w;
    public ViewGroup w0;
    public LinearLayout x;
    public d70 x0;
    public n1 y;
    public TextView y0;
    public i60 z0;

    public s1(Context context) {
        this(3, context, null);
    }

    public static void a(s1 s1Var, int i3, boolean z10) {
        boolean[] zArr = s1Var.F;
        AnimatorSet[] animatorSetArr = s1Var.G;
        if ((!z10 || zArr[i3]) && (z10 || !zArr[i3])) {
            return;
        }
        zArr[i3] = z10;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i3] = animatorSet2;
        BitmapDrawable bitmapDrawable = s1Var.E[i3];
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? hs.e4 : 0));
        }
        animatorSetArr[i3].setDuration(150L);
        animatorSetArr[i3].addListener(new ii.m2(s1Var, i3, 4));
        try {
            animatorSetArr[i3].start();
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

    public final void c(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - this.Z0;
        if (currentTimeMillis < j10) {
            org.telegram.messenger.g0.i3(new ci.b4(this, 2), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i3) {
        ViewGroup viewGroup = this.w0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i3));
        }
        return null;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        kt ktVar;
        if (i3 != hs.i4 || (ktVar = this.n) == null) {
            return;
        }
        ktVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        u10 u10Var = this.P;
        if (u10Var != null) {
            this.P = null;
            u10Var.a(new ci.b4(this, 2));
            return;
        }
        if (this.k1) {
            return;
        }
        this.k1 = true;
        hs.e().n(this, hs.i4);
        DialogInterface.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        s1 s1Var = this.L;
        if (s1Var != null) {
            s1Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        org.telegram.messenger.g0.r(this.P0);
        if (this.H0 == null || (bitmap = this.F0) == null) {
            return;
        }
        bitmap.recycle();
        this.H0 = null;
        this.I0 = null;
        this.F0 = null;
    }

    public final int e() {
        int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(48.0f)) - (this.Y0 * 2));
        Rect rect = this.D0;
        return min + rect.left + rect.right;
    }

    public int f(int i3) {
        return k6.w0(i3, this.U0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup g(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        o1 o1Var = new o1(this, getContext());
        this.d1 = o1Var;
        final int i3 = 1;
        o1Var.setOrientation(1);
        boolean z11 = this.W0;
        int i10 = this.g0;
        int i11 = 3;
        final int i12 = 0;
        if ((z11 || i10 == 3) && i10 != 2) {
            this.d1.setBackground(null);
            this.d1.setPadding(0, 0, 0, 0);
            if (this.W0) {
                this.d1.setWillNotDraw(false);
            }
            this.l0 = false;
        } else {
            boolean z12 = this.m0;
            Drawable drawable = this.C0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.d1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.l0 = true;
            } else {
                this.d1.setBackground(null);
                this.d1.setPadding(0, 0, 0, 0);
                this.d1.setBackground(drawable);
                o1 o1Var2 = this.d1;
                int L = org.telegram.messenger.g0.L(8.0f);
                float L2 = org.telegram.messenger.g0.L(20.0f);
                cg.p0 p0Var = cg.t0.a;
                o1Var2.setOutlineProvider(new cg.r0(L, L2));
                this.d1.setClipToOutline(true);
                this.l0 = false;
            }
        }
        ViewGroup viewGroup = this.d1;
        boolean z13 = this.a1;
        e6 e6Var = this.U0;
        if (z13) {
            if (this.b1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.b1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.j1
                    public final /* synthetic */ s1 b;

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
                                s1 s1Var = this.b;
                                new nb(s1Var.getContext(), s1Var.U0).show();
                                break;
                            default:
                                s1 s1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(s1Var2, ((Integer) view.getTag()).intValue());
                                }
                                s1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.c1 == null) {
                ci.c cVar = new ci.c(h10.t0, getContext(), e6Var);
                this.c1 = cVar;
                pf.a(cVar);
                this.c1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.j1
                    public final /* synthetic */ s1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                s1 s1Var = this.b;
                                new nb(s1Var.getContext(), s1Var.U0).show();
                                break;
                            default:
                                s1 s1Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(s1Var2, ((Integer) view.getTag()).intValue());
                                }
                                s1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.d1);
            org.telegram.messenger.g0.E2(this.c1);
            this.b1.addView(this.d1, mf.e(-2, -2, 17));
            this.b1.addView(this.c1, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.b1;
        }
        if (z10) {
            if (this.a1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = hs.E1;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        Object[] objArr = (this.o0 == null && this.q0 == null && this.s0 == null && this.u0 == null) ? false : true;
        if (this.V == 0 && this.Y == 0 && this.c0 == null) {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.d1.addView(this.W, mf.t(-1, this.b0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        } else {
            f10 = 16.0f;
            fh0 fh0Var = new fh0(getContext());
            this.n0 = fh0Var;
            Drawable drawable2 = this.c0;
            if (drawable2 != null) {
                fh0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.c0;
                if (drawable3 instanceof org.telegram.ui.Components.p6) {
                    org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) drawable3;
                    this.n0.addOnAttachStateChangeListener(new ai.f2(p6Var, 9));
                    p6Var.a(this.n0);
                }
            } else {
                int i13 = this.V;
                if (i13 != 0) {
                    fh0Var.setImageResource(i13);
                } else {
                    fh0Var.setAutoRepeat(this.V0);
                    fh0 fh0Var2 = this.n0;
                    int i14 = this.Y;
                    int i15 = this.Z;
                    fh0Var2.f(i14, i15, i15, null);
                    if (this.a0 != null) {
                        ch0 animatedDrawable = this.n0.getAnimatedDrawable();
                        for (Map.Entry entry : this.a0.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.G();
                        }
                        this.f1 = this.d0;
                    }
                    this.n0.d();
                }
            }
            this.n0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.n0.setBackground(new r1(this.n0, this.d0, org.telegram.messenger.g0.L(52.0f) + this.Z, this.e0, this.f0));
                this.b0 = 92;
            } else if (this.e0 >= 0) {
                r6.C(this.n0, k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.d0), r6.N(this.e0), this.f0);
            } else {
                this.n0.setBackground(k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.d0));
            }
            if (this.X) {
                this.n0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.n0.setTranslationY(0.0f);
            }
            this.n0.setPadding(0, 0, 0, 0);
            this.d1.addView(this.n0, mf.t(-1, this.b0, 51, 0, 0, 0, 0));
        }
        int i16 = 10;
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            f11 = 4.0f;
            this.d1.addView(frameLayout2, mf.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            yh.l lVar = new yh.l(getContext(), null, false);
            this.f = lVar;
            hs.i(lVar);
            yh.l lVar2 = this.f;
            lVar2.s = 3;
            lVar2.setText(this.S);
            yh.l lVar3 = this.f;
            int f14 = f(k6.j5);
            this.h1 = f14;
            lVar3.setTextColor(f14);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setGravity((this.X ? 1 : bd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            yh.l lVar4 = this.f;
            boolean z14 = this.X;
            frameLayout3.addView(lVar4, mf.d(-2, -2.0f, (z14 ? 1 : bd.a0 ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z14 ? 4.0f : this.T != null ? 2 : this.Q != null ? 14 : 10));
        } else {
            f11 = 4.0f;
        }
        String str2 = this.T;
        q1 q1Var = this.l1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            r6.V(this.h, k6.J5, q1Var);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((bd.a0 ? 5 : 3) | 48);
            f12 = 20.0f;
            this.d1.addView(this.h, mf.t(-2, -2, (bd.a0 ? 5 : 3) | 48, 24, 0, 24, this.Q != null ? 14 : 10));
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
            k1 k1Var = new k1(this, getContext(), i12);
            this.w = k1Var;
            k1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.z3(this.w, f(k6.A5));
            this.d1.addView(this.w, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        }
        kt ktVar = new kt(getContext());
        this.n = ktVar;
        hs.i(ktVar);
        kt ktVar2 = this.n;
        int f15 = f(this.X ? k6.y6 : k6.j5);
        this.i1 = f15;
        ktVar2.setTextColor(f15);
        this.n.setTextSize(1, f10);
        this.n.setMovementMethod(new org.telegram.messenger.c0(false));
        r6.H(this.n, k6.k5, q1Var);
        if (!this.i0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.X ? 1 : bd.a0 ? 5 : 3) | 48);
        if (i10 == 2) {
            this.d1.addView(this.n, mf.t(-2, -2, (bd.a0 ? 5 : 3) | 48, 24, this.S == null ? 19 : 0, 24, 20));
            d70 d70Var = new d70(getContext());
            this.x0 = d70Var;
            d70Var.a(false, this.h0 / 100.0f);
            this.x0.setProgressColor(f(k6.F5));
            this.x0.setBackColor(f(k6.G5));
            this.d1.addView(this.x0, mf.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.y0 = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            this.y0.setGravity((bd.a0 ? 5 : 3) | 48);
            r6.V(this.y0, k6.q5, q1Var);
            this.y0.setTextSize(1, 14.0f);
            this.d1.addView(this.y0, mf.t(-2, -2, (bd.a0 ? 5 : 3) | 48, 23, 4, 23, 24));
            this.y0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        } else if (i10 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i17 = k6.M5;
            this.e1 = i17;
            this.X0 = f(i17);
            if (!this.W0) {
                this.r.setBackgroundDrawable(k6.d0(org.telegram.messenger.g0.L(18.0f), this.X0));
            }
            this.d1.addView(this.r, mf.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), e6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(k6.N5));
            this.r.addView(radialProgressView, mf.e(86, 86, 17));
        } else {
            kt ktVar3 = this.d;
            if (ktVar3 != null) {
                this.x.addView(ktVar3, mf.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.x.addView(this.n, mf.t(-2, -2, (this.X ? 1 : bd.a0 ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.Q == null) ? 0 : this.H));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.x.addView(textView3, mf.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
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
                    m1 m1Var = new m1(getContext(), e6Var);
                    CharSequence charSequence = this.Q[i18];
                    int[] iArr = this.R;
                    m1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    m1Var.setTag(Integer.valueOf(i18));
                    this.Q0.add(m1Var);
                    this.x.addView(m1Var, mf.o(-1, 50));
                    final int i19 = 2;
                    m1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.j1
                        public final /* synthetic */ s1 b;

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
                                    s1 s1Var = this.b;
                                    new nb(s1Var.getContext(), s1Var.U0).show();
                                    break;
                                default:
                                    s1 s1Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(s1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    s1Var2.dismiss();
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
            this.x.addView(this.b, mf.o(-1, this.e));
        }
        if (objArr != false) {
            if (!this.L0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.o0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0) : 0;
                if (this.q0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.q0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.s0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str3 = this.s0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (this.u0 != null) {
                    if (measureText > 0) {
                        measureText += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.u0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + measureText);
                }
                if (measureText > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (!this.M0 || this.o0 == null || this.q0 == null || this.s0 == null || this.u0 == null) {
                        this.L0 = true;
                    } else {
                        this.N0 = true;
                    }
                }
            }
            if (this.L0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.w0 = linearLayout2;
            } else {
                this.w0 = new ai.o2(i16, getContext(), this);
            }
            if (this.c != null) {
                this.w0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f11));
                this.w0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            this.d1.addView(this.w0, mf.o(-1, this.N0 ? 96 : 52));
            if (this.X) {
                this.w0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.o0 != null) {
                l1 l1Var = new l1(getContext(), i12);
                l1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                l1Var.setTag(-1);
                l1Var.setTextSize(1, 16.0f);
                r6.V(l1Var, this.J, q1Var);
                l1Var.setGravity(17);
                l1Var.setTypeface(org.telegram.messenger.g0.o());
                l1Var.setText(this.o0);
                l1Var.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    f13 = 64.0f;
                    this.w0.addView(l1Var, mf.r(-1, 40, 7));
                } else {
                    f13 = 64.0f;
                    this.w0.addView(l1Var, mf.e(-2, 40, 53));
                }
                l1Var.setOnClickListener(new org.telegram.messenger.video.g(i11, this, l1Var));
            } else {
                f13 = 64.0f;
            }
            if (this.q0 != null) {
                l1 l1Var2 = new l1(getContext(), i3);
                l1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var2.setTag(-2);
                l1Var2.setTextSize(1, 16.0f);
                r6.V(l1Var2, this.J, q1Var);
                l1Var2.setGravity(17);
                l1Var2.setTypeface(org.telegram.messenger.g0.o());
                l1Var2.setEllipsize(TextUtils.TruncateAt.END);
                l1Var2.setSingleLine(true);
                l1Var2.setText(this.q0.toString());
                l1Var2.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.w0.addView(l1Var2, 0, mf.r(-1, 40, 7));
                } else {
                    this.w0.addView(l1Var2, mf.e(-2, 40, 53));
                }
                l1Var2.setOnClickListener(new org.telegram.messenger.video.g(4, this, l1Var2));
            }
            if (this.u0 != null) {
                l1 l1Var3 = new l1(getContext(), 2);
                l1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var3.setTag(-3);
                l1Var3.setTextSize(1, 16.0f);
                r6.V(l1Var3, this.J, q1Var);
                l1Var3.setGravity(17);
                l1Var3.setTypeface(org.telegram.messenger.g0.o());
                l1Var3.setEllipsize(TextUtils.TruncateAt.END);
                l1Var3.setSingleLine(true);
                l1Var3.setText(this.u0.toString());
                l1Var3.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.w0.addView(l1Var3, 1, mf.r(-1, 40, 7));
                } else {
                    this.w0.addView(l1Var3, mf.e(-2, 40, 51));
                }
                l1Var3.setOnClickListener(new org.telegram.messenger.video.g(5, this, l1Var3));
            }
            if (this.s0 != null) {
                l1 l1Var4 = new l1(getContext(), i11);
                l1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var4.setTag(-4);
                l1Var4.setTextSize(1, 16.0f);
                r6.V(l1Var4, this.J, q1Var);
                l1Var4.setGravity(17);
                l1Var4.setTypeface(org.telegram.messenger.g0.o());
                l1Var4.setEllipsize(TextUtils.TruncateAt.END);
                l1Var4.setSingleLine(true);
                l1Var4.setText(this.s0.toString());
                l1Var4.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.w0.addView(l1Var4, 0, mf.r(-1, 40, 7));
                } else {
                    this.w0.addView(l1Var4, mf.e(-2, 40, 53));
                }
                l1Var4.setOnClickListener(new org.telegram.messenger.video.g(6, this, l1Var4));
            }
            if (this.L0) {
                while (i3 < this.w0.getChildCount()) {
                    ((ViewGroup.MarginLayoutParams) this.w0.getChildAt(i3).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(6.0f);
                    i3++;
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.a1) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = org.telegram.messenger.g0.q.x;
            this.d1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i10 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.S0) {
                layoutParams3.dimAmount = this.T0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.M = org.telegram.messenger.g0.q.x;
            layoutParams3.width = e();
        }
        View view3 = this.b;
        if (view3 != null && this.B0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.W0) {
            org.telegram.messenger.g0.l2(new j8(this, 17), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final sf.b h(int i3, boolean z10, boolean z11) {
        View d = d(i3);
        if (z11) {
            this.k0 = false;
        }
        return new sf.b(new i1(0, d), new v6(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            r6.V(textView, k6.q7, this.l1);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i3) {
        this.e1 = -1;
        this.X0 = i3;
        Drawable drawable = this.C0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.X0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.j0 = false;
    }

    public final void l(boolean z10) {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.K0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i3, int i10, int i11) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Q0;
            if (i3 >= arrayList.size()) {
                return;
            }
            m1 m1Var = (m1) arrayList.get(i3);
            m1Var.a.setTextColor(i10);
            m1Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
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

    public final void o(int i3) {
        this.h0 = i3;
        d70 d70Var = this.x0;
        if (d70Var != null) {
            d70Var.a(true, i3 / 100.0f);
            this.y0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        i60 i60Var = this.z0;
        if (i60Var != null) {
            i60Var.g(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        hs.e().c(this, hs.i4);
    }

    public final void p(int i3) {
        this.j1 = true;
        yh.l lVar = this.f;
        if (lVar != null) {
            lVar.setTextColor(i3);
        }
        kt ktVar = this.n;
        if (ktVar != null) {
            ktVar.setTextColor(i3);
        }
    }

    public final void q() {
        if (this.j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.U0);
            String M0 = bd.M0(2131744842, null);
            s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131744843, null);
            alertDialog$Builder.k(bd.M0(2131743223, null), null);
            alertDialog$Builder.h(bd.M0(2131744851, null), new l5.b(this, 28));
            alertDialog$Builder.j(new ba(this, 9));
            try {
                this.L = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        ci.b4 b4Var = this.P0;
        org.telegram.messenger.g0.r(b4Var);
        org.telegram.messenger.g0.i3(b4Var, j10);
    }

    public final void s() {
        fh0 fh0Var;
        int w02;
        if (this.e0 < 0 || this.a0 == null || (fh0Var = this.n0) == null || fh0Var.getAnimatedDrawable() == null || (w02 = k6.w0(this.e0, this.f0)) == this.f1) {
            return;
        }
        ch0 animatedDrawable = this.n0.getAnimatedDrawable();
        for (Map.Entry entry : this.a0.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f1) {
                entry.setValue(Integer.valueOf(w02));
                animatedDrawable.Q(w02, (String) entry.getKey());
            }
        }
        this.f1 = w02;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        k1 k1Var = this.w;
        if (k1Var != null) {
            k1Var.postDelayed(runnable, j10);
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
        yh.l lVar = this.f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            this.k1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.g0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.Z0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        k1 k1Var = this.w;
        if (k1Var != null) {
            k1Var.removeCallbacks(runnable);
        }
    }

    public s1(int i3, Context context, e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = 12;
        this.J = k6.H5;
        this.b0 = hs.Q1;
        this.e0 = -1;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.A0 = new int[2];
        this.B0 = true;
        this.O0 = new ci.b4(this, 2);
        this.P0 = new ci.b4(this, 3);
        this.Q0 = new ArrayList();
        this.S0 = true;
        this.T0 = 0.5f;
        this.V0 = true;
        this.e1 = -1;
        this.l1 = new q1(this, 0);
        this.U0 = e6Var;
        this.g0 = i3;
        int i10 = k6.h5;
        this.e1 = i10;
        int f10 = f(i10);
        this.X0 = f10;
        boolean z10 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.W0 = az.o() >= 2 && lc.e(256) && z10;
        Rect rect = new Rect();
        this.D0 = rect;
        if (i3 != 3 || this.W0) {
            Drawable g7 = k2.p1.g(context, R.drawable.popup_fixed_alert4);
            this.C0 = g7;
            this.E0 = i3 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            g7.setColorFilter(new PorterDuffColorFilter(this.X0, PorterDuff.Mode.MULTIPLY));
            g7.getPadding(rect);
        }
        this.I = i3 == 3;
    }
}
