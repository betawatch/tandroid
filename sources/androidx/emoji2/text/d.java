package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d implements h {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
