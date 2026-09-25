package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class oq extends ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
    }
}
