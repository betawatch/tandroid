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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fw0 extends Dialog {
    public float E;
    public final fh.b F;
    public final ah.c G;
    public MessageObject H;
    public boolean I;
    public dw0 J;
    public ew0 K;
    public org.telegram.ui.Cells.t1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.gk0 Q;
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
    public final org.telegram.ui.ActionBar.d6 b;
    public boolean b0;
    public final aw0 c;
    public boolean c0;
    public final aw0 d;
    public boolean d0;
    public final aw0 e;
    public um e0;
    public final ci.i1 f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.sb0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public fw0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i10 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = d6Var;
        aw0 aw0Var = new aw0(this, activity, i10);
        this.c = aw0Var;
        aw0Var.setOnClickListener(new h60(this, 22));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f = new hh.k(aw0Var);
        cVar.g = aw0Var;
        aw0 aw0Var2 = new aw0(this, activity, 1);
        this.d = aw0Var2;
        aw0Var2.setClipToPadding(false);
        aw0Var.addView(aw0Var2, w7.x5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 5);
        this.f = i1Var;
        i1Var.setAdapter(new bw0(this, activity, i10));
        aw0Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        aw0 aw0Var3 = new aw0(this, activity, 2);
        this.e = aw0Var3;
        aw0Var2.addView(aw0Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(activity, d6Var);
        this.n = sb0Var;
        sb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        sb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        aw0Var2.addView(sb0Var, w7.x5.e(-1, 66, 80));
        sb0Var.setOnTabClick(new t3(i1Var, 17));
        ch.d c10 = cVar.c(sb0Var, null, false);
        c10.o(eh.b.k(d6Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        sb0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(sb0Var.getColor());
        org.telegram.messenger.ul.l(R.string.PollMenuHint, textView, 17);
        aw0Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        cw0 cw0Var = new cw0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(aw0Var, cw0Var);
    }

    public final void b(boolean z10, uv0 uv0Var) {
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.vv0
            public final /* synthetic */ fw0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        fw0 fw0Var = this.b;
                        fw0Var.y = floatValue;
                        fw0Var.c.invalidate();
                        fw0Var.d.invalidate();
                        dw0 dw0Var = fw0Var.J;
                        if (dw0Var != null) {
                            dw0Var.invalidate();
                        }
                        fw0Var.e();
                        break;
                    default:
                        fw0 fw0Var2 = this.b;
                        fw0Var2.getClass();
                        fw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new androidx.fragment.app.g(this, z10, uv0Var, 9));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        valueAnimator3.setInterpolator(rrVar);
        this.f0.setDuration(j3);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.vv0
            public final /* synthetic */ fw0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        fw0 fw0Var = this.b;
                        fw0Var.y = floatValue;
                        fw0Var.c.invalidate();
                        fw0Var.d.invalidate();
                        dw0 dw0Var = fw0Var.J;
                        if (dw0Var != null) {
                            dw0Var.invalidate();
                        }
                        fw0Var.e();
                        break;
                    default:
                        fw0 fw0Var2 = this.b;
                        fw0Var2.getClass();
                        fw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new e70(4, this, z10));
        this.g0.setDuration((long) (j3 * 1.5f));
        this.g0.setInterpolator(rrVar);
        this.g0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gk0 gk0Var;
        if (z10 && (gk0Var = this.Q) != null && gk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
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
        b(false, new uv0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        aw0 aw0Var = this.c;
        if (aw0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.L;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
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
                    int height2 = aw0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = aw0Var.getHeight();
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
                int height4 = aw0Var.getHeight();
                i0.b bVar4 = this.r;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = aw0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.a0 = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f11 + r3.getHeight();
                    int height7 = aw0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = aw0Var.getHeight();
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
                aw0 aw0Var = this.c;
                int height2 = aw0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = aw0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.Z = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp2);
        this.K.setTranslationY(AndroidUtilities.lerp(this.X, this.Z, this.d0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        aw0 aw0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.K.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = aw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - aw0Var2.getTop());
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
            this.S = aw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - aw0Var2.getTop());
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
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - aw0Var2.getTop()));
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
        org.telegram.ui.Components.sb0 sb0Var = this.n;
        sb0Var.setSelectedTab(positionAnimated);
        sb0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        aw0 aw0Var = this.c;
        setContentView(aw0Var, layoutParams);
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
        aw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(aw0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.bm0.d(new c5(this, 15));
            this.O = true;
            b(true, null);
        }
    }
}
