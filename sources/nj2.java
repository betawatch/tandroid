// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nj2 extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public nj2(String str, String str2, boolean z) {
        this.c = z;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        jj8 jj8Var = qj2.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(gl.L(gba.T0 - this.b));
        }
        textPaint.setColor(bkb.w0(null, bkb.Uc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
