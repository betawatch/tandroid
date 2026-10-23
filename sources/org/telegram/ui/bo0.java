package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bo0 extends ClickableSpan {
    public final /* synthetic */ eo0 a;

    public bo0(eo0 eo0Var) {
        this.a = eo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        eo0 eo0Var = this.a;
        eo0Var.presentFragment(new vf1(6, eo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
