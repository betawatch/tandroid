package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oo0 extends ClickableSpan {
    public final /* synthetic */ ro0 a;

    public oo0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ro0 ro0Var = this.a;
        ro0Var.presentFragment(new fg1(6, ro0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
