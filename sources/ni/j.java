package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class j extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public j(String str, String str2, boolean z9) {
        this.c = z9;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        s sVar = m.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(g0.L(iz.W0 - this.b));
        }
        textPaint.setColor(m6.x0(null, m6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
