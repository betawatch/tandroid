package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j5 extends ClickableSpan {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final Runnable c;

    public j5(int i10, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        this.a = i10;
        this.b = g6Var;
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
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.a, this.b));
    }
}
