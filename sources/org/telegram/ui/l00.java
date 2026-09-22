package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l00 extends ImageSpan {
    public int a;

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        if (paint.getColor() != this.a && getDrawable() != null) {
            Drawable drawable = getDrawable();
            int color = paint.getColor();
            this.a = color;
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
