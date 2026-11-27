// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
