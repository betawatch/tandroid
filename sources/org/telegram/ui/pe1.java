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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pe1 extends Dialog {
    public final eh.b E;
    public final zg.a F;
    public MessageObject G;
    public boolean H;
    public ne1 I;
    public nw0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.pk0 P;
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
    public final me1 b;
    public boolean b0;
    public final me1 c;
    public an c0;
    public final me1 d;
    public ValueAnimator d0;
    public final bi.p1 e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.cc0 h;
    public i0.c n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public pe1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.c.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = f6Var;
        me1 me1Var = new me1(this, activity, 0);
        this.b = me1Var;
        int i10 = 6;
        me1Var.setOnClickListener(new m41(this, i10));
        eh.b bVar = new eh.b();
        this.E = bVar;
        zg.a aVar = new zg.a(bVar);
        this.F = aVar;
        aVar.d = new gh.k(me1Var);
        aVar.e = me1Var;
        me1 me1Var2 = new me1(this, activity, 1);
        this.c = me1Var2;
        me1Var2.setClipToPadding(false);
        me1Var.addView(me1Var2, w7.a6.e(-1, -1, 119));
        bi.p1 p1Var = new bi.p1(this, activity, 8);
        this.e = p1Var;
        int i11 = 2;
        p1Var.setAdapter(new kw0(this, activity, i11));
        me1Var2.addView(p1Var, w7.a6.e(-1, -1, 119));
        me1 me1Var3 = new me1(this, activity, i11);
        this.d = me1Var3;
        me1Var2.addView(me1Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(activity, f6Var);
        this.h = cc0Var;
        cc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        cc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        me1Var2.addView(cc0Var, w7.a6.e(-1, 66, 80));
        cc0Var.setOnTabClick(new u3(p1Var, 22));
        bh.d c10 = aVar.c(cc0Var, null, false);
        c10.n(dh.c.k(f6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(cc0Var.getColor());
        org.telegram.messenger.em.k(R.string.TodoMenuHint, textView, 17);
        me1Var2.addView(textView, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(me1Var, lw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.bs0 bs0Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ie1
            public final /* synthetic */ pe1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        pe1 pe1Var = this.b;
                        pe1Var.x = floatValue;
                        pe1Var.b.invalidate();
                        pe1Var.c.invalidate();
                        pe1Var.e();
                        break;
                    default:
                        pe1 pe1Var2 = this.b;
                        pe1Var2.getClass();
                        pe1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new androidx.fragment.app.g(this, z10, bs0Var, 11));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ie1
            public final /* synthetic */ pe1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        pe1 pe1Var = this.b;
                        pe1Var.x = floatValue;
                        pe1Var.b.invalidate();
                        pe1Var.c.invalidate();
                        pe1Var.e();
                        break;
                    default:
                        pe1 pe1Var2 = this.b;
                        pe1Var2.getClass();
                        pe1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new iw0(6, this, z10));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(wrVar);
        this.e0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z10 && (pk0Var = this.P) != null && pk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        bi.p1 p1Var = this.e;
        p1Var.l();
        boolean z11 = p1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.t1 t1Var2 = this.K;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z10 && (t1Var = this.K) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.K;
            t1Var3.K7 = -1;
            t1Var3.invalidate();
        }
        this.b0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.bs0(11, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        me1 me1Var = this.b;
        if (me1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.K;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.n;
            this.U = i10 - cVar.a;
            float f7 = iArr[1] - cVar.b;
            this.V = f7;
            if (!this.Z) {
                this.Z = true;
                this.X = f7;
                if (this.S != null) {
                    float height = f7 + this.K.getHeight() + this.S.getHeight();
                    int height2 = me1Var.getHeight();
                    i0.c cVar2 = this.n;
                    if (height > ((height2 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = me1Var.getHeight();
                        i0.c cVar3 = this.n;
                        this.X = ((((height3 - cVar3.b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int O2 = this.I.O2(this.O);
                this.I.H2(O2);
                float G2 = this.I.G2(O2);
                float f10 = this.V;
                this.Y = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = me1Var.getHeight();
                i0.c cVar4 = this.n;
                int dp = ((height4 - cVar4.b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = me1Var.getHeight();
                    i0.c cVar5 = this.n;
                    this.Y = ((((height5 - cVar5.b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f11 + r3.getHeight();
                    int height7 = me1Var.getHeight();
                    i0.c cVar6 = this.n;
                    if (height6 > (((height7 - cVar6.b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = me1Var.getHeight();
                        i0.c cVar7 = this.n;
                        this.Y = (((((height8 - cVar7.b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
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
        bi.p1 p1Var = this.e;
        float positionAnimated = p1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -p1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(p1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.V;
                this.X = f7;
                float height = f7 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                me1 me1Var = this.b;
                int height2 = me1Var.getHeight();
                i0.c cVar = this.n;
                if (height > ((height2 - cVar.b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = me1Var.getHeight();
                    i0.c cVar2 = this.n;
                    this.X = ((((height3 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp2);
        this.J.setTranslationY(AndroidUtilities.lerp(this.V, this.X, this.b0 ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.S;
        me1 me1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.J.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = me1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - me1Var2.getTop());
            this.S.setAlpha(this.x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        this.I.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp);
        this.I.setTranslationY(AndroidUtilities.lerp(this.V, this.Y, this.b0 ? 1.0f : this.x));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                this.Q.setTranslationX((((lerp + 0.0f) + (this.I.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = me1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - me1Var2.getTop());
            this.Q.setAlpha(this.x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.b0) {
            this.J.setAlpha(this.x);
            this.I.setAlpha(this.x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - me1Var2.getTop()));
            this.P.setAlpha(this.x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.x);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.x);
        org.telegram.ui.Components.cc0 cc0Var = this.h;
        cc0Var.setSelectedTab(positionAnimated);
        cc0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        me1 me1Var = this.b;
        setContentView(me1Var, layoutParams);
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
        me1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(me1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.km0.d(new b5(this, 28));
            this.N = true;
            b(true, null);
        }
    }
}
