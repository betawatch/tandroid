package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iw(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.a = i10;
        this.b = n2Var;
        this.c = frameLayout;
        this.d = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        switch (this.a) {
            case 0:
                uy uyVar = (uy) this.b;
                ny nyVar = (ny) this.c;
                PointF pointF = (PointF) this.d;
                dy dyVar = uyVar.C0;
                int alpha = dyVar != null ? (int) (dyVar.getAlpha() * 255.0f) : 0;
                ty[] tyVarArr = uyVar.e0;
                int length = tyVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    ty tyVar = tyVarArr[i10];
                    if (tyVar != null && tyVar.getVisibility() == 0 && tyVar.getAlpha() > 0.0f) {
                        float e42 = uyVar.e4();
                        if (tyVar.F == null || e42 <= 0.0f) {
                            qy qyVar = tyVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            gh.d.b(qyVar, canvas2, rectF2, qyVar, nyVar, 255 - alpha);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!hh.k.b(tyVar.a, nyVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            tyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                dy dyVar2 = uyVar.C0;
                if (dyVar2 != null && dyVar2.getVisibility() == 0 && uyVar.C0.getAlpha() > 0.0f) {
                    dy dyVar3 = uyVar.C0;
                    gh.d.b(dyVar3, canvas3, rectF3, dyVar3, nyVar, alpha);
                    break;
                }
                break;
            default:
                ta1 ta1Var = (ta1) this.b;
                d6 d6Var = (d6) this.d;
                s91 s91Var = ta1Var.S;
                FrameLayout frameLayout = this.c;
                if (s91Var != null) {
                    gh.d.a(s91Var, canvas, rectF, s91Var, frameLayout);
                }
                dc dcVar = ta1Var.i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.zl0 zl0Var = dcVar.F;
                    gh.d.a(zl0Var, canvas, rectF, zl0Var, frameLayout);
                }
                me meVar = ta1Var.j0;
                if (meVar != null && meVar.getParent() == ta1Var.h0 && ta1Var.j0.getVisibility() == 0) {
                    ta1Var.j0.d(canvas, rectF, d6Var);
                    break;
                }
                break;
        }
    }
}
