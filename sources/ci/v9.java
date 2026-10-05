package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class v9 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.e6 f;
    public final /* synthetic */ x9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(x9 x9Var, Context context) {
        super(context);
        this.h = x9Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.e6(this);
    }

    public static /* synthetic */ void a(v9 v9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v9Var.b = floatValue;
        super.setTranslationY(floatValue + v9Var.a);
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
        ofFloat.addUpdateListener(new u9(this, r1));
        this.c.addListener(new ai.n(12, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(tr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        x9 x9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.f3) x9Var.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(x9Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        float f10 = this.b;
        this.a = f7;
        super.setTranslationY(f10 + f7);
    }
}
