// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j4c extends g4c {
    public final int e;
    public final vib f;

    public j4c(String str, int i, vib vibVar) {
        super(str, (vib) null);
        this.e = i;
        this.f = vibVar;
    }

    @Override // g4c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 3) {
            textPaint.setColor(bkb.w0(null, bkb.I6, false));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(bkb.w0(null, bkb.Xc, false));
        } else {
            textPaint.setColor(bkb.w0(null, bkb.Wc, false));
        }
        vib vibVar = this.f;
        if (vibVar != null) {
            vibVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
