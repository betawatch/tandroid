package di;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q8 implements LineHeightSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ q8(int i7) {
        this.a = i7;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.ascent -= org.telegram.messenger.g0.L(2.0f);
                fontMetricsInt.top -= org.telegram.messenger.g0.L(2.0f);
                break;
            default:
                fontMetricsInt.descent = org.telegram.messenger.g0.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
        }
    }
}
