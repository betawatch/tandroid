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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dd1 extends Dialog {
    public final ng.b A;
    public final ig.a B;
    public MessageObject C;
    public boolean D;
    public bd1 E;
    public hv0 F;
    public org.telegram.ui.Cells.t1 G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public org.telegram.ui.Components.uj0 L;
    public ViewGroup M;
    public float N;
    public ViewGroup O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public nm Y;
    public ValueAnimator Z;
    public final org.telegram.ui.ActionBar.b6 a;
    public ValueAnimator a0;
    public final ad1 b;
    public final ad1 c;
    public final ad1 d;
    public final kh.j1 e;
    public final TextView f;
    public final org.telegram.ui.Components.ab0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public dd1(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.H = 0.0f;
        this.I = 0.0f;
        this.N = -1.0f;
        this.P = -1.0f;
        this.W = false;
        this.a = b6Var;
        ad1 ad1Var = new ad1(this, activity, 0);
        this.b = ad1Var;
        ad1Var.setOnClickListener(new w21(this, 7));
        ng.b bVar = new ng.b();
        this.A = bVar;
        ig.a aVar = new ig.a(bVar);
        this.B = aVar;
        aVar.d = new pg.i(ad1Var);
        aVar.e = ad1Var;
        ad1 ad1Var2 = new ad1(this, activity, 1);
        this.c = ad1Var2;
        ad1Var2.setClipToPadding(false);
        ad1Var.addView(ad1Var2, g7.e6.e(-1, -1, 119));
        kh.j1 j1Var = new kh.j1(this, activity, 8);
        this.e = j1Var;
        j1Var.setAdapter(new bg.x(this, activity, 4));
        ad1Var2.addView(j1Var, g7.e6.e(-1, -1, 119));
        ad1 ad1Var3 = new ad1(this, activity, 2);
        this.d = ad1Var3;
        ad1Var2.addView(ad1Var3, g7.e6.e(-1, -1, 119));
        org.telegram.ui.Components.ab0 ab0Var = new org.telegram.ui.Components.ab0(activity, b6Var);
        this.h = ab0Var;
        ab0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        ab0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ad1Var2.addView(ab0Var, g7.e6.e(-1, 66, 80));
        ab0Var.setOnTabClick(new w3(j1Var, 22));
        kg.d c10 = aVar.c(ab0Var, null, false);
        c10.n(mg.c.j(b6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ab0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ab0Var.getColor());
        org.telegram.messenger.ll.l(R.string.TodoMenuHint, textView, 17);
        ad1Var2.addView(textView, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(ad1Var, fv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.a50 a50Var) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i9 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wc1
            public final /* synthetic */ dd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i9) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.b;
                        dd1Var.x = floatValue;
                        dd1Var.b.invalidate();
                        dd1Var.c.invalidate();
                        dd1Var.e();
                        break;
                    default:
                        dd1 dd1Var2 = this.b;
                        dd1Var2.getClass();
                        dd1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.Z.addListener(new androidx.fragment.app.g(this, z10, a50Var, 12));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.Z.setDuration(j10);
        this.Z.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wc1
            public final /* synthetic */ dd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.b;
                        dd1Var.x = floatValue;
                        dd1Var.b.invalidate();
                        dd1Var.c.invalidate();
                        dd1Var.e();
                        break;
                    default:
                        dd1 dd1Var2 = this.b;
                        dd1Var2.getClass();
                        dd1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.a0.addListener(new n60(10, this, z10));
        this.a0.setDuration((long) (j10 * 1.5f));
        this.a0.setInterpolator(grVar);
        this.a0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.uj0 uj0Var;
        if (z10 && (uj0Var = this.L) != null && uj0Var.getReactionsWindow() != null && !this.L.getReactionsWindow().q) {
            this.L.e();
            return;
        }
        if (this.W) {
            return;
        }
        this.W = true;
        this.S = false;
        kh.j1 j1Var = this.e;
        j1Var.l();
        boolean z11 = j1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.t1 t1Var2 = this.G;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.G.invalidate();
            }
        } else if (!z10 && (t1Var = this.G) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.G;
            t1Var3.G7 = -1;
            t1Var3.invalidate();
        }
        this.X = !z10;
        d();
        b(false, new org.telegram.ui.Components.a50(16, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.S) {
            return;
        }
        ad1 ad1Var = this.b;
        if (ad1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.G;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            i0.b bVar = this.n;
            this.Q = i9 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.R = f10;
            if (!this.V) {
                this.V = true;
                this.T = f10;
                if (this.O != null) {
                    float height = f10 + this.G.getHeight() + this.O.getHeight();
                    int height2 = ad1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = ad1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.T = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - this.O.getHeight();
                    }
                }
                int O2 = this.E.O2(this.K);
                this.E.H2(O2);
                float G2 = this.E.G2(O2);
                float f11 = this.R;
                this.U = f11;
                float f12 = (int) G2;
                float f13 = f11 + f12;
                int height4 = ad1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = ad1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.U = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.M != null) {
                    float height6 = this.U + f12 + r3.getHeight();
                    int height7 = ad1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = ad1Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.U = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.M.getHeight();
                    }
                }
            }
            e();
        } else {
            this.R = 0.0f;
            this.Q = 0.0f;
        }
        this.S = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        kh.j1 j1Var = this.e;
        float positionAnimated = j1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -j1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(j1Var.getWidth(), 0, positionAnimated);
        if (this.S) {
            ViewGroup viewGroup = this.O;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.R;
                this.T = f10;
                float height = f10 + this.G.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ad1 ad1Var = this.b;
                int height2 = ad1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ad1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.T = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.Q, 0.0f, this.X ? 1.0f : this.x) + lerp2);
        this.F.setTranslationY(AndroidUtilities.lerp(this.R, this.T, this.X ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.O;
        ad1 ad1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.D) {
                viewGroup2.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.F.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.O.getLeft());
            }
            this.P = ad1Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.F.getY() + this.F.getHeight()) - this.O.getTop()) - ad1Var2.getTop());
            this.O.setAlpha(this.x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.O.setScaleX(lerp3);
            this.O.setScaleY(lerp3);
        }
        this.E.setTranslationX(AndroidUtilities.lerp(this.Q, 0.0f, this.X ? 1.0f : this.x) + lerp);
        this.E.setTranslationY(AndroidUtilities.lerp(this.R, this.U, this.X ? 1.0f : this.x));
        if (this.M != null) {
            int O2 = this.E.O2(this.K);
            this.E.H2(O2);
            float G2 = this.E.G2(O2);
            if (this.D) {
                this.M.setTranslationX(((this.E.getPollButtonsLeft() + ((lerp + 0.0f) + this.E.getLeft())) - AndroidUtilities.dp(8.0f)) - this.M.getLeft());
            } else {
                this.M.setTranslationX((((lerp + 0.0f) + (this.E.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.E.getLeft()) - this.M.getLeft());
            }
            this.N = ad1Var2.getMeasuredWidth() - (this.M.getX() - lerp2);
            this.M.setTranslationY(((this.E.getY() + ((int) G2)) - this.M.getTop()) - ad1Var2.getTop());
            this.M.setAlpha(this.x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.M.setScaleX(lerp4);
            this.M.setScaleY(lerp4);
        }
        if (this.X) {
            this.F.setAlpha(this.x);
            this.E.setAlpha(this.x);
        }
        if (this.L != null) {
            float max = lerp2 + Math.max(0.0f, ((this.F.getBoundsLeft() + this.F.getBoundsRight()) / 2.0f) - (this.L.getWidth() * 0.8f));
            this.L.setTranslationX(max);
            this.L.setTranslationY(Math.max(0.0f, ((this.F.getY() - this.L.getHeight()) + AndroidUtilities.dp(22.0f)) - ad1Var2.getTop()));
            this.L.setAlpha(this.x);
            View windowView = this.L.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.x);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.x);
        org.telegram.ui.Components.ab0 ab0Var = this.h;
        ab0Var.setSelectedTab(positionAnimated);
        ab0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ad1 ad1Var = this.b;
        setContentView(ad1Var, layoutParams);
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
        ad1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ad1Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.ll0.d(new a5(this, 28));
            this.J = true;
            b(true, null);
        }
    }
}
