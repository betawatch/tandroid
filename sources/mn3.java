// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn3 implements vn3, wv4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un3 b;

    public /* synthetic */ mn3(un3 un3Var, byte b) {
        this.a = b;
        this.b = un3Var;
    }

    public final int a(float f, float f2) {
        un3 un3Var = this.b;
        RectF rectF = un3Var.y;
        if (un3Var.n(rectF)) {
            return un3Var.x.a(f, f2, rectF);
        }
        return 0;
    }

    @Override // wv4
    public final void b(Canvas canvas) {
        byte b = this.a;
        un3 un3Var = this.b;
        switch (b) {
            case 1:
                d dVar = un3Var.f;
                dVar.a.c2.getLocationInWindow(new int[2]);
                un3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar.a(canvas);
                canvas.restore();
                break;
            default:
                d dVar2 = un3Var.f;
                dVar2.a.c2.getLocationInWindow(new int[2]);
                un3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar2.a(canvas);
                canvas.restore();
                break;
        }
    }
}
