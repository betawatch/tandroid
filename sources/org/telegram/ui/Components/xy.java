package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xy extends ReplacementSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ xy(int i9) {
        this.a = i9;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) paint.measureText(charSequence, i9, i10);
            case 1:
                return AndroidUtilities.dp(16.0f);
            case 2:
                return AndroidUtilities.dp(12.0f);
            case 3:
                return AndroidUtilities.dp(12.0f);
            default:
                return AndroidUtilities.dp(16.0f);
        }
    }

    public /* synthetic */ xy(boolean z10) {
        this.a = 0;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void e(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
