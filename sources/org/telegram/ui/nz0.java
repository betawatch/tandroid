package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nz0 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ vz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(vz0 vz0Var, String str, String str2) {
        super(str);
        this.b = vz0Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        we.e.s(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
