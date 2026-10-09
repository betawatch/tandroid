package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm b;

    public /* synthetic */ fg(sm smVar, int i10) {
        this.a = i10;
        this.b = smVar;
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
                sm smVar = this.b;
                zn znVar = smVar.J0;
                zn znVar2 = znVar.da;
                sm smVar2 = znVar2 != null ? znVar2.X0 : znVar.X0;
                float f7 = znVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.m1(f7 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6)));
                }
                gh.d.b(new fg(smVar, 1), canvas, rectF, znVar.x0, smVar2, i10);
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, smVar2, i11);
                }
                ci.h1 h1Var = znVar.q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = znVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.q1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.a;
                            sm smVar3 = aoVar.X0;
                            Objects.requireNonNull(smVar3);
                            gh.d.a(new fg(smVar3, 0), canvas, rectF, aoVar.X0, boVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.b.J0;
                if (znVar3.x0.Z0()) {
                    znVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    znVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < znVar3.x0.getChildCount(); i13++) {
                        View childAt2 = znVar3.x0.getChildAt(i13);
                        if (!zn.e2(znVar3, childAt2, rectF)) {
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
                                ((org.telegram.ui.Cells.w0) childAt2).C(canvas);
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
