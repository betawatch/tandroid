package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w31 extends v31 {
    public w31(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (ty0) null);
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
