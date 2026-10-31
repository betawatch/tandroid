package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m8 extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;

    public m8(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = i10;
        this.b = p6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
