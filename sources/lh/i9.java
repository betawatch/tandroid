package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i9 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.y5 f;
    public final /* synthetic */ k9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(k9 k9Var, Context context) {
        super(context);
        this.h = k9Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.y5(this);
    }

    public static /* synthetic */ void a(i9 i9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i9Var.b = floatValue;
        super.setTranslationY(floatValue + i9Var.a);
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
        ofFloat.addUpdateListener(new g9(this, r1));
        this.c.addListener(new ag.x(15, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(er.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        k9 k9Var = this.h;
        c6Var = ((org.telegram.ui.ActionBar.e3) k9Var.S).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(k9Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
