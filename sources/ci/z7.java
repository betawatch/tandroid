package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ml0 ml0Var = g8Var.d;
                gh.d.b(ml0Var, canvas, rectF, ml0Var, g8Var.getContainerView(), 255);
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
                            n2Var.h = new ah.o(i2Var, viewGroup, new org.telegram.ui.x8(i2Var, 0));
                        }
                        n2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
