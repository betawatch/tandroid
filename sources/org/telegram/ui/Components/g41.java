package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
