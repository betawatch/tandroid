package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements og.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm b;

    public /* synthetic */ ag(rm rmVar, int i10) {
        this.a = i10;
        this.b = rmVar;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                rm rmVar = this.b;
                zn znVar = rmVar.G0;
                zn znVar2 = znVar.aa;
                rm rmVar2 = znVar2 != null ? znVar2.U0 : znVar.U0;
                float f10 = znVar.vc.e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f10 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                }
                tg.c.a(new ag(rmVar, 1), canvas, rectF, znVar.u0, rmVar2, i10);
                lh.e1 e1Var = znVar.I3;
                if (e1Var != null) {
                    tg.c.a(e1Var, canvas, rectF, e1Var, rmVar2, i11);
                }
                gk gkVar = znVar.n1;
                if (gkVar != null && gkVar.getVisibility() == 0) {
                    int childCount = znVar.n1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.n1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.a;
                            rm rmVar3 = aoVar.U0;
                            Objects.requireNonNull(rmVar3);
                            tg.c.b(new ag(rmVar3, 0), canvas, rectF, aoVar.U0, boVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.b.G0;
                if (znVar3.u0.Y0()) {
                    znVar3.u0.e(canvas, rectF);
                    break;
                } else {
                    znVar3.u0.v1(canvas, rectF);
                    for (int i13 = 0; i13 < znVar3.u0.getChildCount(); i13++) {
                        View childAt2 = znVar3.u0.getChildAt(i13);
                        if (!zn.d2(znVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                                if (s1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, s1Var.S);
                                    s1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                znVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                                if (s1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(s1Var.getX(), s1Var.getY());
                                    s1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                znVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                                canvas.restore();
                            } else {
                                znVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    znVar3.u0.w1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
