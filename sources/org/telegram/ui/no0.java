package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class no0 extends ClickableSpan {
    public final /* synthetic */ qo0 a;

    public no0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        qo0 qo0Var = this.a;
        qo0Var.presentFragment(new zg1(6, qo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
