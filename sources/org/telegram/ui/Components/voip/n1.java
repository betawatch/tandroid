package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.zs;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final x0 e;
    public final RectF f;

    public n1(Context context, x0 x0Var, int i10) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = x0Var;
        x0Var.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, b6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, i10 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        x0 x0Var = this.e;
        x0Var.d(x10, y3);
        Paint paint = x0Var.l;
        int alpha = (this.d ? paint : x0Var.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paint : x0Var.b()).setAlpha(zs.e4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), this.d ? paint : x0Var.b());
        if (!this.d) {
            paint = x0Var.b();
        }
        paint.setAlpha(alpha);
        if (x0Var.e) {
            int alpha2 = ((Paint) x0Var.d.a).getAlpha();
            ((Paint) x0Var.d.a).setAlpha(zs.e4);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), (Paint) x0Var.d.a);
            ((Paint) x0Var.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
