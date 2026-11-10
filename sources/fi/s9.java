package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s9 extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ s9(int i7) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.T2.getColor());
                break;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.m6.o2.linkColor);
                break;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
