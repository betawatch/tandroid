package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                r2Var.v = i10;
                r2Var.c.invalidate();
                break;
            case 1:
                ((c80) this.b).H = i10;
                break;
            default:
                ((ae1) this.b).a0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                float measuredWidth = r2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    r2Var.s = com.google.android.gms.internal.vision.e2.v(r2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    r2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                c80 c80Var = (c80) this.b;
                org.telegram.ui.Components.ra raVar = c80Var.e;
                raVar.b = f7;
                raVar.c = i10;
                raVar.invalidate();
                float measuredWidth2 = c80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (c80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                c80 c80Var = (c80) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (c80Var.K) {
                            c80Var.K = false;
                        }
                        if (c80Var.w != c80Var.d.getCurrentItem()) {
                            c80Var.w = c80Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    c80Var.K = true;
                    c80Var.d.getCurrentItem();
                    c80Var.d.getMeasuredWidth();
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
