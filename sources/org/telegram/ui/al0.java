package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class al0 extends ClickableSpan {
    public final /* synthetic */ dl0 a;

    public al0(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        dl0 dl0Var = this.a;
        dl0Var.presentFragment(new ra1(6, dl0Var.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
