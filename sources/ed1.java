// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements roc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextPaint b;

    public /* synthetic */ ed1(TextPaint textPaint, byte b) {
        this.a = b;
        this.b = textPaint;
    }

    @Override // roc
    public final void a(float f, float f2, int i) {
        this.b.setShadowLayer(f, 0.0f, f2, i);
    }

    public final float b(CharSequence charSequence) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        switch (b) {
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }
}
