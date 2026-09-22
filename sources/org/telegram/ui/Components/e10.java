package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.e6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.i6.l1(this.c, org.telegram.ui.ActionBar.i6.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i10 = this.a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = 1.0f;
        this.b = i10;
        this.d = e6Var;
    }
}
