package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Runnable d;

    public y(int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.a = i3;
        this.b = i10;
        this.c = e6Var;
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
        int i3 = this.a;
        textPaint.setUnderlineText(i3 == 4);
        int i10 = this.b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.c));
        }
        if (i3 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
