package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements ah.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        qi qiVar;
        bi.a9 a9Var;
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    qi qiVar2 = i10 == 0 ? yiVar.y0 : yiVar.z0;
                    if (qiVar2 == null || qiVar2.c == null || qiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        fh.d.a(qiVar2.c, canvas2, rectF2, qiVar2.d, yiVar.getContainerView(), (int) (((i10 == 0 && (qiVar = yiVar.z0) != null && qiVar.getVisibility() == 0) ? (1.0f - yiVar.z0.getAlpha()) * qiVar2.getAlpha() : qiVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ah.a[] aVarArr = (ah.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    ah.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                iv0 iv0Var = (iv0) this.b;
                for (au0 au0Var : iv0Var.k0) {
                    zg.k kVar = au0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                wr0 wr0Var = iv0Var.V;
                if (wr0Var != null && (a9Var = wr0Var.R) != null) {
                    a9Var.e(canvas, rectF);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        switch (this.a) {
        }
        zVar.b = true;
    }
}
