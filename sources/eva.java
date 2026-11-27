// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class eva extends View implements snb {
    public dva a;
    public final bva b;
    public int c;
    public sh9 d;
    public boolean e;
    public Paint f;
    public LinearGradient h;
    public Matrix n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eva(Context context) {
        super(context);
        int i = xea.o() == 2 ? jn7.d3 : xea.o() == 1 ? 100 : 50;
        this.b = new bva((Object) this, (byte) 0);
        this.e = true;
        this.a = new dva(i);
        a();
    }

    public void a() {
        dva dvaVar = this.a;
        dvaVar.N = 100;
        dvaVar.L = true;
        dvaVar.G = true;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.r = (byte) 4;
        dvaVar.w = 0.98f;
        dvaVar.v = 0.98f;
        dvaVar.u = 0.98f;
        dvaVar.c();
    }

    public final void b(float f) {
        float f2 = f < 60.0f ? 5.0f : f < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        ija ijaVar = new ija(this, (byte) 6);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f2);
        ofFloat.addUpdateListener(ijaVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        ofFloat2.addUpdateListener(ijaVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f.setShader(linearGradient);
        this.n = new Matrix();
    }

    public int getStarsRectWidth() {
        return hl.L(140.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sh9 sh9Var = new sh9(this, (byte) 9);
        this.d = sh9Var;
        i86.a(sh9Var);
        boolean e = i86.e(131072);
        if (this.e != e) {
            this.e = e;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        sh9 sh9Var = this.d;
        if (sh9Var == null || (hashSet = i86.n) == null) {
            return;
        }
        hashSet.remove(sh9Var);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.a.d(canvas2);
            if (this.f != null) {
                canvas2.save();
                this.n.reset();
                this.n.postTranslate(0.0f, (getHeight() + 1) - hl.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, getHeight() - hl.L(12.0f), getWidth(), getHeight(), this.f);
                this.n.reset();
                this.n.postRotate(180.0f);
                this.n.postTranslate(0.0f, hl.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), hl.L(12.0f), this.f);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.a.g) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.a.a.set(0.0f, 0.0f, getStarsRectWidth(), hl.L(140.0f));
        this.a.a.offset((getMeasuredWidth() - this.a.a.width()) / 2.0f, (getMeasuredHeight() - this.a.a.height()) / 2.0f);
        this.a.b.set(-hl.L(15.0f), -hl.L(15.0f), hl.L(15.0f) + getMeasuredWidth(), hl.L(15.0f) + getMeasuredHeight());
        if (this.c != measuredHeight) {
            this.c = measuredHeight;
            this.a.f();
        }
    }

    public void setPaused(boolean z) {
        dva dvaVar = this.a;
        if (z == dvaVar.g) {
            return;
        }
        dvaVar.g = z;
        if (z) {
            dvaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.a.n.size(); i++) {
            cva cvaVar = (cva) this.a.n.get(i);
            cvaVar.a = (System.currentTimeMillis() - this.a.Q) + cvaVar.a;
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        bva bvaVar = this.b;
        removeCallbacks(bvaVar);
        postDelayed(bvaVar, 150L);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
