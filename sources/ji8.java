// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ji8 extends Dialog {
    public float E;
    public float F;
    public final nz4 G;
    public final ll0 H;
    public r47 I;
    public boolean J;
    public hi8 K;
    public ii8 L;
    public wb2 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public i49 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Activity a;
    public float a0;
    public final vnb b;
    public float b0;
    public final gi8 c;
    public boolean c0;
    public final gi8 d;
    public boolean d0;
    public final gi8 e;
    public boolean e0;
    public final ir1 f;
    public st1 f0;
    public ValueAnimator g0;
    public final TextView h;
    public ValueAnimator h0;
    public final q57 n;
    public mq5 r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public ji8(Activity activity, vnb vnbVar) {
        super(activity, R.style.TransparentDialog);
        this.r = mq5.e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.d0 = false;
        this.a = activity;
        this.b = vnbVar;
        gi8 gi8Var = new gi8(this, activity, (byte) 0);
        this.c = gi8Var;
        gi8Var.setOnClickListener(new am7(this, (byte) 22));
        nz4 nz4Var = new nz4();
        this.G = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.H = ll0Var;
        ll0Var.h = new yic(gi8Var);
        ll0Var.i = gi8Var;
        gi8 gi8Var2 = new gi8(this, activity, (byte) 1);
        this.d = gi8Var2;
        gi8Var2.setClipToPadding(false);
        gi8Var.addView(gi8Var2, tre.e(-1, -1, jn7.D1));
        ir1 ir1Var = new ir1((byte) 6, activity, this);
        this.f = ir1Var;
        ir1Var.setAdapter(new bn0((byte) 4, activity, this));
        gi8Var2.addView(ir1Var, tre.e(-1, -1, jn7.D1));
        gi8 gi8Var3 = new gi8(this, activity, (byte) 2);
        this.e = gi8Var3;
        gi8Var2.addView(gi8Var3, tre.e(-1, -1, jn7.D1));
        q57 q57Var = new q57(activity, vnbVar);
        this.n = q57Var;
        q57Var.a(0, ob6.M0(2131746895, null));
        q57Var.a(1, ob6.M0(2131746894, null));
        gi8Var2.addView(q57Var, tre.e(-1, 66, 80));
        q57Var.setOnTabClick(new ii7(ir1Var, (byte) 16));
        jl0 c = ll0Var.c(q57Var, null, false);
        c.p(dtd.k(vnbVar));
        c.S.e = true;
        c.q(hl.L(8.0f));
        c.r(hl.L(16.0f));
        q57Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(q57Var.getColor());
        textView.setText(ob6.M0(2131746896, null));
        textView.setGravity(17);
        gi8Var2.addView(textView, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        kj4 kj4Var = new kj4((Object) this, (byte) 28);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(gi8Var, kj4Var);
    }

    public final void a(boolean z, bi8 bi8Var) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final byte b = 0;
        final byte b2 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci8
            public final /* synthetic */ ji8 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b;
                ji8 ji8Var = this.b;
                switch (b3) {
                    case 0:
                        ji8Var.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ji8Var.c.invalidate();
                        ji8Var.d.invalidate();
                        hi8 hi8Var = ji8Var.K;
                        if (hi8Var != null) {
                            hi8Var.invalidate();
                        }
                        ji8Var.e();
                        break;
                    default:
                        ji8Var.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new rw((Object) this, z, (Object) bi8Var, (byte) 7));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.g0;
        k43 k43Var = k43.h;
        valueAnimator3.setInterpolator(k43Var);
        this.g0.setDuration(j);
        this.g0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F, z ? 1.0f : 0.0f);
        this.h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci8
            public final /* synthetic */ ji8 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b3 = b2;
                ji8 ji8Var = this.b;
                switch (b3) {
                    case 0:
                        ji8Var.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ji8Var.c.invalidate();
                        ji8Var.d.invalidate();
                        hi8 hi8Var = ji8Var.K;
                        if (hi8Var != null) {
                            hi8Var.invalidate();
                        }
                        ji8Var.e();
                        break;
                    default:
                        ji8Var.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.h0.addListener(new gf4((byte) 23, this, z));
        this.h0.setDuration((long) (j * 1.5f));
        this.h0.setInterpolator(k43Var);
        this.h0.start();
    }

    public final void b(boolean z) {
        wb2 wb2Var;
        i49 i49Var;
        if (z && (i49Var = this.R) != null && i49Var.getReactionsWindow() != null && !this.R.getReactionsWindow().q) {
            this.R.b();
            return;
        }
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.Z = false;
        ir1 ir1Var = this.f;
        ir1Var.j();
        boolean z2 = ir1Var.getCurrentPosition() == 1;
        if (!z) {
            wb2 wb2Var2 = this.M;
            if (wb2Var2 != null) {
                wb2Var2.setVisibility(0);
                wb2 wb2Var3 = this.M;
                wb2Var3.d6 = null;
                wb2Var3.invalidate();
            }
        } else if (z2 && (wb2Var = this.M) != null) {
            wb2Var.setVisibility(4);
            this.M.invalidate();
        }
        this.e0 = !z;
        d();
        a(false, new bi8(this, z2));
        this.c.invalidate();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    public final void d() {
        if (this.Z) {
            return;
        }
        gi8 gi8Var = this.c;
        if (gi8Var.getWidth() > 0) {
            wb2 wb2Var = this.M;
            if (wb2Var != null) {
                int[] iArr = new int[2];
                wb2Var.getLocationOnScreen(iArr);
                int i = iArr[0];
                mq5 mq5Var = this.r;
                this.X = i - mq5Var.a;
                float f = iArr[1] - mq5Var.b;
                this.Y = f;
                if (!this.c0) {
                    this.c0 = true;
                    this.a0 = f;
                    if (this.U != null) {
                        float height = f + this.M.getHeight() + this.U.getHeight();
                        int height2 = gi8Var.getHeight();
                        mq5 mq5Var2 = this.r;
                        if (height > ((height2 - mq5Var2.b) - mq5Var2.d) - hl.L(66.0f)) {
                            int height3 = gi8Var.getHeight();
                            mq5 mq5Var3 = this.r;
                            this.a0 = ((((height3 - mq5Var3.b) - mq5Var3.d) - hl.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                        }
                    }
                    int Y1 = this.K.Y1(this.Q);
                    this.K.X1(Y1);
                    float W1 = this.K.W1(Y1);
                    float f2 = this.Y;
                    this.b0 = f2;
                    float f3 = (int) W1;
                    float f4 = f2 + f3;
                    int height4 = gi8Var.getHeight();
                    mq5 mq5Var4 = this.r;
                    int L = ((height4 - mq5Var4.b) - mq5Var4.d) - hl.L(78.0f);
                    TextView textView = this.h;
                    if (f4 > L - textView.getHeight()) {
                        int height5 = gi8Var.getHeight();
                        mq5 mq5Var5 = this.r;
                        this.b0 = ((((height5 - mq5Var5.b) - mq5Var5.d) - hl.L(78.0f)) - textView.getHeight()) - r1;
                    }
                    if (this.S != null) {
                        float height6 = this.b0 + f3 + r3.getHeight();
                        int height7 = gi8Var.getHeight();
                        mq5 mq5Var6 = this.r;
                        if (height6 > (((height7 - mq5Var6.b) - mq5Var6.d) - hl.L(78.0f)) - textView.getHeight()) {
                            int height8 = gi8Var.getHeight();
                            mq5 mq5Var7 = this.r;
                            this.b0 = (((((height8 - mq5Var7.b) - mq5Var7.d) - hl.L(78.0f)) - textView.getHeight()) - r1) - this.S.getHeight();
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
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        b(true);
    }

    public final void e() {
        ir1 ir1Var = this.f;
        float positionAnimated = ir1Var.getPositionAnimated();
        float U1 = hl.U1(positionAnimated, 0, -ir1Var.getWidth());
        float U12 = hl.U1(positionAnimated, ir1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f = this.Y;
                this.a0 = f;
                float height = f + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                gi8 gi8Var = this.c;
                int height2 = gi8Var.getHeight();
                mq5 mq5Var = this.r;
                if (height > ((height2 - mq5Var.b) - mq5Var.d) - hl.L(66.0f)) {
                    int height3 = gi8Var.getHeight();
                    mq5 mq5Var2 = this.r;
                    this.a0 = ((((height3 - mq5Var2.b) - mq5Var2.d) - hl.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.L.setTranslationX(hl.R1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + U12);
        this.L.setTranslationY(hl.R1(this.Y, this.a0, this.e0 ? 1.0f : this.E));
        ViewGroup viewGroup2 = this.U;
        gi8 gi8Var2 = this.e;
        if (viewGroup2 != null) {
            boolean z = this.J;
            ii8 ii8Var = this.L;
            if (z) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((U12 + 0.0f) + ii8Var.getLeft())) - hl.L(8.0f)) - this.U.getLeft());
            } else {
                viewGroup2.setTranslationX((((U12 + 0.0f) + (ii8Var.b3() ? hl.L(48.0f) : 0)) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = gi8Var2.getMeasuredWidth() - (this.U.getX() - U12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - gi8Var2.getTop());
            this.U.setAlpha(this.E);
            float R1 = hl.R1(0.75f, 1.0f, this.E);
            this.U.setScaleX(R1);
            this.U.setScaleY(R1);
        }
        this.K.setTranslationX(hl.R1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + U1);
        this.K.setTranslationY(hl.R1(this.Y, this.b0, this.e0 ? 1.0f : this.E));
        if (this.S != null) {
            int Y1 = this.K.Y1(this.Q);
            this.K.X1(Y1);
            float W1 = this.K.W1(Y1);
            boolean z2 = this.J;
            ViewGroup viewGroup3 = this.S;
            hi8 hi8Var = this.K;
            if (z2) {
                viewGroup3.setTranslationX(((this.K.getPollButtonsLeft() + ((U1 + 0.0f) + hi8Var.getLeft())) - hl.L(8.0f)) - this.S.getLeft());
            } else {
                viewGroup3.setTranslationX((((U1 + 0.0f) + (hi8Var.b3() ? hl.L(48.0f) : 0)) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = gi8Var2.getMeasuredWidth() - (this.S.getX() - U12);
            this.S.setTranslationY(((this.K.getY() + ((int) W1)) - this.S.getTop()) - gi8Var2.getTop());
            this.S.setAlpha(this.E);
            float R12 = hl.R1(0.75f, 1.0f, this.E);
            this.S.setScaleX(R12);
            this.S.setScaleY(R12);
        }
        if (this.e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = U12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + hl.L(22.0f)) - gi8Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(U1);
        textView.setAlpha(this.E);
        q57 q57Var = this.n;
        q57Var.setSelectedTab(positionAnimated);
        q57Var.setAlpha(this.E);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        gi8 gi8Var = this.c;
        setContentView(gi8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = jn7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        hl.m(attributes);
        window.setAttributes(attributes);
        gi8Var.setSystemUiVisibility(1284);
        hl.j3(gi8Var, !aob.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (hl.K1(getContext())) {
            super.show();
            mu9.d(new yt4((Object) this, (byte) 27));
            this.P = true;
            a(true, null);
        }
    }
}
