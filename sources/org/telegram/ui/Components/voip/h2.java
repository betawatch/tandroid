package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h2 extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final o1 e;
    public final RectF f;

    public h2(Context context, o1 o1Var, int i10) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = o1Var;
        o1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, c6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, c6.d(-2, -2.0f, 16, i10 == 0 ? 14.0f : 36.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.e;
        o1Var.d(x10, y10);
        Paint paint = o1Var.l;
        int alpha = (this.d ? paint : o1Var.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paint : o1Var.b()).setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.d ? paint : o1Var.b());
        if (!this.d) {
            paint = o1Var.b();
        }
        paint.setAlpha(alpha);
        if (o1Var.e) {
            int alpha2 = ((Paint) o1Var.d.a).getAlpha();
            ((Paint) o1Var.d.a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) o1Var.d.a);
            ((Paint) o1Var.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
