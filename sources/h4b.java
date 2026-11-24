// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class h4b {
    public final w28 a;
    public final lm b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public h4b(y28 y28Var, w28 w28Var) {
        this.a = w28Var;
        this.b = new lm(y28Var, 0L, 360L, s33.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gl.L(3.0f), 0.0f, gl.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(k96.M0(2131744240, null), textPaint, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
