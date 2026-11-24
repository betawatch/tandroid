// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bl2 extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public bl2(String str, String str2, boolean z) {
        this.c = z;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        ml8 ml8Var = el2.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(gm.L(gda.S0 - this.b));
        }
        textPaint.setColor(cmb.w0(null, cmb.Uc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
