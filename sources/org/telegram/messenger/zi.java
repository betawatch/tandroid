package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zi extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ zi(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.t6.T2.getColor());
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.o2.linkColor);
                break;
            case 2:
                break;
            default:
                textPaint.setAlpha(128);
                break;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
