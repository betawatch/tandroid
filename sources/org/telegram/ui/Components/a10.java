package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a10 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.c6 d;

    public a10(int i10) {
        this(i10, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.g6.l1(this.c, org.telegram.ui.ActionBar.g6.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i10 = this.a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public a10(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = 1.0f;
        this.b = i10;
        this.d = c6Var;
    }
}
