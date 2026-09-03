package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.x8;
import qh.i6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements pg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f;
                            ViewGroup viewGroup = x3Var.P;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new og.k(h3Var, viewGroup, new x8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                i6 i6Var = (i6) this.b;
                sl0 sl0Var = i6Var.d;
                ug.c.a(sl0Var, canvas, rectF, sl0Var, i6Var.getContainerView(), 255);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
