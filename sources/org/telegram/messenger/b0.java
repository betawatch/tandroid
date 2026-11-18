package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b0 extends CharacterStyle {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = z10;
        this.b = i7;
        this.c = i6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.b, this.c));
    }
}
