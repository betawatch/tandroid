package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm b;

    public /* synthetic */ kg(xm xmVar, int i10) {
        this.a = i10;
        this.b = xmVar;
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
                xm xmVar = this.b;
                fo foVar = xmVar.J0;
                fo foVar2 = foVar.da;
                xm xmVar2 = foVar2 != null ? foVar2.X0 : foVar.X0;
                float f7 = foVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.m1(f7 * 0.85f, foVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
                }
                hh.d.b(new kg(xmVar, 1), canvas, rectF, foVar.x0, xmVar2, i10);
                bi.o0 o0Var = foVar.L3;
                if (o0Var != null) {
                    hh.d.b(o0Var, canvas, rectF, o0Var, xmVar2, i11);
                }
                di.h1 h1Var = foVar.q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = foVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = foVar.q1.getChildAt(i12);
                        if ((childAt instanceof ho) && childAt.getVisibility() == 0) {
                            ho hoVar = (ho) childAt;
                            go goVar = hoVar.a;
                            xm xmVar3 = goVar.X0;
                            Objects.requireNonNull(xmVar3);
                            hh.d.a(new kg(xmVar3, 0), canvas, rectF, goVar.X0, hoVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                fo foVar3 = this.b.J0;
                if (foVar3.x0.Z0()) {
                    foVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    foVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < foVar3.x0.getChildCount(); i13++) {
                        View childAt2 = foVar3.x0.getChildAt(i13);
                        if (!fo.e2(foVar3, childAt2, rectF)) {
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
                                foVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (u1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(u1Var.getX(), u1Var.getY());
                                    u1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                foVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).C(canvas);
                                canvas.restore();
                            } else {
                                foVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    foVar3.x0.y1(canvas, rectF);
                    break;
                }
        }
    }
}
