package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg(Object obj, int i7) {
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
        uh uhVar;
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    uh uhVar2 = i7 == 0 ? ciVar.v2 : ciVar.w2;
                    if (uhVar2 == null || uhVar2.c == null || uhVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(uhVar2.c, canvas2, rectF2, uhVar2.d, ciVar.b, (int) (((i7 == 0 && (uhVar = ciVar.w2) != null && uhVar.getVisibility() == 0) ? (1.0f - ciVar.w2.getAlpha()) * uhVar2.getAlpha() : uhVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                gy gyVar = (gy) this.b;
                sw swVar = gyVar.P;
                ih.d.a(swVar, canvas, rectF, swVar, gyVar);
                kv kvVar = gyVar.h0;
                ih.d.a(kvVar, canvas, rectF, kvVar, gyVar);
                pv pvVar = gyVar.D0;
                ih.d.a(pvVar, canvas, rectF, pvVar, gyVar);
                break;
            default:
                mo0 mo0Var = (mo0) this.b;
                on0 on0Var = mo0Var.A1;
                ih.d.a(on0Var, canvas, rectF, on0Var, mo0Var.b);
                break;
        }
    }
}
