package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class l00 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.p6 d;

    public l00(int i10) {
        this(i10, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.t6.r1(this.c, org.telegram.ui.ActionBar.t6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i10 = this.a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public l00(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.c = 1.0f;
        this.b = i10;
        this.d = p6Var;
    }
}
