package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n2 implements z4.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.f
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                r2Var.w = i10;
                r2Var.d.invalidate();
                break;
            case 1:
                ((n70) this.b).H = i10;
                break;
            default:
                ((qc1) this.b).b0.invalidate();
                break;
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                float measuredWidth = r2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    r2Var.v = com.google.android.gms.internal.play_billing.k3.c(r2Var.w, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    r2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                n70 n70Var = (n70) this.b;
                org.telegram.ui.Components.sa saVar = n70Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = n70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (n70Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.f
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                n70 n70Var = (n70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (n70Var.K) {
                            n70Var.K = false;
                        }
                        if (n70Var.w != n70Var.d.getCurrentItem()) {
                            n70Var.w = n70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    n70Var.K = true;
                    n70Var.d.getCurrentItem();
                    n70Var.d.getMeasuredWidth();
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
