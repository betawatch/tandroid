package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm b;

    public /* synthetic */ cg(pm pmVar, int i10) {
        this.a = i10;
        this.b = pmVar;
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
                pm pmVar = this.b;
                wn wnVar = pmVar.J0;
                wn wnVar2 = wnVar.da;
                pm pmVar2 = wnVar2 != null ? wnVar2.X0 : wnVar.X0;
                float f7 = wnVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(f7 * 0.85f, wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
                }
                gh.d.b(new cg(pmVar, 1), canvas, rectF, wnVar.x0, pmVar2, i10);
                ai.w0 w0Var = wnVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, pmVar2, i11);
                }
                ci.i1 i1Var = wnVar.q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = wnVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = wnVar.q1.getChildAt(i12);
                        if ((childAt instanceof yn) && childAt.getVisibility() == 0) {
                            yn ynVar = (yn) childAt;
                            xn xnVar = ynVar.a;
                            pm pmVar3 = xnVar.X0;
                            Objects.requireNonNull(pmVar3);
                            gh.d.a(new cg(pmVar3, 0), canvas, rectF, xnVar.X0, ynVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                wn wnVar3 = this.b.J0;
                if (wnVar3.x0.Z0()) {
                    wnVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    wnVar3.x0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < wnVar3.x0.getChildCount(); i13++) {
                        View childAt2 = wnVar3.x0.getChildAt(i13);
                        if (!wn.d2(wnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                                if (u1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, u1Var.V);
                                    u1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                wnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (u1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(u1Var.getX(), u1Var.getY());
                                    u1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                wnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                wnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    wnVar3.x0.x1(canvas, rectF);
                    break;
                }
        }
    }
}
