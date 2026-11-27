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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ktb extends Dialog {
    public float E;
    public final nz4 F;
    public final ll0 G;
    public r47 H;
    public boolean I;
    public itb J;
    public ii8 K;
    public wb2 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public i49 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final vnb a;
    public boolean a0;
    public final htb b;
    public boolean b0;
    public final htb c;
    public boolean c0;
    public final htb d;
    public st1 d0;
    public final ir1 e;
    public ValueAnimator e0;
    public final TextView f;
    public ValueAnimator f0;
    public final q57 h;
    public mq5 n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public ktb(Activity activity, vnb vnbVar) {
        super(activity, R.style.TransparentDialog);
        this.n = mq5.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.b0 = false;
        this.a = vnbVar;
        htb htbVar = new htb(this, activity, (byte) 0);
        this.b = htbVar;
        htbVar.setOnClickListener(new kla(this, (byte) 20));
        nz4 nz4Var = new nz4();
        this.F = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.G = ll0Var;
        ll0Var.h = new yic(htbVar);
        ll0Var.i = htbVar;
        htb htbVar2 = new htb(this, activity, (byte) 1);
        this.c = htbVar2;
        htbVar2.setClipToPadding(false);
        htbVar.addView(htbVar2, tre.e(-1, -1, jn7.D1));
        ir1 ir1Var = new ir1((byte) 9, activity, this);
        this.e = ir1Var;
        ir1Var.setAdapter(new bn0((byte) 8, activity, this));
        htbVar2.addView(ir1Var, tre.e(-1, -1, jn7.D1));
        htb htbVar3 = new htb(this, activity, (byte) 2);
        this.d = htbVar3;
        htbVar2.addView(htbVar3, tre.e(-1, -1, jn7.D1));
        q57 q57Var = new q57(activity, vnbVar);
        this.h = q57Var;
        q57Var.a(0, ob6.M0(2131743722, null));
        q57Var.a(1, ob6.M0(2131743723, null));
        htbVar2.addView(q57Var, tre.e(-1, 66, 80));
        q57Var.setOnTabClick(new sh9(ir1Var, (byte) 21));
        jl0 c = ll0Var.c(q57Var, null, false);
        c.p(dtd.k(vnbVar));
        c.S.e = true;
        c.q(hl.L(8.0f));
        c.r(hl.L(16.0f));
        q57Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(q57Var.getColor());
        textView.setText(ob6.M0(2131743724, null));
        textView.setGravity(17);
        htbVar2.addView(textView, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ve9 ve9Var = new ve9((Object) this, (byte) 17);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(htbVar, ve9Var);
    }

    public final void a(boolean z, q38 q38Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final byte b = 0;
        final byte b2 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: etb
            public final /* synthetic */ ktb b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b;
                ktb ktbVar = this.b;
                switch (b3) {
                    case 0:
                        ktbVar.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ktbVar.b.invalidate();
                        ktbVar.c.invalidate();
                        ktbVar.e();
                        break;
                    default:
                        ktbVar.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new rw((Object) this, z, (Object) q38Var, (byte) 15));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.e0;
        k43 k43Var = k43.h;
        valueAnimator3.setInterpolator(k43Var);
        this.e0.setDuration(j);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: etb
            public final /* synthetic */ ktb b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b3 = b2;
                ktb ktbVar = this.b;
                switch (b3) {
                    case 0:
                        ktbVar.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ktbVar.b.invalidate();
                        ktbVar.c.invalidate();
                        ktbVar.e();
                        break;
                    default:
                        ktbVar.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new i1a((byte) 8, this, z));
        this.f0.setDuration((long) (j * 1.5f));
        this.f0.setInterpolator(k43Var);
        this.f0.start();
    }

    public final void b(boolean z) {
        wb2 wb2Var;
        i49 i49Var;
        if (z && (i49Var = this.Q) != null && i49Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.b();
            return;
        }
        if (this.b0) {
            return;
        }
        this.b0 = true;
        this.X = false;
        ir1 ir1Var = this.e;
        ir1Var.j();
        boolean z2 = ir1Var.getCurrentPosition() == 1;
        if (!z) {
            wb2 wb2Var2 = this.L;
            if (wb2Var2 != null) {
                wb2Var2.setVisibility(0);
                wb2 wb2Var3 = this.L;
                wb2Var3.c6 = -1;
                wb2Var3.invalidate();
            }
        } else if (z2 && (wb2Var = this.L) != null) {
            wb2Var.setVisibility(4);
            this.L.invalidate();
        }
        this.c0 = !z;
        d();
        a(false, new q38((byte) 22, (Object) this, z2));
        this.b.invalidate();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    public final void d() {
        if (this.X) {
            return;
        }
        htb htbVar = this.b;
        if (htbVar.getWidth() > 0) {
            wb2 wb2Var = this.L;
            if (wb2Var != null) {
                int[] iArr = new int[2];
                wb2Var.getLocationOnScreen(iArr);
                int i = iArr[0];
                mq5 mq5Var = this.n;
                this.V = i - mq5Var.a;
                float f = iArr[1] - mq5Var.b;
                this.W = f;
                if (!this.a0) {
                    this.a0 = true;
                    this.Y = f;
                    if (this.T != null) {
                        float height = f + this.L.getHeight() + this.T.getHeight();
                        int height2 = htbVar.getHeight();
                        mq5 mq5Var2 = this.n;
                        if (height > ((height2 - mq5Var2.b) - mq5Var2.d) - hl.L(66.0f)) {
                            int height3 = htbVar.getHeight();
                            mq5 mq5Var3 = this.n;
                            this.Y = ((((height3 - mq5Var3.b) - mq5Var3.d) - hl.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                        }
                    }
                    int e2 = this.J.e2(this.P);
                    this.J.X1(e2);
                    float W1 = this.J.W1(e2);
                    float f2 = this.W;
                    this.Z = f2;
                    float f3 = (int) W1;
                    float f4 = f2 + f3;
                    int height4 = htbVar.getHeight();
                    mq5 mq5Var4 = this.n;
                    int L = ((height4 - mq5Var4.b) - mq5Var4.d) - hl.L(78.0f);
                    TextView textView = this.f;
                    if (f4 > L - textView.getHeight()) {
                        int height5 = htbVar.getHeight();
                        mq5 mq5Var5 = this.n;
                        this.Z = ((((height5 - mq5Var5.b) - mq5Var5.d) - hl.L(78.0f)) - textView.getHeight()) - r1;
                    }
                    if (this.R != null) {
                        float height6 = this.Z + f3 + r3.getHeight();
                        int height7 = htbVar.getHeight();
                        mq5 mq5Var6 = this.n;
                        if (height6 > (((height7 - mq5Var6.b) - mq5Var6.d) - hl.L(78.0f)) - textView.getHeight()) {
                            int height8 = htbVar.getHeight();
                            mq5 mq5Var7 = this.n;
                            this.Z = (((((height8 - mq5Var7.b) - mq5Var7.d) - hl.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
                        }
                    }
                }
                e();
            } else {
                this.W = 0.0f;
                this.V = 0.0f;
            }
            this.X = true;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        b(true);
    }

    public final void e() {
        ir1 ir1Var = this.e;
        float positionAnimated = ir1Var.getPositionAnimated();
        float U1 = hl.U1(positionAnimated, 0, -ir1Var.getWidth());
        float U12 = hl.U1(positionAnimated, ir1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f = this.W;
                this.Y = f;
                float height = f + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                htb htbVar = this.b;
                int height2 = htbVar.getHeight();
                mq5 mq5Var = this.n;
                if (height > ((height2 - mq5Var.b) - mq5Var.d) - hl.L(66.0f)) {
                    int height3 = htbVar.getHeight();
                    mq5 mq5Var2 = this.n;
                    this.Y = ((((height3 - mq5Var2.b) - mq5Var2.d) - hl.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(hl.R1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + U12);
        this.K.setTranslationY(hl.R1(this.W, this.Y, this.c0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        htb htbVar2 = this.d;
        if (viewGroup2 != null) {
            boolean z = this.I;
            ii8 ii8Var = this.K;
            if (z) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((U12 + 0.0f) + ii8Var.getLeft())) - hl.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((U12 + 0.0f) + (ii8Var.b3() ? hl.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = htbVar2.getMeasuredWidth() - (this.T.getX() - U12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - htbVar2.getTop());
            this.T.setAlpha(this.y);
            float R1 = hl.R1(0.75f, 1.0f, this.y);
            this.T.setScaleX(R1);
            this.T.setScaleY(R1);
        }
        this.J.setTranslationX(hl.R1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + U1);
        this.J.setTranslationY(hl.R1(this.W, this.Z, this.c0 ? 1.0f : this.y));
        if (this.R != null) {
            int e2 = this.J.e2(this.P);
            this.J.X1(e2);
            float W1 = this.J.W1(e2);
            boolean z2 = this.I;
            ViewGroup viewGroup3 = this.R;
            itb itbVar = this.J;
            if (z2) {
                viewGroup3.setTranslationX(((this.J.getPollButtonsLeft() + ((U1 + 0.0f) + itbVar.getLeft())) - hl.L(8.0f)) - this.R.getLeft());
            } else {
                viewGroup3.setTranslationX((((U1 + 0.0f) + (itbVar.b3() ? hl.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = htbVar2.getMeasuredWidth() - (this.R.getX() - U12);
            this.R.setTranslationY(((this.J.getY() + ((int) W1)) - this.R.getTop()) - htbVar2.getTop());
            this.R.setAlpha(this.y);
            float R12 = hl.R1(0.75f, 1.0f, this.y);
            this.R.setScaleX(R12);
            this.R.setScaleY(R12);
        }
        if (this.c0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = U12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + hl.L(22.0f)) - htbVar2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(U1);
        textView.setAlpha(this.y);
        q57 q57Var = this.h;
        q57Var.setSelectedTab(positionAnimated);
        q57Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        htb htbVar = this.b;
        setContentView(htbVar, layoutParams);
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
        htbVar.setSystemUiVisibility(1284);
        hl.j3(htbVar, !aob.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (hl.K1(getContext())) {
            super.show();
            mu9.d(new l8b(this, (byte) 7));
            this.O = true;
            a(true, null);
        }
    }
}
