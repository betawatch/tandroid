package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m8 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.u5 f;
    public final /* synthetic */ o8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(o8 o8Var, Context context) {
        super(context);
        this.h = o8Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.u5(this);
    }

    public static /* synthetic */ void a(m8 m8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m8Var.b = floatValue;
        super.setTranslationY(floatValue + m8Var.a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            setVisibility(z10 ? 8 : 0);
            float measuredHeight = z10 ? getMeasuredHeight() : 0.0f;
            this.b = measuredHeight;
            super.setTranslationY(measuredHeight + this.a);
            return;
        }
        setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, z10 ? getMeasuredHeight() : 0.0f);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new l8(this, r1));
        this.c.addListener(new dh.x(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(xq.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i3 = org.telegram.ui.ActionBar.k6.a7;
        o8 o8Var = this.h;
        t8 t8Var = o8Var.a0;
        int i10 = t8.V1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, t8Var.J0);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.e(false, o8Var.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
