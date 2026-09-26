package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
