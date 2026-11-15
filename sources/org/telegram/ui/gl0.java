package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gl0 extends ClickableSpan {
    public final /* synthetic */ jl0 a;

    public gl0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        jl0 jl0Var = this.a;
        jl0Var.presentFragment(new xa1(6, jl0Var.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
