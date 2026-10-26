package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e9 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.h6 f;
    public final /* synthetic */ g9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(g9 g9Var, Context context) {
        super(context);
        this.h = g9Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.h6(this);
    }

    public static /* synthetic */ void a(e9 e9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e9Var.b = floatValue;
        super.setTranslationY(floatValue + e9Var.a);
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
        ofFloat.addUpdateListener(new d9(this, r1));
        this.c.addListener(new bh.f0(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(ds.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.y6.a7;
        g9 g9Var = this.h;
        u6Var = ((org.telegram.ui.ActionBar.k3) g9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.d(g9Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        float f10 = this.b;
        this.a = f7;
        super.setTranslationY(f10 + f7);
    }
}
