// default package

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a98 implements LineHeightSpan {
    public final /* synthetic */ byte a;

    public /* synthetic */ a98(byte b) {
        this.a = b;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = gl.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
            default:
                fontMetricsInt.ascent -= gl.L(2.0f);
                fontMetricsInt.top -= gl.L(2.0f);
                break;
        }
    }
}
