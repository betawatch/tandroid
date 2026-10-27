package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s11 extends ReplacementSpan {
    public static final /* synthetic */ int f = 0;
    public ImageReceiver a;
    public int b;
    public int c;
    public final boolean d;
    public final int e;

    public s11(View view, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        this.b = i10;
        this.c = i11;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setImageBitmap(bitmap);
        imageReceiver.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        this.e = i13;
        this.d = true;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.b;
        int i16 = this.c;
        ImageReceiver imageReceiver = this.a;
        canvas.save();
        if (this.d) {
            imageReceiver.setImageCoords((int) f7, i13 - (i16 - this.e), i15, i16);
        } else {
            imageReceiver.setImageCoords((int) f7, ic.a.A(org.telegram.messenger.t.C(4.0f, i14, i12), i16, 2, i12), i15, i16);
        }
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        int i12 = this.c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i13 = this.e;
                int i14 = -(i12 - i13);
                fontMetricsInt.ascent = i14;
                fontMetricsInt.top = i14;
                fontMetricsInt.descent = i13;
                fontMetricsInt.bottom = i13;
            } else {
                int dp = ((-i12) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = dp;
                fontMetricsInt.top = dp;
                int dp2 = (i12 - (i12 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = dp2;
                fontMetricsInt.bottom = dp2;
            }
        }
        return this.b;
    }
}
