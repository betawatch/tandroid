// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class cm4 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final wjb d;

    public cm4(int i, wjb wjbVar) {
        this.c = 1.0f;
        this.b = i;
        this.d = wjbVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.a = bkb.p1(this.c, bkb.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i = this.a;
        if (color != i) {
            textPaint.setColor(i);
        }
    }

    public cm4(int i) {
        this(i, null);
    }
}
