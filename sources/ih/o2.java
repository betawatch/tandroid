package ih;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import nh.g7;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.t8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements mg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f;
                            ViewGroup viewGroup = x3Var.O;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new lg.k(h3Var, viewGroup, new t8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                g7 g7Var = (g7) this.b;
                jl0 jl0Var = g7Var.d;
                rg.c.a(jl0Var, canvas, rectF, jl0Var, g7Var.getContainerView(), 255);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
