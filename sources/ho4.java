// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ho4 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final vnb d;

    public ho4(int i, vnb vnbVar) {
        this.c = 1.0f;
        this.b = i;
        this.d = vnbVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = aob.p1(this.c, aob.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i = this.a;
        if (color != i) {
            textPaint.setColor(i);
        }
    }

    public ho4(int i) {
        this(i, null);
    }
}
