package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        uh uhVar;
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    uh uhVar2 = i10 == 0 ? biVar.s2 : biVar.t2;
                    if (uhVar2 == null || uhVar2.c == null || uhVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        yg.d.b(uhVar2.c, canvas2, rectF2, uhVar2.d, biVar.b, (int) (((i10 == 0 && (uhVar = biVar.t2) != null && uhVar.getVisibility() == 0) ? (1.0f - biVar.t2.getAlpha()) * uhVar2.getAlpha() : uhVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                vy vyVar = (vy) this.b;
                hx hxVar = vyVar.P;
                yg.d.a(hxVar, canvas, rectF, hxVar, vyVar);
                wv wvVar = vyVar.h0;
                yg.d.a(wvVar, canvas, rectF, wvVar, vyVar);
                bw bwVar = vyVar.D0;
                yg.d.a(bwVar, canvas, rectF, bwVar, vyVar);
                break;
            default:
                op0 op0Var = (op0) this.b;
                oo0 oo0Var = op0Var.x1;
                yg.d.a(oo0Var, canvas, rectF, oo0Var, op0Var.b);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
