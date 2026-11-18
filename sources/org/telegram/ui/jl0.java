package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
