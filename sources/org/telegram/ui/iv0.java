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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iv0 extends Dialog {
    public float A;
    public final ng.b B;
    public final ig.a C;
    public MessageObject D;
    public boolean E;
    public gv0 F;
    public hv0 G;
    public org.telegram.ui.Cells.t1 H;
    public float I;
    public float J;
    public boolean K;
    public byte[] L;
    public org.telegram.ui.Components.uj0 M;
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
    public nm a0;
    public final org.telegram.ui.ActionBar.b6 b;
    public ValueAnimator b0;
    public final ev0 c;
    public ValueAnimator c0;
    public final ev0 d;
    public final ev0 e;
    public final kh.j1 f;
    public final TextView h;
    public final org.telegram.ui.Components.ab0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public iv0(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        int i9 = 0;
        this.Y = false;
        this.a = activity;
        this.b = b6Var;
        ev0 ev0Var = new ev0(this, activity, i9);
        this.c = ev0Var;
        ev0Var.setOnClickListener(new q50(this, 23));
        ng.b bVar = new ng.b();
        this.B = bVar;
        ig.a aVar = new ig.a(bVar);
        this.C = aVar;
        aVar.d = new pg.i(ev0Var);
        aVar.e = ev0Var;
        ev0 ev0Var2 = new ev0(this, activity, 1);
        this.d = ev0Var2;
        ev0Var2.setClipToPadding(false);
        ev0Var.addView(ev0Var2, g7.e6.e(-1, -1, 119));
        kh.j1 j1Var = new kh.j1(this, activity, 5);
        this.f = j1Var;
        int i10 = 2;
        j1Var.setAdapter(new bg.x(this, activity, i10));
        ev0Var2.addView(j1Var, g7.e6.e(-1, -1, 119));
        ev0 ev0Var3 = new ev0(this, activity, i10);
        this.e = ev0Var3;
        ev0Var2.addView(ev0Var3, g7.e6.e(-1, -1, 119));
        org.telegram.ui.Components.ab0 ab0Var = new org.telegram.ui.Components.ab0(activity, b6Var);
        this.n = ab0Var;
        ab0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        ab0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        ev0Var2.addView(ab0Var, g7.e6.e(-1, 66, 80));
        ab0Var.setOnTabClick(new w3(j1Var, 14));
        kg.d c10 = aVar.c(ab0Var, null, false);
        c10.n(mg.c.j(b6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ab0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ab0Var.getColor());
        org.telegram.messenger.ll.l(R.string.PollMenuHint, textView, 17);
        ev0Var2.addView(textView, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, i9);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(ev0Var, fv0Var);
    }

    public final void b(boolean z10, yu0 yu0Var) {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i9 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zu0
            public final /* synthetic */ iv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i9) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        iv0 iv0Var = this.b;
                        iv0Var.y = floatValue;
                        iv0Var.c.invalidate();
                        iv0Var.d.invalidate();
                        gv0 gv0Var = iv0Var.F;
                        if (gv0Var != null) {
                            gv0Var.invalidate();
                        }
                        iv0Var.e();
                        break;
                    default:
                        iv0 iv0Var2 = this.b;
                        iv0Var2.getClass();
                        iv0Var2.A = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.b0.addListener(new androidx.fragment.app.g(this, z10, yu0Var, 10));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.b0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.b0.setDuration(j10);
        this.b0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        this.c0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zu0
            public final /* synthetic */ iv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        iv0 iv0Var = this.b;
                        iv0Var.y = floatValue;
                        iv0Var.c.invalidate();
                        iv0Var.d.invalidate();
                        gv0 gv0Var = iv0Var.F;
                        if (gv0Var != null) {
                            gv0Var.invalidate();
                        }
                        iv0Var.e();
                        break;
                    default:
                        iv0 iv0Var2 = this.b;
                        iv0Var2.getClass();
                        iv0Var2.A = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.c0.addListener(new n60(4, this, z10));
        this.c0.setDuration((long) (j10 * 1.5f));
        this.c0.setInterpolator(grVar);
        this.c0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.uj0 uj0Var;
        if (z10 && (uj0Var = this.M) != null && uj0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().q) {
            this.M.e();
            return;
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.U = false;
        kh.j1 j1Var = this.f;
        j1Var.l();
        boolean z11 = j1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.t1 t1Var2 = this.H;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.H.invalidate();
            }
        } else if (!z10 && (t1Var = this.H) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.H;
            t1Var3.H7 = null;
            t1Var3.invalidate();
        }
        this.Z = !z10;
        d();
        b(false, new yu0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.U) {
            return;
        }
        ev0 ev0Var = this.c;
        if (ev0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.H;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            i0.b bVar = this.r;
            this.S = i9 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.T = f10;
            if (!this.X) {
                this.X = true;
                this.V = f10;
                if (this.P != null) {
                    float height = f10 + this.H.getHeight() + this.P.getHeight();
                    int height2 = ev0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = ev0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.V = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                    }
                }
                int I2 = this.F.I2(this.L);
                this.F.H2(I2);
                float G2 = this.F.G2(I2);
                float f11 = this.T;
                this.W = f11;
                float f12 = (int) G2;
                float f13 = f11 + f12;
                int height4 = ev0Var.getHeight();
                i0.b bVar4 = this.r;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = ev0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.W = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.N != null) {
                    float height6 = this.W + f12 + r3.getHeight();
                    int height7 = ev0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = ev0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.W = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.N.getHeight();
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
        kh.j1 j1Var = this.f;
        float positionAnimated = j1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -j1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(j1Var.getWidth(), 0, positionAnimated);
        if (this.U) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.T;
                this.V = f10;
                float height = f10 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ev0 ev0Var = this.c;
                int height2 = ev0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ev0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.V = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.y) + lerp2);
        this.G.setTranslationY(AndroidUtilities.lerp(this.T, this.V, this.Z ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.P;
        ev0 ev0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.G.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = ev0Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - ev0Var2.getTop());
            this.P.setAlpha(this.y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.y) + lerp);
        this.F.setTranslationY(AndroidUtilities.lerp(this.T, this.W, this.Z ? 1.0f : this.y));
        if (this.N != null) {
            int I2 = this.F.I2(this.L);
            this.F.H2(I2);
            float G2 = this.F.G2(I2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                this.N.setTranslationX((((lerp + 0.0f) + (this.F.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = ev0Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - ev0Var2.getTop());
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
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - ev0Var2.getTop()));
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
        org.telegram.ui.Components.ab0 ab0Var = this.n;
        ab0Var.setSelectedTab(positionAnimated);
        ab0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ev0 ev0Var = this.c;
        setContentView(ev0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i9 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ev0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ev0Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.ll0.d(new a5(this, 15));
            this.K = true;
            b(true, null);
        }
    }
}
