package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 extends CharacterStyle {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;

    public d0(boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = z10;
        this.b = i10;
        this.c = p6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(i0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.b, this.c));
    }
}
