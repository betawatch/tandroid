package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm b;

    public /* synthetic */ fg(rm rmVar, int i10) {
        this.a = i10;
        this.b = rmVar;
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
                rm rmVar = this.b;
                zn znVar = rmVar.J0;
                zn znVar2 = znVar.da;
                rm rmVar2 = znVar2 != null ? znVar2.X0 : znVar.X0;
                float f7 = znVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                }
                gh.d.b(new fg(rmVar, 1), canvas, rectF, znVar.x0, rmVar2, i10);
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, rmVar2, i11);
                }
                ci.i1 i1Var = znVar.q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = znVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.q1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.a;
                            rm rmVar3 = aoVar.X0;
                            Objects.requireNonNull(rmVar3);
                            gh.d.a(new fg(rmVar3, 0), canvas, rectF, aoVar.X0, boVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.b.J0;
                if (znVar3.x0.a1()) {
                    znVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    znVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < znVar3.x0.getChildCount(); i13++) {
                        View childAt2 = znVar3.x0.getChildAt(i13);
                        if (!zn.d2(znVar3, childAt2, rectF)) {
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
                                znVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (u1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(u1Var.getX(), u1Var.getY());
                                    u1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                znVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                znVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    znVar3.x0.y1(canvas, rectF);
                    break;
                }
        }
    }
}
