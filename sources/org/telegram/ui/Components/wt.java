package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wt extends CharacterStyle {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ wt(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setAlpha((int) ((this.b / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.l1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public wt() {
        this.a = 0;
        this.b = 0;
    }
}
