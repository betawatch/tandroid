package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                o2Var.x = i10;
                o2Var.d.invalidate();
                break;
            case 1:
                ((s60) this.b).H = i10;
                break;
            default:
                ((m91) this.b).b0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                float measuredWidth = o2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.w = c3.i0.g(o2Var.x, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    o2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                s60 s60Var = (s60) this.b;
                org.telegram.ui.Components.y9 y9Var = s60Var.e;
                y9Var.b = f7;
                y9Var.c = i10;
                y9Var.invalidate();
                float measuredWidth2 = s60Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (s60Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                s60 s60Var = (s60) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (s60Var.K) {
                            s60Var.K = false;
                        }
                        if (s60Var.x != s60Var.d.getCurrentItem()) {
                            s60Var.x = s60Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    s60Var.K = true;
                    s60Var.d.getCurrentItem();
                    s60Var.d.getMeasuredWidth();
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
