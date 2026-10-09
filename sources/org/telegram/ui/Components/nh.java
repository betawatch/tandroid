package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh(Object obj, int i10) {
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
        Canvas canvas2;
        RectF rectF2;
        qi qiVar;
        ci.w7 w7Var;
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    qi qiVar2 = i10 == 0 ? yiVar.B0 : yiVar.C0;
                    if (qiVar2 == null || qiVar2.c == null || qiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(qiVar2.c, canvas2, rectF2, qiVar2.d, yiVar.getContainerView(), (int) (((i10 == 0 && (qiVar = yiVar.C0) != null && qiVar.getVisibility() == 0) ? (1.0f - yiVar.C0.getAlpha()) * qiVar2.getAlpha() : qiVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                a00 a00Var = (a00) this.b;
                my myVar = a00Var.P;
                gh.d.a(myVar, canvas, rectF, myVar, a00Var);
                cx cxVar = a00Var.h0;
                gh.d.a(cxVar, canvas, rectF, cxVar, a00Var);
                ix ixVar = a00Var.D0;
                gh.d.a(ixVar, canvas, rectF, ixVar, a00Var);
                break;
            default:
                bw0 bw0Var = (bw0) this.b;
                for (uu0 uu0Var : bw0Var.k0) {
                    ah.n nVar = uu0Var.n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                rs0 rs0Var = bw0Var.V;
                if (rs0Var != null && (w7Var = rs0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
