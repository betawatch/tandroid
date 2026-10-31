package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ u(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(i0.o());
                textPaint.setColor(this.b);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.b);
                break;
            case 2:
                textPaint.setAlpha((int) ((this.b / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.r1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public /* synthetic */ u(int i10, int i11, boolean z10) {
        this.a = i11;
        this.b = i10;
    }

    public u() {
        this.a = 2;
        this.b = 0;
    }
}
