package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g30 extends Drawable {
    public byte[] a;
    public final Paint b = new Paint();
    public final int[] c = {-1, -2758925, -13805707, -13657655};

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte[] bArr = this.a;
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        int[] iArr = this.c;
        Paint paint = this.b;
        if (length == 16) {
            float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
            float f10 = 8.0f * floor;
            float v = org.telegram.ui.Cells.y0.v(getBounds().width(), f10, 2.0f, 0.0f);
            float v10 = org.telegram.ui.Cells.y0.v(getBounds().height(), f10, 2.0f, 0.0f);
            int i7 = 0;
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = 0;
                while (i11 < 8) {
                    int i12 = i7 + 2;
                    paint.setColor(iArr[Math.abs((this.a[i7 / 8] >> (i7 % 8)) & 3) % 4]);
                    float f11 = (i11 * floor) + v;
                    float f12 = i10 * floor;
                    canvas.drawRect(f11, f12 + v10, f11 + floor, f12 + floor + v10, paint);
                    i11++;
                    i7 = i12;
                }
            }
            return;
        }
        float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
        float f13 = 12.0f * floor2;
        float v11 = org.telegram.ui.Cells.y0.v(getBounds().width(), f13, 2.0f, 0.0f);
        float v12 = org.telegram.ui.Cells.y0.v(getBounds().height(), f13, 2.0f, 0.0f);
        int i13 = 0;
        int i14 = 0;
        while (i14 < 12) {
            int i15 = i13;
            for (int i16 = 0; i16 < 12; i16++) {
                paint.setColor(iArr[Math.abs((this.a[i15 / 8] >> (i15 % 8)) & 3) % 4]);
                float f14 = (i16 * floor2) + v11;
                float f15 = i14 * floor2;
                canvas.drawRect(f14, f15 + v12, f14 + floor2, f15 + floor2 + v12, paint);
                i15 += 2;
            }
            i14++;
            i13 = i15;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
