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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mw0 extends Dialog {
    public float E;
    public final fh.b F;
    public final ah.c G;
    public MessageObject H;
    public boolean I;
    public kw0 J;
    public lw0 K;
    public org.telegram.ui.Cells.u1 L;
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
    public final hw0 c;
    public boolean c0;
    public final hw0 d;
    public boolean d0;
    public final hw0 e;
    public wm e0;
    public final ci.i1 f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.bc0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public mw0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i10 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = f6Var;
        hw0 hw0Var = new hw0(this, activity, i10);
        this.c = hw0Var;
        hw0Var.setOnClickListener(new k60(this, 22));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f = new hh.k(hw0Var);
        cVar.g = hw0Var;
        hw0 hw0Var2 = new hw0(this, activity, 1);
        this.d = hw0Var2;
        hw0Var2.setClipToPadding(false);
        hw0Var.addView(hw0Var2, w7.y5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 5);
        this.f = i1Var;
        i1Var.setAdapter(new iw0(this, activity, i10));
        hw0Var2.addView(i1Var, w7.y5.e(-1, -1, 119));
        hw0 hw0Var3 = new hw0(this, activity, 2);
        this.e = hw0Var3;
        hw0Var2.addView(hw0Var3, w7.y5.e(-1, -1, 119));
        org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(activity, f6Var);
        this.n = bc0Var;
        bc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        bc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        hw0Var2.addView(bc0Var, w7.y5.e(-1, 66, 80));
        bc0Var.setOnTabClick(new s3(i1Var, 14));
        ch.d c10 = cVar.c(bc0Var, null, false);
        c10.o(eh.b.k(f6Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        bc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(bc0Var.getColor());
        org.telegram.messenger.rk.l(R.string.PollMenuHint, textView, 17);
        hw0Var2.addView(textView, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        jw0 jw0Var = new jw0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(hw0Var, jw0Var);
    }

    public final void b(boolean z10, bw0 bw0Var) {
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.cw0
            public final /* synthetic */ mw0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.b;
                        mw0Var.y = floatValue;
                        mw0Var.c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        break;
                    default:
                        mw0 mw0Var2 = this.b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new androidx.fragment.app.g(this, z10, bw0Var, 9));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f0.setDuration(j3);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.cw0
            public final /* synthetic */ mw0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.b;
                        mw0Var.y = floatValue;
                        mw0Var.c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        break;
                    default:
                        mw0 mw0Var2 = this.b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new h70(4, this, z10));
        this.g0.setDuration((long) (j3 * 1.5f));
        this.g0.setInterpolator(qrVar);
        this.g0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.u1 u1Var;
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
        ci.i1 i1Var = this.f;
        i1Var.l();
        boolean z11 = i1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.u1 u1Var2 = this.L;
            if (u1Var2 != null) {
                u1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (u1Var = this.L) != null) {
            u1Var.setVisibility(0);
            org.telegram.ui.Cells.u1 u1Var3 = this.L;
            u1Var3.L7 = null;
            u1Var3.invalidate();
        }
        this.d0 = !z10;
        d();
        b(false, new bw0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        hw0 hw0Var = this.c;
        if (hw0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = this.L;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.r;
            this.W = i10 - bVar.a;
            float f7 = iArr[1] - bVar.b;
            this.X = f7;
            if (!this.b0) {
                this.b0 = true;
                this.Z = f7;
                if (this.T != null) {
                    float height = f7 + this.L.getHeight() + this.T.getHeight();
                    int height2 = hw0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = hw0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.Z = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int I2 = this.J.I2(this.P);
                this.J.H2(I2);
                float G2 = this.J.G2(I2);
                float f10 = this.X;
                this.a0 = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = hw0Var.getHeight();
                i0.b bVar4 = this.r;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = hw0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.a0 = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f11 + r3.getHeight();
                    int height7 = hw0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = hw0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.a0 = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
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
        ci.i1 i1Var = this.f;
        float positionAnimated = i1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.X;
                this.Z = f7;
                float height = f7 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                hw0 hw0Var = this.c;
                int height2 = hw0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = hw0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.Z = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp2);
        this.K.setTranslationY(AndroidUtilities.lerp(this.X, this.Z, this.d0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        hw0 hw0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.K.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = hw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - hw0Var2.getTop());
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
            this.S = hw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - hw0Var2.getTop());
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
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - hw0Var2.getTop()));
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
        org.telegram.ui.Components.bc0 bc0Var = this.n;
        bc0Var.setSelectedTab(positionAnimated);
        bc0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        hw0 hw0Var = this.c;
        setContentView(hw0Var, layoutParams);
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
        hw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(hw0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.mm0.d(new b5(this, 15));
            this.O = true;
            b(true, null);
        }
    }
}
