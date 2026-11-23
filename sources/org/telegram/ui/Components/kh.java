package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh(Object obj, int i7) {
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
        mi miVar;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    mi miVar2 = i7 == 0 ? uiVar.w2 : uiVar.x2;
                    if (miVar2 == null || miVar2.c == null || miVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(miVar2.c, canvas2, rectF2, miVar2.d, uiVar.b, (int) (((i7 == 0 && (miVar = uiVar.x2) != null && miVar.getVisibility() == 0) ? (1.0f - uiVar.x2.getAlpha()) * miVar2.getAlpha() : miVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ty tyVar = (ty) this.b;
                gx gxVar = tyVar.Q;
                ih.d.a(gxVar, canvas, rectF, gxVar, tyVar);
                yv yvVar = tyVar.i0;
                ih.d.a(yvVar, canvas, rectF, yvVar, tyVar);
                dw dwVar = tyVar.E0;
                ih.d.a(dwVar, canvas, rectF, dwVar, tyVar);
                break;
            default:
                ap0 ap0Var = (ap0) this.b;
                co0 co0Var = ap0Var.B1;
                ih.d.a(co0Var, canvas, rectF, co0Var, ap0Var.b);
                break;
        }
    }
}
