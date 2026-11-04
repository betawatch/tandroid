package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ya0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, r4, org.telegram.messenger.ec, org.telegram.ui.ActionBar.p1, org.telegram.messenger.xa, org.telegram.messenger.e9, p.a, jh.b, it0, jt0, hh.d, r0.m {
    public final /* synthetic */ int a;

    public /* synthetic */ a3(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
        int i3 = this.a;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 8:
                MediaController.B().B0(1, i3, z10, false);
                break;
            default:
                MediaController.B().B0(1, i3, z10, false);
                break;
        }
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // p.a
    public ac a(fc fcVar) {
        return fcVar.k(false);
    }

    @Override // jh.b
    public Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 18:
                gb0 gb0Var = (gb0) obj;
                gb0Var.f = f10;
                if (!gb0Var.E || gb0Var.G) {
                    gb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(gb0Var.w, gb0Var.x, f10));
                    gb0Var.f();
                }
                gb0Var.invalidate();
                break;
            case 20:
                gb0 gb0Var2 = (gb0) obj;
                gb0Var2.n = f10;
                if (!gb0Var2.E || gb0Var2.G) {
                    gb0Var2.f();
                }
                gb0Var2.invalidate();
                break;
            case 22:
                gb0 gb0Var3 = (gb0) obj;
                gb0Var3.s = f10;
                gb0Var3.f();
                break;
            case 27:
                ie0 ie0Var = (ie0) obj;
                WindowManager.LayoutParams layoutParams = ie0Var.c;
                ie0Var.L = f10;
                layoutParams.x = (int) f10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var.b, ie0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    ie0Var.N.d();
                    return;
                }
            default:
                ie0 ie0Var2 = (ie0) obj;
                WindowManager.LayoutParams layoutParams2 = ie0Var2.c;
                ie0Var2.M = f10;
                layoutParams2.y = (int) f10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var2.b, ie0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    ie0Var2.O.d();
                }
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        switch (this.a) {
            case 1:
                switch (i3) {
                }
        }
        return String.format("%02d", Integer.valueOf(i3));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void f(int i3, View view) {
        ((org.telegram.ui.ActionBar.y0) view).d(i3, i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s1Var.dismiss();
    }

    @Override // org.telegram.ui.Components.it0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((gb0) obj).f;
            case 19:
                return ((gb0) obj).n;
            case 21:
                return ((gb0) obj).s;
            case 26:
                return ((ie0) obj).L;
            default:
                return ((ie0) obj).M;
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int h(View view) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) view;
        if (y0Var.getTextView() != null) {
            return y0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // hh.d
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Bitmap bitmap = bi.u.a;
        return (((int) a1.g.e(bi.d1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        switch (this.a) {
            case 13:
                return CheckBoxBase.I;
            default:
                int i3 = ey.V2;
                return 0;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        switch (this.a) {
            case 10:
                Drawable t10 = imageReceiver.t();
                if (t10 instanceof ch0) {
                    ch0 ch0Var = (ch0) t10;
                    ch0Var.P(0);
                    ch0Var.stop();
                    ch0Var.T(false, 0.0f);
                    break;
                }
                break;
            default:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.xa
    public void onClick() {
        int i3 = uk.G0;
    }

    private final /* synthetic */ void l(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void d(int i3, Drawable drawable) {
    }

    private final /* synthetic */ void i(int i3, Drawable drawable) {
    }
}
