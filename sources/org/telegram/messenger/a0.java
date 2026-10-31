package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ Runnable d;

    public a0(int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.a = i10;
        this.b = i11;
        this.c = p6Var;
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
        int i10 = this.a;
        textPaint.setUnderlineText(i10 == 4);
        int i11 = this.b;
        if (i11 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.c));
        }
        if (i10 == 2) {
            textPaint.setTypeface(i0.o());
        }
    }
}
