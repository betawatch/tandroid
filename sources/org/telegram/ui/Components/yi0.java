package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yi0 extends Drawable {
    public final View a;
    public final Paint b;
    public final Path c;
    public int d;
    public boolean e;
    public final z5 f;

    public yi0(View view) {
        Paint paint = new Paint(1);
        this.b = paint;
        Path path = new Path();
        this.c = path;
        this.d = 255;
        this.a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f = new z5(view, 0L, 350L, pr.h);
        float dpf2 = AndroidUtilities.dpf2(4.66f);
        float dpf22 = AndroidUtilities.dpf2(2.16f);
        path.rewind();
        path.moveTo(dpf2 / 2.0f, 0.0f);
        float f10 = (-dpf2) / 2.0f;
        path.lineTo(f10, 0.0f);
        float f11 = f10 + dpf22;
        path.lineTo(f11, -dpf22);
        path.moveTo(f10, 0.0f);
        path.lineTo(f11, dpf22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float e6 = this.f.e(this.e);
        float dpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(dpf2, dpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e6), 1.0f);
        Path path = this.c;
        Paint paint = this.b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f10 = -dpf2;
        canvas.translate(f10, f10);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e6), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10;
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
