package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class k extends MetricAffectingSpan {
    public static final Typeface[] c;
    public final int a;
    public final int b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public k(int i7) {
        this.b = i7;
        this.a = ((i7 & 256) != 0 ? 1 : 0) | ((i7 & 512) != 0 ? 2 : 0);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(c[this.a]);
    }
}
