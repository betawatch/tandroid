// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g8c extends f8c {
    public g8c(String str) {
        super(str.replace((char) 8238, ' '), (rmb) null);
    }

    @Override // f8c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(hl.o());
        textPaint.setUnderlineText(false);
    }
}
