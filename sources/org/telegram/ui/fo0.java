package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fo0 extends ClickableSpan {
    public final /* synthetic */ io0 a;

    public fo0(io0 io0Var) {
        this.a = io0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        io0 io0Var = this.a;
        io0Var.presentFragment(new bg1(6, io0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
