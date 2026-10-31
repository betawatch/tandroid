package kg;

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
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class g2 extends View implements k6 {
    public f2 a;
    public final androidx.activity.i b;
    public int c;
    public ag.l d;
    public boolean e;
    public Paint f;
    public LinearGradient h;
    public Matrix n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context) {
        super(context);
        int i10 = tz.o() == 2 ? zs.e3 : tz.o() == 1 ? 100 : 50;
        this.b = new androidx.activity.i(this, 25);
        this.e = true;
        this.a = new f2(i10);
        a();
    }

    public void a() {
        f2 f2Var = this.a;
        f2Var.O = 100;
        f2Var.M = true;
        f2Var.G = true;
        f2Var.K = true;
        f2Var.H = true;
        f2Var.r = 4;
        f2Var.w = 0.98f;
        f2Var.v = 0.98f;
        f2Var.u = 0.98f;
        f2Var.c();
    }

    public final void b(float f7) {
        float f10 = f7 < 60.0f ? 5.0f : f7 < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        bg.k kVar = new bg.k(this, 11);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(kVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(kVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f.setShader(linearGradient);
        this.n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.i0.L(140.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ag.l lVar = new ag.l(this, 16);
        this.d = lVar;
        sc.a(lVar);
        boolean e = sc.e(131072);
        if (this.e != e) {
            this.e = e;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        ag.l lVar = this.d;
        if (lVar == null || (hashSet = sc.n) == null) {
            return;
        }
        hashSet.remove(lVar);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.a.d(canvas2);
            if (this.f != null) {
                canvas2.save();
                this.n.reset();
                this.n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.i0.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.i0.L(12.0f), getWidth(), getHeight(), this.f);
                this.n.reset();
                this.n.postRotate(180.0f);
                this.n.postTranslate(0.0f, org.telegram.messenger.i0.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(12.0f), this.f);
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
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.a.a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.i0.L(140.0f));
        this.a.a.offset((getMeasuredWidth() - this.a.a.width()) / 2.0f, (getMeasuredHeight() - this.a.a.height()) / 2.0f);
        this.a.b.set(-org.telegram.messenger.i0.L(15.0f), -org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight());
        if (this.c != measuredHeight) {
            this.c = measuredHeight;
            this.a.f();
        }
    }

    public void setPaused(boolean z10) {
        f2 f2Var = this.a;
        if (z10 == f2Var.g) {
            return;
        }
        f2Var.g = z10;
        if (z10) {
            f2Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.a.n.size(); i10++) {
            e2 e2Var = (e2) this.a.n.get(i10);
            e2Var.a = (System.currentTimeMillis() - this.a.R) + e2Var.a;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        androidx.activity.i iVar = this.b;
        removeCallbacks(iVar);
        postDelayed(iVar, 150L);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
