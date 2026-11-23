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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i81 extends Dialog {
    public float E;
    public final ui.b F;
    public final dh.c G;
    public org.telegram.messenger.gj H;
    public boolean I;
    public g81 J;
    public zr0 K;
    public org.telegram.ui.Cells.r1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.xi0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.h6 a;
    public boolean a0;
    public final f81 b;
    public boolean b0;
    public final f81 c;
    public boolean c0;
    public final f81 d;
    public ul d0;
    public final hi.i1 e;
    public ValueAnimator e0;
    public final TextView f;
    public ValueAnimator f0;
    public final org.telegram.ui.Components.ua0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public i81(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.b0 = false;
        this.a = h6Var;
        f81 f81Var = new f81(this, activity, 0);
        this.b = f81Var;
        f81Var.setOnClickListener(new oy0(this, 8));
        ui.b bVar = new ui.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(f81Var);
        cVar.i = f81Var;
        f81 f81Var2 = new f81(this, activity, 1);
        this.c = f81Var2;
        f81Var2.setClipToPadding(false);
        f81Var.addView(f81Var2, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        hi.i1 i1Var = new hi.i1(7, activity, this);
        this.e = i1Var;
        i1Var.setAdapter(new di.i4(6, activity, this));
        f81Var2.addView(i1Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        f81 f81Var3 = new f81(this, activity, 2);
        this.d = f81Var3;
        f81Var2.addView(f81Var3, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        org.telegram.ui.Components.ua0 ua0Var = new org.telegram.ui.Components.ua0(activity, h6Var);
        this.h = ua0Var;
        ua0Var.a(0, org.telegram.messenger.hd.N0(2131743826, null));
        ua0Var.a(1, org.telegram.messenger.hd.N0(2131743827, null));
        f81Var2.addView(ua0Var, c8.ma.e(-1, 66, 80));
        ua0Var.setOnTabClick(new r3(i1Var, 26));
        fh.g c10 = cVar.c(ua0Var, null, false);
        c10.p(c8.i0.l(h6Var));
        c10.R.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ua0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ua0Var.getColor());
        textView.setText(org.telegram.messenger.hd.N0(2131743828, null));
        textView.setGravity(17);
        f81Var2.addView(textView, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        xr0 xr0Var = new xr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(f81Var, xr0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.rp0 rp0Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i7 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.d81
            public final /* synthetic */ i81 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i7) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        i81 i81Var = this.b;
                        i81Var.y = floatValue;
                        i81Var.b.invalidate();
                        i81Var.c.invalidate();
                        i81Var.e();
                        break;
                    default:
                        i81 i81Var2 = this.b;
                        i81Var2.getClass();
                        i81Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new androidx.fragment.app.g(this, z10, rp0Var, 14));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.e0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.e0.setDuration(j3);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.d81
            public final /* synthetic */ i81 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        i81 i81Var = this.b;
                        i81Var.y = floatValue;
                        i81Var.b.invalidate();
                        i81Var.c.invalidate();
                        i81Var.e();
                        break;
                    default:
                        i81 i81Var2 = this.b;
                        i81Var2.getClass();
                        i81Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new c30(11, this, z10));
        this.f0.setDuration((long) (j3 * 1.5f));
        this.f0.setInterpolator(nrVar);
        this.f0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.xi0 xi0Var;
        if (z10 && (xi0Var = this.Q) != null && xi0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.b0) {
            return;
        }
        this.b0 = true;
        this.X = false;
        hi.i1 i1Var = this.e;
        i1Var.g();
        boolean z11 = i1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.r1 r1Var2 = this.L;
            if (r1Var2 != null) {
                r1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (r1Var = this.L) != null) {
            r1Var.setVisibility(0);
            org.telegram.ui.Cells.r1 r1Var3 = this.L;
            r1Var3.c6 = -1;
            r1Var3.invalidate();
        }
        this.c0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.rp0(15, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.X) {
            return;
        }
        f81 f81Var = this.b;
        if (f81Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = this.L;
        if (r1Var != null) {
            int[] iArr = new int[2];
            r1Var.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            i0.b bVar = this.n;
            this.V = i7 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.W = f10;
            if (!this.a0) {
                this.a0 = true;
                this.Y = f10;
                if (this.T != null) {
                    float height = f10 + this.L.getHeight() + this.T.getHeight();
                    int height2 = f81Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = f81Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.Y = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int c22 = this.J.c2(this.P);
                this.J.V1(c22);
                float U1 = this.J.U1(c22);
                float f11 = this.W;
                this.Z = f11;
                float f12 = (int) U1;
                float f13 = f11 + f12;
                int height4 = f81Var.getHeight();
                i0.b bVar4 = this.n;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.f;
                if (f13 > L - textView.getHeight()) {
                    int height5 = f81Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Z = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.Z + f12 + r3.getHeight();
                    int height7 = f81Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = f81Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Z = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
                    }
                }
            }
            e();
        } else {
            this.W = 0.0f;
            this.V = 0.0f;
        }
        this.X = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        hi.i1 i1Var = this.e;
        float positionAnimated = i1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -i1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, i1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.W;
                this.Y = f10;
                float height = f10 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                f81 f81Var = this.b;
                int height2 = f81Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = f81Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.Y = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(org.telegram.messenger.g0.T1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + W12);
        this.K.setTranslationY(org.telegram.messenger.g0.T1(this.W, this.Y, this.c0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        f81 f81Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.K.b3() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = f81Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - f81Var2.getTop());
            this.T.setAlpha(this.y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        this.J.setTranslationX(org.telegram.messenger.g0.T1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + W1);
        this.J.setTranslationY(org.telegram.messenger.g0.T1(this.W, this.Z, this.c0 ? 1.0f : this.y));
        if (this.R != null) {
            int c22 = this.J.c2(this.P);
            this.J.V1(c22);
            float U1 = this.J.U1(c22);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((W1 + 0.0f) + (this.J.b3() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = f81Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) U1)) - this.R.getTop()) - f81Var2.getTop());
            this.R.setAlpha(this.y);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.R.setScaleX(T12);
            this.R.setScaleY(T12);
        }
        if (this.c0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - f81Var2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.ua0 ua0Var = this.h;
        ua0Var.setSelectedTab(positionAnimated);
        ua0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        f81 f81Var = this.b;
        setContentView(f81Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ls.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i7 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        f81Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(f81Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.yk0.d(new a5(this, 29));
            this.O = true;
            b(true, null);
        }
    }
}
