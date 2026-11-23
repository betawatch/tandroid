package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.rf;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements m0, bi.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ w(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // bi.a1
    public void a(Canvas canvas) {
        switch (this.a) {
            case 1:
                l0 l0Var = this.b;
                rf rfVar = l0Var.f;
                rfVar.a.c2.getLocationInWindow(new int[2]);
                l0Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                rfVar.a(canvas);
                canvas.restore();
                break;
            default:
                l0 l0Var2 = this.b;
                rf rfVar2 = l0Var2.f;
                rfVar2.a.c2.getLocationInWindow(new int[2]);
                l0Var2.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                rfVar2.a(canvas);
                canvas.restore();
                break;
        }
    }

    public int b(float f10, float f11) {
        l0 l0Var = this.b;
        RectF rectF = l0Var.y;
        if (l0Var.k(rectF)) {
            return l0Var.x.a(f10, f11, rectF);
        }
        return 0;
    }
}
