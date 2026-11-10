package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class xz extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.h6 d;

    public xz(int i7) {
        this(i7, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.m6.r1(this.c, org.telegram.ui.ActionBar.m6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i7 = this.a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public xz(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = 1.0f;
        this.b = i7;
        this.d = h6Var;
    }
}
