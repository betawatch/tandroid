package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public h(boolean z10, String str, String str2) {
        this.c = z10;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        q qVar = k.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.b));
        }
        textPaint.setColor(y6.x0(null, y6.ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
