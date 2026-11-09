package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d41 extends c41 {
    public d41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (vy0) null);
    }

    @Override // org.telegram.ui.Components.c41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
