// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class es1 extends tib {
    public final /* synthetic */ mu1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es1(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(activity);
        this.L = mu1Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = gl.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new cib(this, (byte) 1);
        this.K = new Path();
        int v0 = bkb.v0(bkb.xj, wjbVar);
        int alpha = Color.alpha(v0);
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setColor(v0);
        paint.setColor(v0);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = gl.L(6.0f);
        int i = bkb.vj;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        setBackground(b0);
        zkb.j(this, b0, M, null, wjbVar);
    }

    public final void d() {
        int i = -(gl.L(16.0f) + getMeasuredHeight());
        mu1 mu1Var = this.L;
        setTranslationY((mu1Var.a0.getTop() - mu1Var.m1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i)));
    }

    @Override // tib, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // tib, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
