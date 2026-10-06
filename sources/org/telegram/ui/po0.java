package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class po0 extends ClickableSpan {
    public final /* synthetic */ so0 a;

    public po0(so0 so0Var) {
        this.a = so0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        so0 so0Var = this.a;
        so0Var.presentFragment(new zg1(6, so0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
