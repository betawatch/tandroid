package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements jg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ah(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        ci ciVar;
        fh.x2 x2Var;
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.b;
                int i9 = 0;
                while (i9 < 2) {
                    ci ciVar2 = i9 == 0 ? kiVar.u0 : kiVar.v0;
                    if (ciVar2 == null || ciVar2.c == null || ciVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        og.d.a(ciVar2.c, canvas2, rectF2, ciVar2.d, kiVar.getContainerView(), (int) (((i9 == 0 && (ciVar = kiVar.v0) != null && ciVar.getVisibility() == 0) ? (1.0f - kiVar.v0.getAlpha()) * ciVar2.getAlpha() : ciVar2.getAlpha()) * 255.0f));
                    }
                    i9++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                jg.a[] aVarArr = (jg.a[]) this.b;
                for (int i10 = 0; i10 < 3; i10++) {
                    jg.a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                eu0 eu0Var = (eu0) this.b;
                for (xs0 xs0Var : eu0Var.g0) {
                    ig.k kVar = xs0Var.n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                vq0 vq0Var = eu0Var.R;
                if (vq0Var != null && (x2Var = vq0Var.N) != null) {
                    x2Var.e(canvas, rectF);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
