package di;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class i extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public i(String str, String str2, boolean z10) {
        this.c = z10;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        s sVar = l.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(i0.L(uz.W0 - this.b));
        }
        textPaint.setColor(t6.x0(null, t6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
