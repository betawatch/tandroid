package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        li liVar;
        ei.m7 m7Var;
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
                        hh.d.b(liVar2.c, canvas2, rectF2, liVar2.d, tiVar.getContainerView(), (int) (((i10 == 0 && (liVar = tiVar.C0) != null && liVar.getVisibility() == 0) ? (1.0f - tiVar.C0.getAlpha()) * liVar2.getAlpha() : liVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                tz tzVar = (tz) this.b;
                ey eyVar = tzVar.P;
                hh.d.a(eyVar, canvas, rectF, eyVar, tzVar);
                uw uwVar = tzVar.h0;
                hh.d.a(uwVar, canvas, rectF, uwVar, tzVar);
                ax axVar = tzVar.D0;
                hh.d.a(axVar, canvas, rectF, axVar, tzVar);
                break;
            default:
                uv0 uv0Var = (uv0) this.b;
                for (nu0 nu0Var : uv0Var.k0) {
                    bh.l lVar = nu0Var.n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                ks0 ks0Var = uv0Var.V;
                if (ks0Var != null && (m7Var = ks0Var.R) != null) {
                    m7Var.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
