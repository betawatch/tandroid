// default package

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nr8 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ wr8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr8(wr8 wr8Var, String str, String str2) {
        super(str);
        this.b = wr8Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        m01.u(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
