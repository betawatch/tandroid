package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
