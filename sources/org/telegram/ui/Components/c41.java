package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c41 extends b41 {
    public c41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (uy0) null);
    }

    @Override // org.telegram.ui.Components.b41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
