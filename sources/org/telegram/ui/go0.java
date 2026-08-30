package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class go0 extends ClickableSpan {
    public final /* synthetic */ jo0 a;

    public go0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        jo0 jo0Var = this.a;
        jo0Var.presentFragment(new og1(6, jo0Var.X));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
