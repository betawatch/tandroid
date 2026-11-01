package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jt0 extends Dialog {
    public float D;
    public float E;
    public final hi.b F;
    public final tg.b G;
    public org.telegram.messenger.kj H;
    public boolean I;
    public ht0 J;
    public it0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.nj0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context a;
    public float a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public boolean b0;
    public final ft0 c;
    public boolean c0;
    public final ft0 d;
    public boolean d0;
    public final ft0 e;
    public pm e0;
    public final hk f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.ya0 n;
    public i0.c r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public jt0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.c.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i10 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = p6Var;
        ft0 ft0Var = new ft0(this, activity, i10);
        this.c = ft0Var;
        ft0Var.setOnClickListener(new e50(this, 23));
        hi.b bVar = new hi.b();
        this.F = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.G = bVar2;
        bVar2.h = new zg.h(ft0Var);
        bVar2.i = ft0Var;
        ft0 ft0Var2 = new ft0(this, activity, 1);
        this.d = ft0Var2;
        ft0Var2.setClipToPadding(false);
        ft0Var.addView(ft0Var2, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        int i11 = 2;
        hk hkVar = new hk(this, activity, i11);
        this.f = hkVar;
        hkVar.setAdapter(new mg.s(this, activity, 3));
        ft0Var2.addView(hkVar, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        ft0 ft0Var3 = new ft0(this, activity, i11);
        this.e = ft0Var3;
        ft0Var2.addView(ft0Var3, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        org.telegram.ui.Components.ya0 ya0Var = new org.telegram.ui.Components.ya0(activity, p6Var);
        this.n = ya0Var;
        ya0Var.a(0, org.telegram.messenger.dd.L0(2131747183, null));
        ya0Var.a(1, org.telegram.messenger.dd.L0(2131747182, null));
        ft0Var2.addView(ya0Var, w7.b6.e(-1, 66, 80));
        ya0Var.setOnTabClick(new s3(hkVar, 18));
        vg.f c10 = bVar2.c(ya0Var, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.P.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ya0Var.getColor());
        textView.setText(org.telegram.messenger.dd.L0(2131747184, null));
        textView.setGravity(17);
        ft0Var2.addView(textView, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        gt0 gt0Var = new gt0(this, i10);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(ft0Var, gt0Var);
    }

    public final void b(boolean z10, at0 at0Var) {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bt0
            public final /* synthetic */ jt0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        jt0 jt0Var = this.b;
                        jt0Var.D = floatValue;
                        jt0Var.c.invalidate();
                        jt0Var.d.invalidate();
                        ht0 ht0Var = jt0Var.J;
                        if (ht0Var != null) {
                            ht0Var.invalidate();
                        }
                        jt0Var.e();
                        break;
                    default:
                        jt0 jt0Var2 = this.b;
                        jt0Var2.getClass();
                        jt0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new androidx.fragment.app.g(this, z10, at0Var, 9));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.f0.setDuration(j10);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bt0
            public final /* synthetic */ jt0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        jt0 jt0Var = this.b;
                        jt0Var.D = floatValue;
                        jt0Var.c.invalidate();
                        jt0Var.d.invalidate();
                        ht0 ht0Var = jt0Var.J;
                        if (ht0Var != null) {
                            ht0Var.invalidate();
                        }
                        jt0Var.e();
                        break;
                    default:
                        jt0 jt0Var2 = this.b;
                        jt0Var2.getClass();
                        jt0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new org.telegram.ui.Components.ha0(20, this, z10));
        this.g0.setDuration((long) (j10 * 1.5f));
        this.g0.setInterpolator(grVar);
        this.g0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.nj0 nj0Var;
        if (z10 && (nj0Var = this.Q) != null && nj0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.Y = false;
        hk hkVar = this.f;
        hkVar.l();
        boolean z11 = hkVar.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.q1 q1Var2 = this.L;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (q1Var = this.L) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.L;
            q1Var3.b6 = null;
            q1Var3.invalidate();
        }
        this.d0 = !z10;
        d();
        b(false, new at0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        ft0 ft0Var = this.c;
        if (ft0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.L;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.r;
            this.W = i10 - cVar.a;
            float f7 = iArr[1] - cVar.b;
            this.X = f7;
            if (!this.b0) {
                this.b0 = true;
                this.Z = f7;
                if (this.T != null) {
                    float height = f7 + this.L.getHeight() + this.T.getHeight();
                    int height2 = ft0Var.getHeight();
                    i0.c cVar2 = this.r;
                    if (height > ((height2 - cVar2.b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) {
                        int height3 = ft0Var.getHeight();
                        i0.c cVar3 = this.r;
                        this.Z = ((((height3 - cVar3.b) - cVar3.d) - org.telegram.messenger.i0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int T1 = this.J.T1(this.P);
                this.J.S1(T1);
                float R1 = this.J.R1(T1);
                float f10 = this.X;
                this.a0 = f10;
                float f11 = (int) R1;
                float f12 = f10 + f11;
                int height4 = ft0Var.getHeight();
                i0.c cVar4 = this.r;
                int L = ((height4 - cVar4.b) - cVar4.d) - org.telegram.messenger.i0.L(78.0f);
                TextView textView = this.h;
                if (f12 > L - textView.getHeight()) {
                    int height5 = ft0Var.getHeight();
                    i0.c cVar5 = this.r;
                    this.a0 = ((((height5 - cVar5.b) - cVar5.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f11 + r3.getHeight();
                    int height7 = ft0Var.getHeight();
                    i0.c cVar6 = this.r;
                    if (height6 > (((height7 - cVar6.b) - cVar6.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) {
                        int height8 = ft0Var.getHeight();
                        i0.c cVar7 = this.r;
                        this.a0 = (((((height8 - cVar7.b) - cVar7.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
                    }
                }
            }
            e();
        } else {
            this.X = 0.0f;
            this.W = 0.0f;
        }
        this.Y = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        hk hkVar = this.f;
        float positionAnimated = hkVar.getPositionAnimated();
        float W1 = org.telegram.messenger.i0.W1(positionAnimated, 0, -hkVar.getWidth());
        float W12 = org.telegram.messenger.i0.W1(positionAnimated, hkVar.getWidth(), 0);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.X;
                this.Z = f7;
                float height = f7 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ft0 ft0Var = this.c;
                int height2 = ft0Var.getHeight();
                i0.c cVar = this.r;
                if (height > ((height2 - cVar.b) - cVar.d) - org.telegram.messenger.i0.L(66.0f)) {
                    int height3 = ft0Var.getHeight();
                    i0.c cVar2 = this.r;
                    this.Z = ((((height3 - cVar2.b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(org.telegram.messenger.i0.T1(this.W, 0.0f, this.d0 ? 1.0f : this.D) + W12);
        this.K.setTranslationY(org.telegram.messenger.i0.T1(this.X, this.Z, this.d0 ? 1.0f : this.D));
        ViewGroup viewGroup2 = this.T;
        ft0 ft0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.K.V2() ? org.telegram.messenger.i0.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = ft0Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - ft0Var2.getTop());
            this.T.setAlpha(this.D);
            float T1 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.D);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        this.J.setTranslationX(org.telegram.messenger.i0.T1(this.W, 0.0f, this.d0 ? 1.0f : this.D) + W1);
        this.J.setTranslationY(org.telegram.messenger.i0.T1(this.X, this.a0, this.d0 ? 1.0f : this.D));
        if (this.R != null) {
            int T12 = this.J.T1(this.P);
            this.J.S1(T12);
            float R1 = this.J.R1(T12);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((W1 + 0.0f) + (this.J.V2() ? org.telegram.messenger.i0.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = ft0Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) R1)) - this.R.getTop()) - ft0Var2.getTop());
            this.R.setAlpha(this.D);
            float T13 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.D);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.d0) {
            this.K.setAlpha(this.D);
            this.J.setAlpha(this.D);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.i0.L(22.0f)) - ft0Var2.getTop()));
            this.Q.setAlpha(this.D);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.D);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.D);
        org.telegram.ui.Components.ya0 ya0Var = this.n;
        ya0Var.setSelectedTab(positionAnimated);
        ya0Var.setAlpha(this.D);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ft0 ft0Var = this.c;
        setContentView(ft0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.at.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        ft0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(ft0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.ol0.d(new z4(this, 15));
            this.O = true;
            b(true, null);
        }
    }
}
