// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jk2 extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public jk2(String str, String str2, boolean z) {
        this.c = z;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        wm8 wm8Var = mk2.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(hl.L(xea.S0 - this.b));
        }
        textPaint.setColor(aob.w0(null, aob.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
