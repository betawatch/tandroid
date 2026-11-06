package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements org.telegram.ui.ActionBar.r1, db0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, t4, org.telegram.messenger.lc, org.telegram.messenger.eb, org.telegram.messenger.k9, p.a, ih.b, jt0, kt0, gh.d, r0.m {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 11:
                MediaController.B().B0(1, i7, z9, false);
                break;
            default:
                MediaController.B().B0(1, i7, z9, false);
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // p.a
    public cc a(hc hcVar) {
        return hcVar.k(false);
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void c(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override // org.telegram.ui.Components.kt0
    public void f(Object obj, float f10) {
        lb0 lb0Var = (lb0) obj;
        switch (this.a) {
            case 21:
                lb0Var.f = f10;
                if (!lb0Var.D || lb0Var.F) {
                    lb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(lb0Var.w, lb0Var.x, f10));
                    lb0Var.f();
                }
                lb0Var.invalidate();
                break;
            case 22:
            default:
                lb0Var.s = f10;
                lb0Var.f();
                break;
            case 23:
                lb0Var.n = f10;
                if (!lb0Var.D || lb0Var.F) {
                    lb0Var.f();
                }
                lb0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        switch (this.a) {
            case 13:
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof zg0) {
                    zg0 zg0Var = (zg0) t6;
                    zg0Var.P(0);
                    zg0Var.stop();
                    zg0Var.T(false, 0.0f);
                    break;
                }
                break;
            default:
                if (z9 && !z10 && (B = imageReceiver.B()) != null) {
                    B.start();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                Pattern pattern = v4.a;
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public float get(Object obj) {
        lb0 lb0Var = (lb0) obj;
        switch (this.a) {
            case 20:
                return lb0Var.f;
            case 21:
            default:
                return lb0Var.s;
            case 22:
                return lb0Var.n;
        }
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        switch (this.a) {
            case 2:
                switch (i7) {
                }
            case 4:
                switch (i7) {
                }
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int i(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        switch (this.a) {
            case 16:
                return CheckBoxBase.I;
            default:
                int i7 = gy.U2;
                return 0;
        }
    }

    @Override // gh.d
    public int k(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        Bitmap bitmap = ai.z.a;
        return (((int) a8.p0.f(ai.o1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.eb
    public void onClick() {
        int i7 = wk.F0;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void n(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void d(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void e(int i7, Drawable drawable) {
    }
}
