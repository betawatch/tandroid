package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hl0 extends ClickableSpan {
    public final /* synthetic */ kl0 a;

    public hl0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kl0 kl0Var = this.a;
        kl0Var.presentFragment(new cb1(6, kl0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
