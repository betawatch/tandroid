package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t41 extends s41 {
    public t41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (fz0) null);
    }

    @Override // org.telegram.ui.Components.s41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
