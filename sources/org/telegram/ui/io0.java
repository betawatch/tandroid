package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class io0 extends ClickableSpan {
    public final /* synthetic */ lo0 a;

    public io0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        lo0 lo0Var = this.a;
        lo0Var.presentFragment(new qg1(6, lo0Var.X));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
