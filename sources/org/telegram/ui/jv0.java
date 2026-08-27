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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jv0 extends Dialog {
    public float A;
    public final og.b B;
    public final jg.a C;
    public MessageObject D;
    public boolean E;
    public hv0 F;
    public iv0 G;
    public org.telegram.ui.Cells.s1 H;
    public float I;
    public float J;
    public boolean K;
    public byte[] L;
    public org.telegram.ui.Components.wj0 M;
    public ViewGroup N;
    public float O;
    public ViewGroup P;
    public float Q;
    public boolean R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public om a0;
    public final org.telegram.ui.ActionBar.c6 b;
    public ValueAnimator b0;
    public final fv0 c;
    public ValueAnimator c0;
    public final fv0 d;
    public final fv0 e;
    public final lh.h1 f;
    public final TextView h;
    public final org.telegram.ui.Components.eb0 n;
    public i0.c r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public jv0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.c.e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        int i10 = 0;
        this.Y = false;
        this.a = activity;
        this.b = c6Var;
        fv0 fv0Var = new fv0(this, activity, i10);
        this.c = fv0Var;
        fv0Var.setOnClickListener(new u50(this, 23));
        og.b bVar = new og.b();
        this.B = bVar;
        jg.a aVar = new jg.a(bVar);
        this.C = aVar;
        aVar.d = new qg.j(fv0Var);
        aVar.e = fv0Var;
        fv0 fv0Var2 = new fv0(this, activity, 1);
        this.d = fv0Var2;
        fv0Var2.setClipToPadding(false);
        fv0Var.addView(fv0Var2, h7.z5.e(-1, -1, 119));
        lh.h1 h1Var = new lh.h1(this, activity, 5);
        this.f = h1Var;
        int i11 = 2;
        h1Var.setAdapter(new cg.u(this, activity, i11));
        fv0Var2.addView(h1Var, h7.z5.e(-1, -1, 119));
        fv0 fv0Var3 = new fv0(this, activity, i11);
        this.e = fv0Var3;
        fv0Var2.addView(fv0Var3, h7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(activity, c6Var);
        this.n = eb0Var;
        eb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        eb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        fv0Var2.addView(eb0Var, h7.z5.e(-1, 66, 80));
        eb0Var.setOnTabClick(new x3(h1Var, 14));
        lg.d c10 = aVar.c(eb0Var, null, false);
        c10.n(ng.c.j(c6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        eb0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(eb0Var.getColor());
        org.telegram.messenger.rl.i(R.string.PollMenuHint, textView, 17);
        fv0Var2.addView(textView, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        gv0 gv0Var = new gv0(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(fv0Var, gv0Var);
    }

    public final void b(boolean z10, zu0 zu0Var) {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.av0
            public final /* synthetic */ jv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        jv0 jv0Var = this.b;
                        jv0Var.y = floatValue;
                        jv0Var.c.invalidate();
                        jv0Var.d.invalidate();
                        hv0 hv0Var = jv0Var.F;
                        if (hv0Var != null) {
                            hv0Var.invalidate();
                        }
                        jv0Var.e();
                        break;
                    default:
                        jv0 jv0Var2 = this.b;
                        jv0Var2.getClass();
                        jv0Var2.A = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.b0.addListener(new androidx.fragment.app.g(this, z10, zu0Var, 10));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.b0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.b0.setDuration(j10);
        this.b0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        this.c0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.av0
            public final /* synthetic */ jv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        jv0 jv0Var = this.b;
                        jv0Var.y = floatValue;
                        jv0Var.c.invalidate();
                        jv0Var.d.invalidate();
                        hv0 hv0Var = jv0Var.F;
                        if (hv0Var != null) {
                            hv0Var.invalidate();
                        }
                        jv0Var.e();
                        break;
                    default:
                        jv0 jv0Var2 = this.b;
                        jv0Var2.getClass();
                        jv0Var2.A = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.c0.addListener(new n40(5, this, z10));
        this.c0.setDuration((long) (j10 * 1.5f));
        this.c0.setInterpolator(erVar);
        this.c0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.wj0 wj0Var;
        if (z10 && (wj0Var = this.M) != null && wj0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().q) {
            this.M.e();
            return;
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.U = false;
        lh.h1 h1Var = this.f;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.H;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.H.invalidate();
            }
        } else if (!z10 && (s1Var = this.H) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.H;
            s1Var3.H7 = null;
            s1Var3.invalidate();
        }
        this.Z = !z10;
        d();
        b(false, new zu0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.U) {
            return;
        }
        fv0 fv0Var = this.c;
        if (fv0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.H;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.r;
            this.S = i10 - cVar.a;
            float f10 = iArr[1] - cVar.b;
            this.T = f10;
            if (!this.X) {
                this.X = true;
                this.V = f10;
                if (this.P != null) {
                    float height = f10 + this.H.getHeight() + this.P.getHeight();
                    int height2 = fv0Var.getHeight();
                    i0.c cVar2 = this.r;
                    if (height > ((height2 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = fv0Var.getHeight();
                        i0.c cVar3 = this.r;
                        this.V = ((((height3 - cVar3.b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                    }
                }
                int H2 = this.F.H2(this.L);
                this.F.G2(H2);
                float F2 = this.F.F2(H2);
                float f11 = this.T;
                this.W = f11;
                float f12 = (int) F2;
                float f13 = f11 + f12;
                int height4 = fv0Var.getHeight();
                i0.c cVar4 = this.r;
                int dp = ((height4 - cVar4.b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = fv0Var.getHeight();
                    i0.c cVar5 = this.r;
                    this.W = ((((height5 - cVar5.b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.N != null) {
                    float height6 = this.W + f12 + r3.getHeight();
                    int height7 = fv0Var.getHeight();
                    i0.c cVar6 = this.r;
                    if (height6 > (((height7 - cVar6.b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = fv0Var.getHeight();
                        i0.c cVar7 = this.r;
                        this.W = (((((height8 - cVar7.b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.N.getHeight();
                    }
                }
            }
            e();
        } else {
            this.T = 0.0f;
            this.S = 0.0f;
        }
        this.U = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        lh.h1 h1Var = this.f;
        float positionAnimated = h1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.U) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.T;
                this.V = f10;
                float height = f10 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                fv0 fv0Var = this.c;
                int height2 = fv0Var.getHeight();
                i0.c cVar = this.r;
                if (height > ((height2 - cVar.b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = fv0Var.getHeight();
                    i0.c cVar2 = this.r;
                    this.V = ((((height3 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.y) + lerp2);
        this.G.setTranslationY(AndroidUtilities.lerp(this.T, this.V, this.Z ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.P;
        fv0 fv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.G.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = fv0Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - fv0Var2.getTop());
            this.P.setAlpha(this.y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.y) + lerp);
        this.F.setTranslationY(AndroidUtilities.lerp(this.T, this.W, this.Z ? 1.0f : this.y));
        if (this.N != null) {
            int H2 = this.F.H2(this.L);
            this.F.G2(H2);
            float F2 = this.F.F2(H2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                this.N.setTranslationX((((lerp + 0.0f) + (this.F.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = fv0Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) F2)) - this.N.getTop()) - fv0Var2.getTop());
            this.N.setAlpha(this.y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Z) {
            this.G.setAlpha(this.y);
            this.F.setAlpha(this.y);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - fv0Var2.getTop()));
            this.M.setAlpha(this.y);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.eb0 eb0Var = this.n;
        eb0Var.setSelectedTab(positionAnimated);
        eb0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fv0 fv0Var = this.c;
        setContentView(fv0Var, layoutParams);
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
        fv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(fv0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.ol0.d(new b5(this, 15));
            this.K = true;
            b(true, null);
        }
    }
}
