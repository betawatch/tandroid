package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g81 extends Dialog {
    public float D;
    public final ri.b E;
    public final dh.c F;
    public org.telegram.messenger.ij G;
    public boolean H;
    public e81 I;
    public yr0 J;
    public org.telegram.ui.Cells.q1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.ii0 P;
    public ViewGroup Q;
    public float R;
    public ViewGroup S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final org.telegram.ui.ActionBar.f6 a;
    public boolean a0;
    public final d81 b;
    public boolean b0;
    public final d81 c;
    public tl c0;
    public final d81 d;
    public ValueAnimator d0;
    public final fi.g1 e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.ga0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public g81(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = f6Var;
        d81 d81Var = new d81(this, activity, 0);
        this.b = d81Var;
        d81Var.setOnClickListener(new my0(this, 8));
        ri.b bVar = new ri.b();
        this.E = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(d81Var);
        cVar.i = d81Var;
        d81 d81Var2 = new d81(this, activity, 1);
        this.c = d81Var2;
        d81Var2.setClipToPadding(false);
        d81Var.addView(d81Var2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fi.g1 g1Var = new fi.g1(7, activity, this);
        this.e = g1Var;
        g1Var.setAdapter(new bi.g5(6, activity, this));
        d81Var2.addView(g1Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        d81 d81Var3 = new d81(this, activity, 2);
        this.d = d81Var3;
        d81Var2.addView(d81Var3, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(activity, f6Var);
        this.h = ga0Var;
        ga0Var.a(0, org.telegram.messenger.id.M0(2131744072, null));
        ga0Var.a(1, org.telegram.messenger.id.M0(2131744073, null));
        d81Var2.addView(ga0Var, c8.ha.e(-1, 66, 80));
        ga0Var.setOnTabClick(new r3(g1Var, 25));
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.Q.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ga0Var.getColor());
        textView.setText(org.telegram.messenger.id.M0(2131744074, null));
        textView.setGravity(17);
        d81Var2.addView(textView, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wr0 wr0Var = new wr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(d81Var, wr0Var);
    }

    public final void b(boolean z9, org.telegram.ui.Components.tp0 tp0Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i7 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z9 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b81
            public final /* synthetic */ g81 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i7) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        g81 g81Var = this.b;
                        g81Var.y = floatValue;
                        g81Var.b.invalidate();
                        g81Var.c.invalidate();
                        g81Var.e();
                        break;
                    default:
                        g81 g81Var2 = this.b;
                        g81Var2.getClass();
                        g81Var2.D = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new ai.g0(this, z9, tp0Var, 14));
        long j3 = !z9 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, z9 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b81
            public final /* synthetic */ g81 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        g81 g81Var = this.b;
                        g81Var.y = floatValue;
                        g81Var.b.invalidate();
                        g81Var.c.invalidate();
                        g81Var.e();
                        break;
                    default:
                        g81 g81Var2 = this.b;
                        g81Var2.getClass();
                        g81Var2.D = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new z40(10, this, z9));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(xqVar);
        this.e0.start();
    }

    public final void c(boolean z9) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.ii0 ii0Var;
        if (z9 && (ii0Var = this.P) != null && ii0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        fi.g1 g1Var = this.e;
        g1Var.l();
        boolean z10 = g1Var.getCurrentPosition() == 1;
        if (z9 && z10) {
            org.telegram.ui.Cells.q1 q1Var2 = this.K;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z9 && (q1Var = this.K) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.K;
            q1Var3.b6 = -1;
            q1Var3.invalidate();
        }
        this.b0 = !z9;
        d();
        b(false, new org.telegram.ui.Components.tp0(14, this, z10));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        d81 d81Var = this.b;
        if (d81Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.K;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            i0.b bVar = this.n;
            this.U = i7 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.V = f10;
            if (!this.Z) {
                this.Z = true;
                this.X = f10;
                if (this.S != null) {
                    float height = f10 + this.K.getHeight() + this.S.getHeight();
                    int height2 = d81Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = d81Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.X = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int b22 = this.I.b2(this.O);
                this.I.U1(b22);
                float T1 = this.I.T1(b22);
                float f11 = this.V;
                this.Y = f11;
                float f12 = (int) T1;
                float f13 = f11 + f12;
                int height4 = d81Var.getHeight();
                i0.b bVar4 = this.n;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.f;
                if (f13 > L - textView.getHeight()) {
                    int height5 = d81Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Y = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f12 + r3.getHeight();
                    int height7 = d81Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = d81Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Y = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
                    }
                }
            }
            e();
        } else {
            this.V = 0.0f;
            this.U = 0.0f;
        }
        this.W = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        fi.g1 g1Var = this.e;
        float positionAnimated = g1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.V;
                this.X = f10;
                float height = f10 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                d81 d81Var = this.b;
                int height2 = d81Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = d81Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.X = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(org.telegram.messenger.g0.T1(this.U, 0.0f, this.b0 ? 1.0f : this.y) + W12);
        this.J.setTranslationY(org.telegram.messenger.g0.T1(this.V, this.X, this.b0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.S;
        d81 d81Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((W12 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.J.Y2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = d81Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - d81Var2.getTop());
            this.S.setAlpha(this.y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.S.setScaleX(T1);
            this.S.setScaleY(T1);
        }
        this.I.setTranslationX(org.telegram.messenger.g0.T1(this.U, 0.0f, this.b0 ? 1.0f : this.y) + W1);
        this.I.setTranslationY(org.telegram.messenger.g0.T1(this.V, this.Y, this.b0 ? 1.0f : this.y));
        if (this.Q != null) {
            int b22 = this.I.b2(this.O);
            this.I.U1(b22);
            float T12 = this.I.T1(b22);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((W1 + 0.0f) + this.I.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.Q.getLeft());
            } else {
                this.Q.setTranslationX((((W1 + 0.0f) + (this.I.Y2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = d81Var2.getMeasuredWidth() - (this.Q.getX() - W12);
            this.Q.setTranslationY(((this.I.getY() + ((int) T12)) - this.Q.getTop()) - d81Var2.getTop());
            this.Q.setAlpha(this.y);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.Q.setScaleX(T13);
            this.Q.setScaleY(T13);
        }
        if (this.b0) {
            this.J.setAlpha(this.y);
            this.I.setAlpha(this.y);
        }
        if (this.P != null) {
            float max = W12 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - d81Var2.getTop()));
            this.P.setAlpha(this.y);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.ga0 ga0Var = this.h;
        ga0Var.setSelectedTab(positionAnimated);
        ga0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        d81 d81Var = this.b;
        setContentView(d81Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i7 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        d81Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(d81Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.jk0.d(new a5(this, 29));
            this.N = true;
            b(true, null);
        }
    }
}
