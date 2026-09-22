package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lu extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ lu(int i10, int i11) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public lu() {
        this.a = 0;
        this.b = 0;
    }
}
