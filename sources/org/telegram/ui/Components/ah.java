package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements pg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ah(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        ei eiVar;
        lh.n2 n2Var;
        switch (this.a) {
            case 0:
                mi miVar = (mi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    ei eiVar2 = i10 == 0 ? miVar.v0 : miVar.w0;
                    if (eiVar2 == null || eiVar2.c == null || eiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ug.c.a(eiVar2.c, canvas2, rectF2, eiVar2.d, miVar.getContainerView(), (int) (((i10 == 0 && (eiVar = miVar.w0) != null && eiVar.getVisibility() == 0) ? (1.0f - miVar.w0.getAlpha()) * eiVar2.getAlpha() : eiVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                pg.a[] aVarArr = (pg.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    pg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                zu0 zu0Var = (zu0) this.b;
                for (rt0 rt0Var : zu0Var.h0) {
                    og.k kVar = rt0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                pr0 pr0Var = zu0Var.S;
                if (pr0Var != null && (n2Var = pr0Var.O) != null) {
                    n2Var.e(canvas, rectF);
                    break;
                }
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
