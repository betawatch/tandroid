package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ju extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ju(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setAlpha((int) ((this.b / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public ju() {
        this.a = 0;
        this.b = 0;
    }
}
