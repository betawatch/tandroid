// default package

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cq8 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ lq8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq8(lq8 lq8Var, String str, String str2) {
        super(str);
        this.b = lq8Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        l11.u(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
