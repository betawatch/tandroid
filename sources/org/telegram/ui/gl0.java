package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gl0 extends ClickableSpan {
    public final /* synthetic */ jl0 a;

    public gl0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        jl0 jl0Var = this.a;
        jl0Var.presentFragment(new bb1(6, jl0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
