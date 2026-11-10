package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y70 extends View {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public final v5 d;
    public boolean e;

    public y70(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new v5(this, 0L, 320L, wq.h);
        c8.ka.a(this);
        this.a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.e == z9) {
            return;
        }
        this.e = z9;
        if (!z10) {
            this.d.a(z9);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(!this.e);
        int width = getWidth();
        Drawable drawable = this.a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        if (d > 0.0f) {
            float L = org.telegram.messenger.g0.L(4.0f);
            Paint paint = this.c;
            paint.setStrokeWidth(L);
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, org.telegram.messenger.qs.e4, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - org.telegram.messenger.g0.L(4.0f), height2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.T1(width3 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + width2, d), org.telegram.messenger.g0.T1(height2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + height, d), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + org.telegram.messenger.g0.L(4.0f), height + org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(4.0f) + width2, width3 - org.telegram.messenger.g0.L(4.0f), d), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(4.0f) + height, height2 - org.telegram.messenger.g0.L(4.0f), d), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (d > 0.0f) {
            float L2 = org.telegram.messenger.g0.L(2.0f);
            Paint paint2 = this.b;
            paint2.setStrokeWidth(L2);
            if (this.e) {
                canvas2.drawLine(width3, height2, org.telegram.messenger.g0.T1(width3, width2, d), org.telegram.messenger.g0.T1(height2, height, d), paint2);
            } else {
                canvas.drawLine(width2, height, org.telegram.messenger.g0.T1(width2, width3, d), org.telegram.messenger.g0.T1(height, height2, d), paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), TLObject.FLAG_30));
    }
}
