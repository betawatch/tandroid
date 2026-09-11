package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        di.z7 z7Var;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    ni niVar2 = i10 == 0 ? viVar.y0 : viVar.z0;
                    if (niVar2 == null || niVar2.c == null || niVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.a(niVar2.c, canvas2, rectF2, niVar2.d, viVar.getContainerView(), (int) (((i10 == 0 && (niVar = viVar.z0) != null && niVar.getVisibility() == 0) ? (1.0f - viVar.z0.getAlpha()) * niVar2.getAlpha() : niVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ch.a[] aVarArr = (ch.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    ch.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.f(canvas, rectF);
                    }
                }
                break;
            default:
                xu0 xu0Var = (xu0) this.b;
                for (qt0 qt0Var : xu0Var.k0) {
                    bh.l lVar = qt0Var.n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                nr0 nr0Var = xu0Var.V;
                if (nr0Var != null && (z7Var = nr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
