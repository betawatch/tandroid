package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d10 extends Drawable {
    public final Drawable a;
    public final Path b;
    public boolean c = true;
    public final Paint d;
    public final Paint e;

    public d10(Context context, int i10, int i11) {
        this.a = context.getResources().getDrawable(i10);
        if (i11 < 0) {
            this.b = null;
            this.d = null;
            this.e = null;
            return;
        }
        this.b = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        int[] iArr = org.telegram.ui.ActionBar.j6.r8;
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, iArr[i11 % iArr.length], false));
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
    }

    public final int a(float f10) {
        return AndroidUtilities.lerp(getBounds().left, getBounds().right, f10);
    }

    public final int b(float f10) {
        return AndroidUtilities.lerp(getBounds().top, getBounds().bottom, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        Path path = this.b;
        if (path == null) {
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        boolean z4 = this.c;
        Paint paint = this.d;
        if (z4) {
            path.rewind();
            path.moveTo(a(0.4871f), b(0.6025f));
            path.lineTo(a(0.8974f), b(0.6025f));
            path.lineTo(a(1.0f), b(0.7564f));
            path.lineTo(a(0.8974f), b(0.9102f));
            path.lineTo(a(0.4871f), b(0.9102f));
            path.close();
            this.c = false;
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        }
        canvas.drawPath(path, paint);
        canvas.drawPath(path, this.e);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
