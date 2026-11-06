package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
