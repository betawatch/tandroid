package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.sf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements q0, bi.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ a0(p0 p0Var, int i7) {
        this.a = i7;
        this.b = p0Var;
    }

    @Override // bi.a1
    public void a(Canvas canvas) {
        switch (this.a) {
            case 1:
                p0 p0Var = this.b;
                sf sfVar = p0Var.f;
                sfVar.a.c2.getLocationInWindow(new int[2]);
                p0Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                sfVar.a(canvas);
                canvas.restore();
                break;
            default:
                p0 p0Var2 = this.b;
                sf sfVar2 = p0Var2.f;
                sfVar2.a.c2.getLocationInWindow(new int[2]);
                p0Var2.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                sfVar2.a(canvas);
                canvas.restore();
                break;
        }
    }

    public int b(float f10, float f11) {
        p0 p0Var = this.b;
        RectF rectF = p0Var.y;
        if (p0Var.m(rectF)) {
            return p0Var.x.a(f10, f11, rectF);
        }
        return 0;
    }
}
