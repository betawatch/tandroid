// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
