package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements og.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ah(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        di diVar;
        kh.o2 o2Var;
        switch (this.a) {
            case 0:
                li liVar = (li) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    di diVar2 = i10 == 0 ? liVar.v0 : liVar.w0;
                    if (diVar2 == null || diVar2.c == null || diVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        tg.c.a(diVar2.c, canvas2, rectF2, diVar2.d, liVar.getContainerView(), (int) (((i10 == 0 && (diVar = liVar.w0) != null && diVar.getVisibility() == 0) ? (1.0f - liVar.w0.getAlpha()) * diVar2.getAlpha() : diVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                og.a[] aVarArr = (og.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    og.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                yu0 yu0Var = (yu0) this.b;
                for (qt0 qt0Var : yu0Var.h0) {
                    ng.k kVar = qt0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                or0 or0Var = yu0Var.S;
                if (or0Var != null && (o2Var = or0Var.O) != null) {
                    o2Var.e(canvas, rectF);
                    break;
                }
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
