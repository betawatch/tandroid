package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class tz extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final org.telegram.ui.ActionBar.e6 d;

    public tz(int i3) {
        this(i3, null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = org.telegram.ui.ActionBar.k6.r1(this.c, org.telegram.ui.ActionBar.k6.w0(this.b, this.d));
        int color = textPaint.getColor();
        int i3 = this.a;
        if (color != i3) {
            textPaint.setColor(i3);
        }
    }

    public tz(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = 1.0f;
        this.b = i3;
        this.d = e6Var;
    }
}
