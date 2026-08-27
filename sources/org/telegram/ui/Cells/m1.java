package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class m1 extends Drawable {
    public final /* synthetic */ int a;
    public final Path b;
    public final Paint c;
    public final Object d;

    public m1(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new Path();
                Paint paint = new Paint(1);
                this.c = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.d = new org.telegram.ui.Components.y5(new nh.f0(this, 26), 350L, er.h, 0);
                break;
            default:
                Paint paint2 = new Paint(1);
                this.c = paint2;
                paint2.setColor(-1);
                this.d = new RectF();
                this.b = new Path();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                e();
                canvas.drawPath(this.b, this.c);
                break;
            default:
                float e9 = ((org.telegram.ui.Components.y5) this.d).e(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f10 = 0.57f * width;
                Path path = this.b;
                path.rewind();
                float f11 = f10 / 2.0f;
                path.moveTo(centerX - AndroidUtilities.lerp(f11, (-f10) / 2.0f, e9), centerY);
                float f12 = f11 + centerX;
                path.lineTo(f12, centerY);
                float f13 = f12 - (0.27f * width);
                float f14 = (0.54f * width) / 2.0f;
                path.moveTo(f13, centerY - f14);
                path.lineTo(f12, centerY);
                path.lineTo(f13, f14 + centerY);
                canvas.save();
                float dp = AndroidUtilities.dp(2.0f);
                Paint paint = this.c;
                paint.setStrokeWidth(dp);
                canvas.translate(0.0f, (-width) * 0.1f * e9);
                canvas.rotate(e9 * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                break;
        }
    }

    public abstract void e();

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
