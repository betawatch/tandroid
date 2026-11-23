package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
