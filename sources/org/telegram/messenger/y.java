package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class y extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Runnable d;

    public y(int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.a = i7;
        this.b = i10;
        this.c = h6Var;
        this.d = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.a;
        textPaint.setUnderlineText(i7 == 4);
        int i10 = this.b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.c));
        }
        if (i7 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
