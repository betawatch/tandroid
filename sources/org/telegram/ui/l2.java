package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                d80 d80Var = (d80) this.b;
                org.telegram.ui.Components.ra raVar = d80Var.e;
                raVar.b = f7;
                raVar.c = i10;
                raVar.invalidate();
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
