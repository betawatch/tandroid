package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class o2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                float measuredWidth = s2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.s = com.google.android.gms.internal.play_billing.k3.c(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                h80 h80Var = (h80) this.b;
                org.telegram.ui.Components.ua uaVar = h80Var.e;
                uaVar.b = f7;
                uaVar.c = i10;
                uaVar.invalidate();
                float measuredWidth2 = h80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (h80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                s2Var.v = i10;
                s2Var.c.invalidate();
                break;
            case 1:
                ((h80) this.b).H = i10;
                break;
            default:
                ((ce1) this.b).a0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                h80 h80Var = (h80) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (h80Var.K) {
                            h80Var.K = false;
                        }
                        if (h80Var.w != h80Var.d.getCurrentItem()) {
                            h80Var.w = h80Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    h80Var.K = true;
                    h80Var.d.getCurrentItem();
                    h80Var.d.getMeasuredWidth();
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
