// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
