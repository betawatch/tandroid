package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r8 extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;

    public r8(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = i10;
        this.b = u6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
