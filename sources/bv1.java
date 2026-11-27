// default package

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bv1 extends FrameLayout implements s84, snb {
    public final fm0 a;
    public final fm0 b;
    public ImageView c;
    public ImageView d;
    public di2 e;
    public vnb f;
    public float h;
    public int n;
    public jl0 r;

    public bv1(Context context) {
        super(context);
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 320L, false);
        this.b = new fm0(1, this, k43Var, 320L, true);
        this.h = 1.0f;
    }

    public static bv1 c(ll0 ll0Var, kq1 kq1Var, vnb vnbVar, Context context) {
        int i = aob.Nl;
        int v0 = aob.v0(i, vnbVar);
        bv1 bv1Var = new bv1(context);
        bv1Var.f = vnbVar;
        bv1Var.setBlurredBackgroundDrawable(ll0Var.c(bv1Var, kq1Var, false));
        bv1Var.setIconColor(v0);
        int L = hl.L(22.0f);
        int p1 = aob.p1(0.15f, v0);
        int L2 = hl.L(6.0f);
        hf0 W = aob.W(L, p1, L2, L2, L2, L2);
        uob K = yob.K(0.15f, i);
        bv1Var.setBackground(W);
        yob.j(bv1Var, W, null, K, vnbVar);
        return bv1Var;
    }

    public static bv1 d(Context context, ll0 ll0Var, bl0 bl0Var, vnb vnbVar, int i, int i2) {
        int i3 = aob.Nl;
        int v0 = aob.v0(i3, vnbVar);
        bv1 bv1Var = new bv1(context);
        bv1Var.f = vnbVar;
        bv1Var.setBlurredBackgroundDrawable(ll0Var.c(bv1Var, bl0Var, false));
        bv1Var.f(i, i2);
        bv1Var.setIconColor(v0);
        int L = hl.L(22.0f);
        int p1 = aob.p1(0.15f, v0);
        int L2 = hl.L(6.0f);
        hf0 W = aob.W(L, p1, L2, L2, L2, L2);
        uob K = yob.K(0.15f, i3);
        bv1Var.setBackground(W);
        yob.j(bv1Var, W, null, K, vnbVar);
        return bv1Var;
    }

    public final void a() {
        float f = 1.0f - this.a.e;
        float R1 = hl.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.c.setScaleX(hl.R1(0.4f, 1.0f, f));
            this.c.setScaleY(hl.R1(0.4f, 1.0f, f) * this.h);
            this.c.setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f = this.a.e;
        float R1 = hl.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.d.setScaleX(hl.R1(0.4f, 1.0f, f));
            this.d.setScaleY(hl.R1(0.4f, 1.0f, f));
            int i = f > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i) {
                this.d.setVisibility(i);
                this.e.c = -1L;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.a(z, z2);
    }

    public final void f(int i, int i2) {
        if (this.c == null) {
            if (i == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, tre.e(i2, i2, 17));
            a();
        }
        this.c.setImageResource(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r.setBounds(0, 0, i, i2);
    }

    public void setBlurredBackgroundDrawable(jl0 jl0Var) {
        this.r = jl0Var;
        jl0Var.q(hl.L(6.0f));
        this.r.r(hl.L(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        e(z, false);
    }

    public void setIcon(int i) {
        f(i, 48);
    }

    public void setIconColor(int i) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        this.n = i;
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            return;
        }
        vk1.l();
        blendMode = BlendMode.SRC_IN;
        imageView.setColorFilter(new BlendModeColorFilter(i, blendMode));
    }

    public void setIconPadding(int i) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i, 0, 0);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            a();
            b();
        }
        if (i == 1) {
            a();
            b();
        }
    }

    @Override // snb
    public final void updateColors() {
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.updateColors();
            invalidate();
        }
        int v0 = aob.v0(aob.Nl, this.f);
        if (this.c != null && v0 != this.n) {
            setIconColor(v0);
        }
        int L = hl.L(22.0f);
        int p1 = aob.p1(0.15f, v0);
        if (getBackground() instanceof RippleDrawable) {
            aob.F1(getBackground(), p1, true);
        } else {
            int L2 = hl.L(6.0f);
            setBackground(aob.W(L, p1, L2, L2, L2, L2));
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
