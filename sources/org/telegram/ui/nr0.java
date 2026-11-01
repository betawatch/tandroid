package org.telegram.ui;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nr0 implements LineHeightSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ nr0(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = org.telegram.messenger.i0.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
            default:
                fontMetricsInt.ascent -= org.telegram.messenger.i0.L(2.0f);
                fontMetricsInt.top -= org.telegram.messenger.i0.L(2.0f);
                break;
        }
    }
}
