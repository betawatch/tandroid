package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class io0 extends ClickableSpan {
    public final /* synthetic */ lo0 a;

    public io0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        lo0 lo0Var = this.a;
        lo0Var.presentFragment(new vg1(6, lo0Var.X));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
