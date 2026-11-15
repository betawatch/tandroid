package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hl0 extends ClickableSpan {
    public final /* synthetic */ kl0 a;

    public hl0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kl0 kl0Var = this.a;
        kl0Var.presentFragment(new xa1(6, kl0Var.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
