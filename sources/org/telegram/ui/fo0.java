package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class fo0 extends ClickableSpan {
    public final /* synthetic */ io0 a;

    public fo0(io0 io0Var) {
        this.a = io0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        io0 io0Var = this.a;
        io0Var.presentFragment(new bg1(6, io0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
