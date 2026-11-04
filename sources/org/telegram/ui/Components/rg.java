package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements fh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        th thVar;
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                int i3 = 0;
                while (i3 < 2) {
                    th thVar2 = i3 == 0 ? biVar.t2 : biVar.u2;
                    if (thVar2 == null || thVar2.c == null || thVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        jh.d.b(thVar2.c, canvas2, rectF2, thVar2.d, biVar.b, (int) (((i3 == 0 && (thVar = biVar.u2) != null && thVar.getVisibility() == 0) ? (1.0f - biVar.u2.getAlpha()) * thVar2.getAlpha() : thVar2.getAlpha()) * 255.0f));
                    }
                    i3++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ey eyVar = (ey) this.b;
                rw rwVar = eyVar.Q;
                jh.d.a(rwVar, canvas, rectF, rwVar, eyVar);
                jv jvVar = eyVar.i0;
                jh.d.a(jvVar, canvas, rectF, jvVar, eyVar);
                ov ovVar = eyVar.E0;
                jh.d.a(ovVar, canvas, rectF, ovVar, eyVar);
                break;
            default:
                oo0 oo0Var = (oo0) this.b;
                qn0 qn0Var = oo0Var.y1;
                jh.d.a(qn0Var, canvas, rectF, qn0Var, oo0Var.b);
                break;
        }
    }
}
