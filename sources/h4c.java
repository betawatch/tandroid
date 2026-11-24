// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h4c extends g4c {
    public h4c(String str) {
        super(str.replace((char) 8238, ' '), (vib) null);
    }

    @Override // g4c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(gl.o());
        textPaint.setUnderlineText(false);
    }
}
