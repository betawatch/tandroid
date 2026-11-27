// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec1 implements erc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextPaint b;

    public /* synthetic */ ec1(TextPaint textPaint, byte b) {
        this.a = b;
        this.b = textPaint;
    }

    public final float a(CharSequence charSequence) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        switch (b) {
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    @Override // erc
    public final void b(float f, float f2, int i) {
        this.b.setShadowLayer(f, 0.0f, f2, i);
    }
}
