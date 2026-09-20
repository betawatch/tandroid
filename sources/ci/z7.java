package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                vl0 vl0Var = g8Var.d;
                gh.d.b(vl0Var, canvas, rectF, vl0Var, g8Var.getContainerView(), 255);
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
                            o2Var.h = new ah.o(j2Var, viewGroup, new org.telegram.ui.w8(j2Var, 0));
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                break;
        }
    }
}
