package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m51 extends l51 {
    public m51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (n01) null);
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setUnderlineText(false);
    }
}
