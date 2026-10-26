package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h5 extends ClickableSpan {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final Runnable c;

    public h5(int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        this.a = i10;
        this.b = u6Var;
        this.c = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.a, this.b));
    }
}
