package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q2 implements m2.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // m2.f
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                u2Var.v = i10;
                u2Var.c.invalidate();
                break;
            case 1:
                ((w70) this.b).E = i10;
                break;
            default:
                ((jd1) this.b).X.invalidate();
                break;
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                float measuredWidth = u2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.s = e2.c.d(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                w70 w70Var = (w70) this.b;
                org.telegram.ui.Components.ka kaVar = w70Var.e;
                kaVar.b = f10;
                kaVar.c = i10;
                kaVar.invalidate();
                float measuredWidth2 = w70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (w70Var.E * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                w70 w70Var = (w70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (w70Var.H) {
                            w70Var.H = false;
                        }
                        if (w70Var.w != w70Var.d.getCurrentItem()) {
                            w70Var.w = w70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    w70Var.H = true;
                    w70Var.d.getCurrentItem();
                    w70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f10, int i10, int i11) {
    }
}
