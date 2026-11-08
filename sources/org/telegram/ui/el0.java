package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class el0 extends ClickableSpan {
    public final /* synthetic */ hl0 a;

    public el0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        hl0 hl0Var = this.a;
        hl0Var.presentFragment(new za1(6, hl0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
