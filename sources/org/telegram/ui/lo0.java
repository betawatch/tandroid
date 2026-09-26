package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
