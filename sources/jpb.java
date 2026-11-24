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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jpb extends Dialog {
    public float E;
    public final hx4 F;
    public final kl0 G;
    public k27 H;
    public boolean I;
    public hpb J;
    public ue8 K;
    public gb2 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public t09 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final wjb a;
    public boolean a0;
    public final gpb b;
    public boolean b0;
    public final gpb c;
    public boolean c0;
    public final gpb d;
    public ft1 d0;
    public final vq1 e;
    public ValueAnimator e0;
    public final TextView f;
    public ValueAnimator f0;
    public final j37 h;
    public io5 n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public jpb(Activity activity, wjb wjbVar) {
        super(activity, R.style.TransparentDialog);
        this.n = io5.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.b0 = false;
        this.a = wjbVar;
        gpb gpbVar = new gpb(this, activity, (byte) 0);
        this.b = gpbVar;
        gpbVar.setOnClickListener(new bna(this, (byte) 19));
        hx4 hx4Var = new hx4();
        this.F = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.G = kl0Var;
        kl0Var.h = new zec(gpbVar);
        kl0Var.i = gpbVar;
        gpb gpbVar2 = new gpb(this, activity, (byte) 1);
        this.c = gpbVar2;
        gpbVar2.setClipToPadding(false);
        gpbVar.addView(gpbVar2, nme.e(-1, -1, kk7.D1));
        vq1 vq1Var = new vq1((byte) 8, activity, this);
        this.e = vq1Var;
        vq1Var.setAdapter(new bn0((byte) 7, activity, this));
        gpbVar2.addView(vq1Var, nme.e(-1, -1, kk7.D1));
        gpb gpbVar3 = new gpb(this, activity, (byte) 2);
        this.d = gpbVar3;
        gpbVar2.addView(gpbVar3, nme.e(-1, -1, kk7.D1));
        j37 j37Var = new j37(activity, wjbVar);
        this.h = j37Var;
        j37Var.a(0, k96.M0(2131743828, null));
        j37Var.a(1, k96.M0(2131743829, null));
        gpbVar2.addView(j37Var, nme.e(-1, 66, 80));
        j37Var.setOnTabClick(new ae9(vq1Var, (byte) 21));
        il0 c = kl0Var.c(j37Var, null, false);
        c.p(nod.k(wjbVar));
        c.S.e = true;
        c.q(gl.L(8.0f));
        c.r(gl.L(16.0f));
        j37Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(j37Var.getColor());
        textView.setText(k96.M0(2131743830, null));
        textView.setGravity(17);
        gpbVar2.addView(textView, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        u39 u39Var = new u39(this, (byte) 20);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(gpbVar, u39Var);
    }

    public final void a(boolean z, k08 k08Var) {
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: epb
            public final /* synthetic */ jpb b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b;
                jpb jpbVar = this.b;
                switch (b3) {
                    case 0:
                        jpbVar.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        jpbVar.b.invalidate();
                        jpbVar.c.invalidate();
                        jpbVar.e();
                        break;
                    default:
                        jpbVar.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new qw((Object) this, z, (Object) k08Var, (byte) 15));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.e0;
        s33 s33Var = s33.h;
        valueAnimator3.setInterpolator(s33Var);
        this.e0.setDuration(j);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: epb
            public final /* synthetic */ jpb b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b3 = b2;
                jpb jpbVar = this.b;
                switch (b3) {
                    case 0:
                        jpbVar.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        jpbVar.b.invalidate();
                        jpbVar.c.invalidate();
                        jpbVar.e();
                        break;
                    default:
                        jpbVar.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new pu9((byte) 9, this, z));
        this.f0.setDuration((long) (j * 1.5f));
        this.f0.setInterpolator(s33Var);
        this.f0.start();
    }

    public final void b(boolean z) {
        gb2 gb2Var;
        t09 t09Var;
        if (z && (t09Var = this.Q) != null && t09Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.b();
            return;
        }
        if (this.b0) {
            return;
        }
        this.b0 = true;
        this.X = false;
        vq1 vq1Var = this.e;
        vq1Var.j();
        boolean z2 = vq1Var.getCurrentPosition() == 1;
        if (!z) {
            gb2 gb2Var2 = this.L;
            if (gb2Var2 != null) {
                gb2Var2.setVisibility(0);
                gb2 gb2Var3 = this.L;
                gb2Var3.c6 = -1;
                gb2Var3.invalidate();
            }
        } else if (z2 && (gb2Var = this.L) != null) {
            gb2Var.setVisibility(4);
            this.L.invalidate();
        }
        this.c0 = !z;
        d();
        a(false, new k08((byte) 22, (Object) this, z2));
        this.b.invalidate();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    public final void d() {
        if (this.X) {
            return;
        }
        gpb gpbVar = this.b;
        if (gpbVar.getWidth() > 0) {
            gb2 gb2Var = this.L;
            if (gb2Var != null) {
                int[] iArr = new int[2];
                gb2Var.getLocationOnScreen(iArr);
                int i = iArr[0];
                io5 io5Var = this.n;
                this.V = i - io5Var.a;
                float f = iArr[1] - io5Var.b;
                this.W = f;
                if (!this.a0) {
                    this.a0 = true;
                    this.Y = f;
                    if (this.T != null) {
                        float height = f + this.L.getHeight() + this.T.getHeight();
                        int height2 = gpbVar.getHeight();
                        io5 io5Var2 = this.n;
                        if (height > ((height2 - io5Var2.b) - io5Var2.d) - gl.L(66.0f)) {
                            int height3 = gpbVar.getHeight();
                            io5 io5Var3 = this.n;
                            this.Y = ((((height3 - io5Var3.b) - io5Var3.d) - gl.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                        }
                    }
                    int e2 = this.J.e2(this.P);
                    this.J.X1(e2);
                    float W1 = this.J.W1(e2);
                    float f2 = this.W;
                    this.Z = f2;
                    float f3 = (int) W1;
                    float f4 = f2 + f3;
                    int height4 = gpbVar.getHeight();
                    io5 io5Var4 = this.n;
                    int L = ((height4 - io5Var4.b) - io5Var4.d) - gl.L(78.0f);
                    TextView textView = this.f;
                    if (f4 > L - textView.getHeight()) {
                        int height5 = gpbVar.getHeight();
                        io5 io5Var5 = this.n;
                        this.Z = ((((height5 - io5Var5.b) - io5Var5.d) - gl.L(78.0f)) - textView.getHeight()) - r1;
                    }
                    if (this.R != null) {
                        float height6 = this.Z + f3 + r3.getHeight();
                        int height7 = gpbVar.getHeight();
                        io5 io5Var6 = this.n;
                        if (height6 > (((height7 - io5Var6.b) - io5Var6.d) - gl.L(78.0f)) - textView.getHeight()) {
                            int height8 = gpbVar.getHeight();
                            io5 io5Var7 = this.n;
                            this.Z = (((((height8 - io5Var7.b) - io5Var7.d) - gl.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
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
        vq1 vq1Var = this.e;
        float positionAnimated = vq1Var.getPositionAnimated();
        float U1 = gl.U1(positionAnimated, 0, -vq1Var.getWidth());
        float U12 = gl.U1(positionAnimated, vq1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f = this.W;
                this.Y = f;
                float height = f + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                gpb gpbVar = this.b;
                int height2 = gpbVar.getHeight();
                io5 io5Var = this.n;
                if (height > ((height2 - io5Var.b) - io5Var.d) - gl.L(66.0f)) {
                    int height3 = gpbVar.getHeight();
                    io5 io5Var2 = this.n;
                    this.Y = ((((height3 - io5Var2.b) - io5Var2.d) - gl.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(gl.R1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + U12);
        this.K.setTranslationY(gl.R1(this.W, this.Y, this.c0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        gpb gpbVar2 = this.d;
        if (viewGroup2 != null) {
            boolean z = this.I;
            ue8 ue8Var = this.K;
            if (z) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((U12 + 0.0f) + ue8Var.getLeft())) - gl.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((U12 + 0.0f) + (ue8Var.b3() ? gl.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = gpbVar2.getMeasuredWidth() - (this.T.getX() - U12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - gpbVar2.getTop());
            this.T.setAlpha(this.y);
            float R1 = gl.R1(0.75f, 1.0f, this.y);
            this.T.setScaleX(R1);
            this.T.setScaleY(R1);
        }
        this.J.setTranslationX(gl.R1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + U1);
        this.J.setTranslationY(gl.R1(this.W, this.Z, this.c0 ? 1.0f : this.y));
        if (this.R != null) {
            int e2 = this.J.e2(this.P);
            this.J.X1(e2);
            float W1 = this.J.W1(e2);
            boolean z2 = this.I;
            ViewGroup viewGroup3 = this.R;
            hpb hpbVar = this.J;
            if (z2) {
                viewGroup3.setTranslationX(((this.J.getPollButtonsLeft() + ((U1 + 0.0f) + hpbVar.getLeft())) - gl.L(8.0f)) - this.R.getLeft());
            } else {
                viewGroup3.setTranslationX((((U1 + 0.0f) + (hpbVar.b3() ? gl.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = gpbVar2.getMeasuredWidth() - (this.R.getX() - U12);
            this.R.setTranslationY(((this.J.getY() + ((int) W1)) - this.R.getTop()) - gpbVar2.getTop());
            this.R.setAlpha(this.y);
            float R12 = gl.R1(0.75f, 1.0f, this.y);
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
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + gl.L(22.0f)) - gpbVar2.getTop()));
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
        j37 j37Var = this.h;
        j37Var.setSelectedTab(positionAnimated);
        j37Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        gpb gpbVar = this.b;
        setContentView(gpbVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = kk7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        gl.m(attributes);
        window.setAttributes(attributes);
        gpbVar.setSystemUiVisibility(1284);
        gl.k3(gpbVar, !bkb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            super.show();
            tq9.d(new n4b(this, (byte) 7));
            this.O = true;
            a(true, null);
        }
    }
}
