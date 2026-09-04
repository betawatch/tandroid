package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ um b;

    public /* synthetic */ eg(um umVar, int i10) {
        this.a = i10;
        this.b = umVar;
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
        switch (this.a) {
            case 0:
                um umVar = this.b;
                co coVar = umVar.J0;
                co coVar2 = coVar.da;
                um umVar2 = coVar2 != null ? coVar2.X0 : coVar.X0;
                float f7 = coVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, coVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                }
                hh.d.a(new eg(umVar, 1), canvas, rectF, coVar.x0, umVar2, i10);
                bi.o0 o0Var = coVar.L3;
                if (o0Var != null) {
                    hh.d.a(o0Var, canvas, rectF, o0Var, umVar2, i11);
                }
                di.i1 i1Var = coVar.q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = coVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = coVar.q1.getChildAt(i12);
                        if ((childAt instanceof fo) && childAt.getVisibility() == 0) {
                            fo foVar = (fo) childAt;
                            eo eoVar = foVar.a;
                            um umVar3 = eoVar.X0;
                            Objects.requireNonNull(umVar3);
                            hh.d.b(new eg(umVar3, 0), canvas, rectF, eoVar.X0, foVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                co coVar3 = this.b.J0;
                if (coVar3.x0.Y0()) {
                    coVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    coVar3.x0.v1(canvas, rectF);
                    for (int i13 = 0; i13 < coVar3.x0.getChildCount(); i13++) {
                        View childAt2 = coVar3.x0.getChildAt(i13);
                        if (!co.d2(coVar3, childAt2, rectF)) {
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
                                coVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                coVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).A(canvas);
                                canvas.restore();
                            } else {
                                coVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    coVar3.x0.w1(canvas, rectF);
                    break;
                }
        }
    }
}
