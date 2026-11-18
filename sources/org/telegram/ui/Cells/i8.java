package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;

    public i8(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
