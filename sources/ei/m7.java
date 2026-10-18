package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                im0 im0Var = s7Var.d;
                hh.d.b(im0Var, canvas, rectF, im0Var, s7Var.getContainerView(), 255);
                break;
            default:
                yh.q2 q2Var = (yh.q2) this.b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof yh.m2) {
                        yh.m2 m2Var = (yh.m2) view;
                        if (m2Var.h == null) {
                            yh.h2 h2Var = m2Var.f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new bh.l(h2Var, viewGroup, new org.telegram.ui.x8(h2Var, 0));
                        }
                        m2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
