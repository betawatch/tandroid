package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements ah.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm b;

    public /* synthetic */ fg(vm vmVar, int i10) {
        this.a = i10;
        this.b = vmVar;
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                vm vmVar = this.b;
                eo eoVar = vmVar.J0;
                eo eoVar2 = eoVar.da;
                vm vmVar2 = eoVar2 != null ? eoVar2.X0 : eoVar.X0;
                float f7 = eoVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                }
                fh.d.a(new fg(vmVar, 1), canvas, rectF, eoVar.x0, vmVar2, i10);
                bi.y1 y1Var = eoVar.L3;
                if (y1Var != null) {
                    fh.d.a(y1Var, canvas, rectF, y1Var, vmVar2, i11);
                }
                bi.p1 p1Var = eoVar.q1;
                if (p1Var != null && p1Var.getVisibility() == 0) {
                    int childCount = eoVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = eoVar.q1.getChildAt(i12);
                        if ((childAt instanceof go) && childAt.getVisibility() == 0) {
                            go goVar = (go) childAt;
                            fo foVar = goVar.a;
                            vm vmVar3 = foVar.X0;
                            Objects.requireNonNull(vmVar3);
                            fh.d.b(new fg(vmVar3, 0), canvas, rectF, foVar.X0, goVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                eo eoVar3 = this.b.J0;
                if (eoVar3.x0.Y0()) {
                    eoVar3.x0.e(canvas, rectF);
                    break;
                } else {
                    eoVar3.x0.v1(canvas, rectF);
                    for (int i13 = 0; i13 < eoVar3.x0.getChildCount(); i13++) {
                        View childAt2 = eoVar3.x0.getChildAt(i13);
                        if (!eo.d2(eoVar3, childAt2, rectF)) {
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
                                eoVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                eoVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                eoVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    eoVar3.x0.w1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        switch (this.a) {
        }
        zVar.b = true;
    }
}
