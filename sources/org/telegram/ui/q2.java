package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q2 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // m2.e
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                u2Var.v = i10;
                u2Var.c.invalidate();
                break;
            case 1:
                ((l70) this.b).D = i10;
                break;
            default:
                ((nc1) this.b).W.invalidate();
                break;
        }
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                float measuredWidth = u2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.s = com.google.android.recaptcha.internal.a.w(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                l70 l70Var = (l70) this.b;
                org.telegram.ui.Components.ia iaVar = l70Var.e;
                iaVar.b = f10;
                iaVar.c = i10;
                iaVar.invalidate();
                float measuredWidth2 = l70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (l70Var.D * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void d(int i10) {
        switch (this.a) {
            case 1:
                l70 l70Var = (l70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (l70Var.G) {
                            l70Var.G = false;
                        }
                        if (l70Var.w != l70Var.d.getCurrentItem()) {
                            l70Var.w = l70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    l70Var.G = true;
                    l70Var.d.getCurrentItem();
                    l70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f10, int i10, int i11) {
    }
}
