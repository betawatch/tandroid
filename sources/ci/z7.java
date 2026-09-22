package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                g8 g8Var = (g8) this.b;
                ll0 ll0Var = g8Var.d;
                gh.d.b(ll0Var, canvas, rectF, ll0Var, g8Var.getContainerView(), 255);
                break;
            default:
                xh.r2 r2Var = (xh.r2) this.b;
                for (View view : r2Var.h.getViewPages()) {
                    if (view instanceof xh.n2) {
                        xh.n2 n2Var = (xh.n2) view;
                        if (n2Var.h == null) {
                            xh.i2 i2Var = n2Var.f;
                            ViewGroup viewGroup = r2Var.S;
                            Objects.requireNonNull(i2Var);
                            n2Var.h = new ah.n(i2Var, viewGroup, new org.telegram.ui.v8(i2Var, 0));
                        }
                        n2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
