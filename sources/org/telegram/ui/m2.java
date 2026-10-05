package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                q2 q2Var = (q2) this.b;
                q2Var.v = i10;
                q2Var.c.invalidate();
                break;
            case 1:
                ((c80) this.b).H = i10;
                break;
            default:
                ((pd1) this.b).a0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
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
                c80 c80Var = (c80) this.b;
                org.telegram.ui.Components.ta taVar = c80Var.e;
                taVar.b = f7;
                taVar.c = i10;
                taVar.invalidate();
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
