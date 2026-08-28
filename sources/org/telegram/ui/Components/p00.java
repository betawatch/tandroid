package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p00 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.b6 d;

    public p00(int i9) {
        this(i9, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.f6.l1(this.c, org.telegram.ui.ActionBar.f6.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i9 = this.a;
        if (color != i9) {
            textPaint.setColor(i9);
        }
    }

    public p00(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.c = 1.0f;
        this.b = i9;
        this.d = b6Var;
    }
}
