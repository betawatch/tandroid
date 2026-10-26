package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mo0 extends ClickableSpan {
    public final /* synthetic */ po0 a;

    public mo0(po0 po0Var) {
        this.a = po0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        po0 po0Var = this.a;
        po0Var.presentFragment(new dg1(6, po0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
