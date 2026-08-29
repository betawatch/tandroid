package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w8 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.d6 f;
    public final /* synthetic */ y8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(y8 y8Var, Context context) {
        super(context);
        this.h = y8Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.d6(this);
    }

    public static /* synthetic */ void a(w8 w8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8Var.b = floatValue;
        super.setTranslationY(floatValue + w8Var.a);
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
        ofFloat.addUpdateListener(new v8(this, r1));
        this.c.addListener(new bg.z2(16, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(jr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        y8 y8Var = this.h;
        c6Var = ((org.telegram.ui.ActionBar.f3) y8Var.S).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(y8Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        float f10 = this.b;
        this.a = f9;
        super.setTranslationY(f10 + f9);
    }
}
