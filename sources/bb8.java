// default package

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bb8 implements LineHeightSpan {
    public final /* synthetic */ byte a;

    public /* synthetic */ bb8(byte b) {
        this.a = b;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = gm.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
            default:
                fontMetricsInt.ascent -= gm.L(2.0f);
                fontMetricsInt.top -= gm.L(2.0f);
                break;
        }
    }
}
