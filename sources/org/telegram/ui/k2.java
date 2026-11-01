package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                ((r60) this.b).H = i10;
                break;
            default:
                ((k91) this.b).b0.invalidate();
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
                r60 r60Var = (r60) this.b;
                org.telegram.ui.Components.y9 y9Var = r60Var.e;
                y9Var.b = f7;
                y9Var.c = i10;
                y9Var.invalidate();
                float measuredWidth2 = r60Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (r60Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                r60 r60Var = (r60) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (r60Var.K) {
                            r60Var.K = false;
                        }
                        if (r60Var.x != r60Var.d.getCurrentItem()) {
                            r60Var.x = r60Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    r60Var.K = true;
                    r60Var.d.getCurrentItem();
                    r60Var.d.getMeasuredWidth();
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
