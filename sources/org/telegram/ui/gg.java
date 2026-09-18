package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tm b;

    public /* synthetic */ gg(tm tmVar, int i10) {
        this.a = i10;
        this.b = tmVar;
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
                tm tmVar = this.b;
                bo boVar = tmVar.J0;
                bo boVar2 = boVar.da;
                tm tmVar2 = boVar2 != null ? boVar2.X0 : boVar.X0;
                float f7 = boVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, boVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                }
                gh.d.b(new gg(tmVar, 1), canvas, rectF, boVar.x0, tmVar2, i10);
                ai.w0 w0Var = boVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, tmVar2, i11);
                }
                ci.i1 i1Var = boVar.q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = boVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = boVar.q1.getChildAt(i12);
                        if ((childAt instanceof eo) && childAt.getVisibility() == 0) {
                            eo eoVar = (eo) childAt;
                            co coVar = eoVar.a;
                            tm tmVar3 = coVar.X0;
                            Objects.requireNonNull(tmVar3);
                            gh.d.a(new gg(tmVar3, 0), canvas, rectF, coVar.X0, eoVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                bo boVar3 = this.b.J0;
                if (boVar3.x0.a1()) {
                    boVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    boVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < boVar3.x0.getChildCount(); i13++) {
                        View childAt2 = boVar3.x0.getChildAt(i13);
                        if (!bo.d2(boVar3, childAt2, rectF)) {
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
                                boVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                boVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                boVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    boVar3.x0.y1(canvas, rectF);
                    break;
                }
        }
    }
}
