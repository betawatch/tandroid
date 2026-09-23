package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w7(Object obj, int i10) {
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
                d8 d8Var = (d8) this.b;
                ml0 ml0Var = d8Var.d;
                gh.d.b(ml0Var, canvas, rectF, ml0Var, d8Var.getContainerView(), 255);
                break;
            default:
                xh.s2 s2Var = (xh.s2) this.b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            xh.j2 j2Var = o2Var.f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.n(j2Var, viewGroup, new org.telegram.ui.v8(j2Var, 0));
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
