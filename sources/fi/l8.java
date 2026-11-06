package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l8 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.w5 f;
    public final /* synthetic */ n8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(n8 n8Var, Context context) {
        super(context);
        this.h = n8Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.w5(this);
    }

    public static /* synthetic */ void a(l8 l8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l8Var.b = floatValue;
        super.setTranslationY(floatValue + l8Var.a);
    }

    public final void b(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            setVisibility(z9 ? 8 : 0);
            float measuredHeight = z9 ? getMeasuredHeight() : 0.0f;
            this.b = measuredHeight;
            super.setTranslationY(measuredHeight + this.a);
            return;
        }
        setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, z9 ? getMeasuredHeight() : 0.0f);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new k8(this, r1));
        this.c.addListener(new ch.y(12, this, z9));
        this.c.setDuration(320L);
        this.c.setInterpolator(xq.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.k6.a7;
        n8 n8Var = this.h;
        s8 s8Var = n8Var.W;
        int i10 = s8.U1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, s8Var.I0);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.e(false, n8Var.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
