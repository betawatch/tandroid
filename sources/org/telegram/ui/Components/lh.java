package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        ni niVar;
        di.v7 v7Var;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    ni niVar2 = i10 == 0 ? viVar.B0 : viVar.C0;
                    if (niVar2 == null || niVar2.c == null || niVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.b(niVar2.c, canvas2, rectF2, niVar2.d, viVar.getContainerView(), (int) (((i10 == 0 && (niVar = viVar.C0) != null && niVar.getVisibility() == 0) ? (1.0f - viVar.C0.getAlpha()) * niVar2.getAlpha() : niVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                wz wzVar = (wz) this.b;
                iy iyVar = wzVar.P;
                hh.d.a(iyVar, canvas, rectF, iyVar, wzVar);
                yw ywVar = wzVar.h0;
                hh.d.a(ywVar, canvas, rectF, ywVar, wzVar);
                ex exVar = wzVar.D0;
                hh.d.a(exVar, canvas, rectF, exVar, wzVar);
                break;
            default:
                xv0 xv0Var = (xv0) this.b;
                for (qu0 qu0Var : xv0Var.k0) {
                    bh.l lVar = qu0Var.n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null && (v7Var = ns0Var.R) != null) {
                    v7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
