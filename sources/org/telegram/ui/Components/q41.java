package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q41 extends p41 {
    public q41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (dz0) null);
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
