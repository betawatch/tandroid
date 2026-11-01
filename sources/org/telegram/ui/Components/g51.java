package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g51 extends f51 {
    public g51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (zz0) null);
    }

    @Override // org.telegram.ui.Components.f51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setUnderlineText(false);
    }
}
