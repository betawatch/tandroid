package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a90 extends View {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public final d6 d;
    public boolean e;

    public a90(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new d6(this, 0L, 320L, jr.h);
        i7.h6.a(this);
        this.a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        if (!z11) {
            this.d.a(z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.d.e(!this.e);
        int width = getWidth();
        Drawable drawable = this.a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        if (e10 > 0.0f) {
            float dp = AndroidUtilities.dp(4.0f);
            Paint paint = this.c;
            paint.setStrokeWidth(dp);
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(width3 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + width2, e10), AndroidUtilities.lerp(height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + height, e10), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + AndroidUtilities.dp(4.0f), height + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + width2, width3 - AndroidUtilities.dp(4.0f), e10), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + height, height2 - AndroidUtilities.dp(4.0f), e10), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (e10 > 0.0f) {
            float dp2 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.b;
            paint2.setStrokeWidth(dp2);
            if (this.e) {
                canvas2.drawLine(width3, height2, AndroidUtilities.lerp(width3, width2, e10), AndroidUtilities.lerp(height2, height, e10), paint2);
            } else {
                canvas.drawLine(width2, height, AndroidUtilities.lerp(width2, width3, e10), AndroidUtilities.lerp(height, height2, e10), paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), TLObject.FLAG_30));
    }
}
