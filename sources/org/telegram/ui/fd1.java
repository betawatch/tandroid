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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fd1 extends Dialog {
    public final qg.b A;
    public final lg.a B;
    public MessageObject C;
    public boolean D;
    public dd1 E;
    public hv0 F;
    public org.telegram.ui.Cells.s1 G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public org.telegram.ui.Components.fk0 L;
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
    public pm Y;
    public ValueAnimator Z;
    public final org.telegram.ui.ActionBar.c6 a;
    public ValueAnimator a0;
    public final cd1 b;
    public final cd1 c;
    public final cd1 d;
    public final nh.g1 e;
    public final TextView f;
    public final org.telegram.ui.Components.pb0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public fd1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.H = 0.0f;
        this.I = 0.0f;
        this.N = -1.0f;
        this.P = -1.0f;
        this.W = false;
        this.a = c6Var;
        cd1 cd1Var = new cd1(this, activity, 0);
        this.b = cd1Var;
        int i10 = 7;
        cd1Var.setOnClickListener(new w21(this, i10));
        qg.b bVar = new qg.b();
        this.A = bVar;
        lg.a aVar = new lg.a(bVar);
        this.B = aVar;
        aVar.d = new sg.i(cd1Var);
        aVar.e = cd1Var;
        cd1 cd1Var2 = new cd1(this, activity, 1);
        this.c = cd1Var2;
        cd1Var2.setClipToPadding(false);
        cd1Var.addView(cd1Var2, i7.f6.e(-1, -1, 119));
        nh.g1 g1Var = new nh.g1(this, activity, i10);
        this.e = g1Var;
        g1Var.setAdapter(new eg.v(this, activity, 4));
        cd1Var2.addView(g1Var, i7.f6.e(-1, -1, 119));
        cd1 cd1Var3 = new cd1(this, activity, 2);
        this.d = cd1Var3;
        cd1Var2.addView(cd1Var3, i7.f6.e(-1, -1, 119));
        org.telegram.ui.Components.pb0 pb0Var = new org.telegram.ui.Components.pb0(activity, c6Var);
        this.h = pb0Var;
        pb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        pb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        cd1Var2.addView(pb0Var, i7.f6.e(-1, 66, 80));
        pb0Var.setOnTabClick(new x3(g1Var, 22));
        ng.d c3 = aVar.c(pb0Var, null, false);
        c3.n(pg.a.j(c6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        pb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(pb0Var.getColor());
        b.i(R.string.TodoMenuHint, textView, 17);
        cd1Var2.addView(textView, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(cd1Var, fv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.p90 p90Var) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yc1
            public final /* synthetic */ fd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        fd1 fd1Var = this.b;
                        fd1Var.x = floatValue;
                        fd1Var.b.invalidate();
                        fd1Var.c.invalidate();
                        fd1Var.e();
                        break;
                    default:
                        fd1 fd1Var2 = this.b;
                        fd1Var2.getClass();
                        fd1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.Z.addListener(new androidx.fragment.app.g(this, z10, p90Var, 13));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        valueAnimator3.setInterpolator(jrVar);
        this.Z.setDuration(j10);
        this.Z.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yc1
            public final /* synthetic */ fd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        fd1 fd1Var = this.b;
                        fd1Var.x = floatValue;
                        fd1Var.b.invalidate();
                        fd1Var.c.invalidate();
                        fd1Var.e();
                        break;
                    default:
                        fd1 fd1Var2 = this.b;
                        fd1Var2.getClass();
                        fd1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.a0.addListener(new p60(10, this, z10));
        this.a0.setDuration((long) (j10 * 1.5f));
        this.a0.setInterpolator(jrVar);
        this.a0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fk0 fk0Var;
        if (z10 && (fk0Var = this.L) != null && fk0Var.getReactionsWindow() != null && !this.L.getReactionsWindow().q) {
            this.L.e();
            return;
        }
        if (this.W) {
            return;
        }
        this.W = true;
        this.S = false;
        nh.g1 g1Var = this.e;
        g1Var.l();
        boolean z11 = g1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.G;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.G.invalidate();
            }
        } else if (!z10 && (s1Var = this.G) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.G;
            s1Var3.G7 = -1;
            s1Var3.invalidate();
        }
        this.X = !z10;
        d();
        b(false, new org.telegram.ui.Components.p90(15, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.S) {
            return;
        }
        cd1 cd1Var = this.b;
        if (cd1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.G;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.n;
            this.Q = i10 - bVar.a;
            float f9 = iArr[1] - bVar.b;
            this.R = f9;
            if (!this.V) {
                this.V = true;
                this.T = f9;
                if (this.O != null) {
                    float height = f9 + this.G.getHeight() + this.O.getHeight();
                    int height2 = cd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = cd1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.T = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - this.O.getHeight();
                    }
                }
                int O2 = this.E.O2(this.K);
                this.E.H2(O2);
                float G2 = this.E.G2(O2);
                float f10 = this.R;
                this.U = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = cd1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = cd1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.U = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.M != null) {
                    float height6 = this.U + f11 + r3.getHeight();
                    int height7 = cd1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = cd1Var.getHeight();
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
        nh.g1 g1Var = this.e;
        float positionAnimated = g1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -g1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(g1Var.getWidth(), 0, positionAnimated);
        if (this.S) {
            ViewGroup viewGroup = this.O;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f9 = this.R;
                this.T = f9;
                float height = f9 + this.G.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                cd1 cd1Var = this.b;
                int height2 = cd1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = cd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.T = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.Q, 0.0f, this.X ? 1.0f : this.x) + lerp2);
        this.F.setTranslationY(AndroidUtilities.lerp(this.R, this.T, this.X ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.O;
        cd1 cd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.D) {
                viewGroup2.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.F.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.O.getLeft());
            }
            this.P = cd1Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.F.getY() + this.F.getHeight()) - this.O.getTop()) - cd1Var2.getTop());
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
            this.N = cd1Var2.getMeasuredWidth() - (this.M.getX() - lerp2);
            this.M.setTranslationY(((this.E.getY() + ((int) G2)) - this.M.getTop()) - cd1Var2.getTop());
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
            this.L.setTranslationY(Math.max(0.0f, ((this.F.getY() - this.L.getHeight()) + AndroidUtilities.dp(22.0f)) - cd1Var2.getTop()));
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
        org.telegram.ui.Components.pb0 pb0Var = this.h;
        pb0Var.setSelectedTab(positionAnimated);
        pb0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        cd1 cd1Var = this.b;
        setContentView(cd1Var, layoutParams);
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
        cd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(cd1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.yl0.d(new b5(this, 28));
            this.J = true;
            b(true, null);
        }
    }
}
