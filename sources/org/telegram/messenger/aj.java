package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class aj extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ aj(int i10) {
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
