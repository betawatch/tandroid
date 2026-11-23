package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
