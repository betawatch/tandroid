package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class i00 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.i6 d;

    public i00(int i7) {
        this(i7, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.n6.r1(this.c, org.telegram.ui.ActionBar.n6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i7 = this.a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public i00(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = 1.0f;
        this.b = i7;
        this.d = i6Var;
    }
}
