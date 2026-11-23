package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s41 extends r41 {
    public s41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (ez0) null);
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
