package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((f80) this.b).H = i10;
                break;
            default:
                ((xd1) this.b).a0.invalidate();
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
                f80 f80Var = (f80) this.b;
                org.telegram.ui.Components.qa qaVar = f80Var.e;
                qaVar.b = f7;
                qaVar.c = i10;
                qaVar.invalidate();
                float measuredWidth2 = f80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (f80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                f80 f80Var = (f80) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (f80Var.K) {
                            f80Var.K = false;
                        }
                        if (f80Var.w != f80Var.d.getCurrentItem()) {
                            f80Var.w = f80Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    f80Var.K = true;
                    f80Var.d.getCurrentItem();
                    f80Var.d.getMeasuredWidth();
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
