package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(Object obj, int i10) {
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
                c8 c8Var = (c8) this.b;
                zl0 zl0Var = c8Var.d;
                gh.d.b(zl0Var, canvas, rectF, zl0Var, c8Var.getContainerView(), 255);
                break;
            default:
                xh.s2 s2Var = (xh.s2) this.b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            final xh.j2 j2Var = o2Var.f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.n(j2Var, viewGroup, new ah.m() { // from class: xh.s1
                                @Override // ah.m
                                public final boolean a(Canvas canvas2, View view2, long j3) {
                                    return e71.this.drawChild(canvas2, view2, j3);
                                }
                            });
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
