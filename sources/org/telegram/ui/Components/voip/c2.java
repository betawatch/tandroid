package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c2 extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final l1 e;
    public final RectF f;

    public c2(Context context, l1 l1Var, int i7) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = l1Var;
        l1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, ma.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, i7 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        l1 l1Var = this.e;
        l1Var.d(x10, y10);
        Paint paint = l1Var.l;
        int alpha = (this.d ? paint : l1Var.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paint : l1Var.b()).setAlpha(ls.e4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.d ? paint : l1Var.b());
        if (!this.d) {
            paint = l1Var.b();
        }
        paint.setAlpha(alpha);
        if (l1Var.e) {
            int alpha2 = ((Paint) l1Var.d.a).getAlpha();
            ((Paint) l1Var.d.a).setAlpha(ls.e4);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), (Paint) l1Var.d.a);
            ((Paint) l1Var.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
