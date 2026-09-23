package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm b;

    public /* synthetic */ dg(qm qmVar, int i10) {
        this.a = i10;
        this.b = qmVar;
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
        switch (this.a) {
            case 0:
                qm qmVar = this.b;
                xn xnVar = qmVar.J0;
                xn xnVar2 = xnVar.da;
                qm qmVar2 = xnVar2 != null ? xnVar2.X0 : xnVar.X0;
                float f7 = xnVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(f7 * 0.85f, xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
                }
                gh.d.b(new dg(qmVar, 1), canvas, rectF, xnVar.x0, qmVar2, i10);
                ai.w0 w0Var = xnVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, qmVar2, i11);
                }
                ci.i1 i1Var = xnVar.q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = xnVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = xnVar.q1.getChildAt(i12);
                        if ((childAt instanceof zn) && childAt.getVisibility() == 0) {
                            zn znVar = (zn) childAt;
                            yn ynVar = znVar.a;
                            qm qmVar3 = ynVar.X0;
                            Objects.requireNonNull(qmVar3);
                            gh.d.a(new dg(qmVar3, 0), canvas, rectF, ynVar.X0, znVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                xn xnVar3 = this.b.J0;
                if (xnVar3.x0.Z0()) {
                    xnVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    xnVar3.x0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < xnVar3.x0.getChildCount(); i13++) {
                        View childAt2 = xnVar3.x0.getChildAt(i13);
                        if (!xn.d2(xnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                                if (t1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, t1Var.V);
                                    t1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                xnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                xnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                xnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    xnVar3.x0.x1(canvas, rectF);
                    break;
                }
        }
    }
}
