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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ow0 extends Dialog {
    public float E;
    public final eh.b F;
    public final zg.a G;
    public MessageObject H;
    public boolean I;
    public mw0 J;
    public nw0 K;
    public org.telegram.ui.Cells.t1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.pk0 Q;
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
    public final org.telegram.ui.ActionBar.f6 b;
    public boolean b0;
    public final jw0 c;
    public boolean c0;
    public final jw0 d;
    public boolean d0;
    public final jw0 e;
    public an e0;
    public final bi.p1 f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.cc0 n;
    public i0.c r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public ow0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.c.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i10 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = f6Var;
        jw0 jw0Var = new jw0(this, activity, i10);
        this.c = jw0Var;
        jw0Var.setOnClickListener(new l60(this, 22));
        eh.b bVar = new eh.b();
        this.F = bVar;
        zg.a aVar = new zg.a(bVar);
        this.G = aVar;
        aVar.d = new gh.k(jw0Var);
        aVar.e = jw0Var;
        jw0 jw0Var2 = new jw0(this, activity, 1);
        this.d = jw0Var2;
        jw0Var2.setClipToPadding(false);
        jw0Var.addView(jw0Var2, w7.a6.e(-1, -1, 119));
        bi.p1 p1Var = new bi.p1(this, activity, 5);
        this.f = p1Var;
        p1Var.setAdapter(new kw0(this, activity, i10));
        jw0Var2.addView(p1Var, w7.a6.e(-1, -1, 119));
        jw0 jw0Var3 = new jw0(this, activity, 2);
        this.e = jw0Var3;
        jw0Var2.addView(jw0Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(activity, f6Var);
        this.n = cc0Var;
        cc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        cc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        jw0Var2.addView(cc0Var, w7.a6.e(-1, 66, 80));
        cc0Var.setOnTabClick(new u3(p1Var, 14));
        bh.d c10 = aVar.c(cc0Var, null, false);
        c10.n(dh.c.k(f6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(cc0Var.getColor());
        org.telegram.messenger.em.k(R.string.PollMenuHint, textView, 17);
        jw0Var2.addView(textView, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(jw0Var, lw0Var);
    }

    public final void b(boolean z10, cw0 cw0Var) {
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.dw0
            public final /* synthetic */ ow0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.b;
                        ow0Var.y = floatValue;
                        ow0Var.c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        break;
                    default:
                        ow0 ow0Var2 = this.b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new androidx.fragment.app.g(this, z10, cw0Var, 9));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.f0.setDuration(j3);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.dw0
            public final /* synthetic */ ow0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.b;
                        ow0Var.y = floatValue;
                        ow0Var.c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        break;
                    default:
                        ow0 ow0Var2 = this.b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new iw0(i10, this, z10));
        this.g0.setDuration((long) (j3 * 1.5f));
        this.g0.setInterpolator(wrVar);
        this.g0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z10 && (pk0Var = this.Q) != null && pk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.Y = false;
        bi.p1 p1Var = this.f;
        p1Var.l();
        boolean z11 = p1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.t1 t1Var2 = this.L;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (t1Var = this.L) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.L;
            t1Var3.L7 = null;
            t1Var3.invalidate();
        }
        this.d0 = !z10;
        d();
        b(false, new cw0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        jw0 jw0Var = this.c;
        if (jw0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.L;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
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
                    int height2 = jw0Var.getHeight();
                    i0.c cVar2 = this.r;
                    if (height > ((height2 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = jw0Var.getHeight();
                        i0.c cVar3 = this.r;
                        this.Z = ((((height3 - cVar3.b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int I2 = this.J.I2(this.P);
                this.J.H2(I2);
                float G2 = this.J.G2(I2);
                float f10 = this.X;
                this.a0 = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = jw0Var.getHeight();
                i0.c cVar4 = this.r;
                int dp = ((height4 - cVar4.b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = jw0Var.getHeight();
                    i0.c cVar5 = this.r;
                    this.a0 = ((((height5 - cVar5.b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f11 + r3.getHeight();
                    int height7 = jw0Var.getHeight();
                    i0.c cVar6 = this.r;
                    if (height6 > (((height7 - cVar6.b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = jw0Var.getHeight();
                        i0.c cVar7 = this.r;
                        this.a0 = (((((height8 - cVar7.b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
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
        bi.p1 p1Var = this.f;
        float positionAnimated = p1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -p1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(p1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.X;
                this.Z = f7;
                float height = f7 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                jw0 jw0Var = this.c;
                int height2 = jw0Var.getHeight();
                i0.c cVar = this.r;
                if (height > ((height2 - cVar.b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = jw0Var.getHeight();
                    i0.c cVar2 = this.r;
                    this.Z = ((((height3 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp2);
        this.K.setTranslationY(AndroidUtilities.lerp(this.X, this.Z, this.d0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        jw0 jw0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.K.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = jw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - jw0Var2.getTop());
            this.T.setAlpha(this.y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp);
        this.J.setTranslationY(AndroidUtilities.lerp(this.X, this.a0, this.d0 ? 1.0f : this.y));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((lerp + 0.0f) + (this.J.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = jw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - jw0Var2.getTop());
            this.R.setAlpha(this.y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.d0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - jw0Var2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.cc0 cc0Var = this.n;
        cc0Var.setSelectedTab(positionAnimated);
        cc0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jw0 jw0Var = this.c;
        setContentView(jw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        jw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(jw0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.km0.d(new b5(this, 15));
            this.O = true;
            b(true, null);
        }
    }
}
