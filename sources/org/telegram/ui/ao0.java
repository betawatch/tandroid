package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ao0 extends ClickableSpan {
    public final /* synthetic */ do0 a;

    public ao0(do0 do0Var) {
        this.a = do0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        do0 do0Var = this.a;
        do0Var.presentFragment(new zf1(6, do0Var.W));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
