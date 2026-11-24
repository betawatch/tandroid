// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class cl2 extends MetricAffectingSpan {
    public static final Typeface[] c;
    public final int a;
    public final int b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public cl2(int i) {
        this.b = i;
        this.a = ((i & 256) != 0 ? 1 : 0) | ((i & 512) != 0 ? 2 : 0);
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
