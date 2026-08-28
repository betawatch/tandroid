package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        ve.e.s(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
