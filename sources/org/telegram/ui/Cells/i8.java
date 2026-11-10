package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;

    public i8(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
