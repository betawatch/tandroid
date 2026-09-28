package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class g10 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.d6 d;

    public g10(int i10) {
        this(i10, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.h6.l1(this.c, org.telegram.ui.ActionBar.h6.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i10 = this.a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public g10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.c = 1.0f;
        this.b = i10;
        this.d = d6Var;
    }
}
