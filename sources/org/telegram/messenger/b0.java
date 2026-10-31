package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public b0(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
    }
}
