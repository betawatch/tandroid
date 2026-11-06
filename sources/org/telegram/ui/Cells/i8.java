package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;

    public i8(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
