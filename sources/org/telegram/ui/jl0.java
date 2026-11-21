package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
