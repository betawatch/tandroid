package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class lo0 extends ClickableSpan {
    public final /* synthetic */ oo0 a;

    public lo0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        oo0 oo0Var = this.a;
        oo0Var.presentFragment(new zg1(6, oo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
