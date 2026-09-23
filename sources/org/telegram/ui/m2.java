package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((a80) this.b).H = i10;
                break;
            default:
                ((od1) this.b).a0.invalidate();
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
                a80 a80Var = (a80) this.b;
                org.telegram.ui.Components.sa saVar = a80Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = a80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (a80Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                a80 a80Var = (a80) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (a80Var.K) {
                            a80Var.K = false;
                        }
                        if (a80Var.w != a80Var.d.getCurrentItem()) {
                            a80Var.w = a80Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    a80Var.K = true;
                    a80Var.d.getCurrentItem();
                    a80Var.d.getMeasuredWidth();
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
