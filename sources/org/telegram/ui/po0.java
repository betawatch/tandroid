package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class po0 extends ClickableSpan {
    public final /* synthetic */ so0 a;

    public po0(so0 so0Var) {
        this.a = so0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        so0 so0Var = this.a;
        so0Var.presentFragment(new zg1(6, so0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
