package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh(Object obj, int i10) {
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
                vx vxVar = kzVar.P;
                gh.d.a(vxVar, canvas, rectF, vxVar, kzVar);
                mw mwVar = kzVar.h0;
                gh.d.a(mwVar, canvas, rectF, mwVar, kzVar);
                sw swVar = kzVar.D0;
                gh.d.a(swVar, canvas, rectF, swVar, kzVar);
                break;
            default:
                yu0 yu0Var = (yu0) this.b;
                for (rt0 rt0Var : yu0Var.k0) {
                    ah.n nVar = rt0Var.n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null && (z7Var = nr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
