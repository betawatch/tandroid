package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class z9 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.e6 f;
    public final /* synthetic */ ba h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(ba baVar, Context context) {
        super(context);
        this.h = baVar;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.e6(this);
    }

    public static /* synthetic */ void a(z9 z9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z9Var.b = floatValue;
        super.setTranslationY(floatValue + z9Var.a);
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
        ofFloat.addUpdateListener(new y9(this, r1));
        this.c.addListener(new ai.n(12, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(qr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        ba baVar = this.h;
        e6Var = ((org.telegram.ui.ActionBar.f3) baVar.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(baVar.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        float f10 = this.b;
        this.a = f7;
        super.setTranslationY(f10 + f7);
    }
}
