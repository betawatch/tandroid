package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f51 extends e51 {
    public f51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (yz0) null);
    }

    @Override // org.telegram.ui.Components.e51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setUnderlineText(false);
    }
}
