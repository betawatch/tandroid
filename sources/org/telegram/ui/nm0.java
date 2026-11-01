package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nm0 extends ClickableSpan {
    public final /* synthetic */ qm0 a;

    public nm0(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        qm0 qm0Var = this.a;
        qm0Var.presentFragment(new rc1(6, qm0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
