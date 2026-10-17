package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class co0 extends ClickableSpan {
    public final /* synthetic */ fo0 a;

    public co0(fo0 fo0Var) {
        this.a = fo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fo0 fo0Var = this.a;
        fo0Var.presentFragment(new xf1(6, fo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
