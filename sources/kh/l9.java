package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l9 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.y5 f;
    public final /* synthetic */ n9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(n9 n9Var, Context context) {
        super(context);
        this.h = n9Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.y5(this);
    }

    public static /* synthetic */ void a(l9 l9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l9Var.b = floatValue;
        super.setTranslationY(floatValue + l9Var.a);
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
        ofFloat.addUpdateListener(new k9(this, r1));
        this.c.addListener(new hg.b0(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(gr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        super.dispatchDraw(canvas);
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        n9 n9Var = this.h;
        b6Var = ((org.telegram.ui.ActionBar.f3) n9Var.S).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(n9Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}
