// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c9a {
    public final uc a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public c9a(View view) {
        uc ucVar = new uc(view, (byte) 5);
        this.b = System.currentTimeMillis();
        this.a = ucVar;
        yyc yycVar = Utilities.c;
        this.c = gl.R1(5.0f, 9.0f, Utilities.l(yycVar.nextFloat()));
        this.d = gl.R1(2.5f, 5.0f, Utilities.l(yycVar.nextFloat()));
        this.e = gl.R1(2.5f, 5.2f, Utilities.l(yycVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f) {
        float currentTimeMillis = (System.currentTimeMillis() - this.b) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * gl.L(0.5f) * f, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * gl.L(0.5f) * f);
        canvas.translate(-0.0f, -0.0f);
        if (f > 0.0f) {
            this.a.run();
        }
    }
}
