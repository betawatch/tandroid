package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jl0 extends ClickableSpan {
    public final /* synthetic */ ml0 a;

    public jl0(ml0 ml0Var) {
        this.a = ml0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ml0 ml0Var = this.a;
        ml0Var.presentFragment(new bb1(6, ml0Var.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
