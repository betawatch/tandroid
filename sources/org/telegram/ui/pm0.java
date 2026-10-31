package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pm0 extends ClickableSpan {
    public final /* synthetic */ sm0 a;

    public pm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        sm0 sm0Var = this.a;
        sm0Var.presentFragment(new tc1(6, sm0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
