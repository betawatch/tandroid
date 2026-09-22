package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                p2Var.v = i10;
                p2Var.c.invalidate();
                break;
            case 1:
                ((d80) this.b).H = i10;
                break;
            default:
                ((wd1) this.b).a0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                float measuredWidth = p2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.s = com.google.android.gms.internal.vision.e2.v(p2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                d80 d80Var = (d80) this.b;
                org.telegram.ui.Components.qa qaVar = d80Var.e;
                qaVar.b = f7;
                qaVar.c = i10;
                qaVar.invalidate();
                float measuredWidth2 = d80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (d80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                d80 d80Var = (d80) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (d80Var.K) {
                            d80Var.K = false;
                        }
                        if (d80Var.w != d80Var.d.getCurrentItem()) {
                            d80Var.w = d80Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    d80Var.K = true;
                    d80Var.d.getCurrentItem();
                    d80Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f7, int i10, int i11) {
    }
}
