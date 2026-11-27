// default package

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
