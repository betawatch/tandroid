package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class i8 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.d6 f;
    public final /* synthetic */ k8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(k8 k8Var, Context context) {
        super(context);
        this.h = k8Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.d6(this);
    }

    public static /* synthetic */ void a(i8 i8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i8Var.b = floatValue;
        super.setTranslationY(floatValue + i8Var.a);
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
        ofFloat.addUpdateListener(new h8(this, r1));
        this.c.addListener(new bi.g7(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(nr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.m6.a7;
        k8 k8Var = this.h;
        p8 p8Var = k8Var.a0;
        int i10 = p8.Y1;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, p8Var.J0);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.e(false, k8Var.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
