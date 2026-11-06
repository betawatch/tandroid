package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class el0 extends ClickableSpan {
    public final /* synthetic */ hl0 a;

    public el0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        hl0 hl0Var = this.a;
        hl0Var.presentFragment(new ya1(6, hl0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
