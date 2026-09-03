package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.z8;
import ph.l6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements og.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.b;
                for (View view : w3Var.h.getViewPages()) {
                    if (view instanceof m3) {
                        m3 m3Var = (m3) view;
                        if (m3Var.h == null) {
                            g3 g3Var = m3Var.f;
                            ViewGroup viewGroup = w3Var.P;
                            Objects.requireNonNull(g3Var);
                            m3Var.h = new ng.k(g3Var, viewGroup, new z8(g3Var, 0));
                        }
                        m3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                l6 l6Var = (l6) this.b;
                rl0 rl0Var = l6Var.d;
                tg.c.a(rl0Var, canvas, rectF, rl0Var, l6Var.getContainerView(), 255);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
