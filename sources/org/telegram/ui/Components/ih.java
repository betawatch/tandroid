package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ih(Object obj, int i7) {
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
        ki kiVar;
        switch (this.a) {
            case 0:
                si siVar = (si) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    ki kiVar2 = i7 == 0 ? siVar.w2 : siVar.x2;
                    if (kiVar2 == null || kiVar2.c == null || kiVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(kiVar2.c, canvas2, rectF2, kiVar2.d, siVar.b, (int) (((i7 == 0 && (kiVar = siVar.x2) != null && kiVar.getVisibility() == 0) ? (1.0f - siVar.x2.getAlpha()) * kiVar2.getAlpha() : kiVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                ry ryVar = (ry) this.b;
                ex exVar = ryVar.Q;
                ih.d.a(exVar, canvas, rectF, exVar, ryVar);
                vv vvVar = ryVar.i0;
                ih.d.a(vvVar, canvas, rectF, vvVar, ryVar);
                aw awVar = ryVar.E0;
                ih.d.a(awVar, canvas, rectF, awVar, ryVar);
                break;
            default:
                yo0 yo0Var = (yo0) this.b;
                ao0 ao0Var = yo0Var.B1;
                ih.d.a(ao0Var, canvas, rectF, ao0Var, yo0Var.b);
                break;
        }
    }
}
