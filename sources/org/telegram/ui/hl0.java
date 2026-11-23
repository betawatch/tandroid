package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hl0 extends ClickableSpan {
    public final /* synthetic */ kl0 a;

    public hl0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kl0 kl0Var = this.a;
        kl0Var.presentFragment(new za1(6, kl0Var.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
