// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
