package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
