package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a0 extends ClickableSpan {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.a = z10;
        this.b = i7;
        this.c = e6Var;
        this.d = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.d.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(this.b, this.c));
    }
}
