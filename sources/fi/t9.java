package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t9 extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ t9(int i7) {
        this.a = i7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setAlpha(128);
                break;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.k6.T2.getColor());
                break;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.o2.linkColor);
                break;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
