package ih;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n8 implements LineHeightSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ n8(int i9) {
        this.a = i9;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i9, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.ascent -= AndroidUtilities.dp(2.0f);
                fontMetricsInt.top -= AndroidUtilities.dp(2.0f);
                break;
            default:
                fontMetricsInt.descent = AndroidUtilities.dp(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
        }
    }
}
