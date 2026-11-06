package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class my0 extends ReplacementSpan {
    public static final /* synthetic */ int f = 0;
    public ImageReceiver a;
    public int b;
    public int c;
    public final boolean d;
    public final int e;

    public my0(View view, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        this.b = i7;
        this.c = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.v0(bitmap);
        imageReceiver.o1 = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        this.e = i12;
        this.d = true;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.b;
        int i15 = this.c;
        ImageReceiver imageReceiver = this.a;
        canvas.save();
        if (this.d) {
            imageReceiver.y0((int) f10, i12 - (i15 - this.e), i14, i15);
        } else {
            imageReceiver.y0((int) f10, jg.g.D(org.telegram.messenger.k5.z(4.0f, i13, i11), i15, 2, i11), i14, i15);
        }
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = this.c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i12 = this.e;
                int i13 = -(i11 - i12);
                fontMetricsInt.ascent = i13;
                fontMetricsInt.top = i13;
                fontMetricsInt.descent = i12;
                fontMetricsInt.bottom = i12;
            } else {
                int L = ((-i11) / 2) - org.telegram.messenger.g0.L(4.0f);
                fontMetricsInt.ascent = L;
                fontMetricsInt.top = L;
                int L2 = (i11 - (i11 / 2)) - org.telegram.messenger.g0.L(4.0f);
                fontMetricsInt.descent = L2;
                fontMetricsInt.bottom = L2;
            }
        }
        return this.b;
    }
}
