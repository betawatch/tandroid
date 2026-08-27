package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements kg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // kg.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        yh yhVar;
        gh.s2 s2Var;
        switch (this.a) {
            case 0:
                gi giVar = (gi) this.b;
                int i10 = 0;
                while (i10 < 2) {
                    yh yhVar2 = i10 == 0 ? giVar.u0 : giVar.v0;
                    if (yhVar2 == null || yhVar2.c == null || yhVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        pg.c.a(yhVar2.c, canvas2, rectF2, yhVar2.d, giVar.getContainerView(), (int) (((i10 == 0 && (yhVar = giVar.v0) != null && yhVar.getVisibility() == 0) ? (1.0f - giVar.v0.getAlpha()) * yhVar2.getAlpha() : yhVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                kg.a[] aVarArr = (kg.a[]) this.b;
                for (int i11 = 0; i11 < 3; i11++) {
                    kg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                hu0 hu0Var = (hu0) this.b;
                for (zs0 zs0Var : hu0Var.g0) {
                    jg.k kVar = zs0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                wq0 wq0Var = hu0Var.R;
                if (wq0Var != null && (s2Var = wq0Var.N) != null) {
                    s2Var.e(canvas, rectF);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
