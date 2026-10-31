package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wy extends ReplacementSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ wy(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) paint.measureText(charSequence, i10, i11);
            case 1:
                return org.telegram.messenger.i0.L(16.0f);
            case 2:
                return org.telegram.messenger.i0.L(12.0f);
            case 3:
                return org.telegram.messenger.i0.L(12.0f);
            default:
                return org.telegram.messenger.i0.L(16.0f);
        }
    }

    public /* synthetic */ wy(boolean z10) {
        this.a = 0;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void e(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
