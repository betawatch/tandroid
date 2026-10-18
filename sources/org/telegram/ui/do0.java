package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
