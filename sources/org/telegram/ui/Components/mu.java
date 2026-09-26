package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mu extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ mu(int i10, int i11) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public mu() {
        this.a = 0;
        this.b = 0;
    }
}
