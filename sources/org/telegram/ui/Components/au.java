package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements p.a, org.telegram.messenger.l9, yg.b, mu0, nu0, org.telegram.messenger.mc, wg.c, r0.m, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6 {
    public final /* synthetic */ int a;

    public /* synthetic */ au(int i10) {
        this.a = i10;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return r0.j1.b;
    }

    @Override // yg.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.nu0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 4:
                ec0 ec0Var = (ec0) obj;
                ec0Var.f = f7;
                if (!ec0Var.D || ec0Var.F) {
                    ec0Var.c.setStrokeWidth(org.telegram.messenger.i0.T1(ec0Var.w, ec0Var.x, f7));
                    ec0Var.f();
                }
                ec0Var.invalidate();
                break;
            case 6:
                ec0 ec0Var2 = (ec0) obj;
                ec0Var2.n = f7;
                if (!ec0Var2.D || ec0Var2.F) {
                    ec0Var2.f();
                }
                ec0Var2.invalidate();
                break;
            case 8:
                ec0 ec0Var3 = (ec0) obj;
                ec0Var3.s = f7;
                ec0Var3.f();
                break;
            case 13:
                jf0 jf0Var = (jf0) obj;
                WindowManager.LayoutParams layoutParams = jf0Var.c;
                jf0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    org.telegram.messenger.i0.S3(jf0Var.b, jf0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    jf0Var.M.d();
                    return;
                }
            case 15:
                jf0 jf0Var2 = (jf0) obj;
                WindowManager.LayoutParams layoutParams2 = jf0Var2.c;
                jf0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    org.telegram.messenger.i0.S3(jf0Var2.b, jf0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    jf0Var2.N.d();
                    return;
                }
            default:
                do0 do0Var = (do0) obj;
                do0Var.n = f7;
                do0Var.invalidate();
                break;
        }
    }

    @Override // p.a
    public wb c(cc ccVar) {
        return ccVar.k(false);
    }

    @Override // org.telegram.ui.ActionBar.y6
    public void d(int i10, View view) {
        ((dn0) view).setTextColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.x6
    public int f(View view) {
        return ((dn0) view).w;
    }

    @Override // wg.c
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        Bitmap bitmap = qh.t.a;
        return (((int) a1.g.A(qh.y0.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.ui.Components.mu0
    public float get(Object obj) {
        switch (this.a) {
            case 3:
                return ((ec0) obj).f;
            case 5:
                return ((ec0) obj).n;
            case 7:
                return ((ec0) obj).s;
            case 12:
                return ((jf0) obj).K;
            case 14:
                return ((jf0) obj).L;
            default:
                return ((do0) obj).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 17:
                x1Var.dismiss();
                break;
            case 18:
                x1Var.dismiss();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                x1Var.dismiss();
                break;
            case 24:
                x1Var.dismiss();
                break;
            case 25:
                x1Var.dismiss();
                break;
            case 26:
                x1Var.dismiss();
                break;
            case 27:
                int i11 = cx0.n2;
                break;
        }
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        switch (this.a) {
            case 1:
                int i10 = vy.U2;
                break;
            default:
                int i11 = op0.Q2;
                break;
        }
        return 0;
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bi0 B;
        switch (this.a) {
            case 9:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    break;
                }
                break;
            default:
                if ((imageReceiver.j0 instanceof org.telegram.messenger.p6) || (imageReceiver.S instanceof org.telegram.messenger.p6) || (imageReceiver.a0 instanceof org.telegram.messenger.p6) || (imageReceiver.m0 instanceof org.telegram.messenger.p6)) {
                    imageReceiver.o1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
        int i11 = this.a;
    }

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void n(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void e(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void i(int i10, Drawable drawable) {
    }
}
