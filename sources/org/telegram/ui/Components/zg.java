package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zg(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        ci ciVar;
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    ci ciVar2 = i7 == 0 ? kiVar.w2 : kiVar.x2;
                    if (ciVar2 == null || ciVar2.c == null || ciVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(ciVar2.c, canvas2, rectF2, ciVar2.d, kiVar.b, (int) (((i7 == 0 && (ciVar = kiVar.x2) != null && ciVar.getVisibility() == 0) ? (1.0f - kiVar.x2.getAlpha()) * ciVar2.getAlpha() : ciVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ly lyVar = (ly) this.b;
                yw ywVar = lyVar.Q;
                ih.d.a(ywVar, canvas, rectF, ywVar, lyVar);
                qv qvVar = lyVar.i0;
                ih.d.a(qvVar, canvas, rectF, qvVar, lyVar);
                vv vvVar = lyVar.E0;
                ih.d.a(vvVar, canvas, rectF, vvVar, lyVar);
                break;
            default:
                po0 po0Var = (po0) this.b;
                rn0 rn0Var = po0Var.B1;
                ih.d.a(rn0Var, canvas, rectF, rn0Var, po0Var.b);
                break;
        }
    }
}
