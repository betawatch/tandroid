package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                q2 q2Var = (q2) this.b;
                float measuredWidth = q2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.s = com.google.android.gms.internal.vision.e2.v(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                d80 d80Var = (d80) this.b;
                org.telegram.ui.Components.sa saVar = d80Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = d80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (d80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                q2 q2Var = (q2) this.b;
                q2Var.v = i10;
                q2Var.c.invalidate();
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
