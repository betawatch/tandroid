package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class p10 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.u6 d;

    public p10(int i10) {
        this(i10, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.y6.o1(this.c, org.telegram.ui.ActionBar.y6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i10 = this.a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public p10(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.c = 1.0f;
        this.b = i10;
        this.d = u6Var;
    }
}
