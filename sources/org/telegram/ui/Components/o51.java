package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o51 extends n51 {
    public o51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (p01) null);
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setUnderlineText(false);
    }
}
