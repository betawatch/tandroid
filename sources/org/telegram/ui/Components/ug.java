package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ug(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        vh vhVar;
        switch (this.a) {
            case 0:
                di diVar = (di) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    vh vhVar2 = i7 == 0 ? diVar.s2 : diVar.t2;
                    if (vhVar2 == null || vhVar2.c == null || vhVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(vhVar2.c, canvas2, rectF2, vhVar2.d, diVar.b, (int) (((i7 == 0 && (vhVar = diVar.t2) != null && vhVar.getVisibility() == 0) ? (1.0f - diVar.t2.getAlpha()) * vhVar2.getAlpha() : vhVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                hy hyVar = (hy) this.b;
                tw twVar = hyVar.P;
                ih.d.a(twVar, canvas, rectF, twVar, hyVar);
                lv lvVar = hyVar.h0;
                ih.d.a(lvVar, canvas, rectF, lvVar, hyVar);
                qv qvVar = hyVar.D0;
                ih.d.a(qvVar, canvas, rectF, qvVar, hyVar);
                break;
            default:
                no0 no0Var = (no0) this.b;
                pn0 pn0Var = no0Var.x1;
                ih.d.a(pn0Var, canvas, rectF, pn0Var, no0Var.b);
                break;
        }
    }
}
