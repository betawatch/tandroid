package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class do0 extends ClickableSpan {
    public final /* synthetic */ go0 a;

    public do0(go0 go0Var) {
        this.a = go0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        go0 go0Var = this.a;
        go0Var.presentFragment(new xf1(6, go0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
