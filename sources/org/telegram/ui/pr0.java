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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pr0 extends Dialog {
    public float E;
    public float F;
    public final si.b G;
    public final eh.c H;
    public org.telegram.messenger.zi I;
    public boolean J;
    public nr0 K;
    public or0 L;
    public org.telegram.ui.Cells.q1 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public org.telegram.ui.Components.li0 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Context a;
    public float a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public float b0;
    public final lr0 c;
    public boolean c0;
    public final lr0 d;
    public boolean d0;
    public final lr0 e;
    public boolean e0;
    public final gi.g1 f;
    public pl f0;
    public ValueAnimator g0;
    public final TextView h;
    public ValueAnimator h0;
    public final org.telegram.ui.Components.ba0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public pr0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        int i3 = 0;
        this.d0 = false;
        this.a = activity;
        this.b = e6Var;
        lr0 lr0Var = new lr0(this, activity, i3);
        this.c = lr0Var;
        lr0Var.setOnClickListener(new b40(this, 23));
        si.b bVar = new si.b();
        this.G = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new kh.k(lr0Var);
        cVar.i = lr0Var;
        lr0 lr0Var2 = new lr0(this, activity, 1);
        this.d = lr0Var2;
        lr0Var2.setClipToPadding(false);
        lr0Var.addView(lr0Var2, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        gi.g1 g1Var = new gi.g1(5, activity, this);
        this.f = g1Var;
        g1Var.setAdapter(new ci.o4(4, activity, this));
        lr0Var2.addView(g1Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        lr0 lr0Var3 = new lr0(this, activity, 2);
        this.e = lr0Var3;
        lr0Var2.addView(lr0Var3, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(activity, e6Var);
        this.n = ba0Var;
        ba0Var.a(0, org.telegram.messenger.bd.M0(2131747176, null));
        ba0Var.a(1, org.telegram.messenger.bd.M0(2131747175, null));
        lr0Var2.addView(ba0Var, b8.mf.e(-1, 66, 80));
        ba0Var.setOnTabClick(new s3(g1Var, 18));
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.R.e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ba0Var.getColor());
        textView.setText(org.telegram.messenger.bd.M0(2131747177, null));
        textView.setGravity(17);
        lr0Var2.addView(textView, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        mr0 mr0Var = new mr0(this, i3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(lr0Var, mr0Var);
    }

    public final void b(boolean z10, gr0 gr0Var) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i3 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.hr0
            public final /* synthetic */ pr0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i3) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        pr0 pr0Var = this.b;
                        pr0Var.E = floatValue;
                        pr0Var.c.invalidate();
                        pr0Var.d.invalidate();
                        nr0 nr0Var = pr0Var.K;
                        if (nr0Var != null) {
                            nr0Var.invalidate();
                        }
                        pr0Var.e();
                        break;
                    default:
                        pr0 pr0Var2 = this.b;
                        pr0Var2.getClass();
                        pr0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new androidx.fragment.app.g(this, z10, gr0Var, 12));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.g0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.g0.setDuration(j10);
        this.g0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.hr0
            public final /* synthetic */ pr0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        pr0 pr0Var = this.b;
                        pr0Var.E = floatValue;
                        pr0Var.c.invalidate();
                        pr0Var.d.invalidate();
                        nr0 nr0Var = pr0Var.K;
                        if (nr0Var != null) {
                            nr0Var.invalidate();
                        }
                        pr0Var.e();
                        break;
                    default:
                        pr0 pr0Var2 = this.b;
                        pr0Var2.getClass();
                        pr0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.h0.addListener(new u40(4, this, z10));
        this.h0.setDuration((long) (j10 * 1.5f));
        this.h0.setInterpolator(xqVar);
        this.h0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.li0 li0Var;
        if (z10 && (li0Var = this.R) != null && li0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().q) {
            this.R.e();
            return;
        }
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.Z = false;
        gi.g1 g1Var = this.f;
        g1Var.g();
        boolean z11 = g1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.q1 q1Var2 = this.M;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.M.invalidate();
            }
        } else if (!z10 && (q1Var = this.M) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.M;
            q1Var3.c6 = null;
            q1Var3.invalidate();
        }
        this.e0 = !z10;
        d();
        b(false, new gr0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Z) {
            return;
        }
        lr0 lr0Var = this.c;
        if (lr0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.M;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            i0.b bVar = this.r;
            this.X = i3 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.Y = f10;
            if (!this.c0) {
                this.c0 = true;
                this.a0 = f10;
                if (this.U != null) {
                    float height = f10 + this.M.getHeight() + this.U.getHeight();
                    int height2 = lr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = lr0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.a0 = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                    }
                }
                int V1 = this.K.V1(this.Q);
                this.K.U1(V1);
                float T1 = this.K.T1(V1);
                float f11 = this.Y;
                this.b0 = f11;
                float f12 = (int) T1;
                float f13 = f11 + f12;
                int height4 = lr0Var.getHeight();
                i0.b bVar4 = this.r;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.h;
                if (f13 > L - textView.getHeight()) {
                    int height5 = lr0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.b0 = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.S != null) {
                    float height6 = this.b0 + f12 + r3.getHeight();
                    int height7 = lr0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = lr0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.b0 = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.S.getHeight();
                    }
                }
            }
            e();
        } else {
            this.Y = 0.0f;
            this.X = 0.0f;
        }
        this.Z = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        gi.g1 g1Var = this.f;
        float positionAnimated = g1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.Y;
                this.a0 = f10;
                float height = f10 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                lr0 lr0Var = this.c;
                int height2 = lr0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = lr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.a0 = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.L.setTranslationX(org.telegram.messenger.g0.T1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + W12);
        this.L.setTranslationY(org.telegram.messenger.g0.T1(this.Y, this.a0, this.e0 ? 1.0f : this.E));
        ViewGroup viewGroup2 = this.U;
        lr0 lr0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.J) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((W12 + 0.0f) + this.L.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.U.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.L.X2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = lr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - lr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        this.K.setTranslationX(org.telegram.messenger.g0.T1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + W1);
        this.K.setTranslationY(org.telegram.messenger.g0.T1(this.Y, this.b0, this.e0 ? 1.0f : this.E));
        if (this.S != null) {
            int V1 = this.K.V1(this.Q);
            this.K.U1(V1);
            float T12 = this.K.T1(V1);
            if (this.J) {
                this.S.setTranslationX(((this.K.getPollButtonsLeft() + ((W1 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                this.S.setTranslationX((((W1 + 0.0f) + (this.K.X2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = lr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) T12)) - this.S.getTop()) - lr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T13);
            this.S.setScaleY(T13);
        }
        if (this.e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - lr0Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.E);
        org.telegram.ui.Components.ba0 ba0Var = this.n;
        ba0Var.setSelectedTab(positionAnimated);
        ba0Var.setAlpha(this.E);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        lr0 lr0Var = this.c;
        setContentView(lr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.hs.E1;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i3 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        lr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(lr0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.nk0.d(new c5(this, 15));
            this.P = true;
            b(true, null);
        }
    }
}
