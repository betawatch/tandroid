package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bw0 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ jw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(jw0 jw0Var, String str, String str2) {
        super(str);
        this.b = jw0Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        vf.c.t(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
