package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zi extends CharacterStyle {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.o2.linkColor);
    }
}
