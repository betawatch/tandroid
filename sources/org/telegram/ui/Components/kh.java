package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh(Object obj, int i10) {
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
        ni niVar;
        ci.z7 z7Var;
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
                        gh.d.b(niVar2.c, canvas2, rectF2, niVar2.d, viVar.getContainerView(), (int) (((i10 == 0 && (niVar = viVar.z0) != null && niVar.getVisibility() == 0) ? (1.0f - viVar.z0.getAlpha()) * niVar2.getAlpha() : niVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                kz kzVar = (kz) this.b;
                wx wxVar = kzVar.P;
                gh.d.a(wxVar, canvas, rectF, wxVar, kzVar);
                mw mwVar = kzVar.h0;
                gh.d.a(mwVar, canvas, rectF, mwVar, kzVar);
                sw swVar = kzVar.D0;
                gh.d.a(swVar, canvas, rectF, swVar, kzVar);
                break;
            default:
                kv0 kv0Var = (kv0) this.b;
                for (du0 du0Var : kv0Var.k0) {
                    ah.o oVar = du0Var.n;
                    if (oVar != null) {
                        oVar.f(canvas, rectF);
                    }
                }
                zr0 zr0Var = kv0Var.V;
                if (zr0Var != null && (z7Var = zr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
