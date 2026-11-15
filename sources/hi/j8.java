package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j8 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.u5 f;
    public final /* synthetic */ l8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(l8 l8Var, Context context) {
        super(context);
        this.h = l8Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.u5(this);
    }

    public static /* synthetic */ void a(j8 j8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j8Var.b = floatValue;
        super.setTranslationY(floatValue + j8Var.a);
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
        ofFloat.addUpdateListener(new i8(this, r1));
        this.c.addListener(new bi.v4(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(er.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.j6.a7;
        l8 l8Var = this.h;
        q8 q8Var = l8Var.a0;
        int i10 = q8.Y1;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, q8Var.J0);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.e(false, l8Var.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
