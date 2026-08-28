package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final n1 e;
    public final RectF f;

    public f2(Context context, n1 n1Var, int i9) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = n1Var;
        n1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, e6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, e6.d(-2, -2.0f, 16, i9 == 0 ? 14.0f : 36.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        n1 n1Var = this.e;
        n1Var.d(x10, y10);
        Paint paint = n1Var.l;
        int alpha = (this.d ? paint : n1Var.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paint : n1Var.b()).setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.d ? paint : n1Var.b());
        if (!this.d) {
            paint = n1Var.b();
        }
        paint.setAlpha(alpha);
        if (n1Var.e) {
            int alpha2 = ((Paint) n1Var.d.a).getAlpha();
            ((Paint) n1Var.d.a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) n1Var.d.a);
            ((Paint) n1Var.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
