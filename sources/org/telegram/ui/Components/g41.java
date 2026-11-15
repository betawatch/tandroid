package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g41 extends f41 {
    public g41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (wy0) null);
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
