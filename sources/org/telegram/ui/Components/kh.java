package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements dh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        li liVar;
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    li liVar2 = i10 == 0 ? tiVar.B0 : tiVar.C0;
                    if (liVar2 == null || liVar2.c == null || liVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(liVar2.c, canvas2, rectF2, liVar2.d, tiVar.getContainerView(), (int) (((i10 == 0 && (liVar = tiVar.C0) != null && liVar.getVisibility() == 0) ? (1.0f - tiVar.C0.getAlpha()) * liVar2.getAlpha() : liVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                sz szVar = (sz) this.b;
                dy dyVar = szVar.P;
                ih.d.a(dyVar, canvas, rectF, dyVar, szVar);
                uw uwVar = szVar.h0;
                ih.d.a(uwVar, canvas, rectF, uwVar, szVar);
                zw zwVar = szVar.D0;
                ih.d.a(zwVar, canvas, rectF, zwVar, szVar);
                break;
            default:
                nr0.n((nr0) this.b, canvas, rectF);
                break;
        }
    }
}
