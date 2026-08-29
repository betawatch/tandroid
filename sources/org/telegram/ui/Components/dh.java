package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements mg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        fi fiVar;
        ih.o2 o2Var;
        switch (this.a) {
            case 0:
                ni niVar = (ni) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    fi fiVar2 = i10 == 0 ? niVar.u0 : niVar.v0;
                    if (fiVar2 == null || fiVar2.c == null || fiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        rg.c.a(fiVar2.c, canvas2, rectF2, fiVar2.d, niVar.getContainerView(), (int) (((i10 == 0 && (fiVar = niVar.v0) != null && fiVar.getVisibility() == 0) ? (1.0f - niVar.v0.getAlpha()) * fiVar2.getAlpha() : fiVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                mg.a[] aVarArr = (mg.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    mg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                qu0 qu0Var = (qu0) this.b;
                for (it0 it0Var : qu0Var.g0) {
                    lg.k kVar = it0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                gr0 gr0Var = qu0Var.R;
                if (gr0Var != null && (o2Var = gr0Var.N) != null) {
                    o2Var.e(canvas, rectF);
                    break;
                }
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
