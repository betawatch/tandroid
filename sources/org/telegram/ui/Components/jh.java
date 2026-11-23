package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh(Object obj, int i7) {
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
        li liVar;
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.b;
                int i7 = 0;
                while (i7 < 2) {
                    li liVar2 = i7 == 0 ? tiVar.w2 : tiVar.x2;
                    if (liVar2 == null || liVar2.c == null || liVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(liVar2.c, canvas2, rectF2, liVar2.d, tiVar.b, (int) (((i7 == 0 && (liVar = tiVar.x2) != null && liVar.getVisibility() == 0) ? (1.0f - tiVar.x2.getAlpha()) * liVar2.getAlpha() : liVar2.getAlpha()) * 255.0f));
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                qy qyVar = (qy) this.b;
                dx dxVar = qyVar.Q;
                ih.d.a(dxVar, canvas, rectF, dxVar, qyVar);
                vv vvVar = qyVar.i0;
                ih.d.a(vvVar, canvas, rectF, vvVar, qyVar);
                aw awVar = qyVar.E0;
                ih.d.a(awVar, canvas, rectF, awVar, qyVar);
                break;
            default:
                zo0 zo0Var = (zo0) this.b;
                bo0 bo0Var = zo0Var.B1;
                ih.d.a(bo0Var, canvas, rectF, bo0Var, zo0Var.b);
                break;
        }
    }
}
