// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
