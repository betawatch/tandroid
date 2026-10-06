package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh(Object obj, int i10) {
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
        pi piVar;
        ci.x7 x7Var;
        switch (this.a) {
            case 0:
                xi xiVar = (xi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    pi piVar2 = i10 == 0 ? xiVar.y0 : xiVar.z0;
                    if (piVar2 == null || piVar2.c == null || piVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(piVar2.c, canvas2, rectF2, piVar2.d, xiVar.getContainerView(), (int) (((i10 == 0 && (piVar = xiVar.z0) != null && piVar.getVisibility() == 0) ? (1.0f - xiVar.z0.getAlpha()) * piVar2.getAlpha() : piVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                nz nzVar = (nz) this.b;
                zx zxVar = nzVar.P;
                gh.d.a(zxVar, canvas, rectF, zxVar, nzVar);
                qw qwVar = nzVar.h0;
                gh.d.a(qwVar, canvas, rectF, qwVar, nzVar);
                vw vwVar = nzVar.D0;
                gh.d.a(vwVar, canvas, rectF, vwVar, nzVar);
                break;
            case 2:
                br0.n((br0) this.b, canvas, rectF);
                break;
            default:
                qv0 qv0Var = (qv0) this.b;
                for (ju0 ju0Var : qv0Var.k0) {
                    ah.n nVar = ju0Var.n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                gs0 gs0Var = qv0Var.V;
                if (gs0Var != null && (x7Var = gs0Var.R) != null) {
                    x7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
