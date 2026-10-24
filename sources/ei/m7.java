package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7 implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                mm0 mm0Var = s7Var.d;
                hh.d.b(mm0Var, canvas, rectF, mm0Var, s7Var.getContainerView(), 255);
                break;
            default:
                yh.p2 p2Var = (yh.p2) this.b;
                for (View view : p2Var.h.getViewPages()) {
                    if (view instanceof yh.l2) {
                        yh.l2 l2Var = (yh.l2) view;
                        if (l2Var.h == null) {
                            yh.g2 g2Var = l2Var.f;
                            ViewGroup viewGroup = p2Var.T;
                            Objects.requireNonNull(g2Var);
                            l2Var.h = new bh.l(g2Var, viewGroup, new org.telegram.ui.x8(g2Var, 0));
                        }
                        l2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
