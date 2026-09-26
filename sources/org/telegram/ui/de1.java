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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class de1 extends Dialog {
    public final fh.b E;
    public final ah.c F;
    public MessageObject G;
    public boolean H;
    public be1 I;
    public cw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.qk0 P;
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
    public final org.telegram.ui.ActionBar.d6 a;
    public boolean a0;
    public final ae1 b;
    public boolean b0;
    public final ae1 c;
    public tm c0;
    public final ae1 d;
    public ValueAnimator d0;
    public final ci.i1 e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.dc0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public de1(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = d6Var;
        ae1 ae1Var = new ae1(this, activity, 0);
        this.b = ae1Var;
        int i10 = 6;
        ae1Var.setOnClickListener(new y31(this, i10));
        fh.b bVar = new fh.b();
        this.E = bVar;
        ah.c cVar = new ah.c(bVar);
        this.F = cVar;
        cVar.f = new hh.k(ae1Var);
        cVar.g = ae1Var;
        ae1 ae1Var2 = new ae1(this, activity, 1);
        this.c = ae1Var2;
        ae1Var2.setClipToPadding(false);
        ae1Var.addView(ae1Var2, w7.y5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 8);
        this.e = i1Var;
        int i11 = 2;
        i1Var.setAdapter(new zv0(this, activity, i11));
        ae1Var2.addView(i1Var, w7.y5.e(-1, -1, 119));
        ae1 ae1Var3 = new ae1(this, activity, i11);
        this.d = ae1Var3;
        ae1Var2.addView(ae1Var3, w7.y5.e(-1, -1, 119));
        org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0(activity, d6Var);
        this.h = dc0Var;
        dc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        dc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ae1Var2.addView(dc0Var, w7.y5.e(-1, 66, 80));
        dc0Var.setOnTabClick(new t3(i1Var, 25));
        ch.d c10 = cVar.c(dc0Var, null, false);
        c10.o(eh.b.k(d6Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        dc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(dc0Var.getColor());
        org.telegram.messenger.ok.l(R.string.TodoMenuHint, textView, 17);
        ae1Var2.addView(textView, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        aw0 aw0Var = new aw0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ae1Var, aw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.yr0 yr0Var) {
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wd1
            public final /* synthetic */ de1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        de1 de1Var = this.b;
                        de1Var.x = floatValue;
                        de1Var.b.invalidate();
                        de1Var.c.invalidate();
                        de1Var.e();
                        break;
                    default:
                        de1 de1Var2 = this.b;
                        de1Var2.getClass();
                        de1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new androidx.fragment.app.g(this, z10, yr0Var, 11));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        valueAnimator3.setInterpolator(rrVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wd1
            public final /* synthetic */ de1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        de1 de1Var = this.b;
                        de1Var.x = floatValue;
                        de1Var.b.invalidate();
                        de1Var.c.invalidate();
                        de1Var.e();
                        break;
                    default:
                        de1 de1Var2 = this.b;
                        de1Var2.getClass();
                        de1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new c70(10, this, z10));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(rrVar);
        this.e0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.qk0 qk0Var;
        if (z10 && (qk0Var = this.P) != null && qk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        ci.i1 i1Var = this.e;
        i1Var.l();
        boolean z11 = i1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.u1 u1Var2 = this.K;
            if (u1Var2 != null) {
                u1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z10 && (u1Var = this.K) != null) {
            u1Var.setVisibility(0);
            org.telegram.ui.Cells.u1 u1Var3 = this.K;
            u1Var3.K7 = -1;
            u1Var3.invalidate();
        }
        this.b0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.yr0(12, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        ae1 ae1Var = this.b;
        if (ae1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = this.K;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.n;
            this.U = i10 - bVar.a;
            float f7 = iArr[1] - bVar.b;
            this.V = f7;
            if (!this.Z) {
                this.Z = true;
                this.X = f7;
                if (this.S != null) {
                    float height = f7 + this.K.getHeight() + this.S.getHeight();
                    int height2 = ae1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = ae1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.X = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int O2 = this.I.O2(this.O);
                this.I.H2(O2);
                float G2 = this.I.G2(O2);
                float f10 = this.V;
                this.Y = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = ae1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = ae1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Y = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f11 + r3.getHeight();
                    int height7 = ae1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = ae1Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Y = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
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
        ci.i1 i1Var = this.e;
        float positionAnimated = i1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.V;
                this.X = f7;
                float height = f7 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ae1 ae1Var = this.b;
                int height2 = ae1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ae1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.X = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp2);
        this.J.setTranslationY(AndroidUtilities.lerp(this.V, this.X, this.b0 ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.S;
        ae1 ae1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.J.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = ae1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - ae1Var2.getTop());
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
            this.R = ae1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - ae1Var2.getTop());
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
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - ae1Var2.getTop()));
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
        org.telegram.ui.Components.dc0 dc0Var = this.h;
        dc0Var.setSelectedTab(positionAnimated);
        dc0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ae1 ae1Var = this.b;
        setContentView(ae1Var, layoutParams);
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
        ae1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ae1Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.mm0.d(new b5(this, 28));
            this.N = true;
            b(true, null);
        }
    }
}
