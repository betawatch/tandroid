// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d4c extends g4c {
    public static boolean h = true;
    public final int e;
    public final vib f;

    public d4c(String str, int i, vib vibVar) {
        super(str, (vib) null);
        this.e = i;
        this.f = vibVar;
    }

    @Override // g4c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 2) {
            textPaint.setColor(-1);
        } else {
            boolean z = h;
            if (i == 1) {
                textPaint.setColor(bkb.w0(null, z ? bkb.Xc : bkb.Vc, false));
            } else {
                textPaint.setColor(bkb.w0(null, z ? bkb.Wc : bkb.Uc, false));
            }
        }
        vib vibVar = this.f;
        if (vibVar != null) {
            vibVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
