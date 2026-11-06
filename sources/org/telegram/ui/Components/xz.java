package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class xz extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.f6 d;

    public xz(int i7) {
        this(i7, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.k6.r1(this.c, org.telegram.ui.ActionBar.k6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i7 = this.a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public xz(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = 1.0f;
        this.b = i7;
        this.d = f6Var;
    }
}
