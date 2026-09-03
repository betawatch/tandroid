package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hu extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ hu(int i10, int i11) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.l1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public hu() {
        this.a = 0;
        this.b = 0;
    }
}
