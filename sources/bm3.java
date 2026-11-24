// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm3 implements km3, ut4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm3 b;

    public /* synthetic */ bm3(jm3 jm3Var, byte b) {
        this.a = b;
        this.b = jm3Var;
    }

    public final int a(float f, float f2) {
        jm3 jm3Var = this.b;
        RectF rectF = jm3Var.y;
        if (jm3Var.n(rectF)) {
            return jm3Var.x.a(f, f2, rectF);
        }
        return 0;
    }

    @Override // ut4
    public final void b(Canvas canvas) {
        byte b = this.a;
        jm3 jm3Var = this.b;
        switch (b) {
            case 1:
                d dVar = jm3Var.f;
                dVar.a.c2.getLocationInWindow(new int[2]);
                jm3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar.a(canvas);
                canvas.restore();
                break;
            default:
                d dVar2 = jm3Var.f;
                dVar2.a.c2.getLocationInWindow(new int[2]);
                jm3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar2.a(canvas);
                canvas.restore();
                break;
        }
    }
}
