package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh(Object obj, int i10) {
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
        oi oiVar;
        ci.w7 w7Var;
        switch (this.a) {
            case 0:
                wi wiVar = (wi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    oi oiVar2 = i10 == 0 ? wiVar.y0 : wiVar.z0;
                    if (oiVar2 == null || oiVar2.c == null || oiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar2.c, canvas2, rectF2, oiVar2.d, wiVar.getContainerView(), (int) (((i10 == 0 && (oiVar = wiVar.z0) != null && oiVar.getVisibility() == 0) ? (1.0f - wiVar.z0.getAlpha()) * oiVar2.getAlpha() : oiVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                lz lzVar = (lz) this.b;
                xx xxVar = lzVar.P;
                gh.d.a(xxVar, canvas, rectF, xxVar, lzVar);
                nw nwVar = lzVar.h0;
                gh.d.a(nwVar, canvas, rectF, nwVar, lzVar);
                tw twVar = lzVar.D0;
                gh.d.a(twVar, canvas, rectF, twVar, lzVar);
                break;
            default:
                jv0 jv0Var = (jv0) this.b;
                for (cu0 cu0Var : jv0Var.k0) {
                    ah.n nVar = cu0Var.n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                zr0 zr0Var = jv0Var.V;
                if (zr0Var != null && (w7Var = zr0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
